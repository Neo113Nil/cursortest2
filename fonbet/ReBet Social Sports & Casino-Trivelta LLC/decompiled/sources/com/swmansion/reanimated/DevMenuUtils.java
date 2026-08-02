package com.swmansion.reanimated;

import com.facebook.react.ReactApplication;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.devsupport.interfaces.DevSupportManager;

/* loaded from: classes4.dex */
public class DevMenuUtils {
    public static void addDevMenuOption(ReactApplicationContext reactApplicationContext, DevOptionHandler devOptionHandler) {
        if (reactApplicationContext.getApplicationContext() instanceof ReactApplication) {
            DevSupportManager devSupportManager = ((ReactApplication) reactApplicationContext.getApplicationContext()).getReactHost().getDevSupportManager();
            if (devSupportManager == null) {
                throw new RuntimeException("[Reanimated] DevSupportManager is not available");
            }
            devSupportManager.addCustomDevOption("Toggle slow animations (Reanimated)", devOptionHandler);
        }
    }
}
