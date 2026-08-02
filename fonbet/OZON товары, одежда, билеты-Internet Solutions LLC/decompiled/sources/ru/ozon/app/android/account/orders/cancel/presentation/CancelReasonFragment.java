package ru.ozon.app.android.account.orders.cancel.presentation;

import B90.Q;
import BQ.b;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import W10.c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.orders.cancel.CancelReasonState;
import ru.ozon.app.android.account.orders.cancel.adapter.CancelReasonAdapter;
import ru.ozon.app.android.account.orders.cancel.di.CancelReasonComponent;
import ru.ozon.app.android.account.orders.cancel.di.DaggerCancelReasonComponent;
import ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVO;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.cs_orders.databinding.FragmentCancelReasonBinding;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsWithPayloads;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.ConfirmingCancellationPopover;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.databinding.ViewProgressbarBgBinding;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.selection.checkbox.CheckboxTitleSubtitleCellView;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.main.Flashbar;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.data.cell.CheckboxTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.cell.selection.CheckboxTitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;
import v10.C10183a;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 h2\u00020\u0001:\u0001hB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u00020\u00062\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00062\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010-H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u0010\u0003J\u0017\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0018H\u0002¢\u0006\u0004\b3\u0010\u001bJ\u0017\u00106\u001a\u00020\u00182\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u001d\u00109\u001a\u00020\u00062\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001808H\u0002¢\u0006\u0004\b9\u0010:J\u0019\u0010;\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b;\u0010\u001bJ#\u0010>\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u00010\u00182\b\u0010=\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b>\u0010?J!\u0010C\u001a\u00020\u00062\b\u0010@\u001a\u0004\u0018\u00010<2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0019\u0010G\u001a\u00020\u00062\b\u0010F\u001a\u0004\u0018\u00010EH\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010\u0003R(\u0010L\u001a\b\u0012\u0004\u0012\u00020K0J8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010S\u001a\u00020R8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010g¨\u0006i"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "setupViews", "setupObservers", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "handleTitle", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/cell/CheckboxTitleSubtitleCellDTO;", "dto", "handleCheckbox", "(Lru/ozon/uni/atoms/data/cell/CheckboxTitleSubtitleCellDTO;)V", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Button;", "button", "handleButton", "(Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Button;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "caption", "handleButtonCaption", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO;", "items", "handleItems", "(Ljava/util/List;)V", "Lru/ozon/app/android/account/orders/cancel/CancelReasonState;", "state", "handleState", "(Lru/ozon/app/android/account/orders/cancel/CancelReasonState;)V", "handleShowPriceUpDialog", "message", "showSnackBar", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "errorState", "getErrorMessage", "(Lru/ozon/app/android/uikit/screenstate/ScreenState;)Ljava/lang/String;", "Lru/ozon/app/android/account/orders/cancel/CancelReasonState$Error;", "handleCancelOrderError", "(Lru/ozon/app/android/account/orders/cancel/CancelReasonState$Error;)V", "handleCancelSuccess", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "data", "handleCancelWithAcceptEPointsSuccess", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "notification", "Landroidx/fragment/app/r;", "activity", "showNotificationBar", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Landroidx/fragment/app/r;)V", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "dialogData", "showDialogFragment", "(Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;)V", "setFragmentResultListener", "LPc/a;", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonViewModelImpl;", "pViewModel", "LPc/a;", "getPViewModel$cs_orders_prodGoogleAllVendorsRelease", "()LPc/a;", "setPViewModel$cs_orders_prodGoogleAllVendorsRelease", "(LPc/a;)V", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor$cs_orders_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "setHandlersInhibitor$cs_orders_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVM;", "vm$delegate", "LSc/j;", "getVm", "()Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVM;", "vm", "Lru/ozon/app/android/account/orders/cancel/adapter/CancelReasonAdapter;", "cancelReasonAdapter", "Lru/ozon/app/android/account/orders/cancel/adapter/CancelReasonAdapter;", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "flashbar", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "Lru/ozon/app/android/cs_orders/databinding/FragmentCancelReasonBinding;", "binding", "Lru/ozon/app/android/cs_orders/databinding/FragmentCancelReasonBinding;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CancelReasonFragment extends ComponentCallbacksC5392m {
    private FragmentCancelReasonBinding binding;
    private CancelReasonAdapter cancelReasonAdapter;
    private Flashbar flashbar;
    public HandlersInhibitor handlersInhibitor;
    public a<CancelReasonViewModelImpl> pViewModel;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j vm = k.b(new CancelReasonFragment$vm$2(this));

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonFragment$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsWithPayloads;", "cancelReasons", "LW10/c;", "trackingData", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonFragment;", "newInstance", "(Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsWithPayloads;LW10/c;)Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonFragment;", "", "KEY_CANCEL_REASONS", "Ljava/lang/String;", "KEY_TRACKING_DATA", "KEY_SUCCESS_MESSAGE", "", "CANCEL_REASON_REQUEST_CODE", "I", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CancelReasonFragment newInstance(@NotNull CancelReasonsWithPayloads cancelReasons, c trackingData) {
            Intrinsics.checkNotNullParameter(cancelReasons, "cancelReasons");
            CancelReasonFragment cancelReasonFragment = new CancelReasonFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_cancel_reasons", cancelReasons);
            if (trackingData != null) {
                bundle.putParcelable("key_tracking_data", trackingData);
            }
            cancelReasonFragment.setArguments(bundle);
            return cancelReasonFragment;
        }

        private Companion() {
        }
    }

    private final String getErrorMessage(ScreenState errorState) {
        if (errorState instanceof ScreenState.Custom) {
            String title = ((ScreenState.Custom) errorState).getTitle();
            return title == null ? StringProvider.getString(R$string.error_common_error_technical_error_title) : title;
        }
        if (errorState instanceof ScreenState.NoConnection) {
            return StringProvider.getString(R$string.error_common_error_no_connection_title);
        }
        if ((errorState instanceof ScreenState.ServerIssue) || (errorState instanceof ScreenState.NoScreen) || (errorState instanceof ScreenState.Loading) || (errorState instanceof ScreenState.SecurityIssue) || (errorState instanceof ScreenState.AntibotAlert)) {
            return StringProvider.getString(R$string.error_common_error_technical_error_title);
        }
        if (!(errorState instanceof ScreenState.CustomDefault)) {
            throw new o();
        }
        String description = ((ScreenState.CustomDefault) errorState).getDescription();
        return description == null ? StringProvider.getString(R$string.error_common_error_technical_error_title) : description;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CancelReasonVM getVm() {
        Object value = this.vm.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CancelReasonVM) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleButton(CancelReasonVO.Button button) {
        LargeButtonView largeButtonView;
        FragmentCancelReasonBinding fragmentCancelReasonBinding = this.binding;
        if (fragmentCancelReasonBinding == null || (largeButtonView = fragmentCancelReasonBinding.confirmCancelBtn) == null) {
            return;
        }
        CancelReasonFragment$handleButton$1$action$1 cancelReasonFragment$handleButton$1$action$1 = new CancelReasonFragment$handleButton$1$action$1(this);
        if (!button.getIsEnabled()) {
            cancelReasonFragment$handleButton$1$action$1 = null;
        }
        LargeButtonHolderKt.bind(largeButtonView, button.getButton(), cancelReasonFragment$handleButton$1$action$1);
        largeButtonView.setEnabled(button.getIsEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleButtonCaption(TextDTO caption) {
        TextAtomV2View textAtomV2View;
        FragmentCancelReasonBinding fragmentCancelReasonBinding = this.binding;
        if (fragmentCancelReasonBinding == null || (textAtomV2View = fragmentCancelReasonBinding.textAtomViewCaption) == null) {
            return;
        }
        TextHolderKt.bindOrGone$default(textAtomV2View, caption, null, 2, null);
    }

    private final void handleCancelOrderError(CancelReasonState.Error<String> state) {
        ViewProgressbarBgBinding viewProgressbarBgBinding;
        FrameLayout constraintLayout;
        FragmentCancelReasonBinding fragmentCancelReasonBinding = this.binding;
        if (fragmentCancelReasonBinding != null && (viewProgressbarBgBinding = fragmentCancelReasonBinding.progressBar) != null && (constraintLayout = viewProgressbarBgBinding.getConstraintLayout()) != null) {
            ViewExtKt.gone(constraintLayout);
        }
        showSnackBar(getErrorMessage(state.getErrorState()));
    }

    private final void handleCancelSuccess(String message) {
        r activity = getActivity();
        if (activity != null) {
            ComponentCallbacksC5392m targetFragment = getTargetFragment();
            if (targetFragment != null) {
                int targetRequestCode = getTargetRequestCode();
                Intent intent = new Intent();
                if (message != null) {
                    intent.putExtra("key_success_message", message);
                }
                Unit unit = Unit.f71690a;
                targetFragment.onActivityResult(targetRequestCode, -1, intent);
            }
            activity.onBackPressed();
        }
    }

    private final void handleCancelWithAcceptEPointsSuccess(String message, NotificationDTO data) {
        r activity = getActivity();
        if (activity != null) {
            ComponentCallbacksC5392m targetFragment = getTargetFragment();
            if (targetFragment != null) {
                int targetRequestCode = getTargetRequestCode();
                Intent intent = new Intent();
                if (message != null) {
                    intent.putExtra("key_success_message", message);
                }
                Unit unit = Unit.f71690a;
                targetFragment.onActivityResult(targetRequestCode, -1, intent);
            }
            activity.onBackPressed();
            showNotificationBar(data, activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCheckbox(CheckboxTitleSubtitleCellDTO dto) {
        CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView;
        FragmentCancelReasonBinding fragmentCancelReasonBinding = this.binding;
        if (fragmentCancelReasonBinding == null || (checkboxTitleSubtitleCellView = fragmentCancelReasonBinding.checkboxCell) == null) {
            return;
        }
        CheckboxTitleSubtitleCellHolderKt.bindOrGone(checkboxTitleSubtitleCellView, dto, new CancelReasonFragment$handleCheckbox$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleItems(List<? extends CancelReasonVO> items) {
        CancelReasonAdapter cancelReasonAdapter = this.cancelReasonAdapter;
        if (cancelReasonAdapter != null) {
            cancelReasonAdapter.submitList(items);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleShowPriceUpDialog() {
        ConfirmingCancellationPopover showPriceUpDialogData = getVm().getShowPriceUpDialogData();
        if (showPriceUpDialogData != null) {
            getVm().trackShowPriceUpDialog();
            showDialogFragment(showPriceUpDialogData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleState(CancelReasonState<String> state) {
        ViewProgressbarBgBinding viewProgressbarBgBinding;
        FrameLayout constraintLayout;
        if (state == null) {
            return;
        }
        if (state instanceof CancelReasonState.Loading) {
            FragmentCancelReasonBinding fragmentCancelReasonBinding = this.binding;
            if (fragmentCancelReasonBinding == null || (viewProgressbarBgBinding = fragmentCancelReasonBinding.progressBar) == null || (constraintLayout = viewProgressbarBgBinding.getConstraintLayout()) == null) {
                return;
            }
            if (((CancelReasonState.Loading) state).getIsLoading()) {
                ViewExtKt.show(constraintLayout);
                return;
            } else {
                ViewExtKt.gone(constraintLayout);
                return;
            }
        }
        if (state instanceof CancelReasonState.Success) {
            handleCancelSuccess((String) ((CancelReasonState.Success) state).getData());
            return;
        }
        if (state instanceof CancelReasonState.Error) {
            handleCancelOrderError((CancelReasonState.Error) state);
        } else {
            if (!(state instanceof CancelReasonState.SuccessWithAcceptEPoints)) {
                throw new o();
            }
            CancelReasonState.SuccessWithAcceptEPoints successWithAcceptEPoints = (CancelReasonState.SuccessWithAcceptEPoints) state;
            handleCancelWithAcceptEPointsSuccess((String) successWithAcceptEPoints.getData(), successWithAcceptEPoints.getNotificationData());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTitle(String title) {
        Toolbar toolbar;
        FragmentCancelReasonBinding fragmentCancelReasonBinding = this.binding;
        if (fragmentCancelReasonBinding == null || (toolbar = fragmentCancelReasonBinding.cancelReasonTb) == null) {
            return;
        }
        toolbar.setTitle(title);
    }

    private final void setFragmentResultListener() {
        getParentFragmentManager().n1("price_up_result_key", getViewLifecycleOwner(), new Q(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFragmentResultListener$lambda$17(CancelReasonFragment cancelReasonFragment, String str, Bundle result) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(result, "result");
        String string = result.getString("price_up_action_key");
        if (string != null) {
            int hashCode = string.hashCode();
            if (hashCode != 1490282978) {
                if (hashCode == 1663589406 && string.equals("action_negative")) {
                    cancelReasonFragment.getVm().handleCancelAnywayDialogAction();
                    return;
                }
                return;
            }
            if (string.equals("action_positive")) {
                cancelReasonFragment.getVm().trackDoNotCancelDialogClick();
                cancelReasonFragment.handleCancelSuccess(null);
            }
        }
    }

    private final void setupObservers() {
        J viewLifecycleOwner = getViewLifecycleOwner();
        CancelReasonVM vm = getVm();
        vm.getTitle().observe(viewLifecycleOwner, new CancelReasonFragment$sam$androidx_lifecycle_Observer$0(new CancelReasonFragment$setupObservers$1$1$1(this)));
        vm.getCheckbox().observe(viewLifecycleOwner, new CancelReasonFragment$sam$androidx_lifecycle_Observer$0(new CancelReasonFragment$setupObservers$1$1$2(this)));
        vm.getButton().observe(viewLifecycleOwner, new CancelReasonFragment$sam$androidx_lifecycle_Observer$0(new CancelReasonFragment$setupObservers$1$1$3(this)));
        vm.getCaption().observe(viewLifecycleOwner, new CancelReasonFragment$sam$androidx_lifecycle_Observer$0(new CancelReasonFragment$setupObservers$1$1$4(this)));
        vm.getItems().observe(viewLifecycleOwner, new CancelReasonFragment$sam$androidx_lifecycle_Observer$0(new CancelReasonFragment$setupObservers$1$1$5(this)));
        vm.getCancelState().observe(viewLifecycleOwner, new CancelReasonFragment$sam$androidx_lifecycle_Observer$0(new CancelReasonFragment$setupObservers$1$1$6(this)));
        vm.getShowEPointsDialogEvent().observe(viewLifecycleOwner, new CancelReasonFragment$sam$androidx_lifecycle_Observer$0(new CancelReasonFragment$setupObservers$1$1$7(this)));
    }

    private final void setupViews() {
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.cancelReasonAdapter = new CancelReasonAdapter(viewLifecycleOwner, new CancelReasonFragment$setupViews$1(this));
        FragmentCancelReasonBinding fragmentCancelReasonBinding = this.binding;
        if (fragmentCancelReasonBinding != null) {
            fragmentCancelReasonBinding.cancelReasonTb.setNavigationOnClickListener(new b(this, 5));
            final RecyclerView recyclerView = fragmentCancelReasonBinding.cancelReasonRv;
            recyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonFragment$setupViews$2$2$1
                @Override // androidx.recyclerview.widget.RecyclerView.t
                public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                    Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                    RecyclerView recyclerView3 = RecyclerView.this;
                    Intrinsics.f(recyclerView3);
                    KeyboardUtilsKt.hideKeyboard(recyclerView3);
                }
            });
            recyclerView.setAdapter(this.cancelReasonAdapter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$2$lambda$0(CancelReasonFragment cancelReasonFragment, View view) {
        r activity = cancelReasonFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDialogFragment(ConfirmingCancellationPopover dialogData) {
        if (dialogData == null) {
            return;
        }
        CancelReasonPriceUpBottomSheetFragment.INSTANCE.newInstance(dialogData, getVm()).show(getParentFragmentManager(), "CancelReasonPriceUpBottomSheetFragment");
    }

    private final void showNotificationBar(NotificationDTO notification, r activity) {
        ViewGroup rootView;
        NotificationLayoutManager asNotificationLayoutManager$default;
        if (notification == null || (rootView = ContextExtKt.getRootView(activity)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(C10183a.e(rootView), null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notification, activity, null).show();
    }

    private final void showSnackBar(String message) {
        ViewGroup rootView = ContextExtKt.getRootView(this);
        if (rootView != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(message);
            int i11 = R$drawable.ic_m_danger;
            String token = UniColors.GRAPHIC_NEGATIVE_PRIMARY.getToken();
            J viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Flashbar create$default = FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, token, null, null, null, null, null, 3000L, null, null, viewLifecycleOwner, 57178, null);
            this.flashbar = create$default;
            create$default.show();
        }
    }

    @NotNull
    public final HandlersInhibitor getHandlersInhibitor$cs_orders_prodGoogleAllVendorsRelease() {
        HandlersInhibitor handlersInhibitor = this.handlersInhibitor;
        if (handlersInhibitor != null) {
            return handlersInhibitor;
        }
        Intrinsics.n("handlersInhibitor");
        throw null;
    }

    @NotNull
    public final a<CancelReasonViewModelImpl> getPViewModel$cs_orders_prodGoogleAllVendorsRelease() {
        a<CancelReasonViewModelImpl> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        c cVar;
        Intrinsics.checkNotNullParameter(context, "context");
        CancelReasonComponent.Factory factory = DaggerCancelReasonComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, CartServiceApi.class).getDependencyStorage();
        if (CartServiceApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CartServiceApi is not DiComponent");
        }
        CartServiceApi cartServiceApi = (CartServiceApi) dependencyStorage.b(CartServiceApi.class);
        C6740b dependencyStorage2 = C6739a.b(this, CartComponentApi.class).getDependencyStorage();
        if (CartComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CartComponentApi is not DiComponent");
        }
        CartComponentApi cartComponentApi = (CartComponentApi) dependencyStorage2.b(CartComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, AccountComponentApi.class).getDependencyStorage();
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        AccountComponentApi accountComponentApi = (AccountComponentApi) dependencyStorage3.b(AccountComponentApi.class);
        C6740b dependencyStorage4 = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage4.b(NetworkComponentApi.class);
        C6740b dependencyStorage5 = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage5.b(NavigationComponentApi.class);
        C6740b dependencyStorage6 = C6739a.b(this, ComposerComponentApi.class).getDependencyStorage();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) dependencyStorage6.b(ComposerComponentApi.class);
        C6740b dependencyStorage7 = C6739a.b(this, ActionComponentApi.class).getDependencyStorage();
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        ActionComponentApi actionComponentApi = (ActionComponentApi) dependencyStorage7.b(ActionComponentApi.class);
        C6740b dependencyStorage8 = C6739a.b(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) dependencyStorage8.b(ContextComponentDependencies.class);
        Bundle arguments = getArguments();
        CancelReasonsWithPayloads cancelReasonsWithPayloads = arguments != null ? (CancelReasonsWithPayloads) arguments.getParcelable("key_cancel_reasons") : null;
        if (cancelReasonsWithPayloads == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (cVar = (c) arguments2.getParcelable("key_tracking_data")) == null) {
            cVar = new c(null, null, null);
        }
        factory.create(cartServiceApi, cartComponentApi, accountComponentApi, networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies, cancelReasonsWithPayloads, cVar).inject(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentCancelReasonBinding inflate = FragmentCancelReasonBinding.inflate(inflater, container, false);
        this.binding = inflate;
        if (inflate != null) {
            return inflate.getConstraintLayout();
        }
        return null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        this.cancelReasonAdapter = null;
        Flashbar flashbar = this.flashbar;
        if (flashbar != null) {
            flashbar.dismiss();
        }
        this.flashbar = null;
        this.binding = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setupViews();
        setupObservers();
        setFragmentResultListener();
    }
}
