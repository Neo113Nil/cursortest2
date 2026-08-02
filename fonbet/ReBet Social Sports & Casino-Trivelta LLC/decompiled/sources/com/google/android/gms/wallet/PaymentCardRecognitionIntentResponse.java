package com.google.android.gms.wallet;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class PaymentCardRecognitionIntentResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PaymentCardRecognitionIntentResponse> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    public PendingIntent f34572a;

    public PaymentCardRecognitionIntentResponse(PendingIntent pendingIntent) {
        this.f34572a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 1, this.f34572a, i10, false);
        E9.b.b(parcel, a10);
    }
}
