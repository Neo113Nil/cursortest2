package defpackage;

import android.os.Bundle;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.ironsource.W3;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Referee;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.event.aiInsights.SofascoreAnalystTennisPromoBottomSheet;
import com.sofascore.results.event.aiInsights.SofascoreAnalystWorldCupOfferBottomSheet;
import com.sofascore.results.event.details.view.tv.dialog.TvChannelContributionDialog;
import com.sofascore.results.event.details.view.tv.model.TvChannelData;
import com.sofascore.results.main.leagues.StageCategoryEventsFragment;
import com.sofascore.results.main.matches.redesign.sportreorder.SportReorderComposeDialogFragment;
import com.sofascore.results.main.search.SearchActivity;
import com.sofascore.results.player.statistics.compare.seasonpicker.SeasonPickerBottomSheet;
import com.sofascore.results.stagesport.StageTeamOddsView;
import com.sofascore.results.stagesport.fragments.category.StageCategoryOddsFragment;
import com.sofascore.results.stagesport.fragments.details.StageDetailsResultsFragment;
import com.sofascore.results.stagesport.fragments.odds.StageOddsFragment;
import com.sofascore.results.stagesport.fragments.raceFlow.StageDetailsRaceFlowFragment;
import com.sofascore.results.stagesport.fragments.team.driver.StageDriverEventsFragment;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class fvg implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fvg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v64, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object[], java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Integer] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Collection w0;
        int i = this.a;
        l4h l4hVar = null;
        int i2 = 2;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ivg ivgVar = (ivg) obj3;
                xw3.L(ivgVar.Y0(), null, null, new hvg(ivgVar, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 1:
                SearchActivity searchActivity = (SearchActivity) obj3;
                ((Integer) obj).getClass();
                int i3 = SearchActivity.Q;
                obj2.getClass();
                if (obj2 instanceof Player) {
                    searchActivity.S().k(((Player) obj2).getId(), SearchResponseKt.PLAYER_ENTITY);
                } else if (obj2 instanceof Team) {
                    searchActivity.S().k(((Team) obj2).getId(), "team");
                } else if (obj2 instanceof UniqueTournament) {
                    searchActivity.S().k(((UniqueTournament) obj2).getId(), SearchResponseKt.LEAGUE_ENTITY);
                } else if (obj2 instanceof Manager) {
                    searchActivity.S().k(((Manager) obj2).getId(), SearchResponseKt.MANAGER_ENTITY);
                } else if (obj2 instanceof Referee) {
                    searchActivity.S().k(((Referee) obj2).getId(), SearchResponseKt.REFEREE_ENTITY);
                } else if (obj2 instanceof Event) {
                    searchActivity.S().k(((Event) obj2).getId(), "event");
                } else if (obj2 instanceof UniqueStage) {
                    searchActivity.S().k(((UniqueStage) obj2).getId(), SearchResponseKt.UNIQUE_STAGE_ENTITY);
                } else if (obj2 instanceof Stage) {
                    searchActivity.S().k(((Stage) obj2).getId(), "stage");
                } else if (obj2 instanceof Sport) {
                    searchActivity.S().k(((Sport) obj2).getId(), SearchResponseKt.SPORT_ENTITY);
                }
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                fyg.g((pyg) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 3:
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                float f = fyg.a;
                ((xnh) obj3).i(floatValue);
                return Unit.a;
            case 4:
                SeasonPickerBottomSheet seasonPickerBottomSheet = (SeasonPickerBottomSheet) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    pyg pygVar = (pyg) seasonPickerBottomSheet.C.getValue();
                    e93 e93Var = (e93) seasonPickerBottomSheet.D.getValue();
                    Bundle arguments = seasonPickerBottomSheet.getArguments();
                    if (arguments != null) {
                        int i4 = arguments.getInt("SELECTED_TOURNAMENT_ID", -1);
                        ?? valueOf = Integer.valueOf(i4);
                        if (i4 != -1) {
                            l4hVar = valueOf;
                        }
                    }
                    boolean i5 = av8Var.i(seasonPickerBottomSheet);
                    Object O = av8Var.O();
                    if (i5 || O == nf3.a) {
                        fl8 fl8Var = new fl8(0, seasonPickerBottomSheet, SeasonPickerBottomSheet.class, "dismiss", "dismiss()V", 0, 17);
                        av8Var.n0(fl8Var);
                        O = fl8Var;
                    }
                    gz8.b(pygVar, e93Var, l4hVar, (Function0) ((KFunction) O), av8Var, 0);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 5:
                pmi pmiVar = (pmi) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    td4.G(pmiVar.c.getId(), bkh.l(utc.a, 64.0f), false, 0L, av8Var2, 48, 12);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 6:
                return SegmentedButtonsView.j((SegmentedButtonsView) obj3, (of3) obj, ((Integer) obj2).intValue());
            case 7:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj3;
                snapshotStateList.add(((Integer) obj2).intValue(), (hzh) snapshotStateList.remove(((Integer) obj).intValue()));
                return Unit.a;
            case 8:
                ((mze) obj).a();
                ((esf) obj3).a = ((dnd) obj2).a;
                return Unit.a;
            case 9:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                for (jnd jndVar : ((zgh) obj3).b) {
                    jndVar.a.i(obj, Boolean.valueOf(booleanValue != Intrinsics.c(jndVar.a.a.get(obj), Boolean.TRUE)));
                }
                return Unit.a;
            case 10:
                aih aihVar = (aih) obj3;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    aihVar.b.a(0, av8Var3);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 11:
                vih vihVar = (vih) obj3;
                Set set = (Set) obj;
                synchronized (vihVar.b) {
                    try {
                        y0d y0dVar = vihVar.e;
                        if (y0dVar != null) {
                            Object[] objArr = y0dVar.b;
                            long[] jArr = y0dVar.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j = jArr[i6];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 < i7) {
                                                if ((255 & j) >= 128 || !set.contains(objArr[(i6 << 3) + i8])) {
                                                    j >>= 8;
                                                    i8++;
                                                } else {
                                                    l4hVar = vihVar.g;
                                                }
                                            } else if (i7 != 8) {
                                            }
                                        }
                                    }
                                    if (i6 != length) {
                                        i6++;
                                    }
                                }
                            }
                        } else if (CollectionsKt.R(set, vihVar.c)) {
                            l4hVar = vihVar.g;
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (l4hVar != null) {
                    l4hVar.d(Unit.a);
                }
                return Unit.a;
            case 12:
                a5f a5fVar = (a5f) obj3;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = (AtomicReference) a5fVar.d;
                while (true) {
                    Object obj4 = atomicReference.get();
                    if (obj4 == null) {
                        w0 = collection;
                    } else if (obj4 instanceof Set) {
                        w0 = b.j(new Set[]{obj4, collection});
                    } else {
                        if (!(obj4 instanceof List)) {
                            sf3.b("Unexpected notification");
                            pvd.x();
                            return null;
                        }
                        w0 = CollectionsKt.w0(a.c(collection), (Collection) obj4);
                    }
                    while (!atomicReference.compareAndSet(obj4, w0)) {
                        if (atomicReference.get() != obj4) {
                            break;
                        }
                    }
                    if (a5fVar.c()) {
                        ((Function1) a5fVar.c).invoke(new e6g(a5fVar, 22));
                    }
                    return Unit.a;
                    break;
                }
            case 13:
                w8l w8lVar = (w8l) obj3;
                ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) ((of3) obj);
                av8Var4.d0(1369412108);
                av8Var4.s(false);
                return w8lVar;
            case 14:
                ((Integer) obj2).getClass();
                vsh.a((hth) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 15:
                ((Integer) obj2).getClass();
                o6a.b((vy8) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 16:
                SofascoreAnalystTennisPromoBottomSheet sofascoreAnalystTennisPromoBottomSheet = (SofascoreAnalystTennisPromoBottomSheet) obj3;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                a99 a99Var = nf3.a;
                av8 av8Var5 = (av8) of3Var4;
                if (av8Var5.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    guh guhVar = (guh) sofascoreAnalystTennisPromoBottomSheet.E.getValue();
                    boolean i9 = av8Var5.i(sofascoreAnalystTennisPromoBottomSheet);
                    Object O2 = av8Var5.O();
                    if (i9 || O2 == a99Var) {
                        O2 = new fuh(sofascoreAnalystTennisPromoBottomSheet, i2);
                        av8Var5.n0(O2);
                    }
                    Function0 function0 = (Function0) O2;
                    boolean i10 = av8Var5.i(sofascoreAnalystTennisPromoBottomSheet);
                    Object O3 = av8Var5.O();
                    if (i10 || O3 == a99Var) {
                        fl8 fl8Var2 = new fl8(0, sofascoreAnalystTennisPromoBottomSheet, SofascoreAnalystTennisPromoBottomSheet.class, "dismiss", "dismiss()V", 0, 18);
                        av8Var5.n0(fl8Var2);
                        O3 = fl8Var2;
                    }
                    y6a.e(guhVar, function0, (Function0) ((KFunction) O3), null, av8Var5, 0);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 17:
                ((Integer) obj2).getClass();
                ((iuh) obj3).a(aba.K(1), (of3) obj);
                return Unit.a;
            case 18:
                SofascoreAnalystWorldCupOfferBottomSheet sofascoreAnalystWorldCupOfferBottomSheet = (SofascoreAnalystWorldCupOfferBottomSheet) obj3;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                a99 a99Var2 = nf3.a;
                av8 av8Var6 = (av8) of3Var5;
                if (av8Var6.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    boolean i11 = av8Var6.i(sofascoreAnalystWorldCupOfferBottomSheet);
                    Object O4 = av8Var6.O();
                    if (i11 || O4 == a99Var2) {
                        O4 = new e6g(sofascoreAnalystWorldCupOfferBottomSheet, 27);
                        av8Var6.n0(O4);
                    }
                    Function0 function02 = (Function0) O4;
                    boolean i12 = av8Var6.i(sofascoreAnalystWorldCupOfferBottomSheet);
                    Object O5 = av8Var6.O();
                    if (i12 || O5 == a99Var2) {
                        fl8 fl8Var3 = new fl8(0, sofascoreAnalystWorldCupOfferBottomSheet, SofascoreAnalystWorldCupOfferBottomSheet.class, "dismiss", "dismiss()V", 0, 19);
                        av8Var6.n0(fl8Var3);
                        O5 = fl8Var3;
                    }
                    d7a.k(0, av8Var6, null, function02, (Function0) ((KFunction) O5));
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 19:
                SportReorderComposeDialogFragment sportReorderComposeDialogFragment = (SportReorderComposeDialogFragment) obj3;
                of3 of3Var6 = (of3) obj;
                int intValue6 = ((Integer) obj2).intValue();
                a99 a99Var3 = nf3.a;
                av8 av8Var7 = (av8) of3Var6;
                if (av8Var7.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    a0i a0iVar = (a0i) sportReorderComposeDialogFragment.A.getValue();
                    boolean i13 = av8Var7.i(sportReorderComposeDialogFragment);
                    Object O6 = av8Var7.O();
                    if (i13 || O6 == a99Var3) {
                        O6 = new qfg(sportReorderComposeDialogFragment, 26);
                        av8Var7.n0(O6);
                    }
                    Function1 function1 = (Function1) O6;
                    boolean i14 = av8Var7.i(sportReorderComposeDialogFragment);
                    Object O7 = av8Var7.O();
                    if (i14 || O7 == a99Var3) {
                        fl8 fl8Var4 = new fl8(0, sportReorderComposeDialogFragment, SportReorderComposeDialogFragment.class, "dismiss", "dismiss()V", 0, 20);
                        av8Var7.n0(fl8Var4);
                        O7 = fl8Var4;
                    }
                    wca.g(a0iVar, function1, (Function0) ((KFunction) O7), av8Var7, 0);
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 20:
                StageCategoryEventsFragment stageCategoryEventsFragment = (StageCategoryEventsFragment) obj3;
                of3 of3Var7 = (of3) obj;
                int intValue7 = ((Integer) obj2).intValue();
                av8 av8Var8 = (av8) of3Var7;
                if (av8Var8.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    List<StageSeason> list = (List) ((eoh) stageCategoryEventsFragment.x).getValue();
                    ArrayList arrayList = new ArrayList(k13.r(list, 10));
                    for (StageSeason stageSeason : list) {
                        arrayList.add(new oxh(stageSeason, stageSeason.getYear(), null, null, null, false, 252));
                    }
                    gv9 W = l6g.W(arrayList);
                    Iterator it = W.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ?? next = it.next();
                            if (Intrinsics.c(((oxh) next).a, (StageSeason) ((eoh) stageCategoryEventsFragment.y).getValue())) {
                                l4hVar = next;
                            }
                        }
                    }
                    oxh oxhVar = (oxh) l4hVar;
                    boolean i15 = av8Var8.i(stageCategoryEventsFragment);
                    Object O8 = av8Var8.O();
                    if (i15 || O8 == nf3.a) {
                        O8 = new i1i(stageCategoryEventsFragment, 4);
                        av8Var8.n0(O8);
                    }
                    r4a.j(W, oxhVar, (Function1) O8, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var8, 0, W3.l);
                } else {
                    av8Var8.W();
                }
                return Unit.a;
            case 21:
                StageCategoryOddsFragment stageCategoryOddsFragment = (StageCategoryOddsFragment) obj3;
                of3 of3Var8 = (of3) obj;
                int intValue8 = ((Integer) obj2).intValue();
                av8 av8Var9 = (av8) of3Var8;
                if (av8Var9.T(intValue8 & 1, (intValue8 & 3) != 2)) {
                    w3a.g(stageCategoryOddsFragment.D(), av8Var9, 0);
                } else {
                    av8Var9.W();
                }
                return Unit.a;
            case 22:
                StageDetailsRaceFlowFragment stageDetailsRaceFlowFragment = (StageDetailsRaceFlowFragment) obj3;
                of3 of3Var9 = (of3) obj;
                int intValue9 = ((Integer) obj2).intValue();
                av8 av8Var10 = (av8) of3Var9;
                if (av8Var10.T(intValue9 & 1, (intValue9 & 3) != 2)) {
                    rha.g((d3i) stageDetailsRaceFlowFragment.r.getValue(), av8Var10, 0);
                } else {
                    av8Var10.W();
                }
                return Unit.a;
            case 23:
                ((Integer) obj2).getClass();
                rha.g((d3i) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 24:
                StageDetailsResultsFragment stageDetailsResultsFragment = (StageDetailsResultsFragment) obj3;
                String str = (String) obj;
                TvChannelData tvChannelData = (TvChannelData) obj2;
                str.getClass();
                tvChannelData.getClass();
                String str2 = tvChannelData.d;
                str2.getClass();
                TvChannelContributionDialog tvChannelContributionDialog = new TvChannelContributionDialog();
                tvChannelContributionDialog.setArguments(fz8.C(fz8.H("ARG_COUNTRY_CODE", str), fz8.H("ARG_TV_CHANNEL_NAME", str2)));
                tvChannelContributionDialog.H = new aaf(23, stageDetailsResultsFragment, tvChannelData);
                tvChannelContributionDialog.p(stageDetailsResultsFragment.requireActivity().k(), tvChannelContributionDialog.getTag());
                return Unit.a;
            case 25:
                StageDriverEventsFragment stageDriverEventsFragment = (StageDriverEventsFragment) obj3;
                of3 of3Var10 = (of3) obj;
                int intValue10 = ((Integer) obj2).intValue();
                av8 av8Var11 = (av8) of3Var10;
                if (av8Var11.T(intValue10 & 1, (intValue10 & 3) != 2)) {
                    List<StageSeason> list2 = (List) ((eoh) stageDriverEventsFragment.v).getValue();
                    ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                    for (StageSeason stageSeason2 : list2) {
                        arrayList2.add(new oxh(stageSeason2, c.r(stageSeason2.getDescription(), dmi.q(" ", stageSeason2.getYear()), " • " + stageSeason2.getYear(), false), null, null, null, false, 252));
                    }
                    gv9 W2 = l6g.W(arrayList2);
                    Iterator it2 = W2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ?? next2 = it2.next();
                            if (Intrinsics.c(((oxh) next2).a, (StageSeason) ((eoh) stageDriverEventsFragment.w).getValue())) {
                                l4hVar = next2;
                            }
                        }
                    }
                    oxh oxhVar2 = (oxh) l4hVar;
                    boolean i16 = av8Var11.i(stageDriverEventsFragment);
                    Object O9 = av8Var11.O();
                    if (i16 || O9 == nf3.a) {
                        O9 = new w4i(stageDriverEventsFragment, i2);
                        av8Var11.n0(O9);
                    }
                    r4a.j(W2, oxhVar2, (Function1) O9, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var11, 0, W3.l);
                } else {
                    av8Var11.W();
                }
                return Unit.a;
            case 26:
                ((Integer) obj2).getClass();
                d5i.b((e5i) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 27:
                StageOddsFragment stageOddsFragment = (StageOddsFragment) obj3;
                of3 of3Var11 = (of3) obj;
                int intValue11 = ((Integer) obj2).intValue();
                av8 av8Var12 = (av8) of3Var11;
                if (av8Var12.T(intValue11 & 1, (intValue11 & 3) != 2)) {
                    w3a.g(stageOddsFragment.D(), av8Var12, 0);
                } else {
                    av8Var12.W();
                }
                return Unit.a;
            case 28:
                ((Integer) obj2).getClass();
                w3a.g((j6i) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                int i17 = StageTeamOddsView.n;
                ((StageTeamOddsView) obj3).a(aba.K(1), (of3) obj);
                return Unit.a;
        }
    }

    public /* synthetic */ fvg(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
