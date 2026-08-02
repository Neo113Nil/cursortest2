package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;
import xsna.ka20;
import xsna.oqy;

/* compiled from: LazyField.java */
/* loaded from: classes13.dex */
public final class r extends oqy {

    /* compiled from: LazyField.java */
    public static class a<K> implements Map.Entry<K, Object> {
        public Map.Entry<K, r> b;

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.b.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            r value = this.b.getValue();
            if (value == null) {
                return null;
            }
            return value.b(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof ka20)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            r value = this.b.getValue();
            ka20 ka20Var = value.a;
            value.b = null;
            value.a = (ka20) obj;
            return ka20Var;
        }
    }

    /* compiled from: LazyField.java */
    public static class b<K> implements Iterator<Map.Entry<K, Object>> {
        public final Iterator<Map.Entry<K, Object>> b;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.b = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.b.next();
            if (!(next.getValue() instanceof r)) {
                return next;
            }
            a aVar = new a();
            aVar.b = next;
            return aVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.b.remove();
        }
    }

    @Override // xsna.oqy
    public final boolean equals(Object obj) {
        return b(null).equals(obj);
    }

    @Override // xsna.oqy
    public final int hashCode() {
        return b(null).hashCode();
    }

    public final String toString() {
        return b(null).toString();
    }
}
