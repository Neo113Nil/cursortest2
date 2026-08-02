package com.vk.media.filters.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.zcl;

/* compiled from: FilterItem.kt */
/* loaded from: classes3.dex */
public final class FilterItem implements Parcelable {
    public static final Parcelable.Creator<FilterItem> CREATOR = new a();
    public final FilterType b;
    public final float c;
    public final Correction d;
    public final Hsl e;
    public final boolean f;

    /* compiled from: FilterItem.kt */
    public static final class a implements Parcelable.Creator<FilterItem> {
        @Override // android.os.Parcelable.Creator
        public final FilterItem createFromParcel(Parcel parcel) {
            return new FilterItem(FilterType.valueOf(parcel.readString()), parcel.readFloat(), Correction.CREATOR.createFromParcel(parcel), Hsl.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final FilterItem[] newArray(int i) {
            return new FilterItem[i];
        }
    }

    public FilterItem() {
        this(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterItem)) {
            return false;
        }
        FilterItem filterItem = (FilterItem) obj;
        return this.b == filterItem.b && Float.compare(this.c, filterItem.c) == 0 && epx.f(this.d, filterItem.d) && epx.f(this.e, filterItem.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + b.a(this.c, this.b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "FilterItem(filterType=" + this.b + ", filterIntensity=" + this.c + ", corrections=" + this.d + ", hsl=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeFloat(this.c);
        this.d.writeToParcel(parcel, i);
        this.e.writeToParcel(parcel, i);
    }

    public FilterItem(FilterType filterType, float f, Correction correction, Hsl hsl) {
        this.b = filterType;
        this.c = f;
        this.d = correction;
        this.e = hsl;
        this.f = correction.n || hsl.j || !(filterType == FilterType.NONE || f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public /* synthetic */ FilterItem(FilterType filterType, float f, Correction correction, Hsl hsl, int i, zcl zclVar) {
        this((i & 1) != 0 ? FilterType.NONE : filterType, (i & 2) != 0 ? 1.0f : f, (i & 4) != 0 ? new Correction(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null) : correction, (i & 8) != 0 ? new Hsl(null, null, null, null, null, null, null, null, 255, null) : hsl);
    }
}
