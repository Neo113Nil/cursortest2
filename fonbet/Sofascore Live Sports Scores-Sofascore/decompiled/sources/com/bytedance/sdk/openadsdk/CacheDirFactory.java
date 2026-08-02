package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.qf;
import com.bytedance.sdk.openadsdk.core.lu;
import defpackage.lwm;
import defpackage.mz1;
import defpackage.p03;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class CacheDirFactory {
    public static volatile lwm MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static String pcc;

    public static int getCacheType() {
        return 1;
    }

    public static String getDiskCacheDirPath(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getRootDir());
        return mz1.o(sb, File.separator, str);
    }

    public static lwm getICacheDir(int i) {
        return pcc();
    }

    public static String getImageCacheDir(String str) {
        String str2 = pcc;
        if (str2 != null) {
            return str2;
        }
        String diskCacheDirPath = getDiskCacheDirPath(str);
        pcc = diskCacheDirPath;
        return diskCacheDirPath;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File pcc2 = qf.pcc(lu.pcc(), "tt_ad");
        if (pcc2.isFile()) {
            pcc2.delete();
        }
        if (!pcc2.exists()) {
            pcc2.mkdirs();
        }
        String absolutePath = pcc2.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    private static lwm pcc() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                try {
                    if (MEDIA_CACHE_DIR == null) {
                        p03 p03Var = new p03(19, false);
                        p03Var.b = null;
                        p03Var.c = null;
                        p03Var.d = null;
                        p03Var.e = null;
                        p03Var.f = null;
                        MEDIA_CACHE_DIR = p03Var;
                        p03Var.b = getRootDir();
                        ((p03) MEDIA_CACHE_DIR).t();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }
}
