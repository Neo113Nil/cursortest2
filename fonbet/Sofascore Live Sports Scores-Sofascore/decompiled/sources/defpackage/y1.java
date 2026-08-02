package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.sofascore.results.bettingtips.fragment.BetBoostFragment;
import com.sofascore.results.bettingtips.fragment.DroppingOddsFragment;
import com.sofascore.results.chat.addcountry.ChatCountryFlagBottomSheet;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import com.sofascore.results.chat.fragment.CommentsChatFragment;
import com.sofascore.results.crowdsourcing.CrowdsourcingDeleteIncidentModal;
import com.sofascore.results.crowdsourcing.CrowdsourcingIncidentDetailsFullScreenDialog;
import com.sofascore.results.dialog.AdditionalOddsModal;
import com.sofascore.results.dialog.CupTreeDialog;
import com.sofascore.results.event.commentary.baseball.BaseballCommentaryModal;
import com.sofascore.results.league.fragment.cuptree.BaseCupTreeFragment;
import com.sofascore.results.main.matches.redesign.chronologicalmatches.ChronologicalMatchesFragment;
import com.sofascore.results.main.matches.redesign.competitions.CompetitionsFragment;
import com.sofascore.results.main.matches.redesign.datematches.DateMatchesFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.player.EditPlayerDialog;
import com.sofascore.results.player.EditPlayerTransferDialog;
import com.sofascore.results.player.statistics.compare.search.CompareSearchBottomSheet;
import com.sofascore.results.player.statistics.compare.search.CompareSearchModal;
import com.sofascore.results.player.statistics.season.baseball.BaseballPlayerSeasonStatisticsFragment;
import com.sofascore.results.settings.developer.DeveloperOptionsFullScreenDialog;
import com.sofascore.results.sharemodal.shared.BaseShareStandingsModal;
import com.sofascore.results.team.editteam.EditTeamDialog;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y1 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(int i, Object obj, Object obj2) {
        super(0);
        this.i = i;
        this.k = obj;
        this.j = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        h79 h79Var;
        qtk defaultViewModelProviderFactory;
        qtk defaultViewModelProviderFactory2;
        boolean dispatchKeyEvent;
        boolean dispatchGenericMotionEvent;
        s3h s3hVar;
        wma wmaVar;
        qtk defaultViewModelProviderFactory3;
        qtk defaultViewModelProviderFactory4;
        qtk defaultViewModelProviderFactory5;
        qtk defaultViewModelProviderFactory6;
        qtk defaultViewModelProviderFactory7;
        qtk defaultViewModelProviderFactory8;
        qtk defaultViewModelProviderFactory9;
        oqf oqfVar;
        qtk defaultViewModelProviderFactory10;
        qtk defaultViewModelProviderFactory11;
        qtk defaultViewModelProviderFactory12;
        qtk defaultViewModelProviderFactory13;
        qtk defaultViewModelProviderFactory14;
        qtk defaultViewModelProviderFactory15;
        qtk defaultViewModelProviderFactory16;
        qtk defaultViewModelProviderFactory17;
        qtk defaultViewModelProviderFactory18;
        qtk defaultViewModelProviderFactory19;
        qtk defaultViewModelProviderFactory20;
        qtk defaultViewModelProviderFactory21;
        qtk defaultViewModelProviderFactory22;
        qtk defaultViewModelProviderFactory23;
        qtk defaultViewModelProviderFactory24;
        int i = this.i;
        Object obj = this.k;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                ttk ttkVar = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar instanceof h79 ? (h79) ttkVar : null;
                return (h79Var == null || (defaultViewModelProviderFactory = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((AbstractChatFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            case 1:
                ttk ttkVar2 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar2 instanceof h79 ? (h79) ttkVar2 : null;
                return (h79Var == null || (defaultViewModelProviderFactory2 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((AdditionalOddsModal) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory2;
            case 2:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj2);
                return Boolean.valueOf(dispatchKeyEvent);
            case 3:
                dispatchGenericMotionEvent = super/*android.view.View*/.dispatchGenericMotionEvent((MotionEvent) obj2);
                return Boolean.valueOf(dispatchGenericMotionEvent);
            case 4:
                dz dzVar = (dz) obj2;
                nug nugVar = (nug) obj;
                wtg wtgVar = nugVar.e;
                wtg wtgVar2 = nugVar.f;
                Float f = nugVar.c;
                Float f2 = nugVar.d;
                float floatValue = (wtgVar == null || f == null) ? 0.0f : ((Number) wtgVar.a.invoke()).floatValue() - f.floatValue();
                float floatValue2 = (wtgVar2 == null || f2 == null) ? 0.0f : ((Number) wtgVar2.a.invoke()).floatValue() - f2.floatValue();
                if (floatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || floatValue2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    int A = dzVar.A(nugVar.a);
                    u3h u3hVar = (u3h) dzVar.s().b(dzVar.k);
                    if (u3hVar != null) {
                        try {
                            da daVar = dzVar.m;
                            if (daVar != null) {
                                daVar.j(dzVar.k(u3hVar));
                                Unit unit = Unit.a;
                            }
                        } catch (IllegalStateException unused) {
                            Unit unit2 = Unit.a;
                        }
                    }
                    u3h u3hVar2 = (u3h) dzVar.s().b(dzVar.l);
                    if (u3hVar2 != null) {
                        try {
                            da daVar2 = dzVar.n;
                            if (daVar2 != null) {
                                daVar2.j(dzVar.k(u3hVar2));
                                Unit unit3 = Unit.a;
                            }
                        } catch (IllegalStateException unused2) {
                            Unit unit4 = Unit.a;
                        }
                    }
                    dzVar.d.invalidate();
                    u3h u3hVar3 = (u3h) dzVar.s().b(A);
                    if (u3hVar3 != null && (s3hVar = u3hVar3.a) != null && (wmaVar = s3hVar.c) != null) {
                        if (wtgVar != null) {
                            dzVar.p.i(A, wtgVar);
                        }
                        if (wtgVar2 != null) {
                            dzVar.q.i(A, wtgVar2);
                        }
                        dzVar.w(wmaVar);
                    }
                }
                if (wtgVar != null) {
                    nugVar.c = (Float) wtgVar.a.invoke();
                }
                if (wtgVar2 != null) {
                    nugVar.d = (Float) wtgVar2.a.invoke();
                }
                return Unit.a;
            case 5:
                ly3 ly3Var = (ly3) ((Function0) obj).invoke();
                if (ly3Var != null) {
                    return ly3Var;
                }
                ttk ttkVar3 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar3 instanceof h79 ? (h79) ttkVar3 : null;
                return h79Var != null ? h79Var.getDefaultViewModelCreationExtras() : jy3.b;
            case 6:
                ttk ttkVar4 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar4 instanceof h79 ? (h79) ttkVar4 : null;
                return (h79Var == null || (defaultViewModelProviderFactory3 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((AbstractFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory3;
            case 7:
                ttk ttkVar5 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar5 instanceof h79 ? (h79) ttkVar5 : null;
                return (h79Var == null || (defaultViewModelProviderFactory4 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((BaseCupTreeFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory4;
            case 8:
                ttk ttkVar6 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar6 instanceof h79 ? (h79) ttkVar6 : null;
                return (h79Var == null || (defaultViewModelProviderFactory5 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((BaseShareStandingsModal) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory5;
            case 9:
                ttk ttkVar7 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar7 instanceof h79 ? (h79) ttkVar7 : null;
                return (h79Var == null || (defaultViewModelProviderFactory6 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((BaseballCommentaryModal) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory6;
            case 10:
                ttk ttkVar8 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar8 instanceof h79 ? (h79) ttkVar8 : null;
                return (h79Var == null || (defaultViewModelProviderFactory7 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((BaseballPlayerSeasonStatisticsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory7;
            case 11:
                ttk ttkVar9 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar9 instanceof h79 ? (h79) ttkVar9 : null;
                return (h79Var == null || (defaultViewModelProviderFactory8 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((Fragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory8;
            case 12:
                ttk ttkVar10 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar10 instanceof h79 ? (h79) ttkVar10 : null;
                return (h79Var == null || (defaultViewModelProviderFactory9 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((BetBoostFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory9;
            case 13:
                Function0 function0 = (Function0) obj;
                if (function0 != null && (oqfVar = (oqf) function0.invoke()) != null) {
                    return oqfVar;
                }
                wdd wddVar = (wdd) obj2;
                if (!wddVar.e1().n) {
                    wddVar = null;
                }
                if (wddVar != null) {
                    return jca.r(0L, d7a.I(wddVar.c));
                }
                return null;
            case 14:
                ((re2) obj).q.invoke((te2) obj2);
                return Unit.a;
            case 15:
                ttk ttkVar11 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar11 instanceof h79 ? (h79) ttkVar11 : null;
                return (h79Var == null || (defaultViewModelProviderFactory10 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((ChatCountryFlagBottomSheet) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory10;
            case 16:
                ttk ttkVar12 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar12 instanceof h79 ? (h79) ttkVar12 : null;
                return (h79Var == null || (defaultViewModelProviderFactory11 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((ChronologicalMatchesFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory11;
            case 17:
                ttk ttkVar13 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar13 instanceof h79 ? (h79) ttkVar13 : null;
                return (h79Var == null || (defaultViewModelProviderFactory12 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((CommentsChatFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory12;
            case 18:
                ttk ttkVar14 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar14 instanceof h79 ? (h79) ttkVar14 : null;
                return (h79Var == null || (defaultViewModelProviderFactory13 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((CompareSearchBottomSheet) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory13;
            case 19:
                ttk ttkVar15 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar15 instanceof h79 ? (h79) ttkVar15 : null;
                return (h79Var == null || (defaultViewModelProviderFactory14 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((CompareSearchModal) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory14;
            case 20:
                ttk ttkVar16 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar16 instanceof h79 ? (h79) ttkVar16 : null;
                return (h79Var == null || (defaultViewModelProviderFactory15 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((CompetitionsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory15;
            case 21:
                ttk ttkVar17 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar17 instanceof h79 ? (h79) ttkVar17 : null;
                return (h79Var == null || (defaultViewModelProviderFactory16 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((CrowdsourcingDeleteIncidentModal) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory16;
            case 22:
                ttk ttkVar18 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar18 instanceof h79 ? (h79) ttkVar18 : null;
                return (h79Var == null || (defaultViewModelProviderFactory17 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((CrowdsourcingIncidentDetailsFullScreenDialog) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory17;
            case 23:
                ttk ttkVar19 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar19 instanceof h79 ? (h79) ttkVar19 : null;
                return (h79Var == null || (defaultViewModelProviderFactory18 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((CupTreeDialog) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory18;
            case 24:
                ttk ttkVar20 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar20 instanceof h79 ? (h79) ttkVar20 : null;
                return (h79Var == null || (defaultViewModelProviderFactory19 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((DateMatchesFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory19;
            case 25:
                ttk ttkVar21 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar21 instanceof h79 ? (h79) ttkVar21 : null;
                return (h79Var == null || (defaultViewModelProviderFactory20 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((DeveloperOptionsFullScreenDialog) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory20;
            case 26:
                ttk ttkVar22 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar22 instanceof h79 ? (h79) ttkVar22 : null;
                return (h79Var == null || (defaultViewModelProviderFactory21 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((DroppingOddsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory21;
            case 27:
                ttk ttkVar23 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar23 instanceof h79 ? (h79) ttkVar23 : null;
                return (h79Var == null || (defaultViewModelProviderFactory22 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EditPlayerDialog) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory22;
            case 28:
                ttk ttkVar24 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar24 instanceof h79 ? (h79) ttkVar24 : null;
                return (h79Var == null || (defaultViewModelProviderFactory23 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EditPlayerTransferDialog) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory23;
            default:
                ttk ttkVar25 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar25 instanceof h79 ? (h79) ttkVar25 : null;
                return (h79Var == null || (defaultViewModelProviderFactory24 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((EditTeamDialog) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory24;
        }
    }
}
