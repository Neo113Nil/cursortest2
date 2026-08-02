package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class C extends E {

    public static class a implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final B f36676a;

        public a(B b10) {
            this.f36676a = b10;
        }

        public Object readResolve() {
            return this.f36676a.entrySet();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // com.google.common.collect.AbstractC3443x, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = x().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC3443x
    public boolean g() {
        return x().k();
    }

    @Override // com.google.common.collect.E, java.util.Collection, java.util.Set
    public int hashCode() {
        return x().hashCode();
    }

    @Override // com.google.common.collect.E
    public boolean p() {
        return x().j();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return x().size();
    }

    @Override // com.google.common.collect.E, com.google.common.collect.AbstractC3443x
    public Object writeReplace() {
        return new a(x());
    }

    public abstract B x();
}
