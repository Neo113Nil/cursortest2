package io.sentry.android.replay.gestures;

import Jb.j;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.I2;
import io.sentry.InterfaceC7097a0;
import io.sentry.W2;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.f;
import io.sentry.android.replay.util.e;
import io.sentry.android.replay.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.C;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W2 f67564a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ReplayIntegration f67565b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList<WeakReference<View>> f67566c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67567d;

    /* renamed from: io.sentry.android.replay.gestures.a$a, reason: collision with other inner class name */
    public static final class C1107a extends e {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final W2 f67568b;

        /* renamed from: c, reason: collision with root package name */
        private final ReplayIntegration f67569c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1107a(@NotNull W2 options, ReplayIntegration replayIntegration, Window.Callback callback) {
            super(callback);
            Intrinsics.checkNotNullParameter(options, "options");
            this.f67568b = options;
            this.f67569c = replayIntegration;
        }

        @Override // io.sentry.android.replay.util.e, android.view.Window.Callback
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent != null) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                Intrinsics.checkNotNullExpressionValue(obtainNoHistory, "obtainNoHistory(...)");
                try {
                    this.f67569c.w(obtainNoHistory);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    static final class b extends AbstractC7737t implements Function1<WeakReference<View>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f67570b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(1);
            this.f67570b = view;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(WeakReference<View> weakReference) {
            WeakReference<View> it = weakReference;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.d(it.get(), this.f67570b));
        }
    }

    public a(@NotNull W2 options, @NotNull ReplayIntegration touchRecorderCallback) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(touchRecorderCallback, "touchRecorderCallback");
        this.f67564a = options;
        this.f67565b = touchRecorderCallback;
        this.f67566c = new ArrayList<>();
        this.f67567d = new io.sentry.util.a();
    }

    private final void b(View view) {
        Window a11 = z.a(view);
        if (a11 == null) {
            this.f67564a.getLogger().c(I2.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = a11.getCallback();
        if (callback instanceof C1107a) {
            a11.setCallback(((C1107a) callback).f67669a);
        }
    }

    public final void a() {
        InterfaceC7097a0 a11 = this.f67567d.a();
        ArrayList<WeakReference<View>> arrayList = this.f67566c;
        try {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    b(view);
                }
            }
            arrayList.clear();
            Unit unit = Unit.f71690a;
            a11.close();
        } finally {
        }
    }

    @Override // io.sentry.android.replay.f
    public final void c(@NotNull View root, boolean z11) {
        Intrinsics.checkNotNullParameter(root, "root");
        InterfaceC7097a0 a11 = this.f67567d.a();
        ArrayList<WeakReference<View>> arrayList = this.f67566c;
        try {
            if (z11) {
                arrayList.add(new WeakReference<>(root));
                Window a12 = z.a(root);
                W2 w22 = this.f67564a;
                if (a12 == null) {
                    w22.getLogger().c(I2.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
                } else {
                    Window.Callback callback = a12.getCallback();
                    if (!(callback instanceof C1107a)) {
                        a12.setCallback(new C1107a(w22, this.f67565b, callback));
                    }
                }
                Unit unit = Unit.f71690a;
            } else {
                b(root);
                C.h(arrayList, new b(root));
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                j.e(a11, th2);
                throw th3;
            }
        }
    }
}
