package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.me4;
import defpackage.ogj;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class DataBufferIterator<T> implements Iterator<T> {
    public final DataBuffer a;
    public int b;

    public DataBufferIterator(DataBuffer dataBuffer) {
        Preconditions.i(dataBuffer);
        this.a = dataBuffer;
        this.b = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.getCount() + (-1);
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            int i = this.b + 1;
            this.b = i;
            return this.a.get(i);
        }
        int i2 = this.b;
        ogj.m(me4.g(i2, "Cannot advance the iterator beyond ", new StringBuilder(String.valueOf(i2).length() + 35)));
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
