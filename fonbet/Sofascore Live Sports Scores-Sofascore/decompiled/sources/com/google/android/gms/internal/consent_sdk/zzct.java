package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzct {
    public static String a;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized String a(Context context) {
        String str;
        int i;
        String str2;
        synchronized (zzct.class) {
            try {
                str = a;
                if (str == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                    if (string != null) {
                        if (zzdb.a()) {
                        }
                        for (i = 0; i < 3; i++) {
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                                messageDigest.update(string.getBytes());
                                str2 = String.format("%032X", new BigInteger(1, messageDigest.digest()));
                                break;
                            } catch (ArithmeticException unused) {
                            } catch (NoSuchAlgorithmException unused2) {
                            }
                        }
                        str2 = "";
                        str = str2;
                        a = str;
                    }
                    string = "emulator";
                    while (i < 3) {
                    }
                    str2 = "";
                    str = str2;
                    a = str;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
