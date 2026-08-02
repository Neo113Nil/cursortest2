package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes2.dex */
public class w1 extends AppLovinAdView {
    public w1(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, Context context) {
        super(appLovinSdk, appLovinAdSize, context);
    }

    @Override // com.applovin.adview.AppLovinAdView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.a, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.adview.AppLovinAdView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
