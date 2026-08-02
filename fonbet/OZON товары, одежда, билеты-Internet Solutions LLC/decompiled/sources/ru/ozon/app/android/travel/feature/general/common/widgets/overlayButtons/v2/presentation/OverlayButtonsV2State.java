package ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.presentation;

import G.g;
import Nh.a;
import T7.P;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionVO;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.HasAsyncAction;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\\\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b#\u0010\u0012R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2State;", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/HasAsyncAction;", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "asyncAction", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/ButtonVO;", "buttons", "", "backgroundColor", "dividerColor", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewEvent", "<init>", "(Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "copy", "(Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2State;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "getAsyncAction", "()Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "getDividerColor", "Ljava/util/Map;", "getViewEvent", "()Ljava/util/Map;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OverlayButtonsV2State implements HasAsyncAction {
    private final AsyncActionVO asyncAction;
    private final String backgroundColor;

    @NotNull
    private final List<ButtonVO> buttons;
    private final String dividerColor;
    private final Map<String, TokenizedTrackingInfo> viewEvent;

    public OverlayButtonsV2State(AsyncActionVO asyncActionVO, @NotNull List<ButtonVO> buttons, String str, String str2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.asyncAction = asyncActionVO;
        this.buttons = buttons;
        this.backgroundColor = str;
        this.dividerColor = str2;
        this.viewEvent = map;
    }

    public static /* synthetic */ OverlayButtonsV2State copy$default(OverlayButtonsV2State overlayButtonsV2State, AsyncActionVO asyncActionVO, List list, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            asyncActionVO = overlayButtonsV2State.asyncAction;
        }
        if ((i11 & 2) != 0) {
            list = overlayButtonsV2State.buttons;
        }
        if ((i11 & 4) != 0) {
            str = overlayButtonsV2State.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            str2 = overlayButtonsV2State.dividerColor;
        }
        if ((i11 & 16) != 0) {
            map = overlayButtonsV2State.viewEvent;
        }
        Map map2 = map;
        String str3 = str;
        return overlayButtonsV2State.copy(asyncActionVO, list, str3, str2, map2);
    }

    @NotNull
    public final OverlayButtonsV2State copy(AsyncActionVO asyncAction, @NotNull List<ButtonVO> buttons, String backgroundColor, String dividerColor, Map<String, TokenizedTrackingInfo> viewEvent) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new OverlayButtonsV2State(asyncAction, buttons, backgroundColor, dividerColor, viewEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayButtonsV2State)) {
            return false;
        }
        OverlayButtonsV2State overlayButtonsV2State = (OverlayButtonsV2State) other;
        return Intrinsics.d(this.asyncAction, overlayButtonsV2State.asyncAction) && Intrinsics.d(this.buttons, overlayButtonsV2State.buttons) && Intrinsics.d(this.backgroundColor, overlayButtonsV2State.backgroundColor) && Intrinsics.d(this.dividerColor, overlayButtonsV2State.dividerColor) && Intrinsics.d(this.viewEvent, overlayButtonsV2State.viewEvent);
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.HasAsyncAction
    public AsyncActionVO getAsyncAction() {
        return this.asyncAction;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<ButtonVO> getButtons() {
        return this.buttons;
    }

    public final String getDividerColor() {
        return this.dividerColor;
    }

    public final Map<String, TokenizedTrackingInfo> getViewEvent() {
        return this.viewEvent;
    }

    public int hashCode() {
        AsyncActionVO asyncActionVO = this.asyncAction;
        int b11 = g.b((asyncActionVO == null ? 0 : asyncActionVO.hashCode()) * 31, 31, this.buttons);
        String str = this.backgroundColor;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dividerColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.viewEvent;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        AsyncActionVO asyncActionVO = this.asyncAction;
        List<ButtonVO> list = this.buttons;
        String str = this.backgroundColor;
        String str2 = this.dividerColor;
        Map<String, TokenizedTrackingInfo> map = this.viewEvent;
        StringBuilder sb2 = new StringBuilder("OverlayButtonsV2State(asyncAction=");
        sb2.append(asyncActionVO);
        sb2.append(", buttons=");
        sb2.append(list);
        sb2.append(", backgroundColor=");
        a.h(sb2, str, ", dividerColor=", str2, ", viewEvent=");
        return P.f(sb2, map, ")");
    }
}
