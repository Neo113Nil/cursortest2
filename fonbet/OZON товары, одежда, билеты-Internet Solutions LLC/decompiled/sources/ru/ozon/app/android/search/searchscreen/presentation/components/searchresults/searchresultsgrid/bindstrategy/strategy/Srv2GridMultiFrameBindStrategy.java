package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.strategy;

import Xo.a;
import Xo.b;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import cT.C5785b;
import cT.c;
import hk0.C6969b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolderDelegate;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.search.databinding.WidgetSearchResultsGridBinding;
import ru.ozon.app.android.search.producttilebuttons.MultiButtonVO;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingDelegate;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingHolder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.image.SearchResultsGalleryModel;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.adapters.TopRightButtonAdapter;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.strategy.MultiFrameBindStrategy;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridVO;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.Srv2GridViewBindSteps;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.viewbinders.Srv2GridViewStateBinder;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJO\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\u0011\u001a\u000e\u0012\u0002\b\u00030\u000fj\u0006\u0012\u0002\b\u0003`\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010$\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J \u0010)\u001a\u00020\u001d2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&H\u0096\u0001¢\u0006\u0004\b)\u0010*J$\u0010-\u001a\u00020\u001d2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/H\u0096\u0001¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\b3\u00104J\u0012\u00106\u001a\u0004\u0018\u000105H\u0096\u0001¢\u0006\u0004\b6\u00107R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00108R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010>\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010?\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010<R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020:0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020B8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/strategy/Srv2GridMultiFrameBindStrategy;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/strategy/MultiFrameBindStrategy;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/strategy/Srv2GridBindStrategy;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/Srv2GridViewBindSteps;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingHolder;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/viewbinders/Srv2GridViewStateBinder;", "srv2GridViewStateBinder", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Landroid/view/View;", "itemView", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "<init>", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/viewbinders/Srv2GridViewStateBinder;Lru/ozon/app/android/composer/ComposerReferences;Landroid/view/View;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;)V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "viewHolder", "Lru/ozon/app/android/search/databinding/WidgetSearchResultsGridBinding;", "viewBinding", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/adapters/TopRightButtonAdapter;", "topRightButtonsAdapter", "Lhk0/b;", "Lru/ozon/app/android/uikit/recycler/ItemListAdapter;", "contentAdapter", "", "defaultBackgroundColor", "Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolderDelegate;", "atomItemViewHolderDelegate", "", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/search/databinding/WidgetSearchResultsGridBinding;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/adapters/TopRightButtonAdapter;Lhk0/b;ILru/ozon/app/android/atoms/rv/atom/AtomItemViewHolderDelegate;)V", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;", "vo", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "actionHandler", "bind", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;Lru/ozon/app/android/action/sheet/DisposableActionHandler;)V", "", "", "topRightButtons", "bindTopRightButtons", "(Ljava/util/List;)V", "Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;", "state", "bindButtons", "(Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;Lru/ozon/app/android/action/sheet/DisposableActionHandler;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getOnboardingContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingHolder$ConstraintsViewIds;", "getConstraintsViewIds", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingHolder$ConstraintsViewIds;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel;", "getGalleryModel", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/viewbinders/Srv2GridViewStateBinder;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "bindStep1", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "bindStep2", "bindStep3", "bindStep4", "bindSteps", "Ljava/util/List;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate$OnboardingStyle;", "getOnboardingStyle", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate$OnboardingStyle;", "onboardingStyle", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Srv2GridMultiFrameBindStrategy extends MultiFrameBindStrategy implements Srv2GridBindStrategy, Srv2GridViewBindSteps, PinchToZoomOnboardingHolder {

    @NotNull
    private final BindStep bindStep1;

    @NotNull
    private final BindStep bindStep2;

    @NotNull
    private final BindStep bindStep3;

    @NotNull
    private final BindStep bindStep4;

    @NotNull
    private final List<BindStep> bindSteps;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final Srv2GridViewStateBinder srv2GridViewStateBinder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Srv2GridMultiFrameBindStrategy(@NotNull Srv2GridViewStateBinder srv2GridViewStateBinder, @NotNull ComposerReferences references, @NotNull View itemView, @NotNull FrameBinder frameBinder) {
        super(frameBinder, srv2GridViewStateBinder, itemView, references);
        Intrinsics.checkNotNullParameter(srv2GridViewStateBinder, "srv2GridViewStateBinder");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        this.srv2GridViewStateBinder = srv2GridViewStateBinder;
        this.references = references;
        C5785b c5785b = new C5785b(this, 2);
        this.bindStep1 = c5785b;
        int i11 = 3;
        c cVar = new c(this, i11);
        this.bindStep2 = cVar;
        a aVar = new a(this, i11);
        this.bindStep3 = aVar;
        b bVar = new b(this, 4);
        this.bindStep4 = bVar;
        this.bindSteps = C7714v.b0(c5785b, cVar, aVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStep1$lambda$0(Srv2GridMultiFrameBindStrategy srv2GridMultiFrameBindStrategy) {
        srv2GridMultiFrameBindStrategy.srv2GridViewStateBinder.bindBadges();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStep2$lambda$1(Srv2GridMultiFrameBindStrategy srv2GridMultiFrameBindStrategy) {
        srv2GridMultiFrameBindStrategy.srv2GridViewStateBinder.bindMainState();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStep3$lambda$2(Srv2GridMultiFrameBindStrategy srv2GridMultiFrameBindStrategy) {
        srv2GridMultiFrameBindStrategy.srv2GridViewStateBinder.bindFooter();
        srv2GridMultiFrameBindStrategy.srv2GridViewStateBinder.bindButtons();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStep4$lambda$3(Srv2GridMultiFrameBindStrategy srv2GridMultiFrameBindStrategy) {
        srv2GridMultiFrameBindStrategy.srv2GridViewStateBinder.bindTopRightButtons();
        srv2GridMultiFrameBindStrategy.srv2GridViewStateBinder.bindBackground();
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.strategy.Srv2GridBindStrategy
    public void bind(@NotNull SearchResultsGridVO vo, DisposableActionHandler actionHandler) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Srv2GridViewStateBinder srv2GridViewStateBinder = this.srv2GridViewStateBinder;
        srv2GridViewStateBinder.prepare(vo, actionHandler, this.references.getComposerViewPoolProvider().getViewPool());
        srv2GridViewStateBinder.bindGallery();
        getFrameBinder().bind(this.bindSteps, vo.getViewItemKey());
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.Srv2GridViewBindSteps
    public void bindButtons(MultiButtonVO state, DisposableActionHandler actionHandler) {
        this.srv2GridViewStateBinder.bindButtons(state, actionHandler);
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.Srv2GridViewBindSteps
    public void bindTopRightButtons(List<? extends Object> topRightButtons) {
        this.srv2GridViewStateBinder.bindTopRightButtons(topRightButtons);
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingHolder
    @NotNull
    public PinchToZoomOnboardingHolder.ConstraintsViewIds getConstraintsViewIds() {
        return this.srv2GridViewStateBinder.getConstraintsViewIds();
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingHolder
    public SearchResultsGalleryModel getGalleryModel() {
        return this.srv2GridViewStateBinder.getGalleryModel();
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingHolder
    @NotNull
    public ConstraintLayout getOnboardingContainer() {
        return this.srv2GridViewStateBinder.getOnboardingContainer();
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingHolder
    @NotNull
    public PinchToZoomOnboardingDelegate.OnboardingStyle getOnboardingStyle() {
        return this.srv2GridViewStateBinder.getOnboardingStyle();
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.strategy.Srv2GridBindStrategy
    public void init(@NotNull k<?> viewHolder, @NotNull WidgetSearchResultsGridBinding viewBinding, @NotNull TopRightButtonAdapter topRightButtonsAdapter, @NotNull C6969b contentAdapter, int defaultBackgroundColor, @NotNull AtomItemViewHolderDelegate atomItemViewHolderDelegate) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        Intrinsics.checkNotNullParameter(topRightButtonsAdapter, "topRightButtonsAdapter");
        Intrinsics.checkNotNullParameter(contentAdapter, "contentAdapter");
        Intrinsics.checkNotNullParameter(atomItemViewHolderDelegate, "atomItemViewHolderDelegate");
        this.srv2GridViewStateBinder.init(viewHolder, viewBinding, topRightButtonsAdapter, contentAdapter, defaultBackgroundColor, atomItemViewHolderDelegate);
    }
}
