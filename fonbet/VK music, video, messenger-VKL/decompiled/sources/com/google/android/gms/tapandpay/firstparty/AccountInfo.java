package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.BillingFlowParams;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dq70;
import xsna.o101;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class AccountInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AccountInfo> CREATOR = new o101();
    public final String b;
    public final String c;

    public AccountInfo(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AccountInfo) {
            AccountInfo accountInfo = (AccountInfo) obj;
            if (dq70.b(this.b, accountInfo.b) && dq70.b(this.c, accountInfo.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID);
        aVar.a(this.c, "accountName");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.x(w, parcel);
    }
}
