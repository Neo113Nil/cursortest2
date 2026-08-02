package defpackage;

import android.app.Application;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.crowdsourcing.CrowdsourcingContribution;
import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.crowdsourcing.GetCrowdsourcingEventContributionsResponse;
import com.sofascore.model.crowdsourcing.MyContributionsResponse;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.model.crowdsourcing.TeamSide;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.TeamSides;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ltr3;", "Lq8;", "yq3", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class tr3 extends q8 {
    public final e64 e;
    public final mx8 f;
    public final aeh g;
    public final hof h;
    public final aeh i;
    public final hof j;
    public final aeh k;
    public boolean l;
    public final fdi m;
    public final fdi n;
    public final fdi o;
    public final fdi p;
    public final fdi q;
    public final fdi r;
    public final yf4 s;
    public final fdi t;
    public final fdi u;
    public final fdi v;
    public final hof w;
    public final z88 x;
    public final zn2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr3(Application application, e64 e64Var, mx8 mx8Var) {
        super(application);
        e64Var.getClass();
        this.e = e64Var;
        this.f = mx8Var;
        int i = 0;
        rq3 rq3Var = null;
        aeh b = beh.b(0, 0, null, 7);
        this.g = b;
        this.h = un0.t(b);
        aeh b2 = beh.b(0, 0, null, 7);
        this.i = b2;
        this.j = un0.t(b2);
        int i2 = 1;
        aeh b3 = beh.b(1, 0, null, 6);
        this.k = b3;
        this.m = gdi.a(null);
        this.n = gdi.a(null);
        this.o = gdi.a(null);
        Boolean bool = Boolean.FALSE;
        this.p = gdi.a(bool);
        fdi a = gdi.a(bool);
        this.q = a;
        ia0 ia0Var = ia0.q;
        fdi a2 = gdi.a(Boolean.valueOf(ok3.p().e().getIsLoggedIn()));
        this.r = a2;
        int i3 = 3;
        this.s = new yf4(a, a2, new ar3(i3, rq3Var, i), i2);
        this.t = gdi.a(null);
        fdi a3 = gdi.a(null);
        this.u = a3;
        fdi a4 = gdi.a(null);
        this.v = a4;
        this.w = un0.H(new yf4(new wj0(a3, 3), new wj0(a4, 3), new br3(i3, rq3Var, i), i2), un0.z(this), weh.a, 1);
        z88 H = hkg.H(new or3(b3, i));
        this.x = H;
        this.y = la8.a(H, new tl(rq3Var, this, 4));
        xw3.L(un0.z(this), null, null, new xq3(this, rq3Var, i), 3);
        xw3.L(un0.z(this), null, null, new xq3(this, rq3Var, i2), 3);
    }

    public static void l(scj scjVar) {
        int m = yid.m(StringsKt.toIntOrNull(scjVar.c().c.toString()));
        int i = m - 1;
        if (i >= 0) {
            m = i;
        }
        w1a.E(scjVar, String.valueOf(m));
    }

    public static void n(scj scjVar) {
        int m = yid.m(StringsKt.toIntOrNull(scjVar.c().c.toString()));
        int i = m + 1;
        if (i < 100) {
            m = i;
        }
        w1a.E(scjVar, String.valueOf(m));
    }

    public static List w(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                arrayList.add(obj);
            }
        }
        int i = 0;
        for (EventSuggest.IncidentSuggest.GoalSuggest goalSuggest : CollectionsKt.H0(arrayList, new y73(8))) {
            Integer time = goalSuggest.getTime();
            if (time != null) {
                i = time.intValue();
            }
            Integer valueOf = Integer.valueOf(goalSuggest.getId());
            Integer time2 = goalSuggest.getTime();
            linkedHashMap.put(valueOf, Integer.valueOf(time2 != null ? time2.intValue() : i));
        }
        return CollectionsKt.H0(list, new cp(new mr3(linkedHashMap, 0), 4));
    }

    public static gv9 y(ArrayList arrayList) {
        EventSuggest.IncidentSuggest.GoalSuggest copy;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = size - 1;
                wyf wyfVar = (wyf) arrayList.get(size);
                EventSuggest.IncidentSuggest incidentSuggest = wyfVar.a;
                boolean z = incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest;
                int i4 = i + ((z && ((EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest).getSide() == TeamSide.HOME) ? 1 : 0);
                int i5 = i2 + ((z && ((EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest).getSide() == TeamSide.AWAY) ? 1 : 0);
                if (!(incidentSuggest instanceof EventSuggest.IncidentSuggest.CardSuggest)) {
                    if (!(incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest)) {
                        zzl.b();
                        return null;
                    }
                    copy = r11.copy((r29 & 1) != 0 ? r11.id : 0, (r29 & 2) != 0 ? r11.status : null, (r29 & 4) != 0 ? r11.validated : false, (r29 & 8) != 0 ? r11.homeScoreSuggest : i4, (r29 & 16) != 0 ? r11.awayScoreSuggest : i5, (r29 & 32) != 0 ? r11.player : null, (r29 & 64) != 0 ? r11.assist : null, (r29 & 128) != 0 ? r11.playerName : null, (r29 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? r11.assistName : null, (r29 & 512) != 0 ? r11.type : null, (r29 & 1024) != 0 ? r11.side : null, (r29 & a.o) != 0 ? r11.time : null, (r29 & 4096) != 0 ? r11.addedTime : null, (r29 & 8192) != 0 ? ((EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest).applied : null);
                    wyfVar = wyf.a(wyfVar, copy, null, 6);
                }
                arrayList.set(size, wyfVar);
                if (i3 < 0) {
                    break;
                }
                size = i3;
                i = i4;
                i2 = i5;
            }
        }
        return l6g.W(arrayList);
    }

    public final boolean k(EventSuggest.IncidentSuggest incidentSuggest) {
        g0a g0aVar;
        gv9 a;
        if (!(incidentSuggest instanceof EventSuggest.IncidentSuggest.CardSuggest)) {
            if (!(incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest)) {
                zzl.b();
                return false;
            }
            fdi fdiVar = this.t;
            if ((fdiVar.getValue() instanceof d0a) && (g0aVar = (g0a) fdiVar.getValue()) != null && (a = g0aVar.a()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : a) {
                    if (obj instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                        arrayList.add(obj);
                    }
                }
                EventSuggest.IncidentSuggest.GoalSuggest goalSuggest = (EventSuggest.IncidentSuggest.GoalSuggest) CollectionsKt.firstOrNull(arrayList);
                if (goalSuggest != null && goalSuggest.getId() == ((EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest).getId() && goalSuggest.getStatus() != SuggestStatus.APPROVED) {
                    return true;
                }
            }
        } else if (((EventSuggest.IncidentSuggest.CardSuggest) incidentSuggest).getStatus() != SuggestStatus.APPROVED) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [gv9] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    public final Map m() {
        ?? a;
        g0a g0aVar = (g0a) this.t.getValue();
        if (g0aVar != null) {
            if (g0aVar instanceof e0a) {
                gv9 gv9Var = ((e0a) g0aVar).a;
                a = new ArrayList(k13.r(gv9Var, 10));
                Iterator it = gv9Var.iterator();
                while (it.hasNext()) {
                    a.add(((wyf) it.next()).a);
                }
            } else {
                a = g0aVar.a();
            }
            if (a != 0) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : a) {
                    if (obj instanceof EventSuggest.IncidentSuggest.CardSuggest) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    EventSuggest.IncidentSuggest.CardSuggest cardSuggest = (EventSuggest.IncidentSuggest.CardSuggest) next;
                    if (cardSuggest.getPlayer() != null || cardSuggest.getPlayerName() != null) {
                        arrayList2.add(next);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    EventSuggest.IncidentSuggest.CardSuggest cardSuggest2 = (EventSuggest.IncidentSuggest.CardSuggest) it3.next();
                    CrowdsourcingIncidentType.Card type = cardSuggest2.getType();
                    Object obj2 = linkedHashMap.get(type);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(type, obj2);
                    }
                    List list = (List) obj2;
                    Player player = cardSuggest2.getPlayer();
                    list.add(new yq3(player != null ? Integer.valueOf(player.getId()) : null, cardSuggest2.getPlayerName(), cardSuggest2.getTime(), cardSuggest2.getAddedTime()));
                }
                return linkedHashMap;
            }
        }
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        return lm5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(sq3 sq3Var) {
        cr3 cr3Var;
        int i;
        int i2;
        int i3;
        g0a g0aVar;
        EventSuggest.IncidentSuggest.GoalSuggest goalSuggest;
        boolean z;
        gv9 a;
        Object obj;
        if (sq3Var instanceof cr3) {
            cr3Var = (cr3) sq3Var;
            int i4 = cr3Var.v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cr3Var.v = i4 - Integer.MIN_VALUE;
                Object obj2 = cr3Var.t;
                lu3 lu3Var = lu3.a;
                i = cr3Var.v;
                boolean z2 = false;
                if (i != 0) {
                    y6a.M(obj2);
                    fdi fdiVar = this.n;
                    h38 h38Var = (h38) fdiVar.getValue();
                    if (h38Var instanceof f38) {
                        f38 f38Var = (f38) h38Var;
                        Integer num = new Integer(yid.m(StringsKt.toIntOrNull(f38Var.d.c().c.toString())));
                        Integer num2 = new Integer(yid.m(StringsKt.toIntOrNull(f38Var.e.c().c.toString())));
                        int intValue = num.intValue();
                        int intValue2 = num2.intValue();
                        cr3Var.r = intValue;
                        cr3Var.s = intValue2;
                        cr3Var.v = 1;
                        Object y = rd0.y(this.k, cr3Var);
                        if (y == lu3Var) {
                            return lu3Var;
                        }
                        i2 = intValue;
                        obj2 = y;
                        i3 = intValue2;
                    }
                    return Boolean.valueOf(z2);
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = cr3Var.s;
                i2 = cr3Var.r;
                y6a.M(obj2);
                Event event = (Event) obj2;
                g0aVar = (g0a) this.t.getValue();
                if (g0aVar != null || (a = g0aVar.a()) == null) {
                    goalSuggest = null;
                } else {
                    Iterator<E> it = a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (obj instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                            break;
                        }
                    }
                    if (!(obj instanceof EventSuggest.IncidentSuggest.GoalSuggest)) {
                        obj = null;
                    }
                    goalSuggest = (EventSuggest.IncidentSuggest.GoalSuggest) obj;
                }
                int max = Math.max(yid.m(Event.getHomeScore$default(event, null, 1, null).getDisplay()), yid.m(goalSuggest == null ? new Integer(goalSuggest.getHomeScoreSuggest()) : null));
                int max2 = Math.max(yid.m(Event.getAwayScore$default(event, null, 1, null).getDisplay()), yid.m(goalSuggest != null ? new Integer(goalSuggest.getAwayScoreSuggest()) : null));
                z = i2 + i3 <= 10;
                boolean z3 = Math.abs(i2 - max) < 5 || Math.abs(i3 - max2) >= 5;
                if (!z || z3) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }
        cr3Var = new cr3(this, sq3Var);
        Object obj22 = cr3Var.t;
        lu3 lu3Var2 = lu3.a;
        i = cr3Var.v;
        boolean z22 = false;
        if (i != 0) {
        }
        Event event2 = (Event) obj22;
        g0aVar = (g0a) this.t.getValue();
        if (g0aVar != null) {
        }
        goalSuggest = null;
        int max3 = Math.max(yid.m(Event.getHomeScore$default(event2, null, 1, null).getDisplay()), yid.m(goalSuggest == null ? new Integer(goalSuggest.getHomeScoreSuggest()) : null));
        int max22 = Math.max(yid.m(Event.getAwayScore$default(event2, null, 1, null).getDisplay()), yid.m(goalSuggest != null ? new Integer(goalSuggest.getAwayScoreSuggest()) : null));
        if (i2 + i3 <= 10) {
        }
        if (Math.abs(i2 - max3) < 5) {
        }
        if (!z) {
        }
        z22 = true;
        return Boolean.valueOf(z22);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0065, code lost:
    
        if (r12 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0041, code lost:
    
        if (r12 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(rq3 rq3Var) {
        hr3 hr3Var;
        int i;
        List<EventSuggest.IncidentSuggest> liveIncidentSuggests;
        EventSuggest.FinalScoreSuggest finalScoreSuggest;
        EventSuggest.StartDateSuggest startDateSuggest;
        List<EventSuggest.IncidentSuggest> liveIncidentSuggests2;
        EventSuggest.StartDateSuggest startDateSuggest2;
        EventSuggest.FinalScoreSuggest finalScoreSuggest2;
        EventSuggest.StatusSuggest statusSuggest;
        if (rq3Var instanceof hr3) {
            hr3Var = (hr3) rq3Var;
            int i2 = hr3Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hr3Var.t = i2 - Integer.MIN_VALUE;
                Object obj = hr3Var.r;
                lu3 lu3Var = lu3.a;
                i = hr3Var.t;
                boolean z = true;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    hr3Var.t = 1;
                    obj = rd0.y(this.k, hr3Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        MyContributionsResponse myContributionsResponse = (MyContributionsResponse) yaa.x((x2g) obj);
                        Boolean valueOf = (myContributionsResponse == null || (statusSuggest = myContributionsResponse.getStatusSuggest()) == null) ? null : Boolean.valueOf(statusSuggest.getValidated());
                        Boolean bool = Boolean.TRUE;
                        if (!Intrinsics.c(valueOf, bool)) {
                            if (!Intrinsics.c((myContributionsResponse == null || (finalScoreSuggest2 = myContributionsResponse.getFinalScoreSuggest()) == null) ? null : Boolean.valueOf(finalScoreSuggest2.getValidated()), bool)) {
                                if (!Intrinsics.c((myContributionsResponse == null || (startDateSuggest2 = myContributionsResponse.getStartDateSuggest()) == null) ? null : Boolean.valueOf(startDateSuggest2.getValidated()), bool)) {
                                    if (myContributionsResponse != null && (liveIncidentSuggests2 = myContributionsResponse.getLiveIncidentSuggests()) != null && !liveIncidentSuggests2.isEmpty()) {
                                        Iterator<T> it = liveIncidentSuggests2.iterator();
                                        while (it.hasNext()) {
                                            if (Boolean.valueOf(((EventSuggest.IncidentSuggest) it.next()).getValidated()).equals(Boolean.TRUE)) {
                                                break;
                                            }
                                        }
                                    }
                                    z = false;
                                }
                            }
                        }
                        this.l = z;
                        this.m.l((myContributionsResponse == null || (startDateSuggest = myContributionsResponse.getStartDateSuggest()) == null) ? null : new eci(startDateSuggest.getStartDateSuggestTimestamp(), startDateSuggest.getStatus()));
                        if (myContributionsResponse != null && (finalScoreSuggest = myContributionsResponse.getFinalScoreSuggest()) != null) {
                            g38 g38Var = new g38(finalScoreSuggest.getHomeScoreSuggest(), finalScoreSuggest.getAwayScoreSuggest(), finalScoreSuggest.getStatus());
                            fdi fdiVar = this.n;
                            fdiVar.getClass();
                            fdiVar.m(null, g38Var);
                        }
                        if (myContributionsResponse != null && (liveIncidentSuggests = myContributionsResponse.getLiveIncidentSuggests()) != null) {
                            f0a f0aVar = new f0a(l6g.W(liveIncidentSuggests));
                            fdi fdiVar2 = this.t;
                            fdiVar2.getClass();
                            fdiVar2.m(null, f0aVar);
                        }
                        this.o.l(null);
                        return Unit.a;
                    }
                    y6a.M(obj);
                }
                int id = ((Event) obj).getId();
                Calendar calendar = ke0.a;
                String d = ke0.d(i());
                hr3Var.t = 2;
                e64 e64Var = this.e;
                e64Var.getClass();
                obj = yaa.P(new c64(e64Var, id, d, rq3Var2, 5), hr3Var);
            }
        }
        hr3Var = new hr3(this, rq3Var);
        Object obj2 = hr3Var.r;
        lu3 lu3Var2 = lu3.a;
        i = hr3Var.t;
        boolean z2 = true;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        int id2 = ((Event) obj2).getId();
        Calendar calendar2 = ke0.a;
        String d2 = ke0.d(i());
        hr3Var.t = 2;
        e64 e64Var2 = this.e;
        e64Var2.getClass();
        obj2 = yaa.P(new c64(e64Var2, id2, d2, rq3Var22, 5), hr3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:325:0x0088, code lost:
    
        if (r4 != r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x006a, code lost:
    
        if (r1 == r3) goto L289;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(rq3 rq3Var) {
        ir3 ir3Var;
        int i;
        Event event;
        Object a;
        List<EventSuggest.IncidentSuggest> list;
        MyContributionsResponse myContributionsResponse;
        Object obj;
        EventSuggest.StartDateSuggest startDateSuggest;
        gv9 gv9Var;
        Object obj2;
        Object value;
        Object obj3;
        List<EventSuggest.IncidentSuggest> list2;
        Object next;
        boolean z;
        Integer M;
        TeamSides teamSides;
        int i2;
        Pair pair;
        int i3;
        int i4;
        Object obj4;
        List<EventSuggest.IncidentSuggest> liveIncidentSuggests;
        Object next2;
        Event event2;
        Object value2;
        Object obj5;
        CrowdsourcingContribution eventStartDateSuggest;
        GetCrowdsourcingEventContributionsResponse getCrowdsourcingEventContributionsResponse;
        CrowdsourcingContribution crowdsourcingContribution;
        if (rq3Var instanceof ir3) {
            ir3Var = (ir3) rq3Var;
            int i5 = ir3Var.v;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                ir3Var.v = i5 - Integer.MIN_VALUE;
                Object obj6 = ir3Var.t;
                lu3 lu3Var = lu3.a;
                i = ir3Var.v;
                fdi fdiVar = this.t;
                fdi fdiVar2 = this.o;
                fdi fdiVar3 = this.m;
                int i6 = 1;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj6);
                    ir3Var.v = 1;
                    obj6 = rd0.y(this.k, ir3Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                Event event3 = ir3Var.r;
                                y6a.M(obj6);
                                event2 = event3;
                                GetCrowdsourcingEventContributionsResponse getCrowdsourcingEventContributionsResponse2 = (GetCrowdsourcingEventContributionsResponse) yaa.x((x2g) obj6);
                                CrowdsourcingContribution crowdsourcingContribution2 = (getCrowdsourcingEventContributionsResponse2 != null || (eventStartDateSuggest = getCrowdsourcingEventContributionsResponse2.getEventStartDateSuggest()) == null || eventStartDateSuggest.getCount() <= 0) ? null : eventStartDateSuggest;
                                do {
                                    value2 = fdiVar3.getValue();
                                    if (value2 == null ? value2 instanceof dci : true) {
                                        obj5 = value2;
                                    } else {
                                        obj5 = (dci) value2;
                                        if (obj5 == null) {
                                            obj5 = new dci(null, event2.getStartTimestamp(), event2.getStartTimestamp(), crowdsourcingContribution2, event2.getId());
                                        }
                                    }
                                } while (!fdiVar3.k(value2, obj5));
                                return Unit.a;
                            }
                            if (i != 4) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            gv9Var = ir3Var.s;
                            y6a.M(obj6);
                            getCrowdsourcingEventContributionsResponse = (GetCrowdsourcingEventContributionsResponse) yaa.x((x2g) obj6);
                            if (getCrowdsourcingEventContributionsResponse != null || (crowdsourcingContribution = getCrowdsourcingEventContributionsResponse.getIncidentSuggests()) == null || crowdsourcingContribution.getCount() <= 0) {
                                crowdsourcingContribution = null;
                            }
                            d0a d0aVar = new d0a(gv9Var, crowdsourcingContribution);
                            fdiVar.getClass();
                            obj = null;
                            fdiVar.m(null, d0aVar);
                            fdiVar3.l(null);
                            fdiVar2.l(obj);
                            return Unit.a;
                        }
                        Event event4 = ir3Var.r;
                        y6a.M(obj6);
                        a = obj6;
                        event = event4;
                        MyContributionsResponse myContributionsResponse2 = (MyContributionsResponse) a;
                        Boolean valueOf = Boolean.valueOf((myContributionsResponse2 == null || (myContributionsResponse2.getLiveIncidentSuggests().isEmpty() && myContributionsResponse2.getFinalScoreSuggest() == null && myContributionsResponse2.getStartDateSuggest() == null)) ? false : true);
                        fdi fdiVar4 = this.q;
                        fdiVar4.getClass();
                        fdiVar4.m(null, valueOf);
                        EventSuggest.StartDateSuggest startDateSuggest2 = myContributionsResponse2 != null ? myContributionsResponse2.getStartDateSuggest() : null;
                        boolean t = me4.t(StatusKt.STATUS_FINISHED, event);
                        e64 e64Var = this.e;
                        fdi fdiVar5 = this.n;
                        if (t || (fdiVar5.getValue() instanceof g38) || startDateSuggest2 != null) {
                            if (myContributionsResponse2 == null || (list = myContributionsResponse2.getLiveIncidentSuggests()) == null) {
                                list = km5.a;
                            }
                            gv9 W = l6g.W(w(list));
                            EventSuggest.FinalScoreSuggest finalScoreSuggest = myContributionsResponse2 != null ? myContributionsResponse2.getFinalScoreSuggest() : null;
                            long startTimestamp = (!me4.t(StatusKt.STATUS_NOT_STARTED, event) || startDateSuggest2 == null) ? event.getStartTimestamp() : startDateSuggest2.getStartDateSuggestTimestamp();
                            boolean z2 = xe6.c().b().longValue() > startTimestamp + 6300 || t;
                            boolean z3 = startTimestamp < xe6.c().b().longValue() || me4.t(StatusKt.STATUS_IN_PROGRESS, event);
                            if (z2) {
                                boolean z4 = b.j(StatusKt.STATUS_NOT_STARTED, StatusKt.STATUS_IN_PROGRESS).contains(event.getStatus().getType()) && xe6.c().b().longValue() < startTimestamp + 9000;
                                if (myContributionsResponse2 == null || (liveIncidentSuggests = myContributionsResponse2.getLiveIncidentSuggests()) == null) {
                                    myContributionsResponse = myContributionsResponse2;
                                    teamSides = null;
                                    i2 = 1;
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj7 : liveIncidentSuggests) {
                                        if (obj7 instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                                            arrayList.add(obj7);
                                        }
                                    }
                                    Iterator it = arrayList.iterator();
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        if (it.hasNext()) {
                                            EventSuggest.IncidentSuggest.GoalSuggest goalSuggest = (EventSuggest.IncidentSuggest.GoalSuggest) next2;
                                            int awayScoreSuggest = goalSuggest.getAwayScoreSuggest() + goalSuggest.getHomeScoreSuggest();
                                            while (true) {
                                                Object next3 = it.next();
                                                EventSuggest.IncidentSuggest.GoalSuggest goalSuggest2 = (EventSuggest.IncidentSuggest.GoalSuggest) next3;
                                                myContributionsResponse = myContributionsResponse2;
                                                int awayScoreSuggest2 = goalSuggest2.getAwayScoreSuggest() + goalSuggest2.getHomeScoreSuggest();
                                                if (awayScoreSuggest < awayScoreSuggest2) {
                                                    awayScoreSuggest = awayScoreSuggest2;
                                                    next2 = next3;
                                                }
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                myContributionsResponse2 = myContributionsResponse;
                                            }
                                        } else {
                                            myContributionsResponse = myContributionsResponse2;
                                        }
                                    } else {
                                        myContributionsResponse = myContributionsResponse2;
                                        next2 = null;
                                    }
                                    EventSuggest.IncidentSuggest.GoalSuggest goalSuggest3 = (EventSuggest.IncidentSuggest.GoalSuggest) next2;
                                    if (goalSuggest3 != null) {
                                        pair = new Pair(Integer.valueOf(goalSuggest3.getHomeScoreSuggest()), Integer.valueOf(goalSuggest3.getAwayScoreSuggest()));
                                        int intValue = ((Number) pair.a).intValue();
                                        int intValue2 = ((Number) pair.b).intValue();
                                        EventSuggest.FinalScoreSuggest finalScoreSuggest2 = myContributionsResponse == null ? myContributionsResponse.getFinalScoreSuggest() : null;
                                        if (((h38) fdiVar5.getValue()) != null) {
                                            fdiVar5.m(null, finalScoreSuggest2 == null ? new f38(z4, intValue, intValue2, new scj(String.valueOf(intValue)), new scj(String.valueOf(intValue2)), null) : new g38(intValue, intValue2, finalScoreSuggest2.getStatus()));
                                        } else {
                                            int i7 = intValue;
                                            int i8 = intValue2;
                                            if (finalScoreSuggest2 != null) {
                                                fdiVar5.m(null, new g38(finalScoreSuggest2.getHomeScoreSuggest(), finalScoreSuggest2.getAwayScoreSuggest(), finalScoreSuggest2.getStatus()));
                                            } else {
                                                while (true) {
                                                    Object value3 = fdiVar5.getValue();
                                                    if (value3 instanceof f38) {
                                                        i3 = i7;
                                                        i4 = i8;
                                                        obj4 = f38.a((f38) value3, z4, i3, i4, null, 56);
                                                    } else {
                                                        i3 = i7;
                                                        i4 = i8;
                                                        obj4 = value3;
                                                    }
                                                    if (fdiVar5.k(value3, obj4)) {
                                                        break;
                                                    }
                                                    i7 = i3;
                                                    i8 = i4;
                                                }
                                            }
                                        }
                                    } else {
                                        i2 = 1;
                                        teamSides = null;
                                    }
                                }
                                pair = new Pair(Integer.valueOf(yid.m(Event.getHomeScore$default(event, teamSides, i2, teamSides).getDisplay())), Integer.valueOf(yid.m(Event.getAwayScore$default(event, teamSides, i2, teamSides).getDisplay())));
                                int intValue3 = ((Number) pair.a).intValue();
                                int intValue22 = ((Number) pair.b).intValue();
                                if (myContributionsResponse == null) {
                                }
                                if (((h38) fdiVar5.getValue()) != null) {
                                }
                            } else {
                                myContributionsResponse = myContributionsResponse2;
                            }
                            if (finalScoreSuggest != null) {
                                Iterator<E> it2 = W.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it2.next();
                                    if (obj2 instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                                        break;
                                    }
                                }
                                if (!(obj2 instanceof EventSuggest.IncidentSuggest.GoalSuggest)) {
                                    obj2 = null;
                                }
                                EventSuggest.IncidentSuggest.GoalSuggest goalSuggest4 = (EventSuggest.IncidentSuggest.GoalSuggest) obj2;
                                int m = yid.m(goalSuggest4 != null ? new Integer(goalSuggest4.getHomeScoreSuggest()) : null);
                                int m2 = yid.m(goalSuggest4 != null ? new Integer(goalSuggest4.getAwayScoreSuggest()) : null);
                                int awayScoreSuggest3 = finalScoreSuggest.getAwayScoreSuggest() + finalScoreSuggest.getHomeScoreSuggest();
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj8 : W) {
                                    if (obj8 instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                                        arrayList2.add(obj8);
                                    }
                                }
                                if (arrayList2.size() == awayScoreSuggest3 || (m > finalScoreSuggest.getHomeScoreSuggest() && m2 > finalScoreSuggest.getAwayScoreSuggest())) {
                                    f0a f0aVar = new f0a(W);
                                    fdiVar.getClass();
                                    obj = null;
                                    fdiVar.m(null, f0aVar);
                                } else {
                                    do {
                                        value = fdiVar.getValue();
                                        if (value != null ? value instanceof d0a : true) {
                                            EventSuggest.FinalScoreSuggest finalScoreSuggest3 = myContributionsResponse != null ? myContributionsResponse.getFinalScoreSuggest() : null;
                                            if (myContributionsResponse == null || (list2 = myContributionsResponse.getLiveIncidentSuggests()) == null) {
                                                list2 = km5.a;
                                            }
                                            int m3 = yid.m(finalScoreSuggest3 != null ? Integer.valueOf(finalScoreSuggest3.getHomeScoreSuggest()) : null);
                                            int m4 = yid.m(finalScoreSuggest3 != null ? Integer.valueOf(finalScoreSuggest3.getAwayScoreSuggest()) : null);
                                            ArrayList arrayList3 = new ArrayList();
                                            for (Object obj9 : list2) {
                                                if (obj9 instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                                                    arrayList3.add(obj9);
                                                }
                                            }
                                            Iterator it3 = arrayList3.iterator();
                                            if (it3.hasNext()) {
                                                next = it3.next();
                                                if (it3.hasNext()) {
                                                    EventSuggest.IncidentSuggest.GoalSuggest goalSuggest5 = (EventSuggest.IncidentSuggest.GoalSuggest) next;
                                                    int awayScoreSuggest4 = goalSuggest5.getAwayScoreSuggest() + goalSuggest5.getHomeScoreSuggest();
                                                    do {
                                                        Object next4 = it3.next();
                                                        EventSuggest.IncidentSuggest.GoalSuggest goalSuggest6 = (EventSuggest.IncidentSuggest.GoalSuggest) next4;
                                                        int awayScoreSuggest5 = goalSuggest6.getAwayScoreSuggest() + goalSuggest6.getHomeScoreSuggest();
                                                        if (awayScoreSuggest4 < awayScoreSuggest5) {
                                                            next = next4;
                                                            awayScoreSuggest4 = awayScoreSuggest5;
                                                        }
                                                    } while (it3.hasNext());
                                                }
                                            } else {
                                                next = null;
                                            }
                                            EventSuggest.IncidentSuggest.GoalSuggest goalSuggest7 = (EventSuggest.IncidentSuggest.GoalSuggest) next;
                                            int m5 = m3 - yid.m(goalSuggest7 != null ? Integer.valueOf(goalSuggest7.getHomeScoreSuggest()) : null);
                                            int m6 = m4 - yid.m(goalSuggest7 != null ? Integer.valueOf(goalSuggest7.getAwayScoreSuggest()) : null);
                                            ArrayList arrayList4 = new ArrayList();
                                            int m7 = yid.m(goalSuggest7 != null ? Integer.valueOf(goalSuggest7.getHomeScoreSuggest()) : null);
                                            int m8 = yid.m(goalSuggest7 != null ? Integer.valueOf(goalSuggest7.getAwayScoreSuggest()) : null);
                                            int i9 = m7;
                                            int i10 = 0;
                                            while (i10 < m5) {
                                                TeamSide teamSide = TeamSide.HOME;
                                                int i11 = i9 + 1;
                                                CrowdsourcingIncidentType.Goal goal = CrowdsourcingIncidentType.Goal.REGULAR;
                                                int i12 = i9a.d - 1;
                                                i9a.d = i12;
                                                arrayList4.add(new EventSuggest.IncidentSuggest.GoalSuggest(i12, SuggestStatus.SUBMITTED, false, i11, m8, null, null, null, null, goal, teamSide, null, null, null));
                                                i10++;
                                                i9 = i11;
                                            }
                                            int i13 = 0;
                                            while (i13 < m6) {
                                                TeamSide teamSide2 = TeamSide.AWAY;
                                                int i14 = m8 + 1;
                                                CrowdsourcingIncidentType.Goal goal2 = CrowdsourcingIncidentType.Goal.REGULAR;
                                                int i15 = i9a.d - 1;
                                                i9a.d = i15;
                                                arrayList4.add(new EventSuggest.IncidentSuggest.GoalSuggest(i15, SuggestStatus.SUBMITTED, false, i9, i14, null, null, null, null, goal2, teamSide2, null, null, null));
                                                i13++;
                                                m8 = i14;
                                            }
                                            ArrayList w0 = CollectionsKt.w0(list2, CollectionsKt.B0(arrayList4));
                                            Integer M2 = z8e.M(w0, new q73(8));
                                            ArrayList arrayList5 = new ArrayList(k13.r(w0, 10));
                                            Iterator it4 = w0.iterator();
                                            while (it4.hasNext()) {
                                                EventSuggest.IncidentSuggest incidentSuggest = (EventSuggest.IncidentSuggest) it4.next();
                                                boolean z5 = incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest;
                                                if (z5) {
                                                    if (list2.contains(incidentSuggest)) {
                                                        z = false;
                                                        if (!z5) {
                                                            M = M2;
                                                        } else {
                                                            if (!(incidentSuggest instanceof EventSuggest.IncidentSuggest.CardSuggest)) {
                                                                zzl.b();
                                                                return null;
                                                            }
                                                            M = z8e.M(w0, new ox1((EventSuggest.IncidentSuggest.CardSuggest) incidentSuggest, 26));
                                                        }
                                                        arrayList5.add(new wyf(incidentSuggest, z, M));
                                                    }
                                                } else if (!(incidentSuggest instanceof EventSuggest.IncidentSuggest.CardSuggest)) {
                                                    zzl.b();
                                                    return null;
                                                }
                                                z = true;
                                                if (!z5) {
                                                }
                                                arrayList5.add(new wyf(incidentSuggest, z, M));
                                            }
                                            obj3 = new e0a(l6g.W(arrayList5), l6g.W(list2), rlh.b, true);
                                        } else {
                                            obj3 = value;
                                        }
                                    } while (!fdiVar.k(value, obj3));
                                    obj = null;
                                }
                                fdiVar3.l(obj);
                            } else {
                                rq3 rq3Var3 = null;
                                if (z3) {
                                    int id = event.getId();
                                    ir3Var.r = null;
                                    ir3Var.s = W;
                                    ir3Var.v = 4;
                                    e64Var.getClass();
                                    obj6 = yaa.P(new b64(e64Var, id, rq3Var3, 1), ir3Var);
                                    if (obj6 != lu3Var) {
                                        gv9Var = W;
                                        getCrowdsourcingEventContributionsResponse = (GetCrowdsourcingEventContributionsResponse) yaa.x((x2g) obj6);
                                        if (getCrowdsourcingEventContributionsResponse != null) {
                                        }
                                        crowdsourcingContribution = null;
                                        d0a d0aVar2 = new d0a(gv9Var, crowdsourcingContribution);
                                        fdiVar.getClass();
                                        obj = null;
                                        fdiVar.m(null, d0aVar2);
                                        fdiVar3.l(null);
                                    }
                                } else {
                                    fdiVar3.l((myContributionsResponse == null || (startDateSuggest = myContributionsResponse.getStartDateSuggest()) == null) ? null : new eci(startDateSuggest.getStartDateSuggestTimestamp(), startDateSuggest.getStatus()));
                                    obj = null;
                                }
                            }
                            fdiVar2.l(obj);
                            return Unit.a;
                        }
                        if (xe6.c().b().longValue() - 6300 > event.getStartTimestamp()) {
                            if ((myContributionsResponse2 != null ? myContributionsResponse2.getFinalScoreSuggest() : null) == null) {
                                fdiVar3.l(null);
                                if (fdiVar2.getValue() == null) {
                                    svb svbVar = new svb(null, new scj(String.valueOf(yid.m(Event.getHomeScore$default(event, null, 1, null).getDisplay()))), new scj(String.valueOf(yid.m(Event.getAwayScore$default(event, null, 1, null).getDisplay()))), event.getStartTimestamp(), event.getStartTimestamp(), event.getId());
                                    fdiVar2.getClass();
                                    fdiVar2.m(null, svbVar);
                                }
                                return Unit.a;
                            }
                        }
                        int id2 = event.getId();
                        ir3Var.r = event;
                        ir3Var.s = null;
                        ir3Var.v = 3;
                        e64Var.getClass();
                        Object P = yaa.P(new b64(e64Var, id2, rq3Var2, i6), ir3Var);
                        if (P != lu3Var) {
                            event2 = event;
                            obj6 = P;
                            GetCrowdsourcingEventContributionsResponse getCrowdsourcingEventContributionsResponse22 = (GetCrowdsourcingEventContributionsResponse) yaa.x((x2g) obj6);
                            if (getCrowdsourcingEventContributionsResponse22 != null) {
                            }
                            do {
                                value2 = fdiVar3.getValue();
                                if (value2 == null ? value2 instanceof dci : true) {
                                }
                            } while (!fdiVar3.k(value2, obj5));
                            return Unit.a;
                        }
                        return lu3Var;
                    }
                    y6a.M(obj6);
                }
                event = (Event) obj6;
                int id3 = event.getId();
                Calendar calendar = ke0.a;
                String d = ke0.d(i());
                ir3Var.r = event;
                ir3Var.v = 2;
                a = this.f.a(id3, d, ir3Var);
            }
        }
        ir3Var = new ir3(this, rq3Var);
        Object obj62 = ir3Var.t;
        lu3 lu3Var2 = lu3.a;
        i = ir3Var.v;
        fdi fdiVar6 = this.t;
        fdi fdiVar22 = this.o;
        fdi fdiVar32 = this.m;
        int i62 = 1;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        event = (Event) obj62;
        int id32 = event.getId();
        Calendar calendar2 = ke0.a;
        String d2 = ke0.d(i());
        ir3Var.r = event;
        ir3Var.v = 2;
        a = this.f.a(id32, d2, ir3Var);
    }

    public final g9i v() {
        return xw3.L(un0.z(this), null, null, new xq3(this, null, 7), 3);
    }

    public final void x(boolean z) {
        xw3.L(un0.z(this), null, null, new pr3(this, z, null), 3);
    }
}
