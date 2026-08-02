package com.airbnb.android.react.lottie;

import android.animation.Animator;
import com.airbnb.android.react.lottie.LottieAnimationViewManager;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.O;
import com.airbnb.lottie.Q;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.LottieAnimationViewManagerDelegate;
import com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.twilio.voice.EventKeys;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z3.C6919g;
import z3.C6920h;

@ReactModule(name = "LottieAnimationView")
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010!\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J'\u0010&\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010\u001cJ\u0017\u0010)\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010\u001cJ\u0017\u0010*\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010\u001cJ!\u0010,\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b,\u0010-J!\u0010/\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b/\u0010-J!\u00101\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b1\u0010-J!\u00102\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b2\u0010-J\u001f\u00105\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00104\u001a\u000203H\u0017¢\u0006\u0004\b5\u00106J!\u00108\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b8\u0010-J!\u0010:\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b:\u0010-J\u001f\u0010=\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010<\u001a\u00020;H\u0017¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010@\u001a\u00020?H\u0017¢\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010C\u001a\u000203H\u0017¢\u0006\u0004\bD\u00106J\u001f\u0010F\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010E\u001a\u000203H\u0017¢\u0006\u0004\bF\u00106J!\u0010H\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010G\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\bH\u0010-J\u001f\u0010J\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010I\u001a\u000203H\u0017¢\u0006\u0004\bJ\u00106J\u001f\u0010L\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010K\u001a\u000203H\u0017¢\u0006\u0004\bL\u00106J\u001f\u0010N\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010M\u001a\u000203H\u0017¢\u0006\u0004\bN\u00106J!\u0010P\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010O\u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\bP\u0010QJ!\u0010S\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\bS\u0010QJ#\u0010U\u001a\u00020\u001a2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010T\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\bU\u0010QJ!\u0010W\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010T\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\bW\u0010XR \u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006^"}, d2 = {"Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/airbnb/lottie/LottieAnimationView;", "Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;", "<init>", "()V", "view", "Lz3/h;", "getOrCreatePropertyManager", "(Lcom/airbnb/lottie/LottieAnimationView;)Lz3/h;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "", "", "", "getExportedViewConstants", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/airbnb/lottie/LottieAnimationView;", "", "getExportedCustomDirectEventTypeConstants", "", "onAfterUpdateTransaction", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "", "startFrame", "endFrame", "play", "(Lcom/airbnb/lottie/LottieAnimationView;II)V", "reset", "pause", "resume", "name", "setSourceName", "(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V", "json", "setSourceJson", "urlString", "setSourceURL", "setSourceDotLottieURI", "", "cacheComposition", "setCacheComposition", "(Lcom/airbnb/lottie/LottieAnimationView;Z)V", ViewProps.RESIZE_MODE, "setResizeMode", "renderMode", "setRenderMode", "", ReactProgressBarViewManager.PROP_PROGRESS, "setProgress", "(Lcom/airbnb/lottie/LottieAnimationView;F)V", "", "speed", "setSpeed", "(Lcom/airbnb/lottie/LottieAnimationView;D)V", "loop", "setLoop", "autoPlay", "setAutoPlay", "imageAssetsFolder", "setImageAssetsFolder", "enableMergePaths", "setEnableMergePathsAndroidForKitKatAndAbove", "enableSafeMode", "setEnableSafeModeAndroid", "hardwareAccelerationAndroid", "setHardwareAccelerationAndroid", "colorFilters", "setColorFilters", "(Lcom/airbnb/lottie/LottieAnimationView;Lcom/facebook/react/bridge/ReadableArray;)V", "textFilters", "setTextFiltersAndroid", EventKeys.VALUE_KEY, "setTextFiltersIOS", "Lcom/facebook/react/bridge/ReadableMap;", "setDummy", "(Lcom/airbnb/lottie/LottieAnimationView;Lcom/facebook/react/bridge/ReadableMap;)V", "Ljava/util/WeakHashMap;", "propManagersMap", "Ljava/util/WeakHashMap;", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "lottie-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LottieAnimationViewManager extends SimpleViewManager<LottieAnimationView> implements LottieAnimationViewManagerInterface<LottieAnimationView> {

    @NotNull
    private final WeakHashMap<LottieAnimationView, C6920h> propManagersMap = new WeakHashMap<>();

    @NotNull
    private final ViewManagerDelegate<LottieAnimationView> delegate = new LottieAnimationViewManagerDelegate(this);

    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f28334a;

        public a(LottieAnimationView lottieAnimationView) {
            this.f28334a = lottieAnimationView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            C6919g.r(this.f28334a, true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            C6919g.r(this.f28334a, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$0(LottieAnimationView lottieAnimationView, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C6919g.p(lottieAnimationView, th2);
    }

    private final C6920h getOrCreatePropertyManager(LottieAnimationView view) {
        C6920h c6920h = this.propManagersMap.get(view);
        if (c6920h != null) {
            return c6920h;
        }
        C6920h c6920h2 = new C6920h(view);
        this.propManagersMap.put(view, c6920h2);
        return c6920h2;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<LottieAnimationView> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return C6919g.f();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedViewConstants() {
        return C6919g.g();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "LottieAnimationView";
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    public void setDummy(@NotNull LottieAnimationView view, @Nullable ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    public void setTextFiltersIOS(@Nullable LottieAnimationView view, @Nullable ReadableArray value) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public LottieAnimationView createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final LottieAnimationView e10 = C6919g.e(context);
        e10.setFailureListener(new O() { // from class: z3.a
            @Override // com.airbnb.lottie.O
            public final void onResult(Object obj) {
                LottieAnimationViewManager.createViewInstance$lambda$0(LottieAnimationView.this, (Throwable) obj);
            }
        });
        e10.j(new Q() { // from class: z3.b
            @Override // com.airbnb.lottie.Q
            public final void a(C2940j c2940j) {
                C6919g.q(LottieAnimationView.this);
            }
        });
        e10.i(new a(e10));
        return e10;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction((LottieAnimationViewManager) view);
        getOrCreatePropertyManager(view).a();
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    public void pause(@NotNull LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.h(view);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    public void play(@NotNull LottieAnimationView view, int startFrame, int endFrame) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.j(view, startFrame, endFrame);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NotNull LottieAnimationView root, @NotNull String commandId, @Nullable ReadableArray args) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        this.delegate.kotlinCompat$receiveCommandNullableArgs(root, commandId, args);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    public void reset(@NotNull LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.l(view);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    public void resume(@NotNull LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.n(view);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "autoPlay")
    public void setAutoPlay(@NotNull LottieAnimationView view, boolean autoPlay) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.s(autoPlay, getOrCreatePropertyManager(view));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "cacheComposition")
    public void setCacheComposition(@NotNull LottieAnimationView view, boolean cacheComposition) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.t(view, cacheComposition);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "colorFilters")
    public void setColorFilters(@NotNull LottieAnimationView view, @Nullable ReadableArray colorFilters) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.u(colorFilters, getOrCreatePropertyManager(view));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "enableMergePathsAndroidForKitKatAndAbove")
    public void setEnableMergePathsAndroidForKitKatAndAbove(@NotNull LottieAnimationView view, boolean enableMergePaths) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.v(enableMergePaths, getOrCreatePropertyManager(view));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "enableSafeModeAndroid")
    public void setEnableSafeModeAndroid(@NotNull LottieAnimationView view, boolean enableSafeMode) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.w(enableSafeMode, getOrCreatePropertyManager(view));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "hardwareAccelerationAndroid")
    public void setHardwareAccelerationAndroid(@NotNull LottieAnimationView view, boolean hardwareAccelerationAndroid) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.x(hardwareAccelerationAndroid, getOrCreatePropertyManager(view));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "imageAssetsFolder")
    public void setImageAssetsFolder(@NotNull LottieAnimationView view, @Nullable String imageAssetsFolder) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.y(imageAssetsFolder, getOrCreatePropertyManager(view));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "loop")
    public void setLoop(@NotNull LottieAnimationView view, boolean loop) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.z(loop, getOrCreatePropertyManager(view));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = ReactProgressBarViewManager.PROP_PROGRESS)
    public void setProgress(@NotNull LottieAnimationView view, float progress) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.A(progress, getOrCreatePropertyManager(view));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "renderMode")
    public void setRenderMode(@NotNull LottieAnimationView view, @Nullable String renderMode) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.B(renderMode, getOrCreatePropertyManager(view));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = ViewProps.RESIZE_MODE)
    public void setResizeMode(@NotNull LottieAnimationView view, @Nullable String resizeMode) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.C(resizeMode, getOrCreatePropertyManager(view));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "sourceDotLottieURI")
    public void setSourceDotLottieURI(@NotNull LottieAnimationView view, @Nullable String urlString) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.D(urlString, getOrCreatePropertyManager(view));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "sourceJson")
    public void setSourceJson(@NotNull LottieAnimationView view, @Nullable String json) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.E(json, getOrCreatePropertyManager(view));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "sourceName")
    public void setSourceName(@NotNull LottieAnimationView view, @Nullable String name) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.F(name, getOrCreatePropertyManager(view));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "sourceURL")
    public void setSourceURL(@NotNull LottieAnimationView view, @Nullable String urlString) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.G(urlString, getOrCreatePropertyManager(view));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "speed")
    public void setSpeed(@NotNull LottieAnimationView view, double speed) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.H(speed, getOrCreatePropertyManager(view));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "textFiltersAndroid")
    public void setTextFiltersAndroid(@NotNull LottieAnimationView view, @Nullable ReadableArray textFilters) {
        Intrinsics.checkNotNullParameter(view, "view");
        C6919g.I(textFilters, getOrCreatePropertyManager(view));
    }
}
