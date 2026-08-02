package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemAsset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdy extends DataBufferRef implements DataItemAsset {
    @Override // com.google.android.gms.wearable.DataItemAsset
    public final String C() {
        int i = this.b;
        int i2 = this.c;
        DataHolder dataHolder = this.a;
        dataHolder.Z0(i, "asset_key");
        return dataHolder.d[i2].getString(i, dataHolder.c.getInt("asset_key"));
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public final String getId() {
        int i = this.b;
        int i2 = this.c;
        DataHolder dataHolder = this.a;
        dataHolder.Z0(i, "asset_id");
        return dataHolder.d[i2].getString(i, dataHolder.c.getInt("asset_id"));
    }
}
