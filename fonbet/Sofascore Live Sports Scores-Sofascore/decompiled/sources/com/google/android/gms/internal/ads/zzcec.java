package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzcec extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcec> CREATOR = new zzced();
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final List h;

    public zzcec(String str, String str2, boolean z, boolean z2, List list, boolean z3, boolean z4, List list2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = list;
        this.f = z3;
        this.g = z4;
        this.h = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.a, false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        SafeParcelWriter.o(parcel, 6, this.e);
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        SafeParcelWriter.r(parcel, 8, 4);
        parcel.writeInt(this.g ? 1 : 0);
        SafeParcelWriter.o(parcel, 9, this.h);
        SafeParcelWriter.t(parcel, s);
    }
}
