package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.tabs;

import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import d20.AbstractC6067d;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.AviaDetailedInfoV3ViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.view.AviaDetailedInfoV3TabsView;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/tabs/AviaDetailedInfoV3TabsWidgetViewHolder;", "Ld20/d;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/tabs/AviaDetailedInfoV3TabsVO;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/AviaDetailedInfoV3ViewModel;", "viewModel", "<init>", "(Ll10/i;Ld20/e;Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/AviaDetailedInfoV3ViewModel;)V", "", "index", "", "onItemClick", "(I)V", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/tabs/AviaDetailedInfoV3TabsVO;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/AviaDetailedInfoV3ViewModel;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/view/AviaDetailedInfoV3TabsView;", "tabsView", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/view/AviaDetailedInfoV3TabsView;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaDetailedInfoV3TabsWidgetViewHolder extends AbstractC6067d<AviaDetailedInfoV3TabsVO> {
    private final AviaDetailedInfoV3TabsView tabsView;

    @NotNull
    private final AviaDetailedInfoV3ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaDetailedInfoV3TabsWidgetViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory, @NotNull AviaDetailedInfoV3ViewModel viewModel) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
        View view = getView();
        FrameLayout frameLayout = view instanceof FrameLayout ? (FrameLayout) view : null;
        KeyEvent.Callback childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
        this.tabsView = childAt instanceof AviaDetailedInfoV3TabsView ? (AviaDetailedInfoV3TabsView) childAt : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemClick(int index) {
        AviaDetailedInfoV3TabsView aviaDetailedInfoV3TabsView;
        if (index == -1 || (aviaDetailedInfoV3TabsView = this.tabsView) == null) {
            return;
        }
        aviaDetailedInfoV3TabsView.updateSelectedTabs(index);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.viewModel.selectedTabLiveData().observe(this, new AviaDetailedInfoV3TabsWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AviaDetailedInfoV3TabsWidgetViewHolder$onWidgetCreated$1(this)));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull AviaDetailedInfoV3TabsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AviaDetailedInfoV3TabsView aviaDetailedInfoV3TabsView = this.tabsView;
        if (aviaDetailedInfoV3TabsView != null) {
            aviaDetailedInfoV3TabsView.bindTabs(item.getTabs(), item.getTabBackgroundColor(), item.getActiveTabBackgroundColor(), new AviaDetailedInfoV3TabsWidgetViewHolder$bind$1(this.viewModel));
        }
    }
}
