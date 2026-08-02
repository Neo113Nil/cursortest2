package ru.ozon.app.android.common.actionHandlers;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.network.abtool.FeatureService;

/* loaded from: classes6.dex */
public final class ModifySearchUrlViewModel_Factory implements e<ModifySearchUrlViewModel> {
    private final a<FeatureService> featureServiceProvider;

    public ModifySearchUrlViewModel_Factory(a<FeatureService> aVar) {
        this.featureServiceProvider = aVar;
    }

    public static ModifySearchUrlViewModel_Factory create(a<FeatureService> aVar) {
        return new ModifySearchUrlViewModel_Factory(aVar);
    }

    public static ModifySearchUrlViewModel newInstance(FeatureService featureService) {
        return new ModifySearchUrlViewModel(featureService);
    }

    @Override // Pc.a
    public ModifySearchUrlViewModel get() {
        return newInstance(this.featureServiceProvider.get());
    }
}
