package com.vk.video.polls.nav;

import android.content.Context;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import com.vk.video.polls.entrypoint.model.UxPollType;
import com.vk.video.polls.nav.PollNavParams;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.cpo;
import xsna.dhr0;
import xsna.gb70;
import xsna.gu9;
import xsna.iah0;
import xsna.izs;
import xsna.jgp;
import xsna.ji80;
import xsna.nu1;
import xsna.ri80;
import xsna.v88;

/* compiled from: UxPollsNavigatorImpl.kt */
/* loaded from: classes6.dex */
public final class c implements b {
    public final Context a;
    public final gb70 b;

    /* compiled from: UxPollsNavigatorImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[UxPollType.values().length];
            try {
                iArr[UxPollType.DiscoveryPoll.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UxPollType.RecommendationsPoll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PollNavParams.Strategy.values().length];
            try {
                iArr2[PollNavParams.Strategy.ALL_IN_ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PollNavParams.Strategy.ONE_BY_ONE_GROUPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PollNavParams.Strategy.ONE_IN_ONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public c(Context context, gb70 gb70Var) {
        this.a = context;
        this.b = gb70Var;
    }

    @Override // com.vk.video.polls.nav.b
    public final void a(izs<? super PollNavParams.a, PollNavParams> izsVar) {
        v88.a aVar;
        com.vk.video.polls.nav.a aVar2 = new com.vk.video.polls.nav.a();
        aVar2.b = PollNavParams.Strategy.ONE_BY_ONE_GROUPED;
        aVar2.c = jgp.b;
        aVar2.d = dhr0.C().c;
        PollNavParams invoke = izsVar.invoke(aVar2);
        PollNavParams.Strategy strategy = invoke.c;
        UxPollEntryPoint uxPollEntryPoint = invoke.b;
        int i = a.$EnumSwitchMapping$1[strategy.ordinal()];
        Context context = this.a;
        if (i == 1) {
            aVar = new nu1.a(context, null);
        } else if (i == 2) {
            aVar = new ji80.a(context, null);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new ri80.a(context, null);
        }
        aVar.e = invoke;
        UxPollEntryPointLocation.a aVar3 = UxPollEntryPointLocation.Companion;
        UxPollEntryPointLocation uxPollEntryPointLocation = uxPollEntryPoint.c;
        aVar3.getClass();
        int i2 = a.$EnumSwitchMapping$0[UxPollEntryPointLocation.a.a(uxPollEntryPointLocation).ordinal()];
        if (i2 == 1) {
            aVar.c(new cpo(false, 0, 5));
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.m(R.attr.vk_ui_background_modal);
        }
        aVar.u0(invoke.e);
        aVar.F0(true);
        aVar.x(0);
        float f = 8;
        aVar.u(iah0.a(f));
        aVar.J();
        aVar.y(gu9.c(R.attr.vk_ui_background_modal, aVar.c));
        aVar.d.w0 = iah0.a(f);
        aVar.I0("PollDialogFragment");
        if (uxPollEntryPoint.d) {
            this.b.invoke(uxPollEntryPoint);
        }
    }
}
