package wc;

import android.app.Activity;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import j$.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: d, reason: collision with root package name */
    public static long f25073d;

    /* renamed from: a, reason: collision with root package name */
    public final rc.r f25074a = new rc.r();

    /* renamed from: b, reason: collision with root package name */
    public final s7.u f25075b = new s7.u(20);

    /* renamed from: c, reason: collision with root package name */
    public final s7.u f25076c = new s7.u(21);

    public static pc.u b() {
        return (pc.u) y3.m(pc.u.class, null, 6);
    }

    public static void i(d0 d0Var) {
        d0Var.getClass();
        long epochSecond = Instant.now().getEpochSecond();
        if (f25073d + 60 < epochSecond) {
            f25073d = epochSecond;
            d0Var.f(0L);
            jg.d dVar = MyApp.f6830c;
            lg.e eVar = eg.m0.f9201a;
            lg.d dVar2 = lg.d.f20063c;
            eg.y yVar = new eg.y("PayCheckOwnedSubs");
            dVar2.getClass();
            eg.c0.t(dVar, kotlin.coroutines.e.c(dVar2, yVar), null, new w(d0Var, null, 3), 2);
        }
    }

    public static Object k(int i5, mf.c cVar) {
        if (i5 <= 0) {
            return Unit.f19194a;
        }
        m3.f fVar = new m3.f(20);
        lg.e eVar = eg.m0.f9201a;
        Object A = eg.c0.A(lg.d.f20063c, new androidx.lifecycle.b(fVar, i5, (Continuation) null), cVar);
        return A == lf.a.f20034a ? A : Unit.f19194a;
    }

    public static Object m(ic.h0 h0Var, Continuation continuation) {
        if (h0Var == null) {
            return new Integer(400);
        }
        lg.e eVar = eg.m0.f9201a;
        return eg.c0.A(lg.d.f20063c, new h(h0Var, null, 2), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mf.c cVar) {
        x xVar;
        Object obj;
        int i5;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i10 = xVar.f25216c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xVar.f25216c = i10 - Integer.MIN_VALUE;
                obj = xVar.f25214a;
                Object obj2 = lf.a.f20034a;
                i5 = xVar.f25216c;
                boolean z5 = true;
                if (i5 != 0) {
                    h8.b.B(obj);
                    xVar.f25216c = 1;
                    obj = c(xVar);
                } else if (i5 == 1) {
                    h8.b.B(obj);
                } else {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    xVar.f25216c = 2;
                    obj = this.f25074a.b(xVar);
                }
                z5 = false;
                return Boolean.valueOf(z5);
            }
        }
        xVar = new x(this, cVar);
        obj = xVar.f25214a;
        Object obj22 = lf.a.f20034a;
        i5 = xVar.f25216c;
        boolean z52 = true;
        if (i5 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        z52 = false;
        return Boolean.valueOf(z52);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(mf.c cVar) {
        y yVar;
        int i5;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i10 = yVar.f25225c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yVar.f25225c = i10 - Integer.MIN_VALUE;
                Object obj = yVar.f25223a;
                lf.a aVar = lf.a.f20034a;
                i5 = yVar.f25225c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    yVar.f25225c = 1;
                    obj = this.f25074a.a(yVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                int intValue = ((Number) obj).intValue();
                return Boolean.valueOf(1 > intValue && intValue < 3);
            }
        }
        yVar = new y(this, cVar);
        Object obj2 = yVar.f25223a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = yVar.f25225c;
        if (i5 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        return Boolean.valueOf(1 > intValue2 && intValue2 < 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(mf.c cVar) {
        z zVar;
        Object obj;
        int i5;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i10 = zVar.f25233c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zVar.f25233c = i10 - Integer.MIN_VALUE;
                obj = zVar.f25231a;
                Object obj2 = lf.a.f20034a;
                i5 = zVar.f25233c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    zVar.f25233c = 1;
                    obj = c(zVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return obj;
                    }
                    h8.b.B(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                zVar.f25233c = 2;
                Object b10 = this.f25074a.b(zVar);
                return b10 == obj2 ? obj2 : b10;
            }
        }
        zVar = new z(this, cVar);
        obj = zVar.f25231a;
        Object obj22 = lf.a.f20034a;
        i5 = zVar.f25233c;
        if (i5 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final void e(Activity activity, String productId, int i5, boolean z5, String str, String str2) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(productId, "productId");
        jg.d dVar = MyApp.f6830c;
        lg.e eVar = eg.m0.f9201a;
        eg.y yVar = new eg.y("LaunchBilling");
        eVar.getClass();
        eg.c0.t(dVar, kotlin.coroutines.e.c(eVar, yVar), null, new a0(this, activity, productId, z5, i5, str, str2, null), 2);
    }

    public final void f(long j) {
        jg.d dVar = MyApp.f6830c;
        lg.e eVar = eg.m0.f9201a;
        eg.y yVar = new eg.y("UpdateProductsInfo");
        eVar.getClass();
        eg.c0.t(dVar, kotlin.coroutines.e.c(eVar, yVar), null, new cd.p(j, this, (Continuation) null, 4), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(mf.c cVar) {
        b0 b0Var;
        int i5;
        String str;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i10 = b0Var.f25066c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                b0Var.f25066c = i10 - Integer.MIN_VALUE;
                Object obj = b0Var.f25064a;
                lf.a aVar = lf.a.f20034a;
                i5 = b0Var.f25066c;
                int i11 = 1;
                if (i5 != 0) {
                    h8.b.B(obj);
                    str = b().f21717s;
                    if (str == null) {
                        b0Var.f25066c = 1;
                        lg.e eVar = eg.m0.f9201a;
                        obj = eg.c0.A(lg.d.f20063c, new w(this, null, i11), b0Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    b().u(str);
                    return Unit.f19194a;
                }
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                str = (String) obj;
                if (str == null) {
                    return Unit.f19194a;
                }
                b().u(str);
                return Unit.f19194a;
            }
        }
        b0Var = new b0(this, cVar);
        Object obj2 = b0Var.f25064a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = b0Var.f25066c;
        int i112 = 1;
        if (i5 != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
        b().u(str);
        return Unit.f19194a;
    }

    public final Object j(String str, mf.i iVar) {
        lg.e eVar = eg.m0.f9201a;
        return eg.c0.A(lg.d.f20063c, new td.b(this, str, null, 6), iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r6 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(mf.c cVar) {
        c0 c0Var;
        int i5;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i10 = c0Var.f25069c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0Var.f25069c = i10 - Integer.MIN_VALUE;
                Object obj = c0Var.f25067a;
                Object obj2 = lf.a.f20034a;
                i5 = c0Var.f25069c;
                int i11 = 2;
                if (i5 != 0) {
                    h8.b.B(obj);
                    ic.h0 h0Var = (ic.h0) b().q.getValue();
                    if (h0Var == null) {
                        c0Var.f25069c = 1;
                        lg.e eVar = eg.m0.f9201a;
                        Object A = eg.c0.A(lg.d.f20063c, new w(this, null, i11), c0Var);
                        if (A != obj2) {
                            A = Unit.f19194a;
                        }
                    } else {
                        c0Var.f25069c = 2;
                        Object m6 = m(h0Var, c0Var);
                        if (m6 != obj2) {
                            return m6;
                        }
                    }
                    return obj2;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                return new Integer(400);
            }
        }
        c0Var = new c0(this, cVar);
        Object obj3 = c0Var.f25067a;
        Object obj22 = lf.a.f20034a;
        i5 = c0Var.f25069c;
        int i112 = 2;
        if (i5 != 0) {
        }
        return new Integer(400);
    }
}
