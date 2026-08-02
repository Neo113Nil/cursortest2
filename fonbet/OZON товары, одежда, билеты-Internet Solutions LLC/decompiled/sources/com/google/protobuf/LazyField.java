package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public class LazyField extends r {
    private final MessageLite defaultInstance;

    static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: a, reason: collision with root package name */
        private Map.Entry<K, LazyField> f60135a;

        private a() {
            throw null;
        }

        a(Map.Entry entry) {
            this.f60135a = entry;
        }

        public final LazyField a() {
            return this.f60135a.getValue();
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f60135a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            LazyField value = this.f60135a.getValue();
            if (value == null) {
                return null;
            }
            return value.getValue();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return this.f60135a.getValue().setValue((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f60136a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f60136a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f60136a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f60136a.next();
            return next.getValue() instanceof LazyField ? new a(next) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f60136a.remove();
        }
    }

    public LazyField(MessageLite messageLite, C5957h c5957h, ByteString byteString) {
        super(c5957h, byteString);
        this.defaultInstance = messageLite;
    }

    @Override // com.google.protobuf.r
    public boolean containsDefaultInstance() {
        return super.containsDefaultInstance() || this.value == this.defaultInstance;
    }

    @Override // com.google.protobuf.r
    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public MessageLite getValue() {
        return getValue(this.defaultInstance);
    }

    @Override // com.google.protobuf.r
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
