package ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.button;

import android.view.View;
import android.view.ViewGroup;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.category.FilterSharedViewModel;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.button.models.NoUiNewFiltersPartVO;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0\u001fj\u0002`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/button/FiltersButtonViewHolder;", "Ld20/b;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/button/models/NoUiNewFiltersPartVO;", "Landroid/view/ViewGroup;", "bottomContainer", "Ll10/i;", "screenContainer", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "filterSharedViewModel", "<init>", "(Landroid/view/ViewGroup;Ll10/i;Lru/ozon/app/android/composer/ComposerNavigator;Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;)V", "", "createView", "()V", "onWidgetCreated", "item", "bind", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/button/models/NoUiNewFiltersPartVO;)V", "onWidgetDestroyed", "Landroid/view/ViewGroup;", "getBottomContainer", "()Landroid/view/ViewGroup;", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/button/FilterButtonHolder;", "buttonHolder", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/button/FilterButtonHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "metricView", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FiltersButtonViewHolder extends AbstractC6065b<NoUiNewFiltersPartVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AppType appType;

    @NotNull
    private final ViewGroup bottomContainer;

    @NotNull
    private final FilterButtonHolder buttonHolder;

    @NotNull
    private final FilterSharedViewModel filterSharedViewModel;

    public FiltersButtonViewHolder(@NotNull ViewGroup bottomContainer, @NotNull i screenContainer, @NotNull ComposerNavigator navigator, @NotNull AppType appType, @NotNull FilterSharedViewModel filterSharedViewModel) {
        Intrinsics.checkNotNullParameter(bottomContainer, "bottomContainer");
        Intrinsics.checkNotNullParameter(screenContainer, "screenContainer");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(filterSharedViewModel, "filterSharedViewModel");
        this.bottomContainer = bottomContainer;
        this.appType = appType;
        this.filterSharedViewModel = filterSharedViewModel;
        this.buttonHolder = new FilterButtonHolder();
        this.actionHandler = new ActionHandler.Builder(screenContainer, this).onPreProcess(new FiltersButtonViewHolder$actionHandler$1(navigator, this)).buildHandler();
    }

    private final void createView() {
        this.buttonHolder.appendButton(this.bottomContainer);
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.buttonHolder.getButtonContainer();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        createView();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.buttonHolder.remove(this.bottomContainer);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull NoUiNewFiltersPartVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.filterSharedViewModel.setRefreshParam(item.getOriginalUrl());
        this.buttonHolder.bindOrGone(this.actionHandler, item.getCloseApplyButton(), true, this.appType == AppType.SELECT);
    }
}
