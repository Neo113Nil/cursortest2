package ru.ozon.app.android.storefront.stories.playstoriesv3.data;

import Jb.e;

/* loaded from: classes2.dex */
public final class StoryV3UpdateStore_Factory implements e<StoryV3UpdateStore> {

    private static final class InstanceHolder {
        private static final StoryV3UpdateStore_Factory INSTANCE = new StoryV3UpdateStore_Factory();
    }

    public static StoryV3UpdateStore_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static StoryV3UpdateStore newInstance() {
        return new StoryV3UpdateStore();
    }

    @Override // Pc.a
    public StoryV3UpdateStore get() {
        return newInstance();
    }
}
