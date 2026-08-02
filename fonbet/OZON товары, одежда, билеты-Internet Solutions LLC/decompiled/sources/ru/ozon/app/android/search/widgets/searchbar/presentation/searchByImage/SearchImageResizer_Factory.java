package ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage;

import Jb.e;
import Pc.a;
import android.content.Context;
import ru.ozon.app.android.network.abtool.FeatureChecker;

/* loaded from: classes7.dex */
public final class SearchImageResizer_Factory implements e<SearchImageResizer> {
    private final a<Context> appContextProvider;
    private final a<FeatureChecker> featureCheckerProvider;

    public SearchImageResizer_Factory(a<Context> aVar, a<FeatureChecker> aVar2) {
        this.appContextProvider = aVar;
        this.featureCheckerProvider = aVar2;
    }

    public static SearchImageResizer_Factory create(a<Context> aVar, a<FeatureChecker> aVar2) {
        return new SearchImageResizer_Factory(aVar, aVar2);
    }

    public static SearchImageResizer newInstance(Context context, FeatureChecker featureChecker) {
        return new SearchImageResizer(context, featureChecker);
    }

    @Override // Pc.a
    public SearchImageResizer get() {
        return newInstance(this.appContextProvider.get(), this.featureCheckerProvider.get());
    }
}
