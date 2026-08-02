package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
abstract class zbkq extends zblh {
    private final int zba;
    private int zbb;

    protected zbkq(int i11, int i12) {
        zbkj.zbb(i12, i11, "index");
        this.zba = i11;
        this.zbb = i12;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zbb < this.zba;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zbb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i11 = this.zbb;
        this.zbb = i11 + 1;
        return zba(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zbb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i11 = this.zbb - 1;
        this.zbb = i11;
        return zba(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zbb - 1;
    }

    protected abstract Object zba(int i11);
}
