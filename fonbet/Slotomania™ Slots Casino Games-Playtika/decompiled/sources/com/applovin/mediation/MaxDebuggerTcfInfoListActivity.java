package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.b7;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes.dex */
public class MaxDebuggerTcfInfoListActivity extends b7 {
    @Override // com.applovin.impl.b7, com.applovin.impl.p3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(h.a, me2);
        return super.dispatchTouchEvent(me2);
    }
}
