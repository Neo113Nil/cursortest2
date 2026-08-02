package com.vk.stat.scheme;

import com.ironsource.X3;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsSocGraphStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick implements SchemeStat$TypeClick.b {

    @pmi0("click_type")
    private final ClickType clickType;

    @pmi0("followers_mode_onboarding_entrypoint_displaying_context")
    private final MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext followersModeOnboardingEntrypointDisplayingContext;

    @pmi0(X3.i.L)
    private final Integer position;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsSocGraphStat.kt */
    public static final class ClickType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickType[] $VALUES;

        @pmi0("entrypoint")
        public static final ClickType ENTRYPOINT;

        @pmi0("hide_entrypoint")
        public static final ClickType HIDE_ENTRYPOINT;

        @pmi0("hide_onboarding")
        public static final ClickType HIDE_ONBOARDING;

        @pmi0("onboarding_step")
        public static final ClickType ONBOARDING_STEP;

        @pmi0("primary_action")
        public static final ClickType PRIMARY_ACTION;

        static {
            ClickType clickType = new ClickType("ONBOARDING_STEP", 0);
            ONBOARDING_STEP = clickType;
            ClickType clickType2 = new ClickType("ENTRYPOINT", 1);
            ENTRYPOINT = clickType2;
            ClickType clickType3 = new ClickType("PRIMARY_ACTION", 2);
            PRIMARY_ACTION = clickType3;
            ClickType clickType4 = new ClickType("HIDE_ONBOARDING", 3);
            HIDE_ONBOARDING = clickType4;
            ClickType clickType5 = new ClickType("HIDE_ENTRYPOINT", 4);
            HIDE_ENTRYPOINT = clickType5;
            ClickType[] clickTypeArr = {clickType, clickType2, clickType3, clickType4, clickType5};
            $VALUES = clickTypeArr;
            $ENTRIES = new asp(clickTypeArr);
        }

        private ClickType(String str, int i) {
        }

        public static ClickType valueOf(String str) {
            return (ClickType) Enum.valueOf(ClickType.class, str);
        }

        public static ClickType[] values() {
            return (ClickType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick(ClickType clickType, MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext, Integer num) {
        this.clickType = clickType;
        this.followersModeOnboardingEntrypointDisplayingContext = mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext;
        this.position = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick)) {
            return false;
        }
        MobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick = (MobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick) obj;
        return this.clickType == mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick.clickType && this.followersModeOnboardingEntrypointDisplayingContext == mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick.followersModeOnboardingEntrypointDisplayingContext && epx.f(this.position, mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick.position);
    }

    public final int hashCode() {
        int hashCode = this.clickType.hashCode() * 31;
        MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext = this.followersModeOnboardingEntrypointDisplayingContext;
        int hashCode2 = (hashCode + (mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext == null ? 0 : mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext.hashCode())) * 31;
        Integer num = this.position;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowersModeOnboardingClick(clickType=");
        sb.append(this.clickType);
        sb.append(", followersModeOnboardingEntrypointDisplayingContext=");
        sb.append(this.followersModeOnboardingEntrypointDisplayingContext);
        sb.append(", position=");
        return uqi.b(sb, this.position, ')');
    }

    public /* synthetic */ MobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick(ClickType clickType, MobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext, Integer num, int i, zcl zclVar) {
        this(clickType, (i & 2) != 0 ? null : mobileOfficialAppsSocGraphStat$FollowersModeOnboardingEntrypointDisplayingContext, (i & 4) != 0 ? null : num);
    }
}
