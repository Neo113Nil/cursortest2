package ru.ozon.app.android.account.orders.common.shipmentwidget;

import G.g;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.data.AtomElement;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.data.ButtonsDTO;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.data.ProductsDTO;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.data.SeparatorDTO;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.data.TextIconDTO;
import ru.ozon.app.android.common.cellList.v2.data.CellListV2DTO;
import ru.ozon.app.android.cscore.orderdetails.molecule.codeCompose.CodeComposeDTO;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.data.ComposableImagesDTO;
import ru.ozon.app.android.cscore.padding.HorizontalPadding;
import ru.ozon.app.android.cscore.padding.VerticalPadding;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/account/orders/common/shipmentwidget/ShipmentWidgetV2DTO;", "", "shipmentId", "", "items", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "verticalPadding", "Lru/ozon/app/android/cscore/padding/VerticalPadding;", "horizontalPadding", "Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/cscore/padding/VerticalPadding;Lru/ozon/app/android/cscore/padding/HorizontalPadding;)V", "getShipmentId", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getVerticalPadding", "()Lru/ozon/app/android/cscore/padding/VerticalPadding;", "getHorizontalPadding", "()Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ShipmentWidgetV2DTO {
    public static final int $stable = 8;
    private final CommonControlSettings common;

    @NotNull
    private final HorizontalPadding horizontalPadding;

    @NotNull
    private final List<Object> items;
    private final String shipmentId;

    @NotNull
    private final VerticalPadding verticalPadding;

    public ShipmentWidgetV2DTO(String str, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "textIcon", type = TextIconDTO.class), @ProtoOneOfSignature(name = "atomElement", type = AtomElement.class), @ProtoOneOfSignature(name = "images", type = ComposableImagesDTO.class), @ProtoOneOfSignature(name = "separator", type = SeparatorDTO.class), @ProtoOneOfSignature(name = "buttons", type = ButtonsDTO.class), @ProtoOneOfSignature(name = "code", type = CodeComposeDTO.class), @ProtoOneOfSignature(name = "products", type = ProductsDTO.class), @ProtoOneOfSignature(name = "cellList", type = CellListV2DTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, CommonControlSettings commonControlSettings, @NotNull VerticalPadding verticalPadding, @NotNull HorizontalPadding horizontalPadding) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(verticalPadding, "verticalPadding");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        this.shipmentId = str;
        this.items = items;
        this.common = commonControlSettings;
        this.verticalPadding = verticalPadding;
        this.horizontalPadding = horizontalPadding;
    }

    public static /* synthetic */ ShipmentWidgetV2DTO copy$default(ShipmentWidgetV2DTO shipmentWidgetV2DTO, String str, List list, CommonControlSettings commonControlSettings, VerticalPadding verticalPadding, HorizontalPadding horizontalPadding, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = shipmentWidgetV2DTO.shipmentId;
        }
        if ((i11 & 2) != 0) {
            list = shipmentWidgetV2DTO.items;
        }
        if ((i11 & 4) != 0) {
            commonControlSettings = shipmentWidgetV2DTO.common;
        }
        if ((i11 & 8) != 0) {
            verticalPadding = shipmentWidgetV2DTO.verticalPadding;
        }
        if ((i11 & 16) != 0) {
            horizontalPadding = shipmentWidgetV2DTO.horizontalPadding;
        }
        HorizontalPadding horizontalPadding2 = horizontalPadding;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        return shipmentWidgetV2DTO.copy(str, list, commonControlSettings2, verticalPadding, horizontalPadding2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getShipmentId() {
        return this.shipmentId;
    }

    @NotNull
    public final List<Object> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final HorizontalPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    public final ShipmentWidgetV2DTO copy(String shipmentId, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "textIcon", type = TextIconDTO.class), @ProtoOneOfSignature(name = "atomElement", type = AtomElement.class), @ProtoOneOfSignature(name = "images", type = ComposableImagesDTO.class), @ProtoOneOfSignature(name = "separator", type = SeparatorDTO.class), @ProtoOneOfSignature(name = "buttons", type = ButtonsDTO.class), @ProtoOneOfSignature(name = "code", type = CodeComposeDTO.class), @ProtoOneOfSignature(name = "products", type = ProductsDTO.class), @ProtoOneOfSignature(name = "cellList", type = CellListV2DTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, CommonControlSettings common, @NotNull VerticalPadding verticalPadding, @NotNull HorizontalPadding horizontalPadding) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(verticalPadding, "verticalPadding");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        return new ShipmentWidgetV2DTO(shipmentId, items, common, verticalPadding, horizontalPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShipmentWidgetV2DTO)) {
            return false;
        }
        ShipmentWidgetV2DTO shipmentWidgetV2DTO = (ShipmentWidgetV2DTO) other;
        return Intrinsics.d(this.shipmentId, shipmentWidgetV2DTO.shipmentId) && Intrinsics.d(this.items, shipmentWidgetV2DTO.items) && Intrinsics.d(this.common, shipmentWidgetV2DTO.common) && Intrinsics.d(this.verticalPadding, shipmentWidgetV2DTO.verticalPadding) && Intrinsics.d(this.horizontalPadding, shipmentWidgetV2DTO.horizontalPadding);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final HorizontalPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    public final List<Object> getItems() {
        return this.items;
    }

    public final String getShipmentId() {
        return this.shipmentId;
    }

    @NotNull
    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    public int hashCode() {
        String str = this.shipmentId;
        int b11 = g.b((str == null ? 0 : str.hashCode()) * 31, 31, this.items);
        CommonControlSettings commonControlSettings = this.common;
        return this.horizontalPadding.hashCode() + ((this.verticalPadding.hashCode() + ((b11 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.shipmentId;
        List<Object> list = this.items;
        CommonControlSettings commonControlSettings = this.common;
        VerticalPadding verticalPadding = this.verticalPadding;
        HorizontalPadding horizontalPadding = this.horizontalPadding;
        StringBuilder f7 = b.f("ShipmentWidgetV2DTO(shipmentId=", str, ", items=", ", common=", list);
        f7.append(commonControlSettings);
        f7.append(", verticalPadding=");
        f7.append(verticalPadding);
        f7.append(", horizontalPadding=");
        f7.append(horizontalPadding);
        f7.append(")");
        return f7.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ShipmentWidgetV2DTO(String str, List list, CommonControlSettings commonControlSettings, VerticalPadding verticalPadding, HorizontalPadding horizontalPadding, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, commonControlSettings, verticalPadding, (i11 & 16) != 0 ? HorizontalPadding.INSTANCE.getDEFAULT_PADDING_500() : horizontalPadding);
        if ((i11 & 8) != 0) {
            CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
            verticalPadding = new VerticalPadding(layoutPadding, layoutPadding);
        }
    }
}
