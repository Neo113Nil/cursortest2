package ru.ozon.app.android.autopicker.view.productpickersearch.data.repo;

import Nc.C3667a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.view.productpickersearch.domain.ProductPickerSearchListTransformerKt;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e \u000f*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t0\t0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00120\u00120\r¢\u0006\u0004\b\u0013\u0010\u0011J\u001b\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00140\u00140\r¢\u0006\u0004\b\u0015\u0010\u0011J\u001b\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00140\u00140\r¢\u0006\u0004\b\u0016\u0010\u0011J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010!\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001eR\"\u0010$\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR(\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010+R\"\u0010,\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR8\u00100\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R.\u0010\u0010\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e \u000f*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t0\t0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00106R\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00120\u00120\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00106R\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00140\u00140\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00106R\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00140\u00140\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchLocalDataSource;", "", "<init>", "()V", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO;", "vo", "", "prepareInitialItems", "(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO;)V", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchSelectedItem;", "getSelectedItems", "()Ljava/util/List;", "LNc/a;", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "kotlin.jvm.PlatformType", "itemsSubject", "()LNc/a;", "", "searchSubject", "", "scrollSubject", "smoothScrollSubject", "setInitial", "(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO;)Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO;", "", "isTree", "Z", "()Z", "setTree", "(Z)V", "isSearchState", "setSearchState", "hasSectionTitles", "getHasSectionTitles", "setHasSectionTitles", "hasMultiselection", "getHasMultiselection", "setHasMultiselection", "preSearchItems", "Ljava/util/List;", "getPreSearchItems", "setPreSearchItems", "(Ljava/util/List;)V", "shouldUpdateState", "getShouldUpdateState", "setShouldUpdateState", "Lkotlin/Function1;", "onItemsAlreadySelected", "Lkotlin/jvm/functions/Function1;", "getOnItemsAlreadySelected", "()Lkotlin/jvm/functions/Function1;", "setOnItemsAlreadySelected", "(Lkotlin/jvm/functions/Function1;)V", "LNc/a;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerSearchLocalDataSource {
    private boolean hasMultiselection;
    private boolean hasSectionTitles;
    private boolean isSearchState;
    private boolean isTree;

    @NotNull
    private final C3667a<List<ProductPickerSearchVO.ProductPickerSearchItem>> itemsSubject;
    private Function1<? super List<ProductPickerSearchSelectedItem>, Unit> onItemsAlreadySelected;

    @NotNull
    private List<ProductPickerSearchVO.ProductPickerSearchItem> preSearchItems = new ArrayList();

    @NotNull
    private final C3667a<Integer> scrollSubject;

    @NotNull
    private final C3667a<String> searchSubject;
    private boolean shouldUpdateState;

    @NotNull
    private final C3667a<Integer> smoothScrollSubject;

    public ProductPickerSearchLocalDataSource() {
        C3667a<List<ProductPickerSearchVO.ProductPickerSearchItem>> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.itemsSubject = d11;
        C3667a<String> d12 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d12, "create(...)");
        this.searchSubject = d12;
        C3667a<Integer> d13 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d13, "create(...)");
        this.scrollSubject = d13;
        C3667a<Integer> d14 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d14, "create(...)");
        this.smoothScrollSubject = d14;
    }

    private final void prepareInitialItems(ProductPickerSearchVO vo) {
        Function1<? super List<ProductPickerSearchSelectedItem>, Unit> function1;
        Iterator<ProductPickerSearchVO.ProductPickerSearchItem> it = vo.getItems().iterator();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (it.next().getIsSelected()) {
                break;
            } else {
                i12++;
            }
        }
        Integer valueOf = Integer.valueOf(i12);
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            this.preSearchItems = vo.getItems();
            this.itemsSubject.onNext(vo.getItems());
            this.scrollSubject.onNext(0);
            return;
        }
        List<ProductPickerSearchVO.ProductPickerSearchItem> expandToSelected = this.isTree ? ProductPickerSearchListTransformerKt.expandToSelected(vo.getItems(), valueOf.intValue()) : vo.getItems();
        this.preSearchItems = expandToSelected;
        this.itemsSubject.onNext(expandToSelected);
        ArrayList arrayList = new ArrayList();
        for (Object obj : expandToSelected) {
            if (!((ProductPickerSearchVO.ProductPickerSearchItem) obj).getIsHidden()) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i11 = -1;
                break;
            } else if (((ProductPickerSearchVO.ProductPickerSearchItem) it2.next()).getIsSelected()) {
                break;
            } else {
                i11++;
            }
        }
        Integer valueOf2 = Integer.valueOf(i11);
        Integer num = valueOf2.intValue() != -1 ? valueOf2 : null;
        if (num != null) {
            this.scrollSubject.onNext(Integer.valueOf(num.intValue()));
        }
        if (!this.shouldUpdateState || (function1 = this.onItemsAlreadySelected) == null) {
            return;
        }
        function1.invoke(getSelectedItems());
    }

    public final boolean getHasMultiselection() {
        return this.hasMultiselection;
    }

    public final boolean getHasSectionTitles() {
        return this.hasSectionTitles;
    }

    @NotNull
    public final List<ProductPickerSearchVO.ProductPickerSearchItem> getPreSearchItems() {
        return this.preSearchItems;
    }

    public final List<ProductPickerSearchSelectedItem> getSelectedItems() {
        List<ProductPickerSearchVO.ProductPickerSearchItem> f7 = this.itemsSubject.f();
        if (f7 == null) {
            return null;
        }
        ArrayList<ProductPickerSearchVO.ProductPickerSearchItem> arrayList = new ArrayList();
        for (Object obj : f7) {
            ProductPickerSearchVO.ProductPickerSearchItem productPickerSearchItem = (ProductPickerSearchVO.ProductPickerSearchItem) obj;
            if (productPickerSearchItem.getIsSelected() && productPickerSearchItem.getValue() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        for (ProductPickerSearchVO.ProductPickerSearchItem productPickerSearchItem2 : arrayList) {
            String value = productPickerSearchItem2.getValue();
            Intrinsics.f(value);
            arrayList2.add(new ProductPickerSearchSelectedItem(value, productPickerSearchItem2.getTitle().toString()));
        }
        return arrayList2;
    }

    /* renamed from: isSearchState, reason: from getter */
    public final boolean getIsSearchState() {
        return this.isSearchState;
    }

    /* renamed from: isTree, reason: from getter */
    public final boolean getIsTree() {
        return this.isTree;
    }

    @NotNull
    public final C3667a<List<ProductPickerSearchVO.ProductPickerSearchItem>> itemsSubject() {
        return this.itemsSubject;
    }

    @NotNull
    public final C3667a<Integer> scrollSubject() {
        return this.scrollSubject;
    }

    @NotNull
    public final C3667a<String> searchSubject() {
        return this.searchSubject;
    }

    @NotNull
    public final ProductPickerSearchVO setInitial(@NotNull ProductPickerSearchVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.isTree = vo.getIsTree();
        this.hasSectionTitles = vo.getHasSectionTitles();
        this.hasMultiselection = vo.getHasMultiselection();
        prepareInitialItems(vo);
        return vo;
    }

    public final void setOnItemsAlreadySelected(Function1<? super List<ProductPickerSearchSelectedItem>, Unit> function1) {
        this.onItemsAlreadySelected = function1;
    }

    public final void setPreSearchItems(@NotNull List<ProductPickerSearchVO.ProductPickerSearchItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.preSearchItems = list;
    }

    public final void setSearchState(boolean z11) {
        this.isSearchState = z11;
    }

    public final void setShouldUpdateState(boolean z11) {
        this.shouldUpdateState = z11;
    }

    @NotNull
    public final C3667a<Integer> smoothScrollSubject() {
        return this.smoothScrollSubject;
    }
}
