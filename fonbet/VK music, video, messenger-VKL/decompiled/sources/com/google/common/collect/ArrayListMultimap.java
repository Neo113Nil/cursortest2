package com.google.common.collect;

import com.google.common.collect.c;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import xsna.k15;
import xsna.w5i;

/* loaded from: classes13.dex */
public final class ArrayListMultimap<K, V> extends a<Object, Object> {
    private static final long serialVersionUID = 0;
    public transient int g;

    private ArrayListMultimap() {
        super(w5i.e(12));
        k15.h(3, "expectedValuesPerKey");
        this.g = 3;
    }

    public static <K, V> ArrayListMultimap<K, V> n() {
        return new ArrayListMultimap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.g = 3;
        int readInt = objectInputStream.readInt();
        k(w5i.d());
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            Collection<V> collection = this.e.get(readObject);
            if (collection == null) {
                collection = j();
            }
            List list = (List) collection;
            AbstractCollection fVar = list instanceof RandomAccess ? new c.f(readObject, list, null) : new c.j(readObject, list, null);
            int readInt2 = objectInputStream.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                ((c.i) fVar).add(objectInputStream.readObject());
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(i().size());
        for (Map.Entry<K, Collection<V>> entry : i().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    @Override // com.google.common.collect.c
    public final Collection j() {
        return new ArrayList(this.g);
    }
}
