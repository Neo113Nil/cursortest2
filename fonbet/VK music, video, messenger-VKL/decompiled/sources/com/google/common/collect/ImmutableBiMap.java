package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes13.dex */
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements Map {
    private static final long serialVersionUID = 912559;

    public static final class a<K, V> extends ImmutableMap.a<K, V> {
        @Override // com.google.common.collect.ImmutableMap.a
        @Deprecated
        public final ImmutableMap b() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMap.a
        public final ImmutableMap.a d(Object obj, Object obj2) {
            super.d(obj, obj2);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.a
        public final ImmutableMap.a e(Iterable iterable) {
            super.e(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final f c() {
            return this.b == 0 ? f.j : new f(this.a, this.b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void g(Integer num, String str) {
            super.d(str, num);
        }
    }

    public static class b<K, V> extends ImmutableMap.b<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.ImmutableMap.b
        public final ImmutableMap.a a(int i) {
            return new a(i);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection h() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: l */
    public final ImmutableCollection values() {
        return m().keySet();
    }

    public abstract f m();

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Collection values() {
        return m().keySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new b(this);
    }
}
