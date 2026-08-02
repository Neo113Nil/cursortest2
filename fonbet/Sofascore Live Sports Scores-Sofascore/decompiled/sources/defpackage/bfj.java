package defpackage;

import android.os.Trace;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bfj extends wtc implements oma, ga5, p3h {
    public String o;
    public dfj p;
    public sf8 q;
    public int r;
    public boolean s;
    public int t;
    public int u;
    public c23 v;
    public HashMap w;
    public f8e x;
    public zej y;
    public afj z;

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r2 != null) goto L12;
     */
    @Override // defpackage.oma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(tkb tkbVar, g1c g1cVar, int i) {
        f8e k1;
        afj afjVar = this.z;
        if (afjVar != null) {
            if (!afjVar.c) {
                afjVar = null;
            }
            if (afjVar != null) {
                k1 = afjVar.d;
            }
        }
        k1 = k1();
        k1.d(tkbVar);
        return ufa.l(k1.e(tkbVar.getLayoutDirection()).c());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r3 != null) goto L12;
     */
    @Override // defpackage.oma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(tkb tkbVar, g1c g1cVar, int i) {
        f8e k1;
        afj afjVar = this.z;
        if (afjVar != null) {
            if (!afjVar.c) {
                afjVar = null;
            }
            if (afjVar != null) {
                k1 = afjVar.d;
            }
        }
        k1 = k1();
        k1.d(tkbVar);
        return k1.a(i, tkbVar.getLayoutDirection());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r2 != null) goto L12;
     */
    @Override // defpackage.oma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(tkb tkbVar, g1c g1cVar, int i) {
        f8e k1;
        afj afjVar = this.z;
        if (afjVar != null) {
            if (!afjVar.c) {
                afjVar = null;
            }
            if (afjVar != null) {
                k1 = afjVar.d;
            }
        }
        k1 = k1();
        k1.d(tkbVar);
        return ufa.l(k1.e(tkbVar.getLayoutDirection()).d());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [zej] */
    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
        zej zejVar = this.y;
        zej zejVar2 = zejVar;
        if (zejVar == null) {
            final int i = 0;
            ?? r0 = new Function1(this) { // from class: zej
                public final /* synthetic */ bfj b;

                {
                    this.b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x0128  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x012f  */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    kx4 kx4Var;
                    aej aejVar;
                    int i2 = i;
                    bfj bfjVar = this.b;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            f8e k1 = bfjVar.k1();
                            dfj dfjVar = bfjVar.p;
                            c23 c23Var = bfjVar.v;
                            dfj f = dfj.f(dfjVar, c23Var != null ? c23Var.a() : r13.i, 0L, null, null, 0L, null, 0, 0L, 16777214);
                            ema emaVar = k1.o;
                            aej aejVar2 = null;
                            if (emaVar != null && (kx4Var = k1.i) != null) {
                                q80 q80Var = new q80(k1.a);
                                if (k1.j != null && k1.n != null) {
                                    long j = k1.p & (-8589934589L);
                                    km5 km5Var = km5.a;
                                    int i3 = k1.f;
                                    boolean z = k1.e;
                                    int i4 = k1.d;
                                    sf8 sf8Var = k1.c;
                                    aejVar = new aej(new zdj(q80Var, f, km5Var, i3, z, i4, kx4Var, emaVar, sf8Var, j), new eyc(new p03(q80Var, f, km5Var, kx4Var, sf8Var), j, k1.f, k1.d), k1.l);
                                    if (aejVar != null) {
                                        list.add(aejVar);
                                        aejVar2 = aejVar;
                                    }
                                    return Boolean.valueOf(aejVar2 != null);
                                }
                            }
                            aejVar = null;
                            if (aejVar != null) {
                            }
                            return Boolean.valueOf(aejVar2 != null);
                        case 1:
                            String str = ((q80) obj).b;
                            afj afjVar = bfjVar.z;
                            if (afjVar == null) {
                                afj afjVar2 = new afj(bfjVar.o, str);
                                f8e f8eVar = new f8e(str, bfjVar.p, bfjVar.q, bfjVar.r, bfjVar.s, bfjVar.t, bfjVar.u);
                                f8eVar.d(bfjVar.k1().i);
                                afjVar2.d = f8eVar;
                                bfjVar.z = afjVar2;
                            } else if (!Intrinsics.c(str, afjVar.b)) {
                                afjVar.b = str;
                                f8e f8eVar2 = afjVar.d;
                                if (f8eVar2 != null) {
                                    dfj dfjVar2 = bfjVar.p;
                                    sf8 sf8Var2 = bfjVar.q;
                                    int i5 = bfjVar.r;
                                    boolean z2 = bfjVar.s;
                                    int i6 = bfjVar.t;
                                    int i7 = bfjVar.u;
                                    f8eVar2.a = str;
                                    f8eVar2.b = dfjVar2;
                                    f8eVar2.c = sf8Var2;
                                    f8eVar2.d = i5;
                                    f8eVar2.e = z2;
                                    f8eVar2.f = i6;
                                    f8eVar2.g = i7;
                                    f8eVar2.s = (f8eVar2.s << 2) | 2;
                                    f8eVar2.c();
                                }
                            }
                            sea.p(bfjVar);
                            y6a.E(bfjVar);
                            n9e.E(bfjVar);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            afj afjVar3 = bfjVar.z;
                            if (afjVar3 == null) {
                                r2 = false;
                            } else {
                                afjVar3.c = booleanValue;
                                sea.p(bfjVar);
                                y6a.E(bfjVar);
                                n9e.E(bfjVar);
                            }
                            return Boolean.valueOf(r2);
                    }
                }
            };
            this.y = r0;
            zejVar2 = r0;
        }
        q80 q80Var = new q80(this.o);
        KProperty[] kPropertyArr = y3h.a;
        b4hVar.a(w3h.C, a.c(q80Var));
        afj afjVar = this.z;
        if (afjVar != null) {
            boolean z = afjVar.c;
            a4h a4hVar = w3h.E;
            KProperty[] kPropertyArr2 = y3h.a;
            KProperty kProperty = kPropertyArr2[17];
            b4hVar.a(a4hVar, Boolean.valueOf(z));
            q80 q80Var2 = new q80(afjVar.b);
            a4h a4hVar2 = w3h.D;
            KProperty kProperty2 = kPropertyArr2[16];
            b4hVar.a(a4hVar2, q80Var2);
        }
        final int i2 = 1;
        b4hVar.a(k3h.l, new m9(null, new Function1(this) { // from class: zej
            public final /* synthetic */ bfj b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0128  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x012f  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                kx4 kx4Var;
                aej aejVar;
                int i22 = i2;
                bfj bfjVar = this.b;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        f8e k1 = bfjVar.k1();
                        dfj dfjVar = bfjVar.p;
                        c23 c23Var = bfjVar.v;
                        dfj f = dfj.f(dfjVar, c23Var != null ? c23Var.a() : r13.i, 0L, null, null, 0L, null, 0, 0L, 16777214);
                        ema emaVar = k1.o;
                        aej aejVar2 = null;
                        if (emaVar != null && (kx4Var = k1.i) != null) {
                            q80 q80Var3 = new q80(k1.a);
                            if (k1.j != null && k1.n != null) {
                                long j = k1.p & (-8589934589L);
                                km5 km5Var = km5.a;
                                int i3 = k1.f;
                                boolean z2 = k1.e;
                                int i4 = k1.d;
                                sf8 sf8Var = k1.c;
                                aejVar = new aej(new zdj(q80Var3, f, km5Var, i3, z2, i4, kx4Var, emaVar, sf8Var, j), new eyc(new p03(q80Var3, f, km5Var, kx4Var, sf8Var), j, k1.f, k1.d), k1.l);
                                if (aejVar != null) {
                                    list.add(aejVar);
                                    aejVar2 = aejVar;
                                }
                                return Boolean.valueOf(aejVar2 != null);
                            }
                        }
                        aejVar = null;
                        if (aejVar != null) {
                        }
                        return Boolean.valueOf(aejVar2 != null);
                    case 1:
                        String str = ((q80) obj).b;
                        afj afjVar2 = bfjVar.z;
                        if (afjVar2 == null) {
                            afj afjVar22 = new afj(bfjVar.o, str);
                            f8e f8eVar = new f8e(str, bfjVar.p, bfjVar.q, bfjVar.r, bfjVar.s, bfjVar.t, bfjVar.u);
                            f8eVar.d(bfjVar.k1().i);
                            afjVar22.d = f8eVar;
                            bfjVar.z = afjVar22;
                        } else if (!Intrinsics.c(str, afjVar2.b)) {
                            afjVar2.b = str;
                            f8e f8eVar2 = afjVar2.d;
                            if (f8eVar2 != null) {
                                dfj dfjVar2 = bfjVar.p;
                                sf8 sf8Var2 = bfjVar.q;
                                int i5 = bfjVar.r;
                                boolean z22 = bfjVar.s;
                                int i6 = bfjVar.t;
                                int i7 = bfjVar.u;
                                f8eVar2.a = str;
                                f8eVar2.b = dfjVar2;
                                f8eVar2.c = sf8Var2;
                                f8eVar2.d = i5;
                                f8eVar2.e = z22;
                                f8eVar2.f = i6;
                                f8eVar2.g = i7;
                                f8eVar2.s = (f8eVar2.s << 2) | 2;
                                f8eVar2.c();
                            }
                        }
                        sea.p(bfjVar);
                        y6a.E(bfjVar);
                        n9e.E(bfjVar);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        afj afjVar3 = bfjVar.z;
                        if (afjVar3 == null) {
                            r2 = false;
                        } else {
                            afjVar3.c = booleanValue;
                            sea.p(bfjVar);
                            y6a.E(bfjVar);
                            n9e.E(bfjVar);
                        }
                        return Boolean.valueOf(r2);
                }
            }
        }));
        final int i3 = 2;
        b4hVar.a(k3h.m, new m9(null, new Function1(this) { // from class: zej
            public final /* synthetic */ bfj b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0128  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x012f  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                kx4 kx4Var;
                aej aejVar;
                int i22 = i3;
                bfj bfjVar = this.b;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        f8e k1 = bfjVar.k1();
                        dfj dfjVar = bfjVar.p;
                        c23 c23Var = bfjVar.v;
                        dfj f = dfj.f(dfjVar, c23Var != null ? c23Var.a() : r13.i, 0L, null, null, 0L, null, 0, 0L, 16777214);
                        ema emaVar = k1.o;
                        aej aejVar2 = null;
                        if (emaVar != null && (kx4Var = k1.i) != null) {
                            q80 q80Var3 = new q80(k1.a);
                            if (k1.j != null && k1.n != null) {
                                long j = k1.p & (-8589934589L);
                                km5 km5Var = km5.a;
                                int i32 = k1.f;
                                boolean z2 = k1.e;
                                int i4 = k1.d;
                                sf8 sf8Var = k1.c;
                                aejVar = new aej(new zdj(q80Var3, f, km5Var, i32, z2, i4, kx4Var, emaVar, sf8Var, j), new eyc(new p03(q80Var3, f, km5Var, kx4Var, sf8Var), j, k1.f, k1.d), k1.l);
                                if (aejVar != null) {
                                    list.add(aejVar);
                                    aejVar2 = aejVar;
                                }
                                return Boolean.valueOf(aejVar2 != null);
                            }
                        }
                        aejVar = null;
                        if (aejVar != null) {
                        }
                        return Boolean.valueOf(aejVar2 != null);
                    case 1:
                        String str = ((q80) obj).b;
                        afj afjVar2 = bfjVar.z;
                        if (afjVar2 == null) {
                            afj afjVar22 = new afj(bfjVar.o, str);
                            f8e f8eVar = new f8e(str, bfjVar.p, bfjVar.q, bfjVar.r, bfjVar.s, bfjVar.t, bfjVar.u);
                            f8eVar.d(bfjVar.k1().i);
                            afjVar22.d = f8eVar;
                            bfjVar.z = afjVar22;
                        } else if (!Intrinsics.c(str, afjVar2.b)) {
                            afjVar2.b = str;
                            f8e f8eVar2 = afjVar2.d;
                            if (f8eVar2 != null) {
                                dfj dfjVar2 = bfjVar.p;
                                sf8 sf8Var2 = bfjVar.q;
                                int i5 = bfjVar.r;
                                boolean z22 = bfjVar.s;
                                int i6 = bfjVar.t;
                                int i7 = bfjVar.u;
                                f8eVar2.a = str;
                                f8eVar2.b = dfjVar2;
                                f8eVar2.c = sf8Var2;
                                f8eVar2.d = i5;
                                f8eVar2.e = z22;
                                f8eVar2.f = i6;
                                f8eVar2.g = i7;
                                f8eVar2.s = (f8eVar2.s << 2) | 2;
                                f8eVar2.c();
                            }
                        }
                        sea.p(bfjVar);
                        y6a.E(bfjVar);
                        n9e.E(bfjVar);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        afj afjVar3 = bfjVar.z;
                        if (afjVar3 == null) {
                            r2 = false;
                        } else {
                            afjVar3.c = booleanValue;
                            sea.p(bfjVar);
                            y6a.E(bfjVar);
                            n9e.E(bfjVar);
                        }
                        return Boolean.valueOf(r2);
                }
            }
        }));
        b4hVar.a(k3h.n, new m9(null, new w1i(this, 20)));
        y3h.a(b4hVar, zejVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        if (r0 != null) goto L13;
     */
    @Override // defpackage.oma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        f8e k1;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            afj afjVar = this.z;
            if (afjVar != null) {
                if (!afjVar.c) {
                    afjVar = null;
                }
                if (afjVar != null) {
                    k1 = afjVar.d;
                }
            }
            k1 = k1();
            k1.d(m1cVar);
            boolean b = k1.b(j, m1cVar.getLayoutDirection());
            e8e e8eVar = k1.n;
            if (e8eVar != null) {
                e8eVar.a();
            }
            Unit unit = Unit.a;
            x10 x10Var = k1.j;
            x10Var.getClass();
            ydj ydjVar = x10Var.d;
            long j2 = k1.l;
            if (b) {
                c6o.a0(this, 2).l1();
                HashMap hashMap = this.w;
                if (hashMap == null) {
                    hashMap = new HashMap(2);
                    this.w = hashMap;
                }
                hashMap.put(mo.a, Integer.valueOf(Math.round(ydjVar.d(0))));
                hashMap.put(mo.b, Integer.valueOf(Math.round(ydjVar.d(ydjVar.g - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            qhe J = g1cVar.J(pco.E(i, i, i2, i2));
            HashMap hashMap2 = this.w;
            hashMap2.getClass();
            return m1cVar.v0(i, i2, hashMap2, new b3(J, 20));
        } finally {
            Trace.endSection();
        }
    }

    public final f8e k1() {
        dfj dfjVar = this.p;
        f8e f8eVar = this.x;
        if (f8eVar == null) {
            f8eVar = new f8e(this.o, dfjVar, this.q, this.r, this.s, this.t, this.u);
            this.x = f8eVar;
        }
        f8eVar.getClass();
        return f8eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r3 != null) goto L12;
     */
    @Override // defpackage.oma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(tkb tkbVar, g1c g1cVar, int i) {
        f8e k1;
        afj afjVar = this.z;
        if (afjVar != null) {
            if (!afjVar.c) {
                afjVar = null;
            }
            if (afjVar != null) {
                k1 = afjVar.d;
            }
        }
        k1 = k1();
        k1.d(tkbVar);
        return k1.a(i, tkbVar.getLayoutDirection());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != null) goto L15;
     */
    @Override // defpackage.ga5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(yma ymaVar) {
        f8e k1;
        if (!this.n) {
            return;
        }
        afj afjVar = this.z;
        if (afjVar != null) {
            if (!afjVar.c) {
                afjVar = null;
            }
            if (afjVar != null) {
                k1 = afjVar.d;
            }
        }
        k1 = k1();
        x10 x10Var = k1.j;
        if (x10Var == null) {
            u3a.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.x + ", textSubstitution=" + this.z + ')');
            pvd.x();
            return;
        }
        uj2 t = ymaVar.a.b.t();
        boolean z = k1.k;
        if (z) {
            long j = k1.l;
            t.o();
            t.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (j >> 32), (int) (j & 4294967295L), 1);
        }
        try {
            dfj dfjVar = this.p;
            pwh pwhVar = dfjVar.a;
            v8j v8jVar = pwhVar.m;
            if (v8jVar == null) {
                v8jVar = v8j.b;
            }
            v8j v8jVar2 = v8jVar;
            qah qahVar = pwhVar.n;
            if (qahVar == null) {
                qahVar = qah.d;
            }
            qah qahVar2 = qahVar;
            ja5 ja5Var = pwhVar.p;
            if (ja5Var == null) {
                ja5Var = e28.a;
            }
            ja5 ja5Var2 = ja5Var;
            n52 b = dfjVar.b();
            if (b != null) {
                x10Var.g(t, b, dfjVar.a.a.a(), qahVar2, v8jVar2, ja5Var2);
            } else {
                c23 c23Var = this.v;
                long a = c23Var != null ? c23Var.a() : r13.i;
                if (a == 16) {
                    a = dfjVar.c() != 16 ? dfjVar.c() : r13.b;
                }
                x10Var.f(t, a, qahVar2, v8jVar2, ja5Var2, 3);
            }
            if (z) {
                t.h();
            }
        } finally {
        }
    }
}
