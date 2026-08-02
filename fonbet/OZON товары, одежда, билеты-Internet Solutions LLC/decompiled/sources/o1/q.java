package o1;

import android.graphics.Outline;
import l1.C7786D;
import l1.s0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q f77591a = new q();

    public final void a(@NotNull Outline outline, @NotNull s0 s0Var) {
        if (!(s0Var instanceof C7786D)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C7786D) s0Var).x());
    }
}
