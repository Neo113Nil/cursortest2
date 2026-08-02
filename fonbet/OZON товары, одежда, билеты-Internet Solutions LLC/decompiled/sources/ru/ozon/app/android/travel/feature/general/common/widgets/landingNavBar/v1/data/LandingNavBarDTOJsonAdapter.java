package ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.data.LandingNavBarDTO;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/data/LandingNavBarDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/data/LandingNavBarDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/data/LandingNavBarDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/data/LandingNavBarDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/data/LandingNavBarDTO$WidgetBackground;", "widgetBackgroundAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "nullableTravelWidgetSettingsDTOAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LandingNavBarDTOJsonAdapter extends JsonAdapter<LandingNavBarDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TravelWidgetSettingsDTO> nullableTravelWidgetSettingsDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<LandingNavBarDTO.WidgetBackground> widgetBackgroundAdapter;

    public LandingNavBarDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("background", "topHeaderSettings", "bottomIslandSettings", "bottomRadius", "trackingInfo");
        M m11 = M.f71699a;
        this.widgetBackgroundAdapter = moshi.f(LandingNavBarDTO.WidgetBackground.class, m11, "background");
        this.nullableTravelWidgetSettingsDTOAdapter = moshi.f(TravelWidgetSettingsDTO.class, m11, "topHeaderSettings");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "bottomRadius");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(LandingNavBarDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public LandingNavBarDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        LandingNavBarDTO.WidgetBackground widgetBackground = null;
        TravelWidgetSettingsDTO travelWidgetSettingsDTO = null;
        TravelWidgetSettingsDTO travelWidgetSettingsDTO2 = null;
        CornerRadius cornerRadius = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                widgetBackground = this.widgetBackgroundAdapter.fromJson(reader);
                if (widgetBackground == null) {
                    throw c.q("background", "background", reader);
                }
            } else if (v11 == 1) {
                travelWidgetSettingsDTO = this.nullableTravelWidgetSettingsDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                travelWidgetSettingsDTO2 = this.nullableTravelWidgetSettingsDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
            } else if (v11 == 4) {
                map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (widgetBackground != null) {
            return new LandingNavBarDTO(widgetBackground, travelWidgetSettingsDTO, travelWidgetSettingsDTO2, cornerRadius, map);
        }
        throw c.j("background", "background", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, LandingNavBarDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("background");
        this.widgetBackgroundAdapter.mo44toJson(writer, (x) value.getBackground());
        writer.w("topHeaderSettings");
        this.nullableTravelWidgetSettingsDTOAdapter.mo44toJson(writer, (x) value.getTopHeaderSettings());
        writer.w("bottomIslandSettings");
        this.nullableTravelWidgetSettingsDTOAdapter.mo44toJson(writer, (x) value.getBottomIslandSettings());
        writer.w("bottomRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getBottomRadius());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
