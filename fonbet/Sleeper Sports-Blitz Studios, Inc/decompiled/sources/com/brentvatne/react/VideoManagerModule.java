package com.brentvatne.react;

import android.view.View;
import com.brentvatne.common.api.Source;
import com.brentvatne.exoplayer.ReactExoplayerView;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.microsoft.codepush.react.CodePushConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: VideoManagerModule.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t0\rH\u0002J\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012J \u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0007J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0015H\u0007J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0011H\u0007J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u001a\u0010\u001d\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u0018\u0010 \u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"H\u0007¨\u0006$"}, d2 = {"Lcom/brentvatne/react/VideoManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "performOnPlayerView", "", "reactTag", "", "callback", "Lkotlin/Function1;", "Lcom/brentvatne/exoplayer/ReactExoplayerView;", "setPlayerPauseStateCmd", "paused", "", "(ILjava/lang/Boolean;)V", "seekCmd", CodePushConstants.LATEST_ROLLBACK_TIME_KEY, "", "tolerance", "setVolumeCmd", "volume", "setFullScreenCmd", "fullScreen", "enterPictureInPictureCmd", "exitPictureInPictureCmd", "setSourceCmd", "source", "Lcom/facebook/react/bridge/ReadableMap;", "getCurrentPosition", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "Companion", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoManagerModule extends ReactContextBaseJavaModule {
    private static final String REACT_CLASS = "VideoManager";

    public VideoManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    private final void performOnPlayerView(final int reactTag, final Function1<? super ReactExoplayerView, Unit> callback) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.brentvatne.react.VideoManagerModule$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                VideoManagerModule.performOnPlayerView$lambda$0(VideoManagerModule.this, reactTag, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performOnPlayerView$lambda$0(VideoManagerModule videoManagerModule, int i, Function1 function1) {
        try {
            ReactApplicationContext reactApplicationContext = videoManagerModule.getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            UIManager uIManager = UIManagerHelper.getUIManager(reactApplicationContext, 2);
            View resolveView = uIManager != null ? uIManager.resolveView(i) : null;
            if (resolveView instanceof ReactExoplayerView) {
                function1.invoke(resolveView);
            } else {
                function1.invoke(null);
            }
        } catch (Exception unused) {
            function1.invoke(null);
        }
    }

    @ReactMethod
    public final void setPlayerPauseStateCmd(int reactTag, final Boolean paused) {
        performOnPlayerView(reactTag, new Function1() { // from class: com.brentvatne.react.VideoManagerModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit playerPauseStateCmd$lambda$1;
                playerPauseStateCmd$lambda$1 = VideoManagerModule.setPlayerPauseStateCmd$lambda$1(paused, (ReactExoplayerView) obj);
                return playerPauseStateCmd$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPlayerPauseStateCmd$lambda$1(Boolean bool, ReactExoplayerView reactExoplayerView) {
        if (reactExoplayerView != null) {
            Intrinsics.checkNotNull(bool);
            reactExoplayerView.setPausedModifier(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    @ReactMethod
    public final void seekCmd(int reactTag, final float time, float tolerance) {
        performOnPlayerView(reactTag, new Function1() { // from class: com.brentvatne.react.VideoManagerModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit seekCmd$lambda$2;
                seekCmd$lambda$2 = VideoManagerModule.seekCmd$lambda$2(time, (ReactExoplayerView) obj);
                return seekCmd$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit seekCmd$lambda$2(float f, ReactExoplayerView reactExoplayerView) {
        if (reactExoplayerView != null) {
            reactExoplayerView.seekTo(MathKt.roundToInt(f * 1000.0f));
        }
        return Unit.INSTANCE;
    }

    @ReactMethod
    public final void setVolumeCmd(int reactTag, final float volume) {
        performOnPlayerView(reactTag, new Function1() { // from class: com.brentvatne.react.VideoManagerModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit volumeCmd$lambda$3;
                volumeCmd$lambda$3 = VideoManagerModule.setVolumeCmd$lambda$3(volume, (ReactExoplayerView) obj);
                return volumeCmd$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setVolumeCmd$lambda$3(float f, ReactExoplayerView reactExoplayerView) {
        if (reactExoplayerView != null) {
            reactExoplayerView.setVolumeModifier(f);
        }
        return Unit.INSTANCE;
    }

    @ReactMethod
    public final void setFullScreenCmd(int reactTag, final boolean fullScreen) {
        performOnPlayerView(reactTag, new Function1() { // from class: com.brentvatne.react.VideoManagerModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit fullScreenCmd$lambda$4;
                fullScreenCmd$lambda$4 = VideoManagerModule.setFullScreenCmd$lambda$4(fullScreen, (ReactExoplayerView) obj);
                return fullScreenCmd$lambda$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFullScreenCmd$lambda$4(boolean z, ReactExoplayerView reactExoplayerView) {
        if (reactExoplayerView != null) {
            reactExoplayerView.setFullscreen(z);
        }
        return Unit.INSTANCE;
    }

    @ReactMethod
    public final void enterPictureInPictureCmd(int reactTag) {
        performOnPlayerView(reactTag, new Function1() { // from class: com.brentvatne.react.VideoManagerModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit enterPictureInPictureCmd$lambda$5;
                enterPictureInPictureCmd$lambda$5 = VideoManagerModule.enterPictureInPictureCmd$lambda$5((ReactExoplayerView) obj);
                return enterPictureInPictureCmd$lambda$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enterPictureInPictureCmd$lambda$5(ReactExoplayerView reactExoplayerView) {
        if (reactExoplayerView != null) {
            reactExoplayerView.enterPictureInPictureMode();
        }
        return Unit.INSTANCE;
    }

    @ReactMethod
    public final void exitPictureInPictureCmd(int reactTag) {
        performOnPlayerView(reactTag, new Function1() { // from class: com.brentvatne.react.VideoManagerModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit exitPictureInPictureCmd$lambda$6;
                exitPictureInPictureCmd$lambda$6 = VideoManagerModule.exitPictureInPictureCmd$lambda$6((ReactExoplayerView) obj);
                return exitPictureInPictureCmd$lambda$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit exitPictureInPictureCmd$lambda$6(ReactExoplayerView reactExoplayerView) {
        if (reactExoplayerView != null) {
            reactExoplayerView.exitPictureInPictureMode();
        }
        return Unit.INSTANCE;
    }

    @ReactMethod
    public final void setSourceCmd(int reactTag, final ReadableMap source) {
        performOnPlayerView(reactTag, new Function1() { // from class: com.brentvatne.react.VideoManagerModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit sourceCmd$lambda$7;
                sourceCmd$lambda$7 = VideoManagerModule.setSourceCmd$lambda$7(ReadableMap.this, this, (ReactExoplayerView) obj);
                return sourceCmd$lambda$7;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSourceCmd$lambda$7(ReadableMap readableMap, VideoManagerModule videoManagerModule, ReactExoplayerView reactExoplayerView) {
        if (reactExoplayerView != null) {
            Source.Companion companion = Source.INSTANCE;
            ReactApplicationContext reactApplicationContext = videoManagerModule.getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            reactExoplayerView.setSrc(companion.parse(readableMap, reactApplicationContext));
        }
        return Unit.INSTANCE;
    }

    @ReactMethod
    public final void getCurrentPosition(int reactTag, final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        performOnPlayerView(reactTag, new Function1() { // from class: com.brentvatne.react.VideoManagerModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit currentPosition$lambda$8;
                currentPosition$lambda$8 = VideoManagerModule.getCurrentPosition$lambda$8(Promise.this, (ReactExoplayerView) obj);
                return currentPosition$lambda$8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCurrentPosition$lambda$8(Promise promise, ReactExoplayerView reactExoplayerView) {
        if (reactExoplayerView != null) {
            reactExoplayerView.getCurrentPosition(promise);
        }
        return Unit.INSTANCE;
    }
}
