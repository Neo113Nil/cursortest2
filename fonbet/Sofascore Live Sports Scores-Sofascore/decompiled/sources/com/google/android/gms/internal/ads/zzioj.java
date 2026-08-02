package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzioj implements zziof {
    public static final Object c = new Object();
    public volatile zziof a;
    public volatile Object b;

    public static zziof a(zziof zziofVar) {
        if (zziofVar instanceof zzioj) {
            return zziofVar;
        }
        if (zziofVar instanceof zzinv) {
            return zziofVar;
        }
        zzioj zziojVar = new zzioj();
        zziojVar.b = c;
        zziojVar.a = zziofVar;
        return zziojVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        zziof zziofVar = this.a;
        if (zziofVar == null) {
            return this.b;
        }
        Object zzb = zziofVar.zzb();
        this.b = zzb;
        this.a = null;
        return zzb;
    }
}
