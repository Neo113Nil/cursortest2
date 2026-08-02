package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zb4 implements MediationBannerAd, InneractiveAdSpot.RequestListener, InneractiveAdViewEventsListener {
    public static final /* synthetic */ int f = 0;
    public final MediationAdLoadCallback a;
    public MediationBannerAdCallback b;
    public AdSize c;
    public InneractiveAdSpot d;
    public RelativeLayout e;

    static {
        duf.a.getOrCreateKotlinClass(zb4.class).getSimpleName();
    }

    public zb4(MediationAdLoadCallback mediationAdLoadCallback) {
        mediationAdLoadCallback.getClass();
        this.a = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        RelativeLayout relativeLayout = this.e;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.i("bannerWrapperView");
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.b;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
        MediationBannerAdCallback mediationBannerAdCallback2 = this.b;
        if (mediationBannerAdCallback2 != null) {
            mediationBannerAdCallback2.onAdOpened();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
        InneractiveAdSpot inneractiveAdSpot2 = this.d;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
        } else {
            Intrinsics.i("bannerSpot");
            throw null;
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.b;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.b;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.b;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public final void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        inneractiveErrorCode.getClass();
        AdError a = qb4.a(inneractiveErrorCode);
        a.toString();
        this.a.onFailure(a);
        InneractiveAdSpot inneractiveAdSpot2 = this.d;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
        } else {
            Intrinsics.i("bannerSpot");
            throw null;
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public final void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        InneractiveAdSpot inneractiveAdSpot2 = this.d;
        if (inneractiveAdSpot2 == null) {
            Intrinsics.i("bannerSpot");
            throw null;
        }
        boolean z = inneractiveAdSpot2.getSelectedUnitController() instanceof InneractiveAdViewUnitController;
        InneractiveAdSpot inneractiveAdSpot3 = this.d;
        MediationAdLoadCallback mediationAdLoadCallback = this.a;
        if (!z) {
            String name = InneractiveAdViewUnitController.class.getName();
            if (inneractiveAdSpot3 == null) {
                Intrinsics.i("bannerSpot");
                throw null;
            }
            AdError adError = new AdError(105, String.format("Unexpected controller type. Expected: %s. Actual: %s", Arrays.copyOf(new Object[]{name, inneractiveAdSpot3.getSelectedUnitController().getClass().getName()}, 2)), "com.google.ads.mediation.dtexchange");
            adError.toString();
            mediationAdLoadCallback.onFailure(adError);
            InneractiveAdSpot inneractiveAdSpot4 = this.d;
            if (inneractiveAdSpot4 != null) {
                inneractiveAdSpot4.destroy();
                return;
            } else {
                Intrinsics.i("bannerSpot");
                throw null;
            }
        }
        if (inneractiveAdSpot3 == null) {
            Intrinsics.i("bannerSpot");
            throw null;
        }
        InneractiveUnitController selectedUnitController = inneractiveAdSpot3.getSelectedUnitController();
        selectedUnitController.getClass();
        InneractiveAdViewUnitController inneractiveAdViewUnitController = (InneractiveAdViewUnitController) selectedUnitController;
        inneractiveAdViewUnitController.setEventsListener(this);
        RelativeLayout relativeLayout = this.e;
        if (relativeLayout == null) {
            Intrinsics.i("bannerWrapperView");
            throw null;
        }
        inneractiveAdViewUnitController.bindView(relativeLayout);
        RelativeLayout relativeLayout2 = this.e;
        if (relativeLayout2 == null) {
            Intrinsics.i("bannerWrapperView");
            throw null;
        }
        Context context = relativeLayout2.getContext();
        float f2 = context.getResources().getDisplayMetrics().density;
        int b = wzb.b(inneractiveAdViewUnitController.getAdContentWidth() / f2);
        int b2 = wzb.b(inneractiveAdViewUnitController.getAdContentHeight() / f2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AdSize(b, b2));
        AdSize adSize = this.c;
        if (adSize == null) {
            Intrinsics.i("requestedAdSize");
            throw null;
        }
        if (MediationUtils.findClosestSize(context, adSize, arrayList) != null) {
            this.b = (MediationBannerAdCallback) mediationAdLoadCallback.onSuccess(this);
            return;
        }
        if (this.c == null) {
            Intrinsics.i("requestedAdSize");
            throw null;
        }
        int b3 = wzb.b(r7.getWidthInPixels(context) / f2);
        if (this.c == null) {
            Intrinsics.i("requestedAdSize");
            throw null;
        }
        AdError adError2 = new AdError(103, String.format("The loaded ad size did not match the requested ad size. Requested ad size: %dx%d. Loaded ad size: %dx%d.", Arrays.copyOf(new Object[]{Integer.valueOf(b3), Integer.valueOf(wzb.b(r8.getHeightInPixels(context) / f2)), Integer.valueOf(b), Integer.valueOf(b2)}, 4)), "com.google.ads.mediation.dtexchange");
        adError2.toString();
        mediationAdLoadCallback.onFailure(adError2);
        InneractiveAdSpot inneractiveAdSpot5 = this.d;
        if (inneractiveAdSpot5 != null) {
            inneractiveAdSpot5.destroy();
        } else {
            Intrinsics.i("bannerSpot");
            throw null;
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public final void onAdCollapsed(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public final void onAdExpanded(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public final void onAdResized(InneractiveAdSpot inneractiveAdSpot) {
    }
}
