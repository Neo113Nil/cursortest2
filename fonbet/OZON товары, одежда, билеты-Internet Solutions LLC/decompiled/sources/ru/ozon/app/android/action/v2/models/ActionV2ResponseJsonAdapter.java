package ru.ozon.app.android.action.v2.models;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.metrics.client.MetricsResponse;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001cR(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001cR$\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/action/v2/models/ActionV2ResponseJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lcom/squareup/moshi/Moshi;", "moshi", "", "Ljava/lang/reflect/Type;", "types", "<init>", "(Lcom/squareup/moshi/Moshi;[Ljava/lang/reflect/Type;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/action/v2/models/ActionV2Response;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTNullableAnyAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "nullableMapOfStringStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActionV2ResponseJsonAdapter<T> extends JsonAdapter<ActionV2Response<T>> {
    public static final int $stable = 8;
    private volatile Constructor<ActionV2Response<T>> constructorRef;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<T> nullableTNullableAnyAdapter;

    @NotNull
    private final n.a options;

    public ActionV2ResponseJsonAdapter(@NotNull Moshi moshi, @NotNull Type[] types) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(types, "types");
        if (types.length != 1) {
            String str = "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received " + types.length;
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
            throw new IllegalArgumentException(str.toString());
        }
        this.options = n.a.C0918a.a("error", "data", "trackingInfo", "trackingPayloads");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "error");
        this.nullableTNullableAnyAdapter = moshi.f(types[0], m11, "data");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableMapOfStringStringAdapter = moshi.f(D.e(Map.class, String.class, String.class), m11, "trackingPayloads");
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(ActionV2Response)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ActionV2Response<T> fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        T t2 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, String> map2 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.nullableStringAdapter.fromJson(reader);
                i11 &= -2;
            } else if (v11 == 1) {
                t2 = this.nullableTNullableAnyAdapter.fromJson(reader);
                i11 &= -3;
            } else if (v11 == 2) {
                map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                i11 &= -5;
            } else if (v11 == 3) {
                map2 = this.nullableMapOfStringStringAdapter.fromJson(reader);
                i11 &= -9;
            }
        }
        reader.endObject();
        if (i11 == -16) {
            Map<String, String> map3 = map2;
            return new ActionV2Response<>(str, t2, map, map3, null, 16, null);
        }
        Map<String, String> map4 = map2;
        Map<String, TokenizedTrackingInfo> map5 = map;
        T t11 = t2;
        String str2 = str;
        Constructor<ActionV2Response<T>> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ActionV2Response.class.getDeclaredConstructor(String.class, Object.class, Map.class, Map.class, MetricsResponse.Metrics.class, Integer.TYPE, c.f34864d);
            Intrinsics.g(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<ru.ozon.app.android.action.v2.models.ActionV2Response<T of ru.ozon.app.android.action.v2.models.ActionV2ResponseJsonAdapter>>");
            this.constructorRef = constructor;
        }
        ActionV2Response<T> newInstance = constructor.newInstance(str2, t11, map5, map4, null, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ActionV2Response<T> value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("error");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getError());
        writer.w("data");
        this.nullableTNullableAnyAdapter.mo44toJson(writer, (x) value.getData());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("trackingPayloads");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value.getTrackingPayloads());
        writer.p();
    }
}
