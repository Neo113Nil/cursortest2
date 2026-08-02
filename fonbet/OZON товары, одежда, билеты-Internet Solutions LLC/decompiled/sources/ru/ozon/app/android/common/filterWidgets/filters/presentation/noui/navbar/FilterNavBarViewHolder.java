package ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.navbar;

import PZ.a;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.material.appbar.AppBarLayout;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.common.filterWidgets.curtain.CurtainNavBarLabelTextView;
import ru.ozon.app.android.common.filterWidgets.filters.data.FiltersDTO;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.navbar.models.FilterNavBarVO;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesViewModel;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.SelectionButtons;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.storefront.filterWidgets.databinding.FilterNavBarBinding;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeBorderlessButtonHolderKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000f0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u0004\u0018\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u0004\u0018\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00103\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00104R\u0014\u00106\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00104R\u0014\u00107\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00104¨\u00069"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/navbar/FilterNavBarViewHolder;", "Ld20/b;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/navbar/models/FilterNavBarVO;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterNavBarBinding;", "binding", "Ll10/i;", "screenContainer", "Lcom/google/android/material/appbar/AppBarLayout;", "appBar", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterNavBarBinding;Ll10/i;Lcom/google/android/material/appbar/AppBarLayout;Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel;)V", "", "backgroundColor", "", "setupHeader", "(I)V", "changeStatusBarColors", "setSelectStatusBarBgColor", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/SelectionButtons;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getButton", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/SelectionButtons;)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "onWidgetCreated", "()V", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/navbar/models/FilterNavBarVO;)V", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterNavBarBinding;", "getBinding", "()Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterNavBarBinding;", "Ll10/i;", "Lcom/google/android/material/appbar/AppBarLayout;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroidx/fragment/app/m;", "fragment", "Landroidx/fragment/app/m;", "", "deeplink", "Ljava/lang/String;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "", "isSelect", "()Z", "isSelectFilterValuesPage", "isSelectFiltersPage", "isFullScreen", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterNavBarViewHolder extends AbstractC6065b<FilterNavBarVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AppBarLayout appBar;

    @NotNull
    private final FilterNavBarBinding binding;
    private final String deeplink;
    private final ComponentCallbacksC5392m fragment;

    @NotNull
    private final View metricView;

    @NotNull
    private final i screenContainer;
    private static final int TOP_PADDING = UiExtKt.toPx(8);
    private static final int BOTTOM_PADDING = UiExtKt.toPx(4);

    public FilterNavBarViewHolder(@NotNull FilterNavBarBinding binding, @NotNull i screenContainer, @NotNull AppBarLayout appBar, @NotNull FilterValuesViewModel viewModel) {
        String tag;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(screenContainer, "screenContainer");
        Intrinsics.checkNotNullParameter(appBar, "appBar");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.binding = binding;
        this.screenContainer = screenContainer;
        this.appBar = appBar;
        this.actionHandler = new ActionHandler.Builder(screenContainer, this).onClick(new FilterNavBarViewHolder$actionHandler$1(this, viewModel)).customAnalyticHandler(FilterNavBarViewHolder$actionHandler$2.INSTANCE).onComposerAction(new FilterNavBarViewHolder$actionHandler$3(viewModel)).buildHandler();
        ComponentCallbacksC5392m c11 = screenContainer.Q().c();
        this.fragment = c11;
        this.deeplink = (c11 == null || (tag = c11.getTag()) == null) ? null : a.b(tag, false);
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.metricView = constraintLayout;
    }

    private final void changeStatusBarColors(int backgroundColor) {
        setSelectStatusBarBgColor(backgroundColor);
        StatusBarController statusBarController = StatusBarController.INSTANCE;
        ComponentCallbacksC5392m componentCallbacksC5392m = this.fragment;
        StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
        Context L11 = this.screenContainer.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        statusBarController.setStatusBarContentColor(componentCallbacksC5392m, newState, ThemeExtKt.isDarkThemeActive(L11), true);
    }

    private final ButtonV3Atom.LargeBorderlessButton getButton(SelectionButtons selectionButtons) {
        return selectionButtons.getIsSelectedAll() ? selectionButtons.getDeselectAllButton() : selectionButtons.getSelectAllButton();
    }

    private final boolean isFullScreen() {
        ComponentCallbacksC5392m componentCallbacksC5392m = this.fragment;
        return (componentCallbacksC5392m instanceof ComposerFragment) && ((ComposerFragment) componentCallbacksC5392m).getConfig().getBottomSheetConfig() == null;
    }

    private final boolean isSelect() {
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        Context L11 = this.screenContainer.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        return appTypeResolver.isSelect(L11);
    }

    private final boolean isSelectFilterValuesPage() {
        String str;
        return isSelect() && (str = this.deeplink) != null && h.t(str, "/modal/filterValues", false);
    }

    private final boolean isSelectFiltersPage() {
        String str;
        return isSelect() && (str = this.deeplink) != null && h.e0(str, "filters", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWidgetCreated$lambda$0(FilterNavBarViewHolder filterNavBarViewHolder, View view) {
        AtomActionDTO action;
        FiltersDTO.NavBar navBar;
        FilterNavBarVO boundData = filterNavBarViewHolder.getBoundData();
        AtomAction atomAction = null;
        ButtonV3Atom.LargeBorderlessButton rightButton = (boundData == null || (navBar = boundData.getNavBar()) == null) ? null : navBar.getRightButton();
        if (rightButton != null && (action = rightButton.getAction()) != null) {
            atomAction = AtomActionMapperKt.toAtomAction(action, rightButton.getTrackingInfo());
        }
        if (atomAction != null) {
            filterNavBarViewHolder.actionHandler.invoke(atomAction);
        }
    }

    private final void setSelectStatusBarBgColor(int backgroundColor) {
        StatusBarController statusBarController = StatusBarController.INSTANCE;
        ComponentCallbacksC5392m componentCallbacksC5392m = this.fragment;
        StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
        Context L11 = this.screenContainer.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        statusBarController.setStatusBarBackgroundColor(componentCallbacksC5392m, newState, ResourceExtKt.color(L11, backgroundColor));
    }

    private final void setupHeader(int backgroundColor) {
        if (!isFullScreen()) {
            ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ViewExtKt.updatePadding$default(constraintLayout, 0, TOP_PADDING, 0, BOTTOM_PADDING, 5, null);
        } else {
            setSelectStatusBarBgColor(backgroundColor);
            StatusBarController.setStatusBarContentColor$default(StatusBarController.INSTANCE, this.fragment, StatusBarController.UpdateReason.NewState.INSTANCE, true, false, 8, null);
            ConstraintLayout constraintLayout2 = this.binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            ViewExtKt.updatePadding$default(constraintLayout2, 0, 0, 0, BOTTOM_PADDING, 7, null);
        }
    }

    @NotNull
    public final FilterNavBarBinding getBinding() {
        return this.binding;
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.appBar.addView(this.binding.getConstraintLayout());
        this.binding.actionRightTv.setOnClickListener(new DG.a(this, 3));
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.appBar.removeView(this.binding.getConstraintLayout());
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull FilterNavBarVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        FilterNavBarBinding filterNavBarBinding = this.binding;
        if (isSelectFilterValuesPage()) {
            ConstraintLayout constraintLayout = filterNavBarBinding.getConstraintLayout();
            Context L11 = this.screenContainer.L();
            Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
            constraintLayout.setBackgroundColor(ResourceExtKt.color(L11, item.getBackgroundColor()));
            setupHeader(item.getBackgroundColor());
        } else if (isSelectFiltersPage() && isFullScreen()) {
            changeStatusBarColors(item.getBackgroundColor());
        }
        SmallIconButtonView actionLeftIv = filterNavBarBinding.actionLeftIv;
        Intrinsics.checkNotNullExpressionValue(actionLeftIv, "actionLeftIv");
        WrappedIconButtonHolderKt.bindOrGone(actionLeftIv, item.getNavBar().getBackButton(), this.actionHandler);
        filterNavBarBinding.actionLeftIv.setPadding(0, 0, 0, 0);
        AppCompatTextView actionRightTv = filterNavBarBinding.actionRightTv;
        Intrinsics.checkNotNullExpressionValue(actionRightTv, "actionRightTv");
        ButtonV3Atom.LargeBorderlessButton rightButton = item.getNavBar().getRightButton();
        TextViewExtKt.setTextOrGone(actionRightTv, rightButton != null ? rightButton.getText() : null);
        AppCompatTextView appCompatTextView = filterNavBarBinding.actionRightTv;
        Context L12 = this.screenContainer.L();
        Intrinsics.checkNotNullExpressionValue(L12, "<get-context>(...)");
        appCompatTextView.setTextColor(ResourceExtKt.color(L12, isSelect() ? R$color.text_action_select : R$color.text_action));
        if (isSelectFilterValuesPage() && item.getTextColor() != null) {
            CurtainNavBarLabelTextView curtainNavBarLabelTextView = filterNavBarBinding.titleTv;
            Context L13 = this.screenContainer.L();
            Intrinsics.checkNotNullExpressionValue(L13, "<get-context>(...)");
            curtainNavBarLabelTextView.setTextColor(ResourceExtKt.color(L13, item.getTextColor().intValue()));
        }
        filterNavBarBinding.titleTv.setText(item.getNavBar().getTitle());
        if (item.getSelectionButtons() != null) {
            LargeBorderlessButtonView filterValuesSelectionNavBarButton = filterNavBarBinding.filterValuesSelectionNavBarButton;
            Intrinsics.checkNotNullExpressionValue(filterValuesSelectionNavBarButton, "filterValuesSelectionNavBarButton");
            LargeBorderlessButtonHolderKt.bindOrGone(filterValuesSelectionNavBarButton, getButton(item.getSelectionButtons()), this.actionHandler);
            filterNavBarBinding.filterValuesSelectionNavBarButton.setGravity(16);
            LargeBorderlessButtonView largeBorderlessButtonView = filterNavBarBinding.filterValuesSelectionNavBarButton;
            Context L14 = this.screenContainer.L();
            Intrinsics.checkNotNullExpressionValue(L14, "<get-context>(...)");
            largeBorderlessButtonView.setTextColor(ResourceExtKt.color(L14, isSelectFilterValuesPage() ? R$color.text_action_on_dark_select : isSelect() ? R$color.text_action_select : R$color.text_action));
        }
    }
}
