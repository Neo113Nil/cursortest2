package ru.ozon.app.android.returns.ui.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.returns.ui.domain.events.ReturnCreationEventManager;

/* loaded from: classes13.dex */
public final class RmsModule_Companion_ProvideReturnCreationEventManagerFactory implements e<ReturnCreationEventManager> {
    public static ReturnCreationEventManager provideReturnCreationEventManager() {
        ReturnCreationEventManager provideReturnCreationEventManager = RmsModule.INSTANCE.provideReturnCreationEventManager();
        j.d(provideReturnCreationEventManager);
        return provideReturnCreationEventManager;
    }
}
