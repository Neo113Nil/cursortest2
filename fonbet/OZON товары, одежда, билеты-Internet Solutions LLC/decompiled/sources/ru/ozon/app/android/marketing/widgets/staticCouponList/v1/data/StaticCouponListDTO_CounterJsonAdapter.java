package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data;

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
import org.joda.time.DateTime;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO_CounterJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Counter;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Counter;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Counter;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background;", "nullableBackgroundAdapter", "nullableBooleanAdapter", "nullableStringAdapter", "Lorg/joda/time/DateTime;", "nullableDateTimeAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListDTO_CounterJsonAdapter extends JsonAdapter<StaticCouponListDTO.Counter> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<StaticCouponListDTO.Background> nullableBackgroundAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<DateTime> nullableDateTimeAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    public StaticCouponListDTO_CounterJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("isEnabled", "bgColor", "isTicker", "tickerTextColor", "tickerTextStyle", "serverTimestamp", "dateStart", "dateEnd", "beforeStartText", "beforeEndText", "onReachDateEndText", "leftIcon", "staticText");
        M m11 = M.f71699a;
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isEnabled");
        this.nullableBackgroundAdapter = moshi.f(StaticCouponListDTO.Background.class, m11, "bgColor");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isTicker");
        this.nullableStringAdapter = moshi.f(String.class, m11, "tickerTextColor");
        this.nullableDateTimeAdapter = moshi.f(DateTime.class, m11, "serverTimestamp");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "beforeStartText");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "leftIcon");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(StaticCouponListDTO.Counter)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public StaticCouponListDTO.Counter fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        StaticCouponListDTO.Background background = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        DateTime dateTime = null;
        DateTime dateTime2 = null;
        DateTime dateTime3 = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        TextDTO textDTO3 = null;
        IconDTO iconDTO = null;
        TextDTO textDTO4 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isEnabled", "isEnabled", reader);
                    }
                    break;
                case 1:
                    background = this.nullableBackgroundAdapter.fromJson(reader);
                    break;
                case 2:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    dateTime = this.nullableDateTimeAdapter.fromJson(reader);
                    break;
                case 6:
                    dateTime2 = this.nullableDateTimeAdapter.fromJson(reader);
                    break;
                case 7:
                    dateTime3 = this.nullableDateTimeAdapter.fromJson(reader);
                    break;
                case 8:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 9:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 10:
                    textDTO3 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 11:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case 12:
                    textDTO4 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (bool != null) {
            return new StaticCouponListDTO.Counter(bool.booleanValue(), background, bool2, str, str2, dateTime, dateTime2, dateTime3, textDTO, textDTO2, textDTO3, iconDTO, textDTO4);
        }
        throw c.j("isEnabled", "isEnabled", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, StaticCouponListDTO.Counter value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("isEnabled");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isEnabled()));
        writer.w("bgColor");
        this.nullableBackgroundAdapter.mo44toJson(writer, (x) value.getBgColor());
        writer.w("isTicker");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isTicker());
        writer.w("tickerTextColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTickerTextColor());
        writer.w("tickerTextStyle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTickerTextStyle());
        writer.w("serverTimestamp");
        this.nullableDateTimeAdapter.mo44toJson(writer, (x) value.getServerTimestamp());
        writer.w("dateStart");
        this.nullableDateTimeAdapter.mo44toJson(writer, (x) value.getDateStart());
        writer.w("dateEnd");
        this.nullableDateTimeAdapter.mo44toJson(writer, (x) value.getDateEnd());
        writer.w("beforeStartText");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getBeforeStartText());
        writer.w("beforeEndText");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getBeforeEndText());
        writer.w("onReachDateEndText");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getOnReachDateEndText());
        writer.w("leftIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getLeftIcon());
        writer.w("staticText");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getStaticText());
        writer.p();
    }
}
