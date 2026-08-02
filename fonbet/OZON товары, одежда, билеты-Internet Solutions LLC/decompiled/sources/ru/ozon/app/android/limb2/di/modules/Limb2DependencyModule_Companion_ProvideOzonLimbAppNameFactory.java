package ru.ozon.app.android.limb2.di.modules;

import Jb.e;
import Jb.j;
import Nd0.c;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes6.dex */
public final class Limb2DependencyModule_Companion_ProvideOzonLimbAppNameFactory implements e<c> {
    public static c provideOzonLimbAppName(AppType appType) {
        c provideOzonLimbAppName = Limb2DependencyModule.INSTANCE.provideOzonLimbAppName(appType);
        j.d(provideOzonLimbAppName);
        return provideOzonLimbAppName;
    }
}
