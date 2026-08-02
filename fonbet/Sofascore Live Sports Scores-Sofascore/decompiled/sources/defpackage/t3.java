package defpackage;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y;
import com.sofascore.model.chat.AirCashData;
import com.sofascore.model.chat.Message;
import com.sofascore.model.fantasy.FantasyPlayerPostModel;
import com.sofascore.model.firebase.SurveyConfigData;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.WeatherConditionType;
import com.sofascore.model.network.response.EventWeatherCondition;
import com.sofascore.model.network.response.EventWeatherResponse;
import com.sofascore.model.newNetwork.ChatMessagesResponse;
import com.sofascore.model.newNetwork.FeaturedOddsResponse;
import com.sofascore.model.odds.AllOddsWithProvider;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.model.util.ChatInterface;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.service.SyncWorker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t3 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public boolean t;
    public Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(Object obj, Object obj2, boolean z, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
        this.t = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                return new t3((SurveyConfigData) this.u, (AbstractFragment) obj2, this.t, rq3Var, 0);
            case 1:
                return new t3((ij) this.u, (OddsCountryProvider) obj2, this.t, rq3Var, 1);
            case 2:
                return new t3(this.t, (gv9) this.u, (qug) obj2, rq3Var, 2);
            case 3:
                return new t3((us2) obj2, this.t, rq3Var, 3);
            case 4:
                return new t3((ai4) this.u, (String) obj2, rq3Var, 4);
            case 5:
                return new t3((tz4) this.u, (q05) obj2, this.t, rq3Var, 5);
            case 6:
                return new t3(this.t, (dz5) this.u, (Event) obj2, rq3Var, 6);
            case 7:
                return new t3((fo7) this.u, (is6) obj2, this.t, rq3Var, 7);
            case 8:
                return new t3((pu6) this.u, (tl7) obj2, this.t, rq3Var, 8);
            case 9:
                return new t3((h67) this.u, (String) obj2, rq3Var, 9);
            case 10:
                t3 t3Var = new t3((n87) obj2, this.t, rq3Var, 10);
                t3Var.u = obj;
                return t3Var;
            case 11:
                return new t3((k6g) this.u, this.t, (String[]) obj2, rq3Var, 11);
            case 12:
                return new t3((q50) this.u, this.t, (g0i) obj2, rq3Var, 12);
            case 13:
                return new t3((SyncWorker) this.u, (UniqueTournament) obj2, this.t, rq3Var, 13);
            case 14:
                return new t3((g4k) this.u, (List) obj2, this.t, rq3Var, 14);
            default:
                return new t3((c40) this.u, this.t, (y) obj2, rq3Var, 15);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((t3) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0225, code lost:
    
        if (r7 == r2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03fb, code lost:
    
        if (r0.q(r49, defpackage.it6.a) == r10) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x040d, code lost:
    
        if (r0.q(r49, r1) == r10) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0330, code lost:
    
        if (r1 == r10) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03a2, code lost:
    
        if (r1 == r10) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x079e, code lost:
    
        if (r0 == r1) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x07a9, code lost:
    
        if (r0.w(r10, r49) == r1) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0745, code lost:
    
        if (r7 == r1) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0846, code lost:
    
        if (defpackage.nm.b(r9 != 0 ? r9.intValue() : 0) != false) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x07e7, code lost:
    
        if (r2 == r1) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x097e, code lost:
    
        if (r0 == r2) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d0, code lost:
    
        if (r0.o(r2, r49) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x094e, code lost:
    
        if (r5 == r2) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0a19, code lost:
    
        if (defpackage.yfa.M(r2, r5, r8, r7, r9, r49) == r10) goto L469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x09bd, code lost:
    
        if (defpackage.n4o.z(r1, r49) == r10) goto L469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bb, code lost:
    
        if (r2 == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x08a5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v15, types: [km5] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29, types: [km5] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String, rq3] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v51 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Map<String, ProviderOdds> featured;
        ProviderOdds providerOdds;
        Object v;
        int i;
        Object P;
        ArrayList<Message> arrayList;
        ListIterator listIterator;
        hc9 hc9Var;
        boolean u;
        Object l;
        Object r;
        Object value;
        km5 km5Var;
        Object value2;
        j05 j05Var;
        LinkedHashMap q;
        Object P2;
        en1 en1Var;
        Object obj2;
        q9k q9kVar;
        String string;
        ?? r7;
        Object P3;
        mj7 mj7Var;
        Object P4;
        boolean z;
        Object f0;
        boolean booleanValue;
        boolean z2;
        Object value3;
        uj7 uj7Var;
        gv9 gv9Var;
        Object l2;
        Object value4;
        uj7 uj7Var2;
        gv9 W;
        d6g d6gVar;
        Object T;
        Object a;
        int i2 = this.r;
        int i3 = 10;
        Object obj3 = this.v;
        boolean z3 = true;
        Integer num = null;
        switch (i2) {
            case 0:
                SurveyConfigData surveyConfigData = (SurveyConfigData) this.u;
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    Integer showAfterXSeconds = surveyConfigData.getShowAfterXSeconds();
                    if (showAfterXSeconds != null) {
                        int intValue = showAfterXSeconds.intValue();
                        wd5 wd5Var = xd5.b;
                        long R = wkn.R(intValue, be5.SECONDS);
                        this.s = 1;
                        break;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                AbstractFragment abstractFragment = (AbstractFragment) obj3;
                boolean z4 = this.t;
                g6b lifecycle = abstractFragment.getLifecycle();
                e6b e6bVar = e6b.e;
                hs4 hs4Var = z45.a;
                r69 r69Var = rob.a.f;
                boolean e0 = r69Var.e0(getContext());
                if (!e0) {
                    if (lifecycle.b() == e6b.a) {
                        throw new l6b(r9, 0);
                    }
                    if (lifecycle.b().compareTo(e6bVar) >= 0) {
                        p1f p1fVar = abstractFragment.k;
                        if (p1fVar == null) {
                            Intrinsics.i("popUpManager");
                            throw null;
                        }
                        p1fVar.a(new f1f(surveyConfigData, z4));
                        Unit unit = Unit.a;
                        return Unit.a;
                    }
                }
                s3 s3Var = new s3(abstractFragment, surveyConfigData, z4);
                this.s = 2;
                break;
            case 1:
                ij ijVar = (ij) this.u;
                ddi ddiVar = ijVar.l;
                OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) obj3;
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    umd umdVar = ijVar.m;
                    Event event = (Event) ddiVar.getValue();
                    this.s = 1;
                    b = umdVar.b(event, oddsCountryProvider, this);
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        v = obj;
                        return (AllOddsWithProvider) v;
                    }
                    y6a.M(obj);
                    b = obj;
                }
                FeaturedOddsResponse featuredOddsResponse = (FeaturedOddsResponse) b;
                if (featuredOddsResponse == null || (featured = featuredOddsResponse.getFeatured()) == null || (providerOdds = featured.get(oddsCountryProvider.getFeaturedOddsType())) == null) {
                    return null;
                }
                if (!this.t || !providerOdds.isLive()) {
                    Event event2 = (Event) ddiVar.getValue();
                    this.s = 2;
                    v = ijVar.v(event2, oddsCountryProvider, this);
                    break;
                } else {
                    return null;
                }
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    if (this.t) {
                        gv9 gv9Var2 = (gv9) this.u;
                        ListIterator listIterator2 = gv9Var2.listIterator(gv9Var2.size());
                        while (true) {
                            if (!listIterator2.hasPrevious()) {
                                i = -1;
                            } else if (n9e.F((String) listIterator2.previous())) {
                                i = listIterator2.nextIndex();
                            }
                        }
                        if (i > 5) {
                            qug qugVar = (qug) obj3;
                            int h = qugVar.e.h();
                            this.s = 1;
                            if (v8a.G(qugVar, h - qugVar.a.h(), this) == lu3Var3) {
                                return lu3Var3;
                            }
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
            case 3:
                boolean z5 = this.t;
                us2 us2Var = (us2) obj3;
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    cs2 cs2Var = us2Var.q;
                    String str = us2Var.F;
                    this.s = 1;
                    cs2Var.getClass();
                    P = yaa.P(new yr2(cs2Var, str, r9, 0), this);
                    break;
                } else if (i7 == 1) {
                    y6a.M(obj);
                    P = obj;
                } else {
                    if (i7 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = (ArrayList) this.u;
                    y6a.M(obj);
                    ChatInterface chatInterface = us2Var.y;
                    r9 = chatInterface != null ? new Integer(chatInterface.getChatId()) : 0;
                    if (z5) {
                        AirCashData airCashData = nm.a;
                        break;
                    }
                    z3 = false;
                    xbb b2 = a.b();
                    for (Message message : arrayList) {
                        b2.add(message);
                        if (z3) {
                            AirCashData airCashData2 = nm.a;
                            if (nm.c(message.getTimestamp())) {
                                b2.add(nm.a());
                            }
                        }
                    }
                    xbb a2 = a.a(b2);
                    ArrayList arrayList2 = new ArrayList();
                    listIterator = a2.listIterator(0);
                    while (true) {
                        hc9Var = (hc9) listIterator;
                        if (hc9Var.hasNext()) {
                            yzc yzcVar = us2Var.A;
                            if (arrayList2.isEmpty()) {
                                arrayList2 = z5 ? a.c(us2Var.G) : km5.a;
                            }
                            yzcVar.j(arrayList2);
                            return Unit.a;
                        }
                        Object next = hc9Var.next();
                        if (((Message) next).isMessageValid(us2Var.z.getId())) {
                            arrayList2.add(next);
                        }
                    }
                }
                x2g x2gVar = (x2g) P;
                if (x2gVar instanceof v2g) {
                    ArrayList U0 = CollectionsKt.U0(((ChatMessagesResponse) ((v2g) x2gVar).a).getMessages());
                    n13.u(new rs2(new qs2(0), 0), U0);
                    Message[] messageArr = (Message[]) U0.toArray(new Message[0]);
                    Message[] messageArr2 = (Message[]) Arrays.copyOf(messageArr, messageArr.length);
                    this.u = U0;
                    this.s = 2;
                    if (us2Var.k(messageArr2, this) != lu3Var4) {
                        arrayList = U0;
                        ChatInterface chatInterface2 = us2Var.y;
                        if (chatInterface2 != null) {
                        }
                        if (z5) {
                        }
                        z3 = false;
                        xbb b22 = a.b();
                        while (r1.hasNext()) {
                        }
                        xbb a22 = a.a(b22);
                        ArrayList arrayList22 = new ArrayList();
                        listIterator = a22.listIterator(0);
                        while (true) {
                            hc9Var = (hc9) listIterator;
                            if (hc9Var.hasNext()) {
                            }
                        }
                    }
                    return lu3Var4;
                }
                return Unit.a;
            case 4:
                String str2 = (String) obj3;
                ai4 ai4Var = (ai4) this.u;
                lu3 lu3Var5 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    u = ai4Var.u();
                    this.t = u;
                    this.s = 1;
                    l = ai4Var.l(str2, u, this);
                    break;
                } else {
                    if (i8 != 1) {
                        if (i8 == 2 || i8 == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    u = this.t;
                    y6a.M(obj);
                    l = obj;
                }
                jh4 jh4Var = (jh4) l;
                Map map = jh4Var.b;
                ArrayList arrayList3 = jh4Var.a;
                ai4Var.w = map;
                ai4Var.x = jh4Var.c;
                if (arrayList3.isEmpty()) {
                    this.t = u;
                    this.s = 2;
                    if (u) {
                        if (bea.B(getContext())) {
                            fdi fdiVar = ai4Var.m;
                            do {
                                value = fdiVar.getValue();
                                km5Var = km5.a;
                                ((hh4) value).getClass();
                                km5Var.getClass();
                            } while (!fdiVar.k(value, new hh4(true, true, null, km5Var, km5Var)));
                            r = Unit.a;
                            break;
                        } else {
                            r = Unit.a;
                            break;
                        }
                    } else {
                        r = s9a.r(new wh4(ai4Var, str2, null), this);
                        if (r != lu3Var5) {
                            r = Unit.a;
                            break;
                        }
                    }
                } else {
                    this.t = u;
                    this.s = 3;
                    break;
                }
                break;
            case 5:
                boolean z6 = this.t;
                q05 q05Var = (q05) obj3;
                tz4 tz4Var = (tz4) this.u;
                lu3 lu3Var6 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    ct8 ct8Var = tz4Var.c;
                    Context i10 = q05Var.i();
                    Boolean valueOf = Boolean.valueOf(z6);
                    this.s = 1;
                    if (ct8Var.invoke(i10, valueOf, this) == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fdi fdiVar2 = q05Var.m;
                do {
                    value2 = fdiVar2.getValue();
                    j05Var = (j05) value2;
                    q = tub.q(j05Var.t);
                    q.put(tz4Var, Boolean.valueOf(z6));
                    Unit unit2 = Unit.a;
                } while (!fdiVar2.k(value2, j05.a(j05Var, null, null, null, null, null, null, null, null, null, null, false, null, q, false, false, null, false, 267911167)));
                return Unit.a;
            case 6:
                Event event3 = (Event) obj3;
                dz5 dz5Var = (dz5) this.u;
                lu3 lu3Var7 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    if (this.t) {
                        en1Var = new en1(null, new q9k(R.string.baseball_domed_stadium), null, Integer.valueOf(R.drawable.ic_stadium_dome), true, rlh.b);
                        return en1Var;
                    }
                    s96 s96Var = dz5Var.i;
                    int id = event3.getId();
                    this.s = 1;
                    s96Var.getClass();
                    P2 = yaa.P(new a86(s96Var, id, r9, i3), this);
                    if (P2 == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P2 = obj;
                }
                EventWeatherResponse eventWeatherResponse = (EventWeatherResponse) yaa.x((x2g) P2);
                if (eventWeatherResponse == null) {
                    return null;
                }
                Context i12 = dz5Var.i();
                String statusType = event3.getStatusType();
                statusType.getClass();
                boolean equals = statusType.equals(StatusKt.STATUS_IN_PROGRESS);
                Iterator it = eventWeatherResponse.getConditions().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        EventWeatherCondition eventWeatherCondition = (EventWeatherCondition) obj2;
                        if ((!Intrinsics.c(eventWeatherCondition.isForecast(), Boolean.TRUE) || !statusType.equals(StatusKt.STATUS_NOT_STARTED)) && (!Intrinsics.c(eventWeatherCondition.isForecast(), Boolean.FALSE) || statusType.equals(StatusKt.STATUS_NOT_STARTED))) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                EventWeatherCondition eventWeatherCondition2 = (EventWeatherCondition) obj2;
                if (eventWeatherCondition2 == null) {
                    return null;
                }
                q9k q9kVar2 = new q9k(equals ? R.string.current_weather : R.string.game_day_weather);
                WeatherConditionType generalCondition = eventWeatherCondition2.getGeneralCondition();
                if (generalCondition != null) {
                    int i13 = h0l.a[generalCondition.ordinal()];
                    int i14 = R.string.weather_cloudy;
                    switch (i13) {
                        case 1:
                            i14 = R.string.weather_sunny;
                            q9kVar = new q9k(i14);
                            break;
                        case 2:
                            i14 = R.string.weather_clear;
                            q9kVar = new q9k(i14);
                            break;
                        case 3:
                        case 4:
                            q9kVar = new q9k(i14);
                            break;
                        case 5:
                        case 6:
                            i14 = R.string.weather_partly_cloudy;
                            q9kVar = new q9k(i14);
                            break;
                        case 7:
                            i14 = R.string.weather_light_rain;
                            q9kVar = new q9k(i14);
                            break;
                        case 8:
                            i14 = R.string.weather_heavy_rain;
                            q9kVar = new q9k(i14);
                            break;
                        case 9:
                            i14 = R.string.weather_thunderstorm;
                            q9kVar = new q9k(i14);
                            break;
                        case 10:
                            i14 = R.string.weather_snow;
                            q9kVar = new q9k(i14);
                            break;
                        case 11:
                            i14 = R.string.weather_fog;
                            q9kVar = new q9k(i14);
                            break;
                        default:
                            zzl.b();
                            return null;
                    }
                } else {
                    q9kVar = null;
                }
                Boolean valueOf2 = Boolean.valueOf(equals);
                WeatherConditionType generalCondition2 = eventWeatherCondition2.getGeneralCondition();
                if (generalCondition2 != null) {
                    int i15 = h0l.a[generalCondition2.ordinal()];
                    int i16 = R.drawable.weather_sunny_cloud;
                    switch (i15) {
                        case 1:
                            i16 = R.drawable.weather_sunny;
                            num = Integer.valueOf(i16);
                            break;
                        case 2:
                            i16 = R.drawable.weather_night_clear;
                            num = Integer.valueOf(i16);
                            break;
                        case 3:
                        case 5:
                            num = Integer.valueOf(i16);
                            break;
                        case 4:
                        case 6:
                            i16 = R.drawable.weather_night_cloudy;
                            num = Integer.valueOf(i16);
                            break;
                        case 7:
                            i16 = R.drawable.weather_rain;
                            num = Integer.valueOf(i16);
                            break;
                        case 8:
                            i16 = R.drawable.weather_heavy_rain;
                            num = Integer.valueOf(i16);
                            break;
                        case 9:
                            i16 = R.drawable.weather_thunderstrom;
                            num = Integer.valueOf(i16);
                            break;
                        case 10:
                            i16 = R.drawable.weather_snow;
                            num = Integer.valueOf(i16);
                            break;
                        case 11:
                            i16 = R.drawable.weather_fog;
                            num = Integer.valueOf(i16);
                            break;
                        default:
                            zzl.b();
                            return null;
                    }
                }
                Integer num2 = num;
                xbb b3 = a.b();
                Double windSpeed = eventWeatherCondition2.getWindSpeed();
                if (windSpeed != null) {
                    double doubleValue = windSpeed.doubleValue();
                    if (Intrinsics.c(v7a.u(i12), "METRIC")) {
                        string = i12.getString(R.string.kilometers_per_hour_format, String.valueOf(wzb.a(doubleValue)));
                        string.getClass();
                    } else {
                        string = i12.getString(R.string.miles_per_hour_format, String.valueOf(wzb.a((doubleValue * 1000.0d) / 1609.344d)));
                        string.getClass();
                    }
                    b3.add(new fn1(R.drawable.weather_windy, string));
                }
                Double temperature = eventWeatherCondition2.getTemperature();
                if (temperature != null) {
                    double doubleValue2 = temperature.doubleValue();
                    b3.add(new fn1(R.drawable.ic_temperature, Intrinsics.c(v7a.u(i12), "METRIC") ? mz1.i(wzb.a(doubleValue2), "°C") : mz1.i(wzb.a(((doubleValue2 * 9.0d) / 5.0d) + 32.0d), "°F")));
                }
                Double humidity = eventWeatherCondition2.getHumidity();
                if (humidity != null) {
                    b3.add(new fn1(R.drawable.ic_humidity, rei.c(Double.valueOf(humidity.doubleValue()), 0, true)));
                }
                Unit unit3 = Unit.a;
                en1Var = new en1(q9kVar2, q9kVar, valueOf2, num2, false, l6g.W(a.a(b3)));
                return en1Var;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    j67 j67Var = ((fo7) this.u).a;
                    if (j67Var != null) {
                        boolean z7 = this.t;
                        g62 g62Var = ((is6) obj3).h;
                        zr6 zr6Var = new zr6(j67Var, z7);
                        this.s = 1;
                        if (g62Var.q(this, zr6Var) == lu3Var8) {
                            return lu3Var8;
                        }
                    }
                } else {
                    if (i17 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 8:
                tl7 tl7Var = (tl7) obj3;
                boolean z8 = this.t;
                pu6 pu6Var = (pu6) this.u;
                lu3 lu3Var9 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    hu6 l3 = pu6Var.l();
                    wi7 wi7Var = pu6Var.f;
                    pu6Var.x(hu6.a(l3, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, null, null, null, null, new gu6(pu6Var.l().x.a, true), 8388607));
                    int ordinal = tl7Var.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1 && ordinal != 2) {
                            zzl.b();
                            return null;
                        }
                        int i19 = pu6Var.m().c.c;
                        km5 km5Var2 = km5.a;
                        Boolean valueOf3 = tl7Var == tl7.g ? Boolean.valueOf(z8) : null;
                        Boolean valueOf4 = tl7Var == tl7.h ? Boolean.valueOf(z8) : null;
                        this.s = 2;
                        wi7Var.getClass();
                        P4 = yaa.P(new fg7(wi7Var, i19, km5Var2, valueOf3, valueOf4, (rq3) null, 1), this);
                        break;
                    } else {
                        gv9<FantasyRoundPlayerUiModel> gv9Var3 = pu6Var.l().f;
                        if (gv9Var3 != null) {
                            r7 = new ArrayList(k13.r(gv9Var3, 10));
                            for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel : gv9Var3) {
                                r7.add(new FantasyPlayerPostModel(fantasyRoundPlayerUiModel.a, fantasyRoundPlayerUiModel.d, fantasyRoundPlayerUiModel.k, fantasyRoundPlayerUiModel.m));
                            }
                        } else {
                            r7 = 0;
                        }
                        if (r7 == 0) {
                            r7 = km5.a;
                        }
                        Object obj4 = r7;
                        ho7 ho7Var = pu6Var.l().c;
                        int i20 = (ho7Var == null || (mj7Var = ho7Var.a) == null) ? 0 : mj7Var.a;
                        Boolean valueOf5 = Boolean.valueOf(z8);
                        this.s = 1;
                        wi7Var.getClass();
                        P3 = yaa.P(new bs2(wi7Var, i20, obj4, valueOf5, null, 4), this);
                        break;
                    }
                    return lu3Var9;
                }
                if (i18 == 1) {
                    y6a.M(obj);
                    P3 = obj;
                    x2g x2gVar2 = (x2g) P3;
                    x2gVar2.getClass();
                    z = x2gVar2 instanceof v2g;
                } else {
                    if (i18 != 2) {
                        if (i18 != 3 && i18 != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        hu6 l4 = pu6Var.l();
                        gu6 gu6Var = pu6Var.l().x;
                        pu6Var.x(hu6.a(l4, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, null, null, null, null, new gu6(null, false), 8388607));
                        return Unit.a;
                    }
                    y6a.M(obj);
                    P4 = obj;
                    x2g x2gVar3 = (x2g) P4;
                    x2gVar3.getClass();
                    z = x2gVar3 instanceof v2g;
                }
                if (z) {
                    List list = pu6Var.l().f;
                    if (list == null) {
                        list = km5.a;
                    }
                    pu6Var.z(list, km5.a, 0, pu6Var.l().i, tl7Var == tl7.f ? Boolean.valueOf(z8) : null, tl7Var == tl7.h ? Boolean.valueOf(z8) : null, tl7Var == tl7.g ? Boolean.valueOf(z8) : null, false);
                    if (z8) {
                        g62 g62Var2 = pu6Var.m;
                        this.s = 3;
                        break;
                    }
                    hu6 l42 = pu6Var.l();
                    gu6 gu6Var2 = pu6Var.l().x;
                    pu6Var.x(hu6.a(l42, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, null, null, null, null, new gu6(null, false), 8388607));
                    return Unit.a;
                }
                g62 g62Var3 = pu6Var.m;
                jt6 jt6Var = new jt6(smh.e);
                this.s = 4;
                break;
            case 9:
                String str3 = (String) obj3;
                h67 h67Var = (h67) this.u;
                e1d e1dVar = h67Var.h;
                lu3 lu3Var10 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    ((eoh) e1dVar).setValue(e67.a(h67Var.k(), null, true, null, 23));
                    wi7 wi7Var2 = h67Var.e;
                    int i22 = h67Var.f.a;
                    this.s = 1;
                    f0 = wi7Var2.f0(i22, str3, this);
                    break;
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = this.t;
                        y6a.M(obj);
                        booleanValue = z2;
                        e67 k = h67Var.k();
                        e67 k2 = h67Var.k();
                        ((eoh) e1dVar).setValue(e67.a(k, null, false, !booleanValue ? l6g.W(CollectionsKt.x0(k2.e, str3)) : k2.e, 7));
                        return Unit.a;
                    }
                    y6a.M(obj);
                    f0 = obj;
                }
                booleanValue = ((Boolean) f0).booleanValue();
                if (booleanValue) {
                    g62 g62Var4 = h67Var.i;
                    this.t = booleanValue;
                    this.s = 2;
                    if (g62Var4.q(this, z57.a) != lu3Var10) {
                        z2 = booleanValue;
                        booleanValue = z2;
                    }
                    return lu3Var10;
                }
                e67 k3 = h67Var.k();
                e67 k22 = h67Var.k();
                ((eoh) e1dVar).setValue(e67.a(k3, null, false, !booleanValue ? l6g.W(CollectionsKt.x0(k22.e, str3)) : k22.e, 7));
                return Unit.a;
            case 10:
                n87 n87Var = (n87) obj3;
                fdi fdiVar3 = n87Var.g;
                ku3 ku3Var = (ku3) this.u;
                lu3 lu3Var11 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    boolean z9 = this.t;
                    do {
                        value3 = fdiVar3.getValue();
                        m87 m87Var = (m87) value3;
                        uj7Var = z9 ? uj7.a : m87Var.a;
                        gv9Var = m87Var.b;
                        uj7Var.getClass();
                        gv9Var.getClass();
                    } while (!fdiVar3.k(value3, new m87(uj7Var, gv9Var)));
                    wi7 wi7Var3 = n87Var.e;
                    int i24 = n87Var.f.c;
                    String a3 = dla.a();
                    this.u = ku3Var;
                    this.s = 1;
                    l2 = wi7Var3.l(i24, a3, this);
                    if (l2 == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i23 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    l2 = obj;
                }
                List list2 = (List) l2;
                Collection H0 = list2 != null ? CollectionsKt.H0(list2, new v66(17)) : null;
                do {
                    value4 = fdiVar3.getValue();
                    m87 m87Var2 = (m87) value4;
                    uj7Var2 = H0 != null ? uj7.c : uj7.b;
                    W = l6g.W(H0 == null ? km5.a : H0);
                    m87Var2.getClass();
                    W.getClass();
                } while (!fdiVar3.k(value4, new m87(uj7Var2, W)));
                return Unit.a;
            case 11:
                k6g k6gVar = (k6g) this.u;
                lu3 lu3Var12 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    d6gVar = k6gVar.connectionManager;
                    rq3 rq3Var = null;
                    if (d6gVar == null) {
                        Intrinsics.i("connectionManager");
                        throw null;
                    }
                    w21 w21Var = new w21(k6gVar, this.t, (String[]) obj3, rq3Var, 4);
                    this.s = 1;
                    if (d6gVar.f.T0(false, w21Var, this) == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i25 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    q50 q50Var = (q50) this.u;
                    float f = this.t ? 1.0f : 0.8f;
                    this.s = 1;
                    if (q50.a(q50Var, new Float(f), (g0i) obj3, null, this, 12) == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 13:
                UniqueTournament uniqueTournament = (UniqueTournament) obj3;
                SyncWorker syncWorker = (SyncWorker) this.u;
                lu3 lu3Var14 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    w3b w3bVar = syncWorker.d;
                    boolean z10 = this.t;
                    this.s = 1;
                    irj irjVar = w3bVar.a;
                    T = gz8.T(this, irjVar.a, new hrj(irjVar, uniqueTournament, z10, null));
                    break;
                } else {
                    if (i27 != 1) {
                        if (i27 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    T = obj;
                }
                if (((Boolean) T).booleanValue()) {
                    int id2 = uniqueTournament.getId();
                    this.s = 2;
                    break;
                }
                return Unit.a;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    a = ((g4k) this.u).f.a((List) obj3, this);
                    if (a == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i28 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    a = obj;
                }
                boolean z11 = ((Number) a).intValue() > 0;
                if (this.t && z11) {
                    ad2 ad2Var = qv5.a;
                    qv5.a(d52.a);
                }
                return Unit.a;
            default:
                lu3 lu3Var16 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    fdi fdiVar4 = (fdi) ((c40) this.u).j;
                    w wVar = new w(this.t, (y) obj3);
                    this.s = 1;
                    fdiVar4.getClass();
                    fdiVar4.m(null, wVar);
                    if (Unit.a == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i29 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(q8 q8Var, boolean z, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = q8Var;
        this.t = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(q8 q8Var, String str, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = q8Var;
        this.v = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(Object obj, boolean z, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.t = z;
        this.v = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(boolean z, Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = z;
        this.u = obj;
        this.v = obj2;
    }
}
