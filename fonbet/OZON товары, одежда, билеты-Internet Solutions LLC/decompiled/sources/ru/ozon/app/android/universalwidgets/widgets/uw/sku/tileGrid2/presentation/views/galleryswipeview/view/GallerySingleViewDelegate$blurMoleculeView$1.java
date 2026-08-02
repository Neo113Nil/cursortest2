package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.image.TileGrid2AdultImageView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class GallerySingleViewDelegate$blurMoleculeView$1 extends AbstractC7737t implements Function0<BlurMoleculeView> {
    final /* synthetic */ ConstraintLayout $root;
    final /* synthetic */ GallerySingleViewDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GallerySingleViewDelegate$blurMoleculeView$1(ConstraintLayout constraintLayout, GallerySingleViewDelegate gallerySingleViewDelegate) {
        super(0);
        this.$root = constraintLayout;
        this.this$0 = gallerySingleViewDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BlurMoleculeView invoke() {
        TileGrid2AdultImageView tileGrid2AdultImageView;
        Context context = this.$root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BlurMoleculeView blurMoleculeView = new BlurMoleculeView(context, null, 0, 6, null);
        blurMoleculeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tileGrid2AdultImageView = this.this$0.gallerySingleView;
        tileGrid2AdultImageView.addView(blurMoleculeView);
        return blurMoleculeView;
    }
}
