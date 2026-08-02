package ru.ozon.app.android.search.widgets.tapTags.v2.presentation;

import Jb.e;
import ru.ozon.app.android.action.v2.ActionV2Repository;

/* loaded from: classes7.dex */
public final class TapTagsV2ViewModel_Factory implements e<TapTagsV2ViewModel> {
    private final Pc.a<ActionV2Repository> actionV2RepositoryProvider;

    public TapTagsV2ViewModel_Factory(Pc.a<ActionV2Repository> aVar) {
        this.actionV2RepositoryProvider = aVar;
    }

    public static TapTagsV2ViewModel_Factory create(Pc.a<ActionV2Repository> aVar) {
        return new TapTagsV2ViewModel_Factory(aVar);
    }

    public static TapTagsV2ViewModel newInstance(ActionV2Repository actionV2Repository) {
        return new TapTagsV2ViewModel(actionV2Repository);
    }

    @Override // Pc.a
    public TapTagsV2ViewModel get() {
        return newInstance(this.actionV2RepositoryProvider.get());
    }
}
