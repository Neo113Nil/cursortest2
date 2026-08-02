package ru.ozon.app.android.marketing.widgets.blackFridayStatus.core;

import Jb.e;

/* loaded from: classes12.dex */
public final class BlackFridayStatusTextTitleMapper_Factory implements e<BlackFridayStatusTextTitleMapper> {

    private static final class InstanceHolder {
        private static final BlackFridayStatusTextTitleMapper_Factory INSTANCE = new BlackFridayStatusTextTitleMapper_Factory();
    }

    public static BlackFridayStatusTextTitleMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BlackFridayStatusTextTitleMapper newInstance() {
        return new BlackFridayStatusTextTitleMapper();
    }

    @Override // Pc.a
    public BlackFridayStatusTextTitleMapper get() {
        return newInstance();
    }
}
