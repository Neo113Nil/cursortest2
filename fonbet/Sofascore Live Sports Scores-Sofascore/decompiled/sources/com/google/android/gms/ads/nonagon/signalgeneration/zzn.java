package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzn extends LinkedHashMap {
    public final /* synthetic */ zzq a;

    public zzn(zzq zzqVar) {
        this.a = zzqVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        zzq zzqVar = this.a;
        synchronized (zzqVar) {
            try {
                if (size() <= zzqVar.a) {
                    return false;
                }
                zzqVar.f.add(new Pair((String) entry.getKey(), ((zzo) entry.getValue()).zzb));
                return size() > zzqVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
