package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.L2;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PhotosEditorBackgroundItemDto.kt */
/* loaded from: classes15.dex */
public final class PhotosEditorBackgroundItemDto implements Parcelable {
    public static final Parcelable.Creator<PhotosEditorBackgroundItemDto> CREATOR = new a();

    @pmi0(L2.g)
    private final String background;

    @pmi0("background_name")
    private final String backgroundName;

    @pmi0("id")
    private final Integer id;

    @pmi0("preview")
    private final String preview;

    @pmi0("url")
    private final String url;

    /* compiled from: PhotosEditorBackgroundItemDto.kt */
    public static final class a implements Parcelable.Creator<PhotosEditorBackgroundItemDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosEditorBackgroundItemDto createFromParcel(Parcel parcel) {
            return new PhotosEditorBackgroundItemDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosEditorBackgroundItemDto[] newArray(int i) {
            return new PhotosEditorBackgroundItemDto[i];
        }
    }

    public PhotosEditorBackgroundItemDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosEditorBackgroundItemDto)) {
            return false;
        }
        PhotosEditorBackgroundItemDto photosEditorBackgroundItemDto = (PhotosEditorBackgroundItemDto) obj;
        return epx.f(this.background, photosEditorBackgroundItemDto.background) && epx.f(this.backgroundName, photosEditorBackgroundItemDto.backgroundName) && epx.f(this.id, photosEditorBackgroundItemDto.id) && epx.f(this.preview, photosEditorBackgroundItemDto.preview) && epx.f(this.url, photosEditorBackgroundItemDto.url);
    }

    public final int hashCode() {
        String str = this.background;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backgroundName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.id;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.preview;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosEditorBackgroundItemDto(background=");
        sb.append(this.background);
        sb.append(", backgroundName=");
        sb.append(this.backgroundName);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", preview=");
        sb.append(this.preview);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.background);
        parcel.writeString(this.backgroundName);
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.preview);
        parcel.writeString(this.url);
    }

    public PhotosEditorBackgroundItemDto(String str, String str2, Integer num, String str3, String str4) {
        this.background = str;
        this.backgroundName = str2;
        this.id = num;
        this.preview = str3;
        this.url = str4;
    }

    public /* synthetic */ PhotosEditorBackgroundItemDto(String str, String str2, Integer num, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
