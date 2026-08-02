package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesStartCallRecurrenceRuleDto.kt */
/* loaded from: classes15.dex */
public final class MessagesStartCallRecurrenceRuleDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesStartCallRecurrenceRuleDto[] $VALUES;
    public static final Parcelable.Creator<MessagesStartCallRecurrenceRuleDto> CREATOR;

    @pmi0("daily")
    public static final MessagesStartCallRecurrenceRuleDto DAILY;

    @pmi0("monthly")
    public static final MessagesStartCallRecurrenceRuleDto MONTHLY;

    @pmi0("never")
    public static final MessagesStartCallRecurrenceRuleDto NEVER;

    @pmi0("not_set")
    public static final MessagesStartCallRecurrenceRuleDto NOT_SET;

    @pmi0("same_week_day")
    public static final MessagesStartCallRecurrenceRuleDto SAME_WEEK_DAY;

    @pmi0("weekdays")
    public static final MessagesStartCallRecurrenceRuleDto WEEKDAYS;

    @pmi0("weekend")
    public static final MessagesStartCallRecurrenceRuleDto WEEKEND;

    @pmi0("weekly")
    public static final MessagesStartCallRecurrenceRuleDto WEEKLY;

    @pmi0("yearly")
    public static final MessagesStartCallRecurrenceRuleDto YEARLY;
    private final String value;

    /* compiled from: MessagesStartCallRecurrenceRuleDto.kt */
    public static final class a implements Parcelable.Creator<MessagesStartCallRecurrenceRuleDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesStartCallRecurrenceRuleDto createFromParcel(Parcel parcel) {
            return MessagesStartCallRecurrenceRuleDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesStartCallRecurrenceRuleDto[] newArray(int i) {
            return new MessagesStartCallRecurrenceRuleDto[i];
        }
    }

    static {
        MessagesStartCallRecurrenceRuleDto messagesStartCallRecurrenceRuleDto = new MessagesStartCallRecurrenceRuleDto("DAILY", 0, "daily");
        DAILY = messagesStartCallRecurrenceRuleDto;
        MessagesStartCallRecurrenceRuleDto messagesStartCallRecurrenceRuleDto2 = new MessagesStartCallRecurrenceRuleDto("MONTHLY", 1, "monthly");
        MONTHLY = messagesStartCallRecurrenceRuleDto2;
        MessagesStartCallRecurrenceRuleDto messagesStartCallRecurrenceRuleDto3 = new MessagesStartCallRecurrenceRuleDto("NEVER", 2, "never");
        NEVER = messagesStartCallRecurrenceRuleDto3;
        MessagesStartCallRecurrenceRuleDto messagesStartCallRecurrenceRuleDto4 = new MessagesStartCallRecurrenceRuleDto("NOT_SET", 3, "not_set");
        NOT_SET = messagesStartCallRecurrenceRuleDto4;
        MessagesStartCallRecurrenceRuleDto messagesStartCallRecurrenceRuleDto5 = new MessagesStartCallRecurrenceRuleDto("SAME_WEEK_DAY", 4, "same_week_day");
        SAME_WEEK_DAY = messagesStartCallRecurrenceRuleDto5;
        MessagesStartCallRecurrenceRuleDto messagesStartCallRecurrenceRuleDto6 = new MessagesStartCallRecurrenceRuleDto("WEEKDAYS", 5, "weekdays");
        WEEKDAYS = messagesStartCallRecurrenceRuleDto6;
        MessagesStartCallRecurrenceRuleDto messagesStartCallRecurrenceRuleDto7 = new MessagesStartCallRecurrenceRuleDto("WEEKEND", 6, "weekend");
        WEEKEND = messagesStartCallRecurrenceRuleDto7;
        MessagesStartCallRecurrenceRuleDto messagesStartCallRecurrenceRuleDto8 = new MessagesStartCallRecurrenceRuleDto("WEEKLY", 7, "weekly");
        WEEKLY = messagesStartCallRecurrenceRuleDto8;
        MessagesStartCallRecurrenceRuleDto messagesStartCallRecurrenceRuleDto9 = new MessagesStartCallRecurrenceRuleDto("YEARLY", 8, "yearly");
        YEARLY = messagesStartCallRecurrenceRuleDto9;
        MessagesStartCallRecurrenceRuleDto[] messagesStartCallRecurrenceRuleDtoArr = {messagesStartCallRecurrenceRuleDto, messagesStartCallRecurrenceRuleDto2, messagesStartCallRecurrenceRuleDto3, messagesStartCallRecurrenceRuleDto4, messagesStartCallRecurrenceRuleDto5, messagesStartCallRecurrenceRuleDto6, messagesStartCallRecurrenceRuleDto7, messagesStartCallRecurrenceRuleDto8, messagesStartCallRecurrenceRuleDto9};
        $VALUES = messagesStartCallRecurrenceRuleDtoArr;
        $ENTRIES = new asp(messagesStartCallRecurrenceRuleDtoArr);
        CREATOR = new a();
    }

    private MessagesStartCallRecurrenceRuleDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesStartCallRecurrenceRuleDto valueOf(String str) {
        return (MessagesStartCallRecurrenceRuleDto) Enum.valueOf(MessagesStartCallRecurrenceRuleDto.class, str);
    }

    public static MessagesStartCallRecurrenceRuleDto[] values() {
        return (MessagesStartCallRecurrenceRuleDto[]) $VALUES.clone();
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
