package com.google.android.gms.wallet.wobs;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ha.h;

/* loaded from: classes2.dex */
public final class LoyaltyPoints extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LoyaltyPoints> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    public String f34651a;

    /* renamed from: b, reason: collision with root package name */
    public LoyaltyPointsBalance f34652b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterval f34653c;

    public LoyaltyPoints(String str, LoyaltyPointsBalance loyaltyPointsBalance, TimeInterval timeInterval) {
        this.f34651a = str;
        this.f34652b = loyaltyPointsBalance;
        this.f34653c = timeInterval;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 2, this.f34651a, false);
        b.D(parcel, 3, this.f34652b, i10, false);
        b.D(parcel, 5, this.f34653c, i10, false);
        b.b(parcel, a10);
    }
}
