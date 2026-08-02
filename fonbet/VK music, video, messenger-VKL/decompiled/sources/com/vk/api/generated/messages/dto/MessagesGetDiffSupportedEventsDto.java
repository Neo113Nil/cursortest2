package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetDiffSupportedEventsDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetDiffSupportedEventsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetDiffSupportedEventsDto[] $VALUES;
    public static final Parcelable.Creator<MessagesGetDiffSupportedEventsDto> CREATOR;

    @pmi0("18")
    public static final MessagesGetDiffSupportedEventsDto TYPE_18;

    @pmi0("2")
    public static final MessagesGetDiffSupportedEventsDto TYPE_2;

    @pmi0("20")
    public static final MessagesGetDiffSupportedEventsDto TYPE_20;

    @pmi0("21")
    public static final MessagesGetDiffSupportedEventsDto TYPE_21;

    @pmi0("4")
    public static final MessagesGetDiffSupportedEventsDto TYPE_4;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final MessagesGetDiffSupportedEventsDto TYPE_5;

    @pmi0("6")
    public static final MessagesGetDiffSupportedEventsDto TYPE_6;

    @pmi0(Gc.e)
    public static final MessagesGetDiffSupportedEventsDto TYPE_7;
    private final int value;

    /* compiled from: MessagesGetDiffSupportedEventsDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetDiffSupportedEventsDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetDiffSupportedEventsDto createFromParcel(Parcel parcel) {
            return MessagesGetDiffSupportedEventsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetDiffSupportedEventsDto[] newArray(int i) {
            return new MessagesGetDiffSupportedEventsDto[i];
        }
    }

    static {
        MessagesGetDiffSupportedEventsDto messagesGetDiffSupportedEventsDto = new MessagesGetDiffSupportedEventsDto("TYPE_2", 0, 2);
        TYPE_2 = messagesGetDiffSupportedEventsDto;
        MessagesGetDiffSupportedEventsDto messagesGetDiffSupportedEventsDto2 = new MessagesGetDiffSupportedEventsDto("TYPE_4", 1, 4);
        TYPE_4 = messagesGetDiffSupportedEventsDto2;
        MessagesGetDiffSupportedEventsDto messagesGetDiffSupportedEventsDto3 = new MessagesGetDiffSupportedEventsDto("TYPE_5", 2, 5);
        TYPE_5 = messagesGetDiffSupportedEventsDto3;
        MessagesGetDiffSupportedEventsDto messagesGetDiffSupportedEventsDto4 = new MessagesGetDiffSupportedEventsDto("TYPE_6", 3, 6);
        TYPE_6 = messagesGetDiffSupportedEventsDto4;
        MessagesGetDiffSupportedEventsDto messagesGetDiffSupportedEventsDto5 = new MessagesGetDiffSupportedEventsDto("TYPE_7", 4, 7);
        TYPE_7 = messagesGetDiffSupportedEventsDto5;
        MessagesGetDiffSupportedEventsDto messagesGetDiffSupportedEventsDto6 = new MessagesGetDiffSupportedEventsDto("TYPE_18", 5, 18);
        TYPE_18 = messagesGetDiffSupportedEventsDto6;
        MessagesGetDiffSupportedEventsDto messagesGetDiffSupportedEventsDto7 = new MessagesGetDiffSupportedEventsDto("TYPE_20", 6, 20);
        TYPE_20 = messagesGetDiffSupportedEventsDto7;
        MessagesGetDiffSupportedEventsDto messagesGetDiffSupportedEventsDto8 = new MessagesGetDiffSupportedEventsDto("TYPE_21", 7, 21);
        TYPE_21 = messagesGetDiffSupportedEventsDto8;
        MessagesGetDiffSupportedEventsDto[] messagesGetDiffSupportedEventsDtoArr = {messagesGetDiffSupportedEventsDto, messagesGetDiffSupportedEventsDto2, messagesGetDiffSupportedEventsDto3, messagesGetDiffSupportedEventsDto4, messagesGetDiffSupportedEventsDto5, messagesGetDiffSupportedEventsDto6, messagesGetDiffSupportedEventsDto7, messagesGetDiffSupportedEventsDto8};
        $VALUES = messagesGetDiffSupportedEventsDtoArr;
        $ENTRIES = new asp(messagesGetDiffSupportedEventsDtoArr);
        CREATOR = new a();
    }

    private MessagesGetDiffSupportedEventsDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MessagesGetDiffSupportedEventsDto valueOf(String str) {
        return (MessagesGetDiffSupportedEventsDto) Enum.valueOf(MessagesGetDiffSupportedEventsDto.class, str);
    }

    public static MessagesGetDiffSupportedEventsDto[] values() {
        return (MessagesGetDiffSupportedEventsDto[]) $VALUES.clone();
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
