package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.e;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.inmobi.media.D2;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.sofascore.results.bettingtips.fragment.DroppingOddsFragment;
import com.sofascore.results.country.CountryListBottomSheet;
import com.sofascore.results.crowdsourcing.CrowdsourcingDeleteIncidentModal;
import com.sofascore.results.crowdsourcing.CrowdsourcingIncidentDetailsFullScreenDialog;
import com.sofascore.results.crowdsourcing.CrowdsourcingStatusDescriptionModal;
import com.sofascore.results.dialog.CupTreeDialog;
import com.sofascore.results.event.aiInsights.EventAiInsightsPromotionalModal;
import com.sofascore.results.event.aiInsights.ui.EventAiInsightsResultProbabilityModal;
import com.sofascore.results.player.statistics.compare.search.CompareSearchModal;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.settings.deleteAccount.DeleteAccountActivity;
import com.sofascore.results.settings.developer.DeveloperOptionsFullScreenDialog;
import com.sofascore.results.view.InformationView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class h63 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h63(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        int i = this.a;
        int i2 = 3;
        rq3 rq3Var = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                CompareSearchModal compareSearchModal = (CompareSearchModal) obj;
                Bundle arguments = compareSearchModal.getArguments();
                if (arguments == null || (str = arguments.getString("ENTITY_TYPE")) == null) {
                    str = "Player";
                }
                e73 valueOf = e73.valueOf(str);
                Bundle arguments2 = compareSearchModal.getArguments();
                String string = arguments2 != null ? arguments2.getString("SPORT") : null;
                valueOf.getClass();
                int ordinal = valueOf.ordinal();
                if (ordinal == 0) {
                    return m83.f;
                }
                if (ordinal == 1) {
                    return wyh.e(string) ? n83.f : o83.f;
                }
                zzl.b();
                return null;
            case 1:
                return e.f((tfh) obj);
            case 2:
                return a.c((Pair) obj);
            case 3:
                return ((z41) obj).open(":memory:");
            case 4:
                ks3 ks3Var = (ks3) obj;
                ur3 ur3Var = ur3.a;
                if (ur3Var.equals(ur3Var)) {
                    xw3.L(un0.z(ks3Var), null, null, new hy1(ks3Var, rq3Var, 21), 3);
                    return Unit.a;
                }
                zzl.b();
                return null;
            case 5:
                return ((q5b) obj).d();
            case 6:
                return new mbj((ewd) obj, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            case 7:
                ((fu3) obj).m = null;
                return Unit.a;
            case 8:
                ArrayList arrayList = dv3.a;
                Context requireContext = ((CountryListBottomSheet) obj).requireContext();
                requireContext.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = requireContext.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                ArrayList arrayList2 = dv3.a;
                Country e = dv3.e();
                Country a = dv3.a(sharedPreferences.getString("PREF_FEED_COUNTRY", e != null ? e.getIso2Alpha() : null));
                if (a != null) {
                    return new uv3(a.getName(), a.getIso2Alpha(), false);
                }
                return null;
            case 9:
                CrowdsourcingIncidentDetailsFullScreenDialog crowdsourcingIncidentDetailsFullScreenDialog = (CrowdsourcingIncidentDetailsFullScreenDialog) obj;
                Context requireContext2 = crowdsourcingIncidentDetailsFullScreenDialog.requireContext();
                requireContext2.getClass();
                CrowdsourcingDeleteIncidentModal crowdsourcingDeleteIncidentModal = new CrowdsourcingDeleteIncidentModal();
                crowdsourcingDeleteIncidentModal.E = new ny(0, crowdsourcingIncidentDetailsFullScreenDialog, CrowdsourcingIncidentDetailsFullScreenDialog.class, "dismiss", "dismiss()V", 0, 9);
                Unit unit = Unit.a;
                if (requireContext2 instanceof csk) {
                    requireContext2 = ((csk) requireContext2).getBaseContext();
                }
                AppCompatActivity appCompatActivity = requireContext2 instanceof AppCompatActivity ? (AppCompatActivity) requireContext2 : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(crowdsourcingDeleteIncidentModal, appCompatActivity, rq3Var, i2));
                }
                return Unit.a;
            case 10:
                ((CrowdsourcingStatusDescriptionModal) obj).j();
                return Unit.a;
            case 11:
                return ((qj4) obj).a();
            case 12:
                FragmentActivity requireActivity = ((CupTreeDialog) obj).requireActivity();
                requireActivity.getClass();
                return new v74(requireActivity);
            case 13:
                return ((u84) obj).a();
            case 14:
                return D2.a((D2) obj);
            case 15:
                ((r8j) obj).close();
                return Unit.a;
            case 16:
                int i3 = DeleteAccountActivity.N;
                View inflate = ((DeleteAccountActivity) obj).getLayoutInflater().inflate(R.layout.activity_delete_account, (ViewGroup) null, false);
                int i4 = R.id.confirmation_view;
                View B = nq8.B(R.id.confirmation_view, inflate);
                if (B != null) {
                    int i5 = R.id.changed_my_mind_button;
                    MaterialButton materialButton = (MaterialButton) nq8.B(R.id.changed_my_mind_button, B);
                    if (materialButton != null) {
                        i5 = R.id.delete_button;
                        MaterialButton materialButton2 = (MaterialButton) nq8.B(R.id.delete_button, B);
                        if (materialButton2 != null) {
                            i5 = R.id.empty_view;
                            if (((GraphicLarge) nq8.B(R.id.empty_view, B)) != null) {
                                i5 = R.id.spacer_bottom;
                                if (((Space) nq8.B(R.id.spacer_bottom, B)) != null) {
                                    if (((Space) nq8.B(R.id.spacer_top, B)) != null) {
                                        dd ddVar = new dd((LinearLayout) B, materialButton, materialButton2, 7);
                                        int i6 = R.id.delete_reason_view;
                                        View B2 = nq8.B(R.id.delete_reason_view, inflate);
                                        if (B2 != null) {
                                            int i7 = R.id.cancel_button;
                                            MaterialButton materialButton3 = (MaterialButton) nq8.B(R.id.cancel_button, B2);
                                            if (materialButton3 != null) {
                                                i7 = R.id.continue_button;
                                                MaterialButton materialButton4 = (MaterialButton) nq8.B(R.id.continue_button, B2);
                                                if (materialButton4 != null) {
                                                    i7 = R.id.info_bubble_container;
                                                    InformationView informationView = (InformationView) nq8.B(R.id.info_bubble_container, B2);
                                                    if (informationView != null) {
                                                        i7 = R.id.radio_no_value;
                                                        if (((RadioButton) nq8.B(R.id.radio_no_value, B2)) != null) {
                                                            i7 = R.id.radio_something_else;
                                                            if (((RadioButton) nq8.B(R.id.radio_something_else, B2)) != null) {
                                                                i7 = R.id.radio_too_many;
                                                                if (((RadioButton) nq8.B(R.id.radio_too_many, B2)) != null) {
                                                                    i7 = R.id.reasons_group;
                                                                    RadioGroup radioGroup = (RadioGroup) nq8.B(R.id.reasons_group, B2);
                                                                    if (radioGroup != null) {
                                                                        if (((Space) nq8.B(R.id.spacer_bottom, B2)) != null) {
                                                                            e92 e92Var = new e92((LinearLayout) B2, materialButton3, materialButton4, informationView, radioGroup, 4);
                                                                            i4 = R.id.toolbar;
                                                                            View B3 = nq8.B(R.id.toolbar, inflate);
                                                                            if (B3 != null) {
                                                                                z3f b = z3f.b(B3);
                                                                                i6 = R.id.toolbar_holder;
                                                                                if (((AppBarLayout) nq8.B(R.id.toolbar_holder, inflate)) != null) {
                                                                                    return new bd((ScrollView) inflate, ddVar, e92Var, b);
                                                                                }
                                                                            }
                                                                        }
                                                                        yhk.s("Missing required view with ID: ".concat(B2.getResources().getResourceName(i5)));
                                                                        return null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i5 = i7;
                                            yhk.s("Missing required view with ID: ".concat(B2.getResources().getResourceName(i5)));
                                            return null;
                                        }
                                        i4 = i6;
                                    } else {
                                        i5 = R.id.spacer_top;
                                    }
                                }
                            }
                        }
                    }
                    yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i5)));
                    return null;
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                return null;
            case 17:
                MobileAds.openDebugMenu(((DeveloperOptionsFullScreenDialog) obj).requireActivity(), "/21866864457/Mobile-Smart-Banner");
                return Unit.a;
            case 18:
                return new g70((sa5) obj, 1);
            case 19:
                Context requireContext3 = ((DroppingOddsFragment) obj).requireContext();
                requireContext3.getClass();
                return new id5(requireContext3);
            case 20:
                ((ny) obj).invoke();
                return Unit.a;
            case 21:
                pj5 pj5Var = (pj5) obj;
                znh znhVar = pj5Var.o;
                int h = znhVar.h();
                znh znhVar2 = pj5Var.p;
                return Integer.valueOf(h >= znhVar2.h() ? znhVar2.h() : znhVar.h());
            case 22:
                mr5 mr5Var = (mr5) obj;
                wj0 wj0Var = new wj0(mr5Var.u, 3);
                iz2 z = un0.z(mr5Var);
                uci uciVar = new uci(5000L, Long.MAX_VALUE);
                Object d = mr5Var.v.d();
                if (d != null) {
                    return un0.K(wj0Var, z, uciVar, (Event) d);
                }
                a70.r("Required value was null.");
                return null;
            case 23:
                EventAiInsightsPromotionalModal eventAiInsightsPromotionalModal = (EventAiInsightsPromotionalModal) obj;
                Context requireContext4 = eventAiInsightsPromotionalModal.requireContext();
                requireContext4.getClass();
                nv.z0(requireContext4, kv.CLICK, "check_offer_promo3m", "event_details");
                ((dsi) eventAiInsightsPromotionalModal.y.getValue()).f(rd6.d);
                eventAiInsightsPromotionalModal.j();
                return Unit.a;
            case 24:
                ((EventAiInsightsResultProbabilityModal) obj).j();
                return Unit.a;
            case 25:
                return Float.valueOf(((js5) obj).b / 100.0f);
            case 26:
                Function0 function0 = ((vb6) obj).f;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.a;
            case 27:
                bk6 bk6Var = (bk6) obj;
                return bk6Var.b != null ? Build.VERSION.SDK_INT >= 31 ? qz.q(bk6Var.a) : zid.e : zid.f;
            case 28:
                return Integer.valueOf(((z39) obj).m.size());
            default:
                ((wm6) obj).e.invoke();
                return Unit.a;
        }
    }
}
