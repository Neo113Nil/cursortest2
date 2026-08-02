package com.rebet.android_frontend;

import android.R;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import com.braze.reactbridge.BrazeReactUtils;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactRootView;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.defaults.DefaultReactActivityDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, d2 = {"Lcom/rebet/android_frontend/MainActivity;", "Lcom/facebook/react/ReactActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getMainComponentName", "", "createReactActivityDelegate", "Lcom/facebook/react/ReactActivityDelegate;", "onNewIntent", "intent", "Landroid/content/Intent;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "app_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MainActivity extends ReactActivity {

    public static final class a extends DefaultReactActivityDelegate {
        public a(String str, boolean z10) {
            super(MainActivity.this, str, z10);
        }

        @Override // com.facebook.react.ReactActivityDelegate
        public ReactRootView createRootView() {
            ReactRootView createRootView = super.createRootView();
            if (createRootView != null) {
                createRootView.setBackgroundColor(-16777216);
            }
            return createRootView == null ? new ReactRootView(MainActivity.this) : createRootView;
        }
    }

    @Override // com.facebook.react.ReactActivity
    public ReactActivityDelegate createReactActivityDelegate() {
        return new a(getMainComponentName(), DefaultNewArchitectureEntryPoint.getFabricEnabled());
    }

    @Override // com.facebook.react.ReactActivity
    public String getMainComponentName() {
        return "Trivelta";
    }

    @Override // com.facebook.react.ReactActivity, m.AbstractActivityC5481c, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Intent intent = new Intent("onConfigurationChanged");
        intent.putExtra("newConfig", newConfig);
        sendBroadcast(intent);
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        BrazeReactUtils.populateInitialPushPayloadFromIntent(getIntent());
        super.onCreate(null);
        getWindow().setBackgroundDrawableResource(R.color.black);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
    }

    @Override // com.facebook.react.ReactActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            super.onNewIntent(intent);
        } catch (Exception e10) {
            Log.w("MainActivity", "onNewIntent error: " + e10.getMessage(), e10);
        }
        setIntent(intent);
    }
}
