package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ay4 extends rdi implements cdi {
    public final Function0 b;
    public final foh c;
    public zx4 d = new zx4(snh.h().g());

    public ay4(Function0 function0, foh fohVar) {
        this.b = function0;
        this.c = fohVar;
    }

    @Override // defpackage.qdi
    public final void c(sdi sdiVar) {
        this.d = (zx4) sdiVar;
    }

    @Override // defpackage.qdi
    public final sdi d() {
        return this.d;
    }

    @Override // defpackage.cdi
    public final Object getValue() {
        Function1 e = snh.h().e();
        if (e != null) {
            e.invoke(this);
        }
        nnh h = snh.h();
        return h((zx4) snh.g(this.d, h), h, true, this.b).f;
    }

    public final zx4 h(zx4 zx4Var, nnh nnhVar, boolean z, Function0 function0) {
        i1d a;
        zx4 zx4Var2;
        foh fohVar;
        int i;
        if (zx4Var.d(this, nnhVar)) {
            if (z) {
                a = goh.a();
                Object[] objArr = a.a;
                int i2 = a.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((zu8) objArr[i3]).b();
                }
                try {
                    h0d h0dVar = zx4Var.e;
                    l2a l2aVar = goh.a;
                    z6a z6aVar = (z6a) l2aVar.l();
                    if (z6aVar == null) {
                        z6aVar = new z6a();
                        l2aVar.I(z6aVar);
                    }
                    int i4 = z6aVar.a;
                    Object[] objArr2 = h0dVar.b;
                    int[] iArr = h0dVar.c;
                    long[] jArr = h0dVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        qdi qdiVar = (qdi) objArr2[i9];
                                        i = i6;
                                        z6aVar.a = i4 + iArr[i9];
                                        Function1 e = nnhVar.e();
                                        if (e != null) {
                                            e.invoke(qdiVar);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    z6aVar.a = i4;
                    Unit unit = Unit.a;
                    Object[] objArr3 = a.a;
                    int i10 = a.c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((zu8) objArr3[i11]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zx4Var;
        }
        h0d h0dVar2 = new h0d();
        l2a l2aVar2 = goh.a;
        z6a z6aVar2 = (z6a) l2aVar2.l();
        if (z6aVar2 == null) {
            z6aVar2 = new z6a();
            l2aVar2.I(z6aVar2);
        }
        int i12 = z6aVar2.a;
        a = goh.a();
        Object[] objArr4 = a.a;
        int i13 = a.c;
        for (int i14 = 0; i14 < i13; i14++) {
            ((zu8) objArr4[i14]).b();
        }
        try {
            z6aVar2.a = i12 + 1;
            Object F = bea.F(new yx4(this, z6aVar2, h0dVar2, i12, 0), function0);
            z6aVar2.a = i12;
            Object[] objArr5 = a.a;
            int i15 = a.c;
            for (int i16 = 0; i16 < i15; i16++) {
                ((zu8) objArr5[i16]).a();
            }
            Object obj = snh.c;
            synchronized (obj) {
                try {
                    nnh h = snh.h();
                    Object obj2 = zx4Var.f;
                    if (obj2 == zx4.h || (fohVar = this.c) == null || !fohVar.q(F, obj2)) {
                        zx4 zx4Var3 = this.d;
                        synchronized (obj) {
                            sdi k = snh.k(zx4Var3, this);
                            k.a(zx4Var3);
                            k.a = h.g();
                            zx4Var2 = (zx4) k;
                            zx4Var2.e = h0dVar2;
                            zx4Var2.g = zx4Var2.e(this, h);
                            zx4Var2.f = F;
                        }
                        return zx4Var2;
                    }
                    zx4Var.e = h0dVar2;
                    zx4Var.g = zx4Var.e(this, h);
                    zx4Var2 = zx4Var;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            z6a z6aVar3 = (z6a) goh.a.l();
            if (z6aVar3 == null || z6aVar3.a != 0) {
                return zx4Var2;
            }
            snh.h().m();
            synchronized (obj) {
                nnh h2 = snh.h();
                zx4Var2.c = h2.g();
                zx4Var2.d = h2.h();
                Unit unit2 = Unit.a;
                return zx4Var2;
            }
        } finally {
            Object[] objArr6 = a.a;
            int i17 = a.c;
            for (int i18 = 0; i18 < i17; i18++) {
                ((zu8) objArr6[i18]).a();
            }
        }
    }

    public final zx4 i() {
        nnh h = snh.h();
        return h((zx4) snh.g(this.d, h), h, false, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        zx4 zx4Var = (zx4) snh.f(this.d);
        sb.append(zx4Var.d(this, snh.h()) ? String.valueOf(zx4Var.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
