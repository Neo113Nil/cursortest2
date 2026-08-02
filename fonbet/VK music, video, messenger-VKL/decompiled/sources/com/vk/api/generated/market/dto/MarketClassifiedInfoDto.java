package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketClassifiedInfoDto.kt */
/* loaded from: classes15.dex */
public final class MarketClassifiedInfoDto implements Parcelable {
    public static final Parcelable.Creator<MarketClassifiedInfoDto> CREATOR = new a();

    @pmi0("block_mode")
    private final BlockModeDto blockMode;

    @pmi0("is_active")
    private final Boolean isActive;

    @pmi0("is_archived")
    private final Boolean isArchived;

    @pmi0("is_blocked")
    private final Boolean isBlocked;

    @pmi0("is_deleted")
    private final Boolean isDeleted;

    @pmi0("is_owner")
    private final Boolean isOwner;

    @pmi0("is_sold")
    private final Boolean isSold;

    @pmi0("location_text")
    private final String locationText;

    @pmi0("market_item_id")
    private final int marketItemId;

    @pmi0("miniapp_url")
    private final String miniappUrl;

    @pmi0("youla_user_id")
    private final String youlaUserId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketClassifiedInfoDto.kt */
    public static final class BlockModeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BlockModeDto[] $VALUES;

        @pmi0("1")
        public static final BlockModeDto BLOCKED;
        public static final Parcelable.Creator<BlockModeDto> CREATOR;

        @pmi0("0")
        public static final BlockModeDto NO_BLOCK;

        @pmi0("2")
        public static final BlockModeDto REJECTED;

        @pmi0("3")
        public static final BlockModeDto VK_BLOCKED;
        private final int value;

        /* compiled from: MarketClassifiedInfoDto.kt */
        public static final class a implements Parcelable.Creator<BlockModeDto> {
            @Override // android.os.Parcelable.Creator
            public final BlockModeDto createFromParcel(Parcel parcel) {
                return BlockModeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BlockModeDto[] newArray(int i) {
                return new BlockModeDto[i];
            }
        }

        static {
            BlockModeDto blockModeDto = new BlockModeDto("NO_BLOCK", 0, 0);
            NO_BLOCK = blockModeDto;
            BlockModeDto blockModeDto2 = new BlockModeDto("BLOCKED", 1, 1);
            BLOCKED = blockModeDto2;
            BlockModeDto blockModeDto3 = new BlockModeDto("REJECTED", 2, 2);
            REJECTED = blockModeDto3;
            BlockModeDto blockModeDto4 = new BlockModeDto("VK_BLOCKED", 3, 3);
            VK_BLOCKED = blockModeDto4;
            BlockModeDto[] blockModeDtoArr = {blockModeDto, blockModeDto2, blockModeDto3, blockModeDto4};
            $VALUES = blockModeDtoArr;
            $ENTRIES = new asp(blockModeDtoArr);
            CREATOR = new a();
        }

        private BlockModeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static BlockModeDto valueOf(String str) {
            return (BlockModeDto) Enum.valueOf(BlockModeDto.class, str);
        }

        public static BlockModeDto[] values() {
            return (BlockModeDto[]) $VALUES.clone();
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

    /* compiled from: MarketClassifiedInfoDto.kt */
    public static final class a implements Parcelable.Creator<MarketClassifiedInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketClassifiedInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Parcel parcel2;
            BlockModeDto createFromParcel;
            Boolean valueOf6;
            Boolean bool;
            BlockModeDto blockModeDto;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                parcel2 = parcel;
                createFromParcel = null;
            } else {
                parcel2 = parcel;
                createFromParcel = BlockModeDto.CREATOR.createFromParcel(parcel2);
            }
            BlockModeDto blockModeDto2 = createFromParcel;
            Boolean bool2 = valueOf4;
            String readString2 = parcel2.readString();
            boolean z = false;
            Boolean bool3 = valueOf2;
            Boolean bool4 = valueOf5;
            String readString3 = parcel2.readString();
            if (parcel2.readInt() == 0) {
                bool = valueOf3;
                blockModeDto = blockModeDto2;
                valueOf6 = null;
            } else {
                if (parcel2.readInt() != 0) {
                    z = true;
                }
                valueOf6 = Boolean.valueOf(z);
                bool = valueOf3;
                blockModeDto = blockModeDto2;
            }
            return new MarketClassifiedInfoDto(readInt, readString, valueOf, bool3, bool, bool2, bool4, blockModeDto, readString2, readString3, valueOf6);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketClassifiedInfoDto[] newArray(int i) {
            return new MarketClassifiedInfoDto[i];
        }
    }

