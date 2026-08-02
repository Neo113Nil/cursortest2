package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import com.adsbynimbus.google.NimbusCustomEventBanner;
import com.sofascore.model.fantasy.FantasyLeagueGameType;
import com.sofascore.model.fantasy.FantasyUserLeague;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.Head2HeadResponse;
import com.sofascore.model.network.response.TeamStreaksResponse;
import com.sofascore.model.newNetwork.DailyStages;
import com.sofascore.model.newNetwork.MonthlyStages;
import com.sofascore.model.newNetwork.MonthlyUniqueTournamentItem;
import com.sofascore.model.newNetwork.MonthlyUniqueTournamentsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.profile.CrowdsourcingAggregates;
import com.sofascore.model.profile.EditorAggregates;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.model.profile.UserBadgesResponse;
import com.sofascore.model.profile.VoteRankingResponse;
import com.sofascore.model.profile.VoteStatisticsWrapper;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.details.compose.totr.share.TeamOfTheRoundShareBottomSheet;
import com.sofascore.results.league.fragment.details.compose.totr.share.TotrSharePayload;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h10 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h10(qze qzeVar, ct8 ct8Var, Function1 function1, j6f j6fVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 28;
        this.u = qzeVar;
        this.w = ct8Var;
        this.v = function1;
        this.x = j6fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0115, code lost:
    
        if (r9 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0134, code lost:
    
        if ((r8 != null ? r8.getScore() : 0.0f) == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0164, code lost:
    
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0162, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0149, code lost:
    
        if ((r8 != null ? r8.getScore() : 0.0f) == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0160, code lost:
    
        if (((r8 == null || (r8 = r8.getCurrent()) == null) ? 0.0f : r8.getRoi()) == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0072, code lost:
    
        if (r14 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a7 A[LOOP:0: B:13:0x00a7->B:19:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8 A[LOOP:1: B:20:0x00b8->B:44:?, LOOP_START] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        av4 t;
        av4 t2;
        VoteRankingResponse voteRankingResponse;
        boolean c;
        Object value;
        b7 b7Var;
        ProfileData profileData;
        qbf T;
        ProfileData profileData2;
        List<ProfileData> ranking;
        Object obj2;
        List<ProfileData> ranking2;
        Object value2;
        List<ProfileData> ranking3;
        gta gtaVar = (gta) this.w;
        sbf sbfVar = (sbf) this.x;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        int i2 = 2;
        int i3 = 1;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            int ordinal = gtaVar.ordinal();
            int i4 = 3;
            if (ordinal == 0) {
                t = xw3.t(ku3Var, null, new rbf(sbfVar, rq3Var, i3), 3);
            } else if (ordinal == 1) {
                t = xw3.t(ku3Var, null, new rbf(sbfVar, rq3Var, i2), 3);
            } else {
                if (ordinal != 2) {
                    zzl.b();
                    return null;
                }
                t = xw3.t(ku3Var, null, new rbf(sbfVar, rq3Var, i4), 3);
            }
            t2 = xw3.t(ku3Var, null, new rbf(sbfVar, rq3Var, 0), 3);
            this.t = null;
            this.u = t2;
            this.s = 1;
            obj = t.w(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                voteRankingResponse = (VoteRankingResponse) this.v;
                y6a.M(obj);
                ProfileData profileData3 = (ProfileData) obj;
                c = Intrinsics.c((voteRankingResponse != null || (ranking3 = voteRankingResponse.getRanking()) == null) ? null : Boolean.valueOf(ranking3.isEmpty()), Boolean.TRUE);
                fdi fdiVar = sbfVar.g;
                if (c) {
                    do {
                        value = fdiVar.getValue();
                        if (voteRankingResponse == null || (ranking2 = voteRankingResponse.getRanking()) == null || (b7Var = l6g.a0(i5h.n(new oh0(ranking2, 1), new aaf(i2, sbfVar, gtaVar)))) == null) {
                            b7Var = rlh.b;
                        }
                        if ((profileData3 != null ? profileData3.getId() : null) != null) {
                            if (voteRankingResponse == null || (ranking = voteRankingResponse.getRanking()) == null) {
                                profileData2 = null;
                            } else {
                                Iterator<T> it = ranking.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it.next();
                                    if (Intrinsics.c(((ProfileData) obj2).getId(), profileData3.getId())) {
                                        break;
                                    }
                                }
                                profileData2 = (ProfileData) obj2;
                            }
                        }
                        if (profileData3 != null) {
                            int ordinal2 = gtaVar.ordinal();
                            if (ordinal2 == 0) {
                                VoteStatisticsWrapper voteStatistics = profileData3.getVoteStatistics();
                            } else if (ordinal2 == 1) {
                                CrowdsourcingAggregates userCrowdsourcingAggregates = profileData3.getUserCrowdsourcingAggregates();
                            } else {
                                if (ordinal2 != 2) {
                                    zzl.b();
                                    return null;
                                }
                                EditorAggregates userEditorScoreAggregates = profileData3.getUserEditorScoreAggregates();
                            }
                            if (profileData != null) {
                                T = cga.T(profileData, sbfVar.k, gtaVar);
                            }
                        }
                        T = null;
                    } while (!fdiVar.k(value, new obf(b7Var, T)));
                } else {
                    do {
                        value2 = fdiVar.getValue();
                    } while (!fdiVar.k(value2, nbf.a));
                }
                return Unit.a;
            }
            t2 = (av4) this.u;
            y6a.M(obj);
        }
        VoteRankingResponse voteRankingResponse2 = (VoteRankingResponse) obj;
        this.t = null;
        this.u = null;
        this.v = voteRankingResponse2;
        this.s = 2;
        Object T2 = t2.T(this);
        if (T2 != lu3Var) {
            obj = T2;
            voteRankingResponse = voteRankingResponse2;
            ProfileData profileData32 = (ProfileData) obj;
            c = Intrinsics.c((voteRankingResponse != null || (ranking3 = voteRankingResponse.getRanking()) == null) ? null : Boolean.valueOf(ranking3.isEmpty()), Boolean.TRUE);
            fdi fdiVar2 = sbfVar.g;
            if (c) {
            }
            return Unit.a;
        }
        return lu3Var;
    }

    private final Object f(Object obj) {
        koh kohVar = (koh) this.v;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            long longValue = ((Number) ((Function0) this.u).invoke()).longValue() - 200;
            this.t = ku3Var;
            this.s = 1;
            if (n4o.y(longValue, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        rq3 rq3Var = null;
        xw3.L(ku3Var, null, null, new ppa(kohVar, rq3Var, 28), 3);
        for (RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant : (gv9) ((cdi) this.w).getValue()) {
            if (!raceFlowModels$RaceEntrant.g) {
                q50 q50Var = (q50) kohVar.get("number_circle_alpha_" + raceFlowModels$RaceEntrant.a);
                if (q50Var != null) {
                    xw3.L(ku3Var, null, null, new v1f(raceFlowModels$RaceEntrant, q50Var, (e1d) this.x, rq3Var, 3), 3);
                }
            }
        }
        return Unit.a;
    }

    private final Object g(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        nt9 nt9Var = (nt9) this.t;
        i5d i5dVar = new i5d(nt9Var, ((apf) this.u).d.a, 0, nt9Var, (kjh) this.v, (f7a) this.w, ((nr9) this.x) != null);
        this.s = 1;
        Object f = i5dVar.f(this);
        return f == lu3Var ? lu3Var : f;
    }

    private final Object h(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        ot9 ot9Var = (ot9) this.t;
        i5d i5dVar = new i5d(ot9Var, ((bpf) this.u).h, 0, ot9Var, (jjh) this.v, (e26) this.w, ((Bitmap) this.x) != null);
        this.s = 1;
        Object g = i5dVar.g(ot9Var, this);
        return g == lu3Var ? lu3Var : g;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(Object obj) {
        yda x;
        fdi fdiVar;
        cfe cfeVar;
        cfe cfeVar2;
        imf imfVar;
        Throwable th;
        List H;
        fqf fqfVar;
        kqf kqfVar;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            x = bea.x(((ku3) this.t).getCoroutineContext());
            kqf kqfVar2 = (kqf) this.v;
            fdi fdiVar2 = kqf.A;
            synchronized (kqfVar2.d) {
                try {
                    Throwable th2 = kqfVar2.f;
                    if (th2 != null) {
                        throw th2;
                    }
                    if (((iqf) kqfVar2.v.getValue()).compareTo(iqf.b) <= 0) {
                        throw new IllegalStateException("Recomposer shut down");
                    }
                    if (kqfVar2.e != null) {
                        throw new IllegalStateException("Recomposer already running");
                    }
                    kqfVar2.e = x;
                    if (kqfVar2.C() != null) {
                        sf3.a("called outside of runRecomposeAndApplyChanges");
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            t1d t1dVar = new t1d((kqf) this.v, 24);
            snh.b(snh.a);
            synchronized (snh.c) {
                snh.h = CollectionsKt.x0(snh.h, t1dVar);
            }
            imf imfVar2 = new imf(t1dVar, 11);
            wje wjeVar = ((kqf) this.v).z;
            try {
                do {
                    fdiVar = kqf.A;
                    cfeVar = (cfe) fdiVar.getValue();
                    it7 it7Var = it7.k;
                    cee ceeVar = cfeVar.d;
                    if (ceeVar.containsKey(wjeVar)) {
                        cfeVar2 = cfeVar;
                    } else if (cfeVar.isEmpty()) {
                        cfeVar2 = new cfe(wjeVar, wjeVar, ceeVar.i(wjeVar, new qbb(it7Var, it7Var)));
                    } else {
                        Object obj2 = cfeVar.c;
                        Object obj3 = ceeVar.get(obj2);
                        obj3.getClass();
                        cfeVar2 = new cfe(cfeVar.b, wjeVar, ceeVar.i(obj2, new qbb(((qbb) obj3).a, wjeVar)).i(wjeVar, new qbb(obj2, it7Var)));
                    }
                    if (cfeVar != cfeVar2) {
                    }
                    break;
                } while (!fdiVar.k(cfeVar, cfeVar2));
                break;
                kqf kqfVar3 = (kqf) this.v;
                synchronized (kqfVar3.d) {
                    H = kqfVar3.H();
                }
                int size = H.size();
                for (int i2 = 0; i2 < size; i2++) {
                    for (Object obj4 : ((sg3) H.get(i2)).f.c) {
                        eqf eqfVar = obj4 instanceof eqf ? (eqf) obj4 : null;
                        if (eqfVar != null && (fqfVar = eqfVar.a) != null) {
                            fqfVar.f(eqfVar, null);
                        }
                    }
                }
                v1f v1fVar = new v1f((jqf) this.w, (wuc) this.x, rq3Var, 6);
                this.t = x;
                this.u = imfVar2;
                this.s = 1;
                if (s9a.r(v1fVar, this) == lu3Var) {
                    return lu3Var;
                }
                imfVar = imfVar2;
            } catch (Throwable th4) {
                imfVar = imfVar2;
                th = th4;
                imfVar.f();
                kqfVar = (kqf) this.v;
                synchronized (kqfVar.d) {
                    try {
                        if (kqfVar.e == x) {
                            kqfVar.e = null;
                        }
                        if (kqfVar.C() != null) {
                            sf3.a("called outside of runRecomposeAndApplyChanges");
                        }
                        Unit unit2 = Unit.a;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                fdi fdiVar3 = kqf.A;
                nq8.J(((kqf) this.v).z);
                throw th;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            imfVar = (imf) this.u;
            x = (yda) this.t;
            try {
                y6a.M(obj);
            } catch (Throwable th6) {
                th = th6;
                imfVar.f();
                kqfVar = (kqf) this.v;
                synchronized (kqfVar.d) {
                }
            }
        }
        imfVar.f();
        kqf kqfVar4 = (kqf) this.v;
        synchronized (kqfVar4.d) {
            try {
                if (kqfVar4.e == x) {
                    kqfVar4.e = null;
                }
                if (kqfVar4.C() != null) {
                    sf3.a("called outside of runRecomposeAndApplyChanges");
                }
                Unit unit3 = Unit.a;
            } catch (Throwable th7) {
                throw th7;
            }
        }
        fdi fdiVar4 = kqf.A;
        nq8.J(((kqf) this.v).z);
        return Unit.a;
    }

    private final Object k(Object obj) {
        Object u2gVar;
        vcd vcdVar = (vcd) this.x;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        try {
            if (i == 0) {
                y6a.M(obj);
                jcd jcdVar = (jcd) this.u;
                Context context = (Context) this.v;
                ucd ucdVar = (ucd) this.w;
                p2g p2gVar = w2g.b;
                this.s = 1;
                obj = jcdVar.a(context, ucdVar, this);
                if (obj == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
            u2gVar = (wcd) obj;
            p2g p2gVar2 = w2g.b;
        } catch (Throwable th) {
            p2g p2gVar3 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (!(u2gVar instanceof u2g)) {
            vcdVar.onAdResponse((wcd) u2gVar);
        }
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            pcd pcdVar = (pcd) vcdVar;
            qcd qcdVar = a instanceof qcd ? (qcd) a : null;
            if (qcdVar == null) {
                rod rodVar = i0g.a;
                String message = a.getMessage();
                if (message == null) {
                    message = "Error sending request to Nimbus";
                }
                qcdVar = new qcd(3, message, a);
            }
            pcdVar.onError(qcdVar);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r13 == r2) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object l(Object obj) {
        zjg zjgVar;
        hbg hbgVar = (hbg) this.v;
        ebg ebgVar = (ebg) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            y3g y3gVar = ebgVar.d;
            hbgVar.getClass();
            this.s = 1;
            obj = y3gVar.s(415167L, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zjg zjgVar2 = (zjg) this.t;
                y6a.M(obj);
                zjgVar = zjgVar2;
                ebg ebgVar2 = (ebg) this.u;
                hbg hbgVar2 = (hbg) this.v;
                Class cls = (Class) this.x;
                this.t = null;
                this.s = 3;
                Object b = ebgVar2.b(hbgVar2, (rbg) obj, cls, zjgVar, this);
                return b != lu3Var ? lu3Var : b;
            }
            y6a.M(obj);
        }
        zjg zjgVar3 = (zjg) obj;
        List list = (List) this.w;
        this.t = zjgVar3;
        this.s = 2;
        Object a = ebgVar.a(hbgVar, list, zjgVar3, this);
        if (a != lu3Var) {
            zjgVar = zjgVar3;
            obj = a;
            ebg ebgVar22 = (ebg) this.u;
            hbg hbgVar22 = (hbg) this.v;
            Class cls2 = (Class) this.x;
            this.t = null;
            this.s = 3;
            Object b2 = ebgVar22.b(hbgVar22, (rbg) obj, cls2, zjgVar, this);
            if (b2 != lu3Var) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0181, code lost:
    
        if (r3.W(r25) == r4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c6, code lost:
    
        if (r3.d0(r25) == r4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bc, code lost:
    
        if (r1 == r4) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m(Object obj) {
        j2d j2dVar;
        o0h o0hVar;
        Object R;
        e1d e1dVar;
        float f;
        h0h h0hVar;
        float f2;
        axj axjVar = (axj) this.x;
        Object obj2 = this.t;
        o0h o0hVar2 = (o0h) this.w;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        try {
            if (i == 0) {
                y6a.M(obj);
                Object value = ((eoh) o0hVar2.c).getValue();
                if (!Intrinsics.c(obj2, value)) {
                    o0hVar2.U();
                    o0hVar2.Z(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    axjVar.r(obj2);
                    axjVar.p(0L);
                    o0hVar2.I(value);
                    ((eoh) o0hVar2.c).setValue(obj2);
                }
                j2dVar = o0hVar2.l;
                this.u = j2dVar;
                this.v = o0hVar2;
                this.s = 1;
                if (j2dVar.e(this) != lu3Var) {
                    o0hVar = o0hVar2;
                }
                return lu3Var;
            }
            if (i == 1) {
                o0hVar = (o0h) this.v;
                j2dVar = (j2d) this.u;
                y6a.M(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                            f2 = 0.0f;
                            o0hVar2.Z(f2);
                            return Unit.a;
                        }
                        y6a.M(obj);
                        f = 0.0f;
                        o0hVar2.I(obj2);
                        this.s = 5;
                        if (o0hVar2.c0(this) != lu3Var) {
                            f2 = f;
                            o0hVar2.Z(f2);
                            return Unit.a;
                        }
                        return lu3Var;
                    }
                    y6a.M(obj);
                    e1dVar = o0hVar2.d;
                    xnh xnhVar = o0hVar2.j;
                    if (!Intrinsics.c(((eoh) e1dVar).getValue(), obj2)) {
                        if (xnhVar.h() >= 1.0f || ((h0hVar = o0hVar2.p) != null && Intrinsics.c(null, h0hVar.b))) {
                            f = 0.0f;
                        } else {
                            qmk qmkVar = h0hVar != null ? h0hVar.b : null;
                            f80 f80Var = o0h.t;
                            if (qmkVar != null) {
                                long j = h0hVar.a;
                                f80 f80Var2 = h0hVar.e;
                                f = 0.0f;
                                f80 f80Var3 = h0hVar.f;
                                f80Var = (f80) qmkVar.u(j, f80Var2, o0h.u, f80Var3 == null ? f80Var : f80Var3);
                            } else {
                                f = 0.0f;
                                if (h0hVar != null && h0hVar.a != 0) {
                                    long j2 = h0hVar.g;
                                    if (j2 == Long.MIN_VALUE) {
                                        j2 = o0hVar2.g;
                                    }
                                    float f3 = j2 / 1.0E9f;
                                    if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        f80Var = new f80(1.0f / f3);
                                    }
                                }
                            }
                            if (h0hVar == null) {
                                h0hVar = new h0h();
                            }
                            f80 f80Var4 = h0hVar.e;
                            h0hVar.b = null;
                            h0hVar.c = false;
                            h0hVar.d = xnhVar.h();
                            f80Var4.e(xnhVar.h(), 0);
                            long j3 = o0hVar2.g;
                            h0hVar.g = j3;
                            h0hVar.a = 0L;
                            h0hVar.f = f80Var;
                            h0hVar.h = wzb.c((1.0d - xnhVar.h()) * j3);
                            o0hVar2.p = h0hVar;
                        }
                        this.u = null;
                        this.v = null;
                        this.s = 4;
                    }
                    return Unit.a;
                }
                y6a.M(obj);
                this.s = 3;
            }
            Object obj3 = o0hVar.e;
            j2dVar.f(null);
            if (!Intrinsics.c(obj2, obj3)) {
                this.u = null;
                this.v = null;
                this.s = 2;
                if (o0hVar2.n == Long.MIN_VALUE) {
                    R = bea.y(getContext()).p(o0hVar2.q, this);
                    if (R != lu3Var) {
                        R = Unit.a;
                    }
                } else {
                    R = o0hVar2.R(this);
                    if (R != lu3Var) {
                        R = Unit.a;
                    }
                }
            }
            e1dVar = o0hVar2.d;
            xnh xnhVar2 = o0hVar2.j;
            if (!Intrinsics.c(((eoh) e1dVar).getValue(), obj2)) {
            }
            return Unit.a;
        } catch (Throwable th) {
            j2dVar.f(null);
            throw th;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:11:0x003d, B:12:0x0081, B:14:0x0070, B:18:0x008b, B:23:0x0022), top: B:2:0x000c }] */
    /* JADX WARN: Type inference failed for: r11v2, types: [t01] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [ln2] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, ln2] */
    /* JADX WARN: Type inference failed for: r5v9, types: [ln2] */
    /* JADX WARN: Type inference failed for: r7v1, types: [by9] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [by9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [by9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0089 -> B:14:0x0070). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009c -> B:14:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Object n(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.x
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            lu3 r1 = defpackage.lu3.a
            int r2 = r10.s
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L41
            if (r2 == r5) goto L14
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L29
        L14:
            java.lang.Object r2 = r10.t
            java.lang.Object r5 = r10.v
            ln2 r5 = (defpackage.ln2) r5
            java.lang.Object r7 = r10.u
            by9 r7 = (defpackage.by9) r7
            java.lang.Object r8 = r10.w
            b98 r8 = (defpackage.b98) r8
            defpackage.y6a.M(r11)     // Catch: java.lang.Throwable -> L26
            goto L70
        L26:
            r10 = move-exception
            goto La0
        L29:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.a70.r(r10)
            return r6
        L2f:
            java.lang.Object r2 = r10.t
            java.lang.Object r5 = r10.v
            ln2 r5 = (defpackage.ln2) r5
            java.lang.Object r7 = r10.u
            by9 r7 = (defpackage.by9) r7
            java.lang.Object r8 = r10.w
            b98 r8 = (defpackage.b98) r8
            defpackage.y6a.M(r11)     // Catch: java.lang.Throwable -> L26
            goto L81
        L41:
            defpackage.y6a.M(r11)
            java.lang.Object r11 = r10.w
            r8 = r11
            b98 r8 = (defpackage.b98) r8
            by9 r7 = new by9
            r7.<init>()
            vih r11 = new vih
            r11.<init>()
            r7.a = r11
            r11 = 6
            g62 r11 = defpackage.ml4.g(r5, r11, r6)
            java.lang.Object r2 = r7.z(r11, r0)     // Catch: java.lang.Throwable -> L9e
            r10.w = r8     // Catch: java.lang.Throwable -> L9e
            r10.u = r7     // Catch: java.lang.Throwable -> L9e
            r10.v = r11     // Catch: java.lang.Throwable -> L9e
            r10.t = r2     // Catch: java.lang.Throwable -> L9e
            r10.s = r5     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r5 = r8.emit(r2, r10)     // Catch: java.lang.Throwable -> L9e
            if (r5 != r1) goto L6f
            goto L9b
        L6f:
            r5 = r11
        L70:
            r10.w = r8     // Catch: java.lang.Throwable -> L26
            r10.u = r7     // Catch: java.lang.Throwable -> L26
            r10.v = r5     // Catch: java.lang.Throwable -> L26
            r10.t = r2     // Catch: java.lang.Throwable -> L26
            r10.s = r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r11 = r5.f(r10)     // Catch: java.lang.Throwable -> L26
            if (r11 != r1) goto L81
            goto L9b
        L81:
            java.lang.Object r11 = r7.z(r5, r0)     // Catch: java.lang.Throwable -> L26
            boolean r9 = kotlin.jvm.internal.Intrinsics.c(r11, r2)     // Catch: java.lang.Throwable -> L26
            if (r9 != 0) goto L70
            r10.w = r8     // Catch: java.lang.Throwable -> L26
            r10.u = r7     // Catch: java.lang.Throwable -> L26
            r10.v = r5     // Catch: java.lang.Throwable -> L26
            r10.t = r11     // Catch: java.lang.Throwable -> L26
            r10.s = r3     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r8.emit(r11, r10)     // Catch: java.lang.Throwable -> L26
            if (r2 != r1) goto L9c
        L9b:
            return r1
        L9c:
            r2 = r11
            goto L70
        L9e:
            r10 = move-exception
            r5 = r11
        La0:
            java.lang.Object r11 = r7.a
            t01 r11 = (defpackage.t01) r11
            if (r11 == 0) goto La9
            r11.H(r5)
        La9:
            java.lang.Object r11 = r7.a
            t01 r11 = (defpackage.t01) r11
            if (r11 == 0) goto Lb0
            goto Lb5
        Lb0:
            java.lang.String r0 = "Called dispose on a manager that has been disposed of"
            defpackage.h3f.b(r0)
        Lb5:
            r11.q()
            r7.a = r6
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h10.n(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            if (((Boolean) ((e1d) this.u).getValue()).booleanValue()) {
                gv9 gv9Var = (gv9) this.t;
                oxh oxhVar = (oxh) this.v;
                gv9Var.getClass();
                Iterator<E> it = gv9Var.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    Object next = it.next();
                    if (i2 < 0) {
                        b.q();
                        throw null;
                    }
                    if (Intrinsics.c(((oxh) next).a, oxhVar != null ? oxhVar.a : null)) {
                        break;
                    }
                    i2++;
                }
                Integer valueOf = i2 != -1 ? Integer.valueOf(i2) : null;
                if (valueOf != null) {
                    kx4 kx4Var = (kx4) this.w;
                    qug qugVar = (qug) this.x;
                    int e0 = kx4Var.e0(48.0f) * valueOf.intValue();
                    this.s = 1;
                    if (v8a.G(qugVar, e0 - qugVar.a.h(), this) == lu3Var) {
                        return lu3Var;
                    }
                }
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    private final Object p(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) this.t;
            qze qzeVar = (qze) this.u;
            z85 z85Var = new z85(ku3Var, (ct8) this.w, (Function1) this.v, (j6f) this.x, (rq3) null, 3);
            this.s = 1;
            if (oyn.s(qzeVar, z85Var, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.x;
        switch (i) {
            case 0:
                h10 h10Var = new h10((j20) this.u, (Function1) this.v, (i10) this.w, (k5b) obj2, rq3Var, 0);
                h10Var.t = obj;
                return h10Var;
            case 1:
                return new h10((fsf) this.u, (n29) this.v, (Context) this.w, (Function0) obj2, rq3Var, 1);
            case 2:
                return new h10((q5b) this.t, (e1d) this.u, (gdj) this.v, (tbj) this.w, (qu9) obj2, rq3Var, 2);
            case 3:
                return new h10((t32) this.t, (wcj) this.u, (q5b) this.v, (bej) this.w, (nnd) obj2, rq3Var, 3);
            case 4:
                h10 h10Var2 = new h10((ai4) this.w, (List) obj2, rq3Var, 4);
                h10Var2.v = obj;
                return h10Var2;
            case 5:
                h10 h10Var3 = new h10((av4) this.v, (Event) this.w, (mr5) obj2, rq3Var, 5);
                h10Var3.t = obj;
                return h10Var3;
            case 6:
                h10 h10Var4 = new h10((dz5) this.w, (Event) obj2, rq3Var, 6);
                h10Var4.t = obj;
                return h10Var4;
            case 7:
                h10 h10Var5 = new h10((l66) obj2, rq3Var, 7);
                h10Var5.t = obj;
                return h10Var5;
            case 8:
                h10 h10Var6 = new h10((bc6) this.w, (Event) obj2, rq3Var, 8);
                h10Var6.t = obj;
                return h10Var6;
            case 9:
                h10 h10Var7 = new h10((mv6) this.u, (String) this.v, (String) this.w, (FantasyLeagueGameType) obj2, rq3Var, 9);
                h10Var7.t = obj;
                return h10Var7;
            case 10:
                h10 h10Var8 = new h10((ia7) this.u, (String) this.v, (String) this.w, (FantasyLeagueGameType) obj2, rq3Var, 10);
                h10Var8.t = obj;
                return h10Var8;
            case 11:
                h10 h10Var9 = new h10((q50) this.v, (q50) this.w, (e1d) obj2, rq3Var, 11);
                h10Var9.t = obj;
                return h10Var9;
            case 12:
                return new h10((zqb) this.v, (Calendar) this.w, (String) obj2, rq3Var, 12);
            case 13:
                h10 h10Var10 = new h10((MediaPost) this.w, (u8c) obj2, rq3Var, 13);
                h10Var10.t = obj;
                return h10Var10;
            case 14:
                h10 h10Var11 = new h10((oe3) this.u, (e1d) this.v, (xnh) this.w, (e1d) obj2, rq3Var, 14);
                h10Var11.t = obj;
                return h10Var11;
            case 15:
                h10 h10Var12 = new h10((ucd) this.u, (jcd) this.v, (FrameLayout) this.w, (NimbusCustomEventBanner) obj2, rq3Var, 15);
                h10Var12.t = obj;
                return h10Var12;
            case 16:
                return new h10((ple) this.t, (UniqueTournament) this.u, (String) this.v, (String) this.w, (String) obj2, rq3Var, 16);
            case 17:
                h10 h10Var13 = new h10((f9f) obj2, rq3Var, 17);
                h10Var13.t = obj;
                return h10Var13;
            case 18:
                h10 h10Var14 = new h10((gta) this.w, (sbf) obj2, rq3Var, 18);
                h10Var14.t = obj;
                return h10Var14;
            case 19:
                h10 h10Var15 = new h10((Function0) this.u, (koh) this.v, (cdi) this.w, (e1d) obj2, rq3Var, 19);
                h10Var15.t = obj;
                return h10Var15;
            case 20:
                return new h10((nt9) this.t, (apf) this.u, (kjh) this.v, (f7a) this.w, (nr9) obj2, rq3Var, 20);
            case 21:
                return new h10((ot9) this.t, (bpf) this.u, (jjh) this.v, (e26) this.w, (Bitmap) obj2, rq3Var, 21);
            case 22:
                h10 h10Var16 = new h10((kqf) this.v, (jqf) this.w, (wuc) obj2, rq3Var, 22);
                h10Var16.t = obj;
                return h10Var16;
            case 23:
                h10 h10Var17 = new h10((jcd) this.u, (Context) this.v, (ucd) this.w, (vcd) obj2, rq3Var, 23);
                h10Var17.t = obj;
                return h10Var17;
            case 24:
                return new h10((ebg) this.u, (hbg) this.v, (List) this.w, (Class) obj2, rq3Var, 24);
            case 25:
                return new h10((o0h) this.w, this.t, (axj) obj2, rq3Var);
            case 26:
                h10 h10Var18 = new h10((Function0) obj2, rq3Var, 26);
                h10Var18.w = obj;
                return h10Var18;
            case 27:
                return new h10((gv9) this.t, (e1d) this.u, (oxh) this.v, (kx4) this.w, (qug) obj2, rq3Var, 27);
            case 28:
                h10 h10Var19 = new h10((qze) this.u, (ct8) this.w, (Function1) this.v, (j6f) obj2, rq3Var);
                h10Var19.t = obj;
                return h10Var19;
            default:
                return new h10((Context) this.t, (Bitmap) this.u, (TotrSharePayload) this.v, (String) this.w, (TeamOfTheRoundShareBottomSheet) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((h10) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 26:
                ((h10) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((h10) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x025c, code lost:
    
        if (r5.collect(r0, r23) == r3) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03ae, code lost:
    
        if (r2 != r3) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x037a, code lost:
    
        if (r1 == r3) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x033e, code lost:
    
        if (r2 == r3) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x05a4, code lost:
    
        if (r0.f(r23, r1) == r8) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x057b, code lost:
    
        if (defpackage.n4o.y(600, r23) == r8) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x056c, code lost:
    
        if (defpackage.q50.a(r0, r1, r2, null, r23, 12) == r8) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x054c, code lost:
    
        if (r0.T(r23) == r8) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x053f, code lost:
    
        if (r2.w(r23) == r8) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0592, code lost:
    
        if (r5.f(r23, r1) == r8) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x061d, code lost:
    
        if (r0.emit(defpackage.ba7.a, r23) == r1) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0606, code lost:
    
        if (r0 == r1) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x06d2, code lost:
    
        if (r0.emit(r3, r23) == r2) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x06bc, code lost:
    
        if (r1 == r2) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x077d, code lost:
    
        if (r0 == r2) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0757, code lost:
    
        if (r0 == r2) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0746, code lost:
    
        if (r1 == r2) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0834, code lost:
    
        if (r0 == r3) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x08c9, code lost:
    
        if (r0 == r3) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x08b2, code lost:
    
        if (r1 == r3) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0983, code lost:
    
        if (((java.lang.Boolean) r0).booleanValue() != false) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0979, code lost:
    
        if (r0 == r2) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0964, code lost:
    
        if (r1 == r2) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x091d, code lost:
    
        if (r3 == r2) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x09e8, code lost:
    
        if (r0 == r2) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x09d9, code lost:
    
        if (r1 == r2) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0b1b, code lost:
    
        if (r2.L(r3, r0, r5, r23) == r1) goto L463;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04b7 A[LOOP:3: B:208:0x04b1->B:210:0x04b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x046f A[LOOP:4: B:224:0x0469->B:226:0x046f, LOOP_END] */
    /* JADX WARN: Type inference failed for: r14v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r14v13, types: [com.sofascore.model.network.response.Duel] */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r1v81, types: [zu4] */
    /* JADX WARN: Type inference failed for: r2v94, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object i;
        fsf fsfVar;
        long a;
        oqf oqfVar;
        av4 t;
        Object w;
        Object T;
        Object w2;
        av4 t2;
        Object w3;
        Object T2;
        av4 t3;
        Object w4;
        TeamStreaksResponse teamStreaksResponse;
        Object T3;
        String str;
        Object w5;
        OddsCountryProvider oddsCountryProvider;
        av4 av4Var;
        gv9 gv9Var;
        Object T4;
        av4 t4;
        Object w6;
        x2g x2gVar;
        Object T5;
        Object R;
        Object value;
        Object e0;
        Object value2;
        Object e02;
        Object value3;
        ha7 ha7Var;
        av4 t5;
        String format;
        Object a2;
        LinkedHashMap linkedHashMap;
        Object v;
        MonthlyStages monthlyStages;
        List<DailyStages> dailyStages;
        MonthlyUniqueTournamentsResponse monthlyUniqueTournamentsResponse;
        List<MonthlyUniqueTournamentItem> dailyUniqueTournaments;
        av4 t6;
        Object u;
        Object u2;
        gv9 gv9Var2;
        Object T6;
        d6d d6dVar;
        Object u2gVar;
        Object a3;
        Object w7;
        av4 av4Var2;
        yzc yzcVar;
        Object T7;
        yzc yzcVar2;
        UserBadge userBadge;
        UserBadgesResponse userBadgesResponse;
        int i2 = this.r;
        int i3 = 29;
        int i4 = 8;
        int i5 = 4;
        int i6 = 10;
        boolean z = false;
        z = false;
        int i7 = 3;
        int i8 = 2;
        Object obj2 = this.x;
        int i9 = 1;
        r14 = null;
        r14 = null;
        r14 = null;
        ArrayList arrayList = null;
        switch (i2) {
            case 0:
                i10 i10Var = (i10) this.w;
                j20 j20Var = (j20) this.u;
                lu3 lu3Var = lu3.a;
                int i10 = this.s;
                try {
                    if (i10 != 0) {
                        if (i10 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        throw new fka();
                    }
                    y6a.M(obj);
                    ku3 ku3Var = (ku3) this.t;
                    m5b m5bVar = n5b.a;
                    View view = j20Var.a;
                    m5bVar.getClass();
                    f4a f4aVar = new f4a(view);
                    r5b r5bVar = new r5b(j20Var.a, new g10((k5b) obj2), f4aVar);
                    if (oji.a) {
                        xw3.L(ku3Var, null, null, new l0(i10Var, f4aVar, r14, 11), 3);
                    }
                    Function1 function1 = (Function1) this.v;
                    if (function1 != null) {
                        function1.invoke(r5bVar);
                    }
                    i10Var.c = r5bVar;
                    this.s = 1;
                    j20Var.a(r5bVar, this);
                    return lu3Var;
                } catch (Throwable th) {
                    i10Var.c = null;
                    throw th;
                }
            case 1:
                fsf fsfVar2 = (fsf) this.u;
                lu3 lu3Var2 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    n29 n29Var = (n29) this.v;
                    this.t = fsfVar2;
                    this.s = 1;
                    i = n29Var.i(this);
                    if (i != lu3Var2) {
                        fsfVar = fsfVar2;
                    }
                    return lu3Var2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    ((Function0) obj2).invoke();
                    return Unit.a;
                }
                fsf fsfVar3 = (fsf) this.t;
                y6a.M(obj);
                fsfVar = fsfVar3;
                i = obj;
                fsfVar.a = c6o.z((a10) i);
                zic zicVar = zic.g;
                Context context = (Context) this.w;
                Bitmap bitmap = (Bitmap) fsfVar2.a;
                String y = dmi.y(context.getString(R.string.media_screen_share_text), " https://app.sofascore.com/nixz/share");
                this.t = null;
                this.s = 2;
                break;
            case 2:
                q5b q5bVar = (q5b) this.t;
                lu3 lu3Var3 = lu3.a;
                int i12 = this.s;
                try {
                    if (i12 == 0) {
                        y6a.M(obj);
                        pog y2 = sea.y(new v30(i4, (e1d) this.u));
                        yn2 yn2Var = new yn2(q5bVar, (gdj) this.v, (tbj) this.w, (qu9) obj2, 1);
                        this.s = 1;
                        if (y2.collect(yn2Var, this) == lu3Var3) {
                            return lu3Var3;
                        }
                    } else {
                        if (i12 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    l98.O(q5bVar);
                    return Unit.a;
                } catch (Throwable th2) {
                    l98.O(q5bVar);
                    throw th2;
                }
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    t32 t32Var = (t32) this.t;
                    wcj wcjVar = (wcj) this.u;
                    z05 z05Var = ((q5b) this.v).a;
                    aej aejVar = ((bej) this.w).a;
                    this.s = 1;
                    int v2 = ((nnd) obj2).v(pej.f(wcjVar.b));
                    if (v2 < aejVar.a.a.b.length()) {
                        oqfVar = aejVar.b(v2);
                    } else if (v2 != 0) {
                        oqfVar = aejVar.b(v2 - 1);
                    } else {
                        a = faj.a((dfj) z05Var.c, (kx4) z05Var.d, (sf8) z05Var.e, faj.a, 1);
                        oqfVar = new oqf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, (int) (a & 4294967295L));
                    }
                    Object a4 = t32Var.a(oqfVar, this);
                    if (a4 != lu3Var4) {
                        a4 = Unit.a;
                    }
                    if (a4 == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                ai4 ai4Var = (ai4) this.w;
                ku3 ku3Var2 = (ku3) this.v;
                lu3 lu3Var5 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    av4 t7 = xw3.t(ku3Var2, z45.a, new r1(ai4Var, (List) obj2, r14, 18), 2);
                    t = xw3.t(ku3Var2, null, new mh4(ai4Var, r14, i9), 3);
                    this.v = null;
                    this.u = t;
                    this.s = 1;
                    w = t7.w(this);
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj3 = this.t;
                        y6a.M(obj);
                        w = obj3;
                        T = obj;
                        return new Pair(w, T);
                    }
                    t = (av4) this.u;
                    y6a.M(obj);
                    w = obj;
                }
                this.v = null;
                this.u = null;
                this.t = w;
                this.s = 2;
                T = t.T(this);
                break;
            case 5:
                mr5 mr5Var = (mr5) obj2;
                Event event = (Event) this.w;
                ku3 ku3Var3 = (ku3) this.t;
                lu3 lu3Var6 = lu3.a;
                int i15 = this.s;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            t2 = (av4) this.u;
                            y6a.M(obj);
                            w3 = obj;
                            if (!((Boolean) w3).booleanValue()) {
                                this.t = null;
                                this.u = null;
                                this.s = 3;
                                T2 = t2.T(this);
                                break;
                            }
                            z = true;
                            return Boolean.valueOf(z);
                        }
                        if (i15 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        T2 = obj;
                        break;
                    } else {
                        y6a.M(obj);
                        w2 = obj;
                    }
                } else {
                    y6a.M(obj);
                    av4 av4Var3 = (av4) this.v;
                    this.t = ku3Var3;
                    this.s = 1;
                    w2 = av4Var3.w(this);
                    break;
                }
                if (!((Boolean) w2).booleanValue()) {
                    if (!ph0.a0(new String[]{StatusKt.STATUS_IN_PROGRESS, StatusKt.STATUS_WILL_CONTINUE, StatusKt.STATUS_FINISHED}).contains(event.getStatus().getType())) {
                        av4 t8 = xw3.t(ku3Var3, null, new cr5(mr5Var, event, r14, i6), 3);
                        t2 = xw3.t(ku3Var3, null, new cr5(mr5Var, event, r14, 9), 3);
                        this.t = null;
                        this.u = t2;
                        this.s = 2;
                        w3 = t8.w(this);
                        break;
                    }
                    return Boolean.valueOf(z);
                }
                z = true;
                return Boolean.valueOf(z);
            case 6:
                Event event2 = (Event) obj2;
                dz5 dz5Var = (dz5) this.w;
                ku3 ku3Var4 = (ku3) this.t;
                lu3 lu3Var7 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    av4 t9 = xw3.t(ku3Var4, null, new py5(dz5Var, event2, (rq3) r14, i3), 3);
                    t3 = xw3.t(ku3Var4, null, new py5(dz5Var, event2, (rq3) r14, 28), 3);
                    this.t = null;
                    this.u = t3;
                    this.s = 1;
                    w4 = t9.w(this);
                    break;
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        TeamStreaksResponse teamStreaksResponse2 = (TeamStreaksResponse) this.v;
                        y6a.M(obj);
                        teamStreaksResponse = teamStreaksResponse2;
                        T3 = obj;
                        Head2HeadResponse head2HeadResponse = (Head2HeadResponse) T3;
                        return new jy5(teamStreaksResponse, head2HeadResponse != null ? head2HeadResponse.getTeamDuel() : 0);
                    }
                    t3 = (av4) this.u;
                    y6a.M(obj);
                    w4 = obj;
                }
                teamStreaksResponse = (TeamStreaksResponse) yaa.x((x2g) w4);
                this.t = null;
                this.u = null;
                this.v = teamStreaksResponse;
                this.s = 2;
                T3 = t3.T(this);
                break;
            case 7:
                l66 l66Var = (l66) obj2;
                amd amdVar = l66Var.n;
                ku3 ku3Var5 = (ku3) this.t;
                lu3 lu3Var8 = lu3.a;
                int i17 = this.s;
                rq3 rq3Var = null;
                if (i17 == 0) {
                    y6a.M(obj);
                    Tournament tournament = ((Event) l66Var.l.getValue()).getTournament();
                    OddsCountryProvider oddsCountryProvider2 = l66Var.p;
                    if (oddsCountryProvider2 == null) {
                        List a5 = amdVar.a(o3a.F(tournament));
                        if (a5 == null) {
                            a5 = amdVar.c();
                        }
                        oddsCountryProvider2 = (OddsCountryProvider) CollectionsKt.firstOrNull(a5);
                        l66Var.p = oddsCountryProvider2;
                    }
                    OddsCountryProvider oddsCountryProvider3 = oddsCountryProvider2;
                    if (oddsCountryProvider3 == null) {
                        return Unit.a;
                    }
                    av4 t10 = xw3.t(ku3Var5, null, new k66(l66Var, tournament, oddsCountryProvider3, rq3Var, 0), 3);
                    str = null;
                    av4 t11 = xw3.t(ku3Var5, null, new k66(l66Var, tournament, oddsCountryProvider3, rq3Var, 1), 3);
                    this.t = null;
                    this.u = oddsCountryProvider3;
                    this.v = t11;
                    this.s = 1;
                    w5 = t10.w(this);
                    if (w5 != lu3Var8) {
                        oddsCountryProvider = oddsCountryProvider3;
                        av4Var = t11;
                    }
                    return lu3Var8;
                }
                if (i17 != 1) {
                    if (i17 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gv9 gv9Var3 = (gv9) this.w;
                    oddsCountryProvider = (OddsCountryProvider) this.u;
                    y6a.M(obj);
                    gv9Var = gv9Var3;
                    str = null;
                    T4 = obj;
                    gv9 gv9Var4 = (gv9) T4;
                    if (l66Var.f.a.getValue() instanceof unb) {
                        l66Var.n(str, new xw5(12, gv9Var, gv9Var4));
                    } else {
                        l66Var.k(new pld(str, oddsCountryProvider));
                        l66Var.o(new fa(i3, gv9Var, gv9Var4, oddsCountryProvider));
                    }
                    return Unit.a;
                }
                av4Var = (av4) this.v;
                oddsCountryProvider = (OddsCountryProvider) this.u;
                y6a.M(obj);
                w5 = obj;
                str = null;
                gv9Var = (gv9) w5;
                this.t = str;
                this.u = oddsCountryProvider;
                this.v = str;
                this.w = gv9Var;
                this.s = 2;
                T4 = av4Var.T(this);
                break;
            case 8:
                Event event3 = (Event) obj2;
                bc6 bc6Var = (bc6) this.w;
                ku3 ku3Var6 = (ku3) this.t;
                lu3 lu3Var9 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    av4 t12 = xw3.t(ku3Var6, null, new xb6(bc6Var, event3, r14, i8), 3);
                    t4 = xw3.t(ku3Var6, null, new xb6(bc6Var, event3, r14, i7), 3);
                    this.t = null;
                    this.u = t4;
                    this.s = 1;
                    w6 = t12.w(this);
                    break;
                } else if (i18 == 1) {
                    t4 = (av4) this.u;
                    y6a.M(obj);
                    w6 = obj;
                } else {
                    if (i18 != 2) {
                        if (i18 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        R = obj;
                        return (gc6) R;
                    }
                    x2g x2gVar2 = (x2g) this.v;
                    y6a.M(obj);
                    x2gVar = x2gVar2;
                    T5 = obj;
                    x2g x2gVar3 = (x2g) T5;
                    if (!(x2gVar instanceof v2g) || !(x2gVar3 instanceof v2g)) {
                        return null;
                    }
                    hs4 hs4Var = z45.a;
                    r1 r1Var = new r1((v2g) x2gVar, (v2g) x2gVar3, r14, 24);
                    this.t = null;
                    this.u = null;
                    this.v = null;
                    this.s = 3;
                    R = xw3.R(hs4Var, r1Var, this);
                    break;
                }
                x2gVar = (x2g) w6;
                this.t = null;
                this.u = null;
                this.v = x2gVar;
                this.s = 2;
                T5 = t4.T(this);
                break;
            case 9:
                mv6 mv6Var = (mv6) this.u;
                ku3 ku3Var7 = (ku3) this.t;
                lu3 lu3Var10 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    fdi fdiVar = mv6Var.f;
                    do {
                        value = fdiVar.getValue();
                    } while (!fdiVar.k(value, new lv6(true, ((lv6) value).b)));
                    av4 t13 = xw3.t(ku3Var7, null, new u1((mv6) this.u, (String) this.v, (String) this.w, (FantasyLeagueGameType) obj2, null, 20), 3);
                    wd5 wd5Var = xd5.b;
                    long R2 = wkn.R(500, be5.MILLISECONDS);
                    this.t = null;
                    this.s = 1;
                    e0 = z8e.e0(t13, R2, this);
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    e0 = obj;
                }
                fo7 fo7Var = (fo7) e0;
                if (fo7Var != null) {
                    aeh aehVar = mv6Var.h;
                    kv6 kv6Var = new kv6(fo7Var);
                    this.t = null;
                    this.s = 2;
                    break;
                } else {
                    fdi fdiVar2 = mv6Var.f;
                    do {
                        value2 = fdiVar2.getValue();
                        ((lv6) value2).getClass();
                    } while (!fdiVar2.k(value2, new lv6(false, true)));
                }
                return Unit.a;
            case 10:
                ku3 ku3Var8 = (ku3) this.t;
                lu3 lu3Var11 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    av4 t14 = xw3.t(ku3Var8, null, new u1((ia7) this.u, (String) this.v, (String) this.w, (FantasyLeagueGameType) obj2, null, 21), 3);
                    wd5 wd5Var2 = xd5.b;
                    long R3 = wkn.R(300, be5.MILLISECONDS);
                    this.t = null;
                    this.s = 1;
                    e02 = z8e.e0(t14, R3, this);
                    break;
                } else {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    e02 = obj;
                }
                FantasyUserLeague fantasyUserLeague = (FantasyUserLeague) e02;
                ia7 ia7Var = (ia7) this.u;
                if (fantasyUserLeague != null) {
                    aeh aehVar2 = ia7Var.i;
                    this.t = null;
                    this.s = 2;
                    break;
                } else {
                    fdi fdiVar3 = ia7Var.g;
                    do {
                        value3 = fdiVar3.getValue();
                        ha7Var = (ha7) value3;
                        aa7 aa7Var = ha7Var.a;
                        if (aa7Var instanceof y97) {
                            ha7Var = ha7.a(ha7Var, y97.a((y97) aa7Var, null, null, null, false, false, 39), false, 2);
                        }
                    } while (!fdiVar3.k(value3, ha7Var));
                }
                return Unit.a;
            case 11:
                q50 q50Var = (q50) this.w;
                e1d e1dVar = (e1d) obj2;
                ku3 ku3Var9 = (ku3) this.t;
                lu3 lu3Var12 = lu3.a;
                switch (this.s) {
                    case 0:
                        y6a.M(obj);
                        boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
                        q50 q50Var2 = (q50) this.v;
                        if (booleanValue) {
                            av4 t15 = xw3.t(ku3Var9, null, new w07(q50Var2, r14, i9), 3);
                            t5 = xw3.t(ku3Var9, null, new w07(q50Var, r14, i8), 3);
                            this.t = null;
                            this.u = t5;
                            this.s = 1;
                            break;
                        } else {
                            Float f = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            this.t = null;
                            this.s = 5;
                            break;
                        }
                        return lu3Var12;
                    case 1:
                        t5 = (av4) this.u;
                        y6a.M(obj);
                        this.t = null;
                        this.u = null;
                        this.s = 2;
                        break;
                    case 2:
                        y6a.M(obj);
                        q50 q50Var3 = (q50) this.v;
                        Float f2 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        i4k i4kVar = new i4k(600, (ig5) null, 6);
                        this.t = null;
                        this.u = null;
                        this.s = 3;
                        break;
                    case 3:
                        y6a.M(obj);
                        this.t = null;
                        this.u = null;
                        this.s = 4;
                        break;
                    case 4:
                        y6a.M(obj);
                        return Unit.a;
                    case 5:
                        y6a.M(obj);
                        Float f3 = new Float(0.25f);
                        this.t = null;
                        this.s = 6;
                        break;
                    case 6:
                        y6a.M(obj);
                        e1dVar.setValue(Boolean.TRUE);
                        return Unit.a;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 12:
                Calendar calendar = (Calendar) this.w;
                String str2 = (String) obj2;
                zqb zqbVar = (zqb) this.v;
                lu3 lu3Var13 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    LinkedHashMap linkedHashMap2 = zqbVar.A;
                    format = zqbVar.d0.format(calendar.getTime());
                    if (linkedHashMap2.get(format) == null) {
                        linkedHashMap2.put(format, km5.a);
                        String I = z8e.I(calendar);
                        if (wyh.m(str2)) {
                            s96 s96Var = zqbVar.h;
                            format.getClass();
                            this.t = linkedHashMap2;
                            this.u = format;
                            this.s = 1;
                            v = s96Var.v(format, I, str2, this);
                            if (v != lu3Var13) {
                                linkedHashMap = linkedHashMap2;
                                monthlyStages = (MonthlyStages) v;
                                if (monthlyStages != null) {
                                    arrayList = new ArrayList(k13.r(dailyStages, 10));
                                    while (r0.hasNext()) {
                                    }
                                }
                            }
                        } else {
                            vrj vrjVar = zqbVar.f;
                            format.getClass();
                            this.t = linkedHashMap2;
                            this.u = format;
                            this.s = 2;
                            a2 = vrjVar.a(format, I, str2, this);
                            if (a2 != lu3Var13) {
                                linkedHashMap = linkedHashMap2;
                                monthlyUniqueTournamentsResponse = (MonthlyUniqueTournamentsResponse) a2;
                                if (monthlyUniqueTournamentsResponse != null) {
                                    arrayList = new ArrayList(k13.r(dailyUniqueTournaments, 10));
                                    while (r0.hasNext()) {
                                    }
                                }
                            }
                        }
                        return lu3Var13;
                    }
                    return Unit.a;
                }
                if (i21 == 1) {
                    String str3 = (String) this.u;
                    linkedHashMap = (LinkedHashMap) this.t;
                    y6a.M(obj);
                    format = str3;
                    v = obj;
                    monthlyStages = (MonthlyStages) v;
                    if (monthlyStages != null && (dailyStages = monthlyStages.getDailyStages()) != null) {
                        arrayList = new ArrayList(k13.r(dailyStages, 10));
                        for (DailyStages dailyStages2 : dailyStages) {
                            arrayList.add(new pqb(dailyStages2.getDate(), dailyStages2.getStageIds()));
                        }
                    }
                } else {
                    if (i21 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = (String) this.u;
                    linkedHashMap = (LinkedHashMap) this.t;
                    y6a.M(obj);
                    format = str4;
                    a2 = obj;
                    monthlyUniqueTournamentsResponse = (MonthlyUniqueTournamentsResponse) a2;
                    if (monthlyUniqueTournamentsResponse != null && (dailyUniqueTournaments = monthlyUniqueTournamentsResponse.getDailyUniqueTournaments()) != null) {
                        arrayList = new ArrayList(k13.r(dailyUniqueTournaments, 10));
                        for (MonthlyUniqueTournamentItem monthlyUniqueTournamentItem : dailyUniqueTournaments) {
                            arrayList.add(new pqb(monthlyUniqueTournamentItem.getDate(), monthlyUniqueTournamentItem.getUniqueTournamentIds()));
                        }
                    }
                }
                if (arrayList != null) {
                    linkedHashMap.put(format, arrayList);
                    zqbVar.B.j(linkedHashMap);
                }
                return Unit.a;
            case 13:
                u8c u8cVar = (u8c) obj2;
                MediaPost mediaPost = (MediaPost) this.w;
                ku3 ku3Var10 = (ku3) this.t;
                lu3 lu3Var14 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    t6 = xw3.t(ku3Var10, null, new p7c(mediaPost, u8cVar, r14, i5), 3);
                    List<Integer> mediaPostIds = mediaPost.getMediaPostIds();
                    if (mediaPostIds != null) {
                        ArrayList arrayList2 = new ArrayList(k13.r(mediaPostIds, 10));
                        Iterator it = mediaPostIds.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(xw3.t(ku3Var10, null, new w7c(u8cVar, ((Number) it.next()).intValue(), r14, i4), 3));
                        }
                        this.t = ku3Var10;
                        this.u = t6;
                        this.s = 1;
                        u = m6k.u(arrayList2, this);
                        break;
                    }
                    gv9Var2 = null;
                    this.t = null;
                    this.u = null;
                    this.v = gv9Var2;
                    this.s = 3;
                    T6 = t6.T(this);
                } else if (i22 == 1) {
                    ?? r2 = (zu4) this.u;
                    y6a.M(obj);
                    t6 = r2;
                    u = obj;
                } else {
                    if (i22 != 2) {
                        if (i22 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        gv9Var2 = (gv9) this.v;
                        y6a.M(obj);
                        T6 = obj;
                        UniqueTournamentResponse uniqueTournamentResponse = (UniqueTournamentResponse) T6;
                        UniqueTournament uniqueTournament = uniqueTournamentResponse != null ? uniqueTournamentResponse.getUniqueTournament() : null;
                        if (gv9Var2 == null || gv9Var2.isEmpty() || uniqueTournament == null) {
                            return null;
                        }
                        return new b49(mediaPost.getId(), gv9Var2, new iy7(Integer.valueOf(uniqueTournament.getId()), tba.x(uniqueTournament)));
                    }
                    ?? r1 = (zu4) this.u;
                    y6a.M(obj);
                    t6 = r1;
                    u2 = obj;
                    List list = (List) u2;
                    if (list != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj4 : list) {
                            if (obj4 instanceof cqk) {
                                arrayList3.add(obj4);
                            }
                        }
                        gv9Var2 = l6g.W(arrayList3);
                        this.t = null;
                        this.u = null;
                        this.v = gv9Var2;
                        this.s = 3;
                        T6 = t6.T(this);
                        break;
                    }
                    gv9Var2 = null;
                    this.t = null;
                    this.u = null;
                    this.v = gv9Var2;
                    this.s = 3;
                    T6 = t6.T(this);
                }
                List list2 = (List) u;
                if (list2 != null) {
                    ArrayList W = CollectionsKt.W(list2);
                    ArrayList arrayList4 = new ArrayList(k13.r(W, 10));
                    Iterator it2 = W.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(xw3.t(ku3Var10, null, new p7c(null, u8cVar, (MediaPost) it2.next()), 3));
                    }
                    this.t = null;
                    this.u = t6;
                    this.s = 2;
                    u2 = m6k.u(arrayList4, this);
                    break;
                }
                gv9Var2 = null;
                this.t = null;
                this.u = null;
                this.v = gv9Var2;
                this.s = 3;
                T6 = t6.T(this);
                break;
            case 14:
                xnh xnhVar = (xnh) this.w;
                e1d e1dVar2 = (e1d) obj2;
                oe3 oe3Var = (oe3) this.u;
                e1d e1dVar3 = (e1d) this.v;
                lu3 lu3Var15 = lu3.a;
                int i23 = this.s;
                try {
                    if (i23 != 0) {
                        if (i23 == 1) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        if (i23 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        d6dVar = (d6d) this.t;
                        y6a.M(obj);
                        oe3Var.i(d6dVar, false);
                        e1dVar2.setValue(Boolean.FALSE);
                        return Unit.a;
                    }
                    y6a.M(obj);
                    z88 z88Var = (z88) this.t;
                    if (((List) e1dVar3.getValue()).size() < 2) {
                        ueb uebVar = ueb.c;
                        this.s = 1;
                        break;
                    } else {
                        xnhVar.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        d6d d6dVar2 = (d6d) CollectionsKt.h0((List) e1dVar3.getValue());
                        oe3Var.b().g(d6dVar2);
                        oe3Var.b().g((d6d) ((List) e1dVar3.getValue()).get(((List) e1dVar3.getValue()).size() - 2));
                        nk0 nk0Var = new nk0(23, e1dVar2, xnhVar);
                        this.t = d6dVar2;
                        this.s = 2;
                        if (z88Var.collect(nk0Var, this) != lu3Var15) {
                            d6dVar = d6dVar2;
                            oe3Var.i(d6dVar, false);
                            e1dVar2.setValue(Boolean.FALSE);
                            return Unit.a;
                        }
                    }
                    return lu3Var15;
                } finally {
                    e1dVar2.setValue(Boolean.FALSE);
                }
                e1dVar2.setValue(Boolean.FALSE);
            case 15:
                NimbusCustomEventBanner nimbusCustomEventBanner = (NimbusCustomEventBanner) obj2;
                FrameLayout frameLayout = (FrameLayout) this.w;
                ucd ucdVar = (ucd) this.u;
                lu3 lu3Var16 = lu3.a;
                int i24 = this.s;
                try {
                    if (i24 == 0) {
                        y6a.M(obj);
                        String str5 = gcd.a;
                        ArrayList arrayList5 = ovk.a;
                        pv1 pv1Var = ucdVar.a;
                        dwh dwhVar = new dwh();
                        Map map = dwhVar.a;
                        map.put("omidpn", "Adsbynimbus");
                        map.put("omidpv", "2.37.0");
                        pv1Var.i = dwhVar;
                        if (j0g.a(ucdVar) >= 2) {
                            td4.v0(ucdVar, 6);
                        }
                        jcd jcdVar = (jcd) this.v;
                        p2g p2gVar = w2g.b;
                        Context context2 = frameLayout.getContext();
                        context2.getClass();
                        this.s = 1;
                        a3 = jcdVar.a(context2, ucdVar, this);
                        if (a3 == lu3Var16) {
                            return lu3Var16;
                        }
                    } else {
                        if (i24 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        a3 = obj;
                    }
                    u2gVar = (wcd) a3;
                    p2g p2gVar2 = w2g.b;
                } catch (Throwable th3) {
                    p2g p2gVar3 = w2g.b;
                    u2gVar = new u2g(th3);
                }
                Throwable a6 = w2g.a(u2gVar);
                if (a6 != null) {
                    qcd qcdVar = a6 instanceof qcd ? (qcd) a6 : null;
                    if (qcdVar == null) {
                        String message = a6.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        qcdVar = new qcd(3, message, a6);
                    }
                    nimbusCustomEventBanner.onError(qcdVar);
                }
                if (!(u2gVar instanceof u2g)) {
                    wcd wcdVar = (wcd) u2gVar;
                    nimbusCustomEventBanner.onAdResponse(wcdVar);
                    fhh fhhVar = qyf.a;
                    wcdVar.getClass();
                    rik.t(wcdVar, frameLayout, nimbusCustomEventBanner);
                }
                return Unit.a;
            case 16:
                lu3 lu3Var17 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    aeh aehVar3 = ((ple) this.t).x;
                    mle mleVar = new mle((UniqueTournament) this.u, (String) this.v, (String) this.w, (String) obj2);
                    this.s = 1;
                    if (aehVar3.emit(mleVar, this) == lu3Var17) {
                        return lu3Var17;
                    }
                } else {
                    if (i25 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 17:
                f9f f9fVar = (f9f) obj2;
                ku3 ku3Var11 = (ku3) this.t;
                lu3 lu3Var18 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    av4 t16 = xw3.t(ku3Var11, null, new e9f(f9fVar, r14, i9), 3);
                    av4 t17 = xw3.t(ku3Var11, null, new e9f(f9fVar, r14, z ? 1 : 0), 3);
                    yzc yzcVar3 = f9fVar.m;
                    this.t = null;
                    this.u = t17;
                    this.v = yzcVar3;
                    this.s = 1;
                    w7 = t16.w(this);
                    if (w7 != lu3Var18) {
                        av4Var2 = t17;
                        yzcVar = yzcVar3;
                    }
                    return lu3Var18;
                }
                if (i26 != 1) {
                    if (i26 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    userBadge = (UserBadge) this.w;
                    yzcVar2 = (yzc) this.v;
                    y6a.M(obj);
                    T7 = obj;
                    userBadgesResponse = (UserBadgesResponse) yaa.x((x2g) T7);
                    if (userBadgesResponse != null || (r2 = userBadgesResponse.getBadges()) == null) {
                        List<UserBadge> list3 = km5.a;
                    }
                    yzcVar2.j(new d9f(userBadge, list3));
                    return Unit.a;
                }
                yzcVar = (yzc) this.v;
                av4 av4Var4 = (av4) this.u;
                y6a.M(obj);
                av4Var2 = av4Var4;
                w7 = obj;
                UserBadge userBadge2 = (UserBadge) w7;
                this.t = null;
                this.u = null;
                this.v = yzcVar;
                this.w = userBadge2;
                this.s = 2;
                T7 = av4Var2.T(this);
                if (T7 != lu3Var18) {
                    yzcVar2 = yzcVar;
                    userBadge = userBadge2;
                    userBadgesResponse = (UserBadgesResponse) yaa.x((x2g) T7);
                    if (userBadgesResponse != null) {
                    }
                    List<UserBadge> list32 = km5.a;
                    yzcVar2.j(new d9f(userBadge, list32));
                    return Unit.a;
                }
                return lu3Var18;
            case 18:
                return e(obj);
            case 19:
                return f(obj);
            case 20:
                return g(obj);
            case 21:
                return h(obj);
            case 22:
                return j(obj);
            case 23:
                return k(obj);
            case 24:
                return l(obj);
            case 25:
                return m(obj);
            case 26:
                return n(obj);
            case 27:
                return o(obj);
            case 28:
                return p(obj);
            default:
                lu3 lu3Var19 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    zic zicVar2 = zic.g;
                    Context context3 = (Context) this.t;
                    Bitmap bitmap2 = (Bitmap) this.u;
                    TotrSharePayload totrSharePayload = (TotrSharePayload) this.v;
                    String str6 = totrSharePayload.b + " — " + totrSharePayload.c + " " + ((String) this.w);
                    this.s = 1;
                    if (zicVar2.L(context3, bitmap2, str6, this) == lu3Var19) {
                        return lu3Var19;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ((TeamOfTheRoundShareBottomSheet) obj2).q();
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h10(o0h o0hVar, Object obj, axj axjVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 25;
        this.w = o0hVar;
        this.t = obj;
        this.x = axjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h10(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.x = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h10(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.w = obj;
        this.x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h10(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h10(Object obj, Object obj2, Object obj3, Object obj4, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h10(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
        this.w = obj4;
        this.x = obj5;
    }
}
