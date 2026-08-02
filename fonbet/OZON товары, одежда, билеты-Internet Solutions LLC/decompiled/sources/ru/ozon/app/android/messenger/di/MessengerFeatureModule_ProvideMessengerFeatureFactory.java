package ru.ozon.app.android.messenger.di;

import Jb.e;
import Jb.j;
import ru.ozon.android.messenger.api.a;
import ru.ozon.android.messenger.framework.navigation.action.f;
import ru.ozon.app.android.messenger.initializer.MessengerInitializer;

/* loaded from: classes6.dex */
public final class MessengerFeatureModule_ProvideMessengerFeatureFactory implements e<a> {
    public static a provideMessengerFeature(MessengerFeatureModule messengerFeatureModule, MessengerInitializer messengerInitializer, f fVar, String str) {
        a provideMessengerFeature = messengerFeatureModule.provideMessengerFeature(messengerInitializer, fVar, str);
        j.d(provideMessengerFeature);
        return provideMessengerFeature;
    }
}
