package ru.ozon.app.android.csma.orderTracking.data;

import G.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003JS\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006("}, d2 = {"Lru/ozon/app/android/csma/orderTracking/data/OrderTrackingV4DTO;", "", "padding", "Lru/ozon/app/android/csma/orderTracking/data/PaddingDTO;", "backgroundColor", "", "sideButton", "Lru/ozon/app/android/csma/orderTracking/data/SideButtonDTO;", "rightSideButton", "list", "", "Lru/ozon/app/android/csma/orderTracking/data/TileDTO;", "actionName", "<init>", "(Lru/ozon/app/android/csma/orderTracking/data/PaddingDTO;Ljava/lang/String;Lru/ozon/app/android/csma/orderTracking/data/SideButtonDTO;Lru/ozon/app/android/csma/orderTracking/data/SideButtonDTO;Ljava/util/List;Ljava/lang/String;)V", "getPadding", "()Lru/ozon/app/android/csma/orderTracking/data/PaddingDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getSideButton", "()Lru/ozon/app/android/csma/orderTracking/data/SideButtonDTO;", "getRightSideButton", "getList$annotations", "()V", "getList", "()Ljava/util/List;", "getActionName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OrderTrackingV4DTO {

    @NotNull
    private final String actionName;
    private final String backgroundColor;

    @NotNull
    private final List<TileDTO> list;
    private final PaddingDTO padding;
    private final SideButtonDTO rightSideButton;
    private final SideButtonDTO sideButton;

    public OrderTrackingV4DTO(PaddingDTO paddingDTO, String str, SideButtonDTO sideButtonDTO, SideButtonDTO sideButtonDTO2, @NotNull List<TileDTO> list, @NotNull String actionName) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        this.padding = paddingDTO;
        this.backgroundColor = str;
        this.sideButton = sideButtonDTO;
        this.rightSideButton = sideButtonDTO2;
        this.list = list;
        this.actionName = actionName;
    }

    public static /* synthetic */ OrderTrackingV4DTO copy$default(OrderTrackingV4DTO orderTrackingV4DTO, PaddingDTO paddingDTO, String str, SideButtonDTO sideButtonDTO, SideButtonDTO sideButtonDTO2, List list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paddingDTO = orderTrackingV4DTO.padding;
        }
        if ((i11 & 2) != 0) {
            str = orderTrackingV4DTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            sideButtonDTO = orderTrackingV4DTO.sideButton;
        }
        if ((i11 & 8) != 0) {
            sideButtonDTO2 = orderTrackingV4DTO.rightSideButton;
        }
        if ((i11 & 16) != 0) {
            list = orderTrackingV4DTO.list;
        }
        if ((i11 & 32) != 0) {
            str2 = orderTrackingV4DTO.actionName;
        }
        List list2 = list;
        String str3 = str2;
        return orderTrackingV4DTO.copy(paddingDTO, str, sideButtonDTO, sideButtonDTO2, list2, str3);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getList$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final PaddingDTO getPadding() {
        return this.padding;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final SideButtonDTO getSideButton() {
        return this.sideButton;
    }

    /* renamed from: component4, reason: from getter */
    public final SideButtonDTO getRightSideButton() {
        return this.rightSideButton;
    }

    @NotNull
    public final List<TileDTO> component5() {
        return this.list;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getActionName() {
        return this.actionName;
    }

    @NotNull
    public final OrderTrackingV4DTO copy(PaddingDTO padding, String backgroundColor, SideButtonDTO sideButton, SideButtonDTO rightSideButton, @NotNull List<TileDTO> list, @NotNull String actionName) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        return new OrderTrackingV4DTO(padding, backgroundColor, sideButton, rightSideButton, list, actionName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTrackingV4DTO)) {
            return false;
        }
        OrderTrackingV4DTO orderTrackingV4DTO = (OrderTrackingV4DTO) other;
        return Intrinsics.d(this.padding, orderTrackingV4DTO.padding) && Intrinsics.d(this.backgroundColor, orderTrackingV4DTO.backgroundColor) && Intrinsics.d(this.sideButton, orderTrackingV4DTO.sideButton) && Intrinsics.d(this.rightSideButton, orderTrackingV4DTO.rightSideButton) && Intrinsics.d(this.list, orderTrackingV4DTO.list) && Intrinsics.d(this.actionName, orderTrackingV4DTO.actionName);
    }

    @NotNull
    public final String getActionName() {
        return this.actionName;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<TileDTO> getList() {
        return this.list;
    }

    public final PaddingDTO getPadding() {
        return this.padding;
    }

    public final SideButtonDTO getRightSideButton() {
        return this.rightSideButton;
    }

    public final SideButtonDTO getSideButton() {
        return this.sideButton;
    }

    public int hashCode() {
        PaddingDTO paddingDTO = this.padding;
        int hashCode = (paddingDTO == null ? 0 : paddingDTO.hashCode()) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SideButtonDTO sideButtonDTO = this.sideButton;
        int hashCode3 = (hashCode2 + (sideButtonDTO == null ? 0 : sideButtonDTO.hashCode())) * 31;
        SideButtonDTO sideButtonDTO2 = this.rightSideButton;
        return this.actionName.hashCode() + g.b((hashCode3 + (sideButtonDTO2 != null ? sideButtonDTO2.hashCode() : 0)) * 31, 31, this.list);
    }

    @NotNull
    public String toString() {
        return "OrderTrackingV4DTO(padding=" + this.padding + ", backgroundColor=" + this.backgroundColor + ", sideButton=" + this.sideButton + ", rightSideButton=" + this.rightSideButton + ", list=" + this.list + ", actionName=" + this.actionName + ")";
    }
}
