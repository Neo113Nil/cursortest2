package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallPostSourceDto.kt */
/* loaded from: classes15.dex */
public final class WallPostSourceDto implements Parcelable {
    public static final Parcelable.Creator<WallPostSourceDto> CREATOR = new a();

    @pmi0("data")
    private final String data;

    @pmi0("link")
    private final BaseLinkDto link;

    @pmi0("platform")
    private final String platform;

    @pmi0("type")
    private final WallPostSourceTypeDto type;

    @pmi0("url")
    private final String url;

    /* compiled from: WallPostSourceDto.kt */
    public static final class a implements Parcelable.Creator<WallPostSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostSourceDto createFromParcel(Parcel parcel) {
            return new WallPostSourceDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : WallPostSourceTypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), (BaseLinkDto) parcel.readParcelable(WallPostSourceDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostSourceDto[] newArray(int i) {
            return new WallPostSourceDto[i];
        }
    }

    public WallPostSourceDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final String d() {
        return this.data;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostSourceDto)) {
            return false;
        }
        WallPostSourceDto wallPostSourceDto = (WallPostSourceDto) obj;
        return epx.f(this.data, wallPostSourceDto.data) && epx.f(this.platform, wallPostSourceDto.platform) && this.type == wallPostSourceDto.type && epx.f(this.url, wallPostSourceDto.url) && epx.f(this.link, wallPostSourceDto.link);
    }

    public final int hashCode() {
        String str = this.data;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.platform;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        WallPostSourceTypeDto wallPostSourceTypeDto = this.type;
        int hashCode3 = (hashCode2 + (wallPostSourceTypeDto == null ? 0 : wallPostSourceTypeDto.hashCode())) * 31;
        String str3 = this.url;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BaseLinkDto baseLinkDto = this.link;
        return hashCode4 + (baseLinkDto != null ? baseLinkDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallPostSourceDto(data=" + this.data + ", platform=" + this.platform + ", type=" + this.type + ", url=" + this.url + ", link=" + this.link + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.data);
        parcel.writeString(this.platform);
        WallPostSourceTypeDto wallPostSourceTypeDto = this.type;
        if (wallPostSourceTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostSourceTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.url);
        parcel.writeParcelable(this.link, i);
    }

    public WallPostSourceDto(String str, String str2, WallPostSourceTypeDto wallPostSourceTypeDto, String str3, BaseLinkDto baseLinkDto) {
        this.data = str;
        this.platform = str2;
        this.type = wallPostSourceTypeDto;
        this.url = str3;
        this.link = baseLinkDto;
    }

    public /* synthetic */ WallPostSourceDto(String str, String str2, WallPostSourceTypeDto wallPostSourceTypeDto, String str3, BaseLinkDto baseLinkDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : wallPostSourceTypeDto, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : baseLinkDto);
    }
}
