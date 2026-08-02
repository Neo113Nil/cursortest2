package com.vk.voip.ui.dumps;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CollectDumpDuration.kt */
/* loaded from: classes7.dex */
public final class CollectDumpDuration {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CollectDumpDuration[] $VALUES;
    public static final CollectDumpDuration DURATION_15S;
    public static final CollectDumpDuration DURATION_1M;
    public static final CollectDumpDuration DURATION_2M;
    public static final CollectDumpDuration DURATION_30S;
    private final int associatedText;
    private final int seconds;

    static {
        CollectDumpDuration collectDumpDuration = new CollectDumpDuration("DURATION_15S", 0, 15, R.string.voip_settings_dump_duration_15s);
        DURATION_15S = collectDumpDuration;
        CollectDumpDuration collectDumpDuration2 = new CollectDumpDuration("DURATION_30S", 1, 30, R.string.voip_settings_dump_duration_30s);
        DURATION_30S = collectDumpDuration2;
        CollectDumpDuration collectDumpDuration3 = new CollectDumpDuration("DURATION_1M", 2, 60, R.string.voip_settings_dump_duration_1m);
        DURATION_1M = collectDumpDuration3;
        CollectDumpDuration collectDumpDuration4 = new CollectDumpDuration("DURATION_2M", 3, 120, R.string.voip_settings_dump_duration_2m);
        DURATION_2M = collectDumpDuration4;
        CollectDumpDuration[] collectDumpDurationArr = {collectDumpDuration, collectDumpDuration2, collectDumpDuration3, collectDumpDuration4};
        $VALUES = collectDumpDurationArr;
        $ENTRIES = new asp(collectDumpDurationArr);
    }

    public CollectDumpDuration(String str, int i, int i2, int i3) {
        this.seconds = i2;
        this.associatedText = i3;
    }

    public static zrp<CollectDumpDuration> i() {
        return $ENTRIES;
    }

    public static CollectDumpDuration valueOf(String str) {
        return (CollectDumpDuration) Enum.valueOf(CollectDumpDuration.class, str);
    }

    public static CollectDumpDuration[] values() {
        return (CollectDumpDuration[]) $VALUES.clone();
    }

    public final int h() {
        return this.associatedText;
    }

    public final int j() {
        return this.seconds;
    }
}
