package n0;

import android.view.View;
import android.widget.Magnifier;
import k1.C7459e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class Z implements Y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Z f76125a = new Z();

    public static class a implements X {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Magnifier f76126a;

        public a(@NotNull Magnifier magnifier) {
            this.f76126a = magnifier;
        }

        @Override // n0.X
        public final long a() {
            return Z1.r.a(this.f76126a.getWidth(), this.f76126a.getHeight());
        }

        @Override // n0.X
        public void b(long j11, long j12, float f7) {
            this.f76126a.show(C7459e.g(j11), C7459e.h(j11));
        }

        @Override // n0.X
        public final void c() {
            this.f76126a.update();
        }

        @NotNull
        public final Magnifier d() {
            return this.f76126a;
        }

        @Override // n0.X
        public final void dismiss() {
            this.f76126a.dismiss();
        }
    }

    @Override // n0.Y
    public final boolean a() {
        return false;
    }

    @Override // n0.Y
    public final X b(View view, boolean z11, long j11, float f7, float f11, boolean z12, Z1.d dVar, float f12) {
        return new a(new Magnifier(view));
    }
}
