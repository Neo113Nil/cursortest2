package com.vk.stat.scheme;

import com.huawei.hms.common.data.DataBufferUtils;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$FeedIntent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsFeedStat$FeedIntent[] $VALUES;

    @pmi0("fresh")
    public static final MobileOfficialAppsFeedStat$FeedIntent FRESH;

    @pmi0("initial")
    public static final MobileOfficialAppsFeedStat$FeedIntent INITIAL;

    @pmi0(DataBufferUtils.NEXT_PAGE)
    public static final MobileOfficialAppsFeedStat$FeedIntent NEXT_PAGE;

    @pmi0("preload")
    public static final MobileOfficialAppsFeedStat$FeedIntent PRELOAD;

    @pmi0("ptr")
    public static final MobileOfficialAppsFeedStat$FeedIntent PTR;

    @pmi0("reload")
    public static final MobileOfficialAppsFeedStat$FeedIntent RELOAD;

    static {
        MobileOfficialAppsFeedStat$FeedIntent mobileOfficialAppsFeedStat$FeedIntent = new MobileOfficialAppsFeedStat$FeedIntent("INITIAL", 0);
        INITIAL = mobileOfficialAppsFeedStat$FeedIntent;
        MobileOfficialAppsFeedStat$FeedIntent mobileOfficialAppsFeedStat$FeedIntent2 = new MobileOfficialAppsFeedStat$FeedIntent("RELOAD", 1);
        RELOAD = mobileOfficialAppsFeedStat$FeedIntent2;
        MobileOfficialAppsFeedStat$FeedIntent mobileOfficialAppsFeedStat$FeedIntent3 = new MobileOfficialAppsFeedStat$FeedIntent("PRELOAD", 2);
        PRELOAD = mobileOfficialAppsFeedStat$FeedIntent3;
        MobileOfficialAppsFeedStat$FeedIntent mobileOfficialAppsFeedStat$FeedIntent4 = new MobileOfficialAppsFeedStat$FeedIntent("PTR", 3);
        PTR = mobileOfficialAppsFeedStat$FeedIntent4;
        MobileOfficialAppsFeedStat$FeedIntent mobileOfficialAppsFeedStat$FeedIntent5 = new MobileOfficialAppsFeedStat$FeedIntent("FRESH", 4);
        FRESH = mobileOfficialAppsFeedStat$FeedIntent5;
        MobileOfficialAppsFeedStat$FeedIntent mobileOfficialAppsFeedStat$FeedIntent6 = new MobileOfficialAppsFeedStat$FeedIntent("NEXT_PAGE", 5);
        NEXT_PAGE = mobileOfficialAppsFeedStat$FeedIntent6;
        MobileOfficialAppsFeedStat$FeedIntent[] mobileOfficialAppsFeedStat$FeedIntentArr = {mobileOfficialAppsFeedStat$FeedIntent, mobileOfficialAppsFeedStat$FeedIntent2, mobileOfficialAppsFeedStat$FeedIntent3, mobileOfficialAppsFeedStat$FeedIntent4, mobileOfficialAppsFeedStat$FeedIntent5, mobileOfficialAppsFeedStat$FeedIntent6};
        $VALUES = mobileOfficialAppsFeedStat$FeedIntentArr;
        $ENTRIES = new asp(mobileOfficialAppsFeedStat$FeedIntentArr);
    }

    private MobileOfficialAppsFeedStat$FeedIntent(String str, int i) {
    }

    public static MobileOfficialAppsFeedStat$FeedIntent valueOf(String str) {
        return (MobileOfficialAppsFeedStat$FeedIntent) Enum.valueOf(MobileOfficialAppsFeedStat$FeedIntent.class, str);
    }

    public static MobileOfficialAppsFeedStat$FeedIntent[] values() {
        return (MobileOfficialAppsFeedStat$FeedIntent[]) $VALUES.clone();
    }
}
