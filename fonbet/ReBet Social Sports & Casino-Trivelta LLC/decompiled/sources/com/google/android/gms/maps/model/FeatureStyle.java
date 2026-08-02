package com.google.android.gms.maps.model;

import Y9.m;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class FeatureStyle extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<FeatureStyle> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    public final Integer f33206a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f33207b;

    /* renamed from: c, reason: collision with root package name */
    public final Float f33208c;

    /* renamed from: d, reason: collision with root package name */
    public final Float f33209d;

    public FeatureStyle(Integer num, Integer num2, Float f10, Float f11) {
        this.f33206a = num;
        this.f33207b = num2;
        this.f33208c = f10;
        this.f33209d = f11;
    }

    public Integer g() {
        return this.f33206a;
    }

    public Float h() {
        return this.f33209d;
    }

    public Integer i() {
        return this.f33207b;
    }

    public Float j() {
        return this.f33208c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.x(parcel, 1, g(), false);
        E9.b.x(parcel, 2, i(), false);
        E9.b.s(parcel, 3, j(), false);
        E9.b.s(parcel, 4, h(), false);
        E9.b.b(parcel, a10);
    }
}
