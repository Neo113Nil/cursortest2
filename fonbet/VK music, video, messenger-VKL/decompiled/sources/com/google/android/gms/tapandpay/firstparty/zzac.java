package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dq70;
import xsna.ozg0;
import xsna.suz0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new suz0();
    public boolean b;
    public int c;
    public int d;
    public int e;

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzac) {
            zzac zzacVar = (zzac) obj;
            if (this.b == zzacVar.b && this.c == zzacVar.c && this.e == zzacVar.e && this.d == zzacVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.e), Integer.valueOf(this.d)});
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(Boolean.valueOf(this.b), "requireCdcvmPassing");
        aVar.a(Integer.valueOf(this.c), "cdcvmExpirtaionInSecs");
        aVar.a(Integer.valueOf(this.d), "unlockedTapLimit");
        aVar.a(Integer.valueOf(this.e), "cdcvmTapLimit");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        boolean z = this.b;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        int i2 = this.c;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(i2);
        int i3 = this.d;
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(i3);
        int i4 = this.e;
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(i4);
        ozg0.x(w, parcel);
    }
}
