package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseStickerDto;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.pmi0;

/* compiled from: StickersSearchStickersResponseDto.kt */
/* loaded from: classes15.dex */
public final class StickersSearchStickersResponseDto implements Parcelable {
    public static final Parcelable.Creator<StickersSearchStickersResponseDto> CREATOR = new a();

    @pmi0("has_next")
    private final boolean hasNext;

    @pmi0("stickers")
    private final List<BaseStickerDto> stickers;

    /* compiled from: StickersSearchStickersResponseDto.kt */
    public static final class a implements Parcelable.Creator<StickersSearchStickersResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersSearchStickersResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(StickersSearchStickersResponseDto.class, parcel, arrayList, i, 1);
            }
            return new StickersSearchStickersResponseDto(arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersSearchStickersResponseDto[] newArray(int i) {
            return new StickersSearchStickersResponseDto[i];
        }
    }

    public StickersSearchStickersResponseDto(List<BaseStickerDto> list, boolean z) {
        this.stickers = list;
        this.hasNext = z;
    }

    public final boolean d() {
        return this.hasNext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseStickerDto> e() {
        return this.stickers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersSearchStickersResponseDto)) {
            return false;
        }
        StickersSearchStickersResponseDto stickersSearchStickersResponseDto = (StickersSearchStickersResponseDto) obj;
        return epx.f(this.stickers, stickersSearchStickersResponseDto.stickers) && this.hasNext == stickersSearchStickersResponseDto.hasNext;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.hasNext) + (this.stickers.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersSearchStickersResponseDto(stickers=");
        sb.append(this.stickers);
        sb.append(", hasNext=");
        return q0.a(sb, this.hasNext, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.stickers);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.hasNext ? 1 : 0);
    }
}
