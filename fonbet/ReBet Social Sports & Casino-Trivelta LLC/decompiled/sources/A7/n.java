package A7;

/* loaded from: classes2.dex */
public interface n extends x, G6.c {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f238a;

        /* renamed from: b, reason: collision with root package name */
        public final H6.a f239b;

        /* renamed from: e, reason: collision with root package name */
        public final b f242e;

        /* renamed from: g, reason: collision with root package name */
        public int f244g;

        /* renamed from: c, reason: collision with root package name */
        public int f240c = 0;

        /* renamed from: d, reason: collision with root package name */
        public boolean f241d = false;

        /* renamed from: f, reason: collision with root package name */
        public int f243f = 0;

        public a(Object obj, H6.a aVar, b bVar, int i10) {
            this.f238a = D6.k.g(obj);
            this.f239b = (H6.a) D6.k.g(H6.a.B(aVar));
            this.f242e = bVar;
            this.f244g = i10;
        }

        public static a a(Object obj, H6.a aVar, int i10, b bVar) {
            return new a(obj, aVar, bVar, i10);
        }

        public static a b(Object obj, H6.a aVar, b bVar) {
            return a(obj, aVar, -1, bVar);
        }
    }

    public interface b {
        void a(Object obj, boolean z10);
    }

    H6.a c(Object obj, H6.a aVar, b bVar);

    H6.a d(Object obj);
}
