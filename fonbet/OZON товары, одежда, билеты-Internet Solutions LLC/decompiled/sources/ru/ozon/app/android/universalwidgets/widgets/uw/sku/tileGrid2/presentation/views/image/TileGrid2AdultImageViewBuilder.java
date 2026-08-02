package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.image;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.R$id;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/image/TileGrid2AdultImageViewBuilder;", "", "<init>", "()V", "addImageWithBgDrawer", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/image/AspectRatioImageWithBgView;", "viewGroup", "Landroid/widget/FrameLayout;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid2AdultImageViewBuilder {

    @NotNull
    public static final TileGrid2AdultImageViewBuilder INSTANCE = new TileGrid2AdultImageViewBuilder();

    private TileGrid2AdultImageViewBuilder() {
    }

    @NotNull
    public final AspectRatioImageWithBgView addImageWithBgDrawer(@NotNull FrameLayout viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AspectRatioImageWithBgView aspectRatioImageWithBgView = new AspectRatioImageWithBgView(context, null, 0, 6, null);
        aspectRatioImageWithBgView.setAdjustViewBounds(true);
        aspectRatioImageWithBgView.setId(R$id.imageIv);
        viewGroup.addView(aspectRatioImageWithBgView, new FrameLayout.LayoutParams(-1, -1));
        return aspectRatioImageWithBgView;
    }
}
