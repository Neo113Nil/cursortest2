package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public int f34595a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f34596b;

    public PaymentMethodTokenizationParameters(int i10, Bundle bundle) {
        new Bundle();
        this.f34595a = i10;
        this.f34596b = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 2, this.f34595a);
        E9.b.j(parcel, 3, this.f34596b, false);
        E9.b.b(parcel, a10);
    }
}
