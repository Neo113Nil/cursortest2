package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class O<K, V> extends AbstractC5859c<K, V> {

    /* renamed from: f, reason: collision with root package name */
    transient O7.p<? extends List<V>> f59028f;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        Objects.requireNonNull(readObject);
        this.f59028f = (O7.p) readObject;
        Object readObject2 = objectInputStream.readObject();
        Objects.requireNonNull(readObject2);
        s((Map) readObject2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f59028f);
        objectOutputStream.writeObject(n());
    }

    @Override // com.google.common.collect.AbstractC5861e
    protected final Collection p() {
        return this.f59028f.get();
    }
}
