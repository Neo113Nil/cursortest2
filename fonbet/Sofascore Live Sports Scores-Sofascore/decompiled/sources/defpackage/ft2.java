package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RadialGradient;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.fantasy.FantasyPointsForEventResponse;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.ShirtColor;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.AveragePositionsResponse;
import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentDraftPicksResponse;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ft2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ft2(cdi cdiVar, cdi cdiVar2, jii jiiVar, cdi cdiVar3, vwj vwjVar, vwj vwjVar2, jii jiiVar2, zs2 zs2Var) {
        this.a = 0;
        this.b = cdiVar;
        this.c = cdiVar2;
        this.g = jiiVar;
        this.d = cdiVar3;
        this.e = vwjVar;
        this.f = vwjVar2;
        this.h = jiiVar2;
        this.i = zs2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x022f, code lost:
    
        if (r9 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x026c, code lost:
    
        if (r2 == null) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x050c A[LOOP:2: B:104:0x0506->B:106:0x050c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x053f A[LOOP:3: B:109:0x0539->B:111:0x053f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0390 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03ba  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ha5 ha5Var;
        c9b c9bVar;
        e9b e9bVar;
        h06 h06Var;
        boolean z;
        List<PlayerData> players;
        Iterator<T> it;
        boolean z2;
        Iterator<T> it2;
        Iterator<T> it3;
        boolean z3;
        ArrayList w0;
        boolean z4;
        xbb b;
        gv9 W;
        gv9 gv9Var;
        gv9 gv9Var2;
        List<Team> teamsWithoutRoundPick;
        List<Team> teamsWithoutRoundPick2;
        int i = this.a;
        Pair pair = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i2 = 1;
        int i3 = 0;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        Object obj9 = this.b;
        switch (i) {
            case 0:
                jii jiiVar = (jii) obj4;
                cdi cdiVar = (cdi) obj7;
                cdi cdiVar2 = (cdi) obj6;
                cdi cdiVar3 = (cdi) obj5;
                jii jiiVar2 = (jii) obj3;
                zs2 zs2Var = (zs2) obj2;
                ha5 ha5Var2 = (ha5) obj;
                long j = ((r13) ((cdi) obj9).getValue()).a;
                long j2 = ((r13) ((cdi) obj8).getValue()).a;
                float H0 = ha5Var2.H0(2.0f);
                float f = jiiVar.a;
                float f2 = f / 2.0f;
                float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var2.n() >> 32));
                int i4 = r13.j;
                boolean a = e8k.a(j, j2);
                e28 e28Var = e28.a;
                if (a) {
                    ha5Var = ha5Var2;
                    ha5.f0(ha5Var, j, 0L, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), (Float.floatToRawIntBits(H0) << 32) | (Float.floatToRawIntBits(H0) & 4294967295L), e28Var, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE);
                } else {
                    ha5Var = ha5Var2;
                    float f3 = intBitsToFloat - (f * 2.0f);
                    long floatToRawIntBits = (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                    float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, H0 - f);
                    ha5.f0(ha5Var, j, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), floatToRawIntBits, (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L), e28Var, 224);
                    float f4 = intBitsToFloat - f;
                    float f5 = H0 - f2;
                    ha5.f0(ha5Var, j2, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), jiiVar, 224);
                }
                long j3 = ((r13) cdiVar.getValue()).a;
                float floatValue = ((Number) cdiVar2.getValue()).floatValue();
                float floatValue2 = ((Number) cdiVar3.getValue()).floatValue();
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
                float t = b6a.t(0.4f, 0.5f, floatValue2);
                float t2 = b6a.t(0.7f, 0.5f, floatValue2);
                float t3 = b6a.t(0.5f, 0.5f, floatValue2);
                float t4 = b6a.t(0.3f, 0.5f, floatValue2);
                b20 b20Var = zs2Var.a;
                b20 b20Var2 = zs2Var.c;
                b20Var.a.rewind();
                b20 b20Var3 = zs2Var.a;
                b20Var3.g(0.2f * intBitsToFloat2, t3 * intBitsToFloat2);
                b20Var3.f(t * intBitsToFloat2, t2 * intBitsToFloat2);
                b20Var3.f(0.8f * intBitsToFloat2, intBitsToFloat2 * t4);
                d20 d20Var = zs2Var.b;
                PathMeasure pathMeasure = d20Var.a;
                pathMeasure.setPath(b20Var3.a, false);
                b20Var2.a.rewind();
                d20Var.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, pathMeasure.getLength() * floatValue, b20Var2);
                ha5.X0(ha5Var, b20Var2, j3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar2, 52);
                return Unit.a;
            case 1:
                c9b c9bVar2 = (c9b) obj9;
                p06 p06Var = (p06) obj8;
                Event event = (Event) obj7;
                Lineups lineups = (Lineups) obj6;
                Lineups lineups2 = (Lineups) obj5;
                LineupsResponse lineupsResponse = (LineupsResponse) obj4;
                FantasyPointsForEventResponse fantasyPointsForEventResponse = (FantasyPointsForEventResponse) obj3;
                AveragePositionsResponse averagePositionsResponse = (AveragePositionsResponse) obj2;
                f06 f06Var = (f06) obj;
                e9b a2 = e9b.a(f06Var.b, f06Var.b.c == TeamSelection.Second ? p06Var.n : p06Var.m, x21.t(event), null, 4);
                boolean z5 = p06Var.v;
                boolean hasAdvancedStatistics = lineupsResponse.getHasAdvancedStatistics();
                if (Boolean.valueOf(z5).equals(Boolean.TRUE)) {
                    e9bVar = a2;
                    boolean z6 = ((int) ChronoUnit.YEARS.between(vxd.o(Instant.ofEpochMilli(event.getStartTimestamp() * 1000)), vxd.o(Instant.ofEpochMilli(yaa.v())))) > 0;
                    ArrayList w02 = CollectionsKt.w0(lineups2.getPlayers(), lineups.getPlayers());
                    if (!w02.isEmpty()) {
                        Iterator it4 = w02.iterator();
                        while (it4.hasNext()) {
                            PlayerData playerData = (PlayerData) it4.next();
                            if (playerData.getPlayer().getProposedMarketValueRaw() != null && !Intrinsics.c(playerData.getSubstitute(), Boolean.TRUE)) {
                                z3 = false;
                                w0 = CollectionsKt.w0(lineups2.getPlayers(), lineups.getPlayers());
                                if (!w0.isEmpty()) {
                                    Iterator it5 = w0.iterator();
                                    while (it5.hasNext()) {
                                        FootballPlayerEventStatistics footballStatistics = ((PlayerData) it5.next()).getFootballStatistics();
                                        if ((footballStatistics != null ? footballStatistics.getKilometersCovered() : null) != null) {
                                            z4 = false;
                                            boolean fantasyUser = p06Var.s.b().getFantasyUser();
                                            b = a.b();
                                            c9bVar = c9bVar2;
                                            b.addAll(r8b.k);
                                            if (!Event.getHomeTeam$default(event, null, 1, null).getNational() || Event.getAwayTeam$default(event, null, 1, null).getNational()) {
                                                b.remove(r8b.f);
                                            } else {
                                                b.remove(r8b.e);
                                            }
                                            if (!z6 || z3) {
                                                b.remove(r8b.h);
                                            }
                                            if (z4) {
                                                b.remove(r8b.c);
                                            }
                                            if (fantasyPointsForEventResponse == null) {
                                                b.remove(r8b.d);
                                            } else if (!fantasyUser) {
                                                r8b r8bVar = r8b.d;
                                                b.remove(r8bVar);
                                                b.add(r8bVar);
                                            }
                                            gv9 W2 = l6g.W(a.a(b));
                                            if (hasAdvancedStatistics) {
                                                if (ok3.E(event)) {
                                                    List<PlayerData> players2 = lineups.getPlayers();
                                                    if (players2 == null || !players2.isEmpty()) {
                                                        Iterator<T> it6 = players2.iterator();
                                                        while (it6.hasNext()) {
                                                            if (((PlayerData) it6.next()).getSeasonRatingBreakdown() != null) {
                                                                W = l6g.W(bnf.k);
                                                            }
                                                        }
                                                    }
                                                    List<PlayerData> players3 = lineups2.getPlayers();
                                                    if (players3 == null || !players3.isEmpty()) {
                                                        Iterator<T> it7 = players3.iterator();
                                                        while (it7.hasNext()) {
                                                            if (((PlayerData) it7.next()).getSeasonRatingBreakdown() != null) {
                                                                W = l6g.W(bnf.k);
                                                            }
                                                        }
                                                    }
                                                }
                                                List<PlayerData> players4 = lineups.getPlayers();
                                                if (players4 == null || !players4.isEmpty()) {
                                                    Iterator<T> it8 = players4.iterator();
                                                    while (it8.hasNext()) {
                                                        FootballPlayerEventStatistics footballStatistics2 = ((PlayerData) it8.next()).getFootballStatistics();
                                                        if (yid.m(footballStatistics2 != null ? footballStatistics2.getMinutesPlayed() : null) > 0) {
                                                            W = l6g.W(CollectionsKt.s0(bnf.k, bnf.i));
                                                        }
                                                    }
                                                }
                                                W = rlh.b;
                                            } else {
                                                W = rlh.b;
                                            }
                                            h06Var = new h06(W2, W);
                                        }
                                    }
                                }
                                z4 = true;
                                boolean fantasyUser2 = p06Var.s.b().getFantasyUser();
                                b = a.b();
                                c9bVar = c9bVar2;
                                b.addAll(r8b.k);
                                if (Event.getHomeTeam$default(event, null, 1, null).getNational()) {
                                }
                                b.remove(r8b.f);
                                if (!z6) {
                                }
                                b.remove(r8b.h);
                                if (z4) {
                                }
                                if (fantasyPointsForEventResponse == null) {
                                }
                                gv9 W22 = l6g.W(a.a(b));
                                if (hasAdvancedStatistics) {
                                }
                                h06Var = new h06(W22, W);
                            }
                        }
                    }
                    z3 = true;
                    w0 = CollectionsKt.w0(lineups2.getPlayers(), lineups.getPlayers());
                    if (!w0.isEmpty()) {
                    }
                    z4 = true;
                    boolean fantasyUser22 = p06Var.s.b().getFantasyUser();
                    b = a.b();
                    c9bVar = c9bVar2;
                    b.addAll(r8b.k);
                    if (Event.getHomeTeam$default(event, null, 1, null).getNational()) {
                    }
                    b.remove(r8b.f);
                    if (!z6) {
                    }
                    b.remove(r8b.h);
                    if (z4) {
                    }
                    if (fantasyPointsForEventResponse == null) {
                    }
                    gv9 W222 = l6g.W(a.a(b));
                    if (hasAdvancedStatistics) {
                    }
                    h06Var = new h06(W222, W);
                } else {
                    c9bVar = c9bVar2;
                    e9bVar = a2;
                    h06Var = null;
                }
                LinkedHashMap linkedHashMap = p06Var.t;
                linkedHashMap.getClass();
                boolean z7 = !ok3.E(event) && event.getHasEventPlayerHeatMap();
                boolean y = ok3.y(event);
                int id = Event.getHomeTeam$default(event, null, 1, null).getId();
                int id2 = Event.getAwayTeam$default(event, null, 1, null).getId();
                List<PlayerData> players5 = lineups.getPlayers();
                if (players5 == null || !players5.isEmpty()) {
                    Iterator<T> it9 = players5.iterator();
                    while (it9.hasNext()) {
                        if (Intrinsics.c(((PlayerData) it9.next()).getSubstitute(), Boolean.TRUE)) {
                            z = true;
                            players = lineups2.getPlayers();
                            if (players != null || !players.isEmpty()) {
                                it = players.iterator();
                                while (it.hasNext()) {
                                    if (Intrinsics.c(((PlayerData) it.next()).getSubstitute(), Boolean.TRUE)) {
                                        z2 = true;
                                        ShirtColor playerColor = lineups.getPlayerColor();
                                        ShirtColor goalkeeperColor = lineups.getGoalkeeperColor();
                                        ShirtColor playerColor2 = lineups2.getPlayerColor();
                                        ShirtColor goalkeeperColor2 = lineups2.getGoalkeeperColor();
                                        boolean shouldReverseTeams = event.shouldReverseTeams();
                                        List<PlayerData> players6 = lineups.getPlayers();
                                        ArrayList arrayList = new ArrayList(k13.r(players6, 10));
                                        it2 = players6.iterator();
                                        while (it2.hasNext()) {
                                            arrayList.add(Integer.valueOf(((PlayerData) it2.next()).getPlayer().getId()));
                                        }
                                        gv9 W3 = l6g.W(arrayList);
                                        List<PlayerData> players7 = lineups2.getPlayers();
                                        ArrayList arrayList2 = new ArrayList(k13.r(players7, 10));
                                        it3 = players7.iterator();
                                        while (it3.hasNext()) {
                                            arrayList2.add(Integer.valueOf(((PlayerData) it3.next()).getPlayer().getId()));
                                        }
                                        gv9 W4 = l6g.W(arrayList2);
                                        if (averagePositionsResponse != null) {
                                            List H02 = CollectionsKt.H0(averagePositionsResponse.getSubstitutions(), new se7(27));
                                            pair = new Pair(o8b.a(AveragePositionsResponse.getHome$default(averagePositionsResponse, null, 1, null), H02, linkedHashMap), o8b.a(AveragePositionsResponse.getAway$default(averagePositionsResponse, null, 1, null), H02, linkedHashMap));
                                        }
                                        return f06.a(f06Var, c9bVar, e9bVar, h06Var, null, null, new gye(z7, y, id, id2, z, z2, linkedHashMap, playerColor, goalkeeperColor, playerColor2, goalkeeperColor2, shouldReverseTeams, W3, W4, pair), null, false, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
                                    }
                                }
                            }
                            z2 = false;
                            ShirtColor playerColor3 = lineups.getPlayerColor();
                            ShirtColor goalkeeperColor3 = lineups.getGoalkeeperColor();
                            ShirtColor playerColor22 = lineups2.getPlayerColor();
                            ShirtColor goalkeeperColor22 = lineups2.getGoalkeeperColor();
                            boolean shouldReverseTeams2 = event.shouldReverseTeams();
                            List<PlayerData> players62 = lineups.getPlayers();
                            ArrayList arrayList3 = new ArrayList(k13.r(players62, 10));
                            it2 = players62.iterator();
                            while (it2.hasNext()) {
                            }
                            gv9 W32 = l6g.W(arrayList3);
                            List<PlayerData> players72 = lineups2.getPlayers();
                            ArrayList arrayList22 = new ArrayList(k13.r(players72, 10));
                            it3 = players72.iterator();
                            while (it3.hasNext()) {
                            }
                            gv9 W42 = l6g.W(arrayList22);
                            if (averagePositionsResponse != null) {
                            }
                            return f06.a(f06Var, c9bVar, e9bVar, h06Var, null, null, new gye(z7, y, id, id2, z, z2, linkedHashMap, playerColor3, goalkeeperColor3, playerColor22, goalkeeperColor22, shouldReverseTeams2, W32, W42, pair), null, false, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
                        }
                    }
                }
                z = false;
                players = lineups2.getPlayers();
                if (players != null) {
                }
                it = players.iterator();
                while (it.hasNext()) {
                }
                z2 = false;
                ShirtColor playerColor32 = lineups.getPlayerColor();
                ShirtColor goalkeeperColor32 = lineups.getGoalkeeperColor();
                ShirtColor playerColor222 = lineups2.getPlayerColor();
                ShirtColor goalkeeperColor222 = lineups2.getGoalkeeperColor();
                boolean shouldReverseTeams22 = event.shouldReverseTeams();
                List<PlayerData> players622 = lineups.getPlayers();
                ArrayList arrayList32 = new ArrayList(k13.r(players622, 10));
                it2 = players622.iterator();
                while (it2.hasNext()) {
                }
                gv9 W322 = l6g.W(arrayList32);
                List<PlayerData> players722 = lineups2.getPlayers();
                ArrayList arrayList222 = new ArrayList(k13.r(players722, 10));
                it3 = players722.iterator();
                while (it3.hasNext()) {
                }
                gv9 W422 = l6g.W(arrayList222);
                if (averagePositionsResponse != null) {
                }
                return f06.a(f06Var, c9bVar, e9bVar, h06Var, null, null, new gye(z7, y, id, id2, z, z2, linkedHashMap, playerColor32, goalkeeperColor32, playerColor222, goalkeeperColor222, shouldReverseTeams22, W322, W422, pair), null, false, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
            case 2:
                gv9 gv9Var3 = (gv9) obj9;
                tee teeVar = (tee) obj8;
                gv9 gv9Var4 = (gv9) obj7;
                gv9 gv9Var5 = (gv9) obj6;
                gv9 gv9Var6 = (gv9) obj5;
                gv9 gv9Var7 = (gv9) obj4;
                UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse = (UniqueTournamentDraftPicksResponse) obj3;
                UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse2 = (UniqueTournamentDraftPicksResponse) obj2;
                xva xvaVar = (xva) obj;
                if (uniqueTournamentDraftPicksResponse != null && (teamsWithoutRoundPick2 = uniqueTournamentDraftPicksResponse.getTeamsWithoutRoundPick()) != null) {
                    ArrayList arrayList4 = new ArrayList(k13.r(teamsWithoutRoundPick2, 10));
                    for (Team team : teamsWithoutRoundPick2) {
                        int id3 = team.getId();
                        String nameCode = team.getNameCode();
                        if (nameCode == null) {
                            nameCode = "";
                        }
                        arrayList4.add(new z75(id3, nameCode));
                    }
                    gv9Var = l6g.W(arrayList4);
                    break;
                }
                gv9Var = rlh.b;
                if (uniqueTournamentDraftPicksResponse2 != null && (teamsWithoutRoundPick = uniqueTournamentDraftPicksResponse2.getTeamsWithoutRoundPick()) != null) {
                    ArrayList arrayList5 = new ArrayList(k13.r(teamsWithoutRoundPick, 10));
                    for (Team team2 : teamsWithoutRoundPick) {
                        int id4 = team2.getId();
                        String nameCode2 = team2.getNameCode();
                        if (nameCode2 == null) {
                            nameCode2 = "";
                        }
                        arrayList5.add(new z75(id4, nameCode2));
                    }
                    gv9Var2 = l6g.W(arrayList5);
                    break;
                }
                gv9Var2 = rlh.b;
                return xva.a(xvaVar, gv9Var3, teeVar, 0, gv9Var4, gv9Var5, gv9Var6, gv9Var7, gv9Var, gv9Var2, null, null, 0, false, 65028);
            case 3:
                w3l w3lVar = (w3l) obj8;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                esa.d(esaVar, null, null, new tc3(-740163563, new uri(w3lVar, 21), true), 3);
                esa.d(esaVar, null, null, new tc3(977075646, new ff7(w3lVar, (cdi) obj9, (sn3) obj7, (Function0) obj6, (Function1) obj5), true), 3);
                esa.d(esaVar, null, null, new tc3(-324838435, new er6(w3lVar, (Function0) obj4, (WeeklyChallengeViewModel) obj3, (Function0) obj2, 28), true), 3);
                return Unit.a;
            case 4:
                Matrix matrix = (Matrix) obj8;
                Matrix matrix2 = (Matrix) obj6;
                Path path = (Path) obj3;
                Paint paint = (Paint) obj2;
                ha5 ha5Var3 = (ha5) obj;
                ha5Var3.getClass();
                float b2 = llf.b((((Number) ((b0l) obj9).d.getValue()).floatValue() - ((int) r0)) / 0.14285715f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                Canvas b3 = xx.b(ha5Var3.L0().t());
                float intBitsToFloat3 = Float.intBitsToFloat((int) (ha5Var3.n() >> 32));
                float intBitsToFloat4 = Float.intBitsToFloat((int) (ha5Var3.n() & 4294967295L));
                float f6 = intBitsToFloat3 / 2.0f;
                float f7 = intBitsToFloat4 / 2.0f;
                float f8 = 1.0f - b2;
                matrix.setScale(f6, f7);
                matrix.postTranslate((b2 * intBitsToFloat3) + f6, f7 - (b2 * intBitsToFloat4));
                ((RadialGradient) obj7).setLocalMatrix(matrix);
                matrix2.setScale(f6, f7);
                matrix2.postTranslate(f6 - (f8 * intBitsToFloat3), (f8 * intBitsToFloat4) + f7);
                ((RadialGradient) obj5).setLocalMatrix(matrix2);
                b3.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat3, intBitsToFloat4, (Paint) obj4);
                float f9 = b2 * (intBitsToFloat3 + intBitsToFloat4);
                path.reset();
                path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat4);
                path.lineTo(Math.min(f9, intBitsToFloat3), intBitsToFloat4);
                if (f9 > intBitsToFloat3) {
                    path.lineTo(intBitsToFloat3, intBitsToFloat4 - Math.min(f9 - intBitsToFloat3, intBitsToFloat4));
                }
                if (f9 > intBitsToFloat4) {
                    path.lineTo(Math.max(f9 - intBitsToFloat4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat4 - Math.min(f9, intBitsToFloat4));
                path.close();
                int save = b3.save();
                b3.clipPath(path);
                try {
                    b3.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat3, intBitsToFloat4, paint);
                    b3.restoreToCount(save);
                    return Unit.a;
                } catch (Throwable th) {
                    b3.restoreToCount(save);
                    throw th;
                }
            default:
                j jVar = (j) obj9;
                ku3 ku3Var = (ku3) obj8;
                e1d e1dVar = (e1d) obj5;
                ((o55) obj).getClass();
                return new c(b.j(fcp.m0(new v98(jVar.isPlaying(), new p7d((e1d) obj7, (e1d) obj6, jVar, e1dVar, (e1d) obj4, null), 3), ku3Var), fcp.m0(new v98(jVar.p(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.b((e1d) obj3, objArr2 == true ? 1 : 0, i3), 3), ku3Var), fcp.m0(new v98(new wj0(jVar.f(), 3), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.b((e1d) obj2, objArr == true ? 1 : 0, i2), 3), ku3Var)), jVar, e1dVar);
        }
    }

    public /* synthetic */ ft2(w3l w3lVar, cdi cdiVar, sn3 sn3Var, Function0 function0, Function1 function1, Function0 function02, WeeklyChallengeViewModel weeklyChallengeViewModel, Function0 function03) {
        this.a = 3;
        this.c = w3lVar;
        this.b = cdiVar;
        this.d = sn3Var;
        this.e = function0;
        this.f = function1;
        this.g = function02;
        this.h = weeklyChallengeViewModel;
        this.i = function03;
    }

    public /* synthetic */ ft2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
    }
}
