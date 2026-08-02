package com.google.android.gms.maps.model;

import N9.b;
import Y9.r;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class StampStyle extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StampStyle> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    public final Y9.b f33246a;

    public StampStyle(IBinder iBinder) {
        this.f33246a = new Y9.b(b.a.c(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Y9.b bVar = this.f33246a;
        int a10 = E9.b.a(parcel);
        E9.b.t(parcel, 2, bVar.a().asBinder(), false);
        E9.b.b(parcel, a10);
    }
}
