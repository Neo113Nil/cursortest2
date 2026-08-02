package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.cwz0;
import xsna.dq70;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new cwz0();
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public zzag(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzag) {
            zzag zzagVar = (zzag) obj;
            if (this.b == zzagVar.b && this.c == zzagVar.c && this.d == zzagVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(Boolean.valueOf(this.b), "receivesTransactionNotifications");
        aVar.a(Boolean.valueOf(this.c), "receivesPlasticTransactionNotifications");
        aVar.a(Boolean.valueOf(this.d), "receivesPromotionNotifications");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
