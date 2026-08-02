package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class Q {

    public static class a extends AbstractC3423c {
        private static final long serialVersionUID = 0;

        /* renamed from: g, reason: collision with root package name */
        public transient Ra.t f36739g;

        public a(Map map, Ra.t tVar) {
            super(map);
            this.f36739g = (Ra.t) Ra.n.k(tVar);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            Object readObject = objectInputStream.readObject();
            Objects.requireNonNull(readObject);
            this.f36739g = (Ra.t) readObject;
            Object readObject2 = objectInputStream.readObject();
            Objects.requireNonNull(readObject2);
            A((Map) readObject2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f36739g);
            objectOutputStream.writeObject(t());
        }

        @Override // com.google.common.collect.AbstractC3424d
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public List u() {
            return (List) this.f36739g.get();
        }

        @Override // com.google.common.collect.AbstractC3424d, com.google.common.collect.AbstractC3426f
        public Map d() {
            return w();
        }

        @Override // com.google.common.collect.AbstractC3424d, com.google.common.collect.AbstractC3426f
        public Set f() {
            return x();
        }
    }

    public static abstract class b extends AbstractCollection {
        public abstract O a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().b(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    public static boolean a(O o10, Object obj) {
        if (obj == o10) {
            return true;
        }
        if (obj instanceof O) {
            return o10.asMap().equals(((O) obj).asMap());
        }
        return false;
    }

    public static K b(Map map, Ra.t tVar) {
        return new a(map, tVar);
    }
}
