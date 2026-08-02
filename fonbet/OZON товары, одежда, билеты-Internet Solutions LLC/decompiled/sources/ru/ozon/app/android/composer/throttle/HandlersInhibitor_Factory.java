package ru.ozon.app.android.composer.throttle;

import Jb.e;

/* loaded from: classes11.dex */
public final class HandlersInhibitor_Factory implements e<HandlersInhibitor> {

    private static final class InstanceHolder {
        private static final HandlersInhibitor_Factory INSTANCE = new HandlersInhibitor_Factory();
    }

    public static HandlersInhibitor_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static HandlersInhibitor newInstance() {
        return new HandlersInhibitor();
    }

    @Override // Pc.a
    public HandlersInhibitor get() {
        return newInstance();
    }
}
