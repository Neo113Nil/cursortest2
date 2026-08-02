package ru.ozon.app.android.pdp.widgets.outofstock.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.pdp.widgets.outofstock.data.OutOfStockDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/pdp/widgets/outofstock/data/OutOfStockDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/outofstock/data/OutOfStockDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/outofstock/data/OutOfStockDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/outofstock/data/OutOfStockDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/price/Price;", "priceAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextSmall;", "nullableTextSmallAdapter", "Lru/ozon/app/android/pdp/widgets/outofstock/data/OutOfStockDTO$TrackingInfo;", "nullableTrackingInfoAdapter", "", "nullableMapOfStringStringAdapter", "", "nullableIntAdapter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OutOfStockDTOJsonAdapter extends JsonAdapter<OutOfStockDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final JsonAdapter<CommonText.TextSmall> nullableTextSmallAdapter;

    @NotNull
    private final JsonAdapter<OutOfStockDTO.TrackingInfo> nullableTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Price> priceAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public OutOfStockDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("sku", "deeplink", "image", "price", "deliveryInfo", "sellerInfo", "trackingInfo", "params", "selectedDeliverySchema");
        M m11 = M.f71699a;
        this.longAdapter = moshi.f(Long.TYPE, m11, "sku");
        this.stringAdapter = moshi.f(String.class, m11, "deeplink");
        this.nullableStringAdapter = moshi.f(String.class, m11, "image");
        this.priceAdapter = moshi.f(Price.class, m11, "price");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "deliveryInfo");
        this.nullableTextSmallAdapter = moshi.f(CommonText.TextSmall.class, m11, "sellerInfo");
        this.nullableTrackingInfoAdapter = moshi.f(OutOfStockDTO.TrackingInfo.class, m11, "trackingInfo");
        this.nullableMapOfStringStringAdapter = moshi.f(D.e(Map.class, String.class, String.class), m11, "params");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "selectedDeliverySchema");
    }

    @NotNull
    public String toString() {
        return b.c(35, "GeneratedJsonAdapter(OutOfStockDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OutOfStockDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        String str = null;
        String str2 = null;
        Price price = null;
        TextAtom textAtom = null;
        CommonText.TextSmall textSmall = null;
        OutOfStockDTO.TrackingInfo trackingInfo = null;
        Map<String, String> map = null;
        Integer num = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("sku", "sku", reader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("deeplink", "deeplink", reader);
                    }
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    price = this.priceAdapter.fromJson(reader);
                    if (price == null) {
                        throw c.q("price", "price", reader);
                    }
                    break;
                case 4:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 5:
                    textSmall = this.nullableTextSmallAdapter.fromJson(reader);
                    break;
                case 6:
                    trackingInfo = this.nullableTrackingInfoAdapter.fromJson(reader);
                    break;
                case 7:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    break;
                case 8:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (l11 == null) {
            throw c.j("sku", "sku", reader);
        }
        long longValue = l11.longValue();
        if (str == null) {
            throw c.j("deeplink", "deeplink", reader);
        }
        if (price != null) {
            return new OutOfStockDTO(longValue, str, str2, price, textAtom, textSmall, trackingInfo, map, num);
        }
        throw c.j("price", "price", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OutOfStockDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("sku");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getSku()));
        writer.w("deeplink");
        this.stringAdapter.mo44toJson(writer, (x) value.getDeeplink());
        writer.w("image");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("price");
        this.priceAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("deliveryInfo");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getDeliveryInfo());
        writer.w("sellerInfo");
        this.nullableTextSmallAdapter.mo44toJson(writer, (x) value.getSellerInfo());
        writer.w("trackingInfo");
        this.nullableTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("params");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value.getParams());
        writer.w("selectedDeliverySchema");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getSelectedDeliverySchema());
        writer.p();
    }
}
