package ru.ozon.app.android.ugc.widgets.additionalReview.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.additionalReview.data.AdditionalReviewDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Bonus;", "nullableBonusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Product;", "productAdapter", "Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$Rating;", "ratingAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO$DisplayType;", "displayTypeAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdditionalReviewDTOJsonAdapter extends JsonAdapter<AdditionalReviewDTO> {
    public static final int $stable = 8;
    private volatile Constructor<AdditionalReviewDTO> constructorRef;

    @NotNull
    private final JsonAdapter<AdditionalReviewDTO.DisplayType> displayTypeAdapter;

    @NotNull
    private final JsonAdapter<AdditionalReviewDTO.Bonus> nullableBonusAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<AdditionalReviewDTO.Product> productAdapter;

    @NotNull
    private final JsonAdapter<AdditionalReviewDTO.Rating> ratingAdapter;

    public AdditionalReviewDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("bonus", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "rating", "trackingInfo", "cornerRadius", "displayType");
        M m11 = M.f71699a;
        this.nullableBonusAdapter = moshi.f(AdditionalReviewDTO.Bonus.class, m11, "bonus");
        this.productAdapter = moshi.f(AdditionalReviewDTO.Product.class, m11, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME);
        this.ratingAdapter = moshi.f(AdditionalReviewDTO.Rating.class, m11, "rating");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "cornerRadius");
        this.displayTypeAdapter = moshi.f(AdditionalReviewDTO.DisplayType.class, m11, "displayType");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(AdditionalReviewDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AdditionalReviewDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        AdditionalReviewDTO.Bonus bonus = null;
        AdditionalReviewDTO.Product product = null;
        AdditionalReviewDTO.Rating rating = null;
        Map<String, TokenizedTrackingInfo> map = null;
        CornerRadius cornerRadius = null;
        AdditionalReviewDTO.DisplayType displayType = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    bonus = this.nullableBonusAdapter.fromJson(reader);
                    break;
                case 1:
                    product = this.productAdapter.fromJson(reader);
                    if (product == null) {
                        throw c.q(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, reader);
                    }
                    break;
                case 2:
                    rating = this.ratingAdapter.fromJson(reader);
                    if (rating == null) {
                        throw c.q("rating", "rating", reader);
                    }
                    break;
                case 3:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 4:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
                case 5:
                    displayType = this.displayTypeAdapter.fromJson(reader);
                    if (displayType == null) {
                        throw c.q("displayType", "displayType", reader);
                    }
                    i11 = -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -33) {
            CornerRadius cornerRadius2 = cornerRadius;
            Map<String, TokenizedTrackingInfo> map2 = map;
            AdditionalReviewDTO.Rating rating2 = rating;
            AdditionalReviewDTO.Product product2 = product;
            AdditionalReviewDTO.Bonus bonus2 = bonus;
            if (product2 == null) {
                throw c.j(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, reader);
            }
            if (rating2 == null) {
                throw c.j("rating", "rating", reader);
            }
            Intrinsics.g(displayType, "null cannot be cast to non-null type ru.ozon.app.android.ugc.widgets.additionalReview.data.AdditionalReviewDTO.DisplayType");
            return new AdditionalReviewDTO(bonus2, product2, rating2, map2, cornerRadius2, displayType);
        }
        CornerRadius cornerRadius3 = cornerRadius;
        Map<String, TokenizedTrackingInfo> map3 = map;
        AdditionalReviewDTO.Rating rating3 = rating;
        AdditionalReviewDTO.Product product3 = product;
        AdditionalReviewDTO.Bonus bonus3 = bonus;
        Constructor<AdditionalReviewDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AdditionalReviewDTO.class.getDeclaredConstructor(AdditionalReviewDTO.Bonus.class, AdditionalReviewDTO.Product.class, AdditionalReviewDTO.Rating.class, Map.class, CornerRadius.class, AdditionalReviewDTO.DisplayType.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<AdditionalReviewDTO> constructor2 = constructor;
        if (product3 == null) {
            throw c.j(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, reader);
        }
        if (rating3 == null) {
            throw c.j("rating", "rating", reader);
        }
        AdditionalReviewDTO newInstance = constructor2.newInstance(bonus3, product3, rating3, map3, cornerRadius3, displayType, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AdditionalReviewDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("bonus");
        this.nullableBonusAdapter.mo44toJson(writer, (x) value.getBonus());
        writer.w(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME);
        this.productAdapter.mo44toJson(writer, (x) value.getProduct());
        writer.w("rating");
        this.ratingAdapter.mo44toJson(writer, (x) value.getRating());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("cornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.w("displayType");
        this.displayTypeAdapter.mo44toJson(writer, (x) value.getDisplayType());
        writer.p();
    }
}
