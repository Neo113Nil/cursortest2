package defpackage;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.model.Sports;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.event.details.view.promotion.PromotionBannerView;
import com.sofascore.results.featuredtournament.view.PromotionalOffersBannerView;
import com.sofascore.results.tracker.TrackerBottomSheet;
import com.sofascore.results.view.InformationView;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ox5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventDetailsFragment b;

    public /* synthetic */ ox5(EventDetailsFragment eventDetailsFragment, int i) {
        this.a = i;
        this.b = eventDetailsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TrackerBottomSheet b;
        int i = this.a;
        int i2 = 3;
        int i3 = 6;
        rq3 rq3Var = null;
        int i4 = 1;
        EventDetailsFragment eventDetailsFragment = this.b;
        switch (i) {
            case 0:
                dz5 E = eventDetailsFragment.E();
                xw3.L(un0.z(E), null, null, new oy5(E, rq3Var, i4), 3);
                return Unit.a;
            case 1:
                int i5 = ChatActivity.Z;
                Context requireContext = eventDetailsFragment.requireContext();
                requireContext.getClass();
                Event F = eventDetailsFragment.F();
                tu[] tuVarArr = tu.a;
                uic.w(requireContext, F, "button", 56);
                eventDetailsFragment.D().M = true;
                return Unit.a;
            case 2:
                Context requireContext2 = eventDetailsFragment.requireContext();
                requireContext2.getClass();
                nv.w(requireContext2, eventDetailsFragment.F().getId(), eventDetailsFragment.F().getStatus().getType(), uu.CONTRIBUTE);
                eventDetailsFragment.M().f(rd6.e);
                return Unit.a;
            case 3:
                Integer F2 = o3a.F(eventDetailsFragment.F().getTournament());
                Season season = eventDetailsFragment.F().getSeason();
                if (F2 != null && season != null) {
                    int intValue = F2.intValue();
                    Context requireContext3 = eventDetailsFragment.requireContext();
                    requireContext3.getClass();
                    juj jujVar = juj.a;
                    b = bgf.b(juj.b, intValue, season.getId(), season.getYear(), "", "", (r13 & 64) != 0 ? null : Integer.valueOf(Event.getHomeTeam$default(eventDetailsFragment.F(), null, 1, null).getId()), (r13 & 128) != 0 ? null : Integer.valueOf(Event.getAwayTeam$default(eventDetailsFragment.F(), null, 1, null).getId()));
                    if (requireContext3 instanceof csk) {
                        requireContext3 = ((csk) requireContext3).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity = requireContext3 instanceof AppCompatActivity ? (AppCompatActivity) requireContext3 : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(b, appCompatActivity, rq3Var, i2));
                    }
                }
                return Unit.a;
            case 4:
                eventDetailsFragment.I().m(AdType.RewardedInterstitial.EventWhoWillWin, new ox5(eventDetailsFragment, i3));
                return Unit.a;
            case 5:
                String eventEditorName = eventDetailsFragment.F().getEventEditorName();
                return Boolean.valueOf(!(eventEditorName == null || eventEditorName.length() == 0));
            case 6:
                w3f w3fVar = eventDetailsFragment.E;
                if (w3fVar != null) {
                    eventDetailsFragment.E().k(w3fVar);
                }
                return Unit.a;
            case 7:
                Context requireContext4 = eventDetailsFragment.requireContext();
                requireContext4.getClass();
                return new ji5(requireContext4);
            case 8:
                Context requireContext5 = eventDetailsFragment.requireContext();
                requireContext5.getClass();
                InformationView informationView = new InformationView(requireContext5, null, 6);
                InformationView.n(informationView);
                InformationView.o(informationView, eventDetailsFragment.getString(R.string.coverage_downgrade));
                return informationView;
            case 9:
                Context requireContext6 = eventDetailsFragment.requireContext();
                requireContext6.getClass();
                return Boolean.valueOf(rld.s(requireContext6, vmd.EVENT_DETAILS, eventDetailsFragment.F(), false));
            case 10:
                return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.BASEBALL));
            case 11:
                return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS));
            case 12:
                Context requireContext7 = eventDetailsFragment.requireContext();
                requireContext7.getClass();
                InformationView informationView2 = new InformationView(requireContext7, null, 6);
                InformationView.n(informationView2);
                return informationView2;
            case 13:
                return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL) || Intrinsics.c(eventDetailsFragment.L(), Sports.MINI_FOOTBALL) || Intrinsics.c(eventDetailsFragment.L(), Sports.RUGBY));
            case 14:
                Context requireContext8 = eventDetailsFragment.requireContext();
                requireContext8.getClass();
                return new ede(requireContext8);
            case 15:
                Context requireContext9 = eventDetailsFragment.requireContext();
                requireContext9.getClass();
                return new c68(requireContext9);
            case 16:
                return Boolean.valueOf(!Intrinsics.c(eventDetailsFragment.L(), Sports.MMA));
            case 17:
                Context requireContext10 = eventDetailsFragment.requireContext();
                requireContext10.getClass();
                v5f v5fVar = new v5f(requireContext10);
                v5fVar.setLinkClickListener(new hx5(eventDetailsFragment, 19));
                return v5fVar;
            case 18:
                Set set = aef.a;
                Context requireContext11 = eventDetailsFragment.requireContext();
                requireContext11.getClass();
                return Boolean.valueOf(aef.e(requireContext11, o3a.F(eventDetailsFragment.F().getTournament())));
            case 19:
                Context requireContext12 = eventDetailsFragment.requireContext();
                requireContext12.getClass();
                PromotionBannerView promotionBannerView = new PromotionBannerView(requireContext12, null, 6);
                wnn.y(promotionBannerView, fv.EVENT_SCREEN);
                return promotionBannerView;
            case 20:
                Set set2 = aef.a;
                Context requireContext13 = eventDetailsFragment.requireContext();
                requireContext13.getClass();
                bef d = aef.d(requireContext13, eventDetailsFragment.F());
                if (d == null) {
                    return null;
                }
                Context requireContext14 = eventDetailsFragment.requireContext();
                requireContext14.getClass();
                PromotionBannerView promotionBannerView2 = new PromotionBannerView(requireContext14, null, 6);
                wnn.x(promotionBannerView2, d, fv.EVENT_SCREEN);
                return promotionBannerView2;
            case 21:
                bga bgaVar = xld.a;
                Context requireContext15 = eventDetailsFragment.requireContext();
                requireContext15.getClass();
                if (xld.g(requireContext15)) {
                    Set set3 = aef.a;
                    Context requireContext16 = eventDetailsFragment.requireContext();
                    requireContext16.getClass();
                    if (aef.h(requireContext16)) {
                        r5 = true;
                    }
                }
                return Boolean.valueOf(r5);
            case 22:
                Context requireContext17 = eventDetailsFragment.requireContext();
                requireContext17.getClass();
                return new s5j(requireContext17);
            case 23:
                Context requireContext18 = eventDetailsFragment.requireContext();
                requireContext18.getClass();
                e91 e91Var = new e91(requireContext18, null, 0);
                wrh a = wrh.a(e91Var.getRoot());
                e91Var.setShowAsCard(false);
                a.b.setContent(new tc3(-504185031, new t21(e91Var, 17), true));
                e91Var.setVisibility(8);
                e91Var.setOnDismiss(new hx5(eventDetailsFragment, 15));
                return e91Var;
            case 24:
                Context requireContext19 = eventDetailsFragment.requireContext();
                requireContext19.getClass();
                return new PromotionalOffersBannerView(requireContext19, null, 6);
            case 25:
                return Boolean.valueOf(eventDetailsFragment.F() instanceof MmaEvent);
            case 26:
                Context requireContext20 = eventDetailsFragment.requireContext();
                requireContext20.getClass();
                kqc kqcVar = new kqc(requireContext20);
                kqcVar.setRankingsClickListener(new hx5(eventDetailsFragment, 16));
                return kqcVar;
            case 27:
                Set set4 = wyh.a;
                if (wyh.i(eventDetailsFragment.L()) && !Intrinsics.c(eventDetailsFragment.L(), Sports.TENNIS)) {
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            case 28:
                Context requireContext21 = eventDetailsFragment.requireContext();
                requireContext21.getClass();
                return new r63(requireContext21);
            default:
                return Boolean.valueOf(Intrinsics.c(eventDetailsFragment.L(), Sports.FOOTBALL));
        }
    }
}
