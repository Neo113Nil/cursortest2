package ru.ozon.app.android.sellerproducts.sellerProducts.binders;

import Sc.InterfaceC4008j;
import Vg.c;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hk0.C6968a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolderDelegate;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.app.android.sellerproducts.sellerProducts.listener.ProductStateClickListener;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductStateRecyclerViewBinder;", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductPropertyBinder;", "<init>", "()V", "Lru/ozon/composer/ui/widget/k;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Landroid/view/ViewGroup;", "itemView", "", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;Landroid/view/ViewGroup;)V", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Ll20/d;", "info", "holder", "bind", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "Landroidx/recyclerview/widget/RecyclerView;", "container$delegate", "LSc/j;", "getContainer", "()Landroidx/recyclerview/widget/RecyclerView;", "container", "Lhk0/a;", "Lru/ozon/app/android/uikit/recycler/BackgroundBindListItemAdapter;", "contentAdapter", "Lhk0/a;", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductStateRecyclerViewBinder$SpacesItemDecoration;", "itemDecoration", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductStateRecyclerViewBinder$SpacesItemDecoration;", "SpacesItemDecoration", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductStateRecyclerViewBinder extends ProductPropertyBinder {

    /* renamed from: container$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j container = LazyUtilsKt.unsafeLazy(new ProductStateRecyclerViewBinder$container$2(this));

    @NotNull
    private final C6968a contentAdapter = new C6968a(new AtomItemViewHolderDelegate(null, null, null, 7, null));

    @NotNull
    private final SpacesItemDecoration itemDecoration = new SpacesItemDecoration();

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductStateRecyclerViewBinder$SpacesItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/View;", "view", "", "isNotLast", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Z", "Landroid/graphics/Rect;", "outRect", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "dp2", "I", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class SpacesItemDecoration extends RecyclerView.n {
        private final int dp2 = ResourceExtKt.toPx(2);

        private final boolean isNotLast(RecyclerView recyclerView, View view) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            RecyclerView.g adapter = recyclerView.getAdapter();
            return childAdapterPosition < (adapter != null ? adapter.getItemCount() : 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            if (isNotLast(parent, view)) {
                outRect.bottom = this.dp2;
            }
        }
    }

    private final RecyclerView getContainer() {
        return (RecyclerView) this.container.getValue();
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void bind(@NotNull ProductVO product, @NotNull d info, @NotNull k<?> holder) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind(product, info, holder);
        C6968a c6968a = this.contentAdapter;
        List<AtomDTO> state = product.getState();
        if (state == null) {
            state = K.f71697a;
        }
        c6968a.submitList(state);
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void init(@NotNull k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, @NotNull c customActionHandlersStore, ViewGroup itemView) {
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        super.init(widgetViewHolder, composerReferences, customActionHandlersStore, itemView);
        RecyclerView container = getContainer();
        container.setItemAnimator(null);
        container.setLayoutManager(new LinearLayoutManager(getContainer().getContext()));
        container.setAdapter(this.contentAdapter);
        container.addItemDecoration(this.itemDecoration);
        container.setRecycledViewPool(composerReferences.getComposerViewPoolProvider().getViewPool());
        container.addOnItemTouchListener(new ProductStateClickListener(new ProductStateRecyclerViewBinder$init$1$1(this)));
    }
}
