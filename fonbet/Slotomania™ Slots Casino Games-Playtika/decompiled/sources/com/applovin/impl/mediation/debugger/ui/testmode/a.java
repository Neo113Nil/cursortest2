package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.g3;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.p3;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w;
import com.applovin.impl.x;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
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
import com.safedk.android.utils.h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class a extends p3 implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, w.a {
    private g3 a;
    private l b;
    private MaxAdView c;
    private MaxAdView d;
    private MaxInterstitialAd e;
    private MaxAppOpenAd f;
    private MaxRewardedAd g;
    private MaxAd h;
    private MaxNativeAdLoader i;
    private List j;
    private String k;
    private AdControlButton l;
    private AdControlButton m;
    private AdControlButton n;
    private AdControlButton o;
    private AdControlButton p;
    private AdControlButton q;
    private Button r;
    private Button s;
    private FrameLayout t;
    private FrameLayout u;
    private Switch v;
    private Switch w;
    private Map x;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a, reason: collision with other inner class name */
    class C0104a extends MaxNativeAdListener {
        final /* synthetic */ MaxNativeAdView a;

        C0104a(MaxNativeAdView maxNativeAdView) {
            this.a = maxNativeAdView;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            a.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            a.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (a.this.h != null) {
                a.this.i.destroy(a.this.h);
            }
            a.this.h = maxAd;
            a.this.i.render(this.a, maxAd);
            a.this.u.removeAllViews();
            a.this.u.addView(this.a);
            a.this.onAdLoaded(maxAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.d.removeAllViews();
        this.m.setControlState(AdControlButton.b.LOAD);
    }

    private void e() {
        List r = this.a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!r.contains(maxAdFormat)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.a.m();
        this.k = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.b.A0(), this);
        this.g = maxRewardedAd;
        maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
        this.g.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
        this.p = adControlButton;
        adControlButton.setOnClickListener(this);
        this.p.setFormat(maxAdFormat);
    }

    @Override // com.applovin.impl.p3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(h.a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.impl.p3
    protected l getSdk() {
        return this.b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.a.x() == null || !this.a.x().containsKey(maxAdFormat)) ? this.a.m() : (String) this.a.x().get(maxAdFormat);
    }

    public void initialize(g3 g3Var) {
        this.a = g3Var;
        this.b = g3Var.o();
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
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
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
        AdControlButton a = a(str);
        a.setControlState(AdControlButton.b.LOAD);
        q7.a(maxError, a.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        AdControlButton a = a(maxAd.getAdUnitId());
        if (maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            a.setControlState(AdControlButton.b.LOAD);
        } else {
            a.setControlState(AdControlButton.b.SHOW);
        }
    }

    @Override // com.applovin.impl.w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        q7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar != adControlButton.getControlState()) {
            if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
                adControlButton.setControlState(bVar);
                b(format);
                return;
            }
            return;
        }
        adControlButton.setControlState(AdControlButton.b.LOADING);
        Map map = this.x;
        if (map == null || map.get(format) == null) {
            a(format);
        } else {
            ((w) this.x.get(format)).a();
        }
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.a == null) {
            p.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.a.g() + " Test Ads");
        this.j = this.b.u0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.r = (Button) findViewById(R.id.show_mrec_button);
        this.s = (Button) findViewById(R.id.show_native_button);
        if (this.a.I() && this.a.r().contains(MaxAdFormat.MREC)) {
            this.u.setVisibility(8);
            this.r.setBackgroundColor(-1);
            this.s.setBackgroundColor(-3355444);
            this.r.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.this.a(view);
                }
            });
            this.s.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.this.b(view);
                }
            });
        } else {
            this.r.setVisibility(8);
            this.s.setVisibility(8);
        }
        this.v = (Switch) findViewById(R.id.native_banner_switch);
        this.w = (Switch) findViewById(R.id.native_mrec_switch);
        if (this.a.J()) {
            this.v.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.this.c(view);
                }
            });
            this.w.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.this.d(view);
                }
            });
        } else {
            this.v.setVisibility(8);
            this.w.setVisibility(8);
        }
        if (!StringUtils.isValidString(this.a.e()) || this.a.d() == null || this.a.d().size() <= 0) {
            return;
        }
        AdRegistration.getInstance(this.a.e(), this);
        AdRegistration.enableTesting(true);
        AdRegistration.enableLogging(true);
        HashMap hashMap = new HashMap(this.a.d().size());
        for (MaxAdFormat maxAdFormat : this.a.d().keySet()) {
            hashMap.put(maxAdFormat, new w((x) this.a.d().get(maxAdFormat), maxAdFormat, getApplicationContext(), this));
        }
        this.x = hashMap;
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.b.u0().a(this.j);
        MaxAdView maxAdView = this.c;
        if (maxAdView != null) {
            SpecialsBridge.maxAdViewDestroy(maxAdView);
        }
        MaxAdView maxAdView2 = this.d;
        if (maxAdView2 != null) {
            SpecialsBridge.maxAdViewDestroy(maxAdView2);
        }
        MaxInterstitialAd maxInterstitialAd = this.e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.i;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.h;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.i.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        q7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.u.setVisibility(0);
        this.t.setVisibility(8);
        this.s.setBackgroundColor(-1);
        this.r.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.c.removeAllViews();
        this.l.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.t.setVisibility(0);
        this.u.setVisibility(8);
        this.r.setBackgroundColor(-1);
        this.s.setBackgroundColor(-3355444);
    }

    private void d() {
        this.u = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.a.I()) {
            MaxNativeAdView maxNativeAdView = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), this);
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native");
            this.i = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.i.setNativeAdListener(new C0104a(maxNativeAdView));
            this.i.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.q = adControlButton;
            adControlButton.setOnClickListener(this);
            this.q.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.u.setVisibility(8);
    }

    private void c() {
        this.t = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List r = this.a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (r.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.b.A0(), this);
            this.d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", "true");
            this.d.setExtraParameter("disable_precache", "true");
            this.d.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.d.stopAutoRefresh();
            this.d.setListener(this);
            this.t.addView(this.d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.m.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.t.setVisibility(8);
    }

    @Override // com.applovin.impl.w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.i.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void b() {
        List r = this.a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (r.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.b.A0(), this);
            this.e = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.e.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.n.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.interstitial_control_view).setVisibility(8);
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean isTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (isTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.b.A0(), this);
            this.c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.c.setExtraParameter("disable_auto_retries", "true");
            this.c.setExtraParameter("disable_precache", "true");
            this.c.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.c.stopAutoRefresh();
            this.c.setListener(this);
            frameLayout.addView(this.c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.l.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        p.g("MaxDebuggerMultiAdActivity", "Showing test " + maxAdFormat.getDisplayName() + " Ad from " + this.a.g());
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.g.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        p.g("MaxDebuggerMultiAdActivity", "Loading test " + maxAdFormat.getDisplayName() + " Ad from " + this.a.g());
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.v.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        boolean z2 = maxAdFormat3 == maxAdFormat && this.w.isChecked();
        if (!z && !z2) {
            this.b.u0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.b.u0().a(this.a.w());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.d.loadAd();
            this.r.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.e.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.g.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.i.loadAd();
            this.s.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.m;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.n;
            }
            if (str.equals("test_mode_app_open")) {
                return this.o;
            }
            if (str.equals(this.k)) {
                return this.p;
            }
            if (str.equals("test_mode_native")) {
                return this.q;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
        }
        return this.l;
    }
}
