package com.vk.api.generated.textlives.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: TextlivesTextlivePreviewDto.kt */
/* loaded from: classes15.dex */
public final class TextlivesTextlivePreviewDto implements Parcelable {
    public static final Parcelable.Creator<TextlivesTextlivePreviewDto> CREATOR = new a();

    @pmi0("cover_photo")
    private final PhotosPhotoDto coverPhoto;

    @pmi0("date")
    private final int date;

    @pmi0("textlive_id")
    private final int textliveId;

    @pmi0("textposts_count")
    private final int textpostsCount;

    @pmi0("title")
    private final String title;

    @pmi0("views_count")
    private final int viewsCount;

    /* compiled from: TextlivesTextlivePreviewDto.kt */
    public static final class a implements Parcelable.Creator<TextlivesTextlivePreviewDto> {
        @Override // android.os.Parcelable.Creator
        public final TextlivesTextlivePreviewDto createFromParcel(Parcel parcel) {
            return new TextlivesTextlivePreviewDto(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (PhotosPhotoDto) parcel.readParcelable(TextlivesTextlivePreviewDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TextlivesTextlivePreviewDto[] newArray(int i) {
            return new TextlivesTextlivePreviewDto[i];
        }
    }

    public TextlivesTextlivePreviewDto(int i, String str, int i2, int i3, int i4, PhotosPhotoDto photosPhotoDto) {
        this.textliveId = i;
        this.title = str;
        this.viewsCount = i2;
        this.textpostsCount = i3;
        this.date = i4;
        this.coverPhoto = photosPhotoDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextlivesTextlivePreviewDto)) {
            return false;
        }
        TextlivesTextlivePreviewDto textlivesTextlivePreviewDto = (TextlivesTextlivePreviewDto) obj;
        return this.textliveId == textlivesTextlivePreviewDto.textliveId && epx.f(this.title, textlivesTextlivePreviewDto.title) && this.viewsCount == textlivesTextlivePreviewDto.viewsCount && this.textpostsCount == textlivesTextlivePreviewDto.textpostsCount && this.date == textlivesTextlivePreviewDto.date && epx.f(this.coverPhoto, textlivesTextlivePreviewDto.coverPhoto);
    }

    public final int hashCode() {
        int a2 = shy.a(this.date, shy.a(this.textpostsCount, shy.a(this.viewsCount, urd0.a(Integer.hashCode(this.textliveId) * 31, 31, this.title), 31), 31), 31);
        PhotosPhotoDto photosPhotoDto = this.coverPhoto;
        return a2 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode());
    }

    public final String toString() {
        return "TextlivesTextlivePreviewDto(textliveId=" + this.textliveId + ", title=" + this.title + ", viewsCount=" + this.viewsCount + ", textpostsCount=" + this.textpostsCount + ", date=" + this.date + ", coverPhoto=" + this.coverPhoto + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.textliveId);
        parcel.writeString(this.title);
        parcel.writeInt(this.viewsCount);
        parcel.writeInt(this.textpostsCount);
        parcel.writeInt(this.date);
        parcel.writeParcelable(this.coverPhoto, i);
    }

    public /* synthetic */ TextlivesTextlivePreviewDto(int i, String str, int i2, int i3, int i4, PhotosPhotoDto photosPhotoDto, int i5, zcl zclVar) {
        this(i, str, i2, i3, i4, (i5 & 32) != 0 ? null : photosPhotoDto);
    }
}
