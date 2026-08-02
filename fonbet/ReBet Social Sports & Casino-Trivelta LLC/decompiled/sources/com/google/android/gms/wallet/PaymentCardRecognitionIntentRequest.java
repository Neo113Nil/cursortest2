package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class PaymentCardRecognitionIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PaymentCardRecognitionIntentRequest> CREATOR = new G();

    /* renamed from: a, reason: collision with root package name */
    public int f34571a;

    public PaymentCardRecognitionIntentRequest(int i10) {
        this.f34571a = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, this.f34571a);
        E9.b.b(parcel, a10);
    }
}
