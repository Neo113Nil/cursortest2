package Jc;

import Ic.AbstractC1350d;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.ThemedReactContext;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: g, reason: collision with root package name */
    public static final a f6115g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ReactContext f6116a;

    /* renamed from: b, reason: collision with root package name */
    public final Ic.i f6117b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1350d f6118c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f6119d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6120e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6121f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewGroup b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            ViewParent viewParent = viewGroup;
            while (viewParent != null && !(viewParent instanceof RootView)) {
                viewParent = viewParent.getParent();
            }
            if (viewParent != null) {
                return (ViewGroup) viewParent;
            }
            throw new IllegalStateException(("View " + viewGroup + " has not been mounted under ReactRootView").toString());
        }

        public a() {
        }
    }

    public final class b extends AbstractC1350d {
        public b(int i10) {
            I0(i10);
        }

        public final void U0(MotionEvent motionEvent) {
            Ic.i P10;
            if (S() == 0 && (!k.this.f6120e || (P10 = P()) == null || !P10.v())) {
                p();
                k.this.f6120e = false;
            }
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 10) {
                B();
            }
        }

        @Override // Ic.AbstractC1350d
        public void j0() {
            k.this.f6120e = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setAction(3);
            if (k.this.f() instanceof RootView) {
                RootView rootView = (RootView) k.this.f();
                ViewGroup f10 = k.this.f();
                Intrinsics.checkNotNull(obtain);
                rootView.onChildStartedNativeGesture(f10, obtain);
            }
            obtain.recycle();
        }

        @Override // Ic.AbstractC1350d
        public void l0(MotionEvent event, MotionEvent sourceEvent) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
            U0(event);
        }

        @Override // Ic.AbstractC1350d
        public void m0(MotionEvent event, MotionEvent sourceEvent) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
            U0(event);
        }
    }

    public k(ReactContext context, ViewGroup wrappedView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wrappedView, "wrappedView");
        this.f6116a = context;
        UiThreadUtil.assertOnUiThread();
        int id2 = wrappedView.getId();
        NativeModule nativeModule = context.getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        Intrinsics.checkNotNull(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        i registry = rNGestureHandlerModule.getRegistry();
        ViewGroup b10 = f6115g.b(wrappedView);
        this.f6119d = b10;
        Log.i(ReactConstants.TAG, "[GESTURE HANDLER] Initialize gesture handler for root view " + b10);
        Ic.i iVar = new Ic.i(wrappedView, registry, new o(), b10);
        iVar.F(0.1f);
        this.f6117b = iVar;
        b bVar = new b(-id2);
        this.f6118c = bVar;
        registry.j(bVar);
        registry.c(bVar.T(), id2, 3);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    public static final void h(k kVar) {
        kVar.k();
    }

    public final void d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Ic.i iVar = this.f6117b;
        if (iVar != null) {
            iVar.f(view);
        }
    }

    public final boolean e(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f6121f = true;
        Ic.i iVar = this.f6117b;
        Intrinsics.checkNotNull(iVar);
        iVar.B(event);
        this.f6121f = false;
        return this.f6120e;
    }

    public final ViewGroup f() {
        return this.f6119d;
    }

    public final void g(int i10, boolean z10) {
        if (z10) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: Jc.j
                @Override // java.lang.Runnable
                public final void run() {
                    k.h(k.this);
                }
            });
        }
    }

    public final void i() {
        if (this.f6117b == null || this.f6121f) {
            return;
        }
        k();
    }

    public final void j() {
        Log.i(ReactConstants.TAG, "[GESTURE HANDLER] Tearing down gesture handler registered for root view " + this.f6119d);
        ReactContext reactContext = this.f6116a;
        Intrinsics.checkNotNull(reactContext, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        NativeModule nativeModule = ((ThemedReactContext) reactContext).getReactApplicationContext().getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        Intrinsics.checkNotNull(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        i registry = rNGestureHandlerModule.getRegistry();
        AbstractC1350d abstractC1350d = this.f6118c;
        Intrinsics.checkNotNull(abstractC1350d);
        registry.g(abstractC1350d.T());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }

    public final void k() {
        AbstractC1350d abstractC1350d = this.f6118c;
        if (abstractC1350d == null || abstractC1350d.S() != 2) {
            return;
        }
        abstractC1350d.k();
        abstractC1350d.B();
    }
}
