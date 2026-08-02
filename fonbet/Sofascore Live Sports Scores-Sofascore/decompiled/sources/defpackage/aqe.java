package defpackage;

import com.sofascore.model.newNetwork.FootballEventPlayerRatingBreakdownResponse;
import com.sofascore.results.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class aqe extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ fqe t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aqe(int i, int i2, int i3, rq3 rq3Var, fqe fqeVar) {
        super(2, rq3Var);
        this.r = i3;
        this.t = fqeVar;
        this.u = i;
        this.v = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new aqe(this.u, this.v, 0, rq3Var, this.t);
            case 1:
                return new aqe(this.u, this.v, 1, rq3Var, this.t);
            case 2:
                return new aqe(this.u, this.v, 2, rq3Var, this.t);
            case 3:
                return new aqe(this.u, this.v, 3, rq3Var, this.t);
            case 4:
                return new aqe(this.u, this.v, 4, rq3Var, this.t);
            case 5:
                return new aqe(this.u, this.v, 5, rq3Var, this.t);
            default:
                return new aqe(this.u, this.v, 6, rq3Var, this.t);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((aqe) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x00d6. Please report as an issue. */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        npe npeVar;
        npe npeVar2;
        int i = this.r;
        int i2 = this.v;
        int i3 = this.u;
        fqe fqeVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                this.s = 1;
                yzd yzdVar = fqe.B;
                Serializable o = fqeVar.o(i3, i2, this);
                return o == lu3Var ? lu3Var : o;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                this.s = 1;
                yzd yzdVar2 = fqe.B;
                Object n = fqeVar.n(i3, i2, this);
                return n == lu3Var2 ? lu3Var2 : n;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                g39 g39Var = fqeVar.f;
                this.s = 1;
                Object a = g39Var.a(i3, i2, this);
                return a == lu3Var3 ? lu3Var3 : a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                this.s = 1;
                yzd yzdVar3 = fqe.B;
                Serializable o2 = fqeVar.o(i3, i2, this);
                return o2 == lu3Var4 ? lu3Var4 : o2;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    g39 g39Var2 = fqeVar.f;
                    this.s = 1;
                    obj = g39Var2.b(i3, i2, this);
                    if (obj == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FootballEventPlayerRatingBreakdownResponse footballEventPlayerRatingBreakdownResponse = (FootballEventPlayerRatingBreakdownResponse) obj;
                if (footballEventPlayerRatingBreakdownResponse == null) {
                    return null;
                }
                yzd yzdVar4 = fqe.B;
                List<FootballEventPlayerRatingBreakdownResponse.RatingBreakdownElement> passes = footballEventPlayerRatingBreakdownResponse.getPasses();
                if (passes == null) {
                    passes = km5.a;
                }
                List<FootballEventPlayerRatingBreakdownResponse.RatingBreakdownElement> dribbles = footballEventPlayerRatingBreakdownResponse.getDribbles();
                if (dribbles == null) {
                    dribbles = km5.a;
                }
                ArrayList w0 = CollectionsKt.w0(dribbles, passes);
                List<FootballEventPlayerRatingBreakdownResponse.RatingBreakdownElement> defensive = footballEventPlayerRatingBreakdownResponse.getDefensive();
                if (defensive == null) {
                    defensive = km5.a;
                }
                ArrayList w02 = CollectionsKt.w0(defensive, w0);
                List<FootballEventPlayerRatingBreakdownResponse.RatingBreakdownElement> ballCarries = footballEventPlayerRatingBreakdownResponse.getBallCarries();
                if (ballCarries == null) {
                    ballCarries = km5.a;
                }
                ArrayList w03 = CollectionsKt.w0(ballCarries, w02);
                ArrayList arrayList = new ArrayList();
                Iterator it = w03.iterator();
                while (it.hasNext()) {
                    FootballEventPlayerRatingBreakdownResponse.RatingBreakdownElement ratingBreakdownElement = (FootballEventPlayerRatingBreakdownResponse.RatingBreakdownElement) it.next();
                    Integer valueOf = Integer.valueOf(R.color.error);
                    Integer valueOf2 = Integer.valueOf(R.color.success);
                    FootballEventPlayerRatingBreakdownResponse.ActionType eventActionType = ratingBreakdownElement.getEventActionType();
                    switch (eventActionType == null ? -1 : rpe.a[eventActionType.ordinal()]) {
                        case 1:
                            Boolean isLongBall = ratingBreakdownElement.isLongBall();
                            Boolean bool = Boolean.TRUE;
                            if (Intrinsics.c(isLongBall, bool)) {
                                if (!Intrinsics.c(ratingBreakdownElement.isAssist(), bool)) {
                                    if (!Intrinsics.c(ratingBreakdownElement.getKeypass(), bool)) {
                                        if (!Intrinsics.c(ratingBreakdownElement.getOutcome(), bool)) {
                                            npeVar = new npe(pzd.m, fqe.A(ratingBreakdownElement, valueOf, false));
                                            npeVar2 = npeVar;
                                            break;
                                        } else {
                                            npeVar2 = new npe(pzd.j, fqe.A(ratingBreakdownElement, valueOf2, false));
                                            break;
                                        }
                                    } else {
                                        npeVar2 = new npe(pzd.k, fqe.A(ratingBreakdownElement, valueOf2, false));
                                        break;
                                    }
                                } else {
                                    npeVar2 = new npe(pzd.l, fqe.A(ratingBreakdownElement, valueOf2, false));
                                    break;
                                }
                            } else if (Intrinsics.c(ratingBreakdownElement.isAssist(), bool)) {
                                npeVar2 = new npe(pzd.h, fqe.A(ratingBreakdownElement, valueOf2, false));
                                break;
                            } else if (Intrinsics.c(ratingBreakdownElement.getKeypass(), bool)) {
                                npeVar2 = new npe(pzd.i, fqe.A(ratingBreakdownElement, valueOf2, false));
                                break;
                            } else if (Intrinsics.c(ratingBreakdownElement.getOutcome(), bool)) {
                                npeVar2 = new npe(pzd.f, fqe.A(ratingBreakdownElement, valueOf2, false));
                                break;
                            } else {
                                npeVar = new npe(pzd.g, fqe.A(ratingBreakdownElement, valueOf, false));
                                npeVar2 = npeVar;
                            }
                        case 2:
                            Boolean isAssist = ratingBreakdownElement.isAssist();
                            Boolean bool2 = Boolean.TRUE;
                            if (!Intrinsics.c(isAssist, bool2)) {
                                if (!Intrinsics.c(ratingBreakdownElement.getKeypass(), bool2)) {
                                    if (!Intrinsics.c(ratingBreakdownElement.getOutcome(), bool2)) {
                                        npeVar = new npe(pzd.o, fqe.A(ratingBreakdownElement, valueOf, false));
                                        npeVar2 = npeVar;
                                        break;
                                    } else {
                                        npeVar2 = new npe(pzd.n, fqe.A(ratingBreakdownElement, valueOf2, false));
                                        break;
                                    }
                                } else {
                                    npeVar2 = new npe(pzd.q, fqe.A(ratingBreakdownElement, valueOf2, false));
                                    break;
                                }
                            } else {
                                npeVar2 = new npe(pzd.p, fqe.A(ratingBreakdownElement, valueOf2, false));
                                break;
                            }
                        case 3:
                            Boolean isAssist2 = ratingBreakdownElement.isAssist();
                            Boolean bool3 = Boolean.TRUE;
                            if (!Intrinsics.c(isAssist2, bool3)) {
                                if (!Intrinsics.c(ratingBreakdownElement.getKeypass(), bool3)) {
                                    if (!Intrinsics.c(ratingBreakdownElement.getOutcome(), bool3)) {
                                        npeVar = new npe(pzd.s, fqe.z(ratingBreakdownElement, valueOf));
                                        npeVar2 = npeVar;
                                        break;
                                    } else {
                                        npeVar2 = new npe(pzd.r, fqe.z(ratingBreakdownElement, valueOf2));
                                        break;
                                    }
                                } else {
                                    npeVar2 = new npe(pzd.u, fqe.z(ratingBreakdownElement, valueOf2));
                                    break;
                                }
                            } else {
                                npeVar2 = new npe(pzd.t, fqe.z(ratingBreakdownElement, valueOf2));
                                break;
                            }
                        case 4:
                            Boolean wasFouled = ratingBreakdownElement.getWasFouled();
                            Boolean bool4 = Boolean.TRUE;
                            if (!Intrinsics.c(wasFouled, bool4)) {
                                if (!Intrinsics.c(ratingBreakdownElement.getOutcome(), bool4)) {
                                    pzd pzdVar = pzd.x;
                                    npeVar2 = new npe(pzdVar, fqe.z(ratingBreakdownElement, pzdVar.c));
                                    break;
                                } else {
                                    npeVar2 = new npe(pzd.w, fqe.z(ratingBreakdownElement, valueOf2));
                                    break;
                                }
                            } else {
                                pzd pzdVar2 = pzd.y;
                                npeVar2 = new npe(pzdVar2, fqe.z(ratingBreakdownElement, pzdVar2.c));
                                break;
                            }
                        case 5:
                            if (!Intrinsics.c(ratingBreakdownElement.getOutcome(), Boolean.TRUE)) {
                                pzd pzdVar3 = pzd.C;
                                Integer num = pzd.B.c;
                                npeVar2 = new npe(pzdVar3, new rb(fqe.k(ratingBreakdownElement.getPlayerCoordinates()), num != null ? num.intValue() : R.color.primary_default));
                                break;
                            } else {
                                pzd pzdVar4 = pzd.B;
                                npeVar2 = new npe(pzdVar4, fqe.z(ratingBreakdownElement, pzdVar4.c));
                                break;
                            }
                        case 6:
                            pzd pzdVar5 = pzd.E;
                            npeVar2 = new npe(pzdVar5, fqe.z(ratingBreakdownElement, pzdVar5.c));
                            break;
                        case 7:
                            npeVar2 = new npe(pzd.G, fqe.z(ratingBreakdownElement, valueOf2));
                            break;
                        case 8:
                            pzd pzdVar6 = pzd.D;
                            npeVar2 = new npe(pzdVar6, fqe.z(ratingBreakdownElement, pzdVar6.c));
                            break;
                        case 9:
                            npeVar = new npe(pzd.F, fqe.z(ratingBreakdownElement, valueOf));
                            npeVar2 = npeVar;
                            break;
                        case 10:
                            npeVar2 = new npe(pzd.z, fqe.A(ratingBreakdownElement, Integer.valueOf(R.color.n_lv_1), true));
                            break;
                        default:
                            npeVar2 = null;
                            break;
                    }
                    if (npeVar2 != null) {
                        arrayList.add(npeVar2);
                    }
                }
                return arrayList;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                this.s = 1;
                yzd yzdVar5 = fqe.B;
                Object t = fqeVar.t(i3, i2, this);
                return t == lu3Var6 ? lu3Var6 : t;
            default:
                lu3 lu3Var7 = lu3.a;
                int i10 = this.s;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                this.s = 1;
                yzd yzdVar6 = fqe.B;
                Object w = fqeVar.w(i3, i2, this);
                return w == lu3Var7 ? lu3Var7 : w;
        }
    }
}
