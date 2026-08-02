package ru.ozon.app.android.debugmenu.debugwidgets;

import Ib.b;
import ru.ozon.app.android.debug.WidgetsDebugToolsInteractor;
import ru.ozon.app.android.storage.debug.DebugToolsStorage;

/* loaded from: classes11.dex */
public final class WidgetsDebugToolsActivity_MembersInjector implements b<WidgetsDebugToolsActivity> {
    public static void injectDebugToolsStorage(WidgetsDebugToolsActivity widgetsDebugToolsActivity, DebugToolsStorage debugToolsStorage) {
        widgetsDebugToolsActivity.debugToolsStorage = debugToolsStorage;
    }

    public static void injectInteractor(WidgetsDebugToolsActivity widgetsDebugToolsActivity, WidgetsDebugToolsInteractor widgetsDebugToolsInteractor) {
        widgetsDebugToolsActivity.interactor = widgetsDebugToolsInteractor;
    }
}
