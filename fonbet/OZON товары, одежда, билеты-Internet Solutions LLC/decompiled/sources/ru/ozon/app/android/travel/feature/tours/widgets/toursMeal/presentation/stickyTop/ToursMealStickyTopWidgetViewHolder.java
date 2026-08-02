package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation.stickyTop;

import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import d20.AbstractC6067d;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.travel.molecules.view.travelTab.v2.container.TravelTabsContainer;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010-\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyTop/ToursMealStickyTopWidgetViewHolder;", "Ld20/d;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyTop/ToursMealStickyTopVO;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Ld20/e;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyTop/ToursMealStickyTopVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyTop/ToursMealStickyTopVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroidx/fragment/app/m;", "composerFragment", "Landroidx/fragment/app/m;", "Ll10/b;", "composerController", "Ll10/b;", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyTop/ToursMealStickyTopView;", "getContainerView", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyTop/ToursMealStickyTopView;", "containerView", "", "isBottomSheet", "()Z", "Landroid/view/View;", "getComposerContainer", "()Landroid/view/View;", "composerContainer", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursMealStickyTopWidgetViewHolder extends AbstractC6067d<ToursMealStickyTopVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final InterfaceC7851b composerController;
    private final ComponentCallbacksC5392m composerFragment;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursMealStickyTopWidgetViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.composerFragment = container.K().b();
        this.composerController = container.M();
        this.tokenizedAnalytics = container.X();
        this.actionHandler = new ActionHandler.Builder(container, this).onClick(new ToursMealStickyTopWidgetViewHolder$actionHandler$1(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getComposerContainer() {
        View view;
        ComponentCallbacksC5392m componentCallbacksC5392m = this.composerFragment;
        if (componentCallbacksC5392m == null || (view = componentCallbacksC5392m.getView()) == null) {
            return null;
        }
        return ComposerViewExtensionKt.composerContainer(view);
    }

    private final ToursMealStickyTopView getContainerView() {
        View view = getView();
        if (view instanceof ToursMealStickyTopView) {
            return (ToursMealStickyTopView) view;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isBottomSheet() {
        ComponentCallbacksC5392m componentCallbacksC5392m = this.composerFragment;
        return (componentCallbacksC5392m == null || !(componentCallbacksC5392m instanceof ComposerFragment) || ((ComposerFragment) componentCallbacksC5392m).getConfig().getBottomSheetConfig() == null) ? false : true;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        TravelTabsContainer tabsContainer;
        ToursMealStickyTopView containerView = getContainerView();
        if (containerView == null || (tabsContainer = containerView.getTabsContainer()) == null) {
            return;
        }
        tabsContainer.setupAdapter(this.actionHandler, this);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ToursMealStickyTopVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ToursMealStickyTopView containerView = getContainerView();
        if (containerView != null) {
            TextAtomHolderKt.bind$default(containerView.getTitleTav(), item.getTitle(), null, 2, null);
            TextAtomHolderKt.bind$default(containerView.getSubtitleTav(), item.getSubtitle(), null, 2, null);
            containerView.getTabsContainer().setVisibility(item.getIsFilterTabsVisible() ? 0 : 8);
            if (item.getIsFilterTabsVisible()) {
                containerView.getTabsContainer().submitData(item.getFilterTabs());
            }
        }
        Integer fixedComposerHeight = item.getFixedComposerHeight();
        if (fixedComposerHeight != null) {
            int intValue = fixedComposerHeight.intValue();
            View composerContainer = getComposerContainer();
            if (composerContainer == null || composerContainer.getLayoutParams().height == intValue) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = composerContainer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = intValue;
            composerContainer.setLayoutParams(layoutParams);
        }
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull ToursMealStickyTopVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
