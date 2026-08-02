package ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.shipment;

import Bl.b;
import G.g;
import Kk.C3532b;
import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001e\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/shipment/ShipmentVO;", "Ll20/c;", "", "id", "", "isSelected", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "selectedIds", "<init>", "(JZLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getSelectedIds", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ShipmentVO implements c {
    public static final int $stable = AtomAction.$stable;
    private final AtomAction action;
    private final long id;
    private final boolean isSelected;
    private final String selectedIds;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;

    public ShipmentVO(long j11, boolean z11, @NotNull String title, @NotNull String subtitle, AtomAction atomAction, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.id = j11;
        this.isSelected = z11;
        this.title = title;
        this.subtitle = subtitle;
        this.action = atomAction;
        this.selectedIds = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShipmentVO)) {
            return false;
        }
        ShipmentVO shipmentVO = (ShipmentVO) other;
        return this.id == shipmentVO.id && this.isSelected == shipmentVO.isSelected && Intrinsics.d(this.title, shipmentVO.title) && Intrinsics.d(this.subtitle, shipmentVO.subtitle) && Intrinsics.d(this.action, shipmentVO.action) && Intrinsics.d(this.selectedIds, shipmentVO.selectedIds);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSelectedIds() {
        return this.selectedIds;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
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
        int a11 = g.a(g.a(C3532b.a(Long.hashCode(this.id) * 31, 31, this.isSelected), 31, this.title), 31, this.subtitle);
        AtomAction atomAction = this.action;
        int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        String str = this.selectedIds;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isSelected;
        String str = this.title;
        String str2 = this.subtitle;
        AtomAction atomAction = this.action;
        String str3 = this.selectedIds;
        StringBuilder c11 = b.c(j11, "ShipmentVO(id=", ", isSelected=", z11);
        a.h(c11, ", title=", str, ", subtitle=", str2);
        c11.append(", action=");
        c11.append(atomAction);
        c11.append(", selectedIds=");
        c11.append(str3);
        c11.append(")");
        return c11.toString();
    }
}
