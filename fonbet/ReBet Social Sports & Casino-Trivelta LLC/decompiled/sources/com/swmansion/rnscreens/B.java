package com.swmansion.rnscreens;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.C3834z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public class B extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f41623a;

    /* renamed from: b, reason: collision with root package name */
    public FragmentManager f41624b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41625c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41626d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41627e;

    /* renamed from: f, reason: collision with root package name */
    public final Choreographer.FrameCallback f41628f;

    /* renamed from: g, reason: collision with root package name */
    public H f41629g;

    public static final class a implements Choreographer.FrameCallback {
        public a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            B.this.f41627e = false;
            B b10 = B.this;
            b10.measure(View.MeasureSpec.makeMeasureSpec(b10.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(B.this.getHeight(), 1073741824));
            B b11 = B.this;
            b11.layout(b11.getLeft(), B.this.getTop(), B.this.getRight(), B.this.getBottom());
        }
    }

    public B(Context context) {
        super(context);
        this.f41623a = new ArrayList();
        this.f41628f = new a();
    }

    private final void setFragmentManager(FragmentManager fragmentManager) {
        this.f41624b = fragmentManager;
        w();
    }

    public static final void t(B b10) {
        b10.v();
    }

    public final void A() {
        boolean z10;
        Unit unit;
        ViewParent viewParent = this;
        while (true) {
            z10 = viewParent instanceof ReactRootView;
            if (z10 || (viewParent instanceof Oc.a) || viewParent.getParent() == null) {
                break;
            }
            viewParent = viewParent.getParent();
            Intrinsics.checkNotNullExpressionValue(viewParent, "getParent(...)");
        }
        if (viewParent instanceof C3834z) {
            H fragmentWrapper = ((C3834z) viewParent).getFragmentWrapper();
            if (fragmentWrapper != null) {
                this.f41629g = fragmentWrapper;
                fragmentWrapper.C(this);
                FragmentManager childFragmentManager = fragmentWrapper.o().getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                setFragmentManager(childFragmentManager);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("Parent Screen does not have its Fragment attached");
            }
            return;
        }
        if (!(viewParent instanceof Oc.a)) {
            if (!z10) {
                throw new IllegalStateException("ScreenContainer is not attached under ReactRootView");
            }
            setFragmentManager(j((ReactRootView) viewParent));
            return;
        }
        Fragment associatedFragment = ((Oc.a) viewParent).getAssociatedFragment();
        if (associatedFragment != null) {
            FragmentManager childFragmentManager2 = associatedFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            setFragmentManager(childFragmentManager2);
        } else {
            throw new IllegalStateException(("[RNScreens] Parent " + viewParent + " returned nullish fragment").toString());
        }
    }

    public H c(C3834z screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new G(screen);
    }

    public final void d(C3834z screen, int i10) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        H c10 = c(screen);
        screen.setFragmentWrapper(c10);
        this.f41623a.add(i10, c10);
        screen.setContainer(this);
        s();
    }

    public final void e() {
        if (this.f41623a.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        androidx.fragment.app.N g10 = g();
        C3834z topScreen = getTopScreen();
        Intrinsics.checkNotNull(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        Fragment fragment = topScreen.getFragment();
        Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        i(g10, fragment);
        ArrayList arrayList = this.f41623a;
        f(g10, ((H) arrayList.get(arrayList.size() - 2)).o());
        Fragment fragment2 = topScreen.getFragment();
        Intrinsics.checkNotNull(fragment2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        f(g10, fragment2);
        g10.k();
    }

    public final void f(androidx.fragment.app.N n10, Fragment fragment) {
        n10.b(getId(), fragment);
    }

    public final androidx.fragment.app.N g() {
        FragmentManager fragmentManager = this.f41624b;
        if (fragmentManager == null) {
            throw new IllegalArgumentException("fragment manager is null when creating transaction");
        }
        androidx.fragment.app.N w10 = fragmentManager.s().w(true);
        Intrinsics.checkNotNullExpressionValue(w10, "setReorderingAllowed(...)");
        return w10;
    }

    public final int getScreenCount() {
        return this.f41623a.size();
    }

    @Nullable
    public C3834z getTopScreen() {
        Object obj;
        Iterator it = this.f41623a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (k((H) obj) == C3834z.a.f42106c) {
                break;
            }
        }
        H h10 = (H) obj;
        if (h10 != null) {
            return h10.b();
        }
        return null;
    }

    public final void h() {
        if (this.f41623a.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        androidx.fragment.app.N g10 = g();
        ArrayList arrayList = this.f41623a;
        i(g10, ((H) arrayList.get(arrayList.size() - 2)).o());
        g10.k();
    }

    public final void i(androidx.fragment.app.N n10, Fragment fragment) {
        n10.n(fragment);
    }

    public final FragmentManager j(ReactRootView reactRootView) {
        boolean z10;
        Context context = reactRootView.getContext();
        while (true) {
            z10 = context instanceof AbstractActivityC2168s;
            if (z10 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!z10) {
            throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactActivity");
        }
        AbstractActivityC2168s abstractActivityC2168s = (AbstractActivityC2168s) context;
        if (abstractActivityC2168s.getSupportFragmentManager().C0().isEmpty()) {
            FragmentManager supportFragmentManager = abstractActivityC2168s.getSupportFragmentManager();
            Intrinsics.checkNotNull(supportFragmentManager);
            return supportFragmentManager;
        }
        try {
            FragmentManager childFragmentManager = FragmentManager.n0(reactRootView).getChildFragmentManager();
            Intrinsics.checkNotNull(childFragmentManager);
            return childFragmentManager;
        } catch (IllegalStateException unused) {
            FragmentManager supportFragmentManager2 = abstractActivityC2168s.getSupportFragmentManager();
            Intrinsics.checkNotNull(supportFragmentManager2);
            return supportFragmentManager2;
        }
    }

    public final C3834z.a k(H h10) {
        return h10.b().getActivityState();
    }

    public final C3834z l(int i10) {
        return ((H) this.f41623a.get(i10)).b();
    }

    public final H m(int i10) {
        Object obj = this.f41623a.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (H) obj;
    }

    public boolean n(H h10) {
        return CollectionsKt.contains(this.f41623a, h10);
    }

    public void o() {
        H fragmentWrapper;
        C3834z topScreen = getTopScreen();
        if (topScreen == null || (fragmentWrapper = topScreen.getFragmentWrapper()) == null) {
            return;
        }
        fragmentWrapper.E();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41625c = true;
        A();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        FragmentManager fragmentManager = this.f41624b;
        if (fragmentManager != null && !fragmentManager.P0()) {
            y(fragmentManager);
            fragmentManager.k0();
        }
        H h10 = this.f41629g;
        if (h10 != null) {
            h10.I(this);
        }
        this.f41629g = null;
        super.onDetachedFromWindow();
        this.f41625c = false;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            } else {
                removeViewAt(childCount);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            getChildAt(i14).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12).measure(i10, i11);
        }
    }

    public final void p(C3834z screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (getContext() instanceof ReactContext) {
            int surfaceId = UIManagerHelper.getSurfaceId(getContext());
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, screen.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new Mc.h(surfaceId, screen.getId()));
            }
        }
    }

    public final void q() {
        C3834z topScreen = getTopScreen();
        Intrinsics.checkNotNull(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        if (getContext() instanceof ReactContext) {
            int surfaceId = UIManagerHelper.getSurfaceId(getContext());
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, topScreen.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new Mc.h(surfaceId, topScreen.getId()));
            }
        }
    }

    public final void r() {
        w();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.f41627e || this.f41628f == null) {
            return;
        }
        this.f41627e = true;
        ReactChoreographer.INSTANCE.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.f41628f);
    }

    public final void s() {
        this.f41626d = true;
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((ThemedReactContext) context).getReactApplicationContext().runOnUiQueueThread(new Runnable() { // from class: com.swmansion.rnscreens.A
            @Override // java.lang.Runnable
            public final void run() {
                B.t(B.this);
            }
        });
    }

    public void u() {
        androidx.fragment.app.N g10 = g();
        FragmentManager fragmentManager = this.f41624b;
        if (fragmentManager == null) {
            throw new IllegalArgumentException("fragment manager is null when performing update in ScreenContainer");
        }
        HashSet hashSet = new HashSet(fragmentManager.C0());
        Iterator it = this.f41623a.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            H h10 = (H) next;
            if (k(h10) == C3834z.a.f42104a && h10.o().isAdded()) {
                i(g10, h10.o());
            }
            hashSet.remove(h10.o());
        }
        boolean z10 = false;
        if (!hashSet.isEmpty()) {
            for (Fragment fragment : (Fragment[]) hashSet.toArray(new Fragment[0])) {
                if ((fragment instanceof G) && ((G) fragment).b().getContainer() == null) {
                    i(g10, fragment);
                }
            }
        }
        boolean z11 = getTopScreen() == null;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = this.f41623a.iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next2 = it2.next();
            Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
            H h11 = (H) next2;
            h11.b().setTransitioning(z11);
            if (k(h11) != C3834z.a.f42104a) {
                if (h11.o().isAdded()) {
                    if (z10) {
                        i(g10, h11.o());
                        arrayList.add(h11);
                    }
                } else if (z10) {
                    arrayList.add(h11);
                } else {
                    f(g10, h11.o());
                    z10 = true;
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it3, "iterator(...)");
        while (it3.hasNext()) {
            Object next3 = it3.next();
            Intrinsics.checkNotNullExpressionValue(next3, "next(...)");
            f(g10, ((H) next3).o());
        }
        g10.k();
    }

    public final void v() {
        FragmentManager fragmentManager;
        if (this.f41626d && this.f41625c && (fragmentManager = this.f41624b) != null) {
            if (fragmentManager == null || !fragmentManager.P0()) {
                this.f41626d = false;
                u();
                o();
            }
        }
    }

    public final void w() {
        this.f41626d = true;
        v();
    }

    public void x() {
        Iterator it = this.f41623a.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            ((H) next).b().setContainer(null);
        }
        this.f41623a.clear();
        s();
    }

    public final void y(FragmentManager fragmentManager) {
        androidx.fragment.app.N s10 = fragmentManager.s();
        Intrinsics.checkNotNullExpressionValue(s10, "beginTransaction(...)");
        boolean z10 = false;
        for (Fragment fragment : fragmentManager.C0()) {
            if ((fragment instanceof G) && ((G) fragment).b().getContainer() == this) {
                s10.n(fragment);
                z10 = true;
            }
        }
        if (z10) {
            s10.k();
        }
    }

    public void z(int i10) {
        ((H) this.f41623a.get(i10)).b().setContainer(null);
        this.f41623a.remove(i10);
        s();
    }
}
