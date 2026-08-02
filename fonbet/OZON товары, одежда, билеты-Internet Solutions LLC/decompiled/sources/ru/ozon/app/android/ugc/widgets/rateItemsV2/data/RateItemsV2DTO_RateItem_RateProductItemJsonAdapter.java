package ru.ozon.app.android.ugc.widgets.rateItemsV2.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.pdp.common.ugc.timer.TimerDTO;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.data.RateItemsV2DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\"\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO_RateItem_RateProductItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItem$RateProductItem;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItem$RateProductItem;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItem$RateProductItem;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "productMediaDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "ratingDTOAdapter", "nullableStringAdapter", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItemCommon;", "nullableRateItemCommonAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$HideButtonDTO;", "nullableHideButtonDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lru/ozon/app/android/pdp/common/ugc/timer/TimerDTO;", "nullableTimerDTOAdapter", "", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RatingActionDTO;", "nullableListOfRatingActionDTOAdapter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateItemsV2DTO_RateItem_RateProductItemJsonAdapter extends JsonAdapter<RateItemsV2DTO.RateItem.RateProductItem> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<RateItemsV2DTO.HideButtonDTO> nullableHideButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<List<RateItemsV2DTO.RatingActionDTO>> nullableListOfRatingActionDTOAdapter;

    @NotNull
    private final JsonAdapter<RateItemsV2DTO.RateItemCommon> nullableRateItemCommonAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final JsonAdapter<TimerDTO> nullableTimerDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ProductMediaDTO> productMediaDTOAdapter;

    @NotNull
    private final JsonAdapter<RatingDTO> ratingDTOAdapter;

    public RateItemsV2DTO_RateItem_RateProductItemJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("productMedia", "rating", "sku", "rateItemCommon", "badge", "hideButton", "headerTitle", DynamicElementDTO.TIMER, "ratingActions");
        M m11 = M.f71699a;
        this.productMediaDTOAdapter = moshi.f(ProductMediaDTO.class, m11, "productMedia");
        this.ratingDTOAdapter = moshi.f(RatingDTO.class, m11, "rating");
        this.nullableStringAdapter = moshi.f(String.class, m11, "sku");
        this.nullableRateItemCommonAdapter = moshi.f(RateItemsV2DTO.RateItemCommon.class, m11, "rateItemCommon");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.nullableHideButtonDTOAdapter = moshi.f(RateItemsV2DTO.HideButtonDTO.class, m11, "hideButton");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "headerTitle");
        this.nullableTimerDTOAdapter = moshi.f(TimerDTO.class, m11, DynamicElementDTO.TIMER);
        this.nullableListOfRatingActionDTOAdapter = moshi.f(D.e(List.class, RateItemsV2DTO.RatingActionDTO.class), m11, "ratingActions");
    }

    @NotNull
    public String toString() {
        return b.c(61, "GeneratedJsonAdapter(RateItemsV2DTO.RateItem.RateProductItem)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public RateItemsV2DTO.RateItem.RateProductItem fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ProductMediaDTO productMediaDTO = null;
        RatingDTO ratingDTO = null;
        String str = null;
        RateItemsV2DTO.RateItemCommon rateItemCommon = null;
        BadgeDTO badgeDTO = null;
        RateItemsV2DTO.HideButtonDTO hideButtonDTO = null;
        TextDTO textDTO = null;
        TimerDTO timerDTO = null;
        List<RateItemsV2DTO.RatingActionDTO> list = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    productMediaDTO = this.productMediaDTOAdapter.fromJson(reader);
                    if (productMediaDTO == null) {
                        throw c.q("productMedia", "productMedia", reader);
                    }
                    break;
                case 1:
                    ratingDTO = this.ratingDTOAdapter.fromJson(reader);
                    if (ratingDTO == null) {
                        throw c.q("rating", "rating", reader);
                    }
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    rateItemCommon = this.nullableRateItemCommonAdapter.fromJson(reader);
                    break;
                case 4:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    hideButtonDTO = this.nullableHideButtonDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    timerDTO = this.nullableTimerDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    list = this.nullableListOfRatingActionDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (productMediaDTO == null) {
            throw c.j("productMedia", "productMedia", reader);
        }
        if (ratingDTO != null) {
            return new RateItemsV2DTO.RateItem.RateProductItem(productMediaDTO, ratingDTO, str, rateItemCommon, badgeDTO, hideButtonDTO, textDTO, timerDTO, list);
        }
        throw c.j("rating", "rating", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, RateItemsV2DTO.RateItem.RateProductItem value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("productMedia");
        this.productMediaDTOAdapter.mo44toJson(writer, (x) value.getProductMedia());
        writer.w("rating");
        this.ratingDTOAdapter.mo44toJson(writer, (x) value.getRating());
        writer.w("sku");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSku());
        writer.w("rateItemCommon");
        this.nullableRateItemCommonAdapter.mo44toJson(writer, (x) value.getRateItemCommon());
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("hideButton");
        this.nullableHideButtonDTOAdapter.mo44toJson(writer, (x) value.getHideButton());
        writer.w("headerTitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getHeaderTitle());
        writer.w(DynamicElementDTO.TIMER);
        this.nullableTimerDTOAdapter.mo44toJson(writer, (x) value.getTimer());
        writer.w("ratingActions");
        this.nullableListOfRatingActionDTOAdapter.mo44toJson(writer, (x) value.getRatingActions());
        writer.p();
    }
}
