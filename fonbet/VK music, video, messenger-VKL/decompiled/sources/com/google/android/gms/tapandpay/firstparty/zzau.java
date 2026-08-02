package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.Arrays;
import xsna.dq70;
import xsna.ozg0;
import xsna.rzz0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new rzz0();
    public String b;
    public String c;
    public int d;
    public TokenStatus e;
    public String f;
    public Uri g;
    public byte[] h;
    public zzai[] i;
    public int j;
    public boolean k;

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzau) {
            zzau zzauVar = (zzau) obj;
            if (dq70.b(this.b, zzauVar.b) && dq70.b(this.c, zzauVar.c) && this.d == zzauVar.d && dq70.b(this.e, zzauVar.e) && dq70.b(this.f, zzauVar.f) && dq70.b(this.g, zzauVar.g) && Arrays.equals(this.h, zzauVar.h) && Arrays.equals(this.i, zzauVar.i) && this.j == zzauVar.j && this.k == zzauVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Integer.valueOf(this.d), this.e, this.f, this.g, this.h, this.i, Integer.valueOf(this.j), Boolean.valueOf(this.k)});
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "billingCardId");
        aVar.a(this.c, CommonConstant.KEY_DISPLAY_NAME);
        aVar.a(Integer.valueOf(this.d), "cardNetwork");
        aVar.a(this.e, "tokenStatus");
        aVar.a(this.f, "panLastDigits");
        aVar.a(this.g, "cardImageUrl");
        byte[] bArr = this.h;
        aVar.a(bArr == null ? null : Arrays.toString(bArr), "inAppCardToken");
        zzai[] zzaiVarArr = this.i;
        aVar.a(zzaiVarArr != null ? Arrays.toString(zzaiVarArr) : null, "onlineAccountCardLinkInfos");
        aVar.a(Integer.valueOf(this.j), "tokenType");
        aVar.a(Boolean.valueOf(this.k), "supportsOdaTransit");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.q(parcel, 2, this.c, false);
        int i2 = this.d;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(i2);
        ozg0.p(parcel, 4, this.e, i, false);
        ozg0.q(parcel, 5, this.f, false);
        ozg0.p(parcel, 6, this.g, i, false);
        ozg0.e(parcel, 7, this.h, false);
        ozg0.t(parcel, 8, this.i, i);
        int i3 = this.j;
        ozg0.v(parcel, 9, 4);
        parcel.writeInt(i3);
        boolean z = this.k;
        ozg0.v(parcel, 10, 4);
        parcel.writeInt(z ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
