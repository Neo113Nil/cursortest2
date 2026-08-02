package com.google.crypto.tink.aead;

import com.google.crypto.tink.aead.C3454i;
import db.C4049a;
import db.C4050b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.aead.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3452g extends AbstractC3447b {

    /* renamed from: a, reason: collision with root package name */
    public final C3454i f36928a;

    /* renamed from: b, reason: collision with root package name */
    public final C4050b f36929b;

    /* renamed from: c, reason: collision with root package name */
    public final C4049a f36930c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f36931d;

    /* renamed from: com.google.crypto.tink.aead.g$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public C3454i f36932a;

        /* renamed from: b, reason: collision with root package name */
        public C4050b f36933b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f36934c;

        public C3452g a() {
            C3454i c3454i = this.f36932a;
            if (c3454i == null || this.f36933b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c3454i.c() != this.f36933b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f36932a.f() && this.f36934c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f36932a.f() && this.f36934c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C3452g(this.f36932a, this.f36933b, b(), this.f36934c);
        }

        public final C4049a b() {
            if (this.f36932a.e() == C3454i.c.f36946d) {
                return C4049a.a(new byte[0]);
            }
            if (this.f36932a.e() == C3454i.c.f36945c) {
                return C4049a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f36934c.intValue()).array());
            }
            if (this.f36932a.e() == C3454i.c.f36944b) {
                return C4049a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f36934c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f36932a.e());
        }

        public b c(Integer num) {
            this.f36934c = num;
            return this;
        }

        public b d(C4050b c4050b) {
            this.f36933b = c4050b;
            return this;
        }

        public b e(C3454i c3454i) {
            this.f36932a = c3454i;
            return this;
        }

        public b() {
            this.f36932a = null;
            this.f36933b = null;
            this.f36934c = null;
        }
    }

    public static b a() {
        return new b();
    }

    public C3452g(C3454i c3454i, C4050b c4050b, C4049a c4049a, Integer num) {
        this.f36928a = c3454i;
        this.f36929b = c4050b;
        this.f36930c = c4049a;
        this.f36931d = num;
    }
}
