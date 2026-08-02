package ru.ozon.app.android.marketing.widgets.sellerCarousel.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.data.SellerListDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R(\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO_SellerDTO_ProductDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO$SellerDTO$ProductDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO$SellerDTO$ProductDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO$SellerDTO$ProductDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableLongAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Ljava/math/BigDecimal;", "nullableBigDecimalAdapter", "nullableStringAdapter", "", "nullableIntAdapter", "", "booleanAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerListDTO_SellerDTO_ProductDTOJsonAdapter extends JsonAdapter<SellerListDTO.SellerDTO.ProductDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<BigDecimal> nullableBigDecimalAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public SellerListDTO_SellerDTO_ProductDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("sku", SelectionItemFormDTO.TITLE_FIELD_NAME, "image", "price", "finalPrice", "priceString", "discount", "deeplink", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "trackingInfo");
        M m11 = M.f71699a;
        this.nullableLongAdapter = moshi.f(Long.class, m11, "sku");
        this.stringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableBigDecimalAdapter = moshi.f(BigDecimal.class, m11, "price");
        this.nullableStringAdapter = moshi.f(String.class, m11, "priceString");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "discount");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, FavoriteProductMolecule.IS_ADULT_PARAMS_NAME);
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(56, "GeneratedJsonAdapter(SellerListDTO.SellerDTO.ProductDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SellerListDTO.SellerDTO.ProductDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Long l11 = null;
        String str = null;
        String str2 = null;
        BigDecimal bigDecimal = null;
        BigDecimal bigDecimal2 = null;
        String str3 = null;
        Integer num = null;
        String str4 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            Boolean bool2 = bool;
            if (!reader.hasNext()) {
                reader.endObject();
                if (str == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (str2 == null) {
                    throw c.j("image", "image", reader);
                }
                if (str4 == null) {
                    throw c.j("deeplink", "deeplink", reader);
                }
                if (bool2 != null) {
                    return new SellerListDTO.SellerDTO.ProductDTO(l11, str, str2, bigDecimal, bigDecimal2, str3, num, str4, bool2.booleanValue(), map);
                }
                throw c.j(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("image", "image", reader);
                    }
                    break;
                case 3:
                    bigDecimal = this.nullableBigDecimalAdapter.fromJson(reader);
                    break;
                case 4:
                    bigDecimal2 = this.nullableBigDecimalAdapter.fromJson(reader);
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 7:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("deeplink", "deeplink", reader);
                    }
                    break;
                case 8:
                    Boolean fromJson = this.booleanAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, reader);
                    }
                    bool = fromJson;
                    continue;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
            bool = bool2;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SellerListDTO.SellerDTO.ProductDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("sku");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getSku());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("image");
        this.stringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("price");
        this.nullableBigDecimalAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("finalPrice");
        this.nullableBigDecimalAdapter.mo44toJson(writer, (x) value.getFinalPrice());
        writer.w("priceString");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getPriceString());
        writer.w("discount");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getDiscount());
        writer.w("deeplink");
        this.stringAdapter.mo44toJson(writer, (x) value.getDeeplink());
        writer.w(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME);
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isAdult()));
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
