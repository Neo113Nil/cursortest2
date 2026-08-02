package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzzk extends zzbf {
    public static final Object g = new Object();
    public final long b;
    public final long c;
    public final boolean d;
    public final zzak e;
    public final zzaf f;

    static {
        zzz zzzVar = new zzz();
        zzzVar.a = "SinglePeriodTimeline";
        zzzVar.b = Uri.EMPTY;
        zzzVar.a();
    }

    public zzzk(long j, long j2, boolean z, zzak zzakVar, zzaf zzafVar) {
        this.b = j;
        this.c = j2;
        this.d = z;
        zzakVar.getClass();
        this.e = zzakVar;
        this.f = zzafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbe b(int i, zzbe zzbeVar, long j) {
        zzguk.i(i, 1);
        Object obj = zzbe.m;
        zzbeVar.a(this.e, this.d, false, this.f, this.c);
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd d(int i, zzbd zzbdVar, boolean z) {
        zzguk.i(i, 1);
        Object obj = z ? g : null;
        zzc zzcVar = zzc.b;
        zzbdVar.a(null, obj, 0, this.b, false);
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int e(Object obj) {
        return g != obj ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final Object f(int i) {
        zzguk.i(i, 1);
        return g;
    }
}
