package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.Country;
import com.sofascore.model.TvType;
import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.CrowdsourcingSuggestRequest;
import com.sofascore.model.crowdsourcing.EventSuggestRequest;
import com.sofascore.model.fantasy.FantasyPlayerPostModel;
import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.model.fantasy.FantasySquadResponse;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.network.response.TeamRssFeedResponse;
import com.sofascore.model.network.response.bettingtips.DroppingOddsResponse;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.PlayerHeatmapResponse;
import com.sofascore.model.newNetwork.StageResponse;
import com.sofascore.model.newNetwork.UniqueTournamentRecapPlayerPerformance;
import com.sofascore.model.newNetwork.UniqueTournamentRecapTopPerformancesResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.model.newNetwork.post.PlayerSuggestPostBody;
import com.sofascore.model.newNetwork.post.TeamSuggestPostBody;
import com.sofascore.model.newNetwork.post.TransferSuggestPostBody;
import com.sofascore.model.newNetwork.post.VenueSuggestPostBody;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ok0 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public int t;
    public Object u;
    public /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok0(int i, List list, ku2 ku2Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 1;
        this.t = i;
        this.u = list;
        this.v = ku2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0123, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0126, code lost:
    
        r19 = r0;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0128, code lost:
    
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013b, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014e, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0161, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0174, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        Object q;
        Long valueOf;
        int i;
        Object obj2;
        String str;
        Object e;
        Long l;
        Object obj3;
        Long l2;
        String str2 = (String) this.v;
        kva kvaVar = (kva) this.u;
        lu3 lu3Var = lu3.a;
        int i2 = this.s;
        Long l3 = null;
        int i3 = 1;
        if (i2 == 0) {
            y6a.M(obj);
            w3b w3bVar = kvaVar.e;
            int i4 = this.t;
            this.s = 1;
            q = w3bVar.q(i4, str2, this);
            if (q == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i2 != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            q = obj;
        }
        UniqueTournamentRecapTopPerformancesResponse uniqueTournamentRecapTopPerformancesResponse = (UniqueTournamentRecapTopPerformancesResponse) q;
        if (uniqueTournamentRecapTopPerformancesResponse != null) {
            yzc yzcVar = kvaVar.p;
            str2.getClass();
            List<UniqueTournamentRecapPlayerPerformance> eventPlayerStatistics = uniqueTournamentRecapTopPerformancesResponse.getEventPlayerStatistics();
            int i5 = 10;
            ArrayList arrayList = new ArrayList(k13.r(eventPlayerStatistics, 10));
            for (UniqueTournamentRecapPlayerPerformance uniqueTournamentRecapPlayerPerformance : eventPlayerStatistics) {
                Event event = uniqueTournamentRecapPlayerPerformance.getEvent();
                Player player = uniqueTournamentRecapPlayerPerformance.getPlayer();
                Double rating = uniqueTournamentRecapPlayerPerformance.getRating();
                int id = uniqueTournamentRecapPlayerPerformance.getPlayer().getId();
                int id2 = uniqueTournamentRecapPlayerPerformance.getTeam().getId();
                int id3 = uniqueTournamentRecapPlayerPerformance.getEvent().getId();
                String C = tba.C(uniqueTournamentRecapPlayerPerformance.getPlayer());
                if (C == null) {
                    C = tba.t(uniqueTournamentRecapPlayerPerformance.getPlayer());
                }
                String str3 = C;
                Gender gender = uniqueTournamentRecapPlayerPerformance.getPlayer().getGender();
                long startTimestamp = uniqueTournamentRecapPlayerPerformance.getEvent().getStartTimestamp();
                List j = b.j(sza.c, sza.d, sza.e, sza.f, sza.g, sza.h);
                int c = sub.c(k13.r(j, i5));
                Long l4 = l3;
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                for (Object obj4 : j) {
                    int ordinal = ((sza) obj4).ordinal();
                    str = "-";
                    UniqueTournamentRecapTopPerformancesResponse uniqueTournamentRecapTopPerformancesResponse2 = uniqueTournamentRecapTopPerformancesResponse;
                    if (ordinal == 0) {
                        String str4 = l4;
                        Integer points = uniqueTournamentRecapPlayerPerformance.getPoints();
                        e = points != null ? yid.e(3, str4, points) : str4;
                        Regex regex = yid.a;
                        l2 = str4;
                        l = str4;
                    } else if (ordinal == i3) {
                        String str5 = l4;
                        Integer rebounds = uniqueTournamentRecapPlayerPerformance.getRebounds();
                        e = rebounds != null ? yid.e(3, str5, rebounds) : str5;
                        Regex regex2 = yid.a;
                        l2 = str5;
                        l = str5;
                    } else if (ordinal == 2) {
                        String str6 = l4;
                        Integer assists = uniqueTournamentRecapPlayerPerformance.getAssists();
                        e = assists != null ? yid.e(3, str6, assists) : str6;
                        Regex regex3 = yid.a;
                        l2 = str6;
                        l = str6;
                    } else if (ordinal == 3) {
                        String str7 = l4;
                        Integer steals = uniqueTournamentRecapPlayerPerformance.getSteals();
                        e = steals != null ? yid.e(3, str7, steals) : str7;
                        Regex regex4 = yid.a;
                        l2 = str7;
                        l = str7;
                    } else if (ordinal == 4) {
                        Integer blocks = uniqueTournamentRecapPlayerPerformance.getBlocks();
                        String str8 = l4;
                        e = blocks != null ? yid.e(3, str8, blocks) : str8;
                        Regex regex5 = yid.a;
                        l2 = str8;
                        l = str8;
                    } else {
                        if (ordinal != 5) {
                            zzl.b();
                            return l4;
                        }
                        Double rating2 = uniqueTournamentRecapPlayerPerformance.getRating();
                        Object valueOf2 = rating2 != null ? String.valueOf(rating2.doubleValue()) : l4;
                        Regex regex6 = yid.a;
                        obj3 = valueOf2 != null ? valueOf2 : "-";
                        l = l4;
                    }
                    linkedHashMap.put(obj4, obj3);
                    uniqueTournamentRecapTopPerformancesResponse = uniqueTournamentRecapTopPerformancesResponse2;
                    l4 = l;
                    i3 = 1;
                }
                arrayList.add(new jza(new kza(id, id2, id3, str3, gender, l6g.X(linkedHashMap), startTimestamp), event, player, rating));
                uniqueTournamentRecapTopPerformancesResponse = uniqueTournamentRecapTopPerformancesResponse;
                l3 = l4;
                i3 = 1;
                i5 = 10;
            }
            Long l5 = l3;
            Iterator<T> it = uniqueTournamentRecapTopPerformancesResponse.getEventPlayerStatistics().iterator();
            if (it.hasNext()) {
                valueOf = Long.valueOf(((UniqueTournamentRecapPlayerPerformance) it.next()).getEvent().getTimestamp());
                while (it.hasNext()) {
                    Long valueOf3 = Long.valueOf(((UniqueTournamentRecapPlayerPerformance) it.next()).getEvent().getTimestamp());
                    if (valueOf.compareTo(valueOf3) > 0) {
                        valueOf = valueOf3;
                    }
                }
            } else {
                valueOf = l5;
            }
            long longValue = valueOf != null ? valueOf.longValue() : 0L;
            Instant now = Instant.now();
            Instant ofEpochSecond = Instant.ofEpochSecond(longValue);
            Instant minus = now.minus((TemporalAmount) Duration.ofHours(24L));
            if (ofEpochSecond.isAfter(minus) || ofEpochSecond.equals(minus)) {
                i = 24;
            } else {
                Instant now2 = Instant.now();
                Instant ofEpochSecond2 = Instant.ofEpochSecond(longValue);
                Instant minus2 = now2.minus((TemporalAmount) Duration.ofHours(48L));
                i = (ofEpochSecond2.isAfter(minus2) || ofEpochSecond2.equals(minus2)) ? 48 : 72;
            }
            Iterator<E> it2 = sza.j.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = l5;
                    break;
                }
                obj2 = it2.next();
                if (((sza) obj2).b.equals(str2)) {
                    break;
                }
            }
            sza szaVar = (sza) obj2;
            if (szaVar == null) {
                szaVar = sza.c;
            }
            yzcVar.j(new fza(szaVar, i, arrayList));
        }
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new ok0((pk0) this.u, this.t, (f6e) this.v, rq3Var, 0);
            case 1:
                return new ok0(this.t, (List) this.u, (ku2) this.v, rq3Var);
            case 2:
                return new ok0((tr3) this.u, this.t, (ArrayList) this.v, rq3Var, 2);
            case 3:
                return new ok0((tr3) this.u, this.t, (EventSuggestRequest) this.v, rq3Var, 3);
            case 4:
                return new ok0((q54) this.u, (a64) this.v, this.t, rq3Var, 4);
            case 5:
                return new ok0((ai4) this.u, this.t, (String) this.v, rq3Var, 5);
            case 6:
                ok0 ok0Var = new ok0(2, rq3Var);
                ok0Var.v = obj;
                return ok0Var;
            case 7:
                return new ok0((kd5) this.u, this.t, (String) this.v, rq3Var, 7);
            case 8:
                return new ok0((sh5) this.u, (TransferSuggestPostBody) this.v, this.t, rq3Var, 8);
            case 9:
                return new ok0((th5) this.u, (PlayerSuggestPostBody) this.v, this.t, rq3Var, 9);
            case 10:
                return new ok0((di5) this.u, (TeamSuggestPostBody) this.v, this.t, rq3Var, 10);
            case 11:
                return new ok0((di5) this.u, (VenueSuggestPostBody) this.v, this.t, rq3Var, 11);
            case 12:
                return new ok0((hi5) this.u, (VenueSuggestPostBody) this.v, this.t, rq3Var, 12);
            case 13:
                return new ok0((mr5) this.u, (Event) this.v, this.t, rq3Var, 13);
            case 14:
                return new ok0((dz5) this.u, this.t, (Country) this.v, rq3Var, 14);
            case 15:
                return new ok0((p06) this.u, this.t, (zz5) this.v, rq3Var, 15);
            case 16:
                return new ok0((r36) this.u, this.t, (String) this.v, rq3Var, 16);
            case 17:
                return new ok0((nr6) this.u, this.t, (do7) this.v, rq3Var, 17);
            case 18:
                ok0 ok0Var2 = new ok0((nr6) this.v, this.t, rq3Var, 18);
                ok0Var2.u = obj;
                return ok0Var2;
            case 19:
                return new ok0((ky6) this.u, (String) this.v, this.t, rq3Var, 19);
            case 20:
                return new ok0((Function1) this.u, this.t, (FragmentActivity) this.v, rq3Var, 20);
            case 21:
                return new ok0((wb7) this.u, this.t, (ArrayList) this.v, rq3Var, 21);
            case 22:
                ok0 ok0Var3 = new ok0((wb7) this.v, this.t, rq3Var, 22);
                ok0Var3.u = obj;
                return ok0Var3;
            case 23:
                return new ok0((bt7) this.u, this.t, (AtomicReference) this.v, rq3Var, 23);
            case 24:
                return new ok0((nv7) this.v, this.t, rq3Var, 24);
            case 25:
                return new ok0((sy8) this.u, (Context) this.v, this.t, rq3Var, 25);
            case 26:
                return new ok0((kva) this.u, this.t, (String) this.v, rq3Var, 26);
            case 27:
                return new ok0((kva) this.u, this.t, (rxa) this.v, rq3Var, 27);
            case 28:
                return new ok0((fwa) this.u, (String) this.v, this.t, rq3Var, 28);
            default:
                return new ok0((u8c) this.u, this.t, (MediaPost) this.v, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
        }
        return ((ok0) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:438|(1:(1:(10:442|443|444|445|446|447|448|(2:454|(1:(1:462)(1:461))(1:457))(1:451)|452|453)(2:469|470))(1:471))(2:481|(2:483|484)(4:485|(2:487|(1:489))|491|492))|472|473|474|(11:478|446|447|448|(0)|454|(0)|(1:459)|462|452|453)|476|477) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ed, code lost:
    
        if (r0 == r10) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01da, code lost:
    
        if (r1 == r10) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01c1, code lost:
    
        if (r7 == r10) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x057f, code lost:
    
        if (r0 == r2) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x055a, code lost:
    
        if (r3 == r2) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x08b2, code lost:
    
        r0 = r2;
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0884, code lost:
    
        if (r7 == r1) goto L382;
     */
    /* JADX WARN: Removed duplicated region for block: B:450:0x08be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x08cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x09dc  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object n;
        Object obj2;
        kxe kxeVar;
        Object P;
        aq4 aq4Var;
        int i;
        Object Q;
        aq4 d;
        int i2;
        Object L;
        String str;
        Object r;
        Object c;
        Object P2;
        Object F;
        long longValue;
        Object l;
        List H0;
        Object b;
        Object e0;
        Object value;
        Object value2;
        pb7 pb7Var;
        gv9 W;
        int size;
        double s;
        double d2;
        Object P3;
        Object a;
        Object C;
        yzc yzcVar;
        Object u;
        Object value3;
        sxa sxaVar;
        Object r2;
        Object value4;
        sxa sxaVar2;
        rq3 rq3Var = null;
        switch (this.r) {
            case 0:
                pk0 pk0Var = (pk0) this.u;
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    if (pk0Var.i.get() == this.t) {
                        lk0 lk0Var = pk0Var.h;
                        f6e f6eVar = (f6e) this.v;
                        this.s = 1;
                        Object y = lk0Var.g.y(new cl(lk0Var, f6eVar, rq3Var, 19), this);
                        if (y != lu3Var) {
                            y = Unit.a;
                        }
                        if (y == lu3Var) {
                            return lu3Var;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                List list = (List) this.u;
                int i4 = this.t;
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    if (i4 < 0 || i4 >= list.size()) {
                        return new Pair(new Integer(i4), km5.a);
                    }
                    ku2 ku2Var = (ku2) this.v;
                    eu2 eu2Var = (eu2) list.get(i4);
                    this.s = 1;
                    n = ku2Var.n(eu2Var, this);
                    if (n == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    n = obj;
                }
                return new Pair(new Integer(i4), (List) n);
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    e64 e64Var = ((tr3) this.u).e;
                    int i7 = this.t;
                    CrowdsourcingSuggestRequest crowdsourcingSuggestRequest = new CrowdsourcingSuggestRequest((ArrayList) this.v);
                    this.s = 1;
                    e64Var.getClass();
                    if (yaa.P(new c64(e64Var, i7, crowdsourcingSuggestRequest, (rq3) null, 6), this) == lu3Var3) {
                        return lu3Var3;
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
                lu3 lu3Var4 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    e64 e64Var2 = ((tr3) this.u).e;
                    int i9 = this.t;
                    EventSuggestRequest eventSuggestRequest = (EventSuggestRequest) this.v;
                    this.s = 1;
                    e64Var2.getClass();
                    if (yaa.P(new c64(e64Var2, i9, eventSuggestRequest, (rq3) null, 7), this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                q54 q54Var = (q54) this.u;
                lu3 lu3Var5 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    fdi fdiVar = q54Var.s;
                    fdi fdiVar2 = q54Var.p;
                    Iterable iterable = (Iterable) fdiVar.getValue();
                    int i11 = this.t;
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((Player) obj2).getId() == i11) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    Player player = (Player) obj2;
                    kxe Q2 = player != null ? lz.Q(14, player, null, false, false, false) : null;
                    int ordinal = ((a64) this.v).ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            q54Var.q.l(Q2);
                            if ((q54Var.o.getValue() instanceof CrowdsourcingIncidentType.Card) && (kxeVar = (kxe) fdiVar2.getValue()) != null) {
                                this.s = 1;
                                if (q54Var.z(kxeVar, this) == lu3Var5) {
                                    return lu3Var5;
                                }
                            }
                        } else if (ordinal != 2) {
                            zzl.b();
                            return null;
                        }
                    }
                    fdiVar2.l(Q2);
                    if (q54Var.o.getValue() instanceof CrowdsourcingIncidentType.Card) {
                        this.s = 1;
                        if (q54Var.z(kxeVar, this) == lu3Var5) {
                        }
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fdi fdiVar3 = q54Var.t;
                scj scjVar = new scj("");
                fdiVar3.getClass();
                fdiVar3.m(null, scjVar);
                w1a.E(q54Var.w, "");
                fdi fdiVar4 = q54Var.g;
                q44 q44Var = q44.a;
                fdiVar4.getClass();
                fdiVar4.m(null, q44Var);
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i12 = this.s;
                rq3 rq3Var2 = null;
                if (i12 == 0) {
                    y6a.M(obj);
                    vyh vyhVar = ((ai4) this.u).e;
                    int i13 = this.t;
                    String str2 = (String) this.v;
                    this.s = 1;
                    vyhVar.getClass();
                    P = yaa.P(new ryh(vyhVar, i13, str2, rq3Var2, 0), this);
                    if (P == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                EventListResponse eventListResponse = (EventListResponse) yaa.x((x2g) P);
                if (eventListResponse != null) {
                    return eventListResponse.getEvents();
                }
                return null;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i14 = this.t;
                if (i14 == 0) {
                    y6a.M(obj);
                    aq4Var = (aq4) this.v;
                    if (!((Boolean) aq4Var.b().getAttributes().b(sh9.c)).booleanValue()) {
                        es4.b.l("Skipping default response validation for " + aq4Var.b().c().getUrl());
                        return Unit.a;
                    }
                    i = aq4Var.d().a;
                    xh9 b2 = aq4Var.b();
                    if (i >= 300) {
                        xh3 attributes = b2.getAttributes();
                        pm0 pm0Var = es4.a;
                        attributes.getClass();
                        pm0Var.getClass();
                        if (!attributes.c().containsKey(pm0Var)) {
                            this.v = aq4Var;
                            this.s = i;
                            this.t = 1;
                            Q = x2a.Q(b2, this);
                            break;
                        }
                    }
                    return Unit.a;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = this.s;
                    aq4 aq4Var2 = (aq4) this.u;
                    aq4 aq4Var3 = (aq4) this.v;
                    try {
                        y6a.M(obj);
                        d = aq4Var2;
                        aq4Var = aq4Var3;
                        L = obj;
                        try {
                            str = (String) L;
                        } catch (yjj unused) {
                            aq4Var3 = aq4Var;
                            aq4Var2 = d;
                            d = aq4Var2;
                            aq4Var = aq4Var3;
                            str = "<body failed decoding>";
                            if (300 <= i2) {
                            }
                            es4.b.l("Default response validation for " + aq4Var.b().c().getUrl() + " failed with " + r1);
                            throw r1;
                        }
                    } catch (yjj unused2) {
                        d = aq4Var2;
                        aq4Var = aq4Var3;
                        str = "<body failed decoding>";
                        if (300 <= i2) {
                        }
                        es4.b.l("Default response validation for " + aq4Var.b().c().getUrl() + " failed with " + r1);
                        throw r1;
                    }
                    Throwable kx2Var = (300 <= i2 || i2 >= 400) ? (400 <= i2 || i2 >= 500) ? (500 <= i2 || i2 >= 600) ? new kx2(d, str) : new ux2(d, str, 2) : new ux2(d, str, 0) : new ux2(d, str, 1);
                    es4.b.l("Default response validation for " + aq4Var.b().c().getUrl() + " failed with " + kx2Var);
                    throw kx2Var;
                }
                int i15 = this.s;
                aq4 aq4Var4 = (aq4) this.v;
                y6a.M(obj);
                i = i15;
                aq4Var = aq4Var4;
                Q = obj;
                xh9 xh9Var = (xh9) Q;
                xh9Var.getAttributes().e(es4.a, Unit.a);
                d = xh9Var.d();
                this.v = aq4Var;
                this.u = d;
                this.s = i;
                this.t = 2;
                L = ml4.L(d, Charsets.UTF_8, this);
                if (L != lu3Var7) {
                    i2 = i;
                    str = (String) L;
                    if (300 <= i2) {
                    }
                    es4.b.l("Default response validation for " + aq4Var.b().c().getUrl() + " failed with " + kx2Var);
                    throw kx2Var;
                }
                return lu3Var7;
            case 7:
                kd5 kd5Var = (kd5) this.u;
                yzc yzcVar2 = kd5Var.f;
                lu3 lu3Var8 = lu3.a;
                int i16 = this.s;
                rq3 rq3Var3 = null;
                if (i16 == 0) {
                    y6a.M(obj);
                    umd umdVar = kd5Var.e;
                    int i17 = this.t;
                    String str3 = (String) this.v;
                    this.s = 1;
                    umdVar.getClass();
                    r = s9a.r(new emd(umdVar, i17, str3, rq3Var3, 0), this);
                    if (r == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i16 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    r = obj;
                }
                x2g x2gVar = (x2g) r;
                if (x2gVar instanceof v2g) {
                    yea yeaVar = j58.a;
                    Country e = dv3.e();
                    List f = j58.f(e != null ? e.getIso2Alpha() : null);
                    DroppingOddsResponse droppingOddsResponse = (DroppingOddsResponse) ((v2g) x2gVar).a;
                    List<Event> events = droppingOddsResponse.getEvents();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : events) {
                        if (!CollectionsKt.R(f, ok3.v((Event) obj3))) {
                            arrayList.add(obj3);
                        }
                    }
                    yzcVar2.j(new v2g(DroppingOddsResponse.copy$default(droppingOddsResponse, arrayList, null, 2, null)));
                } else {
                    yzcVar2.j(x2gVar);
                }
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    e64 e64Var3 = ((sh5) this.u).f;
                    TransferSuggestPostBody transferSuggestPostBody = (TransferSuggestPostBody) this.v;
                    int i19 = this.t;
                    this.s = 1;
                    e64Var3.getClass();
                    if (yaa.P(new c64(e64Var3, i19, transferSuggestPostBody, (rq3) null, 2), this) == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    e64 e64Var4 = ((th5) this.u).f;
                    PlayerSuggestPostBody playerSuggestPostBody = (PlayerSuggestPostBody) this.v;
                    int i21 = this.t;
                    this.s = 1;
                    e64Var4.getClass();
                    if (yaa.P(new c64(e64Var4, i21, playerSuggestPostBody, (rq3) null, 1), this) == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    e64 e64Var5 = ((di5) this.u).f;
                    TeamSuggestPostBody teamSuggestPostBody = (TeamSuggestPostBody) this.v;
                    int i23 = this.t;
                    this.s = 1;
                    e64Var5.getClass();
                    if (yaa.P(new c64(e64Var5, i23, teamSuggestPostBody, (rq3) null, 3), this) == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    e64 e64Var6 = ((di5) this.u).f;
                    VenueSuggestPostBody venueSuggestPostBody = (VenueSuggestPostBody) this.v;
                    int i25 = this.t;
                    this.s = 1;
                    e64Var6.getClass();
                    if (yaa.P(new c64(e64Var6, i25, venueSuggestPostBody, (rq3) null, 4), this) == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i24 != 1) {
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
                    e64 e64Var7 = ((hi5) this.u).f;
                    VenueSuggestPostBody venueSuggestPostBody2 = (VenueSuggestPostBody) this.v;
                    int i27 = this.t;
                    this.s = 1;
                    e64Var7.getClass();
                    if (yaa.P(new c64(e64Var7, i27, venueSuggestPostBody2, (rq3) null, 4), this) == lu3Var13) {
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
                lu3 lu3Var14 = lu3.a;
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
                umd umdVar2 = ((mr5) this.u).k;
                String slug = ((Event) this.v).getTournament().getCategory().getSport().getSlug();
                int i29 = this.t;
                this.s = 1;
                umdVar2.getClass();
                Object r3 = s9a.r(new emd(i29, null, umdVar2, slug), this);
                return r3 == lu3Var14 ? lu3Var14 : r3;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i30 = this.s;
                if (i30 == 0) {
                    y6a.M(obj);
                    dz5 dz5Var = (dz5) this.u;
                    int i31 = this.t;
                    Country country = (Country) this.v;
                    TvType tvType = TvType.EVENT;
                    this.s = 1;
                    if (dz5Var.h.L(i31, country, tvType, this) == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i30 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 15:
                p06 p06Var = (p06) this.u;
                lu3 lu3Var16 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    g39 g39Var = p06Var.p;
                    int i33 = this.t;
                    int i34 = ((rz5) ((zz5) this.v)).a;
                    this.s = 1;
                    c = g39Var.c(i33, i34, this);
                    if (c == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i32 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    c = obj;
                }
                p06Var.n(null, new kz3((PlayerHeatmapResponse) c, 28));
                return Unit.a;
            case 16:
                r36 r36Var = (r36) this.u;
                lu3 lu3Var17 = lu3.a;
                int i35 = this.s;
                if (i35 == 0) {
                    y6a.M(obj);
                    t9c t9cVar = r36Var.p;
                    int i36 = this.t;
                    this.s = 1;
                    t9cVar.getClass();
                    P2 = yaa.P(new a9c(t9cVar, i36, rq3Var, 8), this);
                    break;
                } else {
                    if (i35 != 1) {
                        if (i35 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        F = obj;
                        List list2 = (List) F;
                        if (list2 != null) {
                            return list2;
                        }
                        return km5.a;
                    }
                    y6a.M(obj);
                    P2 = obj;
                }
                x2g x2gVar2 = (x2g) P2;
                if (!(x2gVar2 instanceof v2g)) {
                    return km5.a;
                }
                String str4 = ((TeamRssFeedResponse) ((v2g) x2gVar2).a).getFeeds().get((String) this.v);
                if (str4 != null) {
                    this.s = 2;
                    F = r36Var.F(str4, this);
                    break;
                }
                return km5.a;
            case 17:
                lu3 lu3Var18 = lu3.a;
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
                nr6 nr6Var = (nr6) this.u;
                ky6 ky6Var = nr6Var.f;
                String str5 = nr6Var.i;
                int i38 = this.t;
                mj7 mj7Var = ((do7) this.v).c.i;
                int i39 = mj7Var.a;
                Long l2 = mj7Var.h;
                longValue = l2 != null ? l2.longValue() : 0L;
                this.s = 1;
                ky6Var.getClass();
                Object r4 = s9a.r(new iy6(ky6Var, i38, longValue, i39, str5, null), this);
                return r4 == lu3Var18 ? lu3Var18 : r4;
            case 18:
                nr6 nr6Var2 = (nr6) this.v;
                ku3 ku3Var = (ku3) this.u;
                lu3 lu3Var19 = lu3.a;
                int i40 = this.s;
                if (i40 == 0) {
                    y6a.M(obj);
                    gv9 gv9Var = nr6Var2.k().j;
                    if (gv9Var != null) {
                        return gv9Var;
                    }
                    wi7 wi7Var = nr6Var2.e;
                    int i41 = this.t;
                    String a2 = dla.a();
                    this.u = ku3Var;
                    this.s = 1;
                    l = wi7Var.l(i41, a2, this);
                    if (l == lu3Var19) {
                        return lu3Var19;
                    }
                } else {
                    if (i40 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    l = obj;
                }
                List list3 = (List) l;
                if (list3 == null || (H0 = CollectionsKt.H0(list3, new v66(6))) == null) {
                    return null;
                }
                return CollectionsKt.L0(H0, 3);
            case 19:
                lu3 lu3Var20 = lu3.a;
                int i42 = this.s;
                if (i42 != 0) {
                    if (i42 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wi7 wi7Var2 = ((ky6) this.u).b;
                String str6 = (String) this.v;
                int i43 = this.t;
                this.s = 1;
                Object i0 = wi7Var2.i0(i43, str6, this);
                return i0 == lu3Var20 ? lu3Var20 : i0;
            case 20:
                Function1 function1 = (Function1) this.u;
                lu3 lu3Var21 = lu3.a;
                int i44 = this.s;
                try {
                    if (i44 == 0) {
                        y6a.M(obj);
                        function1.invoke(Boolean.TRUE);
                        ia0 ia0Var = ia0.q;
                        y65 y65Var = ok3.p().o;
                        if (y65Var == null) {
                            Intrinsics.i("fantasyEntryPointCoordinator");
                            throw null;
                        }
                        lx6 lx6Var = (lx6) y65Var.get();
                        int i45 = this.t;
                        this.s = 1;
                        b = lx6Var.b(i45, this);
                        if (b == lu3Var21) {
                            return lu3Var21;
                        }
                    } else {
                        if (i44 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        b = obj;
                    }
                    ((ix6) b).a((FragmentActivity) this.v);
                    function1.invoke(Boolean.FALSE);
                    return Unit.a;
                } catch (Throwable th) {
                    function1.invoke(Boolean.FALSE);
                    throw th;
                }
            case 21:
                lu3 lu3Var22 = lu3.a;
                int i46 = this.s;
                if (i46 != 0) {
                    if (i46 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wi7 wi7Var3 = ((wb7) this.u).f;
                int i47 = this.t;
                ArrayList arrayList2 = (ArrayList) this.v;
                this.s = 1;
                wi7Var3.getClass();
                Object P4 = yaa.P(new c64(wi7Var3, i47, arrayList2, (rq3) null, 8), this);
                return P4 == lu3Var22 ? lu3Var22 : P4;
            case 22:
                wb7 wb7Var = (wb7) this.v;
                ku3 ku3Var2 = (ku3) this.u;
                lu3 lu3Var23 = lu3.a;
                int i48 = this.s;
                if (i48 == 0) {
                    y6a.M(obj);
                    gv9 gv9Var2 = ((pb7) wb7Var.j.getValue()).j;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : gv9Var2) {
                        if (obj4 instanceof FantasyRoundPlayerUiModel) {
                            arrayList3.add(obj4);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) it2.next();
                        arrayList4.add(new FantasyPlayerPostModel(fantasyRoundPlayerUiModel.a, fantasyRoundPlayerUiModel.d, fantasyRoundPlayerUiModel.k, fantasyRoundPlayerUiModel.m));
                    }
                    av4 t = xw3.t(ku3Var2, null, new ok0(wb7Var, this.t, arrayList4, (rq3) null, 21), 3);
                    long j = wb7.n;
                    this.u = null;
                    this.s = 1;
                    e0 = z8e.e0(t, j, this);
                    if (e0 == lu3Var23) {
                        return lu3Var23;
                    }
                } else {
                    if (i48 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    e0 = obj;
                }
                x2g x2gVar3 = (x2g) e0;
                boolean z = x2gVar3 instanceof t2g;
                if (!z) {
                    if (!(x2gVar3 instanceof v2g)) {
                        zzl.b();
                        return null;
                    }
                    FantasySquadResponse fantasySquadResponse = (FantasySquadResponse) ((v2g) x2gVar3).a;
                    List<FantasyRoundPlayer> players = fantasySquadResponse.getSquad().getPlayers();
                    ArrayList arrayList5 = new ArrayList(k13.r(players, 10));
                    for (FantasyRoundPlayer fantasyRoundPlayer : players) {
                        int i49 = wb7.o;
                        arrayList5.add(hkg.g0(fantasyRoundPlayer, wb7Var.i()));
                    }
                    fdi fdiVar5 = wb7Var.j;
                    do {
                        value2 = fdiVar5.getValue();
                        pb7Var = (pb7) value2;
                        W = l6g.W(arrayList5);
                        size = arrayList5.size();
                        s = yid.s(fantasySquadResponse.getSquad().getRemainingBudget(), 1);
                        Iterator it3 = arrayList5.iterator();
                        d2 = 0.0d;
                        while (it3.hasNext()) {
                            d2 += ((FantasyRoundPlayerUiModel) it3.next()).q != null ? r10.floatValue() : 0.0d;
                        }
                    } while (!fdiVar5.k(value2, pb7.a(pb7Var, null, null, 0, 0, null, null, null, null, null, W, size, s, d2, false, null, false, null, false, null, false, null, null, 8348159)));
                    wb7Var.w();
                }
                if (z) {
                    Throwable th2 = ((t2g) x2gVar3).a;
                    ia0 ia0Var2 = ia0.q;
                    if (ok3.p().e().getDevMod()) {
                        Calendar calendar = ke0.a;
                        int i50 = wb7.o;
                        ke0.g(wb7Var.i(), "Auto-Select: ".concat(yaa.z(th2)), 0);
                    }
                    fdi fdiVar6 = wb7Var.j;
                    do {
                        value = fdiVar6.getValue();
                    } while (!fdiVar6.k(value, pb7.a((pb7) value, null, null, 0, 0, null, null, null, null, null, null, 0, 0.0d, 0.0d, false, null, false, nx6.c, false, null, false, null, null, 8290303)));
                } else if (!(x2gVar3 instanceof v2g)) {
                    zzl.b();
                    return null;
                }
                return Unit.a;
            case 23:
                int i51 = this.t;
                bt7 bt7Var = (bt7) this.u;
                qa6 qa6Var = bt7Var.a;
                s96 s96Var = bt7Var.b;
                lu3 lu3Var24 = lu3.a;
                int i52 = this.s;
                if (i52 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    s96Var.getClass();
                    P3 = yaa.P(new a86(s96Var, i51, rq3Var, 24), this);
                    break;
                } else if (i52 == 1) {
                    y6a.M(obj);
                    P3 = obj;
                } else {
                    if (i52 != 2) {
                        if (i52 == 3) {
                            y6a.M(obj);
                            C = obj;
                            return (Boolean) C;
                        }
                        if (i52 == 4) {
                            y6a.M(obj);
                            return null;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    a = obj;
                    Stage stage = (Stage) a;
                    if (stage == null) {
                        return null;
                    }
                    joa joaVar = l5i.a;
                    l5i.l(stage);
                    this.s = 3;
                    C = qa6Var.C(stage, this);
                    break;
                }
                x2g x2gVar4 = (x2g) P3;
                if (x2gVar4 instanceof v2g) {
                    Stage stage2 = ((StageResponse) ((v2g) x2gVar4).a).getStage();
                    this.s = 2;
                    a = s96Var.a(stage2, false, this);
                    break;
                } else {
                    if (!(x2gVar4 instanceof t2g)) {
                        zzl.b();
                        return null;
                    }
                    Throwable th3 = ((t2g) x2gVar4).a;
                    if (!(th3 instanceof wi9)) {
                        ((AtomicReference) this.v).set(Boolean.FALSE);
                        return null;
                    }
                    if (((wi9) th3).a != 404) {
                        return null;
                    }
                    this.s = 4;
                    if (qa6Var.w(i51, this) != lu3Var24) {
                        return null;
                    }
                }
                return lu3Var24;
            case 24:
                lu3 lu3Var25 = lu3.a;
                int i53 = this.s;
                if (i53 == 0) {
                    y6a.M(obj);
                    nv7 nv7Var = (nv7) this.v;
                    yzcVar = nv7Var.r;
                    w3b w3bVar = nv7Var.f;
                    int i54 = this.t;
                    this.u = yzcVar;
                    this.s = 1;
                    u = w3bVar.u(270, 71636, i54, this);
                    if (u == lu3Var25) {
                        return lu3Var25;
                    }
                } else {
                    if (i53 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yzc yzcVar3 = (yzc) this.u;
                    y6a.M(obj);
                    yzcVar = yzcVar3;
                    u = obj;
                }
                yzcVar.j(u);
                return Unit.a;
            case 25:
                lu3 lu3Var26 = lu3.a;
                int i55 = this.s;
                if (i55 == 0) {
                    y6a.M(obj);
                    t01 a3 = ((sy8) this.u).a();
                    Context context = (Context) this.v;
                    int i56 = this.t;
                    this.s = 1;
                    if (t01.M(a3, context, i56, this) == lu3Var26) {
                        return lu3Var26;
                    }
                } else {
                    if (i55 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 26:
                return e(obj);
            case 27:
                rxa rxaVar = (rxa) this.v;
                kva kvaVar = (kva) this.u;
                lu3 lu3Var27 = lu3.a;
                int i57 = this.s;
                if (i57 == 0) {
                    y6a.M(obj);
                    fdi fdiVar7 = kvaVar.t;
                    do {
                        value3 = fdiVar7.getValue();
                        sxaVar = (sxa) value3;
                    } while (!fdiVar7.k(value3, sxaVar != null ? sxa.a(sxaVar, null, null, rxaVar, true, null, 39) : null));
                    aya ayaVar = kvaVar.j;
                    int i58 = this.t;
                    this.s = 1;
                    ayaVar.getClass();
                    r2 = s9a.r(new zxa(i58, (rq3) null, rxaVar, ayaVar), this);
                    if (r2 == lu3Var27) {
                        return lu3Var27;
                    }
                } else {
                    if (i57 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    r2 = obj;
                }
                sxa sxaVar3 = (sxa) r2;
                fdi fdiVar8 = kvaVar.t;
                do {
                    value4 = fdiVar8.getValue();
                    sxaVar2 = (sxa) value4;
                } while (!fdiVar8.k(value4, sxaVar2 != null ? sxa.a(sxaVar2, null, sxaVar3.c, null, false, sxaVar3.f, 11) : null));
                return Unit.a;
            case 28:
                lu3 lu3Var28 = lu3.a;
                int i59 = this.s;
                if (i59 != 0) {
                    if (i59 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                fwa fwaVar = (fwa) this.u;
                w3b w3bVar2 = fwaVar.l;
                int i60 = fwaVar.n;
                String str7 = (String) this.v;
                ccd ccdVar = y75.b;
                int i61 = this.t;
                ccdVar.getClass();
                String str8 = (i61 == 9464 ? y75.TOP : y75.ALL).a;
                this.s = 1;
                Object p = w3bVar2.p(i60, str7, str8, this);
                return p == lu3Var28 ? lu3Var28 : p;
            default:
                lu3 lu3Var29 = lu3.a;
                int i62 = this.s;
                if (i62 != 0) {
                    if (i62 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar3 = ((u8c) this.u).d;
                int i63 = this.t;
                Long contentDateTimestamp = ((MediaPost) this.v).getContentDateTimestamp();
                longValue = contentDateTimestamp != null ? contentDateTimestamp.longValue() : 0L;
                bi4 bi4Var = bi4.PATTERN_NETWORK_YYMMDD;
                ConcurrentHashMap concurrentHashMap = hk4.a;
                String i64 = fc6.i(longValue, hk4.a(bi4Var.d()));
                this.s = 1;
                Object D0 = w3bVar3.D0(i63, i64, this);
                return D0 == lu3Var29 ? lu3Var29 : D0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ok0(int i, rq3 rq3Var) {
        super(i, rq3Var);
        this.r = 6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ok0(q8 q8Var, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.v = q8Var;
        this.t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ok0(Object obj, int i, Object obj2, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.u = obj;
        this.t = i;
        this.v = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ok0(Object obj, Object obj2, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.u = obj;
        this.v = obj2;
        this.t = i;
    }
}