    public MarketClassifiedInfoDto(int i, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, BlockModeDto blockModeDto, String str2, String str3, Boolean bool6) {
        this.marketItemId = i;
        this.miniappUrl = str;
        this.isActive = bool;
        this.isBlocked = bool2;
        this.isSold = bool3;
        this.isDeleted = bool4;
        this.isArchived = bool5;
        this.blockMode = blockModeDto;
        this.locationText = str2;
        this.youlaUserId = str3;
        this.isOwner = bool6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketClassifiedInfoDto)) {
            return false;
        }
        MarketClassifiedInfoDto marketClassifiedInfoDto = (MarketClassifiedInfoDto) obj;
        return this.marketItemId == marketClassifiedInfoDto.marketItemId && epx.f(this.miniappUrl, marketClassifiedInfoDto.miniappUrl) && epx.f(this.isActive, marketClassifiedInfoDto.isActive) && epx.f(this.isBlocked, marketClassifiedInfoDto.isBlocked) && epx.f(this.isSold, marketClassifiedInfoDto.isSold) && epx.f(this.isDeleted, marketClassifiedInfoDto.isDeleted) && epx.f(this.isArchived, marketClassifiedInfoDto.isArchived) && this.blockMode == marketClassifiedInfoDto.blockMode && epx.f(this.locationText, marketClassifiedInfoDto.locationText) && epx.f(this.youlaUserId, marketClassifiedInfoDto.youlaUserId) && epx.f(this.isOwner, marketClassifiedInfoDto.isOwner);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.marketItemId) * 31;
        String str = this.miniappUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isActive;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isBlocked;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isSold;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isDeleted;
        int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isArchived;
        int hashCode7 = (hashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        BlockModeDto blockModeDto = this.blockMode;
        int hashCode8 = (hashCode7 + (blockModeDto == null ? 0 : blockModeDto.hashCode())) * 31;
        String str2 = this.locationText;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.youlaUserId;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool6 = this.isOwner;
        return hashCode10 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketClassifiedInfoDto(marketItemId=");
        sb.append(this.marketItemId);
        sb.append(", miniappUrl=");
        sb.append(this.miniappUrl);
        sb.append(", isActive=");
        sb.append(this.isActive);
        sb.append(", isBlocked=");
        sb.append(this.isBlocked);
        sb.append(", isSold=");
        sb.append(this.isSold);
        sb.append(", isDeleted=");
        sb.append(this.isDeleted);
        sb.append(", isArchived=");
        sb.append(this.isArchived);
        sb.append(", blockMode=");
        sb.append(this.blockMode);
        sb.append(", locationText=");
        sb.append(this.locationText);
        sb.append(", youlaUserId=");
        sb.append(this.youlaUserId);
        sb.append(", isOwner=");
        return tn.a(sb, this.isOwner, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.marketItemId);
        parcel.writeString(this.miniappUrl);
        Boolean bool = this.isActive;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isBlocked;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isSold;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isDeleted;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isArchived;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        BlockModeDto blockModeDto = this.blockMode;
        if (blockModeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            blockModeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.locationText);
        parcel.writeString(this.youlaUserId);
        Boolean bool6 = this.isOwner;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
    }

    public /* synthetic */ MarketClassifiedInfoDto(int i, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, BlockModeDto blockModeDto, String str2, String str3, Boolean bool6, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : bool2, (i2 & 16) != 0 ? null : bool3, (i2 & 32) != 0 ? null : bool4, (i2 & 64) != 0 ? null : bool5, (i2 & 128) != 0 ? null : blockModeDto, (i2 & 256) != 0 ? null : str2, (i2 & 512) != 0 ? null : str3, (i2 & 1024) != 0 ? null : bool6);
    }
}
