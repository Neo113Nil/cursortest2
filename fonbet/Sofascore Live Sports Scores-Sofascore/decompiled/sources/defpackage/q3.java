package defpackage;

import android.graphics.drawable.AnimatedVectorDrawable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.tasks.Task;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.fantasy.BasicTeam;
import com.sofascore.model.fantasy.FantasyCompetition;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyRound;
import com.sofascore.model.fantasy.FantasyUserCompetition;
import com.sofascore.model.fantasy.FantasyUserRound;
import com.sofascore.model.mvvm.model.BaseballInningInfo;
import com.sofascore.model.newNetwork.commentary.BaseballActionOutcome;
import com.sofascore.model.newNetwork.commentary.Comment;
import com.sofascore.model.newNetwork.statistics.BaseballPitch;
import com.sofascore.model.newNetwork.statistics.BaseballPitchesResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.buzzer.BuzzerActivity;
import com.sofascore.results.calendar.CalendarView;
import com.sofascore.results.crowdsourcing.CrowdsourcingDeleteIncidentModal;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.mvvm.base.AbstractFragment;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q3 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                return new q3((AbstractFragment) obj2, rq3Var, 0);
            case 1:
                return new q3((r3) obj2, rq3Var, 1);
            case 2:
                return new q3((ij) obj2, rq3Var, 2);
            case 3:
                return new q3((zj0) obj2, rq3Var, 3);
            case 4:
                return new q3((ucd) obj2, rq3Var, 4);
            case 5:
                return new q3((BaseActivity) obj2, rq3Var, 5);
            case 6:
                return new q3((String) obj2, rq3Var, 6);
            case 7:
                return new q3((q81) obj2, rq3Var, 7);
            case 8:
                return new q3((su1) obj2, rq3Var, 8);
            case 9:
                return new q3((dv1) obj2, rq3Var, 9);
            case 10:
                return new q3((ox9) obj2, rq3Var, 10);
            case 11:
                return new q3((ky1) obj2, rq3Var, 11);
            case 12:
                return new q3((db2) obj2, rq3Var, 12);
            case 13:
                return new q3((BuzzerActivity) obj2, rq3Var, 13);
            case 14:
                return new q3((k92) obj2, rq3Var, 14);
            case 15:
                return new q3((CalendarView) obj2, rq3Var, 15);
            case 16:
                return new q3((Task) obj2, rq3Var, 16);
            case 17:
                q3 q3Var = new q3((CrowdsourcingDeleteIncidentModal) obj2, rq3Var, 17);
                q3Var.s = ((Number) obj).intValue();
                return q3Var;
            case 18:
                return new q3((u84) obj2, rq3Var, 18);
            case 19:
                return new q3((jo4) obj2, rq3Var, 19);
            case 20:
                return new q3((EventActivity) obj2, rq3Var, 20);
            case 21:
                return new q3((xs5) obj2, rq3Var, 21);
            case 22:
                return new q3((esf) obj2, rq3Var, 22);
            case 23:
                return new q3((ov5) obj2, rq3Var, 23);
            case 24:
                return new q3((nc6) obj2, rq3Var, 24);
            case 25:
                return new q3((yv6) obj2, rq3Var, 25);
            case 26:
                return new q3((kw6) obj2, rq3Var, 26);
            case 27:
                return new q3((ax6) obj2, rq3Var, 27);
            case 28:
                return new q3((ay6) obj2, rq3Var, 28);
            default:
                return new q3((y07) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 4:
                q3 q3Var = (q3) create((ku3) obj, (rq3) obj2);
                Unit unit = Unit.a;
                q3Var.invokeSuspend(unit);
                break;
            case 17:
                break;
        }
        return ((q3) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x03a1, code lost:
    
        if (r2.emit(r3, r59) == r1) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0363, code lost:
    
        if (r2 == r1) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x08ec, code lost:
    
        if (kotlin.Unit.a == r2) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x083a, code lost:
    
        if (r3 == r2) goto L390;
     */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [kotlin.coroutines.CoroutineContext, nu3, rq3] */
    /* JADX WARN: Type inference failed for: r15v13 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object P;
        Object R;
        Object b;
        ArrayList arrayList;
        Object obj2;
        List<BaseballPitch> pitches;
        String str;
        ?? r15;
        Object obj3;
        wyf a;
        Object e;
        List<String> countries;
        Object e2;
        Long l;
        Object b2;
        Object R2;
        Object value;
        uj7 uj7Var;
        tee X;
        Object U;
        int i = this.r;
        int i2 = 21;
        int i3 = 18;
        int i4 = 5;
        int i5 = 13;
        int i6 = 10;
        Object obj4 = this.t;
        boolean z = true;
        z = true;
        z = true;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(500L, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                SwipeRefreshLayout swipeRefreshLayout = ((AbstractFragment) obj4).d;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((r3) obj4).invoke(this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    umd umdVar = ((ij) obj4).m;
                    String c = dv3.c();
                    this.s = 1;
                    umdVar.getClass();
                    P = yaa.P(new cmd(z ? 1 : 0, null, umdVar, c), this);
                    if (P == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                return yaa.x((x2g) P);
            case 3:
                zj0 zj0Var = (zj0) obj4;
                lu3 lu3Var4 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    pog y = sea.y(new w1(zj0Var, 9));
                    rq3 rq3Var = null;
                    l0 l0Var = new l0(zj0Var, rq3Var, 16);
                    int i11 = la8.a;
                    zn2 a2 = la8.a(y, new c37(l0Var, rq3Var, z ? 1 : 0));
                    tj0 tj0Var = new tj0(zj0Var, 0);
                    this.s = 1;
                    if (a2.collect(tj0Var, this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    throw null;
                }
                if (i12 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                BaseActivity baseActivity = (BaseActivity) obj4;
                lu3 lu3Var6 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    g6b lifecycle = baseActivity.getLifecycle();
                    e6b e6bVar = e6b.d;
                    l0 l0Var2 = new l0(baseActivity, null, i3);
                    this.s = 1;
                    if (b6a.z(lifecycle, e6bVar, l0Var2, this) == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    by9 by9Var = new by9(new jod());
                    hs4 hs4Var = z45.a;
                    l2a l2aVar = new l2a(by9Var, new sz8(hq4.c));
                    this.s = 1;
                    R = xw3.R((CoroutineContext) l2aVar.d, new gje(l2aVar, (String) obj4, null, i2), this);
                    if (R == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    R = obj;
                }
                return ((y8g) R).g;
            case 7:
                q81 q81Var = (q81) obj4;
                Comment comment = q81Var.j;
                lu3 lu3Var8 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    s96 s96Var = q81Var.e;
                    int i16 = q81Var.f;
                    int i17 = q81Var.i;
                    this.s = 1;
                    b = s96Var.b(i16, i17, this);
                    break;
                } else {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    b = obj;
                }
                BaseballPitchesResponse baseballPitchesResponse = (BaseballPitchesResponse) b;
                if (baseballPitchesResponse == null || (pitches = baseballPitchesResponse.getPitches()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (Object obj5 : pitches) {
                        if (((BaseballPitch) obj5).isPitch()) {
                            arrayList.add(obj5);
                        }
                    }
                }
                BaseballInningInfo inningInfo = comment.getInningInfo();
                BaseballActionOutcome actionOutcome = comment.getActionOutcome();
                Integer homeScore$default = Comment.getHomeScore$default(comment, null, 1, null);
                Integer awayScore$default = Comment.getAwayScore$default(comment, null, 1, null);
                if (arrayList != null && inningInfo != null && actionOutcome != null && homeScore$default != null && awayScore$default != null) {
                    int intValue = awayScore$default.intValue();
                    int intValue2 = homeScore$default.intValue();
                    int i18 = q81Var.g;
                    String str2 = q81Var.h;
                    String text = comment.getText();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((BaseballPitch) obj2).getHitterHand() != null) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    BaseballPitch baseballPitch = (BaseballPitch) obj2;
                    pl0 pl0Var = new pl0(i18, str2, inningInfo, text, actionOutcome, intValue2, intValue, baseballPitch != null ? baseballPitch.getHitterHand() : null, q81Var.k, q81Var.l);
                    fdi fdiVar = q81Var.m;
                    gv9 W = l6g.W(arrayList);
                    yea yeaVar = j58.a;
                    unb unbVar = new unb(new l81(pl0Var, W, fn0.B("baseball_pbp_show_win_probability")));
                    this.s = 2;
                    fdiVar.getClass();
                    fdiVar.m(null, unbVar);
                    break;
                }
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    cg4 cg4Var = ((su1) obj4).f;
                    long currentTimeMillis = System.currentTimeMillis();
                    this.s = 1;
                    if (cg4Var.h("pref_bet_boost_last_interaction_timestamp", currentTimeMillis, this) == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i19 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 9:
                dv1 dv1Var = (dv1) obj4;
                OddsCountryProvider oddsCountryProvider = dv1Var.h;
                lu3 lu3Var10 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    umd umdVar2 = dv1Var.e;
                    zu1 zu1Var = zu1.c;
                    this.s = 1;
                    umdVar2.getClass();
                    str = null;
                    if (s9a.r(new gjb(umdVar2, oddsCountryProvider, false ? 1 : 0, i2), this) == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    str = null;
                }
                dv1Var.i.j(new Integer(OddsProvider.getOddsDisplayProviderId$default(oddsCountryProvider.getProvider(), str, 1, str)));
                return Unit.a;
            case 10:
                ox9 ox9Var = (ox9) obj4;
                lu3 lu3Var11 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    ox9Var.getClass();
                    this.s = 1;
                    if (n4o.y(5000L, this) == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i21 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                if (((fu3) ox9Var.b).c <= 0) {
                    yda ydaVar = (yda) ox9Var.f;
                    if (ydaVar != null) {
                        ydaVar.e(null);
                    }
                    ox9Var.f = null;
                }
                return Unit.a;
            case 11:
                ky1 ky1Var = (ky1) obj4;
                lu3 lu3Var12 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    ky1Var.k--;
                    this.s = 1;
                    if (n4o.y(64L, this) == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ky1Var.l();
                cjb.a("Retrying start() for Nimbus Ad: " + ky1Var.f.position());
                return Unit.a;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object g = ((db2) obj4).g(1, this);
                    return g == lu3Var13 ? lu3Var13 : g;
                }
                if (i23 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                lu3 lu3Var14 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    wd5 wd5Var = xd5.b;
                    long Q = wkn.Q(0.5d, be5.SECONDS);
                    this.s = 1;
                    if (n4o.z(Q, this) == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i24 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                int i25 = BuzzerActivity.O;
                ((BuzzerActivity) obj4).Q().c.setRefreshing(false);
                return Unit.a;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    i92 i92Var = ((k92) obj4).e;
                    this.s = 1;
                    c92 c92Var = i92Var.b;
                    c92Var.getClass();
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    calendar.add(5, -30);
                    Object U2 = gz8.U(this, c92Var.b.a, false, true, new yz(calendar.getTimeInMillis() / 1000, 6));
                    Object obj6 = U2;
                    if (U2 != lu3Var15) {
                        obj6 = Unit.a;
                    }
                    if (obj6 != lu3Var15) {
                        obj6 = Unit.a;
                    }
                    if (obj6 != lu3Var15) {
                        obj6 = Unit.a;
                    }
                    if (obj6 == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(200L, this) == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ((CalendarView) obj4).a(true);
                return Unit.a;
            case 16:
                lu3 lu3Var17 = lu3.a;
                int i28 = this.s;
                if (i28 != 0) {
                    if (i28 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                this.s = 1;
                oog oogVar = new oog(z9a.b(this));
                ((Task) obj4).addOnCompleteListener(new j0l(oogVar, 17));
                Object b3 = oogVar.b();
                return b3 == lu3Var17 ? lu3Var17 : b3;
            case 17:
                int i29 = this.s;
                lu3 lu3Var18 = lu3.a;
                y6a.M(obj);
                CrowdsourcingDeleteIncidentModal crowdsourcingDeleteIncidentModal = (CrowdsourcingDeleteIncidentModal) obj4;
                tr3 tr3Var = (tr3) crowdsourcingDeleteIncidentModal.B.getValue();
                fdi fdiVar2 = tr3Var.t;
                while (true) {
                    Object value2 = fdiVar2.getValue();
                    int i30 = 3;
                    if (value2 instanceof e0a) {
                        e0a e0aVar = (e0a) value2;
                        gv9 gv9Var = e0aVar.a;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj7 : gv9Var) {
                            if (((wyf) obj7).a.getId() != i29) {
                                arrayList2.add(obj7);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, i6));
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(((wyf) it2.next()).a);
                        }
                        Integer M = z8e.M(arrayList3, new q73(8));
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj8 : gv9Var) {
                            if (((wyf) obj8).a.getId() != i29) {
                                arrayList4.add(obj8);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, i6));
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            wyf wyfVar = (wyf) it3.next();
                            EventSuggest.IncidentSuggest incidentSuggest = wyfVar.a;
                            if (incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                                a = wyf.a(wyfVar, null, M, 3);
                            } else {
                                if (!(incidentSuggest instanceof EventSuggest.IncidentSuggest.CardSuggest)) {
                                    zzl.b();
                                    return null;
                                }
                                a = wyf.a(wyfVar, null, z8e.M(arrayList3, new ox1((EventSuggest.IncidentSuggest.CardSuggest) incidentSuggest, 26)), 3);
                            }
                            arrayList5.add(a);
                        }
                        r15 = 0;
                        obj3 = e0a.b(e0aVar, l6g.W(arrayList5), null, false, 30);
                    } else {
                        r15 = 0;
                        obj3 = value2;
                    }
                    if (fdiVar2.k(value2, obj3)) {
                        tr3Var.v();
                        xw3.L(un0.z(tr3Var), r15, r15, new xq3(tr3Var, r15, i30), 3);
                        ny nyVar = crowdsourcingDeleteIncidentModal.E;
                        if (nyVar != null) {
                            nyVar.invoke();
                        }
                        crowdsourcingDeleteIncidentModal.j();
                        return Unit.a;
                    }
                    i6 = 10;
                }
            case 18:
                u84 u84Var = (u84) obj4;
                lu3 lu3Var19 = lu3.a;
                int i31 = this.s;
                if (i31 == 0) {
                    y6a.M(obj);
                    aa8 n = pd0.n(sea.y(new h63(u84Var, i5)), 1);
                    f10 f10Var = new f10(u84Var, i4);
                    this.s = 1;
                    Object collect = n.collect(new vj0(f10Var, i3), this);
                    if (collect != lu3Var19) {
                        collect = Unit.a;
                    }
                    if (collect == lu3Var19) {
                        return lu3Var19;
                    }
                } else {
                    if (i31 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 19:
                jo4 jo4Var = (jo4) obj4;
                lu3 lu3Var20 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    dsf dsfVar = new dsf();
                    dsf dsfVar2 = new dsf();
                    dsf dsfVar3 = new dsf();
                    z88 b4 = jo4Var.o.b();
                    yn2 yn2Var = new yn2(dsfVar, dsfVar2, dsfVar3, jo4Var, 3);
                    this.s = 1;
                    if (b4.collect(yn2Var, this) == lu3Var20) {
                        return lu3Var20;
                    }
                } else {
                    if (i32 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 20:
                lu3 lu3Var21 = lu3.a;
                int i33 = this.s;
                if (i33 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(1000L, this) == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i33 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                wxf wxfVar = EventActivity.h0;
                AnimatedVectorDrawable S = ((EventActivity) obj4).S();
                if (S != null) {
                    S.start();
                }
                return Unit.a;
            case 21:
                lu3 lu3Var22 = lu3.a;
                int i34 = this.s;
                if (i34 == 0) {
                    y6a.M(obj);
                    bli bliVar = ((xs5) obj4).n;
                    this.s = 1;
                    if (bliVar.j(this) == lu3Var22) {
                        return lu3Var22;
                    }
                } else {
                    if (i34 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 22:
                lu3 lu3Var23 = lu3.a;
                int i35 = this.s;
                if (i35 == 0) {
                    y6a.M(obj);
                    long j = ((esf) obj4).a;
                    this.s = 1;
                    if (n4o.y(j, this) == lu3Var23) {
                        return lu3Var23;
                    }
                } else {
                    if (i35 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 23:
                lu3 lu3Var24 = lu3.a;
                int i36 = this.s;
                if (i36 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((ov5) obj4).v(this) == lu3Var24) {
                        return lu3Var24;
                    }
                } else {
                    if (i36 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 24:
                lu3 lu3Var25 = lu3.a;
                int i37 = this.s;
                if (i37 != 0) {
                    if (i37 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                r3 r3Var = new r3((nc6) obj4, null, i6);
                this.s = 1;
                Object P2 = yaa.P(r3Var, this);
                return P2 == lu3Var25 ? lu3Var25 : P2;
            case 25:
                yv6 yv6Var = (yv6) obj4;
                lu3 lu3Var26 = lu3.a;
                int i38 = this.s;
                if (i38 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = yv6Var.e;
                    pv6 pv6Var = yv6Var.h;
                    if (pv6Var == null) {
                        Intrinsics.i("deepLinkData");
                        throw null;
                    }
                    int i39 = pv6Var.a;
                    this.s = 1;
                    e = wi7Var.e(i39, this);
                    break;
                } else {
                    if (i38 != 1) {
                        if (i38 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    e = obj;
                }
                FantasyCompetition fantasyCompetition = (FantasyCompetition) e;
                if (fantasyCompetition != null && (countries = fantasyCompetition.getCountries()) != null) {
                    if (countries.isEmpty()) {
                        countries = null;
                    }
                    if (countries != null) {
                        z = countries.contains(dv3.c());
                    }
                }
                ev6 N = fantasyCompetition != null ? fkf.N(fantasyCompetition, yv6Var.i()) : null;
                yv6Var.j = N;
                aeh aehVar = yv6Var.f;
                Object obj9 = (N == null || !z) ? vv6.a : uv6.a;
                this.s = 2;
                break;
            case 26:
                kw6 kw6Var = (kw6) obj4;
                lu3 lu3Var27 = lu3.a;
                int i40 = this.s;
                if (i40 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var2 = kw6Var.e;
                    int i41 = kw6Var.f;
                    this.s = 1;
                    e2 = wi7Var2.e(i41, this);
                    if (e2 == lu3Var27) {
                        return lu3Var27;
                    }
                } else {
                    if (i40 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    e2 = obj;
                }
                FantasyCompetition fantasyCompetition2 = (FantasyCompetition) e2;
                if (fantasyCompetition2 != null) {
                    if (fantasyCompetition2.getCurrentRound().getDeadlineTimestamp() > yaa.w()) {
                        l = fantasyCompetition2.getCurrentRound().getRevealTimestamp();
                    } else {
                        FantasyRound nextRound = fantasyCompetition2.getNextRound();
                        if (nextRound != null) {
                            l = nextRound.getRevealTimestamp();
                        }
                    }
                    ((eoh) kw6Var.g).setValue(l);
                    return Unit.a;
                }
                l = null;
                ((eoh) kw6Var.g).setValue(l);
                return Unit.a;
            case 27:
                ax6 ax6Var = (ax6) obj4;
                lu3 lu3Var28 = lu3.a;
                int i42 = this.s;
                if (i42 == 0) {
                    y6a.M(obj);
                    ky6 ky6Var = ax6Var.e;
                    int i43 = ax6Var.f;
                    this.s = 1;
                    b2 = ky6Var.b(i43, this);
                    if (b2 == lu3Var28) {
                        return lu3Var28;
                    }
                } else {
                    if (i42 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    b2 = obj;
                }
                xbb b5 = a.b();
                for (e47 e47Var : (List) b2) {
                    String str3 = e47Var.a;
                    int i44 = e47Var.b;
                    ArrayList arrayList6 = e47Var.c;
                    b5.add(new tj5(str3, i44));
                    ArrayList arrayList7 = new ArrayList(k13.r(arrayList6, 10));
                    Iterator it4 = arrayList6.iterator();
                    while (it4.hasNext()) {
                        wn1 wn1Var = (wn1) it4.next();
                        arrayList7.add(new sj5(wn1Var.a, new BasicTeam(wn1Var.b, wn1Var.d, wn1Var.e, null), new BasicTeam(wn1Var.c, wn1Var.g, wn1Var.h, null), wn1Var.p));
                    }
                    b5.addAll(arrayList7);
                }
                xbb a3 = a.a(b5);
                ax6Var.k().getClass();
                a3.getClass();
                ((eoh) ax6Var.h).setValue(new rj5(a3, false));
                return Unit.a;
            case 28:
                ay6 ay6Var = (ay6) obj4;
                lu3 lu3Var29 = lu3.a;
                int i45 = this.s;
                if (i45 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var3 = ay6Var.e;
                    String id = ay6Var.f.b().getId();
                    this.s = 1;
                    R2 = wi7Var3.R(id, this);
                    if (R2 == lu3Var29) {
                        return lu3Var29;
                    }
                } else {
                    if (i45 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    R2 = obj;
                }
                Iterable iterable = (Iterable) R2;
                ArrayList arrayList8 = new ArrayList(k13.r(iterable, 10));
                Iterator it5 = iterable.iterator();
                while (it5.hasNext()) {
                    do7 O = fkf.O((FantasyUserCompetition) it5.next(), ay6Var.i());
                    ev6 ev6Var = O.c;
                    String str4 = ev6Var.C;
                    if (str4 == null) {
                        long j2 = ev6Var.K;
                        long j3 = ev6Var.L;
                        ZoneId of = ZoneId.of("GMT");
                        int year = Instant.ofEpochSecond(j2).atZone(of).getYear();
                        int year2 = Instant.ofEpochSecond(j3).atZone(of).getYear();
                        str4 = year != year2 ? fc6.g(year % 100, year2 % 100, "/") : String.valueOf(year);
                    }
                    String str5 = str4;
                    int i46 = ev6Var.a;
                    String str6 = ev6Var.b;
                    int i47 = ev6Var.c;
                    FantasyCompetitionType fantasyCompetitionType = ev6Var.d;
                    String str7 = ev6Var.e;
                    int i48 = ev6Var.f;
                    Integer num = ev6Var.g;
                    String str8 = ev6Var.h;
                    mj7 mj7Var = ev6Var.i;
                    mj7 mj7Var2 = ev6Var.j;
                    mj7 mj7Var3 = ev6Var.k;
                    Iterator it6 = it5;
                    Integer num2 = ev6Var.l;
                    Integer num3 = ev6Var.m;
                    int i49 = ev6Var.n;
                    long j4 = ev6Var.o;
                    int i50 = ev6Var.p;
                    Long l2 = ev6Var.q;
                    int i51 = ev6Var.r;
                    int i52 = ev6Var.s;
                    long j5 = ev6Var.t;
                    String str9 = ev6Var.u;
                    float f = ev6Var.v;
                    boolean z2 = ev6Var.w;
                    boolean z3 = ev6Var.x;
                    boolean z4 = ev6Var.y;
                    String str10 = ev6Var.z;
                    boolean z5 = ev6Var.A;
                    Integer num4 = ev6Var.B;
                    BrandingFantasyCompetition brandingFantasyCompetition = ev6Var.D;
                    boolean z6 = ev6Var.E;
                    boolean z7 = ev6Var.F;
                    boolean z8 = ev6Var.G;
                    boolean z9 = ev6Var.H;
                    boolean z10 = ev6Var.I;
                    boolean z11 = ev6Var.J;
                    long j6 = ev6Var.K;
                    long j7 = ev6Var.L;
                    str6.getClass();
                    fantasyCompetitionType.getClass();
                    str7.getClass();
                    str8.getClass();
                    str9.getClass();
                    arrayList8.add(do7.a(O, null, new ev6(i46, str6, i47, fantasyCompetitionType, str7, i48, num, str8, mj7Var, mj7Var2, mj7Var3, num2, num3, i49, j4, i50, l2, i51, i52, j5, str9, f, z2, z3, z4, str10, z5, num4, str5, brandingFantasyCompetition, z6, z7, z8, z9, z10, z11, j6, j7), 4091));
                    it5 = it6;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it7 = arrayList8.iterator();
                while (it7.hasNext()) {
                    Object next = it7.next();
                    String str11 = ((do7) next).c.C;
                    if (str11 == null) {
                        str11 = "";
                    }
                    Object obj10 = linkedHashMap.get(str11);
                    if (obj10 == null) {
                        obj10 = wv8.n(linkedHashMap, str11);
                    }
                    ((List) obj10).add(next);
                }
                TreeMap treeMap = new TreeMap(new rs2(new sc6(ay6Var), 4));
                treeMap.putAll(linkedHashMap);
                fdi fdiVar3 = ay6Var.g;
                do {
                    value = fdiVar3.getValue();
                    zx6 zx6Var = (zx6) value;
                    uj7Var = arrayList8.isEmpty() ? uj7.b : uj7.c;
                    X = l6g.X(treeMap);
                    zx6Var.getClass();
                } while (!fdiVar3.k(value, new zx6(uj7Var, X)));
                return Unit.a;
            default:
                y07 y07Var = (y07) obj4;
                e1d e1dVar = y07Var.f;
                lu3 lu3Var30 = lu3.a;
                int i53 = this.s;
                if (i53 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var4 = y07Var.c;
                    String str12 = y07Var.e;
                    int i54 = y07Var.d;
                    this.s = 1;
                    U = wi7Var4.U(i54, str12, this);
                    if (U == lu3Var30) {
                        return lu3Var30;
                    }
                } else {
                    if (i53 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    U = obj;
                }
                FantasyUserRound fantasyUserRound = (FantasyUserRound) U;
                ho7 T = fantasyUserRound != null ? pco.T(fantasyUserRound) : null;
                if (T == null) {
                    ((eoh) e1dVar).setValue(new x07(((x07) ((eoh) e1dVar).getValue()).a, false));
                    return Unit.a;
                }
                ((x07) ((eoh) e1dVar).getValue()).getClass();
                ((eoh) e1dVar).setValue(new x07(T, false));
                return Unit.a;
        }
    }
}
