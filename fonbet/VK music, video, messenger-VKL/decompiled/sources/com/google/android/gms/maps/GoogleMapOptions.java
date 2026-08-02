package com.google.android.gms.maps;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.alk;
import xsna.dq70;
import xsna.ozg0;
import xsna.ruz0;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new ruz0();

    @Nullable
    public Boolean b;

    @Nullable
    public Boolean c;

    @Nullable
    public CameraPosition e;

    @Nullable
    public Boolean f;

    @Nullable
    public Boolean g;

    @Nullable
    public Boolean h;

    @Nullable
    public Boolean i;

    @Nullable
    public Boolean j;

    @Nullable
    public Boolean k;

    @Nullable
    public Boolean l;

    @Nullable
    public Boolean m;

    @Nullable
    public Boolean n;

    @Nullable
    public Boolean r;
    public int d = -1;

    @Nullable
    public Float o = null;

    @Nullable
    public Float p = null;

    @Nullable
    public LatLngBounds q = null;

    @Nullable
    public Integer s = null;

    @Nullable
    public String t = null;

    @Nullable
    public static GoogleMapOptions b(@Nullable Activity activity, @Nullable AttributeSet attributeSet) {
        String string;
        LatLngBounds latLngBounds = null;
        if (activity == null || attributeSet == null) {
            return null;
        }
        Resources resources = activity.getResources();
        int[] iArr = R$styleable.a;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(15)) {
            googleMapOptions.d = obtainAttributes.getInt(15, -1);
        }
        if (obtainAttributes.hasValue(25)) {
            googleMapOptions.b = Boolean.valueOf(obtainAttributes.getBoolean(25, false));
        }
        if (obtainAttributes.hasValue(24)) {
            googleMapOptions.c = Boolean.valueOf(obtainAttributes.getBoolean(24, false));
        }
        if (obtainAttributes.hasValue(16)) {
            googleMapOptions.g = Boolean.valueOf(obtainAttributes.getBoolean(16, true));
        }
        if (obtainAttributes.hasValue(18)) {
            googleMapOptions.k = Boolean.valueOf(obtainAttributes.getBoolean(18, true));
        }
        if (obtainAttributes.hasValue(20)) {
            googleMapOptions.r = Boolean.valueOf(obtainAttributes.getBoolean(20, true));
        }
        if (obtainAttributes.hasValue(19)) {
            googleMapOptions.h = Boolean.valueOf(obtainAttributes.getBoolean(19, true));
        }
        if (obtainAttributes.hasValue(21)) {
            googleMapOptions.j = Boolean.valueOf(obtainAttributes.getBoolean(21, true));
        }
        if (obtainAttributes.hasValue(23)) {
            googleMapOptions.i = Boolean.valueOf(obtainAttributes.getBoolean(23, true));
        }
        if (obtainAttributes.hasValue(22)) {
            googleMapOptions.f = Boolean.valueOf(obtainAttributes.getBoolean(22, true));
        }
        if (obtainAttributes.hasValue(13)) {
            googleMapOptions.l = Boolean.valueOf(obtainAttributes.getBoolean(13, false));
        }
        if (obtainAttributes.hasValue(17)) {
            googleMapOptions.m = Boolean.valueOf(obtainAttributes.getBoolean(17, true));
        }
        if (obtainAttributes.hasValue(0)) {
            googleMapOptions.n = Boolean.valueOf(obtainAttributes.getBoolean(0, false));
        }
        if (obtainAttributes.hasValue(4)) {
            googleMapOptions.o = Float.valueOf(obtainAttributes.getFloat(4, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(4)) {
            googleMapOptions.p = Float.valueOf(obtainAttributes.getFloat(3, Float.POSITIVE_INFINITY));
        }
        TypedArray obtainAttributes2 = activity.getResources().obtainAttributes(attributeSet, new int[]{activity.getResources().getIdentifier(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "attr", activity.getPackageName()), activity.getResources().getIdentifier("mapId", "attr", activity.getPackageName())});
        if (obtainAttributes2.hasValue(0)) {
            googleMapOptions.s = Integer.valueOf(obtainAttributes2.getColor(0, 0));
        }
        if (obtainAttributes2.hasValue(1) && (string = obtainAttributes2.getString(1)) != null && !string.isEmpty()) {
            googleMapOptions.t = string;
        }
        obtainAttributes2.recycle();
        TypedArray obtainAttributes3 = activity.getResources().obtainAttributes(attributeSet, iArr);
        boolean hasValue = obtainAttributes3.hasValue(11);
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Float valueOf = hasValue ? Float.valueOf(obtainAttributes3.getFloat(11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) : null;
        Float valueOf2 = obtainAttributes3.hasValue(12) ? Float.valueOf(obtainAttributes3.getFloat(12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) : null;
        Float valueOf3 = obtainAttributes3.hasValue(9) ? Float.valueOf(obtainAttributes3.getFloat(9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) : null;
        Float valueOf4 = obtainAttributes3.hasValue(10) ? Float.valueOf(obtainAttributes3.getFloat(10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) : null;
        obtainAttributes3.recycle();
        if (valueOf != null && valueOf2 != null && valueOf3 != null && valueOf4 != null) {
            latLngBounds = new LatLngBounds(new LatLng(valueOf.floatValue(), valueOf2.floatValue()), new LatLng(valueOf3.floatValue(), valueOf4.floatValue()));
        }
        googleMapOptions.q = latLngBounds;
        TypedArray obtainAttributes4 = activity.getResources().obtainAttributes(attributeSet, iArr);
        LatLng latLng = new LatLng(obtainAttributes4.hasValue(5) ? obtainAttributes4.getFloat(5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : 0.0f, obtainAttributes4.hasValue(6) ? obtainAttributes4.getFloat(6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : 0.0f);
        float f2 = obtainAttributes4.hasValue(8) ? obtainAttributes4.getFloat(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : 0.0f;
        float f3 = obtainAttributes4.hasValue(2) ? obtainAttributes4.getFloat(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : 0.0f;
        if (obtainAttributes4.hasValue(7)) {
            f = obtainAttributes4.getFloat(7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        obtainAttributes4.recycle();
        googleMapOptions.e = new CameraPosition(latLng, f2, f, f3);
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(Integer.valueOf(this.d), "MapType");
        aVar.a(this.l, "LiteMode");
        aVar.a(this.e, "Camera");
        aVar.a(this.g, "CompassEnabled");
        aVar.a(this.f, "ZoomControlsEnabled");
        aVar.a(this.h, "ScrollGesturesEnabled");
        aVar.a(this.i, "ZoomGesturesEnabled");
        aVar.a(this.j, "TiltGesturesEnabled");
        aVar.a(this.k, "RotateGesturesEnabled");
        aVar.a(this.r, "ScrollGesturesEnabledDuringRotateOrZoom");
        aVar.a(this.m, "MapToolbarEnabled");
        aVar.a(this.n, "AmbientEnabled");
        aVar.a(this.o, "MinZoomPreference");
        aVar.a(this.p, "MaxZoomPreference");
        aVar.a(this.s, "BackgroundColor");
        aVar.a(this.q, "LatLngBoundsForCameraTarget");
        aVar.a(this.b, "ZOrderOnTop");
        aVar.a(this.c, "UseViewLifecycleInFragment");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        byte I = alk.I(this.b);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(I);
        byte I2 = alk.I(this.c);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(I2);
        int i2 = this.d;
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(i2);
        ozg0.p(parcel, 5, this.e, i, false);
        byte I3 = alk.I(this.f);
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(I3);
        byte I4 = alk.I(this.g);
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(I4);
        byte I5 = alk.I(this.h);
        ozg0.v(parcel, 8, 4);
        parcel.writeInt(I5);
        byte I6 = alk.I(this.i);
        ozg0.v(parcel, 9, 4);
        parcel.writeInt(I6);
        byte I7 = alk.I(this.j);
        ozg0.v(parcel, 10, 4);
        parcel.writeInt(I7);
        byte I8 = alk.I(this.k);
        ozg0.v(parcel, 11, 4);
        parcel.writeInt(I8);
        byte I9 = alk.I(this.l);
        ozg0.v(parcel, 12, 4);
        parcel.writeInt(I9);
        byte I10 = alk.I(this.m);
        ozg0.v(parcel, 14, 4);
        parcel.writeInt(I10);
        byte I11 = alk.I(this.n);
        ozg0.v(parcel, 15, 4);
        parcel.writeInt(I11);
        ozg0.g(parcel, 16, this.o);
        ozg0.g(parcel, 17, this.p);
        ozg0.p(parcel, 18, this.q, i, false);
        byte I12 = alk.I(this.r);
        ozg0.v(parcel, 19, 4);
        parcel.writeInt(I12);
        ozg0.k(parcel, 20, this.s);
        ozg0.q(parcel, 21, this.t, false);
        ozg0.x(w, parcel);
    }
}
