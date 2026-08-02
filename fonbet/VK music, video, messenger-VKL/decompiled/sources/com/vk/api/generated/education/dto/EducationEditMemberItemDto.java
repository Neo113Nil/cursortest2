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

/* compiled from: EducationEditMemberItemDto.kt */
/* loaded from: classes14.dex */
public final class EducationEditMemberItemDto implements Parcelable {
    public static final Parcelable.Creator<EducationEditMemberItemDto> CREATOR = new a();

    @pmi0("grade_id")
    private final Integer gradeId;

    @pmi0("result")
    private final boolean result;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: EducationEditMemberItemDto.kt */
    public static final class a implements Parcelable.Creator<EducationEditMemberItemDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationEditMemberItemDto createFromParcel(Parcel parcel) {
            return new EducationEditMemberItemDto((UserId) parcel.readParcelable(EducationEditMemberItemDto.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final EducationEditMemberItemDto[] newArray(int i) {
            return new EducationEditMemberItemDto[i];
        }
    }

    public EducationEditMemberItemDto(UserId userId, boolean z, Integer num) {
        this.userId = userId;
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
        if (!(obj instanceof EducationEditMemberItemDto)) {
            return false;
        }
        EducationEditMemberItemDto educationEditMemberItemDto = (EducationEditMemberItemDto) obj;
        return epx.f(this.userId, educationEditMemberItemDto.userId) && this.result == educationEditMemberItemDto.result && epx.f(this.gradeId, educationEditMemberItemDto.gradeId);
    }

    public final int hashCode() {
        int b = qoy.b(Long.hashCode(this.userId.b) * 31, 31, this.result);
        Integer num = this.gradeId;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationEditMemberItemDto(userId=");
        sb.append(this.userId);
        sb.append(", result=");
        sb.append(this.result);
        sb.append(", gradeId=");
        return uqi.b(sb, this.gradeId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.userId, i);
        parcel.writeInt(this.result ? 1 : 0);
        Integer num = this.gradeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ EducationEditMemberItemDto(UserId userId, boolean z, Integer num, int i, zcl zclVar) {
        this(userId, z, (i & 4) != 0 ? null : num);
    }
}
