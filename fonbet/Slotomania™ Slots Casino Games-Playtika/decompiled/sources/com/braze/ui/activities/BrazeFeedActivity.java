package com.braze.ui.activities;

import android.os.Bundle;
import android.view.MotionEvent;
import com.braze.ui.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes8.dex */
public class BrazeFeedActivity extends BrazeBaseFragmentActivity {
    @Override // com.braze.ui.activities.BrazeBaseFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch("com.appboy", me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.com_braze_feed_activity);
    }
}
