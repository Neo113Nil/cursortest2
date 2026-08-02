package ru.ozon.app.android.cart;

import Sc.o;
import WZ.a;
import WZ.l;
import WZ.t;
import WZ.x;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aC\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0015\u001a\u00020\u0004*\u00020\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "toInvertCheckBoxState", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;)Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "newSelectState", "toInvertActionOfCheckBox", "(Lru/ozon/uni/atoms/af/AtomAction;Z)Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lkotlin/Function0;", "Ll20/d;", "getWidgetInfo", "", "trackSelectAction", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;LWZ/l;Ljava/util/Map;Lkotlin/jvm/functions/Function0;)V", "isForCustomAnalytics", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckBoxExtKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckBoxDTO.CheckboxStatus.values().length];
            try {
                iArr[CheckBoxDTO.CheckboxStatus.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckBoxDTO.CheckboxStatus.SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckBoxDTO.CheckboxStatus.INDETERMINATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isForCustomAnalytics(@NotNull AtomAction atomAction) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(atomAction, "<this>");
        AtomAction.SendAnalytics sendAnalytics = atomAction instanceof AtomAction.SendAnalytics ? (AtomAction.SendAnalytics) atomAction : null;
        if (sendAnalytics == null || (trackingInfo = sendAnalytics.getTrackingInfo()) == null) {
            return false;
        }
        return (trackingInfo.get("click_select_async") == null && trackingInfo.get("click_unselect_async") == null) ? false : true;
    }

    @NotNull
    public static final AtomAction toInvertActionOfCheckBox(@NotNull AtomAction atomAction, boolean z11) {
        AtomAction.Click click;
        Map<String, String> params;
        String str;
        Intrinsics.checkNotNullParameter(atomAction, "<this>");
        if (!(atomAction instanceof AtomAction.Click) || (params = (click = (AtomAction.Click) atomAction).getParams()) == null || (str = params.get("body")) == null) {
            return atomAction;
        }
        String X9 = z11 ? h.X(str, "_SELECT_", "_UNSELECT_", false) : h.X(str, "_UNSELECT_", "_SELECT_", false);
        LinkedHashMap u11 = U.u(params);
        u11.put("body", X9);
        Unit unit = Unit.f71690a;
        return AtomAction.Click.copy$default(click, null, null, null, u11, null, null, 55, null);
    }

    @NotNull
    public static final CheckBoxDTO toInvertCheckBoxState(@NotNull CheckBoxDTO checkBoxDTO) {
        Intrinsics.checkNotNullParameter(checkBoxDTO, "<this>");
        CheckBoxDTO.CheckboxStatus status = checkBoxDTO.getStatus();
        CheckBoxDTO.CheckboxStatus checkboxStatus = CheckBoxDTO.CheckboxStatus.SELECTED;
        if (status == checkboxStatus) {
            checkboxStatus = CheckBoxDTO.CheckboxStatus.EMPTY;
        }
        return CheckBoxDTO.copy$default(checkBoxDTO, null, checkboxStatus, null, null, null, null, null, null, null, null, 1021, null);
    }

    public static final void trackSelectAction(@NotNull CheckBoxDTO checkBoxDTO, @NotNull l tokenizedAnalytics, @NotNull Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull Function0<d> getWidgetInfo) {
        CheckBoxDTO.CheckboxStatus status;
        String str;
        Intrinsics.checkNotNullParameter(checkBoxDTO, "<this>");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        Intrinsics.checkNotNullParameter(getWidgetInfo, "getWidgetInfo");
        d invoke = getWidgetInfo.invoke();
        if (invoke == null || (status = checkBoxDTO.getStatus()) == null) {
            return;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i11 == 1) {
            str = "click_unselect_async";
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new o();
                }
                return;
            }
            str = "click_select_async";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, TokenizedTrackingInfo> entry : trackingInfo.entrySet()) {
            if (Intrinsics.d(entry.getKey(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        t event = x.d(linkedHashMap, invoke);
        if (event != null) {
            Intrinsics.checkNotNullParameter(tokenizedAnalytics, "<this>");
            Intrinsics.checkNotNullParameter(event, "event");
            tokenizedAnalytics.f(event, a.f33353a, null);
        }
    }
}
