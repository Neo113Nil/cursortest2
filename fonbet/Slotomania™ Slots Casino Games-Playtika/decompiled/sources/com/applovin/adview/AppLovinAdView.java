package com.applovin.adview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.a;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.vungle.ads.internal.protos.Sdk;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class AppLovinAdView extends RelativeLayout {
    public static final String NAMESPACE = "http://schemas.applovin.com/android/1.0";
    private a a;

    public AppLovinAdView(AppLovinAdSize appLovinAdSize) {
        this(appLovinAdSize, (String) null);
    }

    private void a(AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, Context context, AttributeSet attributeSet) {
        if (isInEditMode()) {
            a(attributeSet, context);
            return;
        }
        a aVar = new a();
        this.a = aVar;
        aVar.a(this, context, appLovinAdSize, str, appLovinSdk, attributeSet);
    }

    public void destroy() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(h.a, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public a getController() {
        return this.a;
    }

    public AppLovinAdSize getSize() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.k();
        }
        return null;
    }

    public String getZoneId() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.l();
        }
        return null;
    }

    public void loadNextAd() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.t();
        } else {
            p.i("AppLovinSdk", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.a;
        if (aVar != null) {
            aVar.A();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.B();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        a aVar = this.a;
        if (aVar != null) {
            aVar.c(z);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        a aVar = this.a;
        if (aVar != null) {
            aVar.c(i);
        }
    }

    public void pause() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.C();
        }
    }

    public void renderAd(AppLovinAd appLovinAd) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.c(appLovinAd);
        }
    }

    public void resume() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.D();
        }
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(appLovinAdClickListener);
        }
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(appLovinAdDisplayListener);
        }
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(appLovinAdLoadListener);
        }
    }

    public void setAdViewEventListener(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(appLovinAdViewEventListener);
        }
    }

    public void setExtraInfo(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(str, obj);
        }
    }

    @Override // android.view.View
    public String toString() {
        return "AppLovinAdView{zoneId='" + getZoneId() + "\", size=" + getSize() + AbstractJsonLexerKt.END_OBJ;
    }

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, String str) {
        super(l.p());
        a(appLovinAdSize, str, AppLovinSdk.getInstance(l.p()), l.p(), null);
    }

    public AppLovinAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppLovinAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(null, null, null, context, attributeSet);
    }

    @Deprecated
    public AppLovinAdView(AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinAdSize, (String) null, context);
    }

    @Deprecated
    public AppLovinAdView(AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context);
        a(appLovinAdSize, str, null, context, null);
    }

    private void a(AttributeSet attributeSet, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int applyDimension = (int) TypedValue.applyDimension(1, 50.0f, displayMetrics);
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin Ad");
        textView.setGravity(17);
        addView(textView, i, applyDimension);
    }

    @Deprecated
    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinSdk, appLovinAdSize, null, context);
    }

    @Deprecated
    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context.getApplicationContext());
        a(appLovinAdSize, str, appLovinSdk, context, null);
    }
}
