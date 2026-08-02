package com.google.android.gms.wearable.internal;

import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgj extends com.google.android.gms.internal.wearable.zza implements IInterface {
    public final void Z1(boolean z, byte[] bArr) {
        Parcel S1 = S1();
        int i = com.google.android.gms.internal.wearable.zzc.a;
        S1.writeInt(z ? 1 : 0);
        S1.writeByteArray(bArr);
        try {
            this.a.transact(1, S1, null, 1);
        } finally {
            S1.recycle();
        }
    }
}
