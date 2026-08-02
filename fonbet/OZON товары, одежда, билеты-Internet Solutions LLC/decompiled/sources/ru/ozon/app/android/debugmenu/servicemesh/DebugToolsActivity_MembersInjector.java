package ru.ozon.app.android.debugmenu.servicemesh;

import GZ.g;
import Ib.b;
import ru.ozon.app.android.debugmenu.data.AbVariantService;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.debug.DebugToolsService;

/* loaded from: classes11.dex */
public final class DebugToolsActivity_MembersInjector implements b<DebugToolsActivity> {
    public static void injectAbVariantService(DebugToolsActivity debugToolsActivity, AbVariantService abVariantService) {
        debugToolsActivity.abVariantService = abVariantService;
    }

    public static void injectRouter(DebugToolsActivity debugToolsActivity, g gVar) {
        debugToolsActivity.router = gVar;
    }

    public static void injectService(DebugToolsActivity debugToolsActivity, DebugToolsService debugToolsService) {
        debugToolsActivity.service = debugToolsService;
    }

    public static void injectVersionStorage(DebugToolsActivity debugToolsActivity, AppVersionStorage appVersionStorage) {
        debugToolsActivity.versionStorage = appVersionStorage;
    }
}
