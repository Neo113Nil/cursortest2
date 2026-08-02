package com.google.common.collect;

import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.B;
import com.google.common.collect.D;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public class A extends D implements K {
    private static final long serialVersionUID = 0;

    public static final class a extends D.c {
        public A e() {
            return (A) super.a();
        }

        public a f(Object obj, Object obj2) {
            super.d(obj, obj2);
            return this;
        }
    }

    public A(B b10, int i10) {
        super(b10, i10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid key count " + readInt);
        }
        B.a a10 = B.a();
        int i10 = 0;
        for (int i11 = 0; i11 < readInt; i11++) {
            Object readObject = objectInputStream.readObject();
            Objects.requireNonNull(readObject);
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException("Invalid value count " + readInt2);
            }
            AbstractC3445z.a k10 = AbstractC3445z.k();
            for (int i12 = 0; i12 < readInt2; i12++) {
                Object readObject2 = objectInputStream.readObject();
                Objects.requireNonNull(readObject2);
                k10.a(readObject2);
            }
            a10.f(readObject, k10.m());
            i10 += readInt2;
        }
        try {
            D.e.f36691a.b(this, a10.c());
            D.e.f36692b.a(this, i10);
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    public static a v() {
        return new a();
    }

    public static A w(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return y();
        }
        B.a aVar = new B.a(collection.size());
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            AbstractC3445z.a aVar2 = (AbstractC3445z.a) entry.getValue();
            AbstractC3445z m10 = comparator == null ? aVar2.m() : aVar2.n(comparator);
            aVar.f(key, m10);
            i10 += m10.size();
        }
        return new A(aVar.c(), i10);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        f0.d(this, objectOutputStream);
    }

    public static A y() {
        return r.f36858g;
    }

    @Override // com.google.common.collect.O
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public AbstractC3445z get(Object obj) {
        AbstractC3445z abstractC3445z = (AbstractC3445z) this.f36677e.get(obj);
        return abstractC3445z == null ? AbstractC3445z.t() : abstractC3445z;
    }
}
