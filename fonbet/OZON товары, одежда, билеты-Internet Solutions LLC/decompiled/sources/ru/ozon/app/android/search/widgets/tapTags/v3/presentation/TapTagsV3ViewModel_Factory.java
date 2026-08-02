package ru.ozon.app.android.search.widgets.tapTags.v3.presentation;

import Jb.e;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.network.abtool.FeatureChecker;

/* loaded from: classes7.dex */
public final class TapTagsV3ViewModel_Factory implements e<TapTagsV3ViewModel> {
    private final Pc.a<ActionV2Repository> actionV2RepositoryProvider;
    private final Pc.a<FeatureChecker> featureCheckerProvider;

    public TapTagsV3ViewModel_Factory(Pc.a<FeatureChecker> aVar, Pc.a<ActionV2Repository> aVar2) {
        this.featureCheckerProvider = aVar;
        this.actionV2RepositoryProvider = aVar2;
    }

    public static TapTagsV3ViewModel_Factory create(Pc.a<FeatureChecker> aVar, Pc.a<ActionV2Repository> aVar2) {
        return new TapTagsV3ViewModel_Factory(aVar, aVar2);
    }

    public static TapTagsV3ViewModel newInstance(FeatureChecker featureChecker, ActionV2Repository actionV2Repository) {
        return new TapTagsV3ViewModel(featureChecker, actionV2Repository);
    }

    @Override // Pc.a
    public TapTagsV3ViewModel get() {
        return newInstance(this.featureCheckerProvider.get(), this.actionV2RepositoryProvider.get());
    }
}
