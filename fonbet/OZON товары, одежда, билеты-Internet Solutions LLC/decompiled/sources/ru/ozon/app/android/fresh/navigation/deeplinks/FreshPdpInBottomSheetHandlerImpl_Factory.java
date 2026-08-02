package ru.ozon.app.android.fresh.navigation.deeplinks;

import Jb.e;

/* loaded from: classes6.dex */
public final class FreshPdpInBottomSheetHandlerImpl_Factory implements e<FreshPdpInBottomSheetHandlerImpl> {

    private static final class InstanceHolder {
        private static final FreshPdpInBottomSheetHandlerImpl_Factory INSTANCE = new FreshPdpInBottomSheetHandlerImpl_Factory();
    }

    public static FreshPdpInBottomSheetHandlerImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FreshPdpInBottomSheetHandlerImpl newInstance() {
        return new FreshPdpInBottomSheetHandlerImpl();
    }

    @Override // Pc.a
    public FreshPdpInBottomSheetHandlerImpl get() {
        return newInstance();
    }
}
