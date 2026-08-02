package ru.ozon.app.android.messenger.initializer.di;

import Jb.e;
import Jb.j;
import ru.ozon.android.messenger.framework.navigation.action.f;
import ru.ozon.app.android.messenger.initializer.MessengerActionHandlerImpl;

/* loaded from: classes6.dex */
public final class MessengerInitializerModule_Companion_ProvideMessengerActionHandlerImplFactory implements e<f> {
    public static f provideMessengerActionHandlerImpl(MessengerActionHandlerImpl.Factory factory, String str) {
        f provideMessengerActionHandlerImpl = MessengerInitializerModule.INSTANCE.provideMessengerActionHandlerImpl(factory, str);
        j.d(provideMessengerActionHandlerImpl);
        return provideMessengerActionHandlerImpl;
    }
}
