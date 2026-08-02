package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.stickers.dto.StickersBonusHistoryRecordDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoreGetStickersBonusHistoryRecordsResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoreGetStickersBonusHistoryRecordsResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoreGetStickersBonusHistoryRecordsResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<StickersBonusHistoryRecordDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: StoreGetStickersBonusHistoryRecordsResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoreGetStickersBonusHistoryRecordsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreGetStickersBonusHistoryRecordsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(StickersBonusHistoryRecordDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new StoreGetStickersBonusHistoryRecordsResponseDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoreGetStickersBonusHistoryRecordsResponseDto[] newArray(int i) {
            return new StoreGetStickersBonusHistoryRecordsResponseDto[i];
        }
    }

    public StoreGetStickersBonusHistoryRecordsResponseDto(List<StickersBonusHistoryRecordDto> list, String str) {
        this.items = list;
        this.nextFrom = str;
    }

    public final List<StickersBonusHistoryRecordDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.nextFrom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreGetStickersBonusHistoryRecordsResponseDto)) {
            return false;
        }
        StoreGetStickersBonusHistoryRecordsResponseDto storeGetStickersBonusHistoryRecordsResponseDto = (StoreGetStickersBonusHistoryRecordsResponseDto) obj;
        return epx.f(this.items, storeGetStickersBonusHistoryRecordsResponseDto.items) && epx.f(this.nextFrom, storeGetStickersBonusHistoryRecordsResponseDto.nextFrom);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        String str = this.nextFrom;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreGetStickersBonusHistoryRecordsResponseDto(items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((StickersBonusHistoryRecordDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ StoreGetStickersBonusHistoryRecordsResponseDto(List list, String str, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str);
    }
}
