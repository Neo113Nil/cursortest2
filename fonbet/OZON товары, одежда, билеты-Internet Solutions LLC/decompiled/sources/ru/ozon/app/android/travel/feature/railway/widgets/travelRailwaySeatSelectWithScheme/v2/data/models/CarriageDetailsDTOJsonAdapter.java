package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models;

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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.shiftedPreviewIcons.ShiftedPreviewIconsDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/CarriageDetailsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/CarriageDetailsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/CarriageDetailsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/CarriageDetailsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableListOfIconDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Lru/ozon/app/android/travel/molecules/dto/shiftedPreviewIcons/ShiftedPreviewIconsDTO;", "nullableShiftedPreviewIconsDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "commonControlSettingsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CarriageDetailsDTOJsonAdapter extends JsonAdapter<CarriageDetailsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<BadgeDTO> badgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> commonControlSettingsAdapter;
    private volatile Constructor<CarriageDetailsDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<IconDTO>> nullableListOfIconDTOAdapter;

    @NotNull
    private final JsonAdapter<ShiftedPreviewIconsDTO> nullableShiftedPreviewIconsDTOAdapter;

    @NotNull
    private final n.a options;

    public CarriageDetailsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("servicesIcon", "enableLastIconFade", "shiftedPreviewIcons", "detailsBadge", "common");
        b e11 = D.e(List.class, IconDTO.class);
        M m11 = M.f71699a;
        this.nullableListOfIconDTOAdapter = moshi.f(e11, m11, "servicesIcon");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "enableLastIconFade");
        this.nullableShiftedPreviewIconsDTOAdapter = moshi.f(ShiftedPreviewIconsDTO.class, m11, "shiftedPreviewIcons");
        this.badgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "detailsBadge");
        this.commonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(40, "GeneratedJsonAdapter(CarriageDetailsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CarriageDetailsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        Boolean bool2 = bool;
        List<IconDTO> list = null;
        ShiftedPreviewIconsDTO shiftedPreviewIconsDTO = null;
        BadgeDTO badgeDTO = null;
        CommonControlSettings commonControlSettings = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.nullableListOfIconDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                bool2 = this.booleanAdapter.fromJson(reader);
                if (bool2 == null) {
                    throw c.q("enableLastIconFade", "enableLastIconFade", reader);
                }
                i11 = -3;
            } else if (v11 == 2) {
                shiftedPreviewIconsDTO = this.nullableShiftedPreviewIconsDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                badgeDTO = this.badgeDTOAdapter.fromJson(reader);
                if (badgeDTO == null) {
                    throw c.q("detailsBadge", "detailsBadge", reader);
                }
            } else if (v11 == 4 && (commonControlSettings = this.commonControlSettingsAdapter.fromJson(reader)) == null) {
                throw c.q("common", "common", reader);
            }
        }
        reader.endObject();
        if (i11 == -3) {
            ShiftedPreviewIconsDTO shiftedPreviewIconsDTO2 = shiftedPreviewIconsDTO;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            boolean booleanValue = bool2.booleanValue();
            if (badgeDTO == null) {
                throw c.j("detailsBadge", "detailsBadge", reader);
            }
            if (commonControlSettings2 != null) {
                return new CarriageDetailsDTO(list, booleanValue, shiftedPreviewIconsDTO2, badgeDTO, commonControlSettings2);
            }
            throw c.j("common", "common", reader);
        }
        ShiftedPreviewIconsDTO shiftedPreviewIconsDTO3 = shiftedPreviewIconsDTO;
        CommonControlSettings commonControlSettings3 = commonControlSettings;
        Constructor<CarriageDetailsDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CarriageDetailsDTO.class.getDeclaredConstructor(List.class, Boolean.TYPE, ShiftedPreviewIconsDTO.class, BadgeDTO.class, CommonControlSettings.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (badgeDTO == null) {
            throw c.j("detailsBadge", "detailsBadge", reader);
        }
        if (commonControlSettings3 == null) {
            throw c.j("common", "common", reader);
        }
        CarriageDetailsDTO newInstance = constructor.newInstance(list, bool2, shiftedPreviewIconsDTO3, badgeDTO, commonControlSettings3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CarriageDetailsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("servicesIcon");
        this.nullableListOfIconDTOAdapter.mo44toJson(writer, (x) value.getServicesIcon());
        writer.w("enableLastIconFade");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getEnableLastIconFade()));
        writer.w("shiftedPreviewIcons");
        this.nullableShiftedPreviewIconsDTOAdapter.mo44toJson(writer, (x) value.getShiftedPreviewIcons());
        writer.w("detailsBadge");
        this.badgeDTOAdapter.mo44toJson(writer, (x) value.getDetailsBadge());
        writer.w("common");
        this.commonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.p();
    }
}
