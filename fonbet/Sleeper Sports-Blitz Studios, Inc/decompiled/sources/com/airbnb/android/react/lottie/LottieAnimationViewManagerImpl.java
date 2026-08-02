package com.airbnb.android.react.lottie;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.RenderMode;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: LottieAnimationViewManagerImpl.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0007J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0019H\u0007J \u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0007J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0007J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0007J\u001a\u0010!\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020$H\u0007J\u001a\u0010%\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020$H\u0007J\u001a\u0010'\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020$H\u0007J\u001a\u0010)\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0013H\u0007J\u001a\u0010-\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020$H\u0007J\u001a\u0010/\u001a\u00020\u00102\b\u00100\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u0002052\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u0002082\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u0010=\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u0010?\u001a\u00020\u00102\u0006\u0010@\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0007J\u001a\u0010A\u001a\u00020\u00102\b\u0010B\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020$H\u0007J\u001a\u0010C\u001a\u00020\u00102\b\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010#\u001a\u00020$H\u0007J\u001a\u0010F\u001a\u00020\u00102\b\u0010G\u001a\u0004\u0018\u00010E2\u0006\u0010#\u001a\u00020$H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n¨\u0006H"}, d2 = {"Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;", "", "<init>", "()V", "REACT_CLASS", "", "exportedViewConstants", "", "getExportedViewConstants$annotations", "getExportedViewConstants", "()Ljava/util/Map;", "createViewInstance", "Lcom/airbnb/lottie/LottieAnimationView;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "sendOnAnimationFinishEvent", "", ViewHierarchyConstants.VIEW_KEY, "isCancelled", "", "sendAnimationFailureEvent", "error", "", "sendAnimationLoadedEvent", "getExportedCustomDirectEventTypeConstants", "", "play", "startFrame", "", "endFrame", MetricTracker.Object.RESET, "pause", "resume", "setSourceName", "name", "viewManager", "Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;", "setSourceJson", "json", "setSourceURL", "urlString", "setSourceDotLottieURI", "uri", "setCacheComposition", "cacheComposition", "setResizeMode", ViewProps.RESIZE_MODE, "setRenderMode", "renderMode", "setHardwareAcceleration", "hardwareAccelerationAndroid", "setProgress", "progress", "", "setSpeed", "speed", "", "setLoop", "loop", "setAutoPlay", "autoPlay", "setEnableMergePaths", "enableMergePaths", "setEnableSafeMode", "enableSafeMode", "setImageAssetsFolder", "imageAssetsFolder", "setColorFilters", "colorFilters", "Lcom/facebook/react/bridge/ReadableArray;", "setTextFilters", "textFilters", "lottie-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LottieAnimationViewManagerImpl {
    public static final LottieAnimationViewManagerImpl INSTANCE = new LottieAnimationViewManagerImpl();
    public static final String REACT_CLASS = "LottieAnimationView";

    @JvmStatic
    public static /* synthetic */ void getExportedViewConstants$annotations() {
    }

    private LottieAnimationViewManagerImpl() {
    }

    public static final Map<String, Object> getExportedViewConstants() {
        return MapBuilder.builder().put("VERSION", 1).build();
    }

    @JvmStatic
    public static final LottieAnimationView createViewInstance(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        return lottieAnimationView;
    }

    @JvmStatic
    public static final void sendOnAnimationFinishEvent(LottieAnimationView view, boolean isCancelled) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new OnAnimationFinishEvent(themedReactContext.getSurfaceId(), view.getId(), isCancelled));
        }
    }

    @JvmStatic
    public static final void sendAnimationFailureEvent(LottieAnimationView view, Throwable error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(error, "error");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new OnAnimationFailureEvent(themedReactContext.getSurfaceId(), view.getId(), error));
        }
    }

    @JvmStatic
    public static final void sendAnimationLoadedEvent(LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new OnAnimationLoadedEvent(themedReactContext.getSurfaceId(), view.getId()));
        }
    }

    @JvmStatic
    public static final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of(OnAnimationFinishEvent.EVENT_NAME, MapBuilder.of("registrationName", "onAnimationFinish"), OnAnimationFailureEvent.EVENT_NAME, MapBuilder.of("registrationName", "onAnimationFailure"), OnAnimationLoadedEvent.EVENT_NAME, MapBuilder.of("registrationName", "onAnimationLoaded"));
    }

    @JvmStatic
    public static final void play(final LottieAnimationView view, final int startFrame, final int endFrame) {
        Intrinsics.checkNotNullParameter(view, "view");
        final boolean z = (startFrame == -1 || endFrame == -1) ? false : true;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.LottieAnimationViewManagerImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                LottieAnimationViewManagerImpl.play$lambda$1(z, startFrame, endFrame, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void play$lambda$1(final boolean z, int i, int i2, final LottieAnimationView lottieAnimationView) {
        if (!z) {
            LottieComposition composition = lottieAnimationView.getComposition();
            Integer valueOf = composition != null ? Integer.valueOf((int) composition.getStartFrame()) : null;
            LottieComposition composition2 = lottieAnimationView.getComposition();
            Integer valueOf2 = composition2 != null ? Integer.valueOf((int) composition2.getEndFrame()) : null;
            int minFrame = (int) lottieAnimationView.getMinFrame();
            int maxFrame = (int) lottieAnimationView.getMaxFrame();
            if (valueOf != null && valueOf2 != null && (minFrame != valueOf.intValue() || maxFrame != valueOf2.intValue())) {
                lottieAnimationView.setMinAndMaxFrame(valueOf.intValue(), valueOf2.intValue());
            }
        } else if (i > i2) {
            lottieAnimationView.setMinAndMaxFrame(i2, i);
            if (lottieAnimationView.getSpeed() > 0.0f) {
                lottieAnimationView.reverseAnimationSpeed();
            }
        } else {
            lottieAnimationView.setMinAndMaxFrame(i, i2);
            if (lottieAnimationView.getSpeed() < 0.0f) {
                lottieAnimationView.reverseAnimationSpeed();
            }
        }
        if (!ViewCompat.isAttachedToWindow(lottieAnimationView)) {
            lottieAnimationView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.airbnb.android.react.lottie.LottieAnimationViewManagerImpl$play$1$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) v;
                    if (z) {
                        lottieAnimationView.playAnimation();
                    } else {
                        lottieAnimationView.resumeAnimation();
                    }
                    lottieAnimationView2.removeOnAttachStateChangeListener(this);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    ((LottieAnimationView) v).removeOnAttachStateChangeListener(this);
                }
            });
        } else if (z) {
            lottieAnimationView.playAnimation();
        } else {
            lottieAnimationView.resumeAnimation();
        }
    }

    @JvmStatic
    public static final void reset(final LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.LottieAnimationViewManagerImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                LottieAnimationViewManagerImpl.reset$lambda$2(LottieAnimationView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reset$lambda$2(LottieAnimationView lottieAnimationView) {
        if (ViewCompat.isAttachedToWindow(lottieAnimationView)) {
            lottieAnimationView.cancelAnimation();
            lottieAnimationView.setProgress(0.0f);
        }
    }

    @JvmStatic
    public static final void pause(final LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.LottieAnimationViewManagerImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                LottieAnimationViewManagerImpl.pause$lambda$3(LottieAnimationView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$3(LottieAnimationView lottieAnimationView) {
        if (ViewCompat.isAttachedToWindow(lottieAnimationView)) {
            lottieAnimationView.pauseAnimation();
        }
    }

    @JvmStatic
    public static final void resume(final LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.LottieAnimationViewManagerImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                LottieAnimationViewManagerImpl.resume$lambda$4(LottieAnimationView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$4(LottieAnimationView lottieAnimationView) {
        if (ViewCompat.isAttachedToWindow(lottieAnimationView)) {
            lottieAnimationView.resumeAnimation();
        }
    }

    @JvmStatic
    public static final void setSourceName(String name, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (name != null && !StringsKt.contains$default((CharSequence) name, (CharSequence) ".", false, 2, (Object) null)) {
            name = name + ".json";
        }
        viewManager.setAnimationName(name);
        viewManager.commitChanges();
    }

    @JvmStatic
    public static final void setSourceJson(String json, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setAnimationJson(json);
        viewManager.commitChanges();
    }

    @JvmStatic
    public static final void setSourceURL(String urlString, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setAnimationURL(urlString);
        viewManager.commitChanges();
    }

    @JvmStatic
    public static final void setSourceDotLottieURI(String uri, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setSourceDotLottie(uri);
        viewManager.commitChanges();
    }

    @JvmStatic
    public static final void setCacheComposition(LottieAnimationView view, boolean cacheComposition) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setCacheComposition(cacheComposition);
    }

    @JvmStatic
    public static final void setResizeMode(String resizeMode, LottieAnimationViewPropertyManager viewManager) {
        ImageView.ScaleType scaleType;
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (resizeMode != null) {
            int hashCode = resizeMode.hashCode();
            if (hashCode != -1364013995) {
                if (hashCode != 94852023) {
                    if (hashCode == 951526612 && resizeMode.equals("contain")) {
                        scaleType = ImageView.ScaleType.FIT_CENTER;
                    }
                } else if (resizeMode.equals("cover")) {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
            } else if (resizeMode.equals("center")) {
                scaleType = ImageView.ScaleType.CENTER_INSIDE;
            }
            viewManager.setScaleType(scaleType);
        }
        scaleType = null;
        viewManager.setScaleType(scaleType);
    }

    @JvmStatic
    public static final void setRenderMode(String renderMode, LottieAnimationViewPropertyManager viewManager) {
        RenderMode renderMode2;
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (renderMode != null) {
            int hashCode = renderMode.hashCode();
            if (hashCode != 165298699) {
                if (hashCode != 899536360) {
                    if (hashCode == 2101957031 && renderMode.equals("SOFTWARE")) {
                        renderMode2 = RenderMode.SOFTWARE;
                    }
                } else if (renderMode.equals("HARDWARE")) {
                    renderMode2 = RenderMode.HARDWARE;
                }
            } else if (renderMode.equals("AUTOMATIC")) {
                renderMode2 = RenderMode.AUTOMATIC;
            }
            viewManager.setRenderMode(renderMode2);
        }
        renderMode2 = null;
        viewManager.setRenderMode(renderMode2);
    }

    @JvmStatic
    public static final void setHardwareAcceleration(boolean hardwareAccelerationAndroid, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        int i = 1;
        if (hardwareAccelerationAndroid) {
            i = 2;
        }
        viewManager.setLayerType(i);
    }

    @JvmStatic
    public static final void setProgress(float progress, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setProgress(Float.valueOf(progress));
    }

    @JvmStatic
    public static final void setSpeed(double speed, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setSpeed(Float.valueOf((float) speed));
    }

    @JvmStatic
    public static final void setLoop(boolean loop, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setLoop(Boolean.valueOf(loop));
    }

    @JvmStatic
    public static final void setAutoPlay(boolean autoPlay, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setAutoPlay(Boolean.valueOf(autoPlay));
    }

    @JvmStatic
    public static final void setEnableMergePaths(boolean enableMergePaths, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setEnableMergePaths(Boolean.valueOf(enableMergePaths));
    }

    @JvmStatic
    public static final void setEnableSafeMode(boolean enableSafeMode, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setEnableSafeMode(Boolean.valueOf(enableSafeMode));
    }

    @JvmStatic
    public static final void setImageAssetsFolder(String imageAssetsFolder, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setImageAssetsFolder(imageAssetsFolder);
    }

    @JvmStatic
    public static final void setColorFilters(ReadableArray colorFilters, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setColorFilters(colorFilters);
    }

    @JvmStatic
    public static final void setTextFilters(ReadableArray textFilters, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setTextFilters(textFilters);
    }
}
