package io.intercom.android.sdk.overlay;

import android.content.Context;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;

@Deprecated
/* loaded from: classes9.dex */
public class LauncherOpenBehaviour {

    public enum LauncherType {
        DEFAULT,
        CUSTOM
    }

    public void openMessenger(Context context) {
        Injector.get().getMetricTracker().clickedLauncher();
        IntercomRootActivityLauncher.INSTANCE.startHome(context);
    }
}
