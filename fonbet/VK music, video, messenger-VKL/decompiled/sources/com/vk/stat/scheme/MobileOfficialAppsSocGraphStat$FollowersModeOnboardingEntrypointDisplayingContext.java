package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsSocGraphStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext[] $VALUES;

    @pmi0("edit_profile")
    public static final MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext EDIT_PROFILE;

    @pmi0("forced")
    public static final MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext FORCED;

    @pmi0("privacy")
    public static final MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext PRIVACY;

    @pmi0("soft")
    public static final MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext SOFT;

    static {
        MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext = new MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext("FORCED", 0);
        FORCED = mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext;
        MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext2 = new MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext("SOFT", 1);
        SOFT = mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext2;
        MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext3 = new MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext("PRIVACY", 2);
        PRIVACY = mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext3;
        MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext4 = new MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext("EDIT_PROFILE", 3);
        EDIT_PROFILE = mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext4;
        MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext[] mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContextArr = {mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext, mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext2, mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext3, mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext4};
        $VALUES = mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContextArr;
        $ENTRIES = new asp(mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContextArr);
    }

    private MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext(String str, int i) {
    }

    public static MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext valueOf(String str) {
        return (MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext) Enum.valueOf(MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext.class, str);
    }

    public static MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext[] values() {
        return (MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext[]) $VALUES.clone();
    }
}
