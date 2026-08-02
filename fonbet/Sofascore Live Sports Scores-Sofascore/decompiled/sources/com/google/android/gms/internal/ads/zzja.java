package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzja implements zzne, zzng {
    public final int b;
    public zznh d;
    public int e;
    public zzqj f;
    public zzdp g;
    public int h;
    public zzzg i;
    public zzv[] j;
    public long k;
    public long l;
    public boolean n;
    public boolean o;
    public zzxo q;
    public zznf s;
    public final Object a = new Object();
    public final zzma c = new zzma();
    public long m = Long.MIN_VALUE;
    public zzbf p = zzbf.a;
    public long r = C.TIME_UNSET;

    public zzja(int i) {
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void A(zzbf zzbfVar) {
        if (Objects.equals(this.p, zzbfVar)) {
            return;
        }
        this.p = zzbfVar;
        s();
        o();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void D(zznh zznhVar, zzv[] zzvVarArr, zzzg zzzgVar, boolean z, boolean z2, long j, long j2, zzxo zzxoVar) {
        zzguk.f(this.h == 0);
        this.d = zznhVar;
        this.q = zzxoVar;
        this.h = 1;
        t(z, z2);
        I(zzvVarArr, zzzgVar, j, j2, zzxoVar);
        this.n = false;
        this.l = j;
        this.m = j;
        g(j, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void E() {
        zzguk.f(this.h == 1);
        this.h = 2;
        j();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void G(int i, zzqj zzqjVar, zzdp zzdpVar) {
        this.e = i;
        this.f = zzqjVar;
        this.g = zzdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final zzzg H() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void I(zzv[] zzvVarArr, zzzg zzzgVar, long j, long j2, zzxo zzxoVar) {
        zzguk.f(!this.n);
        this.i = zzzgVar;
        this.q = zzxoVar;
        s();
        if (this.m == Long.MIN_VALUE) {
            this.m = j;
        }
        this.j = zzvVarArr;
        this.k = j2;
        u(zzvVarArr, j, j2, zzxoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final boolean J() {
        return this.m == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void b(zznf zznfVar) {
        synchronized (this.a) {
            this.s = zznfVar;
        }
    }

    public void g(long j, boolean z, boolean z2) {
        throw null;
    }

    public void l() {
        throw null;
    }

    public final void p() {
        this.d.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzjn q(Exception exc, zzv zzvVar, boolean z, int i) {
        int i2;
        if (zzvVar != null && !this.o) {
            this.o = true;
            try {
                i2 = ((zzvz) this).c(zzvVar) & 7;
            } catch (zzjn unused) {
            } finally {
                this.o = false;
            }
            return new zzjn(1, exc, i, a(), this.e, zzvVar, zzvVar != null ? 4 : i2, this.q, z);
        }
        i2 = 4;
        return new zzjn(1, exc, i, a(), this.e, zzvVar, zzvVar != null ? 4 : i2, this.q, z);
    }

    public final int r(zzma zzmaVar, zziy zziyVar, int i) {
        zzzg zzzgVar = this.i;
        zzzgVar.getClass();
        int a = zzzgVar.a(zzmaVar, zziyVar, i);
        if (a == -4) {
            int i2 = i & 1;
            if (zziyVar.b(4)) {
                if (i2 == 0) {
                    this.m = Long.MIN_VALUE;
                }
                return this.n ? -4 : -3;
            }
            long j = zziyVar.e + this.k;
            zziyVar.e = j;
            if (i2 == 0) {
                this.m = Math.max(this.m, j);
                return -4;
            }
        } else if (a == -5) {
            zzv zzvVar = zzmaVar.b;
            zzvVar.getClass();
            long j2 = zzvVar.t;
            if (j2 != Long.MAX_VALUE) {
                zzt zztVar = new zzt(zzvVar);
                zztVar.s = j2 + this.k;
                zzmaVar.b = new zzv(zztVar);
                return -5;
            }
        }
        return a;
    }

    public final void s() {
        zzxo zzxoVar;
        int e;
        if (this.p.g() || (zzxoVar = this.q) == null || (e = this.p.e(zzxoVar.a)) == -1) {
            this.r = C.TIME_UNSET;
            return;
        }
        zzbd d = this.p.d(e, new zzbd(), false);
        this.r = d.d;
        int i = zzxoVar.b;
        if (i != -1) {
            this.r = d.f.a(i).e[zzxoVar.c];
            return;
        }
        int i2 = zzxoVar.e;
        if (i2 != -1) {
            d.f.a(i2).getClass();
            this.r = 0L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void z(long j, boolean z) {
        this.n = false;
        this.l = j;
        this.m = j;
        if (!z) {
            zzzg zzzgVar = this.i;
            zzzgVar.getClass();
            z = zzzgVar.l(j - this.k) != 0;
        }
        g(j, false, z);
    }

    @Override // com.google.android.gms.internal.ads.zzne, com.google.android.gms.internal.ads.zzng
    public final int zza() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public zzmf zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final int zze() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final long zzk() {
        return this.m;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzl() {
        this.n = true;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final boolean zzm() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzn() {
        zzzg zzzgVar = this.i;
        zzzgVar.getClass();
        zzzgVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzq() {
        zzguk.f(this.h == 2);
        this.h = 1;
        k();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzr() {
        zzguk.f(this.h == 1);
        zzma zzmaVar = this.c;
        zzmaVar.a = null;
        zzmaVar.b = null;
        this.h = 0;
        this.i = null;
        this.j = null;
        this.n = false;
        l();
        this.q = null;
        this.r = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzs() {
        zzguk.f(this.h == 0);
        zzma zzmaVar = this.c;
        zzmaVar.a = null;
        zzmaVar.b = null;
        m();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzt() {
        zzguk.f(this.h == 0);
        n();
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public int zzu() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzw() {
        synchronized (this.a) {
            this.s = null;
        }
    }

    public void j() {
    }

    public void k() {
    }

    public void m() {
    }

    public void n() {
    }

    public void o() {
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final zzja zzb() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public void f(int i, Object obj) {
    }

    public void t(boolean z, boolean z2) {
    }

    public void u(zzv[] zzvVarArr, long j, long j2, zzxo zzxoVar) {
    }
}
