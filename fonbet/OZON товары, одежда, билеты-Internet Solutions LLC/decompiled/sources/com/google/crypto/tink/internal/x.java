package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.J;
import j8.C7306a;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class x<SerializationT extends J> {

    /* renamed from: a, reason: collision with root package name */
    private final C7306a f59298a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f59299b;

    public interface a<SerializationT extends J> {
        S7.q d(G g10) throws GeneralSecurityException;
    }

    private x() {
        throw null;
    }

    x(C7306a c7306a) {
        this.f59298a = c7306a;
        this.f59299b = G.class;
    }

    public static x a(a aVar, C7306a c7306a) {
        return new w(aVar, c7306a);
    }

    public final C7306a b() {
        return this.f59298a;
    }

    public final Class<SerializationT> c() {
        return this.f59299b;
    }

    public abstract S7.q d(G g10) throws GeneralSecurityException;
}
