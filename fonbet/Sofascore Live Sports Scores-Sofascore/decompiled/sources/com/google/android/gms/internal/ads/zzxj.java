package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzxj extends zzzt {
    public final boolean l;
    public final zzbe m;
    public final zzbd n;
    public a0 o;
    public zzxg p;
    public boolean q;
    public boolean r;
    public boolean s;

    public zzxj(zzxq zzxqVar, boolean z) {
        super(zzxqVar);
        boolean z2;
        if (z) {
            zzxqVar.zzJ();
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new zzbe();
        this.n = new zzbd();
        zzxqVar.l();
        this.o = new a0(new zzxi(zzxqVar.b()), zzbe.m, a0.e);
    }

    @Override // com.google.android.gms.internal.ads.zzzt, com.google.android.gms.internal.ads.zzxq
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final zzxg k(zzxo zzxoVar, zzabp zzabpVar, long j) {
        zzxg zzxgVar = new zzxg(zzxoVar, zzabpVar, j);
        zzguk.f(zzxgVar.d == null);
        zzxq zzxqVar = this.k;
        zzxgVar.d = zzxqVar;
        if (!this.r) {
            this.p = zzxgVar;
            if (!this.q) {
                this.q = true;
                t(null, zzxqVar);
            }
            return zzxgVar;
        }
        Object obj = zzxoVar.a;
        if (this.o.d != null && obj.equals(a0.e)) {
            obj = this.o.d;
        }
        zzxgVar.b(zzxoVar.a(obj));
        return zzxgVar;
    }

    public final boolean B(long j) {
        zzxg zzxgVar = this.p;
        int e = this.o.e(zzxgVar.a.a);
        if (e == -1) {
            return false;
        }
        a0 a0Var = this.o;
        zzbd zzbdVar = this.n;
        a0Var.d(e, zzbdVar, false);
        long j2 = zzbdVar.d;
        if (j2 != C.TIME_UNSET && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzxgVar.g = j;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzzt, com.google.android.gms.internal.ads.zzxq
    public final void c(zzxm zzxmVar) {
        zzxg zzxgVar = (zzxg) zzxmVar;
        zzxm zzxmVar2 = zzxgVar.e;
        if (zzxmVar2 != null) {
            zzxq zzxqVar = zzxgVar.d;
            zzxqVar.getClass();
            zzxqVar.c(zzxmVar2);
        }
        if (zzxmVar == this.p) {
            this.p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void g(zzak zzakVar) {
        if (this.s) {
            a0 a0Var = this.o;
            zzbf zzbfVar = a0Var.b;
            this.o = new a0(zzbfVar instanceof zzzp ? new zzzp(((zzzp) zzbfVar).b, zzakVar) : new zzzp(zzbfVar, zzakVar), a0Var.c, a0Var.d);
        } else {
            this.o = new a0(new zzxi(zzakVar), zzbe.m, a0.e);
        }
        this.k.g(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzww, com.google.android.gms.internal.ads.zzwp
    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    @Override // com.google.android.gms.internal.ads.zzzt
    public final void x() {
        if (this.l) {
            return;
        }
        this.q = true;
        t(null, this.k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r6 != 0) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.zzzt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(zzbf zzbfVar) {
        long j;
        a0 a0Var;
        a0 a0Var2;
        zzxo zzxoVar = null;
        if (this.r) {
            a0 a0Var3 = this.o;
            this.o = new a0(zzbfVar, a0Var3.c, a0Var3.d);
            zzxg zzxgVar = this.p;
            if (zzxgVar != null) {
                B(zzxgVar.g);
            }
        } else if (zzbfVar.g()) {
            if (this.s) {
                a0 a0Var4 = this.o;
                a0Var2 = new a0(zzbfVar, a0Var4.c, a0Var4.d);
            } else {
                a0Var2 = new a0(zzbfVar, zzbe.m, a0.e);
            }
            this.o = a0Var2;
        } else {
            zzbe zzbeVar = this.m;
            zzbfVar.b(0, zzbeVar, 0L);
            Object obj = zzbeVar.a;
            zzxg zzxgVar2 = this.p;
            if (zzxgVar2 != null) {
                j = zzxgVar2.b;
                this.o.o(zzxgVar2.a.a, this.n);
                this.o.b(0, zzbeVar, 0L);
            }
            j = 0;
            Pair m = zzbfVar.m(zzbeVar, this.n, 0, j);
            Object obj2 = m.first;
            long longValue = ((Long) m.second).longValue();
            if (this.s) {
                a0 a0Var5 = this.o;
                a0Var = new a0(zzbfVar, a0Var5.c, a0Var5.d);
            } else {
                a0Var = new a0(zzbfVar, obj, obj2);
            }
            this.o = a0Var;
            zzxg zzxgVar3 = this.p;
            if (zzxgVar3 != null && B(longValue)) {
                zzxo zzxoVar2 = zzxgVar3.a;
                Object obj3 = zzxoVar2.a;
                if (this.o.d != null && obj3.equals(a0.e)) {
                    obj3 = this.o.d;
                }
                zzxoVar = zzxoVar2.a(obj3);
            }
        }
        this.s = true;
        this.r = true;
        r(this.o);
        if (zzxoVar != null) {
            zzxg zzxgVar4 = this.p;
            zzxgVar4.getClass();
            zzxgVar4.b(zzxoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzt
    public final zzxo z(zzxo zzxoVar) {
        Object obj = this.o.d;
        Object obj2 = zzxoVar.a;
        if (obj != null && obj.equals(obj2)) {
            obj2 = a0.e;
        }
        return zzxoVar.a(obj2);
    }
}
