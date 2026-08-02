package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: ShortVideoShortVideoClickableStickersDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoClickableStickersDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoClickableStickersDto> CREATOR = new a();

    @pmi0("items")
    private final List<ShortVideoShortVideoClickableStickerItemDto> items;

    @pmi0("original_height")
    private final int originalHeight;

    @pmi0("original_width")
    private final int originalWidth;

    /* compiled from: ShortVideoShortVideoClickableStickersDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoClickableStickersDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoClickableStickersDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ShortVideoShortVideoClickableStickerItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ShortVideoShortVideoClickableStickersDto(arrayList, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoClickableStickersDto[] newArray(int i) {
            return new ShortVideoShortVideoClickableStickersDto[i];
        }
    }

    public ShortVideoShortVideoClickableStickersDto(List<ShortVideoShortVideoClickableStickerItemDto> list, int i, int i2) {
        this.items = list;
        this.originalHeight = i;
        this.originalWidth = i2;
    }

    public final List<ShortVideoShortVideoClickableStickerItemDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.originalHeight;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoClickableStickersDto)) {
            return false;
        }
        ShortVideoShortVideoClickableStickersDto shortVideoShortVideoClickableStickersDto = (ShortVideoShortVideoClickableStickersDto) obj;
        return epx.f(this.items, shortVideoShortVideoClickableStickersDto.items) && this.originalHeight == shortVideoShortVideoClickableStickersDto.originalHeight && this.originalWidth == shortVideoShortVideoClickableStickersDto.originalWidth;
    }

    public final int f() {
        return this.originalWidth;
    }

    public final int hashCode() {
        return Integer.hashCode(this.originalWidth) + shy.a(this.originalHeight, this.items.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoClickableStickersDto(items=");
        sb.append(this.items);
        sb.append(", originalHeight=");
        sb.append(this.originalHeight);
        sb.append(", originalWidth=");
        return vu5.b(sb, this.originalWidth, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ShortVideoShortVideoClickableStickerItemDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.originalHeight);
        parcel.writeInt(this.originalWidth);
    }
}
