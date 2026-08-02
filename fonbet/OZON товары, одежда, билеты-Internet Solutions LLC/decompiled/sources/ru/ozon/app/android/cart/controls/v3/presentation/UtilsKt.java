package ru.ozon.app.android.cart.controls.v3.presentation;

import WZ.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.CheckBoxExtKt;
import ru.ozon.app.android.cart.controls.v3.presentation.ControlsV3VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a/\u0010\n\u001a\u00020\t*\u00020\u00002\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO;", "toInvertCheckBox", "(Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO;)Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function0;", "Ll20/d;", "getWidgetInfo", "", "trackSelectAction", "(Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO;LWZ/l;Lkotlin/jvm/functions/Function0;)V", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UtilsKt {
    @NotNull
    public static final ControlsV3VO toInvertCheckBox(@NotNull ControlsV3VO controlsV3VO) {
        CheckBoxDTO checkbox;
        Intrinsics.checkNotNullParameter(controlsV3VO, "<this>");
        ControlsV3VO.SelectAll selectAll = controlsV3VO.getSelectAll();
        ControlsV3VO.SelectAll selectAll2 = null;
        CheckBoxDTO invertCheckBoxState = (selectAll == null || (checkbox = selectAll.getCheckbox()) == null) ? null : CheckBoxExtKt.toInvertCheckBoxState(checkbox);
        ControlsV3VO.SelectAll selectAll3 = controlsV3VO.getSelectAll();
        if (selectAll3 != null) {
            selectAll2 = ControlsV3VO.SelectAll.copy$default(selectAll3, null, controlsV3VO.getSelectAll().isSelected() != null ? Boolean.valueOf(!r0.booleanValue()) : null, CheckBoxExtKt.toInvertActionOfCheckBox(controlsV3VO.getSelectAll().getAction(), (invertCheckBoxState != null ? invertCheckBoxState.getStatus() : null) == CheckBoxDTO.CheckboxStatus.SELECTED), invertCheckBoxState, 1, null);
        }
        return ControlsV3VO.copy$default(controlsV3VO, 0L, selectAll2, null, null, 0, false, null, false, false, 509, null);
    }

    public static final void trackSelectAction(@NotNull ControlsV3VO controlsV3VO, @NotNull l tokenizedAnalytics, @NotNull Function0<d> getWidgetInfo) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        CheckBoxDTO checkbox;
        Intrinsics.checkNotNullParameter(controlsV3VO, "<this>");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(getWidgetInfo, "getWidgetInfo");
        ControlsV3VO.SelectAll selectAll = controlsV3VO.getSelectAll();
        AtomAction action = selectAll != null ? selectAll.getAction() : null;
        AtomAction.SendAnalytics sendAnalytics = action instanceof AtomAction.SendAnalytics ? (AtomAction.SendAnalytics) action : null;
        if (sendAnalytics == null || (trackingInfo = sendAnalytics.getTrackingInfo()) == null || (checkbox = controlsV3VO.getSelectAll().getCheckbox()) == null) {
            return;
        }
        CheckBoxExtKt.trackSelectAction(checkbox, tokenizedAnalytics, trackingInfo, getWidgetInfo);
    }
}
