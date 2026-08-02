package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StickersSuggestionsSpecialItemsGiftConfigDto.kt */
/* loaded from: classes15.dex */
public final class StickersSuggestionsSpecialItemsGiftConfigDto implements Parcelable {
    public static final Parcelable.Creator<StickersSuggestionsSpecialItemsGiftConfigDto> CREATOR = new a();

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("placeholders")
    private final List<BaseImageDto> placeholders;

    /* compiled from: StickersSuggestionsSpecialItemsGiftConfigDto.kt */
    public static final class a implements Parcelable.Creator<StickersSuggestionsSpecialItemsGiftConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersSuggestionsSpecialItemsGiftConfigDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(StickersSuggestionsSpecialItemsGiftConfigDto.class, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(StickersSuggestionsSpecialItemsGiftConfigDto.class, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new StickersSuggestionsSpecialItemsGiftConfigDto(arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersSuggestionsSpecialItemsGiftConfigDto[] newArray(int i) {
            return new StickersSuggestionsSpecialItemsGiftConfigDto[i];
        }
    }

    public StickersSuggestionsSpecialItemsGiftConfigDto(List<BaseImageDto> list, List<BaseImageDto> list2) {
        this.images = list;
        this.placeholders = list2;
    }

    public final List<BaseImageDto> d() {
        return this.images;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.placeholders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersSuggestionsSpecialItemsGiftConfigDto)) {
            return false;
        }
        StickersSuggestionsSpecialItemsGiftConfigDto stickersSuggestionsSpecialItemsGiftConfigDto = (StickersSuggestionsSpecialItemsGiftConfigDto) obj;
        return epx.f(this.images, stickersSuggestionsSpecialItemsGiftConfigDto.images) && epx.f(this.placeholders, stickersSuggestionsSpecialItemsGiftConfigDto.placeholders);
    }

    public final int hashCode() {
        int hashCode = this.images.hashCode() * 31;
        List<BaseImageDto> list = this.placeholders;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersSuggestionsSpecialItemsGiftConfigDto(images=");
        sb.append(this.images);
        sb.append(", placeholders=");
        return ms9.a(')', sb, this.placeholders);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.images);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        List<BaseImageDto> list = this.placeholders;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ StickersSuggestionsSpecialItemsGiftConfigDto(List list, List list2, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2);
    }
}
