package ru.ozon.app.android.autopicker.view.productpickersearch.data;

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
import ru.ozon.app.android.autopicker.view.productpickersearch.data.ProductPickerSearchDTO;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.data.ProductPickerDetailsDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$Header;", "headerAdapter", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$Value;", "listOfValueAdapter", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$Button;", "buttonAdapter", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CurrentState;", "currentStateAdapter", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$TrackingInfo;", "nullableTrackingInfoAdapter", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerSearchDTOJsonAdapter extends JsonAdapter<ProductPickerSearchDTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<ProductPickerSearchDTO.Button> buttonAdapter;

    @NotNull
    private final JsonAdapter<ProductPickerDetailsDTO.CurrentState> currentStateAdapter;

    @NotNull
    private final JsonAdapter<ProductPickerSearchDTO.Header> headerAdapter;

    @NotNull
    private final JsonAdapter<List<ProductPickerSearchDTO.Value>> listOfValueAdapter;

    @NotNull
    private final JsonAdapter<ProductPickerSearchDTO.TrackingInfo> nullableTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    public ProductPickerSearchDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("hasSectionTitles", "hasMultiselection", CommentV3DTO.HEADER_FIELD_NAME, "values", "button", "currentState", "trackingInfo");
        M m11 = M.f71699a;
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "hasSectionTitles");
        this.headerAdapter = moshi.f(ProductPickerSearchDTO.Header.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.listOfValueAdapter = moshi.f(D.e(List.class, ProductPickerSearchDTO.Value.class), m11, "values");
        this.buttonAdapter = moshi.f(ProductPickerSearchDTO.Button.class, m11, "button");
        this.currentStateAdapter = moshi.f(ProductPickerDetailsDTO.CurrentState.class, m11, "currentState");
        this.nullableTrackingInfoAdapter = moshi.f(ProductPickerSearchDTO.TrackingInfo.class, m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(ProductPickerSearchDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProductPickerSearchDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        ProductPickerSearchDTO.Header header = null;
        List<ProductPickerSearchDTO.Value> list = null;
        ProductPickerSearchDTO.Button button = null;
        ProductPickerDetailsDTO.CurrentState currentState = null;
        ProductPickerSearchDTO.TrackingInfo trackingInfo = null;
        while (true) {
            Boolean bool3 = bool;
            if (!reader.hasNext()) {
                reader.endObject();
                if (bool3 == null) {
                    throw c.j("hasSectionTitles", "hasSectionTitles", reader);
                }
                boolean booleanValue = bool3.booleanValue();
                if (bool2 == null) {
                    throw c.j("hasMultiselection", "hasMultiselection", reader);
                }
                boolean booleanValue2 = bool2.booleanValue();
                if (header == null) {
                    throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                }
                if (list == null) {
                    throw c.j("values", "values", reader);
                }
                if (button == null) {
                    throw c.j("button", "button", reader);
                }
                if (currentState != null) {
                    return new ProductPickerSearchDTO(booleanValue, booleanValue2, header, list, button, currentState, trackingInfo);
                }
                throw c.j("currentState", "currentState", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("hasSectionTitles", "hasSectionTitles", reader);
                    }
                    continue;
                case 1:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("hasMultiselection", "hasMultiselection", reader);
                    }
                    break;
                case 2:
                    header = this.headerAdapter.fromJson(reader);
                    if (header == null) {
                        throw c.q("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                    }
                    break;
                case 3:
                    list = this.listOfValueAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("values", "values", reader);
                    }
                    break;
                case 4:
                    button = this.buttonAdapter.fromJson(reader);
                    if (button == null) {
                        throw c.q("button", "button", reader);
                    }
                    break;
                case 5:
                    currentState = this.currentStateAdapter.fromJson(reader);
                    if (currentState == null) {
                        throw c.q("currentState", "currentState", reader);
                    }
                    break;
                case 6:
                    trackingInfo = this.nullableTrackingInfoAdapter.fromJson(reader);
                    break;
            }
            bool = bool3;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProductPickerSearchDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("hasSectionTitles");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getHasSectionTitles()));
        writer.w("hasMultiselection");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getHasMultiselection()));
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.headerAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("values");
        this.listOfValueAdapter.mo44toJson(writer, (x) value.getValues());
        writer.w("button");
        this.buttonAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("currentState");
        this.currentStateAdapter.mo44toJson(writer, (x) value.getCurrentState());
        writer.w("trackingInfo");
        this.nullableTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
