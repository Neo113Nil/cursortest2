package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh;

import GW.a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u000eH\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/rv/vh/PriceVH;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/rv/vh/ElementViewHolder;", "Lru/ozon/uni/atoms/data/price/Price;", "containerView", "Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;)V", "getContainerView", "()Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;", "bind", "", "item", "canHandle", "", "", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PriceVH extends ElementViewHolder<Price> {

    @NotNull
    private final PriceView containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceVH(@NotNull PriceView containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        getContainerView().setOnClickListener(new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(PriceVH priceVH, View view) {
        ViewParent parent = priceVH.getContainerView().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.callOnClick();
        }
    }

    @Override // ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh.ElementViewHolder
    protected boolean canHandle(@NotNull Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof Price;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh.ElementViewHolder
    public void bind(@NotNull Price item) {
        Intrinsics.checkNotNullParameter(item, "item");
        PriceHolderKt.bind$default(getContainerView(), item, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh.ElementViewHolder
    @NotNull
    public PriceView getContainerView() {
        return this.containerView;
    }
}
