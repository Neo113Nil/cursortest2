package com.google.android.gms.internal.ads;

import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeqv implements zzems {
    public final HashMap a = new HashMap();
    public final zzdya b;

    public zzeqv(zzdya zzdyaVar) {
        this.b = zzdyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final zzemt a(String str, JSONObject jSONObject) {
        zzemt zzemtVar;
        synchronized (this) {
            try {
                HashMap hashMap = this.a;
                zzemtVar = (zzemt) hashMap.get(str);
                if (zzemtVar == null) {
                    zzemtVar = new zzemt(this.b.a(str, jSONObject), new zzeog(), str);
                    hashMap.put(str, zzemtVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzemtVar;
    }
}
