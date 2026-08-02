package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.data.PricesHistogramDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO_MonthDTO_DayDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$MonthDTO$DayDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$MonthDTO$DayDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$MonthDTO$DayDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "", "booleanAdapter", "nullableBooleanAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PricesHistogramDTO_MonthDTO_DayDTOJsonAdapter extends JsonAdapter<PricesHistogramDTO.MonthDTO.DayDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public PricesHistogramDTO_MonthDTO_DayDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("dayHeight", "number", "date", SelectionItemFormDTO.TITLE_FIELD_NAME, "isSelected", "priceOrMessage", "price", "isLowest", "daySelectionTracking");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "dayHeight");
        this.stringAdapter = moshi.f(String.class, m11, "number");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSelected");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isLowest");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "daySelectionTracking");
    }

    @NotNull
    public String toString() {
        return b.c(56, "GeneratedJsonAdapter(PricesHistogramDTO.MonthDTO.DayDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PricesHistogramDTO.MonthDTO.DayDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Boolean bool = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        Boolean bool2 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            Integer num3 = num;
            Boolean bool3 = bool;
            Integer num4 = num2;
            if (!reader.hasNext()) {
                reader.endObject();
                if (num3 == null) {
                    throw c.j("dayHeight", "dayHeight", reader);
                }
                int intValue = num3.intValue();
                if (str == null) {
                    throw c.j("number", "number", reader);
                }
                if (str2 == null) {
                    throw c.j("date", "date", reader);
                }
                if (textAtom == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (bool3 == null) {
                    throw c.j("isSelected", "isSelected", reader);
                }
                boolean booleanValue = bool3.booleanValue();
                if (textAtom2 == null) {
                    throw c.j("priceOrMessage", "priceOrMessage", reader);
                }
                if (num4 != null) {
                    return new PricesHistogramDTO.MonthDTO.DayDTO(intValue, str, str2, textAtom, booleanValue, textAtom2, num4.intValue(), bool2, map);
                }
                throw c.j("price", "price", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num3;
                    bool = bool3;
                    num2 = num4;
                case 0:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("dayHeight", "dayHeight", reader);
                    }
                    bool = bool3;
                    num2 = num4;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("number", "number", reader);
                    }
                    num = num3;
                    bool = bool3;
                    num2 = num4;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("date", "date", reader);
                    }
                    num = num3;
                    bool = bool3;
                    num2 = num4;
                case 3:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    num = num3;
                    bool = bool3;
                    num2 = num4;
                case 4:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isSelected", "isSelected", reader);
                    }
                    num = num3;
                    num2 = num4;
                case 5:
                    textAtom2 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom2 == null) {
                        throw c.q("priceOrMessage", "priceOrMessage", reader);
                    }
                    num = num3;
                    bool = bool3;
                    num2 = num4;
                case 6:
                    Integer fromJson = this.intAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q("price", "price", reader);
                    }
                    num2 = fromJson;
                    num = num3;
                    bool = bool3;
                case 7:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    num = num3;
                    bool = bool3;
                    num2 = num4;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    num = num3;
                    bool = bool3;
                    num2 = num4;
                default:
                    num = num3;
                    bool = bool3;
                    num2 = num4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PricesHistogramDTO.MonthDTO.DayDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("dayHeight");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getDayHeight()));
        writer.w("number");
        this.stringAdapter.mo44toJson(writer, (x) value.getNumber());
        writer.w("date");
        this.stringAdapter.mo44toJson(writer, (x) value.getDate());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("isSelected");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSelected()));
        writer.w("priceOrMessage");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getPriceOrMessage());
        writer.w("price");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getPrice()));
        writer.w("isLowest");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isLowest());
        writer.w("daySelectionTracking");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getDaySelectionTracking());
        writer.p();
    }
}
