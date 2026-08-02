package androidx.health.platform.client.proto;

import java.util.Iterator;
import java.util.Map;
import xsna.ja20;
import xsna.nqy;

/* compiled from: LazyField.java */
/* loaded from: classes12.dex */
public final class c0 extends nqy {

    /* compiled from: LazyField.java */
    public static class a<K> implements Map.Entry<K, Object> {
        public Map.Entry<K, c0> b;

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.b.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            c0 value = this.b.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof ja20)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            c0 value = this.b.getValue();
            ja20 ja20Var = value.a;
            value.b = null;
            value.a = (ja20) obj;
            return ja20Var;
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
            if (!(next.getValue() instanceof c0)) {
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

    @Override // xsna.nqy
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // xsna.nqy
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
