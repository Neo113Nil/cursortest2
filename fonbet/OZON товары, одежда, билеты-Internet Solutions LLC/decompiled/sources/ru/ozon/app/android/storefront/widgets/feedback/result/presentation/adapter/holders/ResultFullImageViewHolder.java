package ru.ozon.app.android.storefront.widgets.feedback.result.presentation.adapter.holders;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.databinding.WidgetNpsFeedbackResultImageBinding;
import ru.ozon.app.android.storefront.widgets.feedback.result.presentation.model.ResultServiceCell;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/adapter/holders/ResultFullImageViewHolder;", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/adapter/holders/ResultBaseViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "getContainerView", "()Landroid/view/View;", "binding", "Lru/ozon/app/android/storefront/databinding/WidgetNpsFeedbackResultImageBinding;", "bindItem", "", "item", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultServiceCell;", "position", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResultFullImageViewHolder extends ResultBaseViewHolder<View> {

    @NotNull
    private final WidgetNpsFeedbackResultImageBinding binding;

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultFullImageViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        WidgetNpsFeedbackResultImageBinding bind = WidgetNpsFeedbackResultImageBinding.bind(getContainerView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.result.presentation.adapter.holders.ResultBaseViewHolder
    public void bindItem(@NotNull ResultServiceCell item, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof ResultServiceCell.ImageBody) {
            WidgetNpsFeedbackResultImageBinding widgetNpsFeedbackResultImageBinding = this.binding;
            TextAtomView textAtomView = widgetNpsFeedbackResultImageBinding.title;
            Intrinsics.f(textAtomView);
            ResultServiceCell.ImageBody imageBody = (ResultServiceCell.ImageBody) item;
            TextAtomHolderKt.bind$default(textAtomView, imageBody.getTitle(), null, 2, null);
            textAtomView.setLetterSpacing(0.0f);
            TextAtomView textAtomView2 = widgetNpsFeedbackResultImageBinding.subtitle;
            Intrinsics.f(textAtomView2);
            TextAtomHolderKt.bind$default(textAtomView2, imageBody.getSubtitle(), null, 2, null);
            textAtomView2.setLetterSpacing(0.0f);
            AppCompatImageView promoImage = widgetNpsFeedbackResultImageBinding.promoImage;
            Intrinsics.checkNotNullExpressionValue(promoImage, "promoImage");
            ImageViewExtKt.load$default(promoImage, imageBody.getImageUrl(), null, null, null, null, false, null, 126, null);
        }
    }

    @Override // ru.ozon.app.android.storefront.widgets.feedback.result.presentation.adapter.holders.ResultBaseViewHolder
    @NotNull
    public View getContainerView() {
        return this.containerView;
    }
}
