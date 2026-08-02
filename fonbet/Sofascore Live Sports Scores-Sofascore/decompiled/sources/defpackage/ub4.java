package defpackage;

import android.content.Context;
import android.net.Uri;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ub4 extends InneractiveAdSpot.NativeAdRequestListener {
    public final /* synthetic */ vb4 a;
    public final /* synthetic */ MediationNativeAdConfiguration b;

    public ub4(vb4 vb4Var, MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        this.a = vb4Var;
        this.b = mediationNativeAdConfiguration;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public final void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        Objects.toString(inneractiveErrorCode);
        vb4 vb4Var = this.a;
        MediationAdLoadCallback mediationAdLoadCallback = vb4Var.q;
        if (inneractiveErrorCode == null) {
            inneractiveErrorCode = InneractiveErrorCode.SDK_INTERNAL_ERROR;
        }
        mediationAdLoadCallback.onFailure(qb4.a(inneractiveErrorCode));
        InneractiveAdSpot inneractiveAdSpot2 = vb4Var.s;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
        }
        vb4Var.s = null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.NativeAdRequestListener
    public final void onInneractiveSuccessfulNativeAdRequest(InneractiveAdSpot inneractiveAdSpot, NativeAdContent nativeAdContent) {
        vb4 vb4Var = this.a;
        MediationAdLoadCallback mediationAdLoadCallback = vb4Var.q;
        if (nativeAdContent == null) {
            mediationAdLoadCallback.onFailure(qb4.a(InneractiveErrorCode.SDK_INTERNAL_ERROR));
            InneractiveAdSpot inneractiveAdSpot2 = vb4Var.s;
            if (inneractiveAdSpot2 != null) {
                inneractiveAdSpot2.destroy();
            }
            vb4Var.s = null;
            return;
        }
        Context context = this.b.getContext();
        context.getClass();
        nativeAdContent.bindMediaView(new MediaView(context));
        vb4Var.t = nativeAdContent;
        String adTitle = nativeAdContent.getAdTitle();
        if (adTitle != null) {
            vb4Var.setHeadline(adTitle);
        }
        String adDescription = nativeAdContent.getAdDescription();
        if (adDescription != null) {
            vb4Var.setBody(adDescription);
        }
        Uri appIcon = nativeAdContent.getAppIcon();
        if (appIcon != null) {
            vb4Var.setIcon(new rb4(appIcon));
        }
        String adCallToAction = nativeAdContent.getAdCallToAction();
        if (adCallToAction != null) {
            vb4Var.setCallToAction(adCallToAction);
        }
        MediaView mediaView = nativeAdContent.getMediaView();
        if (mediaView != null) {
            vb4Var.setMediaView(mediaView);
        }
        if (nativeAdContent.getRating() != null) {
            vb4Var.setStarRating(Double.valueOf(r3.floatValue()));
        }
        Float mediaAspectRatio = nativeAdContent.getMediaAspectRatio();
        if (mediaAspectRatio != null) {
            vb4Var.setMediaContentAspectRatio(mediaAspectRatio.floatValue());
        }
        vb4Var.setOverrideClickHandling(true);
        vb4Var.setOverrideImpressionRecording(true);
        vb4Var.r = (MediationNativeAdCallback) mediationAdLoadCallback.onSuccess(vb4Var);
    }
}
