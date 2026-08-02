package la;

import io.sentry.b5;
import io.sentry.d4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j1 {
    public static Object b(int i5, int i10, String str, mf.i iVar) {
        fb.b bVar = new fb.b();
        lg.e eVar = eg.m0.f9201a;
        Object A = eg.c0.A(lg.d.f20063c, new bd.i(bVar, i5, i10, str, null, 19), iVar);
        lf.a aVar = lf.a.f20034a;
        if (A != aVar) {
            A = Unit.f19194a;
        }
        return A == aVar ? A : Unit.f19194a;
    }

    public static Object f(int i5, int i10, mf.c cVar) {
        fb.b bVar = new fb.b();
        lg.e eVar = eg.m0.f9201a;
        return eg.c0.A(lg.d.f20063c, new cd.k(bVar, i5, i10, null, 15), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mf.c cVar) {
        f1 f1Var;
        int i5;
        String str;
        if (cVar instanceof f1) {
            f1Var = (f1) cVar;
            int i10 = f1Var.f19473c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                f1Var.f19473c = i10 - Integer.MIN_VALUE;
                Object obj = f1Var.f19471a;
                lf.a aVar = lf.a.f20034a;
                i5 = f1Var.f19473c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    fb.b bVar = new fb.b();
                    f1Var.f19473c = 1;
                    obj = bVar.C0(f1Var);
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
                str = (String) obj;
                if (str != null) {
                    throw new IllegalArgumentException("Token access is null");
                }
                ya.e eVar = new ya.e();
                String str2 = gc.d.f9945a;
                String c2 = d2.i.c();
                String d10 = d2.i.d();
                f1Var.f19473c = 2;
                Object q02 = eVar.q0(str, c2, d10, f1Var);
                return q02 == aVar ? aVar : q02;
            }
        }
        f1Var = new f1(this, cVar);
        Object obj2 = f1Var.f19471a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = f1Var.f19473c;
        if (i5 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(mf.c cVar) {
        g1 g1Var;
        int i5;
        String str;
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i10 = g1Var.f19476c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g1Var.f19476c = i10 - Integer.MIN_VALUE;
                Object obj = g1Var.f19474a;
                lf.a aVar = lf.a.f20034a;
                i5 = g1Var.f19476c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    fb.b bVar = new fb.b();
                    g1Var.f19476c = 1;
                    obj = bVar.C0(g1Var);
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
                str = (String) obj;
                if (str != null) {
                    throw new IllegalArgumentException("Token access is null");
                }
                ya.e eVar = new ya.e();
                String str2 = gc.d.f9945a;
                String c2 = d2.i.c();
                String d10 = d2.i.d();
                g1Var.f19476c = 2;
                Serializable r02 = eVar.r0(str, c2, d10, g1Var);
                return r02 == aVar ? aVar : r02;
            }
        }
        g1Var = new g1(this, cVar);
        Object obj2 = g1Var.f19474a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = g1Var.f19476c;
        if (i5 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0184, code lost:
    
        if (r14 == r0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0169, code lost:
    
        if (r14 == r0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0143, code lost:
    
        if (r14 != r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x009d, code lost:
    
        if (r14 == r0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x007b, code lost:
    
        if (r14 == r0) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(mf.c cVar) {
        h1 h1Var;
        h1 h1Var2;
        ka.b bVar;
        ka.b bVar2;
        ka.b bVar3;
        List list;
        int i5;
        Object A;
        if (cVar instanceof h1) {
            h1Var = (h1) cVar;
            int i10 = h1Var.f19486e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h1Var.f19486e = i10 - Integer.MIN_VALUE;
                h1Var2 = h1Var;
                Object obj = h1Var2.f19484c;
                lf.a aVar = lf.a.f20034a;
                int i11 = 2;
                int i12 = 6;
                int i13 = 1;
                int i14 = 0;
                Continuation continuation = null;
                switch (h1Var2.f19486e) {
                    case 0:
                        h8.b.B(obj);
                        fb.b bVar4 = new fb.b();
                        h1Var2.f19486e = 1;
                        obj = bVar4.C0(h1Var2);
                        break;
                    case 1:
                        h8.b.B(obj);
                        String str = (String) obj;
                        if (str != null) {
                            ya.e eVar = new ya.e();
                            String str2 = gc.d.f9945a;
                            String c2 = d2.i.c();
                            String d10 = d2.i.d();
                            h1Var2.f19486e = 2;
                            obj = eVar.s0(null, str, c2, d10, h1Var2);
                            break;
                        } else {
                            return Boolean.FALSE;
                        }
                    case 2:
                        h8.b.B(obj);
                        bVar = (ka.b) obj;
                        int i15 = bVar.f18956a;
                        if (i15 == 200) {
                            fb.b bVar5 = new fb.b();
                            ArrayList arrayList = bVar.f18959d;
                            h1Var2.f19482a = bVar;
                            h1Var2.f19486e = 3;
                            lg.e eVar2 = eg.m0.f9201a;
                            Object A2 = eg.c0.A(lg.d.f20063c, new qb.c(bVar5, arrayList, continuation, i13), h1Var2);
                            if (A2 != aVar) {
                                bVar2 = bVar;
                                obj = A2;
                                list = (List) obj;
                                if (list != null) {
                                    h1Var2.f19482a = bVar2;
                                    h1Var2.f19483b = 0;
                                    h1Var2.f19486e = 4;
                                    lg.e eVar3 = eg.m0.f9201a;
                                    if (eg.c0.A(lg.d.f20063c, new id.r(list, continuation, i12), h1Var2) != aVar) {
                                        i5 = 0;
                                        fb.b bVar6 = new fb.b();
                                        ArrayList arrayList2 = bVar2.f18959d;
                                        h1Var2.f19482a = bVar2;
                                        h1Var2.f19483b = i5;
                                        h1Var2.f19486e = 5;
                                        lg.e eVar4 = eg.m0.f9201a;
                                        obj = eg.c0.A(lg.d.f20063c, new qb.c(bVar6, arrayList2, continuation, i14), h1Var2);
                                        break;
                                    }
                                }
                                fb.b bVar7 = new fb.b();
                                ArrayList arrayList3 = bVar2.f18960e;
                                h1Var2.f19482a = bVar2;
                                h1Var2.f19486e = 6;
                                lg.e eVar5 = eg.m0.f9201a;
                                obj = eg.c0.A(lg.d.f20063c, new qb.c(bVar7, arrayList3, continuation, i13), h1Var2);
                                break;
                            }
                        } else {
                            if (i15 != 401) {
                                if (i15 != 502) {
                                    Intrinsics.checkNotNullExpressionValue(d4.a("get messages support " + bVar.f18961f, b5.INFO), "captureMessage(...)");
                                } else {
                                    Unit unit = Unit.f19194a;
                                }
                                return Boolean.valueOf(Intrinsics.areEqual(bVar.f18958c, Boolean.TRUE));
                            }
                            fb.b bVar8 = new fb.b();
                            h1Var2.f19482a = bVar;
                            h1Var2.f19486e = 9;
                            if (bVar8.A0(h1Var2) != aVar) {
                                bVar3 = bVar;
                                Unit unit2 = Unit.f19194a;
                                bVar = bVar3;
                                return Boolean.valueOf(Intrinsics.areEqual(bVar.f18958c, Boolean.TRUE));
                            }
                        }
                        return aVar;
                    case 3:
                        bVar2 = h1Var2.f19482a;
                        h8.b.B(obj);
                        list = (List) obj;
                        if (list != null) {
                        }
                        fb.b bVar72 = new fb.b();
                        ArrayList arrayList32 = bVar2.f18960e;
                        h1Var2.f19482a = bVar2;
                        h1Var2.f19486e = 6;
                        lg.e eVar52 = eg.m0.f9201a;
                        obj = eg.c0.A(lg.d.f20063c, new qb.c(bVar72, arrayList32, continuation, i13), h1Var2);
                        break;
                    case 4:
                        int i16 = h1Var2.f19483b;
                        ka.b bVar9 = h1Var2.f19482a;
                        h8.b.B(obj);
                        i5 = i16;
                        bVar2 = bVar9;
                        fb.b bVar62 = new fb.b();
                        ArrayList arrayList22 = bVar2.f18959d;
                        h1Var2.f19482a = bVar2;
                        h1Var2.f19483b = i5;
                        h1Var2.f19486e = 5;
                        lg.e eVar42 = eg.m0.f9201a;
                        obj = eg.c0.A(lg.d.f20063c, new qb.c(bVar62, arrayList22, continuation, i14), h1Var2);
                        break;
                    case 5:
                        bVar2 = h1Var2.f19482a;
                        h8.b.B(obj);
                        new Integer(((Number) obj).intValue());
                        fb.b bVar722 = new fb.b();
                        ArrayList arrayList322 = bVar2.f18960e;
                        h1Var2.f19482a = bVar2;
                        h1Var2.f19486e = 6;
                        lg.e eVar522 = eg.m0.f9201a;
                        obj = eg.c0.A(lg.d.f20063c, new qb.c(bVar722, arrayList322, continuation, i13), h1Var2);
                        break;
                    case 6:
                        bVar2 = h1Var2.f19482a;
                        h8.b.B(obj);
                        List list2 = (List) obj;
                        if (list2 != null) {
                            h1Var2.f19482a = bVar2;
                            h1Var2.f19483b = 0;
                            h1Var2.f19486e = 7;
                            lg.e eVar6 = eg.m0.f9201a;
                            obj = eg.c0.A(lg.d.f20063c, new id.r(list2, continuation, i12), h1Var2);
                            break;
                        }
                        fb.b bVar10 = new fb.b();
                        ?? r22 = bVar2.f18957b;
                        h1Var2.f19482a = bVar2;
                        h1Var2.f19486e = 8;
                        lg.e eVar7 = eg.m0.f9201a;
                        A = eg.c0.A(lg.d.f20063c, new qb.c(bVar10, r22, continuation, i11), h1Var2);
                        if (A != aVar) {
                            A = Unit.f19194a;
                        }
                        if (A != aVar) {
                            bVar3 = bVar2;
                            Unit unit3 = Unit.f19194a;
                            bVar = bVar3;
                            return Boolean.valueOf(Intrinsics.areEqual(bVar.f18958c, Boolean.TRUE));
                        }
                        return aVar;
                    case 7:
                        bVar2 = h1Var2.f19482a;
                        h8.b.B(obj);
                        fb.b bVar102 = new fb.b();
                        ?? r222 = bVar2.f18957b;
                        h1Var2.f19482a = bVar2;
                        h1Var2.f19486e = 8;
                        lg.e eVar72 = eg.m0.f9201a;
                        A = eg.c0.A(lg.d.f20063c, new qb.c(bVar102, r222, continuation, i11), h1Var2);
                        if (A != aVar) {
                        }
                        if (A != aVar) {
                        }
                        return aVar;
                    case 8:
                        bVar3 = h1Var2.f19482a;
                        h8.b.B(obj);
                        Unit unit32 = Unit.f19194a;
                        bVar = bVar3;
                        return Boolean.valueOf(Intrinsics.areEqual(bVar.f18958c, Boolean.TRUE));
                    case 9:
                        bVar3 = h1Var2.f19482a;
                        h8.b.B(obj);
                        Unit unit22 = Unit.f19194a;
                        bVar = bVar3;
                        return Boolean.valueOf(Intrinsics.areEqual(bVar.f18958c, Boolean.TRUE));
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        h1Var = new h1(this, cVar);
        h1Var2 = h1Var;
        Object obj2 = h1Var2.f19484c;
        lf.a aVar2 = lf.a.f20034a;
        int i112 = 2;
        int i122 = 6;
        int i132 = 1;
        int i142 = 0;
        Continuation continuation2 = null;
        switch (h1Var2.f19486e) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, gh.m0 m0Var, Boolean bool, String str3, int i5, mf.c cVar) {
        i1 i1Var;
        int i10;
        String str4;
        String str5;
        int i11;
        Boolean bool2;
        gh.m0 m0Var2;
        String str6;
        if (cVar instanceof i1) {
            i1Var = (i1) cVar;
            int i12 = i1Var.f19505h;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                i1Var.f19505h = i12 - Integer.MIN_VALUE;
                i1 i1Var2 = i1Var;
                Object obj = i1Var2.f19503f;
                lf.a aVar = lf.a.f20034a;
                i10 = i1Var2.f19505h;
                if (i10 != 0) {
                    h8.b.B(obj);
                    fb.b bVar = new fb.b();
                    i1Var2.f19498a = str;
                    i1Var2.f19499b = str2;
                    i1Var2.f19500c = m0Var;
                    i1Var2.f19501d = bool;
                    i1Var2.f19502e = i5;
                    i1Var2.f19505h = 1;
                    obj = bVar.C0(i1Var2);
                    if (obj != aVar) {
                        str4 = str;
                        str5 = str2;
                        i11 = i5;
                        bool2 = bool;
                        m0Var2 = m0Var;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                int i13 = i1Var2.f19502e;
                Boolean bool3 = i1Var2.f19501d;
                gh.m0 m0Var3 = i1Var2.f19500c;
                str5 = i1Var2.f19499b;
                String str7 = i1Var2.f19498a;
                h8.b.B(obj);
                m0Var2 = m0Var3;
                str4 = str7;
                i11 = i13;
                bool2 = bool3;
                str6 = (String) obj;
                if (str6 != null) {
                    throw new IllegalArgumentException("Token access is null");
                }
                ya.e eVar = new ya.e();
                String str8 = gc.d.f9945a;
                String c2 = d2.i.c();
                String d10 = d2.i.d();
                i1Var2.f19498a = null;
                i1Var2.f19499b = null;
                i1Var2.f19500c = null;
                i1Var2.f19501d = null;
                i1Var2.f19502e = i11;
                i1Var2.f19505h = 2;
                Object t02 = eVar.t0(str6, str4, str5, m0Var2, bool2, i11, c2, d10, i1Var2);
                return t02 == aVar ? aVar : t02;
            }
        }
        i1Var = new i1(this, cVar);
        i1 i1Var22 = i1Var;
        Object obj2 = i1Var22.f19503f;
        lf.a aVar2 = lf.a.f20034a;
        i10 = i1Var22.f19505h;
        if (i10 != 0) {
        }
        str6 = (String) obj2;
        if (str6 != null) {
        }
    }
}
