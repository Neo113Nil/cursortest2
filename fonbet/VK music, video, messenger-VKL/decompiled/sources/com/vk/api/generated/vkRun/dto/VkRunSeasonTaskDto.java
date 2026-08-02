package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkRunSeasonTaskDto.kt */
/* loaded from: classes15.dex */
public final class VkRunSeasonTaskDto implements Parcelable {
    public static final Parcelable.Creator<VkRunSeasonTaskDto> CREATOR = new a();

    @pmi0("coins")
    private final int coins;

    @pmi0("complete_by_click")
    private final boolean completeByClick;

    @pmi0("description")
    private final String description;

    @pmi0("extra_data")
    private final VkRunTaskExtraDataDto extraData;

    @pmi0("id")
    private final String id;

    @pmi0("image")
    private final VkRunImageUrlsDto image;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkRunSeasonTaskDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("available")
        public static final StatusDto AVAILABLE;

        @pmi0("completed")
        public static final StatusDto COMPLETED;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("locked")
        public static final StatusDto LOCKED;
        private final String value;

        /* compiled from: VkRunSeasonTaskDto.kt */
        public static final class a implements Parcelable.Creator<StatusDto> {
            @Override // android.os.Parcelable.Creator
            public final StatusDto createFromParcel(Parcel parcel) {
                return StatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDto[] newArray(int i) {
                return new StatusDto[i];
            }
        }

        static {
            StatusDto statusDto = new StatusDto("AVAILABLE", 0, "available");
            AVAILABLE = statusDto;
            StatusDto statusDto2 = new StatusDto("COMPLETED", 1, "completed");
            COMPLETED = statusDto2;
            StatusDto statusDto3 = new StatusDto("LOCKED", 2, "locked");
            LOCKED = statusDto3;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkRunSeasonTaskDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("buy_shop_items_10")
        public static final TypeDto BUY_SHOP_ITEMS_10;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("daily_bonus")
        public static final TypeDto DAILY_BONUS;

        @pmi0("final_level_boxes_earned_1")
        public static final TypeDto FINAL_LEVEL_BOXES_EARNED_1;

        @pmi0("final_level_boxes_earned_3")
        public static final TypeDto FINAL_LEVEL_BOXES_EARNED_3;

        @pmi0("follow_url")
        public static final TypeDto FOLLOW_URL;

        @pmi0("invite_users")
        public static final TypeDto INVITE_USERS;

        @pmi0("join_community")
        public static final TypeDto JOIN_COMMUNITY;

        @pmi0("reach_level_13")
        public static final TypeDto REACH_LEVEL_13;

        @pmi0("reach_level_17")
        public static final TypeDto REACH_LEVEL_17;

        @pmi0("reach_level_29")
        public static final TypeDto REACH_LEVEL_29;

        @pmi0("reach_level_42")
        public static final TypeDto REACH_LEVEL_42;

        @pmi0("reach_level_55")
        public static final TypeDto REACH_LEVEL_55;

        @pmi0("reach_level_7")
        public static final TypeDto REACH_LEVEL_7;

        @pmi0("read_articles")
        public static final TypeDto READ_ARTICLES;

        @pmi0("send_messages")
        public static final TypeDto SEND_MESSAGES;

        @pmi0("set_emoji")
        public static final TypeDto SET_EMOJI;

        @pmi0("share")
        public static final TypeDto SHARE;

        @pmi0("share_results")
        public static final TypeDto SHARE_RESULTS;

        @pmi0("take_golden_boxes_10")
        public static final TypeDto TAKE_GOLDEN_BOXES_10;

        @pmi0("watch_ad")
        public static final TypeDto WATCH_AD;

        @pmi0("workout_accept_challenge")
        public static final TypeDto WORKOUT_ACCEPT_CHALLENGE;
        private final String value;

        /* compiled from: VkRunSeasonTaskDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("INVITE_USERS", 0, "invite_users");
            INVITE_USERS = typeDto;
            TypeDto typeDto2 = new TypeDto("SHARE", 1, "share");
            SHARE = typeDto2;
            TypeDto typeDto3 = new TypeDto("SHARE_RESULTS", 2, "share_results");
            SHARE_RESULTS = typeDto3;
            TypeDto typeDto4 = new TypeDto("SET_EMOJI", 3, "set_emoji");
            SET_EMOJI = typeDto4;
            TypeDto typeDto5 = new TypeDto("SEND_MESSAGES", 4, "send_messages");
            SEND_MESSAGES = typeDto5;
            TypeDto typeDto6 = new TypeDto("DAILY_BONUS", 5, "daily_bonus");
            DAILY_BONUS = typeDto6;
            TypeDto typeDto7 = new TypeDto("WORKOUT_ACCEPT_CHALLENGE", 6, "workout_accept_challenge");
            WORKOUT_ACCEPT_CHALLENGE = typeDto7;
            TypeDto typeDto8 = new TypeDto("WATCH_AD", 7, "watch_ad");
            WATCH_AD = typeDto8;
            TypeDto typeDto9 = new TypeDto("READ_ARTICLES", 8, "read_articles");
            READ_ARTICLES = typeDto9;
            TypeDto typeDto10 = new TypeDto("FINAL_LEVEL_BOXES_EARNED_1", 9, "final_level_boxes_earned_1");
            FINAL_LEVEL_BOXES_EARNED_1 = typeDto10;
            TypeDto typeDto11 = new TypeDto("FINAL_LEVEL_BOXES_EARNED_3", 10, "final_level_boxes_earned_3");
            FINAL_LEVEL_BOXES_EARNED_3 = typeDto11;
            TypeDto typeDto12 = new TypeDto("TAKE_GOLDEN_BOXES_10", 11, "take_golden_boxes_10");
            TAKE_GOLDEN_BOXES_10 = typeDto12;
            TypeDto typeDto13 = new TypeDto("BUY_SHOP_ITEMS_10", 12, "buy_shop_items_10");
            BUY_SHOP_ITEMS_10 = typeDto13;
            TypeDto typeDto14 = new TypeDto("REACH_LEVEL_7", 13, "reach_level_7");
            REACH_LEVEL_7 = typeDto14;
            TypeDto typeDto15 = new TypeDto("REACH_LEVEL_13", 14, "reach_level_13");
            REACH_LEVEL_13 = typeDto15;
            TypeDto typeDto16 = new TypeDto("REACH_LEVEL_17", 15, "reach_level_17");
            REACH_LEVEL_17 = typeDto16;
            TypeDto typeDto17 = new TypeDto("REACH_LEVEL_29", 16, "reach_level_29");
            REACH_LEVEL_29 = typeDto17;
            TypeDto typeDto18 = new TypeDto("REACH_LEVEL_42", 17, "reach_level_42");
            REACH_LEVEL_42 = typeDto18;
            TypeDto typeDto19 = new TypeDto("REACH_LEVEL_55", 18, "reach_level_55");
            REACH_LEVEL_55 = typeDto19;
            TypeDto typeDto20 = new TypeDto("JOIN_COMMUNITY", 19, "join_community");
            JOIN_COMMUNITY = typeDto20;
            TypeDto typeDto21 = new TypeDto("FOLLOW_URL", 20, "follow_url");
            FOLLOW_URL = typeDto21;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11, typeDto12, typeDto13, typeDto14, typeDto15, typeDto16, typeDto17, typeDto18, typeDto19, typeDto20, typeDto21};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
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

    /* compiled from: VkRunSeasonTaskDto.kt */
    public static final class a implements Parcelable.Creator<VkRunSeasonTaskDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonTaskDto createFromParcel(Parcel parcel) {
            return new VkRunSeasonTaskDto(parcel.readString(), TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), StatusDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (VkRunTaskExtraDataDto) parcel.readParcelable(VkRunSeasonTaskDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : VkRunImageUrlsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonTaskDto[] newArray(int i) {
            return new VkRunSeasonTaskDto[i];
        }
    }

    public VkRunSeasonTaskDto(String str, TypeDto typeDto, String str2, int i, StatusDto statusDto, boolean z, VkRunTaskExtraDataDto vkRunTaskExtraDataDto, String str3, VkRunImageUrlsDto vkRunImageUrlsDto) {
        this.id = str;
        this.type = typeDto;
        this.title = str2;
        this.coins = i;
        this.status = statusDto;
        this.completeByClick = z;
        this.extraData = vkRunTaskExtraDataDto;
        this.description = str3;
        this.image = vkRunImageUrlsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunSeasonTaskDto)) {
            return false;
        }
        VkRunSeasonTaskDto vkRunSeasonTaskDto = (VkRunSeasonTaskDto) obj;
        return epx.f(this.id, vkRunSeasonTaskDto.id) && this.type == vkRunSeasonTaskDto.type && epx.f(this.title, vkRunSeasonTaskDto.title) && this.coins == vkRunSeasonTaskDto.coins && this.status == vkRunSeasonTaskDto.status && this.completeByClick == vkRunSeasonTaskDto.completeByClick && epx.f(this.extraData, vkRunSeasonTaskDto.extraData) && epx.f(this.description, vkRunSeasonTaskDto.description) && epx.f(this.image, vkRunSeasonTaskDto.image);
    }

