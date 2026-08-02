package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.recyclerview;

import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.domain.ProductsInBotV2VO;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.item.ProductsInBotV2ItemView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u008d\u0001\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00126\u0010\u000e\u001a2\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u000b\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eRD\u0010\u000e\u001a2\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/recyclerview/ProductsInBotV2Adapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO$ItemVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/recyclerview/ProductsInBotV2ItemViewHolder;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function3;", "", "", "quantityActionHandler", "Lkotlin/Function2;", "setProduct", "removeProduct", "<init>", "(LWZ/l;Lkotlin/jvm/functions/Function1;Lfd/n;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/recyclerview/ProductsInBotV2ItemViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/recyclerview/ProductsInBotV2ItemViewHolder;", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "Lfd/n;", "Lkotlin/jvm/functions/Function2;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductsInBotV2Adapter extends t<ProductsInBotV2VO.ItemVO, ProductsInBotV2ItemViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final InterfaceC6511n<Long, Integer, Function1<? super Integer, Unit>, Function1<AtomAction, Unit>> quantityActionHandler;

    @NotNull
    private final Function1<Long, Unit> removeProduct;

    @NotNull
    private final Function2<Long, Integer, Unit> setProduct;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProductsInBotV2Adapter(@NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull InterfaceC6511n<? super Long, ? super Integer, ? super Function1<? super Integer, Unit>, ? extends Function1<? super AtomAction, Unit>> quantityActionHandler, @NotNull Function2<? super Long, ? super Integer, Unit> setProduct, @NotNull Function1<? super Long, Unit> removeProduct) {
        super(new ProductInBotV2ListDiffCallback());
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(quantityActionHandler, "quantityActionHandler");
        Intrinsics.checkNotNullParameter(setProduct, "setProduct");
        Intrinsics.checkNotNullParameter(removeProduct, "removeProduct");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = actionHandler;
        this.quantityActionHandler = quantityActionHandler;
        this.setProduct = setProduct;
        this.removeProduct = removeProduct;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ProductsInBotV2ItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ProductsInBotV2VO.ItemVO itemVO = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(itemVO, "get(...)");
        holder.bind(itemVO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ProductsInBotV2ItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ProductsInBotV2ItemViewHolder(new ProductsInBotV2ItemView(context, null, 0, 6, null), this.tokenizedAnalytics, this.actionHandler, this.quantityActionHandler, this.setProduct, this.removeProduct);
    }
}
