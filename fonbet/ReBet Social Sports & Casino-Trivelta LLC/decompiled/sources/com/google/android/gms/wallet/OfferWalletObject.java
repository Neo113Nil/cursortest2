package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* loaded from: classes2.dex */
public final class OfferWalletObject extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new F();

    /* renamed from: a, reason: collision with root package name */
    public final int f34567a;

    /* renamed from: b, reason: collision with root package name */
    public String f34568b;

    /* renamed from: c, reason: collision with root package name */
    public String f34569c;

    /* renamed from: d, reason: collision with root package name */
    public CommonWalletObject f34570d;

    public OfferWalletObject(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f34567a = i10;
        this.f34569c = str2;
        if (i10 >= 3) {
            this.f34570d = commonWalletObject;
            return;
        }
        ha.c g10 = CommonWalletObject.g();
        g10.a(str);
        this.f34570d = g10.b();
    }

    public int g() {
        return this.f34567a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, g());
        E9.b.F(parcel, 2, this.f34568b, false);
        E9.b.F(parcel, 3, this.f34569c, false);
        E9.b.D(parcel, 4, this.f34570d, i10, false);
        E9.b.b(parcel, a10);
    }
}
