package ru.ozon.app.android.account.orders.orderlist.v4.core;

import j20.C7244b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.app.android.account.orders.common.shipmentwidget.ShipmentWidgetV2Parser;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v4/core/OrderListV4Parser;", "", "Lru/ozon/app/android/account/orders/common/shipmentwidget/ShipmentWidgetV2Parser;", "shipmentParser", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/account/orders/common/shipmentwidget/ShipmentWidgetV2Parser;Lru/ozon/app/android/utils/AppType;)V", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO$Configuration;", "config", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "createIslandSeparator", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO$Configuration;)Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "createBlankSeparator", "()Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "Lj20/b;", "state", "", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/app/android/account/orders/common/shipmentwidget/ShipmentWidgetV2Parser;", "Lru/ozon/app/android/utils/AppType;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderListV4Parser {

    @NotNull
    private final AppType appType;

    @NotNull
    private final ShipmentWidgetV2Parser shipmentParser;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v4/core/OrderListV4Parser$Companion;", "", "<init>", "()V", "SHIPMENTS_FIELD_NAME", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OrderListV4Parser(@NotNull ShipmentWidgetV2Parser shipmentParser, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(shipmentParser, "shipmentParser");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.shipmentParser = shipmentParser;
        this.appType = appType;
    }

    private final SeparatorDTO createBlankSeparator() {
        return new SeparatorDTO(null, 1, UniColors.LAYER_FLOOR_0.getToken());
    }

    private final IslandSeparatorDTO createIslandSeparator(IslandSeparatorDTO.Configuration config) {
        return new IslandSeparatorDTO(Integer.valueOf(AppTokensProvider.IslandSeparatorHeight.INSTANCE.between()), UniColors.LAYER_FLOOR_0.getToken(), config, null, null, null);
    }

    static /* synthetic */ IslandSeparatorDTO createIslandSeparator$default(OrderListV4Parser orderListV4Parser, IslandSeparatorDTO.Configuration configuration, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            configuration = IslandSeparatorDTO.Configuration.SECTION_END;
        }
        return orderListV4Parser.createIslandSeparator(configuration);
    }

    @NotNull
    public final List<Object> parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = new JSONObject(state.b()).optJSONArray("shipments");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                String jSONObject = optJSONArray.getJSONObject(i11).toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
                arrayList.addAll(this.shipmentParser.invoke((String) null, jSONObject));
            }
        }
        if (this.appType != AppType.SELECT && !arrayList.isEmpty()) {
            arrayList.add(createIslandSeparator$default(this, null, 1, null));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(createBlankSeparator());
        }
        return arrayList;
    }
}
