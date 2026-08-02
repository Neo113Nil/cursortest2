package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.data;

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
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.data.PriceCalendarHeaderV3DTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3DTO$FieldDTO;", "fieldDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAtEnumNullFallbackAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceCalendarHeaderV3DTOJsonAdapter extends JsonAdapter<PriceCalendarHeaderV3DTO> {
    public static final int $stable = 8;
    private volatile Constructor<PriceCalendarHeaderV3DTO> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<PriceCalendarHeaderV3DTO.FieldDTO> fieldDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public PriceCalendarHeaderV3DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("startDateField", "returnDateField", "backgroundColor", "bottomRadius", "trackingInfo");
        M m11 = M.f71699a;
        this.fieldDTOAdapter = moshi.f(PriceCalendarHeaderV3DTO.FieldDTO.class, m11, "startDateField");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.cornerRadiusAtEnumNullFallbackAdapter = moshi.f(CornerRadius.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.data.PriceCalendarHeaderV3DTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "bottomRadius");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(PriceCalendarHeaderV3DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PriceCalendarHeaderV3DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        PriceCalendarHeaderV3DTO.FieldDTO fieldDTO = null;
        PriceCalendarHeaderV3DTO.FieldDTO fieldDTO2 = null;
        String str = null;
        CornerRadius cornerRadius = null;
        Map<String, TokenizedTrackingInfo> map = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                fieldDTO = this.fieldDTOAdapter.fromJson(reader);
                if (fieldDTO == null) {
                    throw c.q("startDateField", "startDateField", reader);
                }
            } else if (v11 == 1) {
                fieldDTO2 = this.fieldDTOAdapter.fromJson(reader);
                if (fieldDTO2 == null) {
                    throw c.q("returnDateField", "returnDateField", reader);
                }
            } else if (v11 == 2) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 3) {
                cornerRadius = this.cornerRadiusAtEnumNullFallbackAdapter.fromJson(reader);
                if (cornerRadius == null) {
                    throw c.q("bottomRadius", "bottomRadius", reader);
                }
                i11 = -9;
            } else if (v11 == 4) {
                map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -9) {
            String str2 = str;
            PriceCalendarHeaderV3DTO.FieldDTO fieldDTO3 = fieldDTO2;
            PriceCalendarHeaderV3DTO.FieldDTO fieldDTO4 = fieldDTO;
            if (fieldDTO4 == null) {
                throw c.j("startDateField", "startDateField", reader);
            }
            if (fieldDTO3 == null) {
                throw c.j("returnDateField", "returnDateField", reader);
            }
            Intrinsics.g(cornerRadius, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.CornerRadius");
            return new PriceCalendarHeaderV3DTO(fieldDTO4, fieldDTO3, str2, cornerRadius, map);
        }
        String str3 = str;
        PriceCalendarHeaderV3DTO.FieldDTO fieldDTO5 = fieldDTO2;
        PriceCalendarHeaderV3DTO.FieldDTO fieldDTO6 = fieldDTO;
        Constructor<PriceCalendarHeaderV3DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PriceCalendarHeaderV3DTO.class.getDeclaredConstructor(PriceCalendarHeaderV3DTO.FieldDTO.class, PriceCalendarHeaderV3DTO.FieldDTO.class, String.class, CornerRadius.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<PriceCalendarHeaderV3DTO> constructor2 = constructor;
        if (fieldDTO6 == null) {
            throw c.j("startDateField", "startDateField", reader);
        }
        if (fieldDTO5 == null) {
            throw c.j("returnDateField", "returnDateField", reader);
        }
        PriceCalendarHeaderV3DTO newInstance = constructor2.newInstance(fieldDTO6, fieldDTO5, str3, cornerRadius, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PriceCalendarHeaderV3DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("startDateField");
        this.fieldDTOAdapter.mo44toJson(writer, (x) value.getStartDateField());
        writer.w("returnDateField");
        this.fieldDTOAdapter.mo44toJson(writer, (x) value.getReturnDateField());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("bottomRadius");
        this.cornerRadiusAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getBottomRadius());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
