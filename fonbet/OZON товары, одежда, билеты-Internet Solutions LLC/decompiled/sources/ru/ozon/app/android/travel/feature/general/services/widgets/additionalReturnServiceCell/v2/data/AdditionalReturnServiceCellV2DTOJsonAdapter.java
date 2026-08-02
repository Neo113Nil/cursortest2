package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.data;

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
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/data/AdditionalReturnServiceCellV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/data/AdditionalReturnServiceCellV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/data/AdditionalReturnServiceCellV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/data/AdditionalReturnServiceCellV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "listOfCellDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "nullableStringAdapter", "", "booleanAdapter", "", "nullableMapOfStringStringAdapter", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalReturnServiceCellV2DTOJsonAdapter extends JsonAdapter<AdditionalReturnServiceCellV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<AdditionalReturnServiceCellV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<CellDTO>> listOfCellDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public AdditionalReturnServiceCellV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("cells", "badge", "backgroundColor", "borderColor", "shouldFetchState", "asyncParams", "shouldShowSkeleton", "showBookingSkeleton", "viewTracking");
        b e11 = D.e(List.class, CellDTO.class);
        M m11 = M.f71699a;
        this.listOfCellDTOAdapter = moshi.f(e11, m11, "cells");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "shouldFetchState");
        this.nullableMapOfStringStringAdapter = moshi.f(D.e(Map.class, String.class, String.class), m11, "asyncParams");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "viewTracking");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(54, "GeneratedJsonAdapter(AdditionalReturnServiceCellV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AdditionalReturnServiceCellV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        List<CellDTO> list = null;
        BadgeDTO badgeDTO = null;
        String str = null;
        String str2 = null;
        Map<String, String> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfCellDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("cells", "cells", reader);
                    }
                    i11 &= -2;
                    break;
                case 1:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("shouldFetchState", "shouldFetchState", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    break;
                case 6:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw c.q("shouldShowSkeleton", "shouldShowSkeleton", reader);
                    }
                    i11 &= -65;
                    break;
                case 7:
                    bool4 = this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        throw c.q("showBookingSkeleton", "showBookingSkeleton", reader);
                    }
                    i11 &= -129;
                    break;
                case 8:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -210) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.dsCell.CellDTO>");
            return new AdditionalReturnServiceCellV2DTO(list, badgeDTO, str, str2, bool2.booleanValue(), map, bool3.booleanValue(), bool4.booleanValue(), map2);
        }
        Constructor<AdditionalReturnServiceCellV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Boolean.TYPE;
            constructor = AdditionalReturnServiceCellV2DTO.class.getDeclaredConstructor(List.class, BadgeDTO.class, String.class, String.class, cls2, Map.class, cls2, cls2, Map.class, Integer.TYPE, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        AdditionalReturnServiceCellV2DTO newInstance = constructor.newInstance(list, badgeDTO, str, str2, bool2, map, bool3, bool4, map2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AdditionalReturnServiceCellV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("cells");
        this.listOfCellDTOAdapter.mo44toJson(writer, (x) value.getCells());
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("shouldFetchState");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShouldFetchState()));
        writer.w("asyncParams");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value.getAsyncParams());
        writer.w("shouldShowSkeleton");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShouldShowSkeleton()));
        writer.w("showBookingSkeleton");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShowBookingSkeleton()));
        writer.w("viewTracking");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getViewTracking());
        writer.p();
    }
}
