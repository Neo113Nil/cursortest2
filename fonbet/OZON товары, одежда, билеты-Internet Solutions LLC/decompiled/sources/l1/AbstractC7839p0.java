package l1;

import k1.C7460f;
import k1.C7462h;
import k1.C7463i;
import kotlin.jvm.internal.Intrinsics;
import l1.s0;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7839p0 {

    /* renamed from: l1.p0$a */
    public static final class a extends AbstractC7839p0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final s0 f72275a;

        public a(@NotNull s0 s0Var) {
            super(0);
            this.f72275a = s0Var;
        }

        @Override // l1.AbstractC7839p0
        @NotNull
        public final C7460f a() {
            return this.f72275a.getBounds();
        }

        @NotNull
        public final s0 b() {
            return this.f72275a;
        }
    }

    /* renamed from: l1.p0$b */
    public static final class b extends AbstractC7839p0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C7460f f72276a;

        public b(@NotNull C7460f c7460f) {
            super(0);
            this.f72276a = c7460f;
        }

        @Override // l1.AbstractC7839p0
        @NotNull
        public final C7460f a() {
            return this.f72276a;
        }

        @NotNull
        public final C7460f b() {
            return this.f72276a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return Intrinsics.d(this.f72276a, ((b) obj).f72276a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f72276a.hashCode();
        }
    }

    /* renamed from: l1.p0$c */
    public static final class c extends AbstractC7839p0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C7462h f72277a;

        /* renamed from: b, reason: collision with root package name */
        private final C7786D f72278b;

        public c(@NotNull C7462h c7462h) {
            super(0);
            C7786D c7786d;
            this.f72277a = c7462h;
            if (C7463i.b(c7462h)) {
                c7786d = null;
            } else {
                c7786d = C7790H.a();
                c7786d.s(c7462h, s0.a.CounterClockwise);
            }
            this.f72278b = c7786d;
        }

        @Override // l1.AbstractC7839p0
        @NotNull
        public final C7460f a() {
            C7462h c7462h = this.f72277a;
            return new C7460f(c7462h.e(), c7462h.g(), c7462h.f(), c7462h.a());
        }

        @NotNull
        public final C7462h b() {
            return this.f72277a;
        }

        public final C7786D c() {
            return this.f72278b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return Intrinsics.d(this.f72277a, ((c) obj).f72277a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f72277a.hashCode();
        }
    }

    public /* synthetic */ AbstractC7839p0(int i11) {
        this();
    }

    @NotNull
    public abstract C7460f a();

    private AbstractC7839p0() {
    }
}
