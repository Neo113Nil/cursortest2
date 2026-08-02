package g8;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes9.dex */
public final class h extends n {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f63995a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f63996b;

    /* renamed from: c, reason: collision with root package name */
    private final b f63997c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f63998d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f63999a = null;

        /* renamed from: b, reason: collision with root package name */
        private Integer f64000b = null;

        /* renamed from: c, reason: collision with root package name */
        private b f64001c = null;

        /* renamed from: d, reason: collision with root package name */
        private Integer f64002d = null;

        public final h a() throws GeneralSecurityException {
            if (this.f63999a == null) {
                throw new GeneralSecurityException("keySizeBytes needs to be set");
            }
            Integer num = this.f64000b;
            if (num == null) {
                throw new GeneralSecurityException("derivedAesGcmKeySizeBytes needs to be set");
            }
            if (this.f64001c == null) {
                throw new GeneralSecurityException("hkdfHashType needs to be set");
            }
            if (this.f64002d == null) {
                throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be set");
            }
            if (num.intValue() != 16 && this.f64000b.intValue() != 32) {
                throw new GeneralSecurityException("derivedAesGcmKeySizeBytes needs to be 16 or 32, not " + this.f64000b);
            }
            if (this.f63999a.intValue() < this.f64000b.intValue()) {
                throw new GeneralSecurityException("keySizeBytes needs to be at least derivedAesGcmKeySizeBytes, i.e., " + this.f64000b);
            }
            if (this.f64002d.intValue() > this.f64000b.intValue() + 24) {
                return new h(this.f63999a, this.f64000b, this.f64001c, this.f64002d);
            }
            throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be at least derivedAesGcmKeySizeBytes + 25, i.e., " + (this.f64000b.intValue() + 25));
        }

        public final void b(int i11) {
            this.f64002d = Integer.valueOf(i11);
        }

        public final void c(int i11) {
            this.f64000b = Integer.valueOf(i11);
        }

        public final void d(b bVar) {
            this.f64001c = bVar;
        }

        public final void e(int i11) {
            this.f63999a = Integer.valueOf(i11);
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f64003b = new b("SHA1");

        /* renamed from: c, reason: collision with root package name */
        public static final b f64004c = new b("SHA256");

        /* renamed from: d, reason: collision with root package name */
        public static final b f64005d = new b("SHA512");

        /* renamed from: a, reason: collision with root package name */
        private final String f64006a;

        private b(String str) {
            this.f64006a = str;
        }

        public final String toString() {
            return this.f64006a;
        }
    }

    h(Integer num, Integer num2, b bVar, Integer num3) {
        this.f63995a = num;
        this.f63996b = num2;
        this.f63997c = bVar;
        this.f63998d = num3;
    }

    public final int b() {
        return this.f63998d.intValue();
    }

    public final int c() {
        return this.f63996b.intValue();
    }

    public final b d() {
        return this.f63997c;
    }

    public final int e() {
        return this.f63995a.intValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.f63995a.intValue() == this.f63995a.intValue() && hVar.f63996b.intValue() == this.f63996b.intValue() && hVar.f63997c == this.f63997c && hVar.f63998d.intValue() == this.f63998d.intValue();
    }

    public final int hashCode() {
        return Objects.hash(h.class, this.f63995a, this.f63996b, this.f63997c, this.f63998d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AesGcmHkdfStreaming Parameters (IKM size: ");
        sb2.append(this.f63995a);
        sb2.append(", ");
        sb2.append(this.f63996b);
        sb2.append("-byte AES GCM key, ");
        sb2.append(this.f63997c);
        sb2.append(" for HKDF ");
        return Ep.a.c(sb2, this.f63998d, "-byte ciphertexts)");
    }
}
