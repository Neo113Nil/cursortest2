package ru.ozon.app.android.account.orders.cancelpostingsv2.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.orders.cancelpostingsv2.data.AnnotationModel;
import ru.ozon.app.android.account.orders.cancelpostingsv2.data.ButtonModel;
import ru.ozon.app.android.account.orders.cancelpostingsv2.data.CancelPostingsV2DTO;
import ru.ozon.app.android.account.orders.cancelpostingsv2.data.MonopostingModel;
import ru.ozon.app.android.account.orders.cancelpostingsv2.data.PostingModel;
import ru.ozon.app.android.account.orders.cancelpostingsv2.data.SelectAllModel;
import ru.ozon.app.android.account.orders.cancelpostingsv2.data.ShipmentModel;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u000022\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0001j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003`\u0005B\u0015\b\u0007\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r*\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u000e\u001a\u00020\u0011*\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0012J\u001d\u0010\u000e\u001a\u00020\u0014*\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0015J\u001d\u0010\u000e\u001a\u00020\u0017*\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0018J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/core/CancelPostingsV2Parser;", "Lkotlin/Function2;", "", "", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$SelectAllDTO;", "selectedIds", "Lru/ozon/app/android/account/orders/cancelpostingsv2/data/SelectAllModel;", "map", "(Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$SelectAllDTO;Ljava/lang/String;)Lru/ozon/app/android/account/orders/cancelpostingsv2/data/SelectAllModel;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$ShipmentDTO;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/data/ShipmentModel;", "(Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$ShipmentDTO;Ljava/lang/String;)Lru/ozon/app/android/account/orders/cancelpostingsv2/data/ShipmentModel;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$MonopostingDTO;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/data/MonopostingModel;", "(Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$MonopostingDTO;Ljava/lang/String;)Lru/ozon/app/android/account/orders/cancelpostingsv2/data/MonopostingModel;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$PostingDTO;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/data/PostingModel;", "(Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$PostingDTO;Ljava/lang/String;)Lru/ozon/app/android/account/orders/cancelpostingsv2/data/PostingModel;", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CancelPostingsV2Parser implements Function2<String, String, List<? extends Object>> {

    @NotNull
    private final JsonParser jsonDeserializer;

    public CancelPostingsV2Parser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    private final SelectAllModel map(CancelPostingsV2DTO.SelectAllDTO selectAllDTO, String str) {
        return new SelectAllModel(selectAllDTO.isSelected(), selectAllDTO.getTitle(), selectAllDTO.getAction(), str);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        JsonParser jsonParser = this.jsonDeserializer;
        Intrinsics.f(state);
        CancelPostingsV2DTO cancelPostingsV2DTO = (CancelPostingsV2DTO) jsonParser.fromJson(state, CancelPostingsV2DTO.class);
        ArrayList arrayList = new ArrayList();
        if (cancelPostingsV2DTO.getAnnotation() != null) {
            arrayList.add(new AnnotationModel(cancelPostingsV2DTO.getAnnotation()));
        }
        for (Object obj : cancelPostingsV2DTO.getItems()) {
            Object map = obj instanceof CancelPostingsV2DTO.SelectAllDTO ? map((CancelPostingsV2DTO.SelectAllDTO) obj, cancelPostingsV2DTO.getSelectedIds()) : obj instanceof CancelPostingsV2DTO.ShipmentDTO ? map((CancelPostingsV2DTO.ShipmentDTO) obj, cancelPostingsV2DTO.getSelectedIds()) : obj instanceof CancelPostingsV2DTO.MonopostingDTO ? map((CancelPostingsV2DTO.MonopostingDTO) obj, cancelPostingsV2DTO.getSelectedIds()) : obj instanceof CancelPostingsV2DTO.PostingDTO ? map((CancelPostingsV2DTO.PostingDTO) obj, cancelPostingsV2DTO.getSelectedIds()) : null;
            if (map != null) {
                arrayList.add(map);
            }
        }
        arrayList.add(new ButtonModel(cancelPostingsV2DTO.getButton(), cancelPostingsV2DTO.getBadge()));
        return arrayList;
    }

    private final ShipmentModel map(CancelPostingsV2DTO.ShipmentDTO shipmentDTO, String str) {
        return new ShipmentModel(shipmentDTO.isSelected(), shipmentDTO.getTitle(), shipmentDTO.getSubtitle(), shipmentDTO.getAction(), str);
    }

    private final MonopostingModel map(CancelPostingsV2DTO.MonopostingDTO monopostingDTO, String str) {
        return new MonopostingModel(monopostingDTO.isSelected(), monopostingDTO.getImage(), monopostingDTO.getTitle(), monopostingDTO.getSubtitle(), monopostingDTO.getInfo(), monopostingDTO.getAction(), str, monopostingDTO.getPriceIncreaseInfo(), monopostingDTO.getTitleBadge(), monopostingDTO.getImageBadge());
    }

    private final PostingModel map(CancelPostingsV2DTO.PostingDTO postingDTO, String str) {
        Boolean isSelected = postingDTO.isSelected();
        String title = postingDTO.getTitle();
        List<CancelPostingsV2DTO.PostingDTO.ItemDTO> items = postingDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        for (CancelPostingsV2DTO.PostingDTO.ItemDTO itemDTO : items) {
            arrayList.add(new PostingModel.ItemModel(itemDTO.getImage(), itemDTO.getSubtitle()));
        }
        return new PostingModel(isSelected, title, arrayList, postingDTO.getAction(), str, postingDTO.getTitleBadge());
    }
}
