package com.vk.superapp.api.internal.requests.qr;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProcessAuthCode.kt */
/* loaded from: classes6.dex */
public final class ProcessAuthCode$Companion$Action {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProcessAuthCode$Companion$Action[] $VALUES;
    public static final ProcessAuthCode$Companion$Action ALLOW;
    public static final ProcessAuthCode$Companion$Action DENY;
    public static final ProcessAuthCode$Companion$Action INFO;
    public static final ProcessAuthCode$Companion$Action INFO_FOR_CODE;
    private final String value;

    static {
        ProcessAuthCode$Companion$Action processAuthCode$Companion$Action = new ProcessAuthCode$Companion$Action("INFO", 0, "0");
        INFO = processAuthCode$Companion$Action;
        ProcessAuthCode$Companion$Action processAuthCode$Companion$Action2 = new ProcessAuthCode$Companion$Action("ALLOW", 1, "1");
        ALLOW = processAuthCode$Companion$Action2;
        ProcessAuthCode$Companion$Action processAuthCode$Companion$Action3 = new ProcessAuthCode$Companion$Action("DENY", 2, "2");
        DENY = processAuthCode$Companion$Action3;
        ProcessAuthCode$Companion$Action processAuthCode$Companion$Action4 = new ProcessAuthCode$Companion$Action("INFO_FOR_CODE", 3, "3");
        INFO_FOR_CODE = processAuthCode$Companion$Action4;
        ProcessAuthCode$Companion$Action[] processAuthCode$Companion$ActionArr = {processAuthCode$Companion$Action, processAuthCode$Companion$Action2, processAuthCode$Companion$Action3, processAuthCode$Companion$Action4};
        $VALUES = processAuthCode$Companion$ActionArr;
        $ENTRIES = new asp(processAuthCode$Companion$ActionArr);
    }

    public ProcessAuthCode$Companion$Action(String str, int i, String str2) {
        this.value = str2;
    }

    public static ProcessAuthCode$Companion$Action valueOf(String str) {
        return (ProcessAuthCode$Companion$Action) Enum.valueOf(ProcessAuthCode$Companion$Action.class, str);
    }

    public static ProcessAuthCode$Companion$Action[] values() {
        return (ProcessAuthCode$Companion$Action[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
