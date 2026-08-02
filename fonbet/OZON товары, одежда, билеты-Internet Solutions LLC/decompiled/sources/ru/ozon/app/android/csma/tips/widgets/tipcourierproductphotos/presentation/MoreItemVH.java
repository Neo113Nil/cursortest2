package ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.databinding.WidgetTipCourierProductPhotosItemMoreBinding;
import ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.presentation.ProductPhotoItem;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/presentation/MoreItemVH;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/presentation/ItemVH;", "imageView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "binding", "Lru/ozon/app/android/csma/tips/databinding/WidgetTipCourierProductPhotosItemMoreBinding;", "bindItem", "", "item", "Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/presentation/ProductPhotoItem;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MoreItemVH extends ItemVH {

    @NotNull
    private final WidgetTipCourierProductPhotosItemMoreBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreItemVH(@NotNull View imageView) {
        super(imageView);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        WidgetTipCourierProductPhotosItemMoreBinding bind = WidgetTipCourierProductPhotosItemMoreBinding.bind(getContainerView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.presentation.ItemVH
    public void bindItem(@NotNull ProductPhotoItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.moreCountTv.setText(((ProductPhotoItem.MoreCountItem) item).getCountText());
    }
}
