package ru.ozon.app.android.commonwidgets.actionHandlersFactory.di;

import Jb.e;
import Jb.j;
import android.content.Context;
import ru.ozon.app.android.commonwidgets.actionHandlersFactory.CommonActionHandlersStore;

/* loaded from: classes6.dex */
public final class CommonActionHandlersFactoryModule_Companion_ProvideCommonHandlersStoreFactory implements e<CommonActionHandlersStore> {
    public static CommonActionHandlersStore provideCommonHandlersStore(Context context) {
        CommonActionHandlersStore provideCommonHandlersStore = CommonActionHandlersFactoryModule.INSTANCE.provideCommonHandlersStore(context);
        j.d(provideCommonHandlersStore);
        return provideCommonHandlersStore;
    }
}
