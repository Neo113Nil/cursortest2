package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsCreationOnboardingDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreationOnboardingDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCreationOnboardingDto> CREATOR = new a();

    @pmi0("active_screen")
    private final ActiveScreenDto activeScreen;

    @pmi0("is_skippable")
    private final Boolean isSkippable;

    @pmi0("screen_clips")
    private final GroupsCreationOnboardingScreenClipsDto screenClips;

    @pmi0("screen_design")
    private final GroupsCreationOnboardingScreenDesignDto screenDesign;

    @pmi0("screen_finish")
    private final GroupsCreationOnboardingScreenFinishDto screenFinish;

    @pmi0("screen_market_items")
    private final GroupsCreationOnboardingScreenMarketItemsDto screenMarketItems;

    @pmi0("screen_posting")
    private final GroupsCreationOnboardingScreenPostingDto screenPosting;

    @pmi0("screen_regular_posting")
    private final GroupsCreationOnboardingScreenRegularPostingDto screenRegularPosting;

    @pmi0("screen_subscribers")
    private final GroupsCreationOnboardingScreenSubscribersDto screenSubscribers;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsCreationOnboardingDto.kt */
    public static final class ActiveScreenDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActiveScreenDto[] $VALUES;
        public static final Parcelable.Creator<ActiveScreenDto> CREATOR;

        @pmi0("screen_clips")
        public static final ActiveScreenDto SCREEN_CLIPS;

        @pmi0("screen_design")
        public static final ActiveScreenDto SCREEN_DESIGN;

        @pmi0("screen_finish")
        public static final ActiveScreenDto SCREEN_FINISH;

        @pmi0("screen_market_items")
        public static final ActiveScreenDto SCREEN_MARKET_ITEMS;

        @pmi0("screen_posting")
        public static final ActiveScreenDto SCREEN_POSTING;

        @pmi0("screen_regular_posting")
        public static final ActiveScreenDto SCREEN_REGULAR_POSTING;

        @pmi0("screen_subscribers")
        public static final ActiveScreenDto SCREEN_SUBSCRIBERS;
        private final String value;

        /* compiled from: GroupsCreationOnboardingDto.kt */
        public static final class a implements Parcelable.Creator<ActiveScreenDto> {
            @Override // android.os.Parcelable.Creator
            public final ActiveScreenDto createFromParcel(Parcel parcel) {
                return ActiveScreenDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActiveScreenDto[] newArray(int i) {
                return new ActiveScreenDto[i];
            }
        }

        static {
            ActiveScreenDto activeScreenDto = new ActiveScreenDto("SCREEN_DESIGN", 0, "screen_design");
            SCREEN_DESIGN = activeScreenDto;
            ActiveScreenDto activeScreenDto2 = new ActiveScreenDto("SCREEN_POSTING", 1, "screen_posting");
            SCREEN_POSTING = activeScreenDto2;
            ActiveScreenDto activeScreenDto3 = new ActiveScreenDto("SCREEN_SUBSCRIBERS", 2, "screen_subscribers");
            SCREEN_SUBSCRIBERS = activeScreenDto3;
            ActiveScreenDto activeScreenDto4 = new ActiveScreenDto("SCREEN_CLIPS", 3, "screen_clips");
            SCREEN_CLIPS = activeScreenDto4;
            ActiveScreenDto activeScreenDto5 = new ActiveScreenDto("SCREEN_REGULAR_POSTING", 4, "screen_regular_posting");
            SCREEN_REGULAR_POSTING = activeScreenDto5;
            ActiveScreenDto activeScreenDto6 = new ActiveScreenDto("SCREEN_FINISH", 5, "screen_finish");
            SCREEN_FINISH = activeScreenDto6;
            ActiveScreenDto activeScreenDto7 = new ActiveScreenDto("SCREEN_MARKET_ITEMS", 6, "screen_market_items");
            SCREEN_MARKET_ITEMS = activeScreenDto7;
            ActiveScreenDto[] activeScreenDtoArr = {activeScreenDto, activeScreenDto2, activeScreenDto3, activeScreenDto4, activeScreenDto5, activeScreenDto6, activeScreenDto7};
            $VALUES = activeScreenDtoArr;
            $ENTRIES = new asp(activeScreenDtoArr);
            CREATOR = new a();
        }

        private ActiveScreenDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ActiveScreenDto valueOf(String str) {
            return (ActiveScreenDto) Enum.valueOf(ActiveScreenDto.class, str);
        }

        public static ActiveScreenDto[] values() {
            return (ActiveScreenDto[]) $VALUES.clone();
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
    /* compiled from: GroupsCreationOnboardingDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("2")
        public static final TypeDto BUSINESS;

        @pmi0("1")
        public static final TypeDto CONTENT;
        public static final Parcelable.Creator<TypeDto> CREATOR;
        private final int value;

        /* compiled from: GroupsCreationOnboardingDto.kt */
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
            TypeDto typeDto = new TypeDto("CONTENT", 0, 1);
            CONTENT = typeDto;
            TypeDto typeDto2 = new TypeDto("BUSINESS", 1, 2);
            BUSINESS = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, int i2) {
            this.value = i2;
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

    /* compiled from: GroupsCreationOnboardingDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreationOnboardingDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            TypeDto createFromParcel = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
            ActiveScreenDto createFromParcel2 = parcel.readInt() == 0 ? null : ActiveScreenDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsCreationOnboardingDto(createFromParcel, createFromParcel2, valueOf, parcel.readInt() == 0 ? null : GroupsCreationOnboardingScreenDesignDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsCreationOnboardingScreenPostingDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsCreationOnboardingScreenSubscribersDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsCreationOnboardingScreenClipsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsCreationOnboardingScreenRegularPostingDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsCreationOnboardingScreenMarketItemsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GroupsCreationOnboardingScreenFinishDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingDto[] newArray(int i) {
            return new GroupsCreationOnboardingDto[i];
        }
    }

    public GroupsCreationOnboardingDto() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCreationOnboardingDto)) {
            return false;
        }
        GroupsCreationOnboardingDto groupsCreationOnboardingDto = (GroupsCreationOnboardingDto) obj;
        return this.type == groupsCreationOnboardingDto.type && this.activeScreen == groupsCreationOnboardingDto.activeScreen && epx.f(this.isSkippable, groupsCreationOnboardingDto.isSkippable) && epx.f(this.screenDesign, groupsCreationOnboardingDto.screenDesign) && epx.f(this.screenPosting, groupsCreationOnboardingDto.screenPosting) && epx.f(this.screenSubscribers, groupsCreationOnboardingDto.screenSubscribers) && epx.f(this.screenClips, groupsCreationOnboardingDto.screenClips) && epx.f(this.screenRegularPosting, groupsCreationOnboardingDto.screenRegularPosting) && epx.f(this.screenMarketItems, groupsCreationOnboardingDto.screenMarketItems) && epx.f(this.screenFinish, groupsCreationOnboardingDto.screenFinish);
    }

    public final int hashCode() {
        TypeDto typeDto = this.type;
        int hashCode = (typeDto == null ? 0 : typeDto.hashCode()) * 31;
        ActiveScreenDto activeScreenDto = this.activeScreen;
        int hashCode2 = (hashCode + (activeScreenDto == null ? 0 : activeScreenDto.hashCode())) * 31;
        Boolean bool = this.isSkippable;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        GroupsCreationOnboardingScreenDesignDto groupsCreationOnboardingScreenDesignDto = this.screenDesign;
        int hashCode4 = (hashCode3 + (groupsCreationOnboardingScreenDesignDto == null ? 0 : groupsCreationOnboardingScreenDesignDto.hashCode())) * 31;
        GroupsCreationOnboardingScreenPostingDto groupsCreationOnboardingScreenPostingDto = this.screenPosting;
        int hashCode5 = (hashCode4 + (groupsCreationOnboardingScreenPostingDto == null ? 0 : groupsCreationOnboardingScreenPostingDto.hashCode())) * 31;
        GroupsCreationOnboardingScreenSubscribersDto groupsCreationOnboardingScreenSubscribersDto = this.screenSubscribers;
        int hashCode6 = (hashCode5 + (groupsCreationOnboardingScreenSubscribersDto == null ? 0 : groupsCreationOnboardingScreenSubscribersDto.hashCode())) * 31;
        GroupsCreationOnboardingScreenClipsDto groupsCreationOnboardingScreenClipsDto = this.screenClips;
        int hashCode7 = (hashCode6 + (groupsCreationOnboardingScreenClipsDto == null ? 0 : groupsCreationOnboardingScreenClipsDto.hashCode())) * 31;
        GroupsCreationOnboardingScreenRegularPostingDto groupsCreationOnboardingScreenRegularPostingDto = this.screenRegularPosting;
        int hashCode8 = (hashCode7 + (groupsCreationOnboardingScreenRegularPostingDto == null ? 0 : groupsCreationOnboardingScreenRegularPostingDto.hashCode())) * 31;
        GroupsCreationOnboardingScreenMarketItemsDto groupsCreationOnboardingScreenMarketItemsDto = this.screenMarketItems;
        int hashCode9 = (hashCode8 + (groupsCreationOnboardingScreenMarketItemsDto == null ? 0 : groupsCreationOnboardingScreenMarketItemsDto.hashCode())) * 31;
        GroupsCreationOnboardingScreenFinishDto groupsCreationOnboardingScreenFinishDto = this.screenFinish;
        return hashCode9 + (groupsCreationOnboardingScreenFinishDto != null ? groupsCreationOnboardingScreenFinishDto.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsCreationOnboardingDto(type=" + this.type + ", activeScreen=" + this.activeScreen + ", isSkippable=" + this.isSkippable + ", screenDesign=" + this.screenDesign + ", screenPosting=" + this.screenPosting + ", screenSubscribers=" + this.screenSubscribers + ", screenClips=" + this.screenClips + ", screenRegularPosting=" + this.screenRegularPosting + ", screenMarketItems=" + this.screenMarketItems + ", screenFinish=" + this.screenFinish + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        ActiveScreenDto activeScreenDto = this.activeScreen;
        if (activeScreenDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            activeScreenDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isSkippable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        GroupsCreationOnboardingScreenDesignDto groupsCreationOnboardingScreenDesignDto = this.screenDesign;
        if (groupsCreationOnboardingScreenDesignDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCreationOnboardingScreenDesignDto.writeToParcel(parcel, i);
        }
        GroupsCreationOnboardingScreenPostingDto groupsCreationOnboardingScreenPostingDto = this.screenPosting;
        if (groupsCreationOnboardingScreenPostingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCreationOnboardingScreenPostingDto.writeToParcel(parcel, i);
        }
        GroupsCreationOnboardingScreenSubscribersDto groupsCreationOnboardingScreenSubscribersDto = this.screenSubscribers;
        if (groupsCreationOnboardingScreenSubscribersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCreationOnboardingScreenSubscribersDto.writeToParcel(parcel, i);
        }
        GroupsCreationOnboardingScreenClipsDto groupsCreationOnboardingScreenClipsDto = this.screenClips;
        if (groupsCreationOnboardingScreenClipsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCreationOnboardingScreenClipsDto.writeToParcel(parcel, i);
        }
        GroupsCreationOnboardingScreenRegularPostingDto groupsCreationOnboardingScreenRegularPostingDto = this.screenRegularPosting;
        if (groupsCreationOnboardingScreenRegularPostingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCreationOnboardingScreenRegularPostingDto.writeToParcel(parcel, i);
        }
        GroupsCreationOnboardingScreenMarketItemsDto groupsCreationOnboardingScreenMarketItemsDto = this.screenMarketItems;
        if (groupsCreationOnboardingScreenMarketItemsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCreationOnboardingScreenMarketItemsDto.writeToParcel(parcel, i);
        }
        GroupsCreationOnboardingScreenFinishDto groupsCreationOnboardingScreenFinishDto = this.screenFinish;
        if (groupsCreationOnboardingScreenFinishDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCreationOnboardingScreenFinishDto.writeToParcel(parcel, i);
        }
    }

    public GroupsCreationOnboardingDto(TypeDto typeDto, ActiveScreenDto activeScreenDto, Boolean bool, GroupsCreationOnboardingScreenDesignDto groupsCreationOnboardingScreenDesignDto, GroupsCreationOnboardingScreenPostingDto groupsCreationOnboardingScreenPostingDto, GroupsCreationOnboardingScreenSubscribersDto groupsCreationOnboardingScreenSubscribersDto, GroupsCreationOnboardingScreenClipsDto groupsCreationOnboardingScreenClipsDto, GroupsCreationOnboardingScreenRegularPostingDto groupsCreationOnboardingScreenRegularPostingDto, GroupsCreationOnboardingScreenMarketItemsDto groupsCreationOnboardingScreenMarketItemsDto, GroupsCreationOnboardingScreenFinishDto groupsCreationOnboardingScreenFinishDto) {
        this.type = typeDto;
        this.activeScreen = activeScreenDto;
        this.isSkippable = bool;
        this.screenDesign = groupsCreationOnboardingScreenDesignDto;
        this.screenPosting = groupsCreationOnboardingScreenPostingDto;
        this.screenSubscribers = groupsCreationOnboardingScreenSubscribersDto;
        this.screenClips = groupsCreationOnboardingScreenClipsDto;
        this.screenRegularPosting = groupsCreationOnboardingScreenRegularPostingDto;
        this.screenMarketItems = groupsCreationOnboardingScreenMarketItemsDto;
        this.screenFinish = groupsCreationOnboardingScreenFinishDto;
    }

    public /* synthetic */ GroupsCreationOnboardingDto(TypeDto typeDto, ActiveScreenDto activeScreenDto, Boolean bool, GroupsCreationOnboardingScreenDesignDto groupsCreationOnboardingScreenDesignDto, GroupsCreationOnboardingScreenPostingDto groupsCreationOnboardingScreenPostingDto, GroupsCreationOnboardingScreenSubscribersDto groupsCreationOnboardingScreenSubscribersDto, GroupsCreationOnboardingScreenClipsDto groupsCreationOnboardingScreenClipsDto, GroupsCreationOnboardingScreenRegularPostingDto groupsCreationOnboardingScreenRegularPostingDto, GroupsCreationOnboardingScreenMarketItemsDto groupsCreationOnboardingScreenMarketItemsDto, GroupsCreationOnboardingScreenFinishDto groupsCreationOnboardingScreenFinishDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : typeDto, (i & 2) != 0 ? null : activeScreenDto, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : groupsCreationOnboardingScreenDesignDto, (i & 16) != 0 ? null : groupsCreationOnboardingScreenPostingDto, (i & 32) != 0 ? null : groupsCreationOnboardingScreenSubscribersDto, (i & 64) != 0 ? null : groupsCreationOnboardingScreenClipsDto, (i & 128) != 0 ? null : groupsCreationOnboardingScreenRegularPostingDto, (i & 256) != 0 ? null : groupsCreationOnboardingScreenMarketItemsDto, (i & 512) != 0 ? null : groupsCreationOnboardingScreenFinishDto);
    }
}
