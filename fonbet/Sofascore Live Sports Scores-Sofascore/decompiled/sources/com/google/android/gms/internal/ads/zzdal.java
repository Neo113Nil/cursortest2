package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdal implements com.google.android.gms.ads.internal.client.zza {
    public final zzdap a;
    public final zzflw b;

    public zzdal(zzdap zzdapVar, zzflw zzflwVar) {
        this.a = zzdapVar;
        this.b = zzflwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzflw zzflwVar = this.b;
        zzdap zzdapVar = this.a;
        String str = zzflwVar.g;
        synchronized (zzdapVar.a) {
            try {
                ConcurrentHashMap concurrentHashMap = zzdapVar.b;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
