package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ol01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new ol01();
    public final CardInfo[] b;
    public final AccountInfo c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;
    public final SparseArray<String> f;

    public zzo(CardInfo[] cardInfoArr, AccountInfo accountInfo, @Nullable String str, @Nullable String str2, SparseArray<String> sparseArray) {
        this.b = cardInfoArr;
        this.c = accountInfo;
        this.d = str;
        this.e = str2;
        this.f = sparseArray;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.t(parcel, 2, this.b, i);
        ozg0.p(parcel, 3, this.c, i, false);
        ozg0.q(parcel, 4, this.d, false);
        ozg0.q(parcel, 5, this.e, false);
        SparseArray<String> sparseArray = this.f;
        if (sparseArray != null) {
            int w2 = ozg0.w(6, parcel);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                parcel.writeString(sparseArray.valueAt(i2));
            }
            ozg0.x(w2, parcel);
        }
        ozg0.x(w, parcel);
    }
}
