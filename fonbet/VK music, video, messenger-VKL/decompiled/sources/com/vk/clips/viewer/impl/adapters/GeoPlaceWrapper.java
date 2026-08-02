package com.vk.clips.viewer.impl.adapters;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.sdk.shared.api.deps.dtos.SdkGeoPlace;
import com.vk.dto.geo.GeoPlace;
import xsna.epx;

/* compiled from: GeoPlaceAdapter.kt */
/* loaded from: classes17.dex */
public final class GeoPlaceWrapper implements SdkGeoPlace {
    public static final Parcelable.Creator<GeoPlaceWrapper> CREATOR = new a();
    public final GeoPlace b;

    /* compiled from: GeoPlaceAdapter.kt */
    public static final class a implements Parcelable.Creator<GeoPlaceWrapper> {
        @Override // android.os.Parcelable.Creator
        public final GeoPlaceWrapper createFromParcel(Parcel parcel) {
            return new GeoPlaceWrapper((GeoPlace) parcel.readParcelable(GeoPlaceWrapper.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GeoPlaceWrapper[] newArray(int i) {
            return new GeoPlaceWrapper[i];
        }
    }

    public GeoPlaceWrapper(GeoPlace geoPlace) {
        this.b = geoPlace;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GeoPlaceWrapper) && epx.f(this.b, ((GeoPlaceWrapper) obj).b);
    }

    @Override // com.vk.clips.sdk.shared.api.deps.dtos.SdkGeoPlace
    public final String getTitle() {
        return this.b.i;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "GeoPlaceWrapper(original=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
