package x1;

import android.view.MotionEvent;
import org.jetbrains.annotations.NotNull;

/* renamed from: x1.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10635j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C10635j f104885a = new C10635j();

    public final long a(@NotNull MotionEvent motionEvent, int i11) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i11);
        rawY = motionEvent.getRawY(i11);
        return P9.a.a(rawX, rawY);
    }
}
