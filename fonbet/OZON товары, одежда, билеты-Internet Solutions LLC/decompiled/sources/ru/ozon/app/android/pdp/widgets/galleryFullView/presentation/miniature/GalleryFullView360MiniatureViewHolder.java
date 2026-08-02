package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.miniature;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/GalleryFullView360MiniatureViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/BaseGalleryViewMiniatureViewHolder;", "view", "Landroid/widget/ImageView;", "selectedItem", "Lkotlin/Function0;", "", "onClick", "Lkotlin/Function1;", "", "<init>", "(Landroid/widget/ImageView;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Photo360;", "miniItemsRatio", "", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Photo360;Ljava/lang/Double;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryFullView360MiniatureViewHolder extends BaseGalleryViewMiniatureViewHolder {

    @NotNull
    private final Function0<Integer> selectedItem;

    @NotNull
    private final ImageView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryFullView360MiniatureViewHolder(@NotNull ImageView view, @NotNull Function0<Integer> selectedItem, @NotNull Function1<? super Integer, Unit> onClick) {
        super(view, onClick, null);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.view = view;
        this.selectedItem = selectedItem;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bind(@NotNull GalleryFullViewVO.GalleryItemVO.Photo360 item, Double miniItemsRatio) {
        Intrinsics.checkNotNullParameter(item, "item");
        bind(miniItemsRatio);
        Icon miniIcon = item.getMiniIcon();
        if (miniIcon != null) {
            ViewExtKt.show(this.view);
            Unit unit = null;
            ru.ozon.app.android.pdp.utils.ViewExtKt.bind$default(this.view, miniIcon, null, 2, null);
            Drawable drawable = this.view.getDrawable();
            if (drawable != null) {
                Dimens dimens = Dimens.INSTANCE;
                drawable.setBounds(0, 0, dimens.getDP_24(), dimens.getDP_24());
                unit = Unit.f71690a;
            }
        }
        ViewExtKt.gone(this.view);
        this.view.setSelected(this.selectedItem.invoke().intValue() == getAdapterPosition());
    }
}
