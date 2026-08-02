package com.sofascore.results.fantasy.onboarding.steps;

import androidx.activity.ComponentActivity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.av8;
import defpackage.b6a;
import defpackage.e44;
import defpackage.eqf;
import defpackage.et8;
import defpackage.k7d;
import defpackage.ke;
import defpackage.nf3;
import defpackage.ngb;
import defpackage.of3;
import defpackage.xtc;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class f {
    public static final void a(k7d k7dVar, FantasyOnboardingStepsNavigation fantasyOnboardingStepsNavigation, et8 et8Var, Function1 function1, Function1 function12, xtc xtcVar, of3 of3Var, int i) {
        fantasyOnboardingStepsNavigation.getClass();
        et8Var.getClass();
        function1.getClass();
        function12.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1484915284);
        int i2 = i | (av8Var.i(k7dVar) ? 4 : 2) | (av8Var.g(fantasyOnboardingStepsNavigation) ? 32 : 16) | (av8Var.i(et8Var) ? 256 : 128) | (av8Var.i(function1) ? 2048 : 1024) | (av8Var.g(xtcVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i2 & 1, (74899 & i2) != 74898)) {
            Object k = av8Var.k(ngb.a);
            if (k == null) {
                a70.r("Required value was null.");
                return;
            }
            ComponentActivity componentActivity = (ComponentActivity) k;
            boolean i3 = ((i2 & 896) == 256) | av8Var.i(componentActivity) | av8Var.i(k7dVar) | ((i2 & 7168) == 2048);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                ke keVar = new ke(componentActivity, function12, k7dVar, et8Var, function1, 7);
                av8Var.n0(keVar);
                O = keVar;
            }
            b6a.c(k7dVar, fantasyOnboardingStepsNavigation, xtcVar, null, null, null, null, null, null, (Function1) O, av8Var, (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 >> 9) & 896), IronSourceError.ERROR_INIT_ALREADY_FINISHED);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e44(k7dVar, fantasyOnboardingStepsNavigation, et8Var, function1, function12, xtcVar, i, 6);
        }
    }
}
