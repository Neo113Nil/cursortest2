package ru.ozon.app.android.push.di.module;

import Jb.e;
import Jb.j;
import Yg0.a;
import Zg0.d;
import Zg0.g;
import android.app.Application;

/* loaded from: classes7.dex */
public final class OzonPushModule_Companion_ProvideOzonPushFactory implements e<a> {
    public static a provideOzonPush(Application application, g gVar, d dVar) {
        a provideOzonPush = OzonPushModule.INSTANCE.provideOzonPush(application, gVar, dVar);
        j.d(provideOzonPush);
        return provideOzonPush;
    }
}
