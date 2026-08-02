package ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation;

import GZ.g;
import Ib.b;
import Pc.a;

/* loaded from: classes3.dex */
public final class PushOnboardingFragment_MembersInjector implements b<PushOnboardingFragment> {
    public static void injectRouter(PushOnboardingFragment pushOnboardingFragment, g gVar) {
        pushOnboardingFragment.router = gVar;
    }

    public static void injectViewModelProvider(PushOnboardingFragment pushOnboardingFragment, a<PushOnboardingViewModel> aVar) {
        pushOnboardingFragment.viewModelProvider = aVar;
    }
}
