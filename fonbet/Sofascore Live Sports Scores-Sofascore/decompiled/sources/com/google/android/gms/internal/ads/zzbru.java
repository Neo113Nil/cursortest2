package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzbru extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbru> CREATOR = new zzbrv();
    public final String a;
    public final String[] b;
    public final String[] c;

    public zzbru(String str, String[] strArr, String[] strArr2) {
        this.a = str;
        this.b = strArr;
        this.c = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 1, this.a, false);
        SafeParcelWriter.n(parcel, 2, this.b);
        SafeParcelWriter.n(parcel, 3, this.c);
        SafeParcelWriter.t(parcel, s);
    }
}
