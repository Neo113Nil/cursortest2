package w3;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final a f67326a;

    /* renamed from: b, reason: collision with root package name */
    public final b f67327b;

    /* renamed from: c, reason: collision with root package name */
    public final g f67328c;

    public enum a {
        GWP_ASAN(0),
        SCUDO(1);


        /* renamed from: a, reason: collision with root package name */
        public final int f67331a;

        a(int i10) {
            this.f67331a = i10;
        }

        public static a b(int i10) {
            for (a aVar : values()) {
                if (aVar.f67331a == i10) {
                    return aVar;
                }
            }
            return GWP_ASAN;
        }
    }

    public enum b {
        UNKNOWN(0),
        USE_AFTER_FREE(1),
        DOUBLE_FREE(2),
        INVALID_FREE(3),
        BUFFER_OVERFLOW(4),
        BUFFER_UNDERFLOW(5);


        /* renamed from: a, reason: collision with root package name */
        public final int f67338a;

        b(int i10) {
            this.f67338a = i10;
        }

        public static b b(int i10) {
            for (b bVar : values()) {
                if (bVar.f67338a == i10) {
                    return bVar;
                }
            }
            return UNKNOWN;
        }
    }

    public k(a aVar, b bVar, g gVar) {
        this.f67326a = aVar;
        this.f67327b = bVar;
        this.f67328c = gVar;
    }
}
