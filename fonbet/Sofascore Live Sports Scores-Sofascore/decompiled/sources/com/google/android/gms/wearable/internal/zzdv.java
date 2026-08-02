package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataEvent;
import defpackage.bf3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdv extends DataBufferRef implements DataEvent {
    public final int d;

    public zzdv(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.d = i2;
    }

    public final String toString() {
        String str;
        int i = this.b;
        int i2 = this.c;
        DataHolder dataHolder = this.a;
        dataHolder.Z0(i, "event_type");
        if (dataHolder.d[i2].getInt(i, dataHolder.c.getInt("event_type")) == 1) {
            str = "changed";
        } else {
            int i3 = this.b;
            int i4 = this.c;
            dataHolder.Z0(i3, "event_type");
            str = dataHolder.d[i4].getInt(i3, dataHolder.c.getInt("event_type")) == 2 ? "deleted" : "unknown";
        }
        String zzecVar = new zzec(dataHolder, this.b, this.d).toString();
        StringBuilder sb = new StringBuilder(zzecVar.length() + 39);
        bf3.v(sb, "DataEventRef{ type=", str, ", dataitem=", zzecVar);
        sb.append(" }");
        return sb.toString();
    }
}
