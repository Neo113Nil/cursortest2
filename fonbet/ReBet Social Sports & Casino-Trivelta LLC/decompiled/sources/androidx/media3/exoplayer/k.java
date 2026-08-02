package androidx.media3.exoplayer;

import e1.AbstractC4134a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f21352a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21353b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21354c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public long f21355a;

        /* renamed from: b, reason: collision with root package name */
        public float f21356b;

        /* renamed from: c, reason: collision with root package name */
        public long f21357c;

        public k d() {
            return new k(this);
        }

        public b e(long j10) {
            AbstractC4134a.a(j10 >= 0 || j10 == -9223372036854775807L);
            this.f21357c = j10;
            return this;
        }

        public b f(long j10) {
            this.f21355a = j10;
            return this;
        }

        public b g(float f10) {
            AbstractC4134a.a(f10 > 0.0f || f10 == -3.4028235E38f);
            this.f21356b = f10;
            return this;
        }

        public b() {
            this.f21355a = -9223372036854775807L;
            this.f21356b = -3.4028235E38f;
            this.f21357c = -9223372036854775807L;
        }

        public b(k kVar) {
            this.f21355a = kVar.f21352a;
            this.f21356b = kVar.f21353b;
            this.f21357c = kVar.f21354c;
        }
    }

    public b a() {
        return new b();
    }

    public boolean b(long j10) {
        long j11 = this.f21354c;
        return (j11 == -9223372036854775807L || j10 == -9223372036854775807L || j11 < j10) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f21352a == kVar.f21352a && this.f21353b == kVar.f21353b && this.f21354c == kVar.f21354c;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f21352a), Float.valueOf(this.f21353b), Long.valueOf(this.f21354c));
    }

    public k(b bVar) {
        this.f21352a = bVar.f21355a;
        this.f21353b = bVar.f21356b;
        this.f21354c = bVar.f21357c;
    }
}
