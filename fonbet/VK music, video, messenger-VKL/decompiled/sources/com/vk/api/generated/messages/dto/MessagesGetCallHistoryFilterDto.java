package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetCallHistoryFilterDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetCallHistoryFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetCallHistoryFilterDto[] $VALUES;

    @pmi0("all")
    public static final MessagesGetCallHistoryFilterDto ALL;
    public static final Parcelable.Creator<MessagesGetCallHistoryFilterDto> CREATOR;

    @pmi0("missed")
    public static final MessagesGetCallHistoryFilterDto MISSED;
    private final String value;

    /* compiled from: MessagesGetCallHistoryFilterDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetCallHistoryFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetCallHistoryFilterDto createFromParcel(Parcel parcel) {
            return MessagesGetCallHistoryFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetCallHistoryFilterDto[] newArray(int i) {
            return new MessagesGetCallHistoryFilterDto[i];
        }
    }

    static {
        MessagesGetCallHistoryFilterDto messagesGetCallHistoryFilterDto = new MessagesGetCallHistoryFilterDto("ALL", 0, "all");
        ALL = messagesGetCallHistoryFilterDto;
        MessagesGetCallHistoryFilterDto messagesGetCallHistoryFilterDto2 = new MessagesGetCallHistoryFilterDto(SignalingProtocol.HUNGUP_REASON_MISSED, 1, "missed");
        MISSED = messagesGetCallHistoryFilterDto2;
        MessagesGetCallHistoryFilterDto[] messagesGetCallHistoryFilterDtoArr = {messagesGetCallHistoryFilterDto, messagesGetCallHistoryFilterDto2};
        $VALUES = messagesGetCallHistoryFilterDtoArr;
        $ENTRIES = new asp(messagesGetCallHistoryFilterDtoArr);
        CREATOR = new a();
    }

    private MessagesGetCallHistoryFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetCallHistoryFilterDto valueOf(String str) {
        return (MessagesGetCallHistoryFilterDto) Enum.valueOf(MessagesGetCallHistoryFilterDto.class, str);
    }

    public static MessagesGetCallHistoryFilterDto[] values() {
        return (MessagesGetCallHistoryFilterDto[]) $VALUES.clone();
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
