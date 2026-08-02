package defpackage;

import com.facebook.login.i;
import com.moloco.sdk.acm.d;
import com.moloco.sdk.acm.recorder.c;
import com.moloco.sdk.internal.client_metrics_data.a;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.services.bidtoken.b;
import com.moloco.sdk.internal.services.bidtoken.f;
import com.moloco.sdk.internal.services.bidtoken.m;
import com.moloco.sdk.internal.services.bidtoken.x;
import com.sofascore.model.TvType;
import com.sofascore.model.mvvm.model.Description;
import com.sofascore.model.mvvm.model.PinnedTournament;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.newNetwork.TvCountryChannelsResponse;
import com.sofascore.model.profile.UserNotificationsRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fzh extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fzh(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Object obj = this.u;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                return new fzh((gzh) obj2, (String) obj, rq3Var, 0);
            case 1:
                return new fzh((g4i) obj2, (Stage) obj, rq3Var, 1);
            case 2:
                return new fzh((rbi) obj2, (Description) obj, rq3Var, 2);
            case 3:
                return new fzh((fvi) obj2, (Pair) obj, rq3Var, 3);
            case 4:
                return new fzh((fvi) obj2, (ArrayList) obj, rq3Var, 4);
            case 5:
                return new fzh((koj) obj2, (ynj) obj, rq3Var, 5);
            case 6:
                return new fzh((irj) obj2, (PinnedTournament) obj, rq3Var, 6);
            case 7:
                return new fzh((irj) obj2, (ArrayList) obj, rq3Var, 7);
            case 8:
                return new fzh((vrj) obj2, (LinkedHashMap) obj, rq3Var, 8);
            case 9:
                return new fzh((z3k) obj2, (String) obj, rq3Var, 9);
            case 10:
                return new fzh((dhk) obj2, (HashMap) obj, rq3Var, 10);
            case 11:
                return new fzh((dhk) obj2, (UserNotificationsRequest) obj, rq3Var, 11);
            case 12:
                return new fzh((ghk) obj2, (List) obj, rq3Var, 12);
            case 13:
                return new fzh((fyk) obj2, (String) obj, rq3Var, 13);
            case 14:
                return new fzh((a3l) obj2, (String) obj, rq3Var, 14);
            case 15:
                return new fzh((x) obj2, (c) obj, rq3Var, 15);
            default:
                return new fzh((x) obj2, (k0) obj, rq3Var, 16);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((fzh) create(rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0080, code lost:
    
        if (r13 == r1) goto L31;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TvCountryChannelsResponse tvCountryChannelsResponse;
        int i = this.r;
        Object obj2 = this.u;
        Object obj3 = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object sportEventCount = ((gzh) obj3).b.sportEventCount((String) obj2, this);
                    return sportEventCount == lu3Var ? lu3Var : sportEventCount;
                }
                if (i2 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                g4i g4iVar = (g4i) obj3;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    b4i b4iVar = (b4i) g4iVar.o.d();
                    if (b4iVar != null && (tvCountryChannelsResponse = b4iVar.b) != null) {
                        return tvCountryChannelsResponse;
                    }
                    t9c t9cVar = g4iVar.g;
                    TvType tvType = TvType.STAGE;
                    int id = ((Stage) obj2).getId();
                    this.s = 1;
                    obj = t9cVar.a.getTvCountryChannels(tvType, id, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return (TvCountryChannelsResponse) obj;
            case 2:
                lu3 lu3Var3 = lu3.a;
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
                qxj qxjVar = ((rbi) obj3).f;
                int id2 = ((Description) obj2).getId();
                String a = dla.a();
                this.s = 1;
                Object translateDescription = qxjVar.a.translateDescription("description", id2, a, this);
                return translateDescription == lu3Var3 ? lu3Var3 : translateDescription;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object a2 = fvi.a((fvi) obj3, (Pair) obj2, this);
                    return a2 == lu3Var4 ? lu3Var4 : a2;
                }
                if (i5 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object b = fvi.b((fvi) obj3, (ArrayList) obj2, this);
                    return b == lu3Var5 ? lu3Var5 : b;
                }
                if (i6 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                koj kojVar = (koj) obj3;
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    ynj ynjVar = (ynj) obj2;
                    qnj qnjVar = ynjVar.f;
                    rnj rnjVar = ynjVar.d;
                    boj bojVar = ynjVar.c;
                    this.s = 1;
                    obj = kojVar.B(qnjVar, rnjVar, bojVar, this);
                    if (obj == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                kojVar.n(null, new uo(10, (gv9) obj));
                return Unit.a;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (irj.e((irj) obj3, (PinnedTournament) obj2, this) == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (irj.g((irj) obj3, (ArrayList) obj2, this) == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object transfers = ((vrj) obj3).a.getTransfers((LinkedHashMap) obj2, this);
                    return transfers == lu3Var9 ? lu3Var9 : transfers;
                }
                if (i10 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object tvChannelsForCountry = ((z3k) obj3).b.tvChannelsForCountry((String) obj2, this);
                    return tvChannelsForCountry == lu3Var10 ? lu3Var10 : tvChannelsForCountry;
                }
                if (i11 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object userLogin = ((dhk) obj3).b.userLogin((HashMap) obj2, this);
                    return userLogin == lu3Var11 ? lu3Var11 : userLogin;
                }
                if (i12 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object userNotifications = ((dhk) obj3).b.userNotifications((UserNotificationsRequest) obj2, this);
                    return userNotifications == lu3Var12 ? lu3Var12 : userNotifications;
                }
                if (i13 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (ghk.a((ghk) obj3, (List) obj2, this) == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 13:
                lu3 lu3Var14 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object userVotes = ((fyk) obj3).b.getUserVotes((String) obj2, this);
                    return userVotes == lu3Var14 ? lu3Var14 : userVotes;
                }
                if (i15 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object weeklyChallengeRankings = ((a3l) obj3).a.getWeeklyChallengeRankings((String) obj2, this);
                    return weeklyChallengeRankings == lu3Var15 ? lu3Var15 : weeklyChallengeRankings;
                }
                if (i16 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                c cVar = (c) obj2;
                x xVar = (x) obj3;
                i iVar = xVar.c;
                lu3 lu3Var16 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    x.d("[Thread: " + Thread.currentThread().getName() + "] Acquired lock, fetching status of current token");
                    this.s = 1;
                    obj = iVar.d(this);
                    break;
                } else {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                b bVar = (b) obj;
                x.c("[Thread: " + Thread.currentThread().getName() + "] bidToken status: " + bVar);
                bVar.getClass();
                b bVar2 = b.b;
                if (bVar != bVar2 && bVar != b.c) {
                    x.d("[Thread: " + Thread.currentThread().getName() + "] bidToken needs refresh, fetching new token");
                    m mVar = f.b;
                    this.s = 2;
                    Object a3 = xVar.a(cVar, mVar, false, false, this);
                    if (a3 != lu3Var16) {
                        return a3;
                    }
                    return lu3Var16;
                }
                a[] aVarArr = a.b;
                d dVar = new d("sbt_cached");
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                dVar.a("result", "true");
                dVar.a("initial_fetch", "false");
                dVar.a("expiring", bVar != bVar2 ? "false" : "true");
                cVar.a(dVar);
                m mVar2 = (m) iVar.d;
                if (bVar == bVar2) {
                    x.c("[Thread: " + Thread.currentThread().getName() + "] bidToken is expiring, returning cached, and refreshing async");
                    x.d("[Thread: " + Thread.currentThread().getName() + "] Refreshing token async");
                    d dVar2 = new d("sbt_async_fetch");
                    g9i g9iVar = xVar.f;
                    dVar2.a("async", String.valueOf(g9iVar != null ? g9iVar.isActive() : false));
                    cVar.a(dVar2);
                    g9i g9iVar2 = xVar.f;
                    if (g9iVar2 == null || !g9iVar2.isActive()) {
                        x.d("[Thread: " + Thread.currentThread().getName() + "] Scheduling to fetch token from server");
                        xVar.f = xw3.L(xVar.b, null, null, new i3l(xVar, cVar, rq3Var, 22), 3);
                    } else {
                        x.d("[Thread: " + Thread.currentThread().getName() + "] Async refresh already in progress. Returning");
                    }
                } else {
                    x.c("[Thread: " + Thread.currentThread().getName() + "] bidToken doesn't need refresh, returning cached");
                }
                return mVar2;
            default:
                lu3 lu3Var17 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    i iVar2 = ((x) obj3).c;
                    m mVar3 = (m) ((k0) obj2).a;
                    this.s = 1;
                    if (iVar2.f(mVar3, this) == lu3Var17) {
                        return lu3Var17;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }
}
