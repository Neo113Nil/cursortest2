package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Base64;
import android.view.View;
import com.appsflyer.AppsFlyerLib;
import com.facebook.k0;
import com.facebook.w;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzaq;
import com.google.android.gms.internal.consent_sdk.zzcw;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.google.android.gms.internal.measurement.zzez;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.moloco.sdk.acm.h;
import com.moloco.sdk.acm.recorder.b;
import com.moloco.sdk.acm.recorder.c;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.init.a;
import com.moloco.sdk.internal.services.init.g;
import com.moloco.sdk.j2;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.fantasy.FantasyFixtureFDRView;
import com.sofascore.model.fantasy.FantasyLeagueConfig;
import com.sofascore.model.fantasy.FantasyLeagueMatchupSquad;
import com.sofascore.model.fantasy.FantasyLeagueMatchupSquadPlayer;
import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.mvvm.model.TennisEvent;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.FirstTeamToScoreVote;
import com.sofascore.model.network.response.Vote;
import com.sofascore.model.network.response.VotesResponseKt;
import com.sofascore.model.network.response.WillBothTeamsScoreVote;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t53 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t53(Map map, tj7 tj7Var, Map map2, FantasyLeagueConfig fantasyLeagueConfig, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 5;
        this.v = map;
        this.s = tj7Var;
        this.t = map2;
        this.u = fantasyLeagueConfig;
    }

    private final Object e(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        byte[] bytes = ((String) this.s).getBytes(Charsets.UTF_8);
        bytes.getClass();
        ((d) this.t).a.a((String) this.u, bytes, (up3) this.v, null);
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.v;
        Object obj3 = this.u;
        Object obj4 = this.t;
        switch (i) {
            case 0:
                return new t53((u53) this.s, (lcd) obj4, (pkk) obj3, (Map) obj2, rq3Var, 0);
            case 1:
                t53 t53Var = new t53((qze) obj4, (b9j) obj3, (tbj) obj2, rq3Var, 1);
                t53Var.s = obj;
                return t53Var;
            case 2:
                return new t53((x2g) this.s, (Context) obj4, (ai4) obj3, (Set) obj2, rq3Var, 2);
            case 3:
                return new t53((List) this.s, (lh2) obj4, (c36) obj3, (xs2) obj2, rq3Var, 3);
            case 4:
                t53 t53Var2 = new t53((od7) obj4, (List) obj3, (Map) obj2, rq3Var, 4);
                t53Var2.s = obj;
                return t53Var2;
            case 5:
                return new t53((Map) obj2, (tj7) this.s, (Map) obj4, (FantasyLeagueConfig) obj3, rq3Var);
            case 6:
                return new t53((ale) this.s, (View) obj4, (Function2) obj3, (Function2) obj2, rq3Var, 6);
            case 7:
                return new t53((w3f) this.s, (e1d) obj4, (e1d) obj3, (e1d) obj2, rq3Var, 7);
            case 8:
                t53 t53Var3 = new t53((e1d) obj4, (Function2) obj3, (Function2) obj2, rq3Var, 8);
                t53Var3.s = obj;
                return t53Var3;
            case 9:
                return new t53((plb) this.s, (Context) obj4, (String) obj3, (String) obj2, rq3Var, 9);
            case 10:
                t53 t53Var4 = new t53((List) obj4, (q50) obj3, (e1d) obj2, rq3Var, 10);
                t53Var4.s = obj;
                return t53Var4;
            case 11:
                t53 t53Var5 = new t53((String) obj4, (String) obj3, (String) obj2, rq3Var, 11);
                t53Var5.s = obj;
                return t53Var5;
            case 12:
                t53 t53Var6 = new t53((ProfileData) obj4, (Boolean) obj3, (Boolean) obj2, rq3Var, 12);
                t53Var6.s = obj;
                return t53Var6;
            case 13:
                t53 t53Var7 = new t53((ct8) obj4, (k6l) obj3, (List) obj2, rq3Var, 13);
                t53Var7.s = obj;
                return t53Var7;
            case 14:
                return new t53((b) this.s, (a) obj4, (j2) obj3, (g) obj2, rq3Var, 14);
            case 15:
                return new t53((String) this.s, (d) obj4, (String) obj3, (up3) obj2, rq3Var, 15);
            default:
                return new t53((j) this.s, (String) obj4, (u) obj3, (u) obj2, rq3Var, 16);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
        }
        return ((t53) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x0765, code lost:
    
        if (r1 == null) goto L245;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd A[Catch: Exception -> 0x009f, TryCatch #0 {Exception -> 0x009f, blocks: (B:14:0x0070, B:16:0x0095, B:21:0x00bd, B:23:0x00d5, B:28:0x0109, B:30:0x00a4), top: B:13:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5 A[Catch: Exception -> 0x009f, TryCatch #0 {Exception -> 0x009f, blocks: (B:14:0x0070, B:16:0x0095, B:21:0x00bd, B:23:0x00d5, B:28:0x0109, B:30:0x00a4), top: B:13:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0102  */
    /* JADX WARN: Type inference failed for: r0v32, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r7v16, types: [km5] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.Unit] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        Object rkkVar;
        ?? r7;
        List<Event> events;
        Pair pair;
        ArrayList arrayList;
        List S0;
        String groundType;
        TennisEvent tennisEvent;
        String groundType2;
        gv9 gv9Var;
        long weeklyChallengeDailyBonusUsedAtTimestamp;
        long j;
        Boolean bool;
        MolocoLogger molocoLogger;
        String encodeToString;
        boolean z;
        int i = 3;
        ?? r9 = 0;
        r9 = null;
        r9 = null;
        Integer num = null;
        boolean z2 = false;
        int i2 = 0;
        z2 = false;
        switch (this.r) {
            case 0:
                pkk pkkVar = (pkk) this.u;
                lcd lcdVar = (lcd) this.t;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                u53 u53Var = (u53) this.s;
                Iterator it = ((List) u53Var.f).iterator();
                while (true) {
                    if (it.hasNext()) {
                        xkk xkkVar = (xkk) it.next();
                        List list = x53.a;
                        xkkVar.getClass();
                        klk klkVar = xkkVar.e;
                        String str2 = xkkVar.f;
                        String str3 = xkkVar.g;
                        String str4 = klkVar != null ? klkVar.a : null;
                        if (str4 == null || str4.length() == 0) {
                            rkkVar = (str3 == null || str3.length() == 0) ? (str2 == null || str2.length() == 0) ? null : new rkk(str2) : new qkk(str3);
                        } else {
                            klkVar.getClass();
                            rkkVar = new skk(klkVar.a, klkVar.b);
                        }
                        if (rkkVar instanceof skk) {
                            String str5 = xkkVar.c;
                            String o = mz1.o(new StringBuilder("<img src=\""), ((skk) rkkVar).i, "\">");
                            if (str5 != null) {
                                o = bf3.k("<a href=\"", str5, "\">", o, "</a>");
                            }
                            str = lnb.o("\n        <html>\n          <head>\n            <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,user-scalable=no\">\n            <style>\n              html,body{overflow:hidden;margin:0;padding:0;height:100%;width:100%}\n              div{width: 100%; height: 100%;display:flex;justify-content:center;align-items:center;}\n              img{width:100%;height:auto}\n            </style>\n          </head>\n          <body>\n            <div>", o, "</div>\n          </body>\n        </html>\n    ");
                        } else if (rkkVar instanceof qkk) {
                            str = ((qkk) rkkVar).i;
                        } else if (rkkVar instanceof rkk) {
                            str = dii.c("\n            <!DOCTYPE html>\n            <html>\n                <head>\n                    <style>\n                        html, body {height: 100%;width: 100%;margin: 0;padding: 0;}\n                        iframe { height: 100%; width: 100%; border: none;}\n                    </style>\n                </head>\n                <body>\n                <iframe src=\"" + ((rkk) rkkVar).i + "\"></iframe>\n                </body>\n            </html>\n        ");
                        } else {
                            str = null;
                        }
                        if (str != null) {
                        }
                    } else {
                        str = null;
                    }
                }
                if (str != null) {
                    Map map = (Map) this.v;
                    fhh fhhVar = qyf.a;
                    int i3 = fhhVar.c;
                    int i4 = 0;
                    while (true) {
                        if (i4 < i3) {
                            obj2 = fhhVar.k(i4);
                            if (!(((qyf) obj2) instanceof ydi)) {
                                i4++;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    if ((obj2 instanceof ydi ? (ydi) obj2 : null) == null) {
                        new ydi();
                    }
                    ydi.c(new v53((hcd) u53Var.b, str), lcdVar, false, new s53(z2 ? 1 : 0, u53Var, map, pkkVar));
                    r9 = Unit.a;
                }
                if (r9 == 0) {
                    u53Var.e(lcdVar, pkkVar);
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                ku3 ku3Var = (ku3) this.s;
                nu3 nu3Var = nu3.d;
                qze qzeVar = (qze) this.t;
                xw3.L(ku3Var, null, nu3Var, new nt3(qzeVar, (b9j) this.u, r9, z2 ? 1 : 0), 1);
                xw3.L(ku3Var, null, nu3Var, new hy1(qzeVar, (tbj) this.v, r9, 22), 1);
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                EventListResponse eventListResponse = (EventListResponse) yaa.x((x2g) this.s);
                if (eventListResponse == null || (events = eventListResponse.getEvents()) == null) {
                    r7 = km5.a;
                } else {
                    ai4 ai4Var = (ai4) this.u;
                    Set set = (Set) this.v;
                    r7 = new ArrayList();
                    for (Object obj3 : events) {
                        Event event = (Event) obj3;
                        long startTimestamp = event.getStartTimestamp();
                        Long endTimestamp = event.getEndTimestamp();
                        boolean J = aba.J(startTimestamp, endTimestamp != null ? endTimestamp.longValue() : 0L, ai4Var.h);
                        boolean z3 = set == null || set.contains(new Integer(event.getId()));
                        if (J && z3) {
                            r7.add(obj3);
                        }
                    }
                }
                List list2 = r7;
                return list2.isEmpty() ? km5.a : mx9.u((Context) this.t, list2, km5.a, null, false, false, false, true, new z16(4), 5112);
            case 3:
                xs2 xs2Var = (xs2) this.v;
                c36 c36Var = (c36) this.u;
                lu3 lu3Var4 = lu3.a;
                fsf g = lnb.g(obj);
                List list3 = (List) this.s;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list3) {
                    if (obj4 instanceof y21) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((y21) it2.next()).d());
                }
                g.a = arrayList3;
                int ordinal = ((lh2) this.t).ordinal();
                if (ordinal == 0) {
                    pair = new Pair(new Integer(c36Var.k().getHomeTeam(TeamSides.ORIGINAL).getId()), null);
                } else if (ordinal == 1) {
                    pair = new Pair(new Integer(Event.getHomeTeam$default(c36Var.k(), null, 1, null).getId()), Event.getHomeTeam$default(c36Var.k(), null, 1, null));
                } else {
                    if (ordinal != 2) {
                        zzl.b();
                        return null;
                    }
                    pair = new Pair(new Integer(Event.getAwayTeam$default(c36Var.k(), null, 1, null).getId()), Event.getAwayTeam$default(c36Var.k(), null, 1, null));
                }
                int intValue = ((Number) pair.a).intValue();
                Team team = (Team) pair.b;
                if (xs2Var != null && (arrayList = xs2Var.e) != null && (S0 = CollectionsKt.S0(arrayList)) != null) {
                    Iterator it3 = S0.iterator();
                    while (it3.hasNext()) {
                        int ordinal2 = ((ws2) it3.next()).ordinal();
                        if (ordinal2 == 0) {
                            Iterable iterable = (Iterable) g.a;
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj5 : iterable) {
                                if (((Event) obj5).getHomeTeam(TeamSides.ORIGINAL).getId() == intValue) {
                                    arrayList4.add(obj5);
                                }
                            }
                            g.a = arrayList4;
                        } else if (ordinal2 == 1) {
                            Iterable iterable2 = (Iterable) g.a;
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj6 : iterable2) {
                                if (((Event) obj6).getAwayTeam(TeamSides.ORIGINAL).getId() == intValue) {
                                    arrayList5.add(obj6);
                                }
                            }
                            g.a = arrayList5;
                        } else if (ordinal2 == 2) {
                            Iterable iterable3 = (Iterable) g.a;
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj7 : iterable3) {
                                Event event2 = (Event) obj7;
                                if (event2.getTournament().getId() != c36Var.k().getTournament().getId()) {
                                    UniqueTournament uniqueTournament = event2.getTournament().getUniqueTournament();
                                    Integer num2 = uniqueTournament != null ? new Integer(uniqueTournament.getId()) : null;
                                    UniqueTournament uniqueTournament2 = c36Var.k().getTournament().getUniqueTournament();
                                    if (Intrinsics.c(num2, uniqueTournament2 != null ? new Integer(uniqueTournament2.getId()) : new Integer(-1))) {
                                    }
                                }
                                arrayList6.add(obj7);
                            }
                            g.a = arrayList6;
                        } else if (ordinal2 == 3) {
                            Iterable iterable4 = (Iterable) g.a;
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj8 : iterable4) {
                                if (!((Event) obj8).isDoublesMatch()) {
                                    arrayList7.add(obj8);
                                }
                            }
                            g.a = arrayList7;
                        } else {
                            if (ordinal2 != 4) {
                                zzl.b();
                                return null;
                            }
                            Event k = c36Var.k();
                            TennisEvent tennisEvent2 = k instanceof TennisEvent ? (TennisEvent) k : null;
                            if (tennisEvent2 != null && (groundType = tennisEvent2.getGroundType()) != null && groundType.length() != 0) {
                                Iterable iterable5 = (Iterable) g.a;
                                ArrayList arrayList8 = new ArrayList();
                                for (Object obj9 : iterable5) {
                                    Event event3 = (Event) obj9;
                                    if ((event3 instanceof TennisEvent) && (groundType2 = (tennisEvent = (TennisEvent) event3).getGroundType()) != null && groundType2.length() != 0 && Intrinsics.c(tennisEvent.getGroundType(), tennisEvent2.getGroundType())) {
                                        arrayList8.add(obj9);
                                    }
                                }
                                g.a = arrayList8;
                            }
                        }
                    }
                }
                c36Var.l.k(new u26(xs2Var, (List) g.a, team));
                return Unit.a;
            case 4:
                FantasyRoundPlayer fantasyRoundPlayer = (FantasyRoundPlayer) this.s;
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                FantasyRoundPlayerUiModel g0 = hkg.g0(fantasyRoundPlayer, ((od7) this.t).i());
                boolean contains = ((List) this.u).contains(new Integer(g0.a));
                List list4 = (List) me4.f(g0.g.c, (Map) this.v);
                if (list4 != null) {
                    ArrayList arrayList9 = new ArrayList(k13.r(list4, 10));
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        List<FantasyFixtureFDRView> H0 = CollectionsKt.H0((List) it4.next(), new v66(29));
                        ArrayList arrayList10 = new ArrayList(k13.r(H0, 10));
                        for (FantasyFixtureFDRView fantasyFixtureFDRView : H0) {
                            int eventId = fantasyFixtureFDRView.getEventId();
                            int opponentTeamId = fantasyFixtureFDRView.getOpponentTeamId();
                            hjg hjgVar = o68.b;
                            String fixtureDifficulty = fantasyFixtureFDRView.getFixtureDifficulty();
                            hjgVar.getClass();
                            o68 q = hjg.q(fixtureDifficulty);
                            kpg kpgVar = p68.b;
                            String locationType = fantasyFixtureFDRView.getLocationType();
                            kpgVar.getClass();
                            arrayList10.add(new ux6(eventId, opponentTeamId, q, kpg.s(locationType), null));
                        }
                        arrayList9.add(new tx6(l6g.W(arrayList10)));
                    }
                    gv9Var = l6g.W(arrayList9);
                    break;
                }
                gv9Var = rlh.b;
                return new q67(g0, gv9Var, contains);
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                Map map2 = (Map) this.v;
                tj7 tj7Var = (tj7) this.s;
                Map map3 = (Map) this.t;
                FantasyLeagueConfig fantasyLeagueConfig = (FantasyLeagueConfig) this.u;
                LinkedHashMap linkedHashMap = new LinkedHashMap(sub.c(map2.size()));
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    FantasyLeagueMatchupSquad fantasyLeagueMatchupSquad = (FantasyLeagueMatchupSquad) entry.getValue();
                    int i5 = 0;
                    for (FantasyLeagueMatchupSquadPlayer fantasyLeagueMatchupSquadPlayer : fantasyLeagueMatchupSquad.getPlayers()) {
                        int i6 = (fantasyLeagueMatchupSquadPlayer.isCaptain() && fantasyLeagueMatchupSquad.getTripleCaptain()) ? 3 : fantasyLeagueMatchupSquadPlayer.isCaptain() ? 2 : 1;
                        int fantasyPlayerId = fantasyLeagueMatchupSquadPlayer.getFantasyPlayerId();
                        String position = fantasyLeagueMatchupSquadPlayer.getPosition();
                        tj7Var.getClass();
                        i5 += tj7.a(fantasyPlayerId, position, map3, fantasyLeagueConfig, i6);
                    }
                    linkedHashMap.put(key, new Integer(i5 - fantasyLeagueMatchupSquad.getTransferPenalty()));
                }
                return linkedHashMap;
            case 6:
                ?? r0 = (Function2) this.v;
                View view = (View) this.t;
                ale aleVar = (ale) this.s;
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                Object tag = view.getTag();
                ale aleVar2 = tag instanceof ale ? (ale) tag : null;
                if (aleVar2 != null && !aleVar2.equals(aleVar) && aleVar2.k(27)) {
                    r0.invoke(aleVar2, view);
                }
                if (aleVar.k(27)) {
                    ((Function2) this.u).invoke(aleVar, view);
                    view.setTag(aleVar);
                }
                return Unit.a;
            case 7:
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                e1d e1dVar = (e1d) this.t;
                w3f w3fVar = (w3f) this.s;
                String str6 = w3fVar.k;
                boolean z4 = w3fVar.j;
                String str7 = w3fVar.g;
                e1dVar.setValue(Boolean.valueOf((str7 == null || str7.length() == 0 || w3fVar.m) && !z4 && Intrinsics.c(str6, StatusKt.STATUS_NOT_STARTED)));
                e1d e1dVar2 = (e1d) this.u;
                if (!z4 && Intrinsics.c(str6, StatusKt.STATUS_NOT_STARTED)) {
                    z2 = true;
                }
                e1dVar2.setValue(Boolean.valueOf(z2));
                e1d e1dVar3 = (e1d) this.v;
                int ordinal3 = w3fVar.b.ordinal();
                if (ordinal3 == 0) {
                    Vote vote = w3fVar.d;
                    if (vote != null) {
                        num = new Integer(VotesResponseKt.getTotalVotes(vote));
                    }
                } else if (ordinal3 == 1) {
                    WillBothTeamsScoreVote willBothTeamsScoreVote = w3fVar.f;
                    if (willBothTeamsScoreVote != null) {
                        num = new Integer(VotesResponseKt.getTotalVotes(willBothTeamsScoreVote));
                    }
                } else {
                    if (ordinal3 != 2) {
                        zzl.b();
                        return null;
                    }
                    FirstTeamToScoreVote firstTeamToScoreVote = w3fVar.e;
                    if (firstTeamToScoreVote != null) {
                        num = new Integer(VotesResponseKt.getTotalVotes(firstTeamToScoreVote));
                    }
                }
                e1dVar3.setValue(num);
                return Unit.a;
            case 8:
                ku3 ku3Var2 = (ku3) this.s;
                lu3 lu3Var9 = lu3.a;
                y6a.M(obj);
                if (((Boolean) ((e1d) this.t).getValue()).booleanValue()) {
                    xw3.L(ku3Var2, null, null, new p4f((Function2) this.u, null, 6), 3);
                    xw3.L(ku3Var2, null, null, new p4f((Function2) this.v, null, 7), 3);
                }
                return Unit.a;
            case 9:
                lu3 lu3Var10 = lu3.a;
                y6a.M(obj);
                for (of8 of8Var : ((plb) this.s).f.values()) {
                    Context context = (Context) this.t;
                    of8Var.getClass();
                    String str8 = (String) this.u;
                    String str9 = (String) this.v;
                    String str10 = of8Var.a;
                    String str11 = of8Var.c;
                    try {
                        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), wv8.i(str8, str10, str9));
                        try {
                            createFromAsset.getClass();
                            str11.getClass();
                            boolean J2 = StringsKt.J(str11, "Italic", false);
                            boolean J3 = StringsKt.J(str11, "Bold", false);
                            int i7 = (J2 && J3) ? 3 : J2 ? 2 : J3 ? 1 : 0;
                            if (createFromAsset.getStyle() != i7) {
                                createFromAsset = Typeface.create(createFromAsset, i7);
                            }
                            of8Var.d = createFromAsset;
                        } catch (Exception unused) {
                            ajb.a.getClass();
                        }
                    } catch (Exception unused2) {
                        ajb.a.getClass();
                    }
                }
                return Unit.a;
            case 10:
                ku3 ku3Var3 = (ku3) this.s;
                lu3 lu3Var11 = lu3.a;
                y6a.M(obj);
                xw3.L(ku3Var3, null, null, new cth((q50) this.u, (e1d) this.v, r9, z2 ? 1 : 0), 3);
                for (Object obj10 : (List) this.t) {
                    int i8 = i2 + 1;
                    if (i2 < 0) {
                        kotlin.collections.b.q();
                        throw null;
                    }
                    xw3.L(ku3Var3, null, null, new bce((q50) obj10, i2, r9, i), 3);
                    i2 = i8;
                }
                return Unit.a;
            case 11:
                UserAccount userAccount = (UserAccount) this.s;
                lu3 lu3Var12 = lu3.a;
                y6a.M(obj);
                return UserAccount.copy$default(userAccount, null, (String) this.t, (String) this.u, (String) this.v, null, false, false, null, null, false, false, false, false, 0L, null, null, null, false, 0, 0, 0, 0L, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, null, 0L, null, null, null, null, null, -15, 3, null);
            case 12:
                UserAccount userAccount2 = (UserAccount) this.s;
                lu3 lu3Var13 = lu3.a;
                y6a.M(obj);
                Boolean dataSharingOptOut = ((ProfileData) this.t).getDataSharingOptOut();
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.c(dataSharingOptOut, bool2) && !Intrinsics.c(((ProfileData) this.t).getDataSharingOptOut(), userAccount2.getDataSharingOptOut())) {
                    ia0 ia0Var = ia0.q;
                    ia0 p = ok3.p();
                    s38.a().d(false);
                    if (t62.a == null) {
                        synchronized (t62.b) {
                            try {
                                if (t62.a == null) {
                                    r38 c = r38.c();
                                    c.a();
                                    t62.a = FirebaseAnalytics.getInstance(c.a);
                                }
                                Unit unit = Unit.a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    FirebaseAnalytics firebaseAnalytics = t62.a;
                    firebaseAnalytics.getClass();
                    zzez zzezVar = firebaseAnalytics.a;
                    Boolean bool3 = Boolean.FALSE;
                    zzezVar.getClass();
                    zzezVar.c(new kzn(zzezVar, bool3));
                    y48 a = y48.a();
                    a.getClass();
                    a.b(false);
                    w.k();
                    k0.k();
                    String[] strArr = new String[0];
                    if (!cw3.a.contains(w.class)) {
                        try {
                            w.l(strArr);
                        } catch (Throwable th2) {
                            cw3.a(w.class, th2);
                        }
                    }
                    AppsFlyerLib.getInstance().stop(true, p);
                    fdi fdiVar = dg0.d;
                    cg0 cg0Var = cg0.c;
                    fdiVar.getClass();
                    fdiVar.m(null, cg0Var);
                    zzj b = zza.a(p).b();
                    b.c.c.set(null);
                    zzaq zzaqVar = b.a;
                    Application application = zzaqVar.a;
                    HashSet hashSet = zzaqVar.c;
                    zzcw.b(application, hashSet);
                    hashSet.clear();
                    zzaqVar.b.edit().remove("stored_info").remove("consent_status").remove("consent_type").remove("privacy_options_requirement_status").remove("is_pub_misconfigured").remove("written_values").commit();
                    synchronized (b.d) {
                        b.g = false;
                    }
                }
                String id = ((ProfileData) this.t).getId();
                if (id == null) {
                    id = "";
                }
                String str12 = id;
                String nickname = ((ProfileData) this.t).getNickname();
                if (nickname == null) {
                    nickname = "";
                }
                String str13 = nickname;
                String chatRole = ((ProfileData) this.t).getChatRole();
                if (chatRole == null) {
                    chatRole = "";
                }
                String str14 = chatRole;
                String chatFlag = ((ProfileData) this.t).getChatFlag();
                if (chatFlag == null) {
                    chatFlag = "";
                }
                String str15 = chatFlag;
                String imageURL = ((ProfileData) this.t).getImageURL();
                if (imageURL == null) {
                    imageURL = "";
                }
                String str16 = imageURL;
                boolean c2 = Intrinsics.c(((ProfileData) this.t).getActiveCrowdsourcer(), bool2);
                Double credibilityScore = ((ProfileData) this.t).getCredibilityScore();
                float doubleValue = credibilityScore != null ? (float) credibilityScore.doubleValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                long joinDate = ((ProfileData) this.t).getJoinDate();
                long syncTimestamp = ((ProfileData) this.t).getSyncTimestamp();
                boolean editor = ((ProfileData) this.t).getEditor();
                String editorName = ((ProfileData) this.t).getEditorName();
                boolean c3 = Intrinsics.c(((ProfileData) this.t).getFantasyUser(), bool2);
                Integer leaderboardId = ((ProfileData) this.t).getLeaderboardId();
                int intValue2 = leaderboardId != null ? leaderboardId.intValue() : 0;
                Integer previousLeaderboardId = ((ProfileData) this.t).getPreviousLeaderboardId();
                int intValue3 = previousLeaderboardId != null ? previousLeaderboardId.intValue() : 0;
                Integer maxLeagueLevel = ((ProfileData) this.t).getMaxLeagueLevel();
                int intValue4 = maxLeagueLevel != null ? maxLeagueLevel.intValue() : 0;
                Boolean bool4 = (Boolean) this.u;
                boolean booleanValue = bool4 != null ? bool4.booleanValue() : userAccount2.getHasServerAds();
                UserBadge userBadge = ((ProfileData) this.t).getUserBadge();
                String name = userBadge != null ? userBadge.name() : null;
                Long weeklyChallengeDailyBonusUsedAtTimestamp2 = ((ProfileData) this.t).getWeeklyChallengeDailyBonusUsedAtTimestamp();
                if ((weeklyChallengeDailyBonusUsedAtTimestamp2 != null ? weeklyChallengeDailyBonusUsedAtTimestamp2.longValue() : 0L) > userAccount2.getWeeklyChallengeDailyBonusUsedAtTimestamp()) {
                    Long weeklyChallengeDailyBonusUsedAtTimestamp3 = ((ProfileData) this.t).getWeeklyChallengeDailyBonusUsedAtTimestamp();
                    if (weeklyChallengeDailyBonusUsedAtTimestamp3 == null) {
                        j = 0;
                        String providerType = ((ProfileData) this.t).getProviderType();
                        bool = (Boolean) this.v;
                        if (bool == null) {
                            bool = userAccount2.getHasPremium();
                        }
                        return UserAccount.copy$default(userAccount2, str12, null, null, null, null, false, booleanValue, str16, str13, false, false, false, false, joinDate, str14, str15, editorName, editor, intValue3, intValue2, intValue4, syncTimestamp, null, c2, doubleValue, c3, false, name, j, providerType, bool, ((ProfileData) this.t).getDataSharingOptOut(), ((ProfileData) this.t).getPremiumTokenExpirationTimestamp(), null, 71310910, 2, null);
                    }
                    weeklyChallengeDailyBonusUsedAtTimestamp = weeklyChallengeDailyBonusUsedAtTimestamp3.longValue();
                } else {
                    weeklyChallengeDailyBonusUsedAtTimestamp = userAccount2.getWeeklyChallengeDailyBonusUsedAtTimestamp();
                }
                j = weeklyChallengeDailyBonusUsedAtTimestamp;
                String providerType2 = ((ProfileData) this.t).getProviderType();
                bool = (Boolean) this.v;
                if (bool == null) {
                }
                return UserAccount.copy$default(userAccount2, str12, null, null, null, null, false, booleanValue, str16, str13, false, false, false, false, joinDate, str14, str15, editorName, editor, intValue3, intValue2, intValue4, syncTimestamp, null, c2, doubleValue, c3, false, name, j, providerType2, bool, ((ProfileData) this.t).getDataSharingOptOut(), ((ProfileData) this.t).getPremiumTokenExpirationTimestamp(), null, 71310910, 2, null);
            case 13:
                p0d p0dVar = (p0d) this.s;
                lu3 lu3Var14 = lu3.a;
                y6a.M(obj);
                return ((ct8) this.t).invoke(p0dVar, (k6l) this.u, (List) this.v);
            case 14:
                a aVar = (a) this.t;
                lu3 lu3Var15 = lu3.a;
                y6a.M(obj);
                b bVar = (b) this.s;
                c cVar = (c) bVar;
                h c4 = cVar.c("SDKInitCacheWrite");
                try {
                    molocoLogger = MolocoLogger.INSTANCE;
                    MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Updating cache for cacheKey: ".concat(aVar.a()), null, false, 12, null);
                    encodeToString = Base64.encodeToString(((j2) this.u).toByteArray(), 0);
                } catch (Exception e) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InitCacheImpl", "Failed to update cache for cacheKey: " + aVar.a() + " with exception", e, false, 8, null);
                    c4.a("Result", "failure");
                    c4.a("Reason", e.getClass().getSimpleName());
                    cVar.b(c4);
                    com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("SDKInitCacheWrite");
                    dVar.a("Result", "failure");
                    dVar.a("Reason", e.getClass().getSimpleName());
                    cVar.a(dVar);
                }
                if (encodeToString != null && encodeToString.length() != 0) {
                    z = false;
                    if (z ? false : ((g) this.v).a.edit().putString(aVar.a(), encodeToString).commit()) {
                        String str17 = z ? "encoding_failure" : "commit_failure";
                        MolocoLogger.warn$default(molocoLogger, "InitCacheImpl", "Failed to update cache for cacheKey: " + aVar.a() + " with error: " + str17, null, false, 12, null);
                        c4.a("Result", "failure");
                        c4.a("Reason", str17);
                        ((c) bVar).b(c4);
                        com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("SDKInitCacheWrite");
                        dVar2.a("Result", "failure");
                        dVar2.a("Reason", str17);
                        ((c) bVar).a(dVar2);
                    } else {
                        MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Successfully updated cache for cacheKey: ".concat(aVar.a()), null, false, 12, null);
                        c4.a("Result", "success");
                        ((c) bVar).b(c4);
                        com.moloco.sdk.acm.d dVar3 = new com.moloco.sdk.acm.d("SDKInitCacheWrite");
                        dVar3.a("Result", "success");
                        ((c) bVar).a(dVar3);
                    }
                    return Unit.a;
                }
                MolocoLogger.warn$default(molocoLogger, "InitCacheImpl", "Failed to encode SDKInitResponse for cacheKey: ".concat(aVar.a()), null, false, 12, null);
                z = true;
                if (z ? false : ((g) this.v).a.edit().putString(aVar.a(), encodeToString).commit()) {
                }
                return Unit.a;
            case 15:
                return e(obj);
            default:
                lu3 lu3Var16 = lu3.a;
                y6a.M(obj);
                j jVar = (j) this.s;
                String str18 = (String) this.t;
                u uVar = (u) this.u;
                u uVar2 = (u) this.v;
                jVar.a(str18);
                jVar.seekTo(((Number) uVar.a).longValue());
                if (((Boolean) uVar2.a).booleanValue()) {
                    jVar.play();
                } else {
                    jVar.pause();
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t53(Object obj, Object obj2, Object obj3, Object obj4, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
        this.v = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t53(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
    }
}
