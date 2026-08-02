package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.glance.session.SessionWorker;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.post.FeedbackPost;
import com.sofascore.model.newNetwork.OddsProvidersResponse;
import com.sofascore.model.newNetwork.PostChatMessage;
import com.sofascore.model.newNetwork.SuggestedPlayersResponse;
import com.sofascore.model.newNetwork.TeamSuggestionResponse;
import com.sofascore.model.newNetwork.UniqueTournamentSuggestionResponse;
import com.sofascore.model.newNetwork.commentary.Comment;
import com.sofascore.model.newNetwork.commentary.CommentaryResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yw extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(SessionWorker sessionWorker, zij zijVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = 14;
        this.v = sessionWorker;
        this.u = zijVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Object obj = this.u;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                return new yw((dx) obj2, this.t, (et8) obj, rq3Var, 0);
            case 1:
                return new yw((dx) obj2, this.t, (et8) obj, rq3Var, 1);
            case 2:
                return new yw((cs2) obj2, (String) this.t, (String) obj, rq3Var, 2);
            case 3:
                return new yw((cs2) obj2, (String) this.t, (PostChatMessage) obj, rq3Var, 3);
            case 4:
                return new yw((e64) obj2, (String) this.t, (String) obj, rq3Var, 4);
            case 5:
                return new yw((q05) obj2, (String) this.t, (String) obj, rq3Var, 5);
            case 6:
                return new yw((s96) obj2, (Event) this.t, (String) obj, rq3Var, 6);
            case 7:
                return new yw((String) obj2, (w3b) this.t, (String) obj, rq3Var, 7);
            case 8:
                return new yw((u8c) obj2, (Event) this.t, (OddsCountryProvider) obj, rq3Var, 8);
            case 9:
                return new yw((umd) obj2, (String) this.t, (String) obj, rq3Var, 9);
            case 10:
                return new yw((Context) obj2, (umd) this.t, (String) obj, rq3Var, 10);
            case 11:
                return new yw((pae) obj2, (zuj) this.t, (Function2) obj, rq3Var, 11);
            case 12:
                return new yw((String) obj2, (wve) this.t, (String) obj, rq3Var, 12);
            case 13:
                return new yw((uwg) obj2, (String) this.t, (String) obj, rq3Var, 13);
            case 14:
                return new yw((SessionWorker) obj2, (zij) obj, rq3Var);
            case 15:
                return new yw((vyh) obj2, (String) this.t, (String) obj, rq3Var, 15);
            case 16:
                return new yw((String) obj2, (j0j) this.t, (String) obj, rq3Var, 16);
            case 17:
                return new yw((ykj) obj2, (r3) this.t, (m1d) obj, rq3Var, 17);
            case 18:
                return new yw((r3k) obj2, (List) this.t, (List) obj, rq3Var, 18);
            case 19:
                return new yw((dhk) obj2, (String) this.t, (String) obj, rq3Var, 19);
            default:
                return new yw((dhk) obj2, (FeedbackPost) this.t, (dzc) obj, rq3Var, 20);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((yw) create(rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ff, code lost:
    
        if (defpackage.xw3.R(r0, r2, r13) != r11) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01b6, code lost:
    
        if (r0 == r11) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0287, code lost:
    
        if (r0 == r6) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0299, code lost:
    
        if (r0 == r6) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0341, code lost:
    
        if (r1 == r0) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x035a, code lost:
    
        if (r1 == r0) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x03fc, code lost:
    
        if (r0 == r6) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x040c, code lost:
    
        if (r0 == r6) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011e, code lost:
    
        if (r0 == r6) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x012e, code lost:
    
        if (r0 == r6) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object commentary;
        Object uniqueTournamentSuggestion;
        Object uniqueTournamentSuggestionPerSport;
        String str;
        Object oddsProvidersForCountry;
        Object oddsProvidersForCountryRegion;
        SharedPreferences d;
        Object suggestedPlayers;
        Object suggestedPlayersPerSport;
        Object a;
        af0 af0Var;
        eed eedVar;
        big bigVar;
        Object teamSuggestions;
        Object teamSuggestionsPerSport;
        int i = 3;
        int i2 = 4;
        int i3 = 6;
        rq3 rq3Var = null;
        switch (this.r) {
            case 0:
                dx dxVar = (dx) this.v;
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    dxVar.m(this.t);
                    tw twVar = new tw(dxVar, i2);
                    g2 g2Var = new g2((et8) this.u, dxVar, rq3Var, 5);
                    this.s = 1;
                    if (j72.G(twVar, g2Var, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                Object obj2 = this.t;
                dx dxVar2 = (dx) this.v;
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    ((eoh) ((e1d) dxVar2.h)).setValue(obj2);
                    uw uwVar = new uw(dxVar2, i);
                    g2 g2Var2 = new g2((et8) this.u, dxVar2, rq3Var, i3);
                    this.s = 1;
                    if (zm2.F(uwVar, g2Var2, this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                if (((Boolean) ((Function1) dxVar2.b).invoke(obj2)).booleanValue()) {
                    ((ax) dxVar2.o).a(dxVar2.f().c(obj2), ((xnh) dxVar2.g).h());
                    ((eoh) ((e1d) dxVar2.d)).setValue(obj2);
                    ((eoh) ((e1d) dxVar2.c)).setValue(obj2);
                }
                return Unit.a;
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
                NetworkCoroutineAPI networkCoroutineAPI = ((cs2) this.v).c;
                String str2 = (String) this.t;
                String str3 = (String) this.u;
                this.s = 1;
                Object translate = networkCoroutineAPI.translate(str2, "en", str3, this);
                return translate == lu3Var3 ? lu3Var3 : translate;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = ((cs2) this.v).b;
                String str4 = (String) this.t;
                PostChatMessage postChatMessage = (PostChatMessage) this.u;
                this.s = 1;
                Object postMessage = networkCoroutineAPI2.postMessage(str4, postChatMessage, this);
                return postMessage == lu3Var4 ? lu3Var4 : postMessage;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI3 = ((e64) this.v).b;
                String str5 = (String) this.t;
                String str6 = (String) this.u;
                this.s = 1;
                Object searchTeamsBySport = networkCoroutineAPI3.searchTeamsBySport(str5, str6, this);
                return searchTeamsBySport == lu3Var5 ? lu3Var5 : searchTeamsBySport;
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
                NetworkCoroutineAPI networkCoroutineAPI4 = ((q05) this.v).j;
                String q = dmi.q("Bearer ", (String) this.t);
                String str7 = (String) this.u;
                this.s = 1;
                Object availableBranches = networkCoroutineAPI4.availableBranches(q, str7, this);
                return availableBranches == lu3Var6 ? lu3Var6 : availableBranches;
            case 6:
                Event event = (Event) this.t;
                lu3 lu3Var7 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI5 = ((s96) this.v).a;
                    int id = event.getId();
                    String str8 = (String) this.u;
                    if (str8 == null) {
                        str8 = "";
                    }
                    this.s = 1;
                    commentary = networkCoroutineAPI5.getCommentary(id, str8, this);
                    if (commentary == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    commentary = obj;
                }
                Iterator<T> it = ((CommentaryResponse) commentary).getComments().iterator();
                while (it.hasNext()) {
                    ((Comment) it.next()).setShouldReverseTeams(event.shouldReverseTeams());
                }
                return commentary;
            case 7:
                String str9 = (String) this.u;
                NetworkCoroutineAPI networkCoroutineAPI6 = ((w3b) this.t).b;
                String str10 = (String) this.v;
                lu3 lu3Var8 = lu3.a;
                int i11 = this.s;
                if (i11 != 0) {
                    if (i11 == 1) {
                        y6a.M(obj);
                        uniqueTournamentSuggestion = obj;
                        return ((UniqueTournamentSuggestionResponse) uniqueTournamentSuggestion).getUniqueTournaments();
                    }
                    if (i11 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    uniqueTournamentSuggestionPerSport = obj;
                    return ((UniqueTournamentSuggestionResponse) uniqueTournamentSuggestionPerSport).getUniqueTournaments();
                }
                y6a.M(obj);
                if (str10 != null && str10.length() != 0) {
                    this.s = 2;
                    uniqueTournamentSuggestionPerSport = networkCoroutineAPI6.uniqueTournamentSuggestionPerSport(str9, str10, this);
                    break;
                } else {
                    this.s = 1;
                    uniqueTournamentSuggestion = networkCoroutineAPI6.uniqueTournamentSuggestion(str9, this);
                    break;
                }
                return lu3Var8;
            case 8:
                lu3 lu3Var9 = lu3.a;
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
                umd umdVar = ((u8c) this.v).i;
                Event event2 = (Event) this.t;
                OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) this.u;
                this.s = 1;
                Object b = umdVar.b(event2, oddsCountryProvider, this);
                return b == lu3Var9 ? lu3Var9 : b;
            case 9:
                lu3 lu3Var10 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI7 = ((umd) this.v).a;
                String str11 = (String) this.t;
                String str12 = (String) this.u;
                this.s = 1;
                Object teamStreaks = networkCoroutineAPI7.teamStreaks(str11, str12, this);
                return teamStreaks == lu3Var10 ? lu3Var10 : teamStreaks;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i14 = this.s;
                if (i14 != 0) {
                    if (i14 == 1) {
                        y6a.M(obj);
                        oddsProvidersForCountryRegion = obj;
                        return (OddsProvidersResponse) oddsProvidersForCountryRegion;
                    }
                    if (i14 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    oddsProvidersForCountry = obj;
                    return (OddsProvidersResponse) oddsProvidersForCountry;
                }
                y6a.M(obj);
                Country e = dv3.e();
                if (e == null || (str = e.getIso2Alpha()) == null) {
                    str = "XX";
                }
                Context context = (Context) this.v;
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
                String string = sharedPreferences.getString("REGION_USER_LAST_REGION", null);
                boolean z = false;
                if (e != null && e.getHasRegions()) {
                    z = true;
                }
                if (z && string != null) {
                    NetworkCoroutineAPI networkCoroutineAPI8 = ((umd) this.t).a;
                    String str13 = (String) this.u;
                    this.s = 1;
                    oddsProvidersForCountryRegion = networkCoroutineAPI8.oddsProvidersForCountryRegion(str, string, str13, this);
                    break;
                } else if (!z) {
                    NetworkCoroutineAPI networkCoroutineAPI9 = ((umd) this.t).a;
                    String str14 = (String) this.u;
                    this.s = 2;
                    oddsProvidersForCountry = networkCoroutineAPI9.oddsProvidersForCountry(str, str14, this);
                    break;
                } else {
                    return null;
                }
                return lu3Var11;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i15 = this.s;
                if (i15 != 0) {
                    if (i15 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                pae paeVar = (pae) this.v;
                zuj zujVar = (zuj) this.t;
                Function2 function2 = (Function2) this.u;
                this.s = 1;
                Object e2 = paeVar.e(zujVar, function2, this);
                return e2 == lu3Var12 ? lu3Var12 : e2;
            case 12:
                String str15 = (String) this.u;
                wve wveVar = (wve) this.t;
                String str16 = (String) this.v;
                lu3 lu3Var13 = lu3.a;
                int i16 = this.s;
                if (i16 != 0) {
                    if (i16 == 1) {
                        y6a.M(obj);
                        suggestedPlayers = obj;
                        return ((SuggestedPlayersResponse) suggestedPlayers).getPlayers();
                    }
                    if (i16 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    suggestedPlayersPerSport = obj;
                    return ((SuggestedPlayersResponse) suggestedPlayersPerSport).getPlayers();
                }
                y6a.M(obj);
                if (str16 != null && str16.length() != 0) {
                    NetworkCoroutineAPI networkCoroutineAPI10 = wveVar.b;
                    this.s = 2;
                    suggestedPlayersPerSport = networkCoroutineAPI10.suggestedPlayersPerSport(str15, str16, this);
                    break;
                } else {
                    NetworkCoroutineAPI networkCoroutineAPI11 = wveVar.b;
                    this.s = 1;
                    suggestedPlayers = networkCoroutineAPI11.suggestedPlayers(str15, this);
                    break;
                }
                return lu3Var13;
            case 13:
                lu3 lu3Var14 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI12 = ((uwg) this.v).a;
                String str17 = (String) this.t;
                String str18 = (String) this.u;
                this.s = 1;
                Object searchSuggestionsByEntityType = networkCoroutineAPI12.searchSuggestionsByEntityType(str17, str18, this);
                return searchSuggestionsByEntityType == lu3Var14 ? lu3Var14 : searchSuggestionsByEntityType;
            case 14:
                SessionWorker sessionWorker = (SessionWorker) this.v;
                lu3 lu3Var15 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    g8h g8hVar = sessionWorker.b;
                    m1f m1fVar = new m1f(sessionWorker, rq3Var, 14);
                    this.s = 1;
                    a = ((l8h) g8hVar).a(m1fVar, this);
                    break;
                } else if (i18 == 1) {
                    y6a.M(obj);
                    a = obj;
                } else {
                    if (i18 != 2) {
                        if (i18 == 3) {
                            y6a.M(obj);
                            return jdb.a();
                        }
                        if (i18 != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th = (Throwable) this.t;
                        y6a.M(obj);
                        throw th;
                    }
                    af0Var = (af0) this.t;
                    try {
                        y6a.M(obj);
                        eed eedVar2 = eed.b;
                        big bigVar2 = new big(sessionWorker, af0Var, rq3Var, i3);
                        this.t = null;
                        this.s = 3;
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                        eedVar = eed.b;
                        bigVar = new big(sessionWorker, af0Var, rq3Var, i3);
                        this.t = th;
                        this.s = 4;
                        if (xw3.R(eedVar, bigVar, this) != lu3Var15) {
                        }
                        return lu3Var15;
                    }
                }
                af0 af0Var2 = (af0) a;
                if (af0Var2 == null) {
                    int i19 = sessionWorker.a.e;
                    String str19 = sessionWorker.e;
                    if (i19 != 0) {
                        return jdb.a();
                    }
                    cp4.g(str19, "No session available for key ");
                    return null;
                }
                try {
                    zij zijVar = (zij) this.u;
                    Context applicationContext2 = sessionWorker.getApplicationContext();
                    uij uijVar = sessionWorker.c;
                    ptj ptjVar = new ptj(sessionWorker);
                    this.t = af0Var2;
                    this.s = 2;
                    if (u0a.K(zijVar, applicationContext2, af0Var2, uijVar, ptjVar, this) != lu3Var15) {
                        af0Var = af0Var2;
                        eed eedVar22 = eed.b;
                        big bigVar22 = new big(sessionWorker, af0Var, rq3Var, i3);
                        this.t = null;
                        this.s = 3;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    af0Var = af0Var2;
                    eedVar = eed.b;
                    bigVar = new big(sessionWorker, af0Var, rq3Var, i3);
                    this.t = th;
                    this.s = 4;
                    if (xw3.R(eedVar, bigVar, this) != lu3Var15) {
                        throw th;
                    }
                    return lu3Var15;
                }
                return lu3Var15;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i20 = this.s;
                if (i20 != 0) {
                    if (i20 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI13 = ((vyh) this.v).a;
                String str20 = (String) this.t;
                String str21 = (String) this.u;
                this.s = 1;
                Object chronologicalIndexes = networkCoroutineAPI13.getChronologicalIndexes(str20, str21, this);
                return chronologicalIndexes == lu3Var16 ? lu3Var16 : chronologicalIndexes;
            case 16:
                String str22 = (String) this.u;
                NetworkCoroutineAPI networkCoroutineAPI14 = ((j0j) this.t).b;
                String str23 = (String) this.v;
                lu3 lu3Var17 = lu3.a;
                int i21 = this.s;
                if (i21 != 0) {
                    if (i21 == 1) {
                        y6a.M(obj);
                        teamSuggestions = obj;
                        return ((TeamSuggestionResponse) teamSuggestions).getTeams();
                    }
                    if (i21 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    teamSuggestionsPerSport = obj;
                    return ((TeamSuggestionResponse) teamSuggestionsPerSport).getTeams();
                }
                y6a.M(obj);
                if (str23 != null && str23.length() != 0) {
                    this.s = 2;
                    teamSuggestionsPerSport = networkCoroutineAPI14.teamSuggestionsPerSport(str22, str23, this);
                    break;
                } else {
                    this.s = 1;
                    teamSuggestions = networkCoroutineAPI14.teamSuggestions(str22, this);
                    break;
                }
                return lu3Var17;
            case 17:
                m1d m1dVar = (m1d) this.u;
                r3 r3Var = (r3) this.t;
                ykj ykjVar = (ykj) this.v;
                lu3 lu3Var18 = lu3.a;
                int i22 = this.s;
                try {
                    if (i22 == 0) {
                        y6a.M(obj);
                        w9g w9gVar = new w9g(r3Var, rq3Var, 29);
                        this.s = 2;
                        if (wba.U(1500L, w9gVar, this) == lu3Var18) {
                            return lu3Var18;
                        }
                    } else {
                        if (i22 != 1 && i22 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    if (m1dVar != m1d.c) {
                        ykjVar.a();
                    }
                    return Unit.a;
                } finally {
                    if (m1dVar != m1d.c) {
                        ykjVar.a();
                    }
                }
            case 18:
                lu3 lu3Var19 = lu3.a;
                int i23 = this.s;
                if (i23 != 0) {
                    if (i23 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                r3k r3kVar = (r3k) this.v;
                List list = (List) this.t;
                List list2 = (List) this.u;
                this.s = 1;
                Object a2 = r3k.a(r3kVar, list, list2, this);
                return a2 == lu3Var19 ? lu3Var19 : a2;
            case 19:
                lu3 lu3Var20 = lu3.a;
                int i24 = this.s;
                if (i24 != 0) {
                    if (i24 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI15 = ((dhk) this.v).c;
                String str24 = (String) this.t;
                String str25 = (String) this.u;
                this.s = 1;
                Object valuableUsersForVersion = networkCoroutineAPI15.getValuableUsersForVersion(str24, str25, this);
                return valuableUsersForVersion == lu3Var20 ? lu3Var20 : valuableUsersForVersion;
            default:
                lu3 lu3Var21 = lu3.a;
                int i25 = this.s;
                if (i25 != 0) {
                    if (i25 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI16 = ((dhk) this.v).a;
                FeedbackPost feedbackPost = (FeedbackPost) this.t;
                dzc dzcVar = (dzc) this.u;
                this.s = 1;
                Object feedback = networkCoroutineAPI16.feedback(feedbackPost, dzcVar, this);
                return feedback == lu3Var21 ? lu3Var21 : feedback;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yw(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.v = obj;
        this.t = obj2;
        this.u = obj3;
    }
}
