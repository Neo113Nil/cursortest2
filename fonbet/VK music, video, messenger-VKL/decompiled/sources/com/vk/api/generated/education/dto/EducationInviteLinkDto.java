package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: EducationInviteLinkDto.kt */
/* loaded from: classes14.dex */
public final class EducationInviteLinkDto implements Parcelable {
    public static final Parcelable.Creator<EducationInviteLinkDto> CREATOR = new a();

    @pmi0("date")
    private final int date;

    @pmi0("expire_count")
    private final int expireCount;

    @pmi0("expire_time")
    private final int expireTime;

    @pmi0("expire_time_end")
    private final int expireTimeEnd;

    @pmi0("grade_ids")
    private final List<Integer> gradeIds;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("id")
    private final String id;

    @pmi0("invited_count")
    private final int invitedCount;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("role")
    private final EducationGradeRoleDto role;

    @pmi0("role_description")
    private final String roleDescription;

    @pmi0("role_detail")
    private final Integer roleDetail;

    /* compiled from: EducationInviteLinkDto.kt */
    public static final class a implements Parcelable.Creator<EducationInviteLinkDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationInviteLinkDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(EducationInviteLinkDto.class.getClassLoader());
            UserId userId2 = (UserId) parcel.readParcelable(EducationInviteLinkDto.class.getClassLoader());
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList = new ArrayList(readInt6);
                int i = 0;
                while (i != readInt6) {
                    i = pm0.b(parcel, arrayList, i, 1);
                }
            }
            return new EducationInviteLinkDto(readString, readInt, userId, userId2, readInt2, readInt3, readInt4, readInt5, arrayList, parcel.readInt() == 0 ? null : EducationGradeRoleDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationInviteLinkDto[] newArray(int i) {
            return new EducationInviteLinkDto[i];
        }
    }

    public EducationInviteLinkDto(String str, int i, UserId userId, UserId userId2, int i2, int i3, int i4, int i5, List<Integer> list, EducationGradeRoleDto educationGradeRoleDto, Integer num, String str2) {
        this.id = str;
        this.date = i;
        this.groupId = userId;
        this.ownerId = userId2;
        this.expireTime = i2;
        this.expireTimeEnd = i3;
        this.expireCount = i4;
        this.invitedCount = i5;
        this.gradeIds = list;
        this.role = educationGradeRoleDto;
        this.roleDetail = num;
        this.roleDescription = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationInviteLinkDto)) {
            return false;
        }
        EducationInviteLinkDto educationInviteLinkDto = (EducationInviteLinkDto) obj;
        return epx.f(this.id, educationInviteLinkDto.id) && this.date == educationInviteLinkDto.date && epx.f(this.groupId, educationInviteLinkDto.groupId) && epx.f(this.ownerId, educationInviteLinkDto.ownerId) && this.expireTime == educationInviteLinkDto.expireTime && this.expireTimeEnd == educationInviteLinkDto.expireTimeEnd && this.expireCount == educationInviteLinkDto.expireCount && this.invitedCount == educationInviteLinkDto.invitedCount && epx.f(this.gradeIds, educationInviteLinkDto.gradeIds) && this.role == educationInviteLinkDto.role && epx.f(this.roleDetail, educationInviteLinkDto.roleDetail) && epx.f(this.roleDescription, educationInviteLinkDto.roleDescription);
    }

    public final int hashCode() {
        int a2 = shy.a(this.invitedCount, shy.a(this.expireCount, shy.a(this.expireTimeEnd, shy.a(this.expireTime, bh10.a(bh10.a(shy.a(this.date, this.id.hashCode() * 31, 31), 31, this.groupId.b), 31, this.ownerId.b), 31), 31), 31), 31);
        List<Integer> list = this.gradeIds;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        EducationGradeRoleDto educationGradeRoleDto = this.role;
        int hashCode2 = (hashCode + (educationGradeRoleDto == null ? 0 : educationGradeRoleDto.hashCode())) * 31;
        Integer num = this.roleDetail;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.roleDescription;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationInviteLinkDto(id=");
        sb.append(this.id);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", expireTime=");
        sb.append(this.expireTime);
        sb.append(", expireTimeEnd=");
        sb.append(this.expireTimeEnd);
        sb.append(", expireCount=");
        sb.append(this.expireCount);
        sb.append(", invitedCount=");
        sb.append(this.invitedCount);
        sb.append(", gradeIds=");
        sb.append(this.gradeIds);
        sb.append(", role=");
        sb.append(this.role);
        sb.append(", roleDetail=");
        sb.append(this.roleDetail);
        sb.append(", roleDescription=");
        return ho8.a(sb, this.roleDescription, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeInt(this.date);
        parcel.writeParcelable(this.groupId, i);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.expireTime);
        parcel.writeInt(this.expireTimeEnd);
        parcel.writeInt(this.expireCount);
        parcel.writeInt(this.invitedCount);
        List<Integer> list = this.gradeIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        EducationGradeRoleDto educationGradeRoleDto = this.role;
        if (educationGradeRoleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            educationGradeRoleDto.writeToParcel(parcel, i);
        }
        Integer num = this.roleDetail;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.roleDescription);
    }

    public /* synthetic */ EducationInviteLinkDto(String str, int i, UserId userId, UserId userId2, int i2, int i3, int i4, int i5, List list, EducationGradeRoleDto educationGradeRoleDto, Integer num, String str2, int i6, zcl zclVar) {
        this(str, i, userId, userId2, i2, i3, i4, i5, (i6 & 256) != 0 ? null : list, (i6 & 512) != 0 ? null : educationGradeRoleDto, (i6 & 1024) != 0 ? null : num, (i6 & 2048) != 0 ? null : str2);
    }
}
