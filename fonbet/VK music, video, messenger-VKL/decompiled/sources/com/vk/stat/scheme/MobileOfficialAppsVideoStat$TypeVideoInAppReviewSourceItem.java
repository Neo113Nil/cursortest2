package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem[] $VALUES;

    @pmi0("first_stage_dialog")
    public static final MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem FIRST_STAGE_DIALOG;

    @pmi0("negative_second_stage_dialog")
    public static final MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem NEGATIVE_SECOND_STAGE_DIALOG;

    @pmi0("positive_second_stage_dialog")
    public static final MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem POSITIVE_SECOND_STAGE_DIALOG;

    @pmi0("profile_card")
    public static final MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem PROFILE_CARD;

    static {
        MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem = new MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem("FIRST_STAGE_DIALOG", 0);
        FIRST_STAGE_DIALOG = mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem;
        MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem2 = new MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem("POSITIVE_SECOND_STAGE_DIALOG", 1);
        POSITIVE_SECOND_STAGE_DIALOG = mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem2;
        MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem3 = new MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem("NEGATIVE_SECOND_STAGE_DIALOG", 2);
        NEGATIVE_SECOND_STAGE_DIALOG = mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem3;
        MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem4 = new MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem("PROFILE_CARD", 3);
        PROFILE_CARD = mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem4;
        MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem[] mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItemArr = {mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem, mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem2, mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem3, mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem4};
        $VALUES = mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItemArr;
        $ENTRIES = new asp(mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItemArr);
    }

    private MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem(String str, int i) {
    }

    public static MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem valueOf(String str) {
        return (MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem) Enum.valueOf(MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem.class, str);
    }

    public static MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem[] values() {
        return (MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem[]) $VALUES.clone();
    }
}
