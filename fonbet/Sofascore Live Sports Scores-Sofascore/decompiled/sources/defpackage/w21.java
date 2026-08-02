package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.view.View;
import com.moloco.sdk.common_adapter_internal.a;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.b0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u;
import com.sofascore.model.mvvm.model.DbMyTeam;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.FeaturedOddsResponse;
import com.sofascore.model.odds.FeaturedOddsWithProvider;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w21 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ Object t;
    public /* synthetic */ boolean u;
    public Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w21(u uVar, d0 d0Var, boolean z, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 8;
        this.v = uVar;
        this.w = d0Var;
        this.u = z;
        this.t = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.t;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                w21 w21Var = new w21(this.u, (x21) obj3, (Event) obj2, rq3Var);
                w21Var.v = obj;
                return w21Var;
            case 1:
                return new w21((cq6) obj3, (Event) obj2, this.u, rq3Var, 1);
            case 2:
                return new w21(this.u, (lqa) this.v, (j38) obj3, (n29) obj2, rq3Var);
            case 3:
                w21 w21Var2 = new w21((Context) obj3, (jid) obj2, this.u, rq3Var, 3);
                w21Var2.v = obj;
                return w21Var2;
            case 4:
                w21 w21Var3 = new w21((k6g) obj3, this.u, (String[]) obj2, rq3Var, 4);
                w21Var3.v = obj;
                return w21Var3;
            case 5:
                return new w21((q50) this.v, this.u, (g0i) obj3, (Function0) obj2, rq3Var);
            case 6:
                return new w21((e1d) obj3, this.u, (wzc) obj2, rq3Var, 6);
            case 7:
                w21 w21Var4 = new w21((View) this.v, (k8f) obj3, (q) obj2, rq3Var);
                w21Var4.u = ((Boolean) obj).booleanValue();
                return w21Var4;
            default:
                return new w21((u) this.v, (d0) obj3, this.u, (String) obj2, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((w21) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((w21) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((w21) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((w21) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((w21) create((avj) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((w21) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((w21) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((w21) create(bool, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((w21) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0210, code lost:
    
        if (r2 == r3) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0205, code lost:
    
        if (r5.a(r7, r8, r19) != r3) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ed, code lost:
    
        if (r8.a(r19) == r3) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d6, code lost:
    
        if (r8 == r3) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0353, code lost:
    
        if (r0 == r3) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02a4, code lost:
    
        if (r5 == r3) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03ee, code lost:
    
        if (r0 == r11) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e2, code lost:
    
        if (defpackage.fcp.c0(r1, r11, r19) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f1, code lost:
    
        if (((defpackage.j8f) r14).e.q(r19, r1) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0234, code lost:
    
        if (defpackage.v7a.n(r1, "VACUUM", r19) != r3) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.sofascore.model.odds.FeaturedOddsWithProvider] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OddsCountryProvider oddsCountryProvider;
        Object b;
        Map<String, ProviderOdds> featured;
        ProviderOdds providerOdds;
        Object a;
        Object c;
        SharedPreferences d;
        Object u;
        avj avjVar;
        Object b2;
        Object b3;
        avj avjVar2;
        g6b lifecycle;
        int i = this.r;
        int i2 = 5;
        int i3 = 4;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i4 = 2;
        int i5 = 0;
        boolean z = false;
        FeaturedOddsWithProvider featuredOddsWithProvider = 0;
        featuredOddsWithProvider = 0;
        featuredOddsWithProvider = 0;
        featuredOddsWithProvider = 0;
        switch (i) {
            case 0:
                boolean z2 = this.u;
                x21 x21Var = (x21) this.w;
                ku3 ku3Var = (ku3) this.v;
                lu3 lu3Var = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    if (z2) {
                        x21Var.x(true);
                    }
                    av4 t = xw3.t(ku3Var, null, new l0(x21Var, (Event) this.t, featuredOddsWithProvider, 22), 3);
                    wd5 wd5Var = xd5.b;
                    long R = wkn.R(500, be5.MILLISECONDS);
                    this.v = null;
                    this.s = 1;
                    if (z8e.e0(t, R, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                if (z2) {
                    x21Var.x(false);
                }
                return Unit.a;
            case 1:
                cq6 cq6Var = (cq6) this.w;
                Event event = (Event) this.t;
                lu3 lu3Var2 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    oddsCountryProvider = cq6Var.s;
                    boolean z3 = this.u;
                    if (ok3.D(event) && z3) {
                        oddsCountryProvider = null;
                    }
                    if (oddsCountryProvider != null) {
                        umd umdVar = cq6Var.g;
                        this.v = oddsCountryProvider;
                        this.s = 1;
                        b = umdVar.b(event, oddsCountryProvider, this);
                        if (b == lu3Var2) {
                            return lu3Var2;
                        }
                    }
                    return new cy6(event, featuredOddsWithProvider);
                }
                if (i7 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                OddsCountryProvider oddsCountryProvider2 = (OddsCountryProvider) this.v;
                y6a.M(obj);
                oddsCountryProvider = oddsCountryProvider2;
                b = obj;
                FeaturedOddsResponse featuredOddsResponse = (FeaturedOddsResponse) b;
                if (featuredOddsResponse != null && (featured = featuredOddsResponse.getFeatured()) != null && (providerOdds = featured.get(oddsCountryProvider.getFeaturedOddsType())) != null) {
                    featuredOddsWithProvider = new FeaturedOddsWithProvider(oddsCountryProvider, providerOdds);
                }
                return new cy6(event, featuredOddsWithProvider);
            case 2:
                lqa lqaVar = (lqa) this.v;
                e1d e1dVar = lqaVar.i;
                q50 q50Var = lqaVar.p;
                lu3 lu3Var3 = lu3.a;
                int i8 = this.s;
                try {
                    if (i8 == 0) {
                        y6a.M(obj);
                        if (this.u) {
                            Float f2 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            this.s = 1;
                            if (q50Var.f(this, f2) == lu3Var3) {
                                return lu3Var3;
                            }
                        }
                    } else {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                            a = obj;
                            ((eoh) e1dVar).setValue(Boolean.FALSE);
                            return Unit.a;
                        }
                        y6a.M(obj);
                    }
                    Float f3 = new Float(1.0f);
                    j38 j38Var = (j38) this.w;
                    kqa kqaVar = new kqa((n29) this.t, lqaVar, i5);
                    this.s = 2;
                    a = q50.a(q50Var, f3, j38Var, kqaVar, this, 4);
                    break;
                } catch (Throwable th) {
                    ((eoh) e1dVar).setValue(Boolean.FALSE);
                    throw th;
                }
            case 3:
                ku3 ku3Var2 = (ku3) this.v;
                lu3 lu3Var4 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    Context context = (Context) this.w;
                    context.getClass();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = context.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    if (sharedPreferences.getBoolean("INIT_DONE", false)) {
                        j0j j0jVar = ((jid) this.t).c;
                        this.v = ku3Var2;
                        this.s = 1;
                        c = j0jVar.c(this);
                        break;
                    }
                    return Unit.a;
                }
                if (i9 != 1) {
                    if (i9 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    u = obj;
                    Iterable iterable = (Iterable) u;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                SharedPreferences.Editor edit = ((jid) this.t).i.edit();
                                edit.getClass();
                                edit.putBoolean("RETRY_TEAMS", i5 ^ 1);
                                edit.apply();
                                return Unit.a;
                            }
                        }
                    }
                    i5 = 1;
                    SharedPreferences.Editor edit2 = ((jid) this.t).i.edit();
                    edit2.getClass();
                    edit2.putBoolean("RETRY_TEAMS", i5 ^ 1);
                    edit2.apply();
                    return Unit.a;
                }
                y6a.M(obj);
                c = obj;
                HashSet hashSet = (HashSet) c;
                if (!this.u || !hashSet.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : hashSet) {
                        if (((DbMyTeam) obj2).getNotificationsEnabled()) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        w1l.A(arrayList2, ((DbMyTeam) it2.next()).getTeamId());
                    }
                    HashSet Q0 = CollectionsKt.Q0(arrayList2);
                    ArrayList arrayList3 = new ArrayList(k13.r(hashSet, 10));
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        w1l.A(arrayList3, ((DbMyTeam) it3.next()).getTeamId());
                    }
                    HashSet Q02 = CollectionsKt.Q0(arrayList3);
                    Q02.removeAll(Q0);
                    List j = b.j(xw3.t(ku3Var2, null, new did((jid) this.t, Q0, featuredOddsWithProvider, i3), 3), xw3.t(ku3Var2, null, new did((jid) this.t, Q02, featuredOddsWithProvider, i2), 3));
                    this.v = null;
                    this.s = 2;
                    u = m6k.u(j, this);
                    break;
                } else {
                    return Unit.a;
                }
            case 4:
                k6g k6gVar = (k6g) this.w;
                lu3 lu3Var5 = lu3.a;
                switch (this.s) {
                    case 0:
                        y6a.M(obj);
                        avjVar = (avj) this.v;
                        this.v = avjVar;
                        this.s = 1;
                        b2 = avjVar.b(this);
                        break;
                    case 1:
                        avjVar = (avj) this.v;
                        y6a.M(obj);
                        b2 = obj;
                        if (!((Boolean) b2).booleanValue()) {
                            taa invalidationTracker = k6gVar.getInvalidationTracker();
                            this.v = avjVar;
                            this.s = 2;
                            break;
                        }
                        zuj zujVar = zuj.b;
                        j6g j6gVar = new j6g(this.u, (String[]) this.t, null);
                        this.v = avjVar;
                        this.s = 3;
                        break;
                    case 2:
                        avjVar = (avj) this.v;
                        y6a.M(obj);
                        zuj zujVar2 = zuj.b;
                        j6g j6gVar2 = new j6g(this.u, (String[]) this.t, null);
                        this.v = avjVar;
                        this.s = 3;
                        break;
                    case 3:
                        avjVar = (avj) this.v;
                        y6a.M(obj);
                        this.v = avjVar;
                        this.s = 4;
                        b3 = avjVar.b(this);
                        break;
                    case 4:
                        avj avjVar3 = (avj) this.v;
                        y6a.M(obj);
                        avjVar = avjVar3;
                        b3 = obj;
                        if (!((Boolean) b3).booleanValue()) {
                            this.v = avjVar;
                            this.s = 5;
                            if (v7a.n(avjVar, "PRAGMA wal_checkpoint(FULL)", this) != lu3Var5) {
                                avjVar2 = avjVar;
                                this.v = null;
                                this.s = 6;
                                break;
                            }
                            return lu3Var5;
                        }
                        return Unit.a;
                    case 5:
                        avjVar2 = (avj) this.v;
                        y6a.M(obj);
                        this.v = null;
                        this.s = 6;
                        break;
                    case 6:
                        y6a.M(obj);
                        taa invalidationTracker2 = k6gVar.getInvalidationTracker();
                        invalidationTracker2.c.e(invalidationTracker2.f, invalidationTracker2.g);
                        return Unit.a;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    q50 q50Var2 = (q50) this.v;
                    if (this.u) {
                        f = 1.0f;
                    }
                    Float f4 = new Float(f);
                    g0i g0iVar = (g0i) this.w;
                    this.s = 1;
                    if (q50.a(q50Var2, f4, g0iVar, null, this, 12) == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ((Function0) this.t).invoke();
                return Unit.a;
            case 6:
                e1d e1dVar2 = (e1d) this.w;
                lu3 lu3Var7 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    l6f l6fVar = (l6f) e1dVar2.getValue();
                    if (l6fVar != null) {
                        boolean z4 = this.u;
                        wzc wzcVar = (wzc) this.t;
                        i7a m6fVar = z4 ? new m6f(l6fVar) : new k6f(l6fVar);
                        if (wzcVar != null) {
                            this.v = e1dVar2;
                            this.s = 1;
                            if (wzcVar.a(m6fVar, this) == lu3Var7) {
                                return lu3Var7;
                            }
                        }
                    }
                    return Unit.a;
                }
                if (i11 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e1dVar2 = (e1d) this.v;
                y6a.M(obj);
                e1dVar2.setValue(null);
                return Unit.a;
            case 7:
                k8f k8fVar = (k8f) this.w;
                View view = (View) this.v;
                lu3 lu3Var8 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    if (this.u) {
                        u6b w = qha.w(view);
                        rq3 rq3Var = null;
                        z88 pogVar = (w == null || (lifecycle = w.getLifecycle()) == null) ? new pog(new i58(i4, rq3Var, 8)) : i0.c(yso.q(new i3l(lifecycle, rq3Var, 25)));
                        kuj kujVar = new kuj((q) this.t, view, k8fVar, rq3Var, 22);
                        this.s = 1;
                        break;
                    } else {
                        Boolean bool = Boolean.FALSE;
                        this.s = 2;
                        break;
                    }
                } else {
                    if (i12 != 1 && i12 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                u uVar = (u) this.v;
                lu3 lu3Var9 = lu3.a;
                int i13 = this.s;
                if (i13 != 0) {
                    if (i13 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                d0 d0Var = (d0) this.w;
                b0 b0Var = uVar.e;
                b0Var.getClass();
                try {
                    Object systemService = b0Var.a.getSystemService("connectivity");
                    systemService.getClass();
                    z = ((ConnectivityManager) systemService).isActiveNetworkMetered();
                } catch (Exception e) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "isNetworkMetered", e.toString(), e, false, 8, null);
                }
                double d2 = !z ? 10.0d : 2.0d;
                a a2 = uVar.g.a();
                boolean z5 = this.u;
                String str = (String) this.t;
                this.s = 1;
                Object g = uVar.g(d0Var, null, d2, a2, z5, str, this);
                return g == lu3Var9 ? lu3Var9 : g;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w21(View view, k8f k8fVar, q qVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 7;
        this.v = view;
        this.w = k8fVar;
        this.t = qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w21(q50 q50Var, boolean z, g0i g0iVar, Function0 function0, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 5;
        this.v = q50Var;
        this.u = z;
        this.w = g0iVar;
        this.t = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w21(Object obj, Object obj2, boolean z, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.w = obj;
        this.t = obj2;
        this.u = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w21(Object obj, boolean z, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.w = obj;
        this.u = z;
        this.t = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w21(boolean z, x21 x21Var, Event event, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 0;
        this.u = z;
        this.w = x21Var;
        this.t = event;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w21(boolean z, lqa lqaVar, j38 j38Var, n29 n29Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.u = z;
        this.v = lqaVar;
        this.w = j38Var;
        this.t = n29Var;
    }
}
