package com.squareup.wire.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import xsna.yf;

/* compiled from: MutableOnWriteList.kt */
/* loaded from: classes14.dex */
public final class MutableOnWriteList<T> extends yf<T> implements RandomAccess, Serializable {
    private final List<T> immutableList;
    private List<? extends T> mutableList;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableOnWriteList(List<? extends T> list) {
        this.immutableList = list;
        this.mutableList = list;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new ArrayList(this.mutableList);
    }

    @Override // xsna.yf, java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        ((ArrayList) this.mutableList).add(i, t);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        return this.mutableList.get(i);
    }

    public final List<T> getMutableList$wire_runtime() {
        return this.mutableList;
    }

    @Override // xsna.yf
    public int getSize() {
        return this.mutableList.size();
    }

    @Override // xsna.yf
    public T removeAt(int i) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        return (T) ((ArrayList) this.mutableList).remove(i);
    }

    @Override // xsna.yf, java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        return (T) ((ArrayList) this.mutableList).set(i, t);
    }

    public final void setMutableList$wire_runtime(List<? extends T> list) {
        this.mutableList = list;
    }
}
