package o9;

import o9.AbstractC5843e;

/* renamed from: o9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5839a extends AbstractC5843e {

    /* renamed from: b, reason: collision with root package name */
    public final long f59524b;

    /* renamed from: c, reason: collision with root package name */
    public final int f59525c;

    /* renamed from: d, reason: collision with root package name */
    public final int f59526d;

    /* renamed from: e, reason: collision with root package name */
    public final long f59527e;

    /* renamed from: f, reason: collision with root package name */
    public final int f59528f;

    /* renamed from: o9.a$b */
    public static final class b extends AbstractC5843e.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f59529a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f59530b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f59531c;

        /* renamed from: d, reason: collision with root package name */
        public Long f59532d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f59533e;

        @Override // o9.AbstractC5843e.a
        public AbstractC5843e a() {
            String str = "";
            if (this.f59529a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f59530b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f59531c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f59532d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f59533e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C5839a(this.f59529a.longValue(), this.f59530b.intValue(), this.f59531c.intValue(), this.f59532d.longValue(), this.f59533e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o9.AbstractC5843e.a
        public AbstractC5843e.a b(int i10) {
            this.f59531c = Integer.valueOf(i10);
            return this;
        }

        @Override // o9.AbstractC5843e.a
        public AbstractC5843e.a c(long j10) {
            this.f59532d = Long.valueOf(j10);
            return this;
        }

        @Override // o9.AbstractC5843e.a
        public AbstractC5843e.a d(int i10) {
            this.f59530b = Integer.valueOf(i10);
            return this;
        }

        @Override // o9.AbstractC5843e.a
        public AbstractC5843e.a e(int i10) {
            this.f59533e = Integer.valueOf(i10);
            return this;
        }

        @Override // o9.AbstractC5843e.a
        public AbstractC5843e.a f(long j10) {
            this.f59529a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // o9.AbstractC5843e
    public int b() {
        return this.f59526d;
    }

    @Override // o9.AbstractC5843e
    public long c() {
        return this.f59527e;
    }

    @Override // o9.AbstractC5843e
    public int d() {
        return this.f59525c;
    }

    @Override // o9.AbstractC5843e
    public int e() {
        return this.f59528f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5843e) {
            AbstractC5843e abstractC5843e = (AbstractC5843e) obj;
            if (this.f59524b == abstractC5843e.f() && this.f59525c == abstractC5843e.d() && this.f59526d == abstractC5843e.b() && this.f59527e == abstractC5843e.c() && this.f59528f == abstractC5843e.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // o9.AbstractC5843e
    public long f() {
        return this.f59524b;
    }

    public int hashCode() {
        long j10 = this.f59524b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f59525c) * 1000003) ^ this.f59526d) * 1000003;
        long j11 = this.f59527e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f59528f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f59524b + ", loadBatchSize=" + this.f59525c + ", criticalSectionEnterTimeoutMs=" + this.f59526d + ", eventCleanUpAge=" + this.f59527e + ", maxBlobByteSizePerRow=" + this.f59528f + "}";
    }

    public C5839a(long j10, int i10, int i11, long j11, int i12) {
        this.f59524b = j10;
        this.f59525c = i10;
        this.f59526d = i11;
        this.f59527e = j11;
        this.f59528f = i12;
    }
}
