package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.wearable.zzag;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzj();
    public final List a;
    public final List b;
    public final List c;

    public zzi(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
    }

    public final String toString() {
        zzag zzagVar = new zzag(getClass().getSimpleName());
        zzagVar.a(this.a, "allowedDataItemFilters");
        zzagVar.a(this.b, "allowedCapabilities");
        zzagVar.a(this.c, "allowedPackages");
        return zzagVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.q(parcel, 1, this.a, false);
        SafeParcelWriter.o(parcel, 2, this.b);
        SafeParcelWriter.o(parcel, 3, this.c);
        SafeParcelWriter.t(parcel, s);
    }
}
