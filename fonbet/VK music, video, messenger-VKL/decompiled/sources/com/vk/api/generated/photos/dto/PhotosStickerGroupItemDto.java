package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PhotosStickerGroupItemDto.kt */
/* loaded from: classes15.dex */
public final class PhotosStickerGroupItemDto implements Parcelable {
    public static final Parcelable.Creator<PhotosStickerGroupItemDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("items")
    private final List<PhotosStickerItemDto> items;

    @pmi0("title")
    private final String title;

    /* compiled from: PhotosStickerGroupItemDto.kt */
    public static final class a implements Parcelable.Creator<PhotosStickerGroupItemDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosStickerGroupItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(PhotosStickerItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new PhotosStickerGroupItemDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosStickerGroupItemDto[] newArray(int i) {
            return new PhotosStickerGroupItemDto[i];
        }
    }

    public PhotosStickerGroupItemDto() {
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
        if (!(obj instanceof PhotosStickerGroupItemDto)) {
            return false;
        }
        PhotosStickerGroupItemDto photosStickerGroupItemDto = (PhotosStickerGroupItemDto) obj;
        return epx.f(this.id, photosStickerGroupItemDto.id) && epx.f(this.title, photosStickerGroupItemDto.title) && epx.f(this.items, photosStickerGroupItemDto.items);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PhotosStickerItemDto> list = this.items;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosStickerGroupItemDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        List<PhotosStickerItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((PhotosStickerItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public PhotosStickerGroupItemDto(String str, String str2, List<PhotosStickerItemDto> list) {
        this.id = str;
        this.title = str2;
        this.items = list;
    }

    public /* synthetic */ PhotosStickerGroupItemDto(String str, String str2, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
