package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.data;

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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/data/AdditionalReturnServiceCellDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/data/AdditionalReturnServiceCellDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/data/AdditionalReturnServiceCellDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/data/AdditionalReturnServiceCellDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "commonControlSettingsAdapter", "nullableStringAdapter", "", "booleanAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "nullableMapOfStringStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalReturnServiceCellDTOJsonAdapter extends JsonAdapter<AdditionalReturnServiceCellDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> cellDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> commonControlSettingsAdapter;
    private volatile Constructor<AdditionalReturnServiceCellDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public AdditionalReturnServiceCellDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("returnCell", "infoCell", "clickControl", "backgroundColor", "borderColor", "isCellClickable", "isNotShaded", "viewTracking", "shouldFetchState", "shouldShowSkeleton", "asyncParams");
        M m11 = M.f71699a;
        this.cellDTOAdapter = moshi.f(CellDTO.class, m11, "returnCell");
        this.commonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "clickControl");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isCellClickable");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "viewTracking");
        this.nullableMapOfStringStringAdapter = moshi.f(D.e(Map.class, String.class, String.class), m11, "asyncParams");
    }

    @NotNull
    public String toString() {
        return b.c(52, "GeneratedJsonAdapter(AdditionalReturnServiceCellDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AdditionalReturnServiceCellDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Boolean bool5 = bool4;
        Map<String, String> map = null;
        CellDTO cellDTO = null;
        CellDTO cellDTO2 = null;
        CommonControlSettings commonControlSettings = null;
        String str = null;
        String str2 = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    cellDTO = this.cellDTOAdapter.fromJson(reader);
                    if (cellDTO == null) {
                        throw c.q("returnCell", "returnCell", reader);
                    }
                    break;
                case 1:
                    cellDTO2 = this.cellDTOAdapter.fromJson(reader);
                    if (cellDTO2 == null) {
                        throw c.q("infoCell", "infoCell", reader);
                    }
                    break;
                case 2:
                    commonControlSettings = this.commonControlSettingsAdapter.fromJson(reader);
                    if (commonControlSettings == null) {
                        throw c.q("clickControl", "clickControl", reader);
                    }
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isCellClickable", "isCellClickable", reader);
                    }
                    i11 &= -33;
                    break;
                case 6:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw c.q("isNotShaded", "isNotShaded", reader);
                    }
                    i11 &= -65;
                    break;
                case 7:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 8:
                    bool4 = this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        throw c.q("shouldFetchState", "shouldFetchState", reader);
                    }
                    i11 &= -257;
                    break;
                case 9:
                    bool5 = this.booleanAdapter.fromJson(reader);
                    if (bool5 == null) {
                        throw c.q("shouldShowSkeleton", "shouldShowSkeleton", reader);
                    }
                    i11 &= -513;
                    break;
                case 10:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -865) {
            Map<String, String> map3 = map;
            if (cellDTO == null) {
                throw c.j("returnCell", "returnCell", reader);
            }
            if (cellDTO2 == null) {
                throw c.j("infoCell", "infoCell", reader);
            }
            if (commonControlSettings != null) {
                return new AdditionalReturnServiceCellDTO(cellDTO, cellDTO2, commonControlSettings, str, str2, bool2.booleanValue(), bool3.booleanValue(), map2, bool4.booleanValue(), bool5.booleanValue(), map3);
            }
            throw c.j("clickControl", "clickControl", reader);
        }
        Map<String, String> map4 = map;
        Constructor<AdditionalReturnServiceCellDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Boolean.TYPE;
            constructor = AdditionalReturnServiceCellDTO.class.getDeclaredConstructor(CellDTO.class, CellDTO.class, CommonControlSettings.class, String.class, String.class, cls2, cls2, Map.class, cls2, cls2, Map.class, Integer.TYPE, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (cellDTO == null) {
            throw c.j("returnCell", "returnCell", reader);
        }
        if (cellDTO2 == null) {
            throw c.j("infoCell", "infoCell", reader);
        }
        if (commonControlSettings == null) {
            throw c.j("clickControl", "clickControl", reader);
        }
        AdditionalReturnServiceCellDTO newInstance = constructor.newInstance(cellDTO, cellDTO2, commonControlSettings, str, str2, bool2, bool3, map2, bool4, bool5, map4, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AdditionalReturnServiceCellDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("returnCell");
        this.cellDTOAdapter.mo44toJson(writer, (x) value.getReturnCell());
        writer.w("infoCell");
        this.cellDTOAdapter.mo44toJson(writer, (x) value.getInfoCell());
        writer.w("clickControl");
        this.commonControlSettingsAdapter.mo44toJson(writer, (x) value.getClickControl());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("isCellClickable");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isCellClickable()));
        writer.w("isNotShaded");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isNotShaded()));
        writer.w("viewTracking");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getViewTracking());
        writer.w("shouldFetchState");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShouldFetchState()));
        writer.w("shouldShowSkeleton");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShouldShowSkeleton()));
        writer.w("asyncParams");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value.getAsyncParams());
        writer.p();
    }
}
