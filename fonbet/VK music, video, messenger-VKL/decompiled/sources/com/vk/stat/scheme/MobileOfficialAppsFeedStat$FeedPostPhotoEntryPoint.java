package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint[] $VALUES;

    @pmi0("feed")
    public static final MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint FEED;

    @pmi0("photo_viewer")
    public static final MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint PHOTO_VIEWER;

    static {
        MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint mobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint = new MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint("FEED", 0);
        FEED = mobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint;
        MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint mobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint2 = new MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint("PHOTO_VIEWER", 1);
        PHOTO_VIEWER = mobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint2;
        MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint[] mobileOfficialAppsFeedStat$FeedPostPhotoEntryPointArr = {mobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint, mobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint2};
        $VALUES = mobileOfficialAppsFeedStat$FeedPostPhotoEntryPointArr;
        $ENTRIES = new asp(mobileOfficialAppsFeedStat$FeedPostPhotoEntryPointArr);
    }

    private MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint(String str, int i) {
    }

    public static MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint valueOf(String str) {
        return (MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint) Enum.valueOf(MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint.class, str);
    }

    public static MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint[] values() {
        return (MobileOfficialAppsFeedStat$FeedPostPhotoEntryPoint[]) $VALUES.clone();
    }
}
