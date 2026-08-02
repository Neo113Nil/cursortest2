package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dq70;
import xsna.m501;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new m501();
    public String b;
    public byte[] c;
    public int d;
    public TokenStatus e;
    public String f;
    public zzaz g;

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zza) {
            zza zzaVar = (zza) obj;
            if (this.d == zzaVar.d && dq70.b(this.b, zzaVar.b) && Arrays.equals(this.c, zzaVar.c) && dq70.b(this.e, zzaVar.e) && dq70.b(this.f, zzaVar.f) && dq70.b(this.g, zzaVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Integer.valueOf(this.d), this.e, this.f, this.g});
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "clientTokenId");
        byte[] bArr = this.c;
        aVar.a(bArr == null ? null : Arrays.toString(bArr), "serverToken");
        aVar.a(Integer.valueOf(this.d), "cardNetwork");
        aVar.a(this.e, "tokenStatus");
        aVar.a(this.f, "tokenLastDigits");
        aVar.a(this.g, "transactionInfo");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.e(parcel, 2, this.c, false);
        int i2 = this.d;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(i2);
        ozg0.p(parcel, 4, this.e, i, false);
        ozg0.q(parcel, 5, this.f, false);
        ozg0.p(parcel, 6, this.g, i, false);
        ozg0.x(w, parcel);
    }
}
