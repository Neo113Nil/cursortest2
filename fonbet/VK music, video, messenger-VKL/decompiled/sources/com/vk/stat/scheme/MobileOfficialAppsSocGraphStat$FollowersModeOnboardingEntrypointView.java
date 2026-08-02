package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsSocGraphStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView implements SchemeStat$TypeView.b {

    @pmi0("followers_mode_onboarding_entrypoint_displaying_context")
    private final MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext followersModeOnboardingEntrypointDisplayingContext;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView) && this.followersModeOnboardingEntrypointDisplayingContext == ((MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView) obj).followersModeOnboardingEntrypointDisplayingContext;
    }

    public final int hashCode() {
        MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext = this.followersModeOnboardingEntrypointDisplayingContext;
        if (mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext == null) {
            return 0;
        }
        return mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext.hashCode();
    }

    public final String toString() {
        return "FollowersModeOnboardingEntrypointView(followersModeOnboardingEntrypointDisplayingContext=" + this.followersModeOnboardingEntrypointDisplayingContext + ')';
    }

    public MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView(MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext) {
        this.followersModeOnboardingEntrypointDisplayingContext = mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext;
    }

    public /* synthetic */ MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointView(MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext);
    }
}
