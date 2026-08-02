package com.google.android.gms.maps;

import E9.b;
import W9.g;
import W9.i;
import X9.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.plaid.internal.EnumC3631g;

/* loaded from: classes2.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new i();

    /* renamed from: u, reason: collision with root package name */
    public static final Integer f33164u = Integer.valueOf(Color.argb(255, EnumC3631g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 225));

    /* renamed from: a, reason: collision with root package name */
    public Boolean f33165a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f33166b;

    /* renamed from: c, reason: collision with root package name */
    public int f33167c;

    /* renamed from: d, reason: collision with root package name */
    public CameraPosition f33168d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f33169e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f33170f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f33171g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f33172h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f33173i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f33174j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f33175k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f33176l;

    /* renamed from: m, reason: collision with root package name */
    public Boolean f33177m;

    /* renamed from: n, reason: collision with root package name */
    public Float f33178n;

    /* renamed from: o, reason: collision with root package name */
    public Float f33179o;

    /* renamed from: p, reason: collision with root package name */
    public LatLngBounds f33180p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f33181q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f33182r;

    /* renamed from: s, reason: collision with root package name */
    public String f33183s;

    /* renamed from: t, reason: collision with root package name */
    public int f33184t;

    public GoogleMapOptions() {
        this.f33167c = -1;
        this.f33178n = null;
        this.f33179o = null;
        this.f33180p = null;
        this.f33182r = null;
        this.f33183s = null;
    }

    public static GoogleMapOptions k(Context context, AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, g.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(g.f13182q)) {
            googleMapOptions.j0(obtainAttributes.getInt(g.f13182q, -1));
        }
        if (obtainAttributes.hasValue(g.f13165A)) {
            googleMapOptions.r0(obtainAttributes.getBoolean(g.f13165A, false));
        }
        if (obtainAttributes.hasValue(g.f13191z)) {
            googleMapOptions.q0(obtainAttributes.getBoolean(g.f13191z, false));
        }
        if (obtainAttributes.hasValue(g.f13183r)) {
            googleMapOptions.j(obtainAttributes.getBoolean(g.f13183r, true));
        }
        if (obtainAttributes.hasValue(g.f13185t)) {
            googleMapOptions.m0(obtainAttributes.getBoolean(g.f13185t, true));
        }
        if (obtainAttributes.hasValue(g.f13187v)) {
            googleMapOptions.o0(obtainAttributes.getBoolean(g.f13187v, true));
        }
        if (obtainAttributes.hasValue(g.f13186u)) {
            googleMapOptions.n0(obtainAttributes.getBoolean(g.f13186u, true));
        }
        if (obtainAttributes.hasValue(g.f13188w)) {
            googleMapOptions.p0(obtainAttributes.getBoolean(g.f13188w, true));
        }
        if (obtainAttributes.hasValue(g.f13190y)) {
            googleMapOptions.t0(obtainAttributes.getBoolean(g.f13190y, true));
        }
        if (obtainAttributes.hasValue(g.f13189x)) {
            googleMapOptions.s0(obtainAttributes.getBoolean(g.f13189x, true));
        }
        if (obtainAttributes.hasValue(g.f13179n)) {
            googleMapOptions.f0(obtainAttributes.getBoolean(g.f13179n, false));
        }
        if (obtainAttributes.hasValue(g.f13184s)) {
            googleMapOptions.i0(obtainAttributes.getBoolean(g.f13184s, true));
        }
        if (obtainAttributes.hasValue(g.f13166a)) {
            googleMapOptions.g(obtainAttributes.getBoolean(g.f13166a, false));
        }
        if (obtainAttributes.hasValue(g.f13170e)) {
            googleMapOptions.l0(obtainAttributes.getFloat(g.f13170e, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(g.f13170e)) {
            googleMapOptions.k0(obtainAttributes.getFloat(g.f13169d, Float.POSITIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(g.f13167b)) {
            googleMapOptions.h(Integer.valueOf(obtainAttributes.getColor(g.f13167b, f33164u.intValue())));
        }
        if (obtainAttributes.hasValue(g.f13181p) && (string = obtainAttributes.getString(g.f13181p)) != null && !string.isEmpty()) {
            googleMapOptions.h0(string);
        }
        if (obtainAttributes.hasValue(g.f13180o)) {
            googleMapOptions.g0(obtainAttributes.getInt(g.f13180o, 0));
        }
        googleMapOptions.e0(v0(context, attributeSet));
        googleMapOptions.i(u0(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public static CameraPosition u0(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, g.MapAttrs);
        LatLng latLng = new LatLng(obtainAttributes.hasValue(g.f13171f) ? obtainAttributes.getFloat(g.f13171f, 0.0f) : 0.0f, obtainAttributes.hasValue(g.f13172g) ? obtainAttributes.getFloat(g.f13172g, 0.0f) : 0.0f);
        CameraPosition.a g10 = CameraPosition.g();
        g10.c(latLng);
        if (obtainAttributes.hasValue(g.f13174i)) {
            g10.e(obtainAttributes.getFloat(g.f13174i, 0.0f));
        }
        if (obtainAttributes.hasValue(g.f13168c)) {
            g10.a(obtainAttributes.getFloat(g.f13168c, 0.0f));
        }
        if (obtainAttributes.hasValue(g.f13173h)) {
            g10.d(obtainAttributes.getFloat(g.f13173h, 0.0f));
        }
        obtainAttributes.recycle();
        return g10.b();
    }

    public static LatLngBounds v0(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, g.MapAttrs);
        Float valueOf = obtainAttributes.hasValue(g.f13177l) ? Float.valueOf(obtainAttributes.getFloat(g.f13177l, 0.0f)) : null;
        Float valueOf2 = obtainAttributes.hasValue(g.f13178m) ? Float.valueOf(obtainAttributes.getFloat(g.f13178m, 0.0f)) : null;
        Float valueOf3 = obtainAttributes.hasValue(g.f13175j) ? Float.valueOf(obtainAttributes.getFloat(g.f13175j, 0.0f)) : null;
        Float valueOf4 = obtainAttributes.hasValue(g.f13176k) ? Float.valueOf(obtainAttributes.getFloat(g.f13176k, 0.0f)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(valueOf.floatValue(), valueOf2.floatValue()), new LatLng(valueOf3.floatValue(), valueOf4.floatValue()));
    }

    public LatLngBounds N() {
        return this.f33180p;
    }

    public int O() {
        return this.f33184t;
    }

    public String Y() {
        return this.f33183s;
    }

    public int Z() {
        return this.f33167c;
    }

    public Float a0() {
        return this.f33179o;
    }

    public Float d0() {
        return this.f33178n;
    }

    public GoogleMapOptions e0(LatLngBounds latLngBounds) {
        this.f33180p = latLngBounds;
        return this;
    }

    public GoogleMapOptions f0(boolean z10) {
        this.f33175k = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions g(boolean z10) {
        this.f33177m = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions g0(int i10) {
        this.f33184t = i10;
        return this;
    }

    public GoogleMapOptions h(Integer num) {
        this.f33182r = num;
        return this;
    }

    public GoogleMapOptions h0(String str) {
        this.f33183s = str;
        return this;
    }

    public GoogleMapOptions i(CameraPosition cameraPosition) {
        this.f33168d = cameraPosition;
        return this;
    }

    public GoogleMapOptions i0(boolean z10) {
        this.f33176l = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions j(boolean z10) {
        this.f33170f = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions j0(int i10) {
        this.f33167c = i10;
        return this;
    }

    public GoogleMapOptions k0(float f10) {
        this.f33179o = Float.valueOf(f10);
        return this;
    }

    public Integer l() {
        return this.f33182r;
    }

    public GoogleMapOptions l0(float f10) {
        this.f33178n = Float.valueOf(f10);
        return this;
    }

    public CameraPosition m() {
        return this.f33168d;
    }

    public GoogleMapOptions m0(boolean z10) {
        this.f33174j = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions n0(boolean z10) {
        this.f33171g = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions o0(boolean z10) {
        this.f33181q = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions p0(boolean z10) {
        this.f33173i = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions q0(boolean z10) {
        this.f33166b = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions r0(boolean z10) {
        this.f33165a = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions s0(boolean z10) {
        this.f33169e = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions t0(boolean z10) {
        this.f33172h = Boolean.valueOf(z10);
        return this;
    }

    public String toString() {
        return AbstractC3189m.d(this).a("MapType", Integer.valueOf(this.f33167c)).a("LiteMode", this.f33175k).a("Camera", this.f33168d).a("CompassEnabled", this.f33170f).a("ZoomControlsEnabled", this.f33169e).a("ScrollGesturesEnabled", this.f33171g).a("ZoomGesturesEnabled", this.f33172h).a("TiltGesturesEnabled", this.f33173i).a("RotateGesturesEnabled", this.f33174j).a("ScrollGesturesEnabledDuringRotateOrZoom", this.f33181q).a("MapToolbarEnabled", this.f33176l).a("AmbientEnabled", this.f33177m).a("MinZoomPreference", this.f33178n).a("MaxZoomPreference", this.f33179o).a("BackgroundColor", this.f33182r).a("LatLngBoundsForCameraTarget", this.f33180p).a("ZOrderOnTop", this.f33165a).a("UseViewLifecycleInFragment", this.f33166b).a("mapColorScheme", Integer.valueOf(this.f33184t)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.k(parcel, 2, e.a(this.f33165a));
        b.k(parcel, 3, e.a(this.f33166b));
        b.u(parcel, 4, Z());
        b.D(parcel, 5, m(), i10, false);
        b.k(parcel, 6, e.a(this.f33169e));
        b.k(parcel, 7, e.a(this.f33170f));
        b.k(parcel, 8, e.a(this.f33171g));
        b.k(parcel, 9, e.a(this.f33172h));
        b.k(parcel, 10, e.a(this.f33173i));
        b.k(parcel, 11, e.a(this.f33174j));
        b.k(parcel, 12, e.a(this.f33175k));
        b.k(parcel, 14, e.a(this.f33176l));
        b.k(parcel, 15, e.a(this.f33177m));
        b.s(parcel, 16, d0(), false);
        b.s(parcel, 17, a0(), false);
        b.D(parcel, 18, N(), i10, false);
        b.k(parcel, 19, e.a(this.f33181q));
        b.x(parcel, 20, l(), false);
        b.F(parcel, 21, Y(), false);
        b.u(parcel, 23, O());
        b.b(parcel, a10);
    }

    public GoogleMapOptions(byte b10, byte b11, int i10, CameraPosition cameraPosition, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17, byte b18, byte b19, byte b20, Float f10, Float f11, LatLngBounds latLngBounds, byte b21, Integer num, String str, int i11) {
        this.f33167c = -1;
        this.f33178n = null;
        this.f33179o = null;
        this.f33180p = null;
        this.f33182r = null;
        this.f33183s = null;
        this.f33165a = e.b(b10);
        this.f33166b = e.b(b11);
        this.f33167c = i10;
        this.f33168d = cameraPosition;
        this.f33169e = e.b(b12);
        this.f33170f = e.b(b13);
        this.f33171g = e.b(b14);
        this.f33172h = e.b(b15);
        this.f33173i = e.b(b16);
        this.f33174j = e.b(b17);
        this.f33175k = e.b(b18);
        this.f33176l = e.b(b19);
        this.f33177m = e.b(b20);
        this.f33178n = f10;
        this.f33179o = f11;
        this.f33180p = latLngBounds;
        this.f33181q = e.b(b21);
        this.f33182r = num;
        this.f33183s = str;
        this.f33184t = i11;
    }
}
