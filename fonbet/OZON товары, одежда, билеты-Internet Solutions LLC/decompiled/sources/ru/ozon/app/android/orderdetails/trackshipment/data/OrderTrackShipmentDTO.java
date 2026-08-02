package ru.ozon.app.android.orderdetails.trackshipment.data;

import G.g;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/orderdetails/trackshipment/data/OrderTrackShipmentDTO;", "", "prefix", "", "trackNumber", "notificationText", "icon", "button", "Lru/ozon/app/android/orderdetails/trackshipment/data/ButtonModel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/orderdetails/trackshipment/data/ButtonModel;)V", "getPrefix", "()Ljava/lang/String;", "getTrackNumber", "getNotificationText", "getIcon", "getButton", "()Lru/ozon/app/android/orderdetails/trackshipment/data/ButtonModel;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderTrackShipmentDTO {
    public static final int $stable = 8;
    private final ButtonModel button;
    private final String icon;

    @NotNull
    private final String notificationText;

    @NotNull
    private final String prefix;

    @NotNull
    private final String trackNumber;

    public OrderTrackShipmentDTO(@NotNull String prefix, @NotNull String trackNumber, @NotNull String notificationText, String str, ButtonModel buttonModel) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(trackNumber, "trackNumber");
        Intrinsics.checkNotNullParameter(notificationText, "notificationText");
        this.prefix = prefix;
        this.trackNumber = trackNumber;
        this.notificationText = notificationText;
        this.icon = str;
        this.button = buttonModel;
    }

    public static /* synthetic */ OrderTrackShipmentDTO copy$default(OrderTrackShipmentDTO orderTrackShipmentDTO, String str, String str2, String str3, String str4, ButtonModel buttonModel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderTrackShipmentDTO.prefix;
        }
        if ((i11 & 2) != 0) {
            str2 = orderTrackShipmentDTO.trackNumber;
        }
        if ((i11 & 4) != 0) {
            str3 = orderTrackShipmentDTO.notificationText;
        }
        if ((i11 & 8) != 0) {
            str4 = orderTrackShipmentDTO.icon;
        }
        if ((i11 & 16) != 0) {
            buttonModel = orderTrackShipmentDTO.button;
        }
        ButtonModel buttonModel2 = buttonModel;
        String str5 = str3;
        return orderTrackShipmentDTO.copy(str, str2, str5, str4, buttonModel2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTrackNumber() {
        return this.trackNumber;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getNotificationText() {
        return this.notificationText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonModel getButton() {
        return this.button;
    }

    @NotNull
    public final OrderTrackShipmentDTO copy(@NotNull String prefix, @NotNull String trackNumber, @NotNull String notificationText, String icon, ButtonModel button) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(trackNumber, "trackNumber");
        Intrinsics.checkNotNullParameter(notificationText, "notificationText");
        return new OrderTrackShipmentDTO(prefix, trackNumber, notificationText, icon, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTrackShipmentDTO)) {
            return false;
        }
        OrderTrackShipmentDTO orderTrackShipmentDTO = (OrderTrackShipmentDTO) other;
        return Intrinsics.d(this.prefix, orderTrackShipmentDTO.prefix) && Intrinsics.d(this.trackNumber, orderTrackShipmentDTO.trackNumber) && Intrinsics.d(this.notificationText, orderTrackShipmentDTO.notificationText) && Intrinsics.d(this.icon, orderTrackShipmentDTO.icon) && Intrinsics.d(this.button, orderTrackShipmentDTO.button);
    }

    public final ButtonModel getButton() {
        return this.button;
    }

    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getNotificationText() {
        return this.notificationText;
    }

    @NotNull
    public final String getPrefix() {
        return this.prefix;
    }

    @NotNull
    public final String getTrackNumber() {
        return this.trackNumber;
    }

    public int hashCode() {
        int a11 = g.a(g.a(this.prefix.hashCode() * 31, 31, this.trackNumber), 31, this.notificationText);
        String str = this.icon;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        ButtonModel buttonModel = this.button;
        return hashCode + (buttonModel != null ? buttonModel.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.prefix;
        String str2 = this.trackNumber;
        String str3 = this.notificationText;
        String str4 = this.icon;
        ButtonModel buttonModel = this.button;
        StringBuilder d11 = C3660k.d("OrderTrackShipmentDTO(prefix=", str, ", trackNumber=", str2, ", notificationText=");
        a.h(d11, str3, ", icon=", str4, ", button=");
        d11.append(buttonModel);
        d11.append(")");
        return d11.toString();
    }
}
