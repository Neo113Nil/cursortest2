package com.google.android.gms.common.data;

import com.google.android.gms.common.api.Releasable;
import java.io.Closeable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface DataBuffer<T> extends Iterable<T>, Releasable, Closeable {
    void close();

    Object get(int i);

    int getCount();

    default void release() {
        close();
    }
}
