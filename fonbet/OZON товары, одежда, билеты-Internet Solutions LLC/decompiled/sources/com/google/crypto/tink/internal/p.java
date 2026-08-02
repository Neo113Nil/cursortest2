package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    private static final p f59283b;

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f59284a = new HashMap();

    static {
        o oVar = new o();
        p pVar = new p();
        try {
            pVar.a(oVar, C5892k.class);
            f59283b = pVar;
        } catch (GeneralSecurityException e11) {
            throw new IllegalStateException("unexpected error.", e11);
        }
    }

    public static p c() {
        return f59283b;
    }

    public final synchronized <ParametersT extends S7.q> void a(InterfaceC5884c<ParametersT> interfaceC5884c, Class<ParametersT> cls) throws GeneralSecurityException {
        try {
            InterfaceC5884c interfaceC5884c2 = (InterfaceC5884c) this.f59284a.get(cls);
            if (interfaceC5884c2 != null && !interfaceC5884c2.equals(interfaceC5884c)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls + " already inserted");
            }
            this.f59284a.put(cls, interfaceC5884c);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final He.g b(S7.q qVar, Integer num) throws GeneralSecurityException {
        He.g a11;
        synchronized (this) {
            InterfaceC5884c interfaceC5884c = (InterfaceC5884c) this.f59284a.get(qVar.getClass());
            if (interfaceC5884c == null) {
                throw new GeneralSecurityException("Cannot create a new key for parameters " + qVar + ": no key creator for this class was registered.");
            }
            a11 = interfaceC5884c.a(qVar, num);
        }
        return a11;
    }
}
