package com.appsflyer.sdk_base.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.dt;
import defpackage.ph0;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\f\u0010\b\u001a\u00020\u0004*\u00020\tH\u0007¨\u0006\n"}, d2 = {"getVersionCode", "", "Landroid/content/Context;", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "", "getVersionName", InAppPurchaseMetaData.KEY_SIGNATURE, "Landroid/content/pm/PackageManager;", "bytesToUpperHexString", "", "sdk_base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidExtensionsKt {
    @NotNull
    public static final String bytesToUpperHexString(@NotNull byte[] bArr) {
        bArr.getClass();
        return ph0.I(bArr, "", new dt(14), 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence bytesToUpperHexString$lambda$0(byte b) {
        return String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
    }

    public static final long getVersionCode(@NotNull Context context, @NotNull String str) throws PackageManager.NameNotFoundException {
        context.getClass();
        str.getClass();
        try {
            return Build.VERSION.SDK_INT >= 28 ? context.getPackageManager().getPackageInfo(str, 0).getLongVersionCode() : r1.versionCode;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Nullable
    public static final String getVersionName(@NotNull Context context, @NotNull String str) throws PackageManager.NameNotFoundException {
        context.getClass();
        str.getClass();
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Throwable unused) {
            return "";
        }
    }

    @Nullable
    public static final String signature(@NotNull PackageManager packageManager, @NotNull String str) throws PackageManager.NameNotFoundException, CertificateException, NoSuchAlgorithmException {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        SigningInfo signingInfo2;
        packageManager.getClass();
        str.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(134217728L));
            packageInfo.getClass();
            signingInfo2 = packageInfo.signingInfo;
            if (signingInfo2 == null || (signatureArr = signingInfo2.getApkContentsSigners()) == null) {
                return null;
            }
        } else if (i >= 28) {
            signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
            if (signingInfo == null || (signatureArr = signingInfo.getApkContentsSigners()) == null) {
                return null;
            }
        } else {
            signatureArr = packageManager.getPackageInfo(str, 64).signatures;
            if (signatureArr == null) {
                return null;
            }
        }
        if (signatureArr.length == 0) {
            return null;
        }
        Certificate generateCertificate = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        generateCertificate.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(((X509Certificate) generateCertificate).getEncoded());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return bytesToUpperHexString(digest);
    }
}
