package com.google.crypto.tink.aead;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class q extends AbstractC3448c {

    /* renamed from: a, reason: collision with root package name */
    public final int f36969a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36970b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36971c;

    /* renamed from: d, reason: collision with root package name */
    public final c f36972d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f36973a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f36974b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f36975c;

        /* renamed from: d, reason: collision with root package name */
        public c f36976d;

        public q a() {
            Integer num = this.f36973a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f36976d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f36974b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f36975c != null) {
                return new q(num.intValue(), this.f36974b.intValue(), this.f36975c.intValue(), this.f36976d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) {
            if (i10 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i10)));
            }
            this.f36974b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f36973a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) {
            if (i10 != 12 && i10 != 13 && i10 != 14 && i10 != 15 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", Integer.valueOf(i10)));
            }
            this.f36975c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f36976d = cVar;
            return this;
        }

        public b() {
            this.f36973a = null;
            this.f36974b = null;
            this.f36975c = null;
            this.f36976d = c.f36979d;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f36977b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f36978c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f36979d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f36980a;

        public c(String str) {
            this.f36980a = str;
        }

        public String toString() {
            return this.f36980a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f36970b;
    }

    public int c() {
        return this.f36969a;
    }

    public int d() {
        return this.f36971c;
    }

    public c e() {
        return this.f36972d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.c() == c() && qVar.b() == b() && qVar.d() == d() && qVar.e() == e();
    }

    public boolean f() {
        return this.f36972d != c.f36979d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f36969a), Integer.valueOf(this.f36970b), Integer.valueOf(this.f36971c), this.f36972d);
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f36972d + ", " + this.f36970b + "-byte IV, " + this.f36971c + "-byte tag, and " + this.f36969a + "-byte key)";
    }

    public q(int i10, int i11, int i12, c cVar) {
        this.f36969a = i10;
        this.f36970b = i11;
        this.f36971c = i12;
        this.f36972d = cVar;
    }
}
