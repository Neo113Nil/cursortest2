package com.applovin.creative;

import android.view.MotionEvent;
import com.applovin.impl.d1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public final class MaxCreativeDebuggerActivity extends d1 {
    @Override // com.applovin.impl.d1, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(h.a, me2);
        return super.dispatchTouchEvent(me2);
    }
}
