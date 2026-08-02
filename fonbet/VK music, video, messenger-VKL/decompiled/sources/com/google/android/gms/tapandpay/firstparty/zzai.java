package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dq70;
import xsna.ozg0;
import xsna.uwz0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new uwz0();
    public int b;
    public int c;

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzai) {
            zzai zzaiVar = (zzai) obj;
            if (dq70.b(Integer.valueOf(this.b), Integer.valueOf(zzaiVar.b)) && dq70.b(Integer.valueOf(this.c), Integer.valueOf(zzaiVar.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(Integer.valueOf(this.b), "accountType");
        aVar.a(Integer.valueOf(this.c), "status");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.b;
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.c;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(i3);
        ozg0.x(w, parcel);
    }
}
