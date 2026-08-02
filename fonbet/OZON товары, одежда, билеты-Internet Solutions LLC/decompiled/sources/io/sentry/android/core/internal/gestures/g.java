package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.W2;
import io.sentry.n3;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Window.Callback f67134b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final e f67135c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final GestureDetectorCompat f67136d;

    /* renamed from: e, reason: collision with root package name */
    private final W2 f67137e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final f f67138f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull Window.Callback callback, @NotNull Activity activity, @NotNull e eVar, W2 w22) {
        super(callback);
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(activity, eVar, new Handler(Looper.getMainLooper()));
        f fVar = new f();
        this.f67134b = callback;
        this.f67135c = eVar;
        this.f67137e = w22;
        this.f67136d = gestureDetectorCompat;
        this.f67138f = fVar;
    }

    @NotNull
    public final Window.Callback a() {
        return this.f67134b;
    }

    public final void b() {
        this.f67135c.g(n3.CANCELLED);
    }

    @Override // io.sentry.android.core.internal.gestures.i, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.f67138f.getClass();
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            try {
                this.f67136d.a(obtain);
                if (obtain.getActionMasked() == 1) {
                    this.f67135c.e(obtain);
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
