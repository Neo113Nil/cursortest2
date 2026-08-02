package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    private static final s f59290b = new s();

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f59291a = new HashMap();

    s() {
    }

    public static s b() {
        return f59290b;
    }

    public final synchronized S7.q a(String str) throws GeneralSecurityException {
        if (!this.f59291a.containsKey(str)) {
            throw new GeneralSecurityException("Name " + str + " does not exist");
        }
        return (S7.q) this.f59291a.get(str);
    }

    public final synchronized void c(String str, S7.q qVar) throws GeneralSecurityException {
        try {
            if (!this.f59291a.containsKey(str)) {
                this.f59291a.put(str, qVar);
                return;
            }
            if (((S7.q) this.f59291a.get(str)).equals(qVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + this.f59291a.get(str) + "), cannot insert " + qVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d(Map<String, S7.q> map) throws GeneralSecurityException {
        for (Map.Entry<String, S7.q> entry : map.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }
}
