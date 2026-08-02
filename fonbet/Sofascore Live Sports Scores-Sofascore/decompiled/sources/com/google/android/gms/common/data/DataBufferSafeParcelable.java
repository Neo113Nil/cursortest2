package com.google.android.gms.common.data;

import android.os.Parcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {
    @Override // com.google.android.gms.common.data.DataBuffer
    public final Object get(int i) {
        DataHolder dataHolder = this.a;
        Preconditions.i(dataHolder);
        int Y0 = dataHolder.Y0(i);
        dataHolder.Z0(i, "data");
        byte[] blob = dataHolder.d[Y0].getBlob(i, dataHolder.c.getInt("data"));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(blob, 0, blob.length);
        obtain.setDataPosition(0);
        throw null;
    }
}
