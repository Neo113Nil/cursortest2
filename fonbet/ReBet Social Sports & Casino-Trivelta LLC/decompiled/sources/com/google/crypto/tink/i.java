package com.google.crypto.tink;

import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.O;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.crypto.tink.internal.d f37013a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f37014b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final d.a f37015a;

        public a(d.a aVar) {
            this.f37015a = aVar;
        }

        public O a(AbstractC3476h abstractC3476h) {
            return b(this.f37015a.d(abstractC3476h));
        }

        public final O b(O o10) {
            this.f37015a.e(o10);
            return this.f37015a.a(o10);
        }
    }

    public i(com.google.crypto.tink.internal.d dVar, Class cls) {
        if (!dVar.i().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", dVar.toString(), cls.getName()));
        }
        this.f37013a = dVar;
        this.f37014b = cls;
    }

    @Override // com.google.crypto.tink.h
    public final com.google.crypto.tink.proto.y a(AbstractC3476h abstractC3476h) {
        try {
            return (com.google.crypto.tink.proto.y) com.google.crypto.tink.proto.y.W().m(b()).n(e().a(abstractC3476h).toByteString()).l(this.f37013a.g()).c();
        } catch (A e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    @Override // com.google.crypto.tink.h
    public final String b() {
        return this.f37013a.d();
    }

    @Override // com.google.crypto.tink.h
    public final Object c(AbstractC3476h abstractC3476h) {
        try {
            return f(this.f37013a.h(abstractC3476h));
        } catch (A e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f37013a.c().getName(), e10);
        }
    }

    @Override // com.google.crypto.tink.h
    public final O d(AbstractC3476h abstractC3476h) {
        try {
            return e().a(abstractC3476h);
        } catch (A e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f37013a.f().b().getName(), e10);
        }
    }

    public final a e() {
        return new a(this.f37013a.f());
    }

    public final Object f(O o10) {
        if (Void.class.equals(this.f37014b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f37013a.j(o10);
        return this.f37013a.e(o10, this.f37014b);
    }
}
