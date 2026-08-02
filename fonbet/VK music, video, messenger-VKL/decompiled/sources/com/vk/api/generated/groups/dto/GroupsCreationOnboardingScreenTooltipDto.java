package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: GroupsCreationOnboardingScreenTooltipDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreationOnboardingScreenTooltipDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCreationOnboardingScreenTooltipDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsCreationOnboardingScreenTooltipDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("market_item")
        public static final TypeDto MARKET_ITEM;

        @pmi0("post")
        public static final TypeDto POST;

        @pmi0("share_post")
        public static final TypeDto SHARE_POST;
        private final String value;

        /* compiled from: GroupsCreationOnboardingScreenTooltipDto.kt */
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
            TypeDto typeDto = new TypeDto("MARKET_ITEM", 0, "market_item");
            MARKET_ITEM = typeDto;
            TypeDto typeDto2 = new TypeDto("POST", 1, "post");
            POST = typeDto2;
            TypeDto typeDto3 = new TypeDto("SHARE_POST", 2, "share_post");
            SHARE_POST = typeDto3;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3};
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

    /* compiled from: GroupsCreationOnboardingScreenTooltipDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreationOnboardingScreenTooltipDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenTooltipDto createFromParcel(Parcel parcel) {
            return new GroupsCreationOnboardingScreenTooltipDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenTooltipDto[] newArray(int i) {
            return new GroupsCreationOnboardingScreenTooltipDto[i];
        }
    }

    public GroupsCreationOnboardingScreenTooltipDto(TypeDto typeDto, String str) {
        this.type = typeDto;
        this.text = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCreationOnboardingScreenTooltipDto)) {
            return false;
        }
        GroupsCreationOnboardingScreenTooltipDto groupsCreationOnboardingScreenTooltipDto = (GroupsCreationOnboardingScreenTooltipDto) obj;
        return this.type == groupsCreationOnboardingScreenTooltipDto.type && epx.f(this.text, groupsCreationOnboardingScreenTooltipDto.text);
    }

    public final int hashCode() {
        return this.text.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsCreationOnboardingScreenTooltipDto(type=");
        sb.append(this.type);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.text);
    }
}
