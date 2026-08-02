package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketProfileInfoCreateButtonDto.kt */
/* loaded from: classes15.dex */
public final class MarketProfileInfoCreateButtonDto implements Parcelable {
    public static final Parcelable.Creator<MarketProfileInfoCreateButtonDto> CREATOR = new a();

    @pmi0("miniapp_url")
    private final String miniappUrl;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketProfileInfoCreateButtonDto.kt */
    public static final class a implements Parcelable.Creator<MarketProfileInfoCreateButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketProfileInfoCreateButtonDto createFromParcel(Parcel parcel) {
            return new MarketProfileInfoCreateButtonDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketProfileInfoCreateButtonDto[] newArray(int i) {
            return new MarketProfileInfoCreateButtonDto[i];
        }
    }

    public MarketProfileInfoCreateButtonDto(String str, String str2) {
        this.miniappUrl = str;
        this.title = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketProfileInfoCreateButtonDto)) {
            return false;
        }
        MarketProfileInfoCreateButtonDto marketProfileInfoCreateButtonDto = (MarketProfileInfoCreateButtonDto) obj;
        return epx.f(this.miniappUrl, marketProfileInfoCreateButtonDto.miniappUrl) && epx.f(this.title, marketProfileInfoCreateButtonDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (this.miniappUrl.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketProfileInfoCreateButtonDto(miniappUrl=");
        sb.append(this.miniappUrl);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.miniappUrl);
        parcel.writeString(this.title);
    }
}
