package ru.ozon.app.android.marketing.widgets.sellerCarousel.data;

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
import ru.ozon.app.android.atoms.data.rating.RatingBadgeAtom;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.data.SellerListDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R(\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020)\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019¨\u0006+"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO_SellerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO$SellerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO$SellerDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO$SellerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableIntAdapter", "stringAdapter", "", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO$SellerDTO$ProductDTO;", "nullableListOfProductDTOAdapter", "", "booleanAdapter", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/app/android/atoms/data/rating/RatingBadgeAtom;", "nullableRatingBadgeAtomAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerListDTO_SellerDTOJsonAdapter extends JsonAdapter<SellerListDTO.SellerDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<SellerListDTO.SellerDTO.ProductDTO>> nullableListOfProductDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<RatingBadgeAtom> nullableRatingBadgeAtomAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public SellerListDTO_SellerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("id", SelectionItemFormDTO.TITLE_FIELD_NAME, "productsCount", "subtitle", "logoImage", "deeplink", "items", "isFavorite", "isPremium", "premiumIcon", "ratingBadge", "trackingInfo");
        M m11 = M.f71699a;
        this.longAdapter = moshi.f(Long.TYPE, m11, "id");
        this.nullableStringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "productsCount");
        this.stringAdapter = moshi.f(String.class, m11, "deeplink");
        this.nullableListOfProductDTOAdapter = moshi.f(D.e(List.class, SellerListDTO.SellerDTO.ProductDTO.class), m11, "items");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isFavorite");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isPremium");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "premiumIcon");
        this.nullableRatingBadgeAtomAdapter = moshi.f(RatingBadgeAtom.class, m11, "ratingBadge");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(45, "GeneratedJsonAdapter(SellerListDTO.SellerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SellerListDTO.SellerDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        Boolean bool = null;
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List<SellerListDTO.SellerDTO.ProductDTO> list = null;
        Boolean bool2 = null;
        IconDTO iconDTO = null;
        RatingBadgeAtom ratingBadgeAtom = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            Long l12 = l11;
            if (!reader.hasNext()) {
                reader.endObject();
                Boolean bool3 = bool;
                if (l12 == null) {
                    throw c.j("id", "id", reader);
                }
                long longValue = l12.longValue();
                if (str4 == null) {
                    throw c.j("deeplink", "deeplink", reader);
                }
                if (bool3 != null) {
                    return new SellerListDTO.SellerDTO(longValue, str, num, str2, str3, str4, list, bool3.booleanValue(), bool2, iconDTO, ratingBadgeAtom, map);
                }
                throw c.j("isFavorite", "isFavorite", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("id", "id", reader);
                    }
                    continue;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("deeplink", "deeplink", reader);
                    }
                    break;
                case 6:
                    list = this.nullableListOfProductDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isFavorite", "isFavorite", reader);
                    }
                    break;
                case 8:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 9:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case 10:
                    ratingBadgeAtom = this.nullableRatingBadgeAtomAdapter.fromJson(reader);
                    break;
                case 11:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
            l11 = l12;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SellerListDTO.SellerDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getId()));
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("productsCount");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getProductsCount());
        writer.w("subtitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("logoImage");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getLogoImage());
        writer.w("deeplink");
        this.stringAdapter.mo44toJson(writer, (x) value.getDeeplink());
        writer.w("items");
        this.nullableListOfProductDTOAdapter.mo44toJson(writer, (x) value.getItems());
        writer.w("isFavorite");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isFavorite()));
        writer.w("isPremium");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isPremium());
        writer.w("premiumIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getPremiumIcon());
        writer.w("ratingBadge");
        this.nullableRatingBadgeAtomAdapter.mo44toJson(writer, (x) value.getRatingBadge());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
