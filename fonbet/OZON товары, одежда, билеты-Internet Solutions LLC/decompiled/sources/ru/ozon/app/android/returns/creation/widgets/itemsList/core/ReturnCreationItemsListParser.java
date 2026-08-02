package ru.ozon.app.android.returns.creation.widgets.itemsList.core;

import Tc.b;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.data.DeliveryDTO;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.data.DeliveryGroupDTO;
import ru.ozon.app.android.returns.creation.widgets.itemsList.data.ReturnCreationItemsListDTO;
import ru.ozon.app.android.returns.ui.data.parser.IslandSeparatorWidgetParser;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u001d\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u0010H\u0002J\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011*\b\u0012\u0004\u0012\u00020\u00120\u0002H\u0002¢\u0006\u0002\u0010\u0013R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/itemsList/core/ReturnCreationItemsListParser;", "Lru/ozon/app/android/returns/ui/data/parser/IslandSeparatorWidgetParser;", "", "", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "context", "Landroid/content/Context;", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Landroid/content/Context;)V", "invoke", "params", "", "state", "mapToItems", "Lru/ozon/app/android/returns/creation/widgets/itemsList/data/ReturnCreationItemsListDTO;", "", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/DeliveryDTO;", "(Ljava/util/List;)[Ljava/lang/Object;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationItemsListParser extends IslandSeparatorWidgetParser<List<? extends Object>> {

    @NotNull
    private final Context context;

    @NotNull
    private final JsonParser jsonDeserializer;

    public ReturnCreationItemsListParser(@NotNull JsonParser jsonDeserializer, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.jsonDeserializer = jsonDeserializer;
        this.context = context;
    }

    private final List<Object> mapToItems(ReturnCreationItemsListDTO returnCreationItemsListDTO) {
        List<DeliveryGroupDTO> groups = returnCreationItemsListDTO.getGroups();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : groups) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            DeliveryGroupDTO deliveryGroupDTO = (DeliveryGroupDTO) obj;
            b builder = C7714v.B();
            builder.add(i11 == 0 ? createBeginIslandSeparator() : IslandSeparatorWidgetParser.createIslandSeparator$default(this, null, null, 3, null));
            builder.add(deliveryGroupDTO.getTitle());
            C7714v.r(builder, mapToItems(deliveryGroupDTO.getDeliveries()));
            Intrinsics.checkNotNullParameter(builder, "builder");
            C7714v.p(builder.B(), arrayList);
            i11 = i12;
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public List<Object> invoke(String params, String state) {
        if (state == null) {
            return K.f71697a;
        }
        ReturnCreationItemsListDTO returnCreationItemsListDTO = (ReturnCreationItemsListDTO) this.jsonDeserializer.fromJson(state, ReturnCreationItemsListDTO.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(mapToItems(returnCreationItemsListDTO));
        if (!AppTokensProvider.INSTANCE.isSelect(this.context)) {
            arrayList.add(IslandSeparatorWidgetParser.createIslandSeparator$default(this, null, null, 3, null));
        }
        return arrayList;
    }

    private final Object[] mapToItems(List<DeliveryDTO> list) {
        ArrayList arrayList = new ArrayList();
        for (DeliveryDTO deliveryDTO : list) {
            b builder = C7714v.B();
            builder.add(deliveryDTO.getTitle());
            builder.addAll(deliveryDTO.getItems());
            Intrinsics.checkNotNullParameter(builder, "builder");
            C7714v.p(C7714v.I(builder.B()), arrayList);
        }
        return arrayList.toArray(new Object[0]);
    }
}
