package ru.ozon.app.android.fresh.navigation.interceptors;

import Jb.e;

/* loaded from: classes6.dex */
public final class MoveCartItemsPayloadHandler_Factory implements e<MoveCartItemsPayloadHandler> {

    private static final class InstanceHolder {
        private static final MoveCartItemsPayloadHandler_Factory INSTANCE = new MoveCartItemsPayloadHandler_Factory();
    }

    public static MoveCartItemsPayloadHandler_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MoveCartItemsPayloadHandler newInstance() {
        return new MoveCartItemsPayloadHandler();
    }

    @Override // Pc.a
    public MoveCartItemsPayloadHandler get() {
        return newInstance();
    }
}
