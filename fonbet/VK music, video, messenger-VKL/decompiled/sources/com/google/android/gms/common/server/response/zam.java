package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new b();
    public final int b;
    public final String c;
    public final FastJsonResponse.Field d;

    public zam(FastJsonResponse.Field field, String str, int i) {
        this.b = i;
        this.c = str;
        this.d = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.p(parcel, 3, this.d, i, false);
        ozg0.x(w, parcel);
    }

    public zam(FastJsonResponse.Field field, String str) {
        this.b = 1;
        this.c = str;
        this.d = field;
    }
}
