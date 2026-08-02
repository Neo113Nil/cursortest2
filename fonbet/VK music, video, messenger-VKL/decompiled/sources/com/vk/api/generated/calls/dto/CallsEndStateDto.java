package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallsEndStateDto.kt */
/* loaded from: classes14.dex */
public final class CallsEndStateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CallsEndStateDto[] $VALUES;

    @pmi0("canceled_by_initiator")
    public static final CallsEndStateDto CANCELED_BY_INITIATOR;

    @pmi0("canceled_by_receiver")
    public static final CallsEndStateDto CANCELED_BY_RECEIVER;
    public static final Parcelable.Creator<CallsEndStateDto> CREATOR;

    @pmi0("reached")
    public static final CallsEndStateDto REACHED;
    private final String value;

    /* compiled from: CallsEndStateDto.kt */
    public static final class a implements Parcelable.Creator<CallsEndStateDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsEndStateDto createFromParcel(Parcel parcel) {
            return CallsEndStateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsEndStateDto[] newArray(int i) {
            return new CallsEndStateDto[i];
        }
    }

    static {
        CallsEndStateDto callsEndStateDto = new CallsEndStateDto("CANCELED_BY_INITIATOR", 0, "canceled_by_initiator");
        CANCELED_BY_INITIATOR = callsEndStateDto;
        CallsEndStateDto callsEndStateDto2 = new CallsEndStateDto("CANCELED_BY_RECEIVER", 1, "canceled_by_receiver");
        CANCELED_BY_RECEIVER = callsEndStateDto2;
        CallsEndStateDto callsEndStateDto3 = new CallsEndStateDto("REACHED", 2, "reached");
        REACHED = callsEndStateDto3;
        CallsEndStateDto[] callsEndStateDtoArr = {callsEndStateDto, callsEndStateDto2, callsEndStateDto3};
        $VALUES = callsEndStateDtoArr;
        $ENTRIES = new asp(callsEndStateDtoArr);
        CREATOR = new a();
    }

    private CallsEndStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CallsEndStateDto valueOf(String str) {
        return (CallsEndStateDto) Enum.valueOf(CallsEndStateDto.class, str);
    }

    public static CallsEndStateDto[] values() {
        return (CallsEndStateDto[]) $VALUES.clone();
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
