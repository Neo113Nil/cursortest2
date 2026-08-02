package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzcek;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import defpackage.urn;
import defpackage.xrn;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzces {
    public static urn a;

    public static synchronized zzces b(Context context) {
        synchronized (zzces.class) {
            try {
                urn urnVar = a;
                if (urnVar != null) {
                    return urnVar;
                }
                Context applicationContext = context.getApplicationContext();
                zzbjg.a(applicationContext);
                com.google.android.gms.ads.internal.util.zzj g = com.google.android.gms.ads.internal.zzt.zzh().g();
                g.zza(applicationContext);
                applicationContext.getClass();
                Clock zzk = com.google.android.gms.ads.internal.zzt.zzk();
                zzk.getClass();
                zzcer zzD = com.google.android.gms.ads.internal.zzt.zzD();
                zzioe.b(zzcer.class, zzD);
                urn urnVar2 = new urn(applicationContext, zzk, g, zzD);
                a = urnVar2;
                zzceg zzcegVar = (zzceg) urnVar2.c.zzb();
                SharedPreferences sharedPreferences = zzcegVar.b;
                sharedPreferences.registerOnSharedPreferenceChangeListener(zzcegVar);
                zzcegVar.onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q1)).booleanValue()) {
                    zzcegVar.onSharedPreferenceChanged(sharedPreferences, AndroidTcfDataSource.TCF_TCSTRING_KEY);
                } else {
                    zzcegVar.onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
                }
                final xrn xrnVar = (xrn) a.e.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.k1)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    final Map zzx = com.google.android.gms.ads.internal.util.zzs.zzx((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.l1));
                    Iterator it = zzx.keySet().iterator();
                    while (it.hasNext()) {
                        xrnVar.a((String) it.next());
                    }
                    zzcev zzcevVar = new zzcev() { // from class: wrn
                        @Override // com.google.android.gms.internal.ads.zzcev
                        public final void zza(String str, String str2) {
                            xrn xrnVar2 = xrn.this;
                            xrnVar2.getClass();
                            Map map = zzx;
                            if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
                                zzcek zzcekVar = xrnVar2.d;
                                zzcekVar.b.a(-1, zzcekVar.a.a());
                            }
                        }
                    };
                    synchronized (xrnVar) {
                        xrnVar.b.add(zzcevVar);
                    }
                }
                return a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract zzcek a();
}
