package com.vk.onetimedonut.api.events;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OneTimeDonutEventStatus.kt */
/* loaded from: classes4.dex */
public final class OneTimeDonutEventStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OneTimeDonutEventStatus[] $VALUES;
    public static final a Companion;
    public static final OneTimeDonutEventStatus ERROR;
    public static final OneTimeDonutEventStatus PROCESSING;
    public static final OneTimeDonutEventStatus SUCCESS;
    private final String status;

    /* compiled from: OneTimeDonutEventStatus.kt */
    public static final class a {
    }

    static {
        OneTimeDonutEventStatus oneTimeDonutEventStatus = new OneTimeDonutEventStatus("SUCCESS", 0, "success");
        SUCCESS = oneTimeDonutEventStatus;
        OneTimeDonutEventStatus oneTimeDonutEventStatus2 = new OneTimeDonutEventStatus("PROCESSING", 1, "processing");
        PROCESSING = oneTimeDonutEventStatus2;
        OneTimeDonutEventStatus oneTimeDonutEventStatus3 = new OneTimeDonutEventStatus("ERROR", 2, "error");
        ERROR = oneTimeDonutEventStatus3;
        OneTimeDonutEventStatus[] oneTimeDonutEventStatusArr = {oneTimeDonutEventStatus, oneTimeDonutEventStatus2, oneTimeDonutEventStatus3};
        $VALUES = oneTimeDonutEventStatusArr;
        $ENTRIES = new asp(oneTimeDonutEventStatusArr);
        Companion = new a();
    }

    public OneTimeDonutEventStatus(String str, int i, String str2) {
        this.status = str2;
    }

    public static OneTimeDonutEventStatus valueOf(String str) {
        return (OneTimeDonutEventStatus) Enum.valueOf(OneTimeDonutEventStatus.class, str);
    }

    public static OneTimeDonutEventStatus[] values() {
        return (OneTimeDonutEventStatus[]) $VALUES.clone();
    }
}
