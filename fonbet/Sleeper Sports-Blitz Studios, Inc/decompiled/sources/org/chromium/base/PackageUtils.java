package org.chromium.base;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.provider.Settings;
import androidx.media3.common.C;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* loaded from: classes10.dex */
public class PackageUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String DEFAULT_ASSISTANT_SETTING = "assistant";
    private static final char[] HEX_CHAR_LOOKUP = "0123456789ABCDEF".toCharArray();
    private static final String TAG = "PackageUtils";

    public static PackageInfo getPackageInfo(String packageName, int flags) {
        try {
            return ContextUtils.getApplicationContext().getPackageManager().getPackageInfo(packageName, flags);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static int getPackageVersion(String packageName) {
        PackageInfo packageInfo = getPackageInfo(packageName, 0);
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return -1;
    }

    public static boolean isPackageInstalled(String packageName) {
        return getPackageInfo(packageName, 0) != null;
    }

    public static PackageInfo getApplicationPackageInfo(int flags) {
        if (!ApkInfo.getPackageName().equals(ApkInfo.getHostPackageName())) {
            maybeWorkAroundWebViewPackageVisibility();
        }
        return getPackageInfo(ApkInfo.getPackageName(), flags);
    }

    public static long packageVersionCode(PackageInfo pi) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = pi.getLongVersionCode();
            return longVersionCode;
        }
        return pi.versionCode;
    }

    public static void maybeWorkAroundWebViewPackageVisibility() {
        if (Build.VERSION.SDK_INT < 30 || Build.VERSION.SDK_INT >= 34) {
            return;
        }
        try {
            Class.forName("android.webkit.WebViewUpdateService").getDeclaredMethod("getCurrentWebViewPackageName", null).invoke(null, null);
        } catch (Exception e) {
            Log.w(TAG, "maybeWorkAroundWebViewPackageVisibility failed", (Throwable) e);
        }
    }

    public static List<String> getCertificateSHA256FingerprintForPackage(String packageName) {
        PackageInfo packageInfo = getPackageInfo(packageName, 64);
        if (packageInfo == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
        for (Signature signature : packageInfo.signatures) {
            try {
                arrayList.add(byteArrayToHexString(MessageDigest.getInstance("SHA256").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()))).getEncoded())));
            } catch (NoSuchAlgorithmException | CertificateException e) {
                Log.w(TAG, "Exception", e);
                return null;
            }
        }
        return arrayList;
    }

    public static String computeCertSignatureSha256ForPackage(String packageName) {
        SigningInfo signingInfo;
        SigningInfo signingInfo2;
        Signature[] signingCertificateHistory;
        PackageInfo packageInfo = getPackageInfo(packageName, C.BUFFER_FLAG_FIRST_SAMPLE);
        if (packageInfo != null) {
            signingInfo = packageInfo.signingInfo;
            if (signingInfo != null) {
                signingInfo2 = packageInfo.signingInfo;
                signingCertificateHistory = signingInfo2.getSigningCertificateHistory();
                if (signingCertificateHistory != null && signingCertificateHistory.length != 0) {
                    try {
                        return byteArrayToHexString(MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(signingCertificateHistory[signingCertificateHistory.length - 1].toByteArray()));
                    } catch (NoSuchAlgorithmException e) {
                        Log.w(TAG, "Unable to hash host app signature", (Throwable) e);
                    }
                }
            }
        }
        return null;
    }

    public static String getDefaultAssistantPackageName(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), DEFAULT_ASSISTANT_SETTING);
        if (string != null && !UByte$$ExternalSyntheticBackport0.m13544m(string)) {
            String[] split = string.split("/");
            if (split.length > 1 && !UByte$$ExternalSyntheticBackport0.m13544m(split[0])) {
                return split[0];
            }
        }
        return null;
    }

    static String byteArrayToHexString(byte[] byteArray) {
        StringBuilder sb = new StringBuilder((byteArray.length * 3) - 1);
        for (int i = 0; i < byteArray.length; i++) {
            char[] cArr = HEX_CHAR_LOOKUP;
            sb.append(cArr[(byteArray[i] & 240) >>> 4]);
            sb.append(cArr[byteArray[i] & 15]);
            if (i < byteArray.length - 1) {
                sb.append(AbstractJsonLexerKt.COLON);
            }
        }
        return sb.toString();
    }

    private PackageUtils() {
    }
}
