package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import z9.g;

@Deprecated
/* loaded from: classes2.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f32131a;

    public BeginSignInResult(PendingIntent pendingIntent) {
        this.f32131a = (PendingIntent) AbstractC3191o.m(pendingIntent);
    }

    public PendingIntent g() {
        return this.f32131a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 1, g(), i10, false);
        E9.b.b(parcel, a10);
    }
}
