package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallsStartRecurrenceRuleDto.kt */
/* loaded from: classes14.dex */
public final class CallsStartRecurrenceRuleDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CallsStartRecurrenceRuleDto[] $VALUES;
    public static final Parcelable.Creator<CallsStartRecurrenceRuleDto> CREATOR;

    @pmi0("daily")
    public static final CallsStartRecurrenceRuleDto DAILY;

    @pmi0("monthly")
    public static final CallsStartRecurrenceRuleDto MONTHLY;

    @pmi0("never")
    public static final CallsStartRecurrenceRuleDto NEVER;

    @pmi0("not_set")
    public static final CallsStartRecurrenceRuleDto NOT_SET;

    @pmi0("same_week_day")
    public static final CallsStartRecurrenceRuleDto SAME_WEEK_DAY;

    @pmi0("weekdays")
    public static final CallsStartRecurrenceRuleDto WEEKDAYS;

    @pmi0("weekend")
    public static final CallsStartRecurrenceRuleDto WEEKEND;

    @pmi0("weekly")
    public static final CallsStartRecurrenceRuleDto WEEKLY;

    @pmi0("yearly")
    public static final CallsStartRecurrenceRuleDto YEARLY;
    private final String value;

    /* compiled from: CallsStartRecurrenceRuleDto.kt */
    public static final class a implements Parcelable.Creator<CallsStartRecurrenceRuleDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsStartRecurrenceRuleDto createFromParcel(Parcel parcel) {
            return CallsStartRecurrenceRuleDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsStartRecurrenceRuleDto[] newArray(int i) {
            return new CallsStartRecurrenceRuleDto[i];
        }
    }

    static {
        CallsStartRecurrenceRuleDto callsStartRecurrenceRuleDto = new CallsStartRecurrenceRuleDto("DAILY", 0, "daily");
        DAILY = callsStartRecurrenceRuleDto;
        CallsStartRecurrenceRuleDto callsStartRecurrenceRuleDto2 = new CallsStartRecurrenceRuleDto("MONTHLY", 1, "monthly");
        MONTHLY = callsStartRecurrenceRuleDto2;
        CallsStartRecurrenceRuleDto callsStartRecurrenceRuleDto3 = new CallsStartRecurrenceRuleDto("NEVER", 2, "never");
        NEVER = callsStartRecurrenceRuleDto3;
        CallsStartRecurrenceRuleDto callsStartRecurrenceRuleDto4 = new CallsStartRecurrenceRuleDto("NOT_SET", 3, "not_set");
        NOT_SET = callsStartRecurrenceRuleDto4;
        CallsStartRecurrenceRuleDto callsStartRecurrenceRuleDto5 = new CallsStartRecurrenceRuleDto("SAME_WEEK_DAY", 4, "same_week_day");
        SAME_WEEK_DAY = callsStartRecurrenceRuleDto5;
        CallsStartRecurrenceRuleDto callsStartRecurrenceRuleDto6 = new CallsStartRecurrenceRuleDto("WEEKDAYS", 5, "weekdays");
        WEEKDAYS = callsStartRecurrenceRuleDto6;
        CallsStartRecurrenceRuleDto callsStartRecurrenceRuleDto7 = new CallsStartRecurrenceRuleDto("WEEKEND", 6, "weekend");
        WEEKEND = callsStartRecurrenceRuleDto7;
        CallsStartRecurrenceRuleDto callsStartRecurrenceRuleDto8 = new CallsStartRecurrenceRuleDto("WEEKLY", 7, "weekly");
        WEEKLY = callsStartRecurrenceRuleDto8;
        CallsStartRecurrenceRuleDto callsStartRecurrenceRuleDto9 = new CallsStartRecurrenceRuleDto("YEARLY", 8, "yearly");
        YEARLY = callsStartRecurrenceRuleDto9;
        CallsStartRecurrenceRuleDto[] callsStartRecurrenceRuleDtoArr = {callsStartRecurrenceRuleDto, callsStartRecurrenceRuleDto2, callsStartRecurrenceRuleDto3, callsStartRecurrenceRuleDto4, callsStartRecurrenceRuleDto5, callsStartRecurrenceRuleDto6, callsStartRecurrenceRuleDto7, callsStartRecurrenceRuleDto8, callsStartRecurrenceRuleDto9};
        $VALUES = callsStartRecurrenceRuleDtoArr;
        $ENTRIES = new asp(callsStartRecurrenceRuleDtoArr);
        CREATOR = new a();
    }

    private CallsStartRecurrenceRuleDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CallsStartRecurrenceRuleDto valueOf(String str) {
        return (CallsStartRecurrenceRuleDto) Enum.valueOf(CallsStartRecurrenceRuleDto.class, str);
    }

    public static CallsStartRecurrenceRuleDto[] values() {
        return (CallsStartRecurrenceRuleDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
