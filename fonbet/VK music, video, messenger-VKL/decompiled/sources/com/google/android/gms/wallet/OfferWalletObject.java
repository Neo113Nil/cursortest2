package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import xsna.ap01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new ap01();
    public final int b;
    public final String c;
    public final CommonWalletObject d;

    public OfferWalletObject(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.b = i;
        this.c = str2;
        if (i >= 3) {
            this.d = commonWalletObject;
            return;
        }
        CommonWalletObject commonWalletObject2 = new CommonWalletObject();
        commonWalletObject2.b = str;
        this.d = commonWalletObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.p(parcel, 4, this.d, i, false);
        ozg0.x(w, parcel);
    }

    public OfferWalletObject() {
        this.b = 3;
    }
}
