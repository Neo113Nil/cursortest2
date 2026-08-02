package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.model.buzzer.APIBuzzerTile;
import com.sofascore.model.mvvm.model.AiAnalystDemoEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.Question;
import com.sofascore.model.newNetwork.Survey;
import com.sofascore.model.newNetwork.SurveyAnswer;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsInfo;
import com.sofascore.results.ads.ui.SofascoreAnalystDemoEventBottomSheet;
import com.sofascore.results.dialog.PlayerPositionsModal;
import com.sofascore.results.dialog.SettingsBottomSheetModal;
import com.sofascore.results.dialog.SettingsItem;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.details.view.promotion.PromotionBannerView;
import com.sofascore.results.event.lineups.view.RugbyLineupsFieldView;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.main.SurveyActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.player.details.PlayerDetailsFragment;
import com.sofascore.results.player.details.view.PlayerCompareView;
import com.sofascore.results.player.statistics.career.PlayerCareerStatisticsFragment;
import com.sofascore.results.player.statistics.career.modal.CareerStatsFilterModal;
import com.sofascore.results.stagesport.StageConstructorActivity;
import com.sofascore.results.stagesport.fragments.team.driver.StageDriverDetailsFragment;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.team.details.view.TeamTournamentsInfoView;
import com.sofascore.results.team.transfers.TeamTransfersModal;
import com.sofascore.results.transfers.PlayerTransfersActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class eyd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eyd(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ae, code lost:
    
        r2 = kotlin.collections.b.e(java.lang.Integer.valueOf(r3));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v3, types: [km5] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        List<PlayerSeasonStatisticsInfo> seasons;
        List G0;
        ArrayList arrayList;
        int i = this.a;
        int i2 = 3;
        ?? r7 = 0;
        r7 = 0;
        r7 = 0;
        r7 = 0;
        r7 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                q04 q04Var = (q04) obj;
                ((fyd) obj2).d.invoke(Integer.valueOf(q04Var.a), Integer.valueOf(q04Var.b));
                return;
            case 1:
                wxf wxfVar = EventActivity.h0;
                Context context = ((izd) obj2).getContext();
                context.getClass();
                wxf.B(context, ((Event) obj).getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return;
            case 2:
                PlayerCareerStatisticsFragment playerCareerStatisticsFragment = (PlayerCareerStatisticsFragment) obj2;
                yk2 yk2Var = (yk2) obj;
                krk krkVar = playerCareerStatisticsFragment.l;
                krkVar.getClass();
                AppBarLayout appBarLayout = ((xq8) krkVar).b;
                FrameLayout frameLayout = yk2Var.a;
                appBarLayout.removeView(frameLayout);
                yk2Var.b.setVisibility(8);
                bme L = playerCareerStatisticsFragment.L();
                frameLayout.getClass();
                g7.o(L, frameLayout, 6);
                Context requireContext = playerCareerStatisticsFragment.requireContext();
                requireContext.getClass();
                n9e.u(requireContext, new jp1(playerCareerStatisticsFragment.K(), i2));
                return;
            case 3:
                PlayerCareerStatisticsFragment playerCareerStatisticsFragment2 = (PlayerCareerStatisticsFragment) obj2;
                String K = playerCareerStatisticsFragment2.K();
                List H0 = CollectionsKt.H0((List) obj, new cp(playerCareerStatisticsFragment2, 25));
                PlayerCareerStatistics playerCareerStatistics = (PlayerCareerStatistics) playerCareerStatisticsFragment2.N().g.d();
                if (playerCareerStatistics != null && (seasons = playerCareerStatistics.getSeasons()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (PlayerSeasonStatisticsInfo playerSeasonStatisticsInfo : seasons) {
                        o13.v(ph0.x(new Integer[]{playerSeasonStatisticsInfo.getStartYear(), playerSeasonStatisticsInfo.getEndYear()}), arrayList2);
                    }
                    List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList2));
                    if (S0 != null && (G0 = CollectionsKt.G0(S0)) != null && G0.size() > 1) {
                        r7 = G0;
                    }
                }
                if (r7 == 0) {
                    r7 = km5.a;
                }
                CareerStatsFilterModal.CareerStatsFilterData F = playerCareerStatisticsFragment2.F();
                CareerStatsFilterModal.CareerStatsFilterData E = playerCareerStatisticsFragment2.E();
                H0.getClass();
                r7.getClass();
                F.getClass();
                E.getClass();
                CareerStatsFilterModal careerStatsFilterModal = new CareerStatsFilterModal();
                Bundle bundle = new Bundle();
                if (K == null) {
                    K = "";
                }
                bundle.putString("sport_slug", K);
                bundle.putSerializable("available_teams", new ArrayList(H0));
                bundle.putIntegerArrayList("available_years", new ArrayList<>((Collection) r7));
                bundle.putParcelable("stored_filter_data", F);
                bundle.putParcelable("initial_filter_data", E);
                careerStatsFilterModal.setArguments(bundle);
                careerStatsFilterModal.p(playerCareerStatisticsFragment2.getChildFragmentManager(), careerStatsFilterModal.getTag());
                return;
            case 4:
                ((lme) obj2).f.invoke(((xle) obj).b, Boolean.valueOf(!r8.f));
                return;
            case 5:
                TextView textView = (TextView) obj2;
                Calendar calendar = ke0.a;
                Context context2 = textView.getContext();
                context2.getClass();
                Context context3 = textView.getContext();
                context3.getClass();
                ke0.g(context2, ((r9k) obj).b(context3), 0);
                return;
            case 6:
                int i3 = PlayerCompareView.g;
                int i4 = PlayerActivity.Z;
                Context context4 = ((ImageView) obj2).getContext();
                context4.getClass();
                jle.q(context4, ((Player) obj).getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                return;
            case 7:
                int id = ((Team) obj).getId();
                int i5 = TeamActivity.Z;
                Context requireContext2 = ((PlayerDetailsFragment) obj2).requireContext();
                requireContext2.getClass();
                jle.r(requireContext2, id, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return;
            case 8:
                ((Function0) obj2).invoke();
                PopupWindow popupWindow = ((pse) obj).d;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                    return;
                }
                return;
            case 9:
                TextView textView2 = (TextView) obj2;
                Calendar calendar2 = ke0.a;
                Context context5 = textView2.getContext();
                context5.getClass();
                r9k h = ((yse) obj).h();
                Context context6 = textView2.getContext();
                context6.getClass();
                ke0.g(context5, h.b(context6), 0);
                return;
            case 10:
                Context context7 = ((zue) obj2).getContext();
                context7.getClass();
                PlayerPositionsModal playerPositionsModal = new PlayerPositionsModal();
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("GENDER", (Gender) obj);
                playerPositionsModal.setArguments(bundle2);
                if (context7 instanceof csk) {
                    context7 = ((csk) context7).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context7 instanceof AppCompatActivity ? (AppCompatActivity) context7 : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(playerPositionsModal, appCompatActivity, r7, i2));
                    return;
                }
                return;
            case 11:
                ((s26) obj2).invoke(Integer.valueOf(((nta) obj).a));
                return;
            case 12:
                z5f.l((bbi) obj2, (z5f) obj, view);
                return;
            case 13:
                PromotionBannerView promotionBannerView = (PromotionBannerView) obj2;
                bef befVar = (bef) obj;
                Function0 function0 = promotionBannerView.r;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                CardView cardView = (CardView) promotionBannerView.d.f;
                cardView.getClass();
                cardView.setVisibility(8);
                ArrayList arrayList3 = ke0.m;
                Integer num = promotionBannerView.o;
                arrayList3.add(Integer.valueOf(num != null ? num.intValue() : befVar.a));
                return;
            case 14:
                ts1 ts1Var = (ts1) obj2;
                ts1Var.h(ts1Var.b, (APIBuzzerTile) obj);
                return;
            case 15:
                PlayerData playerData = (PlayerData) obj;
                Function1 function1 = ((RugbyLineupsFieldView) obj2).a;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(playerData.getPlayer().getId()));
                    return;
                }
                return;
            case 16:
                SettingsBottomSheetModal settingsBottomSheetModal = (SettingsBottomSheetModal) obj2;
                SettingsItem settingsItem = (SettingsItem) obj;
                Function1 function12 = settingsBottomSheetModal.C;
                if (function12 != null) {
                    function12.invoke(settingsItem);
                }
                settingsBottomSheetModal.j();
                return;
            case 17:
                ts1 ts1Var2 = (ts1) obj2;
                ts1Var2.h(ts1Var2.b, (o82) obj);
                return;
            case 18:
                ((View.OnClickListener) obj).onClick(view);
                ((dmh) obj2).b(1);
                return;
            case 19:
                fy4 fy4Var = (fy4) obj2;
                fy4Var.h(fy4Var.b, (APIBuzzerTile) obj);
                return;
            case 20:
                SofascoreAnalystDemoEventBottomSheet sofascoreAnalystDemoEventBottomSheet = (SofascoreAnalystDemoEventBottomSheet) obj2;
                Context requireContext3 = sofascoreAnalystDemoEventBottomSheet.requireContext();
                requireContext3.getClass();
                nv.z0(requireContext3, kv.CLICK, "try_AI_Insights", "subscription_screen");
                wxf wxfVar2 = EventActivity.h0;
                Context requireContext4 = sofascoreAnalystDemoEventBottomSheet.requireContext();
                requireContext4.getClass();
                wxf.B(requireContext4, ((AiAnalystDemoEvent) obj).getId(), rd6.d, null, null, null, 120);
                sofascoreAnalystDemoEventBottomSheet.q();
                return;
            case 21:
                int i6 = StageConstructorActivity.R;
                Context requireContext5 = ((StageDriverDetailsFragment) obj2).requireContext();
                requireContext5.getClass();
                dff.g(((Team) obj).getId(), requireContext5);
                return;
            case 22:
                ((u6i) obj2).e.invoke((d8i) obj);
                return;
            case 23:
                SurveyActivity surveyActivity = (SurveyActivity) obj2;
                Question question = (Question) obj;
                int i7 = SurveyActivity.L;
                TextInputEditText textInputEditText = surveyActivity.N().e;
                Context context8 = textInputEditText.getContext();
                context8.getClass();
                InputMethodManager inputMethodManager = (InputMethodManager) context8.getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(textInputEditText.getWindowToken(), 0);
                }
                String valueOf = surveyActivity.N().e.getVisibility() == 0 ? String.valueOf(surveyActivity.N().e.getText()) : null;
                if (surveyActivity.N().c.getVisibility() == 0) {
                    arrayList = new ArrayList();
                    Iterator it = new tsk(surveyActivity.N().c).iterator();
                    int i8 = 0;
                    while (true) {
                        usk uskVar = (usk) it;
                        if (uskVar.hasNext()) {
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                b.q();
                                throw null;
                            }
                            Object next = uskVar.next();
                            next.getClass();
                            if (((CheckBox) next).isChecked()) {
                                arrayList.add(Integer.valueOf(i8));
                            }
                            i8 = i9;
                        }
                    }
                } else if (surveyActivity.N().d.getVisibility() == 0) {
                    Iterator it2 = new tsk(surveyActivity.N().d).iterator();
                    int i10 = 0;
                    while (true) {
                        usk uskVar2 = (usk) it2;
                        if (!uskVar2.hasNext()) {
                            i10 = 0;
                            break;
                        } else {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                b.q();
                                throw null;
                            }
                            Object next2 = uskVar2.next();
                            next2.getClass();
                            if (((RadioButton) next2).isChecked()) {
                                break;
                            } else {
                                i10 = i11;
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                aoi aoiVar = (aoi) surveyActivity.J.getValue();
                yzc yzcVar = aoiVar.f;
                SurveyAnswer surveyAnswer = new SurveyAnswer(question.getId(), arrayList, valueOf);
                ArrayList arrayList4 = aoiVar.j;
                arrayList4.add(surveyAnswer);
                int i12 = aoiVar.i + 1;
                aoiVar.i = i12;
                Survey survey = aoiVar.h;
                if (survey == null) {
                    Intrinsics.i("survey");
                    throw null;
                }
                int i13 = 20;
                if (i12 > b.i(survey.getQuestions())) {
                    yzcVar.j(null);
                    xw3.L(aoiVar.h(), null, null, new w9g(aoiVar, r7, i13), 3);
                    return;
                }
                ArrayList k = aoiVar.k(arrayList4, aoiVar.i);
                if (k.isEmpty()) {
                    yzcVar.j(null);
                    xw3.L(aoiVar.h(), null, null, new w9g(aoiVar, r7, i13), 3);
                    return;
                }
                Survey survey2 = aoiVar.h;
                if (survey2 == null) {
                    Intrinsics.i("survey");
                    throw null;
                }
                aoiVar.i = survey2.getQuestions().indexOf(k.get(0));
                yzcVar.j(k.get(0));
                return;
            case 24:
                TeamActivity teamActivity = (TeamActivity) obj2;
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                int i14 = TeamActivity.Z;
                Team Z = teamActivity.Z();
                if (Z != null) {
                    int id2 = Z.getId();
                    Context context9 = extendedFloatingActionButton.getContext();
                    context9.getClass();
                    Team Z2 = teamActivity.Z();
                    String sportSlug = Z2 != null ? Z2.getSportSlug() : null;
                    TeamTransfersModal teamTransfersModal = new TeamTransfersModal();
                    teamTransfersModal.setArguments(fz8.C(fz8.D(id2, "team_id"), fz8.H(SearchResponseKt.SPORT_ENTITY, sportSlug)));
                    Unit unit = Unit.a;
                    if (context9 instanceof csk) {
                        context9 = ((csk) context9).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity2 = context9 instanceof AppCompatActivity ? (AppCompatActivity) context9 : null;
                    if (appCompatActivity2 != null) {
                        wca.x(appCompatActivity2.getLifecycle()).b(new r1(teamTransfersModal, appCompatActivity2, r7, i2));
                        return;
                    }
                    return;
                }
                return;
            case 25:
                fy4 fy4Var2 = (fy4) obj2;
                fy4Var2.h(fy4Var2.b, (APIBuzzerTile) obj);
                return;
            case 26:
                int i15 = TeamTournamentsInfoView.e;
                a99 a99Var = LeagueActivity.h0;
                Context context10 = ((TeamTournamentsInfoView) obj2).getContext();
                context10.getClass();
                a99.A(a99Var, context10, Integer.valueOf(((UniqueTournament) obj).getId()), 0, null, null, null, null, 4088);
                return;
            case 27:
                int i16 = PlayerTransfersActivity.R;
                Context context11 = ((MaterialButton) obj2).getContext();
                context11.getClass();
                context11.startActivity(new Intent(context11, (Class<?>) PlayerTransfersActivity.class));
                ((TeamTransfersModal) obj).j();
                return;
            case 28:
                ad2 ad2Var = oc3.a;
                hs4 hs4Var = z45.a;
                xw3.L(ad2Var, rob.a, null, new h4i((ViewGroup) obj2, (xjd) obj, (rq3) r7, 15), 2);
                return;
            default:
                ts1 ts1Var3 = (ts1) obj2;
                ts1Var3.h(ts1Var3.b, (APIBuzzerTile) obj);
                return;
        }
    }
}
