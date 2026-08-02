package ru.ozon.app.android.account.orders.cancel.presentation;

import DS.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.G;
import com.google.android.material.bottomsheet.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.orders.cancel.CancelOrderFlowActions;
import ru.ozon.app.android.cs_orders.databinding.BottomSheetCancelReasonPriceUpBinding;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.ConfirmingCancellationPopover;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.component.sheet.SheetDialog;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u0019\u0010!\u001a\u00020 2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010+\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonPriceUpBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "", "handleButtonClick", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "bindViews", "resultKey", "setFragmentResult", "(Ljava/lang/String;)V", "sendViewTrackEvent", "()Lkotlin/Unit;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Lru/ozon/app/android/cs_orders/databinding/BottomSheetCancelReasonPriceUpBinding;", "binding", "Lru/ozon/app/android/cs_orders/databinding/BottomSheetCancelReasonPriceUpBinding;", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "data$delegate", "LSc/j;", "getData", "()Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "data", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVM;", "viewModel", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVM;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CancelReasonPriceUpBottomSheetFragment extends b {
    private BottomSheetCancelReasonPriceUpBinding binding;

    /* renamed from: data$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j data = k.b(new CancelReasonPriceUpBottomSheetFragment$data$2(this));
    private CancelReasonVM viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonPriceUpBottomSheetFragment$Companion;", "", "<init>", "()V", "TAG", "", "MODAL_DIALOG_DATA", "PRICE_UP_RESULT_KEY", "PRICE_UP_ACTION_KEY", "ACTION_POSITIVE", "ACTION_NEGATIVE", "newInstance", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonPriceUpBottomSheetFragment;", "data", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "viewModel", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVM;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CancelReasonPriceUpBottomSheetFragment newInstance(@NotNull ConfirmingCancellationPopover data, @NotNull CancelReasonVM viewModel) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            CancelReasonPriceUpBottomSheetFragment cancelReasonPriceUpBottomSheetFragment = new CancelReasonPriceUpBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("modal_dialog_data", data);
            cancelReasonPriceUpBottomSheetFragment.setArguments(bundle);
            cancelReasonPriceUpBottomSheetFragment.viewModel = viewModel;
            return cancelReasonPriceUpBottomSheetFragment;
        }

        private Companion() {
        }
    }

    private final void bindViews() {
        ButtonV3View buttonV3View;
        ButtonV3View buttonV3View2;
        TextAtomV2View textAtomV2View;
        TextDTO subtitle;
        TextAtomV2View textAtomV2View2;
        Image image;
        BottomSheetCancelReasonPriceUpBinding bottomSheetCancelReasonPriceUpBinding = this.binding;
        if (bottomSheetCancelReasonPriceUpBinding != null && (image = bottomSheetCancelReasonPriceUpBinding.ivImage) != null) {
            ConfirmingCancellationPopover data = getData();
            ImageHolderKt.bindOrGone$default(image, data != null ? data.getImage() : null, null, 2, null);
        }
        BottomSheetCancelReasonPriceUpBinding bottomSheetCancelReasonPriceUpBinding2 = this.binding;
        if (bottomSheetCancelReasonPriceUpBinding2 != null && (textAtomV2View2 = bottomSheetCancelReasonPriceUpBinding2.titleTv) != null) {
            ConfirmingCancellationPopover data2 = getData();
            TextHolderKt.bindOrGone$default(textAtomV2View2, data2 != null ? data2.getTitle() : null, null, 2, null);
        }
        BottomSheetCancelReasonPriceUpBinding bottomSheetCancelReasonPriceUpBinding3 = this.binding;
        if (bottomSheetCancelReasonPriceUpBinding3 != null && (textAtomV2View = bottomSheetCancelReasonPriceUpBinding3.subtitleTv) != null) {
            ConfirmingCancellationPopover data3 = getData();
            TextHolderKt.bindOrGone$default(textAtomV2View, (data3 == null || (subtitle = data3.getSubtitle()) == null) ? null : TextDTO.copy$default(subtitle, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null), null, 2, null);
        }
        BottomSheetCancelReasonPriceUpBinding bottomSheetCancelReasonPriceUpBinding4 = this.binding;
        if (bottomSheetCancelReasonPriceUpBinding4 != null && (buttonV3View2 = bottomSheetCancelReasonPriceUpBinding4.positiveButton) != null) {
            ConfirmingCancellationPopover data4 = getData();
            ButtonV3HolderKt.bindOrGone$default(buttonV3View2, data4 != null ? data4.getCancel() : null, null, 2, null);
            buttonV3View2.setOnClickListener(new a(this, 13));
        }
        BottomSheetCancelReasonPriceUpBinding bottomSheetCancelReasonPriceUpBinding5 = this.binding;
        if (bottomSheetCancelReasonPriceUpBinding5 == null || (buttonV3View = bottomSheetCancelReasonPriceUpBinding5.negativeButton) == null) {
            return;
        }
        ConfirmingCancellationPopover data5 = getData();
        ButtonV3HolderKt.bindOrGone$default(buttonV3View, data5 != null ? data5.getConfirm() : null, null, 2, null);
        buttonV3View.setOnClickListener(new BS.a(this, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViews$lambda$1$lambda$0(CancelReasonPriceUpBottomSheetFragment cancelReasonPriceUpBottomSheetFragment, View view) {
        ButtonV3DTO cancel;
        CommonControlSettings common;
        ButtonV3DTO cancel2;
        CommonControlSettings common2;
        ConfirmingCancellationPopover data = cancelReasonPriceUpBottomSheetFragment.getData();
        Map<String, TokenizedTrackingInfo> map = null;
        AtomActionDTO action = (data == null || (cancel2 = data.getCancel()) == null || (common2 = cancel2.getCommon()) == null) ? null : common2.getAction();
        ConfirmingCancellationPopover data2 = cancelReasonPriceUpBottomSheetFragment.getData();
        if (data2 != null && (cancel = data2.getCancel()) != null && (common = cancel.getCommon()) != null) {
            map = common.getTrackingInfo();
        }
        cancelReasonPriceUpBottomSheetFragment.handleButtonClick(action, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViews$lambda$3$lambda$2(CancelReasonPriceUpBottomSheetFragment cancelReasonPriceUpBottomSheetFragment, View view) {
        cancelReasonPriceUpBottomSheetFragment.setFragmentResult("action_negative");
        cancelReasonPriceUpBottomSheetFragment.dismiss();
    }

    private final ConfirmingCancellationPopover getData() {
        return (ConfirmingCancellationPopover) this.data.getValue();
    }

    private final void handleButtonClick(AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        String id2 = action != null ? action.getId() : null;
        CancelOrderFlowActions cancelOrderFlowActions = CancelOrderFlowActions.ACCEPT_E_POINTS;
        if (Intrinsics.d(id2, cancelOrderFlowActions.getActionId())) {
            cancelOrderFlowActions.getActionId();
            CancelReasonVM cancelReasonVM = this.viewModel;
            if (cancelReasonVM != null) {
                cancelReasonVM.handleAction(AtomActionMapperKt.toAtomAction(action, trackingInfo));
            }
        } else {
            setFragmentResult("action_positive");
        }
        dismiss();
    }

    private final Unit sendViewTrackEvent() {
        ButtonV3DTO cancel;
        CommonControlSettings common;
        CancelReasonVM cancelReasonVM = this.viewModel;
        Map<String, TokenizedTrackingInfo> map = null;
        if (cancelReasonVM == null) {
            return null;
        }
        ConfirmingCancellationPopover data = getData();
        if (data != null && (cancel = data.getCancel()) != null && (common = cancel.getCommon()) != null) {
            map = common.getTrackingInfo();
        }
        cancelReasonVM.processViewEvents(map);
        return Unit.f71690a;
    }

    private final void setFragmentResult(String resultKey) {
        G parentFragmentManager = getParentFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putString("price_up_action_key", resultKey);
        Unit unit = Unit.f71690a;
        parentFragmentManager.m1(bundle, "price_up_result_key");
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new SheetDialog(requireContext, 0, false, 0, true, true, null, null, false, false, null, false, 0, false, null, 32718, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        BottomSheetCancelReasonPriceUpBinding inflate = BottomSheetCancelReasonPriceUpBinding.inflate(inflater, null, false);
        this.binding = inflate;
        if (inflate != null) {
            return inflate.getConstraintLayout();
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        bindViews();
        sendViewTrackEvent();
    }
}
