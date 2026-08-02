package g8;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes9.dex */
public final class d extends n {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f63973a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f63974b;

    /* renamed from: c, reason: collision with root package name */
    private final b f63975c;

    /* renamed from: d, reason: collision with root package name */
    private final b f63976d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f63977e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f63978f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f63979a = null;

        /* renamed from: b, reason: collision with root package name */
        private Integer f63980b = null;

        /* renamed from: c, reason: collision with root package name */
        private b f63981c = null;

        /* renamed from: d, reason: collision with root package name */
        private b f63982d = null;

        /* renamed from: e, reason: collision with root package name */
        private Integer f63983e = null;

        /* renamed from: f, reason: collision with root package name */
        private Integer f63984f = null;

        public final d a() throws GeneralSecurityException {
            if (this.f63979a == null) {
                throw new GeneralSecurityException("keySizeBytes needs to be set");
            }
            Integer num = this.f63980b;
            if (num == null) {
                throw new GeneralSecurityException("derivedKeySizeBytes needs to be set");
            }
            if (this.f63981c == null) {
                throw new GeneralSecurityException("hkdfHashType needs to be set");
            }
            if (this.f63982d == null) {
                throw new GeneralSecurityException("hmacHashType needs to be set");
            }
            if (this.f63983e == null) {
                throw new GeneralSecurityException("hmacTagSizeBytes needs to be set");
            }
            if (this.f63984f == null) {
                throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be set");
            }
            if (num.intValue() != 16 && this.f63980b.intValue() != 32) {
                throw new GeneralSecurityException("derivedKeySizeBytes needs to be 16 or 32, not " + this.f63980b);
            }
            if (this.f63979a.intValue() < this.f63980b.intValue()) {
                throw new GeneralSecurityException("keySizeBytes needs to be at least derivedKeySizeBytes, i.e., " + this.f63980b);
            }
            if (this.f63984f.intValue() <= this.f63983e.intValue() + this.f63980b.intValue() + 8) {
                throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be at least derivedKeySizeBytes + hmacTagSizeBytes + 9, i.e., " + (this.f63983e.intValue() + this.f63980b.intValue() + 9));
            }
            b bVar = this.f63982d;
            int i11 = bVar != b.f63986c ? bVar == b.f63985b ? 20 : 0 : 32;
            if (bVar == b.f63987d) {
                i11 = 64;
            }
            if (this.f63983e.intValue() >= 10 && this.f63983e.intValue() <= i11) {
                return new d(this.f63979a, this.f63980b, this.f63981c, this.f63982d, this.f63983e, this.f63984f);
            }
            StringBuilder f7 = P4.f.f(i11, "hmacTagSize must be in range [10, ", "], but is ");
            f7.append(this.f63983e);
            throw new GeneralSecurityException(f7.toString());
        }

        public final void b(int i11) {
            this.f63984f = Integer.valueOf(i11);
        }

        public final void c(int i11) {
            this.f63980b = Integer.valueOf(i11);
        }

        public final void d(b bVar) {
            this.f63981c = bVar;
        }

        public final void e(b bVar) {
            this.f63982d = bVar;
        }

        public final void f(Integer num) {
            this.f63983e = num;
        }

        public final void g(int i11) {
            this.f63979a = Integer.valueOf(i11);
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f63985b = new b("SHA1");

        /* renamed from: c, reason: collision with root package name */
        public static final b f63986c = new b("SHA256");

        /* renamed from: d, reason: collision with root package name */
        public static final b f63987d = new b("SHA512");

        /* renamed from: a, reason: collision with root package name */
        private final String f63988a;

        private b(String str) {
            this.f63988a = str;
        }

        public final String toString() {
            return this.f63988a;
        }
    }

    d(Integer num, Integer num2, b bVar, b bVar2, Integer num3, Integer num4) {
        this.f63973a = num;
        this.f63974b = num2;
        this.f63975c = bVar;
        this.f63976d = bVar2;
        this.f63977e = num3;
        this.f63978f = num4;
    }

    public final int b() {
        return this.f63978f.intValue();
    }

    public final int c() {
        return this.f63974b.intValue();
    }

    public final b d() {
        return this.f63975c;
    }

    public final b e() {
        return this.f63976d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f63973a.intValue() == this.f63973a.intValue() && dVar.f63974b.intValue() == this.f63974b.intValue() && dVar.f63975c == this.f63975c && dVar.f63976d == this.f63976d && dVar.f63977e.intValue() == this.f63977e.intValue() && dVar.f63978f.intValue() == this.f63978f.intValue();
    }

    public final int f() {
        return this.f63977e.intValue();
    }

    public final int g() {
        return this.f63973a.intValue();
    }

    public final int hashCode() {
        return Objects.hash(d.class, this.f63973a, this.f63974b, this.f63975c, this.f63976d, this.f63977e, this.f63978f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AesCtrHmacStreaming Parameters (IKM size: ");
        sb2.append(this.f63973a);
        sb2.append(", ");
        sb2.append(this.f63974b);
        sb2.append("-byte AES key, ");
        b bVar = this.f63975c;
        sb2.append(bVar);
        sb2.append(" for HKDF, ");
        sb2.append(bVar);
        sb2.append(" for HMAC, ");
        sb2.append(this.f63977e);
        sb2.append("-byte tags, ");
        return Ep.a.c(sb2, this.f63978f, "-byte ciphertexts)");
    }
}
