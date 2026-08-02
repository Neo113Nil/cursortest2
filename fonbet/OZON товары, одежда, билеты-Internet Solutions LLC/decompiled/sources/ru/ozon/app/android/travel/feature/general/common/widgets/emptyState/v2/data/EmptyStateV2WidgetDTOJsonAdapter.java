package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.data;

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
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.data.EmptyStateV2WidgetDTO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v2.EmptyStateV2DTO;
import ru.ozon.app.android.travel.molecules.dto.quickFiltersRowList.QuickFiltersRowListDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v2/EmptyStateV2DTO;", "emptyStateV2DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/quickFiltersRowList/QuickFiltersRowListDTO;", "nullableQuickFiltersRowListDTOAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO$WidgetAppearance;", "widgetAppearanceAtEnumNullFallbackAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO$ButtonsPosition;", "nullableButtonsPositionAtEnumNullFallbackAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyStateV2WidgetDTOJsonAdapter extends JsonAdapter<EmptyStateV2WidgetDTO> {
    public static final int $stable = 8;
    private volatile Constructor<EmptyStateV2WidgetDTO> constructorRef;

    @NotNull
    private final JsonAdapter<EmptyStateV2DTO> emptyStateV2DTOAdapter;

    @NotNull
    private final JsonAdapter<EmptyStateV2WidgetDTO.ButtonsPosition> nullableButtonsPositionAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<QuickFiltersRowListDTO> nullableQuickFiltersRowListDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<EmptyStateV2WidgetDTO.WidgetAppearance> widgetAppearanceAtEnumNullFallbackAdapter;

    public EmptyStateV2WidgetDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("emptyState", "filtersBlock", "appearance", "buttonsPosition", "backgroundColor");
        M m11 = M.f71699a;
        this.emptyStateV2DTOAdapter = moshi.f(EmptyStateV2DTO.class, m11, "emptyState");
        this.nullableQuickFiltersRowListDTOAdapter = moshi.f(QuickFiltersRowListDTO.class, m11, "filtersBlock");
        this.widgetAppearanceAtEnumNullFallbackAdapter = moshi.f(EmptyStateV2WidgetDTO.WidgetAppearance.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.data.EmptyStateV2WidgetDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "appearance");
        this.nullableButtonsPositionAtEnumNullFallbackAdapter = moshi.f(EmptyStateV2WidgetDTO.ButtonsPosition.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.data.EmptyStateV2WidgetDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "buttonsPosition");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(EmptyStateV2WidgetDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public EmptyStateV2WidgetDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        EmptyStateV2DTO emptyStateV2DTO = null;
        QuickFiltersRowListDTO quickFiltersRowListDTO = null;
        EmptyStateV2WidgetDTO.WidgetAppearance widgetAppearance = null;
        EmptyStateV2WidgetDTO.ButtonsPosition buttonsPosition = null;
        String str = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                emptyStateV2DTO = this.emptyStateV2DTOAdapter.fromJson(reader);
                if (emptyStateV2DTO == null) {
                    throw c.q("emptyState", "emptyState", reader);
                }
            } else if (v11 == 1) {
                quickFiltersRowListDTO = this.nullableQuickFiltersRowListDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                widgetAppearance = this.widgetAppearanceAtEnumNullFallbackAdapter.fromJson(reader);
                if (widgetAppearance == null) {
                    throw c.q("appearance", "appearance", reader);
                }
                i11 = -5;
            } else if (v11 == 3) {
                buttonsPosition = this.nullableButtonsPositionAtEnumNullFallbackAdapter.fromJson(reader);
            } else if (v11 == 4) {
                str = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -5) {
            QuickFiltersRowListDTO quickFiltersRowListDTO2 = quickFiltersRowListDTO;
            EmptyStateV2DTO emptyStateV2DTO2 = emptyStateV2DTO;
            if (emptyStateV2DTO2 == null) {
                throw c.j("emptyState", "emptyState", reader);
            }
            Intrinsics.g(widgetAppearance, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.data.EmptyStateV2WidgetDTO.WidgetAppearance");
            return new EmptyStateV2WidgetDTO(emptyStateV2DTO2, quickFiltersRowListDTO2, widgetAppearance, buttonsPosition, str);
        }
        QuickFiltersRowListDTO quickFiltersRowListDTO3 = quickFiltersRowListDTO;
        EmptyStateV2DTO emptyStateV2DTO3 = emptyStateV2DTO;
        Constructor<EmptyStateV2WidgetDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = EmptyStateV2WidgetDTO.class.getDeclaredConstructor(EmptyStateV2DTO.class, QuickFiltersRowListDTO.class, EmptyStateV2WidgetDTO.WidgetAppearance.class, EmptyStateV2WidgetDTO.ButtonsPosition.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<EmptyStateV2WidgetDTO> constructor2 = constructor;
        if (emptyStateV2DTO3 == null) {
            throw c.j("emptyState", "emptyState", reader);
        }
        EmptyStateV2WidgetDTO newInstance = constructor2.newInstance(emptyStateV2DTO3, quickFiltersRowListDTO3, widgetAppearance, buttonsPosition, str, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, EmptyStateV2WidgetDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("emptyState");
        this.emptyStateV2DTOAdapter.mo44toJson(writer, (x) value.getEmptyState());
        writer.w("filtersBlock");
        this.nullableQuickFiltersRowListDTOAdapter.mo44toJson(writer, (x) value.getFiltersBlock());
        writer.w("appearance");
        this.widgetAppearanceAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getAppearance());
        writer.w("buttonsPosition");
        this.nullableButtonsPositionAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getButtonsPosition());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.p();
    }
}
