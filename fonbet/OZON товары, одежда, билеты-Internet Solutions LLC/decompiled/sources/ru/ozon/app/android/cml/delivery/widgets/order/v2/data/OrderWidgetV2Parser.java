package ru.ozon.app.android.cml.delivery.widgets.order.v2.data;

import Tc.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cml.delivery.molecules.cellListGroup.data.CellListGroupDTO;
import ru.ozon.app.android.cml.delivery.molecules.secureDeal.data.SecureDealMoleculeDTO;
import ru.ozon.app.android.cml.delivery.widgets.order.data.model.OrderItem;
import ru.ozon.app.android.cml.delivery.widgets.order.data.model.OrderParamsModel;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002R\u0012\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/v2/data/OrderWidgetV2Parser;", "Lkotlin/Function2;", "", "", "", "deserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "invoke", "params", "jsonState", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderWidgetV2Parser implements Function2<String, String, List<? extends Object>> {

    @NotNull
    private final JsonParser deserializer;

    public OrderWidgetV2Parser(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.deserializer = deserializer;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, @NotNull String jsonState) {
        Intrinsics.checkNotNullParameter(jsonState, "jsonState");
        OrderWidgetV2DTO orderWidgetV2DTO = (OrderWidgetV2DTO) this.deserializer.fromJson(jsonState, OrderWidgetV2DTO.class);
        b builder = C7714v.B();
        List<Object> orderItems = orderWidgetV2DTO.getOrderItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : orderItems) {
            Object cellListGroup = obj instanceof CellListGroupDTO ? new OrderItem.CellListGroup((CellListGroupDTO) obj) : obj instanceof SecureDealMoleculeDTO ? new OrderItem.SecureDeal((SecureDealMoleculeDTO) obj) : null;
            if (cellListGroup != null) {
                arrayList.add(cellListGroup);
            }
        }
        builder.add(new OrderParamsModel(arrayList, orderWidgetV2DTO.getTrackingInfo()));
        builder.add(orderWidgetV2DTO.getButton());
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
