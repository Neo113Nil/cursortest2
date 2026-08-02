package id;

import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.R;
import eg.c0;
import eg.m0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m2.f0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final gf.t f11146a;

    public c(int i5) {
        switch (i5) {
            case 1:
                this.f11146a = gf.k.b(new pd.v(11));
                break;
            default:
                this.f11146a = gf.k.b(new a(0));
                break;
        }
    }

    public String a(int i5) {
        boolean areEqual = Intrinsics.areEqual(zc.f.c().getLanguage(), "pt");
        gf.t tVar = this.f11146a;
        if (areEqual) {
            ((zc.k) tVar.getValue()).getClass();
            return ((za.i) zc.k.e()).f(i5, "pt");
        }
        ((zc.k) tVar.getValue()).getClass();
        return zc.k.h(i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (eg.c0.A(lg.d.f20063c, new q4.r(r7, null, 5), r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (d(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(mf.c cVar) {
        tc.d dVar;
        int i5;
        if (cVar instanceof tc.d) {
            dVar = (tc.d) cVar;
            int i10 = dVar.f23844c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f23844c = i10 - Integer.MIN_VALUE;
                Object obj = dVar.f23842a;
                Object obj2 = lf.a.f20034a;
                i5 = dVar.f23844c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    dVar.f23844c = 1;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                s7.t tVar = new s7.t(17);
                dVar.f23844c = 2;
                lg.e eVar = m0.f9201a;
            }
        }
        dVar = new tc.d(this, cVar);
        Object obj3 = dVar.f23842a;
        Object obj22 = lf.a.f20034a;
        i5 = dVar.f23844c;
        if (i5 != 0) {
        }
        s7.t tVar2 = new s7.t(17);
        dVar.f23844c = 2;
        lg.e eVar2 = m0.f9201a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0067, code lost:
    
        if (r9.intValue() == 401) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:13:0x008c, B:14:0x00a3, B:20:0x0039, B:21:0x005b, B:28:0x0098, B:29:0x0078, B:31:0x0080, B:35:0x006c, B:38:0x00a0, B:39:0x0063, B:42:0x0040), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:13:0x008c, B:14:0x00a3, B:20:0x0039, B:21:0x005b, B:28:0x0098, B:29:0x0078, B:31:0x0080, B:35:0x006c, B:38:0x00a0, B:39:0x0063, B:42:0x0040), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(String str, mf.c cVar) {
        tc.e eVar;
        int i5;
        Integer num;
        Object obj;
        try {
            if (cVar instanceof tc.e) {
                eVar = (tc.e) cVar;
                int i10 = eVar.f23848d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    eVar.f23848d = i10 - Integer.MIN_VALUE;
                    Object obj2 = eVar.f23846b;
                    Object obj3 = lf.a.f20034a;
                    i5 = eVar.f23848d;
                    int i11 = 6;
                    Continuation continuation = null;
                    if (i5 != 0) {
                        h8.b.B(obj2);
                        s7.s sVar = new s7.s(17);
                        eVar.f23848d = 1;
                        lg.e eVar2 = m0.f9201a;
                        obj2 = c0.A(lg.d.f20063c, new f0(sVar, str, continuation, 14), eVar);
                        if (obj2 == obj3) {
                            return obj3;
                        }
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = eVar.f23845a;
                            h8.b.B(obj2);
                            new io.sentry.hints.j(i11).E("reg");
                            obj2 = obj;
                            return (Integer) obj2;
                        }
                        h8.b.B(obj2);
                    }
                    num = (Integer) obj2;
                    if (num != null) {
                    }
                    if (num != null && num.intValue() == 403) {
                        da.r.b(401);
                        return (Integer) obj2;
                    }
                    if (num.intValue() == 200) {
                        eVar.f23845a = obj2;
                        eVar.f23848d = 2;
                        if (d(eVar) != obj3) {
                            obj = obj2;
                            new io.sentry.hints.j(i11).E("reg");
                            obj2 = obj;
                            return (Integer) obj2;
                        }
                        return obj3;
                    }
                    rc.x.a(R.string.server_error, false);
                    return (Integer) obj2;
                }
            }
            if (i5 != 0) {
            }
            num = (Integer) obj2;
            if (num != null) {
            }
            if (num != null) {
                da.r.b(401);
                return (Integer) obj2;
            }
            if (num.intValue() == 200) {
            }
            rc.x.a(R.string.server_error, false);
            return (Integer) obj2;
        } catch (Exception e7) {
            zc.d.b(6, null, e7);
            return null;
        }
        eVar = new tc.e(this, cVar);
        Object obj22 = eVar.f23846b;
        Object obj32 = lf.a.f20034a;
        i5 = eVar.f23848d;
        int i112 = 6;
        Continuation continuation2 = null;
    }

    public Object d(mf.c cVar) {
        lg.e eVar = m0.f9201a;
        Object A = c0.A(lg.d.f20063c, new tc.f(this, null, 1), cVar);
        return A == lf.a.f20034a ? A : Unit.f19194a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(mf.c cVar) {
        tc.g gVar;
        int i5;
        if (cVar instanceof tc.g) {
            gVar = (tc.g) cVar;
            int i10 = gVar.f23853c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f23853c = i10 - Integer.MIN_VALUE;
                Object obj = gVar.f23851a;
                lf.a aVar = lf.a.f20034a;
                i5 = gVar.f23853c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    la.b bVar = (la.b) y3.m(la.b.class, null, 6);
                    gVar.f23853c = 1;
                    bVar.getClass();
                    y8.d dVar = new y8.d();
                    lg.e eVar = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new cb.a(dVar, null, 4), gVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                Integer num = (Integer) obj;
                return Boolean.valueOf((num == null ? num.intValue() : 0) == 1);
            }
        }
        gVar = new tc.g(this, cVar);
        Object obj2 = gVar.f23851a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = gVar.f23853c;
        if (i5 != 0) {
        }
        Integer num2 = (Integer) obj2;
        return Boolean.valueOf((num2 == null ? num2.intValue() : 0) == 1);
    }
}
