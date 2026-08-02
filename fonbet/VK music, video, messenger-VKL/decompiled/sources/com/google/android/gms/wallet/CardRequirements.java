package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import xsna.o801;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class CardRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardRequirements> CREATOR = new o801();
    public ArrayList<Integer> b;
    public boolean c = true;
    public boolean d;
    public int e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.j(parcel, this.b, 1);
        boolean z = this.c;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.d;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i2 = this.e;
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(i2);
        ozg0.x(w, parcel);
    }
}
