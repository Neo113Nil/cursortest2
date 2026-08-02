package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.stickers.dto.StickersPackPreviewDto;
import com.vk.api.generated.stickers.dto.StickersPacksRecommendationBlockDto;
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

/* compiled from: VmojiGetStickerPacksRecommendationBlocksResponseDto.kt */
/* loaded from: classes15.dex */
public final class VmojiGetStickerPacksRecommendationBlocksResponseDto implements Parcelable {
    public static final Parcelable.Creator<VmojiGetStickerPacksRecommendationBlocksResponseDto> CREATOR = new a();

    @pmi0("blocks")
    private final List<StickersPacksRecommendationBlockDto> blocks;

    @pmi0("packs")
    private final List<StickersPackPreviewDto> packs;

    /* compiled from: VmojiGetStickerPacksRecommendationBlocksResponseDto.kt */
    public static final class a implements Parcelable.Creator<VmojiGetStickerPacksRecommendationBlocksResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiGetStickerPacksRecommendationBlocksResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(StickersPacksRecommendationBlockDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(StickersPackPreviewDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new VmojiGetStickerPacksRecommendationBlocksResponseDto(arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiGetStickerPacksRecommendationBlocksResponseDto[] newArray(int i) {
            return new VmojiGetStickerPacksRecommendationBlocksResponseDto[i];
        }
    }

    public VmojiGetStickerPacksRecommendationBlocksResponseDto(List<StickersPacksRecommendationBlockDto> list, List<StickersPackPreviewDto> list2) {
        this.blocks = list;
        this.packs = list2;
    }

    public final List<StickersPacksRecommendationBlockDto> d() {
        return this.blocks;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<StickersPackPreviewDto> e() {
        return this.packs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiGetStickerPacksRecommendationBlocksResponseDto)) {
            return false;
        }
        VmojiGetStickerPacksRecommendationBlocksResponseDto vmojiGetStickerPacksRecommendationBlocksResponseDto = (VmojiGetStickerPacksRecommendationBlocksResponseDto) obj;
        return epx.f(this.blocks, vmojiGetStickerPacksRecommendationBlocksResponseDto.blocks) && epx.f(this.packs, vmojiGetStickerPacksRecommendationBlocksResponseDto.packs);
    }

    public final int hashCode() {
        int hashCode = this.blocks.hashCode() * 31;
        List<StickersPackPreviewDto> list = this.packs;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiGetStickerPacksRecommendationBlocksResponseDto(blocks=");
        sb.append(this.blocks);
        sb.append(", packs=");
        return ms9.a(')', sb, this.packs);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.blocks);
        while (a2.hasNext()) {
            ((StickersPacksRecommendationBlockDto) a2.next()).writeToParcel(parcel, i);
        }
        List<StickersPackPreviewDto> list = this.packs;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((StickersPackPreviewDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VmojiGetStickerPacksRecommendationBlocksResponseDto(List list, List list2, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2);
    }
}
