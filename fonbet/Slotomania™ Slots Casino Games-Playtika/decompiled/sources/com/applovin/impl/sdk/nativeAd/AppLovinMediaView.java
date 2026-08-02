package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.z4;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes7.dex */
public class AppLovinMediaView extends FrameLayout {
    protected final ImageView imageView;
    protected final p logger;
    protected final AppLovinNativeAdImpl nativeAd;
    protected final l sdk;

    public AppLovinMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, l lVar, Context context) {
        super(context);
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.nativeAd = appLovinNativeAdImpl;
        this.sdk = lVar;
        this.logger = lVar.Q();
        LayoutInflater.from(context).inflate(R.layout.applovin_native_ad_media_view, (ViewGroup) this, true);
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        r7 vastAd = appLovinNativeAdImpl.getVastAd();
        Uri n0 = vastAd != null ? vastAd.n0() : null;
        if (mainImageUri == null && n0 == null) {
            throw new IllegalStateException("AppLovin native ad missing image AND video resources");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) lVar.a(z4.J2)).booleanValue()) {
            setOnTouchListener(new AppLovinTouchToClickListener(lVar, z4.g0, context, appLovinNativeAdImpl));
        } else {
            setOnClickListener(appLovinNativeAdImpl);
        }
        ImageView imageView = (ImageView) findViewById(R.id.image_view);
        this.imageView = imageView;
        if (mainImageUri != null) {
            ImageViewUtils.setAndDownscaleImageUri(imageView, mainImageUri);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public void destroy() {
        setOnClickListener(null);
        setOnTouchListener(null);
        removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(h.a, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
