package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketCarouselItemObjectDto.kt */
/* loaded from: classes15.dex */
public final class MarketCarouselItemObjectDto implements Parcelable {
    public static final Parcelable.Creator<MarketCarouselItemObjectDto> CREATOR = new a();

    @pmi0("block_reason")
    private final BlockReasonDto blockReason;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final MarketMarketItemDto item;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketCarouselItemObjectDto.kt */
    public static final class BlockReasonDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BlockReasonDto[] $VALUES;

        @pmi0("community_items")
        public static final BlockReasonDto COMMUNITY_ITEMS;
        public static final Parcelable.Creator<BlockReasonDto> CREATOR;

        @pmi0("personal_recommendation")
        public static final BlockReasonDto PERSONAL_RECOMMENDATION;

        @pmi0("thematic_compilation")
        public static final BlockReasonDto THEMATIC_COMPILATION;
        private final String value;

        /* compiled from: MarketCarouselItemObjectDto.kt */
        public static final class a implements Parcelable.Creator<BlockReasonDto> {
            @Override // android.os.Parcelable.Creator
            public final BlockReasonDto createFromParcel(Parcel parcel) {
                return BlockReasonDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BlockReasonDto[] newArray(int i) {
                return new BlockReasonDto[i];
            }
        }

        static {
            BlockReasonDto blockReasonDto = new BlockReasonDto("PERSONAL_RECOMMENDATION", 0, "personal_recommendation");
            PERSONAL_RECOMMENDATION = blockReasonDto;
            BlockReasonDto blockReasonDto2 = new BlockReasonDto("COMMUNITY_ITEMS", 1, "community_items");
            COMMUNITY_ITEMS = blockReasonDto2;
            BlockReasonDto blockReasonDto3 = new BlockReasonDto("THEMATIC_COMPILATION", 2, "thematic_compilation");
            THEMATIC_COMPILATION = blockReasonDto3;
            BlockReasonDto[] blockReasonDtoArr = {blockReasonDto, blockReasonDto2, blockReasonDto3};
            $VALUES = blockReasonDtoArr;
            $ENTRIES = new asp(blockReasonDtoArr);
            CREATOR = new a();
        }

        private BlockReasonDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static BlockReasonDto valueOf(String str) {
            return (BlockReasonDto) Enum.valueOf(BlockReasonDto.class, str);
        }

        public static BlockReasonDto[] values() {
            return (BlockReasonDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: MarketCarouselItemObjectDto.kt */
    public static final class a implements Parcelable.Creator<MarketCarouselItemObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCarouselItemObjectDto createFromParcel(Parcel parcel) {
            return new MarketCarouselItemObjectDto((MarketMarketItemDto) parcel.readParcelable(MarketCarouselItemObjectDto.class.getClassLoader()), parcel.readInt() == 0 ? null : BlockReasonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCarouselItemObjectDto[] newArray(int i) {
            return new MarketCarouselItemObjectDto[i];
        }
    }

    public MarketCarouselItemObjectDto(MarketMarketItemDto marketMarketItemDto, BlockReasonDto blockReasonDto) {
        this.item = marketMarketItemDto;
        this.blockReason = blockReasonDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCarouselItemObjectDto)) {
            return false;
        }
        MarketCarouselItemObjectDto marketCarouselItemObjectDto = (MarketCarouselItemObjectDto) obj;
        return epx.f(this.item, marketCarouselItemObjectDto.item) && this.blockReason == marketCarouselItemObjectDto.blockReason;
    }

    public final int hashCode() {
        int hashCode = this.item.hashCode() * 31;
        BlockReasonDto blockReasonDto = this.blockReason;
        return hashCode + (blockReasonDto == null ? 0 : blockReasonDto.hashCode());
    }

    public final String toString() {
        return "MarketCarouselItemObjectDto(item=" + this.item + ", blockReason=" + this.blockReason + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.item, i);
        BlockReasonDto blockReasonDto = this.blockReason;
        if (blockReasonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            blockReasonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketCarouselItemObjectDto(MarketMarketItemDto marketMarketItemDto, BlockReasonDto blockReasonDto, int i, zcl zclVar) {
        this(marketMarketItemDto, (i & 2) != 0 ? null : blockReasonDto);
    }
}
