package ru.ozon.app.android.videocover;

import Jb.e;

/* loaded from: classes7.dex */
public final class ContinuousScrollStateListener_Factory implements e<ContinuousScrollStateListener> {

    private static final class InstanceHolder {
        private static final ContinuousScrollStateListener_Factory INSTANCE = new ContinuousScrollStateListener_Factory();
    }

    public static ContinuousScrollStateListener_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ContinuousScrollStateListener newInstance() {
        return new ContinuousScrollStateListener();
    }

    @Override // Pc.a
    public ContinuousScrollStateListener get() {
        return newInstance();
    }
}
