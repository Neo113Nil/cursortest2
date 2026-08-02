package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.b;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsSuggestionDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSuggestionDto implements Parcelable {
    public static final Parcelable.Creator<GroupsSuggestionDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("group")
    private final GroupsGroupFullDto group;

    @pmi0("reason")
    private final ReasonDto reason;

    @pmi0("track_code")
    private final String trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsSuggestionDto.kt */
    public static final class ReasonDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ReasonDto[] $VALUES;

        @pmi0(b.JSON_KEY_ADS)
        public static final ReasonDto ADS;
        public static final Parcelable.Creator<ReasonDto> CREATOR;

        @pmi0(X3.i.Z)
        public static final ReasonDto MAIN;

        @pmi0("similar")
        public static final ReasonDto SIMILAR;
        private final String value;

        /* compiled from: GroupsSuggestionDto.kt */
        public static final class a implements Parcelable.Creator<ReasonDto> {
            @Override // android.os.Parcelable.Creator
            public final ReasonDto createFromParcel(Parcel parcel) {
                return ReasonDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ReasonDto[] newArray(int i) {
                return new ReasonDto[i];
            }
        }

        static {
            ReasonDto reasonDto = new ReasonDto("SIMILAR", 0, "similar");
            SIMILAR = reasonDto;
            ReasonDto reasonDto2 = new ReasonDto("ADS", 1, b.JSON_KEY_ADS);
            ADS = reasonDto2;
            ReasonDto reasonDto3 = new ReasonDto("MAIN", 2, X3.i.Z);
            MAIN = reasonDto3;
            ReasonDto[] reasonDtoArr = {reasonDto, reasonDto2, reasonDto3};
            $VALUES = reasonDtoArr;
            $ENTRIES = new asp(reasonDtoArr);
            CREATOR = new a();
        }

        private ReasonDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ReasonDto valueOf(String str) {
            return (ReasonDto) Enum.valueOf(ReasonDto.class, str);
        }

        public static ReasonDto[] values() {
            return (ReasonDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: GroupsSuggestionDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSuggestionDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSuggestionDto createFromParcel(Parcel parcel) {
            return new GroupsSuggestionDto((GroupsGroupFullDto) parcel.readParcelable(GroupsSuggestionDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ReasonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSuggestionDto[] newArray(int i) {
            return new GroupsSuggestionDto[i];
        }
    }

    public GroupsSuggestionDto(GroupsGroupFullDto groupsGroupFullDto, String str, String str2, ReasonDto reasonDto) {
        this.group = groupsGroupFullDto;
        this.trackCode = str;
        this.description = str2;
        this.reason = reasonDto;
    }

    public final GroupsGroupFullDto d() {
        return this.group;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ReasonDto e() {
        return this.reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsSuggestionDto)) {
            return false;
        }
        GroupsSuggestionDto groupsSuggestionDto = (GroupsSuggestionDto) obj;
        return epx.f(this.group, groupsSuggestionDto.group) && epx.f(this.trackCode, groupsSuggestionDto.trackCode) && epx.f(this.description, groupsSuggestionDto.description) && this.reason == groupsSuggestionDto.reason;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.group.hashCode() * 31, 31, this.trackCode), 31, this.description);
        ReasonDto reasonDto = this.reason;
        return a2 + (reasonDto == null ? 0 : reasonDto.hashCode());
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "GroupsSuggestionDto(group=" + this.group + ", trackCode=" + this.trackCode + ", description=" + this.description + ", reason=" + this.reason + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.group, i);
        parcel.writeString(this.trackCode);
        parcel.writeString(this.description);
        ReasonDto reasonDto = this.reason;
        if (reasonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reasonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsSuggestionDto(GroupsGroupFullDto groupsGroupFullDto, String str, String str2, ReasonDto reasonDto, int i, zcl zclVar) {
        this(groupsGroupFullDto, str, str2, (i & 8) != 0 ? null : reasonDto);
    }
}
