package l1;

import android.graphics.PathMeasure;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.F, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7788F implements u0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final PathMeasure f72220a;

    public C7788F(@NotNull PathMeasure pathMeasure) {
        this.f72220a = pathMeasure;
    }

    @Override // l1.u0
    public final boolean a(float f7, float f11, @NotNull C7786D c7786d) {
        if (c7786d == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.f72220a.getSegment(f7, f11, c7786d.x(), true);
    }

    @Override // l1.u0
    public final void b(C7786D c7786d) {
        this.f72220a.setPath(c7786d != null ? c7786d.x() : null, false);
    }

    @Override // l1.u0
    public final float getLength() {
        return this.f72220a.getLength();
    }
}
