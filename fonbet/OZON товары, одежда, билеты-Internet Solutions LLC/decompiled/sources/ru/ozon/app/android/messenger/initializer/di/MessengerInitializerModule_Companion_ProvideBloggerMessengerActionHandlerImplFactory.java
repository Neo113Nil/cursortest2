package ru.ozon.app.android.messenger.initializer.di;

import Jb.e;
import Jb.j;
import ru.ozon.android.messenger.framework.navigation.action.f;
import ru.ozon.app.android.messenger.initializer.MessengerActionHandlerImpl;

/* loaded from: classes6.dex */
public final class MessengerInitializerModule_Companion_ProvideBloggerMessengerActionHandlerImplFactory implements e<f> {
    public static f provideBloggerMessengerActionHandlerImpl(MessengerActionHandlerImpl.Factory factory, String str) {
        f provideBloggerMessengerActionHandlerImpl = MessengerInitializerModule.INSTANCE.provideBloggerMessengerActionHandlerImpl(factory, str);
        j.d(provideBloggerMessengerActionHandlerImpl);
        return provideBloggerMessengerActionHandlerImpl;
    }
}
