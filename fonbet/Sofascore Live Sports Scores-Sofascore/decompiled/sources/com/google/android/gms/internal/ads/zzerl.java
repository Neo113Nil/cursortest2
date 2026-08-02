package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzerl implements zzems {
    public final zzesp a;
    public final zzdya b;

    public zzerl(zzesp zzespVar, zzdya zzdyaVar) {
        this.a = zzespVar;
        this.b = zzdyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final zzemt a(String str, JSONObject jSONObject) {
        zzbxt b;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.u2)).booleanValue()) {
            try {
                b = this.b.b(str);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Coundn't create RTB adapter: ", e);
            }
        } else {
            ConcurrentHashMap concurrentHashMap = this.a.a;
            if (concurrentHashMap.containsKey(str)) {
                b = (zzbxt) concurrentHashMap.get(str);
            }
            b = null;
        }
        if (b == null) {
            return null;
        }
        return new zzemt(b, new zzeof(), str);
    }
}
