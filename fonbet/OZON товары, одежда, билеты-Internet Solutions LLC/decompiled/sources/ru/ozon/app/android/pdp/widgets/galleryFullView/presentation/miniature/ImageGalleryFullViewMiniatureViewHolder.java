package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.miniature;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.card.MaterialCardView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.databinding.ItemGalleryFullViewImageMiniatureBinding;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/ImageGalleryFullViewMiniatureViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/BaseGalleryViewMiniatureViewHolder;", "", "Lru/ozon/app/android/pdp/databinding/ItemGalleryFullViewImageMiniatureBinding;", "binding", "Lkotlin/Function0;", "", "selectedItem", "Lkotlin/Function1;", "", "onClick", "<init>", "(Lru/ozon/app/android/pdp/databinding/ItemGalleryFullViewImageMiniatureBinding;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Image;", "item", "", "miniItemsRatio", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Image;Ljava/lang/Double;)V", "Lru/ozon/app/android/pdp/databinding/ItemGalleryFullViewImageMiniatureBinding;", "Lkotlin/jvm/functions/Function0;", "Landroid/view/View;", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ImageGalleryFullViewMiniatureViewHolder extends BaseGalleryViewMiniatureViewHolder {

    @NotNull
    private final ItemGalleryFullViewImageMiniatureBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final Function0<Integer> selectedItem;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImageGalleryFullViewMiniatureViewHolder(@NotNull ItemGalleryFullViewImageMiniatureBinding binding, @NotNull Function0<Integer> selectedItem, @NotNull Function1<? super Integer, Unit> onClick) {
        super(r0, onClick, null);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        MaterialCardView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.selectedItem = selectedItem;
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        this.containerView = itemView;
    }

    public final void bind(@NotNull GalleryFullViewVO.GalleryItemVO.Image item, Double miniItemsRatio) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemGalleryFullViewImageMiniatureBinding itemGalleryFullViewImageMiniatureBinding = this.binding;
        bind(miniItemsRatio);
        AppCompatImageView previewIv = itemGalleryFullViewImageMiniatureBinding.previewIv;
        Intrinsics.checkNotNullExpressionValue(previewIv, "previewIv");
        ImageViewExtKt.load$default(previewIv, item.getUrl(), null, null, null, null, false, null, 126, null);
        itemGalleryFullViewImageMiniatureBinding.previewGroup.setStrokeWidth(this.selectedItem.invoke().intValue() == getAdapterPosition() ? Dimens.INSTANCE.getDP_2() : 0);
    }
}
