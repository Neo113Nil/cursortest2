package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesGifItemDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGifItemDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGifItemDto> CREATOR = new a();

    @pmi0("blur_preview")
    private final String blurPreview;

    @pmi0("id")
    private final long id;

    @pmi0("sizes")
    private final List<BaseImageDto> sizes;

    /* compiled from: StoriesGifItemDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGifItemDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGifItemDto createFromParcel(Parcel parcel) {
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(StoriesGifItemDto.class, parcel, arrayList, i, 1);
            }
            return new StoriesGifItemDto(readLong, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGifItemDto[] newArray(int i) {
            return new StoriesGifItemDto[i];
        }
    }

    public StoriesGifItemDto(long j, List<BaseImageDto> list, String str) {
        this.id = j;
        this.sizes = list;
        this.blurPreview = str;
    }

    public final long d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.sizes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGifItemDto)) {
            return false;
        }
        StoriesGifItemDto storiesGifItemDto = (StoriesGifItemDto) obj;
        return this.id == storiesGifItemDto.id && epx.f(this.sizes, storiesGifItemDto.sizes) && epx.f(this.blurPreview, storiesGifItemDto.blurPreview);
    }

    public final int hashCode() {
        int a2 = fw3.a(Long.hashCode(this.id) * 31, 31, this.sizes);
        String str = this.blurPreview;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesGifItemDto(id=");
        sb.append(this.id);
        sb.append(", sizes=");
        sb.append(this.sizes);
        sb.append(", blurPreview=");
        return ho8.a(sb, this.blurPreview, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        Iterator a2 = ao.a(parcel, this.sizes);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.blurPreview);
    }

    public /* synthetic */ StoriesGifItemDto(long j, List list, String str, int i, zcl zclVar) {
        this(j, list, (i & 4) != 0 ? null : str);
    }
}
