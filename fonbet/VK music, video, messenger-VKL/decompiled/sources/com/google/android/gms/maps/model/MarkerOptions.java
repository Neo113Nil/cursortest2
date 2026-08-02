package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.unity3d.services.UnityAdsConstants;
import xsna.gf01;
import xsna.ozg0;
import xsna.tb7;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class MarkerOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new gf01();
    public LatLng b;

    @Nullable
    public String c;

    @Nullable
    public String d;

    @Nullable
    public tb7 e;
    public boolean h;
    public float o;
    public float f = 0.5f;
    public float g = 1.0f;
    public boolean i = true;
    public boolean j = false;
    public float k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float l = 0.5f;
    public float m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float n = 1.0f;

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 2, this.b, i, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.q(parcel, 4, this.d, false);
        tb7 tb7Var = this.e;
        ozg0.h(parcel, 5, tb7Var == null ? null : tb7Var.a.asBinder());
        float f = this.f;
        ozg0.v(parcel, 6, 4);
        parcel.writeFloat(f);
        float f2 = this.g;
        ozg0.v(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.h;
        ozg0.v(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.i;
        ozg0.v(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.j;
        ozg0.v(parcel, 10, 4);
        parcel.writeInt(z3 ? 1 : 0);
        float f3 = this.k;
        ozg0.v(parcel, 11, 4);
        parcel.writeFloat(f3);
        float f4 = this.l;
        ozg0.v(parcel, 12, 4);
        parcel.writeFloat(f4);
        float f5 = this.m;
        ozg0.v(parcel, 13, 4);
        parcel.writeFloat(f5);
        float f6 = this.n;
        ozg0.v(parcel, 14, 4);
        parcel.writeFloat(f6);
        float f7 = this.o;
        ozg0.v(parcel, 15, 4);
        parcel.writeFloat(f7);
        ozg0.x(w, parcel);
    }
}
