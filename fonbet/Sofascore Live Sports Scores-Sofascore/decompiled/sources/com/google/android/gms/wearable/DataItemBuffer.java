package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.EntityBuffer;
import com.google.android.gms.wearable.internal.zzec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class DataItemBuffer extends EntityBuffer<DataItem> implements Result {
    public final Status d;

    public DataItemBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.d = new Status(dataHolder.e, null, null, null);
    }

    @Override // com.google.android.gms.common.data.EntityBuffer
    public final /* bridge */ /* synthetic */ Object e(int i, int i2) {
        return new zzec(this.a, i, i2);
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.d;
    }
}
