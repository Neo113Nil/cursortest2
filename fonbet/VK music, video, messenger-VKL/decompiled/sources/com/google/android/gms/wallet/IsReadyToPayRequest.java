package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import xsna.ozg0;
import xsna.pl01;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new pl01();
    public ArrayList<Integer> b;
    public String c;
    public String d;
    public ArrayList<Integer> e;
    public boolean f;
    public String g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.j(parcel, this.b, 2);
        ozg0.q(parcel, 4, this.c, false);
        ozg0.q(parcel, 5, this.d, false);
        ozg0.j(parcel, this.e, 6);
        boolean z = this.f;
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(z ? 1 : 0);
        ozg0.q(parcel, 8, this.g, false);
        ozg0.x(w, parcel);
    }
}
