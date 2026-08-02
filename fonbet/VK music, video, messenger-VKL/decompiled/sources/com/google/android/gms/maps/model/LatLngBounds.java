package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dq70;
import xsna.ea01;
import xsna.exc0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new ea01();

    @NonNull
    public final LatLng b;

    @NonNull
    public final LatLng c;

    public LatLngBounds(@NonNull LatLng latLng, @NonNull LatLng latLng2) {
        exc0.j(latLng, "southwest must not be null.");
        exc0.j(latLng2, "northeast must not be null.");
        double d = latLng2.b;
        double d2 = latLng.b;
        exc0.c(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(d));
        this.b = latLng;
        this.c = latLng2;
    }

    public final boolean b(@NonNull LatLng latLng) {
        exc0.j(latLng, "point must not be null.");
        double d = latLng.b;
        LatLng latLng2 = this.b;
        if (latLng2.b > d) {
            return false;
        }
        LatLng latLng3 = this.c;
        if (d > latLng3.b) {
            return false;
        }
        double d2 = latLng.c;
        double d3 = latLng2.c;
        double d4 = latLng3.c;
        return d3 <= d4 ? d3 <= d2 && d2 <= d4 : d3 <= d2 || d2 <= d4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.b.equals(latLngBounds.b) && this.c.equals(latLngBounds.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "southwest");
        aVar.a(this.c, "northeast");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 2, this.b, i, false);
        ozg0.p(parcel, 3, this.c, i, false);
        ozg0.x(w, parcel);
    }
}
