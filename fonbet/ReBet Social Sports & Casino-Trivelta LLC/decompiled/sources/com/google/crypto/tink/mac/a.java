package com.google.crypto.tink.mac;

import com.google.crypto.tink.mac.d;
import db.C4049a;
import db.C4050b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class a extends p {

    /* renamed from: a, reason: collision with root package name */
    public final d f37109a;

    /* renamed from: b, reason: collision with root package name */
    public final C4050b f37110b;

    /* renamed from: c, reason: collision with root package name */
    public final C4049a f37111c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f37112d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public d f37113a;

        /* renamed from: b, reason: collision with root package name */
        public C4050b f37114b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f37115c;

        public a a() {
            d dVar = this.f37113a;
            if (dVar == null || this.f37114b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (dVar.c() != this.f37114b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f37113a.f() && this.f37115c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f37113a.f() && this.f37115c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new a(this.f37113a, this.f37114b, b(), this.f37115c);
        }

        public final C4049a b() {
            if (this.f37113a.e() == d.c.f37127e) {
                return C4049a.a(new byte[0]);
            }
            if (this.f37113a.e() == d.c.f37126d || this.f37113a.e() == d.c.f37125c) {
                return C4049a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f37115c.intValue()).array());
            }
            if (this.f37113a.e() == d.c.f37124b) {
                return C4049a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f37115c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f37113a.e());
        }

        public b c(C4050b c4050b) {
            this.f37114b = c4050b;
            return this;
        }

        public b d(Integer num) {
            this.f37115c = num;
            return this;
        }

        public b e(d dVar) {
            this.f37113a = dVar;
            return this;
        }

        public b() {
            this.f37113a = null;
            this.f37114b = null;
            this.f37115c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // com.google.crypto.tink.mac.p
    public C4049a a() {
        return this.f37111c;
    }

    @Override // com.google.crypto.tink.mac.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public d b() {
        return this.f37109a;
    }

    public a(d dVar, C4050b c4050b, C4049a c4049a, Integer num) {
        this.f37109a = dVar;
        this.f37110b = c4050b;
        this.f37111c = c4049a;
        this.f37112d = num;
    }
}
