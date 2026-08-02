package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dq70;
import xsna.ozg0;
import xsna.q001;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new q001();
    public int b;
    public int c;
    public int d;
    public int e;

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzaz) {
            zzaz zzazVar = (zzaz) obj;
            if (this.b == zzazVar.b && this.c == zzazVar.c && this.d == zzazVar.d && this.e == zzazVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(Integer.valueOf(this.b), "transactionDelivery");
        aVar.a(Integer.valueOf(this.c), "transactionLimit");
        aVar.a(Integer.valueOf(this.d), "supportedTransactions");
        aVar.a(Integer.valueOf(this.e), "deliveryPreference");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.b;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.c;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.d;
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(i4);
        int i5 = this.e;
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(i5);
        ozg0.x(w, parcel);
    }
}
