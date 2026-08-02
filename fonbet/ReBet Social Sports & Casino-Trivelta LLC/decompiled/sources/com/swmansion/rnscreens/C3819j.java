package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.F0;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.swmansion.rnscreens.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3819j implements androidx.core.view.J, LifecycleEventListener {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f41975d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f41976e;

    /* renamed from: a, reason: collision with root package name */
    public static final C3819j f41972a = new C3819j();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f41973b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f41974c = new WeakReference(null);

    /* renamed from: f, reason: collision with root package name */
    public static boolean f41977f = true;

    public final void a(androidx.core.view.J listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f41973b.add(listener);
    }

    public final boolean b() {
        return !f41975d || f41974c.get() == null;
    }

    public final View c() {
        return (View) f41974c.get();
    }

    public final boolean d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!b()) {
            return false;
        }
        AbstractC2082d0.x0(view, this);
        f41974c = new WeakReference(view);
        f41975d = true;
        return true;
    }

    public final void e(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f41976e) {
            Log.w("[RNScreens]", "InsetObserverProxy registers on new context while it has not been invalidated on the old one. Please report this as issue at https://github.com/software-mansion/react-native-screens/issues");
        }
        f41976e = true;
        context.addLifecycleEventListener(this);
    }

    @Override // androidx.core.view.J
    public F0 f(View v10, F0 insets) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        F0 X10 = f41977f ? AbstractC2082d0.X(v10, insets) : insets;
        Intrinsics.checkNotNull(X10);
        Iterator it = f41973b.iterator();
        while (it.hasNext()) {
            X10 = ((androidx.core.view.J) it.next()).f(v10, insets);
            Intrinsics.checkNotNullExpressionValue(X10, "onApplyWindowInsets(...)");
        }
        return X10;
    }

    public final void g(androidx.core.view.J listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f41973b.remove(listener);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        View c10 = c();
        if (f41975d && c10 != null) {
            AbstractC2082d0.x0(c10, null);
            f41975d = false;
            f41974c.clear();
        }
        f41976e = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }
}
