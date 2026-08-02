package com.applovin.creative;

import android.view.MotionEvent;
import com.applovin.impl.p1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public final class MaxCreativeDebuggerDisplayedAdActivity extends p1 {
    @Override // com.applovin.impl.p1, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(h.a, me2);
        return super.dispatchTouchEvent(me2);
    }
}
