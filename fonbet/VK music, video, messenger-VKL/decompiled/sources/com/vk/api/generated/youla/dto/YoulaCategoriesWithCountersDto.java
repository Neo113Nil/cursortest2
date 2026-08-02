package com.vk.api.generated.youla.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: YoulaCategoriesWithCountersDto.kt */
/* loaded from: classes15.dex */
public final class YoulaCategoriesWithCountersDto implements Parcelable {
    public static final Parcelable.Creator<YoulaCategoriesWithCountersDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("last_photo_overlay")
    private final String lastPhotoOverlay;

    @pmi0("new_count")
    private final int newCount;

    @pmi0("photos")
    private final List<PhotosPhotoDto> photos;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("total_count")
    private final int totalCount;

    @pmi0("url")
    private final String url;

    /* compiled from: YoulaCategoriesWithCountersDto.kt */
    public static final class a implements Parcelable.Creator<YoulaCategoriesWithCountersDto> {
        @Override // android.os.Parcelable.Creator
        public final YoulaCategoriesWithCountersDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList = new ArrayList(readInt4);
                int i = 0;
                while (i != readInt4) {
                    i = bo.b(YoulaCategoriesWithCountersDto.class, parcel, arrayList, i, 1);
                }
            }
            return new YoulaCategoriesWithCountersDto(readInt, readString, readInt2, readInt3, readString2, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final YoulaCategoriesWithCountersDto[] newArray(int i) {
            return new YoulaCategoriesWithCountersDto[i];
        }
    }

    public YoulaCategoriesWithCountersDto(int i, String str, int i2, int i3, String str2, List<PhotosPhotoDto> list, String str3, String str4) {
        this.id = i;
        this.title = str;
        this.totalCount = i2;
        this.newCount = i3;
        this.url = str2;
        this.photos = list;
        this.lastPhotoOverlay = str3;
        this.subtitle = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YoulaCategoriesWithCountersDto)) {
            return false;
        }
        YoulaCategoriesWithCountersDto youlaCategoriesWithCountersDto = (YoulaCategoriesWithCountersDto) obj;
        return this.id == youlaCategoriesWithCountersDto.id && epx.f(this.title, youlaCategoriesWithCountersDto.title) && this.totalCount == youlaCategoriesWithCountersDto.totalCount && this.newCount == youlaCategoriesWithCountersDto.newCount && epx.f(this.url, youlaCategoriesWithCountersDto.url) && epx.f(this.photos, youlaCategoriesWithCountersDto.photos) && epx.f(this.lastPhotoOverlay, youlaCategoriesWithCountersDto.lastPhotoOverlay) && epx.f(this.subtitle, youlaCategoriesWithCountersDto.subtitle);
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.newCount, shy.a(this.totalCount, urd0.a(Integer.hashCode(this.id) * 31, 31, this.title), 31), 31), 31, this.url);
        List<PhotosPhotoDto> list = this.photos;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.lastPhotoOverlay;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YoulaCategoriesWithCountersDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", totalCount=");
        sb.append(this.totalCount);
        sb.append(", newCount=");
        sb.append(this.newCount);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", photos=");
        sb.append(this.photos);
        sb.append(", lastPhotoOverlay=");
        sb.append(this.lastPhotoOverlay);
        sb.append(", subtitle=");
        return ho8.a(sb, this.subtitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.totalCount);
        parcel.writeInt(this.newCount);
        parcel.writeString(this.url);
        List<PhotosPhotoDto> list = this.photos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.lastPhotoOverlay);
        parcel.writeString(this.subtitle);
    }

    public /* synthetic */ YoulaCategoriesWithCountersDto(int i, String str, int i2, int i3, String str2, List list, String str3, String str4, int i4, zcl zclVar) {
        this(i, str, i2, i3, str2, (i4 & 32) != 0 ? null : list, (i4 & 64) != 0 ? null : str3, (i4 & 128) != 0 ? null : str4);
    }
}
