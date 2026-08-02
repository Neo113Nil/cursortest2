package com.vk.api.generated.stories.dto;

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

/* compiled from: StoriesClickableStickersDto.kt */
/* loaded from: classes15.dex */
public final class StoriesClickableStickersDto implements Parcelable {
    public static final Parcelable.Creator<StoriesClickableStickersDto> CREATOR = new a();

    @pmi0("clickable_stickers")
    private final List<StoriesClickableStickerDto> clickableStickers;

    @pmi0("original_height")
    private final int originalHeight;

    @pmi0("original_width")
    private final int originalWidth;

    /* compiled from: StoriesClickableStickersDto.kt */
    public static final class a implements Parcelable.Creator<StoriesClickableStickersDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesClickableStickersDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(StoriesClickableStickerDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new StoriesClickableStickersDto(arrayList, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesClickableStickersDto[] newArray(int i) {
            return new StoriesClickableStickersDto[i];
        }
    }

    public StoriesClickableStickersDto(List<StoriesClickableStickerDto> list, int i, int i2) {
        this.clickableStickers = list;
        this.originalHeight = i;
        this.originalWidth = i2;
    }

    public final List<StoriesClickableStickerDto> d() {
        return this.clickableStickers;
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
        if (!(obj instanceof StoriesClickableStickersDto)) {
            return false;
        }
        StoriesClickableStickersDto storiesClickableStickersDto = (StoriesClickableStickersDto) obj;
        return epx.f(this.clickableStickers, storiesClickableStickersDto.clickableStickers) && this.originalHeight == storiesClickableStickersDto.originalHeight && this.originalWidth == storiesClickableStickersDto.originalWidth;
    }

    public final int f() {
        return this.originalWidth;
    }

    public final int hashCode() {
        return Integer.hashCode(this.originalWidth) + shy.a(this.originalHeight, this.clickableStickers.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesClickableStickersDto(clickableStickers=");
        sb.append(this.clickableStickers);
        sb.append(", originalHeight=");
        sb.append(this.originalHeight);
        sb.append(", originalWidth=");
        return vu5.b(sb, this.originalWidth, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.clickableStickers);
        while (a2.hasNext()) {
            ((StoriesClickableStickerDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.originalHeight);
        parcel.writeInt(this.originalWidth);
    }
}
