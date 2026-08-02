package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PhotosGetEditorStickersResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhotosGetEditorStickersResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhotosGetEditorStickersResponseDto> CREATOR = new a();

    @pmi0("base_url")
    private final String baseUrl;

    @pmi0("disallowed_stickers_ids")
    private final List<Integer> disallowedStickersIds;

    @pmi0("sticker_ids")
    private final List<Integer> stickerIds;

    /* compiled from: PhotosGetEditorStickersResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhotosGetEditorStickersResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosGetEditorStickersResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = pm0.b(parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
            }
            return new PhotosGetEditorStickersResponseDto(readString, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosGetEditorStickersResponseDto[] newArray(int i) {
            return new PhotosGetEditorStickersResponseDto[i];
        }
    }

    public PhotosGetEditorStickersResponseDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetEditorStickersResponseDto)) {
            return false;
        }
        PhotosGetEditorStickersResponseDto photosGetEditorStickersResponseDto = (PhotosGetEditorStickersResponseDto) obj;
        return epx.f(this.baseUrl, photosGetEditorStickersResponseDto.baseUrl) && epx.f(this.stickerIds, photosGetEditorStickersResponseDto.stickerIds) && epx.f(this.disallowedStickersIds, photosGetEditorStickersResponseDto.disallowedStickersIds);
    }

    public final int hashCode() {
        String str = this.baseUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Integer> list = this.stickerIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.disallowedStickersIds;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosGetEditorStickersResponseDto(baseUrl=");
        sb.append(this.baseUrl);
        sb.append(", stickerIds=");
        sb.append(this.stickerIds);
        sb.append(", disallowedStickersIds=");
        return ms9.a(')', sb, this.disallowedStickersIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.baseUrl);
        List<Integer> list = this.stickerIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        List<Integer> list2 = this.disallowedStickersIds;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeInt(((Number) f2.next()).intValue());
        }
    }

    public PhotosGetEditorStickersResponseDto(String str, List<Integer> list, List<Integer> list2) {
        this.baseUrl = str;
        this.stickerIds = list;
        this.disallowedStickersIds = list2;
    }

    public /* synthetic */ PhotosGetEditorStickersResponseDto(String str, List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
