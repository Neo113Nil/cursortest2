package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.text.TextUtils;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.IOException;
import xsna.fw3;
import xsna.i5s;

/* loaded from: classes12.dex */
public class SystemLoadWrapperSoSource extends SoSource {
    @Override // com.facebook.soloader.SoSource
    public String getLibraryPath(String str) throws IOException {
        String classLoaderLdLoadLibrary = SysUtil.getClassLoaderLdLoadLibrary();
        if (TextUtils.isEmpty(classLoaderLdLoadLibrary)) {
            return null;
        }
        for (String str2 : classLoaderLdLoadLibrary.split(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            if (SysUtil.isDisabledExtractNativeLibs(SoLoader.sApplicationContext) && str2.contains(".apk!")) {
                return i5s.a(fw3.e(str2), File.separator, str);
            }
            File file = new File(str2, str);
            if (file.exists()) {
                return file.getCanonicalPath();
            }
        }
        return null;
    }

    @Override // com.facebook.soloader.SoSource
    public String getName() {
        return "SystemLoadWrapperSoSource";
    }

    @Override // com.facebook.soloader.SoSource
    @SuppressLint({"CatchGeneralException"})
    public int loadLibrary(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        try {
            System.loadLibrary(str.substring(3, str.length() - 3));
            return 1;
        } catch (Exception e) {
            LogUtil.e(SoLoader.TAG, "Error loading library: " + str, e);
            return 0;
        }
    }

    @Override // com.facebook.soloader.SoSource
    public String toString() {
        return getName() + X3.j.d + SysUtil.getClassLoaderLdLoadLibrary() + X3.j.e;
    }

    @Override // com.facebook.soloader.SoSource
    public File unpackLibrary(String str) throws IOException {
        return null;
    }
}
