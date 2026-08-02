package com.google.android.gms.wallet.wobs;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ha.g;

/* loaded from: classes2.dex */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public int f34654a;

    /* renamed from: b, reason: collision with root package name */
    public String f34655b;

    /* renamed from: c, reason: collision with root package name */
    public double f34656c;

    /* renamed from: d, reason: collision with root package name */
    public String f34657d;

    /* renamed from: e, reason: collision with root package name */
    public long f34658e;

    /* renamed from: f, reason: collision with root package name */
    public int f34659f;

    public LoyaltyPointsBalance(int i10, String str, double d10, String str2, long j10, int i11) {
        this.f34654a = i10;
        this.f34655b = str;
        this.f34656c = d10;
        this.f34657d = str2;
        this.f34658e = j10;
        this.f34659f = i11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.u(parcel, 2, this.f34654a);
        b.F(parcel, 3, this.f34655b, false);
        b.n(parcel, 4, this.f34656c);
        b.F(parcel, 5, this.f34657d, false);
        b.y(parcel, 6, this.f34658e);
        b.u(parcel, 7, this.f34659f);
        b.b(parcel, a10);
    }
}
