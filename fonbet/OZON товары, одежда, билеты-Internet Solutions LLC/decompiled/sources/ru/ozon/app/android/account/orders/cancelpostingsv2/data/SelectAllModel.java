package ru.ozon.app.android.account.orders.cancelpostingsv2.data;

import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/data/SelectAllModel;", "", "", "isSelected", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "selectedIds", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getSelectedIds", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectAllModel {
    private final AtomActionDTO action;
    private final Boolean isSelected;
    private final String selectedIds;

    @NotNull
    private final String title;

    public SelectAllModel(Boolean bool, @NotNull String title, AtomActionDTO atomActionDTO, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.isSelected = bool;
        this.title = title;
        this.action = atomActionDTO;
        this.selectedIds = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectAllModel)) {
            return false;
        }
        SelectAllModel selectAllModel = (SelectAllModel) other;
        return Intrinsics.d(this.isSelected, selectAllModel.isSelected) && Intrinsics.d(this.title, selectAllModel.title) && Intrinsics.d(this.action, selectAllModel.action) && Intrinsics.d(this.selectedIds, selectAllModel.selectedIds);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getSelectedIds() {
        return this.selectedIds;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Boolean bool = this.isSelected;
        int a11 = g.a((bool == null ? 0 : bool.hashCode()) * 31, 31, this.title);
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
        AtomActionDTO atomActionDTO = this.action;
        String str2 = this.selectedIds;
        StringBuilder e11 = D3.g.e("SelectAllModel(isSelected=", bool, ", title=", str, ", action=");
        e11.append(atomActionDTO);
        e11.append(", selectedIds=");
        e11.append(str2);
        e11.append(")");
        return e11.toString();
    }
}
