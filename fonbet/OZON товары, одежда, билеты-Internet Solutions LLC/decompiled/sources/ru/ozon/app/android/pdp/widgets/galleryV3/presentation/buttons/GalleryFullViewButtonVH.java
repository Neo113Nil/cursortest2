package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.buttons;

import FX.a;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryButtonsVO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/buttons/GalleryFullViewButtonVH;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/buttons/GalleryButtonViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryButtonsVO$GalleryFullViewButtonVO;", "imageView", "Landroid/widget/ImageView;", "onClickFullScreen", "Lkotlin/Function0;", "", "<init>", "(Landroid/widget/ImageView;Lkotlin/jvm/functions/Function0;)V", "bind", "item", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryFullViewButtonVH extends GalleryButtonViewHolder<GalleryButtonsVO.GalleryFullViewButtonVO> {

    @NotNull
    private final ImageView imageView;

    @NotNull
    private final Function0<Unit> onClickFullScreen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryFullViewButtonVH(@NotNull ImageView imageView, @NotNull Function0<Unit> onClickFullScreen) {
        super(imageView);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(onClickFullScreen, "onClickFullScreen");
        this.imageView = imageView;
        this.onClickFullScreen = onClickFullScreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1$lambda$0(GalleryFullViewButtonVH galleryFullViewButtonVH, View view) {
        galleryFullViewButtonVH.onClickFullScreen.invoke();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV3.presentation.buttons.GalleryButtonViewHolder
    public void bind(@NotNull GalleryButtonsVO.GalleryFullViewButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.imageView.setOnClickListener(new a(this, 2));
    }
}
