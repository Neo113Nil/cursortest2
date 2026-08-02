package la;

import com.google.android.gms.internal.measurement.y3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(w wVar, mf.c cVar) {
        r rVar;
        int i5;
        try {
            if (cVar instanceof r) {
                rVar = (r) cVar;
                int i10 = rVar.f19581c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    rVar.f19581c = i10 - Integer.MIN_VALUE;
                    Object obj = rVar.f19579a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = rVar.f19581c;
                    Continuation continuation = null;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        fb.b bVar = new fb.b();
                        rVar.f19581c = 1;
                        lg.e eVar = eg.m0.f9201a;
                        obj = eg.c0.A(lg.d.f20063c, new ab.a(bVar, continuation, 0), rVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return (String) obj;
                }
            }
            if (i5 != 0) {
            }
            return (String) obj;
        } catch (Exception unused) {
            return null;
        }
        rVar = new r(wVar, cVar);
        Object obj2 = rVar.f19579a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = rVar.f19581c;
        Continuation continuation2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(mf.c cVar) {
        s sVar;
        int i5;
        try {
            if (cVar instanceof s) {
                sVar = (s) cVar;
                int i10 = sVar.f19587c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    sVar.f19587c = i10 - Integer.MIN_VALUE;
                    Object obj = sVar.f19585a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = sVar.f19587c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        fb.b bVar = new fb.b();
                        sVar.f19587c = 1;
                        obj = bVar.C0(sVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return (String) obj;
                }
            }
            if (i5 != 0) {
            }
            return (String) obj;
        } catch (Exception unused) {
            return null;
        }
        sVar = new s(this, cVar);
        Object obj2 = sVar.f19585a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = sVar.f19587c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(mf.c cVar) {
        t tVar;
        int i5;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i10 = tVar.f19590c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.f19590c = i10 - Integer.MIN_VALUE;
                Object obj = tVar.f19588a;
                lf.a aVar = lf.a.f20034a;
                i5 = tVar.f19590c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    fb.b bVar = new fb.b();
                    tVar.f19590c = 1;
                    if (bVar.A0(tVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            }
        }
        tVar = new t(this, cVar);
        Object obj2 = tVar.f19588a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = tVar.f19590c;
        if (i5 != 0) {
        }
        return Unit.f19194a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
    
        if (r3 == r2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0060, code lost:
    
        if (r1 == r2) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(mf.c cVar) {
        v vVar;
        int i5;
        String str;
        List list;
        gi.a aVar;
        Object C0;
        int intValue;
        int i10;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i11 = vVar.f19600e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                vVar.f19600e = i11 - Integer.MIN_VALUE;
                v vVar2 = vVar;
                Object obj = vVar2.f19598c;
                Object obj2 = lf.a.f20034a;
                i5 = vVar2.f19600e;
                int i12 = 2;
                if (i5 != 0) {
                    h8.b.B(obj);
                    vVar2.f19600e = 1;
                    obj = b(vVar2);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i10 = vVar2.f19597b;
                            h8.b.B(obj);
                            intValue = i10;
                            return new Integer(intValue);
                        }
                        List list2 = (List) vVar2.f19596a;
                        h8.b.B(obj);
                        C0 = obj;
                        aVar = null;
                        list = list2;
                        intValue = ((Number) C0).intValue();
                        if (intValue == 401) {
                            vVar2.f19596a = aVar;
                            vVar2.f19597b = intValue;
                            vVar2.f19600e = 3;
                            if (c(vVar2) != obj2) {
                                i10 = intValue;
                                intValue = i10;
                                return new Integer(intValue);
                            }
                            return obj2;
                        }
                        ArrayList ids = new ArrayList(kotlin.collections.v.k(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ids.add(new Integer(((hb.i) it.next()).f10485b));
                        }
                        Intrinsics.checkNotNullParameter(ids, "ids");
                        hb.g gVar = (hb.g) y3.m(hb.g.class, aVar, 6);
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(ids, "ids");
                        hb.d dVar = gVar.f10481b;
                        dVar.getClass();
                        Intrinsics.checkNotNullParameter(ids, "ids");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(" DELETE FROM push_metrics_table WHERE pushId IN (");
                        m4.g.c(ids.size(), sb2);
                        sb2.append(") ");
                        String sb3 = sb2.toString();
                        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                        new Integer(((Number) f3.x.n0(dVar.f10475a, false, true, new fg.d(i12, sb3, ids))).intValue());
                        return new Integer(intValue);
                    }
                    h8.b.B(obj);
                }
                str = (String) obj;
                if (str != null) {
                    return new Integer(401);
                }
                List list3 = (List) f3.x.n0(((hb.g) y3.m(hb.g.class, null, 6)).f10481b.f10475a, true, false, new f1.a(22));
                List D = list3 != null ? CollectionsKt.D(list3) : kotlin.collections.e0.f19204a;
                if (D.isEmpty()) {
                    return new Integer(204);
                }
                na.b bVar = new na.b();
                String str2 = gc.d.f9945a;
                String c2 = d2.i.c();
                String d10 = d2.i.d();
                vVar2.f19596a = D;
                vVar2.f19600e = 2;
                list = D;
                aVar = null;
                C0 = bVar.C0(list, c2, d10, str, vVar2);
            }
        }
        vVar = new v(this, cVar);
        v vVar22 = vVar;
        Object obj3 = vVar22.f19598c;
        Object obj22 = lf.a.f20034a;
        i5 = vVar22.f19600e;
        int i122 = 2;
        if (i5 != 0) {
        }
        str = (String) obj3;
        if (str != null) {
        }
    }
}
