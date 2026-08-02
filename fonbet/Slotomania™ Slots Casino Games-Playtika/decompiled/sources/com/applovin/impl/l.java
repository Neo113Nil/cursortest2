package com.applovin.impl;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.d;
import com.applovin.impl.m;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.u2;
import com.applovin.impl.w;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.ironsource.Vf;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.special.SpecialsBridge;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class l extends p3 implements AdControlButton.a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, w.a {
    private com.applovin.impl.sdk.l a;
    private n b;
    private k8 c;
    private m d;
    private MaxAdView e;
    private MaxInterstitialAd f;
    private MaxAppOpenAd g;
    private MaxRewardedAd h;
    private MaxNativeAdView i;
    private MaxNativeAdLoader j;
    private MaxAd k;
    private r l;
    private List m;
    private ListView n;
    private View o;
    private AdControlButton p;
    private TextView q;
    private w r;

    class a extends MaxNativeAdListener {
        a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            l.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            l.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (l.this.k != null) {
                l.this.j.destroy(l.this.k);
            }
            l.this.k = maxAd;
            l.this.j.render(l.this.i, maxAd);
            l.this.onAdLoaded(maxAd);
        }
    }

    @Override // com.applovin.impl.p3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.impl.p3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.a;
    }

    public void initialize(final n nVar, final o oVar, k8 k8Var, final com.applovin.impl.sdk.l lVar) {
        List a2;
        this.a = lVar;
        this.b = nVar;
        this.c = k8Var;
        this.m = lVar.u0().b();
        m mVar = new m(nVar, oVar, k8Var, this);
        this.d = mVar;
        mVar.a(new u2.a() { // from class: com.applovin.impl.l$$ExternalSyntheticLambda2
            @Override // com.applovin.impl.u2.a
            public final void a(l2 l2Var, t2 t2Var) {
                l.this.a(lVar, nVar, oVar, l2Var, t2Var);
            }
        });
        b();
        if (nVar.f().f()) {
            if ((k8Var != null && !k8Var.b().d().C()) || (a2 = lVar.W().a(nVar.c())) == null || a2.isEmpty()) {
                return;
            }
            this.r = new w(a2, nVar.a(), getApplicationContext(), this);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        q7.a(Vf.f, maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        q7.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.p.setControlState(AdControlButton.b.LOAD);
        this.q.setText("");
        q7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        q7.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        q7.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        q7.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        this.p.setControlState(AdControlButton.b.LOAD);
        this.q.setText("");
        if (204 == maxError.getCode()) {
            q7.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
        } else {
            q7.a("", "Failed to load with error code: " + maxError.getCode(), this);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        this.q.setText(maxAd.getNetworkName() + " ad loaded");
        this.p.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.e, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.b.a()) {
            a(this.i, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.impl.w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        q7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.a.u0().c()) {
            q7.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.d.j() != this.b.f()) {
            q7.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        MaxAdFormat a2 = this.b.a();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            w wVar = this.r;
            if (wVar != null) {
                wVar.a();
                return;
            } else {
                a(a2);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!a2.isAdViewAd() && a2 != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(bVar);
            }
            b(a2);
        }
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.d.k());
        this.n = (ListView) findViewById(R.id.listView);
        this.o = findViewById(R.id.ad_presenter_view);
        this.p = (AdControlButton) findViewById(R.id.ad_control_button);
        this.q = (TextView) findViewById(R.id.status_textview);
        this.n.setAdapter((ListAdapter) this.d);
        this.q.setText(a());
        this.q.setTypeface(Typeface.DEFAULT_BOLD);
        this.p.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.o.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.c != null) {
            this.a.u0().a(this.m);
        }
        MaxAdView maxAdView = this.e;
        if (maxAdView != null) {
            SpecialsBridge.maxAdViewDestroy(maxAdView);
        }
        MaxInterstitialAd maxInterstitialAd = this.f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.j;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.k;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.j.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        q7.a("onUserRewarded", maxAd, this);
    }

    private void b() {
        String c = this.b.c();
        if (this.b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(c, this.b.a());
            this.e = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.e.setExtraParameter("disable_auto_retries", "true");
            this.e.setExtraParameter("disable_precache", "true");
            this.e.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.e.stopAutoRefresh();
            this.e.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(c);
            this.f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(c);
            this.g = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", "true");
            this.g.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.b.a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(c);
            this.h = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
            this.h.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.b.a()) {
            this.i = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), com.applovin.impl.sdk.l.p());
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(c);
            this.j = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.j.setNativeAdListener(new a());
            this.j.setRevenueListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.l lVar, final n nVar, final o oVar, l2 l2Var, final t2 t2Var) {
        if (t2Var instanceof m.b) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, lVar.e(), new d.b() { // from class: com.applovin.impl.l$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    l.a(t2.this, nVar, oVar, lVar, (MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(t2 t2Var, n nVar, o oVar, com.applovin.impl.sdk.l lVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(nVar, oVar, ((m.b) t2Var).v(), lVar);
    }

    private void a(MaxAdFormat maxAdFormat) {
        StringBuilder append = new StringBuilder("Loading live ").append(maxAdFormat.getDisplayName()).append(" Ad from ");
        k8 k8Var = this.c;
        com.applovin.impl.sdk.p.g("MaxDebuggerAdUnitDetailActivity", append.append(k8Var != null ? k8Var.b().a() : this.d.j().c()).toString());
        if (this.c != null) {
            this.a.u0().a(this.c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.e.setPlacement("[Mediation Debugger Live Ad]");
            this.e.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.b.a()) {
            this.f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.b.a()) {
            this.g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.b.a()) {
            this.h.loadAd();
        } else if (MaxAdFormat.NATIVE == this.b.a()) {
            this.j.setPlacement("[Mediation Debugger Live Ad]");
            this.j.loadAd();
        } else {
            q7.a("Live ads currently unavailable for ad format", this);
        }
    }

    @Override // com.applovin.impl.w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.l != null) {
            return;
        }
        r rVar = new r(viewGroup, size, this);
        this.l = rVar;
        rVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.l$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                l.this.a(dialogInterface);
            }
        });
        this.l.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.l = null;
    }

    private String a() {
        if (this.a.u0().c()) {
            return "Not supported while Test Mode is enabled";
        }
        if (this.d.j() != this.b.f()) {
            return "This waterfall is not targeted for the current device";
        }
        return "Tap to load an ad";
    }

    private void b(MaxAdFormat maxAdFormat) {
        StringBuilder append = new StringBuilder("Showing live ").append(maxAdFormat.getDisplayName()).append(" Ad from ");
        k8 k8Var = this.c;
        com.applovin.impl.sdk.p.g("MaxDebuggerAdUnitDetailActivity", append.append(k8Var != null ? k8Var.b().a() : this.d.j().c()).toString());
        if (maxAdFormat.isAdViewAd()) {
            a(this.e, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.b.a()) {
            this.f.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.b.a()) {
            this.g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.b.a()) {
            this.h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.b.a()) {
            a(this.i, MaxAdFormat.MREC.getSize());
        }
    }
}
