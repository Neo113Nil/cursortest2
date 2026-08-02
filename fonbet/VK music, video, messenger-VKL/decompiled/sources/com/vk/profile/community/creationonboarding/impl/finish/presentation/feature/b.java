package com.vk.profile.community.creationonboarding.impl.finish.presentation.feature;

import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.CommunityCreationOnboardingFinishState;
import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.awg0;
import xsna.bl50;
import xsna.el50;
import xsna.jl50;
import xsna.l00;
import xsna.lj50;
import xsna.ll50;
import xsna.ln50;
import xsna.n40;
import xsna.on;
import xsna.on50;
import xsna.ozg;
import xsna.pzg;
import xsna.qn50;
import xsna.sj50;
import xsna.yvg0;
import xsna.z8f;
import xsna.zqu;

/* compiled from: CommunityCreationOnboardingFinishInlineActor.kt */
/* loaded from: classes5.dex */
public final class b extends bl50<CommunityCreationOnboardingFinishState, com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.a, on50, yvg0, awg0, pzg> {
    public final zqu c;
    public final sj50<CommunityCreationOnboardingFinishState, on50, ll50<on50, yvg0, awg0>, jl50<CommunityCreationOnboardingFinishState>, pzg> d;

    /* compiled from: CommunityCreationOnboardingFinishInlineActor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityCreationOnboardingFinishState.SubscribeStatus.values().length];
            try {
                iArr[CommunityCreationOnboardingFinishState.SubscribeStatus.NO_SUBSCRIBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityCreationOnboardingFinishState.SubscribeStatus.SUBSCRIBED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(zqu zquVar, sj50 sj50Var) {
        super(sj50Var);
        this.c = zquVar;
        this.d = sj50Var;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<CommunityCreationOnboardingFinishState, on50, ll50<on50, yvg0, awg0>, jl50<CommunityCreationOnboardingFinishState>, pzg> W() {
        return this.d;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.a aVar = (com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.a) lj50Var;
        if (!(aVar instanceof a.C1551a)) {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c(new ozg(((a.b) aVar).b));
            return;
        }
        int i = a.$EnumSwitchMapping$0[((CommunityCreationOnboardingFinishState) this.b.getCurrentState()).f.ordinal()];
        ln50.a.b bVar = ln50.a.a;
        if (i == 1) {
            el50.a.b(this, new on(this, 27));
            f(this, new qn50(0), bVar, new l00(this, 27));
        } else {
            if (i != 2) {
                return;
            }
            el50.a.b(this, new z8f(this, 1));
            f(this, new qn50(0), bVar, new n40(this, 27));
        }
    }
}
