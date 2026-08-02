package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: EducationOrganizationTypeDto.kt */
/* loaded from: classes14.dex */
public final class EducationOrganizationTypeDto implements Parcelable {
    public static final Parcelable.Creator<EducationOrganizationTypeDto> CREATOR = new a();

    @pmi0("group")
    private final GroupDto group;

    @pmi0("id")
    private final int id;

    @pmi0("structure")
    private final StructureDto structure;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EducationOrganizationTypeDto.kt */
    public static final class GroupDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ GroupDto[] $VALUES;

        @pmi0("administrative")
        public static final GroupDto ADMINISTRATIVE;
        public static final Parcelable.Creator<GroupDto> CREATOR;

        @pmi0("culture")
        public static final GroupDto CULTURE;

        @pmi0("extra")
        public static final GroupDto EXTRA;

        @pmi0("federal")
        public static final GroupDto FEDERAL;

        @pmi0("high")
        public static final GroupDto HIGH;

        @pmi0("kindergarten")
        public static final GroupDto KINDERGARTEN;

        @pmi0("other")
        public static final GroupDto OTHER;

        @pmi0("school")
        public static final GroupDto SCHOOL;
        private final String value;

        /* compiled from: EducationOrganizationTypeDto.kt */
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
            GroupDto groupDto = new GroupDto("KINDERGARTEN", 0, "kindergarten");
            KINDERGARTEN = groupDto;
            GroupDto groupDto2 = new GroupDto("SCHOOL", 1, "school");
            SCHOOL = groupDto2;
            GroupDto groupDto3 = new GroupDto("EXTRA", 2, "extra");
            EXTRA = groupDto3;
            GroupDto groupDto4 = new GroupDto("HIGH", 3, "high");
            HIGH = groupDto4;
            GroupDto groupDto5 = new GroupDto("CULTURE", 4, "culture");
            CULTURE = groupDto5;
            GroupDto groupDto6 = new GroupDto(NativeAdContent.ViewTag.OTHER, 5, "other");
            OTHER = groupDto6;
            GroupDto groupDto7 = new GroupDto("FEDERAL", 6, "federal");
            FEDERAL = groupDto7;
            GroupDto groupDto8 = new GroupDto("ADMINISTRATIVE", 7, "administrative");
            ADMINISTRATIVE = groupDto8;
            GroupDto[] groupDtoArr = {groupDto, groupDto2, groupDto3, groupDto4, groupDto5, groupDto6, groupDto7, groupDto8};
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
    /* compiled from: EducationOrganizationTypeDto.kt */
    public static final class StructureDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StructureDto[] $VALUES;
        public static final Parcelable.Creator<StructureDto> CREATOR;

        @pmi0("horizontal")
        public static final StructureDto HORIZONTAL;

        @pmi0("vertical")
        public static final StructureDto VERTICAL;
        private final String value;

        /* compiled from: EducationOrganizationTypeDto.kt */
        public static final class a implements Parcelable.Creator<StructureDto> {
            @Override // android.os.Parcelable.Creator
            public final StructureDto createFromParcel(Parcel parcel) {
                return StructureDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StructureDto[] newArray(int i) {
                return new StructureDto[i];
            }
        }

        static {
            StructureDto structureDto = new StructureDto("VERTICAL", 0, "vertical");
            VERTICAL = structureDto;
            StructureDto structureDto2 = new StructureDto("HORIZONTAL", 1, "horizontal");
            HORIZONTAL = structureDto2;
            StructureDto[] structureDtoArr = {structureDto, structureDto2};
            $VALUES = structureDtoArr;
            $ENTRIES = new asp(structureDtoArr);
            CREATOR = new a();
        }

        private StructureDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StructureDto valueOf(String str) {
            return (StructureDto) Enum.valueOf(StructureDto.class, str);
        }

        public static StructureDto[] values() {
            return (StructureDto[]) $VALUES.clone();
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

    /* compiled from: EducationOrganizationTypeDto.kt */
    public static final class a implements Parcelable.Creator<EducationOrganizationTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationOrganizationTypeDto createFromParcel(Parcel parcel) {
            return new EducationOrganizationTypeDto(parcel.readInt(), parcel.readString(), StructureDto.CREATOR.createFromParcel(parcel), GroupDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EducationOrganizationTypeDto[] newArray(int i) {
            return new EducationOrganizationTypeDto[i];
        }
    }

    public EducationOrganizationTypeDto(int i, String str, StructureDto structureDto, GroupDto groupDto) {
        this.id = i;
        this.title = str;
        this.structure = structureDto;
        this.group = groupDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationOrganizationTypeDto)) {
            return false;
        }
        EducationOrganizationTypeDto educationOrganizationTypeDto = (EducationOrganizationTypeDto) obj;
        return this.id == educationOrganizationTypeDto.id && epx.f(this.title, educationOrganizationTypeDto.title) && this.structure == educationOrganizationTypeDto.structure && this.group == educationOrganizationTypeDto.group;
    }

    public final int hashCode() {
        return this.group.hashCode() + ((this.structure.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.title)) * 31);
    }

    public final String toString() {
        return "EducationOrganizationTypeDto(id=" + this.id + ", title=" + this.title + ", structure=" + this.structure + ", group=" + this.group + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        this.structure.writeToParcel(parcel, i);
        this.group.writeToParcel(parcel, i);
    }
}
