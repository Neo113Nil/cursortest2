package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public abstract class DataBufferRef {
    public final DataHolder a;
    public int b;
    public int c;

    public DataBufferRef(DataHolder dataHolder, int i) {
        Preconditions.i(dataHolder);
        this.a = dataHolder;
        boolean z = false;
        if (i >= 0 && i < dataHolder.h) {
            z = true;
        }
        Preconditions.l(z);
        this.b = i;
        this.c = dataHolder.Y0(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DataBufferRef) {
            DataBufferRef dataBufferRef = (DataBufferRef) obj;
            if (Objects.a(Integer.valueOf(dataBufferRef.b), Integer.valueOf(this.b)) && Objects.a(Integer.valueOf(dataBufferRef.c), Integer.valueOf(this.c)) && dataBufferRef.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }
}
