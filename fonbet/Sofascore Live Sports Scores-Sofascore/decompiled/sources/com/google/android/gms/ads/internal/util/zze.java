package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzblj;
import com.google.android.gms.internal.ads.zzguz;
import defpackage.pyh;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zze extends com.google.android.gms.ads.internal.util.client.zzo {
    public static final /* synthetic */ int zza = 0;

    public static void zza(String str) {
        if (!zzc() || str == null || str.length() <= 4000) {
            return;
        }
        zzguz zzguzVar = com.google.android.gms.ads.internal.util.client.zzo.a;
        zzguzVar.getClass();
        Iterator i = zzguzVar.c.i(zzguzVar, str);
        while (true) {
            pyh pyhVar = (pyh) i;
            if (!pyhVar.hasNext()) {
                return;
            }
        }
    }

    public static void zzb(String str, Throwable th) {
        zzc();
    }

    public static boolean zzc() {
        return com.google.android.gms.ads.internal.util.client.zzo.zzm(2) && ((Boolean) zzblj.a.c()).booleanValue();
    }
}
