package com.applovin.adview;

import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes2.dex */
public class AppLovinFullscreenImmersiveActivity extends AppLovinFullscreenActivity {
    @Override // com.applovin.adview.AppLovinFullscreenActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(h.a, me2);
        return super.dispatchTouchEvent(me2);
    }
}
