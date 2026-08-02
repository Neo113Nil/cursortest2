package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import xsna.tdj;
import xsna.zr;

/* loaded from: classes12.dex */
public class DirectSplitSoSource extends SoSource {
    protected final String mSplitName;
    protected Manifest mManifest = null;
    protected Set<String> mLibs = null;

    public DirectSplitSoSource(String str) {
        this.mSplitName = str;
    }

    public static String getSplitPath(String str) {
        if ("base".equals(str)) {
            return SoLoader.sApplicationContext.getApplicationInfo().sourceDir;
        }
        String[] strArr = SoLoader.sApplicationContext.getApplicationInfo().splitSourceDirs;
        if (strArr == null) {
            throw new IllegalStateException("No splits avaiable");
        }
        String a = zr.a("split_", str, ".apk");
        for (String str2 : strArr) {
            if (str2.endsWith(a)) {
                return str2;
            }
        }
        throw new IllegalStateException(zr.a("Could not find ", str, " split"));
    }

    @Override // com.facebook.soloader.SoSource
    public String[] getLibraryDependencies(String str) {
        Set<String> set = this.mLibs;
        if (set == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (set.contains(str)) {
            return new String[0];
        }
        return null;
    }

    @Override // com.facebook.soloader.SoSource
    public String getLibraryPath(String str) {
        Set<String> set = this.mLibs;
        if (set == null || this.mManifest == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (!set.contains(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getSplitPath(this.mSplitName));
        sb.append("!/lib/");
        return tdj.a(sb, this.mManifest.arch, DomExceptionUtils.SEPARATOR, str);
    }

    public Manifest getManifest() {
        Manifest manifest = this.mManifest;
        if (manifest != null) {
            return manifest;
        }
        throw new IllegalStateException("prepare not called");
    }

    @Override // com.facebook.soloader.SoSource
    public String getName() {
        return "DirectSplitSoSource";
    }

    @Override // com.facebook.soloader.SoSource
    public File getSoFileByName(String str) {
        String libraryPath = getLibraryPath(str);
        if (libraryPath == null) {
            return null;
        }
        return new File(libraryPath);
    }

    @Override // com.facebook.soloader.SoSource
    public String[] getSoSourceAbis() {
        Manifest manifest = this.mManifest;
        if (manifest != null) {
            return new String[]{manifest.arch};
        }
        throw new IllegalStateException("prepare not called");
    }

    @Override // com.facebook.soloader.SoSource
    public int loadLibrary(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        Set<String> set = this.mLibs;
        if (set == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (set.contains(str)) {
            return loadLibraryImpl(str, i);
        }
        return 0;
    }

    @SuppressLint({"MissingSoLoaderLibrary"})
    public int loadLibraryImpl(String str, int i) {
        String libraryPath = getLibraryPath(str);
        libraryPath.getClass();
        System.load(libraryPath);
        return 1;
    }

    @Override // com.facebook.soloader.SoSource
    public void prepare(int i) throws IOException {
        InputStream open = SoLoader.sApplicationContext.getAssets().open(this.mSplitName + ".soloader-manifest");
        try {
            this.mManifest = Manifest.read(open);
            if (open != null) {
                open.close();
            }
            this.mLibs = new HashSet(this.mManifest.libs);
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.soloader.SoSource
    public File unpackLibrary(String str) {
        return getSoFileByName(str);
    }
}
