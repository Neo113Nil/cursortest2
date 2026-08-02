package com.google.crypto.tink.mac;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class d extends q {

    /* renamed from: a, reason: collision with root package name */
    public final int f37118a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37119b;

    /* renamed from: c, reason: collision with root package name */
    public final c f37120c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f37121a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f37122b;

        /* renamed from: c, reason: collision with root package name */
        public c f37123c;

        public d a() {
            Integer num = this.f37121a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f37122b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f37123c != null) {
                return new d(num.intValue(), this.f37122b.intValue(), this.f37123c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public b b(int i10) {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
            }
            this.f37121a = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) {
            if (i10 >= 10 && 16 >= i10) {
                this.f37122b = Integer.valueOf(i10);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
        }

        public b d(c cVar) {
            this.f37123c = cVar;
            return this;
        }

        public b() {
            this.f37121a = null;
            this.f37122b = null;
            this.f37123c = c.f37127e;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f37124b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f37125c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f37126d = new c("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final c f37127e = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f37128a;

        public c(String str) {
            this.f37128a = str;
        }

        public String toString() {
            return this.f37128a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f37119b;
    }

    public int c() {
        return this.f37118a;
    }

    public int d() {
        int b10;
        c cVar = this.f37120c;
        if (cVar == c.f37127e) {
            return b();
        }
        if (cVar == c.f37124b) {
            b10 = b();
        } else if (cVar == c.f37125c) {
            b10 = b();
        } else {
            if (cVar != c.f37126d) {
                throw new IllegalStateException("Unknown variant");
            }
            b10 = b();
        }
        return b10 + 5;
    }

    public c e() {
        return this.f37120c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.c() == c() && dVar.d() == d() && dVar.e() == e();
    }

    public boolean f() {
        return this.f37120c != c.f37127e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f37118a), Integer.valueOf(this.f37119b), this.f37120c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f37120c + ", " + this.f37119b + "-byte tags, and " + this.f37118a + "-byte key)";
    }

    public d(int i10, int i11, c cVar) {
        this.f37118a = i10;
        this.f37119b = i11;
        this.f37120c = cVar;
    }
}
