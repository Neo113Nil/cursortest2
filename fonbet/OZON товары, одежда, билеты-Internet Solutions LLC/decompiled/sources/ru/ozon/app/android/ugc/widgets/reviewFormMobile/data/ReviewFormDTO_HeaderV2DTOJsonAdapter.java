package ru.ozon.app.android.ugc.widgets.reviewFormMobile.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO_HeaderV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "productMediaDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$ClickableTextDTO;", "clickableTextDTOAdapter", "nullableClickableTextDTOAdapter", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;", "ratingDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButtonV3DTOAdapter", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;", "nullableSubmitOnBackConfigDTOAdapter", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;", "nullablePlaceholdersSheetConfigAdapter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormDTO_HeaderV2DTOJsonAdapter extends JsonAdapter<ReviewFormDTO.HeaderV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ReviewFormDTO.ClickableTextDTO> clickableTextDTOAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> iconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<ReviewFormDTO.ClickableTextDTO> nullableClickableTextDTOAdapter;

    @NotNull
    private final JsonAdapter<ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig> nullablePlaceholdersSheetConfigAdapter;

    @NotNull
    private final JsonAdapter<ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO> nullableSubmitOnBackConfigDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ProductMediaDTO> productMediaDTOAdapter;

    @NotNull
    private final JsonAdapter<ReviewFormDTO.RatingDTO> ratingDTOAdapter;

    public ReviewFormDTO_HeaderV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("productImage", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "rating", "closeButton", "submitOnBackConfig", "placeholdersSheetConfig");
        M m11 = M.f71699a;
        this.productMediaDTOAdapter = moshi.f(ProductMediaDTO.class, m11, "productImage");
        this.clickableTextDTOAdapter = moshi.f(ReviewFormDTO.ClickableTextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableClickableTextDTOAdapter = moshi.f(ReviewFormDTO.ClickableTextDTO.class, m11, "subtitle");
        this.ratingDTOAdapter = moshi.f(ReviewFormDTO.RatingDTO.class, m11, "rating");
        this.iconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "closeButton");
        this.nullableSubmitOnBackConfigDTOAdapter = moshi.f(ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO.class, m11, "submitOnBackConfig");
        this.nullablePlaceholdersSheetConfigAdapter = moshi.f(ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig.class, m11, "placeholdersSheetConfig");
    }

    @NotNull
    public String toString() {
        return b.c(47, "GeneratedJsonAdapter(ReviewFormDTO.HeaderV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReviewFormDTO.HeaderV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ProductMediaDTO productMediaDTO = null;
        ReviewFormDTO.ClickableTextDTO clickableTextDTO = null;
        ReviewFormDTO.ClickableTextDTO clickableTextDTO2 = null;
        ReviewFormDTO.RatingDTO ratingDTO = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfigDTO = null;
        ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    productMediaDTO = this.productMediaDTOAdapter.fromJson(reader);
                    if (productMediaDTO == null) {
                        throw c.q("productImage", "productImage", reader);
                    }
                    break;
                case 1:
                    clickableTextDTO = this.clickableTextDTOAdapter.fromJson(reader);
                    if (clickableTextDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 2:
                    clickableTextDTO2 = this.nullableClickableTextDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    ratingDTO = this.ratingDTOAdapter.fromJson(reader);
                    if (ratingDTO == null) {
                        throw c.q("rating", "rating", reader);
                    }
                    break;
                case 4:
                    iconButtonV3DTO = this.iconButtonV3DTOAdapter.fromJson(reader);
                    if (iconButtonV3DTO == null) {
                        throw c.q("closeButton", "closeButton", reader);
                    }
                    break;
                case 5:
                    submitOnBackConfigDTO = this.nullableSubmitOnBackConfigDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    placeholdersSheetConfig = this.nullablePlaceholdersSheetConfigAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (productMediaDTO == null) {
            throw c.j("productImage", "productImage", reader);
        }
        if (clickableTextDTO == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (ratingDTO == null) {
            throw c.j("rating", "rating", reader);
        }
        if (iconButtonV3DTO != null) {
            return new ReviewFormDTO.HeaderV2DTO(productMediaDTO, clickableTextDTO, clickableTextDTO2, ratingDTO, iconButtonV3DTO, submitOnBackConfigDTO, placeholdersSheetConfig);
        }
        throw c.j("closeButton", "closeButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReviewFormDTO.HeaderV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("productImage");
        this.productMediaDTOAdapter.mo44toJson(writer, (x) value.getProductImage());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.clickableTextDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableClickableTextDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("rating");
        this.ratingDTOAdapter.mo44toJson(writer, (x) value.getRating());
        writer.w("closeButton");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getCloseButton());
        writer.w("submitOnBackConfig");
        this.nullableSubmitOnBackConfigDTOAdapter.mo44toJson(writer, (x) value.getSubmitOnBackConfig());
        writer.w("placeholdersSheetConfig");
        this.nullablePlaceholdersSheetConfigAdapter.mo44toJson(writer, (x) value.getPlaceholdersSheetConfig());
        writer.p();
    }
}
