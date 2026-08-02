package com.google.android.gms.common.data;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class AbstractDataBuffer<T> implements DataBuffer<T> {
    public final DataHolder a;

    public AbstractDataBuffer(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        release();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        DataHolder dataHolder = this.a;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.h;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new DataBufferIterator(this);
    }

    @Override // com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public final void release() {
        DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
