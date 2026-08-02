package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzia extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzia> CREATOR = new zzhz();
    public final String a;
    public final DataHolder b;

    public zzia(String str, DataHolder dataHolder) {
        this.a = str;
        this.b = dataHolder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 1, this.a, false);
        SafeParcelWriter.l(parcel, 2, this.b, i, false);
        SafeParcelWriter.t(parcel, s);
    }
}
