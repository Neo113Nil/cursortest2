package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes2.dex */
public final class PaymentData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PaymentData> CREATOR = new C3417e();

    /* renamed from: a, reason: collision with root package name */
    public String f34573a;

    /* renamed from: b, reason: collision with root package name */
    public CardInfo f34574b;

    /* renamed from: c, reason: collision with root package name */
    public UserAddress f34575c;

    /* renamed from: d, reason: collision with root package name */
    public PaymentMethodToken f34576d;

    /* renamed from: e, reason: collision with root package name */
    public String f34577e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f34578f;

    /* renamed from: g, reason: collision with root package name */
    public String f34579g;

    /* renamed from: h, reason: collision with root package name */
    public Bundle f34580h;

    public PaymentData(String str, CardInfo cardInfo, UserAddress userAddress, PaymentMethodToken paymentMethodToken, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.f34573a = str;
        this.f34574b = cardInfo;
        this.f34575c = userAddress;
        this.f34576d = paymentMethodToken;
        this.f34577e = str2;
        this.f34578f = bundle;
        this.f34579g = str3;
        this.f34580h = bundle2;
    }

    public static PaymentData g(Intent intent) {
        return (PaymentData) E9.c.b(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    public String h() {
        return this.f34579g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, this.f34573a, false);
        E9.b.D(parcel, 2, this.f34574b, i10, false);
        E9.b.D(parcel, 3, this.f34575c, i10, false);
        E9.b.D(parcel, 4, this.f34576d, i10, false);
        E9.b.F(parcel, 5, this.f34577e, false);
        E9.b.j(parcel, 6, this.f34578f, false);
        E9.b.F(parcel, 7, this.f34579g, false);
        E9.b.j(parcel, 8, this.f34580h, false);
        E9.b.b(parcel, a10);
    }
}
