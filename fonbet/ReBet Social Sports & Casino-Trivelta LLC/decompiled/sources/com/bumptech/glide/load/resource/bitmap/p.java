package com.bumptech.glide.load.resource.bitmap;

/* loaded from: classes2.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f30041a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final p f30042b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final p f30043c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final p f30044d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final p f30045e;

    /* renamed from: f, reason: collision with root package name */
    public static final p f30046f;

    /* renamed from: g, reason: collision with root package name */
    public static final p f30047g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.i f30048h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f30049i;

    public static class a extends p {
        @Override // com.bumptech.glide.load.resource.bitmap.p
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public float b(int i10, int i11, int i12, int i13) {
            if (Math.min(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    public static class b extends p {
        @Override // com.bumptech.glide.load.resource.bitmap.p
        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public float b(int i10, int i11, int i12, int i13) {
            int ceil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
        }
    }

    public static class c extends p {
        @Override // com.bumptech.glide.load.resource.bitmap.p
        public g a(int i10, int i11, int i12, int i13) {
            return b(i10, i11, i12, i13) == 1.0f ? g.QUALITY : p.f30043c.a(i10, i11, i12, i13);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, p.f30043c.b(i10, i11, i12, i13));
        }
    }

    public static class d extends p {
        @Override // com.bumptech.glide.load.resource.bitmap.p
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    public static class e extends p {
        @Override // com.bumptech.glide.load.resource.bitmap.p
        public g a(int i10, int i11, int i12, int i13) {
            return p.f30049i ? g.QUALITY : g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public float b(int i10, int i11, int i12, int i13) {
            if (p.f30049i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            if (Math.max(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    public static class f extends p {
        @Override // com.bumptech.glide.load.resource.bitmap.p
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f30045e = dVar;
        f30046f = new f();
        f30047g = dVar;
        f30048h = com.bumptech.glide.load.i.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f30049i = true;
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
