package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.binder;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementListAdapterV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementVOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.decorations.VerticalSpacerDecoration;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\t2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012J\u0006\u0010\u0014\u001a\u00020\tJ\u0006\u0010\u0015\u001a\u00020\tJ\b\u0010\u0016\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/binder/ProductBottomDynamicElementBinder;", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;)V", "isInitialized", "", "dynamicElementAdapter", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementListAdapterV2;", "bind", "dynamicElements", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2;", "onAttach", "onDetach", "ensureInitialized", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductBottomDynamicElementBinder {

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final DynamicElementListAdapterV2 dynamicElementAdapter;
    private boolean isInitialized;

    @NotNull
    private final RecyclerView recyclerView;

    public ProductBottomDynamicElementBinder(@NotNull RecyclerView recyclerView, @NotNull ComposerReferences composerReferences, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.recyclerView = recyclerView;
        this.composerReferences = composerReferences;
        this.dynamicElementAdapter = new DynamicElementListAdapterV2(actionHandler);
    }

    private final void ensureInitialized() {
        if (this.isInitialized) {
            return;
        }
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.setAdapter(this.dynamicElementAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setItemAnimator(null);
        recyclerView.setRecycledViewPool(this.composerReferences.getComposerViewPoolProvider().getViewPool());
        recyclerView.addItemDecoration(new VerticalSpacerDecoration());
        this.isInitialized = true;
    }

    public final void bind(List<? extends DynamicElementVOV2> dynamicElements) {
        List<? extends DynamicElementVOV2> list = dynamicElements;
        if (list == null || list.isEmpty()) {
            ViewExtKt.gone(this.recyclerView);
            return;
        }
        ensureInitialized();
        ViewExtKt.show(this.recyclerView);
        this.dynamicElementAdapter.submitList(dynamicElements);
    }

    public final void onAttach() {
        this.recyclerView.swapAdapter(this.dynamicElementAdapter, true);
    }

    public final void onDetach() {
        this.recyclerView.swapAdapter(null, true);
    }
}
