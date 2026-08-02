package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PhotosGetEditorDataResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhotosGetEditorDataResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhotosGetEditorDataResponseDto> CREATOR = new a();

    @pmi0("backgrounds")
    private final PhotosEditorBackgroundsDto backgrounds;

    @pmi0("stickers")
    private final List<PhotosStickerGroupItemDto> stickers;

    @pmi0("storySaveHash")
    private final String storySaveHash;

    @pmi0("storyUploadUrlHash")
    private final String storyUploadUrlHash;

    /* compiled from: PhotosGetEditorDataResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhotosGetEditorDataResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosGetEditorDataResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            PhotosEditorBackgroundsDto createFromParcel = parcel.readInt() == 0 ? null : PhotosEditorBackgroundsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(PhotosStickerGroupItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new PhotosGetEditorDataResponseDto(createFromParcel, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosGetEditorDataResponseDto[] newArray(int i) {
            return new PhotosGetEditorDataResponseDto[i];
        }
    }

    public PhotosGetEditorDataResponseDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetEditorDataResponseDto)) {
            return false;
        }
        PhotosGetEditorDataResponseDto photosGetEditorDataResponseDto = (PhotosGetEditorDataResponseDto) obj;
        return epx.f(this.backgrounds, photosGetEditorDataResponseDto.backgrounds) && epx.f(this.stickers, photosGetEditorDataResponseDto.stickers) && epx.f(this.storyUploadUrlHash, photosGetEditorDataResponseDto.storyUploadUrlHash) && epx.f(this.storySaveHash, photosGetEditorDataResponseDto.storySaveHash);
    }

    public final int hashCode() {
        PhotosEditorBackgroundsDto photosEditorBackgroundsDto = this.backgrounds;
        int hashCode = (photosEditorBackgroundsDto == null ? 0 : photosEditorBackgroundsDto.hashCode()) * 31;
        List<PhotosStickerGroupItemDto> list = this.stickers;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.storyUploadUrlHash;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.storySaveHash;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosGetEditorDataResponseDto(backgrounds=");
        sb.append(this.backgrounds);
        sb.append(", stickers=");
        sb.append(this.stickers);
        sb.append(", storyUploadUrlHash=");
        sb.append(this.storyUploadUrlHash);
        sb.append(", storySaveHash=");
        return ho8.a(sb, this.storySaveHash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PhotosEditorBackgroundsDto photosEditorBackgroundsDto = this.backgrounds;
        if (photosEditorBackgroundsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photosEditorBackgroundsDto.writeToParcel(parcel, i);
        }
        List<PhotosStickerGroupItemDto> list = this.stickers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((PhotosStickerGroupItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.storyUploadUrlHash);
        parcel.writeString(this.storySaveHash);
    }

    public PhotosGetEditorDataResponseDto(PhotosEditorBackgroundsDto photosEditorBackgroundsDto, List<PhotosStickerGroupItemDto> list, String str, String str2) {
        this.backgrounds = photosEditorBackgroundsDto;
        this.stickers = list;
        this.storyUploadUrlHash = str;
        this.storySaveHash = str2;
    }

    public /* synthetic */ PhotosGetEditorDataResponseDto(PhotosEditorBackgroundsDto photosEditorBackgroundsDto, List list, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : photosEditorBackgroundsDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
