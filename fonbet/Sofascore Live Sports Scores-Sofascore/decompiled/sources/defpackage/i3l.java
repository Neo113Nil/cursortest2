package defpackage;

import android.app.Application;
import android.content.Context;
import android.view.View;
import com.facebook.internal.t;
import com.facebook.login.i;
import com.moloco.sdk.acm.b;
import com.moloco.sdk.acm.d;
import com.moloco.sdk.acm.db.MetricsDb;
import com.moloco.sdk.acm.f;
import com.moloco.sdk.acm.h;
import com.moloco.sdk.acm.k;
import com.moloco.sdk.acm.recorder.c;
import com.moloco.sdk.acm.services.a;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.e;
import com.moloco.sdk.internal.ilrd.j;
import com.moloco.sdk.internal.ilrd.l;
import com.moloco.sdk.internal.ilrd.n;
import com.moloco.sdk.internal.publisher.o0;
import com.moloco.sdk.internal.publisher.q0;
import com.moloco.sdk.internal.services.bidtoken.m;
import com.moloco.sdk.internal.services.bidtoken.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.newNetwork.AllOddsResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.R;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import defpackage.d6b;
import defpackage.j8f;
import defpackage.k8f;
import defpackage.u6b;
import java.io.File;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i3l extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3l(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new i3l((j3l) this.t, (UserAccount) this.u, rq3Var, 0);
            case 1:
                return new i3l((p3l) this.t, (OddsCountryProvider) this.u, rq3Var, 1);
            case 2:
                return new i3l((WeeklyChallengeViewModel) this.u, rq3Var, 2);
            case 3:
                i3l i3lVar = new i3l((WeeklyChallengeViewModel) this.u, rq3Var, 3);
                i3lVar.t = obj;
                return i3lVar;
            case 4:
                return new i3l((Context) this.t, (l7l) this.u, rq3Var, 4);
            case 5:
                return new i3l((ArrayList) this.t, (Context) this.u, rq3Var, 5);
            case 6:
                return new i3l((kqf) this.t, (View) this.u, rq3Var, 6);
            case 7:
                return new i3l((udl) this.t, rq3Var);
            case 8:
                return new i3l((a6e) this.t, (gv9) this.u, rq3Var, 8);
            case 9:
                i3l i3lVar2 = new i3l((qkl) this.u, rq3Var, 9);
                i3lVar2.t = obj;
                return i3lVar2;
            case 10:
                return new i3l((qkl) this.t, (OddsCountryProvider) this.u, rq3Var, 10);
            case 11:
                return new i3l((qkl) this.t, (rxa) this.u, rq3Var, 11);
            case 12:
                return new i3l((qkl) this.t, (xil) this.u, rq3Var, 12);
            case 13:
                return new i3l((qkl) this.t, (ArrayList) this.u, rq3Var, 13);
            case 14:
                return new i3l((ill) this.u, rq3Var, 14);
            case 15:
                return new i3l((f) this.u, rq3Var, 15);
            case 16:
                return new i3l((i) this.t, (d) this.u, rq3Var, 16);
            case 17:
                return new i3l((h) this.t, (i) this.u, rq3Var, 17);
            case 18:
                return new i3l((j) this.t, (e) this.u, rq3Var, 18);
            case 19:
                return new i3l((n) this.t, (Function1) this.u, rq3Var, 19);
            case 20:
                return new i3l((com.moloco.sdk.internal.ilrd.provider.f) this.t, (l) this.u, rq3Var, 20);
            case 21:
                return new i3l((aeh) this.t, (q0) this.u, rq3Var, 21);
            case 22:
                return new i3l((x) this.t, (c) this.u, rq3Var, 22);
            case 23:
                i3l i3lVar3 = new i3l((k8f) this.u, rq3Var, 23);
                i3lVar3.t = obj;
                return i3lVar3;
            case 24:
                i3l i3lVar4 = new i3l((i) this.u, rq3Var, 24);
                i3lVar4.t = obj;
                return i3lVar4;
            case 25:
                i3l i3lVar5 = new i3l((g6b) this.u, rq3Var, 25);
                i3lVar5.t = obj;
                return i3lVar5;
            case 26:
                i3l i3lVar6 = new i3l((File) this.u, rq3Var, 26);
                i3lVar6.t = obj;
                return i3lVar6;
            case 27:
                i3l i3lVar7 = new i3l((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) this.u, rq3Var, 27);
                i3lVar7.t = obj;
                return i3lVar7;
            case 28:
                i3l i3lVar8 = new i3l((MraidActivity) this.u, rq3Var, 28);
                i3lVar8.t = obj;
                return i3lVar8;
            default:
                return new i3l((o) this.t, (p) this.u, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((i3l) create((oil) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 21:
                ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                return lu3.a;
            case 22:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 23:
                ((i3l) create((ddi) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                return lu3.a;
            case 24:
                return ((i3l) create((k8f) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((i3l) create((k8f) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((i3l) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((i3l) create((k8f) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 28:
                return ((i3l) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.d) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((i3l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0350, code lost:
    
        if (r8.h(r10, r2, r3, r0, r28) == r7) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x038a, code lost:
    
        if (r8.h(r2, r2, r10, r0, r28) == r7) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0477, code lost:
    
        if (r0.e(r28) == r1) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x05fd, code lost:
    
        if (r2 == r3) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0514, code lost:
    
        if (r7 == r3) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x07a3, code lost:
    
        if (r1 == r2) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0786, code lost:
    
        if (r3 == r2) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0838, code lost:
    
        if (r0.c(r2, r28) == r1) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0827, code lost:
    
        if (r3.f(r4, r28) == r1) goto L374;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object P;
        Integer num;
        Object r;
        WeeklyChallengeViewModel weeklyChallengeViewModel;
        Event event;
        TeamSides teamSides;
        Object r2;
        String alpha2;
        String alpha22;
        String str;
        UserAccount e;
        Object c;
        Object d;
        Object r3;
        bgl bglVar;
        Object r4;
        Object f;
        gv9 W;
        Object e2;
        uv3 uv3Var;
        Object value;
        Object obj2;
        h2d h2dVar;
        h2d h2dVar2;
        h2d h2dVar3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.d dVar;
        int i = 27;
        int i2 = 23;
        int i3 = 13;
        int i4 = 3;
        int i5 = 2;
        int i6 = 1;
        rq3 rq3Var = null;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
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
                dhk dhkVar = ((j3l) this.t).f;
                String id = ((UserAccount) this.u).getId();
                this.s = 1;
                Object e3 = dhkVar.e(id, this);
                return e3 == lu3Var ? lu3Var : e3;
            case 1:
                p3l p3lVar = (p3l) this.t;
                Event event2 = p3lVar.j;
                lu3 lu3Var2 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    umd umdVar = p3lVar.g;
                    int id2 = event2.getId();
                    String statusType = event2.getStatusType();
                    boolean shouldReverseTeams = event2.shouldReverseTeams();
                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) this.u;
                    this.s = 1;
                    umdVar.getClass();
                    P = yaa.P(new gmd(umdVar, oddsCountryProvider, statusType, id2, shouldReverseTeams, null), this);
                    if (P == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                AllOddsResponse allOddsResponse = (AllOddsResponse) yaa.x((x2g) P);
                if (allOddsResponse != null) {
                    return allOddsResponse.getMarkets();
                }
                return null;
            case 2:
                WeeklyChallengeViewModel weeklyChallengeViewModel2 = (WeeklyChallengeViewModel) this.u;
                lu3 lu3Var3 = lu3.a;
                int i9 = this.s;
                rq3 rq3Var2 = null;
                if (i9 == 0) {
                    y6a.M(obj);
                    Integer num2 = new Integer(1);
                    this.t = weeklyChallengeViewModel2;
                    this.s = 1;
                    num = null;
                    r = s9a.r(new ajj(weeklyChallengeViewModel2, num2, rq3Var2, rq3Var2, 8), this);
                    if (r == lu3Var3) {
                        return lu3Var3;
                    }
                    weeklyChallengeViewModel = weeklyChallengeViewModel2;
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    weeklyChallengeViewModel = (WeeklyChallengeViewModel) this.t;
                    y6a.M(obj);
                    r = obj;
                    num = null;
                }
                List list = (List) r;
                weeklyChallengeViewModel.q = (list == null || (event = (Event) CollectionsKt.firstOrNull(list)) == null) ? num : new Integer(event.getId());
                fdi fdiVar = weeklyChallengeViewModel2.x;
                Boolean bool = Boolean.TRUE;
                fdiVar.getClass();
                fdiVar.m(num, bool);
                return Unit.a;
            case 3:
                WeeklyChallengeViewModel weeklyChallengeViewModel3 = (WeeklyChallengeViewModel) this.u;
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var4 = lu3.a;
                int i10 = this.s;
                rq3 rq3Var3 = null;
                if (i10 == 0) {
                    y6a.M(obj);
                    Integer num3 = new Integer(3);
                    this.t = ku3Var;
                    this.s = 1;
                    weeklyChallengeViewModel3.getClass();
                    teamSides = null;
                    r2 = s9a.r(new ajj(weeklyChallengeViewModel3, num3, rq3Var3, rq3Var3, 8), this);
                    if (r2 == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    r2 = obj;
                    teamSides = null;
                }
                List<Event> list2 = (List) r2;
                Object obj3 = z3l.a;
                if (list2 != null) {
                    fdi fdiVar2 = weeklyChallengeViewModel3.o;
                    if (!list2.isEmpty()) {
                        Application application = weeklyChallengeViewModel3.b;
                        application.getClass();
                        ArrayList arrayList = new ArrayList(k13.r(list2, 10));
                        for (Event event3 : list2) {
                            event3.getClass();
                            Application application2 = application;
                            y21 J = s9a.J(event3, application2, false, false, null, 30);
                            int id3 = event3.getId();
                            String str2 = J.g.a;
                            String str3 = str2 == null ? "" : str2;
                            jfj jfjVar = J.h;
                            String str4 = (jfjVar == null || (str = jfjVar.a) == null) ? "" : str;
                            int id4 = Event.getHomeTeam$default(event3, teamSides, 1, teamSides).getId();
                            int type = Event.getHomeTeam$default(event3, teamSides, 1, teamSides).getType();
                            Country country = Event.getHomeTeam$default(event3, teamSides, 1, teamSides).getCountry();
                            String str5 = (country == null || (alpha22 = country.getAlpha2()) == null) ? "" : alpha22;
                            String p = tba.p(application2, Event.getHomeTeam$default(event3, teamSides, 1, teamSides));
                            int id5 = Event.getAwayTeam$default(event3, teamSides, 1, teamSides).getId();
                            int type2 = Event.getAwayTeam$default(event3, teamSides, 1, teamSides).getType();
                            Country country2 = Event.getAwayTeam$default(event3, teamSides, 1, teamSides).getCountry();
                            String str6 = (country2 == null || (alpha2 = country2.getAlpha2()) == null) ? "" : alpha2;
                            String K = qea.K(tba.p(application2, Event.getAwayTeam$default(event3, teamSides, 1, teamSides)), event3.shouldReverseTeams());
                            arrayList.add(new edk(id3, str3, str4, id4, type, str5, id5, type2, str6, p, K == null ? "" : K));
                            application = application2;
                        }
                        obj3 = new a4l(arrayList);
                    }
                    fdiVar2.getClass();
                    fdiVar2.m(teamSides, obj3);
                } else {
                    fdi fdiVar3 = weeklyChallengeViewModel3.o;
                    fdiVar3.getClass();
                    fdiVar3.m(teamSides, obj3);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    n7l n7lVar = n7l.a;
                    Context context = (Context) this.t;
                    l7l l7lVar = (l7l) this.u;
                    this.s = 1;
                    if (n7lVar.b(context, l7lVar, this) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i12 = this.s;
                if (i12 != 0) {
                    if (i12 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                h4i h4iVar = new h4i((ArrayList) this.t, (Context) this.u, rq3Var, i);
                this.s = 1;
                Object r5 = s9a.r(h4iVar, this);
                return r5 == lu3Var6 ? lu3Var6 : r5;
            case 6:
                kqf kqfVar = (kqf) this.t;
                View view = (View) this.u;
                Object obj4 = lu3.a;
                int i13 = this.s;
                try {
                    if (i13 == 0) {
                        y6a.M(obj);
                        this.s = 1;
                        Object z = rd0.z(kqfVar.v, new d11(i5, rq3Var, 12), this);
                        if (z != obj4) {
                            z = Unit.a;
                        }
                        if (z == obj4) {
                            return obj4;
                        }
                    } else {
                        if (i13 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    return Unit.a;
                } finally {
                    if (qal.a(view) == kqfVar) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                }
            case 7:
                udl udlVar = (udl) this.t;
                lu3 lu3Var7 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    ia0 ia0Var = ia0.q;
                    e = ok3.p().e();
                    if (e.getIsLoggedIn()) {
                        fyk fykVar = udlVar.g;
                        String id6 = e.getId();
                        this.u = e;
                        this.s = 1;
                        break;
                    }
                    return Unit.a;
                }
                if (i14 != 1) {
                    if (i14 == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e = (UserAccount) this.u;
                y6a.M(obj);
                zte zteVar = udlVar.h;
                String id7 = e.getId();
                this.u = null;
                this.s = 2;
                break;
            case 8:
                lu3 lu3Var8 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    a6e a6eVar = (a6e) this.t;
                    int size = ((gv9) this.u).size() - 1;
                    r7 = size >= 0 ? size : 0;
                    this.s = 1;
                    if (a6e.t(a6eVar, r7, this) == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i15 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 9:
                qkl qklVar = (qkl) this.u;
                oil oilVar = (oil) this.t;
                lu3 lu3Var9 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    kgl kglVar = qklVar.x;
                    this.t = oilVar;
                    this.s = 1;
                    c = kglVar.c(this);
                    break;
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        d = obj;
                        if (((Boolean) d).booleanValue()) {
                            qklVar.k(oel.a);
                        }
                        return Unit.a;
                    }
                    y6a.M(obj);
                    c = obj;
                }
                if (((Boolean) c).booleanValue()) {
                    qklVar.k(nel.a);
                    return Unit.a;
                }
                kgl kglVar2 = qklVar.x;
                xxi xxiVar = oilVar.w;
                this.t = null;
                this.s = 2;
                d = kglVar2.d(xxiVar, this);
                break;
            case 10:
                lu3 lu3Var10 = lu3.a;
                int i17 = this.s;
                if (i17 != 0) {
                    if (i17 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                qkl qklVar2 = (qkl) this.t;
                OddsCountryProvider oddsCountryProvider2 = (OddsCountryProvider) this.u;
                this.s = 1;
                Object v = qklVar2.v(oddsCountryProvider2, this);
                return v == lu3Var10 ? lu3Var10 : v;
            case 11:
                rxa rxaVar = (rxa) this.u;
                qkl qklVar3 = (qkl) this.t;
                lu3 lu3Var11 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    qklVar3.n(null, new qdj(rxaVar, i2));
                    aya ayaVar = qklVar3.r;
                    this.s = 1;
                    ayaVar.getClass();
                    r3 = s9a.r(new zxa(16, (rq3) null, rxaVar, ayaVar), this);
                    if (r3 == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    r3 = obj;
                }
                qklVar3.n(null, new qdj((sxa) r3, 24));
                return Unit.a;
            case 12:
                qkl qklVar4 = (qkl) this.t;
                lu3 lu3Var12 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    oil oilVar2 = (oil) qklVar4.l().a();
                    if (oilVar2 == null || (bglVar = oilVar2.y) == null) {
                        bglVar = bgl.c;
                    }
                    this.s = 1;
                    if (qklVar4.B(bglVar, this) == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i19 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                qklVar4.n(null, new bcl(11, qklVar4, (xil) this.u));
                return Unit.a;
            case 13:
                qkl qklVar5 = (qkl) this.t;
                lu3 lu3Var13 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    fdl fdlVar = new fdl((ArrayList) this.u, qklVar5, rq3Var, 4);
                    this.s = 1;
                    r4 = s9a.r(fdlVar, this);
                    if (r4 == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    r4 = obj;
                }
                qklVar5.n(null, new pph(tub.o((Iterable) r4), i4));
                return Unit.a;
            case 14:
                ill illVar = (ill) this.u;
                lu3 lu3Var14 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    j0j j0jVar = illVar.l;
                    this.s = 1;
                    f = j0jVar.f(this);
                    break;
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        W = (gv9) this.t;
                        y6a.M(obj);
                        e2 = obj;
                        String str7 = (String) e2;
                        if (str7 == null || str7.length() <= 0) {
                            str7 = null;
                        }
                        if (str7 != null) {
                            Iterator<E> it = W.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (Intrinsics.c(((uv3) obj2).b, str7)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            uv3Var = (uv3) obj2;
                        } else {
                            uv3Var = null;
                        }
                        fdi fdiVar4 = illVar.e;
                        do {
                            value = fdiVar4.getValue();
                        } while (!fdiVar4.k(value, new unb(new gll(W, uv3Var, null, null))));
                        if (uv3Var != null) {
                            g9i g9iVar = illVar.o;
                            if (g9iVar != null) {
                                g9iVar.e(null);
                            }
                            illVar.o = xw3.L(un0.z(illVar), null, null, new ajj(illVar, uv3Var, rq3Var, i3), 3);
                        }
                        return Unit.a;
                    }
                    y6a.M(obj);
                    f = obj;
                }
                Iterable iterable = (Iterable) f;
                ArrayList arrayList2 = new ArrayList(k13.r(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    w1l.A(arrayList2, ((Team) it2.next()).getId());
                }
                HashSet Q0 = CollectionsKt.Q0(arrayList2);
                vel velVar = vel.a;
                Map a = vel.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : a.entrySet()) {
                    if (Q0.contains(new Integer(((Number) entry.getValue()).intValue()))) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Set keySet = linkedHashMap.keySet();
                vel velVar2 = vel.a;
                Set keySet2 = vel.a().keySet();
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = keySet2.iterator();
                while (it3.hasNext()) {
                    com.sofascore.model.Country a2 = dv3.a((String) it3.next());
                    uv3 uv3Var2 = a2 != null ? new uv3(a2.getName(), a2.getIso2Alpha(), keySet.contains(a2.getIso2Alpha())) : null;
                    if (uv3Var2 != null) {
                        arrayList3.add(uv3Var2);
                    }
                }
                Comparator thenComparing = new z(8).thenComparing(new rs2(new vn6(i, Collator.getInstance(Locale.getDefault()), illVar.i()), i5));
                thenComparing.getClass();
                W = l6g.W(CollectionsKt.H0(arrayList3, thenComparing));
                cg4 cg4Var = illVar.m;
                this.t = W;
                this.s = 2;
                e2 = cg4Var.e("WC_26_MY_TEAM_ALPHA2", null, this);
                break;
            case 15:
                Context context2 = ((f) this.u).c;
                lu3 lu3Var15 = lu3.a;
                int i22 = this.s;
                try {
                } catch (IllegalStateException unused) {
                    mqi mqiVar = com.moloco.sdk.acm.services.c.a;
                    com.moloco.sdk.acm.services.c.c("MetricsDb", "Unable to create metrics db", 8);
                    b.h.set(k.c);
                } catch (Exception unused2) {
                    mqi mqiVar2 = com.moloco.sdk.acm.services.c.a;
                    com.moloco.sdk.acm.services.c.c("AndroidClientMetrics", "Initialization error", 8);
                    b.h.set(k.c);
                }
                try {
                    if (i22 == 0) {
                        y6a.M(obj);
                        com.moloco.sdk.acm.db.j b = MetricsDb.a.e(context2).b();
                        com.facebook.b bVar = new com.facebook.b(14);
                        b bVar2 = b.a;
                        com.moloco.sdk.acm.j jVar = b.d;
                        if (jVar == null) {
                            Intrinsics.i("opsConfig");
                            throw null;
                        }
                        t tVar = new t(jVar, context2);
                        com.moloco.sdk.acm.j jVar2 = b.d;
                        if (jVar2 == null) {
                            Intrinsics.i("opsConfig");
                            throw null;
                        }
                        ad2 ad2Var = b.g;
                        b.k = new com.moloco.sdk.acm.eventprocessing.f(tVar, jVar2, ad2Var);
                        b.c = new i(b8f.i.f, new a(tVar, ad2Var, new t(context2)));
                        com.moloco.sdk.acm.eventprocessing.f fVar = b.k;
                        if (fVar == null) {
                            Intrinsics.i("requestScheduler");
                            throw null;
                        }
                        i iVar = b.c;
                        if (iVar == null) {
                            Intrinsics.i("applicationLifecycleTracker");
                            throw null;
                        }
                        b.b = new i(b, bVar, fVar, iVar);
                        b.h.set(k.a);
                        h2dVar = b.f;
                        this.t = h2dVar;
                        this.s = 1;
                        break;
                    } else {
                        if (i22 != 1) {
                            if (i22 != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            h2dVar3 = (h2d) this.t;
                            try {
                                y6a.M(obj);
                                Unit unit = Unit.a;
                                h2dVar2 = h2dVar3;
                                h2dVar2.f(null);
                                xw3.L(b.g, null, null, new luj(i5, rq3Var), 3);
                                return Unit.a;
                            } catch (Throwable th) {
                                th = th;
                                h2dVar3.f(null);
                                throw th;
                            }
                        }
                        h2dVar = (h2d) this.t;
                        y6a.M(obj);
                    }
                    com.moloco.sdk.acm.i iVar2 = b.e;
                    if (iVar2 != null) {
                        b bVar3 = b.a;
                        b.e = null;
                        mqi mqiVar3 = com.moloco.sdk.acm.services.c.a;
                        com.moloco.sdk.acm.services.c.b("AndroidClientMetrics", "Updating config with pending config");
                        this.t = h2dVar2;
                        this.s = 2;
                        if (b.d(iVar2, this) != lu3Var15) {
                            h2dVar3 = h2dVar2;
                            Unit unit2 = Unit.a;
                            h2dVar2 = h2dVar3;
                        }
                        return lu3Var15;
                    }
                    h2dVar2.f(null);
                    xw3.L(b.g, null, null, new luj(i5, rq3Var), 3);
                    return Unit.a;
                } catch (Throwable th2) {
                    th = th2;
                    h2dVar3 = h2dVar2;
                    h2dVar3.f(null);
                    throw th;
                }
                h2dVar2 = h2dVar;
            case 16:
                lu3 lu3Var16 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    i iVar3 = (i) this.t;
                    d dVar2 = (d) this.u;
                    String str8 = dVar2.b;
                    com.moloco.sdk.acm.db.c cVar = com.moloco.sdk.acm.db.c.b;
                    long j = dVar2.c;
                    ArrayList arrayList4 = dVar2.a;
                    ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(com.facebook.appevents.n.f((com.moloco.sdk.acm.e) it4.next()));
                    }
                    this.s = 1;
                    if (iVar3.h(str8, cVar, j, arrayList5, this) == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i23 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 17:
                h hVar = (h) this.t;
                lu3 lu3Var17 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    long j2 = hVar.b;
                    ArrayList arrayList6 = hVar.c;
                    i iVar4 = (i) this.u;
                    String str9 = hVar.d;
                    if (j2 > 0) {
                        com.moloco.sdk.acm.db.c cVar2 = com.moloco.sdk.acm.db.c.a;
                        ArrayList arrayList7 = new ArrayList(k13.r(arrayList6, 10));
                        Iterator it5 = arrayList6.iterator();
                        while (it5.hasNext()) {
                            arrayList7.add(com.facebook.appevents.n.f((com.moloco.sdk.acm.e) it5.next()));
                        }
                        this.s = 1;
                        break;
                    } else {
                        String q = dmi.q("negative_time_", str9);
                        com.moloco.sdk.acm.db.c cVar3 = com.moloco.sdk.acm.db.c.a;
                        long j3 = hVar.b;
                        ArrayList arrayList8 = new ArrayList(k13.r(arrayList6, 10));
                        Iterator it6 = arrayList6.iterator();
                        while (it6.hasNext()) {
                            arrayList8.add(com.facebook.appevents.n.f((com.moloco.sdk.acm.e) it6.next()));
                        }
                        this.s = 2;
                        break;
                    }
                } else {
                    if (i24 != 1 && i24 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 18:
                lu3 lu3Var18 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    j jVar3 = (j) this.t;
                    String c2 = yea.d.c(com.moloco.sdk.internal.ilrd.i.Companion.serializer(), new com.moloco.sdk.internal.ilrd.i(jVar3.c(), jVar3.b(), jVar3.f, jVar3.d));
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Storing current session: ".concat(c2), null, false, 12, null);
                    com.moloco.sdk.internal.services.e eVar = ((e) this.u).l;
                    this.s = 1;
                    if (eVar.b("ilrd_session_store", c2, this) == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i25 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 19:
                lu3 lu3Var19 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdScheduler", mz1.o(new StringBuilder("Task "), (String) ((n) this.t).d, " invoked"), null, false, 12, null);
                    Function1 function1 = (Function1) this.u;
                    this.s = 1;
                    if (function1.invoke(this) == lu3Var19) {
                        return lu3Var19;
                    }
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 20:
                lu3 lu3Var20 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    aeh aehVar = ((com.moloco.sdk.internal.ilrd.provider.f) this.t).g;
                    l lVar = (l) this.u;
                    this.s = 1;
                    if (aehVar.emit(lVar, this) == lu3Var20) {
                        return lu3Var20;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 21:
                lu3 lu3Var21 = lu3.a;
                int i28 = this.s;
                if (i28 != 0) {
                    if (i28 == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                aeh aehVar2 = (aeh) this.t;
                o0 o0Var = new o0((q0) this.u, r7);
                this.s = 1;
                aehVar2.collect(o0Var, this);
                return lu3Var21;
            case 22:
                lu3 lu3Var22 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    x.d("[Thread: " + Thread.currentThread().getName() + "] Fetching token from server");
                    x xVar = (x) this.t;
                    c cVar4 = (c) this.u;
                    m mVar = com.moloco.sdk.internal.services.bidtoken.f.b;
                    this.s = 1;
                    if (xVar.a(cVar4, mVar, true, true, this) == lu3Var22) {
                        return lu3Var22;
                    }
                } else {
                    if (i29 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x.d("[Thread: " + Thread.currentThread().getName() + "] Finished fetching token from server");
                return Unit.a;
            case 23:
                lu3 lu3Var23 = lu3.a;
                int i30 = this.s;
                if (i30 == 0) {
                    y6a.M(obj);
                    ddi ddiVar = (ddi) this.t;
                    o0 o0Var2 = new o0((k8f) this.u, i6);
                    this.s = 1;
                    if (ddiVar.collect(o0Var2, this) == lu3Var23) {
                        return lu3Var23;
                    }
                } else {
                    if (i30 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 24:
                lu3 lu3Var24 = lu3.a;
                int i31 = this.s;
                if (i31 == 0) {
                    y6a.M(obj);
                    k8f k8fVar = (k8f) this.t;
                    fdi fdiVar5 = (fdi) ((i) this.u).c;
                    i3l i3lVar = new i3l(k8fVar, rq3Var, i2);
                    this.s = 1;
                    if (fcp.c0(fdiVar5, i3lVar, this) == lu3Var24) {
                        return lu3Var24;
                    }
                } else {
                    if (i31 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 25:
                g6b g6bVar = (g6b) this.u;
                lu3 lu3Var25 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    final k8f k8fVar2 = (k8f) this.t;
                    p6b p6bVar = new p6b() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t
                        @Override // defpackage.p6b
                        public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
                            int i33 = u.a[d6bVar.ordinal()];
                            k8f k8fVar3 = k8f.this;
                            if (i33 == 1) {
                                ((j8f) k8fVar3).e.d(Boolean.FALSE);
                            } else if (i33 != 2) {
                                Unit unit3 = Unit.a;
                            } else {
                                ((j8f) k8fVar3).e.d(Boolean.TRUE);
                            }
                        }
                    };
                    g6bVar.a(p6bVar);
                    com.moloco.sdk.internal.b bVar4 = new com.moloco.sdk.internal.b(i4, g6bVar, p6bVar);
                    this.s = 1;
                    if (v7a.i(k8fVar2, bVar4, this) == lu3Var25) {
                        return lu3Var25;
                    }
                } else {
                    if (i32 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 26:
                lu3 lu3Var26 = lu3.a;
                int i33 = this.s;
                if (i33 == 0) {
                    y6a.M(obj);
                    b98 b98Var = (b98) this.t;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d dVar3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d((File) this.u);
                    this.s = 1;
                    if (b98Var.emit(dVar3, this) == lu3Var26) {
                        return lu3Var26;
                    }
                } else {
                    if (i33 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 27:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) this.u;
                lu3 lu3Var27 = lu3.a;
                int i34 = this.s;
                if (i34 == 0) {
                    y6a.M(obj);
                    k8f k8fVar3 = (k8f) this.t;
                    cVar5.c = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a(k8fVar3, r7);
                    cVar5.d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b(k8fVar3, 0);
                    cVar5.e = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b(k8fVar3, 1);
                    com.moloco.sdk.acm.services.d dVar4 = new com.moloco.sdk.acm.services.d(cVar5, i3);
                    this.s = 1;
                    if (v7a.i(k8fVar3, dVar4, this) == lu3Var27) {
                        return lu3Var27;
                    }
                } else {
                    if (i34 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 28:
                MraidActivity mraidActivity = (MraidActivity) this.u;
                lu3 lu3Var28 = lu3.a;
                int i35 = this.s;
                if (i35 == 0) {
                    y6a.M(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.d dVar5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.d) this.t;
                    aeh aehVar3 = MraidActivity.h;
                    this.t = dVar5;
                    this.s = 1;
                    if (aehVar3.emit(dVar5, this) == lu3Var28) {
                        return lu3Var28;
                    }
                    dVar = dVar5;
                } else {
                    if (i35 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.d) this.t;
                    y6a.M(obj);
                }
                if (dVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f.i.invoke();
                } else {
                    aeh aehVar4 = MraidActivity.h;
                    if (dVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.c) {
                        mraidActivity.finish();
                    } else if (Intrinsics.c(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.d)) {
                        mraidActivity.f = true;
                        mraidActivity.finish();
                    }
                }
                return Unit.a;
            default:
                lu3 lu3Var29 = lu3.a;
                int i36 = this.s;
                if (i36 == 0) {
                    y6a.M(obj);
                    aeh aehVar5 = ((o) this.t).f;
                    p pVar = (p) this.u;
                    this.s = 1;
                    if (aehVar5.emit(pVar, this) == lu3Var29) {
                        return lu3Var29;
                    }
                } else {
                    if (i36 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3l(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3l(udl udlVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 7;
        this.t = udlVar;
    }
}
