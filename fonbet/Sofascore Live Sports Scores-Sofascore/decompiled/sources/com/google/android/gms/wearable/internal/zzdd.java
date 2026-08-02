package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataItem;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdd implements DataApi.DataItemResult {
    public final Status a;
    public final DataItem b;

    public zzdd(Status status, DataItem dataItem) {
        this.a = status;
        this.b = dataItem;
    }

    @Override // com.google.android.gms.wearable.DataApi.DataItemResult
    public final DataItem M() {
        return this.b;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.a;
    }
}
