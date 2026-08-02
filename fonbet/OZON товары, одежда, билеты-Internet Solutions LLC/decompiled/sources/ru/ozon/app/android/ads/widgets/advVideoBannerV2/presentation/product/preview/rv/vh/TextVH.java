package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh;

import Il.a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvBannerVideoV2VO;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u000eH\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/rv/vh/TextVH;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/rv/vh/ElementViewHolder;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TextWrapper;", "containerView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;)V", "getContainerView", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "bind", "", "item", "canHandle", "", "", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextVH extends ElementViewHolder<AdvBannerVideoV2VO.TextWrapper> {

    @NotNull
    private final TextAtomView containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextVH(@NotNull TextAtomView containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        getContainerView().setOnClickListener(new a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(TextVH textVH, View view) {
        ViewParent parent = textVH.getContainerView().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.callOnClick();
        }
    }

    @Override // ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh.ElementViewHolder
    protected boolean canHandle(@NotNull Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof AdvBannerVideoV2VO.TextWrapper;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh.ElementViewHolder
    public void bind(@NotNull AdvBannerVideoV2VO.TextWrapper item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextAtomHolderKt.bind$default(getContainerView(), item.getText(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh.ElementViewHolder
    @NotNull
    public TextAtomView getContainerView() {
        return this.containerView;
    }
}
