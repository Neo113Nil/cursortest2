package com.google.crypto.tink.internal;

import X7.a;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.internal.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5885d {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f59258c = Logger.getLogger(C5885d.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final C5885d f59259d = new C5885d();

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f59260a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap f59261b = new ConcurrentHashMap();

    private synchronized S7.f<?> b(String str) throws GeneralSecurityException {
        if (!this.f59260a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return (S7.f) this.f59260a.get(str);
    }

    public static C5885d d() {
        return f59259d;
    }

    private synchronized void e(C5890i c5890i) throws GeneralSecurityException {
        try {
            String str = c5890i.f59268a;
            if (this.f59261b.containsKey(str) && !((Boolean) this.f59261b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            S7.f fVar = (S7.f) this.f59260a.get(str);
            if (fVar != null && !fVar.getClass().equals(C5890i.class)) {
                f59258c.warning("Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + fVar.getClass().getName() + ", cannot be re-registered with " + C5890i.class.getName());
            }
            this.f59260a.putIfAbsent(str, c5890i);
            this.f59261b.put(str, Boolean.TRUE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final S7.f a(Class cls, String str) throws GeneralSecurityException {
        S7.f<?> b11 = b(str);
        if (b11.a().equals(cls)) {
            return b11;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + b11.getClass() + ", which only supports: " + b11.a());
    }

    public final S7.f<?> c(String str) throws GeneralSecurityException {
        return b(str);
    }

    public final boolean f(String str) {
        return ((Boolean) this.f59261b.get(str)).booleanValue();
    }

    public final synchronized void g(C5890i c5890i) throws GeneralSecurityException {
        h(c5890i, a.EnumC0605a.ALGORITHM_NOT_FIPS);
    }

    public final synchronized void h(C5890i c5890i, a.EnumC0605a enumC0605a) throws GeneralSecurityException {
        if (!enumC0605a.a()) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(c5890i);
    }
}
