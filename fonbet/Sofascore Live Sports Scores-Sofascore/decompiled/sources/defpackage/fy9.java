package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class fy9 extends NativeAdEventListener {
    public final MediationNativeAdConfiguration a;
    public final MediationAdLoadCallback b;
    public t9d c;
    public MediationNativeAdCallback d;
    public final zx9 e;
    public final sx9 f;

    public fy9(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, zx9 zx9Var, sx9 sx9Var) {
        this.a = mediationNativeAdConfiguration;
        this.b = mediationAdLoadCallback;
        this.e = zx9Var;
        this.f = sx9Var;
    }

    public final void a(long j, Context context) {
        this.f.getClass();
        InMobiNative inMobiNative = new InMobiNative(context, j, this);
        this.c = new t9d(inMobiNative);
        inMobiNative.setVideoEventListener(new ey9(this));
        ux9.e();
        ux9.a(this.a.getMediationExtras());
        b(this.c);
    }

    public abstract void b(t9d t9dVar);

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onAdClicked(InMobiNative inMobiNative) {
        MediationNativeAdCallback mediationNativeAdCallback = this.d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onAdFullScreenDismissed(InMobiNative inMobiNative) {
        MediationNativeAdCallback mediationNativeAdCallback = this.d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onAdFullScreenDisplayed(InMobiNative inMobiNative) {
        MediationNativeAdCallback mediationNativeAdCallback = this.d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdOpened();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdImpression(InMobiNative inMobiNative) {
        MediationNativeAdCallback mediationNativeAdCallback = this.d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadFailed(InMobiNative inMobiNative, InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError adError = new AdError(ux9.c(inMobiAdRequestStatus), inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String(), "com.inmobi.sdk");
        adError.toString();
        this.b.onFailure(adError);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadSucceeded(InMobiNative inMobiNative, AdMetaInfo adMetaInfo) {
        InMobiNative inMobiNative2 = inMobiNative;
        MediationNativeAdConfiguration mediationNativeAdConfiguration = this.a;
        NativeAdOptions nativeAdOptions = mediationNativeAdConfiguration.getNativeAdOptions();
        boolean shouldReturnUrlsForImageAssets = nativeAdOptions != null ? nativeAdOptions.shouldReturnUrlsForImageAssets() : false;
        this.f.getClass();
        oy9 oy9Var = new oy9(new t9d(inMobiNative2), Boolean.valueOf(shouldReturnUrlsForImageAssets), this.b, this);
        mediationNativeAdConfiguration.getContext();
        MediationAdLoadCallback mediationAdLoadCallback = oy9Var.u;
        t9d t9dVar = oy9Var.s;
        InMobiNative inMobiNative3 = (InMobiNative) t9dVar.a;
        InMobiNative inMobiNative4 = (InMobiNative) t9dVar.a;
        if (inMobiNative3.getAdTitle() != null) {
            oy9Var.setHeadline(inMobiNative3.getAdTitle());
        }
        if (inMobiNative3.getAdDescription() != null) {
            oy9Var.setBody(inMobiNative3.getAdDescription());
        }
        if (inMobiNative3.getCtaText() != null) {
            oy9Var.setCallToAction(inMobiNative3.getCtaText());
        }
        if (inMobiNative3.getAdvertiserName() != null) {
            oy9Var.setAdvertiser(inMobiNative3.getAdvertiserName());
        }
        oy9Var.setStarRating(Double.valueOf(inMobiNative3.getAdRating()));
        MediaView mediaView = inMobiNative3.getMediaView();
        if (mediaView != null) {
            oy9Var.setMediaView(mediaView);
        }
        oy9Var.setHasVideoContent(inMobiNative3.isVideo());
        InMobiNativeImage adIcon = inMobiNative4.getAdIcon();
        if ((adIcon == null ? null : adIcon.getUrl()) != null) {
            try {
                InMobiNativeImage adIcon2 = inMobiNative4.getAdIcon();
                URL url = new URL(adIcon2 == null ? null : adIcon2.getUrl());
                Uri parse = Uri.parse(url.toURI().toString());
                HashMap hashMap = new HashMap();
                boolean z = oy9Var.t;
                if (z) {
                    oy9Var.setIcon(new gy9(null, parse));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new gy9(new ColorDrawable(0), null));
                    oy9Var.setImages(arrayList);
                } else {
                    hashMap.put("icon_key", url);
                }
                if (!z) {
                    new wr9(new ny9(oy9Var, parse)).execute(hashMap);
                } else if (mediationAdLoadCallback != null) {
                    oy9Var.v.d = (MediationNativeAdCallback) mediationAdLoadCallback.onSuccess(oy9Var);
                }
            } catch (MalformedURLException | URISyntaxException e) {
                AdError u = yso.u(108, e.getLocalizedMessage());
                u.toString();
                mediationAdLoadCallback.onFailure(u);
            }
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onUserWillLeaveApplication(InMobiNative inMobiNative) {
        MediationNativeAdCallback mediationNativeAdCallback = this.d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }
}
