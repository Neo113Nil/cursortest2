package ru.ozon.app.android.travel.data.storage.offline;

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

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidgetsStateDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidgetsStateDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidgetsStateDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidgetsStateDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidget;", "listOfOfflineTravelWidgetAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OfflineTravelWidgetsStateDTOJsonAdapter extends JsonAdapter<OfflineTravelWidgetsStateDTO> {
    private volatile Constructor<OfflineTravelWidgetsStateDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<OfflineTravelWidget>> listOfOfflineTravelWidgetAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final n.a options;

    public OfflineTravelWidgetsStateDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("cacheLifetimeLimitInMillis", "widgets", "created");
        M m11 = M.f71699a;
        this.longAdapter = moshi.f(Long.TYPE, m11, "cacheLifetimeLimitInMillis");
        this.listOfOfflineTravelWidgetAdapter = moshi.f(D.e(List.class, OfflineTravelWidget.class), m11, "widgets");
    }

    @NotNull
    public String toString() {
        return b.c(50, "GeneratedJsonAdapter(OfflineTravelWidgetsStateDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OfflineTravelWidgetsStateDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Long l11 = 0L;
        reader.beginObject();
        Long l12 = null;
        List<OfflineTravelWidget> list = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                l12 = this.longAdapter.fromJson(reader);
                if (l12 == null) {
                    throw c.q("cacheLifetimeLimitInMillis", "cacheLifetimeLimitInMillis", reader);
                }
            } else if (v11 == 1) {
                list = this.listOfOfflineTravelWidgetAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("widgets", "widgets", reader);
                }
            } else if (v11 == 2) {
                l11 = this.longAdapter.fromJson(reader);
                if (l11 == null) {
                    throw c.q("created", "created", reader);
                }
                i11 = -5;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -5) {
            if (l12 == null) {
                throw c.j("cacheLifetimeLimitInMillis", "cacheLifetimeLimitInMillis", reader);
            }
            long longValue = l12.longValue();
            if (list != null) {
                return new OfflineTravelWidgetsStateDTO(longValue, list, l11.longValue());
            }
            throw c.j("widgets", "widgets", reader);
        }
        Constructor<OfflineTravelWidgetsStateDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Long.TYPE;
            constructor = OfflineTravelWidgetsStateDTO.class.getDeclaredConstructor(cls2, List.class, cls2, Integer.TYPE, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (l12 == null) {
            throw c.j("cacheLifetimeLimitInMillis", "cacheLifetimeLimitInMillis", reader);
        }
        if (list == null) {
            throw c.j("widgets", "widgets", reader);
        }
        OfflineTravelWidgetsStateDTO newInstance = constructor.newInstance(l12, list, l11, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OfflineTravelWidgetsStateDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("cacheLifetimeLimitInMillis");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getCacheLifetimeLimitInMillis()));
        writer.w("widgets");
        this.listOfOfflineTravelWidgetAdapter.mo44toJson(writer, (x) value.getWidgets());
        writer.w("created");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getCreated()));
        writer.p();
    }
}
