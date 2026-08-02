package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.stickers.dto.StickersPackPreviewDto;
import com.vk.api.generated.stickers.dto.StickersPacksRecommendationBlockDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VmojiGetStickerPacksRecommendationBlockResponseDto.kt */
/* loaded from: classes15.dex */
public final class VmojiGetStickerPacksRecommendationBlockResponseDto implements Parcelable {
    public static final Parcelable.Creator<VmojiGetStickerPacksRecommendationBlockResponseDto> CREATOR = new a();

    @pmi0("block")
    private final StickersPacksRecommendationBlockDto block;

    @pmi0("packs")
    private final List<StickersPackPreviewDto> packs;

    /* compiled from: VmojiGetStickerPacksRecommendationBlockResponseDto.kt */
    public static final class a implements Parcelable.Creator<VmojiGetStickerPacksRecommendationBlockResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiGetStickerPacksRecommendationBlockResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            StickersPacksRecommendationBlockDto createFromParcel = StickersPacksRecommendationBlockDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(StickersPackPreviewDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VmojiGetStickerPacksRecommendationBlockResponseDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiGetStickerPacksRecommendationBlockResponseDto[] newArray(int i) {
            return new VmojiGetStickerPacksRecommendationBlockResponseDto[i];
        }
    }

    public VmojiGetStickerPacksRecommendationBlockResponseDto(StickersPacksRecommendationBlockDto stickersPacksRecommendationBlockDto, List<StickersPackPreviewDto> list) {
        this.block = stickersPacksRecommendationBlockDto;
        this.packs = list;
    }

    public final StickersPacksRecommendationBlockDto d() {
        return this.block;
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
        if (!(obj instanceof VmojiGetStickerPacksRecommendationBlockResponseDto)) {
            return false;
        }
        VmojiGetStickerPacksRecommendationBlockResponseDto vmojiGetStickerPacksRecommendationBlockResponseDto = (VmojiGetStickerPacksRecommendationBlockResponseDto) obj;
        return epx.f(this.block, vmojiGetStickerPacksRecommendationBlockResponseDto.block) && epx.f(this.packs, vmojiGetStickerPacksRecommendationBlockResponseDto.packs);
    }

    public final int hashCode() {
        int hashCode = this.block.hashCode() * 31;
        List<StickersPackPreviewDto> list = this.packs;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiGetStickerPacksRecommendationBlockResponseDto(block=");
        sb.append(this.block);
        sb.append(", packs=");
        return ms9.a(')', sb, this.packs);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.block.writeToParcel(parcel, i);
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

    public /* synthetic */ VmojiGetStickerPacksRecommendationBlockResponseDto(StickersPacksRecommendationBlockDto stickersPacksRecommendationBlockDto, List list, int i, zcl zclVar) {
        this(stickersPacksRecommendationBlockDto, (i & 2) != 0 ? null : list);
    }
}
