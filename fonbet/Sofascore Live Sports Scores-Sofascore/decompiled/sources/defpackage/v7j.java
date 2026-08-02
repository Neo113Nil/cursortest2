package defpackage;

import android.os.Trace;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v7j extends wtc implements oma, ga5, p3h {
    public Function1 A;
    public Map B;
    public hyc C;
    public t7j D;
    public u7j E;
    public q80 o;
    public dfj p;
    public sf8 q;
    public Function1 r;
    public int s;
    public boolean t;
    public int u;
    public int v;
    public List w;
    public Function1 x;
    public c23 y;
    public es0 z;

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    @Override // defpackage.oma
    public final int b(tkb tkbVar, g1c g1cVar, int i) {
        return ufa.l(l1(tkbVar).e(tkbVar.getLayoutDirection()).c());
    }

    @Override // defpackage.oma
    public final int e(tkb tkbVar, g1c g1cVar, int i) {
        return l1(tkbVar).a(i, tkbVar.getLayoutDirection());
    }

    @Override // defpackage.oma
    public final int h(tkb tkbVar, g1c g1cVar, int i) {
        return ufa.l(l1(tkbVar).e(tkbVar.getLayoutDirection()).d());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [t7j] */
    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
        t7j t7jVar = this.D;
        t7j t7jVar2 = t7jVar;
        if (t7jVar == null) {
            final int i = 0;
            ?? r0 = new Function1(this) { // from class: t7j
                public final /* synthetic */ v7j b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean z;
                    int i2 = i;
                    aej aejVar = null;
                    v7j v7jVar = this.b;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            aej aejVar2 = v7jVar.k1().o;
                            if (aejVar2 != null) {
                                zdj zdjVar = aejVar2.a;
                                q80 q80Var = zdjVar.a;
                                dfj dfjVar = v7jVar.p;
                                c23 c23Var = v7jVar.y;
                                aej aejVar3 = new aej(new zdj(q80Var, dfj.f(dfjVar, c23Var != null ? c23Var.a() : r13.i, 0L, null, null, 0L, null, 0, 0L, 16777214), zdjVar.c, zdjVar.d, zdjVar.e, zdjVar.f, zdjVar.g, zdjVar.h, zdjVar.i, zdjVar.j), aejVar2.b, aejVar2.c);
                                list.add(aejVar3);
                                aejVar = aejVar3;
                            }
                            return Boolean.valueOf(aejVar != null);
                        case 1:
                            q80 q80Var2 = (q80) obj;
                            u7j u7jVar = v7jVar.E;
                            if (u7jVar == null) {
                                u7j u7jVar2 = new u7j(v7jVar.o, q80Var2);
                                hyc hycVar = new hyc(q80Var2, v7jVar.p, v7jVar.q, v7jVar.s, v7jVar.t, v7jVar.u, v7jVar.v, km5.a, v7jVar.z);
                                hycVar.d(v7jVar.k1().k);
                                u7jVar2.d = hycVar;
                                v7jVar.E = u7jVar2;
                            } else if (!Intrinsics.c(q80Var2, u7jVar.b)) {
                                u7jVar.b = q80Var2;
                                hyc hycVar2 = u7jVar.d;
                                if (hycVar2 != null) {
                                    dfj dfjVar2 = v7jVar.p;
                                    sf8 sf8Var = v7jVar.q;
                                    int i3 = v7jVar.s;
                                    boolean z2 = v7jVar.t;
                                    int i4 = v7jVar.u;
                                    int i5 = v7jVar.v;
                                    km5 km5Var = km5.a;
                                    es0 es0Var = v7jVar.z;
                                    hycVar2.a = q80Var2;
                                    hycVar2.f(dfjVar2);
                                    hycVar2.b = sf8Var;
                                    hycVar2.c = i3;
                                    hycVar2.d = z2;
                                    hycVar2.e = i4;
                                    hycVar2.f = i5;
                                    hycVar2.g = km5Var;
                                    hycVar2.h = es0Var;
                                    hycVar2.s = (hycVar2.s << 2) | 2;
                                    hycVar2.m = null;
                                    hycVar2.o = null;
                                    hycVar2.q = -1;
                                    hycVar2.p = -1;
                                    hycVar2.r = null;
                                }
                            }
                            sea.p(v7jVar);
                            y6a.E(v7jVar);
                            n9e.E(v7jVar);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            u7j u7jVar3 = v7jVar.E;
                            if (u7jVar3 == null) {
                                z = false;
                            } else {
                                Function1 function1 = v7jVar.A;
                                if (function1 != null) {
                                    function1.invoke(u7jVar3);
                                }
                                u7j u7jVar4 = v7jVar.E;
                                if (u7jVar4 != null) {
                                    u7jVar4.c = booleanValue;
                                }
                                sea.p(v7jVar);
                                y6a.E(v7jVar);
                                n9e.E(v7jVar);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.D = r0;
            t7jVar2 = r0;
        }
        q80 q80Var = this.o;
        KProperty[] kPropertyArr = y3h.a;
        b4hVar.a(w3h.C, a.c(q80Var));
        u7j u7jVar = this.E;
        if (u7jVar != null) {
            q80 q80Var2 = u7jVar.b;
            a4h a4hVar = w3h.D;
            KProperty[] kPropertyArr2 = y3h.a;
            KProperty kProperty = kPropertyArr2[16];
            b4hVar.a(a4hVar, q80Var2);
            boolean z = u7jVar.c;
            a4h a4hVar2 = w3h.E;
            KProperty kProperty2 = kPropertyArr2[17];
            b4hVar.a(a4hVar2, Boolean.valueOf(z));
        }
        final int i2 = 1;
        b4hVar.a(k3h.l, new m9(null, new Function1(this) { // from class: t7j
            public final /* synthetic */ v7j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z2;
                int i22 = i2;
                aej aejVar = null;
                v7j v7jVar = this.b;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        aej aejVar2 = v7jVar.k1().o;
                        if (aejVar2 != null) {
                            zdj zdjVar = aejVar2.a;
                            q80 q80Var3 = zdjVar.a;
                            dfj dfjVar = v7jVar.p;
                            c23 c23Var = v7jVar.y;
                            aej aejVar3 = new aej(new zdj(q80Var3, dfj.f(dfjVar, c23Var != null ? c23Var.a() : r13.i, 0L, null, null, 0L, null, 0, 0L, 16777214), zdjVar.c, zdjVar.d, zdjVar.e, zdjVar.f, zdjVar.g, zdjVar.h, zdjVar.i, zdjVar.j), aejVar2.b, aejVar2.c);
                            list.add(aejVar3);
                            aejVar = aejVar3;
                        }
                        return Boolean.valueOf(aejVar != null);
                    case 1:
                        q80 q80Var22 = (q80) obj;
                        u7j u7jVar2 = v7jVar.E;
                        if (u7jVar2 == null) {
                            u7j u7jVar22 = new u7j(v7jVar.o, q80Var22);
                            hyc hycVar = new hyc(q80Var22, v7jVar.p, v7jVar.q, v7jVar.s, v7jVar.t, v7jVar.u, v7jVar.v, km5.a, v7jVar.z);
                            hycVar.d(v7jVar.k1().k);
                            u7jVar22.d = hycVar;
                            v7jVar.E = u7jVar22;
                        } else if (!Intrinsics.c(q80Var22, u7jVar2.b)) {
                            u7jVar2.b = q80Var22;
                            hyc hycVar2 = u7jVar2.d;
                            if (hycVar2 != null) {
                                dfj dfjVar2 = v7jVar.p;
                                sf8 sf8Var = v7jVar.q;
                                int i3 = v7jVar.s;
                                boolean z22 = v7jVar.t;
                                int i4 = v7jVar.u;
                                int i5 = v7jVar.v;
                                km5 km5Var = km5.a;
                                es0 es0Var = v7jVar.z;
                                hycVar2.a = q80Var22;
                                hycVar2.f(dfjVar2);
                                hycVar2.b = sf8Var;
                                hycVar2.c = i3;
                                hycVar2.d = z22;
                                hycVar2.e = i4;
                                hycVar2.f = i5;
                                hycVar2.g = km5Var;
                                hycVar2.h = es0Var;
                                hycVar2.s = (hycVar2.s << 2) | 2;
                                hycVar2.m = null;
                                hycVar2.o = null;
                                hycVar2.q = -1;
                                hycVar2.p = -1;
                                hycVar2.r = null;
                            }
                        }
                        sea.p(v7jVar);
                        y6a.E(v7jVar);
                        n9e.E(v7jVar);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        u7j u7jVar3 = v7jVar.E;
                        if (u7jVar3 == null) {
                            z2 = false;
                        } else {
                            Function1 function1 = v7jVar.A;
                            if (function1 != null) {
                                function1.invoke(u7jVar3);
                            }
                            u7j u7jVar4 = v7jVar.E;
                            if (u7jVar4 != null) {
                                u7jVar4.c = booleanValue;
                            }
                            sea.p(v7jVar);
                            y6a.E(v7jVar);
                            n9e.E(v7jVar);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        b4hVar.a(k3h.m, new m9(null, new Function1(this) { // from class: t7j
            public final /* synthetic */ v7j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z2;
                int i22 = i3;
                aej aejVar = null;
                v7j v7jVar = this.b;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        aej aejVar2 = v7jVar.k1().o;
                        if (aejVar2 != null) {
                            zdj zdjVar = aejVar2.a;
                            q80 q80Var3 = zdjVar.a;
                            dfj dfjVar = v7jVar.p;
                            c23 c23Var = v7jVar.y;
                            aej aejVar3 = new aej(new zdj(q80Var3, dfj.f(dfjVar, c23Var != null ? c23Var.a() : r13.i, 0L, null, null, 0L, null, 0, 0L, 16777214), zdjVar.c, zdjVar.d, zdjVar.e, zdjVar.f, zdjVar.g, zdjVar.h, zdjVar.i, zdjVar.j), aejVar2.b, aejVar2.c);
                            list.add(aejVar3);
                            aejVar = aejVar3;
                        }
                        return Boolean.valueOf(aejVar != null);
                    case 1:
                        q80 q80Var22 = (q80) obj;
                        u7j u7jVar2 = v7jVar.E;
                        if (u7jVar2 == null) {
                            u7j u7jVar22 = new u7j(v7jVar.o, q80Var22);
                            hyc hycVar = new hyc(q80Var22, v7jVar.p, v7jVar.q, v7jVar.s, v7jVar.t, v7jVar.u, v7jVar.v, km5.a, v7jVar.z);
                            hycVar.d(v7jVar.k1().k);
                            u7jVar22.d = hycVar;
                            v7jVar.E = u7jVar22;
                        } else if (!Intrinsics.c(q80Var22, u7jVar2.b)) {
                            u7jVar2.b = q80Var22;
                            hyc hycVar2 = u7jVar2.d;
                            if (hycVar2 != null) {
                                dfj dfjVar2 = v7jVar.p;
                                sf8 sf8Var = v7jVar.q;
                                int i32 = v7jVar.s;
                                boolean z22 = v7jVar.t;
                                int i4 = v7jVar.u;
                                int i5 = v7jVar.v;
                                km5 km5Var = km5.a;
                                es0 es0Var = v7jVar.z;
                                hycVar2.a = q80Var22;
                                hycVar2.f(dfjVar2);
                                hycVar2.b = sf8Var;
                                hycVar2.c = i32;
                                hycVar2.d = z22;
                                hycVar2.e = i4;
                                hycVar2.f = i5;
                                hycVar2.g = km5Var;
                                hycVar2.h = es0Var;
                                hycVar2.s = (hycVar2.s << 2) | 2;
                                hycVar2.m = null;
                                hycVar2.o = null;
                                hycVar2.q = -1;
                                hycVar2.p = -1;
                                hycVar2.r = null;
                            }
                        }
                        sea.p(v7jVar);
                        y6a.E(v7jVar);
                        n9e.E(v7jVar);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        u7j u7jVar3 = v7jVar.E;
                        if (u7jVar3 == null) {
                            z2 = false;
                        } else {
                            Function1 function1 = v7jVar.A;
                            if (function1 != null) {
                                function1.invoke(u7jVar3);
                            }
                            u7j u7jVar4 = v7jVar.E;
                            if (u7jVar4 != null) {
                                u7jVar4.c = booleanValue;
                            }
                            sea.p(v7jVar);
                            y6a.E(v7jVar);
                            n9e.E(v7jVar);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        b4hVar.a(k3h.n, new m9(null, new w1i(this, 15)));
        y3h.a(b4hVar, t7jVar2);
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            hyc l1 = l1(m1cVar);
            boolean c = l1.c(j, m1cVar.getLayoutDirection());
            aej aejVar = l1.o;
            if (aejVar == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + l1);
            }
            long j2 = aejVar.c;
            aejVar.b.a.a();
            if (c) {
                c6o.a0(this, 2).l1();
                Function1 function1 = this.r;
                if (function1 != null) {
                    function1.invoke(aejVar);
                }
                Map map = this.B;
                if (map == null) {
                    map = new LinkedHashMap(2);
                }
                map.put(mo.a, Integer.valueOf(Math.round(aejVar.d)));
                map.put(mo.b, Integer.valueOf(Math.round(aejVar.e)));
                this.B = map;
            }
            Function1 function12 = this.x;
            if (function12 != null) {
                function12.invoke(aejVar.f);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            qhe J = g1cVar.J(pco.E(i, i, i2, i2));
            Map map2 = this.B;
            map2.getClass();
            return m1cVar.v0(i, i2, map2, new b3(J, 16));
        } finally {
            Trace.endSection();
        }
    }

    public final hyc k1() {
        hyc hycVar = this.C;
        if (hycVar == null) {
            hyc hycVar2 = new hyc(this.o, this.p, this.q, this.s, this.t, this.u, this.v, this.w, this.z);
            this.C = hycVar2;
            hycVar = hycVar2;
        }
        hycVar.getClass();
        return hycVar;
    }

    public final hyc l1(kx4 kx4Var) {
        hyc hycVar;
        u7j u7jVar = this.E;
        if (u7jVar != null && u7jVar.c && (hycVar = u7jVar.d) != null) {
            hycVar.d(kx4Var);
            return hycVar;
        }
        hyc k1 = k1();
        k1.d(kx4Var);
        return k1;
    }

    @Override // defpackage.oma
    public final int m(tkb tkbVar, g1c g1cVar, int i) {
        return l1(tkbVar).a(i, tkbVar.getLayoutDirection());
    }

    @Override // defpackage.ga5
    public final void o(yma ymaVar) {
        List list;
        if (!this.n) {
            return;
        }
        uj2 t = ymaVar.a.b.t();
        hyc l1 = l1(ymaVar);
        aej aejVar = l1.o;
        if (aejVar == null) {
            yhk.r(l1, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
            return;
        }
        eyc eycVar = aejVar.b;
        boolean z = aejVar.d() && this.s != 3;
        if (z) {
            long j = aejVar.c;
            oqf r = jca.r(0L, (Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L));
            t.o();
            uj2.t(t, r);
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
                rfo.z(eycVar, t, b, this.p.a.a.a(), qahVar2, v8jVar2, ja5Var2);
            } else {
                c23 c23Var = this.y;
                long a = c23Var != null ? c23Var.a() : r13.i;
                if (a == 16) {
                    a = this.p.c() != 16 ? this.p.c() : r13.b;
                }
                eyc.j(eycVar, t, a, qahVar2, v8jVar2, ja5Var2, 32);
            }
            if (z) {
                t.h();
            }
            u7j u7jVar = this.E;
            if (((u7jVar == null || !u7jVar.c) ? oea.n(this.o) : false) || !((list = this.w) == null || list.isEmpty())) {
                ymaVar.a();
            }
        } finally {
        }
    }
}
