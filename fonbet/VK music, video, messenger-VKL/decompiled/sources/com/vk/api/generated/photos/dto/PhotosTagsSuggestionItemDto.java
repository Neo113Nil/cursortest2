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

/* compiled from: PhotosTagsSuggestionItemDto.kt */
/* loaded from: classes15.dex */
public final class PhotosTagsSuggestionItemDto implements Parcelable {
    public static final Parcelable.Creator<PhotosTagsSuggestionItemDto> CREATOR = new a();

    @pmi0("buttons")
    private final List<PhotosTagsSuggestionItemButtonDto> buttons;

    @pmi0("caption")
    private final String caption;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("tags")
    private final List<PhotosPhotoTagDto> tags;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final String type;

    @pmi0("web_view_token")
    private final String webViewToken;

    /* compiled from: PhotosTagsSuggestionItemDto.kt */
    public static final class a implements Parcelable.Creator<PhotosTagsSuggestionItemDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosTagsSuggestionItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(PhotosTagsSuggestionItemButtonDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) parcel.readParcelable(PhotosTagsSuggestionItemDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(PhotosPhotoTagDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new PhotosTagsSuggestionItemDto(readString, readString2, readString3, arrayList, photosPhotoDto, arrayList2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosTagsSuggestionItemDto[] newArray(int i) {
            return new PhotosTagsSuggestionItemDto[i];
        }
    }

    public PhotosTagsSuggestionItemDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosTagsSuggestionItemDto)) {
            return false;
        }
        PhotosTagsSuggestionItemDto photosTagsSuggestionItemDto = (PhotosTagsSuggestionItemDto) obj;
        return epx.f(this.title, photosTagsSuggestionItemDto.title) && epx.f(this.caption, photosTagsSuggestionItemDto.caption) && epx.f(this.type, photosTagsSuggestionItemDto.type) && epx.f(this.buttons, photosTagsSuggestionItemDto.buttons) && epx.f(this.photo, photosTagsSuggestionItemDto.photo) && epx.f(this.tags, photosTagsSuggestionItemDto.tags) && epx.f(this.trackCode, photosTagsSuggestionItemDto.trackCode) && epx.f(this.webViewToken, photosTagsSuggestionItemDto.webViewToken);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.caption;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<PhotosTagsSuggestionItemButtonDto> list = this.buttons;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode5 = (hashCode4 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        List<PhotosPhotoTagDto> list2 = this.tags;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.trackCode;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.webViewToken;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosTagsSuggestionItemDto(title=");
        sb.append(this.title);
        sb.append(", caption=");
        sb.append(this.caption);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", buttons=");
        sb.append(this.buttons);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", webViewToken=");
        return ho8.a(sb, this.webViewToken, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.caption);
        parcel.writeString(this.type);
        List<PhotosTagsSuggestionItemButtonDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((PhotosTagsSuggestionItemButtonDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.photo, i);
        List<PhotosPhotoTagDto> list2 = this.tags;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((PhotosPhotoTagDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.trackCode);
        parcel.writeString(this.webViewToken);
    }

    public PhotosTagsSuggestionItemDto(String str, String str2, String str3, List<PhotosTagsSuggestionItemButtonDto> list, PhotosPhotoDto photosPhotoDto, List<PhotosPhotoTagDto> list2, String str4, String str5) {
        this.title = str;
        this.caption = str2;
        this.type = str3;
        this.buttons = list;
        this.photo = photosPhotoDto;
        this.tags = list2;
        this.trackCode = str4;
        this.webViewToken = str5;
    }

    public /* synthetic */ PhotosTagsSuggestionItemDto(String str, String str2, String str3, List list, PhotosPhotoDto photosPhotoDto, List list2, String str4, String str5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : photosPhotoDto, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5);
    }
}
