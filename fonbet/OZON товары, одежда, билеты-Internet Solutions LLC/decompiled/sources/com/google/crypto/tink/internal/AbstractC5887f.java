package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.J;
import j8.C7306a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.internal.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5887f<SerializationT extends J> {

    /* renamed from: a, reason: collision with root package name */
    private final C7306a f59263a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f59264b;

    /* renamed from: com.google.crypto.tink.internal.f$a */
    public interface a<SerializationT extends J> {
        He.g d(F f7, S7.r rVar) throws GeneralSecurityException;
    }

    private AbstractC5887f() {
        throw null;
    }

    AbstractC5887f(C7306a c7306a) {
        this.f59263a = c7306a;
        this.f59264b = F.class;
    }

    public static AbstractC5887f a(a aVar, C7306a c7306a) {
        return new C5886e(aVar, c7306a);
    }

    public final C7306a b() {
        return this.f59263a;
    }

    public final Class<SerializationT> c() {
        return this.f59264b;
    }

    public abstract He.g d(F f7, S7.r rVar) throws GeneralSecurityException;
}
