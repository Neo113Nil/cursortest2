package ru.ozon.app.android.account.orders.view.maps.ui;

import B0.C2454a;
import N3.C3660k;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/ui/MapCancel;", "Lru/ozon/app/android/account/orders/view/maps/ui/MapItem;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "textColor", "", "isClickable", "<init>", "(Ljava/lang/String;IZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "I", "getTextColor", "Z", "()Z", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MapCancel extends MapItem {
    private final boolean isClickable;
    private final int textColor;

    @NotNull
    private final String title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapCancel(@NotNull String title, int i11, boolean z11) {
        super(null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.textColor = i11;
        this.isClickable = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapCancel)) {
            return false;
        }
        MapCancel mapCancel = (MapCancel) other;
        return Intrinsics.d(this.title, mapCancel.title) && this.textColor == mapCancel.textColor && this.isClickable == mapCancel.isClickable;
    }

    @Override // ru.ozon.app.android.account.orders.view.maps.ui.MapItem
    public int getTextColor() {
        return this.textColor;
    }

    @Override // ru.ozon.app.android.account.orders.view.maps.ui.MapItem
    @NotNull
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isClickable) + C2454a.a(this.textColor, this.title.hashCode() * 31, 31);
    }

    @Override // ru.ozon.app.android.account.orders.view.maps.ui.MapItem
    /* renamed from: isClickable, reason: from getter */
    public boolean getIsClickable() {
        return this.isClickable;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        int i11 = this.textColor;
        return a.a(")", C3660k.c(i11, "MapCancel(title=", str, ", textColor=", ", isClickable="), this.isClickable);
    }
}
