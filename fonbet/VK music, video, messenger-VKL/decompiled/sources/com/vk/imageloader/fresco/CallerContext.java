package com.vk.imageloader.fresco;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallerContext.kt */
/* loaded from: classes2.dex */
public final class CallerContext {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CallerContext[] $VALUES;
    public static final CallerContext Background;
    public static final CallerContext Frontend;

    static {
        CallerContext callerContext = new CallerContext("Background", 0);
        Background = callerContext;
        CallerContext callerContext2 = new CallerContext("Frontend", 1);
        Frontend = callerContext2;
        CallerContext[] callerContextArr = {callerContext, callerContext2};
        $VALUES = callerContextArr;
        $ENTRIES = new asp(callerContextArr);
    }

    public CallerContext() {
        throw null;
    }

    public static CallerContext valueOf(String str) {
        return (CallerContext) Enum.valueOf(CallerContext.class, str);
    }

    public static CallerContext[] values() {
        return (CallerContext[]) $VALUES.clone();
    }
}
