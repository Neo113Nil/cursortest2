package ru.ozon.app.android.search.catalog.components.searchresultssortv2.core;

import GZ.k;
import HZ.a;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.actionHandlers.SetCookieAndRefreshHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.data.SearchResultsSortV2DTO;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.presentation.SearchResultsSortV2VO;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.presentation.SearchResultsSortV2WidgetViewHolder;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001)B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR,\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001e\u0010%\u001a\u00060#j\u0002`$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/search/catalog/components/searchresultssortv2/core/SearchResultsSortV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO;", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/SearchResultsSortV2VO;", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/core/SearchResultsSortV2Mapper;", "mapper", "Lru/ozon/app/android/common/actionHandlers/SetCookieAndRefreshHandler$SetCookieAndRefreshAssistedFactory;", "setCookieAndRefreshFactory", "LHZ/a;", "deeplinkHandlersCache", "LGZ/k;", "routeFactory", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/search/catalog/components/searchresultssortv2/core/SearchResultsSortV2Mapper;Lru/ozon/app/android/common/actionHandlers/SetCookieAndRefreshHandler$SetCookieAndRefreshAssistedFactory;LHZ/a;LGZ/k;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/core/SearchResultsSortV2Mapper;", "getMapper", "()Lru/ozon/app/android/search/catalog/components/searchresultssortv2/core/SearchResultsSortV2Mapper;", "Lru/ozon/app/android/common/actionHandlers/SetCookieAndRefreshHandler$SetCookieAndRefreshAssistedFactory;", "LHZ/a;", "LGZ/k;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/SearchResultsSortV2WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Lru/ozon/app/android/composer/widgets/base/StickyConfig;", "widgetStickyConfig", "Ljava/lang/String;", "getWidgetStickyConfig-H4O2Is4", "()Ljava/lang/String;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchResultsSortV2ViewMapper extends WidgetViewMapper<SearchResultsSortV2DTO, SearchResultsSortV2VO> {

    @NotNull
    private final a deeplinkHandlersCache;

    @NotNull
    private final Function2<View, ComposerReferences, SearchResultsSortV2WidgetViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final SearchResultsSortV2Mapper mapper;

    @NotNull
    private final k routeFactory;

    @NotNull
    private final SetCookieAndRefreshHandler.SetCookieAndRefreshAssistedFactory setCookieAndRefreshFactory;

    @NotNull
    private final String widgetStickyConfig;
    public static final int $stable = 8;

    public SearchResultsSortV2ViewMapper(@NotNull SearchResultsSortV2Mapper mapper, @NotNull SetCookieAndRefreshHandler.SetCookieAndRefreshAssistedFactory setCookieAndRefreshFactory, @NotNull a deeplinkHandlersCache, @NotNull k routeFactory, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(setCookieAndRefreshFactory, "setCookieAndRefreshFactory");
        Intrinsics.checkNotNullParameter(deeplinkHandlersCache, "deeplinkHandlersCache");
        Intrinsics.checkNotNullParameter(routeFactory, "routeFactory");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.mapper = mapper;
        this.setCookieAndRefreshFactory = setCookieAndRefreshFactory;
        this.deeplinkHandlersCache = deeplinkHandlersCache;
        this.routeFactory = routeFactory;
        this.layout = R$layout.widget_search_results_sort_v2;
        this.holderProducer = new SearchResultsSortV2ViewMapper$holderProducer$1(this, featureChecker);
        Intrinsics.checkNotNullParameter("SEARCH_STICKY", "tag");
        this.widgetStickyConfig = "SEARCH_STICKY";
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ru.ozon.composer.ui.widget.k<SearchResultsSortV2VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: getWidgetStickyConfig-H4O2Is4, reason: not valid java name and from getter */
    public String getWidgetStickyConfig() {
        return this.widgetStickyConfig;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SearchResultsSortV2DTO, d, List<SearchResultsSortV2VO>> getMapper() {
        return this.mapper;
    }
}
