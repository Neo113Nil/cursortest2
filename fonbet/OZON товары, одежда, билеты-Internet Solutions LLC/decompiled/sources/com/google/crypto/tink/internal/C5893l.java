package com.google.crypto.tink.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.crypto.tink.internal.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5893l {

    /* renamed from: b, reason: collision with root package name */
    public static final C5893l f59279b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f59280a;

    /* renamed from: com.google.crypto.tink.internal.l$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private HashMap<String, String> f59281a = new HashMap<>();

        public final C5893l a() {
            if (this.f59281a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            C5893l c5893l = new C5893l(Collections.unmodifiableMap(this.f59281a));
            this.f59281a = null;
            return c5893l;
        }
    }

    private C5893l() {
        throw null;
    }

    C5893l(Map map) {
        this.f59280a = map;
    }

    public final boolean a() {
        return this.f59280a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5893l) {
            return this.f59280a.equals(((C5893l) obj).f59280a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f59280a.hashCode();
    }

    public final String toString() {
        return this.f59280a.toString();
    }
}
