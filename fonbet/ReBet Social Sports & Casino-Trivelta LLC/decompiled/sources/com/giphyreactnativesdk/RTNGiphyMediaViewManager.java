package com.giphyreactnativesdk;

import X8.h;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(name = RTNGiphyMediaViewManager.NAME)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0014\u0010\u0013J#\u0010\u0015\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0015\u0010\u0013J!\u0010\u0016\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0016\u0010\u0011J+\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001f\u0010\u001e¨\u0006\""}, d2 = {"Lcom/giphyreactnativesdk/RTNGiphyMediaViewManager;", "Lcom/giphyreactnativesdk/RTNGiphyMediaViewManagerSpec;", "LX8/h;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)LX8/h;", "view", "", EventKeys.VALUE_KEY, "", "setShowCheckeredBackground", "(LX8/h;Z)V", "setResizeMode", "(LX8/h;Ljava/lang/String;)V", "setRenditionType", "setMediaId", "setAutoPlay", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(LX8/h;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "resume", "(LX8/h;)V", "pause", "Companion", "a", "giphy_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RTNGiphyMediaViewManager extends RTNGiphyMediaViewManagerSpec<h> {

    @NotNull
    public static final String NAME = "RTNGiphyMediaView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public h createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new h(context, null, 0, 6, null);
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyMediaViewManagerInterface
    public void pause(@Nullable h view) {
        if (view != null) {
            view.s();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NotNull h root, @Nullable String commandId, @Nullable ReadableArray args) {
        Intrinsics.checkNotNullParameter(root, "root");
        if (Intrinsics.areEqual(commandId, "resume")) {
            resume(root);
        } else if (Intrinsics.areEqual(commandId, "pause")) {
            pause(root);
        }
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyMediaViewManagerInterface
    public void resume(@Nullable h view) {
        if (view != null) {
            view.t();
        }
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyMediaViewManagerInterface
    @ReactProp(name = "autoPlay")
    public void setAutoPlay(@Nullable h view, boolean value) {
        if (view != null) {
            view.setAutoPlay(Boolean.valueOf(value));
        }
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyMediaViewManagerInterface
    @ReactProp(name = "mediaId")
    public void setMediaId(@Nullable h view, @Nullable String value) {
        if (view != null) {
            view.setMedia(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyMediaViewManagerInterface
    @ReactProp(name = "renditionType")
    public void setRenditionType(@Nullable h view, @Nullable String value) {
        if (view != null) {
            view.setRenditionType(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyMediaViewManagerInterface
    @ReactProp(name = ViewProps.RESIZE_MODE)
    public void setResizeMode(@Nullable h view, @Nullable String value) {
        if (view != null) {
            view.setResizeMode(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyMediaViewManagerInterface
    @ReactProp(name = "showCheckeredBackground")
    public void setShowCheckeredBackground(@Nullable h view, boolean value) {
        if (view != null) {
            view.setShowCheckeredBackground(Boolean.valueOf(value));
        }
    }
}
