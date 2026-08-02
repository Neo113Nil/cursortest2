package com.google.android.gms.internal.p002firebaseauthapi;

import K9.h;
import android.app.Activity;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Map;
import java.util.concurrent.Executor;
import z.C6900a;

/* loaded from: classes2.dex */
public final class zzagb {
    private static final Map<String, zzagd> zza = new C6900a();

    public static PhoneAuthProvider.a zza(String str, PhoneAuthProvider.a aVar, zzaff zzaffVar) {
        zza(str, zzaffVar);
        return new zzaga(aVar, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzaff zzaffVar) {
        zza.put(str, new zzagd(zzaffVar, h.c().a()));
    }

    public static boolean zza(String str, PhoneAuthProvider.a aVar, Activity activity, Executor executor) {
        Map<String, zzagd> map = zza;
        if (map.containsKey(str)) {
            zzagd zzagdVar = map.get(str);
            if (h.c().a() - zzagdVar.zzb < 120000) {
                zzaff zzaffVar = zzagdVar.zza;
                if (zzaffVar == null) {
                    return true;
                }
                zzaffVar.zza(aVar, activity, executor, str);
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}
