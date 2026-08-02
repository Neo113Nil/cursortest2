package la;

import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c0 extends f3.x {

    /* renamed from: a, reason: collision with root package name */
    public static volatile long f19426a;

    public static void K0(List list) {
        ib.e eVar = (ib.e) P0();
        eVar.getClass();
        if (list != null) {
            Iterator it = CollectionsKt.D(list).iterator();
            while (it.hasNext()) {
                eVar.a((ia.a) it.next());
            }
        }
    }

    public static List O0() {
        List list = (List) f3.x.n0(((ib.e) P0()).f11053a.f11052a, true, false, new f1.a(28));
        return list != null ? CollectionsKt.D(list) : kotlin.collections.e0.f19204a;
    }

    public static ib.d P0() {
        return (ib.d) y3.m(ib.d.class, null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object L0(int i5, boolean z5, mf.c cVar) {
        x xVar;
        int i10;
        String str;
        List c2;
        boolean z7;
        int i11;
        ia.b bVar;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i12 = xVar.f19613f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                xVar.f19613f = i12 - Integer.MIN_VALUE;
                x xVar2 = xVar;
                Object obj = xVar2.f19611d;
                Object obj2 = lf.a.f20034a;
                i10 = xVar2.f19613f;
                if (i10 != 0) {
                    h8.b.B(obj);
                    xVar2.f19608a = i5;
                    xVar2.f19609b = z5;
                    xVar2.f19613f = 1;
                    obj = C0(xVar2);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            List list = xVar2.f19610c;
                            h8.b.B(obj);
                            return list;
                        }
                        z7 = xVar2.f19609b;
                        i11 = xVar2.f19608a;
                        List list2 = xVar2.f19610c;
                        h8.b.B(obj);
                        c2 = list2;
                        bVar = (ia.b) obj;
                        if (bVar != null) {
                            int i13 = bVar.f11039a;
                            if (i13 == 200) {
                                List list3 = bVar.f11040b;
                                if (list3 != null) {
                                    K0(list3);
                                    return list3;
                                }
                            } else if (i13 == 401) {
                                xVar2.f19610c = c2;
                                xVar2.f19608a = i11;
                                xVar2.f19609b = z7;
                                xVar2.f19613f = 3;
                                if (A0(xVar2) == obj2) {
                                    return obj2;
                                }
                            }
                        }
                        return c2;
                    }
                    z5 = xVar2.f19609b;
                    i5 = xVar2.f19608a;
                    h8.b.B(obj);
                }
                str = (String) obj;
                if (str != null) {
                    return null;
                }
                ia.a aVar = (ia.a) f3.x.n0(((ib.e) P0()).f11053a.f11052a, true, false, new eb.b(i5, 5));
                c2 = aVar != null ? kotlin.collections.t.c(aVar) : kotlin.collections.e0.f19204a;
                if (!c2.isEmpty() && ((ia.a) c2.get(0)).f11038e != null && !z5) {
                    return c2;
                }
                String str2 = gc.d.f9945a;
                String c8 = d2.i.c();
                String d10 = d2.i.d();
                xVar2.f19610c = c2;
                xVar2.f19608a = i5;
                xVar2.f19609b = z5;
                xVar2.f19613f = 2;
                int i14 = i5;
                obj = Q0(str, i14, c8, d10, xVar2);
                if (obj != obj2) {
                    z7 = z5;
                    i11 = i14;
                    bVar = (ia.b) obj;
                    if (bVar != null) {
                    }
                    return c2;
                }
                return obj2;
            }
        }
        xVar = new x(this, cVar);
        x xVar22 = xVar;
        Object obj3 = xVar22.f19611d;
        Object obj22 = lf.a.f20034a;
        i10 = xVar22.f19613f;
        if (i10 != 0) {
        }
        str = (String) obj3;
        if (str != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0099, code lost:
    
        if (r15 == r0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable M0(boolean z5, mf.c cVar) {
        y yVar;
        int i5;
        String str;
        ia.b bVar;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i10 = yVar.f19622d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yVar.f19622d = i10 - Integer.MIN_VALUE;
                y yVar2 = yVar;
                Object obj = yVar2.f19620b;
                lf.a aVar = lf.a.f20034a;
                i5 = yVar2.f19622d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    yVar2.f19619a = z5;
                    yVar2.f19622d = 1;
                    obj = C0(yVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            return null;
                        }
                        z5 = yVar2.f19619a;
                        h8.b.B(obj);
                        bVar = (ia.b) obj;
                        LocalDateTime now = LocalDateTime.now();
                        ZoneOffset zoneOffset = ZoneOffset.UTC;
                        f19426a = LocalDateTime.ofEpochSecond(now.toEpochSecond(zoneOffset), 0, zoneOffset).truncatedTo(ChronoUnit.HOURS).toEpochSecond(zoneOffset);
                        if (bVar != null) {
                            return (Serializable) O0();
                        }
                        int i11 = bVar.f11039a;
                        if (i11 != 200) {
                            if (i11 == 401) {
                                yVar2.f19619a = z5;
                                yVar2.f19622d = 3;
                                if (A0(yVar2) == aVar) {
                                    return aVar;
                                }
                            }
                            return null;
                        }
                        List list = bVar.f11040b;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((ib.e) P0()).a((ia.a) it.next());
                            }
                        }
                        return (Serializable) O0();
                    }
                    z5 = yVar2.f19619a;
                    h8.b.B(obj);
                }
                str = (String) obj;
                if (str != null) {
                    return null;
                }
                LocalDateTime now2 = LocalDateTime.now();
                ChronoUnit chronoUnit = ChronoUnit.HOURS;
                LocalDateTime truncatedTo = now2.truncatedTo(chronoUnit);
                ZoneOffset zoneOffset2 = ZoneOffset.UTC;
                if (truncatedTo.toEpochSecond(zoneOffset2) <= LocalDateTime.ofEpochSecond(f19426a, 0, zoneOffset2).truncatedTo(chronoUnit).toEpochSecond(zoneOffset2) && !z5) {
                    bVar = null;
                    if (bVar != null) {
                    }
                } else {
                    String str2 = gc.d.f9945a;
                    String c2 = d2.i.c();
                    String d10 = d2.i.d();
                    yVar2.f19619a = z5;
                    yVar2.f19622d = 2;
                    obj = R0(str, 0, 20, c2, d10, yVar2);
                }
            }
        }
        yVar = new y(this, cVar);
        y yVar22 = yVar;
        Object obj2 = yVar22.f19620b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = yVar22.f19622d;
        if (i5 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        if (r2 != 404) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        if (r11 == r0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object N0(mf.c cVar) {
        z zVar;
        int i5;
        String str;
        int intValue;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i10 = zVar.f19634d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zVar.f19634d = i10 - Integer.MIN_VALUE;
                z zVar2 = zVar;
                Object obj = zVar2.f19632b;
                Object obj2 = lf.a.f20034a;
                i5 = zVar2.f19634d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    zVar2.f19634d = 1;
                    obj = C0(zVar2);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            return null;
                        }
                        int i11 = zVar2.f19631a;
                        h8.b.B(obj);
                        intValue = i11;
                        ia.b bVar = (ia.b) obj;
                        if (bVar != null) {
                            int i12 = bVar.f11039a;
                            if (i12 == 200) {
                                List list = bVar.f11040b;
                                K0(list);
                                return list;
                            }
                            if (i12 != 204) {
                                if (i12 == 401) {
                                    zVar2.f19631a = intValue;
                                    zVar2.f19634d = 3;
                                    if (A0(zVar2) == obj2) {
                                        return obj2;
                                    }
                                }
                            }
                            return kotlin.collections.e0.f19204a;
                        }
                        return null;
                    }
                    h8.b.B(obj);
                }
                str = (String) obj;
                if (str == null) {
                    return null;
                }
                Integer num = (Integer) f3.x.n0(((ib.e) P0()).f11053a.f11052a, true, false, new f1.a(27));
                intValue = num != null ? num.intValue() : 20;
                String str2 = gc.d.f9945a;
                String c2 = d2.i.c();
                String d10 = d2.i.d();
                zVar2.f19631a = intValue;
                zVar2.f19634d = 2;
                obj = R0(str, intValue, 20, c2, d10, zVar2);
            }
        }
        zVar = new z(this, cVar);
        z zVar22 = zVar;
        Object obj3 = zVar22.f19632b;
        Object obj22 = lf.a.f20034a;
        i5 = zVar22.f19634d;
        if (i5 != 0) {
        }
        str = (String) obj3;
        if (str == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q0(String str, int i5, String str2, String str3, mf.c cVar) {
        a0 a0Var;
        int i10;
        Continuation continuation;
        try {
            if (cVar instanceof a0) {
                a0Var = (a0) cVar;
                int i11 = a0Var.f19412c;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    a0Var.f19412c = i11 - Integer.MIN_VALUE;
                    a0 a0Var2 = a0Var;
                    Object obj = a0Var2.f19410a;
                    lf.a aVar = lf.a.f20034a;
                    i10 = a0Var2.f19412c;
                    continuation = null;
                    if (i10 != 0) {
                        h8.b.B(obj);
                        na.b bVar = new na.b();
                        a0Var2.f19412c = 1;
                        obj = bVar.t0(str, i5, str2, str3, a0Var2);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return (ia.b) obj;
                }
            }
            if (i10 != 0) {
            }
            return (ia.b) obj;
        } catch (oi.q unused) {
            return null;
        } catch (Exception ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            jg.d dVar = MyApp.f6830c;
            lg.e eVar = eg.m0.f9201a;
            eg.c0.t(dVar, lg.d.f20063c, null, new q4.r(ex, continuation, 18), 2);
            return null;
        }
        a0Var = new a0(this, cVar);
        a0 a0Var22 = a0Var;
        Object obj2 = a0Var22.f19410a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = a0Var22.f19412c;
        continuation = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R0(String str, int i5, int i10, String str2, String str3, mf.c cVar) {
        b0 b0Var;
        int i11;
        Continuation continuation;
        try {
            if (cVar instanceof b0) {
                b0Var = (b0) cVar;
                int i12 = b0Var.f19419c;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    b0Var.f19419c = i12 - Integer.MIN_VALUE;
                    b0 b0Var2 = b0Var;
                    Object obj = b0Var2.f19417a;
                    lf.a aVar = lf.a.f20034a;
                    i11 = b0Var2.f19419c;
                    continuation = null;
                    if (i11 != 0) {
                        h8.b.B(obj);
                        na.b bVar = new na.b();
                        b0Var2.f19419c = 1;
                        obj = bVar.u0(str, i5, i10, str2, str3, b0Var2);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return (ia.b) obj;
                }
            }
            if (i11 != 0) {
            }
            return (ia.b) obj;
        } catch (oi.q unused) {
            return null;
        } catch (Exception ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            jg.d dVar = MyApp.f6830c;
            lg.e eVar = eg.m0.f9201a;
            eg.c0.t(dVar, lg.d.f20063c, null, new q4.r(ex, continuation, 18), 2);
            return null;
        }
        b0Var = new b0(this, cVar);
        b0 b0Var22 = b0Var;
        Object obj2 = b0Var22.f19417a;
        lf.a aVar2 = lf.a.f20034a;
        i11 = b0Var22.f19419c;
        continuation = null;
    }
}
