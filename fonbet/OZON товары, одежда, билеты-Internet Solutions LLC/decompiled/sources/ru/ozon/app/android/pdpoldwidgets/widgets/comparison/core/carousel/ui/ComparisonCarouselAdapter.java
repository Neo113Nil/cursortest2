package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui;

import Pc.a;
import W10.c;
import WZ.l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.ui.CartAtomBinder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.pdp.ui.configurators.base.LifecycleListAdapter;
import ru.ozon.app.android.pdp.utils.ListItemHolder;
import ru.ozon.app.android.pdpoldwidgets.R$layout;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetComparisonCarouselEmptyItemBinding;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetComparisonCarouselItemBinding;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.model.ComparisonCarouselVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\r\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001Bc\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010-R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00105\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselAdapter;", "Lru/ozon/app/android/pdp/ui/configurators/base/LifecycleListAdapter;", "Lru/ozon/app/android/pdp/utils/ListItemHolder;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselProductViewHolder;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "productFavoriteDelegateProvider", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAtomAction", "LW10/c;", "trackingData", "LPc/a;", "Lru/ozon/app/android/cart/ui/CartAtomBinder;", "binderProvider", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lkotlin/Function0;", "Lru/ozon/composer/ui/widget/l;", "widgetViewItemProvider", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "<init>", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;Lkotlin/jvm/functions/Function1;LW10/c;LPc/a;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselProductViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselProductViewHolder;I)V", "getItemViewType", "(I)I", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "Lkotlin/jvm/functions/Function1;", "LW10/c;", "LPc/a;", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function0;", "", "currentScalingPercent", "F", "getCurrentScalingPercent", "()F", "setCurrentScalingPercent", "(F)V", "containerHeight", "I", "getContainerHeight", "()I", "setContainerHeight", "(I)V", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComparisonCarouselAdapter extends LifecycleListAdapter<ListItemHolder<ComparisonCarouselVO.CarouselVO.ProductViewType>, ComparisonCarouselProductViewHolder> {

    @NotNull
    private final a<CartAtomBinder> binderProvider;
    private int containerHeight;
    private float currentScalingPercent;

    @NotNull
    private final Function1<AtomAction, Unit> onAtomAction;

    @NotNull
    private final ProductFavoriteDelegateProvider productFavoriteDelegateProvider;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;
    private final c trackingData;

    @NotNull
    private final Function0<ru.ozon.composer.ui.widget.l> widgetViewItemProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonCarouselAdapter(@NotNull ProductFavoriteDelegateProvider productFavoriteDelegateProvider, @NotNull Function1<? super AtomAction, Unit> onAtomAction, c cVar, @NotNull a<CartAtomBinder> binderProvider, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs, @NotNull Function0<ru.ozon.composer.ui.widget.l> widgetViewItemProvider, @NotNull J containerViewLifecycleOwner) {
        super(containerViewLifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(productFavoriteDelegateProvider, "productFavoriteDelegateProvider");
        Intrinsics.checkNotNullParameter(onAtomAction, "onAtomAction");
        Intrinsics.checkNotNullParameter(binderProvider, "binderProvider");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(widgetViewItemProvider, "widgetViewItemProvider");
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        this.productFavoriteDelegateProvider = productFavoriteDelegateProvider;
        this.onAtomAction = onAtomAction;
        this.trackingData = cVar;
        this.binderProvider = binderProvider;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.refs = refs;
        this.widgetViewItemProvider = widgetViewItemProvider;
        this.currentScalingPercent = 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return ((ListItemHolder) getItem(position)).getValue() instanceof ComparisonCarouselVO.CarouselVO.ProductViewType.ComparedProduct ? R$layout.pdp_widget_comparison_carousel_item : R$layout.pdp_widget_comparison_carousel_empty_item;
    }

    public final void setContainerHeight(int i11) {
        this.containerHeight = i11;
    }

    public final void setCurrentScalingPercent(float f7) {
        this.currentScalingPercent = f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ComparisonCarouselProductViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ComparisonCarouselVO.CarouselVO.ProductViewType productViewType = (ComparisonCarouselVO.CarouselVO.ProductViewType) ((ListItemHolder) getItem(position)).getValue();
        float f7 = this.currentScalingPercent;
        int i11 = this.containerHeight;
        if (i11 == 0) {
            i11 = holder.itemView.getHeight();
        }
        holder.bind(productViewType, f7, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ComparisonCarouselProductViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        X4.a inflate;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == R$layout.pdp_widget_comparison_carousel_empty_item) {
            inflate = PdpWidgetComparisonCarouselEmptyItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.f(inflate);
        } else {
            inflate = PdpWidgetComparisonCarouselItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.f(inflate);
        }
        X4.a aVar = inflate;
        FavoriteProductDelegate favoriteProductDelegate = this.productFavoriteDelegateProvider.get(this.refs);
        Function1<AtomAction, Unit> function1 = this.onAtomAction;
        c cVar = this.trackingData;
        Function0<ru.ozon.composer.ui.widget.l> function0 = this.widgetViewItemProvider;
        CartAtomBinder cartAtomBinder = this.binderProvider.get();
        Intrinsics.checkNotNullExpressionValue(cartAtomBinder, "get(...)");
        return new ComparisonCarouselProductViewHolder(aVar, favoriteProductDelegate, function1, cVar, function0, cartAtomBinder, this.tokenizedAnalytics);
    }
}
