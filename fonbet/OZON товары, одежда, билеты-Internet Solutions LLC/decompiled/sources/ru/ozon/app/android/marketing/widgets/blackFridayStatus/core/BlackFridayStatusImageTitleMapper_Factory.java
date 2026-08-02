package ru.ozon.app.android.marketing.widgets.blackFridayStatus.core;

import Jb.e;

/* loaded from: classes12.dex */
public final class BlackFridayStatusImageTitleMapper_Factory implements e<BlackFridayStatusImageTitleMapper> {

    private static final class InstanceHolder {
        private static final BlackFridayStatusImageTitleMapper_Factory INSTANCE = new BlackFridayStatusImageTitleMapper_Factory();
    }

    public static BlackFridayStatusImageTitleMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BlackFridayStatusImageTitleMapper newInstance() {
        return new BlackFridayStatusImageTitleMapper();
    }

    @Override // Pc.a
    public BlackFridayStatusImageTitleMapper get() {
        return newInstance();
    }
}
