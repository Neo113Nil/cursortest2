package com.google.crypto.tink.internal;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.crypto.tink.internal.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5883b<E extends Enum<E>, O> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<E, O> f59254a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<O, E> f59255b;

    /* renamed from: com.google.crypto.tink.internal.b$a */
    public static final class a<E extends Enum<E>, O> {

        /* renamed from: a, reason: collision with root package name */
        HashMap f59256a;

        /* renamed from: b, reason: collision with root package name */
        HashMap f59257b;

        public final void a(Enum r22, Object obj) {
            this.f59256a.put(r22, obj);
            this.f59257b.put(obj, r22);
        }

        public final C5883b<E, O> b() {
            return new C5883b<>(Collections.unmodifiableMap(this.f59256a), Collections.unmodifiableMap(this.f59257b));
        }
    }

    C5883b(Map map, Map map2) {
        this.f59254a = map;
        this.f59255b = map2;
    }

    public static <E extends Enum<E>, O> a<E, O> a() {
        a<E, O> aVar = new a<>();
        aVar.f59256a = new HashMap();
        aVar.f59257b = new HashMap();
        return aVar;
    }

    public final O b(E e11) throws GeneralSecurityException {
        O o11 = this.f59254a.get(e11);
        if (o11 != null) {
            return o11;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: " + e11);
    }

    public final E c(O o11) throws GeneralSecurityException {
        E e11 = this.f59255b.get(o11);
        if (e11 != null) {
            return e11;
        }
        throw new GeneralSecurityException(U7.m.b(o11, "Unable to convert object enum: "));
    }
}
