package ru.ozon.app.android.commonvertical.sharedCarouselViewModel;

import Jb.e;

/* loaded from: classes11.dex */
public final class SharedCarouselViewModel_Factory implements e<SharedCarouselViewModel> {

    private static final class InstanceHolder {
        private static final SharedCarouselViewModel_Factory INSTANCE = new SharedCarouselViewModel_Factory();
    }

    public static SharedCarouselViewModel_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SharedCarouselViewModel newInstance() {
        return new SharedCarouselViewModel();
    }

    @Override // Pc.a
    public SharedCarouselViewModel get() {
        return newInstance();
    }
}
