package ru.ozon.uni.atoms.data.controls.button;

import Ak.b;
import Y9.c;
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
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "nullableSizesAtEnumNullFallbackAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "nullableStyleTypesAtEnumNullFallbackAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;", "nullableIconButtonShapeAtEnumNullFallbackAdapter", "stringAdapter", "", "nullableBooleanAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$ButtonStyle;", "nullableButtonStyleAtEnumNullFallbackAdapter", "", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IconButtonV3DTOJsonAdapter extends JsonAdapter<IconButtonV3DTO> {
    public static final int $stable = 8;
    private volatile Constructor<IconButtonV3DTO> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO.ButtonStyle> nullableButtonStyleAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO.IconButtonShape> nullableIconButtonShapeAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO.Sizes> nullableSizesAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO.StyleTypes> nullableStyleTypesAtEnumNullFallbackAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public IconButtonV3DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("size", "styleType", "buttonShape", "icon", "isDisabled", "iconColor", "backgroundColor", "common", "isHoverDisabled", "buttonStyle", "hasStroke", "strokeColor", "strokeWidth", "hoverColor");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        JsonAdapter<IconButtonV3DTO.Sizes> f7 = moshi.f(IconButtonV3DTO.Sizes.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "size");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableSizesAtEnumNullFallbackAdapter = f7;
        JsonAdapter<ButtonV3DTO.StyleTypes> f11 = moshi.f(ButtonV3DTO.StyleTypes.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "styleType");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStyleTypesAtEnumNullFallbackAdapter = f11;
        JsonAdapter<IconButtonV3DTO.IconButtonShape> f12 = moshi.f(IconButtonV3DTO.IconButtonShape.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "buttonShape");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIconButtonShapeAtEnumNullFallbackAdapter = f12;
        M m11 = M.f71699a;
        JsonAdapter<String> f13 = moshi.f(String.class, m11, "icon");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.stringAdapter = f13;
        JsonAdapter<Boolean> f14 = moshi.f(Boolean.class, m11, "isDisabled");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableBooleanAdapter = f14;
        JsonAdapter<String> f15 = moshi.f(String.class, m11, "iconColor");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableStringAdapter = f15;
        JsonAdapter<CommonControlSettings> f16 = moshi.f(CommonControlSettings.class, m11, "common");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableCommonControlSettingsAdapter = f16;
        JsonAdapter<IconButtonV3DTO.ButtonStyle> f17 = moshi.f(IconButtonV3DTO.ButtonStyle.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "buttonStyle");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableButtonStyleAtEnumNullFallbackAdapter = f17;
        JsonAdapter<Integer> f18 = moshi.f(Integer.class, m11, "strokeWidth");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableIntAdapter = f18;
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(IconButtonV3DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public IconButtonV3DTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        IconButtonV3DTO.Sizes sizes = null;
        ButtonV3DTO.StyleTypes styleTypes = null;
        IconButtonV3DTO.IconButtonShape iconButtonShape = null;
        String str = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        CommonControlSettings commonControlSettings = null;
        Boolean bool2 = null;
        IconButtonV3DTO.ButtonStyle buttonStyle = null;
        Boolean bool3 = null;
        String str4 = null;
        Integer num = null;
        String str5 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    sizes = this.nullableSizesAtEnumNullFallbackAdapter.fromJson(reader);
                    i12 &= -2;
                    break;
                case 1:
                    styleTypes = this.nullableStyleTypesAtEnumNullFallbackAdapter.fromJson(reader);
                    i12 &= -3;
                    break;
                case 2:
                    iconButtonShape = this.nullableIconButtonShapeAtEnumNullFallbackAdapter.fromJson(reader);
                    i12 &= -5;
                    break;
                case 3:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("icon", "icon", reader);
                    }
                    break;
                case 4:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i12 &= -17;
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -33;
                    break;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -65;
                    break;
                case 7:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    i12 &= -129;
                    break;
                case 8:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    i12 &= -257;
                    break;
                case 9:
                    buttonStyle = this.nullableButtonStyleAtEnumNullFallbackAdapter.fromJson(reader);
                    i12 &= -513;
                    break;
                case 10:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    i12 &= -1025;
                    break;
                case 11:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -2049;
                    break;
                case 12:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i12 &= -4097;
                    break;
                case 13:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -8193;
                    break;
            }
        }
        reader.endObject();
        if (i12 == -16376) {
            Boolean bool4 = bool2;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            String str6 = str3;
            String str7 = str2;
            Boolean bool5 = bool;
            String str8 = str;
            IconButtonV3DTO.IconButtonShape iconButtonShape2 = iconButtonShape;
            ButtonV3DTO.StyleTypes styleTypes2 = styleTypes;
            IconButtonV3DTO.Sizes sizes2 = sizes;
            if (str8 != null) {
                return new IconButtonV3DTO(sizes2, styleTypes2, iconButtonShape2, str8, bool5, str7, str6, commonControlSettings2, bool4, buttonStyle, bool3, str4, num, str5);
            }
            throw c.j("icon", "icon", reader);
        }
        Boolean bool6 = bool2;
        CommonControlSettings commonControlSettings3 = commonControlSettings;
        String str9 = str3;
        String str10 = str2;
        Boolean bool7 = bool;
        String str11 = str;
        IconButtonV3DTO.IconButtonShape iconButtonShape3 = iconButtonShape;
        ButtonV3DTO.StyleTypes styleTypes3 = styleTypes;
        IconButtonV3DTO.Sizes sizes3 = sizes;
        Constructor<IconButtonV3DTO> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = IconButtonV3DTO.class.getDeclaredConstructor(IconButtonV3DTO.Sizes.class, ButtonV3DTO.StyleTypes.class, IconButtonV3DTO.IconButtonShape.class, String.class, Boolean.class, String.class, String.class, CommonControlSettings.class, Boolean.class, IconButtonV3DTO.ButtonStyle.class, Boolean.class, String.class, Integer.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<IconButtonV3DTO> constructor2 = constructor;
        if (str11 == null) {
            throw c.j("icon", "icon", reader);
        }
        IconButtonV3DTO newInstance = constructor2.newInstance(sizes3, styleTypes3, iconButtonShape3, str11, bool7, str10, str9, commonControlSettings3, bool6, buttonStyle, bool3, str4, num, str5, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, IconButtonV3DTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("size");
        this.nullableSizesAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getSize());
        writer.w("styleType");
        this.nullableStyleTypesAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getStyleType());
        writer.w("buttonShape");
        this.nullableIconButtonShapeAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getButtonShape());
        writer.w("icon");
        this.stringAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("isDisabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isDisabled());
        writer.w("iconColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIconColor());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value_.getCommon());
        writer.w("isHoverDisabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isHoverDisabled());
        writer.w("buttonStyle");
        this.nullableButtonStyleAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getButtonStyle());
        writer.w("hasStroke");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getHasStroke());
        writer.w("strokeColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getStrokeColor());
        writer.w("strokeWidth");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getStrokeWidth());
        writer.w("hoverColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getHoverColor());
        writer.p();
    }
}
