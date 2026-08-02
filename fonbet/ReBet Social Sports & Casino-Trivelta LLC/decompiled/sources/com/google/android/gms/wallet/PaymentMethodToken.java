package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class PaymentMethodToken extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PaymentMethodToken> CREATOR = new C3420h();

    /* renamed from: a, reason: collision with root package name */
    public int f34593a;

    /* renamed from: b, reason: collision with root package name */
    public String f34594b;

    public PaymentMethodToken(int i10, String str) {
        this.f34593a = i10;
        this.f34594b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 2, this.f34593a);
        E9.b.F(parcel, 3, this.f34594b, false);
        E9.b.b(parcel, a10);
    }
}
