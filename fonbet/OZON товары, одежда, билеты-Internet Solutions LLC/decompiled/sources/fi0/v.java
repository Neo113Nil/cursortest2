package fi0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f63521a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f63522b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f63523c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f63524d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f63525e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f63526f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f63527a = true;

        /* renamed from: b, reason: collision with root package name */
        private boolean f63528b = true;

        /* renamed from: c, reason: collision with root package name */
        private boolean f63529c = true;

        /* renamed from: d, reason: collision with root package name */
        private boolean f63530d = true;

        @NotNull
        public final v a() {
            return new v(this.f63527a, this.f63528b, this.f63529c, this.f63530d);
        }

        public final void b(@NotNull Function0<Boolean> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.f63529c = block.invoke().booleanValue();
        }

        public final void c(@NotNull Function0<Boolean> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.f63530d = block.invoke().booleanValue();
        }

        public final void d(@NotNull Function0<Boolean> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.f63527a = block.invoke().booleanValue();
        }

        public final void e(@NotNull Function0<Boolean> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.f63528b = block.invoke().booleanValue();
        }
    }

    public v(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f63521a = z11;
        this.f63522b = z12;
        this.f63523c = z13;
        this.f63524d = z14;
        boolean z15 = true;
        this.f63525e = z11 || z13;
        if (!z12 && !z14) {
            z15 = false;
        }
        this.f63526f = z15;
    }

    public final boolean a() {
        return this.f63523c;
    }

    public final boolean b() {
        return this.f63524d;
    }

    public final boolean c() {
        return this.f63521a;
    }

    public final boolean d() {
        return this.f63522b;
    }

    public final boolean e() {
        return this.f63523c || this.f63524d;
    }

    public final boolean f() {
        return this.f63525e;
    }

    public final boolean g() {
        return this.f63526f;
    }
}
