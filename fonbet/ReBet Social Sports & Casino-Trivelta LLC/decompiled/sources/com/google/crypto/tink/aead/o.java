package com.google.crypto.tink.aead;

import com.google.crypto.tink.aead.q;
import db.C4049a;
import db.C4050b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class o extends AbstractC3447b {

    /* renamed from: a, reason: collision with root package name */
    public final q f36961a;

    /* renamed from: b, reason: collision with root package name */
    public final C4050b f36962b;

    /* renamed from: c, reason: collision with root package name */
    public final C4049a f36963c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f36964d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public q f36965a;

        /* renamed from: b, reason: collision with root package name */
        public C4050b f36966b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f36967c;

        public o a() {
            q qVar = this.f36965a;
            if (qVar == null || this.f36966b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (qVar.c() != this.f36966b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f36965a.f() && this.f36967c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f36965a.f() && this.f36967c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new o(this.f36965a, this.f36966b, b(), this.f36967c);
        }

        public final C4049a b() {
            if (this.f36965a.e() == q.c.f36979d) {
                return C4049a.a(new byte[0]);
            }
            if (this.f36965a.e() == q.c.f36978c) {
                return C4049a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f36967c.intValue()).array());
            }
            if (this.f36965a.e() == q.c.f36977b) {
                return C4049a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f36967c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f36965a.e());
        }

        public b c(Integer num) {
            this.f36967c = num;
            return this;
        }

        public b d(C4050b c4050b) {
            this.f36966b = c4050b;
            return this;
        }

        public b e(q qVar) {
            this.f36965a = qVar;
            return this;
        }

        public b() {
            this.f36965a = null;
            this.f36966b = null;
            this.f36967c = null;
        }
    }

    public static b a() {
        return new b();
    }

    public o(q qVar, C4050b c4050b, C4049a c4049a, Integer num) {
        this.f36961a = qVar;
        this.f36962b = c4050b;
        this.f36963c = c4049a;
        this.f36964d = num;
    }
}
