package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zaaa;
import xsna.bpz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes13.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new bpz0();
    public final int b;
    public final ConnectionResult c;

    @Nullable
    public final zaaa d;

    public zak(int i, ConnectionResult connectionResult, @Nullable zaaa zaaaVar) {
        this.b = i;
        this.c = connectionResult;
        this.d = zaaaVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.p(parcel, 2, this.c, i, false);
        ozg0.p(parcel, 3, this.d, i, false);
        ozg0.x(w, parcel);
    }
}
