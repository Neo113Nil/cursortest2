package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data;

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
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5DTO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR(\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001aR\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001aR\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001aR\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO;", "listOfHotelItemDTOAtJsonCollectionDecodingAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "nullableNotificationWithIconAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "nullableEmptyStateDTOAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$AsyncBehaviorType;", "asyncBehaviorTypeAdapter", "", "nullableMapOfStringStringAdapter", "", "nullableListOfDoubleAdapter", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "nullableOnBoardingDTOAdapter", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "nullableNotificationDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5DTOJsonAdapter extends JsonAdapter<HotelsSearchResultsV5DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<HotelsSearchResultsV5DTO.AsyncBehaviorType> asyncBehaviorTypeAdapter;
    private volatile Constructor<HotelsSearchResultsV5DTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<HotelsSearchResultsV5DTO.HotelItemDTO>> listOfHotelItemDTOAtJsonCollectionDecodingAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<EmptyStateDTO> nullableEmptyStateDTOAdapter;

    @NotNull
    private final JsonAdapter<List<Double>> nullableListOfDoubleAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<NotificationDTO> nullableNotificationDTOAdapter;

    @NotNull
    private final JsonAdapter<NotificationAtom.NotificationWithIcon> nullableNotificationWithIconAdapter;

    @NotNull
    private final JsonAdapter<OnBoardingDTO> nullableOnBoardingDTOAdapter;

    @NotNull
    private final n.a options;

    public HotelsSearchResultsV5DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("hotels", "errorNotification", "refreshAction", "asyncErrorMessage", "asyncBehaviorType", "asyncParams", "locationPoint", "onboardingApp", "refreshNotificationBar");
        this.listOfHotelItemDTOAtJsonCollectionDecodingAdapter = moshi.f(D.e(List.class, HotelsSearchResultsV5DTO.HotelItemDTO.class), e0.h(new JsonCollectionDecoding() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5DTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_collection_JsonCollectionDecoding$0
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
        }), "hotels");
        M m11 = M.f71699a;
        this.nullableNotificationWithIconAdapter = moshi.f(NotificationAtom.NotificationWithIcon.class, m11, "errorNotification");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "refreshAction");
        this.nullableEmptyStateDTOAdapter = moshi.f(EmptyStateDTO.class, m11, "asyncErrorMessage");
        this.asyncBehaviorTypeAdapter = moshi.f(HotelsSearchResultsV5DTO.AsyncBehaviorType.class, m11, "asyncBehaviorType");
        this.nullableMapOfStringStringAdapter = moshi.f(D.e(Map.class, String.class, String.class), m11, "asyncParams");
        this.nullableListOfDoubleAdapter = moshi.f(D.e(List.class, Double.class), m11, "locationPoint");
        this.nullableOnBoardingDTOAdapter = moshi.f(OnBoardingDTO.class, m11, "onboardingApp");
        this.nullableNotificationDTOAdapter = moshi.f(NotificationDTO.class, m11, "refreshNotificationBar");
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(HotelsSearchResultsV5DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsSearchResultsV5DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        List<HotelsSearchResultsV5DTO.HotelItemDTO> list = null;
        NotificationAtom.NotificationWithIcon notificationWithIcon = null;
        AtomActionDTO atomActionDTO = null;
        EmptyStateDTO emptyStateDTO = null;
        HotelsSearchResultsV5DTO.AsyncBehaviorType asyncBehaviorType = null;
        Map<String, String> map = null;
        List<Double> list2 = null;
        OnBoardingDTO onBoardingDTO = null;
        NotificationDTO notificationDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfHotelItemDTOAtJsonCollectionDecodingAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("hotels", "hotels", reader);
                    }
                    i11 = -2;
                    break;
                case 1:
                    notificationWithIcon = this.nullableNotificationWithIconAdapter.fromJson(reader);
                    break;
                case 2:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    emptyStateDTO = this.nullableEmptyStateDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    asyncBehaviorType = this.asyncBehaviorTypeAdapter.fromJson(reader);
                    if (asyncBehaviorType == null) {
                        throw c.q("asyncBehaviorType", "asyncBehaviorType", reader);
                    }
                    break;
                case 5:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    break;
                case 6:
                    list2 = this.nullableListOfDoubleAdapter.fromJson(reader);
                    break;
                case 7:
                    onBoardingDTO = this.nullableOnBoardingDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    notificationDTO = this.nullableNotificationDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 != -2) {
            Constructor<HotelsSearchResultsV5DTO> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = HotelsSearchResultsV5DTO.class.getDeclaredConstructor(List.class, NotificationAtom.NotificationWithIcon.class, AtomActionDTO.class, EmptyStateDTO.class, HotelsSearchResultsV5DTO.AsyncBehaviorType.class, Map.class, List.class, OnBoardingDTO.class, NotificationDTO.class, Integer.TYPE, c.f34864d);
                this.constructorRef = constructor;
                Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
            }
            if (asyncBehaviorType == null) {
                throw c.j("asyncBehaviorType", "asyncBehaviorType", reader);
            }
            HotelsSearchResultsV5DTO newInstance = constructor.newInstance(list, notificationWithIcon, atomActionDTO, emptyStateDTO, asyncBehaviorType, map, list2, onBoardingDTO, notificationDTO, Integer.valueOf(i11), null);
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
            return newInstance;
        }
        Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5DTO.HotelItemDTO>");
        if (asyncBehaviorType == null) {
            throw c.j("asyncBehaviorType", "asyncBehaviorType", reader);
        }
        NotificationDTO notificationDTO2 = notificationDTO;
        OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
        List<Double> list3 = list2;
        Map<String, String> map2 = map;
        HotelsSearchResultsV5DTO.AsyncBehaviorType asyncBehaviorType2 = asyncBehaviorType;
        EmptyStateDTO emptyStateDTO2 = emptyStateDTO;
        return new HotelsSearchResultsV5DTO(list, notificationWithIcon, atomActionDTO, emptyStateDTO2, asyncBehaviorType2, map2, list3, onBoardingDTO2, notificationDTO2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsSearchResultsV5DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("hotels");
        this.listOfHotelItemDTOAtJsonCollectionDecodingAdapter.mo44toJson(writer, (x) value.getHotels());
        writer.w("errorNotification");
        this.nullableNotificationWithIconAdapter.mo44toJson(writer, (x) value.getErrorNotification());
        writer.w("refreshAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getRefreshAction());
        writer.w("asyncErrorMessage");
        this.nullableEmptyStateDTOAdapter.mo44toJson(writer, (x) value.getAsyncErrorMessage());
        writer.w("asyncBehaviorType");
        this.asyncBehaviorTypeAdapter.mo44toJson(writer, (x) value.getAsyncBehaviorType());
        writer.w("asyncParams");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value.getAsyncParams());
        writer.w("locationPoint");
        this.nullableListOfDoubleAdapter.mo44toJson(writer, (x) value.getLocationPoint());
        writer.w("onboardingApp");
        this.nullableOnBoardingDTOAdapter.mo44toJson(writer, (x) value.getOnboardingApp());
        writer.w("refreshNotificationBar");
        this.nullableNotificationDTOAdapter.mo44toJson(writer, (x) value.getRefreshNotificationBar());
        writer.p();
    }
}
