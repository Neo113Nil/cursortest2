package ru.ozon.app.android.autopicker.view.productpickersearch.domain;

import AF.b;
import Bt.C2673b;
import Mc.a;
import io.reactivex.k;
import io.reactivex.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.repo.ProductPickerSearchInitialNetworkData;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.repo.ProductPickerSearchRepository;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ButtonAnalyticsData;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018¢\u0006\u0004\b\u001f\u0010\u001aJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018¢\u0006\u0004\b \u0010\u001aJ\u001f\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010!0\u0018¢\u0006\u0004\b\"\u0010\u001aJ\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u0018¢\u0006\u0004\b#\u0010\u001aJ\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0018¢\u0006\u0004\b%\u0010\u001aJ\u0013\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0012¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\r¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u001e¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/domain/ProductPickerSearchInteractor;", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchRepository;", "repository", "Lru/ozon/app/android/autopicker/view/productpickersearch/domain/ProductPickerSearchTreeFilter;", "treeFilter", "Lru/ozon/app/android/autopicker/view/productpickersearch/domain/ProductPickerSearchListFilter;", "listFilter", "<init>", "(Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchRepository;Lru/ozon/app/android/autopicker/view/productpickersearch/domain/ProductPickerSearchTreeFilter;Lru/ozon/app/android/autopicker/view/productpickersearch/domain/ProductPickerSearchListFilter;)V", "", "text", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "filterItems", "(Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchInitialNetworkData;", "data", "", "setInitialNetworkData", "(Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchInitialNetworkData;)V", "", "hasMultiselection", "()Z", "Lio/reactivex/p;", "observeItems", "()Lio/reactivex/p;", "Lnc/b;", "observeSearch", "()Lnc/b;", "", "observeScroll", "observeSmoothScroll", "", "observeParams", "observePageViewTracking", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ButtonAnalyticsData;", "observeButtonClickTracking", "Lio/reactivex/k;", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO;", "refreshPage", "()Lio/reactivex/k;", "trackButtonClick", "()V", "item", "performLeafClick", "(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;)V", "position", "performNodeClick", "(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;I)V", "performSearch", "(Ljava/lang/String;)V", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchRepository;", "Lru/ozon/app/android/autopicker/view/productpickersearch/domain/ProductPickerSearchTreeFilter;", "Lru/ozon/app/android/autopicker/view/productpickersearch/domain/ProductPickerSearchListFilter;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerSearchInteractor {

    @NotNull
    private final ProductPickerSearchListFilter listFilter;

    @NotNull
    private final ProductPickerSearchRepository repository;

    @NotNull
    private final ProductPickerSearchTreeFilter treeFilter;

    public ProductPickerSearchInteractor(@NotNull ProductPickerSearchRepository repository, @NotNull ProductPickerSearchTreeFilter treeFilter, @NotNull ProductPickerSearchListFilter listFilter) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(treeFilter, "treeFilter");
        Intrinsics.checkNotNullParameter(listFilter, "listFilter");
        this.repository = repository;
        this.treeFilter = treeFilter;
        this.listFilter = listFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ProductPickerSearchVO.ProductPickerSearchItem> filterItems(String text) {
        List<ProductPickerSearchVO.ProductPickerSearchItem> items = this.repository.getItems();
        if (items == null) {
            return null;
        }
        if (!this.repository.isTree()) {
            return this.repository.hasSectionTitles() ? h.K(text) ? ProductPickerSearchListTransformerKt.toListWithCaptions(items) : this.listFilter.filter(text, C7714v.W0(items)) : h.K(text) ? ProductPickerSearchListTransformerKt.toPlainList$default(items, this.repository.hasMultiselection(), false, 4, null) : this.listFilter.filter(text, C7714v.W0(items));
        }
        if (!this.repository.isSearchState()) {
            this.repository.setIsSearchState(true);
            this.repository.setPreSearchItems(C7714v.W0(items));
        }
        if (!h.K(text)) {
            return this.treeFilter.filter(text, C7714v.W0(items));
        }
        this.repository.setIsSearchState(false);
        return this.repository.getPreSearchItems();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List observeSearch$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (List) function1.invoke(p02);
    }

    public final boolean hasMultiselection() {
        return this.repository.hasMultiselection();
    }

    @NotNull
    public final p<ButtonAnalyticsData> observeButtonClickTracking() {
        return this.repository.getButtonClickTracking();
    }

    @NotNull
    public final p<List<ProductPickerSearchVO.ProductPickerSearchItem>> observeItems() {
        return this.repository.getItemsAsObservable();
    }

    @NotNull
    public final p<String> observePageViewTracking() {
        return this.repository.getPageViewTracking();
    }

    @NotNull
    public final p<Map<String, Object>> observeParams() {
        return this.repository.getParamsAsObservable();
    }

    @NotNull
    public final p<Integer> observeScroll() {
        return this.repository.getScrollAsObservable();
    }

    @NotNull
    public final InterfaceC8487b observeSearch() {
        InterfaceC8487b subscribe = this.repository.getSearchTextAsObservable().debounce(300L, TimeUnit.MILLISECONDS).map(new C2673b(new ProductPickerSearchInteractor$observeSearch$1(this), 6)).subscribeOn(a.b()).subscribe(new AF.a(new ProductPickerSearchInteractor$observeSearch$2(this), 11), new b(new ProductPickerSearchInteractor$observeSearch$3(Lm0.a.f17149a), 10));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        return subscribe;
    }

    @NotNull
    public final p<Integer> observeSmoothScroll() {
        return this.repository.getSmoothScrollAsObservable();
    }

    public final void performLeafClick(@NotNull ProductPickerSearchVO.ProductPickerSearchItem item) {
        String value;
        Intrinsics.checkNotNullParameter(item, "item");
        List<ProductPickerSearchVO.ProductPickerSearchItem> items = this.repository.getItems();
        if (items != null && (value = item.getValue()) != null) {
            this.repository.setItems(this.repository.hasMultiselection() ? ProductPickerSearchListTransformerKt.selectItemInCheckboxList(items, value) : ProductPickerSearchListTransformerKt.selectItemInRadioList(items, value));
            this.repository.updateParams();
        }
        List<ProductPickerSearchVO.ProductPickerSearchItem> preSearchItems = this.repository.getPreSearchItems();
        String value2 = item.getValue();
        if (value2 != null) {
            this.repository.setPreSearchItems(this.repository.hasMultiselection() ? ProductPickerSearchListTransformerKt.selectItemInCheckboxList(preSearchItems, value2) : ProductPickerSearchListTransformerKt.selectItemInRadioList(preSearchItems, value2));
        }
    }

    public final void performNodeClick(@NotNull ProductPickerSearchVO.ProductPickerSearchItem item, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        List<ProductPickerSearchVO.ProductPickerSearchItem> items = this.repository.getItems();
        if (items != null) {
            ArrayList W02 = C7714v.W0(items);
            int indexOf = W02.indexOf(item);
            if (item.getIsCollapsed()) {
                this.treeFilter.expandCategory(indexOf, W02);
                this.repository.smoothScrollToPosition(position);
            } else {
                this.treeFilter.collapseCategory(indexOf, W02);
            }
            this.repository.setItems(W02);
        }
    }

    public final void performSearch(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.repository.setSearchText(text);
    }

    @NotNull
    public final k<ProductPickerSearchVO> refreshPage() {
        k<ProductPickerSearchVO> retrieveData = this.repository.retrieveData();
        if (this.repository.isFirstLoading()) {
            this.repository.trackPageView();
            return retrieveData;
        }
        this.repository.setShouldUpdateState();
        return retrieveData;
    }

    public final void setInitialNetworkData(@NotNull ProductPickerSearchInitialNetworkData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.repository.setInitialNetworkData(data);
    }

    public final void trackButtonClick() {
        this.repository.trackButtonClick();
    }
}
