package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ironsource.Y3;
import java.util.Arrays;
import xsna.dq70;
import xsna.ozg0;
import xsna.pyz0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new pyz0();
    public final long b;
    public final long c;
    public final int d;
    public final float e;
    public final float f;
    public final int g;

    public zzaq(long j, long j2, int i, float f, float f2, int i2) {
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = f;
        this.f = f2;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaq) {
            zzaq zzaqVar = (zzaq) obj;
            if (dq70.b(Long.valueOf(this.b), Long.valueOf(zzaqVar.b)) && dq70.b(Long.valueOf(this.c), Long.valueOf(zzaqVar.c)) && dq70.b(Integer.valueOf(this.d), Integer.valueOf(zzaqVar.d)) && dq70.b(Float.valueOf(this.e), Float.valueOf(zzaqVar.e)) && dq70.b(Float.valueOf(this.f), Float.valueOf(zzaqVar.f)) && dq70.b(Integer.valueOf(this.g), Integer.valueOf(zzaqVar.g))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Integer.valueOf(this.g)});
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(Long.valueOf(this.b), "downTime");
        aVar.a(Long.valueOf(this.c), "eventTime");
        aVar.a(Integer.valueOf(this.d), "action");
        aVar.a(Float.valueOf(this.e), "positionX");
        aVar.a(Float.valueOf(this.f), "positionY");
        aVar.a(Integer.valueOf(this.g), Y3.j);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 8);
        parcel.writeLong(this.b);
        ozg0.v(parcel, 2, 8);
        parcel.writeLong(this.c);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d);
        ozg0.v(parcel, 4, 4);
        parcel.writeFloat(this.e);
        ozg0.v(parcel, 5, 4);
        parcel.writeFloat(this.f);
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(this.g);
        ozg0.x(w, parcel);
    }
}
