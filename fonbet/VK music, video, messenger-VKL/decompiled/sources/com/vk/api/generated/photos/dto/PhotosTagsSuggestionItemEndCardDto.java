package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PhotosTagsSuggestionItemEndCardDto.kt */
/* loaded from: classes15.dex */
public final class PhotosTagsSuggestionItemEndCardDto implements Parcelable {
    public static final Parcelable.Creator<PhotosTagsSuggestionItemEndCardDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("subtitle")
    private final String subtitle;

    /* compiled from: PhotosTagsSuggestionItemEndCardDto.kt */
    public static final class a implements Parcelable.Creator<PhotosTagsSuggestionItemEndCardDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosTagsSuggestionItemEndCardDto createFromParcel(Parcel parcel) {
            return new PhotosTagsSuggestionItemEndCardDto(parcel.readString(), (BaseLinkButtonDto) parcel.readParcelable(PhotosTagsSuggestionItemEndCardDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosTagsSuggestionItemEndCardDto[] newArray(int i) {
            return new PhotosTagsSuggestionItemEndCardDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhotosTagsSuggestionItemEndCardDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosTagsSuggestionItemEndCardDto)) {
            return false;
        }
        PhotosTagsSuggestionItemEndCardDto photosTagsSuggestionItemEndCardDto = (PhotosTagsSuggestionItemEndCardDto) obj;
        return epx.f(this.subtitle, photosTagsSuggestionItemEndCardDto.subtitle) && epx.f(this.button, photosTagsSuggestionItemEndCardDto.button);
    }

    public final int hashCode() {
        String str = this.subtitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        return hashCode + (baseLinkButtonDto != null ? baseLinkButtonDto.hashCode() : 0);
    }

    public final String toString() {
        return "PhotosTagsSuggestionItemEndCardDto(subtitle=" + this.subtitle + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.button, i);
    }

    public PhotosTagsSuggestionItemEndCardDto(String str, BaseLinkButtonDto baseLinkButtonDto) {
        this.subtitle = str;
        this.button = baseLinkButtonDto;
    }

    public /* synthetic */ PhotosTagsSuggestionItemEndCardDto(String str, BaseLinkButtonDto baseLinkButtonDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : baseLinkButtonDto);
    }
}
