package com.google.crypto.tink.aead;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: com.google.crypto.tink.aead.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3454i extends AbstractC3448c {

    /* renamed from: a, reason: collision with root package name */
    public final int f36936a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36937b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36938c;

    /* renamed from: d, reason: collision with root package name */
    public final c f36939d;

    /* renamed from: com.google.crypto.tink.aead.i$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f36940a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f36941b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f36942c;

        /* renamed from: d, reason: collision with root package name */
        public c f36943d;

        public C3454i a() {
            Integer num = this.f36940a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f36941b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f36943d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f36942c != null) {
                return new C3454i(num.intValue(), this.f36941b.intValue(), this.f36942c.intValue(), this.f36943d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) {
            if (i10 != 12 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
            }
            this.f36941b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f36940a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) {
            if (i10 < 0 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i10)));
            }
            this.f36942c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f36943d = cVar;
            return this;
        }

        public b() {
            this.f36940a = null;
            this.f36941b = null;
            this.f36942c = null;
            this.f36943d = c.f36946d;
        }
    }

    /* renamed from: com.google.crypto.tink.aead.i$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f36944b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f36945c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f36946d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f36947a;

        public c(String str) {
            this.f36947a = str;
        }

        public String toString() {
            return this.f36947a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f36937b;
    }

    public int c() {
        return this.f36936a;
    }

    public int d() {
        return this.f36938c;
    }

    public c e() {
        return this.f36939d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3454i)) {
            return false;
        }
        C3454i c3454i = (C3454i) obj;
        return c3454i.c() == c() && c3454i.b() == b() && c3454i.d() == d() && c3454i.e() == e();
    }

    public boolean f() {
        return this.f36939d != c.f36946d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f36936a), Integer.valueOf(this.f36937b), Integer.valueOf(this.f36938c), this.f36939d);
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f36939d + ", " + this.f36937b + "-byte IV, " + this.f36938c + "-byte tag, and " + this.f36936a + "-byte key)";
    }

    public C3454i(int i10, int i11, int i12, c cVar) {
        this.f36936a = i10;
        this.f36937b = i11;
        this.f36938c = i12;
        this.f36939d = cVar;
    }
}
