package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.items.products;

import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.ProductListItem;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB+\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/ProductsListAdapter;", "Ljk0/i;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/ProductsItemViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/ProductsItemViewHolder;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/ProductsItemViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "ViewType", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductsListAdapter extends i<ProductListItem, ProductsItemViewHolder> {

    @NotNull
    private final AdultListDelegateProvider adultListDelegateProvider;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/ProductsListAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "STATUS_COUNTER_NEAR_TITLE", "STATUS_COUNTER_RIGHT", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_NAME, "BUTTON", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ViewType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType STATUS_COUNTER_NEAR_TITLE = new ViewType("STATUS_COUNTER_NEAR_TITLE", 0);
        public static final ViewType STATUS_COUNTER_RIGHT = new ViewType("STATUS_COUNTER_RIGHT", 1);
        public static final ViewType PRODUCT = new ViewType(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_NAME, 2);
        public static final ViewType BUTTON = new ViewType("BUTTON", 3);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{STATUS_COUNTER_NEAR_TITLE, STATUS_COUNTER_RIGHT, PRODUCT, BUTTON};
        }

        static {
            ViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ViewType(String str, int i11) {
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProductsListAdapter(@NotNull Function1<? super AtomAction, Unit> onAction, @NotNull AdultListDelegateProvider adultListDelegateProvider, @NotNull ComposerReferences refs) {
        super(new i.d<ProductListItem>() { // from class: ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.items.products.ProductsListAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ProductListItem oldItem, ProductListItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ProductListItem oldItem, ProductListItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        }, refs.getContainer().g(), null, 4, null);
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(adultListDelegateProvider, "adultListDelegateProvider");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.onAction = onAction;
        this.adultListDelegateProvider = adultListDelegateProvider;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        int ordinal;
        ProductListItem item = getItem(position);
        if (item instanceof ProductListItem.Status.NearTitle) {
            ordinal = ViewType.STATUS_COUNTER_NEAR_TITLE.ordinal();
        } else if (item instanceof ProductListItem.Status.ContainerRight) {
            ordinal = ViewType.STATUS_COUNTER_RIGHT.ordinal();
        } else if (item instanceof ProductListItem.Product) {
            ordinal = ViewType.PRODUCT.ordinal();
        } else {
            if (!(item instanceof ProductListItem.Button)) {
                throw new o();
            }
            ordinal = ViewType.BUTTON.ordinal();
        }
        return ((Number) WhenExtKt.getExhaustive(Integer.valueOf(ordinal))).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ProductsItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ProductListItem item = getItem(position);
        Unit unit = null;
        if (item instanceof ProductListItem.Status) {
            StatusViewHolder statusViewHolder = holder instanceof StatusViewHolder ? (StatusViewHolder) holder : null;
            if (statusViewHolder != null) {
                statusViewHolder.bind((ProductListItem.Status) item);
                unit = Unit.f71690a;
            }
        } else if (item instanceof ProductListItem.Product) {
            ProductViewHolder productViewHolder = holder instanceof ProductViewHolder ? (ProductViewHolder) holder : null;
            if (productViewHolder != null) {
                productViewHolder.bind((ProductListItem.Product) item);
                unit = Unit.f71690a;
            }
        } else {
            if (!(item instanceof ProductListItem.Button)) {
                throw new o();
            }
            ButtonViewHolder buttonViewHolder = holder instanceof ButtonViewHolder ? (ButtonViewHolder) holder : null;
            if (buttonViewHolder != null) {
                buttonViewHolder.bind((ProductListItem.Button) item);
                unit = Unit.f71690a;
            }
        }
        WhenExtKt.getExhaustive(unit);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ProductsItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Object buttonViewHolder;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == ViewType.STATUS_COUNTER_NEAR_TITLE.ordinal()) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            buttonViewHolder = new StatusViewHolder(new StatusViewCounterNearTitle(context, null, 0, 6, null), this.onAction);
        } else if (viewType == ViewType.STATUS_COUNTER_RIGHT.ordinal()) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            buttonViewHolder = new StatusViewHolder(new StatusViewCounterRight(context2, null, 0, 6, null), this.onAction);
        } else if (viewType == ViewType.PRODUCT.ordinal()) {
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            buttonViewHolder = new ProductViewHolder(new ProductView(context3, null, 0, 6, null), this.adultListDelegateProvider.get(), this.onAction);
        } else {
            if (viewType != ViewType.BUTTON.ordinal()) {
                throw new IllegalArgumentException(Ej.b.a(viewType, "Wrong viewType: "));
            }
            Context context4 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            buttonViewHolder = new ButtonViewHolder(new ButtonV3View(context4, null, 0, 0, 14, null), this.onAction);
        }
        return (ProductsItemViewHolder) WhenExtKt.getExhaustive(buttonViewHolder);
    }
}
