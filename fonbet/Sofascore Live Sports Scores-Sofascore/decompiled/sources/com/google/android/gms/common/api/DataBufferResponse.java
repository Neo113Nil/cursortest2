package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataBufferIterator;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class DataBufferResponse<T, R extends AbstractDataBuffer<T> & Result> extends Response<R> implements DataBuffer<T> {
    @KeepForSdk
    public DataBufferResponse() {
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((AbstractDataBuffer) this.a).release();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final Object get(int i) {
        return ((AbstractDataBuffer) this.a).get(i);
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final int getCount() {
        return ((AbstractDataBuffer) this.a).getCount();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        AbstractDataBuffer abstractDataBuffer = (AbstractDataBuffer) this.a;
        abstractDataBuffer.getClass();
        return new DataBufferIterator(abstractDataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public final void release() {
        ((AbstractDataBuffer) this.a).release();
    }
}
