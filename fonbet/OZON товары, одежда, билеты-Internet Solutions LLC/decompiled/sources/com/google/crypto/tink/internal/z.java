package com.google.crypto.tink.internal;

import S7.q;
import com.google.crypto.tink.internal.J;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class z<ParametersT extends S7.q, SerializationT extends J> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<ParametersT> f59301a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f59302b;

    public interface a<ParametersT extends S7.q, SerializationT extends J> {
        G b(S7.q qVar) throws GeneralSecurityException;
    }

    private z() {
        throw null;
    }

    z(Class cls) {
        this.f59301a = cls;
        this.f59302b = G.class;
    }

    public static z a(a aVar, Class cls) {
        return new y(aVar, cls);
    }

    public final Class<ParametersT> b() {
        return this.f59301a;
    }

    public final Class<SerializationT> c() {
        return this.f59302b;
    }

    public abstract SerializationT d(ParametersT parameterst) throws GeneralSecurityException;
}
