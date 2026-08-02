package ru.ozon.app.android.account.orders.view.maps.ui;

import B0.C2454a;
import C.o0;
import Kk.C3532b;
import N3.C3660k;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0007\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/ui/MapRouteVO;", "Lru/ozon/app/android/account/orders/view/maps/ui/MapItem;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "textColor", "", "isClickable", "Landroid/content/Intent;", "intent", "routeType", "<init>", "(Ljava/lang/String;IZLandroid/content/Intent;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "I", "getTextColor", "Z", "()Z", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "getRouteType", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MapRouteVO extends MapItem {

    @NotNull
    private final Intent intent;
    private final boolean isClickable;

    @NotNull
    private final String routeType;
    private final int textColor;

    @NotNull
    private final String title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapRouteVO(@NotNull String title, int i11, boolean z11, @NotNull Intent intent, @NotNull String routeType) {
        super(null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(routeType, "routeType");
        this.title = title;
        this.textColor = i11;
        this.isClickable = z11;
        this.intent = intent;
        this.routeType = routeType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapRouteVO)) {
            return false;
        }
        MapRouteVO mapRouteVO = (MapRouteVO) other;
        return Intrinsics.d(this.title, mapRouteVO.title) && this.textColor == mapRouteVO.textColor && this.isClickable == mapRouteVO.isClickable && Intrinsics.d(this.intent, mapRouteVO.intent) && Intrinsics.d(this.routeType, mapRouteVO.routeType);
    }

    @NotNull
    public final Intent getIntent() {
        return this.intent;
    }

    @NotNull
    public final String getRouteType() {
        return this.routeType;
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
        return this.routeType.hashCode() + ((this.intent.hashCode() + C3532b.a(C2454a.a(this.textColor, this.title.hashCode() * 31, 31), 31, this.isClickable)) * 31);
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
        boolean z11 = this.isClickable;
        Intent intent = this.intent;
        String str2 = this.routeType;
        StringBuilder c11 = C3660k.c(i11, "MapRouteVO(title=", str, ", textColor=", ", isClickable=");
        c11.append(z11);
        c11.append(", intent=");
        c11.append(intent);
        c11.append(", routeType=");
        return o0.c(c11, str2, ")");
    }
}
