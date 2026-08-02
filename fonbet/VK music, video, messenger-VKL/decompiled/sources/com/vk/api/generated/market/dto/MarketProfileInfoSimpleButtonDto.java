package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MarketProfileInfoSimpleButtonDto.kt */
/* loaded from: classes15.dex */
public final class MarketProfileInfoSimpleButtonDto implements Parcelable {
    public static final Parcelable.Creator<MarketProfileInfoSimpleButtonDto> CREATOR = new a();

    @pmi0("badge")
    private final String badge;

    @pmi0("show_notification_dot")
    private final Boolean showNotificationDot;

    @pmi0("url")
    private final String url;

    /* compiled from: MarketProfileInfoSimpleButtonDto.kt */
    public static final class a implements Parcelable.Creator<MarketProfileInfoSimpleButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketProfileInfoSimpleButtonDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketProfileInfoSimpleButtonDto(readString, readString2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketProfileInfoSimpleButtonDto[] newArray(int i) {
            return new MarketProfileInfoSimpleButtonDto[i];
        }
    }

    public MarketProfileInfoSimpleButtonDto(String str, String str2, Boolean bool) {
        this.url = str;
        this.badge = str2;
        this.showNotificationDot = bool;
    }

    public final String d() {
        return this.badge;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.showNotificationDot;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketProfileInfoSimpleButtonDto)) {
            return false;
        }
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto = (MarketProfileInfoSimpleButtonDto) obj;
        return epx.f(this.url, marketProfileInfoSimpleButtonDto.url) && epx.f(this.badge, marketProfileInfoSimpleButtonDto.badge) && epx.f(this.showNotificationDot, marketProfileInfoSimpleButtonDto.showNotificationDot);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        String str = this.badge;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.showNotificationDot;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketProfileInfoSimpleButtonDto(url=");
        sb.append(this.url);
        sb.append(", badge=");
        sb.append(this.badge);
        sb.append(", showNotificationDot=");
        return tn.a(sb, this.showNotificationDot, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeString(this.badge);
        Boolean bool = this.showNotificationDot;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MarketProfileInfoSimpleButtonDto(String str, String str2, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool);
    }
}
