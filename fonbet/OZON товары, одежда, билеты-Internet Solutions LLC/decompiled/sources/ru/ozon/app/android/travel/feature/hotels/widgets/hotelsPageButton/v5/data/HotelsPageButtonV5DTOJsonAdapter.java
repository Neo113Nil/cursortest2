package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.data;

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
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.data.HotelsPageButtonV5DTO;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "listOfButtonV3DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "nullableCellDTOAdapter", "", "booleanAdapter", "", "", "nullableMapOfStringAnyAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO$WidgetsBlockAnchors;", "nullableWidgetsBlockAnchorsAdapter", "nullableStringAdapter", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$PaddingsSetting;", "nullablePaddingsSettingAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageButtonV5DTOJsonAdapter extends JsonAdapter<HotelsPageButtonV5DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<HotelsPageButtonV5DTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<ButtonV3DTO>> listOfButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> nullableCellDTOAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;

    @NotNull
    private final JsonAdapter<TravelWidgetSettingsDTO.PaddingsSetting> nullablePaddingsSettingAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<HotelsPageButtonV5DTO.WidgetsBlockAnchors> nullableWidgetsBlockAnchorsAdapter;

    @NotNull
    private final n.a options;

    public HotelsPageButtonV5DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("buttons", "dsCell", "isUpdateRequired", "asyncParameters", "widgetScrollAnchors", "cellScrollAnchors", "backgroundColor", "hasTopBorder", "topCornerRadius", "hasTopShadow", "buttonGroupPaddings");
        b e11 = D.e(List.class, ButtonV3DTO.class);
        M m11 = M.f71699a;
        this.listOfButtonV3DTOAdapter = moshi.f(e11, m11, "buttons");
        this.nullableCellDTOAdapter = moshi.f(CellDTO.class, m11, "dsCell");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isUpdateRequired");
        this.nullableMapOfStringAnyAdapter = moshi.f(D.e(Map.class, String.class, Object.class), m11, "asyncParameters");
        this.nullableWidgetsBlockAnchorsAdapter = moshi.f(HotelsPageButtonV5DTO.WidgetsBlockAnchors.class, m11, "widgetScrollAnchors");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "hasTopBorder");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "topCornerRadius");
        this.nullablePaddingsSettingAdapter = moshi.f(TravelWidgetSettingsDTO.PaddingsSetting.class, m11, "buttonGroupPaddings");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(43, "GeneratedJsonAdapter(HotelsPageButtonV5DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsPageButtonV5DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        List<ButtonV3DTO> list = null;
        CellDTO cellDTO = null;
        Map<String, Object> map = null;
        HotelsPageButtonV5DTO.WidgetsBlockAnchors widgetsBlockAnchors = null;
        HotelsPageButtonV5DTO.WidgetsBlockAnchors widgetsBlockAnchors2 = null;
        String str = null;
        Boolean bool3 = null;
        CornerRadius cornerRadius = null;
        Boolean bool4 = null;
        TravelWidgetSettingsDTO.PaddingsSetting paddingsSetting = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfButtonV3DTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("buttons", "buttons", reader);
                    }
                    i11 &= -2;
                    break;
                case 1:
                    cellDTO = this.nullableCellDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isUpdateRequired", "isUpdateRequired", reader);
                    }
                    i11 &= -5;
                    break;
                case 3:
                    map = this.nullableMapOfStringAnyAdapter.fromJson(reader);
                    break;
                case 4:
                    widgetsBlockAnchors = this.nullableWidgetsBlockAnchorsAdapter.fromJson(reader);
                    break;
                case 5:
                    widgetsBlockAnchors2 = this.nullableWidgetsBlockAnchorsAdapter.fromJson(reader);
                    break;
                case 6:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 8:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
                case 9:
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 10:
                    paddingsSetting = this.nullablePaddingsSettingAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -6) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO>");
            return new HotelsPageButtonV5DTO(list, cellDTO, bool2.booleanValue(), map, widgetsBlockAnchors, widgetsBlockAnchors2, str, bool3, cornerRadius, bool4, paddingsSetting);
        }
        Map<String, Object> map2 = map;
        Constructor<HotelsPageButtonV5DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HotelsPageButtonV5DTO.class.getDeclaredConstructor(List.class, CellDTO.class, Boolean.TYPE, Map.class, HotelsPageButtonV5DTO.WidgetsBlockAnchors.class, HotelsPageButtonV5DTO.WidgetsBlockAnchors.class, String.class, Boolean.class, CornerRadius.class, Boolean.class, TravelWidgetSettingsDTO.PaddingsSetting.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        HotelsPageButtonV5DTO newInstance = constructor.newInstance(list, cellDTO, bool2, map2, widgetsBlockAnchors, widgetsBlockAnchors2, str, bool3, cornerRadius, bool4, paddingsSetting, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsPageButtonV5DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("buttons");
        this.listOfButtonV3DTOAdapter.mo44toJson(writer, (x) value.getButtons());
        writer.w("dsCell");
        this.nullableCellDTOAdapter.mo44toJson(writer, (x) value.getDsCell());
        writer.w("isUpdateRequired");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isUpdateRequired()));
        writer.w("asyncParameters");
        this.nullableMapOfStringAnyAdapter.mo44toJson(writer, (x) value.getAsyncParameters());
        writer.w("widgetScrollAnchors");
        this.nullableWidgetsBlockAnchorsAdapter.mo44toJson(writer, (x) value.getWidgetScrollAnchors());
        writer.w("cellScrollAnchors");
        this.nullableWidgetsBlockAnchorsAdapter.mo44toJson(writer, (x) value.getCellScrollAnchors());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("hasTopBorder");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getHasTopBorder());
        writer.w("topCornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getTopCornerRadius());
        writer.w("hasTopShadow");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getHasTopShadow());
        writer.w("buttonGroupPaddings");
        this.nullablePaddingsSettingAdapter.mo44toJson(writer, (x) value.getButtonGroupPaddings());
        writer.p();
    }
}
