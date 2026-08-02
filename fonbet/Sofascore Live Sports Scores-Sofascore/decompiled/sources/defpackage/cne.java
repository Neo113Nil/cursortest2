package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.inmobi.media.S3;
import com.mbridge.msdk.config.dynamic.baseview.cusview.SoundImageView;
import com.sofascore.results.R;
import com.sofascore.results.ads.ui.SofascoreAnalystDemoEventBottomSheet;
import com.sofascore.results.dialog.SofascoreRatingBottomSheetDialog;
import com.sofascore.results.event.details.view.predictions.PredictionsLoginModal;
import com.sofascore.results.event.details.view.promotion.PromotionModal;
import com.sofascore.results.player.matches.PlayerEventsFragment;
import com.sofascore.results.profile.LoginScreenActivity;
import com.sofascore.results.profile.edit.ProfileEditFragment;
import com.sofascore.results.profile.predictions.ProfilePredictionsActivity;
import com.sofascore.results.profile.view.ProfileBadgesExplanationModal;
import com.sofascore.results.profile.view.ProfilePredictionStatisticsView;
import com.sofascore.results.ranking.RankingsActivity;
import com.sofascore.results.stagesport.fragments.details.StageDetailsResultsFragment;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class cne implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cne(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rcg rcgVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                one oneVar = ((dne) obj).e;
                ale aleVar = oneVar.q0;
                if (aleVar != null && aleVar.k(29)) {
                    etj o = oneVar.q0.o();
                    ale aleVar2 = oneVar.q0;
                    String str = nik.a;
                    aleVar2.f(o.a().b(1).i(1, false).a());
                    ((String[]) oneVar.m.c)[1] = oneVar.getResources().getString(R.string.exo_track_selection_auto);
                    oneVar.r.dismiss();
                    break;
                }
                break;
            case 1:
                ine ineVar = (ine) obj;
                one oneVar2 = ineVar.e;
                int bindingAdapterPosition = ineVar.getBindingAdapterPosition();
                float[] fArr = one.I0;
                View view2 = oneVar2.G;
                if (bindingAdapterPosition == 0) {
                    gne gneVar = oneVar2.n;
                    view2.getClass();
                    oneVar2.d(gneVar, view2);
                    break;
                } else if (bindingAdapterPosition == 1) {
                    dne dneVar = oneVar2.p;
                    view2.getClass();
                    oneVar2.d(dneVar, view2);
                    break;
                } else {
                    oneVar2.r.dismiss();
                    break;
                }
            case 2:
                one oneVar3 = ((dne) obj).e;
                ale aleVar3 = oneVar3.q0;
                if (aleVar3 != null && aleVar3.k(29)) {
                    oneVar3.q0.f(oneVar3.q0.o().a().b(3).d().f().h().a());
                    oneVar3.r.dismiss();
                    break;
                }
                break;
            case 3:
                tne tneVar = (tne) obj;
                tneVar.g();
                if (view.getId() == R.id.exo_overflow_show) {
                    tneVar.r.start();
                    break;
                } else if (view.getId() == R.id.exo_overflow_hide) {
                    tneVar.s.start();
                    break;
                }
                break;
            case 4:
                PlayerEventsFragment playerEventsFragment = (PlayerEventsFragment) obj;
                v8a v8aVar = playerEventsFragment.v;
                if (v8aVar != null && (v8aVar instanceof wse)) {
                    Context requireContext = playerEventsFragment.requireContext();
                    requireContext.getClass();
                    String G = playerEventsFragment.G();
                    List<yse> list = ((wse) v8aVar).i.b;
                    ArrayList arrayList = new ArrayList(k13.r(list, 10));
                    for (yse yseVar : list) {
                        arrayList.add(new g22(yseVar.g(), yseVar.h()));
                    }
                    List c = a.c(new h22(arrayList, R.string.legend));
                    String string = playerEventsFragment.getString(R.string.legend);
                    string.getClass();
                    un0.I(requireContext, G, R.string.legend, c, string, "LegendInfoModal");
                    break;
                }
                break;
            case 5:
                ((fl8) obj).invoke();
                break;
            case 6:
                PredictionsLoginModal predictionsLoginModal = (PredictionsLoginModal) obj;
                Context requireContext2 = predictionsLoginModal.requireContext();
                requireContext2.getClass();
                nv.z0(requireContext2, kv.CLICK, "sign_in_button", "who_will_win_modal");
                int i2 = LoginScreenActivity.M;
                Context requireContext3 = predictionsLoginModal.requireContext();
                requireContext3.getClass();
                requireContext3.startActivity(new Intent(requireContext3, (Class<?>) LoginScreenActivity.class));
                predictionsLoginModal.q();
                break;
            case 7:
                ((ox5) obj).invoke();
                break;
            case 8:
                ((ProfileBadgesExplanationModal) obj).j();
                break;
            case 9:
                ProfileEditFragment profileEditFragment = (ProfileEditFragment) obj;
                if (!profileEditFragment.H()) {
                    profileEditFragment.requireActivity().finish();
                    break;
                }
                break;
            case 10:
                int i3 = ProfilePredictionStatisticsView.c;
                int i4 = ProfilePredictionsActivity.N;
                Context context = ((ProfilePredictionStatisticsView) obj).getContext();
                context.getClass();
                Intent intent = new Intent(context, (Class<?>) ProfilePredictionsActivity.class);
                intent.putExtra("OPEN_PROFILE_ID", (String) null);
                context.startActivity(intent);
                break;
            case 11:
                ((PromotionModal) obj).q();
                break;
            case 12:
                ((SwitchCompat) ((djf) ((ja9) obj).d).f).setChecked(!r7.isChecked());
                break;
            case 13:
                int i5 = RankingsActivity.O;
                ((RankingsActivity) obj).setTitle("");
                break;
            case 14:
                S3.a((S3) obj, view);
                break;
            case 15:
                kcg kcgVar = (kcg) obj;
                bo4 bo4Var = kcgVar.e;
                if (kcgVar.b <= 0 || (rcgVar = (rcg) bo4Var.e) == rcg.d || rcgVar == rcg.e) {
                    bo4 bo4Var2 = kcgVar.d;
                    bo4Var2.getClass();
                    rcg rcgVar2 = rcg.e;
                    bo4Var2.e = rcgVar2;
                    ((Timer) bo4Var2.f).cancel();
                    bo4Var.getClass();
                    bo4Var.e = rcgVar2;
                    ((Timer) bo4Var.f).cancel();
                    tdg tdgVar = kcgVar.g;
                    if (tdgVar != null) {
                        xag xagVar = tdgVar.q;
                        if (xagVar != null) {
                            bea.r(xagVar);
                        }
                        veg vegVar = tdgVar.r;
                        if (vegVar != null) {
                            vegVar.a("window.mraidbridge.notifyCloseEvent();");
                            break;
                        }
                    }
                }
                break;
            case 16:
                Function1<Boolean, Unit> fullscreenControllerListener = ((idg) obj).getFullscreenControllerListener();
                if (fullscreenControllerListener != null) {
                    fullscreenControllerListener.invoke(Boolean.valueOf(!r7.e));
                    break;
                }
                break;
            case 17:
                Function1<Boolean, Unit> muteControllerListener = ((xeg) obj).getMuteControllerListener();
                if (muteControllerListener != null) {
                    muteControllerListener.invoke(Boolean.valueOf(!r7.e));
                    break;
                }
                break;
            case 18:
                ahg ahgVar = (ahg) obj;
                if (ahgVar.m) {
                    ahgVar.c();
                    xgg xggVar = ahgVar.g;
                    if (xggVar != null) {
                        xggVar.onCloseRequested();
                        break;
                    }
                }
                break;
            case 19:
                pig pigVar = (pig) obj;
                mig migVar = pigVar.o;
                if (migVar != null) {
                    migVar.onCustomerFeedbackDialogShow();
                }
                Context context2 = pigVar.m.getRootView().getContext();
                context2.getClass();
                if (pigVar.k != null) {
                    uig uigVar = (uig) pigVar.h.invoke(context2, pigVar.a);
                    uigVar.a = new hcc(18, pigVar, context2, uigVar);
                    uigVar.b.show();
                    break;
                } else {
                    pigVar.a(context2);
                    break;
                }
            case 20:
                bzg bzgVar = (bzg) obj;
                kp5 kp5Var = azg.d;
                int indexOf = kp5Var.indexOf(bzgVar.e) + 1;
                Integer valueOf = indexOf < kp5Var.size() ? Integer.valueOf(indexOf) : null;
                bzgVar.e = (azg) kp5Var.get(valueOf != null ? valueOf.intValue() : 0);
                bzgVar.l(true);
                break;
            case 21:
                cgh cghVar = (cgh) obj;
                if (cghVar.k && cghVar.isShowing()) {
                    if (!cghVar.m) {
                        TypedArray obtainStyledAttributes = cghVar.getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
                        cghVar.l = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        cghVar.m = true;
                    }
                    if (cghVar.l) {
                        cghVar.cancel();
                        break;
                    }
                }
                break;
            case 22:
                nth nthVar = (nth) obj;
                boolean z = nthVar.d;
                snl snlVar = nthVar.b;
                if (z) {
                    ((xnl) snlVar).c();
                    break;
                } else {
                    xnl xnlVar = (xnl) snlVar;
                    xnlVar.b(xnlVar.a, "playVideo", new Object[0]);
                    break;
                }
            case 23:
                hn6 hn6Var = ((yth) obj).f;
                hn6Var.k(hn6Var.d ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
                break;
            case 24:
                ((SofascoreAnalystDemoEventBottomSheet) obj).q();
                break;
            case 25:
                ((SofascoreRatingBottomSheetDialog) obj).j();
                break;
            case 26:
                ((SoundImageView) obj).a(view);
                break;
            case 27:
                ((dsi) ((StageDetailsResultsFragment) obj).t.getValue()).b.d(o4i.c);
                break;
            case 28:
                ez0 ez0Var = (ez0) ((pq5) obj).f;
                LinearLayout linearLayout = (LinearLayout) ez0Var.d;
                boolean z2 = linearLayout.getVisibility() == 0;
                z8e.s((ImageView) ez0Var.e, z2);
                linearLayout.setVisibility(z2 ? 8 : 0);
                break;
            default:
                ((fl8) ((gai) obj).e).invoke();
                break;
        }
    }
}
