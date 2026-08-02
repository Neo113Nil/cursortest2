package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zak();
    public final int a;
    public final String b;
    public final FastJsonResponse.Field c;

    public zam(String str, FastJsonResponse.Field field) {
        this.a = 1;
        this.b = str;
        this.c = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.m(parcel, 2, this.b, false);
        SafeParcelWriter.l(parcel, 3, this.c, i, false);
        SafeParcelWriter.t(parcel, s);
    }

    public zam(int i, String str, FastJsonResponse.Field field) {
        this.a = i;
        this.b = str;
        this.c = field;
    }
}
