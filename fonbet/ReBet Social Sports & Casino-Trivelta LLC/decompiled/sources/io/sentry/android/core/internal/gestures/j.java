package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.Window;
import io.sentry.F3;
import io.sentry.f4;

/* loaded from: classes3.dex */
public final class j extends l {

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f51035b;

    /* renamed from: c, reason: collision with root package name */
    public final i f51036c;

    /* renamed from: d, reason: collision with root package name */
    public final c f51037d;

    /* renamed from: e, reason: collision with root package name */
    public final F3 f51038e;

    /* renamed from: f, reason: collision with root package name */
    public final b f51039f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f51040g;

    public class a implements b {
    }

    public interface b {
        default MotionEvent a(MotionEvent motionEvent) {
            return MotionEvent.obtain(motionEvent);
        }
    }

    public j(Window.Callback callback, Context context, i iVar, F3 f32) {
        this(callback, new c(context, iVar), iVar, f32, new a());
    }

    public Window.Callback a() {
        return this.f51035b;
    }

    public final void b(MotionEvent motionEvent) {
        if (this.f51040g) {
            return;
        }
        this.f51037d.a(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            this.f51036c.l(motionEvent);
        }
    }

    public void c() {
        this.f51040g = true;
        this.f51036c.n(f4.CANCELLED);
        this.f51037d.b();
    }

    @Override // io.sentry.android.core.internal.gestures.l, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            try {
                b(this.f51039f.a(motionEvent));
            } finally {
                try {
                } finally {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public j(Window.Callback callback, c cVar, i iVar, F3 f32, b bVar) {
        super(callback);
        this.f51035b = callback;
        this.f51036c = iVar;
        this.f51038e = f32;
        this.f51037d = cVar;
        this.f51039f = bVar;
    }
}
