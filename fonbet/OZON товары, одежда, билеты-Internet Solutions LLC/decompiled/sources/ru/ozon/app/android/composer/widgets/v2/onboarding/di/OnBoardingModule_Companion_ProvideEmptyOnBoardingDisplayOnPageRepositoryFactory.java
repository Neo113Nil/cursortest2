package ru.ozon.app.android.composer.widgets.v2.onboarding.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository;

/* loaded from: classes11.dex */
public final class OnBoardingModule_Companion_ProvideEmptyOnBoardingDisplayOnPageRepositoryFactory implements e<OnBoardingDisplayOnPageRepository> {

    private static final class InstanceHolder {
        private static final OnBoardingModule_Companion_ProvideEmptyOnBoardingDisplayOnPageRepositoryFactory INSTANCE = new OnBoardingModule_Companion_ProvideEmptyOnBoardingDisplayOnPageRepositoryFactory();
    }

    public static OnBoardingModule_Companion_ProvideEmptyOnBoardingDisplayOnPageRepositoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static OnBoardingDisplayOnPageRepository provideEmptyOnBoardingDisplayOnPageRepository() {
        OnBoardingDisplayOnPageRepository provideEmptyOnBoardingDisplayOnPageRepository = OnBoardingModule.INSTANCE.provideEmptyOnBoardingDisplayOnPageRepository();
        j.d(provideEmptyOnBoardingDisplayOnPageRepository);
        return provideEmptyOnBoardingDisplayOnPageRepository;
    }

    @Override // Pc.a
    public OnBoardingDisplayOnPageRepository get() {
        return provideEmptyOnBoardingDisplayOnPageRepository();
    }
}
