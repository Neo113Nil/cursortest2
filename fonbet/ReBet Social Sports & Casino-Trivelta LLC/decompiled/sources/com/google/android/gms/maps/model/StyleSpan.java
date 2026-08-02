package com.google.android.gms.maps.model;

import Y9.i;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class StyleSpan extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StyleSpan> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public final StrokeStyle f33252a;

    /* renamed from: b, reason: collision with root package name */
    public final double f33253b;

    public StyleSpan(StrokeStyle strokeStyle, double d10) {
        if (d10 <= 0.0d) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.f33252a = strokeStyle;
        this.f33253b = d10;
    }

    public double g() {
        return this.f33253b;
    }

    public StrokeStyle h() {
        return this.f33252a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 2, h(), i10, false);
        E9.b.n(parcel, 3, g());
        E9.b.b(parcel, a10);
    }
}
