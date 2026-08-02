package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    private static final q f59285b = new q();

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f59286a = new HashMap();

    public interface a<ParametersT extends S7.q> {
    }

    public static q b() {
        return f59285b;
    }

    public final synchronized <ParametersT extends S7.q> void a(a<ParametersT> aVar, Class<ParametersT> cls) throws GeneralSecurityException {
        try {
            a aVar2 = (a) this.f59286a.get(cls);
            if (aVar2 != null && !aVar2.equals(aVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f59286a.put(cls, aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
