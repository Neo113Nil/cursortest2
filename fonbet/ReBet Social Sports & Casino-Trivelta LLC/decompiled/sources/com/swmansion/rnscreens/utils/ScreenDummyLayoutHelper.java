package com.swmansion.rnscreens.utils;

import W9.d;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.gifdecoder.e;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.i;
import com.swmansion.rnscreens.b0;
import com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper;
import dd.AbstractC4056c;
import dd.C4054a;
import i3.C4527h;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@DoNotStrip
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\u00022\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010BR\u0016\u0010F\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", ViewProps.FONT_SIZE, "", "isTitleEmpty", "", "computeDummyLayout", "(IZ)F", "", "onHostResume", "()V", "onHostPause", "onHostDestroy", i.f35755A, "(Lcom/facebook/react/bridge/ReactApplicationContext;)Z", "Landroid/content/Context;", "contextWithTheme", C4527h.f48087o, "(Landroid/content/Context;)V", "Landroid/app/Activity;", "activity", "k", "(Landroid/app/Activity;)V", "Lkotlin/Function0;", "", "lazyMessage", "l", "(Lkotlin/jvm/functions/Function0;)Lcom/facebook/react/bridge/ReactApplicationContext;", "Landroid/app/Application;", "application", "f", "(Landroid/app/Application;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "a", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "coordinatorLayout", "Lcom/google/android/material/appbar/AppBarLayout;", com.google.crypto.tink.integration.android.b.f37029b, "Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "Landroid/view/View;", "c", "Landroid/view/View;", "dummyContentView", "Landroidx/appcompat/widget/Toolbar;", d.f13160a, "Landroidx/appcompat/widget/Toolbar;", "toolbar", e.f29601m, "F", "defaultFontSize", "I", "defaultContentInsetStartWithNavigation", "Lcom/swmansion/rnscreens/utils/a;", "g", "Lcom/swmansion/rnscreens/utils/a;", "cache", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "reactContextRef", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "activityLifecycleCallbacks", "j", "Z", "isLayoutInitialized", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenDummyLayoutHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenDummyLayoutHelper.kt\ncom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,374:1\n1#2:375\n*E\n"})
/* loaded from: classes4.dex */
public final class ScreenDummyLayoutHelper implements LifecycleEventListener {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: l, reason: collision with root package name */
    public static WeakReference f42047l = new WeakReference(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public CoordinatorLayout coordinatorLayout;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public AppBarLayout appBarLayout;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public View dummyContentView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public Toolbar toolbar;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public float defaultFontSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int defaultContentInsetStartWithNavigation;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public a cache;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public WeakReference reactContextRef;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public volatile boolean isLayoutInitialized;

    /* renamed from: com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @DoNotStrip
        @Nullable
        public final ScreenDummyLayoutHelper getInstance() {
            return (ScreenDummyLayoutHelper) ScreenDummyLayoutHelper.f42047l.get();
        }

        public Companion() {
        }
    }

    public static final class b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f42058a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ScreenDummyLayoutHelper f42059b;

        public b(Activity activity, ScreenDummyLayoutHelper screenDummyLayoutHelper) {
            this.f42058a = activity;
            this.f42059b = screenDummyLayoutHelper;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity destroyedActivity) {
            Intrinsics.checkNotNullParameter(destroyedActivity, "destroyedActivity");
            if (destroyedActivity == this.f42058a) {
                ScreenDummyLayoutHelper screenDummyLayoutHelper = this.f42059b;
                Application application = destroyedActivity.getApplication();
                Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                screenDummyLayoutHelper.f(application);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public ScreenDummyLayoutHelper(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.cache = a.f42060c.a();
        this.reactContextRef = new WeakReference(reactContext);
        try {
            System.loadLibrary("react_codegen_rnscreens");
        } catch (UnsatisfiedLinkError unused) {
            Log.w("ScreenDummyLayoutHelper", "[RNScreens] Failed to load react_codegen_rnscreens library.");
        }
        f42047l = new WeakReference(this);
        i(reactContext);
        reactContext.addLifecycleEventListener(this);
    }

    @DoNotStrip
    private final synchronized float computeDummyLayout(int fontSize, boolean isTitleEmpty) {
        if (!this.isLayoutInitialized && !i(l(new Function0() { // from class: dd.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object g10;
                g10 = ScreenDummyLayoutHelper.g();
                return g10;
            }
        }))) {
            Log.e("ScreenDummyLayoutHelper", "[RNScreens] Failed to late-init layout while computing header height. This is most likely a race-condition-bug in react-native-screens, please file an issue at https://github.com/software-mansion/react-native-screens/issues");
            return 0.0f;
        }
        if (this.cache.c(new C4054a(fontSize, isTitleEmpty))) {
            return this.cache.b();
        }
        CoordinatorLayout coordinatorLayout = this.coordinatorLayout;
        AppBarLayout appBarLayout = this.appBarLayout;
        Toolbar toolbar = this.toolbar;
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.reactContextRef.get();
        Activity currentActivity = reactApplicationContext != null ? reactApplicationContext.getCurrentActivity() : null;
        if (coordinatorLayout != null && appBarLayout != null && toolbar != null && currentActivity != null) {
            View decorView = currentActivity.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            int a10 = AbstractC4056c.a(decorView);
            int width = decorView.getWidth();
            int height = decorView.getHeight();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
            if (isTitleEmpty) {
                toolbar.setTitle("");
                toolbar.setContentInsetStartWithNavigation(0);
            } else {
                toolbar.setTitle("FontSize123!#$");
                toolbar.setContentInsetStartWithNavigation(this.defaultContentInsetStartWithNavigation);
            }
            TextView a11 = b0.f41710G.a(toolbar);
            if (a11 != null) {
                a11.setTextSize(fontSize != -1 ? fontSize : this.defaultFontSize);
            }
            coordinatorLayout.measure(makeMeasureSpec, makeMeasureSpec2);
            coordinatorLayout.layout(0, 0, width, height);
            float dIPFromPixel = PixelUtil.toDIPFromPixel(appBarLayout.getHeight() + a10);
            this.cache = new a(new C4054a(fontSize, isTitleEmpty), dIPFromPixel);
            return dIPFromPixel;
        }
        return 0.0f;
    }

    public static final Object g() {
        return "[RNScreens] Context was null-ed before dummy layout was initialized";
    }

    @JvmStatic
    @DoNotStrip
    @Nullable
    public static final ScreenDummyLayoutHelper getInstance() {
        return INSTANCE.getInstance();
    }

    public static final Object j() {
        return "[RNScreens] ReactContext missing in onHostResume! This should not happen.";
    }

    public static final Object m() {
        return "[RNScreens] Attempt to require missing react context";
    }

    public final synchronized void f(Application application) {
        this.coordinatorLayout = null;
        this.appBarLayout = null;
        this.dummyContentView = null;
        this.toolbar = null;
        this.cache = a.f42060c.a();
        this.isLayoutInitialized = false;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.activityLifecycleCallbacks;
        if (activityLifecycleCallbacks != null) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            this.activityLifecycleCallbacks = null;
        }
    }

    public final void h(Context contextWithTheme) {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(contextWithTheme);
        AppBarLayout appBarLayout = new AppBarLayout(contextWithTheme);
        appBarLayout.setLayoutParams(new CoordinatorLayout.f(-1, -2));
        Toolbar toolbar = new Toolbar(contextWithTheme);
        toolbar.setTitle("FontSize123!#$");
        AppBarLayout.e eVar = new AppBarLayout.e(-1, -2);
        eVar.g(0);
        toolbar.setLayoutParams(eVar);
        TextView a10 = b0.f41710G.a(toolbar);
        if (a10 == null) {
            throw new IllegalStateException("[RNScreens] Failed to find TextView in children of Toolbar");
        }
        this.defaultFontSize = a10.getTextSize();
        this.defaultContentInsetStartWithNavigation = toolbar.getContentInsetStartWithNavigation();
        appBarLayout.addView(toolbar);
        View view = new View(contextWithTheme);
        view.setLayoutParams(new CoordinatorLayout.f(-1, -1));
        coordinatorLayout.addView(appBarLayout);
        coordinatorLayout.addView(view);
        this.coordinatorLayout = coordinatorLayout;
        this.appBarLayout = appBarLayout;
        this.toolbar = toolbar;
        this.dummyContentView = view;
        this.isLayoutInitialized = true;
    }

    public final boolean i(ReactApplicationContext reactContext) {
        if (this.isLayoutInitialized) {
            return true;
        }
        if (!reactContext.hasCurrentActivity()) {
            return false;
        }
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalArgumentException("[RNScreens] Attempt to use context detached from activity. This could happen only due to race-condition.");
        }
        synchronized (this) {
            if (this.isLayoutInitialized) {
                return true;
            }
            h(currentActivity);
            k(currentActivity);
            Unit unit = Unit.INSTANCE;
            return true;
        }
    }

    public final void k(Activity activity) {
        if (this.activityLifecycleCallbacks != null) {
            return;
        }
        this.activityLifecycleCallbacks = new b(activity, this);
        activity.getApplication().registerActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
    }

    public final ReactApplicationContext l(Function0 lazyMessage) {
        Object obj = this.reactContextRef.get();
        if (lazyMessage == null) {
            lazyMessage = new Function0() { // from class: dd.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Object m10;
                    m10 = ScreenDummyLayoutHelper.m();
                    return m10;
                }
            };
        }
        if (obj != null) {
            return (ReactApplicationContext) obj;
        }
        throw new IllegalArgumentException(lazyMessage.invoke().toString());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.reactContextRef.get();
        if (reactApplicationContext != null) {
            reactApplicationContext.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        ReactApplicationContext l10 = l(new Function0() { // from class: dd.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object j10;
                j10 = ScreenDummyLayoutHelper.j();
                return j10;
            }
        });
        if (i(l10)) {
            l10.removeLifecycleEventListener(this);
        } else {
            Log.w("ScreenDummyLayoutHelper", "[RNScreens] Failed to initialise dummy layout in onHostResume.");
        }
    }
}
