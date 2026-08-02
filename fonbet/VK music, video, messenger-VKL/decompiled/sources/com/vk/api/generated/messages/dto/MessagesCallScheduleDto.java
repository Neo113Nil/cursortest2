package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesCallScheduleDto.kt */
/* loaded from: classes15.dex */
public final class MessagesCallScheduleDto implements Parcelable {
    public static final Parcelable.Creator<MessagesCallScheduleDto> CREATOR = new a();

    @pmi0("duration")
    private final int duration;

    @pmi0("marker_time")
    private final long markerTime;

    @pmi0("recurrence_rule")
    private final RecurrenceRuleDto recurrenceRule;

    @pmi0("recurrence_until_time")
    private final Long recurrenceUntilTime;

    @pmi0("time")
    private final long time;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesCallScheduleDto.kt */
    public static final class RecurrenceRuleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RecurrenceRuleDto[] $VALUES;
        public static final Parcelable.Creator<RecurrenceRuleDto> CREATOR;

        @pmi0("daily")
        public static final RecurrenceRuleDto DAILY;

        @pmi0("monthly")
        public static final RecurrenceRuleDto MONTHLY;

        @pmi0("never")
        public static final RecurrenceRuleDto NEVER;

        @pmi0("same_week_day")
        public static final RecurrenceRuleDto SAME_WEEK_DAY;

        @pmi0("weekdays")
        public static final RecurrenceRuleDto WEEKDAYS;

        @pmi0("weekend")
        public static final RecurrenceRuleDto WEEKEND;

        @pmi0("weekly")
        public static final RecurrenceRuleDto WEEKLY;

        @pmi0("yearly")
        public static final RecurrenceRuleDto YEARLY;
        private final String value;

        /* compiled from: MessagesCallScheduleDto.kt */
        public static final class a implements Parcelable.Creator<RecurrenceRuleDto> {
            @Override // android.os.Parcelable.Creator
            public final RecurrenceRuleDto createFromParcel(Parcel parcel) {
                return RecurrenceRuleDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RecurrenceRuleDto[] newArray(int i) {
                return new RecurrenceRuleDto[i];
            }
        }

        static {
            RecurrenceRuleDto recurrenceRuleDto = new RecurrenceRuleDto("DAILY", 0, "daily");
            DAILY = recurrenceRuleDto;
            RecurrenceRuleDto recurrenceRuleDto2 = new RecurrenceRuleDto("MONTHLY", 1, "monthly");
            MONTHLY = recurrenceRuleDto2;
            RecurrenceRuleDto recurrenceRuleDto3 = new RecurrenceRuleDto("NEVER", 2, "never");
            NEVER = recurrenceRuleDto3;
            RecurrenceRuleDto recurrenceRuleDto4 = new RecurrenceRuleDto("SAME_WEEK_DAY", 3, "same_week_day");
            SAME_WEEK_DAY = recurrenceRuleDto4;
            RecurrenceRuleDto recurrenceRuleDto5 = new RecurrenceRuleDto("WEEKDAYS", 4, "weekdays");
            WEEKDAYS = recurrenceRuleDto5;
            RecurrenceRuleDto recurrenceRuleDto6 = new RecurrenceRuleDto("WEEKEND", 5, "weekend");
            WEEKEND = recurrenceRuleDto6;
            RecurrenceRuleDto recurrenceRuleDto7 = new RecurrenceRuleDto("WEEKLY", 6, "weekly");
            WEEKLY = recurrenceRuleDto7;
            RecurrenceRuleDto recurrenceRuleDto8 = new RecurrenceRuleDto("YEARLY", 7, "yearly");
            YEARLY = recurrenceRuleDto8;
            RecurrenceRuleDto[] recurrenceRuleDtoArr = {recurrenceRuleDto, recurrenceRuleDto2, recurrenceRuleDto3, recurrenceRuleDto4, recurrenceRuleDto5, recurrenceRuleDto6, recurrenceRuleDto7, recurrenceRuleDto8};
            $VALUES = recurrenceRuleDtoArr;
            $ENTRIES = new asp(recurrenceRuleDtoArr);
            CREATOR = new a();
        }

        private RecurrenceRuleDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static RecurrenceRuleDto valueOf(String str) {
            return (RecurrenceRuleDto) Enum.valueOf(RecurrenceRuleDto.class, str);
        }

        public static RecurrenceRuleDto[] values() {
            return (RecurrenceRuleDto[]) $VALUES.clone();
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

    /* compiled from: MessagesCallScheduleDto.kt */
    public static final class a implements Parcelable.Creator<MessagesCallScheduleDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesCallScheduleDto createFromParcel(Parcel parcel) {
            return new MessagesCallScheduleDto(parcel.readLong(), parcel.readLong(), parcel.readInt(), RecurrenceRuleDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesCallScheduleDto[] newArray(int i) {
            return new MessagesCallScheduleDto[i];
        }
    }

    public MessagesCallScheduleDto(long j, long j2, int i, RecurrenceRuleDto recurrenceRuleDto, Long l) {
        this.markerTime = j;
        this.time = j2;
        this.duration = i;
        this.recurrenceRule = recurrenceRuleDto;
        this.recurrenceUntilTime = l;
    }

    public static MessagesCallScheduleDto a(MessagesCallScheduleDto messagesCallScheduleDto, long j, int i) {
        long j2 = messagesCallScheduleDto.markerTime;
        RecurrenceRuleDto recurrenceRuleDto = messagesCallScheduleDto.recurrenceRule;
        Long l = messagesCallScheduleDto.recurrenceUntilTime;
        messagesCallScheduleDto.getClass();
        return new MessagesCallScheduleDto(j2, j, i, recurrenceRuleDto, l);
    }

    public final long d() {
        return this.markerTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final RecurrenceRuleDto e() {
        return this.recurrenceRule;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesCallScheduleDto)) {
            return false;
        }
        MessagesCallScheduleDto messagesCallScheduleDto = (MessagesCallScheduleDto) obj;
        return this.markerTime == messagesCallScheduleDto.markerTime && this.time == messagesCallScheduleDto.time && this.duration == messagesCallScheduleDto.duration && this.recurrenceRule == messagesCallScheduleDto.recurrenceRule && epx.f(this.recurrenceUntilTime, messagesCallScheduleDto.recurrenceUntilTime);
    }

    public final Long f() {
        return this.recurrenceUntilTime;
    }

    public final long g() {
        return this.time;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int hashCode() {
        int hashCode = (this.recurrenceRule.hashCode() + shy.a(this.duration, bh10.a(Long.hashCode(this.markerTime) * 31, 31, this.time), 31)) * 31;
        Long l = this.recurrenceUntilTime;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesCallScheduleDto(markerTime=");
        sb.append(this.markerTime);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", recurrenceRule=");
        sb.append(this.recurrenceRule);
        sb.append(", recurrenceUntilTime=");
        return iq.b(sb, this.recurrenceUntilTime, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.markerTime);
        parcel.writeLong(this.time);
        parcel.writeInt(this.duration);
        this.recurrenceRule.writeToParcel(parcel, i);
        Long l = this.recurrenceUntilTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
    }

    public /* synthetic */ MessagesCallScheduleDto(long j, long j2, int i, RecurrenceRuleDto recurrenceRuleDto, Long l, int i2, zcl zclVar) {
        this(j, j2, i, recurrenceRuleDto, (i2 & 16) != 0 ? null : l);
    }
}
