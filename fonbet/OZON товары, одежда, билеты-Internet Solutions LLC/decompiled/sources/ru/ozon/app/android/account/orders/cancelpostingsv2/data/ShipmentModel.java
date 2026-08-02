package ru.ozon.app.android.account.orders.cancelpostingsv2.data;

import B3.p;
import C.o0;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/data/ShipmentModel;", "", "", "isSelected", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "selectedIds", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getSelectedIds", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ShipmentModel {
    private final AtomActionDTO action;
    private final Boolean isSelected;
    private final String selectedIds;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;

    public ShipmentModel(Boolean bool, @NotNull String title, @NotNull String subtitle, AtomActionDTO atomActionDTO, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.isSelected = bool;
        this.title = title;
        this.subtitle = subtitle;
        this.action = atomActionDTO;
        this.selectedIds = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShipmentModel)) {
            return false;
        }
        ShipmentModel shipmentModel = (ShipmentModel) other;
        return Intrinsics.d(this.isSelected, shipmentModel.isSelected) && Intrinsics.d(this.title, shipmentModel.title) && Intrinsics.d(this.subtitle, shipmentModel.subtitle) && Intrinsics.d(this.action, shipmentModel.action) && Intrinsics.d(this.selectedIds, shipmentModel.selectedIds);
    }

    public final AtomActionDTO getAction() {
        return this.action;
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

    public int hashCode() {
        Boolean bool = this.isSelected;
        int a11 = g.a(g.a((bool == null ? 0 : bool.hashCode()) * 31, 31, this.title), 31, this.subtitle);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str = this.selectedIds;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: isSelected, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.isSelected;
        String str = this.title;
        String str2 = this.subtitle;
        AtomActionDTO atomActionDTO = this.action;
        String str3 = this.selectedIds;
        StringBuilder e11 = D3.g.e("ShipmentModel(isSelected=", bool, ", title=", str, ", subtitle=");
        p.c(str2, ", action=", ", selectedIds=", e11, atomActionDTO);
        return o0.c(e11, str3, ")");
    }
}
