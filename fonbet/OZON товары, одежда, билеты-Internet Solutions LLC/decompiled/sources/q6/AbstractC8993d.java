package q6;

import androidx.annotation.NonNull;

/* renamed from: q6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8993d {

    /* renamed from: q6.d$a */
    private static class a extends AbstractC8993d {

        /* renamed from: a, reason: collision with root package name */
        private volatile boolean f81728a;

        @Override // q6.AbstractC8993d
        public final void b(boolean z11) {
            this.f81728a = z11;
        }

        @Override // q6.AbstractC8993d
        public final void c() {
            if (this.f81728a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    @NonNull
    public static AbstractC8993d a() {
        return new a();
    }

    abstract void b(boolean z11);

    public abstract void c();
}
