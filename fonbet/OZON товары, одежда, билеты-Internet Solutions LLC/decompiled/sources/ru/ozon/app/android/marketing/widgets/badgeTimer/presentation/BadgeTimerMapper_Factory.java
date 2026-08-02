package ru.ozon.app.android.marketing.widgets.badgeTimer.presentation;

import Jb.e;

/* loaded from: classes12.dex */
public final class BadgeTimerMapper_Factory implements e<BadgeTimerMapper> {

    private static final class InstanceHolder {
        private static final BadgeTimerMapper_Factory INSTANCE = new BadgeTimerMapper_Factory();
    }

    public static BadgeTimerMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BadgeTimerMapper newInstance() {
        return new BadgeTimerMapper();
    }

    @Override // Pc.a
    public BadgeTimerMapper get() {
        return newInstance();
    }
}
