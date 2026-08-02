package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesEditCallRecurrenceRuleDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEditCallRecurrenceRuleDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesEditCallRecurrenceRuleDto[] $VALUES;
    public static final Parcelable.Creator<MessagesEditCallRecurrenceRuleDto> CREATOR;

    @pmi0("daily")
    public static final MessagesEditCallRecurrenceRuleDto DAILY;

    @pmi0("monthly")
    public static final MessagesEditCallRecurrenceRuleDto MONTHLY;

    @pmi0("never")
    public static final MessagesEditCallRecurrenceRuleDto NEVER;

    @pmi0("not_set")
    public static final MessagesEditCallRecurrenceRuleDto NOT_SET;

    @pmi0("same_week_day")
    public static final MessagesEditCallRecurrenceRuleDto SAME_WEEK_DAY;

    @pmi0("weekdays")
    public static final MessagesEditCallRecurrenceRuleDto WEEKDAYS;

    @pmi0("weekend")
    public static final MessagesEditCallRecurrenceRuleDto WEEKEND;

    @pmi0("weekly")
    public static final MessagesEditCallRecurrenceRuleDto WEEKLY;

    @pmi0("yearly")
    public static final MessagesEditCallRecurrenceRuleDto YEARLY;
    private final String value;

    /* compiled from: MessagesEditCallRecurrenceRuleDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEditCallRecurrenceRuleDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEditCallRecurrenceRuleDto createFromParcel(Parcel parcel) {
            return MessagesEditCallRecurrenceRuleDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEditCallRecurrenceRuleDto[] newArray(int i) {
            return new MessagesEditCallRecurrenceRuleDto[i];
        }
    }

    static {
        MessagesEditCallRecurrenceRuleDto messagesEditCallRecurrenceRuleDto = new MessagesEditCallRecurrenceRuleDto("DAILY", 0, "daily");
        DAILY = messagesEditCallRecurrenceRuleDto;
        MessagesEditCallRecurrenceRuleDto messagesEditCallRecurrenceRuleDto2 = new MessagesEditCallRecurrenceRuleDto("MONTHLY", 1, "monthly");
        MONTHLY = messagesEditCallRecurrenceRuleDto2;
        MessagesEditCallRecurrenceRuleDto messagesEditCallRecurrenceRuleDto3 = new MessagesEditCallRecurrenceRuleDto("NEVER", 2, "never");
        NEVER = messagesEditCallRecurrenceRuleDto3;
        MessagesEditCallRecurrenceRuleDto messagesEditCallRecurrenceRuleDto4 = new MessagesEditCallRecurrenceRuleDto("NOT_SET", 3, "not_set");
        NOT_SET = messagesEditCallRecurrenceRuleDto4;
        MessagesEditCallRecurrenceRuleDto messagesEditCallRecurrenceRuleDto5 = new MessagesEditCallRecurrenceRuleDto("SAME_WEEK_DAY", 4, "same_week_day");
        SAME_WEEK_DAY = messagesEditCallRecurrenceRuleDto5;
        MessagesEditCallRecurrenceRuleDto messagesEditCallRecurrenceRuleDto6 = new MessagesEditCallRecurrenceRuleDto("WEEKDAYS", 5, "weekdays");
        WEEKDAYS = messagesEditCallRecurrenceRuleDto6;
        MessagesEditCallRecurrenceRuleDto messagesEditCallRecurrenceRuleDto7 = new MessagesEditCallRecurrenceRuleDto("WEEKEND", 6, "weekend");
        WEEKEND = messagesEditCallRecurrenceRuleDto7;
        MessagesEditCallRecurrenceRuleDto messagesEditCallRecurrenceRuleDto8 = new MessagesEditCallRecurrenceRuleDto("WEEKLY", 7, "weekly");
        WEEKLY = messagesEditCallRecurrenceRuleDto8;
        MessagesEditCallRecurrenceRuleDto messagesEditCallRecurrenceRuleDto9 = new MessagesEditCallRecurrenceRuleDto("YEARLY", 8, "yearly");
        YEARLY = messagesEditCallRecurrenceRuleDto9;
        MessagesEditCallRecurrenceRuleDto[] messagesEditCallRecurrenceRuleDtoArr = {messagesEditCallRecurrenceRuleDto, messagesEditCallRecurrenceRuleDto2, messagesEditCallRecurrenceRuleDto3, messagesEditCallRecurrenceRuleDto4, messagesEditCallRecurrenceRuleDto5, messagesEditCallRecurrenceRuleDto6, messagesEditCallRecurrenceRuleDto7, messagesEditCallRecurrenceRuleDto8, messagesEditCallRecurrenceRuleDto9};
        $VALUES = messagesEditCallRecurrenceRuleDtoArr;
        $ENTRIES = new asp(messagesEditCallRecurrenceRuleDtoArr);
        CREATOR = new a();
    }

    private MessagesEditCallRecurrenceRuleDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesEditCallRecurrenceRuleDto valueOf(String str) {
        return (MessagesEditCallRecurrenceRuleDto) Enum.valueOf(MessagesEditCallRecurrenceRuleDto.class, str);
    }

    public static MessagesEditCallRecurrenceRuleDto[] values() {
        return (MessagesEditCallRecurrenceRuleDto[]) $VALUES.clone();
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
