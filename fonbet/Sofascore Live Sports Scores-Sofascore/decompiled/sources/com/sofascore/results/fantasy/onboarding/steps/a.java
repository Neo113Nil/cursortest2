package com.sofascore.results.fantasy.onboarding.steps;

import com.sofascore.results.fantasy.onboarding.steps.FantasyOnboardingStepsNavigation;
import defpackage.duf;
import defpackage.fuf;
import defpackage.xbb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a {
    public static final /* synthetic */ a a = new a();
    public static final List b;

    static {
        fuf fufVar = duf.a;
        b = kotlin.collections.b.j(fufVar.getOrCreateKotlinClass(FantasyOnboardingStepsNavigation.SelectCompetition.class).getQualifiedName(), fufVar.getOrCreateKotlinClass(FantasyOnboardingStepsNavigation.CreateTeam.class).getQualifiedName(), fufVar.getOrCreateKotlinClass(FantasyOnboardingStepsNavigation.NameTeam.class).getQualifiedName(), fufVar.getOrCreateKotlinClass(FantasyOnboardingStepsNavigation.JoinLeague.class).getQualifiedName());
    }

    public static xbb a(boolean z, boolean z2) {
        xbb b2 = kotlin.collections.a.b();
        b2.addAll(b);
        if (z) {
            b2.remove(duf.a.getOrCreateKotlinClass(FantasyOnboardingStepsNavigation.SelectCompetition.class).getQualifiedName());
        }
        if (z2) {
            b2.remove(duf.a.getOrCreateKotlinClass(FantasyOnboardingStepsNavigation.JoinLeague.class).getQualifiedName());
        }
        return kotlin.collections.a.a(b2);
    }

    public static boolean b(String str, FantasyOnboardingStepsNavigation fantasyOnboardingStepsNavigation) {
        fantasyOnboardingStepsNavigation.getClass();
        return Intrinsics.c(str != null ? StringsKt.g0(str, '/') : null, duf.a.getOrCreateKotlinClass(fantasyOnboardingStepsNavigation.getClass()).getQualifiedName());
    }
}
