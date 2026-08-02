package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.TvType;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.fantasy.FantasyCompetition;
import com.sofascore.model.fantasy.FantasyPlayer;
import com.sofascore.model.fantasy.FantasyPlayerFixture;
import com.sofascore.model.fantasy.FantasyPlayerFormAndFixturesResponse;
import com.sofascore.model.fantasy.FantasyRound;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.MonthlyUniqueTournamentItem;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse;
import com.sofascore.model.newNetwork.TvCountryChannelsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.model.odds.OddsCountryProvider;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q7c extends hoi implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int r;
    public Object s;
    public Object t;
    public int u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7c(m1d m1dVar, q1d q1dVar, Function2 function2, Object obj, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.y = m1dVar;
        this.z = q1dVar;
        this.A = function2;
        this.B = obj;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                q7c q7cVar = new q7c((MediaPost) this.A, (u8c) obj2, rq3Var, 0);
                q7cVar.v = obj;
                return q7cVar;
            case 1:
                q7c q7cVar2 = new q7c((LocalDate) this.A, (nmc) obj2, rq3Var, 1);
                q7cVar2.v = obj;
                return q7cVar2;
            case 2:
                q7c q7cVar3 = new q7c((m1d) this.y, (q1d) this.z, (Function2) this.A, this.B, rq3Var);
                q7cVar3.t = obj;
                return q7cVar3;
            case 3:
                q7c q7cVar4 = new q7c((ade) obj2, rq3Var);
                q7cVar4.A = obj;
                return q7cVar4;
            case 4:
                q7c q7cVar5 = new q7c((jre) this.A, (tn6) obj2, rq3Var, 4);
                q7cVar5.v = obj;
                return q7cVar5;
            default:
                q7c q7cVar6 = new q7c((g4i) this.z, (Stage) this.A, (Stage) obj2, rq3Var);
                q7cVar6.y = obj;
                return q7cVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((q7c) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x022a, code lost:
    
        if (r1.L(r3, r4, r5, r34) == r2) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0334, code lost:
    
        if (r0 != r9) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01f8, code lost:
    
        if (r6 == r2) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01d9, code lost:
    
        if (r4 == r2) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x07d2, code lost:
    
        if (r3.e(r34) == r2) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0986, code lost:
    
        if (r0 == r3) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0908, code lost:
    
        if (r2 == r3) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x08f2, code lost:
    
        if (r1 == r3) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0aa5, code lost:
    
        if (r5 != null) goto L420;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0574 A[LOOP:7: B:213:0x056e->B:215:0x0574, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0b44  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0b52  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0b85  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0be1  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0b63  */
    /* JADX WARN: Removed duplicated region for block: B:474:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0b0c  */
    /* JADX WARN: Removed duplicated region for block: B:479:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:483:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0add  */
    /* JADX WARN: Removed duplicated region for block: B:497:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0a7c  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0aac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0198  */
    /* JADX WARN: Type inference failed for: r10v40, types: [zu4] */
    /* JADX WARN: Type inference failed for: r1v56, types: [zu4] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [bx7] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [iy7] */
    /* JADX WARN: Type inference failed for: r21v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [hy7] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3, types: [com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel] */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r2v33, types: [zu4] */
    /* JADX WARN: Type inference failed for: r2v36, types: [zu4] */
    /* JADX WARN: Type inference failed for: r2v40, types: [h2d, java.lang.Object, lu3] */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX WARN: Type inference failed for: r3v80, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v108 */
    /* JADX WARN: Type inference failed for: r4v61, types: [zu4] */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v81 */
    /* JADX WARN: Type inference failed for: r5v10, types: [zu4] */
    /* JADX WARN: Type inference failed for: r5v5, types: [zu4] */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r6v36, types: [h2d] */
    /* JADX WARN: Type inference failed for: r6v6, types: [zu4] */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v74 */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v76, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v88 */
    /* JADX WARN: Type inference failed for: r8v56, types: [zu4] */
    /* JADX WARN: Type inference failed for: r9v4, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zu4 t;
        av4 t2;
        Object w;
        av4 av4Var;
        zu4 zu4Var;
        zu4 zu4Var2;
        Object T;
        Object T2;
        zu4 zu4Var3;
        List<String> images;
        rq3 rq3Var;
        av4 t3;
        List<String> list;
        Object T3;
        Object T4;
        zu4 zu4Var4;
        Event event;
        UniqueTournamentResponse uniqueTournamentResponse;
        Object T5;
        Stage stage;
        ?? r22;
        String name;
        UniqueStage uniqueStage;
        String name2;
        Category category;
        UniqueTournament uniqueTournament;
        String slug;
        String format;
        av4 t4;
        av4 t5;
        Object w2;
        List list2;
        Object T6;
        Object obj2;
        String date;
        yzc yzcVar;
        Object T7;
        o1d o1dVar;
        j2d j2dVar;
        Function2 function2;
        Object obj3;
        o1d o1dVar2;
        Object invoke;
        h2d h2dVar;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        av4 av4Var2;
        int i;
        av4 av4Var3;
        av4 t6;
        Object w3;
        av4 av4Var4;
        zu4 zu4Var5;
        Player player;
        b98 b98Var;
        zu4 zu4Var6;
        Player player2;
        Object T8;
        Player player3;
        b98 b98Var2;
        Object obj4;
        Object T9;
        zu4 zu4Var7;
        Player player4;
        b98 b98Var3;
        PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse;
        Player player5;
        Player player6;
        PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse2;
        Object T10;
        PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse3;
        Player player7;
        Player player8;
        SharedPreferences sharedPreferences;
        SharedPreferences d;
        av4 t7;
        zu4 t8;
        Object w4;
        av4 av4Var5;
        Object T11;
        zu4 zu4Var8;
        FantasyPlayerFormAndFixturesResponse fantasyPlayerFormAndFixturesResponse;
        Object T12;
        zu4 zu4Var9;
        FantasyPlayer fantasyPlayer;
        Map map;
        Object T13;
        List<FantasyPlayerFixture> list3;
        List<FantasyPlayerFixture> list4;
        jre jreVar;
        Object obj5;
        yd7 yd7Var;
        Iterator it;
        yd7 yd7Var2;
        Object obj6;
        Object obj7;
        av4 av4Var6;
        av4 av4Var7;
        lu3 lu3Var;
        av4 av4Var8;
        Object w5;
        g4i g4iVar;
        zu4 zu4Var10;
        Boolean bool;
        Stage stage2;
        Pair pair;
        Stage stage3;
        Pair pair2;
        Stage stage4;
        Stage stage5;
        Stage stage6;
        yzc yzcVar2;
        Object T14;
        yzc yzcVar3;
        x2g x2gVar;
        TvCountryChannelsResponse tvCountryChannelsResponse;
        c4i c4iVar;
        Object T15;
        Stage stage7;
        int i2 = 0;
        int i3 = 2;
        int i4 = 1;
        rq3 rq3Var2 = null;
        switch (this.r) {
            case 0:
                u8c u8cVar = (u8c) this.B;
                MediaPost mediaPost = (MediaPost) this.A;
                ku3 ku3Var = (ku3) this.v;
                lu3 lu3Var2 = lu3.a;
                switch (this.u) {
                    case 0:
                        y6a.M(obj);
                        rq3 rq3Var3 = null;
                        av4 t9 = xw3.t(ku3Var, null, new p7c(mediaPost, u8cVar, rq3Var3, 0), 3);
                        t = xw3.t(ku3Var, null, new p7c(mediaPost, u8cVar, rq3Var3, i3), 3);
                        t2 = xw3.t(ku3Var, null, new p7c(mediaPost, u8cVar, rq3Var3, i4), 3);
                        this.v = ku3Var;
                        this.s = t9;
                        this.w = t;
                        this.x = t2;
                        this.u = 1;
                        w = t9.w(this);
                        av4Var = t9;
                        if (w == lu3Var2) {
                            return lu3Var2;
                        }
                        if (w == null) {
                            zu4Var = t;
                            zu4Var2 = av4Var;
                            zu4Var3 = t2;
                            images = mediaPost.getImages();
                            if (images != null) {
                                rq3Var = null;
                                t3 = xw3.t(ku3Var, null, new o7c(u8cVar, images, rq3Var, 0), 3);
                                this.v = null;
                                this.s = zu4Var2;
                                this.w = zu4Var;
                                this.x = zu4Var3;
                                this.t = images;
                                this.u = 4;
                                if (t3.w(this) != lu3Var2) {
                                }
                            }
                            return null;
                        }
                        this.v = ku3Var;
                        this.s = av4Var;
                        this.w = t;
                        this.x = t2;
                        this.u = 2;
                        T = t.T(this);
                        if (T == lu3Var2) {
                            return lu3Var2;
                        }
                        zu4Var = t;
                        zu4Var2 = av4Var;
                        if (T == null) {
                            this.v = ku3Var;
                            this.s = zu4Var2;
                            this.w = zu4Var;
                            this.x = t2;
                            this.u = 3;
                            T2 = t2.T(this);
                            if (T2 == lu3Var2) {
                                return lu3Var2;
                            }
                        }
                        zu4Var3 = t2;
                        images = mediaPost.getImages();
                        if (images != null && !images.isEmpty()) {
                            rq3Var = null;
                            t3 = xw3.t(ku3Var, null, new o7c(u8cVar, images, rq3Var, 0), 3);
                            this.v = null;
                            this.s = zu4Var2;
                            this.w = zu4Var;
                            this.x = zu4Var3;
                            this.t = images;
                            this.u = 4;
                            if (t3.w(this) != lu3Var2) {
                                return lu3Var2;
                            }
                            list = images;
                            this.v = rq3Var;
                            this.s = rq3Var;
                            this.w = zu4Var;
                            this.x = zu4Var3;
                            this.t = list;
                            this.u = 5;
                            T3 = zu4Var2.T(this);
                            if (T3 == lu3Var2) {
                                return lu3Var2;
                            }
                            Event event2 = (Event) T3;
                            this.v = rq3Var;
                            this.s = rq3Var;
                            this.w = rq3Var;
                            this.x = zu4Var3;
                            this.t = list;
                            this.y = event2;
                            this.u = 6;
                            T4 = zu4Var.T(this);
                            if (T4 == lu3Var2) {
                                return lu3Var2;
                            }
                            zu4Var4 = zu4Var3;
                            event = event2;
                            uniqueTournamentResponse = (UniqueTournamentResponse) T4;
                            this.v = rq3Var;
                            this.s = rq3Var;
                            this.w = rq3Var;
                            this.x = rq3Var;
                            this.t = list;
                            this.y = event;
                            this.z = uniqueTournamentResponse;
                            this.u = 7;
                            T5 = zu4Var4.T(this);
                            if (T5 == lu3Var2) {
                                return lu3Var2;
                            }
                            Event event3 = event;
                            stage = (Stage) T5;
                            int id = mediaPost.getId();
                            long createdAtTimestamp = mediaPost.getCreatedAtTimestamp();
                            String header = mediaPost.getHeader();
                            String description = mediaPost.getDescription();
                            Sport sport = mediaPost.getSport();
                            String str = (sport != null || (slug = sport.getSlug()) == null) ? "" : slug;
                            ?? F = event3 != null ? uxf.F(event3, u8cVar.a, true, false, null, null, 60) : rq3Var;
                            ?? iy7Var = (uniqueTournamentResponse != null || (uniqueTournament = uniqueTournamentResponse.getUniqueTournament()) == null) ? rq3Var : new iy7(Integer.valueOf(uniqueTournament.getId()), tba.x(uniqueTournament));
                            if (stage != null) {
                                int id2 = stage.getId();
                                UniqueStage uniqueStage2 = stage.getUniqueStage();
                                ?? valueOf = (uniqueStage2 == null || (category = uniqueStage2.getCategory()) == null) ? rq3Var : Integer.valueOf(category.getId());
                                Country country = stage.getCountry();
                                ?? alpha2 = country != null ? country.getAlpha2() : rq3Var;
                                StageSeason stageSeason = stage.getStageSeason();
                                if (stageSeason == null || (uniqueStage = stageSeason.getUniqueStage()) == null || (name2 = uniqueStage.getName()) == null) {
                                    UniqueStage uniqueStage3 = stage.getUniqueStage();
                                    name = uniqueStage3 != null ? uniqueStage3.getName() : "";
                                } else {
                                    name = name2;
                                }
                                r22 = new hy7(id2, valueOf, alpha2, name, stage.getDescription(), stage.getTimestamp());
                            } else {
                                r22 = rq3Var;
                            }
                            return new y80(id, header, description, createdAtTimestamp, str, F, iy7Var, r22, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31), (String) CollectionsKt.firstOrNull(mediaPost.getTags()), l6g.W(list));
                        }
                        return null;
                    case 1:
                        ?? r6 = (zu4) this.x;
                        t = (zu4) this.w;
                        ?? r9 = (zu4) this.s;
                        y6a.M(obj);
                        t2 = r6;
                        w = obj;
                        av4Var = r9;
                        if (w == null) {
                        }
                        break;
                    case 2:
                        ?? r5 = (zu4) this.x;
                        zu4Var = (zu4) this.w;
                        zu4Var2 = (zu4) this.s;
                        y6a.M(obj);
                        t2 = r5;
                        T = obj;
                        if (T == null) {
                        }
                        zu4Var3 = t2;
                        images = mediaPost.getImages();
                        if (images != null) {
                        }
                        return null;
                    case 3:
                        ?? r52 = (zu4) this.x;
                        zu4Var = (zu4) this.w;
                        zu4Var2 = (zu4) this.s;
                        y6a.M(obj);
                        t2 = r52;
                        T2 = obj;
                        break;
                    case 4:
                        list = (List) this.t;
                        zu4Var3 = (zu4) this.x;
                        zu4Var = (zu4) this.w;
                        zu4Var2 = (zu4) this.s;
                        y6a.M(obj);
                        rq3Var = null;
                        this.v = rq3Var;
                        this.s = rq3Var;
                        this.w = zu4Var;
                        this.x = zu4Var3;
                        this.t = list;
                        this.u = 5;
                        T3 = zu4Var2.T(this);
                        if (T3 == lu3Var2) {
                        }
                        Event event22 = (Event) T3;
                        this.v = rq3Var;
                        this.s = rq3Var;
                        this.w = rq3Var;
                        this.x = zu4Var3;
                        this.t = list;
                        this.y = event22;
                        this.u = 6;
                        T4 = zu4Var.T(this);
                        if (T4 == lu3Var2) {
                        }
                        break;
                    case 5:
                        list = (List) this.t;
                        zu4Var3 = (zu4) this.x;
                        zu4Var = (zu4) this.w;
                        y6a.M(obj);
                        T3 = obj;
                        rq3Var = null;
                        Event event222 = (Event) T3;
                        this.v = rq3Var;
                        this.s = rq3Var;
                        this.w = rq3Var;
                        this.x = zu4Var3;
                        this.t = list;
                        this.y = event222;
                        this.u = 6;
                        T4 = zu4Var.T(this);
                        if (T4 == lu3Var2) {
                        }
                        break;
                    case 6:
                        Event event4 = (Event) this.y;
                        List<String> list5 = (List) this.t;
                        zu4 zu4Var11 = (zu4) this.x;
                        y6a.M(obj);
                        event = event4;
                        list = list5;
                        zu4Var4 = zu4Var11;
                        rq3Var = null;
                        T4 = obj;
                        uniqueTournamentResponse = (UniqueTournamentResponse) T4;
                        this.v = rq3Var;
                        this.s = rq3Var;
                        this.w = rq3Var;
                        this.x = rq3Var;
                        this.t = list;
                        this.y = event;
                        this.z = uniqueTournamentResponse;
                        this.u = 7;
                        T5 = zu4Var4.T(this);
                        if (T5 == lu3Var2) {
                        }
                        Event event32 = event;
                        stage = (Stage) T5;
                        int id3 = mediaPost.getId();
                        long createdAtTimestamp2 = mediaPost.getCreatedAtTimestamp();
                        String header2 = mediaPost.getHeader();
                        String description2 = mediaPost.getDescription();
                        Sport sport2 = mediaPost.getSport();
                        if (sport2 != null) {
                            break;
                        }
                        if (event32 != null) {
                        }
                        if (uniqueTournamentResponse != null) {
                            break;
                        }
                        if (stage != null) {
                        }
                        return new y80(id3, header2, description2, createdAtTimestamp2, str, F, iy7Var, r22, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31), (String) CollectionsKt.firstOrNull(mediaPost.getTags()), l6g.W(list));
                    case 7:
                        UniqueTournamentResponse uniqueTournamentResponse2 = (UniqueTournamentResponse) this.z;
                        event = (Event) this.y;
                        List<String> list6 = (List) this.t;
                        y6a.M(obj);
                        uniqueTournamentResponse = uniqueTournamentResponse2;
                        rq3Var = null;
                        list = list6;
                        T5 = obj;
                        Event event322 = event;
                        stage = (Stage) T5;
                        int id32 = mediaPost.getId();
                        long createdAtTimestamp22 = mediaPost.getCreatedAtTimestamp();
                        String header22 = mediaPost.getHeader();
                        String description22 = mediaPost.getDescription();
                        Sport sport22 = mediaPost.getSport();
                        if (sport22 != null) {
                        }
                        if (event322 != null) {
                        }
                        if (uniqueTournamentResponse != null) {
                        }
                        if (stage != null) {
                        }
                        return new y80(id32, header22, description22, createdAtTimestamp22, str, F, iy7Var, r22, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31), (String) CollectionsKt.firstOrNull(mediaPost.getTags()), l6g.W(list));
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 1:
                nmc nmcVar = (nmc) this.B;
                LocalDate localDate = (LocalDate) this.A;
                ku3 ku3Var2 = (ku3) this.v;
                lu3 lu3Var3 = lu3.a;
                int i5 = this.u;
                rq3 rq3Var4 = null;
                if (i5 == 0) {
                    y6a.M(obj);
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    format = localDate.format(hk4.a(bi4.PATTERN_NETWORK_YYMMDD.d()));
                    String valueOf2 = String.valueOf(ZonedDateTime.of(localDate, LocalTime.MIDNIGHT, ZoneId.systemDefault()).getOffset().getTotalSeconds());
                    t4 = xw3.t(ku3Var2, null, new j8c(nmcVar, format, rq3Var4, 4), 3);
                    LocalDate minusMonths = localDate.minusMonths(1L);
                    bi4 bi4Var = bi4.PATTERN_NETWORK_YM;
                    String format2 = minusMonths.format(hk4.a(bi4Var.d()));
                    av4 t10 = xw3.t(ku3Var2, null, new mmc(nmcVar, localDate.format(hk4.a(bi4Var.d())), valueOf2, rq3Var4, 1), 3);
                    t5 = xw3.t(ku3Var2, null, new mmc(nmcVar, format2, valueOf2, rq3Var4, 0), 3);
                    this.v = null;
                    this.w = format;
                    this.s = t4;
                    this.x = t5;
                    this.u = 1;
                    w2 = t10.w(this);
                    break;
                } else if (i5 == 1) {
                    av4 av4Var9 = (av4) this.x;
                    ?? r2 = (zu4) this.s;
                    format = (String) this.w;
                    y6a.M(obj);
                    t4 = r2;
                    t5 = av4Var9;
                    w2 = obj;
                } else {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        yzc yzcVar4 = (yzc) this.z;
                        String str2 = (String) this.y;
                        y6a.M(obj);
                        yzcVar = yzcVar4;
                        date = str2;
                        T7 = obj;
                        yzcVar.j(new lmc((x2g) T7, date));
                        return Unit.a;
                    }
                    list2 = (List) this.t;
                    ?? r23 = (zu4) this.s;
                    format = (String) this.w;
                    y6a.M(obj);
                    t4 = r23;
                    T6 = obj;
                    List H0 = CollectionsKt.H0(CollectionsKt.w0((List) T6, list2), new wpb(9));
                    ArrayList arrayList = new ArrayList();
                    for (Object obj8 : H0) {
                        if (!((MonthlyUniqueTournamentItem) obj8).getUniqueTournamentIds().isEmpty()) {
                            arrayList.add(obj8);
                        }
                    }
                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj2 = listIterator.previous();
                            String date2 = ((MonthlyUniqueTournamentItem) obj2).getDate();
                            format.getClass();
                            if (date2.compareTo(format) < 0) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    MonthlyUniqueTournamentItem monthlyUniqueTournamentItem = (MonthlyUniqueTournamentItem) obj2;
                    date = monthlyUniqueTournamentItem != null ? monthlyUniqueTournamentItem.getDate() : null;
                    yzcVar = nmcVar.i;
                    this.v = null;
                    this.w = null;
                    this.s = null;
                    this.x = null;
                    this.t = null;
                    this.y = date;
                    this.z = yzcVar;
                    this.u = 3;
                    T7 = t4.T(this);
                    break;
                }
                list2 = (List) w2;
                this.v = null;
                this.w = format;
                this.s = t4;
                this.x = null;
                this.t = list2;
                this.u = 2;
                T6 = t5.T(this);
                break;
            case 2:
                q1d q1dVar = (q1d) this.z;
                ?? r24 = lu3.a;
                int i6 = this.u;
                try {
                    try {
                        if (i6 == 0) {
                            y6a.M(obj);
                            ku3 ku3Var3 = (ku3) this.t;
                            m1d m1dVar = (m1d) this.y;
                            CoroutineContext.Element element = ku3Var3.getCoroutineContext().get(uic.g);
                            element.getClass();
                            o1dVar = new o1d(m1dVar, (yda) element);
                            q1dVar.b(o1dVar);
                            j2dVar = q1dVar.b;
                            function2 = (Function2) this.A;
                            obj3 = this.B;
                            this.t = o1dVar;
                            this.s = j2dVar;
                            this.v = function2;
                            this.w = obj3;
                            this.x = q1dVar;
                            this.u = 1;
                            break;
                        } else {
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                q1dVar = (q1d) this.v;
                                h2dVar = (h2d) this.s;
                                o1dVar2 = (o1d) this.t;
                                try {
                                    y6a.M(obj);
                                    invoke = obj;
                                    atomicReference2 = q1dVar.a;
                                    while (!atomicReference2.compareAndSet(o1dVar2, null) && atomicReference2.get() == o1dVar2) {
                                    }
                                    h2dVar.f(null);
                                    return invoke;
                                } catch (Throwable th) {
                                    th = th;
                                    atomicReference = q1dVar.a;
                                    while (!atomicReference.compareAndSet(o1dVar2, null) && atomicReference.get() == o1dVar2) {
                                    }
                                    throw th;
                                }
                            }
                            q1dVar = (q1d) this.x;
                            Object obj9 = this.w;
                            Function2 function22 = (Function2) this.v;
                            ?? r62 = (h2d) this.s;
                            o1d o1dVar3 = (o1d) this.t;
                            y6a.M(obj);
                            function2 = function22;
                            o1dVar = o1dVar3;
                            obj3 = obj9;
                            j2dVar = r62;
                        }
                        this.t = o1dVar;
                        this.s = j2dVar;
                        this.v = q1dVar;
                        this.w = null;
                        this.x = null;
                        this.u = 2;
                        invoke = function2.invoke(obj3, this);
                        if (invoke != r24) {
                            h2dVar = j2dVar;
                            o1dVar2 = o1dVar;
                            atomicReference2 = q1dVar.a;
                            while (!atomicReference2.compareAndSet(o1dVar2, null)) {
                            }
                            h2dVar.f(null);
                            return invoke;
                        }
                        return r24;
                    } catch (Throwable th2) {
                        th = th2;
                        o1dVar2 = o1dVar;
                        atomicReference = q1dVar.a;
                        while (!atomicReference.compareAndSet(o1dVar2, null)) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    r24.f(null);
                    throw th3;
                }
            case 3:
                ku3 ku3Var4 = (ku3) this.A;
                lu3 lu3Var4 = lu3.a;
                int i7 = this.u;
                if (i7 == 0) {
                    y6a.M(obj);
                    ade adeVar = (ade) this.B;
                    Integer num = adeVar.g;
                    if (num != null) {
                        av4Var2 = null;
                        i = 3;
                        av4Var3 = xw3.t(ku3Var4, null, new yce(adeVar, num.intValue(), av4Var2, 0), 3);
                    } else {
                        av4Var2 = null;
                        i = 3;
                        av4Var3 = null;
                    }
                    ade adeVar2 = (ade) this.B;
                    Integer num2 = adeVar2.g;
                    av4 t11 = num2 != null ? xw3.t(ku3Var4, av4Var2, new yce(adeVar2, num2.intValue(), av4Var2, i4), i) : av4Var2;
                    t6 = xw3.t(ku3Var4, av4Var2, new zce((ade) this.B, av4Var2, i4), i);
                    av4 t12 = xw3.t(ku3Var4, av4Var2, new zce((ade) this.B, av4Var2, 0), i);
                    this.A = av4Var2;
                    this.x = av4Var3;
                    this.s = t11;
                    this.w = t6;
                    this.u = 1;
                    w3 = t12.w(this);
                    if (w3 != lu3Var4) {
                        av4 av4Var10 = t11;
                        av4Var4 = av4Var3;
                        zu4Var5 = av4Var10;
                    }
                    return lu3Var4;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        b98Var2 = (f1d) this.v;
                        player3 = (Player) this.t;
                        ?? r4 = (zu4) this.w;
                        zu4Var6 = (zu4) this.s;
                        y6a.M(obj);
                        t6 = r4;
                        T8 = obj;
                        player2 = (Player) T8;
                        b98Var = b98Var2;
                        player = player3;
                        obj4 = null;
                        this.A = null;
                        this.x = null;
                        this.s = zu4Var6;
                        this.w = null;
                        this.t = player;
                        this.v = player2;
                        this.y = b98Var;
                        this.u = 3;
                        T9 = t6.T(this);
                        if (T9 != lu3Var4) {
                            zu4Var7 = zu4Var6;
                            player4 = player;
                            b98Var3 = b98Var;
                            PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse4 = (PlayerPenaltyHistoryResponse) T9;
                            if (zu4Var7 != null) {
                            }
                        }
                        return lu3Var4;
                    }
                    if (i7 != 3) {
                        if (i7 != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b98Var3 = (f1d) this.z;
                        playerPenaltyHistoryResponse3 = (PlayerPenaltyHistoryResponse) this.y;
                        player7 = (Player) this.v;
                        player8 = (Player) this.t;
                        y6a.M(obj);
                        T10 = obj;
                        playerPenaltyHistoryResponse = playerPenaltyHistoryResponse3;
                        player5 = player7;
                        player6 = player8;
                        playerPenaltyHistoryResponse2 = (PlayerPenaltyHistoryResponse) T10;
                        ade adeVar3 = (ade) this.B;
                        int i8 = adeVar3.h;
                        Integer num3 = adeVar3.i;
                        Context i9 = adeVar3.i();
                        sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = i9.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        xce xceVar = new xce(player6, player5, i8, num3, playerPenaltyHistoryResponse, playerPenaltyHistoryResponse2, sharedPreferences.getBoolean("showPenaltyHistoryDataDisclaimer", true));
                        fdi fdiVar = (fdi) b98Var3;
                        fdiVar.getClass();
                        fdiVar.m(null, xceVar);
                        return Unit.a;
                    }
                    b98Var3 = (f1d) this.y;
                    Player player9 = (Player) this.v;
                    Player player10 = (Player) this.t;
                    zu4 zu4Var12 = (zu4) this.s;
                    y6a.M(obj);
                    zu4Var7 = zu4Var12;
                    obj4 = null;
                    player4 = player10;
                    player2 = player9;
                    T9 = obj;
                    PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse42 = (PlayerPenaltyHistoryResponse) T9;
                    if (zu4Var7 != null) {
                        playerPenaltyHistoryResponse = playerPenaltyHistoryResponse42;
                        player5 = player2;
                        player6 = player4;
                        playerPenaltyHistoryResponse2 = null;
                        ade adeVar32 = (ade) this.B;
                        int i82 = adeVar32.h;
                        Integer num32 = adeVar32.i;
                        Context i92 = adeVar32.i();
                        sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                        }
                        xce xceVar2 = new xce(player6, player5, i82, num32, playerPenaltyHistoryResponse, playerPenaltyHistoryResponse2, sharedPreferences.getBoolean("showPenaltyHistoryDataDisclaimer", true));
                        fdi fdiVar2 = (fdi) b98Var3;
                        fdiVar2.getClass();
                        fdiVar2.m(null, xceVar2);
                        return Unit.a;
                    }
                    this.A = obj4;
                    this.x = obj4;
                    this.s = obj4;
                    this.w = obj4;
                    this.t = player4;
                    this.v = player2;
                    this.y = playerPenaltyHistoryResponse42;
                    this.z = b98Var3;
                    this.u = 4;
                    T10 = zu4Var7.T(this);
                    if (T10 != lu3Var4) {
                        playerPenaltyHistoryResponse3 = playerPenaltyHistoryResponse42;
                        player7 = player2;
                        player8 = player4;
                        playerPenaltyHistoryResponse = playerPenaltyHistoryResponse3;
                        player5 = player7;
                        player6 = player8;
                        playerPenaltyHistoryResponse2 = (PlayerPenaltyHistoryResponse) T10;
                        ade adeVar322 = (ade) this.B;
                        int i822 = adeVar322.h;
                        Integer num322 = adeVar322.i;
                        Context i922 = adeVar322.i();
                        sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                        }
                        xce xceVar22 = new xce(player6, player5, i822, num322, playerPenaltyHistoryResponse, playerPenaltyHistoryResponse2, sharedPreferences.getBoolean("showPenaltyHistoryDataDisclaimer", true));
                        fdi fdiVar22 = (fdi) b98Var3;
                        fdiVar22.getClass();
                        fdiVar22.m(null, xceVar22);
                        return Unit.a;
                    }
                    return lu3Var4;
                }
                ?? r1 = (zu4) this.w;
                zu4Var5 = (zu4) this.s;
                av4Var4 = (av4) this.x;
                y6a.M(obj);
                t6 = r1;
                w3 = obj;
                player = (Player) w3;
                if (player == null) {
                    return Unit.a;
                }
                b98Var = ((ade) this.B).j;
                if (av4Var4 == null) {
                    zu4Var6 = zu4Var5;
                    player2 = null;
                    obj4 = null;
                    this.A = null;
                    this.x = null;
                    this.s = zu4Var6;
                    this.w = null;
                    this.t = player;
                    this.v = player2;
                    this.y = b98Var;
                    this.u = 3;
                    T9 = t6.T(this);
                    if (T9 != lu3Var4) {
                    }
                    return lu3Var4;
                }
                this.A = null;
                this.x = null;
                this.s = zu4Var5;
                this.w = t6;
                this.t = player;
                this.v = b98Var;
                this.u = 2;
                T8 = av4Var4.T(this);
                if (T8 != lu3Var4) {
                    zu4Var6 = zu4Var5;
                    player3 = player;
                    b98Var2 = b98Var;
                    player2 = (Player) T8;
                    b98Var = b98Var2;
                    player = player3;
                    obj4 = null;
                    this.A = null;
                    this.x = null;
                    this.s = zu4Var6;
                    this.w = null;
                    this.t = player;
                    this.v = player2;
                    this.y = b98Var;
                    this.u = 3;
                    T9 = t6.T(this);
                    if (T9 != lu3Var4) {
                    }
                }
                return lu3Var4;
            case 4:
                tn6 tn6Var = (tn6) this.B;
                jre jreVar2 = (jre) this.A;
                ku3 ku3Var5 = (ku3) this.v;
                lu3 lu3Var5 = lu3.a;
                int i10 = this.u;
                if (i10 == 0) {
                    y6a.M(obj);
                    av4 t13 = xw3.t(ku3Var5, null, new ire(jreVar2, tn6Var, rq3Var2, i3), 3);
                    av4 t14 = xw3.t(ku3Var5, null, new ire(jreVar2, tn6Var, rq3Var2, i4), 3);
                    t7 = xw3.t(ku3Var5, null, new ire(jreVar2, tn6Var, rq3Var2, 3), 3);
                    t8 = xw3.t(ku3Var5, null, new ire(jreVar2, tn6Var, rq3Var2, i2), 3);
                    this.v = null;
                    this.x = t14;
                    this.s = t7;
                    this.w = t8;
                    this.u = 1;
                    w4 = t13.w(this);
                    if (w4 != lu3Var5) {
                        av4Var5 = t14;
                    }
                    return lu3Var5;
                }
                if (i10 == 1) {
                    t8 = (zu4) this.w;
                    ?? r8 = (zu4) this.s;
                    av4Var5 = (av4) this.x;
                    y6a.M(obj);
                    t7 = r8;
                    w4 = obj;
                } else {
                    if (i10 == 2) {
                        fantasyPlayerFormAndFixturesResponse = (FantasyPlayerFormAndFixturesResponse) this.t;
                        zu4Var8 = (zu4) this.w;
                        ?? r10 = (zu4) this.s;
                        y6a.M(obj);
                        t7 = r10;
                        T11 = obj;
                        FantasyPlayer fantasyPlayer2 = (FantasyPlayer) T11;
                        this.v = null;
                        this.x = null;
                        this.s = null;
                        this.w = zu4Var8;
                        this.t = fantasyPlayerFormAndFixturesResponse;
                        this.y = fantasyPlayer2;
                        this.u = 3;
                        T12 = t7.T(this);
                        if (T12 != lu3Var5) {
                            zu4Var9 = zu4Var8;
                            fantasyPlayer = fantasyPlayer2;
                            map = (Map) T12;
                            this.v = null;
                            this.x = null;
                            this.s = null;
                            this.w = null;
                            this.t = fantasyPlayerFormAndFixturesResponse;
                            this.y = fantasyPlayer;
                            this.z = map;
                            this.u = 4;
                            T13 = zu4Var9.T(this);
                        }
                        return lu3Var5;
                    }
                    if (i10 != 3) {
                        if (i10 != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Map map2 = (Map) this.z;
                        fantasyPlayer = (FantasyPlayer) this.y;
                        FantasyPlayerFormAndFixturesResponse fantasyPlayerFormAndFixturesResponse2 = (FantasyPlayerFormAndFixturesResponse) this.t;
                        y6a.M(obj);
                        map = map2;
                        fantasyPlayerFormAndFixturesResponse = fantasyPlayerFormAndFixturesResponse2;
                        T13 = obj;
                        FantasyCompetition fantasyCompetition = (FantasyCompetition) T13;
                        if (fantasyPlayerFormAndFixturesResponse == null || (list3 = fantasyPlayerFormAndFixturesResponse.getForm()) == null) {
                            list3 = km5.a;
                        }
                        if (fantasyPlayerFormAndFixturesResponse == null || (list4 = fantasyPlayerFormAndFixturesResponse.getFixtures()) == null) {
                            list4 = km5.a;
                        }
                        ArrayList w0 = CollectionsKt.w0(list4, list3);
                        if (map != null) {
                            if (map.size() < 2) {
                                map = null;
                            }
                            if (map != null) {
                                if (fantasyCompetition != null) {
                                    Iterator it2 = map.entrySet().iterator();
                                    if (!it2.hasNext()) {
                                        yhk.d();
                                        return null;
                                    }
                                    Object next = it2.next();
                                    if (it2.hasNext()) {
                                        float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                                        do {
                                            Object next2 = it2.next();
                                            float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                                            if (Float.compare(floatValue, floatValue2) > 0) {
                                                next = next2;
                                                floatValue = floatValue2;
                                            }
                                        } while (it2.hasNext());
                                    }
                                    Map.Entry entry = (Map.Entry) next;
                                    Iterator it3 = map.entrySet().iterator();
                                    if (!it3.hasNext()) {
                                        yhk.d();
                                        return null;
                                    }
                                    Object next3 = it3.next();
                                    if (it3.hasNext()) {
                                        float floatValue3 = ((Number) ((Map.Entry) next3).getValue()).floatValue();
                                        do {
                                            Object next4 = it3.next();
                                            float floatValue4 = ((Number) ((Map.Entry) next4).getValue()).floatValue();
                                            if (Float.compare(floatValue3, floatValue4) < 0) {
                                                next3 = next4;
                                                floatValue3 = floatValue4;
                                            }
                                        } while (it3.hasNext());
                                    }
                                    Map.Entry entry2 = (Map.Entry) next3;
                                    Iterator it4 = w0.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            obj6 = it4.next();
                                            FantasyRound fantasyRound = ((FantasyPlayerFixture) obj6).getFantasyRound();
                                            if (fantasyRound == null || fantasyRound.getSequence() != ((Number) entry.getKey()).intValue()) {
                                            }
                                        } else {
                                            obj6 = null;
                                        }
                                    }
                                    FantasyPlayerFixture fantasyPlayerFixture = (FantasyPlayerFixture) obj6;
                                    FantasyRound fantasyRound2 = fantasyPlayerFixture != null ? fantasyPlayerFixture.getFantasyRound() : null;
                                    Iterator it5 = w0.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            obj7 = it5.next();
                                            FantasyRound fantasyRound3 = ((FantasyPlayerFixture) obj7).getFantasyRound();
                                            if (fantasyRound3 == null || fantasyRound3.getSequence() != ((Number) entry2.getKey()).intValue()) {
                                            }
                                        } else {
                                            obj7 = null;
                                        }
                                    }
                                    FantasyPlayerFixture fantasyPlayerFixture2 = (FantasyPlayerFixture) obj7;
                                    FantasyRound fantasyRound4 = fantasyPlayerFixture2 != null ? fantasyPlayerFixture2.getFantasyRound() : null;
                                    tee b0 = l6g.b0(map);
                                    Collection values = map.values();
                                    values.getClass();
                                    Iterator it6 = values.iterator();
                                    double d2 = 0.0d;
                                    int i11 = 0;
                                    while (it6.hasNext()) {
                                        ?? r21 = rq3Var2;
                                        jre jreVar3 = jreVar2;
                                        d2 += ((Number) it6.next()).floatValue();
                                        i11++;
                                        if (i11 < 0) {
                                            b.p();
                                            throw r21;
                                        }
                                        rq3Var2 = r21;
                                        jreVar2 = jreVar3;
                                    }
                                    jreVar = jreVar2;
                                    obj5 = rq3Var2;
                                    float f = (float) (i11 == 0 ? Double.NaN : d2 / i11);
                                    float r0 = CollectionsKt.r0(map.values());
                                    float n0 = CollectionsKt.n0(map.values());
                                    Context i12 = jreVar.i();
                                    ?? name3 = fantasyRound2 != null ? fantasyRound2.getName() : obj5;
                                    if (name3 == 0) {
                                        name3 = "";
                                    }
                                    String C = f5p.C(i12, yid.m(fantasyRound2 != null ? new Integer(fantasyRound2.getSequence()) : obj5), name3);
                                    Context i13 = jreVar.i();
                                    Object name4 = fantasyRound4 != null ? fantasyRound4.getName() : obj5;
                                    String C2 = f5p.C(i13, yid.m(fantasyRound4 != null ? new Integer(fantasyRound4.getSequence()) : obj5), name4 != null ? name4 : "");
                                    int roundCount = fantasyCompetition.getRoundCount();
                                    Object X = CollectionsKt.X(map.keySet());
                                    if (((Number) X).intValue() == 1) {
                                        X = obj5;
                                    }
                                    yd7Var2 = new yd7(b0, f, r0, C, n0, C2, roundCount, (Integer) X);
                                } else {
                                    jreVar = jreVar2;
                                    obj5 = null;
                                    yd7Var2 = null;
                                }
                                yd7Var = yd7Var2;
                                hre k = jreVar.k();
                                ?? X2 = fantasyPlayer == null ? m6k.X(fantasyPlayer, jreVar.i()) : obj5;
                                List H02 = CollectionsKt.H0(w0, new wpb(12));
                                ArrayList arrayList2 = new ArrayList(k13.r(H02, 10));
                                it = H02.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(s9a.D((FantasyPlayerFixture) it.next(), false));
                                }
                                ((eoh) jreVar.h).setValue(hre.a(k, null, null, yd7Var, X2, l6g.W(arrayList2), false, fantasyCompetition == null && fantasyCompetition.getOfficialAssetsRestricted(), 163));
                                return Unit.a;
                            }
                        }
                        jreVar = jreVar2;
                        obj5 = null;
                        yd7Var = null;
                        hre k2 = jreVar.k();
                        if (fantasyPlayer == null) {
                        }
                        List H022 = CollectionsKt.H0(w0, new wpb(12));
                        ArrayList arrayList22 = new ArrayList(k13.r(H022, 10));
                        it = H022.iterator();
                        while (it.hasNext()) {
                        }
                        ((eoh) jreVar.h).setValue(hre.a(k2, null, null, yd7Var, X2, l6g.W(arrayList22), false, fantasyCompetition == null && fantasyCompetition.getOfficialAssetsRestricted(), 163));
                        return Unit.a;
                    }
                    FantasyPlayer fantasyPlayer3 = (FantasyPlayer) this.y;
                    FantasyPlayerFormAndFixturesResponse fantasyPlayerFormAndFixturesResponse3 = (FantasyPlayerFormAndFixturesResponse) this.t;
                    zu4Var9 = (zu4) this.w;
                    y6a.M(obj);
                    fantasyPlayer = fantasyPlayer3;
                    fantasyPlayerFormAndFixturesResponse = fantasyPlayerFormAndFixturesResponse3;
                    T12 = obj;
                    map = (Map) T12;
                    this.v = null;
                    this.x = null;
                    this.s = null;
                    this.w = null;
                    this.t = fantasyPlayerFormAndFixturesResponse;
                    this.y = fantasyPlayer;
                    this.z = map;
                    this.u = 4;
                    T13 = zu4Var9.T(this);
                    break;
                }
                FantasyPlayerFormAndFixturesResponse fantasyPlayerFormAndFixturesResponse4 = (FantasyPlayerFormAndFixturesResponse) w4;
                this.v = null;
                this.x = null;
                this.s = t7;
                this.w = t8;
                this.t = fantasyPlayerFormAndFixturesResponse4;
                this.u = 2;
                T11 = av4Var5.T(this);
                if (T11 != lu3Var5) {
                    zu4Var8 = t8;
                    fantasyPlayerFormAndFixturesResponse = fantasyPlayerFormAndFixturesResponse4;
                    FantasyPlayer fantasyPlayer22 = (FantasyPlayer) T11;
                    this.v = null;
                    this.x = null;
                    this.s = null;
                    this.w = zu4Var8;
                    this.t = fantasyPlayerFormAndFixturesResponse;
                    this.y = fantasyPlayer22;
                    this.u = 3;
                    T12 = t7.T(this);
                    if (T12 != lu3Var5) {
                    }
                }
                return lu3Var5;
            default:
                Stage stage8 = (Stage) this.B;
                g4i g4iVar2 = (g4i) this.z;
                vng vngVar = g4iVar2.e;
                amd amdVar = g4iVar2.i;
                ku3 ku3Var6 = (ku3) this.y;
                lu3 lu3Var6 = lu3.a;
                int i14 = this.u;
                rq3 rq3Var5 = null;
                if (i14 == 0) {
                    y6a.M(obj);
                    av4 t15 = xw3.t(ku3Var6, null, new v1f(g4iVar2, (Stage) this.A, stage8, rq3Var5, 29), 3);
                    av4 t16 = xw3.t(ku3Var6, null, new w9g(g4iVar2, rq3Var5, 16), 3);
                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) CollectionsKt.firstOrNull(amdVar.c());
                    if (oddsCountryProvider != null) {
                        Context i15 = g4iVar2.i();
                        Stage stage9 = g4iVar2.j;
                        if (stage9 != null) {
                            DayOfWeek dayOfWeek = hwc.a;
                            bool = Boolean.valueOf(hwc.f(stage9));
                        } else {
                            bool = null;
                        }
                        Boolean bool2 = Boolean.TRUE;
                        boolean c = Intrinsics.c(bool, bool2);
                        amdVar.getClass();
                        yea yeaVar = j58.a;
                        if (!fn0.B("show_motorsport_odds") || !xld.g(i15) || !rld.t(i15) || amdVar.c().size() != 1 || (c && rld.a(ke0.c))) {
                            oddsCountryProvider = null;
                        }
                        if (oddsCountryProvider != null) {
                            ServerType type = stage8.getType();
                            int i16 = type == null ? -1 : f4i.a[type.ordinal()];
                            if (i16 == 1 || i16 == 2) {
                                List list7 = g4iVar2.k;
                                if (list7 != null) {
                                    Iterator it7 = list7.iterator();
                                    while (true) {
                                        if (it7.hasNext()) {
                                            stage3 = it7.next();
                                            if (((Stage) stage3).getType() == ServerType.SPRINT) {
                                            }
                                        } else {
                                            stage3 = 0;
                                        }
                                    }
                                    stage2 = stage3;
                                } else {
                                    stage2 = null;
                                }
                                pair = new Pair(stage2, Boolean.FALSE);
                            } else {
                                if (i16 != 3) {
                                    Stage stage10 = g4iVar2.j;
                                    pair2 = i16 != 4 ? new Pair(stage10, Boolean.FALSE) : new Pair(stage10, bool2);
                                    stage4 = (Stage) pair2.a;
                                    boolean booleanValue = ((Boolean) pair2.b).booleanValue();
                                    if (stage4 != null) {
                                        av4Var6 = t15;
                                        av4Var7 = t16;
                                        lu3Var = lu3Var6;
                                        av4Var8 = null;
                                        this.y = null;
                                        this.w = av4Var6;
                                        this.s = av4Var8;
                                        this.v = g4iVar2;
                                        this.u = 1;
                                        w5 = av4Var7.w(this);
                                        if (w5 != lu3Var) {
                                        }
                                        return lu3Var;
                                    }
                                    hs4 hs4Var = z45.a;
                                    av4Var6 = t15;
                                    lu3Var = lu3Var6;
                                    av4Var7 = t16;
                                    kv7 kv7Var = new kv7(booleanValue, g4iVar2, stage4, oddsCountryProvider, stage8, (rq3) null);
                                    g4iVar2 = g4iVar2;
                                    av4Var8 = xw3.t(ku3Var6, hs4Var, kv7Var, 2);
                                    this.y = null;
                                    this.w = av4Var6;
                                    this.s = av4Var8;
                                    this.v = g4iVar2;
                                    this.u = 1;
                                    w5 = av4Var7.w(this);
                                    if (w5 != lu3Var) {
                                        g4iVar = g4iVar2;
                                        zu4Var10 = av4Var8;
                                    }
                                    return lu3Var;
                                }
                                List list8 = g4iVar2.k;
                                if (list8 != null) {
                                    Iterator it8 = list8.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            stage6 = it8.next();
                                            if (((Stage) stage6).getType() == ServerType.SPRINT) {
                                            }
                                        } else {
                                            stage6 = 0;
                                        }
                                    }
                                    stage5 = stage6;
                                } else {
                                    stage5 = null;
                                }
                                pair = new Pair(stage5, bool2);
                            }
                            pair2 = pair;
                            stage4 = (Stage) pair2.a;
                            boolean booleanValue2 = ((Boolean) pair2.b).booleanValue();
                            if (stage4 != null) {
                            }
                        }
                    }
                    av4Var6 = t15;
                    av4Var7 = t16;
                    lu3Var = lu3Var6;
                    av4Var8 = null;
                    this.y = null;
                    this.w = av4Var6;
                    this.s = av4Var8;
                    this.v = g4iVar2;
                    this.u = 1;
                    w5 = av4Var7.w(this);
                    if (w5 != lu3Var) {
                    }
                    return lu3Var;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                y6a.M(obj);
                                return Unit.a;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tvCountryChannelsResponse = (TvCountryChannelsResponse) this.t;
                        x2gVar = (x2g) this.x;
                        yzcVar3 = (yzc) this.v;
                        y6a.M(obj);
                        T15 = obj;
                        lu3Var = lu3Var6;
                        c4iVar = (c4i) T15;
                        yzcVar3.k(new b4i(x2gVar, tvCountryChannelsResponse, c4iVar));
                        stage7 = g4iVar2.j;
                        if (stage7 != null) {
                            int id4 = stage7.getId();
                            com.sofascore.model.Country country2 = (com.sofascore.model.Country) vngVar.d;
                            TvType tvType = TvType.STAGE;
                            this.y = null;
                            this.w = null;
                            this.s = null;
                            this.v = null;
                            this.x = null;
                            this.t = null;
                            this.u = 4;
                            break;
                        }
                        return Unit.a;
                    }
                    yzcVar2 = (yzc) this.v;
                    zu4 zu4Var13 = (zu4) this.s;
                    y6a.M(obj);
                    T14 = obj;
                    zu4Var10 = zu4Var13;
                    lu3Var = lu3Var6;
                    yzcVar3 = yzcVar2;
                    x2gVar = (x2g) T14;
                    tvCountryChannelsResponse = (TvCountryChannelsResponse) vngVar.f;
                    if (zu4Var10 == null) {
                        c4iVar = null;
                        yzcVar3.k(new b4i(x2gVar, tvCountryChannelsResponse, c4iVar));
                        stage7 = g4iVar2.j;
                        if (stage7 != null) {
                        }
                        return Unit.a;
                    }
                    this.y = null;
                    this.w = null;
                    this.s = null;
                    this.v = yzcVar3;
                    this.x = x2gVar;
                    this.t = tvCountryChannelsResponse;
                    this.u = 3;
                    T15 = zu4Var10.T(this);
                    break;
                } else {
                    g4i g4iVar3 = (g4i) this.v;
                    zu4Var10 = (zu4) this.s;
                    av4Var6 = (av4) this.w;
                    y6a.M(obj);
                    g4iVar = g4iVar3;
                    lu3Var = lu3Var6;
                    w5 = obj;
                }
                x2g x2gVar2 = (x2g) w5;
                g4iVar.e.f = x2gVar2 != null ? (TvCountryChannelsResponse) yaa.x(x2gVar2) : null;
                yzcVar2 = g4iVar2.o;
                this.y = null;
                this.w = null;
                this.s = zu4Var10;
                this.v = yzcVar2;
                this.u = 2;
                T14 = av4Var6.T(this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7c(ade adeVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 3;
        this.B = adeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7c(g4i g4iVar, Stage stage, Stage stage2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 5;
        this.z = g4iVar;
        this.A = stage;
        this.B = stage2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q7c(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.A = obj;
        this.B = obj2;
    }
}
