package ru.ozon.app.android.ui.switchingbutton.delegates;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonStateStorage;

/* loaded from: classes2.dex */
public final class SwitchingButtonComposerActionWithRedirectDelegate_Factory implements e<SwitchingButtonComposerActionWithRedirectDelegate> {
    private final a<ActionV2Repository> actionV2RepositoryProvider;
    private final a<SwitchingButtonStateStorage> switchingButtonStateStorageProvider;

    public SwitchingButtonComposerActionWithRedirectDelegate_Factory(a<ActionV2Repository> aVar, a<SwitchingButtonStateStorage> aVar2) {
        this.actionV2RepositoryProvider = aVar;
        this.switchingButtonStateStorageProvider = aVar2;
    }

    public static SwitchingButtonComposerActionWithRedirectDelegate_Factory create(a<ActionV2Repository> aVar, a<SwitchingButtonStateStorage> aVar2) {
        return new SwitchingButtonComposerActionWithRedirectDelegate_Factory(aVar, aVar2);
    }

    public static SwitchingButtonComposerActionWithRedirectDelegate newInstance(ActionV2Repository actionV2Repository, SwitchingButtonStateStorage switchingButtonStateStorage) {
        return new SwitchingButtonComposerActionWithRedirectDelegate(actionV2Repository, switchingButtonStateStorage);
    }

    @Override // Pc.a
    public SwitchingButtonComposerActionWithRedirectDelegate get() {
        return newInstance(this.actionV2RepositoryProvider.get(), this.switchingButtonStateStorageProvider.get());
    }
}
