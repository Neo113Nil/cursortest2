package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, Object> f57581a;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f57582a = new HashMap();

        a() {
        }
    }

    g(a aVar) {
        this.f57581a = Collections.unmodifiableMap(new HashMap(aVar.f57582a));
    }

    public final boolean a(Class<Object> cls) {
        return this.f57581a.containsKey(cls);
    }
}
