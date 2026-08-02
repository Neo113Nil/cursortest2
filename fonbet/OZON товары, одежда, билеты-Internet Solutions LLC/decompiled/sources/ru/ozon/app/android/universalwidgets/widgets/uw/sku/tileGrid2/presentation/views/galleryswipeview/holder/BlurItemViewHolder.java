package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.holder;

import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegate;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVO;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeView;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/holder/BlurItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeView;", "blurMoleculeView", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "blurMoleculeDelegate", "<init>", "(Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeView;Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;)V", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "moleculeVO", "Lkotlin/Function0;", "", "onItemClicked", "bind", "(Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeView;", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlurItemViewHolder extends j {

    @NotNull
    private final BlurMoleculeDelegate blurMoleculeDelegate;

    @NotNull
    private final BlurMoleculeView blurMoleculeView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurItemViewHolder(@NotNull BlurMoleculeView blurMoleculeView, @NotNull BlurMoleculeDelegate blurMoleculeDelegate) {
        super(blurMoleculeView);
        Intrinsics.checkNotNullParameter(blurMoleculeView, "blurMoleculeView");
        Intrinsics.checkNotNullParameter(blurMoleculeDelegate, "blurMoleculeDelegate");
        this.blurMoleculeView = blurMoleculeView;
        this.blurMoleculeDelegate = blurMoleculeDelegate;
    }

    public final void bind(@NotNull BlurMoleculeVO moleculeVO, Function0<Unit> onItemClicked) {
        Intrinsics.checkNotNullParameter(moleculeVO, "moleculeVO");
        this.blurMoleculeDelegate.bind(this.blurMoleculeView, moleculeVO, onItemClicked);
    }
}
