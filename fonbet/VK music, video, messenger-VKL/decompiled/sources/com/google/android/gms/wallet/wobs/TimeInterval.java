package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.pi01;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TimeInterval> CREATOR = new pi01();
    public final long b;
    public final long c;

    public TimeInterval(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 2, 8);
        parcel.writeLong(this.b);
        ozg0.v(parcel, 3, 8);
        parcel.writeLong(this.c);
        ozg0.x(w, parcel);
    }

    public TimeInterval() {
    }
}
