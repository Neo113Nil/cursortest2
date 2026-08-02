package com.vk.api.generated.messagesEdu.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;

/* compiled from: MessagesEduUserScheduleDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEduUserScheduleDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEduUserScheduleDto> CREATOR = new a();

    @pmi0("schedule_intervals")
    private final List<MessagesEduUserScheduleIntervalDto> scheduleIntervals;

    @pmi0(AnalyticsBaseParamsConstantsKt.TIMEZONE)
    private final int timezone;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: MessagesEduUserScheduleDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEduUserScheduleDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEduUserScheduleDto createFromParcel(Parcel parcel) {
            UserId userId = (UserId) parcel.readParcelable(MessagesEduUserScheduleDto.class.getClassLoader());
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MessagesEduUserScheduleIntervalDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MessagesEduUserScheduleDto(userId, readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEduUserScheduleDto[] newArray(int i) {
            return new MessagesEduUserScheduleDto[i];
        }
    }

    public MessagesEduUserScheduleDto(UserId userId, int i, List<MessagesEduUserScheduleIntervalDto> list) {
        this.userId = userId;
        this.timezone = i;
        this.scheduleIntervals = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesEduUserScheduleDto)) {
            return false;
        }
        MessagesEduUserScheduleDto messagesEduUserScheduleDto = (MessagesEduUserScheduleDto) obj;
        return epx.f(this.userId, messagesEduUserScheduleDto.userId) && this.timezone == messagesEduUserScheduleDto.timezone && epx.f(this.scheduleIntervals, messagesEduUserScheduleDto.scheduleIntervals);
    }

    public final int hashCode() {
        return this.scheduleIntervals.hashCode() + shy.a(this.timezone, Long.hashCode(this.userId.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEduUserScheduleDto(userId=");
        sb.append(this.userId);
        sb.append(", timezone=");
        sb.append(this.timezone);
        sb.append(", scheduleIntervals=");
        return ms9.a(')', sb, this.scheduleIntervals);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.userId, i);
        parcel.writeInt(this.timezone);
        Iterator a2 = ao.a(parcel, this.scheduleIntervals);
        while (a2.hasNext()) {
            ((MessagesEduUserScheduleIntervalDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
