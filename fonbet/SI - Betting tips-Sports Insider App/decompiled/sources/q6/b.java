package q6;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import c6.h;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.android.core.w0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f22040a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f22041b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f22042c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f22043d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f22044e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f22045f;

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i5 = 0; i5 < length; i5++) {
            int i10 = (bArr[i5] & 240) >>> 4;
            char[] cArr = f22040a;
            sb2.append(cArr[i10]);
            sb2.append(cArr[bArr[i5] & 15]);
        }
        return sb2.toString();
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static byte[] d(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo b10 = s6.c.a(context).b(64, str);
        Signature[] signatureArr = b10.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i5 = 0;
            while (true) {
                if (i5 >= 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i5++;
            }
            if (messageDigest != null) {
                return messageDigest.digest(b10.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean f(Context context, int i5) {
        if (h(context, i5, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                h a7 = h.a(context);
                a7.getClass();
                if (packageInfo != null) {
                    if (!h.c(packageInfo, false)) {
                        if (h.c(packageInfo, true)) {
                            if (!c6.g.a(a7.f3667a)) {
                                w0.m("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f22042c == null) {
            f22042c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (f22042c.booleanValue() && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (f22043d == null) {
            f22043d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f22043d.booleanValue()) {
            return !e() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static boolean h(Context context, int i5, String str) {
        s6.b a7 = s6.c.a(context);
        a7.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a7.f22629a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i5, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static void i(StringBuilder sb2, HashMap hashMap) {
        sb2.append("{");
        boolean z5 = true;
        for (String str : hashMap.keySet()) {
            if (!z5) {
                sb2.append(StringUtils.COMMA);
            }
            String str2 = (String) hashMap.get(str);
            sb2.append("\"");
            sb2.append(str);
            sb2.append("\":");
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\"");
            }
            z5 = false;
        }
        sb2.append("}");
    }
}
