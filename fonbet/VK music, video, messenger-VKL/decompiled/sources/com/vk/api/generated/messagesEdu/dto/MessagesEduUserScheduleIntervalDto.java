package com.vk.api.generated.messagesEdu.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.vu5;

/* compiled from: MessagesEduUserScheduleIntervalDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEduUserScheduleIntervalDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEduUserScheduleIntervalDto> CREATOR = new a();

    @pmi0("day_num")
    private final int dayNum;

    @pmi0("enabled")
    private final boolean enabled;

    @pmi0("finish")
    private final int finish;

    @pmi0("start")
    private final int start;

    /* compiled from: MessagesEduUserScheduleIntervalDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEduUserScheduleIntervalDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEduUserScheduleIntervalDto createFromParcel(Parcel parcel) {
            return new MessagesEduUserScheduleIntervalDto(parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEduUserScheduleIntervalDto[] newArray(int i) {
            return new MessagesEduUserScheduleIntervalDto[i];
        }
    }

    public MessagesEduUserScheduleIntervalDto(int i, boolean z, int i2, int i3) {
        this.dayNum = i;
        this.enabled = z;
        this.start = i2;
        this.finish = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesEduUserScheduleIntervalDto)) {
            return false;
        }
        MessagesEduUserScheduleIntervalDto messagesEduUserScheduleIntervalDto = (MessagesEduUserScheduleIntervalDto) obj;
        return this.dayNum == messagesEduUserScheduleIntervalDto.dayNum && this.enabled == messagesEduUserScheduleIntervalDto.enabled && this.start == messagesEduUserScheduleIntervalDto.start && this.finish == messagesEduUserScheduleIntervalDto.finish;
    }

    public final int hashCode() {
        return Integer.hashCode(this.finish) + shy.a(this.start, qoy.b(Integer.hashCode(this.dayNum) * 31, 31, this.enabled), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEduUserScheduleIntervalDto(dayNum=");
        sb.append(this.dayNum);
        sb.append(", enabled=");
        sb.append(this.enabled);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", finish=");
        return vu5.b(sb, this.finish, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.dayNum);
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeInt(this.start);
        parcel.writeInt(this.finish);
    }
}
