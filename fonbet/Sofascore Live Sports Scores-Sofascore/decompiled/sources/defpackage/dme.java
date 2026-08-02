package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.PlayerHeadFlags;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentSeasons;
import com.sofascore.results.R;
import com.sofascore.results.player.statistics.career.PlayerCareerStatisticsFragment;
import com.sofascore.results.player.statistics.career.modal.CareerStatsFilterModal;
import com.sofascore.results.player.statistics.career.modal.CareerStatsTournamentPickerModal;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class dme implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerCareerStatisticsFragment b;

    public /* synthetic */ dme(PlayerCareerStatisticsFragment playerCareerStatisticsFragment, int i) {
        this.a = i;
        this.b = playerCareerStatisticsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StatisticsSeasonsResponse playerStatisticsSeasons;
        int i = this.a;
        int i2 = 2;
        boolean z = true;
        int i3 = 0;
        yk2 yk2Var = null;
        r8 = null;
        List<UniqueTournamentSeasons> list = null;
        Object obj = null;
        PlayerCareerStatisticsFragment playerCareerStatisticsFragment = this.b;
        switch (i) {
            case 0:
                LayoutInflater layoutInflater = playerCareerStatisticsFragment.getLayoutInflater();
                krk krkVar = playerCareerStatisticsFragment.l;
                krkVar.getClass();
                View inflate = layoutInflater.inflate(R.layout.career_stats_info_item, (ViewGroup) ((xq8) krkVar).c, false);
                int i4 = R.id.button_dismiss;
                ImageView imageView = (ImageView) nq8.B(R.id.button_dismiss, inflate);
                if (imageView != null) {
                    i4 = R.id.text_disclaimer;
                    TextView textView = (TextView) nq8.B(R.id.text_disclaimer, inflate);
                    if (textView != null) {
                        yk2Var = new yk2((FrameLayout) inflate, imageView, textView);
                        if (playerCareerStatisticsFragment.P()) {
                            textView.setText(R.string.baseball_career_stats_data_info);
                        }
                        imageView.setOnClickListener(new eyd(2, playerCareerStatisticsFragment, yk2Var));
                        return yk2Var;
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                return yk2Var;
            case 1:
                PlayerCareerStatisticsFragment playerCareerStatisticsFragment2 = this.b;
                Context requireContext = playerCareerStatisticsFragment2.requireContext();
                requireContext.getClass();
                SegmentedButtonsView segmentedButtonsView = new SegmentedButtonsView(requireContext, null, 6);
                Boolean bool = Boolean.FALSE;
                Pair pair = new Pair(bool, bool);
                segmentedButtonsView.k = new gme(i3, playerCareerStatisticsFragment2, segmentedButtonsView);
                segmentedButtonsView.g = false;
                segmentedButtonsView.h = pair;
                segmentedButtonsView.j = v1h.f;
                segmentedButtonsView.i = new z1h(0);
                rlh rlhVar = rlh.b;
                if (!rlhVar.isEmpty()) {
                    SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
                }
                playerCareerStatisticsFragment2.L().o.a = new v9b(1, playerCareerStatisticsFragment2, PlayerCareerStatisticsFragment.class, "onHorizontalScrollChanged", "onHorizontalScrollChanged(I)V", 0, 26);
                return segmentedButtonsView;
            case 2:
                return Boolean.valueOf(CollectionsKt.R(ph0.a0(new String[]{Sports.AMERICAN_FOOTBALL, Sports.FOOTBALL, Sports.BASEBALL, Sports.ICE_HOCKEY}), playerCareerStatisticsFragment.K()));
            case 3:
                Boolean bool2 = (Boolean) playerCareerStatisticsFragment.z.getValue();
                bool2.booleanValue();
                return bool2;
            case 4:
                Context requireContext2 = playerCareerStatisticsFragment.requireContext();
                requireContext2.getClass();
                TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext2, null, 6);
                g5k g5kVar = new g5k(typeHeaderView);
                g5kVar.m = new wt(5, playerCareerStatisticsFragment, typeHeaderView);
                g5kVar.l = true;
                g5kVar.b();
                return typeHeaderView;
            case 5:
                LayoutInflater layoutInflater2 = playerCareerStatisticsFragment.getLayoutInflater();
                krk krkVar2 = playerCareerStatisticsFragment.l;
                krkVar2.getClass();
                View inflate2 = layoutInflater2.inflate(R.layout.player_league_career_stats_header_row, (ViewGroup) ((xq8) krkVar2).c, false);
                int i5 = R.id.container;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate2);
                if (linearLayout != null) {
                    i5 = R.id.scroll_indicator_left;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.scroll_indicator_left, inflate2);
                    if (imageView2 != null) {
                        i5 = R.id.scroll_indicator_right;
                        ImageView imageView3 = (ImageView) nq8.B(R.id.scroll_indicator_right, inflate2);
                        if (imageView3 != null) {
                            i5 = R.id.scroller;
                            ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) nq8.B(R.id.scroller, inflate2);
                            if (scrollInterceptorHorizontalScrollView != null) {
                                i5 = R.id.team_label;
                                TextView textView2 = (TextView) nq8.B(R.id.team_label, inflate2);
                                if (textView2 != null) {
                                    LinearLayout linearLayout2 = (LinearLayout) inflate2;
                                    kse kseVar = new kse(linearLayout2, linearLayout, imageView2, imageView3, scrollInterceptorHorizontalScrollView, textView2);
                                    if (Intrinsics.c(playerCareerStatisticsFragment.K(), Sports.FOOTBALL)) {
                                        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                                        if (layoutParams == null) {
                                            yhk.s("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                            return null;
                                        }
                                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                        layoutParams2.width = 0;
                                        layoutParams2.weight = 1.0f;
                                        textView2.setLayoutParams(layoutParams2);
                                        ViewGroup.LayoutParams layoutParams3 = scrollInterceptorHorizontalScrollView.getLayoutParams();
                                        if (layoutParams3 == null) {
                                            yhk.s("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                            return null;
                                        }
                                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                                        Context context = linearLayout2.getContext();
                                        context.getClass();
                                        layoutParams4.width = ao2.s(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, context);
                                        layoutParams4.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        scrollInterceptorHorizontalScrollView.setLayoutParams(layoutParams4);
                                    }
                                    return kseVar;
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i5)));
                return null;
            case 6:
                List M = playerCareerStatisticsFragment.M();
                PickerItem.Tournament H = playerCareerStatisticsFragment.H();
                M.getClass();
                CareerStatsTournamentPickerModal careerStatsTournamentPickerModal = new CareerStatsTournamentPickerModal();
                Bundle bundle = new Bundle();
                bundle.putSerializable("tournaments", new ArrayList(M));
                bundle.putParcelable("selected_tournament_item", H);
                careerStatsTournamentPickerModal.setArguments(bundle);
                careerStatsTournamentPickerModal.p(playerCareerStatisticsFragment.getChildFragmentManager(), "CareerStatsTournamentPickerModal");
                return Unit.a;
            case 7:
                Bundle requireArguments = playerCareerStatisticsFragment.requireArguments();
                requireArguments.getClass();
                return (Integer) gz8.M(requireArguments, "TOURNAMENT_UNIQUE_ID", Integer.class);
            case 8:
                Context requireContext3 = playerCareerStatisticsFragment.requireContext();
                requireContext3.getClass();
                GraphicLarge graphicLarge = new GraphicLarge(requireContext3, null, 6);
                graphicLarge.setLargeDrawableResource(playerCareerStatisticsFragment.requireContext().getDrawable(R.drawable.no_data));
                String string = playerCareerStatisticsFragment.requireContext().getString(R.string.empty_search_title);
                string.getClass();
                graphicLarge.setTitleResource(string);
                String string2 = playerCareerStatisticsFragment.requireContext().getString(R.string.empty_filters_text);
                string2.getClass();
                graphicLarge.setSubtitleResource(string2);
                aba.G(graphicLarge);
                return graphicLarge;
            case 9:
                Context requireContext4 = playerCareerStatisticsFragment.requireContext();
                requireContext4.getClass();
                String str = (String) n9e.x(requireContext4, new cme(playerCareerStatisticsFragment, i2));
                Iterator<E> it = fzg.h.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (Intrinsics.c(((fzg) next).name(), str)) {
                            obj = next;
                        }
                    }
                }
                fzg fzgVar = (fzg) obj;
                if (fzgVar == null) {
                    jpe jpeVar = fzg.c;
                    String K = playerCareerStatisticsFragment.K();
                    jpeVar.getClass();
                    fzgVar = jpe.a(K);
                }
                return new CareerStatsFilterModal.CareerStatsFilterData(null, vk2.c, fzgVar, null, null);
            case 10:
                return Integer.valueOf(playerCareerStatisticsFragment.getResources().getDimensionPixelSize(R.dimen.player_career_stats_column_width));
            case 11:
                Context requireContext5 = playerCareerStatisticsFragment.requireContext();
                requireContext5.getClass();
                PlayerHeadFlags playerHeadFlags = (PlayerHeadFlags) playerCareerStatisticsFragment.C().q.d();
                if (playerHeadFlags != null && (playerStatisticsSeasons = playerHeadFlags.getPlayerStatisticsSeasons()) != null) {
                    list = playerStatisticsSeasons.getUniqueTournamentSeasons();
                }
                if (list == null) {
                    list = km5.a;
                }
                bme bmeVar = new bme(requireContext5, list, Intrinsics.c(playerCareerStatisticsFragment.K(), Sports.FOOTBALL), new eme(playerCareerStatisticsFragment, i3));
                bmeVar.a.d = new fme(playerCareerStatisticsFragment, i3);
                return bmeVar;
            case 12:
                LayoutInflater layoutInflater3 = playerCareerStatisticsFragment.getLayoutInflater();
                krk krkVar3 = playerCareerStatisticsFragment.l;
                krkVar3.getClass();
                wxc a = wxc.a(layoutInflater3, ((xq8) krkVar3).c);
                a.c.setVisibility(8);
                a.d.setVisibility(8);
                a.e.setVisibility(8);
                return a;
            default:
                if (!Intrinsics.c(playerCareerStatisticsFragment.K(), Sports.FOOTBALL) && !playerCareerStatisticsFragment.P()) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
