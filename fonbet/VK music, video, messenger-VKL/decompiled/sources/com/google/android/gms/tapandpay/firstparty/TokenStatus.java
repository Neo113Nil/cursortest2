package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dq70;
import xsna.l001;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class TokenStatus extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenStatus> CREATOR = new l001();
    public zzaw b;
    public int c;
    public boolean d;

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof TokenStatus) {
            TokenStatus tokenStatus = (TokenStatus) obj;
            if (dq70.b(this.b, tokenStatus.b) && this.c == tokenStatus.c && this.d == tokenStatus.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "tokenReference");
        aVar.a(Integer.valueOf(this.c), "tokenState");
        aVar.a(Boolean.valueOf(this.d), "isSelected");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 2, this.b, i, false);
        int i2 = this.c;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(i2);
        boolean z = this.d;
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
