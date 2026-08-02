package nc0;

import org.jetbrains.annotations.NotNull;

/* renamed from: nc0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8494e {

    /* renamed from: nc0.e$a */
    public static final class a extends AbstractC8494e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f76754a = new a(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1074870895;
        }

        @NotNull
        public final String toString() {
            return "ChooseAnotherAccount";
        }
    }

    /* renamed from: nc0.e$b */
    public static final class b extends AbstractC8494e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f76755a = new b(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1781655910;
        }

        @NotNull
        public final String toString() {
            return "Dismiss";
        }
    }

    /* renamed from: nc0.e$c */
    public static final class c extends AbstractC8494e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f76756a = new c(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -7901651;
        }

        @NotNull
        public final String toString() {
            return "Failed";
        }
    }

    /* renamed from: nc0.e$d */
    public static final class d extends AbstractC8494e {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f76757a;

        public d(boolean z11) {
            super(0);
            this.f76757a = z11;
        }

        public final boolean a() {
            return this.f76757a;
        }
    }

    public AbstractC8494e(int i11) {
    }
}
