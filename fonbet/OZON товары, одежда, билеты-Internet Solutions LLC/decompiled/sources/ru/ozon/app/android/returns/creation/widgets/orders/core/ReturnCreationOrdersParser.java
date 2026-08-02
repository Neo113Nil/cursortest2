package ru.ozon.app.android.returns.creation.widgets.orders.core;

import Tc.b;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cscore.extendBackground.data.ExtendBackgroundDTO;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.data.DeliveryDTO;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.data.DeliveryGroupDTO;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.data.ItemDTO;
import ru.ozon.app.android.returns.creation.widgets.orders.data.PaginationDTO;
import ru.ozon.app.android.returns.creation.widgets.orders.data.ReturnCreationOrdersDTO;
import ru.ozon.app.android.returns.ui.data.parser.IslandSeparatorWidgetParser;
import ru.ozon.app.android.returns.ui.molecules.opencloud.data.OpenCloudDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u001d\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013*\b\u0012\u0004\u0012\u00020\u00140\u0002H\u0002¢\u0006\u0002\u0010\u0015R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/orders/core/ReturnCreationOrdersParser;", "Lru/ozon/app/android/returns/ui/data/parser/IslandSeparatorWidgetParser;", "", "", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "context", "Landroid/content/Context;", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Landroid/content/Context;)V", "invoke", "params", "", "state", "mapToItems", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/DeliveryGroupDTO;", "isFirstSeparatorBegin", "", "", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/DeliveryDTO;", "(Ljava/util/List;)[Ljava/lang/Object;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationOrdersParser extends IslandSeparatorWidgetParser<List<? extends Object>> {

    @NotNull
    private final Context context;

    @NotNull
    private final JsonParser jsonDeserializer;

    public ReturnCreationOrdersParser(@NotNull JsonParser jsonDeserializer, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.jsonDeserializer = jsonDeserializer;
        this.context = context;
    }

    private final List<Object> mapToItems(List<DeliveryGroupDTO> list, boolean z11) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            DeliveryGroupDTO deliveryGroupDTO = (DeliveryGroupDTO) obj;
            b builder = C7714v.B();
            builder.add((z11 && i11 == 0) ? createBeginIslandSeparator() : IslandSeparatorWidgetParser.createIslandSeparator$default(this, null, Integer.valueOf(AppTokensProvider.IslandSeparatorHeight.INSTANCE.between()), 1, null));
            builder.add(deliveryGroupDTO.getTitle());
            C7714v.r(builder, mapToItems(deliveryGroupDTO.getDeliveries()));
            Intrinsics.checkNotNullParameter(builder, "builder");
            C7714v.p(builder.B(), arrayList);
            i11 = i12;
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        List<Object> mapToItems;
        if (state == null) {
            return K.f71697a;
        }
        ReturnCreationOrdersDTO returnCreationOrdersDTO = (ReturnCreationOrdersDTO) this.jsonDeserializer.fromJson(state, ReturnCreationOrdersDTO.class);
        ArrayList arrayList = new ArrayList();
        OpenCloudDTO openCloud = returnCreationOrdersDTO.getOpenCloud();
        if (openCloud != null) {
            arrayList.add(openCloud);
        }
        boolean z11 = returnCreationOrdersDTO.getOpenCloud() == null;
        List<DeliveryGroupDTO> orders = returnCreationOrdersDTO.getOrders();
        if (orders != null && (mapToItems = mapToItems(orders, z11)) != null) {
            arrayList.addAll(mapToItems);
        }
        AppTokensProvider appTokensProvider = AppTokensProvider.INSTANCE;
        if (!appTokensProvider.isSelect(this.context)) {
            arrayList.add(createEndIslandSeparator());
        }
        if (returnCreationOrdersDTO.getPagination() != null) {
            arrayList.add(PaginationDTO.copy$default(returnCreationOrdersDTO.getPagination(), null, null, Integer.valueOf(returnCreationOrdersDTO.getOpenCloud() != null ? Integer.MAX_VALUE : LinearLayoutManager.INVALID_OFFSET), 3, null));
        }
        if (appTokensProvider.isSelect(this.context)) {
            arrayList.add(new ExtendBackgroundDTO(null, 1, null));
        }
        return arrayList;
    }

    private final Object[] mapToItems(List<DeliveryDTO> list) {
        ArrayList arrayList = new ArrayList();
        for (DeliveryDTO deliveryDTO : list) {
            b builder = C7714v.B();
            builder.add(deliveryDTO.getTitle());
            C7714v.r(builder, deliveryDTO.getItems().toArray(new ItemDTO[0]));
            Intrinsics.checkNotNullParameter(builder, "builder");
            C7714v.p(C7714v.I(builder.B()), arrayList);
        }
        return arrayList.toArray(new Object[0]);
    }
}
