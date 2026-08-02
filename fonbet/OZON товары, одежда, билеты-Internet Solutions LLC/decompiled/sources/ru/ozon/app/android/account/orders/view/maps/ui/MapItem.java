package ru.ozon.app.android.account.orders.view.maps.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/ui/MapItem;", "", "<init>", "()V", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "getTitle", "()Ljava/lang/String;", "textColor", "", "getTextColor", "()I", "isClickable", "", "()Z", "Lru/ozon/app/android/account/orders/view/maps/ui/MapCancel;", "Lru/ozon/app/android/account/orders/view/maps/ui/MapRouteVO;", "Lru/ozon/app/android/account/orders/view/maps/ui/MapTitle;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class MapItem {
    public /* synthetic */ MapItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getTextColor();

    @NotNull
    public abstract String getTitle();

    public abstract boolean isClickable();

    private MapItem() {
    }
}
