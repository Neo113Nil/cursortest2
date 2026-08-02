package com.google.android.gms.maps.model;

import Y9.h;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class StrokeStyle extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StrokeStyle> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    public final float f33247a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33248b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33249c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33250d;

    /* renamed from: e, reason: collision with root package name */
    public final StampStyle f33251e;

    public StrokeStyle(float f10, int i10, int i11, boolean z10, StampStyle stampStyle) {
        this.f33247a = f10;
        this.f33248b = i10;
        this.f33249c = i11;
        this.f33250d = z10;
        this.f33251e = stampStyle;
    }

    public StampStyle g() {
        return this.f33251e;
    }

    public boolean h() {
        return this.f33250d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.q(parcel, 2, this.f33247a);
        E9.b.u(parcel, 3, this.f33248b);
        E9.b.u(parcel, 4, this.f33249c);
        E9.b.g(parcel, 5, h());
        E9.b.D(parcel, 6, g(), i10, false);
        E9.b.b(parcel, a10);
    }
}
