package defpackage;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.network.response.VolleyballPlayerEventStatistics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j92 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ boolean t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j92(Object obj, boolean z, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.t = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return new j92((k92) obj2, this.t, rq3Var, 0);
            case 1:
                return new j92((kv5) obj2, this.t, rq3Var, 1);
            case 2:
                return new j92((xeg) obj2, this.t, rq3Var, 2);
            case 3:
                return new j92((tbj) obj2, this.t, rq3Var, 3);
            case 4:
                j92 j92Var = new j92((k8f) obj2, rq3Var);
                j92Var.t = ((Boolean) obj).booleanValue();
                return j92Var;
            default:
                return new j92((j) obj2, this.t, rq3Var, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((j92) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((j92) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((j92) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((j92) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((j92) create(bool, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((j92) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0287, code lost:
    
        if (((defpackage.z88) r14).collect(r3, r13) == r0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0277, code lost:
    
        if (r14 == r0) goto L140;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Boolean bool;
        int i = this.r;
        int i2 = 2;
        Object obj2 = this.u;
        q80 q80Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (i) {
            case 0:
                k92 k92Var = (k92) obj2;
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    i92 i92Var = k92Var.e;
                    boolean z = this.t;
                    this.s = 1;
                    obj = i92Var.a(z, this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                f10 f10Var = new f10(k92Var, i2);
                this.s = 2;
                break;
            case 1:
                kv5 kv5Var = (kv5) obj2;
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    s96 s96Var = kv5Var.e;
                    Event event = kv5Var.f;
                    if (event == null) {
                        Intrinsics.i("event");
                        throw null;
                    }
                    this.s = 1;
                    obj = s96Var.p(event, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                LineupsResponse lineupsResponse = (LineupsResponse) obj;
                if (lineupsResponse != null) {
                    boolean z2 = this.t;
                    kv5Var.g = lineupsResponse;
                    Event event2 = kv5Var.f;
                    if (event2 == null) {
                        Intrinsics.i("event");
                        throw null;
                    }
                    if (Intrinsics.c(event2.getSportSlug(), Sports.VOLLEYBALL)) {
                        yzc yzcVar = kv5Var.r;
                        ArrayList w0 = CollectionsKt.w0(LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getPlayers(), LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers());
                        kp5 kp5Var = qwk.g;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : kp5Var) {
                            if (!((qwk) obj3).d) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            o13.v(((qwk) it.next()).b, arrayList2);
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            e1 e1Var = (e1) next;
                            if (!w0.isEmpty()) {
                                Iterator it3 = w0.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        PlayerEventStatistics statistics = ((PlayerData) it3.next()).getStatistics();
                                        if (!(statistics instanceof VolleyballPlayerEventStatistics)) {
                                            statistics = null;
                                        }
                                        VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) statistics;
                                        if (volleyballPlayerEventStatistics != null) {
                                            bool = (Boolean) e1Var.m().invoke(volleyballPlayerEventStatistics);
                                            bool.getClass();
                                        } else {
                                            bool = null;
                                        }
                                        if (Intrinsics.c(bool, Boolean.TRUE)) {
                                            arrayList3.add(next);
                                        }
                                    }
                                }
                            }
                        }
                        boolean z3 = arrayList3.size() > arrayList2.size() / 2;
                        kp5 kp5Var2 = qwk.g;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : kp5Var2) {
                            qwk qwkVar = (qwk) obj4;
                            if (qwkVar != qwk.e && ((list = qwkVar.b) == null || !list.isEmpty())) {
                                Iterator it4 = list.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    if (arrayList3.contains((e1) it4.next())) {
                                        arrayList4.add(obj4);
                                    }
                                }
                            }
                        }
                        yzcVar.j(new hv5(z3, arrayList4, arrayList3));
                    }
                    if (z2) {
                        kv5Var.u();
                    }
                }
                return Unit.a;
            case 2:
                boolean z4 = this.t;
                xeg xegVar = (xeg) obj2;
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    g9i L = xw3.L(xegVar.a, null, null, new mp1(xegVar, z4, objArr == true ? 1 : 0, 7), 3);
                    this.s = 1;
                    if (L.Z(this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                xegVar.e = z4;
                return Unit.a;
            case 3:
                tbj tbjVar = (tbj) obj2;
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    boolean z5 = this.t;
                    if (!pej.d(tbjVar.l().b)) {
                        q80Var = z1a.J(tbjVar.l());
                        if (z5) {
                            int f = pej.f(tbjVar.l().b);
                            tbjVar.c.invoke(tbj.b(tbjVar.l().a, t6a.g(f, f)));
                            tbjVar.r(p69.a);
                        }
                    }
                    if (q80Var == null) {
                        return Unit.a;
                    }
                    iy2 iy2Var = tbjVar.g;
                    if (iy2Var != null) {
                        gy2 Q = oyn.Q(q80Var);
                        this.s = 1;
                        if (((fy) iy2Var).a(Q) == lu3Var4) {
                            return lu3Var4;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    Boolean valueOf = Boolean.valueOf(this.t);
                    this.s = 1;
                    if (((j8f) ((k8f) obj2)).e.q(this, valueOf) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                lu3 lu3Var6 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    r69 r69Var = f.m;
                    mp1 mp1Var = new mp1((j) obj2, this.t, objArr2 == true ? 1 : 0, 14);
                    this.s = 1;
                    if (xw3.R(r69Var, mp1Var, this) == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j92(k8f k8fVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 4;
        this.u = k8fVar;
    }
}
