package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data;

import C.o0;
import Y9.b;
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
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.DistrictsDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/FetchPinsActionResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/FetchPinsActionResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/FetchPinsActionResponse;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/FetchPinsActionResponse;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinDTO;", "listOfPinDTOAtJsonCollectionDecodingAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$Polygon;", "listOfPolygonAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "intAdapter", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "nullableNotificationDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FetchPinsActionResponseJsonAdapter extends JsonAdapter<FetchPinsActionResponse> {
    private volatile Constructor<FetchPinsActionResponse> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<PinDTO>> listOfPinDTOAtJsonCollectionDecodingAdapter;

    @NotNull
    private final JsonAdapter<List<DistrictsDTO.Polygon>> listOfPolygonAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<NotificationDTO> nullableNotificationDTOAdapter;

    @NotNull
    private final n.a options;

    public FetchPinsActionResponseJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("pins", "polygons", "nextAction", "nextFetchInterval", "notification");
        this.listOfPinDTOAtJsonCollectionDecodingAdapter = moshi.f(D.e(List.class, PinDTO.class), e0.h(new JsonCollectionDecoding() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.FetchPinsActionResponseJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_collection_JsonCollectionDecoding$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return JsonCollectionDecoding.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof JsonCollectionDecoding;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding()";
            }
        }), "pins");
        b e11 = D.e(List.class, DistrictsDTO.Polygon.class);
        M m11 = M.f71699a;
        this.listOfPolygonAdapter = moshi.f(e11, m11, "polygons");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "nextAction");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "nextFetchInterval");
        this.nullableNotificationDTOAdapter = moshi.f(NotificationDTO.class, m11, "notification");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FetchPinsActionResponse fromJson(@NotNull n reader) {
        Integer a11 = o0.a(reader, "reader", 0);
        List<PinDTO> list = null;
        List<DistrictsDTO.Polygon> list2 = null;
        AtomActionDTO atomActionDTO = null;
        NotificationDTO notificationDTO = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfPinDTOAtJsonCollectionDecodingAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("pins", "pins", reader);
                }
                i11 &= -2;
            } else if (v11 == 1) {
                list2 = this.listOfPolygonAdapter.fromJson(reader);
                if (list2 == null) {
                    throw c.q("polygons", "polygons", reader);
                }
                i11 &= -3;
            } else if (v11 == 2) {
                atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                a11 = this.intAdapter.fromJson(reader);
                if (a11 == null) {
                    throw c.q("nextFetchInterval", "nextFetchInterval", reader);
                }
                i11 &= -9;
            } else if (v11 == 4) {
                notificationDTO = this.nullableNotificationDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -12) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.PinDTO>");
            Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.hotels.map.shared.data.DistrictsDTO.Polygon>");
            return new FetchPinsActionResponse(list, list2, atomActionDTO, a11.intValue(), notificationDTO);
        }
        Constructor<FetchPinsActionResponse> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = FetchPinsActionResponse.class.getDeclaredConstructor(List.class, List.class, AtomActionDTO.class, cls2, NotificationDTO.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        FetchPinsActionResponse newInstance = constructor.newInstance(list, list2, atomActionDTO, a11, notificationDTO, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(45, "GeneratedJsonAdapter(FetchPinsActionResponse)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FetchPinsActionResponse value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("pins");
        this.listOfPinDTOAtJsonCollectionDecodingAdapter.mo44toJson(writer, (x) value.getPins());
        writer.w("polygons");
        this.listOfPolygonAdapter.mo44toJson(writer, (x) value.getPolygons());
        writer.w("nextAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getNextAction());
        writer.w("nextFetchInterval");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getNextFetchInterval()));
        writer.w("notification");
        this.nullableNotificationDTOAdapter.mo44toJson(writer, (x) value.getNotification());
        writer.p();
    }
}
