package ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation.OfflineModelResponse;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponse;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponse;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableDoubleAdapter", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponse$OfflineModelWidget;", "nullableListOfOfflineModelWidgetAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponse$State;", "stateAtEnumNullFallbackAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfflineModelResponseJsonAdapter extends JsonAdapter<OfflineModelResponse> {
    public static final int $stable = 8;
    private volatile Constructor<OfflineModelResponse> constructorRef;

    @NotNull
    private final JsonAdapter<Double> nullableDoubleAdapter;

    @NotNull
    private final JsonAdapter<List<OfflineModelResponse.OfflineModelWidget>> nullableListOfOfflineModelWidgetAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OfflineModelResponse.State> stateAtEnumNullFallbackAdapter;

    public OfflineModelResponseJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("widgetsHash", "cacheLifetime", "widgets", "state");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "widgetsHash");
        this.nullableDoubleAdapter = moshi.f(Double.class, m11, "cacheLifetime");
        this.nullableListOfOfflineModelWidgetAdapter = moshi.f(D.e(List.class, OfflineModelResponse.OfflineModelWidget.class), m11, "widgets");
        this.stateAtEnumNullFallbackAdapter = moshi.f(OfflineModelResponse.State.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation.OfflineModelResponseJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "state");
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(OfflineModelResponse)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OfflineModelResponse fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        Double d11 = null;
        List<OfflineModelResponse.OfflineModelWidget> list = null;
        OfflineModelResponse.State state = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 1) {
                d11 = this.nullableDoubleAdapter.fromJson(reader);
            } else if (v11 == 2) {
                list = this.nullableListOfOfflineModelWidgetAdapter.fromJson(reader);
            } else if (v11 == 3) {
                state = this.stateAtEnumNullFallbackAdapter.fromJson(reader);
                if (state == null) {
                    throw c.q("state", "state", reader);
                }
                i11 = -9;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -9) {
            Intrinsics.g(state, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation.OfflineModelResponse.State");
            return new OfflineModelResponse(str, d11, list, state);
        }
        Constructor<OfflineModelResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = OfflineModelResponse.class.getDeclaredConstructor(String.class, Double.class, List.class, OfflineModelResponse.State.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        OfflineModelResponse newInstance = constructor.newInstance(str, d11, list, state, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OfflineModelResponse value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("widgetsHash");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getWidgetsHash());
        writer.w("cacheLifetime");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value.getCacheLifetime());
        writer.w("widgets");
        this.nullableListOfOfflineModelWidgetAdapter.mo44toJson(writer, (x) value.getWidgets());
        writer.w("state");
        this.stateAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getState());
        writer.p();
    }
}
