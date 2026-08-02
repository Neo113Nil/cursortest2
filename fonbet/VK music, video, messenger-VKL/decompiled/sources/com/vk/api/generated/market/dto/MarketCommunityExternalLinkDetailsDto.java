package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketCommunityExternalLinkDetailsDto.kt */
/* loaded from: classes15.dex */
public final class MarketCommunityExternalLinkDetailsDto implements Parcelable {
    public static final Parcelable.Creator<MarketCommunityExternalLinkDetailsDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("icon")
    private final BaseImageDto icon;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketCommunityExternalLinkDetailsDto.kt */
    public static final class a implements Parcelable.Creator<MarketCommunityExternalLinkDetailsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCommunityExternalLinkDetailsDto createFromParcel(Parcel parcel) {
            return new MarketCommunityExternalLinkDetailsDto(parcel.readString(), parcel.readString(), (BaseImageDto) parcel.readParcelable(MarketCommunityExternalLinkDetailsDto.class.getClassLoader()), (BaseLinkButtonDto) parcel.readParcelable(MarketCommunityExternalLinkDetailsDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCommunityExternalLinkDetailsDto[] newArray(int i) {
            return new MarketCommunityExternalLinkDetailsDto[i];
        }
    }

    public MarketCommunityExternalLinkDetailsDto(String str, String str2, BaseImageDto baseImageDto, BaseLinkButtonDto baseLinkButtonDto) {
        this.title = str;
        this.text = str2;
        this.icon = baseImageDto;
        this.button = baseLinkButtonDto;
    }

    public final BaseLinkButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseImageDto e() {
        return this.icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCommunityExternalLinkDetailsDto)) {
            return false;
        }
        MarketCommunityExternalLinkDetailsDto marketCommunityExternalLinkDetailsDto = (MarketCommunityExternalLinkDetailsDto) obj;
        return epx.f(this.title, marketCommunityExternalLinkDetailsDto.title) && epx.f(this.text, marketCommunityExternalLinkDetailsDto.text) && epx.f(this.icon, marketCommunityExternalLinkDetailsDto.icon) && epx.f(this.button, marketCommunityExternalLinkDetailsDto.button);
    }

    public final String f() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.icon.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.text)) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        return hashCode + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode());
    }

    public final String toString() {
        return "MarketCommunityExternalLinkDetailsDto(title=" + this.title + ", text=" + this.text + ", icon=" + this.icon + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.icon, i);
        parcel.writeParcelable(this.button, i);
    }

    public /* synthetic */ MarketCommunityExternalLinkDetailsDto(String str, String str2, BaseImageDto baseImageDto, BaseLinkButtonDto baseLinkButtonDto, int i, zcl zclVar) {
        this(str, str2, baseImageDto, (i & 8) != 0 ? null : baseLinkButtonDto);
    }
}
