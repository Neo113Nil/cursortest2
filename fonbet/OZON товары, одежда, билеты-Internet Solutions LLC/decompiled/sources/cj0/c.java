package cj0;

import cj0.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f57199a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f57200b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f57201a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private d f57202b = d.b.f57204a;

        @NotNull
        public final c a() {
            return new c(this.f57201a, this.f57202b);
        }

        @NotNull
        public final void b(@NotNull Function0 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.f57201a = ((Boolean) block.invoke()).booleanValue();
        }

        @NotNull
        public final void c(@NotNull Function0 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.f57202b = (d) block.invoke();
        }
    }

    public c(boolean z11, d dVar) {
        this.f57199a = z11;
        this.f57200b = dVar;
    }

    public final boolean a() {
        return this.f57199a;
    }

    @NotNull
    public final d b() {
        return this.f57200b;
    }
}
