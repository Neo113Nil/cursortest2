package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.b5;
import io.sentry.b6;
import java.util.Collections;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends j {

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f15654b;

    /* renamed from: c, reason: collision with root package name */
    public final g f15655c;

    /* renamed from: d, reason: collision with root package name */
    public final GestureDetectorCompat f15656d;

    /* renamed from: e, reason: collision with root package name */
    public final b6 f15657e;

    /* renamed from: f, reason: collision with root package name */
    public final y8.d f15658f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Window.Callback callback, Activity activity, g gVar, b6 b6Var) {
        super(callback);
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(activity, gVar, new Handler(Looper.getMainLooper()));
        y8.d dVar = new y8.d();
        this.f15654b = callback;
        this.f15655c = gVar;
        this.f15657e = b6Var;
        this.f15656d = gestureDetectorCompat;
        this.f15658f = dVar;
    }

    public final void a(MotionEvent motionEvent) {
        this.f15656d.f1278a.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            g gVar = this.f15655c;
            View b10 = gVar.b("onUp");
            f fVar = gVar.f15653g;
            io.sentry.internal.gestures.b bVar = fVar.f15644b;
            if (b10 == null || bVar == null) {
                return;
            }
            e eVar = fVar.f15643a;
            e eVar2 = e.Unknown;
            if (eVar == eVar2) {
                gVar.f15649c.getLogger().h(b5.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                return;
            }
            float x10 = motionEvent.getX() - fVar.f15645c;
            float y5 = motionEvent.getY() - fVar.f15646d;
            gVar.a(bVar, fVar.f15643a, Collections.singletonMap("direction", Math.abs(x10) > Math.abs(y5) ? x10 > 0.0f ? "right" : "left" : y5 > 0.0f ? "down" : "up"), motionEvent);
            gVar.c(bVar, fVar.f15643a);
            fVar.f15644b = null;
            fVar.f15643a = eVar2;
            fVar.f15645c = 0.0f;
            fVar.f15646d = 0.0f;
        }
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b6 b6Var;
        if (motionEvent != null) {
            this.f15658f.getClass();
            try {
                a(MotionEvent.obtain(motionEvent));
            } finally {
                if (b6Var != null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        return this.f15660a.dispatchTouchEvent(motionEvent);
    }
}
