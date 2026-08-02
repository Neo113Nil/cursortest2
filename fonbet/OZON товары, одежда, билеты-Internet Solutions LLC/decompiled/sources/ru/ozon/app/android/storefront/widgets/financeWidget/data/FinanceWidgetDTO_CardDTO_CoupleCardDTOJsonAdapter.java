package ru.ozon.app.android.storefront.widgets.financeWidget.data;

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
import ru.ozon.app.android.storefront.widgets.financeWidget.data.FinanceWidgetDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO_CardDTO_CoupleCardDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$CoupleCardDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$CoupleCardDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$CardDTO$CoupleCardDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO$ItemDTO;", "itemDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "booleanAdapter", "", "intAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinanceWidgetDTO_CardDTO_CoupleCardDTOJsonAdapter extends JsonAdapter<FinanceWidgetDTO.CardDTO.CoupleCardDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<FinanceWidgetDTO.ItemDTO> itemDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public FinanceWidgetDTO_CardDTO_CoupleCardDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("topItem", "bottomItem", "widgetBackgroundColor", "isCompactSize", "spanIndex", "widgetTrackingInfo");
        M m11 = M.f71699a;
        this.itemDTOAdapter = moshi.f(FinanceWidgetDTO.ItemDTO.class, m11, "topItem");
        this.nullableStringAdapter = moshi.f(String.class, m11, "widgetBackgroundColor");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isCompactSize");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "spanIndex");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "widgetTrackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(60, "GeneratedJsonAdapter(FinanceWidgetDTO.CardDTO.CoupleCardDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FinanceWidgetDTO.CardDTO.CoupleCardDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        FinanceWidgetDTO.ItemDTO itemDTO = null;
        String str = null;
        Boolean bool = null;
        Integer num = null;
        Map<String, TokenizedTrackingInfo> map = null;
        boolean z11 = false;
        boolean z12 = false;
        FinanceWidgetDTO.ItemDTO itemDTO2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    itemDTO = this.itemDTOAdapter.fromJson(reader);
                    if (itemDTO == null) {
                        throw c.q("topItem", "topItem", reader);
                    }
                    break;
                case 1:
                    itemDTO2 = this.itemDTOAdapter.fromJson(reader);
                    if (itemDTO2 == null) {
                        throw c.q("bottomItem", "bottomItem", reader);
                    }
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(reader);
                    z11 = true;
                    break;
                case 3:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isCompactSize", "isCompactSize", reader);
                    }
                    break;
                case 4:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("spanIndex", "spanIndex", reader);
                    }
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    z12 = true;
                    break;
            }
        }
        reader.endObject();
        if (itemDTO == null) {
            throw c.j("topItem", "topItem", reader);
        }
        if (itemDTO2 == null) {
            throw c.j("bottomItem", "bottomItem", reader);
        }
        FinanceWidgetDTO.CardDTO.CoupleCardDTO coupleCardDTO = new FinanceWidgetDTO.CardDTO.CoupleCardDTO(itemDTO, itemDTO2);
        if (z11) {
            coupleCardDTO.setWidgetBackgroundColor(str);
        }
        coupleCardDTO.setCompactSize(bool != null ? bool.booleanValue() : coupleCardDTO.getIsCompactSize());
        coupleCardDTO.setSpanIndex(num != null ? num.intValue() : coupleCardDTO.getSpanIndex());
        if (z12) {
            coupleCardDTO.setWidgetTrackingInfo(map);
        }
        return coupleCardDTO;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FinanceWidgetDTO.CardDTO.CoupleCardDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("topItem");
        this.itemDTOAdapter.mo44toJson(writer, (x) value.getTopItem());
        writer.w("bottomItem");
        this.itemDTOAdapter.mo44toJson(writer, (x) value.getBottomItem());
        writer.w("widgetBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getWidgetBackgroundColor());
        writer.w("isCompactSize");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getIsCompactSize()));
        writer.w("spanIndex");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getSpanIndex()));
        writer.w("widgetTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getWidgetTrackingInfo());
        writer.p();
    }
}
