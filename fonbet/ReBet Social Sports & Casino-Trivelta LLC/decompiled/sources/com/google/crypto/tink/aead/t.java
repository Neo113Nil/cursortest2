package com.google.crypto.tink.aead;

import com.google.crypto.tink.aead.v;
import db.C4049a;
import db.C4050b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class t extends AbstractC3447b {

    /* renamed from: a, reason: collision with root package name */
    public final v f36986a;

    /* renamed from: b, reason: collision with root package name */
    public final C4050b f36987b;

    /* renamed from: c, reason: collision with root package name */
    public final C4049a f36988c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f36989d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public v f36990a;

        /* renamed from: b, reason: collision with root package name */
        public C4050b f36991b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f36992c;

        public t a() {
            v vVar = this.f36990a;
            if (vVar == null || this.f36991b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (vVar.b() != this.f36991b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f36990a.d() && this.f36992c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f36990a.d() && this.f36992c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new t(this.f36990a, this.f36991b, b(), this.f36992c);
        }

        public final C4049a b() {
            if (this.f36990a.c() == v.c.f37000d) {
                return C4049a.a(new byte[0]);
            }
            if (this.f36990a.c() == v.c.f36999c) {
                return C4049a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f36992c.intValue()).array());
            }
            if (this.f36990a.c() == v.c.f36998b) {
                return C4049a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f36992c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f36990a.c());
        }

        public b c(Integer num) {
            this.f36992c = num;
            return this;
        }

        public b d(C4050b c4050b) {
            this.f36991b = c4050b;
            return this;
        }

        public b e(v vVar) {
            this.f36990a = vVar;
            return this;
        }

        public b() {
            this.f36990a = null;
            this.f36991b = null;
            this.f36992c = null;
        }
    }

    public static b a() {
        return new b();
    }

    public t(v vVar, C4050b c4050b, C4049a c4049a, Integer num) {
        this.f36986a = vVar;
        this.f36987b = c4050b;
        this.f36988c = c4049a;
        this.f36989d = num;
    }
}
