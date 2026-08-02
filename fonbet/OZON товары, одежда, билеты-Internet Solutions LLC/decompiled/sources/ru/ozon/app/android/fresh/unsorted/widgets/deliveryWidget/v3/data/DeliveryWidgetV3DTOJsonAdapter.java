package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.data;

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
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R(\u0010+\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019¨\u00060"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/DeliveryWidgetV3DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/DeliveryWidgetV3DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/DeliveryWidgetV3DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/DeliveryWidgetV3DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "commonAtomIconDTOAdapter", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/Spacers;", "spacersAdapter", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/ContentSpacers;", "contentSpacersAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "", "longAdapter", "", "nullableIntAdapter", "stringAdapter", "nullableStringAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "booleanAdapter", "Lorg/joda/time/DateTime;", "nullableDateTimeAdapter", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryWidgetV3DTOJsonAdapter extends JsonAdapter<DeliveryWidgetV3DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<CommonAtomIconDTO> commonAtomIconDTOAdapter;

    @NotNull
    private final JsonAdapter<ContentSpacers> contentSpacersAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<DateTime> nullableDateTimeAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Spacers> spacersAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public DeliveryWidgetV3DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("priceText", "deliveryText", "deliveryInfoIcon", "spacers", "contentSpacers", "action", "widgetUpdatePeriod", "progress", "progressGradient", "borderColor", "eclipseColor", "backgroundColor", "trackingInfo", "shouldHideProgressBar", "timerDeadline");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "priceText");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "deliveryText");
        this.commonAtomIconDTOAdapter = moshi.f(CommonAtomIconDTO.class, m11, "deliveryInfoIcon");
        this.spacersAdapter = moshi.f(Spacers.class, m11, "spacers");
        this.contentSpacersAdapter = moshi.f(ContentSpacers.class, m11, "contentSpacers");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.longAdapter = moshi.f(Long.TYPE, m11, "widgetUpdatePeriod");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "progress");
        this.stringAdapter = moshi.f(String.class, m11, "progressGradient");
        this.nullableStringAdapter = moshi.f(String.class, m11, "borderColor");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "shouldHideProgressBar");
        this.nullableDateTimeAdapter = moshi.f(DateTime.class, m11, "timerDeadline");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(DeliveryWidgetV3DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DeliveryWidgetV3DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        Boolean bool = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        CommonAtomIconDTO commonAtomIconDTO = null;
        Spacers spacers = null;
        ContentSpacers contentSpacers = null;
        AtomActionDTO atomActionDTO = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        DateTime dateTime = null;
        while (true) {
            Long l12 = l11;
            Boolean bool2 = bool;
            TextDTO textDTO3 = textDTO;
            TextDTO textDTO4 = textDTO2;
            CommonAtomIconDTO commonAtomIconDTO2 = commonAtomIconDTO;
            Spacers spacers2 = spacers;
            ContentSpacers contentSpacers2 = contentSpacers;
            if (!reader.hasNext()) {
                reader.endObject();
                if (textDTO3 == null) {
                    throw c.j("priceText", "priceText", reader);
                }
                if (commonAtomIconDTO2 == null) {
                    throw c.j("deliveryInfoIcon", "deliveryInfoIcon", reader);
                }
                if (spacers2 == null) {
                    throw c.j("spacers", "spacers", reader);
                }
                if (contentSpacers2 == null) {
                    throw c.j("contentSpacers", "contentSpacers", reader);
                }
                if (atomActionDTO == null) {
                    throw c.j("action", "action", reader);
                }
                if (l12 == null) {
                    throw c.j("widgetUpdatePeriod", "widgetUpdatePeriod", reader);
                }
                long longValue = l12.longValue();
                if (str == null) {
                    throw c.j("progressGradient", "progressGradient", reader);
                }
                if (bool2 != null) {
                    return new DeliveryWidgetV3DTO(textDTO3, textDTO4, commonAtomIconDTO2, spacers2, contentSpacers2, atomActionDTO, longValue, num, str, str2, str3, str4, map, bool2.booleanValue(), dateTime);
                }
                throw c.j("shouldHideProgressBar", "shouldHideProgressBar", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    l11 = l12;
                    bool = bool2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    commonAtomIconDTO = commonAtomIconDTO2;
                    spacers = spacers2;
                    contentSpacers = contentSpacers2;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("priceText", "priceText", reader);
                    }
                    l11 = l12;
                    bool = bool2;
                    textDTO2 = textDTO4;
                    commonAtomIconDTO = commonAtomIconDTO2;
                    spacers = spacers2;
                    contentSpacers = contentSpacers2;
                case 1:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    l11 = l12;
                    bool = bool2;
                    textDTO = textDTO3;
                    commonAtomIconDTO = commonAtomIconDTO2;
                    spacers = spacers2;
                    contentSpacers = contentSpacers2;
                case 2:
                    commonAtomIconDTO = this.commonAtomIconDTOAdapter.fromJson(reader);
                    if (commonAtomIconDTO == null) {
                        throw c.q("deliveryInfoIcon", "deliveryInfoIcon", reader);
                    }
                    l11 = l12;
                    bool = bool2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    spacers = spacers2;
                    contentSpacers = contentSpacers2;
                case 3:
                    spacers = this.spacersAdapter.fromJson(reader);
                    if (spacers == null) {
                        throw c.q("spacers", "spacers", reader);
                    }
                    l11 = l12;
                    bool = bool2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    commonAtomIconDTO = commonAtomIconDTO2;
                    contentSpacers = contentSpacers2;
                case 4:
                    contentSpacers = this.contentSpacersAdapter.fromJson(reader);
                    if (contentSpacers == null) {
                        throw c.q("contentSpacers", "contentSpacers", reader);
                    }
                    l11 = l12;
                    bool = bool2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    commonAtomIconDTO = commonAtomIconDTO2;
                    spacers = spacers2;
                case 5:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("action", "action", reader);
                    }
                    l11 = l12;
                    bool = bool2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    commonAtomIconDTO = commonAtomIconDTO2;
                    spacers = spacers2;
                    contentSpacers = contentSpacers2;
                case 6:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("widgetUpdatePeriod", "widgetUpdatePeriod", reader);
                    }
                    bool = bool2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    commonAtomIconDTO = commonAtomIconDTO2;
                    spacers = spacers2;
                    contentSpacers = contentSpacers2;
                case 7:
                    num = this.nullableIntAdapter.fromJson(reader);
                    l11 = l12;
                    bool = bool2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    commonAtomIconDTO = commonAtomIconDTO2;
                    spacers = spacers2;
                    contentSpacers = contentSpacers2;
                case 8:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("progressGradient", "progressGradient", reader);
                    }
                    l11 = l12;
                    bool = bool2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    commonAtomIconDTO = commonAtomIconDTO2;
                    spacers = spacers2;
                    contentSpacers = contentSpacers2;
                case 9:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    l11 = l12;
                    bool = bool2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    commonAtomIconDTO = commonAtomIconDTO2;
                    spacers = spacers2;
                    contentSpacers = contentSpacers2;
                case 10:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    l11 = l12;
                    bool = bool2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    commonAtomIconDTO = commonAtomIconDTO2;
                    spacers = spacers2;
                    contentSpacers = contentSpacers2;
                case 11:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    l11 = l12;
                    bool = bool2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    commonAtomIconDTO = commonAtomIconDTO2;
                    spacers = spacers2;
                    contentSpacers = contentSpacers2;
                case 12:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    l11 = l12;
                    bool = bool2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    commonAtomIconDTO = commonAtomIconDTO2;
                    spacers = spacers2;
                    contentSpacers = contentSpacers2;
                case 13:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("shouldHideProgressBar", "shouldHideProgressBar", reader);
                    }
                    l11 = l12;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    commonAtomIconDTO = commonAtomIconDTO2;
                    spacers = spacers2;
                    contentSpacers = contentSpacers2;
                case 14:
                    dateTime = this.nullableDateTimeAdapter.fromJson(reader);
                    l11 = l12;
                    bool = bool2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    commonAtomIconDTO = commonAtomIconDTO2;
                    spacers = spacers2;
                    contentSpacers = contentSpacers2;
                default:
                    l11 = l12;
                    bool = bool2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    commonAtomIconDTO = commonAtomIconDTO2;
                    spacers = spacers2;
                    contentSpacers = contentSpacers2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DeliveryWidgetV3DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("priceText");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getPriceText());
        writer.w("deliveryText");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getDeliveryText());
        writer.w("deliveryInfoIcon");
        this.commonAtomIconDTOAdapter.mo44toJson(writer, (x) value.getDeliveryInfoIcon());
        writer.w("spacers");
        this.spacersAdapter.mo44toJson(writer, (x) value.getSpacers());
        writer.w("contentSpacers");
        this.contentSpacersAdapter.mo44toJson(writer, (x) value.getContentSpacers());
        writer.w("action");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("widgetUpdatePeriod");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getWidgetUpdatePeriod()));
        writer.w("progress");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getProgress());
        writer.w("progressGradient");
        this.stringAdapter.mo44toJson(writer, (x) value.getProgressGradient());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("eclipseColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getEclipseColor());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("shouldHideProgressBar");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShouldHideProgressBar()));
        writer.w("timerDeadline");
        this.nullableDateTimeAdapter.mo44toJson(writer, (x) value.getTimerDeadline());
        writer.p();
    }
}
