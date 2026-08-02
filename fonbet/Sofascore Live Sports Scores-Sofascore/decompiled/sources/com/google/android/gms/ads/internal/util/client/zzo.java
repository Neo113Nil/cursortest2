package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzguz;
import defpackage.bf3;
import defpackage.bgf;
import defpackage.pyh;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzo {
    public static final zzguz a = new zzguz(new bgf(18));

    public static String a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        return bf3.h(lineNumber, str, " @", new StringBuilder(str.length() + 2 + String.valueOf(lineNumber).length()));
    }

    public static void zzd(String str) {
        if (!zzm(3) || str.length() <= 4000) {
            return;
        }
        zzguz zzguzVar = a;
        zzguzVar.getClass();
        Iterator i = zzguzVar.c.i(zzguzVar, str);
        while (true) {
            pyh pyhVar = (pyh) i;
            if (!pyhVar.hasNext()) {
                return;
            }
        }
    }

    public static void zze(String str, Throwable th) {
        zzm(3);
    }

    public static void zzf(String str) {
        if (!zzm(6) || str == null || str.length() <= 4000) {
            return;
        }
        zzguz zzguzVar = a;
        zzguzVar.getClass();
        Iterator i = zzguzVar.c.i(zzguzVar, str);
        while (true) {
            pyh pyhVar = (pyh) i;
            if (!pyhVar.hasNext()) {
                return;
            }
        }
    }

    public static void zzg(String str, Throwable th) {
        zzm(6);
    }

    public static void zzh(String str) {
        if (!zzm(4) || str == null || str.length() <= 4000) {
            return;
        }
        zzguz zzguzVar = a;
        zzguzVar.getClass();
        Iterator i = zzguzVar.c.i(zzguzVar, str);
        while (true) {
            pyh pyhVar = (pyh) i;
            if (!pyhVar.hasNext()) {
                return;
            }
        }
    }

    public static void zzi(String str) {
        if (!zzm(5) || str == null || str.length() <= 4000) {
            return;
        }
        zzguz zzguzVar = a;
        zzguzVar.getClass();
        Iterator i = zzguzVar.c.i(zzguzVar, str);
        while (true) {
            pyh pyhVar = (pyh) i;
            if (!pyhVar.hasNext()) {
                return;
            }
        }
    }

    public static void zzj(String str, Throwable th) {
        zzm(5);
    }

    public static void zzl(String str, @Nullable Throwable th) {
        if (zzm(5)) {
            if (th != null) {
                zzj(a(str), th);
            } else {
                zzi(a(str));
            }
        }
    }

    public static boolean zzm(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
