package com.appboy.cordova;

import android.view.View;
import android.view.animation.Animation;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.braze.ui.inappmessage.IInAppMessageViewWrapper;
import com.braze.ui.inappmessage.IInAppMessageViewWrapperFactory;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import java.util.List;

/* loaded from: classes3.dex */
public class CordovaInAppMessageViewWrapper extends DefaultInAppMessageViewWrapper {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) CordovaInAppMessageViewWrapper.class);

    public CordovaInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2) {
        super(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2);
    }

    public CordovaInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List<View> list, View view3) {
        super(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2, list, view3);
    }

    @Override // com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper
    public void finalizeViewBeforeDisplay(IInAppMessage iInAppMessage, View view, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener) {
        BrazeLogger.v(TAG, "Running custom Cordova finalizeViewBeforeDisplay");
        announceForAccessibilityIfNecessary("");
        iInAppMessageViewLifecycleListener.afterOpened(view, iInAppMessage);
    }

    public static class CordovaInAppMessageViewWrapperFactory implements IInAppMessageViewWrapperFactory {
        @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapperFactory
        public IInAppMessageViewWrapper createInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2) {
            return new CordovaInAppMessageViewWrapper(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2);
        }

        @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapperFactory
        public IInAppMessageViewWrapper createInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List<? extends View> list, View view3) {
            return new CordovaInAppMessageViewWrapper(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2, list, view3);
        }
    }
}
