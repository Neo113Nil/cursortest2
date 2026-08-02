package ru.ozon.app.android.search.widgets.searchResult.header.headerView.presentation;

import A00.a;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntityKt;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.FavoriteEntityUpdateKey;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.app.android.search.flags.SearchResultsHeaderComposeEnabled;
import ru.ozon.app.android.search.widgets.searchResult.header.data.SearchResultHeaderDTO;
import ru.ozon.app.android.search.widgets.searchResult.header.di.SearchResultHeaderComponent;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR,\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R(\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/headerView/presentation/SearchResultHeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/search/widgets/searchResult/header/data/SearchResultHeaderDTO;", "Lru/ozon/app/android/search/widgets/searchResult/header/headerView/presentation/SearchResultHeaderVO;", "Lru/ozon/app/android/search/widgets/searchResult/header/di/SearchResultHeaderComponent;", "component", "<init>", "(Lru/ozon/app/android/search/widgets/searchResult/header/di/SearchResultHeaderComponent;)V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/search/widgets/searchResult/header/headerView/presentation/SearchResultHeaderVO;)Lru/ozon/app/android/search/widgets/searchResult/header/headerView/presentation/SearchResultHeaderVO;", "Lru/ozon/app/android/search/widgets/searchResult/header/di/SearchResultHeaderComponent;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lru/ozon/app/android/search/widgets/searchResult/header/headerView/presentation/SearchResultHeaderMapper;", "mapper", "Lru/ozon/app/android/search/widgets/searchResult/header/headerView/presentation/SearchResultHeaderMapper;", "getMapper", "()Lru/ozon/app/android/search/widgets/searchResult/header/headerView/presentation/SearchResultHeaderMapper;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/widgets/searchResult/header/headerView/presentation/SearchResultHeaderViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchResultHeaderViewMapper extends WidgetViewMapper<SearchResultHeaderDTO, SearchResultHeaderVO> {

    @NotNull
    private final SearchResultHeaderComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, SearchResultHeaderViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final SearchResultHeaderMapper mapper;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    public SearchResultHeaderViewMapper(@NotNull SearchResultHeaderComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.layout = R$layout.widget_search_result_header;
        this.mapper = new SearchResultHeaderMapper();
        this.holderProducer = new SearchResultHeaderViewMapper$holderProducer$1(this);
        this.supportedUpdates = C7714v.a0(FavoriteEntityUpdateKey.class);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof SearchResultHeaderDTO) && !this.component.getFeatureChecker().isEnabled(SearchResultsHeaderComposeEnabled.INSTANCE);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<SearchResultHeaderVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SearchResultHeaderDTO, d, List<SearchResultHeaderVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public SearchResultHeaderVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull SearchResultHeaderVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return !(update instanceof FavoriteEntityUpdateKey) ? oldItem : SearchResultHeaderVO.copy$default(oldItem, 0L, null, null, null, null, null, null, FavoriteEntityKt.compareAndGetModel(oldItem.getFavoriteEntityButton(), ((FavoriteEntityUpdateKey) update).getNewFavoriteEntity()), null, null, null, 1919, null);
    }
}
