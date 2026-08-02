package ru.ozon.app.android.storefront.onboardingscreen.domain;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.action.v2.ActionV2Repository;

/* loaded from: classes7.dex */
public final class OnboardingInteractorImpl_Factory implements e<OnboardingInteractorImpl> {
    private final a<ActionV2Repository> actionV2RepositoryProvider;

    public OnboardingInteractorImpl_Factory(a<ActionV2Repository> aVar) {
        this.actionV2RepositoryProvider = aVar;
    }

    public static OnboardingInteractorImpl_Factory create(a<ActionV2Repository> aVar) {
        return new OnboardingInteractorImpl_Factory(aVar);
    }

    public static OnboardingInteractorImpl newInstance(ActionV2Repository actionV2Repository) {
        return new OnboardingInteractorImpl(actionV2Repository);
    }

    @Override // Pc.a
    public OnboardingInteractorImpl get() {
        return newInstance(this.actionV2RepositoryProvider.get());
    }
}
