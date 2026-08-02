package ru.ozon.app.android.search.catalog.components.productselectormobiledata.data;

import Y9.b;
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
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.ProductSelectorMobileDataDTO;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.SelectorInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR(\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO$ActiveFilters;", "nullableListOfActiveFiltersAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "nullableLargeBorderlessButtonAdapter", "largeBorderlessButtonAdapter", "stringAdapter", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorData;", "nullableSelectorDataAdapter", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorStepData;", "nullableSelectorStepDataAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductSelectorMobileDataDTOJsonAdapter extends JsonAdapter<ProductSelectorMobileDataDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeBorderlessButton> largeBorderlessButtonAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeBorderlessButton> nullableLargeBorderlessButtonAdapter;

    @NotNull
    private final JsonAdapter<List<ProductSelectorMobileDataDTO.ActiveFilters>> nullableListOfActiveFiltersAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<SelectorInfo.SelectorData> nullableSelectorDataAdapter;

    @NotNull
    private final JsonAdapter<SelectorInfo.SelectorStepData> nullableSelectorStepDataAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ProductSelectorMobileDataDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("activeFilters", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "clearButton", "closeButton", "type", ProductSelectorMobileDataDTO.ALL_STEP_TYPE, ProductSelectorMobileDataDTO.STEP_TYPE, "actionButton", "trackingInfo");
        b e11 = D.e(List.class, ProductSelectorMobileDataDTO.ActiveFilters.class);
        M m11 = M.f71699a;
        this.nullableListOfActiveFiltersAdapter = moshi.f(e11, m11, "activeFilters");
        this.nullableStringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableLargeBorderlessButtonAdapter = moshi.f(ButtonV3Atom.LargeBorderlessButton.class, m11, "clearButton");
        this.largeBorderlessButtonAdapter = moshi.f(ButtonV3Atom.LargeBorderlessButton.class, m11, "closeButton");
        this.stringAdapter = moshi.f(String.class, m11, "type");
        this.nullableSelectorDataAdapter = moshi.f(SelectorInfo.SelectorData.class, m11, ProductSelectorMobileDataDTO.ALL_STEP_TYPE);
        this.nullableSelectorStepDataAdapter = moshi.f(SelectorInfo.SelectorStepData.class, m11, ProductSelectorMobileDataDTO.STEP_TYPE);
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "actionButton");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(50, "GeneratedJsonAdapter(ProductSelectorMobileDataDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProductSelectorMobileDataDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<ProductSelectorMobileDataDTO.ActiveFilters> list = null;
        String str = null;
        String str2 = null;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = null;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton2 = null;
        String str3 = null;
        SelectorInfo.SelectorData selectorData = null;
        SelectorInfo.SelectorStepData selectorStepData = null;
        ButtonV3Atom.LargeButton largeButton = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.nullableListOfActiveFiltersAdapter.fromJson(reader);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    largeBorderlessButton = this.nullableLargeBorderlessButtonAdapter.fromJson(reader);
                    break;
                case 4:
                    largeBorderlessButton2 = this.largeBorderlessButtonAdapter.fromJson(reader);
                    if (largeBorderlessButton2 == null) {
                        throw c.q("closeButton", "closeButton", reader);
                    }
                    break;
                case 5:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("type", "type", reader);
                    }
                    break;
                case 6:
                    selectorData = this.nullableSelectorDataAdapter.fromJson(reader);
                    break;
                case 7:
                    selectorStepData = this.nullableSelectorStepDataAdapter.fromJson(reader);
                    break;
                case 8:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("actionButton", "actionButton", reader);
                    }
                    break;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (largeBorderlessButton2 == null) {
            throw c.j("closeButton", "closeButton", reader);
        }
        if (str3 == null) {
            throw c.j("type", "type", reader);
        }
        if (largeButton != null) {
            return new ProductSelectorMobileDataDTO(list, str, str2, largeBorderlessButton, largeBorderlessButton2, str3, selectorData, selectorStepData, largeButton, map);
        }
        throw c.j("actionButton", "actionButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProductSelectorMobileDataDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("activeFilters");
        this.nullableListOfActiveFiltersAdapter.mo44toJson(writer, (x) value.getActiveFilters());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("clearButton");
        this.nullableLargeBorderlessButtonAdapter.mo44toJson(writer, (x) value.getClearButton());
        writer.w("closeButton");
        this.largeBorderlessButtonAdapter.mo44toJson(writer, (x) value.getCloseButton());
        writer.w("type");
        this.stringAdapter.mo44toJson(writer, (x) value.getType());
        writer.w(ProductSelectorMobileDataDTO.ALL_STEP_TYPE);
        this.nullableSelectorDataAdapter.mo44toJson(writer, (x) value.getSelectorData());
        writer.w(ProductSelectorMobileDataDTO.STEP_TYPE);
        this.nullableSelectorStepDataAdapter.mo44toJson(writer, (x) value.getSelectorStepData());
        writer.w("actionButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getActionButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
