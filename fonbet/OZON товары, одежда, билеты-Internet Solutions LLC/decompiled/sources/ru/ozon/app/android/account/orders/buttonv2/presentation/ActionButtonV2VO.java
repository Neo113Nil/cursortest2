package ru.ozon.app.android.account.orders.buttonv2.presentation;

import Bl.C2639a;
import Bl.b;
import G.g;
import Kk.C3532b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/account/orders/buttonv2/presentation/ActionButtonV2VO;", "Ll20/c;", "", "id", "", "isEnabled", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/account/orders/buttonv2/presentation/ActionTypeVO;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(JZLjava/lang/String;Lru/ozon/app/android/account/orders/buttonv2/presentation/ActionTypeVO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "Ljava/lang/String;", "getTitle", "Lru/ozon/app/android/account/orders/buttonv2/presentation/ActionTypeVO;", "getActionType", "()Lru/ozon/app/android/account/orders/buttonv2/presentation/ActionTypeVO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ActionButtonV2VO implements c {

    @NotNull
    private final ActionTypeVO actionType;
    private final long id;
    private final boolean isEnabled;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ActionButtonV2VO(long j11, boolean z11, @NotNull String title, @NotNull ActionTypeVO actionType, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.id = j11;
        this.isEnabled = z11;
        this.title = title;
        this.actionType = actionType;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionButtonV2VO)) {
            return false;
        }
        ActionButtonV2VO actionButtonV2VO = (ActionButtonV2VO) other;
        return this.id == actionButtonV2VO.id && this.isEnabled == actionButtonV2VO.isEnabled && Intrinsics.d(this.title, actionButtonV2VO.title) && Intrinsics.d(this.actionType, actionButtonV2VO.actionType) && Intrinsics.d(this.trackingInfo, actionButtonV2VO.trackingInfo);
    }

    @NotNull
    public final ActionTypeVO getActionType() {
        return this.actionType;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.actionType.hashCode() + g.a(C3532b.a(Long.hashCode(this.id) * 31, 31, this.isEnabled), 31, this.title)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isEnabled;
        String str = this.title;
        ActionTypeVO actionTypeVO = this.actionType;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder c11 = b.c(j11, "ActionButtonV2VO(id=", ", isEnabled=", z11);
        c11.append(", title=");
        c11.append(str);
        c11.append(", actionType=");
        c11.append(actionTypeVO);
        return C2639a.b(c11, ", trackingInfo=", map, ")");
    }
}
