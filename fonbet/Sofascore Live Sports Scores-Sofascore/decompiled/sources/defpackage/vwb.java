package defpackage;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandingBoostedOdds;
import com.sofascore.local_persistance.BrandingEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatisticsResponse;
import com.sofascore.model.newNetwork.EventBestPlayer;
import com.sofascore.model.newNetwork.EventBestPlayersSummaryResponse;
import com.sofascore.model.newNetwork.PlayerDetailsResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vwb extends hoi implements Function2 {
    public Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int r = 0;
    public Serializable s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwb(XmlPullParser xmlPullParser, rq3 rq3Var, fsf fsfVar, fsf fsfVar2, fsf fsfVar3, fsf fsfVar4, fsf fsfVar5, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(2, rq3Var);
        this.w = xmlPullParser;
        this.x = fsfVar;
        this.y = fsfVar2;
        this.s = fsfVar3;
        this.z = fsfVar4;
        this.A = fsfVar5;
        this.B = arrayList;
        this.C = arrayList2;
        this.D = arrayList3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.D;
        Object obj3 = this.C;
        switch (i) {
            case 0:
                vwb vwbVar = new vwb((BrandingEvent) obj3, (axb) this.A, this.u, (String) obj2, rq3Var);
                vwbVar.v = obj;
                return vwbVar;
            case 1:
                vwb vwbVar2 = new vwb(rq3Var, (u8c) obj3, (Event) this.B, (MediaPost) obj2);
                vwbVar2.v = obj;
                return vwbVar2;
            default:
                vwb vwbVar3 = new vwb((XmlPullParser) this.w, rq3Var, (fsf) this.x, (fsf) this.y, (fsf) this.s, (fsf) this.z, (fsf) this.A, (ArrayList) this.B, (ArrayList) obj3, (ArrayList) obj2);
                vwbVar3.v = obj;
                return vwbVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((vwb) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0292, code lost:
    
        if (r6 == r5) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x042b, code lost:
    
        if (r5 == r10) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e4, code lost:
    
        if (r11 == r10) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x016b, code lost:
    
        if (r11 == r10) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ca, code lost:
    
        if (r11 == r10) goto L95;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0210  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00b4 -> B:10:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00be -> B:10:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00c4 -> B:10:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ca -> B:10:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00d5 -> B:10:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ea -> B:10:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ec -> B:10:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00fb -> B:10:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x011b -> B:10:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x013c -> B:10:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x015c -> B:10:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0170 -> B:10:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0172 -> B:10:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0180 -> B:10:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x019f -> B:10:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01bd -> B:10:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01ca -> B:9:0x01ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x01dd -> B:10:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01f3 -> B:10:0x020b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0206 -> B:10:0x020b). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Brand brand;
        BrandingBoostedOdds boostedOdds;
        Object r;
        Object value;
        Object value2;
        Event event;
        fwb ewbVar;
        Object u;
        w3f w3fVar;
        BrandingBoostedOdds brandingBoostedOdds;
        axb axbVar;
        Object value3;
        Object h;
        EventBestPlayer playerOfTheMatch;
        Team team;
        Object w;
        MediaPost mediaPost;
        av4 av4Var;
        int i;
        PlayerDetailsResponse playerDetailsResponse;
        Player player;
        Object T;
        Player player2;
        Team team2;
        MediaPost mediaPost2;
        Event event2;
        PlayerEventStatisticsResponse playerEventStatisticsResponse;
        PlayerEventStatistics statistics;
        List F;
        Sport sport;
        int depth;
        Object obj2;
        Object obj3;
        String text;
        String name;
        Object x;
        int i2 = this.r;
        int i3 = 8;
        Object obj4 = this.D;
        Object obj5 = this.C;
        switch (i2) {
            case 0:
                String str = (String) obj4;
                int i4 = this.u;
                BrandingEvent brandingEvent = (BrandingEvent) obj5;
                axb axbVar2 = (axb) this.A;
                fdi fdiVar = axbVar2.e;
                lu3 lu3Var = lu3.a;
                int i5 = this.t;
                if (i5 == 0) {
                    y6a.M(obj);
                    brand = brandingEvent.getBrand();
                    if (brand != null) {
                        boostedOdds = brandingEvent.getBoostedOdds();
                        if (boostedOdds != null) {
                            axbVar2.r = brandingEvent.getOddsProviderId();
                            this.v = null;
                            this.w = brand;
                            this.x = boostedOdds;
                            this.t = 1;
                            r = s9a.r(new zwb(axbVar2, str, i4, null), this);
                            break;
                        } else {
                            do {
                                value = fdiVar.getValue();
                            } while (!fdiVar.k(value, new snb()));
                        }
                    } else {
                        do {
                            value2 = fdiVar.getValue();
                        } while (!fdiVar.k(value2, new snb()));
                    }
                } else if (i5 == 1) {
                    BrandingBoostedOdds brandingBoostedOdds2 = (BrandingBoostedOdds) this.x;
                    brand = (Brand) this.w;
                    y6a.M(obj);
                    boostedOdds = brandingBoostedOdds2;
                    r = obj;
                } else if (i5 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    w3fVar = (w3f) this.B;
                    brandingBoostedOdds = (BrandingBoostedOdds) this.y;
                    axbVar = (axb) this.z;
                    Event event3 = (Event) this.s;
                    Brand brand2 = (Brand) this.w;
                    y6a.M(obj);
                    event = event3;
                    brand = brand2;
                    u = obj;
                    ewbVar = axbVar.t(brandingBoostedOdds, w3fVar, (ProviderOdds) u);
                    do {
                        value3 = fdiVar.getValue();
                    } while (!fdiVar.k(value3, new unb(new rwb(vha.N(axbVar2.i(), event), brand, ewbVar, owb.a))));
                }
                Pair pair = (Pair) r;
                if (pair == null) {
                    break;
                } else {
                    event = (Event) pair.a;
                    w3f w3fVar2 = (w3f) pair.b;
                    nwb.d(i4, axbVar2.i());
                    axbVar2.p = event;
                    axbVar2.q = boostedOdds;
                    if (str != null) {
                        this.v = null;
                        this.w = brand;
                        this.x = null;
                        this.s = event;
                        this.z = axbVar2;
                        this.y = boostedOdds;
                        this.B = w3fVar2;
                        this.t = 2;
                        u = axbVar2.u(event, this);
                        if (u != lu3Var) {
                            w3fVar = w3fVar2;
                            brandingBoostedOdds = boostedOdds;
                            axbVar = axbVar2;
                            ewbVar = axbVar.t(brandingBoostedOdds, w3fVar, (ProviderOdds) u);
                            do {
                                value3 = fdiVar.getValue();
                            } while (!fdiVar.k(value3, new unb(new rwb(vha.N(axbVar2.i(), event), brand, ewbVar, owb.a))));
                        }
                        break;
                    } else {
                        String string = axbVar2.i().getString(R.string.super_odds_make_your_pick);
                        string.getClass();
                        ewbVar = new ewb(string, w3fVar2);
                        do {
                            value3 = fdiVar.getValue();
                        } while (!fdiVar.k(value3, new unb(new rwb(vha.N(axbVar2.i(), event), brand, ewbVar, owb.a))));
                    }
                }
            case 1:
                u8c u8cVar = (u8c) obj5;
                Event event4 = (Event) this.B;
                ku3 ku3Var = (ku3) this.v;
                lu3 lu3Var2 = lu3.a;
                int i6 = this.u;
                rq3 rq3Var = null;
                if (i6 == 0) {
                    y6a.M(obj);
                    if (event4 != null) {
                        s96 s96Var = u8cVar.c;
                        int id = event4.getId();
                        this.v = ku3Var;
                        this.u = 1;
                        h = s96Var.h(id, this);
                        break;
                    }
                } else if (i6 == 1) {
                    y6a.M(obj);
                    h = obj;
                } else if (i6 == 2) {
                    i = this.t;
                    Team team3 = (Team) this.z;
                    av4Var = (av4) this.y;
                    event4 = (Event) this.s;
                    MediaPost mediaPost3 = (MediaPost) this.x;
                    u8cVar = (u8c) this.w;
                    y6a.M(obj);
                    mediaPost = mediaPost3;
                    team = team3;
                    w = obj;
                    playerDetailsResponse = (PlayerDetailsResponse) yaa.x((x2g) w);
                    if (playerDetailsResponse != null && (player = playerDetailsResponse.getPlayer()) != null) {
                        this.v = null;
                        this.w = u8cVar;
                        this.x = mediaPost;
                        this.s = event4;
                        this.y = null;
                        this.z = team;
                        this.A = player;
                        this.t = i;
                        this.u = 3;
                        T = av4Var.T(this);
                        if (T != lu3Var2) {
                            player2 = player;
                            team2 = team;
                            mediaPost2 = mediaPost;
                            event2 = event4;
                            playerEventStatisticsResponse = (PlayerEventStatisticsResponse) yaa.x((x2g) T);
                            if (playerEventStatisticsResponse != null) {
                                String position = player2.getPosition();
                                Context context = u8cVar.a;
                                Context context2 = u8cVar.a;
                                F = kda.F(statistics, position, hkg.c0(context), true);
                                int id2 = mediaPost2.getId();
                                long createdAtTimestamp = mediaPost2.getCreatedAtTimestamp();
                                sport = mediaPost2.getSport();
                                if (sport != null) {
                                }
                                String str2 = "";
                                ux7 G = uxf.G(player2);
                                bx7 F2 = uxf.F(event2, context2, false, false, null, null, 62);
                                fy7 J = uxf.J(team2, context2, null, false, null, 26);
                                Double rating = statistics.getRating();
                                if (F != null) {
                                }
                                gv9 gv9Var = rlh.b;
                            }
                        }
                        break;
                    }
                } else if (i6 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    player2 = (Player) this.A;
                    Team team4 = (Team) this.z;
                    Event event5 = (Event) this.s;
                    mediaPost2 = (MediaPost) this.x;
                    u8c u8cVar2 = (u8c) this.w;
                    y6a.M(obj);
                    u8cVar = u8cVar2;
                    team2 = team4;
                    event2 = event5;
                    T = obj;
                    playerEventStatisticsResponse = (PlayerEventStatisticsResponse) yaa.x((x2g) T);
                    if (playerEventStatisticsResponse != null && (statistics = playerEventStatisticsResponse.getStatistics()) != null) {
                        String position2 = player2.getPosition();
                        Context context3 = u8cVar.a;
                        Context context22 = u8cVar.a;
                        F = kda.F(statistics, position2, hkg.c0(context3), true);
                        int id22 = mediaPost2.getId();
                        long createdAtTimestamp2 = mediaPost2.getCreatedAtTimestamp();
                        sport = mediaPost2.getSport();
                        if (sport != null || (str2 = sport.getSlug()) == null) {
                            String str22 = "";
                        }
                        ux7 G2 = uxf.G(player2);
                        bx7 F22 = uxf.F(event2, context22, false, false, null, null, 62);
                        fy7 J2 = uxf.J(team2, context22, null, false, null, 26);
                        Double rating2 = statistics.getRating();
                        if (F != null || (gv9Var = l6g.W(F)) == null) {
                            gv9 gv9Var2 = rlh.b;
                        }
                        break;
                    }
                    break;
                }
                EventBestPlayersSummaryResponse eventBestPlayersSummaryResponse = (EventBestPlayersSummaryResponse) h;
                if (eventBestPlayersSummaryResponse != null && (playerOfTheMatch = eventBestPlayersSummaryResponse.getPlayerOfTheMatch()) != null) {
                    MediaPost mediaPost4 = (MediaPost) obj4;
                    team = playerOfTheMatch.getTeam();
                    if (team != null || (team = playerOfTheMatch.getPlayer().getTeam()) != null) {
                        av4 t = xw3.t(ku3Var, null, new gjb(u8cVar, playerOfTheMatch, rq3Var, i3), 3);
                        av4 t2 = xw3.t(ku3Var, null, new j8c(u8cVar, event4, playerOfTheMatch, rq3Var, 1), 3);
                        this.v = null;
                        this.w = u8cVar;
                        this.x = mediaPost4;
                        this.s = event4;
                        this.y = t2;
                        this.z = team;
                        this.t = 0;
                        this.u = 2;
                        w = t.w(this);
                        if (w != lu3Var2) {
                            mediaPost = mediaPost4;
                            av4Var = t2;
                            i = 0;
                            playerDetailsResponse = (PlayerDetailsResponse) yaa.x((x2g) w);
                            if (playerDetailsResponse != null) {
                                this.v = null;
                                this.w = u8cVar;
                                this.x = mediaPost;
                                this.s = event4;
                                this.y = null;
                                this.z = team;
                                this.A = player;
                                this.t = i;
                                this.u = 3;
                                T = av4Var.T(this);
                                if (T != lu3Var2) {
                                }
                            }
                        }
                    }
                }
                break;
            default:
                XmlPullParser xmlPullParser = (XmlPullParser) this.w;
                lu3 lu3Var3 = lu3.a;
                switch (this.u) {
                    case 0:
                        y6a.M(obj);
                        s9a.t((ku3) this.v);
                        if (d1.B(xmlPullParser)) {
                            xmlPullParser.nextTag();
                        }
                        if (xmlPullParser.getEventType() != 1) {
                            if (xmlPullParser.getEventType() != 2) {
                                pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                                break;
                            } else {
                                depth = xmlPullParser.getDepth();
                                if (xmlPullParser.getDepth() < depth) {
                                    break;
                                } else {
                                    int depth2 = xmlPullParser.getDepth() - depth;
                                    if (depth2 != 0) {
                                        if (depth2 == 1) {
                                            mqi mqiVar = d1.a;
                                            if (xmlPullParser.getEventType() == 2 && (name = xmlPullParser.getName()) != null) {
                                                switch (name.hashCode()) {
                                                    case -1692490108:
                                                        if (name.equals("Creatives")) {
                                                            this.v = null;
                                                            this.t = depth;
                                                            this.u = 8;
                                                            x = d1.x(xmlPullParser, true, this);
                                                            break;
                                                        }
                                                        break;
                                                    case -1633884078:
                                                        if (name.equals("AdSystem")) {
                                                            fsf fsfVar = (fsf) this.x;
                                                            this.v = fsfVar;
                                                            this.t = depth;
                                                            this.u = 1;
                                                            Object E = d1.E(xmlPullParser, this);
                                                            if (E != lu3Var3) {
                                                                fsfVar.a = E;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case -56677412:
                                                        if (name.equals("Description")) {
                                                            fsf fsfVar2 = (fsf) this.s;
                                                            this.v = fsfVar2;
                                                            this.t = depth;
                                                            this.u = 3;
                                                            Object o = d1.o(xmlPullParser, this);
                                                            if (o != lu3Var3) {
                                                                fsfVar2.a = o;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 67232232:
                                                        if (name.equals("Error")) {
                                                            this.v = null;
                                                            this.t = depth;
                                                            this.u = 7;
                                                            obj3 = d1.o(xmlPullParser, this);
                                                            break;
                                                        }
                                                        break;
                                                    case 501930965:
                                                        if (name.equals("AdTitle")) {
                                                            fsf fsfVar3 = (fsf) this.y;
                                                            this.v = fsfVar3;
                                                            this.t = depth;
                                                            this.u = 2;
                                                            Object o2 = d1.o(xmlPullParser, this);
                                                            if (o2 != lu3Var3) {
                                                                fsfVar3.a = o2;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 1349597094:
                                                        if (name.equals("Pricing")) {
                                                            fsf fsfVar4 = (fsf) this.A;
                                                            this.v = fsfVar4;
                                                            this.t = depth;
                                                            this.u = 5;
                                                            Object m = d1.m(xmlPullParser, this);
                                                            if (m != lu3Var3) {
                                                                fsfVar4.a = m;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 2065545547:
                                                        if (name.equals("Advertiser")) {
                                                            fsf fsfVar5 = (fsf) this.z;
                                                            this.v = fsfVar5;
                                                            this.t = depth;
                                                            this.u = 4;
                                                            Object o3 = d1.o(xmlPullParser, this);
                                                            if (o3 != lu3Var3) {
                                                                fsfVar5.a = o3;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 2114088489:
                                                        if (name.equals("Impression")) {
                                                            this.v = null;
                                                            this.t = depth;
                                                            this.u = 6;
                                                            obj2 = d1.i(xmlPullParser, this);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                    } else {
                                        mqi mqiVar2 = d1.a;
                                        if (xmlPullParser.getEventType() != 2) {
                                            if (xmlPullParser.getEventType() == 4 && (text = xmlPullParser.getText()) != null && !StringsKt.R(text)) {
                                                String text2 = xmlPullParser.getText();
                                                text2.getClass();
                                                StringsKt.l0(text2).toString();
                                            } else if (xmlPullParser.getEventType() == 3) {
                                                break;
                                            }
                                        }
                                    }
                                    xmlPullParser.next();
                                    if (xmlPullParser.getDepth() < depth) {
                                    }
                                }
                            }
                        } else {
                            break;
                        }
                        break;
                    case 1:
                        depth = this.t;
                        fsf fsfVar6 = (fsf) this.v;
                        y6a.M(obj);
                        fsfVar6.a = obj;
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                        }
                        break;
                    case 2:
                        depth = this.t;
                        fsf fsfVar7 = (fsf) this.v;
                        y6a.M(obj);
                        fsfVar7.a = obj;
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                        }
                        break;
                    case 3:
                        depth = this.t;
                        fsf fsfVar8 = (fsf) this.v;
                        y6a.M(obj);
                        fsfVar8.a = obj;
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                        }
                        break;
                    case 4:
                        depth = this.t;
                        fsf fsfVar9 = (fsf) this.v;
                        y6a.M(obj);
                        fsfVar9.a = obj;
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                        }
                        break;
                    case 5:
                        depth = this.t;
                        fsf fsfVar10 = (fsf) this.v;
                        y6a.M(obj);
                        fsfVar10.a = obj;
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                        }
                        break;
                    case 6:
                        depth = this.t;
                        y6a.M(obj);
                        obj2 = obj;
                        s sVar = (s) obj2;
                        if (sVar != null) {
                            ((ArrayList) this.B).add(sVar);
                        }
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                        }
                        break;
                    case 7:
                        depth = this.t;
                        y6a.M(obj);
                        obj3 = obj;
                        String str3 = (String) obj3;
                        if (str3 != null) {
                            ((ArrayList) obj5).add(str3);
                        }
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                        }
                        break;
                    case 8:
                        depth = this.t;
                        y6a.M(obj);
                        x = obj;
                        ((ArrayList) obj4).addAll((List) x);
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                        }
                        break;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwb(BrandingEvent brandingEvent, axb axbVar, int i, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.C = brandingEvent;
        this.A = axbVar;
        this.u = i;
        this.D = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwb(rq3 rq3Var, u8c u8cVar, Event event, MediaPost mediaPost) {
        super(2, rq3Var);
        this.B = event;
        this.C = u8cVar;
        this.D = mediaPost;
    }
}
