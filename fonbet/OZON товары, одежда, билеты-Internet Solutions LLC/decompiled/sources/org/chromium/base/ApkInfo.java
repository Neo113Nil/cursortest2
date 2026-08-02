package org.chromium.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import internal.J.N;
import internal.org.jni_zero.CalledByNative;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes6.dex */
public final class ApkInfo {

    /* renamed from: b, reason: collision with root package name */
    private static volatile ApkInfo f78450b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f78451c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final IApkInfo f78452a;

    /* JADX WARN: Multi-variable type inference failed */
    private ApkInfo() {
        Long l11;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String[] packagesForUid;
        IApkInfo iApkInfo = new IApkInfo();
        this.f78452a = iApkInfo;
        Context b11 = e.b();
        String packageName = b11.getPackageName();
        PackageManager packageManager = b11.getPackageManager();
        iApkInfo.f78493g = String.valueOf(1L);
        String str6 = null;
        if (c.f()) {
            c b12 = c.b();
            String c11 = b12.c("host-package-name");
            str = b12.c("host-package-label");
            str2 = b12.c("package-name");
            str3 = b12.c("package-version-name");
            String c12 = b12.c("host-version-code");
            l11 = c12 != null ? Long.valueOf(Long.parseLong(c12)) : null;
            str6 = c11;
        } else {
            l11 = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        Object[] objArr = (str6 == null || str == null || l11 == null || str2 == null || str3 == null) ? false : true;
        ApplicationInfo applicationInfo = b11.getApplicationInfo();
        iApkInfo.f78491e = (applicationInfo.flags & 2) != 0;
        if (objArr == true) {
            iApkInfo.f78488b = str6;
            iApkInfo.f78487a = str;
            iApkInfo.f78489c = String.valueOf(l11);
            iApkInfo.f78494h = str3;
            iApkInfo.f78492f = str2;
        } else {
            if (!(Build.VERSION.SDK_INT >= 33 ? Process.isSdkSandbox() : false) || (packagesForUid = packageManager.getPackagesForUid(Process.myUid() - 10000)) == null || packagesForUid.length <= 0) {
                str4 = packageName;
                str5 = str4;
            } else {
                str4 = packagesForUid[0];
                str5 = G.g.c(packageName, ProductContainerDTO.RATIO_DELIMITER, str4);
            }
            iApkInfo.f78488b = str5;
            CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
            iApkInfo.f78487a = applicationLabel == null ? "" : applicationLabel.toString();
            iApkInfo.f78492f = packageName;
            iApkInfo.f78489c = String.valueOf(1L);
            iApkInfo.f78494h = "138.0.7204.157";
            packageName = str4;
        }
        String installerPackageName = packageManager.getInstallerPackageName(packageName);
        iApkInfo.f78490d = installerPackageName != null ? installerPackageName.toString() : "";
        iApkInfo.f78495i = "Not Enabled";
        iApkInfo.f78496j = applicationInfo.targetSdkVersion;
    }

    public static void a() {
        String str = e().f78452a.f78487a;
    }

    public static void b() {
        String str = e().f78452a.f78488b;
    }

    public static void c() {
        String str = e().f78452a.f78489c;
    }

    public static void d() {
        String str = e().f78452a.f78490d;
    }

    public static ApkInfo e() {
        if (f78450b == null) {
            synchronized (f78451c) {
                try {
                    if (f78450b == null) {
                        f78450b = new ApkInfo();
                    }
                } finally {
                }
            }
        }
        return f78450b;
    }

    public static void f() {
        String str = e().f78452a.f78492f;
    }

    public static void g() {
        String str = e().f78452a.f78494h;
    }

    public static void h() {
        String str = e().f78452a.f78495i;
    }

    @CalledByNative
    private static void nativeReadyForFields() {
        IApkInfo iApkInfo = e().f78452a;
        N.MOh5qbSu(iApkInfo.f78488b, iApkInfo.f78489c, iApkInfo.f78487a, iApkInfo.f78493g, iApkInfo.f78494h, iApkInfo.f78492f, iApkInfo.f78495i, iApkInfo.f78490d, iApkInfo.f78491e, iApkInfo.f78496j);
    }
}
