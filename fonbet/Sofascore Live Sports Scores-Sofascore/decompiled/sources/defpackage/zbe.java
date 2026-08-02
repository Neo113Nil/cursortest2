package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.SwitchPreference;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.network.response.PlayerEventStatisticsResponse;
import com.sofascore.model.newNetwork.AttributeOverviewData;
import com.sofascore.model.newNetwork.PlayerHeatmapResponse;
import com.sofascore.model.newNetwork.PredictedEvent;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.results.R;
import com.sofascore.results.ads.UpgradeSofascoreActivity;
import com.sofascore.results.dialog.RemoveAdsYearlyOfferBottomSheet;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.details.view.promotion.PromotionModal;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.matchOfTheWeek.MatchOfTheWeekBottomSheet;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.player.details.PlayerDetailsFragment;
import com.sofascore.results.player.dialog.PlayerPentagonDescriptionModal;
import com.sofascore.results.profile.ProfileActivity;
import com.sofascore.results.profile.view.ProfileBadgesExplanationModal;
import com.sofascore.results.referral.ReferralActivity;
import com.sofascore.results.referral.ReferralRedeemRewardBottomSheet;
import com.sofascore.results.settings.PreferenceFragment;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import com.sofascore.results.view.SuggestEditView;
import com.squareup.wire.Message;
import com.squareup.wire.internal.ReflectionKt;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class zbe implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zbe(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String Q;
        Message.Builder createRuntimeMessageAdapter$lambda$0;
        int i = this.a;
        int i2 = 2;
        int i3 = 3;
        final int i4 = 0;
        final int i5 = 1;
        rq3 rq3Var = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((znh) obj).i(((hth) obj2).b);
                return Unit.a;
            case 1:
                ((e1d) obj).setValue(Boolean.valueOf(!((Boolean) r8.getValue()).booleanValue()));
                ((ox1) obj2).invoke(Boolean.valueOf(!((Boolean) r8.getValue()).booleanValue()));
                return Unit.a;
            case 2:
                PlayerDetailsFragment playerDetailsFragment = (PlayerDetailsFragment) obj2;
                SuggestEditView suggestEditView = (SuggestEditView) obj;
                Context requireContext = playerDetailsFragment.requireContext();
                requireContext.getClass();
                pse pseVar = new pse(requireContext);
                final doe doeVar = new doe(playerDetailsFragment, i3);
                pseVar.c();
                nfc nfcVar = pseVar.g;
                if (nfcVar == null) {
                    Intrinsics.i("player1Binding");
                    throw null;
                }
                pseVar.f(nfcVar, requireContext.getString(R.string.suggest_changes), new Function0() { // from class: nse
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = i4;
                        doe doeVar2 = doeVar;
                        switch (i6) {
                            case 0:
                                doeVar2.invoke(0);
                                break;
                            default:
                                doeVar2.invoke(1);
                                break;
                        }
                        return Unit.a;
                    }
                });
                nfc nfcVar2 = pseVar.h;
                if (nfcVar2 == null) {
                    Intrinsics.i("player2Binding");
                    throw null;
                }
                pseVar.f(nfcVar2, requireContext.getString(R.string.edit_player_transfer), new Function0() { // from class: nse
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = i5;
                        doe doeVar2 = doeVar;
                        switch (i6) {
                            case 0:
                                doeVar2.invoke(0);
                                break;
                            default:
                                doeVar2.invoke(1);
                                break;
                        }
                        return Unit.a;
                    }
                });
                PopupWindow popupWindow = pseVar.d;
                if (popupWindow != null) {
                    pseVar.b(suggestEditView, popupWindow);
                }
                return Unit.a;
            case 3:
                Context context = ((ImageView) obj2).getContext();
                context.getClass();
                PlayerPentagonDescriptionModal playerPentagonDescriptionModal = new PlayerPentagonDescriptionModal();
                playerPentagonDescriptionModal.setArguments(fz8.C(fz8.G("ATTRIBUTE_OVERVIEW", (AttributeOverviewData) obj)));
                Unit unit = Unit.a;
                if (context instanceof csk) {
                    context = ((csk) context).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(playerPentagonDescriptionModal, appCompatActivity, rq3Var, i3));
                }
                return Unit.a;
            case 4:
                PlayerEventStatisticsModal playerEventStatisticsModal = (PlayerEventStatisticsModal) obj2;
                xoe xoeVar = (xoe) obj;
                p03 p03Var = playerEventStatisticsModal.B;
                RecyclerView recyclerView = (RecyclerView) p03Var.c;
                if (recyclerView == null) {
                    Intrinsics.i("recyclerView");
                    throw null;
                }
                recyclerView.setOnTouchListener(null);
                RecyclerView recyclerView2 = (RecyclerView) p03Var.c;
                if (recyclerView2 == null) {
                    Intrinsics.i("recyclerView");
                    throw null;
                }
                recyclerView2.removeOnItemTouchListener((f0e) ((mqi) p03Var.f).getValue());
                g9i g9iVar = playerEventStatisticsModal.g0;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                playerEventStatisticsModal.M = true;
                playerEventStatisticsModal.L = "ALL";
                ((FrameLayout) playerEventStatisticsModal.v().k).setVisibility(8);
                ((View) playerEventStatisticsModal.v().i).setVisibility(0);
                woe P = playerEventStatisticsModal.P();
                P.t();
                P.e.clear();
                P.f.clear();
                P.g.clear();
                P.h.clear();
                P.notifyDataSetChanged();
                View view = new View(playerEventStatisticsModal.requireContext());
                view.setLayoutParams(new ViewGroup.LayoutParams(0, 1));
                r3.p(playerEventStatisticsModal.P().g.size(), view);
                PlayerEventStatisticsResponse playerEventStatisticsResponse = playerEventStatisticsModal.T;
                if (playerEventStatisticsResponse != null) {
                    playerEventStatisticsModal.P().G(playerEventStatisticsResponse, playerEventStatisticsModal.U, playerEventStatisticsModal.M, null, null);
                }
                PlayerHeatmapResponse playerHeatmapResponse = playerEventStatisticsModal.V;
                if (playerHeatmapResponse != null) {
                    playerEventStatisticsModal.a0(xoeVar, null, playerHeatmapResponse, null, true, true);
                }
                return Unit.a;
            case 5:
                Calendar calendar = ke0.a;
                Context context2 = ((jqe) obj2).b;
                Q = hkg.Q(context2, R.string.statistic_default, Event.getHomeTeam$default(((y21) obj).d(), null, 1, null).getGender(), new Object[0]);
                ke0.g(context2, Q, 1);
                return Unit.a;
            case 6:
                int i6 = PlayerActivity.Z;
                jle.q(((pse) obj2).a, ((Player) obj).getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                return Unit.a;
            case 7:
                nte nteVar = (nte) obj;
                ((Function1) obj2).invoke(new gw7(Integer.valueOf(nteVar.k.a), nteVar.l.a, 8, Integer.valueOf(nteVar.j.a)));
                return Unit.a;
            case 8:
                int i7 = PlayerActivity.Z;
                Context context3 = ((cue) obj2).getContext();
                context3.getClass();
                jle.q(context3, ((s2e) obj).a.getPlayer().getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                return Unit.a;
            case 9:
                Context context4 = (Context) obj2;
                w3f w3fVar = (w3f) obj;
                String str = w3fVar.g;
                if (str == null) {
                    str = "";
                }
                int i8 = w3fVar.q;
                MatchOfTheWeekBottomSheet matchOfTheWeekBottomSheet = new MatchOfTheWeekBottomSheet();
                Bundle bundle = new Bundle();
                bundle.putString("PRESELECTED_CHOICE", str);
                bundle.putInt("EVENT_ID", i8);
                matchOfTheWeekBottomSheet.setArguments(bundle);
                context4.getClass();
                if (context4 instanceof csk) {
                    context4 = ((csk) context4).getBaseContext();
                }
                AppCompatActivity appCompatActivity2 = context4 instanceof AppCompatActivity ? (AppCompatActivity) context4 : null;
                if (appCompatActivity2 != null) {
                    wca.x(appCompatActivity2.getLifecycle()).b(new r1(matchOfTheWeekBottomSheet, appCompatActivity2, rq3Var, i3));
                }
                return Unit.a;
            case 10:
                ((te3) obj2).d = (Function2) obj;
                return Unit.a;
            case 11:
                Context context5 = (Context) obj2;
                context5.getClass();
                return b6a.y(context5, ((dg4) obj).b);
            case 12:
                ((SwitchPreference) obj2).z(true);
                int i9 = UpgradeSofascoreActivity.M;
                FragmentActivity requireActivity = ((PreferenceFragment) obj).requireActivity();
                requireActivity.getClass();
                e2f.k(requireActivity, false);
                return Unit.a;
            case 13:
                ProfileData profileData = (ProfileData) obj2;
                ProfileActivity profileActivity = (ProfileActivity) obj;
                int i10 = ProfileActivity.Q;
                if (profileData.getUserBadge() != null) {
                    ProfileBadgesExplanationModal profileBadgesExplanationModal = new ProfileBadgesExplanationModal();
                    profileBadgesExplanationModal.setArguments(fz8.C(fz8.G("PROFILE_DATA", profileData)));
                    ProfileActivity profileActivity2 = profileActivity instanceof AppCompatActivity ? profileActivity : null;
                    if (profileActivity2 != null) {
                        wca.x(profileActivity2.getLifecycle()).b(new r1(profileBadgesExplanationModal, profileActivity2, rq3Var, i3));
                    }
                }
                return Unit.a;
            case 14:
                Context context6 = (Context) obj2;
                wxf wxfVar = EventActivity.h0;
                wxf.B(context6, ((mi5) obj).a, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
            case 15:
                sbf sbfVar = (sbf) obj2;
                gta gtaVar = (gta) obj;
                sbfVar.getClass();
                gtaVar.getClass();
                xw3.L(un0.z(sbfVar), null, null, new v1f(sbfVar, gtaVar, rq3Var, i2), 3);
                return Unit.a;
            case 16:
                ((Function1) ((maf) obj2).h).invoke(Integer.valueOf(((PredictedEvent) obj).getId()));
                return Unit.a;
            case 17:
                fv fvVar = (fv) obj2;
                PromotionModal promotionModal = (PromotionModal) obj;
                if (fvVar != null) {
                    Context requireContext2 = promotionModal.requireContext();
                    requireContext2.getClass();
                    nv.o0(requireContext2, fvVar, promotionModal.F().b, "bottom_sheet", null);
                }
                Context requireContext3 = promotionModal.requireContext();
                requireContext3.getClass();
                String str2 = promotionModal.F().e;
                if (str2 == null) {
                    str2 = promotionModal.F().d;
                }
                bea.G(requireContext3, str2);
                promotionModal.q();
                return Unit.a;
            case 18:
                ((Function1) obj2).invoke((RaceFlowModels$RaceEntrant) obj);
                return Unit.a;
            case 19:
                y0d y0dVar = (y0d) obj2;
                sg3 sg3Var = (sg3) obj;
                Object[] objArr = y0dVar.b;
                long[] jArr = y0dVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j = jArr[i11];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j) < 128) {
                                    sg3Var.A(objArr[(i11 << 3) + i13]);
                                }
                                j >>= 8;
                            }
                            if (i12 != 8) {
                            }
                        }
                        if (i11 != length) {
                            i11++;
                        }
                    }
                }
                return Unit.a;
            case 20:
                int i14 = ReferralActivity.N;
                ((buf) ((ReferralActivity) obj2).K.getValue()).t((ltf) obj);
                return Unit.a;
            case 21:
                ReferralRedeemRewardBottomSheet referralRedeemRewardBottomSheet = (ReferralRedeemRewardBottomSheet) obj2;
                bli bliVar = ((vtf) referralRedeemRewardBottomSheet.B.getValue()).e;
                bliVar.getClass();
                FragmentActivity requireActivity2 = referralRedeemRewardBottomSheet.requireActivity();
                requireActivity2.getClass();
                cu cuVar = cu.e;
                bliVar.k(requireActivity2, "ai_analysis_subscription", (String) obj, "referral-reward");
                Unit unit2 = Unit.a;
                referralRedeemRewardBottomSheet.j();
                return Unit.a;
            case 22:
                createRuntimeMessageAdapter$lambda$0 = ReflectionKt.createRuntimeMessageAdapter$lambda$0((Class) obj2, (Class) obj);
                return createRuntimeMessageAdapter$lambda$0;
            case 23:
                quf qufVar = Regex.b;
                return ((Regex) obj2).b((CharSequence) obj);
            case 24:
                RemoveAdsYearlyOfferBottomSheet removeAdsYearlyOfferBottomSheet = (RemoveAdsYearlyOfferBottomSheet) obj2;
                Context requireContext4 = removeAdsYearlyOfferBottomSheet.requireContext();
                requireContext4.getClass();
                nv.z0(requireContext4, kv.CLICK, "check_offer_ads_yearly_50", "ad_offer_modal");
                int i15 = UpgradeSofascoreActivity.M;
                e2f.k((Context) obj, true);
                removeAdsYearlyOfferBottomSheet.j();
                return Unit.a;
            case 25:
                Function1 function1 = (Function1) obj;
                Integer num = ((e49) obj2).t.a;
                if (num != null) {
                    function1.invoke(new ew7(num.intValue()));
                }
                return Unit.a;
            case 26:
                ((Function1) obj2).invoke(new aw7(((c3f) obj).h.a, 26));
                return Unit.a;
            case 27:
                ((Function1) obj2).invoke(new z1c(((a6c) obj).a.e));
                return Unit.a;
            case 28:
                return aik.w((String) obj2, zze.g, new SerialDescriptor[0], new yvg((zvg) obj, i4));
            default:
                ((Function1) obj2).invoke(((i2h) obj).a);
                return Unit.a;
        }
    }
}
