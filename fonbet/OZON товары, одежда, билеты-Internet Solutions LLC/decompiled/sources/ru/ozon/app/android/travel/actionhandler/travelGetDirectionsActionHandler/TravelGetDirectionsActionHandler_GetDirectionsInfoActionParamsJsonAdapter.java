package ru.ozon.app.android.travel.actionhandler.travelGetDirectionsActionHandler;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.actionhandler.travelGetDirectionsActionHandler.TravelGetDirectionsActionHandler;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/travelGetDirectionsActionHandler/TravelGetDirectionsActionHandler_GetDirectionsInfoActionParamsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/actionhandler/travelGetDirectionsActionHandler/TravelGetDirectionsActionHandler$GetDirectionsInfoActionParams;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/actionhandler/travelGetDirectionsActionHandler/TravelGetDirectionsActionHandler$GetDirectionsInfoActionParams;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/actionhandler/travelGetDirectionsActionHandler/TravelGetDirectionsActionHandler$GetDirectionsInfoActionParams;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "doubleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelGetDirectionsActionHandler_GetDirectionsInfoActionParamsJsonAdapter extends JsonAdapter<TravelGetDirectionsActionHandler.GetDirectionsInfoActionParams> {
    private volatile Constructor<TravelGetDirectionsActionHandler.GetDirectionsInfoActionParams> constructorRef;

    @NotNull
    private final JsonAdapter<Double> doubleAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public TravelGetDirectionsActionHandler_GetDirectionsInfoActionParamsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("latitude", "longitude", SelectionItemFormDTO.TITLE_FIELD_NAME);
        M m11 = M.f71699a;
        this.doubleAdapter = moshi.f(Double.TYPE, m11, "latitude");
        this.stringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
    }

    @NotNull
    public String toString() {
        return b.c(84, "GeneratedJsonAdapter(TravelGetDirectionsActionHandler.GetDirectionsInfoActionParams)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelGetDirectionsActionHandler.GetDirectionsInfoActionParams fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Double d11 = null;
        Double d12 = null;
        String str = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                d11 = this.doubleAdapter.fromJson(reader);
                if (d11 == null) {
                    throw c.q("latitude", "latitude", reader);
                }
            } else if (v11 == 1) {
                d12 = this.doubleAdapter.fromJson(reader);
                if (d12 == null) {
                    throw c.q("longitude", "longitude", reader);
                }
            } else if (v11 == 2) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                i11 = -5;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -5) {
            if (d11 == null) {
                throw c.j("latitude", "latitude", reader);
            }
            double doubleValue = d11.doubleValue();
            if (d12 == null) {
                throw c.j("longitude", "longitude", reader);
            }
            double doubleValue2 = d12.doubleValue();
            Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
            return new TravelGetDirectionsActionHandler.GetDirectionsInfoActionParams(doubleValue, doubleValue2, str);
        }
        Constructor<TravelGetDirectionsActionHandler.GetDirectionsInfoActionParams> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Double.TYPE;
            constructor = TravelGetDirectionsActionHandler.GetDirectionsInfoActionParams.class.getDeclaredConstructor(cls2, cls2, String.class, Integer.TYPE, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (d11 == null) {
            throw c.j("latitude", "latitude", reader);
        }
        if (d12 == null) {
            throw c.j("longitude", "longitude", reader);
        }
        TravelGetDirectionsActionHandler.GetDirectionsInfoActionParams newInstance = constructor.newInstance(d11, d12, str, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelGetDirectionsActionHandler.GetDirectionsInfoActionParams value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("latitude");
        this.doubleAdapter.mo44toJson(writer, (x) Double.valueOf(value.getLatitude()));
        writer.w("longitude");
        this.doubleAdapter.mo44toJson(writer, (x) Double.valueOf(value.getLongitude()));
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.p();
    }
}
