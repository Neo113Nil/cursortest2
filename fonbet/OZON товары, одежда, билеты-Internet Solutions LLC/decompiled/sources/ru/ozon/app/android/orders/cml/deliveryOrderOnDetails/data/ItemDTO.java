package ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.data;

import kotlin.Metadata;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImagesDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;

@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "images", type = ImagesDTO.class), @ProtoOneOfSignature(name = "atomElement", type = AtomElementDTO.class), @ProtoOneOfSignature(name = "textIcon", type = TextIconDTO.class)})
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\ba\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/ItemDTO;", "", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ProtoOneOf(label = "type")
/* loaded from: classes13.dex */
public interface ItemDTO {
}
