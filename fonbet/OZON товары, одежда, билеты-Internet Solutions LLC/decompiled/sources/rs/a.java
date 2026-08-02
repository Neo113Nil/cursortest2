package rs;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import ru.ozon.app.android.debugmenu.ozondebugmenu.di.OzonDebugMenuComponentApi;
import ru.ozon.app.android.debugmenu.ozondebugmenu.di.factory.OzonDebugMenuComponentFactoryModule;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements InterfaceC7081a {
    @Override // ii.InterfaceC7081a
    public final InterfaceC6958a create(C6740b c6740b) {
        OzonDebugMenuComponentApi provideNetworkComponentFactory$lambda$0;
        provideNetworkComponentFactory$lambda$0 = OzonDebugMenuComponentFactoryModule.provideNetworkComponentFactory$lambda$0(c6740b);
        return provideNetworkComponentFactory$lambda$0;
    }
}
