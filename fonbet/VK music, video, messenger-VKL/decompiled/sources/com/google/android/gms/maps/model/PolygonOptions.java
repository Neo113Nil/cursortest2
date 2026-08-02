package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import xsna.ozg0;
import xsna.wj01;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class PolygonOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new wj01();
    public final List<LatLng> b;
    public final ArrayList c;
    public float d;
    public int e;
    public final int f;
    public float g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;

    @Nullable
    public final List<PatternItem> l;

    public PolygonOptions() {
        this.d = 10.0f;
        this.e = -16777216;
        this.f = 0;
        this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.h = true;
        this.i = false;
        this.j = false;
        this.k = 0;
        this.l = null;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.u(parcel, 2, this.b, false);
        ozg0.l(parcel, this.c, 3);
        float f = this.d;
        ozg0.v(parcel, 4, 4);
        parcel.writeFloat(f);
        int i2 = this.e;
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(i2);
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(this.f);
        float f2 = this.g;
        ozg0.v(parcel, 7, 4);
        parcel.writeFloat(f2);
        ozg0.v(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        ozg0.v(parcel, 9, 4);
        parcel.writeInt(this.i ? 1 : 0);
        ozg0.v(parcel, 10, 4);
        parcel.writeInt(this.j ? 1 : 0);
        ozg0.v(parcel, 11, 4);
        parcel.writeInt(this.k);
        ozg0.u(parcel, 12, this.l, false);
        ozg0.x(w, parcel);
    }

    public PolygonOptions(ArrayList arrayList, ArrayList arrayList2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, @Nullable ArrayList arrayList3) {
        this.b = arrayList;
        this.c = arrayList2;
        this.d = f;
        this.e = i;
        this.f = i2;
        this.g = f2;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = i3;
        this.l = arrayList3;
    }
}
