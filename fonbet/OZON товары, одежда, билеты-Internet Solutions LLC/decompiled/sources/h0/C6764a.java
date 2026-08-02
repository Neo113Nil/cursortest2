package h0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6764a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6765b f64582a;

    C6764a(C6765b c6765b) {
        this.f64582a = c6765b;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(@NotNull MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        e11.getX();
        C6765b c6765b = this.f64582a;
        c6765b.getClass();
        e11.getY();
        c6765b.getClass();
        return true;
    }
}
