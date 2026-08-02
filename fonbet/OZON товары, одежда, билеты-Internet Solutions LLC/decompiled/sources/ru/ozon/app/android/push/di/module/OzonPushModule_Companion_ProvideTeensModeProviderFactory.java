package ru.ozon.app.android.push.di.module;

import Jb.e;
import Jb.j;
import Yg0.g;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;

/* loaded from: classes7.dex */
public final class OzonPushModule_Companion_ProvideTeensModeProviderFactory implements e<g> {
    public static g provideTeensModeProvider(TeensModeStorage teensModeStorage) {
        g provideTeensModeProvider = OzonPushModule.INSTANCE.provideTeensModeProvider(teensModeStorage);
        j.d(provideTeensModeProvider);
        return provideTeensModeProvider;
    }
}
