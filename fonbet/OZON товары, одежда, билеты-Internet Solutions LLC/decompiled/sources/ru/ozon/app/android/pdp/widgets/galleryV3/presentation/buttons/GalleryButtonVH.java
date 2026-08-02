package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.buttons;

import androidx.cardview.widget.CardView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.buttons.LargeIconButtonHolderKt;
import ru.ozon.app.android.pdp.databinding.PdpWidgetGalleryButtonBinding;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryButtonsVO;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.LargeIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/buttons/GalleryButtonVH;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/buttons/GalleryButtonViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryButtonsVO$GalleryButtonVO;", "binding", "Lru/ozon/app/android/pdp/databinding/PdpWidgetGalleryButtonBinding;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/app/android/pdp/databinding/PdpWidgetGalleryButtonBinding;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryButtonVH extends GalleryButtonViewHolder<GalleryButtonsVO.GalleryButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final PdpWidgetGalleryButtonBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GalleryButtonVH(@NotNull PdpWidgetGalleryButtonBinding binding, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        CardView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = actionHandler;
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV3.presentation.buttons.GalleryButtonViewHolder
    public void bind(@NotNull GalleryButtonsVO.GalleryButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        PdpWidgetGalleryButtonBinding pdpWidgetGalleryButtonBinding = this.binding;
        LargeIconButtonView iconButtonLibv = pdpWidgetGalleryButtonBinding.iconButtonLibv;
        Intrinsics.checkNotNullExpressionValue(iconButtonLibv, "iconButtonLibv");
        LargeIconButtonHolderKt.bind$default(iconButtonLibv, item.getButton(), this.actionHandler, false, 4, null);
        LargeIconButtonView iconButtonLibv2 = pdpWidgetGalleryButtonBinding.iconButtonLibv;
        Intrinsics.checkNotNullExpressionValue(iconButtonLibv2, "iconButtonLibv");
        int dp_8 = Dimens.INSTANCE.getDP_8();
        iconButtonLibv2.setPadding(dp_8, dp_8, dp_8, dp_8);
    }
}
