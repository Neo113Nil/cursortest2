package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.math.BigDecimal;
import java.util.Arrays;
import xsna.dq70;
import xsna.ezz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new ezz0();
    public final long b;
    public final BigDecimal c;
    public final String d;
    public final long e;
    public final int f;

    public zzas(long j, BigDecimal bigDecimal, String str, long j2, int i) {
        this.b = j;
        this.c = bigDecimal;
        this.d = str;
        this.e = j2;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzas) {
            zzas zzasVar = (zzas) obj;
            if (this.b == zzasVar.b && dq70.b(this.c, zzasVar.c) && dq70.b(this.d, zzasVar.d) && this.e == zzasVar.e && this.f == zzasVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e), Integer.valueOf(this.f)});
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(Long.valueOf(this.b), "transactionId");
        aVar.a(this.c, "amount");
        aVar.a(this.d, InAppPurchaseMetaData.KEY_CURRENCY);
        aVar.a(Long.valueOf(this.e), "transactionTimeMillis");
        aVar.a(Integer.valueOf(this.f), "type");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 8);
        parcel.writeLong(this.b);
        ozg0.b(parcel, 2, this.c, false);
        ozg0.q(parcel, 3, this.d, false);
        ozg0.v(parcel, 4, 8);
        parcel.writeLong(this.e);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.f);
        ozg0.x(w, parcel);
    }
}
