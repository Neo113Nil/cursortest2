package ru.ozon.app.android.pdp.widgets.othersellers.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.pdp.widgets.othersellers.data.OtherSellersDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\"\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R(\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020)\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R(\u0010+\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019¨\u0006."}, d2 = {"Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO_SellerJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/badge/Badge;", "nullableBadgeAdapter", "Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller$Rating;", "nullableRatingAdapter", "Lru/ozon/uni/atoms/data/price/Price;", "priceAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "nullableListOfCellWithSubtitle24IconAdapter", "Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller$LegalInfo;", "nullableLegalInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "nullableMapOfStringStringAdapter", "", "nullableIntAdapter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OtherSellersDTO_SellerJsonAdapter extends JsonAdapter<OtherSellersDTO.Seller> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<Badge> nullableBadgeAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<OtherSellersDTO.Seller.LegalInfo> nullableLegalInfoAdapter;

    @NotNull
    private final JsonAdapter<List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon>> nullableListOfCellWithSubtitle24IconAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<OtherSellersDTO.Seller.Rating> nullableRatingAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Price> priceAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public OtherSellersDTO_SellerJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("sku", "deeplink", "label", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_RATING_FIELD_NAME, "price", AppMeasurementSdk.ConditionalUserProperty.NAME, "cells", "legalInfo", "trackingInfo", "toCartTrackingInfo", "toFavTrackingInfo", "unfavTrackingInfo", "params", "selectedDeliverySchema");
        M m11 = M.f71699a;
        this.longAdapter = moshi.f(Long.TYPE, m11, "sku");
        this.nullableStringAdapter = moshi.f(String.class, m11, "deeplink");
        this.nullableBadgeAdapter = moshi.f(Badge.class, m11, "label");
        this.nullableRatingAdapter = moshi.f(OtherSellersDTO.Seller.Rating.class, m11, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_RATING_FIELD_NAME);
        this.priceAdapter = moshi.f(Price.class, m11, "price");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.nullableListOfCellWithSubtitle24IconAdapter = moshi.f(D.e(List.class, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon.class), m11, "cells");
        this.nullableLegalInfoAdapter = moshi.f(OtherSellersDTO.Seller.LegalInfo.class, m11, "legalInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableMapOfStringStringAdapter = moshi.f(D.e(Map.class, String.class, String.class), m11, "params");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "selectedDeliverySchema");
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(OtherSellersDTO.Seller)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OtherSellersDTO.Seller fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        String str = null;
        Badge badge = null;
        OtherSellersDTO.Seller.Rating rating = null;
        Price price = null;
        TextAtom textAtom = null;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> list = null;
        OtherSellersDTO.Seller.LegalInfo legalInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        Map<String, TokenizedTrackingInfo> map3 = null;
        Map<String, TokenizedTrackingInfo> map4 = null;
        Map<String, String> map5 = null;
        Integer num = null;
        while (true) {
            Long l12 = l11;
            if (!reader.hasNext()) {
                reader.endObject();
                if (l12 == null) {
                    throw c.j("sku", "sku", reader);
                }
                long longValue = l12.longValue();
                if (price == null) {
                    throw c.j("price", "price", reader);
                }
                if (textAtom != null) {
                    return new OtherSellersDTO.Seller(longValue, str, badge, rating, price, textAtom, list, legalInfo, map, map2, map3, map4, map5, num);
                }
                throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
            }
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
                    continue;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    badge = this.nullableBadgeAdapter.fromJson(reader);
                    break;
                case 3:
                    rating = this.nullableRatingAdapter.fromJson(reader);
                    break;
                case 4:
                    price = this.priceAdapter.fromJson(reader);
                    if (price == null) {
                        throw c.q("price", "price", reader);
                    }
                    break;
                case 5:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    }
                    break;
                case 6:
                    list = this.nullableListOfCellWithSubtitle24IconAdapter.fromJson(reader);
                    break;
                case 7:
                    legalInfo = this.nullableLegalInfoAdapter.fromJson(reader);
                    break;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 9:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 10:
                    map3 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 11:
                    map4 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 12:
                    map5 = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    break;
                case 13:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
            }
            l11 = l12;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OtherSellersDTO.Seller value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("sku");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getSku()));
        writer.w("deeplink");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getDeeplink());
        writer.w("label");
        this.nullableBadgeAdapter.mo44toJson(writer, (x) value.getLabel());
        writer.w(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_RATING_FIELD_NAME);
        this.nullableRatingAdapter.mo44toJson(writer, (x) value.getProductRating());
        writer.w("price");
        this.priceAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getName());
        writer.w("cells");
        this.nullableListOfCellWithSubtitle24IconAdapter.mo44toJson(writer, (x) value.getCells());
        writer.w("legalInfo");
        this.nullableLegalInfoAdapter.mo44toJson(writer, (x) value.getLegalInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("toCartTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getToCartTrackingInfo());
        writer.w("toFavTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getToFavTrackingInfo());
        writer.w("unfavTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getUnfavTrackingInfo());
        writer.w("params");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value.getParams());
        writer.w("selectedDeliverySchema");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getSelectedDeliverySchema());
        writer.p();
    }
}
