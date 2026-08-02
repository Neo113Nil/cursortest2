package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dq70;
import xsna.ozg0;
import xsna.rr01;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class VisibleRegion extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new rr01();

    @NonNull
    public final LatLng b;

    @NonNull
    public final LatLng c;

    @NonNull
    public final LatLng d;

    @NonNull
    public final LatLng e;

    @NonNull
    public final LatLngBounds f;

    public VisibleRegion(@NonNull LatLng latLng, @NonNull LatLng latLng2, @NonNull LatLng latLng3, @NonNull LatLng latLng4, @NonNull LatLngBounds latLngBounds) {
        this.b = latLng;
        this.c = latLng2;
        this.d = latLng3;
        this.e = latLng4;
        this.f = latLngBounds;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.b.equals(visibleRegion.b) && this.c.equals(visibleRegion.c) && this.d.equals(visibleRegion.d) && this.e.equals(visibleRegion.e) && this.f.equals(visibleRegion.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f});
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "nearLeft");
        aVar.a(this.c, "nearRight");
        aVar.a(this.d, "farLeft");
        aVar.a(this.e, "farRight");
        aVar.a(this.f, "latLngBounds");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 2, this.b, i, false);
        ozg0.p(parcel, 3, this.c, i, false);
        ozg0.p(parcel, 4, this.d, i, false);
        ozg0.p(parcel, 5, this.e, i, false);
        ozg0.p(parcel, 6, this.f, i, false);
        ozg0.x(w, parcel);
    }
}
