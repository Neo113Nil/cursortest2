package ru.ozon.app.android.button.actions.extendDelivery;

import G.g;
import N3.C3660k;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.button.data.ActionButtonDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/ozon/app/android/button/actions/extendDelivery/ExtendDeliveryActionDTO;", "Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem$Action;", "type", "", "actionName", "params", "", "orderNumber", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V", "getType", "()Ljava/lang/String;", "getActionName", "getParams", "()Ljava/lang/Object;", "getOrderNumber", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "button_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ExtendDeliveryActionDTO implements ActionButtonDTO.ButtonsItem.Action {

    @NotNull
    private final String actionName;
    private final String orderNumber;
    private final Object params;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final String type;

    public ExtendDeliveryActionDTO(@NotNull String type, @NotNull String actionName, Object obj, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        this.type = type;
        this.actionName = actionName;
        this.params = obj;
        this.orderNumber = str;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ExtendDeliveryActionDTO copy$default(ExtendDeliveryActionDTO extendDeliveryActionDTO, String str, String str2, Object obj, String str3, Map map, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = extendDeliveryActionDTO.type;
        }
        if ((i11 & 2) != 0) {
            str2 = extendDeliveryActionDTO.actionName;
        }
        if ((i11 & 4) != 0) {
            obj = extendDeliveryActionDTO.params;
        }
        if ((i11 & 8) != 0) {
            str3 = extendDeliveryActionDTO.orderNumber;
        }
        if ((i11 & 16) != 0) {
            map = extendDeliveryActionDTO.trackingInfo;
        }
        Map map2 = map;
        Object obj3 = obj;
        return extendDeliveryActionDTO.copy(str, str2, obj3, str3, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getActionName() {
        return this.actionName;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getParams() {
        return this.params;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final ExtendDeliveryActionDTO copy(@NotNull String type, @NotNull String actionName, Object params, String orderNumber, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        return new ExtendDeliveryActionDTO(type, actionName, params, orderNumber, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendDeliveryActionDTO)) {
            return false;
        }
        ExtendDeliveryActionDTO extendDeliveryActionDTO = (ExtendDeliveryActionDTO) other;
        return Intrinsics.d(this.type, extendDeliveryActionDTO.type) && Intrinsics.d(this.actionName, extendDeliveryActionDTO.actionName) && Intrinsics.d(this.params, extendDeliveryActionDTO.params) && Intrinsics.d(this.orderNumber, extendDeliveryActionDTO.orderNumber) && Intrinsics.d(this.trackingInfo, extendDeliveryActionDTO.trackingInfo);
    }

    @NotNull
    public final String getActionName() {
        return this.actionName;
    }

    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public final Object getParams() {
        return this.params;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // ru.ozon.app.android.button.data.ActionButtonDTO.ButtonsItem.Action
    @NotNull
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        int a11 = g.a(this.type.hashCode() * 31, 31, this.actionName);
        Object obj = this.params;
        int hashCode = (a11 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.orderNumber;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.actionName;
        Object obj = this.params;
        String str3 = this.orderNumber;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("ExtendDeliveryActionDTO(type=", str, ", actionName=", str2, ", params=");
        d11.append(obj);
        d11.append(", orderNumber=");
        d11.append(str3);
        d11.append(", trackingInfo=");
        return P.f(d11, map, ")");
    }

    public /* synthetic */ ExtendDeliveryActionDTO(String str, String str2, Object obj, String str3, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "csma.extendDeliveryDate" : str, str2, obj, str3, map);
    }
}
