package ru.ozon.app.android.marketing.widgets.badgeTimer.presentation;

import Jb.e;

/* loaded from: classes12.dex */
public final class BadgeTimerViewModelImpl_Factory implements e<BadgeTimerViewModelImpl> {

    private static final class InstanceHolder {
        private static final BadgeTimerViewModelImpl_Factory INSTANCE = new BadgeTimerViewModelImpl_Factory();
    }

    public static BadgeTimerViewModelImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BadgeTimerViewModelImpl newInstance() {
        return new BadgeTimerViewModelImpl();
    }

    @Override // Pc.a
    public BadgeTimerViewModelImpl get() {
        return newInstance();
    }
}
