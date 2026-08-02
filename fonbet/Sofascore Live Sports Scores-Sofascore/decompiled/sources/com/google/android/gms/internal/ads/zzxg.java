package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzxg implements zzxm, zzxl {
    public final zzxo a;
    public final long b;
    public final zzabp c;
    public zzxq d;
    public zzxm e;
    public zzxl f;
    public long g = C.TIME_UNSET;

    public zzxg(zzxo zzxoVar, zzabp zzabpVar, long j) {
        this.a = zzxoVar;
        this.c = zzabpVar;
        this.b = j;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void a(long j) {
        zzxm zzxmVar = this.e;
        String str = zzfm.a;
        zzxmVar.a(j);
    }

    public final void b(zzxo zzxoVar) {
        long j = this.g;
        if (j == C.TIME_UNSET) {
            j = this.b;
        }
        zzxq zzxqVar = this.d;
        zzxqVar.getClass();
        zzxm k = zzxqVar.k(zzxoVar, this.c, j);
        this.e = k;
        if (this.f != null) {
            k.e(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzh
    public final /* bridge */ /* synthetic */ void c(zzzi zzziVar) {
        zzxl zzxlVar = this.f;
        String str = zzfm.a;
        zzxlVar.c(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long d(long j) {
        zzxm zzxmVar = this.e;
        String str = zzfm.a;
        return zzxmVar.d(j);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void e(zzxl zzxlVar, long j) {
        this.f = zzxlVar;
        zzxm zzxmVar = this.e;
        if (zzxmVar != null) {
            long j2 = this.g;
            if (j2 == C.TIME_UNSET) {
                j2 = this.b;
            }
            zzxmVar.e(this, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean f(zzme zzmeVar) {
        zzxm zzxmVar = this.e;
        return zzxmVar != null && zzxmVar.f(zzmeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long g(zzabe[] zzabeVarArr, boolean[] zArr, zzzg[] zzzgVarArr, boolean[] zArr2, long j) {
        long j2 = this.g;
        if (j2 != C.TIME_UNSET && j == this.b) {
            j = j2;
        }
        this.g = C.TIME_UNSET;
        zzxm zzxmVar = this.e;
        String str = zzfm.a;
        return zzxmVar.g(zzabeVarArr, zArr, zzzgVarArr, zArr2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long h(long j, zznm zznmVar) {
        zzxm zzxmVar = this.e;
        String str = zzfm.a;
        return zzxmVar.h(j, zznmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void i(zzxm zzxmVar) {
        zzxl zzxlVar = this.f;
        String str = zzfm.a;
        zzxlVar.i(this);
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final long zzb() {
        zzxm zzxmVar = this.e;
        String str = zzfm.a;
        return zzxmVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final long zzc() {
        zzxm zzxmVar = this.e;
        String str = zzfm.a;
        return zzxmVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zze() {
        zzxm zzxmVar = this.e;
        return zzxmVar != null && zzxmVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzm() {
        zzxm zzxmVar = this.e;
        if (zzxmVar != null) {
            zzxmVar.zzm();
            return;
        }
        zzxq zzxqVar = this.d;
        if (zzxqVar != null) {
            zzxqVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final zzzr zzn() {
        zzxm zzxmVar = this.e;
        String str = zzfm.a;
        return zzxmVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzq(long j) {
        zzxm zzxmVar = this.e;
        String str = zzfm.a;
        zzxmVar.zzq(j);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzr() {
        zzxm zzxmVar = this.e;
        String str = zzfm.a;
        return zzxmVar.zzr();
    }
}
