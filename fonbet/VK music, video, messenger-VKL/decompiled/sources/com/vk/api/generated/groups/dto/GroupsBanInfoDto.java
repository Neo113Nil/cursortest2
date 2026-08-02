package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: GroupsBanInfoDto.kt */
/* loaded from: classes14.dex */
public final class GroupsBanInfoDto implements Parcelable {
    public static final Parcelable.Creator<GroupsBanInfoDto> CREATOR = new a();

    @pmi0("admin_id")
    private final Integer adminId;

    @pmi0("comment")
    private final String comment;

    @pmi0("comment_visible")
    private final Boolean commentVisible;

    @pmi0("date")
    private final Integer date;

    @pmi0("end_date")
    private final Integer endDate;

    @pmi0("is_closed")
    private final Boolean isClosed;

    @pmi0("reason")
    private final GroupsBanInfoReasonDto reason;

    /* compiled from: GroupsBanInfoDto.kt */
    public static final class a implements Parcelable.Creator<GroupsBanInfoDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final GroupsBanInfoDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer num;
            Object obj;
            Object obj2;
            if (parcel.readInt() == 0) {
                valueOf = null;
                num = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                num = null;
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                obj = num;
            } else {
                obj = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                obj2 = num;
            } else {
                obj2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf2 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new GroupsBanInfoDto(valueOf, readString, obj, obj2, valueOf2, num, (GroupsBanInfoReasonDto) parcel.readParcelable(GroupsBanInfoDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsBanInfoDto[] newArray(int i) {
            return new GroupsBanInfoDto[i];
        }
    }

    public GroupsBanInfoDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final Integer d() {
        return this.adminId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.comment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsBanInfoDto)) {
            return false;
        }
        GroupsBanInfoDto groupsBanInfoDto = (GroupsBanInfoDto) obj;
        return epx.f(this.adminId, groupsBanInfoDto.adminId) && epx.f(this.comment, groupsBanInfoDto.comment) && epx.f(this.commentVisible, groupsBanInfoDto.commentVisible) && epx.f(this.isClosed, groupsBanInfoDto.isClosed) && epx.f(this.date, groupsBanInfoDto.date) && epx.f(this.endDate, groupsBanInfoDto.endDate) && this.reason == groupsBanInfoDto.reason;
    }

    public final Boolean f() {
        return this.commentVisible;
    }

    public final Integer g() {
        return this.date;
    }

    public final int hashCode() {
        Integer num = this.adminId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.comment;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.commentVisible;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isClosed;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.date;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.endDate;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        GroupsBanInfoReasonDto groupsBanInfoReasonDto = this.reason;
        return hashCode6 + (groupsBanInfoReasonDto != null ? groupsBanInfoReasonDto.hashCode() : 0);
    }

    public final Integer i() {
        return this.endDate;
    }

    public final GroupsBanInfoReasonDto j() {
        return this.reason;
    }

    public final String toString() {
        return "GroupsBanInfoDto(adminId=" + this.adminId + ", comment=" + this.comment + ", commentVisible=" + this.commentVisible + ", isClosed=" + this.isClosed + ", date=" + this.date + ", endDate=" + this.endDate + ", reason=" + this.reason + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.adminId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.comment);
        Boolean bool = this.commentVisible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isClosed;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num2 = this.date;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.endDate;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeParcelable(this.reason, i);
    }

    public GroupsBanInfoDto(Integer num, String str, Boolean bool, Boolean bool2, Integer num2, Integer num3, GroupsBanInfoReasonDto groupsBanInfoReasonDto) {
        this.adminId = num;
        this.comment = str;
        this.commentVisible = bool;
        this.isClosed = bool2;
        this.date = num2;
        this.endDate = num3;
        this.reason = groupsBanInfoReasonDto;
    }

    public /* synthetic */ GroupsBanInfoDto(Integer num, String str, Boolean bool, Boolean bool2, Integer num2, Integer num3, GroupsBanInfoReasonDto groupsBanInfoReasonDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : groupsBanInfoReasonDto);
    }
}
