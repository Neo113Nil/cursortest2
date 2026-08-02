package ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.data.TimeoutAndActionV2DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO$TimerStartMode;", "timerStartModeAtEnumNullFallbackAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "", "nullableMapOfStringAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimeoutAndActionV2DTOJsonAdapter extends JsonAdapter<TimeoutAndActionV2DTO> {
    public static final int $stable = 8;
    private volatile Constructor<TimeoutAndActionV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TimeoutAndActionV2DTO.TimerStartMode> timerStartModeAtEnumNullFallbackAdapter;

    public TimeoutAndActionV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("timeSeconds", "mode", "pollingDelayMs", "action", "asyncParameters");
        M m11 = M.f71699a;
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "timeSeconds");
        this.timerStartModeAtEnumNullFallbackAdapter = moshi.f(TimeoutAndActionV2DTO.TimerStartMode.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.data.TimeoutAndActionV2DTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return EnumNullFallback.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof EnumNullFallback;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "mode");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringAnyAdapter = moshi.f(D.e(Map.class, String.class, Object.class), m11, "asyncParameters");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(TimeoutAndActionV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TimeoutAndActionV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        TimeoutAndActionV2DTO.TimerStartMode timerStartMode = null;
        Integer num2 = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, Object> map = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                num = this.nullableIntAdapter.fromJson(reader);
            } else if (v11 == 1) {
                timerStartMode = this.timerStartModeAtEnumNullFallbackAdapter.fromJson(reader);
                if (timerStartMode == null) {
                    throw c.q("mode", "mode", reader);
                }
                i11 = -3;
            } else if (v11 == 2) {
                num2 = this.nullableIntAdapter.fromJson(reader);
            } else if (v11 == 3) {
                atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
            } else if (v11 == 4) {
                map = this.nullableMapOfStringAnyAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -3) {
            Intrinsics.g(timerStartMode, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.data.TimeoutAndActionV2DTO.TimerStartMode");
            Map<String, Object> map2 = map;
            return new TimeoutAndActionV2DTO(num, timerStartMode, num2, atomActionDTO, map2);
        }
        Integer num3 = num;
        Constructor<TimeoutAndActionV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TimeoutAndActionV2DTO.class.getDeclaredConstructor(Integer.class, TimeoutAndActionV2DTO.TimerStartMode.class, Integer.class, AtomActionDTO.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        TimeoutAndActionV2DTO newInstance = constructor.newInstance(num3, timerStartMode, num2, atomActionDTO, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TimeoutAndActionV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("timeSeconds");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getTimeSeconds());
        writer.w("mode");
        this.timerStartModeAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getMode());
        writer.w("pollingDelayMs");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getPollingDelayMs());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("asyncParameters");
        this.nullableMapOfStringAnyAdapter.mo44toJson(writer, (x) value.getAsyncParameters());
        writer.p();
    }
}
