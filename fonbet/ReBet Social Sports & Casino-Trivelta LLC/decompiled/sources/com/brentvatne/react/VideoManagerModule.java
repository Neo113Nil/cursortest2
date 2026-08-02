package com.brentvatne.react;

import android.view.View;
import com.brentvatne.react.VideoManagerModule;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r4.i;
import u4.W;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0001,B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\"\u0010!J!\u0010%\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/brentvatne/react/VideoManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "reactTag", "Lkotlin/Function1;", "Lu4/W;", "", "callback", "performOnPlayerView", "(ILkotlin/jvm/functions/Function1;)V", "", "getName", "()Ljava/lang/String;", "", "paused", "setPlayerPauseStateCmd", "(ILjava/lang/Boolean;)V", "", "time", "tolerance", "seekCmd", "(IFF)V", "volume", "setVolumeCmd", "(IF)V", "fullScreen", "setFullScreenCmd", "(IZ)V", "enterPictureInPictureCmd", "(I)V", "exitPictureInPictureCmd", "Lcom/facebook/react/bridge/ReadableMap;", "source", "setSourceCmd", "(ILcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getCurrentPosition", "(ILcom/facebook/react/bridge/Promise;)V", "Companion", "a", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VideoManagerModule extends ReactContextBaseJavaModule {

    @NotNull
    private static final String REACT_CLASS = "VideoManager";

    public VideoManagerModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enterPictureInPictureCmd$lambda$5(W w10) {
        if (w10 != null) {
            w10.f1();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit exitPictureInPictureCmd$lambda$6(W w10) {
        if (w10 != null) {
            w10.g1();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCurrentPosition$lambda$8(Promise promise, W w10) {
        if (w10 != null) {
            w10.k1(promise);
        }
        return Unit.INSTANCE;
    }

    private final void performOnPlayerView(final int reactTag, final Function1<? super W, Unit> callback) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: v4.f
            @Override // java.lang.Runnable
            public final void run() {
                VideoManagerModule.performOnPlayerView$lambda$0(VideoManagerModule.this, reactTag, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performOnPlayerView$lambda$0(VideoManagerModule videoManagerModule, int i10, Function1 function1) {
        try {
            ReactApplicationContext reactApplicationContext = videoManagerModule.getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            UIManager uIManager = UIManagerHelper.getUIManager(reactApplicationContext, 2);
            View resolveView = uIManager != null ? uIManager.resolveView(i10) : null;
            if (resolveView instanceof W) {
                function1.invoke(resolveView);
            } else {
                function1.invoke(null);
            }
        } catch (Exception unused) {
            function1.invoke(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit seekCmd$lambda$2(float f10, W w10) {
        if (w10 != null) {
            w10.Z1(MathKt.roundToInt(f10 * 1000.0f));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFullScreenCmd$lambda$4(boolean z10, W w10) {
        if (w10 != null) {
            w10.setFullscreen(z10);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPlayerPauseStateCmd$lambda$1(Boolean bool, W w10) {
        if (w10 != null) {
            Intrinsics.checkNotNull(bool);
            w10.setPausedModifier(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSourceCmd$lambda$7(ReadableMap readableMap, VideoManagerModule videoManagerModule, W w10) {
        if (w10 != null) {
            i.a aVar = i.f63991r;
            ReactApplicationContext reactApplicationContext = videoManagerModule.getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            w10.setSrc(aVar.c(readableMap, reactApplicationContext));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setVolumeCmd$lambda$3(float f10, W w10) {
        if (w10 != null) {
            w10.setVolumeModifier(f10);
        }
        return Unit.INSTANCE;
    }

    @ReactMethod
    public final void enterPictureInPictureCmd(int reactTag) {
        performOnPlayerView(reactTag, new Function1() { // from class: v4.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit enterPictureInPictureCmd$lambda$5;
                enterPictureInPictureCmd$lambda$5 = VideoManagerModule.enterPictureInPictureCmd$lambda$5((W) obj);
                return enterPictureInPictureCmd$lambda$5;
            }
        });
    }

    @ReactMethod
    public final void exitPictureInPictureCmd(int reactTag) {
        performOnPlayerView(reactTag, new Function1() { // from class: v4.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit exitPictureInPictureCmd$lambda$6;
                exitPictureInPictureCmd$lambda$6 = VideoManagerModule.exitPictureInPictureCmd$lambda$6((W) obj);
                return exitPictureInPictureCmd$lambda$6;
            }
        });
    }

    @ReactMethod
    public final void getCurrentPosition(int reactTag, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        performOnPlayerView(reactTag, new Function1() { // from class: v4.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit currentPosition$lambda$8;
                currentPosition$lambda$8 = VideoManagerModule.getCurrentPosition$lambda$8(Promise.this, (W) obj);
                return currentPosition$lambda$8;
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public final void seekCmd(int reactTag, final float time, float tolerance) {
        performOnPlayerView(reactTag, new Function1() { // from class: v4.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit seekCmd$lambda$2;
                seekCmd$lambda$2 = VideoManagerModule.seekCmd$lambda$2(time, (W) obj);
                return seekCmd$lambda$2;
            }
        });
    }

    @ReactMethod
    public final void setFullScreenCmd(int reactTag, final boolean fullScreen) {
        performOnPlayerView(reactTag, new Function1() { // from class: v4.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit fullScreenCmd$lambda$4;
                fullScreenCmd$lambda$4 = VideoManagerModule.setFullScreenCmd$lambda$4(fullScreen, (W) obj);
                return fullScreenCmd$lambda$4;
            }
        });
    }

    @ReactMethod
    public final void setPlayerPauseStateCmd(int reactTag, @Nullable final Boolean paused) {
        performOnPlayerView(reactTag, new Function1() { // from class: v4.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit playerPauseStateCmd$lambda$1;
                playerPauseStateCmd$lambda$1 = VideoManagerModule.setPlayerPauseStateCmd$lambda$1(paused, (W) obj);
                return playerPauseStateCmd$lambda$1;
            }
        });
    }

    @ReactMethod
    public final void setSourceCmd(int reactTag, @Nullable final ReadableMap source) {
        performOnPlayerView(reactTag, new Function1() { // from class: v4.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit sourceCmd$lambda$7;
                sourceCmd$lambda$7 = VideoManagerModule.setSourceCmd$lambda$7(ReadableMap.this, this, (W) obj);
                return sourceCmd$lambda$7;
            }
        });
    }

    @ReactMethod
    public final void setVolumeCmd(int reactTag, final float volume) {
        performOnPlayerView(reactTag, new Function1() { // from class: v4.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit volumeCmd$lambda$3;
                volumeCmd$lambda$3 = VideoManagerModule.setVolumeCmd$lambda$3(volume, (W) obj);
                return volumeCmd$lambda$3;
            }
        });
    }
}
