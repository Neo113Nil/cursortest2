package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewParent;
import androidx.compose.runtime.e;
import com.google.android.material.appbar.AppBarLayout;
import com.inmobi.media.B0;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.event.lineups.BaseEventLineupsFragment;
import com.sofascore.results.sharemodal.BaseSharePageFragment;
import com.sofascore.results.sharemodal.BaseSinglePageShareModal;
import com.sofascore.results.sharemodal.match.fragment.BaseShareMatchPageFragment;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.core.data.datasource.AndroidAdQualityVersionDataSource;
import com.unity3d.ads.core.data.datasource.AndroidGoogleAppIdDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.domain.AndroidGetIsAdActivity;
import gatewayprotocol.v1.ClientInfoOuterClass;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class z0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Iterable] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String cachedVersion_delegate$lambda$4$lambda$1;
        String cachedVersion_delegate$lambda$4$lambda$2;
        String cachedVersion_delegate$lambda$4$lambda$3;
        String cachedVersion_delegate$lambda$4;
        Unit configure$lambda$9;
        AdObject adObject_delegate$lambda$1;
        List activities_delegate$lambda$1;
        String googleAppId_delegate$lambda$3;
        ClientInfoOuterClass.MediationProvider _get_mediationProvider_$lambda$0;
        ?? r2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Context requireContext = ((AbstractBettingTipsFragment) obj).requireContext();
                requireContext.getClass();
                GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext, null, 6);
                gambleRegulationFooterView.setVisibility(8);
                gambleRegulationFooterView.j(null, true);
                return gambleRegulationFooterView;
            case 1:
                return LayoutInflater.from(((z6) obj).a);
            case 2:
                return new p45((g7) obj);
            case 3:
                Application application = ((q8) obj).b;
                application.getClass();
                return ((x0) application).a;
            case 4:
                cachedVersion_delegate$lambda$4$lambda$1 = AndroidAdQualityVersionDataSource.cachedVersion_delegate$lambda$4$lambda$1((NoClassDefFoundError) obj);
                return cachedVersion_delegate$lambda$4$lambda$1;
            case 5:
                cachedVersion_delegate$lambda$4$lambda$2 = AndroidAdQualityVersionDataSource.cachedVersion_delegate$lambda$4$lambda$2((ClassNotFoundException) obj);
                return cachedVersion_delegate$lambda$4$lambda$2;
            case 6:
                cachedVersion_delegate$lambda$4$lambda$3 = AndroidAdQualityVersionDataSource.cachedVersion_delegate$lambda$4$lambda$3((NoSuchMethodError) obj);
                return cachedVersion_delegate$lambda$4$lambda$3;
            case 7:
                cachedVersion_delegate$lambda$4 = AndroidAdQualityVersionDataSource.cachedVersion_delegate$lambda$4((AndroidAdQualityVersionDataSource) obj);
                return cachedVersion_delegate$lambda$4;
            case 8:
                configure$lambda$9 = AndroidDiagnosticEventRepository.configure$lambda$9((AndroidDiagnosticEventRepository) obj);
                return configure$lambda$9;
            case 9:
                adObject_delegate$lambda$1 = AndroidFullscreenWebViewAdPlayer.adObject_delegate$lambda$1((AndroidFullscreenWebViewAdPlayer) obj);
                return adObject_delegate$lambda$1;
            case 10:
                activities_delegate$lambda$1 = AndroidGetIsAdActivity.activities_delegate$lambda$1((AndroidGetIsAdActivity) obj);
                return activities_delegate$lambda$1;
            case 11:
                googleAppId_delegate$lambda$3 = AndroidGoogleAppIdDataSource.googleAppId_delegate$lambda$3((AndroidGoogleAppIdDataSource) obj);
                return googleAppId_delegate$lambda$3;
            case 12:
                _get_mediationProvider_$lambda$0 = AndroidMediationRepository._get_mediationProvider_$lambda$0((AndroidMediationRepository) obj);
                return _get_mediationProvider_$lambda$0;
            case 13:
                ((eoh) ((x20) obj).g).setValue(Boolean.valueOf(!((Boolean) ((eoh) r6).getValue()).booleanValue()));
                return Unit.a;
            case 14:
                n9e.E((y20) obj);
                return Unit.a;
            case 15:
                return ((g8j) obj).R();
            case 16:
                return hz8.P((Object[]) obj);
            case 17:
                return B0.b((B0) obj);
            case 18:
                ViewParent parent = ((e21) obj).getParent().getParent().getParent();
                if (parent instanceof AppBarLayout) {
                    return (AppBarLayout) parent;
                }
                return null;
            case 19:
                BaseEventLineupsFragment baseEventLineupsFragment = (BaseEventLineupsFragment) obj;
                x21 D = baseEventLineupsFragment.D();
                Event B = baseEventLineupsFragment.B();
                D.getClass();
                xw3.L(un0.z(D), null, null, new w21(true, D, B, (rq3) null), 3);
                return Unit.a;
            case 20:
                r7 r7Var = (r7) obj;
                return new b16(r7Var.j(), r7Var.k());
            case 21:
                ((a31) obj).b();
                return Unit.a;
            case 22:
                return new c41((d41) obj);
            case 23:
                return Float.valueOf(((BaseModalBottomSheetDialog) obj).getResources().getDimension(R.dimen.header_elevation));
            case 24:
                Bundle requireArguments = ((BaseShareMatchPageFragment) obj).requireArguments();
                requireArguments.getClass();
                Serializable M = gz8.M(requireArguments, "ARG_EVENT", Event.class);
                if (M != null) {
                    return (Event) M;
                }
                a70.p("Serializable ARG_EVENT not found");
                return null;
            case 25:
                return Integer.valueOf(((BaseSharePageFragment) obj).requireContext().getColor(R.color.surface_1));
            case 26:
                Bundle requireArguments2 = ((BaseSinglePageShareModal) obj).requireArguments();
                requireArguments2.getClass();
                Serializable M2 = gz8.M(requireArguments2, "ARG_DATA_HOLDER", ich.class);
                if (M2 != null) {
                    return (ich) M2;
                }
                a70.p("Serializable ARG_DATA_HOLDER not found");
                return null;
            case 27:
                vj1 vj1Var = ((e81) obj).a;
                int ordinal = vj1Var.ordinal();
                if (ordinal == 0) {
                    r2 = ia1.c.b;
                } else if (ordinal != 10) {
                    kp5 kp5Var = uj1.C1;
                    r2 = new ArrayList();
                    for (Object obj2 : kp5Var) {
                        uj1 uj1Var = (uj1) obj2;
                        if (uj1Var.a == vj1Var && !uj1Var.j) {
                            r2.add(obj2);
                        }
                    }
                } else {
                    r2 = ia1.e.b;
                }
                ArrayList arrayList = new ArrayList(k13.r(r2, 10));
                Iterator it = r2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new c81((uj1) it.next()));
                }
                return arrayList;
            case 28:
                Function0 function0 = ((e91) obj).d;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.a;
            default:
                return e.f(((r91) obj).d);
        }
    }
}
