package com.facebook.imagepipeline.common;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Priority.kt */
/* loaded from: classes12.dex */
public final class Priority {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Priority[] $VALUES;
    public static final a Companion;
    public static final Priority HIGH;
    public static final Priority LOW;
    public static final Priority MEDIUM;

    /* compiled from: Priority.kt */
    public static final class a {
    }

    static {
        Priority priority = new Priority("LOW", 0);
        LOW = priority;
        Priority priority2 = new Priority("MEDIUM", 1);
        MEDIUM = priority2;
        Priority priority3 = new Priority("HIGH", 2);
        HIGH = priority3;
        Priority[] priorityArr = {priority, priority2, priority3};
        $VALUES = priorityArr;
        $ENTRIES = new asp(priorityArr);
        Companion = new a();
    }

    public Priority() {
        throw null;
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) $VALUES.clone();
    }
}
