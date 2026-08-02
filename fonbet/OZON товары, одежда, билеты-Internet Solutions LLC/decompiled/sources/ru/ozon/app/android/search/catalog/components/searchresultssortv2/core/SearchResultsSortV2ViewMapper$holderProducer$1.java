package ru.ozon.app.android.search.catalog.components.searchresultssortv2.core;

import GZ.k;
import HZ.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.actionHandlers.SetCookieAndRefreshHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.presentation.SearchResultsSortV2WidgetViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/SearchResultsSortV2WidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SearchResultsSortV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SearchResultsSortV2WidgetViewHolder> {
    final /* synthetic */ FeatureChecker $featureChecker;
    final /* synthetic */ SearchResultsSortV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchResultsSortV2ViewMapper$holderProducer$1(SearchResultsSortV2ViewMapper searchResultsSortV2ViewMapper, FeatureChecker featureChecker) {
        super(2);
        this.this$0 = searchResultsSortV2ViewMapper;
        this.$featureChecker = featureChecker;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SearchResultsSortV2WidgetViewHolder invoke(View view, ComposerReferences refs) {
        a aVar;
        k kVar;
        SetCookieAndRefreshHandler.SetCookieAndRefreshAssistedFactory setCookieAndRefreshAssistedFactory;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        aVar = this.this$0.deeplinkHandlersCache;
        kVar = this.this$0.routeFactory;
        setCookieAndRefreshAssistedFactory = this.this$0.setCookieAndRefreshFactory;
        return new SearchResultsSortV2WidgetViewHolder(view, refs, aVar, kVar, setCookieAndRefreshAssistedFactory.create(refs), this.$featureChecker);
    }
}
