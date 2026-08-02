package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzgc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgc> CREATOR = new zzgd();
    public final int a;
    public final boolean b;
    public final ArrayList c;
    public final int d;
    public final String e;
    public final boolean f;

    public zzgc(int i, boolean z, ArrayList arrayList, int i2, String str, boolean z2) {
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        this.a = i;
        this.b = z;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        SafeParcelWriter.o(parcel, 4, this.c);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.d);
        SafeParcelWriter.m(parcel, 6, this.e, false);
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
