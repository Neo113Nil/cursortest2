package t2;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: l, reason: collision with root package name */
    public static final m1 f65432l = new b().a();

    /* renamed from: a, reason: collision with root package name */
    public final int f65433a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65434b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65435c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65436d;

    /* renamed from: e, reason: collision with root package name */
    public final float f65437e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65438f;

    /* renamed from: g, reason: collision with root package name */
    public final int f65439g;

    /* renamed from: h, reason: collision with root package name */
    public final long f65440h;

    /* renamed from: i, reason: collision with root package name */
    public final int f65441i;

    /* renamed from: j, reason: collision with root package name */
    public final int f65442j;

    /* renamed from: k, reason: collision with root package name */
    public final int f65443k;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f65444a;

        /* renamed from: b, reason: collision with root package name */
        public int f65445b;

        /* renamed from: c, reason: collision with root package name */
        public int f65446c;

        /* renamed from: d, reason: collision with root package name */
        public int f65447d;

        /* renamed from: e, reason: collision with root package name */
        public float f65448e;

        /* renamed from: f, reason: collision with root package name */
        public int f65449f;

        /* renamed from: g, reason: collision with root package name */
        public int f65450g;

        /* renamed from: h, reason: collision with root package name */
        public long f65451h;

        /* renamed from: i, reason: collision with root package name */
        public int f65452i;

        /* renamed from: j, reason: collision with root package name */
        public int f65453j;

        /* renamed from: k, reason: collision with root package name */
        public int f65454k;

        public m1 a() {
            return new m1(this.f65444a, this.f65445b, this.f65446c, this.f65447d, this.f65448e, this.f65449f, this.f65450g, this.f65451h, this.f65452i, this.f65453j, this.f65454k);
        }

        public b b(int i10) {
            this.f65444a = i10;
            return this;
        }

        public b c(int i10, int i11) {
            this.f65446c = i10;
            this.f65447d = i11;
            return this;
        }

        public b d(int i10) {
            this.f65452i = i10;
            return this;
        }

        public b e(int i10, int i11) {
            this.f65453j = i10;
            this.f65454k = i11;
            return this;
        }

        public b() {
            this.f65444a = -1;
            this.f65445b = 1;
            this.f65446c = -1;
            this.f65447d = -1;
            this.f65448e = 1.0f;
            this.f65449f = -1;
            this.f65450g = -1;
            this.f65451h = -1L;
            this.f65452i = -1;
            this.f65453j = -1;
            this.f65454k = -1;
        }

        public b(m1 m1Var) {
            this.f65444a = m1Var.f65433a;
            this.f65445b = m1Var.f65434b;
            this.f65446c = m1Var.f65435c;
            this.f65447d = m1Var.f65436d;
            this.f65448e = m1Var.f65437e;
            this.f65449f = m1Var.f65438f;
            this.f65450g = m1Var.f65439g;
            this.f65451h = m1Var.f65440h;
            this.f65452i = m1Var.f65441i;
            this.f65453j = m1Var.f65442j;
            this.f65454k = m1Var.f65443k;
        }
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.f65433a == m1Var.f65433a && this.f65434b == m1Var.f65434b && this.f65435c == m1Var.f65435c && this.f65436d == m1Var.f65436d && this.f65437e == m1Var.f65437e && this.f65438f == m1Var.f65438f && this.f65439g == m1Var.f65439g && this.f65440h == m1Var.f65440h && this.f65441i == m1Var.f65441i && this.f65442j == m1Var.f65442j && this.f65443k == m1Var.f65443k;
    }

    public int hashCode() {
        int floatToIntBits = (((((((((((((217 + this.f65433a) * 31) + this.f65434b) * 31) + this.f65435c) * 31) + this.f65436d) * 31) + Float.floatToIntBits(this.f65437e)) * 31) + this.f65438f) * 31) + this.f65439g) * 31;
        long j10 = this.f65440h;
        return ((((((floatToIntBits + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f65441i) * 31) + this.f65442j) * 31) + this.f65443k;
    }

    public String toString() {
        return "VideoEncoderSettings{bitrate=" + this.f65433a + ", bitrateMode=" + this.f65434b + ", profile=" + this.f65435c + ", level=" + this.f65436d + ", iFrameIntervalSeconds=" + this.f65437e + ", operatingRate=" + this.f65438f + ", priority=" + this.f65439g + ", repeatPreviousFrameIntervalUs=" + this.f65440h + ", maxBFrames=" + this.f65441i + ", numNonBidirectionalTemporalLayers=" + this.f65442j + ", numBidirectionalTemporalLayers=" + this.f65443k + '}';
    }

    public m1(int i10, int i11, int i12, int i13, float f10, int i14, int i15, long j10, int i16, int i17, int i18) {
        this.f65433a = i10;
        this.f65434b = i11;
        this.f65435c = i12;
        this.f65436d = i13;
        this.f65437e = f10;
        this.f65438f = i14;
        this.f65439g = i15;
        this.f65440h = j10;
        this.f65441i = i16;
        this.f65442j = i17;
        this.f65443k = i18;
    }
}
