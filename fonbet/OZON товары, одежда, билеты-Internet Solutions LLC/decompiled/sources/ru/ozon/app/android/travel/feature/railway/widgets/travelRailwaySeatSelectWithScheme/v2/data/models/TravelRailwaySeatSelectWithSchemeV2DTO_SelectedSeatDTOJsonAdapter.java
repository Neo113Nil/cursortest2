package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.TravelRailwaySeatSelectWithSchemeV2DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO_SelectedSeatDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SelectedSeatDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SelectedSeatDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SelectedSeatDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$TooltipPosition;", "tooltipPositionAtEnumNullFallbackAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySeatSelectWithSchemeV2DTO_SelectedSeatDTOJsonAdapter extends JsonAdapter<TravelRailwaySeatSelectWithSchemeV2DTO.SelectedSeatDTO> {
    public static final int $stable = 8;
    private volatile Constructor<TravelRailwaySeatSelectWithSchemeV2DTO.SelectedSeatDTO> constructorRef;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TravelRailwaySeatSelectWithSchemeV2DTO.TooltipPosition> tooltipPositionAtEnumNullFallbackAdapter;

    public TravelRailwaySeatSelectWithSchemeV2DTO_SelectedSeatDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("icon", "tooltipTitle", "tooltipDescription", "tooltipPosition");
        M m11 = M.f71699a;
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "icon");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "tooltipTitle");
        this.tooltipPositionAtEnumNullFallbackAdapter = moshi.f(TravelRailwaySeatSelectWithSchemeV2DTO.TooltipPosition.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.TravelRailwaySeatSelectWithSchemeV2DTO_SelectedSeatDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return EnumNullFallback.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof EnumNullFallback;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "tooltipPosition");
    }

    @NotNull
    public String toString() {
        return b.c(76, "GeneratedJsonAdapter(TravelRailwaySeatSelectWithSchemeV2DTO.SelectedSeatDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelRailwaySeatSelectWithSchemeV2DTO.SelectedSeatDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        IconDTO iconDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        TravelRailwaySeatSelectWithSchemeV2DTO.TooltipPosition tooltipPosition = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                iconDTO = this.iconDTOAdapter.fromJson(reader);
                if (iconDTO == null) {
                    throw c.q("icon", "icon", reader);
                }
            } else if (v11 == 1) {
                textDTO = this.nullableTextDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                tooltipPosition = this.tooltipPositionAtEnumNullFallbackAdapter.fromJson(reader);
                if (tooltipPosition == null) {
                    throw c.q("tooltipPosition", "tooltipPosition", reader);
                }
                i11 = -9;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -9) {
            if (iconDTO == null) {
                throw c.j("icon", "icon", reader);
            }
            Intrinsics.g(tooltipPosition, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.TravelRailwaySeatSelectWithSchemeV2DTO.TooltipPosition");
            return new TravelRailwaySeatSelectWithSchemeV2DTO.SelectedSeatDTO(iconDTO, textDTO, textDTO2, tooltipPosition);
        }
        Constructor<TravelRailwaySeatSelectWithSchemeV2DTO.SelectedSeatDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TravelRailwaySeatSelectWithSchemeV2DTO.SelectedSeatDTO.class.getDeclaredConstructor(IconDTO.class, TextDTO.class, TextDTO.class, TravelRailwaySeatSelectWithSchemeV2DTO.TooltipPosition.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (iconDTO == null) {
            throw c.j("icon", "icon", reader);
        }
        TravelRailwaySeatSelectWithSchemeV2DTO.SelectedSeatDTO newInstance = constructor.newInstance(iconDTO, textDTO, textDTO2, tooltipPosition, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelRailwaySeatSelectWithSchemeV2DTO.SelectedSeatDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("icon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("tooltipTitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getTooltipTitle());
        writer.w("tooltipDescription");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getTooltipDescription());
        writer.w("tooltipPosition");
        this.tooltipPositionAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getTooltipPosition());
        writer.p();
    }
}
