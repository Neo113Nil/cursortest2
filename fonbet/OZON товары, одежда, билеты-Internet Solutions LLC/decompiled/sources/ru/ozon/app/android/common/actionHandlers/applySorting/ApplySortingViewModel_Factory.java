package ru.ozon.app.android.common.actionHandlers.applySorting;

import Jb.e;

/* loaded from: classes11.dex */
public final class ApplySortingViewModel_Factory implements e<ApplySortingViewModel> {

    private static final class InstanceHolder {
        private static final ApplySortingViewModel_Factory INSTANCE = new ApplySortingViewModel_Factory();
    }

    public static ApplySortingViewModel_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ApplySortingViewModel newInstance() {
        return new ApplySortingViewModel();
    }

    @Override // Pc.a
    public ApplySortingViewModel get() {
        return newInstance();
    }
}
