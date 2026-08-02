package ej;

import org.jetbrains.annotations.NotNull;

/* renamed from: ej.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6375d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f62362a;

    /* renamed from: ej.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f62363a;

        @NotNull
        public final C6375d a() {
            return new C6375d(this.f62363a);
        }

        @NotNull
        public final void b(boolean z11) {
            this.f62363a = z11;
        }
    }

    public C6375d(boolean z11) {
        this.f62362a = z11;
    }

    public final boolean a() {
        return this.f62362a;
    }
}
