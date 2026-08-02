package l1;

import Sc.InterfaceC3999a;
import android.graphics.Rect;
import android.graphics.RectF;
import k1.C7460f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class x0 {
    @NotNull
    public static final Rect a(@NotNull Z1.o oVar) {
        return new Rect(oVar.e(), oVar.g(), oVar.f(), oVar.c());
    }

    @InterfaceC3999a
    @NotNull
    public static final Rect b(@NotNull C7460f c7460f) {
        return new Rect((int) c7460f.n(), (int) c7460f.q(), (int) c7460f.o(), (int) c7460f.h());
    }

    @NotNull
    public static final RectF c(@NotNull C7460f c7460f) {
        return new RectF(c7460f.n(), c7460f.q(), c7460f.o(), c7460f.h());
    }

    @NotNull
    public static final C7460f d(@NotNull Rect rect) {
        return new C7460f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NotNull
    public static final C7460f e(@NotNull RectF rectF) {
        return new C7460f(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
