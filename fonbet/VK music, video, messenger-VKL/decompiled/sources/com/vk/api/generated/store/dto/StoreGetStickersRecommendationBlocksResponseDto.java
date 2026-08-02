package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.stickers.dto.StickersStickersRecommendationBlockDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoreGetStickersRecommendationBlocksResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoreGetStickersRecommendationBlocksResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoreGetStickersRecommendationBlocksResponseDto> CREATOR = new a();

    @pmi0("blocks")
    private final List<StickersStickersRecommendationBlockDto> blocks;

    @pmi0("packs")
    private final List<StoreStockItemDto> packs;

    /* compiled from: StoreGetStickersRecommendationBlocksResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoreGetStickersRecommendationBlocksResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreGetStickersRecommendationBlocksResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(StickersStickersRecommendationBlockDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(StoreStockItemDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new StoreGetStickersRecommendationBlocksResponseDto(arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreGetStickersRecommendationBlocksResponseDto[] newArray(int i) {
            return new StoreGetStickersRecommendationBlocksResponseDto[i];
        }
    }

    public StoreGetStickersRecommendationBlocksResponseDto(List<StickersStickersRecommendationBlockDto> list, List<StoreStockItemDto> list2) {
        this.blocks = list;
        this.packs = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreGetStickersRecommendationBlocksResponseDto)) {
            return false;
        }
        StoreGetStickersRecommendationBlocksResponseDto storeGetStickersRecommendationBlocksResponseDto = (StoreGetStickersRecommendationBlocksResponseDto) obj;
        return epx.f(this.blocks, storeGetStickersRecommendationBlocksResponseDto.blocks) && epx.f(this.packs, storeGetStickersRecommendationBlocksResponseDto.packs);
    }

    public final int hashCode() {
        int hashCode = this.blocks.hashCode() * 31;
        List<StoreStockItemDto> list = this.packs;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreGetStickersRecommendationBlocksResponseDto(blocks=");
        sb.append(this.blocks);
        sb.append(", packs=");
        return ms9.a(')', sb, this.packs);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.blocks);
        while (a2.hasNext()) {
            ((StickersStickersRecommendationBlockDto) a2.next()).writeToParcel(parcel, i);
        }
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

    public /* synthetic */ StoreGetStickersRecommendationBlocksResponseDto(List list, List list2, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2);
    }
}
