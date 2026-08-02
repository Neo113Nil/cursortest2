package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class C extends D {

    static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: a, reason: collision with root package name */
        private Map.Entry<K, C> f59305a;

        a(Map.Entry entry) {
            this.f59305a = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f59305a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            C value = this.f59305a.getValue();
            if (value == null) {
                return null;
            }
            return value.b(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj instanceof S) {
                return this.f59305a.getValue().c((S) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f59306a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f59306a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f59306a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f59306a.next();
            return next.getValue() instanceof C ? new a(next) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f59306a.remove();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public final boolean equals(Object obj) {
        return b(null).equals(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public final int hashCode() {
        return b(null).hashCode();
    }

    public final String toString() {
        return b(null).toString();
    }
}
