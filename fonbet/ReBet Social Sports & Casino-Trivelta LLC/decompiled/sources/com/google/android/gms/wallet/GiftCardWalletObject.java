package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* loaded from: classes2.dex */
public final class GiftCardWalletObject extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new z();

    /* renamed from: a, reason: collision with root package name */
    public CommonWalletObject f34520a;

    /* renamed from: b, reason: collision with root package name */
    public String f34521b;

    /* renamed from: c, reason: collision with root package name */
    public String f34522c;

    /* renamed from: d, reason: collision with root package name */
    public String f34523d;

    /* renamed from: e, reason: collision with root package name */
    public long f34524e;

    /* renamed from: f, reason: collision with root package name */
    public String f34525f;

    /* renamed from: g, reason: collision with root package name */
    public long f34526g;

    /* renamed from: h, reason: collision with root package name */
    public String f34527h;

    public GiftCardWalletObject(CommonWalletObject commonWalletObject, String str, String str2, String str3, long j10, String str4, long j11, String str5) {
        CommonWalletObject.g();
        this.f34520a = commonWalletObject;
        this.f34521b = str;
        this.f34522c = str2;
        this.f34524e = j10;
        this.f34525f = str4;
        this.f34526g = j11;
        this.f34527h = str5;
        this.f34523d = str3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 2, this.f34520a, i10, false);
        E9.b.F(parcel, 3, this.f34521b, false);
        E9.b.F(parcel, 4, this.f34522c, false);
        E9.b.F(parcel, 5, this.f34523d, false);
        E9.b.y(parcel, 6, this.f34524e);
        E9.b.F(parcel, 7, this.f34525f, false);
        E9.b.y(parcel, 8, this.f34526g);
        E9.b.F(parcel, 9, this.f34527h, false);
        E9.b.b(parcel, a10);
    }
}
