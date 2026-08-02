package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzcbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbc> CREATOR = new zzcbd();
    public final boolean a;
    public final List b;

    public zzcbc(List list, boolean z) {
        this.a = z;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        SafeParcelWriter.o(parcel, 3, this.b);
        SafeParcelWriter.t(parcel, s);
    }

    public zzcbc() {
        this(Collections.EMPTY_LIST, false);
    }
}
