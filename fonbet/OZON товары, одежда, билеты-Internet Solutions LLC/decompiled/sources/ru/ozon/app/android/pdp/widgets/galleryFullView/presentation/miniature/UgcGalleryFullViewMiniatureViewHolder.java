package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.miniature;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.databinding.ItemGalleryFullViewUgcMiniatureBinding;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/UgcGalleryFullViewMiniatureViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/BaseGalleryViewMiniatureViewHolder;", "binding", "Lru/ozon/app/android/pdp/databinding/ItemGalleryFullViewUgcMiniatureBinding;", "selectedItem", "Lkotlin/Function0;", "", "onClick", "Lkotlin/Function1;", "", "<init>", "(Lru/ozon/app/android/pdp/databinding/ItemGalleryFullViewUgcMiniatureBinding;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Ugc;", "miniItemsRatio", "", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Ugc;Ljava/lang/Double;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UgcGalleryFullViewMiniatureViewHolder extends BaseGalleryViewMiniatureViewHolder {

    @NotNull
    private final ItemGalleryFullViewUgcMiniatureBinding binding;

    @NotNull
    private final Function0<Integer> selectedItem;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UgcGalleryFullViewMiniatureViewHolder(@NotNull ItemGalleryFullViewUgcMiniatureBinding binding, @NotNull Function0<Integer> selectedItem, @NotNull Function1<? super Integer, Unit> onClick) {
        super(r0, onClick, null);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.selectedItem = selectedItem;
        binding.previewTav.setTextIsSelectable(false);
    }

    public final void bind(@NotNull GalleryFullViewVO.GalleryItemVO.Ugc item, Double miniItemsRatio) {
        String image;
        Intrinsics.checkNotNullParameter(item, "item");
        ItemGalleryFullViewUgcMiniatureBinding itemGalleryFullViewUgcMiniatureBinding = this.binding;
        bind(miniItemsRatio);
        Icon miniIcon = item.getMiniIcon();
        if (miniIcon == null || (image = miniIcon.getImage()) == null) {
            ImageView previewIv = itemGalleryFullViewUgcMiniatureBinding.previewIv;
            Intrinsics.checkNotNullExpressionValue(previewIv, "previewIv");
            ViewExtKt.gone(previewIv);
        } else {
            ImageView previewIv2 = itemGalleryFullViewUgcMiniatureBinding.previewIv;
            Intrinsics.checkNotNullExpressionValue(previewIv2, "previewIv");
            ViewExtKt.show(previewIv2);
            ImageView previewIv3 = itemGalleryFullViewUgcMiniatureBinding.previewIv;
            Intrinsics.checkNotNullExpressionValue(previewIv3, "previewIv");
            ru.ozon.app.android.pdp.utils.ViewExtKt.loadIcon$default(previewIv3, image, null, null, 6, null);
        }
        ImageView previewIv4 = itemGalleryFullViewUgcMiniatureBinding.previewIv;
        Intrinsics.checkNotNullExpressionValue(previewIv4, "previewIv");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Icon miniIcon2 = item.getMiniIcon();
        ThemeExtKt.tint(previewIv4, styleParser.parseColor(context, miniIcon2 != null ? miniIcon2.getTintColor() : null));
        itemGalleryFullViewUgcMiniatureBinding.previewGroup.setSelected(this.selectedItem.invoke().intValue() == getAdapterPosition());
        TextAtomV2View previewTav = itemGalleryFullViewUgcMiniatureBinding.previewTav;
        Intrinsics.checkNotNullExpressionValue(previewTav, "previewTav");
        TextHolderKt.bindOrGone$default(previewTav, item.getMiniText(), null, 2, null);
    }
}
