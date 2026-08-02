package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: StickersCatalogBannerDto.kt */
/* loaded from: classes15.dex */
public final class StickersCatalogBannerDto implements Parcelable {
    public static final Parcelable.Creator<StickersCatalogBannerDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("url")
    private final String url;

    /* compiled from: StickersCatalogBannerDto.kt */
    public static final class a implements Parcelable.Creator<StickersCatalogBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersCatalogBannerDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(StickersCatalogBannerDto.class, parcel, arrayList, i, 1);
            }
            return new StickersCatalogBannerDto(readInt, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersCatalogBannerDto[] newArray(int i) {
            return new StickersCatalogBannerDto[i];
        }
    }

    public StickersCatalogBannerDto(int i, String str, List<BaseImageDto> list) {
        this.id = i;
        this.url = str;
        this.images = list;
    }

    public final List<BaseImageDto> d() {
        return this.images;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersCatalogBannerDto)) {
            return false;
        }
        StickersCatalogBannerDto stickersCatalogBannerDto = (StickersCatalogBannerDto) obj;
        return this.id == stickersCatalogBannerDto.id && epx.f(this.url, stickersCatalogBannerDto.url) && epx.f(this.images, stickersCatalogBannerDto.images);
    }

    public final int getId() {
        return this.id;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.images.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.url);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersCatalogBannerDto(id=");
        sb.append(this.id);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", images=");
        return ms9.a(')', sb, this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.url);
        Iterator a2 = ao.a(parcel, this.images);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
