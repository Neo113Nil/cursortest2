package androidx.lifecycle;

import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import androidx.appcompat.widget.q4;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.domain.workers.WorkerAnnouncement;
import com.sports.insider.domain.workers.WorkerOpenPrediction;
import com.sports.insider.domain.workers.WorkerUpdatePreview;
import com.sports.insider.ui.activities.BonusesInfo;
import com.sports.insider.ui.prediction.ExpressFragment;
import eg.t1;
import io.appmetrica.analytics.impl.C0122e9;
import j$.time.Instant;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2134b;

    /* renamed from: c, reason: collision with root package name */
    public int f2135c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2136d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i5, int i10, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f2134b = i10;
        this.f2135c = i5;
        this.f2136d = obj;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f2134b) {
            case 0:
                return new b((androidx.appcompat.widget.a0) this.f2136d, continuation, 0);
            case 1:
                return new b((cd.h) this.f2136d, continuation, 1);
            case 2:
                return new b((m3.f) this.f2136d, continuation, 2);
            case 3:
                return new b((ge.s) this.f2136d, continuation, 3);
            case 4:
                return new b((m3.f) this.f2136d, continuation, 4);
            case 5:
                return new b((hg.g) this.f2136d, continuation, 5);
            case 6:
                return new b(this.f2135c, 6, (y8.d) this.f2136d, continuation);
            case 7:
                return new b((id.x) this.f2136d, continuation, 7);
            case 8:
                return new b((m3.f) this.f2136d, this.f2135c, continuation);
            case 9:
                return new b((je.b) this.f2136d, continuation, 9);
            case 10:
                return new b((k2.i) this.f2136d, continuation, 10);
            case 11:
                return new b((k2.o0) this.f2136d, continuation, 11);
            case 12:
                return new b((la.m) this.f2136d, continuation, 12);
            case 13:
                return new b((la.s0) this.f2136d, continuation, 13);
            case 14:
                return new b((le.f1) this.f2136d, continuation, 14);
            case 15:
                return new b((eg.r) this.f2136d, continuation, 15);
            case 16:
                return new b((ExpressFragment) this.f2136d, continuation, 16);
            case 17:
                return new b(this.f2135c, 17, (io.sentry.util.network.b) this.f2136d, continuation);
            case 18:
                return new b((ConstraintTrackingWorker) this.f2136d, continuation, 18);
            case 19:
                return new b((BonusesInfo) this.f2136d, continuation, 19);
            case 20:
                return new b((pe.f) this.f2136d, continuation, 20);
            case 21:
                return new b((q8.b) this.f2136d, continuation, 21);
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return new b((eg.h1) this.f2136d, continuation, 22);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return new b((md.o) this.f2136d, continuation, 23);
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return new b((id.c) this.f2136d, continuation, 24);
            case C0122e9.F /* 25 */:
                return new b(this.f2135c, 25, (s7.t) this.f2136d, continuation);
            case C0122e9.G /* 26 */:
                return new b((me.d) this.f2136d, continuation, 26);
            case C0122e9.H /* 27 */:
                return new b((me.d) this.f2136d, continuation, 27);
            case 28:
                return new b((me.d) this.f2136d, continuation, 28);
            default:
                return new b((qe.a) this.f2136d, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f2134b) {
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                ((b) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
                break;
        }
        return ((b) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        Object e7;
        Object A;
        Object A2;
        Object c2;
        Object c8;
        Object A3;
        Object A4;
        Object m6;
        Map a7;
        Object A5;
        int i5 = 4;
        int i10 = 6;
        boolean z5 = false;
        r2 = 0;
        int i11 = 0;
        r2 = false;
        r2 = false;
        r2 = false;
        r2 = false;
        boolean z7 = false;
        z5 = false;
        Continuation continuation = null;
        switch (this.f2134b) {
            case 0:
                androidx.appcompat.widget.a0 a0Var = (androidx.appcompat.widget.a0) this.f2136d;
                lf.a aVar = lf.a.f20034a;
                int i12 = this.f2135c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    a0Var.getClass();
                    this.f2135c = 1;
                    if (eg.c0.j(5000L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                if (((i) a0Var.f680b).f2212c <= 0) {
                    t1 t1Var = (t1) a0Var.f684f;
                    if (t1Var != null) {
                        t1Var.k(null);
                    }
                    a0Var.f684f = null;
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i13 = this.f2135c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    JSONObject put = new JSONObject().put("funcName", "FavoriteListView");
                    cd.h hVar = (cd.h) this.f2136d;
                    this.f2135c = 1;
                    if (hVar.e("FAVORITE_FUNC_USES", put, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i14 = this.f2135c;
                try {
                    if (i14 == 0) {
                        h8.b.B(obj);
                        this.f2135c = 1;
                        d10 = ((la.w) y3.m(la.w.class, null, 6)).d(this);
                        if (d10 == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        d10 = obj;
                    }
                    int intValue = ((Number) d10).intValue();
                    if (200 <= intValue && intValue < 300) {
                        return new e3.u();
                    }
                    if (intValue != 401 && intValue != 403 && intValue != 404 && intValue != 405) {
                        return new e3.s();
                    }
                    ((e3.k0) y3.m(e3.k0.class, null, 6)).a("WorkerMetricsPushEvent");
                    return new e3.s();
                } catch (Exception unused) {
                    return new e3.s();
                }
            case 3:
                ge.s sVar = (ge.s) this.f2136d;
                lf.a aVar4 = lf.a.f20034a;
                int i15 = this.f2135c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    bd.j jVar = sVar.f9995d;
                    this.f2135c = 1;
                    e7 = jVar.e(this);
                    if (e7 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    e7 = obj;
                }
                List list = (List) e7;
                sVar.f9997f.j(list);
                hg.d1 d1Var = sVar.f9998g;
                Boolean valueOf = Boolean.valueOf(list.isEmpty());
                d1Var.getClass();
                d1Var.k(null, valueOf);
                return Unit.f19194a;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                int i16 = this.f2135c;
                if (i16 == 0) {
                    h8.b.B(obj);
                    la.b bVar = (la.b) y3.m(la.b.class, null, 6);
                    this.f2135c = 1;
                    bVar.getClass();
                    y8.d dVar = new y8.d();
                    lg.e eVar = eg.m0.f9201a;
                    A = eg.c0.A(lg.d.f20063c, new cb.a(dVar, continuation, z5 ? 1 : 0), this);
                    if (A == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    A = obj;
                }
                Integer num = (Integer) A;
                int intValue2 = num != null ? num.intValue() : 0;
                rc.r rVar = new rc.r();
                if (1 <= intValue2 && intValue2 < 3) {
                    z5 = true;
                }
                this.f2135c = 2;
                if (rVar.c(z5, this) == aVar5) {
                    return aVar5;
                }
                return Unit.f19194a;
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                int i17 = this.f2135c;
                if (i17 == 0) {
                    h8.b.B(obj);
                    hg.g gVar = (hg.g) this.f2136d;
                    this.f2135c = 1;
                    Object a10 = gVar.a(ig.t.f11285a, this);
                    if (a10 != aVar6) {
                        a10 = Unit.f19194a;
                    }
                    if (a10 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                StringBuilder sb2 = new StringBuilder("WorkerNameUpdatePreview");
                int i18 = this.f2135c;
                sb2.append(i18);
                String sb3 = sb2.toString();
                String i19 = androidx.appcompat.widget.c1.i(i18, "WorkerTagUpdatePreview");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Intrinsics.checkNotNullParameter("idPrediction", "key");
                linkedHashMap.put("idPrediction", Integer.valueOf(i18));
                e3.j jVar2 = new e3.j(linkedHashMap);
                rh.g.L(jVar2);
                e3.o oVar = e3.o.f8551a;
                e3.y yVar = e3.y.f8572a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                e3.y networkType = e3.y.f8573b;
                Intrinsics.checkNotNullParameter(networkType, "networkType");
                e3.f fVar = new e3.f(new n3.i(null), networkType, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? CollectionsKt.Z(linkedHashSet) : kotlin.collections.g0.f19206a);
                Intrinsics.checkNotNullParameter(WorkerUpdatePreview.class, "workerClass");
                return ((e3.k0) y3.m(e3.k0.class, null, 6)).c(sb3, oVar, (e3.a0) ((e3.z) ((e3.z) ((e3.z) ((e3.z) new e3.z(WorkerUpdatePreview.class).h(jVar2)).f(fVar)).e(e3.a.f8471a, 2L, TimeUnit.SECONDS)).a(i19)).b());
            case 7:
                id.x xVar = (id.x) this.f2136d;
                lf.a aVar8 = lf.a.f20034a;
                int i20 = this.f2135c;
                try {
                    if (i20 == 0) {
                        h8.b.B(obj);
                        xVar.getClass();
                        la.s0 d11 = id.x.d();
                        this.f2135c = 1;
                        d11.getClass();
                        lg.e eVar2 = eg.m0.f9201a;
                        A2 = eg.c0.A(lg.d.f20063c, new u0(d11, continuation, 5), this);
                        if (A2 == aVar8) {
                            return aVar8;
                        }
                    } else {
                        if (i20 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        A2 = obj;
                    }
                    int intValue3 = ((Number) A2).intValue();
                    if (intValue3 != 200) {
                        if (intValue3 != 204 && intValue3 != 404) {
                            if (intValue3 == 401) {
                                id.x.a(xVar);
                                da.r.b(401);
                            } else if (400 <= intValue3 && intValue3 < 600) {
                                id.x.a(xVar);
                            }
                        }
                        z7 = true;
                    }
                    return Boolean.valueOf(z7);
                } catch (Exception e9) {
                    if (!(e9 instanceof CancellationException) && !(e9 instanceof EOFException) && !(e9 instanceof SSLHandshakeException) && !(e9 instanceof SSLException) && !(e9 instanceof SocketTimeoutException) && !(e9 instanceof SocketException) && !(e9 instanceof UnknownHostException) && !(e9 instanceof IOException)) {
                        zc.d.b(6, null, e9);
                    }
                    id.x.a(xVar);
                    return Boolean.FALSE;
                }
            case 8:
                lf.a aVar9 = lf.a.f20034a;
                h8.b.B(obj);
                e3.k0 k0Var = (e3.k0) y3.m(e3.k0.class, null, 6);
                StringBuilder sb4 = new StringBuilder("WorkerNameOpenPrediction");
                int i21 = this.f2135c;
                sb4.append(i21);
                String sb5 = sb4.toString();
                e3.o oVar2 = e3.o.f8551a;
                Intrinsics.checkNotNullParameter(WorkerOpenPrediction.class, "workerClass");
                e3.z zVar = new e3.z(WorkerOpenPrediction.class);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Intrinsics.checkNotNullParameter("idPrediction", "key");
                linkedHashMap2.put("idPrediction", Integer.valueOf(i21));
                e3.j jVar3 = new e3.j(linkedHashMap2);
                rh.g.L(jVar3);
                e3.z zVar2 = (e3.z) zVar.h(jVar3);
                e3.y yVar2 = e3.y.f8572a;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                e3.y networkType2 = e3.y.f8573b;
                Intrinsics.checkNotNullParameter(networkType2, "networkType");
                return k0Var.c(sb5, oVar2, (e3.a0) ((e3.z) ((e3.z) ((e3.z) zVar2.f(new e3.f(new n3.i(null), networkType2, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? CollectionsKt.Z(linkedHashSet2) : kotlin.collections.g0.f19206a))).e(e3.a.f8471a, 2L, TimeUnit.SECONDS)).a("WorkerTagOpenPrediction" + i21)).b());
            case 9:
                je.b bVar2 = (je.b) this.f2136d;
                p0 p0Var = bVar2.f18466c;
                AtomicBoolean atomicBoolean = bVar2.f18465b;
                lf.a aVar10 = lf.a.f20034a;
                int i22 = this.f2135c;
                try {
                    try {
                    } finally {
                        atomicBoolean.set(false);
                    }
                } catch (CancellationException unused2) {
                } catch (Exception e10) {
                    zc.d.b(4, "loadNVMO", e10);
                    p0Var.h(Boolean.FALSE);
                    hg.t0 t0Var = rc.x.f22455a;
                    rc.x.a(R.string.error_loading_news, false);
                }
                if (i22 == 0) {
                    h8.b.B(obj);
                    p0Var.h(Boolean.TRUE);
                    fd.d dVar2 = (fd.d) bVar2.f18471h.getValue();
                    this.f2135c = 1;
                    c2 = dVar2.c(this);
                    if (c2 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        p0Var.h(Boolean.FALSE);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    c2 = obj;
                }
                List list2 = (List) c2;
                if (list2 != null) {
                    lg.e eVar3 = eg.m0.f9201a;
                    lg.d dVar3 = lg.d.f20063c;
                    c cVar = new c(list2, bVar2, continuation, 25);
                    this.f2135c = 2;
                    if (eg.c0.A(dVar3, cVar, this) == aVar10) {
                        return aVar10;
                    }
                }
                p0Var.h(Boolean.FALSE);
                return Unit.f19194a;
            case 10:
                lf.a aVar11 = lf.a.f20034a;
                int i23 = this.f2135c;
                if (i23 == 0) {
                    h8.b.B(obj);
                    k2.i iVar = (k2.i) this.f2136d;
                    this.f2135c = 1;
                    Object f6 = iVar.f18677b.f(this);
                    if (f6 != aVar11) {
                        f6 = Unit.f19194a;
                    }
                    if (f6 == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 11:
                lf.a aVar12 = lf.a.f20034a;
                int i24 = this.f2135c;
                if (i24 == 0) {
                    h8.b.B(obj);
                    k2.o0 o0Var = (k2.o0) this.f2136d;
                    this.f2135c = 1;
                    if (o0Var.f(this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 12:
                lf.a aVar13 = lf.a.f20034a;
                int i25 = this.f2135c;
                if (i25 == 0) {
                    h8.b.B(obj);
                } else {
                    if (i25 != 1) {
                        if (i25 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                this.f2135c = 2;
                Object b10 = ((ea.e) y3.m(ea.e.class, null, 6)).b(this);
                if (b10 != aVar13) {
                    b10 = Unit.f19194a;
                }
                if (b10 == aVar13) {
                    return aVar13;
                }
                return Unit.f19194a;
            case 13:
                lf.a aVar14 = lf.a.f20034a;
                int i26 = this.f2135c;
                if (i26 == 0) {
                    h8.b.B(obj);
                    long epochMilli = Instant.now().toEpochMilli();
                    Long valueOf2 = Long.valueOf(epochMilli - 86400000);
                    Long valueOf3 = Long.valueOf(epochMilli);
                    la.s0 s0Var = (la.s0) this.f2136d;
                    long longValue = valueOf2.longValue();
                    long longValue2 = valueOf3.longValue();
                    String str = gc.d.f9945a;
                    String c10 = d2.i.c();
                    this.f2135c = 1;
                    c8 = la.s0.c(s0Var, longValue, longValue2, c10, null, this);
                    if (c8 == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    c8 = obj;
                }
                return ((Pair) c8).f19192a;
            case 14:
                le.f1 f1Var = (le.f1) this.f2136d;
                lf.a aVar15 = lf.a.f20034a;
                int i27 = this.f2135c;
                if (i27 == 0) {
                    h8.b.B(obj);
                    f1Var.i().getClass();
                    hg.d1 d1Var2 = wc.d0.b().f21708h;
                    le.e1 e1Var = new le.e1(f1Var, continuation, z5 ? 1 : 0);
                    this.f2135c = 1;
                    if (hg.u0.g(d1Var2, e1Var, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 15:
                lf.a aVar16 = lf.a.f20034a;
                int i28 = this.f2135c;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                eg.r rVar2 = (eg.r) this.f2136d;
                this.f2135c = 1;
                Object m10 = rVar2.m(this);
                return m10 == aVar16 ? aVar16 : m10;
            case 16:
                lf.a aVar17 = lf.a.f20034a;
                int i29 = this.f2135c;
                if (i29 == 0) {
                    h8.b.B(obj);
                    lg.e eVar4 = eg.m0.f9201a;
                    lg.d dVar4 = lg.d.f20063c;
                    bd.b bVar3 = new bd.b(2, continuation, 9);
                    this.f2135c = 1;
                    if (eg.c0.A(dVar4, bVar3, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                ((ExpressFragment) this.f2136d).H();
                return Unit.f19194a;
            case 17:
                lf.a aVar18 = lf.a.f20034a;
                h8.b.B(obj);
                int i30 = this.f2135c - 1;
                int i31 = i30 >= 1 ? i30 : 0;
                fa.a aVar19 = (fa.a) y3.m(fa.a.class, null, 6);
                aVar19.getClass();
                Intrinsics.checkNotNullParameter("DEPRECATED_VERSION_CODE", "key");
                SharedPreferences.Editor edit = aVar19.f9542b.edit();
                edit.putInt("DEPRECATED_VERSION_CODE", i31);
                edit.apply();
                return Unit.f19194a;
            case 18:
                lf.a aVar20 = lf.a.f20034a;
                int i32 = this.f2135c;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f2136d;
                this.f2135c = 1;
                Object e11 = ConstraintTrackingWorker.e(constraintTrackingWorker, this);
                return e11 == aVar20 ? aVar20 : e11;
            case 19:
                BonusesInfo bonusesInfo = (BonusesInfo) this.f2136d;
                lf.a aVar21 = lf.a.f20034a;
                int i33 = this.f2135c;
                if (i33 == 0) {
                    h8.b.B(obj);
                    lg.e eVar5 = eg.m0.f9201a;
                    lg.d dVar5 = lg.d.f20063c;
                    ad.a aVar22 = new ad.a(bonusesInfo, continuation, 23);
                    this.f2135c = 1;
                    A3 = eg.c0.A(dVar5, aVar22, this);
                    if (A3 == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    A3 = obj;
                }
                Typeface typeface = (Typeface) A3;
                if (typeface != null) {
                    q4 q4Var = bonusesInfo.f6883c;
                    if (q4Var != null) {
                        ((TextView) q4Var.f896f).setTypeface(typeface);
                    }
                    q4 q4Var2 = bonusesInfo.f6883c;
                    if (q4Var2 != null) {
                        ((TextView) q4Var2.f897g).setTypeface(typeface);
                    }
                    q4 q4Var3 = bonusesInfo.f6883c;
                    if (q4Var3 != null) {
                        ((TextView) q4Var3.f894d).setTypeface(typeface);
                    }
                    q4 q4Var4 = bonusesInfo.f6883c;
                    if (q4Var4 != null) {
                        ((TextView) q4Var4.f895e).setTypeface(typeface);
                    }
                }
                return Unit.f19194a;
            case 20:
                pe.f fVar2 = (pe.f) this.f2136d;
                lf.a aVar23 = lf.a.f20034a;
                int i34 = this.f2135c;
                if (i34 == 0) {
                    h8.b.B(obj);
                    id.c cVar2 = fVar2.f21833b;
                    this.f2135c = 1;
                    cVar2.getClass();
                    lg.e eVar6 = eg.m0.f9201a;
                    A4 = eg.c0.A(lg.d.f20063c, new c(cVar2, continuation, 16), this);
                    if (A4 == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    A4 = obj;
                }
                List list3 = (List) A4;
                hg.d1 d1Var3 = fVar2.f21834c;
                Boolean valueOf4 = Boolean.valueOf(list3.isEmpty());
                d1Var3.getClass();
                d1Var3.k(null, valueOf4);
                hg.d1 d1Var4 = fVar2.f21835d;
                d1Var4.getClass();
                d1Var4.k(null, list3);
                return Unit.f19194a;
            case 21:
                lf.a aVar24 = lf.a.f20034a;
                int i35 = this.f2135c;
                if (i35 == 0) {
                    h8.b.B(obj);
                    hg.g data = ((q8.b) this.f2136d).f22064c.getData();
                    this.f2135c = 1;
                    m6 = hg.u0.m(data, this);
                    if (m6 == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    m6 = obj;
                }
                g1.a aVar25 = (g1.a) m6;
                return (aVar25 == null || (a7 = aVar25.a()) == null) ? kotlin.collections.n0.c() : a7;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                lf.a aVar26 = lf.a.f20034a;
                int i36 = this.f2135c;
                if (i36 == 0) {
                    h8.b.B(obj);
                    hg.o0 o0Var2 = rc.b.f22390b;
                    c1.y yVar3 = new c1.y(i10, (eg.h1) this.f2136d);
                    this.f2135c = 1;
                    if (o0Var2.f10736a.a(yVar3, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                throw new gf.f();
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                Object obj2 = lf.a.f20034a;
                int i37 = this.f2135c;
                try {
                    if (i37 == 0) {
                        h8.b.B(obj);
                        za.h c11 = md.o.c();
                        this.f2135c = 1;
                        c11.getClass();
                        Object a11 = za.h.b().a(this);
                        if (a11 != obj2) {
                            obj2 = a11;
                        }
                    } else {
                        if (i37 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        obj2 = obj;
                    }
                    return obj2;
                } catch (Exception ex) {
                    md.o.c().getClass();
                    Intrinsics.checkNotNullParameter(ex, "e");
                    za.h.b().getClass();
                    Intrinsics.checkNotNullParameter(ex, "e");
                    if ((ex instanceof i9.f) || (ex instanceof b9.f) || (ex instanceof i9.c) || (ex instanceof CancellationException) || (ex instanceof UnknownHostException) || (ex instanceof ConnectException) || (ex instanceof SocketTimeoutException) || (ex instanceof SocketException) || (ex instanceof SSLHandshakeException) || (ex instanceof IOException)) {
                        Intrinsics.checkNotNullParameter(ex, "ex");
                        jg.d dVar6 = MyApp.f6830c;
                        lg.e eVar7 = eg.m0.f9201a;
                        eg.c0.t(dVar6, lg.d.f20063c, null, new q4.r(ex, continuation, 18), 2);
                    } else {
                        zc.d.b(4, "remoteConfigFetch", ex);
                    }
                    return null;
                }
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                lf.a aVar27 = lf.a.f20034a;
                int i38 = this.f2135c;
                if (i38 == 0) {
                    h8.b.B(obj);
                    la.b bVar4 = (la.b) y3.m(la.b.class, null, 6);
                    this.f2135c = 1;
                    bVar4.getClass();
                    y8.d dVar7 = new y8.d();
                    lg.e eVar8 = eg.m0.f9201a;
                    A5 = eg.c0.A(lg.d.f20063c, new cb.a(dVar7, continuation, i5), this);
                    if (A5 == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    A5 = obj;
                }
                Integer num2 = (Integer) A5;
                int intValue4 = num2 != null ? num2.intValue() : 0;
                fa.a aVar28 = (fa.a) y3.m(fa.a.class, null, 6);
                tc.c[] cVarArr = tc.c.f23841a;
                aVar28.getClass();
                Intrinsics.checkNotNullParameter("pressed_close", "key");
                int i39 = aVar28.f9542b.getInt("pressed_close", 0);
                if (intValue4 > 0 && i39 == 0) {
                    i11 = intValue4;
                }
                return new Integer(i11);
            case C0122e9.F /* 25 */:
                lf.a aVar29 = lf.a.f20034a;
                h8.b.B(obj);
                e3.y yVar4 = e3.y.f8572a;
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                e3.y networkType3 = e3.y.f8573b;
                Intrinsics.checkNotNullParameter(networkType3, "networkType");
                e3.f fVar3 = new e3.f(new n3.i(null), networkType3, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? CollectionsKt.Z(linkedHashSet3) : kotlin.collections.g0.f19206a);
                Pair[] pairArr = {new Pair("AnnouncementId", new Integer(this.f2135c))};
                e3.i iVar2 = new e3.i(0);
                Pair pair = pairArr[0];
                iVar2.e(pair.f19193b, (String) pair.f19192a);
                e3.j c12 = iVar2.c();
                Intrinsics.checkNotNullParameter(WorkerAnnouncement.class, "workerClass");
                e3.z zVar3 = (e3.z) new e3.z(WorkerAnnouncement.class).f(fVar3);
                zVar3.h(c12);
                return ((e3.k0) y3.m(e3.k0.class, null, 6)).c("WorkerAnnouncement", e3.o.f8552b, (e3.a0) ((e3.z) ((e3.z) zVar3.e(e3.a.f8472b, 1L, TimeUnit.MINUTES)).a("TagWorkerAnnouncement")).b());
            case C0122e9.G /* 26 */:
                lf.a aVar30 = lf.a.f20034a;
                int i40 = this.f2135c;
                if (i40 != 0) {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                me.d dVar8 = (me.d) this.f2136d;
                this.f2135c = 1;
                Object invoke = dVar8.invoke(this);
                return invoke == aVar30 ? aVar30 : invoke;
            case C0122e9.H /* 27 */:
                lf.a aVar31 = lf.a.f20034a;
                int i41 = this.f2135c;
                if (i41 != 0) {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                me.d dVar9 = (me.d) this.f2136d;
                this.f2135c = 1;
                Object invoke2 = dVar9.invoke(this);
                return invoke2 == aVar31 ? aVar31 : invoke2;
            case 28:
                lf.a aVar32 = lf.a.f20034a;
                int i42 = this.f2135c;
                if (i42 != 0) {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                me.d dVar10 = (me.d) this.f2136d;
                this.f2135c = 1;
                Object invoke3 = dVar10.invoke(this);
                return invoke3 == aVar32 ? aVar32 : invoke3;
            default:
                lf.a aVar33 = lf.a.f20034a;
                int i43 = this.f2135c;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                qe.a aVar34 = (qe.a) this.f2136d;
                this.f2135c = 1;
                Object invoke4 = aVar34.invoke(this);
                return invoke4 == aVar33 ? aVar33 : invoke4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f2134b = i5;
        this.f2136d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m3.f fVar, int i5, Continuation continuation) {
        super(2, continuation);
        this.f2134b = 8;
        this.f2136d = fVar;
        this.f2135c = i5;
    }
}
