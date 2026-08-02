package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.stickers.dto.StickersStickersRecommendationBlockDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoreGetStickersRecommendationBlockResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoreGetStickersRecommendationBlockResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoreGetStickersRecommendationBlockResponseDto> CREATOR = new a();

    @pmi0("block")
    private final StickersStickersRecommendationBlockDto block;

    @pmi0("packs")
    private final List<StoreStockItemDto> packs;

    /* compiled from: StoreGetStickersRecommendationBlockResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoreGetStickersRecommendationBlockResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreGetStickersRecommendationBlockResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            StickersStickersRecommendationBlockDto createFromParcel = StickersStickersRecommendationBlockDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(StoreStockItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new StoreGetStickersRecommendationBlockResponseDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreGetStickersRecommendationBlockResponseDto[] newArray(int i) {
            return new StoreGetStickersRecommendationBlockResponseDto[i];
        }
    }

    public StoreGetStickersRecommendationBlockResponseDto(StickersStickersRecommendationBlockDto stickersStickersRecommendationBlockDto, List<StoreStockItemDto> list) {
        this.block = stickersStickersRecommendationBlockDto;
        this.packs = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreGetStickersRecommendationBlockResponseDto)) {
            return false;
        }
        StoreGetStickersRecommendationBlockResponseDto storeGetStickersRecommendationBlockResponseDto = (StoreGetStickersRecommendationBlockResponseDto) obj;
        return epx.f(this.block, storeGetStickersRecommendationBlockResponseDto.block) && epx.f(this.packs, storeGetStickersRecommendationBlockResponseDto.packs);
    }

    public final int hashCode() {
        int hashCode = this.block.hashCode() * 31;
        List<StoreStockItemDto> list = this.packs;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreGetStickersRecommendationBlockResponseDto(block=");
        sb.append(this.block);
        sb.append(", packs=");
        return ms9.a(')', sb, this.packs);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.block.writeToParcel(parcel, i);
        List<StoreStockItemDto> list = this.packs;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((StoreStockItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ StoreGetStickersRecommendationBlockResponseDto(StickersStickersRecommendationBlockDto stickersStickersRecommendationBlockDto, List list, int i, zcl zclVar) {
        this(stickersStickersRecommendationBlockDto, (i & 2) != 0 ? null : list);
    }
}
