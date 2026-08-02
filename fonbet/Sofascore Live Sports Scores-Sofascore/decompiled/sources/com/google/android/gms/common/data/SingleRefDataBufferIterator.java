package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.a70;
import defpackage.me4;
import defpackage.ogj;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    public Object c;

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final Object next() {
        boolean hasNext = hasNext();
        int i = this.b;
        if (!hasNext) {
            ogj.m(me4.g(i, "Cannot advance the iterator beyond ", new StringBuilder(String.valueOf(i).length() + 35)));
            return null;
        }
        int i2 = i + 1;
        this.b = i2;
        if (i2 == 0) {
            Object obj = this.a.get(0);
            Preconditions.i(obj);
            this.c = obj;
            if (!(obj instanceof DataBufferRef)) {
                String valueOf = String.valueOf(obj.getClass());
                a70.r(wt3.m("DataBuffer reference of type ", valueOf, new StringBuilder(valueOf.length() + 44), " is not movable"));
                return null;
            }
        } else {
            DataBufferRef dataBufferRef = (DataBufferRef) this.c;
            DataHolder dataHolder = dataBufferRef.a;
            Preconditions.l(i2 >= 0 && i2 < dataHolder.h);
            dataBufferRef.b = i2;
            dataBufferRef.c = dataHolder.Y0(i2);
        }
        return this.c;
    }
}
