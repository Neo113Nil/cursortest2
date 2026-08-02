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

/* compiled from: ShortVideoClickableStickersDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoClickableStickersDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoClickableStickersDto> CREATOR = new a();

    @pmi0("items")
    private final List<ShortVideoClickableStickerItemDto> items;

    @pmi0("original_height")
    private final int originalHeight;

    @pmi0("original_width")
    private final int originalWidth;

    /* compiled from: ShortVideoClickableStickersDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoClickableStickersDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoClickableStickersDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ShortVideoClickableStickerItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ShortVideoClickableStickersDto(arrayList, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoClickableStickersDto[] newArray(int i) {
            return new ShortVideoClickableStickersDto[i];
        }
    }

    public ShortVideoClickableStickersDto(List<ShortVideoClickableStickerItemDto> list, int i, int i2) {
        this.items = list;
        this.originalHeight = i;
        this.originalWidth = i2;
    }

    public final List<ShortVideoClickableStickerItemDto> d() {
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
        if (!(obj instanceof ShortVideoClickableStickersDto)) {
            return false;
        }
        ShortVideoClickableStickersDto shortVideoClickableStickersDto = (ShortVideoClickableStickersDto) obj;
        return epx.f(this.items, shortVideoClickableStickersDto.items) && this.originalHeight == shortVideoClickableStickersDto.originalHeight && this.originalWidth == shortVideoClickableStickersDto.originalWidth;
    }

    public final int f() {
        return this.originalWidth;
    }

    public final int hashCode() {
        return Integer.hashCode(this.originalWidth) + shy.a(this.originalHeight, this.items.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoClickableStickersDto(items=");
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
            ((ShortVideoClickableStickerItemDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.originalHeight);
        parcel.writeInt(this.originalWidth);
    }
}
