package com.vk.im.engine.models;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import xsna.af0;
import xsna.asp;
import xsna.bpn0;
import xsna.on00;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallState.kt */
/* loaded from: classes2.dex */
public final class CallState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CallState[] $VALUES;
    public static final CallState CANCELLED;
    public static final a Companion;
    public static final CallState DECLINED;
    public static final CallState DONE;
    public static final CallState ERROR;
    private static final Lazy<Map<Integer, CallState>> values$delegate;
    private final int id;

    /* compiled from: CallState.kt */
    public static final class a {
    }

    static {
        CallState callState = new CallState("DONE", 0, 0);
        DONE = callState;
        CallState callState2 = new CallState("ERROR", 1, 1);
        ERROR = callState2;
        CallState callState3 = new CallState("CANCELLED", 2, 2);
        CANCELLED = callState3;
        CallState callState4 = new CallState("DECLINED", 3, 3);
        DECLINED = callState4;
        CallState[] callStateArr = {callState, callState2, callState3, callState4};
        $VALUES = callStateArr;
        $ENTRIES = new asp(callStateArr);
        Companion = new a();
        values$delegate = new bpn0(new af0(4));
    }

    public CallState(String str, int i, int i2) {
        this.id = i2;
    }

    public static LinkedHashMap h() {
        CallState[] values = values();
        int e = on00.e(values.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (CallState callState : values) {
            linkedHashMap.put(Integer.valueOf(callState.id), callState);
        }
        return linkedHashMap;
    }

    public static CallState valueOf(String str) {
        return (CallState) Enum.valueOf(CallState.class, str);
    }

    public static CallState[] values() {
        return (CallState[]) $VALUES.clone();
    }

    public final int j() {
        return this.id;
    }
}
