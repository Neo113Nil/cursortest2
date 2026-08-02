package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbjg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbz {
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();
    public final Context c;

    public zzbz(Context context) {
        this.c = context;
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ac)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            final Map zzx = zzs.zzx((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.fc));
            for (String str : zzx.keySet()) {
                synchronized (this) {
                    try {
                        HashMap hashMap = this.a;
                        if (!hashMap.containsKey(str)) {
                            boolean equals = Objects.equals(str, "__default__");
                            Context context = this.c;
                            SharedPreferences defaultSharedPreferences = equals ? PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences(str, 0);
                            zzbw zzbwVar = new zzbw(this, str);
                            hashMap.put(str, zzbwVar);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbwVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            zzbx zzbxVar = new zzbx() { // from class: com.google.android.gms.ads.internal.util.zzby
                @Override // com.google.android.gms.ads.internal.util.zzbx
                public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str2, String str3) {
                    Map map = zzx;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str3)) {
                        com.google.android.gms.ads.internal.zzt.zzh().g().zzy(false);
                    }
                }
            };
            synchronized (this) {
                this.b.add(zzbxVar);
            }
        }
    }
}
