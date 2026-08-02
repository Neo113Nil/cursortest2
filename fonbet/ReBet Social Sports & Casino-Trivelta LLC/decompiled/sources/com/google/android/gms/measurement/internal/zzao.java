package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new C3310n();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f34433a;

    public zzao(Bundle bundle) {
        this.f34433a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f34433a;
        int a10 = E9.b.a(parcel);
        E9.b.j(parcel, 1, bundle, false);
        E9.b.b(parcel, a10);
    }
}
