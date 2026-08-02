package com.google.android.gms.location;

import E9.b;
import V9.r;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33140a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33141b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33142c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33143d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33144e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f33145f;

    public LocationSettingsStates(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f33140a = z10;
        this.f33141b = z11;
        this.f33142c = z12;
        this.f33143d = z13;
        this.f33144e = z14;
        this.f33145f = z15;
    }

    public boolean g() {
        return this.f33145f;
    }

    public boolean h() {
        return this.f33142c;
    }

    public boolean i() {
        return this.f33143d;
    }

    public boolean j() {
        return this.f33140a;
    }

    public boolean k() {
        return this.f33144e;
    }

    public boolean l() {
        return this.f33141b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.g(parcel, 1, j());
        b.g(parcel, 2, l());
        b.g(parcel, 3, h());
        b.g(parcel, 4, i());
        b.g(parcel, 5, k());
        b.g(parcel, 6, g());
        b.b(parcel, a10);
    }
}
