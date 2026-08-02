package com.vk.geo.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: GeoFragmentOptions.kt */
/* loaded from: classes18.dex */
public final class GeoFragmentOptions implements Parcelable {
    public static final a CREATOR = new a();
    public boolean b = true;
    public boolean c;
    public boolean d;
    public Double e;
    public Double f;
    public Float g;
    public boolean h;

    /* compiled from: GeoFragmentOptions.kt */
    public static final class a implements Parcelable.Creator<GeoFragmentOptions> {
        @Override // android.os.Parcelable.Creator
        public final GeoFragmentOptions createFromParcel(Parcel parcel) {
            GeoFragmentOptions geoFragmentOptions = new GeoFragmentOptions();
            geoFragmentOptions.b = parcel.readByte() != 0;
            geoFragmentOptions.c = parcel.readByte() != 0;
            geoFragmentOptions.d = parcel.readByte() != 0;
            double readDouble = parcel.readDouble();
            Double valueOf = Double.valueOf(readDouble);
            if (readDouble == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                valueOf = null;
            }
            geoFragmentOptions.e = valueOf;
            double readDouble2 = parcel.readDouble();
            Double valueOf2 = Double.valueOf(readDouble2);
            if (readDouble2 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                valueOf2 = null;
            }
            geoFragmentOptions.f = valueOf2;
            float readFloat = parcel.readFloat();
            geoFragmentOptions.g = readFloat != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.valueOf(readFloat) : null;
            geoFragmentOptions.h = parcel.readByte() != 0;
            return geoFragmentOptions;
        }

        @Override // android.os.Parcelable.Creator
        public final GeoFragmentOptions[] newArray(int i) {
            return new GeoFragmentOptions[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        Double d = this.e;
        double d2 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        parcel.writeDouble(d != null ? d.doubleValue() : 0.0d);
        Double d3 = this.f;
        if (d3 != null) {
            d2 = d3.doubleValue();
        }
        parcel.writeDouble(d2);
        Float f = this.g;
        parcel.writeFloat(f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
    }
}
