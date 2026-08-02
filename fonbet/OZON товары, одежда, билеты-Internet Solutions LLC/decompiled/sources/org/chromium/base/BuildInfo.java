package org.chromium.base;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import internal.org.jni_zero.CalledByNative;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Deprecated
/* loaded from: classes6.dex */
public final class BuildInfo {

    /* renamed from: a, reason: collision with root package name */
    private String f78457a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f78458b;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final BuildInfo f78459a = new BuildInfo(0);

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f78460b = 0;
    }

    /* synthetic */ BuildInfo(int i11) {
        this();
    }

    public static void a() {
        int i11 = a.f78460b;
    }

    @CalledByNative
    private static String lazyGetHostSigningCertSha256() {
        String str;
        PackageInfo packageInfo;
        SigningInfo signingInfo;
        SigningInfo signingInfo2;
        BuildInfo buildInfo = a.f78459a;
        synchronized (buildInfo.f78458b) {
            if (buildInfo.f78457a == null) {
                String str2 = "";
                String packageName = e.b().getPackageName();
                int i11 = Build.VERSION.SDK_INT;
                int i12 = i11 >= 28 ? 134217728 : 64;
                int i13 = l.f78550b;
                Signature[] signatureArr = null;
                try {
                    packageInfo = e.b().getPackageManager().getPackageInfo(packageName, i12);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (i11 >= 28) {
                    signingInfo = packageInfo.signingInfo;
                    if (signingInfo != null) {
                        signingInfo2 = packageInfo.signingInfo;
                        signatureArr = signingInfo2.getSigningCertificateHistory();
                    }
                } else {
                    signatureArr = packageInfo.signatures;
                }
                if (signatureArr != null) {
                    try {
                        str2 = l.a(MessageDigest.getInstance("SHA-256").digest(signatureArr[signatureArr.length - 1].toByteArray()));
                    } catch (NoSuchAlgorithmException e11) {
                        Log.w(j.c("BuildInfo"), "Unable to hash host app signature", e11);
                    }
                }
                buildInfo.f78457a = str2;
            }
            str = buildInfo.f78457a;
        }
        return str;
    }

    private BuildInfo() {
        this.f78458b = new Object();
        ApkInfo.b();
        ApkInfo.a();
        ApkInfo.c();
        ApkInfo.f();
        ApkInfo.g();
        ApkInfo.d();
        TextUtils.join(", ", Build.SUPPORTED_ABIS);
        String str = Build.FINGERPRINT;
        str.substring(0, Math.min(str.length(), UserVerificationMethods.USER_VERIFY_PATTERN));
        ApkInfo.h();
        DeviceInfo.f();
        DeviceInfo.c();
        DeviceInfo.e();
        DeviceInfo.d();
        DeviceInfo.b();
    }
}
