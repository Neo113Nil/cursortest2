package com.vk.toggle.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationResubscribeBannerScheduleConfig.kt */
/* loaded from: classes6.dex */
public final class Repeat {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Repeat[] $VALUES;
    public static final Repeat CYCLE;
    public static final Repeat REPEAT_LAST;
    public static final Repeat STOP;

    static {
        Repeat repeat = new Repeat("STOP", 0);
        STOP = repeat;
        Repeat repeat2 = new Repeat("REPEAT_LAST", 1);
        REPEAT_LAST = repeat2;
        Repeat repeat3 = new Repeat("CYCLE", 2);
        CYCLE = repeat3;
        Repeat[] repeatArr = {repeat, repeat2, repeat3};
        $VALUES = repeatArr;
        $ENTRIES = new asp(repeatArr);
    }

    public Repeat() {
        throw null;
    }

    public static Repeat valueOf(String str) {
        return (Repeat) Enum.valueOf(Repeat.class, str);
    }

    public static Repeat[] values() {
        return (Repeat[]) $VALUES.clone();
    }
}
