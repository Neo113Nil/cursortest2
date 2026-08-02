package com.vk.superapp.api.dto.ad;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import xsna.epx;

/* compiled from: AdInfo.kt */
/* loaded from: classes6.dex */
public final class AdInfo implements Parcelable {
    public static final Parcelable.Creator<AdInfo> CREATOR = new a();
    public final String b;
    public final WebAction c;

    /* compiled from: AdInfo.kt */
    public static final class a implements Parcelable.Creator<AdInfo> {
        @Override // android.os.Parcelable.Creator
        public final AdInfo createFromParcel(Parcel parcel) {
            return new AdInfo(parcel.readString(), (WebAction) parcel.readParcelable(AdInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdInfo[] newArray(int i) {
            return new AdInfo[i];
        }
    }

    public AdInfo(String str, WebAction webAction) {
        this.b = str;
        this.c = webAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdInfo)) {
            return false;
        }
        AdInfo adInfo = (AdInfo) obj;
        return epx.f(this.b, adInfo.b) && epx.f(this.c, adInfo.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "AdInfo(erid=" + this.b + ", about=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
