package ru.ozon.app.android.minifyLink.data;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.action.v2.ActionV2Repository;

/* loaded from: classes6.dex */
public final class MinifyLinkRepositoryImpl_Factory implements e<MinifyLinkRepositoryImpl> {
    private final a<ActionV2Repository> actionV2RepositoryProvider;

    public MinifyLinkRepositoryImpl_Factory(a<ActionV2Repository> aVar) {
        this.actionV2RepositoryProvider = aVar;
    }

    public static MinifyLinkRepositoryImpl_Factory create(a<ActionV2Repository> aVar) {
        return new MinifyLinkRepositoryImpl_Factory(aVar);
    }

    public static MinifyLinkRepositoryImpl newInstance(ActionV2Repository actionV2Repository) {
        return new MinifyLinkRepositoryImpl(actionV2Repository);
    }

    @Override // Pc.a
    public MinifyLinkRepositoryImpl get() {
        return newInstance(this.actionV2RepositoryProvider.get());
    }
}
