package com.google.crypto.tink.mac;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class l extends q {

    /* renamed from: a, reason: collision with root package name */
    public final int f37145a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37146b;

    /* renamed from: c, reason: collision with root package name */
    public final d f37147c;

    /* renamed from: d, reason: collision with root package name */
    public final c f37148d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f37149a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f37150b;

        /* renamed from: c, reason: collision with root package name */
        public c f37151c;

        /* renamed from: d, reason: collision with root package name */
        public d f37152d;

        public static void f(int i10, c cVar) {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            if (cVar == c.f37153b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f37154c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f37155d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f37156e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f37157f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        public l a() {
            Integer num = this.f37149a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f37150b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f37151c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f37152d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f37149a));
            }
            f(this.f37150b.intValue(), this.f37151c);
            return new l(this.f37149a.intValue(), this.f37150b.intValue(), this.f37152d, this.f37151c);
        }

        public b b(c cVar) {
            this.f37151c = cVar;
            return this;
        }

        public b c(int i10) {
            this.f37149a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) {
            this.f37150b = Integer.valueOf(i10);
            return this;
        }

        public b e(d dVar) {
            this.f37152d = dVar;
            return this;
        }

        public b() {
            this.f37149a = null;
            this.f37150b = null;
            this.f37151c = null;
            this.f37152d = d.f37162e;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f37153b = new c("SHA1");

        /* renamed from: c, reason: collision with root package name */
        public static final c f37154c = new c("SHA224");

        /* renamed from: d, reason: collision with root package name */
        public static final c f37155d = new c("SHA256");

        /* renamed from: e, reason: collision with root package name */
        public static final c f37156e = new c("SHA384");

        /* renamed from: f, reason: collision with root package name */
        public static final c f37157f = new c("SHA512");

        /* renamed from: a, reason: collision with root package name */
        public final String f37158a;

        public c(String str) {
            this.f37158a = str;
        }

        public String toString() {
            return this.f37158a;
        }
    }

    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f37159b = new d("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final d f37160c = new d("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final d f37161d = new d("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final d f37162e = new d("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f37163a;

        public d(String str) {
            this.f37163a = str;
        }

        public String toString() {
            return this.f37163a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f37146b;
    }

    public c c() {
        return this.f37148d;
    }

    public int d() {
        return this.f37145a;
    }

    public int e() {
        int b10;
        d dVar = this.f37147c;
        if (dVar == d.f37162e) {
            return b();
        }
        if (dVar == d.f37159b) {
            b10 = b();
        } else if (dVar == d.f37160c) {
            b10 = b();
        } else {
            if (dVar != d.f37161d) {
                throw new IllegalStateException("Unknown variant");
            }
            b10 = b();
        }
        return b10 + 5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.d() == d() && lVar.e() == e() && lVar.f() == f() && lVar.c() == c();
    }

    public d f() {
        return this.f37147c;
    }

    public boolean g() {
        return this.f37147c != d.f37162e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f37145a), Integer.valueOf(this.f37146b), this.f37147c, this.f37148d);
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f37147c + ", hashType: " + this.f37148d + ", " + this.f37146b + "-byte tags, and " + this.f37145a + "-byte key)";
    }

    public l(int i10, int i11, d dVar, c cVar) {
        this.f37145a = i10;
        this.f37146b = i11;
        this.f37147c = dVar;
        this.f37148d = cVar;
    }
}
