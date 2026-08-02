package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: androidx.core.view.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2110s {

    /* renamed from: a, reason: collision with root package name */
    public final GestureDetector f19260a;

    public C2110s(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f19260a.onTouchEvent(motionEvent);
    }

    public C2110s(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f19260a = new GestureDetector(context, onGestureListener, handler);
    }
}
