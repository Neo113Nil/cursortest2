package com.vk.search.params.api;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: SearchParamsWithCity.kt */
/* loaded from: classes5.dex */
public abstract class SearchParamsWithCity implements SearchParams {
    public City b;

    public /* synthetic */ SearchParamsWithCity(zcl zclVar) {
        this();
    }

    @Override // com.vk.search.params.api.SearchParams
    public boolean I() {
        return d() == 0;
    }

    public final int d() {
        City city = this.b;
        if (city != null) {
            return city.b;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchParamsWithCity) && d() == ((SearchParamsWithCity) obj).d();
    }

    @Override // com.vk.search.params.api.SearchParams
    public <T extends SearchParams> void h5(T t) {
        if (t instanceof SearchParamsWithCity) {
            this.b = ((SearchParamsWithCity) t).b;
        }
    }

    public int hashCode() {
        return d();
    }

    @Override // com.vk.search.params.api.SearchParams
    public void reset() {
        this.b = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public SearchParamsWithCity() {
    }
}
