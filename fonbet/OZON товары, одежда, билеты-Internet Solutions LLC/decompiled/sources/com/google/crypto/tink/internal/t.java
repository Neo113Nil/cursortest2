package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.D;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    private static t f59292b = new t();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<D> f59293a = new AtomicReference<>(new D(new D.a()));

    t() {
    }

    public static t b() {
        return f59292b;
    }

    public final <KeyT extends He.g, PrimitiveT> PrimitiveT a(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        return (PrimitiveT) this.f59293a.get().c(keyt, cls);
    }

    public final synchronized <KeyT extends He.g, PrimitiveT> void c(B<KeyT, PrimitiveT> b11) throws GeneralSecurityException {
        D.a aVar = new D.a(this.f59293a.get());
        aVar.c(b11);
        this.f59293a.set(new D(aVar));
    }

    public final synchronized <InputPrimitiveT, WrapperPrimitiveT> void d(E<InputPrimitiveT, WrapperPrimitiveT> e11) throws GeneralSecurityException {
        D.a aVar = new D.a(this.f59293a.get());
        aVar.d(e11);
        this.f59293a.set(new D(aVar));
    }

    public final Object e(S7.j jVar, C5893l c5893l, Class cls) throws GeneralSecurityException {
        return this.f59293a.get().e(jVar, c5893l, cls);
    }
}
