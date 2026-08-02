package com.google.crypto.tink.internal;

import He.g;
import com.google.crypto.tink.internal.J;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5889h<KeyT extends He.g, SerializationT extends J> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<KeyT> f59266a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f59267b;

    /* renamed from: com.google.crypto.tink.internal.h$a */
    public interface a<KeyT extends He.g, SerializationT extends J> {
        F b(He.g gVar, S7.r rVar) throws GeneralSecurityException;
    }

    private AbstractC5889h() {
        throw null;
    }

    AbstractC5889h(Class cls) {
        this.f59266a = cls;
        this.f59267b = F.class;
    }

    public static AbstractC5889h a(a aVar, Class cls) {
        return new C5888g(aVar, cls);
    }

    public final Class<KeyT> b() {
        return this.f59266a;
    }

    public final Class<SerializationT> c() {
        return this.f59267b;
    }

    public abstract SerializationT d(KeyT keyt, S7.r rVar) throws GeneralSecurityException;
}
