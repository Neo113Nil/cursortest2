package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

import RZ.b;
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

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/SubmitActionPendingDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/SubmitActionPendingData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/SubmitActionPendingData;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/SubmitActionPendingData;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "nullableAnyAdapter", "", "nullableLongAdapter", "LRZ/b;", "nullablePageAnalyticsInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "nullableMapOfStringAnyAdapter", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SubmitActionPendingDataJsonAdapter extends JsonAdapter<SubmitActionPendingData> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Object> nullableAnyAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<b> nullablePageAnalyticsInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public SubmitActionPendingDataJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("productId", "actionName", "params", "widgetId", "widgetToken", "pageAnalyticsInfo", "submitActionTrackingInfo", "customTrackingInfo");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "productId");
        this.stringAdapter = moshi.f(String.class, m11, "actionName");
        this.nullableAnyAdapter = moshi.f(Object.class, m11, "params");
        this.nullableLongAdapter = moshi.f(Long.class, m11, "widgetId");
        this.nullablePageAnalyticsInfoAdapter = moshi.f(b.class, m11, "pageAnalyticsInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "submitActionTrackingInfo");
        this.nullableMapOfStringAnyAdapter = moshi.f(D.e(Map.class, String.class, Object.class), m11, "customTrackingInfo");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(45, "GeneratedJsonAdapter(SubmitActionPendingData)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SubmitActionPendingData fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        Object obj = null;
        Long l11 = null;
        String str3 = null;
        b bVar = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, Object> map2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("actionName", "actionName", reader);
                    }
                    break;
                case 2:
                    obj = this.nullableAnyAdapter.fromJson(reader);
                    break;
                case 3:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    bVar = this.nullablePageAnalyticsInfoAdapter.fromJson(reader);
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 7:
                    map2 = this.nullableMapOfStringAnyAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str2 != null) {
            return new SubmitActionPendingData(str, str2, obj, l11, str3, bVar, map, map2);
        }
        throw c.j("actionName", "actionName", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SubmitActionPendingData value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("productId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getProductId());
        writer.w("actionName");
        this.stringAdapter.mo44toJson(writer, (x) value.getActionName());
        writer.w("params");
        this.nullableAnyAdapter.mo44toJson(writer, (x) value.getParams());
        writer.w("widgetId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getWidgetId());
        writer.w("widgetToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getWidgetToken());
        writer.w("pageAnalyticsInfo");
        this.nullablePageAnalyticsInfoAdapter.mo44toJson(writer, (x) value.getPageAnalyticsInfo());
        writer.w("submitActionTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getSubmitActionTrackingInfo());
        writer.w("customTrackingInfo");
        this.nullableMapOfStringAnyAdapter.mo44toJson(writer, (x) value.getCustomTrackingInfo());
        writer.p();
    }
}
