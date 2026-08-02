package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import z9.k;

/* loaded from: classes2.dex */
public class GetPhoneNumberHintIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetPhoneNumberHintIntentRequest> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    public final int f32136a;

    public GetPhoneNumberHintIntentRequest(int i10) {
        this.f32136a = i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GetPhoneNumberHintIntentRequest) {
            return AbstractC3189m.b(Integer.valueOf(this.f32136a), Integer.valueOf(((GetPhoneNumberHintIntentRequest) obj).f32136a));
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3189m.c(Integer.valueOf(this.f32136a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f32136a;
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, i11);
        E9.b.b(parcel, a10);
    }
}
