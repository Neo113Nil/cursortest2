package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem {

    @pmi0("step_num")
    private final int stepNum;

    @pmi0("to_step_num")
    private final Integer toStepNum;

    public CommonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem(int i, Integer num) {
        this.stepNum = i;
        this.toStepNum = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem)) {
            return false;
        }
        CommonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem commonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem = (CommonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem) obj;
        return this.stepNum == commonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem.stepNum && epx.f(this.toStepNum, commonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem.toStepNum);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.stepNum) * 31;
        Integer num = this.toStepNum;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeCommunityOnboardingWizardBannerClickItem(stepNum=");
        sb.append(this.stepNum);
        sb.append(", toStepNum=");
        return uqi.b(sb, this.toStepNum, ')');
    }

    public /* synthetic */ CommonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem(int i, Integer num, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num);
    }
}
