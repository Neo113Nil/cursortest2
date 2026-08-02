package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkRunGivDto.kt */
/* loaded from: classes15.dex */
public final class VkRunGivDto implements Parcelable {
    public static final Parcelable.Creator<VkRunGivDto> CREATOR = new a();

    @pmi0("accepted_invite_users")
    private final List<VkRunLeaderboardMemberUserDto> acceptedInviteUsers;

    @pmi0("badge_number")
    private final Integer badgeNumber;

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkRunGivDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("finished")
        public static final StatusDto FINISHED;

        @pmi0("in_progress")
        public static final StatusDto IN_PROGRESS;

        @pmi0("not_started")
        public static final StatusDto NOT_STARTED;

        @pmi0("waiting_for_results")
        public static final StatusDto WAITING_FOR_RESULTS;
        private final String value;

        /* compiled from: VkRunGivDto.kt */
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
            StatusDto statusDto = new StatusDto("NOT_STARTED", 0, "not_started");
            NOT_STARTED = statusDto;
            StatusDto statusDto2 = new StatusDto("IN_PROGRESS", 1, "in_progress");
            IN_PROGRESS = statusDto2;
            StatusDto statusDto3 = new StatusDto("WAITING_FOR_RESULTS", 2, "waiting_for_results");
            WAITING_FOR_RESULTS = statusDto3;
            StatusDto statusDto4 = new StatusDto("FINISHED", 3, "finished");
            FINISHED = statusDto4;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3, statusDto4};
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

    /* compiled from: VkRunGivDto.kt */
    public static final class a implements Parcelable.Creator<VkRunGivDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunGivDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            StatusDto createFromParcel = StatusDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(VkRunGivDto.class, parcel, arrayList, i, 1);
                }
            }
            return new VkRunGivDto(createFromParcel, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunGivDto[] newArray(int i) {
            return new VkRunGivDto[i];
        }
    }

    public VkRunGivDto(StatusDto statusDto, List<VkRunLeaderboardMemberUserDto> list, Integer num) {
        this.status = statusDto;
        this.acceptedInviteUsers = list;
        this.badgeNumber = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunGivDto)) {
            return false;
        }
        VkRunGivDto vkRunGivDto = (VkRunGivDto) obj;
        return this.status == vkRunGivDto.status && epx.f(this.acceptedInviteUsers, vkRunGivDto.acceptedInviteUsers) && epx.f(this.badgeNumber, vkRunGivDto.badgeNumber);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        List<VkRunLeaderboardMemberUserDto> list = this.acceptedInviteUsers;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.badgeNumber;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunGivDto(status=");
        sb.append(this.status);
        sb.append(", acceptedInviteUsers=");
        sb.append(this.acceptedInviteUsers);
        sb.append(", badgeNumber=");
        return uqi.b(sb, this.badgeNumber, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.status.writeToParcel(parcel, i);
        List<VkRunLeaderboardMemberUserDto> list = this.acceptedInviteUsers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num = this.badgeNumber;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ VkRunGivDto(StatusDto statusDto, List list, Integer num, int i, zcl zclVar) {
        this(statusDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num);
    }
}
