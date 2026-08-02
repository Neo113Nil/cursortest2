package ru.ozon.app.android.composer.network.cache.di;

import Jb.e;
import Jb.j;
import We.C4862d;
import android.content.Context;

/* loaded from: classes6.dex */
public final class CacheModule_Companion_ProvideOkHttpCacheFactory implements e<C4862d> {
    public static C4862d provideOkHttpCache(Context context) {
        C4862d provideOkHttpCache = CacheModule.INSTANCE.provideOkHttpCache(context);
        j.d(provideOkHttpCache);
        return provideOkHttpCache;
    }
}
