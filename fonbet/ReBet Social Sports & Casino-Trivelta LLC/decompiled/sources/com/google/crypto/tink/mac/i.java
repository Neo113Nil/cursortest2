package com.google.crypto.tink.mac;

import com.google.crypto.tink.mac.l;
import db.C4049a;
import db.C4050b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class i extends p {

    /* renamed from: a, reason: collision with root package name */
    public final l f37136a;

    /* renamed from: b, reason: collision with root package name */
    public final C4050b f37137b;

    /* renamed from: c, reason: collision with root package name */
    public final C4049a f37138c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f37139d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public l f37140a;

        /* renamed from: b, reason: collision with root package name */
        public C4050b f37141b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f37142c;

        public i a() {
            l lVar = this.f37140a;
            if (lVar == null || this.f37141b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (lVar.d() != this.f37141b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f37140a.g() && this.f37142c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f37140a.g() && this.f37142c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new i(this.f37140a, this.f37141b, b(), this.f37142c);
        }

        public final C4049a b() {
            if (this.f37140a.f() == l.d.f37162e) {
                return C4049a.a(new byte[0]);
            }
            if (this.f37140a.f() == l.d.f37161d || this.f37140a.f() == l.d.f37160c) {
                return C4049a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f37142c.intValue()).array());
            }
            if (this.f37140a.f() == l.d.f37159b) {
                return C4049a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f37142c.intValue()).array());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f37140a.f());
        }

        public b c(Integer num) {
            this.f37142c = num;
            return this;
        }

        public b d(C4050b c4050b) {
            this.f37141b = c4050b;
            return this;
        }

        public b e(l lVar) {
            this.f37140a = lVar;
            return this;
        }

        public b() {
            this.f37140a = null;
            this.f37141b = null;
            this.f37142c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // com.google.crypto.tink.mac.p
    public C4049a a() {
        return this.f37138c;
    }

    @Override // com.google.crypto.tink.mac.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public l b() {
        return this.f37136a;
    }

    public i(l lVar, C4050b c4050b, C4049a c4049a, Integer num) {
        this.f37136a = lVar;
        this.f37137b = c4050b;
        this.f37138c = c4049a;
        this.f37139d = num;
    }
}
