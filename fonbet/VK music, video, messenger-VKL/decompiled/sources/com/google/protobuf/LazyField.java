package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes13.dex */
public class LazyField extends LazyFieldLite {
    private final MessageLite defaultInstance;

    public static class a<K> implements Map.Entry<K, Object> {
        public Map.Entry<K, LazyField> b;

        public a() {
            throw null;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.b.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            LazyField value = this.b.getValue();
            if (value == null) {
                return null;
            }
            return value.getValue();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return this.b.getValue().setValue((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

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
            if (!(next.getValue() instanceof LazyField)) {
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

    public LazyField(MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
        super(extensionRegistryLite, byteString);
        this.defaultInstance = messageLite;
    }

    @Override // com.google.protobuf.LazyFieldLite
    public boolean containsDefaultInstance() {
        return super.containsDefaultInstance() || this.value == this.defaultInstance;
    }

    @Override // com.google.protobuf.LazyFieldLite
    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public MessageLite getValue() {
        return getValue(this.defaultInstance);
    }

    @Override // com.google.protobuf.LazyFieldLite
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
