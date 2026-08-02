package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.data;

import Ak.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ads.common.pixel.data.PixelDTO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.data.UniversalWidgetDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\"\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020)\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019¨\u0006+"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO_ItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableLongAdapter", "Ljava/math/BigDecimal;", "nullableBigDecimalAdapter", "", "nullableFloatAdapter", "", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "Lru/ozon/app/android/ads/common/pixel/data/PixelDTO;", "nullableListOfPixelDTOAdapter", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalWidgetDTO_ItemDTOJsonAdapter extends JsonAdapter<UniversalWidgetDTO.ItemDTO> {

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<BigDecimal> nullableBigDecimalAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Float> nullableFloatAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<PixelDTO>> nullableListOfPixelDTOAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public UniversalWidgetDTO_ItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("index", "type", "id", "brand", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "image", "price", "discount", "finalPrice", "link", "deeplink", "rating", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "isFavorite", "isInCart", "marketLabel", "commentsCount", "advert", "algorithm", "advId", "adBadge", "isImageBackgroundHidden", "trackingInfo", "pixel");
        M m11 = M.f71699a;
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "index");
        this.nullableStringAdapter = moshi.f(String.class, m11, "type");
        this.nullableLongAdapter = moshi.f(Long.class, m11, "id");
        this.nullableBigDecimalAdapter = moshi.f(BigDecimal.class, m11, "price");
        this.nullableFloatAdapter = moshi.f(Float.class, m11, "rating");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, FavoriteProductMolecule.IS_ADULT_PARAMS_NAME);
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "adBadge");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableListOfPixelDTOAdapter = moshi.f(D.e(List.class, PixelDTO.class), m11, "pixel");
    }

    @NotNull
    public String toString() {
        return b.c(48, "GeneratedJsonAdapter(UniversalWidgetDTO.ItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public UniversalWidgetDTO.ItemDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        String str = null;
        Long l11 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        BigDecimal bigDecimal = null;
        Integer num2 = null;
        BigDecimal bigDecimal2 = null;
        String str6 = null;
        String str7 = null;
        Float f7 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str8 = null;
        Integer num3 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        BadgeDTO badgeDTO = null;
        Boolean bool4 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        List<PixelDTO> list = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    bigDecimal = this.nullableBigDecimalAdapter.fromJson(reader);
                    break;
                case 8:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 9:
                    bigDecimal2 = this.nullableBigDecimalAdapter.fromJson(reader);
                    break;
                case 10:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 11:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 12:
                    f7 = this.nullableFloatAdapter.fromJson(reader);
                    break;
                case 13:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 14:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 15:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 16:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 17:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 18:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 19:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 20:
                    str11 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 21:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 22:
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 23:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 24:
                    list = this.nullableListOfPixelDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new UniversalWidgetDTO.ItemDTO(num, str, l11, str2, str3, str4, str5, bigDecimal, num2, bigDecimal2, str6, str7, f7, bool, bool2, bool3, str8, num3, str9, str10, str11, badgeDTO, bool4, map, list);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, UniversalWidgetDTO.ItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("index");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getIndex());
        writer.w("type");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getType());
        writer.w("id");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getId());
        writer.w("brand");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBrand());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("image");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("price");
        this.nullableBigDecimalAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("discount");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getDiscount());
        writer.w("finalPrice");
        this.nullableBigDecimalAdapter.mo44toJson(writer, (x) value.getFinalPrice());
        writer.w("link");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getLink());
        writer.w("deeplink");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getDeeplink());
        writer.w("rating");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value.getRating());
        writer.w(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME);
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isAdult());
        writer.w("isFavorite");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isFavorite());
        writer.w("isInCart");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isInCart());
        writer.w("marketLabel");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getMarketLabel());
        writer.w("commentsCount");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getCommentsCount());
        writer.w("advert");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getAdvert());
        writer.w("algorithm");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getAlgorithm());
        writer.w("advId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getAdvId());
        writer.w("adBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getAdBadge());
        writer.w("isImageBackgroundHidden");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isImageBackgroundHidden());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("pixel");
        this.nullableListOfPixelDTOAdapter.mo44toJson(writer, (x) value.getPixel());
        writer.p();
    }
}
