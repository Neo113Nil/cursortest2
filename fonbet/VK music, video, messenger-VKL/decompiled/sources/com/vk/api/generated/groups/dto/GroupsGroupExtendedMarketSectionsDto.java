package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsGroupExtendedMarketSectionsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupExtendedMarketSectionsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupExtendedMarketSectionsDto> CREATOR = new a();

    @pmi0("back_button")
    private final String backButton;

    @pmi0("ok_button")
    private final String okButton;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsGroupExtendedMarketSectionsDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("2")
        public static final StatusDto AVAILABLE;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("0")
        public static final StatusDto DISABLED;

        @pmi0("1")
        public static final StatusDto ENABLED;
        private final int value;

        /* compiled from: GroupsGroupExtendedMarketSectionsDto.kt */
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
            StatusDto statusDto = new StatusDto("DISABLED", 0, 0);
            DISABLED = statusDto;
            StatusDto statusDto2 = new StatusDto("ENABLED", 1, 1);
            ENABLED = statusDto2;
            StatusDto statusDto3 = new StatusDto("AVAILABLE", 2, 2);
            AVAILABLE = statusDto3;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, int i2) {
            this.value = i2;
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

    /* compiled from: GroupsGroupExtendedMarketSectionsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupExtendedMarketSectionsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupExtendedMarketSectionsDto createFromParcel(Parcel parcel) {
            return new GroupsGroupExtendedMarketSectionsDto(StatusDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupExtendedMarketSectionsDto[] newArray(int i) {
            return new GroupsGroupExtendedMarketSectionsDto[i];
        }
    }

    public GroupsGroupExtendedMarketSectionsDto(StatusDto statusDto, String str, String str2, String str3, String str4) {
        this.status = statusDto;
        this.title = str;
        this.text = str2;
        this.okButton = str3;
        this.backButton = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupExtendedMarketSectionsDto)) {
            return false;
        }
        GroupsGroupExtendedMarketSectionsDto groupsGroupExtendedMarketSectionsDto = (GroupsGroupExtendedMarketSectionsDto) obj;
        return this.status == groupsGroupExtendedMarketSectionsDto.status && epx.f(this.title, groupsGroupExtendedMarketSectionsDto.title) && epx.f(this.text, groupsGroupExtendedMarketSectionsDto.text) && epx.f(this.okButton, groupsGroupExtendedMarketSectionsDto.okButton) && epx.f(this.backButton, groupsGroupExtendedMarketSectionsDto.backButton);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.okButton;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backButton;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupExtendedMarketSectionsDto(status=");
        sb.append(this.status);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", okButton=");
        sb.append(this.okButton);
        sb.append(", backButton=");
        return ho8.a(sb, this.backButton, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.status.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.okButton);
        parcel.writeString(this.backButton);
    }

    public /* synthetic */ GroupsGroupExtendedMarketSectionsDto(StatusDto statusDto, String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this(statusDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
