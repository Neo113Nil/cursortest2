package l0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final float f72065a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Z1.d f72066b;

    /* renamed from: c, reason: collision with root package name */
    private final float f72067c;

    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final float f72068a;

        /* renamed from: b, reason: collision with root package name */
        private final float f72069b;

        /* renamed from: c, reason: collision with root package name */
        private final long f72070c;

        public a(float f7, float f11, long j11) {
            this.f72068a = f7;
            this.f72069b = f11;
            this.f72070c = j11;
        }

        public final float a(long j11) {
            long j12 = this.f72070c;
            return C7757a.b(j12 > 0 ? j11 / j12 : 1.0f).a() * Math.signum(this.f72068a) * this.f72069b;
        }

        public final float b(long j11) {
            long j12 = this.f72070c;
            return (((Math.signum(this.f72068a) * C7757a.b(j12 > 0 ? j11 / j12 : 1.0f).b()) * this.f72069b) / j12) * 1000.0f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f72068a, aVar.f72068a) == 0 && Float.compare(this.f72069b, aVar.f72069b) == 0 && this.f72070c == aVar.f72070c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f72070c) + Pk0.b.a(this.f72069b, Float.hashCode(this.f72068a) * 31, 31);
        }

        @NotNull
        public final String toString() {
            return "FlingInfo(initialVelocity=" + this.f72068a + ", distance=" + this.f72069b + ", duration=" + this.f72070c + ')';
        }
    }

    public b0(float f7, @NotNull Z1.d dVar) {
        this.f72065a = f7;
        this.f72066b = dVar;
        float g10 = dVar.g();
        int i11 = c0.f72081b;
        this.f72067c = g10 * 386.0878f * 160.0f * 0.84f;
    }

    public final float a(float f7) {
        float f11;
        float f12;
        int i11 = C7757a.f72060b;
        double a11 = C7757a.a(f7, this.f72065a * this.f72067c);
        f11 = c0.f72080a;
        double d11 = f11 - 1.0d;
        f12 = c0.f72080a;
        return (float) (Math.exp((f12 / d11) * a11) * r0 * r1);
    }

    public final long b(float f7) {
        float f11;
        int i11 = C7757a.f72060b;
        double a11 = C7757a.a(f7, this.f72065a * this.f72067c);
        f11 = c0.f72080a;
        return (long) (Math.exp(a11 / (f11 - 1.0d)) * 1000.0d);
    }

    @NotNull
    public final a c(float f7) {
        float f11;
        float f12;
        int i11 = C7757a.f72060b;
        double a11 = C7757a.a(f7, this.f72065a * this.f72067c);
        f11 = c0.f72080a;
        double d11 = f11 - 1.0d;
        f12 = c0.f72080a;
        return new a(f7, (float) (Math.exp((f12 / d11) * a11) * r0 * r1), (long) (Math.exp(a11 / d11) * 1000.0d));
    }
}
