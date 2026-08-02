package com.google.crypto.tink.aead;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class A extends AbstractC3448c {

    /* renamed from: a, reason: collision with root package name */
    public final a f36881a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f36882b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f36883c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f36884d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f36885a;

        public a(String str) {
            this.f36885a = str;
        }

        public String toString() {
            return this.f36885a;
        }
    }

    public A(a aVar) {
        this.f36881a = aVar;
    }

    public static A a(a aVar) {
        return new A(aVar);
    }

    public a b() {
        return this.f36881a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof A) && ((A) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f36881a);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f36881a + ")";
    }
}
