package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.model.database.DbSavedSearches;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.newNetwork.newRankings.Ranking;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.model.profile.VoteStatistics;
import com.sofascore.model.profile.VoteStatisticsWrapper;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.tv.model.TvChannelData;
import com.sofascore.results.helper.SofaBackupAgent;
import com.sofascore.results.player.statistics.compare.search.CompareSearchBottomSheet;
import com.sofascore.results.player.statistics.compare.seasonpicker.SeasonPickerBottomSheet;
import com.sofascore.results.profile.predictions.ProfilePredictionsStatisticsFragment;
import com.sofascore.results.profile.view.ProfilePredictionStatisticsView;
import com.sofascore.results.ranking.RankingFragment;
import com.sofascore.results.referee.events.RefereeEventsFragment;
import com.sofascore.results.stagesport.fragments.details.StageDetailsRankingFragment;
import com.sofascore.results.stagesport.fragments.details.StageDetailsResultsFragment;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.tv.TVScheduleActivity;
import com.sofascore.results.tv.fragments.TVScheduleFragment;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class aaf implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aaf(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x06ff, code lost:
    
        r5 = java.lang.Integer.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0703, code lost:
    
        if (r8 == (-1)) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0706, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0708, code lost:
    
        if (r5 == null) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x070a, code lost:
    
        r7.add(java.lang.Integer.valueOf(r5.intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0715, code lost:
    
        r4.F(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x071c, code lost:
    
        if (r2.w == false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x071e, code lost:
    
        r2.w = false;
        r4 = r2.l;
        r4.getClass();
        r4 = ((defpackage.np8) r4).b;
        r7 = r2.requireContext();
        r7.getClass();
        r4.addItemDecoration(new defpackage.xrh(r7, r3, 10));
        r4 = (java.lang.Integer) r2.v.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0741, code lost:
    
        if (r4 == null) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0743, code lost:
    
        r4 = r4.intValue();
        r1 = r1.getRankingRows();
        r5 = new java.util.ArrayList();
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0758, code lost:
    
        if (r1.hasNext() == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x075a, code lost:
    
        r6 = ((com.sofascore.model.newNetwork.newRankings.RankingRow) r1.next()).getTeam();
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0764, code lost:
    
        if (r6 == null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0766, code lost:
    
        r6 = java.lang.Integer.valueOf(r6.getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0771, code lost:
    
        if (r6 == null) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0773, code lost:
    
        r5.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x076f, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0777, code lost:
    
        r1 = r5.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0780, code lost:
    
        if (r1.hasNext() == false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x078c, code lost:
    
        if (((java.lang.Integer) r1.next()).intValue() != r4) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x078f, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0793, code lost:
    
        if (r5 != (-1)) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0795, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x079c, code lost:
    
        if (r1 == null) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x079e, code lost:
    
        r1 = r1.intValue();
        r4 = r2.l;
        r4.getClass();
        r4 = ((defpackage.np8) r4).b.getLayoutManager();
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x07b1, code lost:
    
        if ((r4 instanceof androidx.recyclerview.widget.LinearLayoutManager) == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x07b3, code lost:
    
        r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x07b8, code lost:
    
        if (r4 == null) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x07ba, code lost:
    
        r4.scrollToPositionWithOffset(r1 + r3, ((defpackage.fmf) r0.h()).a.getHeight());
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x07b6, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0798, code lost:
    
        r1 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0792, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x07d4, code lost:
    
        if (((defpackage.amf) r2.u.getValue()) != defpackage.amf.d) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x07d6, code lost:
    
        r1 = r2.requireContext();
        r1.getClass();
        r0 = new com.sofascore.results.view.InformationView(r1, null, 6);
        com.sofascore.results.view.InformationView.o(r0, "* " + r2.getString(com.sofascore.results.R.string.uefa_ranking_explanation));
        r0.setBackgroundColor(r0.getContext().getColor(com.sofascore.results.R.color.surface_1));
        defpackage.g7.o(r2.C(), r0, 6);
        r0.p(r16, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x081b, code lost:
    
        return kotlin.Unit.a;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        VoteStatistics current;
        String total;
        Integer intOrNull;
        boolean z;
        int i;
        String format;
        String Q;
        String format2;
        g6b lifecycle;
        String str;
        int intValue;
        View view;
        int i2 = 6;
        int i3 = 13;
        int i4 = 14;
        int i5 = 8;
        int i6 = 4;
        int i7 = 3;
        int i8 = 1;
        rq3 rq3Var = null;
        switch (this.a) {
            case 0:
                pbf pbfVar = (pbf) this.b;
                gta gtaVar = (gta) this.c;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                esa.d(esaVar, null, null, new tc3(-2047369458, new yya(16, gtaVar, pbfVar), true), 3);
                esa.d(esaVar, null, null, new tc3(-1622335483, new pte(gtaVar, i5), true), 3);
                List S = CollectionsKt.S(((obf) pbfVar).a, 3);
                esaVar.a(S.size(), null, new xo(S, 29), new tc3(802480018, new aj(i4, S, gtaVar), true));
                return Unit.a;
            case 1:
                ProfilePredictionsStatisticsFragment profilePredictionsStatisticsFragment = (ProfilePredictionsStatisticsFragment) this.b;
                String str2 = (String) this.c;
                ProfileData profileData = (ProfileData) obj;
                profilePredictionsStatisticsFragment.n();
                if (profilePredictionsStatisticsFragment.s && profileData != null) {
                    krk krkVar = profilePredictionsStatisticsFragment.l;
                    krkVar.getClass();
                    ((faf) krkVar).c.setVisibility(0);
                    VoteStatisticsWrapper voteStatistics = profileData.getVoteStatistics();
                    int intValue2 = (voteStatistics == null || (current = voteStatistics.getCurrent()) == null || (total = current.getTotal()) == null || (intOrNull = StringsKt.toIntOrNull(total)) == null) ? 0 : intOrNull.intValue();
                    krk krkVar2 = profilePredictionsStatisticsFragment.l;
                    if (intValue2 > 0) {
                        krkVar2.getClass();
                        ProfilePredictionStatisticsView profilePredictionStatisticsView = ((faf) krkVar2).d;
                        VoteStatisticsWrapper voteStatistics2 = profileData.getVoteStatistics();
                        ProfilePredictionStatisticsView.a(profilePredictionStatisticsView, voteStatistics2 != null ? voteStatistics2.getCurrent() : null, "CURRENT", str2, 4);
                        profilePredictionStatisticsView.setTitle(R.string.last_30_days);
                    } else {
                        krkVar2.getClass();
                        ((faf) krkVar2).d.setVisibility(8);
                    }
                    krk krkVar3 = profilePredictionsStatisticsFragment.l;
                    krkVar3.getClass();
                    ProfilePredictionStatisticsView profilePredictionStatisticsView2 = ((faf) krkVar3).b;
                    VoteStatisticsWrapper voteStatistics3 = profileData.getVoteStatistics();
                    ProfilePredictionStatisticsView.a(profilePredictionStatisticsView2, voteStatistics3 != null ? voteStatistics3.getAllTime() : null, "ALL", null, 12);
                    profilePredictionStatisticsView2.setTitle(R.string.all_time);
                    profilePredictionsStatisticsFragment.s = false;
                }
                return Unit.a;
            case 2:
                return cga.T((ProfileData) obj, ((sbf) this.b).k, (gta) this.c);
            case 3:
                cdi cdiVar = (cdi) this.b;
                cdi cdiVar2 = (cdi) this.c;
                ha5 ha5Var = (ha5) obj;
                float H0 = ha5Var.H0(2.0f);
                float f = H0 / 2.0f;
                ha5.U(ha5Var, ((r13) cdiVar.getValue()).a, ha5Var.H0(dlf.c / 2.0f) - f, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new jii(H0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30), 108);
                if (p75.a(((p75) cdiVar2.getValue()).a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > 0) {
                    ha5.U(ha5Var, ((r13) cdiVar.getValue()).a, ha5Var.H0(((p75) cdiVar2.getValue()).a) - f, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e28.a, 108);
                }
                return Unit.a;
            case 4:
                RankingFragment rankingFragment = (RankingFragment) this.b;
                sj4 sj4Var = (sj4) this.c;
                Ranking ranking = (Ranking) obj;
                cmf C = rankingFragment.C();
                ranking.getClass();
                ArrayList arrayList = C.n;
                amf amfVar = C.l;
                Context context = C.b;
                String str3 = C.p;
                xbb b = a.b();
                Long lastUpdatedTimestamp = ranking.getRankingType().getLastUpdatedTimestamp();
                if (lastUpdatedTimestamp != null) {
                    long longValue = lastUpdatedTimestamp.longValue();
                    z = true;
                    b.add(new zlf(longValue));
                    i = 1;
                } else {
                    z = true;
                    i = 0;
                }
                int i9 = i + 1;
                int ordinal = amfVar.ordinal();
                Gender gender = (ordinal == 4 || ordinal == 6 || ordinal == 9) ? Gender.Female : Gender.Male;
                switch (amfVar.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                        format = String.format(lnb.o("%s", str3, "%s"), Arrays.copyOf(new Object[]{context.getString(R.string.rank), context.getString(R.string.country)}, 2));
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                        String o = lnb.o("%s", str3, "%s");
                        String string = context.getString(R.string.rank);
                        Q = hkg.Q(context, R.string.player, gender, new Object[0]);
                        format = String.format(o, Arrays.copyOf(new Object[]{string, Q}, 2));
                        break;
                    case 7:
                        format = String.format(lnb.o("%s", str3, "%s"), Arrays.copyOf(new Object[]{context.getString(R.string.rank), context.getString(R.string.club)}, 2));
                        break;
                    default:
                        zzl.b();
                        return null;
                }
                int ordinal2 = amfVar.ordinal();
                if (ordinal2 != 0) {
                    switch (ordinal2) {
                        case 5:
                        case 6:
                            String string2 = context.getString(R.string.tennis_live_ranking);
                            string2.getClass();
                            format2 = c.r(string2, " | ", str3, false);
                            break;
                        case 7:
                            format2 = context.getString(R.string.coefficient);
                            format2.getClass();
                            break;
                        case 8:
                        case 9:
                            format2 = "UTR";
                            break;
                        default:
                            format2 = context.getString(R.string.points);
                            format2.getClass();
                            break;
                    }
                } else {
                    format2 = String.format(lnb.o("%s*", str3, "%s"), Arrays.copyOf(new Object[]{context.getString(R.string.teams), context.getString(R.string.coefficient)}, 2));
                }
                b.add(new ylf(format, format2));
                List<RankingRow> rankingRows = ranking.getRankingRows();
                ArrayList arrayList2 = new ArrayList(k13.r(rankingRows, 10));
                Iterator<T> it = rankingRows.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new xlf((RankingRow) it.next()));
                }
                b.addAll(arrayList2);
                xbb a = a.a(b);
                arrayList.clear();
                a.getClass();
                ListIterator listIterator = a.listIterator(0);
                int i10 = 0;
                while (true) {
                    hc9 hc9Var = (hc9) listIterator;
                    if (!hc9Var.hasNext()) {
                        i10 = -1;
                        break;
                    } else {
                        Object next = hc9Var.next();
                        if (i10 < 0) {
                            b.q();
                            throw null;
                        }
                        wlf wlfVar = (wlf) next;
                        wlfVar.getClass();
                        if (wlfVar instanceof ylf) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            case 5:
                sg3 sg3Var = (sg3) this.b;
                y0d y0dVar = (y0d) this.c;
                sg3Var.A(obj);
                if (y0dVar != null) {
                    y0dVar.a(obj);
                }
                return Unit.a;
            case 6:
                kqf kqfVar = (kqf) this.b;
                Throwable th = (Throwable) this.c;
                Throwable th2 = (Throwable) obj;
                synchronized (kqfVar.d) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                de6.a(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    kqfVar.f = th;
                    fdi fdiVar = kqfVar.v;
                    iqf iqfVar = iqf.a;
                    fdiVar.getClass();
                    fdiVar.m(null, iqfVar);
                }
                return Unit.a;
            case 7:
                RefereeEventsFragment refereeEventsFragment = (RefereeEventsFragment) this.b;
                s6e s6eVar = (s6e) this.c;
                List list = (List) obj;
                list.getClass();
                kda.p(wca.x(refereeEventsFragment.getLifecycle()), new vsf(refereeEventsFragment, list, rq3Var, i8), new owa(s6eVar, 3));
                return Unit.a;
            case 8:
                u6b u6bVar = (u6b) this.b;
                ge3 ge3Var = (ge3) this.c;
                ga gaVar = new ga(ge3Var, i6);
                if (u6bVar != null && (lifecycle = u6bVar.getLifecycle()) != null) {
                    lifecycle.a(gaVar);
                }
                if (u6bVar == null) {
                    d6b d6bVar = d6b.ON_RESUME;
                    ge3Var.getClass();
                    ge3Var.b = d6bVar.d();
                    ge3Var.a();
                }
                return new ha(u6bVar, gaVar, ge3Var, 5);
            case 9:
                Function1 function1 = (Function1) this.b;
                o85 o85Var = (o85) this.c;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                function1.invoke(new xyf(esaVar2, o85Var));
                return Unit.a;
            case 10:
                ((eoh) ((l1d) this.b).a).setValue(new ke6((w8l) this.c, (w8l) obj));
                return Unit.a;
            case 11:
                qvg qvgVar = (qvg) this.b;
                svg svgVar = (svg) this.c;
                q85 q85Var = (q85) obj;
                float f2 = q85Var.b ? -1.0f : 1.0f;
                long j = q85Var.a;
                qvgVar.a(1, dnd.j(svgVar.d == ewd.b ? dnd.a(j, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : dnd.a(j, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), f2));
                return Unit.a;
            case 12:
                scj scjVar = (scj) this.b;
                e1d e1dVar = (e1d) this.c;
                String str4 = (String) obj;
                str4.getClass();
                e1dVar.setValue(str4);
                w1a.E(scjVar, str4);
                return Unit.a;
            case 13:
                gwg gwgVar = (gwg) this.b;
                DbSavedSearches dbSavedSearches = (DbSavedSearches) this.c;
                glg glgVar = (glg) obj;
                glgVar.getClass();
                gwgVar.b.a0(glgVar, dbSavedSearches);
                return Unit.a;
            case 14:
                Context context2 = (Context) this.b;
                cdi cdiVar3 = (cdi) this.c;
                uxg uxgVar = (uxg) obj;
                uxgVar.getClass();
                if (uxgVar instanceof sxg) {
                    sxg sxgVar = (sxg) uxgVar;
                    e93 e93Var = sxgVar.a;
                    e73 e73Var = sxgVar.b;
                    String str5 = sxgVar.c;
                    context2.getClass();
                    e93Var.getClass();
                    e73Var.getClass();
                    str5.getClass();
                    CompareSearchBottomSheet compareSearchBottomSheet = new CompareSearchBottomSheet();
                    Bundle bundle = new Bundle();
                    bundle.putString("SLOT_INDEX", e93Var.name());
                    bundle.putString("ENTITY_TYPE", e73Var.name());
                    bundle.putString("SPORT", str5);
                    compareSearchBottomSheet.setArguments(bundle);
                    Unit unit = Unit.a;
                    if (context2 instanceof csk) {
                        context2 = ((csk) context2).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity = context2 instanceof AppCompatActivity ? (AppCompatActivity) context2 : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(compareSearchBottomSheet, appCompatActivity, rq3Var, i7));
                    }
                } else {
                    if (!(uxgVar instanceof txg)) {
                        zzl.b();
                        return null;
                    }
                    txg txgVar = (txg) uxgVar;
                    e93 e93Var2 = txgVar.a;
                    Integer num = txgVar.b;
                    gyg gygVar = (gyg) ((vnb) cdiVar3.getValue()).a();
                    String str6 = gygVar != null ? gygVar.b : null;
                    if (str6 == null) {
                        str6 = "";
                    }
                    context2.getClass();
                    e93Var2.getClass();
                    SeasonPickerBottomSheet seasonPickerBottomSheet = new SeasonPickerBottomSheet();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("SLOT_INDEX", e93Var2.name());
                    if (num != null) {
                        bundle2.putInt("SELECTED_TOURNAMENT_ID", num.intValue());
                    }
                    bundle2.putString("SPORT", str6);
                    seasonPickerBottomSheet.setArguments(bundle2);
                    Unit unit2 = Unit.a;
                    if (context2 instanceof csk) {
                        context2 = ((csk) context2).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity2 = context2 instanceof AppCompatActivity ? (AppCompatActivity) context2 : null;
                    if (appCompatActivity2 != null) {
                        wca.x(appCompatActivity2.getLifecycle()).b(new r1(seasonPickerBottomSheet, appCompatActivity2, rq3Var, i7));
                    }
                }
                return Unit.a;
            case 15:
                gv9 gv9Var = (gv9) this.b;
                String str7 = (String) this.c;
                gyg gygVar2 = (gyg) obj;
                gygVar2.getClass();
                return gyg.a(gygVar2, null, null, null, gv9Var, str7, 63);
            case 16:
                return gyg.a((gyg) obj, null, (tee) this.b, (gv9) this.c, null, null, 207);
            case 17:
                qq3 qq3Var = (qq3) this.b;
                bqg bqgVar = (bqg) this.c;
                Bundle bundle3 = (Bundle) obj;
                bundle3.getClass();
                bqgVar.getClass();
                return new dqg(bundle3, bqgVar).y(qq3Var);
            case 18:
                Function0 function0 = (Function0) this.b;
                ((e1d) this.c).setValue(Boolean.FALSE);
                function0.invoke();
                return Unit.a;
            case 19:
                vfi vfiVar = (vfi) this.b;
                hth hthVar = (hth) this.c;
                f4g f4gVar = (f4g) obj;
                f4gVar.getClass();
                f4gVar.k(((Number) vfiVar.e.d()).floatValue());
                f4gVar.l(((Number) vfiVar.f.d()).floatValue());
                f4gVar.b(hthVar.f ? ((Number) vfiVar.g.d()).floatValue() : 1.0f);
                return Unit.a;
            case 20:
                u6b u6bVar2 = (u6b) this.b;
                e1d e1dVar2 = (e1d) this.c;
                ((o55) obj).getClass();
                ga gaVar2 = new ga(e1dVar2, i2);
                u6bVar2.getLifecycle().a(gaVar2);
                return new vx0(i3, u6bVar2, gaVar2);
            case 21:
                a10 a10Var = (a10) this.b;
                q50 q50Var = (q50) this.c;
                ha5 ha5Var2 = (ha5) obj;
                ha5Var2.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var2.n() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L));
                Bitmap bitmap = a10Var.a;
                float height = (intBitsToFloat2 / bitmap.getHeight()) * 1.5f;
                float width = bitmap.getWidth() * height;
                float height2 = bitmap.getHeight() * height;
                float H02 = ha5Var2.H0(12.0f);
                double radians = Math.toRadians(((Number) q50Var.d()).floatValue());
                double d = H02;
                float cos = (float) (Math.cos(radians) * d);
                float sin = (float) (Math.sin(radians) * d);
                float e = wt3.e(intBitsToFloat, width, 2.0f, cos);
                float e2 = wt3.e(intBitsToFloat2, height2, 2.0f, sin);
                ((hpo) ha5Var2.L0().a).I(e, e2);
                try {
                    ha5.H(ha5Var2, a10Var, 0L, (((int) width) << 32) | (((int) height2) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 1006);
                    ((hpo) ha5Var2.L0().a).I(-e, -e2);
                    return Unit.a;
                } catch (Throwable th4) {
                    ((hpo) ha5Var2.L0().a).I(-e, -e2);
                    throw th4;
                }
            case 22:
                TypeHeaderView typeHeaderView = (TypeHeaderView) this.b;
                StageDetailsRankingFragment stageDetailsRankingFragment = (StageDetailsRankingFragment) this.c;
                String str8 = (String) obj;
                str8.getClass();
                if (!str8.equals("DRIVER")) {
                    if (!str8.equals("CONSTRUCTOR")) {
                        ilg.c();
                        return null;
                    }
                    String string3 = typeHeaderView.getResources().getString(R.string.formula_constructors);
                    string3.getClass();
                    return string3;
                }
                joa joaVar = l5i.a;
                Context context3 = typeHeaderView.getContext();
                context3.getClass();
                UniqueStage uniqueStage = stageDetailsRankingFragment.D().h;
                if (uniqueStage == null || (str = uniqueStage.getName()) == null) {
                    str = "";
                }
                return l5i.c(context3, 4, str);
            case 23:
                StageDetailsResultsFragment stageDetailsResultsFragment = (StageDetailsResultsFragment) this.b;
                TvChannelData tvChannelData = (TvChannelData) this.c;
                int intValue3 = ((Integer) obj).intValue();
                g4i G = stageDetailsResultsFragment.G();
                xw3.L(un0.z(G), null, null, new z23(G, intValue3, tvChannelData, o3k.a, (rq3) null, 18), 3);
                return Unit.a;
            case 24:
                jai jaiVar = (jai) this.b;
                gai gaiVar = (gai) this.c;
                cai caiVar = (cai) obj;
                caiVar.getClass();
                jaiVar.t = caiVar;
                d7a.F(gaiVar.b, caiVar);
                Map map = SofaBackupAgent.b;
                aik.h0();
                jaiVar.A();
                return Unit.a;
            case 25:
                Integer num2 = (Integer) this.b;
                Integer num3 = (Integer) this.c;
                String str9 = (String) obj;
                str9.getClass();
                Integer intOrNull2 = StringsKt.toIntOrNull(str9);
                if (intOrNull2 != null && (intValue = intOrNull2.intValue()) >= num2.intValue() && intValue <= num3.intValue()) {
                    r13 = true;
                }
                return Boolean.valueOf(r13);
            case 26:
                ku3 ku3Var = (ku3) this.b;
                gmh gmhVar = (gmh) this.c;
                fpi fpiVar = (fpi) obj;
                fpiVar.getClass();
                if (fpiVar == fpi.a || fpiVar == fpi.b) {
                    xw3.L(ku3Var, null, null, new w9g(gmhVar, rq3Var, 22), 3);
                    r13 = true;
                }
                return Boolean.valueOf(r13);
            case 27:
                bri briVar = (bri) this.b;
                ari ariVar = (ari) this.c;
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                briVar.b.a0(glgVar2, ariVar);
                return Unit.a;
            case 28:
                TVScheduleActivity tVScheduleActivity = (TVScheduleActivity) this.b;
                h4k h4kVar = (h4k) this.c;
                ArrayList arrayList3 = h4kVar.l;
                Map map2 = (Map) obj;
                Calendar calendar = tVScheduleActivity.M;
                if (calendar != null) {
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.getClass();
                    calendar2.set(11, 0);
                    calendar2.set(12, 0);
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                r13 = arrayList3.size() == 0;
                for (Calendar calendar3 : map2.keySet()) {
                    if (r13) {
                        calendar3.getClass();
                        TVScheduleFragment tVScheduleFragment = new TVScheduleFragment();
                        tVScheduleFragment.setArguments(fz8.C(fz8.G("ARG_DAY", calendar3)));
                        arrayList3.add(tVScheduleFragment);
                        h4kVar.notifyItemInserted(arrayList3.size());
                        wrf.d(h4kVar.j, Math.max(1, arrayList3.size() - 1));
                        h4kVar.k.q();
                    }
                }
                tVScheduleActivity.M = Calendar.getInstance();
                View view2 = tVScheduleActivity.N;
                if (view2 != null && view2.getVisibility() == 0 && (view = tVScheduleActivity.N) != null) {
                    view.setVisibility(8);
                }
                return Unit.a;
            default:
                TeamActivity teamActivity = (TeamActivity) this.b;
                Team team = (Team) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i11 = TeamActivity.Z;
                if (booleanValue) {
                    p1f z2 = teamActivity.z();
                    int a0 = teamActivity.a0();
                    qef qefVar = qef.TEAM;
                    if (z2.a(new y0f(a0, qefVar))) {
                        nui X = teamActivity.X();
                        X.g.b(X.i, qefVar);
                    }
                } else if (!tz9.G(teamActivity.Y())) {
                    Set set = aef.a;
                    x0f b2 = aef.b(teamActivity, team, fv.TEAM_SCREEN);
                    if (b2 != null && teamActivity.z().a(b2)) {
                        aef.c(teamActivity.A(), b2.i);
                    }
                }
                return Unit.a;
        }
    }
}
