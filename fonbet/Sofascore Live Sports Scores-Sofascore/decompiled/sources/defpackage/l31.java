package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.e;
import androidx.fragment.app.FragmentActivity;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.inmobi.media.C3401em;
import com.sofascore.local_persistance.Brand;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.dialog.ProposeFollowEntityDialog;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import com.sofascore.results.featuredtournament.view.FeaturedTournamentOddsView;
import com.sofascore.results.mma.fighter.details.MmaFighterDetailsFragment;
import com.sofascore.results.mma.fighter.details.MmaFighterRankingsModal;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class l31 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l31(XmlPullParser xmlPullParser, C3401em c3401em, ArrayList arrayList, fsf fsfVar, ArrayList arrayList2) {
        this.a = 9;
        this.b = xmlPullParser;
        this.d = c3401em;
        this.e = arrayList;
        this.c = fsfVar;
        this.f = arrayList2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ExposedFunction invoke$lambda$0;
        int i = this.a;
        int i2 = 3;
        rq3 rq3Var = null;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                xw3.L((ku3) obj5, null, null, new h10((fsf) obj4, (n29) obj3, (Context) obj2, (Function0) obj, null, 1), 3);
                return Unit.a;
            case 1:
                f32 f32Var = (f32) obj5;
                Context context = f32Var.getContext();
                context.getClass();
                nv.o(context, (Integer) obj4, (BrandLocation) obj3, ((Brand) obj2).getSlug(), BrandType.BANNER);
                Context context2 = f32Var.getContext();
                context2.getClass();
                bea.G(context2, (String) obj);
                return Unit.a;
            case 2:
                Locale locale = (Locale) obj2;
                e1d e1dVar = (e1d) obj;
                return e.f(((wcj) e1dVar.getValue()).a.b.length() > 0 ? ((wg4) obj5).a(((kg2) obj4).e(((wcj) e1dVar.getValue()).a.b, ((qg4) obj3).c, locale), locale) : "");
            case 3:
                wb7 wb7Var = (wb7) obj5;
                ComponentActivity componentActivity = (ComponentActivity) obj4;
                e1d e1dVar2 = (e1d) obj3;
                Function1 function1 = (Function1) obj2;
                e1d e1dVar3 = (e1d) obj;
                if (((pb7) e1dVar2.getValue()).s) {
                    ev6 ev6Var = ((pb7) e1dVar2.getValue()).f;
                    if (ev6Var != null) {
                        function1.invoke(Integer.valueOf(ev6Var.c));
                    }
                } else if (((pb7) e1dVar2.getValue()).k > 0) {
                    e1dVar3.setValue(Boolean.TRUE);
                    wb7Var.u(true);
                } else {
                    componentActivity.finish();
                }
                return Unit.a;
            case 4:
                Context context3 = (Context) obj2;
                old oldVar = (old) obj5;
                bea.G(context3, oldVar.g);
                nv.b0(context3, (String) obj4, oldVar.a.c, "featured", Integer.valueOf(((OddsEventUIModel) obj3).a), (vmd) obj, "affiliate_button", oldVar.f);
                return Unit.a;
            case 5:
                FeaturedTournamentOddsView featuredTournamentOddsView = (FeaturedTournamentOddsView) obj5;
                OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) obj3;
                int i3 = FeaturedTournamentOddsView.d;
                Context context4 = featuredTournamentOddsView.getContext();
                context4.getClass();
                nv.b0(context4, ((ProviderOdds) obj4).getMarketName(), oddsCountryProvider.getProvider().getSlug(), "featured", Integer.valueOf(((Event) obj2).getId()), vmd.FEATURED_TOURNAMENT, "provider_logo", oddsCountryProvider.getType());
                Context context5 = featuredTournamentOddsView.getContext();
                context5.getClass();
                bea.G(context5, ((OddsProvider) obj).getDefaultBetSlipLink());
                return Unit.a;
            case 6:
                invoke$lambda$0 = HandleInvocationsFromAdViewer.invoke$lambda$0((HandleInvocationsFromAdViewer) obj5, (String) obj4, (String) obj3, (String) obj2, (AdObject) obj);
                return invoke$lambda$0;
            case 7:
                String str = (String) obj;
                FragmentActivity requireActivity = ((MmaFighterDetailsFragment) obj5).requireActivity();
                requireActivity.getClass();
                int id = ((UniqueTournament) obj4).getId();
                str.getClass();
                MmaFighterRankingsModal mmaFighterRankingsModal = new MmaFighterRankingsModal();
                Bundle bundle = new Bundle();
                bundle.putInt("UNIQUE_TOURNAMENT_ID", id);
                bundle.putString("WEIGHT_CLASS", (String) obj3);
                bundle.putSerializable("GENDER", (Gender) obj2);
                bundle.putString(NativeAdContent.ViewTag.AD_TITLE, str);
                mmaFighterRankingsModal.setArguments(bundle);
                AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(mmaFighterRankingsModal, appCompatActivity, rq3Var, i2));
                }
                return Unit.a;
            case 8:
                ProposeFollowEntityDialog proposeFollowEntityDialog = (ProposeFollowEntityDialog) obj4;
                qef qefVar = (qef) obj3;
                Context context6 = ((MaterialButton) obj5).getContext();
                context6.getClass();
                nv.y(context6, vu.ADD_FAVORITE, qefVar.b, proposeFollowEntityDialog.s(), wu.POPUP);
                proposeFollowEntityDialog.t(qefVar, av.CTA_CLICK, true, ((MaterialCheckBox) ((nr1) obj2).f).isChecked());
                ((s01) obj).dismiss();
                return Unit.a;
            case 9:
                return C3401em.a((XmlPullParser) obj5, (C3401em) obj3, (ArrayList) obj2, (fsf) obj4, (ArrayList) obj);
            default:
                return C3401em.a((XmlPullParser) obj5, (C3401em) obj4, (asf) obj3, (asf) obj2, (ArrayList) obj);
        }
    }

    public /* synthetic */ l31(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ l31(Context context, old oldVar, String str, OddsEventUIModel oddsEventUIModel, vmd vmdVar) {
        this.a = 4;
        this.e = context;
        this.b = oldVar;
        this.c = str;
        this.d = oddsEventUIModel;
        this.f = vmdVar;
    }
}
