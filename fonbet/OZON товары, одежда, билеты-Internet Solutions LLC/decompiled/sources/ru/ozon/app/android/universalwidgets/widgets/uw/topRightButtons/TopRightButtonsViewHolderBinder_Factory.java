package ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons;

import Jb.e;

/* loaded from: classes2.dex */
public final class TopRightButtonsViewHolderBinder_Factory implements e<TopRightButtonsViewHolderBinder> {

    private static final class InstanceHolder {
        private static final TopRightButtonsViewHolderBinder_Factory INSTANCE = new TopRightButtonsViewHolderBinder_Factory();
    }

    public static TopRightButtonsViewHolderBinder_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TopRightButtonsViewHolderBinder newInstance() {
        return new TopRightButtonsViewHolderBinder();
    }

    @Override // Pc.a
    public TopRightButtonsViewHolderBinder get() {
        return newInstance();
    }
}
