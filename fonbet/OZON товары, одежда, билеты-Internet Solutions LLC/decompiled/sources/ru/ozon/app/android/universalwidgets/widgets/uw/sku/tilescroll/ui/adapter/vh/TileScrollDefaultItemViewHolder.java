package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.adapter.vh;

import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileMoleculeDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.view.SmallTileMoleculeView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileScrollVO;
import ru.ozon.composer.ui.widget.f;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/adapter/vh/TileScrollDefaultItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileMoleculeView;", "view", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/SmallTileMoleculeDelegate;", "smallTileMoleculeDelegate", "Lkotlin/Function0;", "Lru/ozon/composer/ui/widget/f;", "getViewedPond", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileMoleculeView;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/SmallTileMoleculeDelegate;Lkotlin/jvm/functions/Function0;)V", "", "onAttach", "()V", "onDetach", "onRecycle", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onViewInOverlapBounds", "onViewOutOfOverlapBounds", "onViewInVisibleBounds", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$TileVO;", "item", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$TileVO;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileMoleculeView;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/SmallTileMoleculeDelegate;", "Lkotlin/jvm/functions/Function0;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileScrollDefaultItemViewHolder extends j {

    @NotNull
    private final Function0<f> getViewedPond;

    @NotNull
    private final SmallTileMoleculeDelegate smallTileMoleculeDelegate;

    @NotNull
    private final SmallTileMoleculeView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileScrollDefaultItemViewHolder(@NotNull SmallTileMoleculeView view, @NotNull SmallTileMoleculeDelegate smallTileMoleculeDelegate, @NotNull Function0<f> getViewedPond) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(smallTileMoleculeDelegate, "smallTileMoleculeDelegate");
        Intrinsics.checkNotNullParameter(getViewedPond, "getViewedPond");
        this.view = view;
        this.smallTileMoleculeDelegate = smallTileMoleculeDelegate;
        this.getViewedPond = getViewedPond;
    }

    public final void bind(@NotNull TileScrollVO.ItemVO.TileVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.smallTileMoleculeDelegate.updateFixedWidth(this.view, item.getModel().getImageComponent().getImageModel().getImage().getWidthImage());
        this.smallTileMoleculeDelegate.bind(item, false);
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        this.smallTileMoleculeDelegate.onAttach();
    }

    @Override // jk0.j
    public void onDetach() {
        this.smallTileMoleculeDelegate.onDetach(getLifecycle());
        super.onDetach();
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.smallTileMoleculeDelegate.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    @Override // jk0.j
    public void onRecycle() {
        this.smallTileMoleculeDelegate.onRecycle();
        super.onRecycle();
    }

    @Override // jk0.j, lk0.b
    public void onViewInOverlapBounds() {
        super.onViewInOverlapBounds();
        this.smallTileMoleculeDelegate.onViewInOverlapBounds();
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        this.smallTileMoleculeDelegate.trackView(this.getViewedPond.invoke());
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfOverlapBounds() {
        super.onViewOutOfOverlapBounds();
        this.smallTileMoleculeDelegate.onViewOutOfOverlapBounds();
    }
}
