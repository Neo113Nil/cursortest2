package ru.ozon.app.android.messenger.di;

import Jb.e;
import Jb.j;
import ru.ozon.android.messenger.api.a;
import ru.ozon.android.messenger.framework.navigation.action.f;
import ru.ozon.app.android.messenger.initializer.MessengerInitializer;

/* loaded from: classes6.dex */
public final class MessengerFeatureModule_ProvideBloggerFeatureFactory implements e<a> {
    public static a provideBloggerFeature(MessengerFeatureModule messengerFeatureModule, MessengerInitializer messengerInitializer, f fVar, String str) {
        a provideBloggerFeature = messengerFeatureModule.provideBloggerFeature(messengerInitializer, fVar, str);
        j.d(provideBloggerFeature);
        return provideBloggerFeature;
    }
}
