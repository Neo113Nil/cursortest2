package com.braintreepayments.popupbridge;

import android.view.MotionEvent;
import com.braintreepayments.browserswitch.BrowserSwitchActivity;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes2.dex */
public class PopupBridgeActivity extends BrowserSwitchActivity {
    @Override // com.braintreepayments.browserswitch.BrowserSwitchActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch("com.braintree", me2);
        return super.dispatchTouchEvent(me2);
    }
}
