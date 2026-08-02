package com.vk.dto.clips.filters;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.clips.ClipItemFilterType;
import com.vk.dto.clips.filters.HslInfo;
import com.vk.media.filters.model.Correction;
import com.vk.media.filters.model.FilterItem;
import com.vk.media.filters.model.FilterType;
import com.vk.media.filters.model.Hsl;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.bxx;
import xsna.epx;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: FilterInfo.kt */
/* loaded from: classes18.dex */
public final class FilterInfo implements Parcelable, bxx {
    public static final Parcelable.Creator<FilterInfo> CREATOR = new b();
    public final ClipItemFilterType b;
    public final float c;
    public final CorrectionsInfo d;
    public final HslInfo e;
    public final boolean f;

    /* compiled from: FilterInfo.kt */
    public static final class a {
        public static FilterInfo a(JSONObject jSONObject) {
            ClipItemFilterType.a aVar = ClipItemFilterType.Companion;
            String optString = jSONObject.optString("filter");
            if (optString == null) {
                optString = "";
            }
            aVar.getClass();
            ClipItemFilterType a = ClipItemFilterType.a.a(optString);
            float optDouble = (float) jSONObject.optDouble("filter_intensity", 1.0d);
            JSONObject optJSONObject = jSONObject.optJSONObject("corrections");
            CorrectionsInfo correctionsInfo = optJSONObject != null ? new CorrectionsInfo((float) optJSONObject.optDouble("exposure", 0.5d), (float) optJSONObject.optDouble("brightness", 0.5d), (float) optJSONObject.optDouble("contrast", 0.5d), (float) optJSONObject.optDouble("saturation", 0.5d), (float) optJSONObject.optDouble("temperature", 0.5d), (float) optJSONObject.optDouble("shadow", ConnectivityTracker.DEFAULT_UPLINK_BITRATE), (float) optJSONObject.optDouble("highlight", ConnectivityTracker.DEFAULT_UPLINK_BITRATE), (float) optJSONObject.optDouble("sharpness", 0.5d), (float) optJSONObject.optDouble("grain", ConnectivityTracker.DEFAULT_UPLINK_BITRATE), (float) optJSONObject.optDouble("blur", ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) : new CorrectionsInfo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("hsl");
            return new FilterInfo(a, optDouble, correctionsInfo, optJSONObject2 != null ? new HslInfo(HslInfo.a.a("red", optJSONObject2), HslInfo.a.a("orange", optJSONObject2), HslInfo.a.a("yellow", optJSONObject2), HslInfo.a.a("green", optJSONObject2), HslInfo.a.a("cyan", optJSONObject2), HslInfo.a.a("blue", optJSONObject2), HslInfo.a.a("purple", optJSONObject2), HslInfo.a.a("magenta", optJSONObject2)) : new HslInfo(null, null, null, null, null, null, null, null, 255, null));
        }
    }

    /* compiled from: FilterInfo.kt */
    public static final class b implements Parcelable.Creator<FilterInfo> {
        @Override // android.os.Parcelable.Creator
        public final FilterInfo createFromParcel(Parcel parcel) {
            return new FilterInfo(ClipItemFilterType.valueOf(parcel.readString()), parcel.readFloat(), CorrectionsInfo.CREATOR.createFromParcel(parcel), HslInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final FilterInfo[] newArray(int i) {
            return new FilterInfo[i];
        }
    }

    public FilterInfo() {
        this(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 15, null);
    }

    public static FilterInfo a(FilterInfo filterInfo, ClipItemFilterType clipItemFilterType, float f, CorrectionsInfo correctionsInfo, HslInfo hslInfo, int i) {
        if ((i & 1) != 0) {
            clipItemFilterType = filterInfo.b;
        }
        if ((i & 2) != 0) {
            f = filterInfo.c;
        }
        if ((i & 4) != 0) {
            correctionsInfo = filterInfo.d;
        }
        if ((i & 8) != 0) {
            hslInfo = filterInfo.e;
        }
        filterInfo.getClass();
        return new FilterInfo(clipItemFilterType, f, correctionsInfo, hslInfo);
    }

    public final FilterItem d() {
        FilterType i = this.b.i();
        CorrectionsInfo correctionsInfo = this.d;
        Correction correction = new Correction(correctionsInfo.b, correctionsInfo.c, correctionsInfo.d, correctionsInfo.e, correctionsInfo.f, correctionsInfo.g, correctionsInfo.h, correctionsInfo.i, correctionsInfo.j, correctionsInfo.k);
        HslInfo hslInfo = this.e;
        hslInfo.getClass();
        return new FilterItem(i, this.c, correction, new Hsl(HslInfo.b(hslInfo.b), HslInfo.b(hslInfo.c), HslInfo.b(hslInfo.d), HslInfo.b(hslInfo.e), HslInfo.b(hslInfo.f), HslInfo.b(hslInfo.g), HslInfo.b(hslInfo.h), HslInfo.b(hslInfo.i)));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b.name(), "filter");
        w9yVar.f("filter_intensity", Double.valueOf(this.c));
        w9yVar.g("corrections", this.d);
        w9yVar.g("hsl", this.e);
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterInfo)) {
            return false;
        }
        FilterInfo filterInfo = (FilterInfo) obj;
        return this.b == filterInfo.b && Float.compare(this.c, filterInfo.c) == 0 && epx.f(this.d, filterInfo.d) && epx.f(this.e, filterInfo.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.c, this.b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "FilterInfo(filter=" + this.b + ", filterIntensity=" + this.c + ", corrections=" + this.d + ", hsl=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeFloat(this.c);
        this.d.writeToParcel(parcel, i);
        this.e.writeToParcel(parcel, i);
    }

    public FilterInfo(ClipItemFilterType clipItemFilterType, float f, CorrectionsInfo correctionsInfo, HslInfo hslInfo) {
        this.b = clipItemFilterType;
        this.c = f;
        this.d = correctionsInfo;
        this.e = hslInfo;
        this.f = correctionsInfo.l || hslInfo.j || !(clipItemFilterType == ClipItemFilterType.NONE || f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public /* synthetic */ FilterInfo(ClipItemFilterType clipItemFilterType, float f, CorrectionsInfo correctionsInfo, HslInfo hslInfo, int i, zcl zclVar) {
        this((i & 1) != 0 ? ClipItemFilterType.NONE : clipItemFilterType, (i & 2) != 0 ? 1.0f : f, (i & 4) != 0 ? new CorrectionsInfo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null) : correctionsInfo, (i & 8) != 0 ? new HslInfo(null, null, null, null, null, null, null, null, 255, null) : hslInfo);
    }
}
