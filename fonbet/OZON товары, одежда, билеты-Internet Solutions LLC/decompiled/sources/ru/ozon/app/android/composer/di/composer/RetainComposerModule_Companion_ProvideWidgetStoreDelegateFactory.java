package ru.ozon.app.android.composer.di.composer;

import Jb.e;
import Jb.j;
import l20.c;
import m20.InterfaceC8046a;
import n20.k;
import ru.ozon.app.android.composer.widgets.store.fast.FastWidgetStore;
import ru.ozon.app.android.composer.widgets.store.fast.FastWidgetStore2;

/* loaded from: classes6.dex */
public final class RetainComposerModule_Companion_ProvideWidgetStoreDelegateFactory implements e<k<InterfaceC8046a<?, ? extends c>>> {
    public static k<InterfaceC8046a<?, ? extends c>> provideWidgetStoreDelegate(FastWidgetStore fastWidgetStore, FastWidgetStore2 fastWidgetStore2) {
        k<InterfaceC8046a<?, ? extends c>> provideWidgetStoreDelegate = RetainComposerModule.INSTANCE.provideWidgetStoreDelegate(fastWidgetStore, fastWidgetStore2);
        j.d(provideWidgetStoreDelegate);
        return provideWidgetStoreDelegate;
    }
}
