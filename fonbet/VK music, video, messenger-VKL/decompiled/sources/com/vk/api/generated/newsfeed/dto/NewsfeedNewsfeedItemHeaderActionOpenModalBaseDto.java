package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto> CREATOR = new a();

    @pmi0("button")
    private final NewsfeedNewsfeedItemHeaderButtonDto button;

    @pmi0("image")
    private final NewsfeedNewsfeedItemHeaderImageDto image;

    @pmi0("overlay_image")
    private final NewsfeedNewsfeedItemHeaderImageDto overlayImage;

    @pmi0("text")
    private final NewsfeedNewsfeedItemHeaderTextDto text;

    @pmi0("title")
    private final String title;

    /* compiled from: NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto createFromParcel(Parcel parcel) {
            return new NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto(parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderImageDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderImageDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderTextDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderButtonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto[] newArray(int i) {
            return new NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto[i];
        }
    }

    public NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final NewsfeedNewsfeedItemHeaderButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final NewsfeedNewsfeedItemHeaderImageDto e() {
        return this.image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto newsfeedNewsfeedItemHeaderActionOpenModalBaseDto = (NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto) obj;
        return epx.f(this.image, newsfeedNewsfeedItemHeaderActionOpenModalBaseDto.image) && epx.f(this.overlayImage, newsfeedNewsfeedItemHeaderActionOpenModalBaseDto.overlayImage) && epx.f(this.title, newsfeedNewsfeedItemHeaderActionOpenModalBaseDto.title) && epx.f(this.text, newsfeedNewsfeedItemHeaderActionOpenModalBaseDto.text) && epx.f(this.button, newsfeedNewsfeedItemHeaderActionOpenModalBaseDto.button);
    }

    public final NewsfeedNewsfeedItemHeaderImageDto f() {
        return this.overlayImage;
    }

    public final NewsfeedNewsfeedItemHeaderTextDto g() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.image;
        int hashCode = (newsfeedNewsfeedItemHeaderImageDto == null ? 0 : newsfeedNewsfeedItemHeaderImageDto.hashCode()) * 31;
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto2 = this.overlayImage;
        int hashCode2 = (hashCode + (newsfeedNewsfeedItemHeaderImageDto2 == null ? 0 : newsfeedNewsfeedItemHeaderImageDto2.hashCode())) * 31;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto = this.text;
        int hashCode4 = (hashCode3 + (newsfeedNewsfeedItemHeaderTextDto == null ? 0 : newsfeedNewsfeedItemHeaderTextDto.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderButtonDto newsfeedNewsfeedItemHeaderButtonDto = this.button;
        return hashCode4 + (newsfeedNewsfeedItemHeaderButtonDto != null ? newsfeedNewsfeedItemHeaderButtonDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto(image=" + this.image + ", overlayImage=" + this.overlayImage + ", title=" + this.title + ", text=" + this.text + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.image;
        if (newsfeedNewsfeedItemHeaderImageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderImageDto.writeToParcel(parcel, i);
        }
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto2 = this.overlayImage;
        if (newsfeedNewsfeedItemHeaderImageDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderImageDto2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto = this.text;
        if (newsfeedNewsfeedItemHeaderTextDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderTextDto.writeToParcel(parcel, i);
        }
        NewsfeedNewsfeedItemHeaderButtonDto newsfeedNewsfeedItemHeaderButtonDto = this.button;
        if (newsfeedNewsfeedItemHeaderButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderButtonDto.writeToParcel(parcel, i);
        }
    }

    public NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto(NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto2, String str, NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, NewsfeedNewsfeedItemHeaderButtonDto newsfeedNewsfeedItemHeaderButtonDto) {
        this.image = newsfeedNewsfeedItemHeaderImageDto;
        this.overlayImage = newsfeedNewsfeedItemHeaderImageDto2;
        this.title = str;
        this.text = newsfeedNewsfeedItemHeaderTextDto;
        this.button = newsfeedNewsfeedItemHeaderButtonDto;
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto(NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto2, String str, NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, NewsfeedNewsfeedItemHeaderButtonDto newsfeedNewsfeedItemHeaderButtonDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : newsfeedNewsfeedItemHeaderImageDto, (i & 2) != 0 ? null : newsfeedNewsfeedItemHeaderImageDto2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : newsfeedNewsfeedItemHeaderTextDto, (i & 16) != 0 ? null : newsfeedNewsfeedItemHeaderButtonDto);
    }
}
