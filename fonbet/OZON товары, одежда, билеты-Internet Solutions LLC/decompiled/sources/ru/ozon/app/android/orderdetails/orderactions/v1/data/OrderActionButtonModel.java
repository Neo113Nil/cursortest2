package ru.ozon.app.android.orderdetails.orderactions.v1.data;

import Ql.c;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/orderdetails/orderactions/v1/data/OrderActionButtonModel;", "", "text", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "textColor", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTextColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderActionButtonModel {
    public static final int $stable = 8;
    private final AtomActionDTO action;

    @NotNull
    private final String text;
    private final String textColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public OrderActionButtonModel(@NotNull String text, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.textColor = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderActionButtonModel copy$default(OrderActionButtonModel orderActionButtonModel, String str, AtomActionDTO atomActionDTO, Map map, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderActionButtonModel.text;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = orderActionButtonModel.action;
        }
        if ((i11 & 4) != 0) {
            map = orderActionButtonModel.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            str2 = orderActionButtonModel.textColor;
        }
        return orderActionButtonModel.copy(str, atomActionDTO, map, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final OrderActionButtonModel copy(@NotNull String text, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, String textColor) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new OrderActionButtonModel(text, action, trackingInfo, textColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderActionButtonModel)) {
            return false;
        }
        OrderActionButtonModel orderActionButtonModel = (OrderActionButtonModel) other;
        return Intrinsics.d(this.text, orderActionButtonModel.text) && Intrinsics.d(this.action, orderActionButtonModel.action) && Intrinsics.d(this.trackingInfo, orderActionButtonModel.trackingInfo) && Intrinsics.d(this.textColor, orderActionButtonModel.textColor);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.textColor;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        String str2 = this.textColor;
        StringBuilder c11 = c.c("OrderActionButtonModel(text=", str, ", action=", atomActionDTO, ", trackingInfo=");
        c11.append(map);
        c11.append(", textColor=");
        c11.append(str2);
        c11.append(")");
        return c11.toString();
    }
}
