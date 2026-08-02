package com.vk.sdk.api.calls.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallsEndStateDto.kt */
/* loaded from: classes5.dex */
public final class CallsEndStateDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CallsEndStateDto[] $VALUES;

    @pmi0("canceled_by_initiator")
    public static final CallsEndStateDto CANCELED_BY_INITIATOR;

    @pmi0("canceled_by_receiver")
    public static final CallsEndStateDto CANCELED_BY_RECEIVER;

    @pmi0("reached")
    public static final CallsEndStateDto REACHED;
    private final String value;

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
}
