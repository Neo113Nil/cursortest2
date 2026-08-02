package q0;

import S0.C3991w0;
import S0.D1;
import S0.n1;
import k1.C7459e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: q0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8960o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3991w0 f81342a;

    /* renamed from: q0.o$a */
    public static abstract class a {

        /* renamed from: q0.o$a$a, reason: collision with other inner class name */
        public static final class C1371a extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C1371a f81343a = new C1371a(0);

            @NotNull
            public final String toString() {
                return "Closed";
            }
        }

        /* renamed from: q0.o$a$b */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final long f81344a;

            public b(long j11) {
                super(0);
                this.f81344a = j11;
                if (!P9.a.d(j11)) {
                    throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
                }
            }

            public final long a() {
                return this.f81344a;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                return C7459e.d(this.f81344a, ((b) obj).f81344a);
            }

            public final int hashCode() {
                return Long.hashCode(this.f81344a);
            }

            @NotNull
            public final String toString() {
                return "Open(offset=" + ((Object) C7459e.m(this.f81344a)) + ')';
            }
        }

        public /* synthetic */ a(int i11) {
            this();
        }

        private a() {
        }
    }

    public C8960o() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final a a() {
        return (a) this.f81342a.getValue();
    }

    public final void b(@NotNull a aVar) {
        this.f81342a.setValue(aVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8960o) {
            return Intrinsics.d(((C8960o) obj).a(), a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @NotNull
    public final String toString() {
        return "ContextMenuState(status=" + a() + ')';
    }

    public C8960o(int i11) {
        C3991w0 f7;
        f7 = n1.f(a.C1371a.f81343a, D1.f25195a);
        this.f81342a = f7;
    }
}
