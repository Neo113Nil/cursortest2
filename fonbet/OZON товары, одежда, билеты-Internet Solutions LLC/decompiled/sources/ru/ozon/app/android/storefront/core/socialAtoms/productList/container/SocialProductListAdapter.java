package ru.ozon.app.android.storefront.core.socialAtoms.productList.container;

import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemVO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ViewSize;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.allProducts.AllProductsVO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.allProducts.large.LargeAllProductsViewHolder;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.allProducts.small.SmallAllProductsViewHolder;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.coupon.CouponsContainerVO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.coupon.CouponsContainerViewHolder;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.product.large.LargeProductVO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.product.large.LargeProductViewHolder;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.product.small.SmallProductVO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.product.small.SmallProductViewHolder;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.service.ServiceVO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.service.ServiceViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040 ¢\u0006\u0004\b\"\u0010#R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R0\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010$\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\bR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lkotlin/Function1;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ProductListItemVO;", "", "onItemAttached", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "pos", "getItem", "(I)Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ProductListItemVO;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "handleAtomAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "holder", "onViewAttachedToWindow", "(Landroidx/recyclerview/widget/RecyclerView$C;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "", "list", "setup", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "onAction", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "", "currentList", "Ljava/util/List;", "ViewType", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SocialProductListAdapter extends RecyclerView.g<RecyclerView.C> {

    @NotNull
    private final List<ProductListItemVO> currentList;
    private Function1<? super AtomAction, Unit> onAction;

    @NotNull
    private final Function1<ProductListItemVO, Unit> onItemAttached;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "ITEM_ALL_PRODUCTS_LARGE", "ITEM_ALL_PRODUCTS_SMALL", "ITEM_PRODUCT_LARGE", "ITEM_PRODUCT_SMALL", "ITEM_COUPONS_CONTAINER", "ITEM_SERVICE", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType ITEM_ALL_PRODUCTS_LARGE = new ViewType("ITEM_ALL_PRODUCTS_LARGE", 0);
        public static final ViewType ITEM_ALL_PRODUCTS_SMALL = new ViewType("ITEM_ALL_PRODUCTS_SMALL", 1);
        public static final ViewType ITEM_PRODUCT_LARGE = new ViewType("ITEM_PRODUCT_LARGE", 2);
        public static final ViewType ITEM_PRODUCT_SMALL = new ViewType("ITEM_PRODUCT_SMALL", 3);
        public static final ViewType ITEM_COUPONS_CONTAINER = new ViewType("ITEM_COUPONS_CONTAINER", 4);
        public static final ViewType ITEM_SERVICE = new ViewType("ITEM_SERVICE", 5);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{ITEM_ALL_PRODUCTS_LARGE, ITEM_ALL_PRODUCTS_SMALL, ITEM_PRODUCT_LARGE, ITEM_PRODUCT_SMALL, ITEM_COUPONS_CONTAINER, ITEM_SERVICE};
        }

        static {
            ViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ViewType(String str, int i11) {
        }

        @NotNull
        public static a<ViewType> getEntries() {
            return $ENTRIES;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.ITEM_ALL_PRODUCTS_LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.ITEM_ALL_PRODUCTS_SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewType.ITEM_PRODUCT_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ViewType.ITEM_PRODUCT_SMALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ViewType.ITEM_COUPONS_CONTAINER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ViewType.ITEM_SERVICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SocialProductListAdapter(@NotNull Function1<? super ProductListItemVO, Unit> onItemAttached) {
        Intrinsics.checkNotNullParameter(onItemAttached, "onItemAttached");
        this.onItemAttached = onItemAttached;
        this.currentList = new ArrayList();
    }

    private final ProductListItemVO getItem(int pos) {
        return this.currentList.get(pos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAtomAction(AtomAction action) {
        Function1<? super AtomAction, Unit> function1 = this.onAction;
        if (function1 != null) {
            function1.invoke(action);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.currentList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        ViewType viewType;
        ProductListItemVO item = getItem(position);
        if (item instanceof AllProductsVO) {
            viewType = ((AllProductsVO) item).getViewSize() == ViewSize.SMALL ? ViewType.ITEM_ALL_PRODUCTS_SMALL : ViewType.ITEM_ALL_PRODUCTS_LARGE;
        } else if (item instanceof LargeProductVO) {
            viewType = ViewType.ITEM_PRODUCT_LARGE;
        } else if (item instanceof SmallProductVO) {
            viewType = ViewType.ITEM_PRODUCT_SMALL;
        } else if (item instanceof CouponsContainerVO) {
            viewType = ViewType.ITEM_COUPONS_CONTAINER;
        } else {
            if (!(item instanceof ServiceVO)) {
                throw new IllegalArgumentException("неизвестный VO для атома productList");
            }
            viewType = ViewType.ITEM_SERVICE;
        }
        return viewType.ordinal();
    }

    public final Function1<AtomAction, Unit> getOnAction() {
        return this.onAction;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof LargeProductViewHolder) {
            ProductListItemVO item = getItem(position);
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.storefront.core.socialAtoms.productList.items.product.large.LargeProductVO");
            ((LargeProductViewHolder) holder).bind((LargeProductVO) item);
            return;
        }
        if (holder instanceof SmallProductViewHolder) {
            ProductListItemVO item2 = getItem(position);
            Intrinsics.g(item2, "null cannot be cast to non-null type ru.ozon.app.android.storefront.core.socialAtoms.productList.items.product.small.SmallProductVO");
            ((SmallProductViewHolder) holder).bind((SmallProductVO) item2);
            return;
        }
        if (holder instanceof LargeAllProductsViewHolder) {
            ProductListItemVO item3 = getItem(position);
            Intrinsics.g(item3, "null cannot be cast to non-null type ru.ozon.app.android.storefront.core.socialAtoms.productList.items.allProducts.AllProductsVO");
            ((LargeAllProductsViewHolder) holder).bind((AllProductsVO) item3);
            return;
        }
        if (holder instanceof SmallAllProductsViewHolder) {
            ProductListItemVO item4 = getItem(position);
            Intrinsics.g(item4, "null cannot be cast to non-null type ru.ozon.app.android.storefront.core.socialAtoms.productList.items.allProducts.AllProductsVO");
            ((SmallAllProductsViewHolder) holder).bind((AllProductsVO) item4);
        } else if (holder instanceof CouponsContainerViewHolder) {
            ProductListItemVO item5 = getItem(position);
            Intrinsics.g(item5, "null cannot be cast to non-null type ru.ozon.app.android.storefront.core.socialAtoms.productList.items.coupon.CouponsContainerVO");
            ((CouponsContainerViewHolder) holder).bind((CouponsContainerVO) item5);
        } else if (holder instanceof ServiceViewHolder) {
            ProductListItemVO item6 = getItem(position);
            Intrinsics.g(item6, "null cannot be cast to non-null type ru.ozon.app.android.storefront.core.socialAtoms.productList.items.service.ServiceVO");
            ((ServiceViewHolder) holder).bind((ServiceVO) item6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (WhenMappings.$EnumSwitchMapping$0[((ViewType) ViewType.getEntries().get(viewType)).ordinal()]) {
            case 1:
                return new LargeAllProductsViewHolder(parent, new SocialProductListAdapter$onCreateViewHolder$1(this), null, null, null, 28, null);
            case 2:
                return new SmallAllProductsViewHolder(parent, new SocialProductListAdapter$onCreateViewHolder$2(this), null, null, null, 28, null);
            case 3:
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new LargeProductViewHolder(context, new SocialProductListAdapter$onCreateViewHolder$3(this), null, 4, null);
            case 4:
                return new SmallProductViewHolder(parent, new SocialProductListAdapter$onCreateViewHolder$4(this), null, null, null, null, null, 124, null);
            case 5:
                return new CouponsContainerViewHolder(parent, new SocialProductListAdapter$onCreateViewHolder$5(this), null, 4, null);
            case 6:
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new ServiceViewHolder(context2, new SocialProductListAdapter$onCreateViewHolder$6(this), null, 4, null);
            default:
                throw new o();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(@NotNull RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder.getAdapterPosition() != -1) {
            this.onItemAttached.invoke(getItem(holder.getAdapterPosition()));
        }
    }

    public final void setOnAction(Function1<? super AtomAction, Unit> function1) {
        this.onAction = function1;
    }

    public final void setup(@NotNull List<? extends ProductListItemVO> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.currentList.clear();
        this.currentList.addAll(list);
        notifyDataSetChanged();
    }
}
