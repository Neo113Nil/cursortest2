package c6;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f56561a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final n f56562b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final n f56563c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final n f56564d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final n f56565e;

    /* renamed from: f, reason: collision with root package name */
    public static final n f56566f;

    /* renamed from: g, reason: collision with root package name */
    public static final n f56567g;

    /* renamed from: h, reason: collision with root package name */
    public static final T5.h<n> f56568h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f56569i;

    private static class a extends n {
        @Override // c6.n
        public final g a(int i11, int i12, int i13, int i14) {
            return g.QUALITY;
        }

        @Override // c6.n
        public final float b(int i11, int i12, int i13, int i14) {
            if (Math.min(i12 / i14, i11 / i13) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    private static class b extends n {
        @Override // c6.n
        public final g a(int i11, int i12, int i13, int i14) {
            return g.MEMORY;
        }

        @Override // c6.n
        public final float b(int i11, int i12, int i13, int i14) {
            int ceil = (int) Math.ceil(Math.max(i12 / i14, i11 / i13));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
        }
    }

    private static class c extends n {
        @Override // c6.n
        public final g a(int i11, int i12, int i13, int i14) {
            return b(i11, i12, i13, i14) == 1.0f ? g.QUALITY : n.f56563c.a(i11, i12, i13, i14);
        }

        @Override // c6.n
        public final float b(int i11, int i12, int i13, int i14) {
            return Math.min(1.0f, n.f56563c.b(i11, i12, i13, i14));
        }
    }

    private static class d extends n {
        @Override // c6.n
        public final g a(int i11, int i12, int i13, int i14) {
            return g.QUALITY;
        }

        @Override // c6.n
        public final float b(int i11, int i12, int i13, int i14) {
            return Math.max(i13 / i11, i14 / i12);
        }
    }

    private static class e extends n {
        @Override // c6.n
        public final g a(int i11, int i12, int i13, int i14) {
            return n.f56569i ? g.QUALITY : g.MEMORY;
        }

        @Override // c6.n
        public final float b(int i11, int i12, int i13, int i14) {
            if (n.f56569i) {
                return Math.min(i13 / i11, i14 / i12);
            }
            if (Math.max(i12 / i14, i11 / i13) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    private static class f extends n {
        @Override // c6.n
        public final g a(int i11, int i12, int i13, int i14) {
            return g.QUALITY;
        }

        @Override // c6.n
        public final float b(int i11, int i12, int i13, int i14) {
            return 1.0f;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class g {
        private static final /* synthetic */ g[] $VALUES;
        public static final g MEMORY;
        public static final g QUALITY;

        static {
            g gVar = new g("MEMORY", 0);
            MEMORY = gVar;
            g gVar2 = new g("QUALITY", 1);
            QUALITY = gVar2;
            $VALUES = new g[]{gVar, gVar2};
        }

        private g() {
            throw null;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) $VALUES.clone();
        }
    }

    static {
        d dVar = new d();
        f56565e = dVar;
        f56566f = new f();
        f56567g = dVar;
        f56568h = T5.h.c(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f56569i = true;
    }

    public abstract g a(int i11, int i12, int i13, int i14);

    public abstract float b(int i11, int i12, int i13, int i14);
}
