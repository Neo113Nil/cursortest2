package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0002H\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/rv/vh/InvalidVH;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/rv/vh/ElementViewHolder;", "", "containerView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getContainerView", "()Landroid/view/View;", "bind", "", "item", "canHandle", "", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InvalidVH extends ElementViewHolder<Object> {

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidVH(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    @Override // ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh.ElementViewHolder
    protected void bind(@NotNull Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ViewExtKt.gone(getContainerView());
    }

    @Override // ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh.ElementViewHolder
    protected boolean canHandle(@NotNull Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return true;
    }

    @Override // ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh.ElementViewHolder
    @NotNull
    protected View getContainerView() {
        return this.containerView;
    }
}
