package com.google.crypto.tink.internal;

import Hj.C3143a;
import com.google.crypto.tink.internal.K;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    private static final u f59294b;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<K> f59295a = new AtomicReference<>(new K(new K.a()));

    static {
        try {
            u uVar = new u();
            uVar.g(new C5888g(new C3143a(), C5891j.class));
            f59294b = uVar;
        } catch (Exception e11) {
            throw new L(e11);
        }
    }

    public static u a() {
        return f59294b;
    }

    public final He.g b(F f7, S7.r rVar) throws GeneralSecurityException {
        return this.f59295a.get().g(f7, rVar);
    }

    public final He.g c(F f7, S7.r rVar) throws GeneralSecurityException {
        return !this.f59295a.get().e(f7) ? new C5891j(f7, rVar) : b(f7, rVar);
    }

    public final S7.q d(G g10) throws GeneralSecurityException {
        return this.f59295a.get().h(g10);
    }

    public final S7.q e(G g10) throws GeneralSecurityException {
        return !this.f59295a.get().f(g10) ? new C5892k(g10) : d(g10);
    }

    public final synchronized <SerializationT extends J> void f(AbstractC5887f<SerializationT> abstractC5887f) throws GeneralSecurityException {
        K.a aVar = new K.a(this.f59295a.get());
        aVar.e(abstractC5887f);
        this.f59295a.set(new K(aVar));
    }

    public final synchronized <KeyT extends He.g, SerializationT extends J> void g(AbstractC5889h<KeyT, SerializationT> abstractC5889h) throws GeneralSecurityException {
        K.a aVar = new K.a(this.f59295a.get());
        aVar.f(abstractC5889h);
        this.f59295a.set(new K(aVar));
    }

    public final synchronized <SerializationT extends J> void h(x<SerializationT> xVar) throws GeneralSecurityException {
        K.a aVar = new K.a(this.f59295a.get());
        aVar.g(xVar);
        this.f59295a.set(new K(aVar));
    }

    public final synchronized <ParametersT extends S7.q, SerializationT extends J> void i(z<ParametersT, SerializationT> zVar) throws GeneralSecurityException {
        K.a aVar = new K.a(this.f59295a.get());
        aVar.h(zVar);
        this.f59295a.set(new K(aVar));
    }

    public final J j(He.g gVar, S7.r rVar) throws GeneralSecurityException {
        return this.f59295a.get().i(gVar, rVar);
    }

    public final J k(S7.q qVar) throws GeneralSecurityException {
        return this.f59295a.get().j(qVar);
    }
}
