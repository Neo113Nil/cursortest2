package com.braze.ui.activities;

import android.view.MotionEvent;
import androidx.fragment.app.FragmentActivity;
import com.braze.Braze;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Metadata;

/* compiled from: BrazeBaseFragmentActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/braze/ui/activities/BrazeBaseFragmentActivity;", "Landroidx/fragment/app/FragmentActivity;", "()V", X3.i.t0, "", X3.i.u0, "onStart", "onStop", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public class BrazeBaseFragmentActivity extends FragmentActivity {
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch("com.appboy", me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        Braze.INSTANCE.getInstance(this).openSession(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        BrazeInAppMessageManager.INSTANCE.getInstance().registerInAppMessageManager(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        BrazeInAppMessageManager.INSTANCE.getInstance().unregisterInAppMessageManager(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        Braze.INSTANCE.getInstance(this).closeSession(this);
    }
}
