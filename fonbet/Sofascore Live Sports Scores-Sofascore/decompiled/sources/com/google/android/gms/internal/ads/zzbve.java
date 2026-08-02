package com.google.android.gms.internal.ads;

import defpackage.c0l;
import defpackage.ddb;
import defpackage.qpn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbve implements zzbuq {
    public final zzbus a;
    public final zzbut b;
    public final zzbum c;
    public final String d;

    public zzbve(zzbum zzbumVar, String str, zzbut zzbutVar, zzbus zzbusVar) {
        this.c = zzbumVar;
        this.d = str;
        this.b = zzbutVar;
        this.a = zzbusVar;
    }

    public final ddb a(Object obj) {
        zzcgo zzcgoVar = new zzcgo();
        zzbug b = this.c.b();
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        b.a(new qpn(this, b, obj, zzcgoVar, 0), new c0l(19, this, zzcgoVar, b));
        return zzcgoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final ddb zza(Object obj) {
        return a(obj);
    }
}
