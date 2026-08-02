package ru.ozon.app.android.autopicker.view.productpickersearch.data.repo;

import Bc.r;
import Hs.b;
import io.reactivex.k;
import io.reactivex.p;
import io.reactivex.y;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.view.productpickersearch.domain.ProductPickerSearchListHelperKt;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ButtonAnalyticsData;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;
import tc.InterfaceC9801c;
import xc.e;
import xc.i;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0017¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\u001cJ\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0$¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010\u001cJ\u0013\u0010)\u001a\b\u0012\u0004\u0012\u00020(0$¢\u0006\u0004\b)\u0010&J\r\u0010*\u001a\u00020\u0017¢\u0006\u0004\b*\u0010\"J\r\u0010+\u001a\u00020\u0017¢\u0006\u0004\b+\u0010\"J\r\u0010,\u001a\u00020\u0017¢\u0006\u0004\b,\u0010\"J\u0015\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0017¢\u0006\u0004\b3\u0010\"J\u0013\u00104\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b4\u0010.J\u0015\u00105\u001a\u00020\n2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b5\u00102J\r\u00106\u001a\u00020\n¢\u0006\u0004\b6\u0010\u001cJ\u0019\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110$¢\u0006\u0004\b7\u0010&J\u0013\u00108\u001a\b\u0012\u0004\u0012\u00020\u001d0$¢\u0006\u0004\b8\u0010&J\u0013\u00109\u001a\b\u0012\u0004\u0012\u00020/0$¢\u0006\u0004\b9\u0010&J\u0013\u0010:\u001a\b\u0012\u0004\u0012\u00020/0$¢\u0006\u0004\b:\u0010&J\u001f\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010;0$¢\u0006\u0004\b<\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>¨\u0006?"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchRepository;", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchLocalDataSource;", "localDataSource", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchNetworkDataSource;", "networkDataSource", "<init>", "(Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchLocalDataSource;Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchNetworkDataSource;)V", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchInitialNetworkData;", "data", "", "setInitialNetworkData", "(Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchInitialNetworkData;)V", "Lio/reactivex/k;", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO;", "retrieveData", "()Lio/reactivex/k;", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "items", "setItems", "(Ljava/util/List;)V", "setPreSearchItems", "", "state", "setIsSearchState", "(Z)V", "setShouldUpdateState", "()V", "", "text", "setSearchText", "(Ljava/lang/String;)V", "isFirstLoading", "()Z", "trackPageView", "Lio/reactivex/p;", "getPageViewTracking", "()Lio/reactivex/p;", "trackButtonClick", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ButtonAnalyticsData;", "getButtonClickTracking", "isTree", "hasSectionTitles", "hasMultiselection", "getItems", "()Ljava/util/List;", "", "position", "smoothScrollToPosition", "(I)V", "isSearchState", "getPreSearchItems", "scrollToPosition", "updateParams", "getItemsAsObservable", "getSearchTextAsObservable", "getScrollAsObservable", "getSmoothScrollAsObservable", "", "getParamsAsObservable", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchLocalDataSource;", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchNetworkDataSource;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerSearchRepository {

    @NotNull
    private final ProductPickerSearchLocalDataSource localDataSource;

    @NotNull
    private final ProductPickerSearchNetworkDataSource networkDataSource;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.autopicker.view.productpickersearch.data.repo.ProductPickerSearchRepository$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<List<? extends ProductPickerSearchSelectedItem>, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, ProductPickerSearchNetworkDataSource.class, "updateParams", "updateParams(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ProductPickerSearchSelectedItem> list) {
            invoke2((List<ProductPickerSearchSelectedItem>) list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<ProductPickerSearchSelectedItem> list) {
            ((ProductPickerSearchNetworkDataSource) this.receiver).updateParams(list);
        }
    }

    public ProductPickerSearchRepository(@NotNull ProductPickerSearchLocalDataSource localDataSource, @NotNull ProductPickerSearchNetworkDataSource networkDataSource) {
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(networkDataSource, "networkDataSource");
        this.localDataSource = localDataSource;
        this.networkDataSource = networkDataSource;
        localDataSource.setOnItemsAlreadySelected(new AnonymousClass1(networkDataSource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductPickerSearchVO retrieveData$lambda$1$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ProductPickerSearchVO) function1.invoke(p02);
    }

    @NotNull
    public final p<ButtonAnalyticsData> getButtonClickTracking() {
        return this.networkDataSource.buttonClickSubject();
    }

    public final List<ProductPickerSearchVO.ProductPickerSearchItem> getItems() {
        return this.localDataSource.itemsSubject().f();
    }

    @NotNull
    public final p<List<ProductPickerSearchVO.ProductPickerSearchItem>> getItemsAsObservable() {
        return this.localDataSource.itemsSubject();
    }

    @NotNull
    public final p<String> getPageViewTracking() {
        return this.networkDataSource.pageViewSubject();
    }

    @NotNull
    public final p<Map<String, Object>> getParamsAsObservable() {
        return this.networkDataSource.paramsSubject();
    }

    @NotNull
    public final List<ProductPickerSearchVO.ProductPickerSearchItem> getPreSearchItems() {
        return this.localDataSource.getPreSearchItems();
    }

    @NotNull
    public final p<Integer> getScrollAsObservable() {
        return this.localDataSource.scrollSubject();
    }

    @NotNull
    public final p<String> getSearchTextAsObservable() {
        return this.localDataSource.searchSubject();
    }

    @NotNull
    public final p<Integer> getSmoothScrollAsObservable() {
        return this.localDataSource.smoothScrollSubject();
    }

    public final boolean hasMultiselection() {
        return this.localDataSource.getHasMultiselection();
    }

    public final boolean hasSectionTitles() {
        return this.localDataSource.getHasSectionTitles();
    }

    public final boolean isFirstLoading() {
        return this.networkDataSource.getIsFirstLoading();
    }

    public final boolean isSearchState() {
        return this.localDataSource.getIsSearchState();
    }

    public final boolean isTree() {
        return this.localDataSource.getIsTree();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k<ProductPickerSearchVO> retrieveData() {
        k<ProductPickerSearchVO> kVar;
        y<ProductPickerSearchVO> retrieveData = this.networkDataSource.retrieveData(this.localDataSource.getSelectedItems());
        if (retrieveData != null) {
            r rVar = new r(retrieveData, new b(new ProductPickerSearchRepository$retrieveData$1$1(this.localDataSource), 8));
            kVar = rVar instanceof InterfaceC9801c ? ((InterfaceC9801c) rVar).a() : new i<>(rVar);
        }
        kVar = e.f105275a;
        Intrinsics.checkNotNullExpressionValue(kVar, "with(...)");
        return kVar;
    }

    public final void scrollToPosition(int position) {
        this.localDataSource.scrollSubject().onNext(Integer.valueOf(position));
    }

    public final void setInitialNetworkData(@NotNull ProductPickerSearchInitialNetworkData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.networkDataSource.setInitialNetworkData(data);
    }

    public final void setIsSearchState(boolean state) {
        this.localDataSource.setSearchState(state);
    }

    public final void setItems(@NotNull List<ProductPickerSearchVO.ProductPickerSearchItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.localDataSource.itemsSubject().onNext(items);
    }

    public final void setPreSearchItems(@NotNull List<ProductPickerSearchVO.ProductPickerSearchItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.localDataSource.setPreSearchItems(items);
    }

    public final void setSearchText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.localDataSource.searchSubject().onNext(text);
    }

    public final void setShouldUpdateState() {
        this.localDataSource.setShouldUpdateState(true);
    }

    public final void smoothScrollToPosition(int position) {
        this.localDataSource.smoothScrollSubject().onNext(Integer.valueOf(position));
    }

    public final void trackButtonClick() {
        List<ProductPickerSearchVO.ProductPickerSearchItem> f7;
        String actionType;
        String trackingInfoId = this.networkDataSource.getTrackingInfoId();
        if (trackingInfoId == null || (f7 = this.localDataSource.itemsSubject().f()) == null || (actionType = this.networkDataSource.getActionType()) == null) {
            return;
        }
        this.networkDataSource.buttonClickSubject().onNext(new ButtonAnalyticsData(trackingInfoId, actionType, ProductPickerSearchListHelperKt.getSelectionChain(f7)));
    }

    public final void trackPageView() {
        this.networkDataSource.trackPageView();
    }

    public final void updateParams() {
        this.networkDataSource.updateParams(this.localDataSource.getSelectedItems());
    }
}
