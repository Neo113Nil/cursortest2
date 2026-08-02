package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ShippingAddressRequirements extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ShippingAddressRequirements> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f34597a;

    public ShippingAddressRequirements(ArrayList arrayList) {
        this.f34597a = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.H(parcel, 1, this.f34597a, false);
        E9.b.b(parcel, a10);
    }
}
