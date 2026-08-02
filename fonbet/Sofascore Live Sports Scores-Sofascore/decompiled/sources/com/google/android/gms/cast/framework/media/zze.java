package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zze extends com.google.android.gms.internal.cast.zza implements zzg {
    @Override // com.google.android.gms.cast.framework.media.zzg
    public final ArrayList zzf() {
        Parcel S1 = S1(J(), 3);
        ArrayList createTypedArrayList = S1.createTypedArrayList(NotificationAction.CREATOR);
        S1.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.cast.framework.media.zzg
    public final int[] zzg() {
        Parcel S1 = S1(J(), 4);
        int[] createIntArray = S1.createIntArray();
        S1.recycle();
        return createIntArray;
    }
}
