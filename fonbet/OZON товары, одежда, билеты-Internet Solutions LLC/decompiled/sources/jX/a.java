package jX;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import ru.ozon.app.android.storefront.onboardingscreen.di.CloseFlowWatcherComponentApi;
import ru.ozon.app.android.ui.start.di.closeFlowWatcher.CloseFlowWatcherFactoryModule;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7081a {
    @Override // ii.InterfaceC7081a
    public final InterfaceC6958a create(C6740b c6740b) {
        CloseFlowWatcherComponentApi provideFactory$lambda$0;
        provideFactory$lambda$0 = CloseFlowWatcherFactoryModule.provideFactory$lambda$0(c6740b);
        return provideFactory$lambda$0;
    }
}
