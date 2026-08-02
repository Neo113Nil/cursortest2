package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import com.ironsource.U3;
import defpackage.fc6;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzec extends DataBufferRef implements DataItem {
    public final int d;

    public zzec(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.d = i2;
    }

    public final String toString() {
        int i;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        int i2 = this.b;
        int i3 = this.c;
        DataHolder dataHolder = this.a;
        dataHolder.Z0(i2, "data");
        byte[] blob = dataHolder.d[i3].getBlob(i2, dataHolder.c.getInt("data"));
        int i4 = this.d;
        HashMap hashMap = new HashMap(i4);
        int i5 = 0;
        while (true) {
            i = this.b;
            if (i5 >= i4) {
                break;
            }
            zzdy zzdyVar = new zzdy(dataHolder, i + i5);
            int i6 = zzdyVar.b;
            int i7 = zzdyVar.c;
            DataHolder dataHolder2 = zzdyVar.a;
            dataHolder2.Z0(i6, "asset_key");
            if (dataHolder2.d[i7].getString(i6, dataHolder2.c.getInt("asset_key")) != null) {
                int i8 = zzdyVar.b;
                int i9 = zzdyVar.c;
                dataHolder2.Z0(i8, "asset_key");
                hashMap.put(dataHolder2.d[i9].getString(i8, dataHolder2.c.getInt("asset_key")), zzdyVar);
            }
            i5++;
        }
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        int i10 = this.c;
        dataHolder.Z0(i, "path");
        sb.append("uri=".concat(String.valueOf(Uri.parse(dataHolder.d[i10].getString(i, dataHolder.c.getInt("path"))))));
        sb.append(", dataSz=".concat((blob == null ? "null" : Integer.valueOf(blob.length)).toString()));
        int size = hashMap.size();
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 12);
        sb2.append(", numAssets=");
        sb2.append(size);
        sb.append(sb2.toString());
        if (isLoggable && !hashMap.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                String id = ((DataItemAsset) entry.getValue()).getId();
                sb.append(fc6.o(new StringBuilder(str.length() + String.valueOf(str2).length() + 2 + String.valueOf(id).length()), str, str2, ": ", id));
                str = ", ";
            }
            sb.append(U3.j.e);
        }
        sb.append(" }");
        return sb.toString();
    }
}
