package com.google.crypto.tink.aead;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class I extends AbstractC3448c {

    /* renamed from: a, reason: collision with root package name */
    public final a f36900a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f36901b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f36902c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f36903d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f36904a;

        public a(String str) {
            this.f36904a = str;
        }

        public String toString() {
            return this.f36904a;
        }
    }

    public I(a aVar) {
        this.f36900a = aVar;
    }

    public static I a(a aVar) {
        return new I(aVar);
    }

    public a b() {
        return this.f36900a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof I) && ((I) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f36900a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f36900a + ")";
    }
}
