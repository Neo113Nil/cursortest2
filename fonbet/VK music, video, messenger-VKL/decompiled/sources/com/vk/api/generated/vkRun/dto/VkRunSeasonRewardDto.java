package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.coremedia.iso.boxes.FreeBox;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkRunSeasonRewardDto.kt */
/* loaded from: classes15.dex */
public final class VkRunSeasonRewardDto implements Parcelable {
    public static final Parcelable.Creator<VkRunSeasonRewardDto> CREATOR = new a();

    @pmi0("conditions")
    private final String conditions;

    @pmi0("description")
    private final String description;

    @pmi0("extra_data")
    private final VkRunProductExtraDataDto extraData;

    @pmi0("group")
    private final GroupDto group;

    @pmi0("id")
    private final String id;

    @pmi0("image")
    private final VkRunImageUrlsDto image;

    @pmi0("is_opened")
    private final boolean isOpened;

    @pmi0("is_taken")
    private final boolean isTaken;

    @pmi0("short_title")
    private final String shortTitle;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkRunSeasonRewardDto.kt */
    public static final class GroupDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ GroupDto[] $VALUES;
        public static final Parcelable.Creator<GroupDto> CREATOR;

        @pmi0(FreeBox.TYPE)
        public static final GroupDto FREE;

        @pmi0("golden")
        public static final GroupDto GOLDEN;
        private final String value;

        /* compiled from: VkRunSeasonRewardDto.kt */
        public static final class a implements Parcelable.Creator<GroupDto> {
            @Override // android.os.Parcelable.Creator
            public final GroupDto createFromParcel(Parcel parcel) {
                return GroupDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GroupDto[] newArray(int i) {
                return new GroupDto[i];
            }
        }

        static {
            GroupDto groupDto = new GroupDto("FREE", 0, FreeBox.TYPE);
            FREE = groupDto;
            GroupDto groupDto2 = new GroupDto("GOLDEN", 1, "golden");
            GOLDEN = groupDto2;
            GroupDto[] groupDtoArr = {groupDto, groupDto2};
            $VALUES = groupDtoArr;
            $ENTRIES = new asp(groupDtoArr);
            CREATOR = new a();
        }

        private GroupDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static GroupDto valueOf(String str) {
            return (GroupDto) Enum.valueOf(GroupDto.class, str);
        }

        public static GroupDto[] values() {
            return (GroupDto[]) $VALUES.clone();
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
    /* compiled from: VkRunSeasonRewardDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("achievement")
        public static final TypeDto ACHIEVEMENT;

        @pmi0("box")
        public static final TypeDto BOX;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("emoji")
        public static final TypeDto EMOJI;

        @pmi0("lottery")
        public static final TypeDto LOTTERY;
        private final String value;

        /* compiled from: VkRunSeasonRewardDto.kt */
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
            TypeDto typeDto = new TypeDto("LOTTERY", 0, "lottery");
            LOTTERY = typeDto;
            TypeDto typeDto2 = new TypeDto("EMOJI", 1, "emoji");
            EMOJI = typeDto2;
            TypeDto typeDto3 = new TypeDto("ACHIEVEMENT", 2, "achievement");
            ACHIEVEMENT = typeDto3;
            TypeDto typeDto4 = new TypeDto("BOX", 3, "box");
            BOX = typeDto4;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4};
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

    /* compiled from: VkRunSeasonRewardDto.kt */
    public static final class a implements Parcelable.Creator<VkRunSeasonRewardDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonRewardDto createFromParcel(Parcel parcel) {
            return new VkRunSeasonRewardDto(parcel.readString(), TypeDto.CREATOR.createFromParcel(parcel), GroupDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (VkRunProductExtraDataDto) parcel.readParcelable(VkRunSeasonRewardDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : VkRunImageUrlsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonRewardDto[] newArray(int i) {
            return new VkRunSeasonRewardDto[i];
        }
    }

    public VkRunSeasonRewardDto(String str, TypeDto typeDto, GroupDto groupDto, String str2, String str3, String str4, boolean z, boolean z2, VkRunProductExtraDataDto vkRunProductExtraDataDto, String str5, VkRunImageUrlsDto vkRunImageUrlsDto) {
        this.id = str;
        this.type = typeDto;
        this.group = groupDto;
        this.title = str2;
        this.shortTitle = str3;
        this.description = str4;
        this.isOpened = z;
        this.isTaken = z2;
        this.extraData = vkRunProductExtraDataDto;
        this.conditions = str5;
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
        if (!(obj instanceof VkRunSeasonRewardDto)) {
            return false;
        }
        VkRunSeasonRewardDto vkRunSeasonRewardDto = (VkRunSeasonRewardDto) obj;
        return epx.f(this.id, vkRunSeasonRewardDto.id) && this.type == vkRunSeasonRewardDto.type && this.group == vkRunSeasonRewardDto.group && epx.f(this.title, vkRunSeasonRewardDto.title) && epx.f(this.shortTitle, vkRunSeasonRewardDto.shortTitle) && epx.f(this.description, vkRunSeasonRewardDto.description) && this.isOpened == vkRunSeasonRewardDto.isOpened && this.isTaken == vkRunSeasonRewardDto.isTaken && epx.f(this.extraData, vkRunSeasonRewardDto.extraData) && epx.f(this.conditions, vkRunSeasonRewardDto.conditions) && epx.f(this.image, vkRunSeasonRewardDto.image);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(urd0.a(urd0.a(urd0.a((this.group.hashCode() + ((this.type.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31, 31, this.title), 31, this.shortTitle), 31, this.description), 31, this.isOpened), 31, this.isTaken);
        VkRunProductExtraDataDto vkRunProductExtraDataDto = this.extraData;
        int hashCode = (b + (vkRunProductExtraDataDto == null ? 0 : vkRunProductExtraDataDto.hashCode())) * 31;
        String str = this.conditions;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        VkRunImageUrlsDto vkRunImageUrlsDto = this.image;
        return hashCode2 + (vkRunImageUrlsDto != null ? vkRunImageUrlsDto.hashCode() : 0);
    }

    public final String toString() {
        return "VkRunSeasonRewardDto(id=" + this.id + ", type=" + this.type + ", group=" + this.group + ", title=" + this.title + ", shortTitle=" + this.shortTitle + ", description=" + this.description + ", isOpened=" + this.isOpened + ", isTaken=" + this.isTaken + ", extraData=" + this.extraData + ", conditions=" + this.conditions + ", image=" + this.image + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        this.type.writeToParcel(parcel, i);
        this.group.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.shortTitle);
        parcel.writeString(this.description);
        parcel.writeInt(this.isOpened ? 1 : 0);
        parcel.writeInt(this.isTaken ? 1 : 0);
        parcel.writeParcelable(this.extraData, i);
        parcel.writeString(this.conditions);
        VkRunImageUrlsDto vkRunImageUrlsDto = this.image;
        if (vkRunImageUrlsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkRunImageUrlsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VkRunSeasonRewardDto(String str, TypeDto typeDto, GroupDto groupDto, String str2, String str3, String str4, boolean z, boolean z2, VkRunProductExtraDataDto vkRunProductExtraDataDto, String str5, VkRunImageUrlsDto vkRunImageUrlsDto, int i, zcl zclVar) {
        this(str, typeDto, groupDto, str2, str3, str4, z, z2, (i & 256) != 0 ? null : vkRunProductExtraDataDto, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : vkRunImageUrlsDto);
    }
}
