package wc;

import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import j$.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: g, reason: collision with root package name */
    public static long f25108g;

    /* renamed from: h, reason: collision with root package name */
    public static final ic.c f25109h = new ic.c(null, null, 0, null);

    /* renamed from: a, reason: collision with root package name */
    public final eg.y f25110a = new eg.y("ListSubsUseCase");

    /* renamed from: b, reason: collision with root package name */
    public final rc.r f25111b = new rc.r();

    /* renamed from: c, reason: collision with root package name */
    public final s7.u f25112c = new s7.u(21);

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f25113d = new io.sentry.internal.debugmeta.c(8);

    /* renamed from: e, reason: collision with root package name */
    public final rc.a f25114e = new rc.a();

    /* renamed from: f, reason: collision with root package name */
    public final s7.u f25115f = new s7.u(20);

    public static pc.u a() {
        return (pc.u) y3.m(pc.u.class, null, 6);
    }

    public static boolean c() {
        return ((Boolean) a().f21710k.getValue()).booleanValue();
    }

    public static Object d(ic.b bVar, ic.b bVar2, int i5, Integer num, mf.i iVar) {
        lg.e eVar = eg.m0.f9201a;
        return eg.c0.A(lg.d.f20063c, new m2.f0(bVar, bVar2, i5, num, (Continuation) null), iVar);
    }

    public static void h(i iVar) {
        iVar.getClass();
        long epochSecond = Instant.now().getEpochSecond();
        if (f25108g + 60 < epochSecond) {
            f25108g = epochSecond;
            iVar.f(0L);
            jg.d dVar = MyApp.f6830c;
            eg.y yVar = iVar.f25110a;
            eg.y yVar2 = new eg.y("SubsPayCheckOwnedSubs");
            yVar.getClass();
            eg.c0.t(dVar, kotlin.coroutines.e.c(yVar, yVar2), null, new f(iVar, null, 6), 2);
        }
    }

    public static Object i(ic.h0 h0Var, Continuation continuation) {
        lg.e eVar = eg.m0.f9201a;
        return eg.c0.A(lg.d.f20063c, new h(h0Var, null, 0), continuation);
    }

    public final Object b(String str, se.k kVar) {
        lg.e eVar = eg.m0.f9201a;
        return eg.c0.A(lg.d.f20063c, new td.b(this, str, null, 5), kVar);
    }

    public final Object e(mf.c cVar) {
        lg.e eVar = eg.m0.f9201a;
        return eg.c0.A(lg.d.f20063c, new f(this, null, 3), cVar);
    }

    public final void f(long j) {
        jg.d dVar = MyApp.f6830c;
        eg.y yVar = new eg.y("UpdateProductsInfo");
        eg.y yVar2 = this.f25110a;
        yVar2.getClass();
        eg.c0.t(dVar, kotlin.coroutines.e.c(yVar2, yVar), null, new cd.p(j, this, (Continuation) null, 2), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(mf.c cVar) {
        g gVar;
        int i5;
        String str;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.f25098c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f25098c = i10 - Integer.MIN_VALUE;
                Object obj = gVar.f25096a;
                lf.a aVar = lf.a.f20034a;
                i5 = gVar.f25098c;
                int i11 = 1;
                if (i5 != 0) {
                    h8.b.B(obj);
                    str = a().f21717s;
                    if (str == null) {
                        gVar.f25098c = 1;
                        lg.e eVar = eg.m0.f9201a;
                        obj = eg.c0.A(lg.d.f20063c, new f(this, null, i11), gVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    a().u(str);
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
                a().u(str);
                return Unit.f19194a;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.f25096a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = gVar.f25098c;
        int i112 = 1;
        if (i5 != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
        a().u(str);
        return Unit.f19194a;
    }
}
