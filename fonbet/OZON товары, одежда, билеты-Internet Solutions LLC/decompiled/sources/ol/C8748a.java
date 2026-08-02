package ol;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import ru.ozon.app.android.action.custom.di.CustomActionHandlerComponentFactoryModule;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;

/* renamed from: ol.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C8748a implements InterfaceC7081a {
    @Override // ii.InterfaceC7081a
    public final InterfaceC6958a create(C6740b c6740b) {
        CustomActionHandlersComponentApi provideFactory$lambda$0;
        provideFactory$lambda$0 = CustomActionHandlerComponentFactoryModule.provideFactory$lambda$0(c6740b);
        return provideFactory$lambda$0;
    }
}
