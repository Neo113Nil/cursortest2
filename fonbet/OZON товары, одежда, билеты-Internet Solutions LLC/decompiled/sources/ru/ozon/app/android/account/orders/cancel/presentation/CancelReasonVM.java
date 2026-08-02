package ru.ozon.app.android.account.orders.cancel.presentation;

import androidx.lifecycle.P;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.orders.cancel.CancelReasonState;
import ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVO;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.ConfirmingCancellationPopover;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CheckboxTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\fJ%\u0010\u0013\u001a\u00020\u00042\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH&¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0017R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0017R \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100&0\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0017R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0017R\u0016\u0010.\u001a\u0004\u0018\u00010)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVM;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "status", "handleCheckbox", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)V", "handleCancelAnywayDialogAction", "()V", "trackDoNotCancelDialogClick", "trackShowPriceUpDialog", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "processViewEvents", "(Ljava/util/Map;)V", "Landroidx/lifecycle/P;", "getTitle", "()Landroidx/lifecycle/P;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Button;", "getButton", "button", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getCaption", "caption", "Lru/ozon/uni/atoms/data/cell/CheckboxTitleSubtitleCellDTO;", "getCheckbox", "checkbox", "", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO;", "getItems", "items", "Lru/ozon/app/android/account/orders/cancel/CancelReasonState;", "getCancelState", "cancelState", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "getShowEPointsDialogEvent", "showEPointsDialogEvent", "getShowPriceUpDialogData", "()Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "showPriceUpDialogData", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CancelReasonVM {
    @NotNull
    P<CancelReasonVO.Button> getButton();

    @NotNull
    P<CancelReasonState<String>> getCancelState();

    @NotNull
    P<TextDTO> getCaption();

    @NotNull
    P<CheckboxTitleSubtitleCellDTO> getCheckbox();

    @NotNull
    P<List<CancelReasonVO>> getItems();

    @NotNull
    P<ConfirmingCancellationPopover> getShowEPointsDialogEvent();

    ConfirmingCancellationPopover getShowPriceUpDialogData();

    @NotNull
    P<String> getTitle();

    void handleAction(@NotNull AtomAction action);

    void handleCancelAnywayDialogAction();

    void handleCheckbox(CheckBoxDTO.CheckboxStatus status);

    void processViewEvents(Map<String, TokenizedTrackingInfo> trackingInfo);

    void trackDoNotCancelDialogClick();

    void trackShowPriceUpDialog();
}
