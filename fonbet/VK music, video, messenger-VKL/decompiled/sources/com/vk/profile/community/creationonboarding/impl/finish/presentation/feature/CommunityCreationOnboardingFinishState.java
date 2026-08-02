package com.vk.profile.community.creationonboarding.impl.finish.presentation.feature;

import com.vk.profile.community.creationonboarding.api.models.CommunityData;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.lm50;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: CommunityCreationOnboardingFinishState.kt */
/* loaded from: classes5.dex */
public final class CommunityCreationOnboardingFinishState implements lm50 {
    public final String b;
    public final String c;
    public final String d;
    public final List<CommunityData> e;
    public final SubscribeStatus f;
    public final String g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommunityCreationOnboardingFinishState.kt */
    public static final class SubscribeStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SubscribeStatus[] $VALUES;
        public static final SubscribeStatus IN_PROGRESS_NO_SUBSCRIBE;
        public static final SubscribeStatus IN_PROGRESS_SUBSCRIBED;
        public static final SubscribeStatus NO_SUBSCRIBE;
        public static final SubscribeStatus SUBSCRIBED;

        static {
            SubscribeStatus subscribeStatus = new SubscribeStatus("NO_SUBSCRIBE", 0);
            NO_SUBSCRIBE = subscribeStatus;
            SubscribeStatus subscribeStatus2 = new SubscribeStatus("IN_PROGRESS_NO_SUBSCRIBE", 1);
            IN_PROGRESS_NO_SUBSCRIBE = subscribeStatus2;
            SubscribeStatus subscribeStatus3 = new SubscribeStatus("SUBSCRIBED", 2);
            SUBSCRIBED = subscribeStatus3;
            SubscribeStatus subscribeStatus4 = new SubscribeStatus("IN_PROGRESS_SUBSCRIBED", 3);
            IN_PROGRESS_SUBSCRIBED = subscribeStatus4;
            SubscribeStatus[] subscribeStatusArr = {subscribeStatus, subscribeStatus2, subscribeStatus3, subscribeStatus4};
            $VALUES = subscribeStatusArr;
            $ENTRIES = new asp(subscribeStatusArr);
        }

        public SubscribeStatus() {
            throw null;
        }

        public static SubscribeStatus valueOf(String str) {
            return (SubscribeStatus) Enum.valueOf(SubscribeStatus.class, str);
        }

        public static SubscribeStatus[] values() {
            return (SubscribeStatus[]) $VALUES.clone();
        }
    }

    public CommunityCreationOnboardingFinishState(String str, String str2, String str3, List list, SubscribeStatus subscribeStatus, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = subscribeStatus;
        this.g = str4;
    }

    public static CommunityCreationOnboardingFinishState a(CommunityCreationOnboardingFinishState communityCreationOnboardingFinishState, SubscribeStatus subscribeStatus) {
        String str = communityCreationOnboardingFinishState.b;
        String str2 = communityCreationOnboardingFinishState.c;
        String str3 = communityCreationOnboardingFinishState.d;
        List<CommunityData> list = communityCreationOnboardingFinishState.e;
        communityCreationOnboardingFinishState.getClass();
        String str4 = communityCreationOnboardingFinishState.g;
        communityCreationOnboardingFinishState.getClass();
        return new CommunityCreationOnboardingFinishState(str, str2, str3, list, subscribeStatus, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityCreationOnboardingFinishState)) {
            return false;
        }
        CommunityCreationOnboardingFinishState communityCreationOnboardingFinishState = (CommunityCreationOnboardingFinishState) obj;
        return this.b.equals(communityCreationOnboardingFinishState.b) && this.c.equals(communityCreationOnboardingFinishState.c) && this.d.equals(communityCreationOnboardingFinishState.d) && this.e.equals(communityCreationOnboardingFinishState.e) && this.f == communityCreationOnboardingFinishState.f && epx.f(this.g, communityCreationOnboardingFinishState.g);
    }

    public final int hashCode() {
        int b = qoy.b((this.f.hashCode() + fw3.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e)) * 31, 31, false);
        String str = this.g;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityCreationOnboardingFinishState(imageUrl=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", communities=");
        sb.append(this.e);
        sb.append(", subscribeStatus=");
        sb.append(this.f);
        sb.append(", isSubscribed=false, buttonText=");
        return ho8.a(sb, this.g, ')');
    }
}
