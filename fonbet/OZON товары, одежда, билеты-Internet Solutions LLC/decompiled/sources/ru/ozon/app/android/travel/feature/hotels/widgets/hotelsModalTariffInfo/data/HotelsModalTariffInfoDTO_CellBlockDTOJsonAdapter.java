package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.data;

import B0.A0;
import C.C2702w;
import Fj.c;
import N3.C3660k;
import Y9.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import ed.C6345a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.data.HotelsModalTariffInfoDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO_CellBlockDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO$CellBlockDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO$CellBlockDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO$CellBlockDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAtEnumNullFallbackAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO$ElementMargins;", "elementMarginsAdapter", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "listOfCellDTOAtProtoOneOfAtProtoOneOfSignatureAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsModalTariffInfoDTO_CellBlockDTOJsonAdapter extends JsonAdapter<HotelsModalTariffInfoDTO.CellBlockDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<HotelsModalTariffInfoDTO.CellBlockDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<HotelsModalTariffInfoDTO.ElementMargins> elementMarginsAdapter;

    @NotNull
    private final JsonAdapter<List<CellDTO>> listOfCellDTOAtProtoOneOfAtProtoOneOfSignatureAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    public HotelsModalTariffInfoDTO_CellBlockDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "backgroundColor", "cornerRadius", "margins", "cells", "enableHtmlTags");
        M m11 = M.f71699a;
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.cornerRadiusAtEnumNullFallbackAdapter = moshi.f(CornerRadius.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.data.HotelsModalTariffInfoDTO_CellBlockDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "cornerRadius");
        this.elementMarginsAdapter = moshi.f(HotelsModalTariffInfoDTO.ElementMargins.class, m11, "margins");
        b e11 = D.e(List.class, CellDTO.class);
        final String str = "type";
        ProtoOneOf protoOneOf = new ProtoOneOf(str) { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.data.HotelsModalTariffInfoDTO_CellBlockDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOf$0
            private final /* synthetic */ String label;

            {
                Intrinsics.checkNotNullParameter(str, "label");
                this.label = str;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOf.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof ProtoOneOf) && Intrinsics.d(label(), ((ProtoOneOf) obj).label());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return this.label.hashCode() ^ 161479436;
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf
            public final /* synthetic */ String label() {
                return this.label;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return A0.b("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf(label=", this.label, ")");
            }
        };
        final d b11 = N.b(CellDTO.class);
        final String str2 = "dsCell";
        final String str3 = "";
        Annotation[] elements = {protoOneOf, new ProtoOneOfSignature(str2, str3, b11) { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.data.HotelsModalTariffInfoDTO_CellBlockDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str2, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b11, "type");
                this.name = str2;
                this.fieldName = str3;
                this.type = C6345a.b(b11);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature.name()) && Intrinsics.d(fieldName(), protoOneOfSignature.fieldName()) && C2702w.f(protoOneOfSignature, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str4 = this.name;
                String str5 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str4, ", fieldName=", str5, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        }};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.listOfCellDTOAtProtoOneOfAtProtoOneOfSignatureAdapter = moshi.f(e11, C7705l.j0(elements), "cells");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "enableHtmlTags");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(59, "GeneratedJsonAdapter(HotelsModalTariffInfoDTO.CellBlockDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsModalTariffInfoDTO.CellBlockDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        TextDTO textDTO = null;
        Boolean bool2 = bool;
        TextDTO textDTO2 = null;
        CornerRadius cornerRadius = null;
        HotelsModalTariffInfoDTO.ElementMargins elementMargins = null;
        List<CellDTO> list = null;
        int i11 = -1;
        String str = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    cornerRadius = this.cornerRadiusAtEnumNullFallbackAdapter.fromJson(reader);
                    if (cornerRadius == null) {
                        throw Y9.c.q("cornerRadius", "cornerRadius", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    elementMargins = this.elementMarginsAdapter.fromJson(reader);
                    if (elementMargins == null) {
                        throw Y9.c.q("margins", "margins", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    list = this.listOfCellDTOAtProtoOneOfAtProtoOneOfSignatureAdapter.fromJson(reader);
                    if (list == null) {
                        throw Y9.c.q("cells", "cells", reader);
                    }
                    break;
                case 6:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw Y9.c.q("enableHtmlTags", "enableHtmlTags", reader);
                    }
                    i11 &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -89) {
            Intrinsics.g(cornerRadius, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.CornerRadius");
            Intrinsics.g(elementMargins, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.data.HotelsModalTariffInfoDTO.ElementMargins");
            if (list != null) {
                return new HotelsModalTariffInfoDTO.CellBlockDTO(textDTO2, textDTO, str, cornerRadius, elementMargins, list, bool2.booleanValue());
            }
            throw Y9.c.j("cells", "cells", reader);
        }
        Constructor<HotelsModalTariffInfoDTO.CellBlockDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HotelsModalTariffInfoDTO.CellBlockDTO.class.getDeclaredConstructor(TextDTO.class, TextDTO.class, String.class, CornerRadius.class, HotelsModalTariffInfoDTO.ElementMargins.class, List.class, Boolean.TYPE, Integer.TYPE, Y9.c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list == null) {
            throw Y9.c.j("cells", "cells", reader);
        }
        HotelsModalTariffInfoDTO.CellBlockDTO newInstance = constructor.newInstance(textDTO2, textDTO, str, cornerRadius, elementMargins, list, bool2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsModalTariffInfoDTO.CellBlockDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("cornerRadius");
        this.cornerRadiusAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.w("margins");
        this.elementMarginsAdapter.mo44toJson(writer, (x) value.getMargins());
        writer.w("cells");
        this.listOfCellDTOAtProtoOneOfAtProtoOneOfSignatureAdapter.mo44toJson(writer, (x) value.getCells());
        writer.w("enableHtmlTags");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getEnableHtmlTags()));
        writer.p();
    }
}
