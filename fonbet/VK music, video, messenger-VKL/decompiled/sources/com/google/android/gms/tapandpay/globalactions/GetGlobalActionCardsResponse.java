package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dq70;
import xsna.ozg0;
import xsna.x601;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class GetGlobalActionCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetGlobalActionCardsResponse> CREATOR = new x601();
    public GlobalActionCard[] b;
    public int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetGlobalActionCardsResponse) {
            GetGlobalActionCardsResponse getGlobalActionCardsResponse = (GetGlobalActionCardsResponse) obj;
            if (Arrays.equals(this.b, getGlobalActionCardsResponse.b) && dq70.b(Integer.valueOf(this.c), Integer.valueOf(getGlobalActionCardsResponse.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.t(parcel, 1, this.b, i);
        int i2 = this.c;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(i2);
        ozg0.x(w, parcel);
    }
}
