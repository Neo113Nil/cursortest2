package ru.ozon.app.android.action.sheet;

import Ib.b;
import Pc.a;
import WZ.l;

/* loaded from: classes11.dex */
public final class ActionSheetFragment_MembersInjector implements b<ActionSheetFragment> {
    public static void injectHandler(ActionSheetFragment actionSheetFragment, ActionSheetEventHandler actionSheetEventHandler) {
        actionSheetFragment.handler = actionSheetEventHandler;
    }

    public static void injectProvider(ActionSheetFragment actionSheetFragment, a<ActionSheetViewModelImpl> aVar) {
        actionSheetFragment.provider = aVar;
    }

    public static void injectTokenizedAnalytics(ActionSheetFragment actionSheetFragment, l lVar) {
        actionSheetFragment.tokenizedAnalytics = lVar;
    }
}
