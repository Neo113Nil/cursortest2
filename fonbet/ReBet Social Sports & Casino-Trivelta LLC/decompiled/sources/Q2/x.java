package Q2;

/* loaded from: classes.dex */
public interface x {

    /* renamed from: a, reason: collision with root package name */
    public static final b.c f9317a;

    /* renamed from: b, reason: collision with root package name */
    public static final b.C0180b f9318b;

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f9319a;

            public a(Throwable th2) {
                this.f9319a = th2;
            }

            public String toString() {
                return "FAILURE (" + this.f9319a.getMessage() + ")";
            }
        }

        /* renamed from: Q2.x$b$b, reason: collision with other inner class name */
        public static final class C0180b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            public C0180b() {
            }
        }

        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            public c() {
            }
        }
    }

    static {
        f9317a = new b.c();
        f9318b = new b.C0180b();
    }
}
