package x1;

import android.view.MotionEvent;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class I {
    public static final void a(@NotNull C10638m c10638m, long j11, @NotNull Function1<? super MotionEvent, Unit> function1) {
        c(c10638m, j11, function1, true);
    }

    public static final void b(@NotNull C10638m c10638m, long j11, @NotNull Function1<? super MotionEvent, Unit> function1) {
        c(c10638m, j11, function1, false);
    }

    private static final void c(C10638m c10638m, long j11, Function1<? super MotionEvent, Unit> function1, boolean z11) {
        MotionEvent d11 = c10638m.d();
        if (d11 == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = d11.getAction();
        if (z11) {
            d11.setAction(3);
        }
        d11.offsetLocation(-C7459e.g(j11), -C7459e.h(j11));
        function1.invoke(d11);
        d11.offsetLocation(C7459e.g(j11), C7459e.h(j11));
        d11.setAction(action);
    }
}
