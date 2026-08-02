package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoDuetDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoDuetDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoDuetDto> CREATOR = new a();

    @pmi0("end_screen_title")
    private final String endScreenTitle;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("owner_name_case_ins")
    private final String ownerNameCaseIns;

    @pmi0("video_id")
    private final Integer videoId;

    /* compiled from: ShortVideoDuetDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoDuetDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoDuetDto createFromParcel(Parcel parcel) {
            return new ShortVideoDuetDto((UserId) parcel.readParcelable(ShortVideoDuetDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoDuetDto[] newArray(int i) {
            return new ShortVideoDuetDto[i];
        }
    }

    public ShortVideoDuetDto() {
        this(null, null, null, null, 15, null);
    }

    public final String d() {
        return this.ownerNameCaseIns;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.videoId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoDuetDto)) {
            return false;
        }
        ShortVideoDuetDto shortVideoDuetDto = (ShortVideoDuetDto) obj;
        return epx.f(this.ownerId, shortVideoDuetDto.ownerId) && epx.f(this.videoId, shortVideoDuetDto.videoId) && epx.f(this.ownerNameCaseIns, shortVideoDuetDto.ownerNameCaseIns) && epx.f(this.endScreenTitle, shortVideoDuetDto.endScreenTitle);
    }

    public final int hashCode() {
        UserId userId = this.ownerId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        Integer num = this.videoId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.ownerNameCaseIns;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endScreenTitle;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoDuetDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", ownerNameCaseIns=");
        sb.append(this.ownerNameCaseIns);
        sb.append(", endScreenTitle=");
        return ho8.a(sb, this.endScreenTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        Integer num = this.videoId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.ownerNameCaseIns);
        parcel.writeString(this.endScreenTitle);
    }

    public ShortVideoDuetDto(UserId userId, Integer num, String str, String str2) {
        this.ownerId = userId;
        this.videoId = num;
        this.ownerNameCaseIns = str;
        this.endScreenTitle = str2;
    }

    public /* synthetic */ ShortVideoDuetDto(UserId userId, Integer num, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
