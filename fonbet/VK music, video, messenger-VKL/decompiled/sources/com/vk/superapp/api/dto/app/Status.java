package com.vk.superapp.api.dto.app;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WebOrderInfo.kt */
/* loaded from: classes6.dex */
public final class Status {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Status[] $VALUES;
    public static final a Companion;
    public static final Status LOADED;
    public static final Status WAITING;

    /* compiled from: WebOrderInfo.kt */
    public static final class a {
    }

    static {
        Status status = new Status("WAITING", 0);
        WAITING = status;
        Status status2 = new Status("LOADED", 1);
        LOADED = status2;
        Status[] statusArr = {status, status2};
        $VALUES = statusArr;
        $ENTRIES = new asp(statusArr);
        Companion = new a();
    }

    public Status() {
        throw null;
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }
}
