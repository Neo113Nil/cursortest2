package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
abstract class zbjz implements Iterator {
    private Object zba;
    private int zbb = 2;

    protected zbjz() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11 = this.zbb;
        if (i11 == 4) {
            throw new IllegalStateException();
        }
        int i12 = i11 - 1;
        if (i11 == 0) {
            throw null;
        }
        if (i12 == 0) {
            return true;
        }
        if (i12 != 2) {
            this.zbb = 4;
            this.zba = zba();
            if (this.zbb != 3) {
                this.zbb = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.zbb = 2;
        Object obj = this.zba;
        this.zba = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected abstract Object zba();

    protected final Object zbb() {
        this.zbb = 3;
        return null;
    }
}
