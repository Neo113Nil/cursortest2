package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.appWidgets.dto.AppWidgetsSomeWidgetDto;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsAppWidgetDto.kt */
/* loaded from: classes14.dex */
public final class GroupsAppWidgetDto implements Parcelable {
    public static final Parcelable.Creator<GroupsAppWidgetDto> CREATOR = new a();

    @pmi0("data")
    private final AppWidgetsSomeWidgetDto data;

    @pmi0("privacy")
    private final String privacy;

    @pmi0("privacy_code")
    private final PrivacyCodeDto privacyCode;

    @pmi0("type")
    private final Integer type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsAppWidgetDto.kt */
    public static final class PrivacyCodeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PrivacyCodeDto[] $VALUES;

        @pmi0("0")
        public static final PrivacyCodeDto ADMINS;
        public static final Parcelable.Creator<PrivacyCodeDto> CREATOR;

        @pmi0("2")
        public static final PrivacyCodeDto EVERYONE;

        @pmi0("3")
        public static final PrivacyCodeDto NO_ONE;

        @pmi0("1")
        public static final PrivacyCodeDto SUBSCRIBERS;
        private final int value;

        /* compiled from: GroupsAppWidgetDto.kt */
        public static final class a implements Parcelable.Creator<PrivacyCodeDto> {
            @Override // android.os.Parcelable.Creator
            public final PrivacyCodeDto createFromParcel(Parcel parcel) {
                return PrivacyCodeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PrivacyCodeDto[] newArray(int i) {
                return new PrivacyCodeDto[i];
            }
        }

        static {
            PrivacyCodeDto privacyCodeDto = new PrivacyCodeDto("ADMINS", 0, 0);
            ADMINS = privacyCodeDto;
            PrivacyCodeDto privacyCodeDto2 = new PrivacyCodeDto("SUBSCRIBERS", 1, 1);
            SUBSCRIBERS = privacyCodeDto2;
            PrivacyCodeDto privacyCodeDto3 = new PrivacyCodeDto("EVERYONE", 2, 2);
            EVERYONE = privacyCodeDto3;
            PrivacyCodeDto privacyCodeDto4 = new PrivacyCodeDto("NO_ONE", 3, 3);
            NO_ONE = privacyCodeDto4;
            PrivacyCodeDto[] privacyCodeDtoArr = {privacyCodeDto, privacyCodeDto2, privacyCodeDto3, privacyCodeDto4};
            $VALUES = privacyCodeDtoArr;
            $ENTRIES = new asp(privacyCodeDtoArr);
            CREATOR = new a();
        }

        private PrivacyCodeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static PrivacyCodeDto valueOf(String str) {
            return (PrivacyCodeDto) Enum.valueOf(PrivacyCodeDto.class, str);
        }

        public static PrivacyCodeDto[] values() {
            return (PrivacyCodeDto[]) $VALUES.clone();
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

    /* compiled from: GroupsAppWidgetDto.kt */
    public static final class a implements Parcelable.Creator<GroupsAppWidgetDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsAppWidgetDto createFromParcel(Parcel parcel) {
            return new GroupsAppWidgetDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (AppWidgetsSomeWidgetDto) parcel.readParcelable(GroupsAppWidgetDto.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? PrivacyCodeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsAppWidgetDto[] newArray(int i) {
            return new GroupsAppWidgetDto[i];
        }
    }

    public GroupsAppWidgetDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsAppWidgetDto)) {
            return false;
        }
        GroupsAppWidgetDto groupsAppWidgetDto = (GroupsAppWidgetDto) obj;
        return epx.f(this.type, groupsAppWidgetDto.type) && epx.f(this.data, groupsAppWidgetDto.data) && epx.f(this.privacy, groupsAppWidgetDto.privacy) && this.privacyCode == groupsAppWidgetDto.privacyCode;
    }

    public final int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        AppWidgetsSomeWidgetDto appWidgetsSomeWidgetDto = this.data;
        int hashCode2 = (hashCode + (appWidgetsSomeWidgetDto == null ? 0 : appWidgetsSomeWidgetDto.hashCode())) * 31;
        String str = this.privacy;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PrivacyCodeDto privacyCodeDto = this.privacyCode;
        return hashCode3 + (privacyCodeDto != null ? privacyCodeDto.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsAppWidgetDto(type=" + this.type + ", data=" + this.data + ", privacy=" + this.privacy + ", privacyCode=" + this.privacyCode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.data, i);
        parcel.writeString(this.privacy);
        PrivacyCodeDto privacyCodeDto = this.privacyCode;
        if (privacyCodeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            privacyCodeDto.writeToParcel(parcel, i);
        }
    }

    public GroupsAppWidgetDto(Integer num, AppWidgetsSomeWidgetDto appWidgetsSomeWidgetDto, String str, PrivacyCodeDto privacyCodeDto) {
        this.type = num;
        this.data = appWidgetsSomeWidgetDto;
        this.privacy = str;
        this.privacyCode = privacyCodeDto;
    }

    public /* synthetic */ GroupsAppWidgetDto(Integer num, AppWidgetsSomeWidgetDto appWidgetsSomeWidgetDto, String str, PrivacyCodeDto privacyCodeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : appWidgetsSomeWidgetDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : privacyCodeDto);
    }
}
