package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.o3;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public final class MaxDebuggerActivity extends o3 {
    @Override // com.applovin.impl.o3, com.applovin.impl.p3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(h.a, me2);
        return super.dispatchTouchEvent(me2);
    }
}
