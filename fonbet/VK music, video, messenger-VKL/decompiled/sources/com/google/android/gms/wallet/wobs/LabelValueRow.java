package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import xsna.ozg0;
import xsna.p801;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new p801();

    @Deprecated
    public String b;

    @Deprecated
    public String c;
    public ArrayList<LabelValue> d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.u(parcel, 4, this.d, false);
        ozg0.x(w, parcel);
    }
}
