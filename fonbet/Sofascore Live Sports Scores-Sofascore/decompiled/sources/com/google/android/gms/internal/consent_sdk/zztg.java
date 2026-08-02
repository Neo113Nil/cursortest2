package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zztg implements zztk {
    public static final Object c = new Object();
    public volatile zztk a;
    public volatile Object b;

    public static zztg a(zztk zztkVar) {
        if (zztkVar instanceof zztg) {
            return (zztg) zztkVar;
        }
        zztg zztgVar = new zztg();
        zztgVar.b = c;
        zztgVar.a = zztkVar;
        return zztgVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.ads.zzdom
    public final Object zzb() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object zzb = this.a.zzb();
                Object obj4 = this.b;
                if (obj4 != obj2 && obj4 != zzb) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + zzb + ". This is likely due to a circular dependency.");
                }
                this.b = zzb;
                this.a = null;
                return zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
