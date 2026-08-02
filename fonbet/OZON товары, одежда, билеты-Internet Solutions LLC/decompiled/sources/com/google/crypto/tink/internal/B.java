package com.google.crypto.tink.internal;

import He.g;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class B<KeyT extends He.g, PrimitiveT> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<KeyT> f59216a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<PrimitiveT> f59217b;

    final class a extends B<KeyT, PrimitiveT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f59218c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b bVar, Class cls, Class cls2) {
            super(cls, cls2);
            this.f59218c = bVar;
        }

        @Override // com.google.crypto.tink.internal.B
        public final PrimitiveT a(KeyT keyt) throws GeneralSecurityException {
            return (PrimitiveT) this.f59218c.e(keyt);
        }
    }

    public interface b<KeyT extends He.g, PrimitiveT> {
        PrimitiveT e(KeyT keyt) throws GeneralSecurityException;
    }

    private B() {
        throw null;
    }

    B(Class cls, Class cls2) {
        this.f59216a = cls;
        this.f59217b = cls2;
    }

    public static <KeyT extends He.g, PrimitiveT> B<KeyT, PrimitiveT> b(b<KeyT, PrimitiveT> bVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new a(bVar, cls, cls2);
    }

    public abstract PrimitiveT a(KeyT keyt) throws GeneralSecurityException;

    public final Class<KeyT> c() {
        return this.f59216a;
    }

    public final Class<PrimitiveT> d() {
        return this.f59217b;
    }
}
