package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: GroupsDonutFriendsBannerDto.kt */
/* loaded from: classes14.dex */
public final class GroupsDonutFriendsBannerDto implements Parcelable {
    public static final Parcelable.Creator<GroupsDonutFriendsBannerDto> CREATOR = new a();

    @pmi0("action_type")
    private final ActionTypeDto actionType;

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("location")
    private final String location;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsDonutFriendsBannerDto.kt */
    public static final class ActionTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionTypeDto[] $VALUES;
        public static final Parcelable.Creator<ActionTypeDto> CREATOR;

        @pmi0("regular")
        public static final ActionTypeDto REGULAR;

        @pmi0("trial")
        public static final ActionTypeDto TRIAL;
        private final String value;

        /* compiled from: GroupsDonutFriendsBannerDto.kt */
        public static final class a implements Parcelable.Creator<ActionTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ActionTypeDto createFromParcel(Parcel parcel) {
                return ActionTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActionTypeDto[] newArray(int i) {
                return new ActionTypeDto[i];
            }
        }

        static {
            ActionTypeDto actionTypeDto = new ActionTypeDto("TRIAL", 0, "trial");
            TRIAL = actionTypeDto;
            ActionTypeDto actionTypeDto2 = new ActionTypeDto("REGULAR", 1, "regular");
            REGULAR = actionTypeDto2;
            ActionTypeDto[] actionTypeDtoArr = {actionTypeDto, actionTypeDto2};
            $VALUES = actionTypeDtoArr;
            $ENTRIES = new asp(actionTypeDtoArr);
            CREATOR = new a();
        }

        private ActionTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ActionTypeDto valueOf(String str) {
            return (ActionTypeDto) Enum.valueOf(ActionTypeDto.class, str);
        }

        public static ActionTypeDto[] values() {
            return (ActionTypeDto[]) $VALUES.clone();
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

    /* compiled from: GroupsDonutFriendsBannerDto.kt */
    public static final class a implements Parcelable.Creator<GroupsDonutFriendsBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsDonutFriendsBannerDto createFromParcel(Parcel parcel) {
            return new GroupsDonutFriendsBannerDto(parcel.readString(), parcel.readString(), parcel.readString(), ActionTypeDto.CREATOR.createFromParcel(parcel), (BaseLinkButtonDto) parcel.readParcelable(GroupsDonutFriendsBannerDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsDonutFriendsBannerDto[] newArray(int i) {
            return new GroupsDonutFriendsBannerDto[i];
        }
    }

    public GroupsDonutFriendsBannerDto(String str, String str2, String str3, ActionTypeDto actionTypeDto, BaseLinkButtonDto baseLinkButtonDto) {
        this.location = str;
        this.title = str2;
        this.subtitle = str3;
        this.actionType = actionTypeDto;
        this.button = baseLinkButtonDto;
    }

    public final ActionTypeDto d() {
        return this.actionType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseLinkButtonDto e() {
        return this.button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsDonutFriendsBannerDto)) {
            return false;
        }
        GroupsDonutFriendsBannerDto groupsDonutFriendsBannerDto = (GroupsDonutFriendsBannerDto) obj;
        return epx.f(this.location, groupsDonutFriendsBannerDto.location) && epx.f(this.title, groupsDonutFriendsBannerDto.title) && epx.f(this.subtitle, groupsDonutFriendsBannerDto.subtitle) && this.actionType == groupsDonutFriendsBannerDto.actionType && epx.f(this.button, groupsDonutFriendsBannerDto.button);
    }

    public final String f() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.button.hashCode() + ((this.actionType.hashCode() + urd0.a(urd0.a(this.location.hashCode() * 31, 31, this.title), 31, this.subtitle)) * 31);
    }

    public final String toString() {
        return "GroupsDonutFriendsBannerDto(location=" + this.location + ", title=" + this.title + ", subtitle=" + this.subtitle + ", actionType=" + this.actionType + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.location);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        this.actionType.writeToParcel(parcel, i);
        parcel.writeParcelable(this.button, i);
    }
}
