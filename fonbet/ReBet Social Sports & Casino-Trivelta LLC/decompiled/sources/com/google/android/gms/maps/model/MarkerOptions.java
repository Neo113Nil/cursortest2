package com.google.android.gms.maps.model;

import N9.b;
import N9.d;
import Y9.p;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class MarkerOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new p();

    /* renamed from: a, reason: collision with root package name */
    public LatLng f33218a;

    /* renamed from: b, reason: collision with root package name */
    public String f33219b;

    /* renamed from: c, reason: collision with root package name */
    public String f33220c;

    /* renamed from: d, reason: collision with root package name */
    public Y9.b f33221d;

    /* renamed from: e, reason: collision with root package name */
    public float f33222e;

    /* renamed from: f, reason: collision with root package name */
    public float f33223f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f33224g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33225h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f33226i;

    /* renamed from: j, reason: collision with root package name */
    public float f33227j;

    /* renamed from: k, reason: collision with root package name */
    public float f33228k;

    /* renamed from: l, reason: collision with root package name */
    public float f33229l;

    /* renamed from: m, reason: collision with root package name */
    public float f33230m;

    /* renamed from: n, reason: collision with root package name */
    public float f33231n;

    /* renamed from: o, reason: collision with root package name */
    public int f33232o;

    /* renamed from: p, reason: collision with root package name */
    public View f33233p;

    /* renamed from: q, reason: collision with root package name */
    public int f33234q;

    /* renamed from: r, reason: collision with root package name */
    public String f33235r;

    /* renamed from: s, reason: collision with root package name */
    public float f33236s;

    public MarkerOptions() {
        this.f33222e = 0.5f;
        this.f33223f = 1.0f;
        this.f33225h = true;
        this.f33226i = false;
        this.f33227j = 0.0f;
        this.f33228k = 0.5f;
        this.f33229l = 0.0f;
        this.f33230m = 1.0f;
        this.f33232o = 0;
    }

    public String N() {
        return this.f33220c;
    }

    public String O() {
        return this.f33219b;
    }

    public float Y() {
        return this.f33231n;
    }

    public boolean Z() {
        return this.f33224g;
    }

    public boolean a0() {
        return this.f33226i;
    }

    public boolean d0() {
        return this.f33225h;
    }

    public MarkerOptions e0(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.f33218a = latLng;
        return this;
    }

    public final int f0() {
        return this.f33234q;
    }

    public float g() {
        return this.f33230m;
    }

    public float h() {
        return this.f33222e;
    }

    public float i() {
        return this.f33223f;
    }

    public float j() {
        return this.f33228k;
    }

    public float k() {
        return this.f33229l;
    }

    public LatLng l() {
        return this.f33218a;
    }

    public float m() {
        return this.f33227j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 2, l(), i10, false);
        E9.b.F(parcel, 3, O(), false);
        E9.b.F(parcel, 4, N(), false);
        Y9.b bVar = this.f33221d;
        E9.b.t(parcel, 5, bVar == null ? null : bVar.a().asBinder(), false);
        E9.b.q(parcel, 6, h());
        E9.b.q(parcel, 7, i());
        E9.b.g(parcel, 8, Z());
        E9.b.g(parcel, 9, d0());
        E9.b.g(parcel, 10, a0());
        E9.b.q(parcel, 11, m());
        E9.b.q(parcel, 12, j());
        E9.b.q(parcel, 13, k());
        E9.b.q(parcel, 14, g());
        E9.b.q(parcel, 15, Y());
        E9.b.u(parcel, 17, this.f33232o);
        E9.b.t(parcel, 18, d.i(this.f33233p).asBinder(), false);
        E9.b.u(parcel, 19, this.f33234q);
        E9.b.F(parcel, 20, this.f33235r, false);
        E9.b.q(parcel, 21, this.f33236s);
        E9.b.b(parcel, a10);
    }

    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f10, float f11, boolean z10, boolean z11, boolean z12, float f12, float f13, float f14, float f15, float f16, int i10, IBinder iBinder2, int i11, String str3, float f17) {
        this.f33222e = 0.5f;
        this.f33223f = 1.0f;
        this.f33225h = true;
        this.f33226i = false;
        this.f33227j = 0.0f;
        this.f33228k = 0.5f;
        this.f33229l = 0.0f;
        this.f33230m = 1.0f;
        this.f33232o = 0;
        this.f33218a = latLng;
        this.f33219b = str;
        this.f33220c = str2;
        if (iBinder == null) {
            this.f33221d = null;
        } else {
            this.f33221d = new Y9.b(b.a.c(iBinder));
        }
        this.f33222e = f10;
        this.f33223f = f11;
        this.f33224g = z10;
        this.f33225h = z11;
        this.f33226i = z12;
        this.f33227j = f12;
        this.f33228k = f13;
        this.f33229l = f14;
        this.f33230m = f15;
        this.f33231n = f16;
        this.f33234q = i11;
        this.f33232o = i10;
        N9.b c10 = b.a.c(iBinder2);
        this.f33233p = c10 != null ? (View) d.g(c10) : null;
        this.f33235r = str3;
        this.f33236s = f17;
    }
}
