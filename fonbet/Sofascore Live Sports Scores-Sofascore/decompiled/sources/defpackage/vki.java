package defpackage;

import android.widget.ProgressBar;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.Country;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.AiAnalystDemoEvent;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.DbMyPlayer;
import com.sofascore.model.mvvm.model.DbMyTeam;
import com.sofascore.model.mvvm.model.DbMyUniqueTournament;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.MediaHighlightSummaryResponse;
import com.sofascore.model.newNetwork.PlayerDetailsResponse;
import com.sofascore.model.newNetwork.SearchTournamentsResponse;
import com.sofascore.model.newNetwork.TeamDetailsResponse;
import com.sofascore.model.newNetwork.TvChannelsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentResponse;
import com.sofascore.results.service.SyncWorker;
import com.sofascore.results.tv.TVScheduleActivity;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vki extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vki(b1d b1dVar, rq3 rq3Var, TVScheduleActivity tVScheduleActivity) {
        super(2, rq3Var);
        this.r = 6;
        this.t = b1dVar;
        this.u = tVScheduleActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return new vki((bli) this.t, (asf) obj2, rq3Var, 0);
            case 1:
                return new vki((SyncWorker) this.t, (DbMyUniqueTournament) obj2, rq3Var, 1);
            case 2:
                return new vki((SyncWorker) this.t, (DbMyPlayer) obj2, rq3Var, 2);
            case 3:
                return new vki((SyncWorker) this.t, (DbMyTeam) obj2, rq3Var, 3);
            case 4:
                return new vki((SyncWorker) this.t, (Stage) obj2, rq3Var, 4);
            case 5:
                vki vkiVar = new vki((SyncWorker) obj2, rq3Var, 5);
                vkiVar.t = obj;
                return vkiVar;
            case 6:
                return new vki((b1d) this.t, rq3Var, (TVScheduleActivity) obj2);
            case 7:
                return new vki((yda) this.t, (j6f) obj2, rq3Var, 7);
            case 8:
                return new vki((nui) obj2, rq3Var, 8);
            case 9:
                return new vki((xwi) this.t, (YearMonth) obj2, rq3Var, 9);
            case 10:
                return new vki((xwi) this.t, (twi) obj2, rq3Var, 10);
            case 11:
                return new vki((ria) this.t, (caj) obj2, rq3Var, 11);
            case 12:
                vki vkiVar2 = new vki((caj) obj2, rq3Var, 12);
                vkiVar2.t = obj;
                return vkiVar2;
            case 13:
                vki vkiVar3 = new vki((ebj) obj2, rq3Var, 13);
                vkiVar3.t = obj;
                return vkiVar3;
            case 14:
                return new vki((flb) this.t, (xlb) obj2, rq3Var, 14);
            case 15:
                return new vki((a6e) this.t, (Function1) obj2, rq3Var, 15);
            case 16:
                return new vki((koj) this.t, (rnj) obj2, rq3Var, 16);
            case 17:
                return new vki((t32) this.t, (e1d) obj2, rq3Var, 17);
            case 18:
                return new vki((uvj) this.t, (Category) obj2, rq3Var, 18);
            case 19:
                return new vki((uvj) this.t, (String) obj2, rq3Var, 19);
            case 20:
                return new vki((i1k) this.t, (Function0) obj2, rq3Var, 20);
            case 21:
                return new vki((u3k) obj2, rq3Var, 21);
            case 22:
                return new vki((u3k) this.t, (Country) obj2, rq3Var, 22);
            case 23:
                return new vki((g4k) this.t, (Integer) obj2, rq3Var, 23);
            case 24:
                return new vki((g4k) this.t, (String) obj2, rq3Var, 24);
            case 25:
                vki vkiVar4 = new vki((b98) obj2, rq3Var, 25);
                vkiVar4.t = obj;
                return vkiVar4;
            case 26:
                return new vki((xdk) obj2, rq3Var, 26);
            case 27:
                vki vkiVar5 = new vki((agk) obj2, rq3Var, 27);
                vkiVar5.t = obj;
                return vkiVar5;
            case 28:
                vki vkiVar6 = new vki((rlk) obj2, rq3Var, 28);
                vkiVar6.t = obj;
                return vkiVar6;
            default:
                return new vki((jxk) this.t, (qug) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 6:
                ((vki) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 12:
                ((vki) create((j20) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((vki) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x04ba, code lost:
    
        if (r1.a(null, r23) == r0) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x04ad, code lost:
    
        if (defpackage.n4o.y(350, r23) == r0) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x061c, code lost:
    
        if (r1.d(r23) == r0) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0627, code lost:
    
        if (r1.s(r23) == r0) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0632, code lost:
    
        if (r1.c(false, r23) == r0) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x070b, code lost:
    
        if (((defpackage.j6f) r10).c(r23) == r0) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0700, code lost:
    
        if (r1.Z(r23) == r0) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0773, code lost:
    
        if (defpackage.n4o.z(r3, r23) == r2) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0788, code lost:
    
        if (defpackage.s9a.r(new defpackage.w9g((com.sofascore.results.service.SyncWorker) r10, r13, 23), r23) == r2) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0794  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:363:0x0788 -> B:357:0x078c). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object q0;
        UniqueTournament uniqueTournament;
        Object i;
        Player player;
        Object k;
        Team team;
        Object P;
        nui nuiVar;
        Object P2;
        List<UniqueTournament> uniqueTournaments;
        Object c;
        Object A;
        u3k u3kVar;
        Object P3;
        Object P4;
        List<TvChannel> channels;
        Object w;
        xdk xdkVar;
        ku3 ku3Var;
        int i2 = this.r;
        int i3 = 4;
        int i4 = 8;
        int i5 = 18;
        int i6 = 7;
        int i7 = 9;
        int i8 = 2;
        Object obj2 = this.u;
        int i9 = 1;
        rq3 rq3Var = null;
        switch (i2) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    bfk bfkVar = ((bli) this.t).b;
                    Boolean valueOf = Boolean.valueOf(((asf) obj2).a);
                    this.s = 1;
                    if (bfk.e(bfkVar, null, null, null, null, valueOf, null, null, null, null, this, 8159) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                DbMyUniqueTournament dbMyUniqueTournament = (DbMyUniqueTournament) obj2;
                lu3 lu3Var2 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    w3b w3bVar = ((SyncWorker) this.t).d;
                    int uniqueTournamentId = dbMyUniqueTournament.getUniqueTournamentId();
                    this.s = 1;
                    q0 = w3bVar.q0(uniqueTournamentId, this);
                    if (q0 == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    q0 = obj;
                }
                UniqueTournamentResponse uniqueTournamentResponse = (UniqueTournamentResponse) q0;
                if (uniqueTournamentResponse == null || (uniqueTournament = uniqueTournamentResponse.getUniqueTournament()) == null) {
                    return null;
                }
                return new Pair(uniqueTournament, Boolean.valueOf(dbMyUniqueTournament.getNotificationsEnabled()));
            case 2:
                DbMyPlayer dbMyPlayer = (DbMyPlayer) obj2;
                lu3 lu3Var3 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    wve wveVar = ((SyncWorker) this.t).g;
                    int playerId = dbMyPlayer.getPlayerId();
                    this.s = 1;
                    i = wveVar.i(playerId, this);
                    if (i == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    i = obj;
                }
                PlayerDetailsResponse playerDetailsResponse = (PlayerDetailsResponse) yaa.x((x2g) i);
                if (playerDetailsResponse == null || (player = playerDetailsResponse.getPlayer()) == null) {
                    return null;
                }
                return new Pair(player, Boolean.valueOf(dbMyPlayer.getNotificationsEnabled()));
            case 3:
                DbMyTeam dbMyTeam = (DbMyTeam) obj2;
                lu3 lu3Var4 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    j0j j0jVar = ((SyncWorker) this.t).h;
                    int teamId = dbMyTeam.getTeamId();
                    this.s = 1;
                    k = j0jVar.k(teamId, this);
                    if (k == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    k = obj;
                }
                TeamDetailsResponse teamDetailsResponse = (TeamDetailsResponse) yaa.x((x2g) k);
                if (teamDetailsResponse == null || (team = teamDetailsResponse.getTeam()) == null) {
                    return null;
                }
                return new Pair(team, Boolean.valueOf(dbMyTeam.getNotificationsEnabled()));
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Serializable f = ((SyncWorker) this.t).f((Stage) obj2, this);
                    return f == lu3Var5 ? lu3Var5 : f;
                }
                if (i14 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var6 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    if (s9a.w(ku3Var2)) {
                    }
                } else if (i15 == 1) {
                    y6a.M(obj);
                    this.t = ku3Var2;
                    this.s = 2;
                    break;
                } else {
                    if (i15 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    ad2 ad2Var = qv5.a;
                    qv5.a(h52.a);
                    if (s9a.w(ku3Var2)) {
                        return Unit.a;
                    }
                    wd5 wd5Var = xd5.b;
                    long R = wkn.R(4, be5.SECONDS);
                    this.t = ku3Var2;
                    this.s = 1;
                    break;
                }
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    b1d b1dVar = (b1d) this.t;
                    f10 f10Var = new f10((TVScheduleActivity) obj2, 22);
                    this.s = 1;
                    if (b1dVar.collect(f10Var, this) == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i16 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    yda ydaVar = (yda) this.t;
                    this.s = 1;
                    break;
                } else {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                this.s = 2;
                break;
            case 8:
                nui nuiVar2 = (nui) obj2;
                lu3 lu3Var9 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    t9c t9cVar = nuiVar2.f;
                    int i19 = nuiVar2.i;
                    String c2 = dv3.c();
                    this.t = nuiVar2;
                    this.s = 1;
                    t9cVar.getClass();
                    P = yaa.P(new y8c(t9cVar, i19, c2, null, 3), this);
                    if (P == lu3Var9) {
                        return lu3Var9;
                    }
                    nuiVar = nuiVar2;
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nuiVar = (nui) this.t;
                    y6a.M(obj);
                    P = obj;
                }
                nuiVar.y = (MediaHighlightSummaryResponse) yaa.x((x2g) P);
                return Boolean.valueOf(nuiVar2.y != null);
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((xwi) this.t).k((YearMonth) obj2, this) == lu3Var10) {
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
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    cg4 cg4Var = ((xwi) this.t).f;
                    String name = ((twi) obj2).name();
                    this.s = 1;
                    if (cg4Var.i("PREF_TEAM_EVENTS_DISPLAY_MODE", name, this) == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i21 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 11:
                caj cajVar = (caj) obj2;
                lu3 lu3Var12 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    switch (((ria) this.t).ordinal()) {
                        case 17:
                            lcj lcjVar = cajVar.s;
                            this.s = 1;
                            break;
                        case 18:
                            lcj lcjVar2 = cajVar.s;
                            this.s = 3;
                            break;
                        case 19:
                            lcj lcjVar3 = cajVar.s;
                            this.s = 2;
                            break;
                    }
                } else {
                    if (i22 != 1 && i22 != 2 && i22 != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 12:
                caj cajVar2 = (caj) obj2;
                lu3 lu3Var13 = lu3.a;
                int i23 = this.s;
                if (i23 != 0) {
                    if (i23 == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j20 j20Var = (j20) this.t;
                jwj jwjVar = cajVar2.q;
                cej cejVar = cajVar2.r;
                qu9 e = cajVar2.v.e(cajVar2.x);
                i43 i43Var = new i43(1, cajVar2, caj.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)Z", 8, 6);
                w9j w9jVar = new w9j(cajVar2, 12);
                b1d b1dVar2 = cajVar2.z;
                hsk hskVar = (hsk) tgj.x(cajVar2, dh3.t);
                x9j x9jVar = new x9j(cajVar2, i4);
                this.s = 1;
                hkg.k0(j20Var, jwjVar, cejVar, e, i43Var, w9jVar, b1dVar2, hskVar, x9jVar, this);
                return lu3Var13;
            case 13:
                ebj ebjVar = (ebj) obj2;
                lu3 lu3Var14 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var3 = (ku3) this.t;
                    pog y = sea.y(new w1i(ebjVar, i5));
                    usf usfVar = new usf(10, ebjVar, ku3Var3);
                    this.s = 1;
                    if (y.collect(usfVar, this) == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i24 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    flb flbVar = (flb) this.t;
                    plb plbVar = (plb) ((xlb) obj2).getValue();
                    this.s = 1;
                    if (waa.p(flbVar, plbVar, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, this, 2044) == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i25 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    z88 H = hkg.H(sea.y(new jt7((a6e) this.t, 6)));
                    e7b e7bVar = new e7b((Function1) obj2, rq3Var, i3);
                    this.s = 1;
                    if (fcp.c0(H, e7bVar, this) == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 16:
                lu3 lu3Var17 = lu3.a;
                int i27 = this.s;
                if (i27 != 0) {
                    if (i27 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                koj kojVar = (koj) this.t;
                rnj rnjVar = (rnj) obj2;
                int i28 = rnjVar.a;
                int i29 = rnjVar.b;
                String str = rnjVar.d;
                this.s = 1;
                Object w2 = kojVar.w(i28, i29, this, str);
                return w2 == lu3Var17 ? lu3Var17 : w2;
            case 17:
                lu3 lu3Var18 = lu3.a;
                int i30 = this.s;
                if (i30 == 0) {
                    y6a.M(obj);
                    if (((Boolean) ((e1d) obj2).getValue()).booleanValue()) {
                        this.s = 1;
                        break;
                    }
                    return Unit.a;
                }
                if (i30 != 1) {
                    if (i30 == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                t32 t32Var = (t32) this.t;
                this.s = 2;
                break;
            case 18:
                lu3 lu3Var19 = lu3.a;
                int i31 = this.s;
                if (i31 != 0) {
                    if (i31 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                vrj vrjVar = ((uvj) this.t).c;
                int id = ((Category) obj2).getId();
                this.s = 1;
                vrjVar.getClass();
                Object P5 = yaa.P(new xr2(vrjVar, id, rq3Var, i4), this);
                return P5 == lu3Var19 ? lu3Var19 : P5;
            case 19:
                lu3 lu3Var20 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    vrj vrjVar2 = ((uvj) this.t).c;
                    this.s = 1;
                    vrjVar2.getClass();
                    P2 = yaa.P(new trj(vrjVar2, (String) obj2, rq3Var, i9), this);
                    if (P2 == lu3Var20) {
                        return lu3Var20;
                    }
                } else {
                    if (i32 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P2 = obj;
                }
                SearchTournamentsResponse searchTournamentsResponse = (SearchTournamentsResponse) yaa.x((x2g) P2);
                if (searchTournamentsResponse == null || (uniqueTournaments = searchTournamentsResponse.getUniqueTournaments()) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : uniqueTournaments) {
                    if (Intrinsics.c(((UniqueTournament) obj3).getCategory().getSport().getSlug(), Sports.FOOTBALL)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!t62.J(((UniqueTournament) next).getCategory())) {
                        arrayList2.add(next);
                    }
                }
                return CollectionsKt.S0(arrayList2);
            case 20:
                Function0 function0 = (Function0) obj2;
                lu3 lu3Var21 = lu3.a;
                int i33 = this.s;
                try {
                    if (i33 == 0) {
                        y6a.M(obj);
                        i1k i1kVar = (i1k) this.t;
                        this.s = 1;
                        c = i1kVar.c(this);
                        if (c == lu3Var21) {
                            return lu3Var21;
                        }
                    } else {
                        if (i33 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        c = obj;
                    }
                    function0.invoke();
                    return Unit.a;
                } catch (Throwable th) {
                    function0.invoke();
                    throw th;
                }
            case 21:
                u3k u3kVar2 = (u3k) obj2;
                lu3 lu3Var22 = lu3.a;
                int i34 = this.s;
                if (i34 == 0) {
                    y6a.M(obj);
                    if (u3kVar2.k.isEmpty()) {
                        nb8 s = zm2.s(u3kVar2.e.a.a, false, new String[]{"my_channels_table"}, new crj(16));
                        this.t = u3kVar2;
                        this.s = 1;
                        A = rd0.A(s, this);
                        if (A == lu3Var22) {
                            return lu3Var22;
                        }
                        u3kVar = u3kVar2;
                    }
                    ArrayList r = i5h.r(i5h.g(CollectionsKt.N(u3kVar2.p), new qdj(u3kVar2, 11)));
                    u3kVar2.m = r;
                    u3kVar2.n.j(r);
                    return Unit.a;
                }
                if (i34 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u3kVar = (u3k) this.t;
                y6a.M(obj);
                A = obj;
                List list = (List) A;
                u3kVar.k = list != null ? new ArrayList(list) : new ArrayList();
                ArrayList r2 = i5h.r(i5h.g(CollectionsKt.N(u3kVar2.p), new qdj(u3kVar2, 11)));
                u3kVar2.m = r2;
                u3kVar2.n.j(r2);
                return Unit.a;
            case 22:
                Country country = (Country) obj2;
                u3k u3kVar3 = (u3k) this.t;
                lu3 lu3Var23 = lu3.a;
                int i35 = this.s;
                if (i35 == 0) {
                    y6a.M(obj);
                    z3k z3kVar = u3kVar3.e;
                    String iso2Alpha = country.getIso2Alpha();
                    this.s = 1;
                    z3kVar.getClass();
                    P3 = yaa.P(new fzh(z3kVar, iso2Alpha, rq3Var, i7), this);
                    if (P3 == lu3Var23) {
                        return lu3Var23;
                    }
                } else {
                    if (i35 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P3 = obj;
                }
                x2g x2gVar = (x2g) P3;
                if (x2gVar instanceof v2g) {
                    lwj n = i5h.n(new a65(CollectionsKt.N(((TvChannelsResponse) ((v2g) x2gVar).a).getChannels()), new rs2(new t6j(19), 18), i8), new k1e(i6, new mwj(i7, country, u3kVar3)));
                    u3kVar3.i.j(i5h.q(n));
                    HashSet hashSet = new HashSet(u3kVar3.k);
                    List q = i5h.q(n);
                    if (!q.isEmpty()) {
                        hashSet.removeAll(q);
                    }
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        TvChannel tvChannel = (TvChannel) it2.next();
                        if (Intrinsics.c(tvChannel.getCountryCode(), country.getIso2Alpha())) {
                            u3kVar3.k(tvChannel, false);
                        }
                    }
                }
                return Unit.a;
            case 23:
                lu3 lu3Var24 = lu3.a;
                int i36 = this.s;
                if (i36 != 0) {
                    if (i36 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                z3k z3kVar2 = ((g4k) this.t).f;
                Integer num = (Integer) obj2;
                num.getClass();
                int intValue = num.intValue();
                this.s = 1;
                z3kVar2.getClass();
                Object P6 = yaa.P(new xr2(z3kVar2, intValue, rq3Var, i7), this);
                return P6 == lu3Var24 ? lu3Var24 : P6;
            case 24:
                g4k g4kVar = (g4k) this.t;
                a4k a4kVar = g4kVar.g;
                String str2 = (String) obj2;
                lu3 lu3Var25 = lu3.a;
                int i37 = this.s;
                if (i37 == 0) {
                    y6a.M(obj);
                    z3k z3kVar3 = g4kVar.f;
                    this.s = 1;
                    z3kVar3.getClass();
                    P4 = yaa.P(new fzh(z3kVar3, str2, rq3Var, i7), this);
                    if (P4 == lu3Var25) {
                        return lu3Var25;
                    }
                } else {
                    if (i37 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P4 = obj;
                }
                TvChannelsResponse tvChannelsResponse = (TvChannelsResponse) yaa.x((x2g) P4);
                if (tvChannelsResponse == null || (channels = tvChannelsResponse.getChannels()) == null) {
                    return km5.a;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                a4kVar.getClass();
                str2.getClass();
                Set set = (Set) a4kVar.a().get(str2);
                if (set == null) {
                    set = rm5.a;
                }
                for (TvChannel tvChannel2 : channels) {
                    tvChannel2.setCountryCode(str2);
                    arrayList4.add(tvChannel2);
                    if (!set.isEmpty() && !set.contains(new Integer(tvChannel2.getId()))) {
                        arrayList3.add(tvChannel2);
                    }
                }
                a4kVar.c(str2, arrayList4);
                return arrayList3;
            case 25:
                Object obj4 = this.t;
                lu3 lu3Var26 = lu3.a;
                int i38 = this.s;
                if (i38 == 0) {
                    y6a.M(obj);
                    this.t = null;
                    this.s = 1;
                    if (((b98) obj2).emit(obj4, this) == lu3Var26) {
                        return lu3Var26;
                    }
                } else {
                    if (i38 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 26:
                lu3 lu3Var27 = lu3.a;
                int i39 = this.s;
                if (i39 == 0) {
                    y6a.M(obj);
                    xdk xdkVar2 = (xdk) obj2;
                    s96 s96Var = xdkVar2.f;
                    this.t = xdkVar2;
                    this.s = 1;
                    w = s96Var.w(Sports.FOOTBALL, this);
                    if (w == lu3Var27) {
                        return lu3Var27;
                    }
                    xdkVar = xdkVar2;
                } else {
                    if (i39 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdkVar = (xdk) this.t;
                    y6a.M(obj);
                    w = obj;
                }
                xdkVar.l = (AiAnalystDemoEvent) w;
                return Unit.a;
            case 27:
                eli eliVar = (eli) this.t;
                lu3 lu3Var28 = lu3.a;
                int i40 = this.s;
                if (i40 == 0) {
                    y6a.M(obj);
                    if ((eliVar == null ? -1 : xfk.a[eliVar.ordinal()]) == 1) {
                        agk agkVar = (agk) obj2;
                        aeh aehVar = agkVar.u;
                        AiAnalystDemoEvent aiAnalystDemoEvent = agkVar.q;
                        this.t = null;
                        this.s = 1;
                        if (aehVar.emit(aiAnalystDemoEvent, this) == lu3Var28) {
                            return lu3Var28;
                        }
                    }
                } else {
                    if (i40 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 28:
                rlk rlkVar = (rlk) obj2;
                lu3 lu3Var29 = lu3.a;
                int i41 = this.s;
                if (i41 == 0) {
                    y6a.M(obj);
                    ku3Var = (ku3) this.t;
                } else {
                    if (i41 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ku3Var = (ku3) this.t;
                    y6a.M(obj);
                }
                while (s9a.w(ku3Var)) {
                    rlkVar.a();
                    long j = rlkVar.r;
                    List<pkk> list2 = rlkVar.f;
                    if (j <= 0) {
                        for (pkk pkkVar : list2) {
                            olk olkVar = rlkVar.d;
                            pkkVar.getClass();
                            olkVar.getClass();
                        }
                    } else {
                        for (pkk pkkVar2 : list2) {
                            long j2 = rlkVar.s;
                            long j3 = rlkVar.r;
                            float f2 = j2 / j3;
                            ProgressBar progressBar = pkkVar2.l;
                            progressBar.setProgress((int) (100.0f * f2));
                            if (j3 != C.TIME_UNSET) {
                                progressBar.setVisibility(0);
                            }
                            if (f2 >= 0.25f) {
                                pkkVar2.n(zf.f);
                            }
                            if (f2 >= 0.5f) {
                                pkkVar2.n(zf.g);
                            }
                            if (f2 >= 0.75f) {
                                pkkVar2.n(zf.h);
                            }
                        }
                    }
                    this.t = ku3Var;
                    this.s = 1;
                    if (n4o.y(200L, this) == lu3Var29) {
                        return lu3Var29;
                    }
                }
                return Unit.a;
            default:
                lu3 lu3Var30 = lu3.a;
                int i42 = this.s;
                if (i42 == 0) {
                    y6a.M(obj);
                    if (!((jxk) this.t).d.isEmpty()) {
                        qug qugVar = (qug) obj2;
                        int h = qugVar.e.h();
                        this.s = 1;
                        if (qugVar.f(h, new g0i(null, 7), this) == lu3Var30) {
                            return lu3Var30;
                        }
                    }
                } else {
                    if (i42 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vki(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vki(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
    }
}
