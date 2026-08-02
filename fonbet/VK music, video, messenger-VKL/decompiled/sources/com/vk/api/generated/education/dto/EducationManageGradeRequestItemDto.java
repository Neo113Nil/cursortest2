package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: EducationManageGradeRequestItemDto.kt */
/* loaded from: classes14.dex */
public final class EducationManageGradeRequestItemDto implements Parcelable {
    public static final Parcelable.Creator<EducationManageGradeRequestItemDto> CREATOR = new a();

    @pmi0("grade_id")
    private final Integer gradeId;

    @pmi0("result")
    private final boolean result;

    @pmi0("role")
    private final EducationGradeRoleDto role;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: EducationManageGradeRequestItemDto.kt */
    public static final class a implements Parcelable.Creator<EducationManageGradeRequestItemDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationManageGradeRequestItemDto createFromParcel(Parcel parcel) {
            return new EducationManageGradeRequestItemDto((UserId) parcel.readParcelable(EducationManageGradeRequestItemDto.class.getClassLoader()), EducationGradeRoleDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final EducationManageGradeRequestItemDto[] newArray(int i) {
            return new EducationManageGradeRequestItemDto[i];
        }
    }

    public EducationManageGradeRequestItemDto(UserId userId, EducationGradeRoleDto educationGradeRoleDto, boolean z, Integer num) {
        this.userId = userId;
        this.role = educationGradeRoleDto;
        this.result = z;
        this.gradeId = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationManageGradeRequestItemDto)) {
            return false;
        }
        EducationManageGradeRequestItemDto educationManageGradeRequestItemDto = (EducationManageGradeRequestItemDto) obj;
        return epx.f(this.userId, educationManageGradeRequestItemDto.userId) && this.role == educationManageGradeRequestItemDto.role && this.result == educationManageGradeRequestItemDto.result && epx.f(this.gradeId, educationManageGradeRequestItemDto.gradeId);
    }

    public final int hashCode() {
        int b = qoy.b((this.role.hashCode() + (Long.hashCode(this.userId.b) * 31)) * 31, 31, this.result);
        Integer num = this.gradeId;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationManageGradeRequestItemDto(userId=");
        sb.append(this.userId);
        sb.append(", role=");
        sb.append(this.role);
        sb.append(", result=");
        sb.append(this.result);
        sb.append(", gradeId=");
        return uqi.b(sb, this.gradeId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.userId, i);
        this.role.writeToParcel(parcel, i);
        parcel.writeInt(this.result ? 1 : 0);
        Integer num = this.gradeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ EducationManageGradeRequestItemDto(UserId userId, EducationGradeRoleDto educationGradeRoleDto, boolean z, Integer num, int i, zcl zclVar) {
        this(userId, educationGradeRoleDto, z, (i & 8) != 0 ? null : num);
    }
}
