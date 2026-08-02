package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data;

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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data.TravelPersonalAccountReplenishmentResponse;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentResponse_SumJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentResponse$Sum;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentResponse$Sum;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentResponse$Sum;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "listOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelPersonalAccountReplenishmentResponse_SumJsonAdapter extends JsonAdapter<TravelPersonalAccountReplenishmentResponse.Sum> {
    public static final int $stable = 8;
    private volatile Constructor<TravelPersonalAccountReplenishmentResponse.Sum> constructorRef;

    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;

    @NotNull
    private final n.a options;

    public TravelPersonalAccountReplenishmentResponse_SumJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("errors");
        this.listOfStringAdapter = moshi.f(D.e(List.class, String.class), M.f71699a, "errors");
    }

    @NotNull
    public String toString() {
        return b.c(68, "GeneratedJsonAdapter(TravelPersonalAccountReplenishmentResponse.Sum)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelPersonalAccountReplenishmentResponse.Sum fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<String> list = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfStringAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("errors", "errors", reader);
                }
                i11 = -2;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -2) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new TravelPersonalAccountReplenishmentResponse.Sum(list);
        }
        Constructor<TravelPersonalAccountReplenishmentResponse.Sum> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TravelPersonalAccountReplenishmentResponse.Sum.class.getDeclaredConstructor(List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        TravelPersonalAccountReplenishmentResponse.Sum newInstance = constructor.newInstance(list, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelPersonalAccountReplenishmentResponse.Sum value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("errors");
        this.listOfStringAdapter.mo44toJson(writer, (x) value.getErrors());
        writer.p();
    }
}
