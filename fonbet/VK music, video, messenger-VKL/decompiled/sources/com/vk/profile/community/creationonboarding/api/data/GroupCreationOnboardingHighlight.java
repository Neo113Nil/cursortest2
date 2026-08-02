package com.vk.profile.community.creationonboarding.api.data;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupCreationOnboardingHighlight.kt */
/* loaded from: classes5.dex */
public final class GroupCreationOnboardingHighlight {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupCreationOnboardingHighlight[] $VALUES;
    public static final GroupCreationOnboardingHighlight ADS;
    public static final GroupCreationOnboardingHighlight TITLE;

    static {
        GroupCreationOnboardingHighlight groupCreationOnboardingHighlight = new GroupCreationOnboardingHighlight(NativeAdContent.ViewTag.AD_TITLE, 0);
        TITLE = groupCreationOnboardingHighlight;
        GroupCreationOnboardingHighlight groupCreationOnboardingHighlight2 = new GroupCreationOnboardingHighlight("ADS", 1);
        ADS = groupCreationOnboardingHighlight2;
        GroupCreationOnboardingHighlight[] groupCreationOnboardingHighlightArr = {groupCreationOnboardingHighlight, groupCreationOnboardingHighlight2};
        $VALUES = groupCreationOnboardingHighlightArr;
        $ENTRIES = new asp(groupCreationOnboardingHighlightArr);
    }

    public GroupCreationOnboardingHighlight() {
        throw null;
    }

    public static GroupCreationOnboardingHighlight valueOf(String str) {
        return (GroupCreationOnboardingHighlight) Enum.valueOf(GroupCreationOnboardingHighlight.class, str);
    }

    public static GroupCreationOnboardingHighlight[] values() {
        return (GroupCreationOnboardingHighlight[]) $VALUES.clone();
    }
}