    public final int hashCode() {
        int b = qoy.b((this.status.hashCode() + shy.a(this.coins, urd0.a((this.type.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.title), 31)) * 31, 31, this.completeByClick);
        VkRunTaskExtraDataDto vkRunTaskExtraDataDto = this.extraData;
        int hashCode = (b + (vkRunTaskExtraDataDto == null ? 0 : vkRunTaskExtraDataDto.hashCode())) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        VkRunImageUrlsDto vkRunImageUrlsDto = this.image;
        return hashCode2 + (vkRunImageUrlsDto != null ? vkRunImageUrlsDto.hashCode() : 0);
    }

    public final String toString() {
        return "VkRunSeasonTaskDto(id=" + this.id + ", type=" + this.type + ", title=" + this.title + ", coins=" + this.coins + ", status=" + this.status + ", completeByClick=" + this.completeByClick + ", extraData=" + this.extraData + ", description=" + this.description + ", image=" + this.image + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeInt(this.coins);
        this.status.writeToParcel(parcel, i);
        parcel.writeInt(this.completeByClick ? 1 : 0);
        parcel.writeParcelable(this.extraData, i);
        parcel.writeString(this.description);
        VkRunImageUrlsDto vkRunImageUrlsDto = this.image;
        if (vkRunImageUrlsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkRunImageUrlsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VkRunSeasonTaskDto(String str, TypeDto typeDto, String str2, int i, StatusDto statusDto, boolean z, VkRunTaskExtraDataDto vkRunTaskExtraDataDto, String str3, VkRunImageUrlsDto vkRunImageUrlsDto, int i2, zcl zclVar) {
        this(str, typeDto, str2, i, statusDto, z, (i2 & 64) != 0 ? null : vkRunTaskExtraDataDto, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : vkRunImageUrlsDto);
    }
}
