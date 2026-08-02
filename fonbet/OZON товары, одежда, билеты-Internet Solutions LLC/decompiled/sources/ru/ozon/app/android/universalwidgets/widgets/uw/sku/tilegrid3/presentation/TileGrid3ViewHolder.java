package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation;

import Vg.c;
import android.view.View;
import androidx.core.view.G;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileMoleculeDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.view.SmallTileMoleculeView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.data.TileGrid3VO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils.ViewExtKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u00162\u000e\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010\u001eJ\u000f\u0010'\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\"\u0010-\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0012\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/TileGrid3ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/data/TileGrid3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileMoleculeView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/SmallTileMoleculeDelegate;", "smallTileMoleculeDelegate", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileMoleculeView;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/SmallTileMoleculeDelegate;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/data/TileGrid3VO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/data/TileGrid3VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onAttach", "()V", "onDetach", "onRecycle", "onViewInVisibleBounds", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onViewInOverlapBounds", "onViewOutOfOverlapBounds", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileMoleculeView;", "LVg/c;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/SmallTileMoleculeDelegate;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid3ViewHolder extends k<TileGrid3VO> {
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final c customActionHandlersStore;

    @NotNull
    private final SmallTileMoleculeDelegate smallTileMoleculeDelegate;

    @NotNull
    private final SmallTileMoleculeView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileGrid3ViewHolder(@NotNull SmallTileMoleculeView view, @NotNull ComposerReferences refs, @NotNull c customActionHandlersStore, @NotNull SmallTileMoleculeDelegate smallTileMoleculeDelegate) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(smallTileMoleculeDelegate, "smallTileMoleculeDelegate");
        this.view = view;
        this.customActionHandlersStore = customActionHandlersStore;
        this.smallTileMoleculeDelegate = smallTileMoleculeDelegate;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new TileGrid3ViewHolder$actionHandler$1(this)).buildHandler();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.smallTileMoleculeDelegate.onAttach();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
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

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        TestInfo testInfo;
        super.onViewInVisibleBounds();
        SmallTileMoleculeView smallTileMoleculeView = this.view;
        TileGrid3VO boundData = getBoundData();
        ViewExtKt.setAutomatizationIdIfNotNull$default(smallTileMoleculeView, (boundData == null || (testInfo = boundData.getTestInfo()) == null) ? null : testInfo.getAutomatizationId(), null, 2, null);
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfOverlapBounds() {
        super.onViewOutOfOverlapBounds();
        this.smallTileMoleculeDelegate.onViewOutOfOverlapBounds();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TileGrid3VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        SmallTileMoleculeDelegate smallTileMoleculeDelegate = this.smallTileMoleculeDelegate;
        smallTileMoleculeDelegate.setActionHandler(this.actionHandler);
        smallTileMoleculeDelegate.setWidgetAnalytic(LazyUtilsKt.unsafeLazy(new TileGrid3ViewHolder$bind$1$1(this)));
        smallTileMoleculeDelegate.updateFixedWidth(this.view, item.getModel().getImageComponent().getImageModel().getImage().getWidthImage());
        smallTileMoleculeDelegate.bind(item, true);
        final View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        G.a(itemView, new Runnable() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.TileGrid3ViewHolder$bind$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                TestInfo testInfo;
                View view = itemView;
                TileGrid3VO boundData = this.getBoundData();
                ViewExtKt.setAutomatizationIdIfNotNull$default(view, (boundData == null || (testInfo = boundData.getTestInfo()) == null) ? null : testInfo.getAutomatizationId(), null, 2, null);
            }
        });
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TileGrid3VO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        this.smallTileMoleculeDelegate.trackView(viewedPond);
    }
}
