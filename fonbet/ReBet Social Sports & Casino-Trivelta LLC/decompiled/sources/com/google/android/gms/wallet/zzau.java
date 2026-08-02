package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new s();

    /* renamed from: a, reason: collision with root package name */
    public String f34694a;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f34695b;

    public zzau(String str, Bundle bundle) {
        this.f34694a = str;
        this.f34695b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, this.f34694a, false);
        E9.b.j(parcel, 3, this.f34695b, false);
        E9.b.b(parcel, a10);
    }
}
