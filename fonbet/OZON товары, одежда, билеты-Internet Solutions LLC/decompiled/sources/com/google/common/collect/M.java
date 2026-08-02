package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class M<K0, V0> {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a<V> implements O7.p<List<V>>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final int f59026a;

        a() {
            C5866j.b(2, "expectedValuesPerKey");
            this.f59026a = 2;
        }

        @Override // O7.p
        public final Object get() {
            return new ArrayList(this.f59026a);
        }
    }

    public static abstract class b<K0, V0> extends M<K0, V0> {
        public abstract <K extends K0, V extends V0> F<K, V> c();
    }

    public static abstract class c<K0> {
        public final b<K0, Object> a() {
            C5866j.b(2, "expectedValuesPerKey");
            return new N(this);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> b();
    }

    public static c<Object> a() {
        C5866j.b(8, "expectedKeys");
        return new K();
    }

    public static c<Comparable> b() {
        Q q11 = Q.f59029a;
        q11.getClass();
        return new L(q11);
    }
}
