package ru.ozon.app.android.geo.addressBookBarV2.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import NC.b;
import Sc.s;
import U7.d;
import V.e;
import Ve.C4598rp;
import WZ.t;
import Wc.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.ActionAddressBookBarGeoResponse;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.CheckoutTooltip;
import ru.ozon.app.android.checkoutgeo.address.common.addressCell.AddressCell;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.geo.R$style;
import ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarWidgetV2ViewHolder;
import ru.ozon.app.android.geo.databinding.PopupPvzOnboardingBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$color;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 N2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001NB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J1\u0010(\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J#\u0010-\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010,\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0010H\u0002¢\u0006\u0004\b/\u0010\u0014J\u000f\u00100\u001a\u00020\u0010H\u0002¢\u0006\u0004\b0\u0010\u0014J\u0017\u00103\u001a\u00020\u00102\u0006\u00102\u001a\u000201H\u0003¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00102\u0006\u00105\u001a\u00020&H\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00109R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010:R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u00100?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010>R\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010M\u001a\u0004\u0018\u00010J8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lru/ozon/app/android/geo/addressBookBarV2/presentation/AddressBookBarWidgetV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/geo/addressBookBarV2/presentation/AddressBookBarV2VO;", "Lru/ozon/app/android/geo/addressBookBarV2/presentation/RightLeftTitlesCellV2View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "addressUiInfoViewModel", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "<init>", "(Lru/ozon/app/android/geo/addressBookBarV2/presentation/RightLeftTitlesCellV2View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;Lru/ozon/composer/ui/widget/f;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/geo/addressBookBarV2/presentation/AddressBookBarV2VO;Ll20/d;)V", "onAttach", "()V", "onDetach", "onViewOutOfVisibleBounds", "onViewInVisibleBounds", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon;", "cell", "", "itemId", "trackViewEvent", "(Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon;J)V", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleColors$Colors;", "colors", "", "backgroundColor", "", "isEmbedded", "bindCell", "(Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon;Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleColors$Colors;Ljava/lang/String;Z)V", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$UpdateSettings;", "itemSettings", "newSettings", "isNeedToUpdate", "(Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$UpdateSettings;Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$UpdateSettings;)Z", "dismissPopup", "showPopup", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/ActionAddressBookBarGeoResponse;", "actionAddressBookBarGeoResponse", "createPopUp", "(Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/ActionAddressBookBarGeoResponse;)V", "show", "isNeedShowPopup", "(Z)V", "Lru/ozon/app/android/geo/addressBookBarV2/presentation/RightLeftTitlesCellV2View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "Lru/ozon/composer/ui/widget/f;", "Lxe/B0;", "addressCellJob", "Lxe/B0;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/widget/PopupWindow;", "popup", "Landroid/widget/PopupWindow;", "showPopupJob", "Lcom/google/android/material/appbar/AppBarLayout$f;", "offsetChangeListener", "Lcom/google/android/material/appbar/AppBarLayout$f;", "Lcom/google/android/material/appbar/AppBarLayout;", "getComposerAppbar", "()Lcom/google/android/material/appbar/AppBarLayout;", "composerAppbar", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressBookBarWidgetV2ViewHolder extends k<AddressBookBarV2VO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int POPUP_WIDGET_OFFSET = -UiExtKt.toPx(8);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private B0 addressCellJob;

    @NotNull
    private final AddressUiInfoViewModel addressUiInfoViewModel;

    @NotNull
    private final AppBarLayout.f offsetChangeListener;
    private PopupWindow popup;

    @NotNull
    private final ComposerReferences refs;
    private B0 showPopupJob;

    @NotNull
    private final RightLeftTitlesCellV2View view;

    @NotNull
    private final f viewedPond;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/geo/addressBookBarV2/presentation/AddressBookBarWidgetV2ViewHolder$Companion;", "", "<init>", "()V", "ADDRESS_FORMAT", "", "ONBOARDING_LOCATOR", "TITLE_LOCATOR", "CLOSE_BUTTON_LOCATOR", "POPUP_WIDGET_OFFSET", "", "getPOPUP_WIDGET_OFFSET", "()I", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getPOPUP_WIDGET_OFFSET() {
            return AddressBookBarWidgetV2ViewHolder.POPUP_WIDGET_OFFSET;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressBookBarWidgetV2ViewHolder(@NotNull RightLeftTitlesCellV2View view, @NotNull ComposerReferences refs, @NotNull AddressUiInfoViewModel addressUiInfoViewModel, @NotNull f viewedPond) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(addressUiInfoViewModel, "addressUiInfoViewModel");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        this.view = view;
        this.refs = refs;
        this.addressUiInfoViewModel = addressUiInfoViewModel;
        this.viewedPond = viewedPond;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.offsetChangeListener = new AppBarLayout.f() { // from class: ky.a
            @Override // com.google.android.material.appbar.AppBarLayout.a
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
                AddressBookBarWidgetV2ViewHolder.offsetChangeListener$lambda$0(AddressBookBarWidgetV2ViewHolder.this, appBarLayout, i11);
            }
        };
        view.setOnClickListener(new View.OnClickListener() { // from class: ky.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AddressBookBarWidgetV2ViewHolder._init_$lambda$1(AddressBookBarWidgetV2ViewHolder.this, view2);
            }
        });
        refs.getContainer().g().getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarWidgetV2ViewHolder.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onStop(owner);
                AddressBookBarWidgetV2ViewHolder.this.dismissPopup();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(AddressBookBarWidgetV2ViewHolder addressBookBarWidgetV2ViewHolder, View view) {
        AtomAction action;
        AddressBookBarV2VO boundedData = addressBookBarWidgetV2ViewHolder.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        addressBookBarWidgetV2ViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindCell(AddressCell.RightLeftTitlesCell24Icon cell, AddressCell.RightLeftTitlesCell24Icon.StyleColors.Colors colors, String backgroundColor, boolean isEmbedded) {
        RightLeftTitlesCellV2View rightLeftTitlesCellV2View = this.view;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = rightLeftTitlesCellV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rightLeftTitlesCellV2View.setBackgroundColor(styleParser.parseColorInt(context, backgroundColor, 0));
        rightLeftTitlesCellV2View.setLeftRightPadding(isEmbedded ? 0 : rightLeftTitlesCellV2View.getDp16());
        Context context2 = rightLeftTitlesCellV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int parseColor = styleParser.parseColor(context2, colors.getLeftIconTintColor(), R$color.text_primary_on_light);
        Context context3 = rightLeftTitlesCellV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int parseColor2 = styleParser.parseColor(context3, colors.getTitlesColor(), R$color.text_primary_on_light);
        Context context4 = rightLeftTitlesCellV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int parseColor3 = styleParser.parseColor(context4, colors.getRightIconTintColor(), R$color.graphic_tertiary);
        Context context5 = rightLeftTitlesCellV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        rightLeftTitlesCellV2View.setIcon(TokensExtKt.getIconResByToken(context5, cell.getIcon()), parseColor);
        Context context6 = rightLeftTitlesCellV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        rightLeftTitlesCellV2View.setDisclosureIcon(TokensExtKt.getIconResByToken(context6, cell.getRightIcon()), Integer.valueOf(parseColor3));
        String leftTitle = cell.getLeftTitle();
        rightLeftTitlesCellV2View.setLeftTitle(leftTitle != null ? e.b(new Object[]{leftTitle}, 1, "%s: ", "format(...)") : null, parseColor2);
        rightLeftTitlesCellV2View.setRightTitle(cell.getRightTitle(), parseColor2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public final void createPopUp(ActionAddressBookBarGeoResponse actionAddressBookBarGeoResponse) {
        CheckoutTooltip tooltip;
        PopupWindow popupWindow = this.popup;
        if ((popupWindow == null || !popupWindow.isShowing()) && (tooltip = actionAddressBookBarGeoResponse.getTooltip()) != null) {
            PopupPvzOnboardingBinding inflate = PopupPvzOnboardingBinding.inflate(LayoutInflater.from(getContext()));
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            PopupWindow popupWindow2 = new PopupWindow(inflate.getConstraintLayout(), -2, -2);
            popupWindow2.setAnimationStyle(R$style.FadeInAnimationStyle);
            popupWindow2.setOutsideTouchable(true);
            popupWindow2.setTouchable(true);
            popupWindow2.setTouchInterceptor(new b(this, 2));
            this.popup = popupWindow2;
            TextAtomV2View textAtomV2View = inflate.tvTitle;
            Intrinsics.f(textAtomV2View);
            TextHolderKt.bind$default(textAtomV2View, tooltip.getMessage(), null, 2, null);
            textAtomV2View.setTextIsSelectable(false);
            textAtomV2View.setContentDescription("address_book_bar_onboarding_title");
            IconButtonV3View iconButtonV3View = inflate.btnClose;
            Intrinsics.f(iconButtonV3View);
            IconButtonV3HolderKt.bind$default(iconButtonV3View, tooltip.getCloseButton(), null, 2, null);
            iconButtonV3View.setContentDescription("address_book_bar_onboarding_close_button");
            inflate.getConstraintLayout().setContentDescription("address_book_bar_onboarding");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createPopUp$lambda$8$lambda$7(AddressBookBarWidgetV2ViewHolder addressBookBarWidgetV2ViewHolder, View view, MotionEvent motionEvent) {
        addressBookBarWidgetV2ViewHolder.dismissPopup();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissPopup() {
        PopupWindow popupWindow = this.popup;
        if (popupWindow == null || popupWindow.isShowing()) {
            B0 b02 = this.showPopupJob;
            if (b02 != null) {
                b02.j(null);
            }
            this.showPopupJob = C10727i.c(K.a(this), null, null, new AddressBookBarWidgetV2ViewHolder$dismissPopup$1(this, null), 3);
            PopupWindow popupWindow2 = this.popup;
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
            }
            this.popup = null;
            B0 b03 = this.showPopupJob;
            if (b03 != null) {
                b03.j(null);
            }
            this.showPopupJob = null;
        }
    }

    private final AppBarLayout getComposerAppbar() {
        View view;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return null;
        }
        return ComposerViewExtensionKt.composerAppbar(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isNeedShowPopup(boolean show) {
        if (show) {
            showPopup();
        } else {
            dismissPopup();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNeedToUpdate(AddressCell.UpdateSettings itemSettings, AddressCell.UpdateSettings newSettings) {
        if ((itemSettings != null ? itemSettings.getMiniApp() : null) != (newSettings != null ? newSettings.getMiniApp() : null)) {
            return newSettings != null ? Intrinsics.d(newSettings.isNeedToForceUpdate(), Boolean.TRUE) : false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void offsetChangeListener$lambda$0(AddressBookBarWidgetV2ViewHolder addressBookBarWidgetV2ViewHolder, AppBarLayout appBarLayout, int i11) {
        Intrinsics.checkNotNullParameter(appBarLayout, "<unused var>");
        if (i11 == 0) {
            addressBookBarWidgetV2ViewHolder.showPopup();
        } else if (i11 < 0) {
            addressBookBarWidgetV2ViewHolder.dismissPopup();
        }
    }

    private final void showPopup() {
        PopupWindow popupWindow = this.popup;
        if ((popupWindow == null || !popupWindow.isShowing()) && !Intrinsics.d(this.addressUiInfoViewModel.getShouldShow().getValue(), Boolean.FALSE)) {
            B0 b02 = this.showPopupJob;
            if (b02 != null) {
                b02.j(null);
            }
            this.showPopupJob = C10727i.c(K.a(this), null, null, new AddressBookBarWidgetV2ViewHolder$showPopup$1(this, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackViewEvent(AddressCell.RightLeftTitlesCell24Icon cell, long itemId) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t tokenizedEvent$default;
        Map<String, TokenizedTrackingInfo> trackingInfo2 = cell.getTrackingInfo();
        String valueOf = String.valueOf(trackingInfo2 != null ? trackingInfo2.hashCode() : 0);
        if (this.viewedPond.c(valueOf) || (trackingInfo = cell.getTrackingInfo()) == null || (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(itemId), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent$default, null, 2, null);
        this.viewedPond.e(valueOf);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        AppBarLayout composerAppbar = getComposerAppbar();
        if (composerAppbar != null) {
            composerAppbar.d(this.offsetChangeListener);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.addressUiInfoViewModel.getShouldShow().observe(lifecycle, new AddressBookBarWidgetV2ViewHolder$sam$androidx_lifecycle_Observer$0(new AddressBookBarWidgetV2ViewHolder$onAttachViewModel$1(this)));
        C4598rp.f(this.refs, new C2408n0(C5427n.a(this.addressUiInfoViewModel.getActionAddressBookBarGeo(), d.c(this.refs), AbstractC5434v.b.STARTED), new AddressBookBarWidgetV2ViewHolder$onAttachViewModel$2(this, null)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        B0 b02 = this.addressCellJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.addressCellJob = null;
        dismissPopup();
        AppBarLayout composerAppbar = getComposerAppbar();
        if (composerAppbar != null) {
            composerAppbar.q(this.offsetChangeListener);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        showPopup();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        dismissPopup();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull final AddressBookBarV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        AtomActionDTO geoAction = item.getGeoAction();
        if (geoAction != null) {
            AddressUiInfoViewModel addressUiInfoViewModel = this.addressUiInfoViewModel;
            String link = geoAction.getLink();
            if (link == null) {
                link = "";
            }
            addressUiInfoViewModel.getActionAddressBookBarGeo(link);
        }
        B0 b02 = this.addressCellJob;
        if (b02 == null || !b02.isActive()) {
            final InterfaceC2395h a11 = C5427n.a(this.addressUiInfoViewModel.getAddressCellV2Flow(), d.c(this.refs), AbstractC5434v.b.STARTED);
            final InterfaceC2395h<Object> interfaceC2395h = new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarWidgetV2ViewHolder$bind$$inlined$map$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarWidgetV2ViewHolder$bind$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ AddressBookBarV2VO $item$inlined;
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                    final /* synthetic */ AddressBookBarWidgetV2ViewHolder this$0;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarWidgetV2ViewHolder$bind$$inlined$map$1$2", f = "AddressBookBarWidgetV2ViewHolder.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarWidgetV2ViewHolder$bind$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends c {
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(kotlin.coroutines.d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= LinearLayoutManager.INVALID_OFFSET;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i, AddressBookBarWidgetV2ViewHolder addressBookBarWidgetV2ViewHolder, AddressBookBarV2VO addressBookBarV2VO) {
                        this.$this_unsafeFlow = interfaceC2397i;
                        this.this$0 = addressBookBarWidgetV2ViewHolder;
                        this.$item$inlined = addressBookBarV2VO;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // Ae.InterfaceC2397i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                        AnonymousClass1 anonymousClass1;
                        int i11;
                        boolean isNeedToUpdate;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i12 = anonymousClass1.label;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = anonymousClass1.result;
                                a aVar = a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                    s.b(obj2);
                                    InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                    AddressCell addressCell = (AddressCell) obj;
                                    isNeedToUpdate = this.this$0.isNeedToUpdate(this.$item$inlined.getUpdateSettings(), addressCell.getUpdateSettings());
                                    Object cell = isNeedToUpdate ? addressCell.getCell() : this.$item$inlined.getCell();
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(cell, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                } else {
                                    if (i11 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    s.b(obj2);
                                }
                                return Unit.f71690a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(dVar);
                        Object obj22 = anonymousClass1.result;
                        a aVar2 = a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this, item), dVar);
                    return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            };
            this.addressCellJob = C2399j.C(new C2408n0(new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarWidgetV2ViewHolder$bind$$inlined$filterIsInstance$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarWidgetV2ViewHolder$bind$$inlined$filterIsInstance$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarWidgetV2ViewHolder$bind$$inlined$filterIsInstance$1$2", f = "AddressBookBarWidgetV2ViewHolder.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarWidgetV2ViewHolder$bind$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends c {
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(kotlin.coroutines.d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= LinearLayoutManager.INVALID_OFFSET;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                        this.$this_unsafeFlow = interfaceC2397i;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // Ae.InterfaceC2397i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                        AnonymousClass1 anonymousClass1;
                        int i11;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i12 = anonymousClass1.label;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = anonymousClass1.result;
                                a aVar = a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                    s.b(obj2);
                                    InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                    if (obj instanceof AddressCell.RightLeftTitlesCell24Icon) {
                                        anonymousClass1.label = 1;
                                        if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                            return aVar;
                                        }
                                    }
                                } else {
                                    if (i11 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    s.b(obj2);
                                }
                                return Unit.f71690a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(dVar);
                        Object obj22 = anonymousClass1.result;
                        a aVar2 = a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                    return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            }, new AddressBookBarWidgetV2ViewHolder$bind$3(item, this, null)), K.a(this.refs.getContainer().g()));
        }
    }
}
