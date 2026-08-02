package com.vk.libvideo.ui.ad;

import android.R;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.ui.ad.AdvertBannerView;
import com.vk.log.L;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.e;
import kotlin.Result;
import xsna.asp;
import xsna.bwt0;
import xsna.mnh0;
import xsna.zrp;

/* compiled from: AdvertBannerView.kt */
/* loaded from: classes3.dex */
public final class AdvertBannerView extends WebView {
    public static final c f = new c();
    public b b;
    public boolean c;
    public ViewPropertyAnimator d;
    public ViewPropertyAnimator e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertBannerView.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style FULLSCREEN;
        public static final Style VERTICAL;
        private final int borderRadius = 12;
        private final int iconBorderRadius;
        private final int iconPaddings;
        private final int imageSize;
        private final boolean isTitleDisplay;

        static {
            Style style = new Style(0, false, "VERTICAL", 82, 12, 10);
            VERTICAL = style;
            Style style2 = new Style(1, true, "FULLSCREEN", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 0, 0);
            FULLSCREEN = style2;
            Style[] styleArr = {style, style2};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
        }

        public Style(int i, boolean z, String str, int i2, int i3, int i4) {
            this.imageSize = i2;
            this.iconPaddings = i3;
            this.iconBorderRadius = i4;
            this.isTitleDisplay = z;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }

        public final int h() {
            return this.borderRadius;
        }

        public final int i() {
            return this.iconBorderRadius;
        }

        public final int j() {
            return this.iconPaddings;
        }

        public final int k() {
            return this.imageSize;
        }

        public final boolean l() {
            return this.isTitleDisplay;
        }
    }

    /* compiled from: AdvertBannerView.kt */
    public final class a {
        public a() {
        }

        @JavascriptInterface
        public final void bannerClick(String str) {
            b onClickListener = AdvertBannerView.this.getOnClickListener();
            if (onClickListener != null) {
                onClickListener.onBannerClick();
            }
        }

        @JavascriptInterface
        public final void closeClick(String str) {
            b onClickListener = AdvertBannerView.this.getOnClickListener();
            if (onClickListener != null) {
                onClickListener.a();
            }
        }

        @JavascriptInterface
        public final void detailsClick(String str) {
            b onClickListener = AdvertBannerView.this.getOnClickListener();
            if (onClickListener != null) {
                onClickListener.c();
            }
        }

        @JavascriptInterface
        public final void linkClick(String str) {
            b onClickListener = AdvertBannerView.this.getOnClickListener();
            if (onClickListener != null) {
                onClickListener.b();
            }
        }

        @JavascriptInterface
        public final void menuClick(String str) {
            b onClickListener = AdvertBannerView.this.getOnClickListener();
            if (onClickListener != null) {
                onClickListener.d();
            }
        }
    }

    /* compiled from: AdvertBannerView.kt */
    public static final class c {
        public static AdvertBannerView a(Context context, b bVar) {
            AdvertBannerView advertBannerView = new AdvertBannerView(context, null, R.attr.webViewStyle);
            WebSettings settings = advertBannerView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setBuiltInZoomControls(false);
            settings.setDisplayZoomControls(false);
            settings.setBuiltInZoomControls(false);
            settings.setSupportZoom(false);
            advertBannerView.setVerticalScrollBarEnabled(false);
            advertBannerView.setHorizontalScrollBarEnabled(false);
            advertBannerView.setOverScrollMode(2);
            advertBannerView.addJavascriptInterface(advertBannerView.new a(), "AndroidBridge");
            advertBannerView.setBackgroundColor(context.getColor(R.color.transparent));
            advertBannerView.setLayerType(2, null);
            advertBannerView.setId(View.generateViewId());
            bwt0.p0(advertBannerView, false);
            advertBannerView.setOnClickListener(bVar);
            return advertBannerView;
        }

        public static AdvertBannerView b(Context context, b bVar) {
            Object failure;
            if (WebView.getCurrentWebViewPackage() == null) {
                L.e("AdvertBannerView", "System WebView is turned off or disabled");
                return null;
            }
            try {
                failure = a(context, bVar);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                mnh0.A(a);
            }
            return (AdvertBannerView) (failure instanceof Result.Failure ? null : failure);
        }
    }

    public final void a() {
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.e;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        bwt0.p0(this, false);
        loadUrl(AndroidWebViewClient.BLANK_PAGE);
        loadDataWithBaseURL(null, "", "text/html", C.UTF8_NAME, null);
        clearHistory();
        this.c = false;
    }

    public final void b(final boolean z, final e eVar) {
        if (this.c) {
            ViewPropertyAnimator withEndAction = animate().alpha(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(150L).withStartAction(new Runnable(this) { // from class: xsna.m31
                public final /* synthetic */ AdvertBannerView c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (z) {
                        bwt0.p0(this.c, true);
                    }
                }
            }).withEndAction(new Runnable() { // from class: xsna.n31
                @Override // java.lang.Runnable
                public final void run() {
                    if (!z) {
                        bwt0.p0(this, false);
                    }
                    gzs gzsVar = eVar;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                }
            });
            withEndAction.start();
            this.d = withEndAction;
        }
    }

    public final b getOnClickListener() {
        return this.b;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        scrollTo(0, 0);
        super.onScrollChanged(0, 0, 0, 0);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0 || action == 1 || action == 3) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setOnClickListener(b bVar) {
        this.b = bVar;
    }

    /* compiled from: AdvertBannerView.kt */
    public interface b {
        default void a() {
        }

        default void b() {
        }

        default void c() {
        }

        default void d() {
        }

        default void onBannerClick() {
        }
    }
}
