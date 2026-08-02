package n9;

import java.util.Set;
import n9.AbstractC5681f;

/* renamed from: n9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5678c extends AbstractC5681f.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f57084a;

    /* renamed from: b, reason: collision with root package name */
    public final long f57085b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f57086c;

    /* renamed from: n9.c$b */
    public static final class b extends AbstractC5681f.b.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f57087a;

        /* renamed from: b, reason: collision with root package name */
        public Long f57088b;

        /* renamed from: c, reason: collision with root package name */
        public Set f57089c;

        @Override // n9.AbstractC5681f.b.a
        public AbstractC5681f.b a() {
            String str = "";
            if (this.f57087a == null) {
                str = " delta";
            }
            if (this.f57088b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f57089c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C5678c(this.f57087a.longValue(), this.f57088b.longValue(), this.f57089c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n9.AbstractC5681f.b.a
        public AbstractC5681f.b.a b(long j10) {
            this.f57087a = Long.valueOf(j10);
            return this;
        }

        @Override // n9.AbstractC5681f.b.a
        public AbstractC5681f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f57089c = set;
            return this;
        }

        @Override // n9.AbstractC5681f.b.a
        public AbstractC5681f.b.a d(long j10) {
            this.f57088b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // n9.AbstractC5681f.b
    public long b() {
        return this.f57084a;
    }

    @Override // n9.AbstractC5681f.b
    public Set c() {
        return this.f57086c;
    }

    @Override // n9.AbstractC5681f.b
    public long d() {
        return this.f57085b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5681f.b) {
            AbstractC5681f.b bVar = (AbstractC5681f.b) obj;
            if (this.f57084a == bVar.b() && this.f57085b == bVar.d() && this.f57086c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f57084a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f57085b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f57086c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f57084a + ", maxAllowedDelay=" + this.f57085b + ", flags=" + this.f57086c + "}";
    }

    public C5678c(long j10, long j11, Set set) {
        this.f57084a = j10;
        this.f57085b = j11;
        this.f57086c = set;
    }
}
