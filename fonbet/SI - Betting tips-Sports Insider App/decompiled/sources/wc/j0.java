package wc;

import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 extends d0 {

    /* renamed from: e, reason: collision with root package name */
    public final gf.t f25122e = gf.k.b(new pd.v(25));

    /* renamed from: f, reason: collision with root package name */
    public final uc.c f25123f = new uc.c();

    /* renamed from: g, reason: collision with root package name */
    public final hd.i f25124g = new hd.i();

    /* renamed from: h, reason: collision with root package name */
    public final gf.t f25125h = gf.k.b(new pd.v(26));

    /* renamed from: i, reason: collision with root package name */
    public final rc.a f25126i = new rc.a();

    public final Object n(e0 e0Var) {
        this.f25123f.getClass();
        int i5 = 1;
        uc.c.f24220a--;
        if (uc.c.f24220a < 0) {
            uc.c.f24220a = 0;
        }
        la.a aVar = (la.a) y3.m(la.a.class, null, 6);
        int i10 = uc.c.f24220a;
        aVar.getClass();
        bb.b bVar = new bb.b();
        lg.e eVar = eg.m0.f9201a;
        Object A = eg.c0.A(lg.d.f20063c, new bb.a(bVar, i10, null, i5), e0Var);
        lf.a aVar2 = lf.a.f20034a;
        if (A != aVar2) {
            A = Unit.f19194a;
        }
        return A == aVar2 ? A : Unit.f19194a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(6:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:18|19))(2:20|21))(3:33|34|(2:36|31))|22|(3:29|(5:32|13|14|15|16)|31)(3:28|15|16)))|43|6|7|(0)(0)|22|(1:24)|29|(0)|31) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002f, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        if ((r8 instanceof java.util.concurrent.CancellationException) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        return new java.lang.Integer(400);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "ex");
        r9 = com.sports.insider.MyApp.f6830c;
        r1 = eg.m0.f9201a;
        eg.c0.t(r9, lg.d.f20063c, null, new q4.r(r8, r3, 18), 2);
        rc.b.a(r8);
        r9 = 400;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(int i5, mf.c cVar) {
        e0 e0Var;
        lf.a aVar;
        int i10;
        int i11;
        int i12;
        int i13;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i14 = e0Var.f25085e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e0Var.f25085e = i14 - Integer.MIN_VALUE;
                Object obj = e0Var.f25083c;
                aVar = lf.a.f20034a;
                i10 = e0Var.f25085e;
                Continuation continuation = null;
                if (i10 != 0) {
                    h8.b.B(obj);
                    la.g0 g0Var = (la.g0) y3.m(la.g0.class, null, 6);
                    e0Var.f25081a = i5;
                    e0Var.f25085e = 1;
                    g0Var.getClass();
                    obj = eg.c0.A(eg.m0.f9201a, new bd.i(i5, 8, g0Var, continuation), e0Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i13 = e0Var.f25082b;
                        i12 = e0Var.f25081a;
                        h8.b.B(obj);
                        rc.g gVar = (rc.g) this.f25122e.getValue();
                        gVar.getClass();
                        eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new rc.e(2, gVar, i12, (Continuation) null), 2);
                        i11 = i13;
                        return new Integer(i11);
                    }
                    i5 = e0Var.f25081a;
                    h8.b.B(obj);
                }
                i11 = ((Number) obj).intValue();
                if (i11 == 200 && i11 != 201 && i11 != 204) {
                    rc.b.b(i11);
                    return new Integer(i11);
                }
                e0Var.f25081a = i5;
                e0Var.f25082b = i11;
                e0Var.f25085e = 2;
                if (n(e0Var) != aVar) {
                    i12 = i5;
                    i13 = i11;
                    rc.g gVar2 = (rc.g) this.f25122e.getValue();
                    gVar2.getClass();
                    eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new rc.e(2, gVar2, i12, (Continuation) null), 2);
                    i11 = i13;
                    return new Integer(i11);
                }
                return aVar;
            }
        }
        e0Var = new e0(this, cVar);
        Object obj2 = e0Var.f25083c;
        aVar = lf.a.f20034a;
        i10 = e0Var.f25085e;
        Continuation continuation2 = null;
        if (i10 != 0) {
        }
        i11 = ((Number) obj2).intValue();
        if (i11 == 200) {
        }
        e0Var.f25081a = i5;
        e0Var.f25082b = i11;
        e0Var.f25085e = 2;
        if (n(e0Var) != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(7:5|6|7|8|(1:(1:(5:12|13|14|15|16)(2:18|19))(3:20|21|22))(2:40|(2:42|43)(1:(2:45|46)(10:47|(1:73)|(1:52)(1:72)|53|54|55|56|57|58|(2:60|37)(1:61))))|23|(5:(4:34|35|(4:38|14|15|16)|37)|39|35|(0)|37)(3:29|15|16)))|76|6|7|8|(0)(0)|23|(1:25)|(5:31|34|35|(0)|37)|39|35|(0)|37) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x003e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x003f, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [eg.a0, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5, types: [ic.a, ic.h0, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(ic.h0 h0Var, ic.a aVar, int i5, mf.c cVar) {
        f0 f0Var;
        f0 f0Var2;
        lf.a aVar2;
        int i10;
        ?? r15;
        int i11;
        String str;
        String str2;
        ic.a aVar3;
        int i12;
        ?? r152;
        int intValue;
        String str3;
        String str4;
        s7.s sVar;
        int i13;
        String str5;
        ic.h0 h0Var2 = h0Var;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f25095g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f25095g = i14 - Integer.MIN_VALUE;
                f0Var2 = f0Var;
                Object obj = f0Var2.f25093e;
                aVar2 = lf.a.f20034a;
                i10 = f0Var2.f25095g;
                if (i10 != 0) {
                    h8.b.B(obj);
                    if (i5 <= 0) {
                        return new Integer(400);
                    }
                    if (h0Var2 == null) {
                        return new Integer(400);
                    }
                    la.g0 g0Var = (la.g0) y3.m(la.g0.class, null, 6);
                    String str6 = h0Var2.f11123c;
                    if (aVar == null || (str = aVar.f11063k) == null) {
                        str = "";
                    }
                    long t3 = aVar != null ? t(aVar) : 0L;
                    try {
                        String str7 = h0Var2.f11122b;
                        String str8 = str;
                        long j = t3;
                        String str9 = h0Var2.f11124d;
                        f0Var2.f25089a = h0Var2;
                        f0Var2.f25090b = aVar;
                        f0Var2.f25091c = i5;
                        f0Var2.f25095g = 1;
                        g0Var.getClass();
                        str2 = "";
                        Object obj2 = null;
                        try {
                            obj = eg.c0.A(eg.m0.f9201a, new la.e0(i5, j, str6, str7, str8, str9, null, g0Var), f0Var2);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                            aVar3 = aVar;
                            i12 = i5;
                            r152 = obj2;
                        } catch (Exception e7) {
                            ex = e7;
                            r15 = obj2;
                            if (ex instanceof CancellationException) {
                                return new Integer(400);
                            }
                            Intrinsics.checkNotNullParameter(ex, "ex");
                            jg.d dVar = MyApp.f6830c;
                            lg.e eVar = eg.m0.f9201a;
                            eg.c0.t(dVar, lg.d.f20063c, r15, new q4.r(ex, r15, 18), 2);
                            rc.b.a(ex);
                            i11 = 400;
                            return new Integer(i11);
                        }
                    } catch (Exception e9) {
                        ex = e9;
                        r15 = 0;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i13 = f0Var2.f25092d;
                        h8.b.B(obj);
                        i11 = i13;
                        return new Integer(i11);
                    }
                    int i15 = f0Var2.f25091c;
                    aVar3 = f0Var2.f25090b;
                    ic.h0 h0Var3 = f0Var2.f25089a;
                    h8.b.B(obj);
                    i12 = i15;
                    h0Var2 = h0Var3;
                    str2 = "";
                    r152 = 0;
                }
                intValue = ((Number) obj).intValue();
                if (intValue == 200 && intValue != 201 && intValue != 204) {
                    rc.b.b(intValue);
                    i11 = intValue;
                    return new Integer(i11);
                }
                if (aVar3 != null && (str5 = aVar3.f11063k) != null) {
                    str3 = str5;
                    ((rc.g) this.f25122e.getValue()).h(i12, h0Var2.f11124d, h0Var2.f11122b, h0Var2.f11123c, h0Var2.f11121a, str3);
                    str4 = h0Var2.f11124d;
                    f0Var2.f25089a = r152;
                    f0Var2.f25090b = r152;
                    f0Var2.f25091c = i12;
                    f0Var2.f25092d = intValue;
                    f0Var2.f25095g = 2;
                    sVar = new s7.s(23);
                    lg.e eVar2 = eg.m0.f9201a;
                    if (eg.c0.A(lg.d.f20063c, new td.b(str4, sVar, r152, 7), f0Var2) != aVar2) {
                        i13 = intValue;
                        i11 = i13;
                        return new Integer(i11);
                    }
                    return aVar2;
                }
                str3 = str2;
                ((rc.g) this.f25122e.getValue()).h(i12, h0Var2.f11124d, h0Var2.f11122b, h0Var2.f11123c, h0Var2.f11121a, str3);
                str4 = h0Var2.f11124d;
                f0Var2.f25089a = r152;
                f0Var2.f25090b = r152;
                f0Var2.f25091c = i12;
                f0Var2.f25092d = intValue;
                f0Var2.f25095g = 2;
                sVar = new s7.s(23);
                lg.e eVar22 = eg.m0.f9201a;
                if (eg.c0.A(lg.d.f20063c, new td.b(str4, sVar, r152, 7), f0Var2) != aVar2) {
                }
                return aVar2;
            }
        }
        f0Var = new f0(this, cVar);
        f0Var2 = f0Var;
        Object obj3 = f0Var2.f25093e;
        aVar2 = lf.a.f20034a;
        i10 = f0Var2.f25095g;
        if (i10 != 0) {
        }
        intValue = ((Number) obj3).intValue();
        if (intValue == 200) {
        }
        if (aVar3 != null) {
            str3 = str5;
            ((rc.g) this.f25122e.getValue()).h(i12, h0Var2.f11124d, h0Var2.f11122b, h0Var2.f11123c, h0Var2.f11121a, str3);
            str4 = h0Var2.f11124d;
            f0Var2.f25089a = r152;
            f0Var2.f25090b = r152;
            f0Var2.f25091c = i12;
            f0Var2.f25092d = intValue;
            f0Var2.f25095g = 2;
            sVar = new s7.s(23);
            lg.e eVar222 = eg.m0.f9201a;
            if (eg.c0.A(lg.d.f20063c, new td.b(str4, sVar, r152, 7), f0Var2) != aVar2) {
            }
            return aVar2;
        }
        str3 = str2;
        ((rc.g) this.f25122e.getValue()).h(i12, h0Var2.f11124d, h0Var2.f11122b, h0Var2.f11123c, h0Var2.f11121a, str3);
        str4 = h0Var2.f11124d;
        f0Var2.f25089a = r152;
        f0Var2.f25090b = r152;
        f0Var2.f25091c = i12;
        f0Var2.f25092d = intValue;
        f0Var2.f25095g = 2;
        sVar = new s7.s(23);
        lg.e eVar2222 = eg.m0.f9201a;
        if (eg.c0.A(lg.d.f20063c, new td.b(str4, sVar, r152, 7), f0Var2) != aVar2) {
        }
        return aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(mf.c cVar) {
        g0 g0Var;
        int i5;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i10 = g0Var.f25101c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g0Var.f25101c = i10 - Integer.MIN_VALUE;
                Object obj = g0Var.f25099a;
                lf.a aVar = lf.a.f20034a;
                i5 = g0Var.f25101c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    g0Var.f25101c = 1;
                    this.f25124g.f10546b.getClass();
                    md.o.c().getClass();
                    obj = za.h.a("rc_premium_min_count_week", g0Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return new Integer((int) ((Number) obj).longValue());
            }
        }
        g0Var = new g0(this, cVar);
        Object obj2 = g0Var.f25099a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = g0Var.f25101c;
        if (i5 != 0) {
        }
        return new Integer((int) ((Number) obj2).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(mf.c cVar) {
        h0 h0Var;
        int i5;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i10 = h0Var.f25107c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h0Var.f25107c = i10 - Integer.MIN_VALUE;
                Object obj = h0Var.f25105a;
                lf.a aVar = lf.a.f20034a;
                i5 = h0Var.f25107c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    h0Var.f25107c = 1;
                    this.f25124g.f10546b.getClass();
                    md.o.c().getClass();
                    obj = za.h.b().c("min_odds_premium", h0Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return String.valueOf(((Number) obj).doubleValue());
            }
        }
        h0Var = new h0(this, cVar);
        Object obj2 = h0Var.f25105a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = h0Var.f25107c;
        if (i5 != 0) {
        }
        return String.valueOf(((Number) obj2).doubleValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(mf.c cVar) {
        i0 i0Var;
        int i5;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i10 = i0Var.f25118c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                i0Var.f25118c = i10 - Integer.MIN_VALUE;
                Object obj = i0Var.f25116a;
                lf.a aVar = lf.a.f20034a;
                i5 = i0Var.f25118c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    i0Var.f25118c = 1;
                    this.f25124g.f10546b.getClass();
                    md.o.c().getClass();
                    obj = za.h.a("rc_premium_passage", i0Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return new Integer((int) ((Number) obj).longValue());
            }
        }
        i0Var = new i0(this, cVar);
        Object obj2 = i0Var.f25116a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = i0Var.f25118c;
        if (i5 != 0) {
        }
        return new Integer((int) ((Number) obj2).longValue());
    }

    public final long t(ic.a productInfo) {
        Intrinsics.checkNotNullParameter(productInfo, "productInfo");
        if (productInfo.q != 0) {
            return productInfo.f11057d;
        }
        if (productInfo.f11067o != null) {
            long j = productInfo.f11058e;
            if (j != 0) {
                return j;
            }
        }
        return productInfo.f11057d;
    }
}
