package ru.ozon.app.android.fresh.navigation.onboarding;

import Jb.e;

/* loaded from: classes12.dex */
public final class OnBoardingMapper_Factory implements e<OnBoardingMapper> {

    private static final class InstanceHolder {
        private static final OnBoardingMapper_Factory INSTANCE = new OnBoardingMapper_Factory();
    }

    public static OnBoardingMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static OnBoardingMapper newInstance() {
        return new OnBoardingMapper();
    }

    @Override // Pc.a
    public OnBoardingMapper get() {
        return newInstance();
    }
}
