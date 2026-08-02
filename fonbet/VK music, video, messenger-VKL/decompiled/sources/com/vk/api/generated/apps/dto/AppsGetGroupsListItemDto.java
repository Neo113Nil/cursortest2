package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import com.vk.api.generated.groups.dto.GroupsGroupDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppsGetGroupsListItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetGroupsListItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetGroupsListItemDto> CREATOR = new a();

    @pmi0("can_install")
    private final boolean canInstall;

    @pmi0("group")
    private final GroupsGroupDto group;

    @pmi0("group_apps")
    private final List<AppsAppDto> groupApps;

    @pmi0("install_description")
    private final String installDescription;

    @pmi0("send_push_checkbox_state")
    private final SendPushCheckboxStateDto sendPushCheckboxState;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsGetGroupsListItemDto.kt */
    public static final class SendPushCheckboxStateDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SendPushCheckboxStateDto[] $VALUES;

        @pmi0("available")
        public static final SendPushCheckboxStateDto AVAILABLE;
        public static final Parcelable.Creator<SendPushCheckboxStateDto> CREATOR;

        @pmi0(C4217a2.e)
        public static final SendPushCheckboxStateDto DISABLED;

        @pmi0("hidden")
        public static final SendPushCheckboxStateDto HIDDEN;
        private final String value;

        /* compiled from: AppsGetGroupsListItemDto.kt */
        public static final class a implements Parcelable.Creator<SendPushCheckboxStateDto> {
            @Override // android.os.Parcelable.Creator
            public final SendPushCheckboxStateDto createFromParcel(Parcel parcel) {
                return SendPushCheckboxStateDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SendPushCheckboxStateDto[] newArray(int i) {
                return new SendPushCheckboxStateDto[i];
            }
        }

        static {
            SendPushCheckboxStateDto sendPushCheckboxStateDto = new SendPushCheckboxStateDto("AVAILABLE", 0, "available");
            AVAILABLE = sendPushCheckboxStateDto;
            SendPushCheckboxStateDto sendPushCheckboxStateDto2 = new SendPushCheckboxStateDto("DISABLED", 1, C4217a2.e);
            DISABLED = sendPushCheckboxStateDto2;
            SendPushCheckboxStateDto sendPushCheckboxStateDto3 = new SendPushCheckboxStateDto("HIDDEN", 2, "hidden");
            HIDDEN = sendPushCheckboxStateDto3;
            SendPushCheckboxStateDto[] sendPushCheckboxStateDtoArr = {sendPushCheckboxStateDto, sendPushCheckboxStateDto2, sendPushCheckboxStateDto3};
            $VALUES = sendPushCheckboxStateDtoArr;
            $ENTRIES = new asp(sendPushCheckboxStateDtoArr);
            CREATOR = new a();
        }

        private SendPushCheckboxStateDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SendPushCheckboxStateDto valueOf(String str) {
            return (SendPushCheckboxStateDto) Enum.valueOf(SendPushCheckboxStateDto.class, str);
        }

        public static SendPushCheckboxStateDto[] values() {
            return (SendPushCheckboxStateDto[]) $VALUES.clone();
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

    /* compiled from: AppsGetGroupsListItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetGroupsListItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetGroupsListItemDto createFromParcel(Parcel parcel) {
            int i = 0;
            boolean z = parcel.readInt() != 0;
            GroupsGroupDto createFromParcel = GroupsGroupDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (i != readInt) {
                i = bo.b(AppsGetGroupsListItemDto.class, parcel, arrayList, i, 1);
            }
            return new AppsGetGroupsListItemDto(z, createFromParcel, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : SendPushCheckboxStateDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetGroupsListItemDto[] newArray(int i) {
            return new AppsGetGroupsListItemDto[i];
        }
    }

    public AppsGetGroupsListItemDto(boolean z, GroupsGroupDto groupsGroupDto, List<AppsAppDto> list, String str, SendPushCheckboxStateDto sendPushCheckboxStateDto) {
        this.canInstall = z;
        this.group = groupsGroupDto;
        this.groupApps = list;
        this.installDescription = str;
        this.sendPushCheckboxState = sendPushCheckboxStateDto;
    }

    public final boolean d() {
        return this.canInstall;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsGroupDto e() {
        return this.group;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetGroupsListItemDto)) {
            return false;
        }
        AppsGetGroupsListItemDto appsGetGroupsListItemDto = (AppsGetGroupsListItemDto) obj;
        return this.canInstall == appsGetGroupsListItemDto.canInstall && epx.f(this.group, appsGetGroupsListItemDto.group) && epx.f(this.groupApps, appsGetGroupsListItemDto.groupApps) && epx.f(this.installDescription, appsGetGroupsListItemDto.installDescription) && this.sendPushCheckboxState == appsGetGroupsListItemDto.sendPushCheckboxState;
    }

    public final String f() {
        return this.installDescription;
    }

    public final SendPushCheckboxStateDto g() {
        return this.sendPushCheckboxState;
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a((this.group.hashCode() + (Boolean.hashCode(this.canInstall) * 31)) * 31, 31, this.groupApps), 31, this.installDescription);
        SendPushCheckboxStateDto sendPushCheckboxStateDto = this.sendPushCheckboxState;
        return a2 + (sendPushCheckboxStateDto == null ? 0 : sendPushCheckboxStateDto.hashCode());
    }

    public final String toString() {
        return "AppsGetGroupsListItemDto(canInstall=" + this.canInstall + ", group=" + this.group + ", groupApps=" + this.groupApps + ", installDescription=" + this.installDescription + ", sendPushCheckboxState=" + this.sendPushCheckboxState + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.canInstall ? 1 : 0);
        this.group.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.groupApps);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.installDescription);
        SendPushCheckboxStateDto sendPushCheckboxStateDto = this.sendPushCheckboxState;
        if (sendPushCheckboxStateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sendPushCheckboxStateDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsGetGroupsListItemDto(boolean z, GroupsGroupDto groupsGroupDto, List list, String str, SendPushCheckboxStateDto sendPushCheckboxStateDto, int i, zcl zclVar) {
        this(z, groupsGroupDto, list, str, (i & 16) != 0 ? null : sendPushCheckboxStateDto);
    }
}
