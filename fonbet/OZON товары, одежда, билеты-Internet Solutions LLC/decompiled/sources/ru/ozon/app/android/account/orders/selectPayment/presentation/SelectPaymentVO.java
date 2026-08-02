package ru.ozon.app.android.account.orders.selectPayment.presentation;

import D40.a;
import Kk.C3532b;
import Ve.C4598rp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\n\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b&\u0010\u0011¨\u0006'"}, d2 = {"Lru/ozon/app/android/account/orders/selectPayment/presentation/SelectPaymentVO;", "Ll20/c;", "", "id", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "icon", "", "isSelected", "Lru/ozon/uni/atoms/af/AtomAction;", "action", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(JLjava/util/Map;Ljava/lang/String;ZLru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Ljava/lang/String;", "getIcon", "Z", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getTitle", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectPaymentVO implements c {

    @NotNull
    private final AtomAction action;
    private final String icon;
    private final long id;
    private final boolean isSelected;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public SelectPaymentVO(long j11, Map<String, TokenizedTrackingInfo> map, String str, boolean z11, @NotNull AtomAction action, @NotNull String title) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.trackingInfo = map;
        this.icon = str;
        this.isSelected = z11;
        this.action = action;
        this.title = title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectPaymentVO)) {
            return false;
        }
        SelectPaymentVO selectPaymentVO = (SelectPaymentVO) other;
        return this.id == selectPaymentVO.id && Intrinsics.d(this.trackingInfo, selectPaymentVO.trackingInfo) && Intrinsics.d(this.icon, selectPaymentVO.icon) && this.isSelected == selectPaymentVO.isSelected && Intrinsics.d(this.action, selectPaymentVO.action) && Intrinsics.d(this.title, selectPaymentVO.title);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    public final String getIcon() {
        return this.icon;
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

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.icon;
        return this.title.hashCode() + C4598rp.a(this.action, C3532b.a((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.isSelected), 31);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        String str = this.icon;
        boolean z11 = this.isSelected;
        AtomAction atomAction = this.action;
        String str2 = this.title;
        StringBuilder sb2 = new StringBuilder("SelectPaymentVO(id=");
        sb2.append(j11);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        a.g(", icon=", str, ", isSelected=", sb2, z11);
        sb2.append(", action=");
        sb2.append(atomAction);
        sb2.append(", title=");
        sb2.append(str2);
        sb2.append(")");
        return sb2.toString();
    }
}
