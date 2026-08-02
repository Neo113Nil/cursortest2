package com.yandex.runtime.bindings.internal;

import com.yandex.runtime.NativeObject;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
class Vector<E> extends AbstractList<E> implements RandomAccess {
    private ArrayList<E> list;
    private int listSize = sizeNative();
    private NativeObject nativeObject;

    public Vector(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // java.util.AbstractList, java.util.List
    public synchronized E get(int i11) {
        E e11;
        try {
            if (this.list == null) {
                this.list = new ArrayList<>(this.listSize);
                for (int i12 = 0; i12 != this.listSize; i12++) {
                    this.list.add(null);
                }
            }
            e11 = this.list.get(i11);
            if (e11 == null) {
                e11 = getNative(i11);
                this.list.set(i11, e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return e11;
    }

    public native E getNative(int i11);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.listSize;
    }

    public native int sizeNative();
}
