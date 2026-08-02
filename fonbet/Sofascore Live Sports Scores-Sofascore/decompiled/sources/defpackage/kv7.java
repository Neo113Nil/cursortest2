package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.sofascore.model.AnalystOfferRemoteConfig;
import com.sofascore.model.database.VoteType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.EventChanges;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.network.response.VotesResponse;
import com.sofascore.model.newNetwork.EventBestPlayer;
import com.sofascore.model.newNetwork.EventBestPlayersSummaryResponse;
import com.sofascore.model.newNetwork.EventIncidentsResponse;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.FeaturedOddsResponse;
import com.sofascore.model.newNetwork.post.PremiumTokenResponse;
import com.sofascore.model.odds.FeaturedOddsWithProvider;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.sofascore.results.service.StageWorker;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kv7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ boolean t;
    public Object u;
    public /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv7(e4f e4fVar, Event event, boolean z, VoteType voteType, VotesResponse votesResponse, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 4;
        this.u = e4fVar;
        this.w = event;
        this.t = z;
        this.v = voteType;
        this.x = votesResponse;
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [int[], java.io.Serializable] */
    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.x;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                return new kv7((OddsCountryProvider) this.v, (Event) obj3, this.t, (nv7) obj2, rq3Var);
            case 1:
                return new kv7((xeb) this.v, (String) obj3, (List) obj2, this.t, rq3Var);
            case 2:
                return new kv7((av4) this.u, (av4) this.v, (LineupsResponse) obj2, (Event) obj3, this.t, rq3Var);
            case 3:
                kv7 kv7Var = new kv7((Context) obj3, (jid) obj2, this.t, rq3Var);
                kv7Var.v = obj;
                return kv7Var;
            case 4:
                return new kv7((e4f) this.u, (Event) obj3, this.t, (VoteType) this.v, (VotesResponse) obj2, rq3Var);
            case 5:
                return new kv7(this.t, (g4i) this.v, (Stage) obj3, (OddsCountryProvider) this.u, (Stage) obj2, rq3Var);
            case 6:
                kv7 kv7Var2 = new kv7((j6i) obj3, this.t, (Stage) obj2, (OddsCountryProvider) this.u, rq3Var);
                kv7Var2.v = obj;
                return kv7Var2;
            case 7:
                kv7 kv7Var3 = new kv7((Serializable) this.v, this.t, obj3, (Serializable) obj2, rq3Var, 7);
                kv7Var3.u = obj;
                return kv7Var3;
            default:
                return new kv7((eli) this.v, this.t, (bli) obj3, (String) obj2, rq3Var, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((kv7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((kv7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((kv7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((kv7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((kv7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((kv7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((kv7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((kv7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((kv7) create((Application) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x02fb, code lost:
    
        if (r1 == r8) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02e1, code lost:
    
        if (r1 == r8) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02ed, code lost:
    
        if (r4 == r8) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x050d, code lost:
    
        if (r0 == r1) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x04d5, code lost:
    
        if (r7 == r1) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x04b2, code lost:
    
        if (r2 == r1) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x05d5, code lost:
    
        r3 = kotlin.text.StringsKt__StringsKt.split$default(r8, new java.lang.String[]{"-"}, false, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0599, code lost:
    
        if (r7 == r2) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0581, code lost:
    
        if (r7 == r2) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x079e, code lost:
    
        if (r0 == r2) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0689, code lost:
    
        if (r3 == r2) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0073, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r13 != null ? r13.getOfferId() : null, r3.o) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e0, code lost:
    
        if (r5 == r2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0185, code lost:
    
        if (r1 == r2) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0335  */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v17, types: [km5] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.util.ArrayList] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        OddsCountryProvider oddsCountryProvider;
        FeaturedOddsWithProvider featuredOddsWithProvider;
        Map<String, ProviderOdds> featured;
        ProviderOdds providerOdds;
        rq3 rq3Var;
        Object P;
        List<Event> events;
        ArrayList arrayList;
        Object b2;
        Object w;
        Object w2;
        ?? r8;
        List split$default;
        EventBestPlayer playerOfTheMatch;
        Player player;
        Object h;
        SharedPreferences d;
        HashSet hashSet;
        Object j;
        Object u;
        Object m;
        Object l;
        fgf fgfVar;
        Object l2;
        fgf fgfVar2;
        Context context;
        lu3 lu3Var;
        Object P2;
        AnalystOfferRemoteConfig analystOfferRemoteConfig;
        String str;
        Context context2;
        Object P3;
        int i = 0;
        r3 = false;
        boolean z = false;
        int i2 = 2;
        int i3 = 1;
        switch (this.r) {
            case 0:
                Event event = (Event) this.w;
                Object obj2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    OddsCountryProvider oddsCountryProvider2 = (OddsCountryProvider) this.v;
                    if (oddsCountryProvider2 != null) {
                        boolean z2 = this.t;
                        if (ok3.D(event) && z2) {
                            oddsCountryProvider2 = null;
                        }
                        if (oddsCountryProvider2 != null) {
                            umd umdVar = ((nv7) this.x).g;
                            this.u = oddsCountryProvider2;
                            this.s = 1;
                            b = umdVar.b(event, oddsCountryProvider2, this);
                            if (b != obj2) {
                                oddsCountryProvider = oddsCountryProvider2;
                            }
                            return obj2;
                        }
                    }
                    featuredOddsWithProvider = null;
                    obj2 = new iv7(event, featuredOddsWithProvider);
                    return obj2;
                }
                if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oddsCountryProvider = (OddsCountryProvider) this.u;
                y6a.M(obj);
                b = obj;
                FeaturedOddsResponse featuredOddsResponse = (FeaturedOddsResponse) b;
                if (featuredOddsResponse != null && (featured = featuredOddsResponse.getFeatured()) != null && (providerOdds = featured.get(oddsCountryProvider.getFeaturedOddsType())) != null) {
                    featuredOddsWithProvider = new FeaturedOddsWithProvider(oddsCountryProvider, providerOdds);
                    obj2 = new iv7(event, featuredOddsWithProvider);
                    return obj2;
                }
                featuredOddsWithProvider = null;
                obj2 = new iv7(event, featuredOddsWithProvider);
                return obj2;
            case 1:
                xeb xebVar = (xeb) this.v;
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    vyh vyhVar = xebVar.e;
                    String str2 = (String) this.w;
                    this.s = 1;
                    vyhVar.getClass();
                    rq3Var = null;
                    P = yaa.P(new uyh(vyhVar, str2, rq3Var, i3), this);
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ArrayList arrayList2 = (ArrayList) this.u;
                        y6a.M(obj);
                        arrayList = arrayList2;
                        rq3Var = null;
                        b2 = obj;
                        Set set = (Set) b2;
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            Set set2 = set;
                            UniqueTournament uniqueTournament = ((Event) obj3).getTournament().getUniqueTournament();
                            if (CollectionsKt.R(set2, uniqueTournament != null ? new Integer(uniqueTournament.getId()) : rq3Var)) {
                                arrayList3.add(obj3);
                            } else {
                                arrayList4.add(obj3);
                            }
                        }
                        return CollectionsKt.w0(arrayList4, arrayList3);
                    }
                    y6a.M(obj);
                    P = obj;
                    rq3Var = null;
                }
                EventListResponse eventListResponse = (EventListResponse) yaa.x((x2g) P);
                if (eventListResponse != null && (events = eventListResponse.getEvents()) != null) {
                    List list = (List) this.x;
                    boolean z3 = this.t;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : list) {
                        if (obj4 instanceof y21) {
                            arrayList5.add(obj4);
                        }
                    }
                    int c = sub.c(k13.r(arrayList5, 10));
                    if (c < 16) {
                        c = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                    Iterator it = arrayList5.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        linkedHashMap.put(new Integer(((y21) next).d().getId()), next);
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj5 : events) {
                        Event event2 = (Event) obj5;
                        if (z3) {
                            Set set3 = (Set) xebVar.k.get(new Integer(event2.getTournament().getCategory().getId()));
                            if (set3 == null) {
                                set3 = rm5.a;
                            }
                            if (set3.contains(new Integer(event2.getId()))) {
                            }
                        }
                        arrayList6.add(obj5);
                    }
                    arrayList = new ArrayList(k13.r(arrayList6, 10));
                    Iterator it2 = arrayList6.iterator();
                    while (it2.hasNext()) {
                        Event event3 = (Event) it2.next();
                        y21 y21Var = (y21) linkedHashMap.get(new Integer(event3.getId()));
                        if (y21Var != null) {
                            EventChanges changes = y21Var.d().getChanges();
                            long changeTimestamp = changes != null ? changes.getChangeTimestamp() : 0L;
                            EventChanges changes2 = event3.getChanges();
                            long changeTimestamp2 = changes2 != null ? changes2.getChangeTimestamp() : 0L;
                            if (changeTimestamp2 != 0 && changeTimestamp2 <= changeTimestamp) {
                                event3 = y21Var.d();
                            }
                        }
                        arrayList.add(event3);
                    }
                    w3b w3bVar = xebVar.f;
                    this.u = arrayList;
                    this.s = 2;
                    b2 = w3bVar.b(this);
                    break;
                } else {
                    return rq3Var;
                }
                break;
            case 2:
                LineupsResponse lineupsResponse = (LineupsResponse) this.x;
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    av4 av4Var = (av4) this.u;
                    this.s = 1;
                    w = av4Var.w(this);
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        w2 = obj;
                        EventBestPlayersSummaryResponse eventBestPlayersSummaryResponse = (EventBestPlayersSummaryResponse) w2;
                        if (eventBestPlayersSummaryResponse != null && (playerOfTheMatch = eventBestPlayersSummaryResponse.getPlayerOfTheMatch()) != null && (player = playerOfTheMatch.getPlayer()) != null) {
                            dab.c(player.getId(), lineupsResponse);
                        }
                        boolean E = ok3.E((Event) this.w);
                        boolean z4 = this.t;
                        lineupsResponse.getClass();
                        List c2 = a.c(1);
                        String formation = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getFormation();
                        if (formation == null || split$default == null) {
                            r8 = 0;
                        } else {
                            r8 = new ArrayList();
                            Iterator it3 = split$default.iterator();
                            while (it3.hasNext()) {
                                Integer intOrNull = StringsKt.toIntOrNull((String) it3.next());
                                if (intOrNull != null) {
                                    r8.add(intOrNull);
                                }
                            }
                        }
                        if (r8 == 0) {
                            r8 = km5.a;
                        }
                        gv9 W = l6g.W(CollectionsKt.w0(CollectionsKt.L0(r8, 2), c2));
                        y9b y9bVar = null;
                        List<PlayerData> players = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers();
                        ArrayList arrayList7 = new ArrayList(k13.r(players, 10));
                        Iterator it4 = players.iterator();
                        while (it4.hasNext()) {
                            arrayList7.add(w8b.c((PlayerData) it4.next(), z4, E, y9bVar));
                            y9bVar = null;
                        }
                        return new j6c(W, l6g.W(arrayList7));
                    }
                    y6a.M(obj);
                    w = obj;
                }
                EventIncidentsResponse eventIncidentsResponse = (EventIncidentsResponse) w;
                if (eventIncidentsResponse != null) {
                    dab.a(lineupsResponse, eventIncidentsResponse.getIncidents());
                }
                av4 av4Var2 = (av4) this.v;
                this.s = 2;
                w2 = av4Var2.w(this);
                break;
            case 3:
                ku3 ku3Var = (ku3) this.v;
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    Context context3 = (Context) this.w;
                    context3.getClass();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = context3.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    if (sharedPreferences.getBoolean("INIT_DONE", false)) {
                        w3b w3bVar2 = ((jid) this.x).b;
                        this.v = ku3Var;
                        this.s = 1;
                        h = w3bVar2.h(this);
                        break;
                    }
                    return Unit.a;
                }
                if (i7 == 1) {
                    y6a.M(obj);
                    h = obj;
                } else {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        u = obj;
                        Iterable iterable = (Iterable) u;
                        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                            Iterator it5 = iterable.iterator();
                            while (it5.hasNext()) {
                                if (!((Boolean) it5.next()).booleanValue()) {
                                    ?? edit = ((jid) this.x).i.edit();
                                    edit.getClass();
                                    edit.putBoolean("RETRY_LEAGUES", i ^ 1);
                                    edit.apply();
                                    return Unit.a;
                                }
                            }
                        }
                        i = 1;
                        ?? edit2 = ((jid) this.x).i.edit();
                        edit2.getClass();
                        edit2.putBoolean("RETRY_LEAGUES", i ^ 1);
                        edit2.apply();
                        return Unit.a;
                    }
                    hashSet = (HashSet) this.u;
                    y6a.M(obj);
                    j = obj;
                    HashSet hashSet2 = (HashSet) j;
                    hashSet.removeAll(hashSet2);
                    rq3 rq3Var2 = null;
                    List j2 = b.j(xw3.t(ku3Var, null, new did((jid) this.x, hashSet2, rq3Var2, i), 3), xw3.t(ku3Var, null, new did((jid) this.x, hashSet, rq3Var2, i3), 3));
                    this.v = null;
                    this.u = null;
                    this.s = 3;
                    u = m6k.u(j2, this);
                    break;
                }
                hashSet = (HashSet) h;
                if (!this.t || !hashSet.isEmpty()) {
                    w3b w3bVar3 = ((jid) this.x).b;
                    this.v = ku3Var;
                    this.u = hashSet;
                    this.s = 2;
                    j = w3bVar3.j(this);
                    break;
                } else {
                    return Unit.a;
                }
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    e4f e4fVar = (e4f) this.u;
                    Event event4 = (Event) this.w;
                    boolean z5 = this.t;
                    VoteType voteType = (VoteType) this.v;
                    VotesResponse votesResponse = (VotesResponse) this.x;
                    this.s = 1;
                    if (e4fVar.l(event4, z5, voteType, votesResponse, this) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 5:
                Stage stage = (Stage) this.x;
                Stage stage2 = (Stage) this.w;
                g4i g4iVar = (g4i) this.v;
                OddsCountryProvider oddsCountryProvider3 = (OddsCountryProvider) this.u;
                lu3 lu3Var6 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    if (this.t) {
                        this.s = 1;
                        l = g4iVar.l(stage2, oddsCountryProvider3, this);
                        break;
                    } else {
                        this.s = 2;
                        m = g4iVar.m(stage2, oddsCountryProvider3, stage, this);
                        break;
                    }
                    return lu3Var6;
                }
                if (i9 == 1) {
                    y6a.M(obj);
                    l = obj;
                    fgfVar = (fgf) l;
                    if (fgfVar != null) {
                    }
                } else if (i9 == 2) {
                    y6a.M(obj);
                    m = obj;
                    fgf fgfVar3 = (fgf) m;
                    if (fgfVar3 == null) {
                        this.s = 3;
                        l2 = g4iVar.l(stage2, oddsCountryProvider3, this);
                        break;
                    } else {
                        fgfVar = fgfVar3;
                        if (fgfVar != null) {
                        }
                    }
                } else if (i9 == 3) {
                    y6a.M(obj);
                    l2 = obj;
                    fgfVar = (fgf) l2;
                    if (fgfVar != null) {
                        if (fgfVar.d) {
                            int i10 = ke0.c;
                            if (zu3.V.hasMcc(Integer.valueOf(i10)) || zu3.d0.hasMcc(Integer.valueOf(i10)) || zu3.z.hasMcc(Integer.valueOf(i10))) {
                                fgfVar2 = null;
                                if (fgfVar2 != null) {
                                    gv9 gv9Var = fgfVar2.e;
                                    HashSet hashSet3 = new HashSet();
                                    ArrayList arrayList8 = new ArrayList();
                                    for (Object obj6 : gv9Var) {
                                        zmd zmdVar = ((dld) obj6).f;
                                        if (hashSet3.add(zmdVar != null ? new Integer(zmdVar.a) : null)) {
                                            arrayList8.add(obj6);
                                        }
                                    }
                                    x5i x5iVar = arrayList8.size() > 1 ? x5i.b : x5i.a;
                                    bgf bgfVar = w5i.b;
                                    int i11 = ke0.c;
                                    bgfVar.getClass();
                                    w5i a = bgf.a(i11);
                                    wmd D = w3a.D(g4iVar.i(), stage);
                                    OddsProvider provider = oddsCountryProvider3.getProvider();
                                    provider.getClass();
                                    yld yldVar = new yld(provider.getId(), provider.getColors(), provider.getSlug());
                                    String defaultBetSlipLink = oddsCountryProvider3.getDefaultBetSlipLink();
                                    if (defaultBetSlipLink == null) {
                                        defaultBetSlipLink = oddsCountryProvider3.getProvider().getDefaultBetSlipLink();
                                    }
                                    old oldVar = new old(yldVar, defaultBetSlipLink, oddsCountryProvider3.getBranded(), oddsCountryProvider3.getOddsOffset(), oddsCountryProvider3.getOddsMayDiffer(), oddsCountryProvider3.getType(), oddsCountryProvider3.getSignupLink());
                                    if (x5iVar == x5i.a) {
                                        List j3 = b.j(ServerType.EVENT, ServerType.RACE, ServerType.SPRINT);
                                        Stage stage3 = g4iVar.n;
                                        if (!CollectionsKt.R(j3, stage3 != null ? stage3.getType() : null)) {
                                            z = true;
                                        }
                                    }
                                    return new c4i(oddsCountryProvider3, new e5i(x5iVar, a, D, oldVar, fgfVar2, Boolean.valueOf(z).equals(Boolean.TRUE) ? new q9k(R.string.formula_race) : null));
                                }
                            }
                        }
                        fgfVar2 = fgfVar;
                        if (fgfVar2 != null) {
                        }
                    }
                } else {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 6:
                j6i j6iVar = (j6i) this.w;
                ku3 ku3Var2 = (ku3) this.v;
                lu3 lu3Var7 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    ((eoh) j6iVar.k).setValue(f6i.a(j6iVar.k(), j6iVar.k().a || this.t, null, null, null, null, false, 254));
                    g9i g9iVar = j6iVar.j;
                    rq3 rq3Var3 = null;
                    if (g9iVar != null) {
                        g9iVar.e(null);
                    }
                    j6iVar.j = xw3.L(ku3Var2, null, null, new cce(j6iVar, (Stage) this.x, (OddsCountryProvider) this.u, rq3Var3, 21), 3);
                    this.v = null;
                    this.s = 1;
                    if (j6iVar.m(j6iVar.k().c, this) == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 7:
                ku3 ku3Var3 = (ku3) this.u;
                lu3 lu3Var8 = lu3.a;
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
                int[] iArr = (int[]) this.v;
                boolean z6 = this.t;
                StageWorker stageWorker = (StageWorker) this.w;
                asf asfVar = (asf) this.x;
                ArrayList arrayList9 = new ArrayList(iArr.length);
                for (int i14 : iArr) {
                    arrayList9.add(xw3.t(ku3Var3, null, new a9i(z6, stageWorker, i14, asfVar, null), 3));
                }
                this.u = null;
                this.s = 1;
                Object u2 = m6k.u(arrayList9, this);
                return u2 == lu3Var8 ? lu3Var8 : u2;
            default:
                bli bliVar = (bli) this.w;
                SharedPreferences sharedPreferences2 = bliVar.d;
                el elVar = bliVar.c;
                Context context4 = bliVar.a;
                lu3 lu3Var9 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    if (((eli) this.v) == eli.AI) {
                        String concat = "_".concat(this.t ? ToolBar.REFRESH : "regular");
                        if (bliVar.o != null) {
                            yea yeaVar = j58.a;
                            analystOfferRemoteConfig = j58.c();
                            break;
                        }
                        analystOfferRemoteConfig = null;
                        String str3 = (String) this.x;
                        String str4 = bliVar.o;
                        String startDate = analystOfferRemoteConfig != null ? analystOfferRemoteConfig.getStartDate() : null;
                        Long valueOf = startDate == null ? null : Long.valueOf(LocalDate.parse(startDate, DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US)).atStartOfDay().toEpochSecond(ZoneOffset.UTC));
                        String endDate = analystOfferRemoteConfig != null ? analystOfferRemoteConfig.getEndDate() : null;
                        Long valueOf2 = endDate == null ? null : Long.valueOf(LocalDate.parse(endDate, DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US)).atStartOfDay().toEpochSecond(ZoneOffset.UTC));
                        this.u = concat;
                        this.s = 1;
                        elVar.getClass();
                        str = concat;
                        Long l3 = valueOf;
                        lu3Var = lu3Var9;
                        Long l4 = valueOf2;
                        context2 = context4;
                        P3 = yaa.P(new dl(elVar, str3, str4, l3, l4, (rq3) null), this);
                        break;
                    } else {
                        context = context4;
                        lu3Var = lu3Var9;
                        String str5 = (String) this.x;
                        this.s = 2;
                        elVar.getClass();
                        P2 = yaa.P(new bl(elVar, str5, null, i3), this);
                        break;
                    }
                    return lu3Var;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P2 = obj;
                    context = context4;
                    x2g x2gVar = (x2g) P2;
                    boolean z7 = x2gVar instanceof t2g;
                    if (!z7) {
                        if (!(x2gVar instanceof v2g)) {
                            zzl.b();
                            return null;
                        }
                        z8e.Z(context);
                    }
                    if (z7) {
                        Throwable th = ((t2g) x2gVar).a;
                        if ((th instanceof wi9) && ((wi9) th).a == 404) {
                            z8e.Z(context);
                        }
                    } else if (!(x2gVar instanceof v2g)) {
                        zzl.b();
                        return null;
                    }
                    return Unit.a;
                }
                String str6 = (String) this.u;
                y6a.M(obj);
                P3 = obj;
                str = str6;
                context2 = context4;
                x2g x2gVar2 = (x2g) P3;
                boolean z8 = x2gVar2 instanceof t2g;
                if (!z8) {
                    if (!(x2gVar2 instanceof v2g)) {
                        zzl.b();
                        return null;
                    }
                    PremiumTokenResponse premiumTokenResponse = (PremiumTokenResponse) ((v2g) x2gVar2).a;
                    String token = premiumTokenResponse.getToken();
                    if (token == null || token.length() == 0) {
                        nv.q0(context2, 2, "empty_token" + str);
                    }
                    SharedPreferences.Editor edit3 = sharedPreferences2.edit();
                    edit3.getClass();
                    edit3.putString("PR_XAIST", premiumTokenResponse.getToken());
                    edit3.apply();
                }
                if (z8) {
                    Throwable th2 = ((t2g) x2gVar2).a;
                    if ((th2 instanceof wi9) && ((wi9) th2).a == 403) {
                        nv.q0(context2, 2, "403" + str);
                        SharedPreferences.Editor edit4 = sharedPreferences2.edit();
                        edit4.getClass();
                        edit4.remove("PR_XAIST");
                        edit4.apply();
                    }
                } else if (!(x2gVar2 instanceof v2g)) {
                    zzl.b();
                    return null;
                }
                xw3.L(bliVar.e, null, null, new wki(bliVar, null, i2), 3);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv7(xeb xebVar, String str, List list, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 1;
        this.v = xebVar;
        this.w = str;
        this.x = list;
        this.t = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv7(av4 av4Var, av4 av4Var2, LineupsResponse lineupsResponse, Event event, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.u = av4Var;
        this.v = av4Var2;
        this.x = lineupsResponse;
        this.w = event;
        this.t = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv7(j6i j6iVar, boolean z, Stage stage, OddsCountryProvider oddsCountryProvider, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 6;
        this.w = j6iVar;
        this.t = z;
        this.x = stage;
        this.u = oddsCountryProvider;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv7(Context context, jid jidVar, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 3;
        this.w = context;
        this.x = jidVar;
        this.t = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv7(OddsCountryProvider oddsCountryProvider, Event event, boolean z, nv7 nv7Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 0;
        this.v = oddsCountryProvider;
        this.w = event;
        this.t = z;
        this.x = nv7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kv7(Serializable serializable, boolean z, Object obj, Serializable serializable2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = serializable;
        this.t = z;
        this.w = obj;
        this.x = serializable2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv7(boolean z, g4i g4iVar, Stage stage, OddsCountryProvider oddsCountryProvider, Stage stage2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 5;
        this.t = z;
        this.v = g4iVar;
        this.w = stage;
        this.u = oddsCountryProvider;
        this.x = stage2;
    }
}
