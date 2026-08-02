package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v2.data;

import Ak.b;
import B0.A0;
import C.C2702w;
import Fj.c;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import ed.C6345a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v2/data/ButtonWidgetV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v2/data/ButtonWidgetV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v2/data/ButtonWidgetV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v2/data/ButtonWidgetV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/AtomDTO;", "atomDTOAtProtoOneOfAtProtoOneOfSignatureAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/common/Paddings;", "paddingsAtEnumNullFallbackAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAtEnumNullFallbackAdapter", "", "booleanAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonWidgetV2DTOJsonAdapter extends JsonAdapter<ButtonWidgetV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomDTO> atomDTOAtProtoOneOfAtProtoOneOfSignatureAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ButtonWidgetV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Paddings> paddingsAtEnumNullFallbackAdapter;

    public ButtonWidgetV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("button", "topPadding", "bottomPadding", "leftPadding", "rightPadding", "topCornerRadius", "isSticky", "backgroundColor", "borderColor");
        final String str = "type";
        ProtoOneOf protoOneOf = new ProtoOneOf(str) { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v2.data.ButtonWidgetV2DTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOf$0
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
        final d b11 = N.b(ButtonV3DTO.class);
        final String str2 = "";
        final String str3 = "button";
        Annotation[] elements = {protoOneOf, new ProtoOneOfSignature(str3, str2, b11) { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v2.data.ButtonWidgetV2DTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str3, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b11, "type");
                this.name = str3;
                this.fieldName = str2;
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
        this.atomDTOAtProtoOneOfAtProtoOneOfSignatureAdapter = moshi.f(AtomDTO.class, C7705l.j0(elements), "button");
        this.paddingsAtEnumNullFallbackAdapter = moshi.f(Paddings.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v2.data.ButtonWidgetV2DTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "topPadding");
        this.cornerRadiusAtEnumNullFallbackAdapter = moshi.f(CornerRadius.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v2.data.ButtonWidgetV2DTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "topCornerRadius");
        M m11 = M.f71699a;
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSticky");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(ButtonWidgetV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ButtonWidgetV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        Paddings paddings = null;
        Boolean bool2 = bool;
        AtomDTO atomDTO = null;
        Paddings paddings2 = null;
        Paddings paddings3 = null;
        CornerRadius cornerRadius = null;
        String str = null;
        String str2 = null;
        int i11 = -1;
        Paddings paddings4 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    atomDTO = this.atomDTOAtProtoOneOfAtProtoOneOfSignatureAdapter.fromJson(reader);
                    if (atomDTO == null) {
                        throw Y9.c.q("button", "button", reader);
                    }
                    break;
                case 1:
                    paddings = this.paddingsAtEnumNullFallbackAdapter.fromJson(reader);
                    if (paddings == null) {
                        throw Y9.c.q("topPadding", "topPadding", reader);
                    }
                    i11 &= -3;
                    break;
                case 2:
                    paddings4 = this.paddingsAtEnumNullFallbackAdapter.fromJson(reader);
                    if (paddings4 == null) {
                        throw Y9.c.q("bottomPadding", "bottomPadding", reader);
                    }
                    i11 &= -5;
                    break;
                case 3:
                    paddings2 = this.paddingsAtEnumNullFallbackAdapter.fromJson(reader);
                    if (paddings2 == null) {
                        throw Y9.c.q("leftPadding", "leftPadding", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    paddings3 = this.paddingsAtEnumNullFallbackAdapter.fromJson(reader);
                    if (paddings3 == null) {
                        throw Y9.c.q("rightPadding", "rightPadding", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    cornerRadius = this.cornerRadiusAtEnumNullFallbackAdapter.fromJson(reader);
                    if (cornerRadius == null) {
                        throw Y9.c.q("topCornerRadius", "topCornerRadius", reader);
                    }
                    i11 &= -33;
                    break;
                case 6:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw Y9.c.q("isSticky", "isSticky", reader);
                    }
                    i11 &= -65;
                    break;
                case 7:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -127) {
            if (atomDTO == null) {
                throw Y9.c.j("button", "button", reader);
            }
            Intrinsics.g(paddings, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
            Intrinsics.g(paddings4, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
            Intrinsics.g(paddings2, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
            Intrinsics.g(paddings3, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
            Intrinsics.g(cornerRadius, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.CornerRadius");
            return new ButtonWidgetV2DTO(atomDTO, paddings, paddings4, paddings2, paddings3, cornerRadius, bool2.booleanValue(), str, str2);
        }
        Constructor<ButtonWidgetV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ButtonWidgetV2DTO.class.getDeclaredConstructor(AtomDTO.class, Paddings.class, Paddings.class, Paddings.class, Paddings.class, CornerRadius.class, Boolean.TYPE, String.class, String.class, Integer.TYPE, Y9.c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (atomDTO == null) {
            throw Y9.c.j("button", "button", reader);
        }
        String str3 = str;
        String str4 = str2;
        ButtonWidgetV2DTO newInstance = constructor.newInstance(atomDTO, paddings, paddings4, paddings2, paddings3, cornerRadius, bool2, str3, str4, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ButtonWidgetV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("button");
        this.atomDTOAtProtoOneOfAtProtoOneOfSignatureAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("topPadding");
        this.paddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getTopPadding());
        writer.w("bottomPadding");
        this.paddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getBottomPadding());
        writer.w("leftPadding");
        this.paddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getLeftPadding());
        writer.w("rightPadding");
        this.paddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getRightPadding());
        writer.w("topCornerRadius");
        this.cornerRadiusAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getTopCornerRadius());
        writer.w("isSticky");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSticky()));
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.p();
    }
}
