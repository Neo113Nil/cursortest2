package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.qdg0;
import xsna.vlz0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes13.dex */
public final class zaa extends AbstractSafeParcelable implements qdg0 {
    public static final Parcelable.Creator<zaa> CREATOR = new vlz0();
    public final int b;
    public final int c;

    @Nullable
    public final Intent d;

    public zaa() {
        this(2, 0, null);
    }

    @Override // xsna.qdg0
    public final Status getStatus() {
        return this.c == 0 ? Status.f : Status.j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c);
        ozg0.p(parcel, 3, this.d, i, false);
        ozg0.x(w, parcel);
    }

    public zaa(int i, int i2, @Nullable Intent intent) {
        this.b = i;
        this.c = i2;
        this.d = intent;
    }
}
