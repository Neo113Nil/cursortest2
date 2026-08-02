package com.vk.im.ui.components.common;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BanDuration.kt */
/* loaded from: classes2.dex */
public final class BanDuration {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BanDuration[] $VALUES;
    public static final BanDuration EIGHT_HOURS;
    public static final BanDuration FOREVER;
    public static final BanDuration ONE_DAY;
    public static final BanDuration ONE_HOUR;
    private final int durationSec;
    private final int titleRes;

    static {
        BanDuration banDuration = new BanDuration("ONE_HOUR", 0, R.string.vkim_msg_ban_user_period_one_hour, 3600);
        ONE_HOUR = banDuration;
        BanDuration banDuration2 = new BanDuration("EIGHT_HOURS", 1, R.string.vkim_msg_ban_user_period_eight_hours, 28800);
        EIGHT_HOURS = banDuration2;
        BanDuration banDuration3 = new BanDuration("ONE_DAY", 2, R.string.vkim_msg_ban_user_period_day, 86400);
        ONE_DAY = banDuration3;
        BanDuration banDuration4 = new BanDuration("FOREVER", 3, R.string.vkim_msg_ban_user_period_forever, -1);
        FOREVER = banDuration4;
        BanDuration[] banDurationArr = {banDuration, banDuration2, banDuration3, banDuration4};
        $VALUES = banDurationArr;
        $ENTRIES = new asp(banDurationArr);
    }

    public BanDuration(String str, int i, int i2, int i3) {
        this.titleRes = i2;
        this.durationSec = i3;
    }

    public static zrp<BanDuration> i() {
        return $ENTRIES;
    }

    public static BanDuration valueOf(String str) {
        return (BanDuration) Enum.valueOf(BanDuration.class, str);
    }

    public static BanDuration[] values() {
        return (BanDuration[]) $VALUES.clone();
    }

    public final int h() {
        return this.durationSec;
    }

    public final int j() {
        return this.titleRes;
    }
}
