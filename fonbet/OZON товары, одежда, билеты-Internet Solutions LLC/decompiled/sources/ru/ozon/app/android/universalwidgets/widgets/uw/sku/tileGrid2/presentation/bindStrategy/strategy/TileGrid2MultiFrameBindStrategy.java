package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.strategy;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonViewModel;
import ru.ozon.app.android.product.tileContentItems.TileContentItemsAdapter;
import ru.ozon.app.android.product.tiles.tilegrid2.flags.TileGrid2ThinEnabled;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewBindSteps;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewStateBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.TopRightButtonAdapter;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\u0015\u001a\u000e\u0012\u0002\b\u00030\u0013j\u0006\u0012\u0002\b\u0003`\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J+\u0010'\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001eH\u0016¢\u0006\u0004\b)\u0010*J,\u0010+\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0001¢\u0006\u0004\b+\u0010(J\u0010\u0010,\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b,\u0010*J\u0010\u0010-\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b-\u0010*J\u0010\u0010.\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b.\u0010*J\u0010\u0010/\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b/\u0010*J\u0010\u00100\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b0\u0010*J\u0010\u00101\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b1\u0010*J\u0010\u00102\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b2\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u00109\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010:\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00107R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u0002050;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/TileGrid2MultiFrameBindStrategy;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/MultiFrameBindStrategy;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/TileGrid2BindStrategy;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/binder/TileGrid2ViewBindSteps;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/binder/TileGrid2ViewStateBinder;", "tileGrid2GridViewStateBinder", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Landroid/view/View;", "itemView", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "", "hasBadges", "isThin", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/binder/TileGrid2ViewStateBinder;Lru/ozon/app/android/composer/ComposerReferences;Landroid/view/View;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;ZZLru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "viewHolder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;", "viewBinding", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/TopRightButtonAdapter;", "topRightButtonsAdapter", "Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;", "contentAdapter", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "overlayBinder", "", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/TopRightButtonAdapter;Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "vo", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonViewModel;", "countButtonViewModel", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "actionHandler", "bind", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonViewModel;Lru/ozon/app/android/action/sheet/DisposableActionHandler;)V", "trackView", "()V", "prepare", "bindBackground", "bindGallery", "bindLogo", "bindTopRightButtons", "bindBadges", "bindMainState", "bindCountButton", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/binder/TileGrid2ViewStateBinder;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "bindBadgesStep", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "bindMainStateStep", "bindTopRightButtonsStep", "bindCountButtonStep", "", "bindSteps", "Ljava/util/List;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2MultiFrameBindStrategy extends MultiFrameBindStrategy implements TileGrid2BindStrategy, TileGrid2ViewBindSteps {

    @NotNull
    private final BindStep bindBadgesStep;

    @NotNull
    private final BindStep bindCountButtonStep;

    @NotNull
    private final BindStep bindMainStateStep;

    @NotNull
    private final List<BindStep> bindSteps;

    @NotNull
    private final BindStep bindTopRightButtonsStep;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final TileGrid2ViewStateBinder tileGrid2GridViewStateBinder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileGrid2MultiFrameBindStrategy(@NotNull TileGrid2ViewStateBinder tileGrid2GridViewStateBinder, @NotNull ComposerReferences references, @NotNull View itemView, @NotNull FrameBinder frameBinder, boolean z11, boolean z12, @NotNull FeatureChecker featureChecker) {
        super(frameBinder, tileGrid2GridViewStateBinder, itemView, references);
        Intrinsics.checkNotNullParameter(tileGrid2GridViewStateBinder, "tileGrid2GridViewStateBinder");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.tileGrid2GridViewStateBinder = tileGrid2GridViewStateBinder;
        this.references = references;
        TileGrid2MultiFrameBindStrategy$bindBadgesStep$1 tileGrid2MultiFrameBindStrategy$bindBadgesStep$1 = new TileGrid2MultiFrameBindStrategy$bindBadgesStep$1(tileGrid2GridViewStateBinder);
        this.bindBadgesStep = tileGrid2MultiFrameBindStrategy$bindBadgesStep$1;
        TileGrid2MultiFrameBindStrategy$bindMainStateStep$1 tileGrid2MultiFrameBindStrategy$bindMainStateStep$1 = new TileGrid2MultiFrameBindStrategy$bindMainStateStep$1(tileGrid2GridViewStateBinder);
        this.bindMainStateStep = tileGrid2MultiFrameBindStrategy$bindMainStateStep$1;
        TileGrid2MultiFrameBindStrategy$bindTopRightButtonsStep$1 tileGrid2MultiFrameBindStrategy$bindTopRightButtonsStep$1 = new TileGrid2MultiFrameBindStrategy$bindTopRightButtonsStep$1(tileGrid2GridViewStateBinder);
        this.bindTopRightButtonsStep = tileGrid2MultiFrameBindStrategy$bindTopRightButtonsStep$1;
        TileGrid2MultiFrameBindStrategy$bindCountButtonStep$1 tileGrid2MultiFrameBindStrategy$bindCountButtonStep$1 = new TileGrid2MultiFrameBindStrategy$bindCountButtonStep$1(tileGrid2GridViewStateBinder);
        this.bindCountButtonStep = tileGrid2MultiFrameBindStrategy$bindCountButtonStep$1;
        this.bindSteps = (z11 || !featureChecker.isEnabled(TileGrid2ThinEnabled.INSTANCE)) ? (z12 && featureChecker.isEnabled(TileGrid2ThinEnabled.INSTANCE)) ? C7714v.b0(tileGrid2MultiFrameBindStrategy$bindMainStateStep$1, tileGrid2MultiFrameBindStrategy$bindTopRightButtonsStep$1, tileGrid2MultiFrameBindStrategy$bindBadgesStep$1) : C7714v.b0(tileGrid2MultiFrameBindStrategy$bindBadgesStep$1, tileGrid2MultiFrameBindStrategy$bindMainStateStep$1, tileGrid2MultiFrameBindStrategy$bindTopRightButtonsStep$1, tileGrid2MultiFrameBindStrategy$bindCountButtonStep$1) : C7714v.b0(tileGrid2MultiFrameBindStrategy$bindMainStateStep$1, tileGrid2MultiFrameBindStrategy$bindTopRightButtonsStep$1);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.strategy.TileGrid2BindStrategy
    public void bind(@NotNull TileGrid2VO vo, CountButtonViewModel countButtonViewModel, DisposableActionHandler actionHandler) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        TileGrid2ViewStateBinder tileGrid2ViewStateBinder = this.tileGrid2GridViewStateBinder;
        tileGrid2ViewStateBinder.prepare(vo, countButtonViewModel, actionHandler);
        tileGrid2ViewStateBinder.bindBackground();
        tileGrid2ViewStateBinder.bindGallery();
        tileGrid2ViewStateBinder.bindLogo();
        getFrameBinder().bind(this.bindSteps, vo.getViewItemKey());
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewBindSteps
    public void bindBackground() {
        this.tileGrid2GridViewStateBinder.bindBackground();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewBindSteps
    public void bindBadges() {
        this.tileGrid2GridViewStateBinder.bindBadges();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewBindSteps
    public void bindCountButton() {
        this.tileGrid2GridViewStateBinder.bindCountButton();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewBindSteps
    public void bindGallery() {
        this.tileGrid2GridViewStateBinder.bindGallery();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewBindSteps
    public void bindLogo() {
        this.tileGrid2GridViewStateBinder.bindLogo();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewBindSteps
    public void bindMainState() {
        this.tileGrid2GridViewStateBinder.bindMainState();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewBindSteps
    public void bindTopRightButtons() {
        this.tileGrid2GridViewStateBinder.bindTopRightButtons();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.strategy.TileGrid2BindStrategy
    public void init(@NotNull k<?> viewHolder, @NotNull TileGrid2BaseViewBinding viewBinding, TopRightButtonAdapter topRightButtonsAdapter, @NotNull TileContentItemsAdapter contentAdapter, @NotNull TileOverlayBinder overlayBinder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        Intrinsics.checkNotNullParameter(contentAdapter, "contentAdapter");
        Intrinsics.checkNotNullParameter(overlayBinder, "overlayBinder");
        this.tileGrid2GridViewStateBinder.init(viewHolder, viewBinding, topRightButtonsAdapter, contentAdapter, this.references.getComposerViewPoolProvider().getViewPool(), overlayBinder);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewBindSteps
    public void prepare(@NotNull TileGrid2VO vo, CountButtonViewModel countButtonViewModel, DisposableActionHandler actionHandler) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.tileGrid2GridViewStateBinder.prepare(vo, countButtonViewModel, actionHandler);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.strategy.TileGrid2BindStrategy
    public void trackView() {
        this.tileGrid2GridViewStateBinder.trackView();
    }
}
