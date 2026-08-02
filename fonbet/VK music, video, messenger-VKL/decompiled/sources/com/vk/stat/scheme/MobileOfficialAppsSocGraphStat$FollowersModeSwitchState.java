package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsSocGraphStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsSocGraphStat$FollowersModeSwitchState implements SchemeStat$TypeClick.b {

    @pmi0("followers_mode_onboarding_entrypoint_displaying_context")
    private final MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext followersModeOnboardingEntrypointDisplayingContext;

    @pmi0("isEnabled")
    private final boolean isEnabled;

    public MobileOfficialAppsSocGraphStat$FollowersModeSwitchState(boolean z, MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext) {
        this.isEnabled = z;
        this.followersModeOnboardingEntrypointDisplayingContext = mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsSocGraphStat$FollowersModeSwitchState)) {
            return false;
        }
        MobileOfficialAppsSocGraphStat$FollowersModeSwitchState mobileOfficialAppsSocGraphStat$FollowersModeSwitchState = (MobileOfficialAppsSocGraphStat$FollowersModeSwitchState) obj;
        return this.isEnabled == mobileOfficialAppsSocGraphStat$FollowersModeSwitchState.isEnabled && this.followersModeOnboardingEntrypointDisplayingContext == mobileOfficialAppsSocGraphStat$FollowersModeSwitchState.followersModeOnboardingEntrypointDisplayingContext;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext = this.followersModeOnboardingEntrypointDisplayingContext;
        return hashCode + (mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext == null ? 0 : mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext.hashCode());
    }

    public final String toString() {
        return "FollowersModeSwitchState(isEnabled=" + this.isEnabled + ", followersModeOnboardingEntrypointDisplayingContext=" + this.followersModeOnboardingEntrypointDisplayingContext + ')';
    }

    public /* synthetic */ MobileOfficialAppsSocGraphStat$FollowersModeSwitchState(boolean z, MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext);
    }
}
