package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsBanInfoReasonDto;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: ChannelsBanInfoDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsBanInfoDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsBanInfoDto> CREATOR = new a();

    @pmi0("comment")
    private final String comment;

    @pmi0("end_date")
    private final Integer endDate;

    @pmi0("reason")
    private final GroupsBanInfoReasonDto reason;

    /* compiled from: ChannelsBanInfoDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsBanInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsBanInfoDto createFromParcel(Parcel parcel) {
            return new ChannelsBanInfoDto((GroupsBanInfoReasonDto) parcel.readParcelable(ChannelsBanInfoDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsBanInfoDto[] newArray(int i) {
            return new ChannelsBanInfoDto[i];
        }
    }

    public ChannelsBanInfoDto(GroupsBanInfoReasonDto groupsBanInfoReasonDto, String str, Integer num) {
        this.reason = groupsBanInfoReasonDto;
        this.comment = str;
        this.endDate = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsBanInfoDto)) {
            return false;
        }
        ChannelsBanInfoDto channelsBanInfoDto = (ChannelsBanInfoDto) obj;
        return this.reason == channelsBanInfoDto.reason && epx.f(this.comment, channelsBanInfoDto.comment) && epx.f(this.endDate, channelsBanInfoDto.endDate);
    }

    public final int hashCode() {
        int hashCode = this.reason.hashCode() * 31;
        String str = this.comment;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.endDate;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsBanInfoDto(reason=");
        sb.append(this.reason);
        sb.append(", comment=");
        sb.append(this.comment);
        sb.append(", endDate=");
        return uqi.b(sb, this.endDate, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.reason, i);
        parcel.writeString(this.comment);
        Integer num = this.endDate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ ChannelsBanInfoDto(GroupsBanInfoReasonDto groupsBanInfoReasonDto, String str, Integer num, int i, zcl zclVar) {
        this(groupsBanInfoReasonDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }
}
