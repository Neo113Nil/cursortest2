package ru.ozon.app.android.marketing.widgets.highlightProducts.data;

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
import ru.ozon.app.android.marketing.widgets.highlightProducts.data.HighlightProductsDTO;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsCurrentMiniWidget;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperProgressText;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO$HighlightProduct;", "listOfHighlightProductAdapter", "nullableListOfHighlightProductAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "nullableHighlightsCurrentMiniWidgetAdapter", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;", "nullableHighlightsWrapperProgressTextAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HighlightProductsDTOJsonAdapter extends JsonAdapter<HighlightProductsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<HighlightProductsDTO.HighlightProduct>> listOfHighlightProductAdapter;

    @NotNull
    private final JsonAdapter<HighlightsCurrentMiniWidget> nullableHighlightsCurrentMiniWidgetAdapter;

    @NotNull
    private final JsonAdapter<HighlightsWrapperProgressText> nullableHighlightsWrapperProgressTextAdapter;

    @NotNull
    private final JsonAdapter<List<HighlightProductsDTO.HighlightProduct>> nullableListOfHighlightProductAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    public HighlightProductsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "mainProducts", "subProducts", "subtitle", "trackingInfo", "currentMiniWidget", "miniProgressText");
        M m11 = M.f71699a;
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.listOfHighlightProductAdapter = moshi.f(D.e(List.class, HighlightProductsDTO.HighlightProduct.class), m11, "mainProducts");
        this.nullableListOfHighlightProductAdapter = moshi.f(D.e(List.class, HighlightProductsDTO.HighlightProduct.class), m11, "subProducts");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableHighlightsCurrentMiniWidgetAdapter = moshi.f(HighlightsCurrentMiniWidget.class, m11, "currentMiniWidget");
        this.nullableHighlightsWrapperProgressTextAdapter = moshi.f(HighlightsWrapperProgressText.class, m11, "miniProgressText");
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(HighlightProductsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HighlightProductsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        HighlightsCurrentMiniWidget highlightsCurrentMiniWidget = null;
        TextAtom textAtom = null;
        List<HighlightProductsDTO.HighlightProduct> list = null;
        List<HighlightProductsDTO.HighlightProduct> list2 = null;
        TextAtom textAtom2 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        boolean z11 = false;
        boolean z12 = false;
        HighlightsWrapperProgressText highlightsWrapperProgressText = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 1:
                    list = this.listOfHighlightProductAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("mainProducts", "mainProducts", reader);
                    }
                    break;
                case 2:
                    list2 = this.nullableListOfHighlightProductAdapter.fromJson(reader);
                    break;
                case 3:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 4:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 5:
                    highlightsCurrentMiniWidget = this.nullableHighlightsCurrentMiniWidgetAdapter.fromJson(reader);
                    z11 = true;
                    break;
                case 6:
                    highlightsWrapperProgressText = this.nullableHighlightsWrapperProgressTextAdapter.fromJson(reader);
                    z12 = true;
                    break;
            }
        }
        reader.endObject();
        if (list == null) {
            throw c.j("mainProducts", "mainProducts", reader);
        }
        HighlightProductsDTO highlightProductsDTO = new HighlightProductsDTO(textAtom, list, list2, textAtom2, map);
        if (z11) {
            highlightProductsDTO.setCurrentMiniWidget(highlightsCurrentMiniWidget);
        }
        if (z12) {
            highlightProductsDTO.setMiniProgressText(highlightsWrapperProgressText);
        }
        return highlightProductsDTO;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HighlightProductsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("mainProducts");
        this.listOfHighlightProductAdapter.mo44toJson(writer, (x) value.getMainProducts());
        writer.w("subProducts");
        this.nullableListOfHighlightProductAdapter.mo44toJson(writer, (x) value.getSubProducts());
        writer.w("subtitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("currentMiniWidget");
        this.nullableHighlightsCurrentMiniWidgetAdapter.mo44toJson(writer, (x) value.getCurrentMiniWidget());
        writer.w("miniProgressText");
        this.nullableHighlightsWrapperProgressTextAdapter.mo44toJson(writer, (x) value.getMiniProgressText());
        writer.p();
    }
}
