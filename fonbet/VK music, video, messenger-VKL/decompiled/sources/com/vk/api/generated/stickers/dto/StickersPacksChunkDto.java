package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.store.dto.StoreStockItemDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StickersPacksChunkDto.kt */
/* loaded from: classes15.dex */
public final class StickersPacksChunkDto implements Parcelable {
    public static final Parcelable.Creator<StickersPacksChunkDto> CREATOR = new a();

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("packs")
    private final List<StoreStockItemDto> packs;

    /* compiled from: StickersPacksChunkDto.kt */
    public static final class a implements Parcelable.Creator<StickersPacksChunkDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersPacksChunkDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(StoreStockItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new StickersPacksChunkDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersPacksChunkDto[] newArray(int i) {
            return new StickersPacksChunkDto[i];
        }
    }

    public StickersPacksChunkDto(List<StoreStockItemDto> list, String str) {
        this.packs = list;
        this.nextFrom = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersPacksChunkDto)) {
            return false;
        }
        StickersPacksChunkDto stickersPacksChunkDto = (StickersPacksChunkDto) obj;
        return epx.f(this.packs, stickersPacksChunkDto.packs) && epx.f(this.nextFrom, stickersPacksChunkDto.nextFrom);
    }

    public final int hashCode() {
        int hashCode = this.packs.hashCode() * 31;
        String str = this.nextFrom;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersPacksChunkDto(packs=");
        sb.append(this.packs);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.packs);
        while (a2.hasNext()) {
            ((StoreStockItemDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ StickersPacksChunkDto(List list, String str, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str);
    }
}
