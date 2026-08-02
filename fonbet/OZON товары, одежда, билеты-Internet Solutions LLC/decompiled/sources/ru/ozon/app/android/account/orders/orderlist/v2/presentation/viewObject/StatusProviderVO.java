package ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject;

import G.g;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/StatusProviderVO;", "", "", "image", SelectionItemFormDTO.TITLE_FIELD_NAME, "deliveryName", "Lru/ozon/uni/atoms/data/badge/Badge;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getTitle", "getDeliveryName", "Lru/ozon/uni/atoms/data/badge/Badge;", "getStatus", "()Lru/ozon/uni/atoms/data/badge/Badge;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StatusProviderVO {
    public static final int $stable = Badge.$stable;

    @NotNull
    private final String deliveryName;
    private final String image;

    @NotNull
    private final Badge status;

    @NotNull
    private final String title;

    public StatusProviderVO(String str, @NotNull String title, @NotNull String deliveryName, @NotNull Badge status) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deliveryName, "deliveryName");
        Intrinsics.checkNotNullParameter(status, "status");
        this.image = str;
        this.title = title;
        this.deliveryName = deliveryName;
        this.status = status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusProviderVO)) {
            return false;
        }
        StatusProviderVO statusProviderVO = (StatusProviderVO) other;
        return Intrinsics.d(this.image, statusProviderVO.image) && Intrinsics.d(this.title, statusProviderVO.title) && Intrinsics.d(this.deliveryName, statusProviderVO.deliveryName) && Intrinsics.d(this.status, statusProviderVO.status);
    }

    @NotNull
    public final String getDeliveryName() {
        return this.deliveryName;
    }

    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final Badge getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.image;
        return this.status.hashCode() + g.a(g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.deliveryName);
    }

    @NotNull
    public String toString() {
        String str = this.image;
        String str2 = this.title;
        String str3 = this.deliveryName;
        Badge badge = this.status;
        StringBuilder d11 = C3660k.d("StatusProviderVO(image=", str, ", title=", str2, ", deliveryName=");
        d11.append(str3);
        d11.append(", status=");
        d11.append(badge);
        d11.append(")");
        return d11.toString();
    }
}
