package com.squareup.wire.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import xsna.ff;

/* compiled from: ImmutableList.kt */
/* loaded from: classes14.dex */
public final class ImmutableList<T> extends ff<T> implements RandomAccess, Serializable {
    private final ArrayList<T> list;

    public ImmutableList(List<? extends T> list) {
        this.list = new ArrayList<>(list);
    }

    private final Object writeReplace() throws ObjectStreamException {
        return Collections.unmodifiableList(this.list);
    }

    @Override // xsna.ff, java.util.List
    public T get(int i) {
        return this.list.get(i);
    }

    @Override // xsna.ff, xsna.qd
    public int getSize() {
        return this.list.size();
    }

    @Override // xsna.qd, java.util.Collection, java.util.List
    public Object[] toArray() {
        Object[] array = this.list.toArray(new Object[0]);
        if (array != null) {
            return array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
