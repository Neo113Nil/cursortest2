package com.google.crypto.tink.aead;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class v extends AbstractC3448c {

    /* renamed from: a, reason: collision with root package name */
    public final int f36994a;

    /* renamed from: b, reason: collision with root package name */
    public final c f36995b;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f36996a;

        /* renamed from: b, reason: collision with root package name */
        public c f36997b;

        public v a() {
            Integer num = this.f36996a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f36997b != null) {
                return new v(num.intValue(), this.f36997b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public b b(int i10) {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f36996a = Integer.valueOf(i10);
            return this;
        }

        public b c(c cVar) {
            this.f36997b = cVar;
            return this;
        }

        public b() {
            this.f36996a = null;
            this.f36997b = c.f37000d;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f36998b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f36999c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f37000d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f37001a;

        public c(String str) {
            this.f37001a = str;
        }

        public String toString() {
            return this.f37001a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f36994a;
    }

    public c c() {
        return this.f36995b;
    }

    public boolean d() {
        return this.f36995b != c.f37000d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return vVar.b() == b() && vVar.c() == c();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f36994a), this.f36995b);
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f36995b + ", " + this.f36994a + "-byte key)";
    }

    public v(int i10, c cVar) {
        this.f36994a = i10;
        this.f36995b = cVar;
    }
}
