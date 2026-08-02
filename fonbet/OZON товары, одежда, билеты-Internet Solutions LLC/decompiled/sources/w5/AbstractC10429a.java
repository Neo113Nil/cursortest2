package w5;

import org.jetbrains.annotations.NotNull;

/* renamed from: w5.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC10429a {

    /* renamed from: w5.a$a, reason: collision with other inner class name */
    public static final class C2245a extends AbstractC10429a {

        /* renamed from: a, reason: collision with root package name */
        public final int f103575a;

        public C2245a(int i11) {
            super(0);
            this.f103575a = i11;
            if (i11 <= 0) {
                throw new IllegalArgumentException("px must be > 0.");
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2245a) {
                return this.f103575a == ((C2245a) obj).f103575a;
            }
            return false;
        }

        public final int hashCode() {
            return this.f103575a;
        }

        @NotNull
        public final String toString() {
            return String.valueOf(this.f103575a);
        }
    }

    /* renamed from: w5.a$b */
    public static final class b extends AbstractC10429a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f103576a = new b(0);

        @NotNull
        public final String toString() {
            return "Dimension.Undefined";
        }
    }

    public AbstractC10429a(int i11) {
    }
}
