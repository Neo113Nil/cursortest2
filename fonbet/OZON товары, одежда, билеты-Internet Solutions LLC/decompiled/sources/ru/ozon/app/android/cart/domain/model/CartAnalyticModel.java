package ru.ozon.app.android.cart.domain.model;

import Cm.e;
import G.g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/cart/domain/model/CartAnalyticModel;", "", "", "quantity", "", "operationId", "", "widgetId", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "event", "<init>", "(ILjava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getQuantity", "Ljava/lang/String;", "getOperationId", "Ljava/lang/Long;", "getWidgetId", "()Ljava/lang/Long;", "Ljava/util/Map;", "getEvent", "()Ljava/util/Map;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartAnalyticModel {
    private final Map<String, TokenizedTrackingInfo> event;

    @NotNull
    private final String operationId;
    private final int quantity;
    private final Long widgetId;

    public CartAnalyticModel(int i11, @NotNull String operationId, Long l11, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(operationId, "operationId");
        this.quantity = i11;
        this.operationId = operationId;
        this.widgetId = l11;
        this.event = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartAnalyticModel)) {
            return false;
        }
        CartAnalyticModel cartAnalyticModel = (CartAnalyticModel) other;
        return this.quantity == cartAnalyticModel.quantity && Intrinsics.d(this.operationId, cartAnalyticModel.operationId) && Intrinsics.d(this.widgetId, cartAnalyticModel.widgetId) && Intrinsics.d(this.event, cartAnalyticModel.event);
    }

    public final Map<String, TokenizedTrackingInfo> getEvent() {
        return this.event;
    }

    @NotNull
    public final String getOperationId() {
        return this.operationId;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final Long getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int a11 = g.a(Integer.hashCode(this.quantity) * 31, 31, this.operationId);
        Long l11 = this.widgetId;
        int hashCode = (a11 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.event;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i11 = this.quantity;
        String str = this.operationId;
        Long l11 = this.widgetId;
        Map<String, TokenizedTrackingInfo> map = this.event;
        StringBuilder g10 = e.g(i11, "CartAnalyticModel(quantity=", ", operationId=", str, ", widgetId=");
        g10.append(l11);
        g10.append(", event=");
        g10.append(map);
        g10.append(")");
        return g10.toString();
    }
}
