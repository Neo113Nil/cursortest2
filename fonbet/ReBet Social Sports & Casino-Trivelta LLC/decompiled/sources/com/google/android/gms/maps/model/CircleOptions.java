package com.google.android.gms.maps.model;

import Y9.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class CircleOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CircleOptions> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    public LatLng f33197a;

    /* renamed from: b, reason: collision with root package name */
    public double f33198b;

    /* renamed from: c, reason: collision with root package name */
    public float f33199c;

    /* renamed from: d, reason: collision with root package name */
    public int f33200d;

    /* renamed from: e, reason: collision with root package name */
    public int f33201e;

    /* renamed from: f, reason: collision with root package name */
    public float f33202f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f33203g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33204h;

    /* renamed from: i, reason: collision with root package name */
    public List f33205i;

    public CircleOptions() {
        this.f33197a = null;
        this.f33198b = 0.0d;
        this.f33199c = 10.0f;
        this.f33200d = -16777216;
        this.f33201e = 0;
        this.f33202f = 0.0f;
        this.f33203g = true;
        this.f33204h = false;
        this.f33205i = null;
    }

    public float N() {
        return this.f33199c;
    }

    public float O() {
        return this.f33202f;
    }

    public boolean Y() {
        return this.f33204h;
    }

    public boolean Z() {
        return this.f33203g;
    }

    public CircleOptions a0(double d10) {
        this.f33198b = d10;
        return this;
    }

    public CircleOptions d0(int i10) {
        this.f33200d = i10;
        return this;
    }

    public CircleOptions e0(float f10) {
        this.f33199c = f10;
        return this;
    }

    public CircleOptions g(LatLng latLng) {
        AbstractC3191o.n(latLng, "center must not be null.");
        this.f33197a = latLng;
        return this;
    }

    public CircleOptions h(int i10) {
        this.f33201e = i10;
        return this;
    }

    public LatLng i() {
        return this.f33197a;
    }

    public int j() {
        return this.f33201e;
    }

    public double k() {
        return this.f33198b;
    }

    public int l() {
        return this.f33200d;
    }

    public List m() {
        return this.f33205i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 2, i(), i10, false);
        E9.b.n(parcel, 3, k());
        E9.b.q(parcel, 4, N());
        E9.b.u(parcel, 5, l());
        E9.b.u(parcel, 6, j());
        E9.b.q(parcel, 7, O());
        E9.b.g(parcel, 8, Z());
        E9.b.g(parcel, 9, Y());
        E9.b.J(parcel, 10, m(), false);
        E9.b.b(parcel, a10);
    }

    public CircleOptions(LatLng latLng, double d10, float f10, int i10, int i11, float f11, boolean z10, boolean z11, List list) {
        this.f33197a = latLng;
        this.f33198b = d10;
        this.f33199c = f10;
        this.f33200d = i10;
        this.f33201e = i11;
        this.f33202f = f11;
        this.f33203g = z10;
        this.f33204h = z11;
        this.f33205i = list;
    }
}
