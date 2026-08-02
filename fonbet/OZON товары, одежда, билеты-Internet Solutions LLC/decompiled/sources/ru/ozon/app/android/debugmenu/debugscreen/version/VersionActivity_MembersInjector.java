package ru.ozon.app.android.debugmenu.debugscreen.version;

import Ib.b;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;

/* loaded from: classes11.dex */
public final class VersionActivity_MembersInjector implements b<VersionActivity> {
    public static void injectAppVersionStorage(VersionActivity versionActivity, AppVersionStorage appVersionStorage) {
        versionActivity.appVersionStorage = appVersionStorage;
    }
}
