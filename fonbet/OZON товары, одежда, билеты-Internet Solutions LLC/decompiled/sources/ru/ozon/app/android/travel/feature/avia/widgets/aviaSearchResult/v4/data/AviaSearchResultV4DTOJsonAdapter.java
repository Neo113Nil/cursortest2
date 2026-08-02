package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data.AviaSearchResultV4DTO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$AsyncBehaviorType;", "asyncBehaviorTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight;", "nullableListOfFlightAtJsonCollectionDecodingAdapter", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "nullableEmptyStateDTOAdapter", "", "nullableMapOfStringStringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "nullableOnBoardingDTOAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$DirectFlightsSkeletonDTO;", "nullableDirectFlightsSkeletonDTOAdapter", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4DTOJsonAdapter extends JsonAdapter<AviaSearchResultV4DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AviaSearchResultV4DTO.AsyncBehaviorType> asyncBehaviorTypeAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<AviaSearchResultV4DTO.DirectFlightsSkeletonDTO> nullableDirectFlightsSkeletonDTOAdapter;

    @NotNull
    private final JsonAdapter<EmptyStateDTO> nullableEmptyStateDTOAdapter;

    @NotNull
    private final JsonAdapter<List<AviaSearchResultV4DTO.Flight>> nullableListOfFlightAtJsonCollectionDecodingAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<OnBoardingDTO> nullableOnBoardingDTOAdapter;

    @NotNull
    private final n.a options;

    public AviaSearchResultV4DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("asyncBehaviorType", "flights", "asyncErrorMessage", "asyncParams", "refreshAction", "onboardingApp", "directFlightsSkeleton");
        M m11 = M.f71699a;
        this.asyncBehaviorTypeAdapter = moshi.f(AviaSearchResultV4DTO.AsyncBehaviorType.class, m11, "asyncBehaviorType");
        this.nullableListOfFlightAtJsonCollectionDecodingAdapter = moshi.f(D.e(List.class, AviaSearchResultV4DTO.Flight.class), e0.h(new JsonCollectionDecoding() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data.AviaSearchResultV4DTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_collection_JsonCollectionDecoding$0
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
        }), "flights");
        this.nullableEmptyStateDTOAdapter = moshi.f(EmptyStateDTO.class, m11, "asyncErrorMessage");
        this.nullableMapOfStringStringAdapter = moshi.f(D.e(Map.class, String.class, String.class), m11, "asyncParams");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "refreshAction");
        this.nullableOnBoardingDTOAdapter = moshi.f(OnBoardingDTO.class, m11, "onboardingApp");
        this.nullableDirectFlightsSkeletonDTOAdapter = moshi.f(AviaSearchResultV4DTO.DirectFlightsSkeletonDTO.class, m11, "directFlightsSkeleton");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(AviaSearchResultV4DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AviaSearchResultV4DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        AviaSearchResultV4DTO.AsyncBehaviorType asyncBehaviorType = null;
        List<AviaSearchResultV4DTO.Flight> list = null;
        EmptyStateDTO emptyStateDTO = null;
        Map<String, String> map = null;
        AtomActionDTO atomActionDTO = null;
        OnBoardingDTO onBoardingDTO = null;
        TextDTO textDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    asyncBehaviorType = this.asyncBehaviorTypeAdapter.fromJson(reader);
                    if (asyncBehaviorType == null) {
                        throw c.q("asyncBehaviorType", "asyncBehaviorType", reader);
                    }
                    break;
                case 1:
                    list = this.nullableListOfFlightAtJsonCollectionDecodingAdapter.fromJson(reader);
                    break;
                case 2:
                    emptyStateDTO = this.nullableEmptyStateDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    break;
                case 4:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    onBoardingDTO = this.nullableOnBoardingDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    AviaSearchResultV4DTO.DirectFlightsSkeletonDTO fromJson = this.nullableDirectFlightsSkeletonDTOAdapter.fromJson(reader);
                    if (fromJson == null) {
                        textDTO = null;
                        break;
                    } else {
                        textDTO = fromJson.m1072unboximpl();
                        break;
                    }
            }
        }
        reader.endObject();
        if (asyncBehaviorType != null) {
            return new AviaSearchResultV4DTO(asyncBehaviorType, list, emptyStateDTO, map, atomActionDTO, onBoardingDTO, textDTO, null);
        }
        throw c.j("asyncBehaviorType", "asyncBehaviorType", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AviaSearchResultV4DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("asyncBehaviorType");
        this.asyncBehaviorTypeAdapter.mo44toJson(writer, (x) value.getAsyncBehaviorType());
        writer.w("flights");
        this.nullableListOfFlightAtJsonCollectionDecodingAdapter.mo44toJson(writer, (x) value.getFlights());
        writer.w("asyncErrorMessage");
        this.nullableEmptyStateDTOAdapter.mo44toJson(writer, (x) value.getAsyncErrorMessage());
        writer.w("asyncParams");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value.getAsyncParams());
        writer.w("refreshAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getRefreshAction());
        writer.w("onboardingApp");
        this.nullableOnBoardingDTOAdapter.mo44toJson(writer, (x) value.getOnboardingApp());
        writer.w("directFlightsSkeleton");
        JsonAdapter<AviaSearchResultV4DTO.DirectFlightsSkeletonDTO> jsonAdapter = this.nullableDirectFlightsSkeletonDTOAdapter;
        TextDTO m1065getDirectFlightsSkeletonrasF5MU = value.m1065getDirectFlightsSkeletonrasF5MU();
        jsonAdapter.mo44toJson(writer, (x) (m1065getDirectFlightsSkeletonrasF5MU != null ? AviaSearchResultV4DTO.DirectFlightsSkeletonDTO.m1066boximpl(m1065getDirectFlightsSkeletonrasF5MU) : null));
        writer.p();
    }
}
