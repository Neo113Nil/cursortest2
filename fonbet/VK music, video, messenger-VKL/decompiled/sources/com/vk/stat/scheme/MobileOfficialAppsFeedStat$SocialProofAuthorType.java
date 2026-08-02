package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$SocialProofAuthorType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsFeedStat$SocialProofAuthorType[] $VALUES;

    @pmi0("from_friend")
    public static final MobileOfficialAppsFeedStat$SocialProofAuthorType FROM_FRIEND;

    @pmi0("from_non_friend")
    public static final MobileOfficialAppsFeedStat$SocialProofAuthorType FROM_NON_FRIEND;

    static {
        MobileOfficialAppsFeedStat$SocialProofAuthorType mobileOfficialAppsFeedStat$SocialProofAuthorType = new MobileOfficialAppsFeedStat$SocialProofAuthorType("FROM_FRIEND", 0);
        FROM_FRIEND = mobileOfficialAppsFeedStat$SocialProofAuthorType;
        MobileOfficialAppsFeedStat$SocialProofAuthorType mobileOfficialAppsFeedStat$SocialProofAuthorType2 = new MobileOfficialAppsFeedStat$SocialProofAuthorType("FROM_NON_FRIEND", 1);
        FROM_NON_FRIEND = mobileOfficialAppsFeedStat$SocialProofAuthorType2;
        MobileOfficialAppsFeedStat$SocialProofAuthorType[] mobileOfficialAppsFeedStat$SocialProofAuthorTypeArr = {mobileOfficialAppsFeedStat$SocialProofAuthorType, mobileOfficialAppsFeedStat$SocialProofAuthorType2};
        $VALUES = mobileOfficialAppsFeedStat$SocialProofAuthorTypeArr;
        $ENTRIES = new asp(mobileOfficialAppsFeedStat$SocialProofAuthorTypeArr);
    }

    private MobileOfficialAppsFeedStat$SocialProofAuthorType(String str, int i) {
    }

    public static MobileOfficialAppsFeedStat$SocialProofAuthorType valueOf(String str) {
        return (MobileOfficialAppsFeedStat$SocialProofAuthorType) Enum.valueOf(MobileOfficialAppsFeedStat$SocialProofAuthorType.class, str);
    }

    public static MobileOfficialAppsFeedStat$SocialProofAuthorType[] values() {
        return (MobileOfficialAppsFeedStat$SocialProofAuthorType[]) $VALUES.clone();
    }
}
