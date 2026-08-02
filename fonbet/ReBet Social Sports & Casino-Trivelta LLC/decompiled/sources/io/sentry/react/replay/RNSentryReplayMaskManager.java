package io.sentry.react.replay;

import androidx.annotation.NonNull;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSentryReplayMaskManagerDelegate;
import com.facebook.react.viewmanagers.RNSentryReplayMaskManagerInterface;

@ReactModule(name = "RNSentryReplayMask")
/* loaded from: classes3.dex */
public class RNSentryReplayMaskManager extends ViewGroupManager<a> implements RNSentryReplayMaskManagerInterface<a> {
    private final RNSentryReplayMaskManagerDelegate<a, RNSentryReplayMaskManager> delegate = new RNSentryReplayMaskManagerDelegate<>(this);

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<a> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RNSentryReplayMask";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public a createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return new a(themedReactContext);
    }
}
