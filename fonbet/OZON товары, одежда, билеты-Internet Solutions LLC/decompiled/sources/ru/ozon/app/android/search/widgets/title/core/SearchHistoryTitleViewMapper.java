package ru.ozon.app.android.search.widgets.title.core;

import AO.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.di.SearchPrefetchApi;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.di.searchHistoryRepository.SearchHistoryRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.history.catalog.data.SearchHistoryDTO;
import ru.ozon.app.android.search.widgets.history.catalog.di.DaggerSearchHistoryWidgetComponent;
import ru.ozon.app.android.search.widgets.history.catalog.di.SearchHistoryWidgetComponent;
import ru.ozon.app.android.search.widgets.history.catalog.presentation.SearchHistoryCanMapDelegate;
import ru.ozon.app.android.search.widgets.title.presentation.SearchTitleVO;
import ru.ozon.app.android.search.widgets.title.presentation.SearchTitleView;
import ru.ozon.app.android.search.widgets.title.presentation.SearchTitleViewHolder;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R,\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/search/widgets/title/core/SearchHistoryTitleViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/search/widgets/history/catalog/di/SearchHistoryWidgetComponent;", "Lru/ozon/app/android/search/widgets/history/catalog/data/SearchHistoryDTO;", "Lru/ozon/app/android/search/widgets/title/presentation/SearchTitleVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/search/widgets/title/presentation/SearchTitleView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/search/widgets/title/presentation/SearchTitleView;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/widgets/title/presentation/SearchTitleViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "Lru/ozon/app/android/search/widgets/title/core/SearchHistoryTitleMapper;", "getMapper", "()Lru/ozon/app/android/search/widgets/title/core/SearchHistoryTitleMapper;", "mapper", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchHistoryTitleViewMapper extends WidgetViewMapper2<SearchHistoryWidgetComponent, SearchHistoryDTO, SearchTitleVO> {

    @NotNull
    private final Function2<View, ComposerReferences, SearchTitleViewHolder> holderProducer = new SearchHistoryTitleViewMapper$holderProducer$1(this);
    private final Void layout;

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchHistoryWidgetComponent widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerSearchHistoryWidgetComponent.factory().create((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class), (ComposerComponentApi) c7475g.getComponent(ComposerComponentApi.class), (SearchHistoryRepositoryComponentApi) c7475g.getComponent(SearchHistoryRepositoryComponentApi.class), (SearchPrefetchApi) c7475g.getComponent(SearchPrefetchApi.class));
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return SearchHistoryCanMapDelegate.INSTANCE.canMap(state);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, SearchTitleViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SearchHistoryWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(SearchHistoryWidgetComponent.class), new a(storage, 10));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public SearchTitleView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new SearchTitleView(context);
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public SearchHistoryTitleMapper getMapper() {
        return component().titleMapper();
    }
}
