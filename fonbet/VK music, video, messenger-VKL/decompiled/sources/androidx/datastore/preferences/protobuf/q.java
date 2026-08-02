package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;
import xsna.la20;
import xsna.pqy;

/* compiled from: LazyField.java */
/* loaded from: classes.dex */
public final class q extends pqy {

    /* compiled from: LazyField.java */
    /* loaded from: classes12.dex */
    public static class a<K> implements Map.Entry<K, Object> {
        public Map.Entry<K, q> b;

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.b.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            q value = this.b.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof la20)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            q value = this.b.getValue();
            la20 la20Var = value.a;
            value.b = null;
            value.a = (la20) obj;
            return la20Var;
        }
    }

    /* compiled from: LazyField.java */
    /* loaded from: classes12.dex */
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
            if (!(next.getValue() instanceof q)) {
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

    @Override // xsna.pqy
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // xsna.pqy
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
