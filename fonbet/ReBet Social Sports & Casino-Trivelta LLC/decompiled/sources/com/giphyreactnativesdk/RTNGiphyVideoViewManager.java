package com.giphyreactnativesdk;

import X8.p;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.twilio.voice.EventKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(name = RTNGiphyVideoViewManager.NAME)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0012\u0010\u0011J#\u0010\u0013\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/giphyreactnativesdk/RTNGiphyVideoViewManager;", "Lcom/giphyreactnativesdk/RTNGiphyVideoViewManagerSpec;", "LX8/p;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)LX8/p;", "view", "", EventKeys.VALUE_KEY, "", "setAutoPlay", "(LX8/p;Z)V", "setMuted", "setMediaId", "(LX8/p;Ljava/lang/String;)V", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "eventName", "addListener", "(Ljava/lang/String;)V", "", "count", "removeListeners", "(Ljava/lang/Integer;)V", "Companion", "a", "giphy_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RTNGiphyVideoViewManager extends RTNGiphyVideoViewManagerSpec<p> {

    @NotNull
    public static final String NAME = "RTNGiphyVideoView";

    @ReactMethod
    public final void addListener(@Nullable String eventName) {
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = MapBuilder.newHashMap();
        }
        exportedCustomDirectEventTypeConstants.put("topPlaybackStateChange", MapBuilder.of("registrationName", "onPlaybackStateChanged"));
        exportedCustomDirectEventTypeConstants.put("topMuteEvent", MapBuilder.of("registrationName", "onMuteEvent"));
        exportedCustomDirectEventTypeConstants.put("topUnmuteEvent", MapBuilder.of("registrationName", "onUnmuteEvent"));
        exportedCustomDirectEventTypeConstants.put("topErrorEvent", MapBuilder.of("registrationName", "onErrorEvent"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void removeListeners(@Nullable Integer count) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public p createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new p(context, null, 0, 6, null);
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyVideoViewManagerInterface
    @ReactProp(name = "autoPlay")
    public void setAutoPlay(@Nullable p view, boolean value) {
        if (view != null) {
            view.setAutoPlay(Boolean.valueOf(value));
        }
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyVideoViewManagerInterface
    @ReactProp(name = "mediaId")
    public void setMediaId(@Nullable p view, @Nullable String value) {
        if (view != null) {
            view.setMedia(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyVideoViewManagerInterface
    @ReactProp(name = "muted")
    public void setMuted(@Nullable p view, boolean value) {
        if (view != null) {
            view.setMuted(Boolean.valueOf(value));
        }
    }
}
