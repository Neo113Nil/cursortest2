package com.brentvatne.exoplayer;

import android.content.Context;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.twilio.voice.EventKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r4.c;
import r4.e;
import r4.i;
import r4.j;
import s4.EnumC6317a;
import t4.C6441a;
import t4.C6442b;
import u4.InterfaceC6492C;
import u4.W;
import v4.C6636c;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001^B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010%\u001a\u00020!H\u0007¢\u0006\u0004\b&\u0010$J!\u0010(\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b(\u0010\u001dJ!\u0010*\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b*\u0010\u001dJ!\u0010,\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b,\u0010\u001dJ\u001f\u0010.\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010-\u001a\u00020!H\u0007¢\u0006\u0004\b.\u0010$J\u001f\u00100\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010/\u001a\u00020!H\u0007¢\u0006\u0004\b0\u0010$J\u001f\u00102\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u00101\u001a\u00020!H\u0007¢\u0006\u0004\b2\u0010$J\u001f\u00104\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0007H\u0007¢\u0006\u0004\b4\u0010 J\u001f\u00107\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u00106\u001a\u000205H\u0007¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u00109\u001a\u000205H\u0007¢\u0006\u0004\b:\u00108J\u001f\u0010<\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010;\u001a\u00020!H\u0007¢\u0006\u0004\b<\u0010$J\u001f\u0010>\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010=\u001a\u000205H\u0007¢\u0006\u0004\b>\u00108J\u001f\u0010@\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010?\u001a\u000205H\u0007¢\u0006\u0004\b@\u00108J\u001f\u0010B\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010A\u001a\u00020!H\u0007¢\u0006\u0004\bB\u0010$J\u001f\u0010D\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010C\u001a\u00020!H\u0007¢\u0006\u0004\bD\u0010$J\u001f\u0010F\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010E\u001a\u00020!H\u0007¢\u0006\u0004\bF\u0010$J\u001f\u0010H\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u0007H\u0007¢\u0006\u0004\bH\u0010 J\u001f\u0010J\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010I\u001a\u00020!H\u0007¢\u0006\u0004\bJ\u0010$J\u001f\u0010L\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010K\u001a\u00020!H\u0007¢\u0006\u0004\bL\u0010$J\u001f\u0010O\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010N\u001a\u00020MH\u0007¢\u0006\u0004\bO\u0010PJ\u001f\u0010R\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020!H\u0007¢\u0006\u0004\bR\u0010$J!\u0010S\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\bS\u0010\u001dJ\u001f\u0010U\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010T\u001a\u00020MH\u0007¢\u0006\u0004\bU\u0010PJ\u001f\u0010W\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010V\u001a\u00020!H\u0007¢\u0006\u0004\bW\u0010$J!\u0010Y\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010X\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\bY\u0010\u001dJ!\u0010[\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010Z\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b[\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\\¨\u0006_"}, d2 = {"Lcom/brentvatne/exoplayer/ReactExoplayerViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lu4/W;", "Lu4/C;", "config", "<init>", "(Lu4/C;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "themedReactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lu4/W;", "view", "", "onDropViewInstance", "(Lu4/W;)V", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "reactContext", "addEventEmitters", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lu4/W;)V", "videoView", "Lcom/facebook/react/bridge/ReadableMap;", ReactExoplayerViewManager.PROP_SRC, "setSrc", "(Lu4/W;Lcom/facebook/react/bridge/ReadableMap;)V", "resizeMode", "setResizeMode", "(Lu4/W;Ljava/lang/String;)V", "", ReactExoplayerViewManager.PROP_REPEAT, "setRepeat", "(Lu4/W;Z)V", "preventsSleep", "setPreventsDisplaySleepDuringVideoPlayback", ReactExoplayerViewManager.PROP_SELECTED_VIDEO_TRACK, "setSelectedVideoTrack", ReactExoplayerViewManager.PROP_SELECTED_AUDIO_TRACK, "setSelectedAudioTrack", ReactExoplayerViewManager.PROP_SELECTED_TEXT_TRACK, "setSelectedTextTrack", ReactExoplayerViewManager.PROP_PAUSED, "setPaused", ReactExoplayerViewManager.PROP_MUTED, "setMuted", ReactExoplayerViewManager.PROP_ENTER_PICTURE_IN_PICTURE_ON_LEAVE, "setEnterPictureInPictureOnLeave", ReactExoplayerViewManager.PROP_AUDIO_OUTPUT, "setAudioOutput", "", ReactExoplayerViewManager.PROP_VOLUME, "setVolume", "(Lu4/W;F)V", ReactExoplayerViewManager.PROP_PROGRESS_UPDATE_INTERVAL, "setProgressUpdateInterval", ReactExoplayerViewManager.PROP_REPORT_BANDWIDTH, "setReportBandwidth", ReactExoplayerViewManager.PROP_RATE, "setRate", ReactExoplayerViewManager.PROP_MAXIMUM_BIT_RATE, "setMaxBitRate", ReactExoplayerViewManager.PROP_PLAY_IN_BACKGROUND, "setPlayInBackground", ReactExoplayerViewManager.PROP_DISABLE_FOCUS, "setDisableFocus", ReactExoplayerViewManager.PROP_FOCUSABLE, "setFocusable", ReactExoplayerViewManager.PROP_BUFFERING_STRATEGY, "setBufferingStrategy", ReactExoplayerViewManager.PROP_DISABLE_DISCONNECT_ERROR, "setDisableDisconnectError", ReactExoplayerViewManager.PROP_FULLSCREEN, "setFullscreen", "", ReactExoplayerViewManager.PROP_VIEW_TYPE, "setViewType", "(Lu4/W;I)V", ReactExoplayerViewManager.PROP_CONTROLS, "setControls", "setSubtitleStyle", ViewProps.COLOR, "setShutterColor", ReactExoplayerViewManager.PROP_SHOW_NOTIFICATION_CONTROLS, "setShowNotificationControls", "debugConfig", "setDebug", ReactExoplayerViewManager.PROP_CONTROLS_STYLES, "setControlsStyles", "Lu4/C;", "Companion", "a", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReactExoplayerViewManager extends ViewGroupManager<W> {

    @NotNull
    private static final String PROP_AUDIO_OUTPUT = "audioOutput";

    @NotNull
    private static final String PROP_BUFFERING_STRATEGY = "bufferingStrategy";

    @NotNull
    private static final String PROP_CONTROLS = "controls";

    @NotNull
    private static final String PROP_CONTROLS_STYLES = "controlsStyles";

    @NotNull
    private static final String PROP_DEBUG = "debug";

    @NotNull
    private static final String PROP_DISABLE_DISCONNECT_ERROR = "disableDisconnectError";

    @NotNull
    private static final String PROP_DISABLE_FOCUS = "disableFocus";

    @NotNull
    private static final String PROP_ENTER_PICTURE_IN_PICTURE_ON_LEAVE = "enterPictureInPictureOnLeave";

    @NotNull
    private static final String PROP_FOCUSABLE = "focusable";

    @NotNull
    private static final String PROP_FULLSCREEN = "fullscreen";

    @NotNull
    private static final String PROP_MAXIMUM_BIT_RATE = "maxBitRate";

    @NotNull
    private static final String PROP_MUTED = "muted";

    @NotNull
    private static final String PROP_PAUSED = "paused";

    @NotNull
    private static final String PROP_PLAY_IN_BACKGROUND = "playInBackground";

    @NotNull
    private static final String PROP_PREVENTS_DISPLAY_SLEEP_DURING_VIDEO_PLAYBACK = "preventsDisplaySleepDuringVideoPlayback";

    @NotNull
    private static final String PROP_PROGRESS_UPDATE_INTERVAL = "progressUpdateInterval";

    @NotNull
    private static final String PROP_RATE = "rate";

    @NotNull
    private static final String PROP_REPEAT = "repeat";

    @NotNull
    private static final String PROP_REPORT_BANDWIDTH = "reportBandwidth";

    @NotNull
    private static final String PROP_RESIZE_MODE = "resizeMode";

    @NotNull
    private static final String PROP_SELECTED_AUDIO_TRACK = "selectedAudioTrack";

    @NotNull
    private static final String PROP_SELECTED_AUDIO_TRACK_TYPE = "type";

    @NotNull
    private static final String PROP_SELECTED_AUDIO_TRACK_VALUE = "value";

    @NotNull
    private static final String PROP_SELECTED_TEXT_TRACK = "selectedTextTrack";

    @NotNull
    private static final String PROP_SELECTED_TEXT_TRACK_TYPE = "type";

    @NotNull
    private static final String PROP_SELECTED_TEXT_TRACK_VALUE = "value";

    @NotNull
    private static final String PROP_SELECTED_VIDEO_TRACK = "selectedVideoTrack";

    @NotNull
    private static final String PROP_SELECTED_VIDEO_TRACK_TYPE = "type";

    @NotNull
    private static final String PROP_SELECTED_VIDEO_TRACK_VALUE = "value";

    @NotNull
    private static final String PROP_SHOW_NOTIFICATION_CONTROLS = "showNotificationControls";

    @NotNull
    private static final String PROP_SHUTTER_COLOR = "shutterColor";

    @NotNull
    private static final String PROP_SRC = "src";

    @NotNull
    private static final String PROP_SUBTITLE_STYLE = "subtitleStyle";

    @NotNull
    private static final String PROP_VIEW_TYPE = "viewType";

    @NotNull
    private static final String PROP_VOLUME = "volume";

    @NotNull
    private static final String REACT_CLASS = "RCTVideo";

    @NotNull
    private static final String TAG = "ExoViewManager";

    @NotNull
    private final InterfaceC6492C config;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactExoplayerViewManager(@NotNull InterfaceC6492C config) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return EnumC6317a.f64727b.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = PROP_AUDIO_OUTPUT)
    public final void setAudioOutput(@NotNull W videoView, @NotNull String audioOutput) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(audioOutput, "audioOutput");
        videoView.setAudioOutput(a.f29489c.a(audioOutput));
    }

    @ReactProp(name = PROP_BUFFERING_STRATEGY)
    public final void setBufferingStrategy(@NotNull W videoView, @NotNull String bufferingStrategy) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(bufferingStrategy, "bufferingStrategy");
        videoView.setBufferingStrategy(c.f63950a.a(bufferingStrategy));
    }

    @ReactProp(defaultBoolean = false, name = PROP_CONTROLS)
    public final void setControls(@NotNull W videoView, boolean controls) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setControls(controls);
    }

    @ReactProp(name = PROP_CONTROLS_STYLES)
    public final void setControlsStyles(@NotNull W videoView, @Nullable ReadableMap controlsStyles) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setControlsStyles(e.f63961o.a(controlsStyles));
    }

    @ReactProp(defaultBoolean = false, name = PROP_DEBUG)
    public final void setDebug(@NotNull W videoView, @Nullable ReadableMap debugConfig) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        boolean b10 = C6442b.b(debugConfig, "enable", false);
        boolean b11 = C6442b.b(debugConfig, "thread", false);
        if (b10) {
            C6441a.e(2, b11);
        } else {
            C6441a.e(5, b11);
        }
        videoView.setDebug(b10);
    }

    @ReactProp(defaultBoolean = false, name = PROP_DISABLE_DISCONNECT_ERROR)
    public final void setDisableDisconnectError(@NotNull W videoView, boolean disableDisconnectError) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setDisableDisconnectError(disableDisconnectError);
    }

    @ReactProp(defaultBoolean = false, name = PROP_DISABLE_FOCUS)
    public final void setDisableFocus(@NotNull W videoView, boolean disableFocus) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setDisableFocus(disableFocus);
    }

    @ReactProp(defaultBoolean = false, name = PROP_ENTER_PICTURE_IN_PICTURE_ON_LEAVE)
    public final void setEnterPictureInPictureOnLeave(@NotNull W videoView, boolean enterPictureInPictureOnLeave) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setEnterPictureInPictureOnLeave(enterPictureInPictureOnLeave);
    }

    @ReactProp(defaultBoolean = true, name = PROP_FOCUSABLE)
    public final void setFocusable(@NotNull W videoView, boolean focusable) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setFocusable(focusable);
    }

    @ReactProp(defaultBoolean = false, name = PROP_FULLSCREEN)
    public final void setFullscreen(@NotNull W videoView, boolean fullscreen) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setFullscreen(fullscreen);
    }

    @ReactProp(name = PROP_MAXIMUM_BIT_RATE)
    public final void setMaxBitRate(@NotNull W videoView, float maxBitRate) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setMaxBitRateModifier((int) maxBitRate);
    }

    @ReactProp(defaultBoolean = false, name = PROP_MUTED)
    public final void setMuted(@NotNull W videoView, boolean muted) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setMutedModifier(muted);
    }

    @ReactProp(defaultBoolean = false, name = PROP_PAUSED)
    public final void setPaused(@NotNull W videoView, boolean paused) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setPausedModifier(paused);
    }

    @ReactProp(defaultBoolean = false, name = PROP_PLAY_IN_BACKGROUND)
    public final void setPlayInBackground(@NotNull W videoView, boolean playInBackground) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setPlayInBackground(playInBackground);
    }

    @ReactProp(defaultBoolean = false, name = PROP_PREVENTS_DISPLAY_SLEEP_DURING_VIDEO_PLAYBACK)
    public final void setPreventsDisplaySleepDuringVideoPlayback(@NotNull W videoView, boolean preventsSleep) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setPreventsDisplaySleepDuringVideoPlayback(preventsSleep);
    }

    @ReactProp(defaultFloat = 250.0f, name = PROP_PROGRESS_UPDATE_INTERVAL)
    public final void setProgressUpdateInterval(@NotNull W videoView, float progressUpdateInterval) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setProgressUpdateInterval(progressUpdateInterval);
    }

    @ReactProp(name = PROP_RATE)
    public final void setRate(@NotNull W videoView, float rate) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setRateModifier(rate);
    }

    @ReactProp(defaultBoolean = false, name = PROP_REPEAT)
    public final void setRepeat(@NotNull W videoView, boolean repeat) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setRepeatModifier(repeat);
    }

    @ReactProp(defaultBoolean = false, name = PROP_REPORT_BANDWIDTH)
    public final void setReportBandwidth(@NotNull W videoView, boolean reportBandwidth) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setReportBandwidth(reportBandwidth);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r5.equals(com.facebook.react.uimanager.ViewProps.NONE) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r5.equals("contain") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
    
        r4.setResizeModeModifier(0);
     */
    @ReactProp(name = "resizeMode")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setResizeMode(@NotNull W videoView, @NotNull String resizeMode) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(resizeMode, "resizeMode");
        switch (resizeMode.hashCode()) {
            case -1881872635:
                if (resizeMode.equals("stretch")) {
                    videoView.setResizeModeModifier(3);
                    break;
                }
                C6441a.f(TAG, "Unsupported resize mode: " + resizeMode + " - falling back to fit");
                videoView.setResizeModeModifier(0);
                break;
            case 3387192:
                break;
            case 94852023:
                if (resizeMode.equals("cover")) {
                    videoView.setResizeModeModifier(4);
                    break;
                }
                C6441a.f(TAG, "Unsupported resize mode: " + resizeMode + " - falling back to fit");
                videoView.setResizeModeModifier(0);
                break;
            case 951526612:
                break;
            default:
                C6441a.f(TAG, "Unsupported resize mode: " + resizeMode + " - falling back to fit");
                videoView.setResizeModeModifier(0);
                break;
        }
    }

    @ReactProp(name = PROP_SELECTED_AUDIO_TRACK)
    public final void setSelectedAudioTrack(@NotNull W videoView, @Nullable ReadableMap selectedAudioTrack) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        if (selectedAudioTrack != null) {
            str = C6442b.g(selectedAudioTrack, "type");
            str2 = C6442b.g(selectedAudioTrack, EventKeys.VALUE_KEY);
        } else {
            str = null;
            str2 = null;
        }
        videoView.b2(str, str2);
    }

    @ReactProp(name = PROP_SELECTED_TEXT_TRACK)
    public final void setSelectedTextTrack(@NotNull W videoView, @Nullable ReadableMap selectedTextTrack) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        if (selectedTextTrack != null) {
            str = C6442b.g(selectedTextTrack, "type");
            str2 = C6442b.g(selectedTextTrack, EventKeys.VALUE_KEY);
        } else {
            str = null;
            str2 = null;
        }
        videoView.c2(str, str2);
    }

    @ReactProp(name = PROP_SELECTED_VIDEO_TRACK)
    public final void setSelectedVideoTrack(@NotNull W videoView, @Nullable ReadableMap selectedVideoTrack) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        if (selectedVideoTrack != null) {
            str = C6442b.g(selectedVideoTrack, "type");
            str2 = C6442b.g(selectedVideoTrack, EventKeys.VALUE_KEY);
        } else {
            str = null;
            str2 = null;
        }
        videoView.e2(str, str2);
    }

    @ReactProp(name = PROP_SHOW_NOTIFICATION_CONTROLS)
    public final void setShowNotificationControls(@NotNull W videoView, boolean showNotificationControls) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setShowNotificationControls(showNotificationControls);
    }

    @ReactProp(defaultInt = -16777216, name = PROP_SHUTTER_COLOR)
    public final void setShutterColor(@NotNull W videoView, int color) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setShutterColor(Integer.valueOf(color));
    }

    @ReactProp(name = PROP_SRC)
    public final void setSrc(@NotNull W videoView, @Nullable ReadableMap src) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Context applicationContext = videoView.getContext().getApplicationContext();
        i.a aVar = i.f63991r;
        Intrinsics.checkNotNull(applicationContext);
        videoView.setSrc(aVar.c(src, applicationContext));
    }

    @ReactProp(name = PROP_SUBTITLE_STYLE)
    public final void setSubtitleStyle(@NotNull W videoView, @Nullable ReadableMap src) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setSubtitleStyle(j.f64015h.a(src));
    }

    @ReactProp(defaultInt = 1, name = PROP_VIEW_TYPE)
    public final void setViewType(@NotNull W videoView, int viewType) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setViewType(viewType);
    }

    @ReactProp(defaultFloat = 1.0f, name = PROP_VOLUME)
    public final void setVolume(@NotNull W videoView, float volume) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        videoView.setVolumeModifier(volume);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull ThemedReactContext reactContext, @NotNull W view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        super.addEventEmitters(reactContext, (ThemedReactContext) view);
        view.f66033a.T(reactContext, view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public W createViewInstance(@NotNull ThemedReactContext themedReactContext) {
        Intrinsics.checkNotNullParameter(themedReactContext, "themedReactContext");
        C6636c.f67018d.a().j(this);
        return new W(themedReactContext, this.config);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull W view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.W0();
        view.g1();
        C6636c.f67018d.a().l(this);
    }
}
