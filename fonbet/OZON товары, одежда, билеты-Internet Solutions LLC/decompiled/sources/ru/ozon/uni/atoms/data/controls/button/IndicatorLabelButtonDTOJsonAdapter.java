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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IndicatorLabelButtonDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/IndicatorLabelButtonDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/button/IndicatorLabelButtonDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/controls/button/IndicatorLabelButtonDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/controls/button/IndicatorLabelButtonDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/button/IndicatorLabelButtonDTO$Preset;", "nullablePresetAtEnumNullFallbackAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/button/Style;", "nullableStyleAtEnumNullFallbackAdapter", "", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "commonAtomLabelDTOAdapter", "nullableCommonAtomLabelDTOAdapter", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "nullableIndicatorDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IndicatorLabelButtonDTOJsonAdapter extends JsonAdapter<IndicatorLabelButtonDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CommonAtomLabelDTO> commonAtomLabelDTOAdapter;
    private volatile Constructor<IndicatorLabelButtonDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CommonAtomLabelDTO> nullableCommonAtomLabelDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<IndicatorDTO> nullableIndicatorDTOAdapter;

    @NotNull
    private final JsonAdapter<IndicatorLabelButtonDTO.Preset> nullablePresetAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<Style> nullableStyleAtEnumNullFallbackAdapter;

    @NotNull
    private final n.a options;

    public IndicatorLabelButtonDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("preset", "style", "isEnabled", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "indicator", "common");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        JsonAdapter<IndicatorLabelButtonDTO.Preset> f7 = moshi.f(IndicatorLabelButtonDTO.Preset.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.controls.button.IndicatorLabelButtonDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "preset");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullablePresetAtEnumNullFallbackAdapter = f7;
        JsonAdapter<Style> f11 = moshi.f(Style.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.controls.button.IndicatorLabelButtonDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "style");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStyleAtEnumNullFallbackAdapter = f11;
        M m11 = M.f71699a;
        JsonAdapter<Boolean> f12 = moshi.f(Boolean.class, m11, "isEnabled");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableBooleanAdapter = f12;
        JsonAdapter<CommonAtomLabelDTO> f13 = moshi.f(CommonAtomLabelDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.commonAtomLabelDTOAdapter = f13;
        JsonAdapter<CommonAtomLabelDTO> f14 = moshi.f(CommonAtomLabelDTO.class, m11, "subtitle");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableCommonAtomLabelDTOAdapter = f14;
        JsonAdapter<IndicatorDTO> f15 = moshi.f(IndicatorDTO.class, m11, "indicator");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableIndicatorDTOAdapter = f15;
        JsonAdapter<CommonControlSettings> f16 = moshi.f(CommonControlSettings.class, m11, "common");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableCommonControlSettingsAdapter = f16;
    }

    @NotNull
    public String toString() {
        return b.c(45, "GeneratedJsonAdapter(IndicatorLabelButtonDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public IndicatorLabelButtonDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        IndicatorLabelButtonDTO.Preset preset = null;
        Style style = null;
        Boolean bool = null;
        CommonAtomLabelDTO commonAtomLabelDTO = null;
        CommonAtomLabelDTO commonAtomLabelDTO2 = null;
        IndicatorDTO indicatorDTO = null;
        CommonControlSettings commonControlSettings = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    preset = this.nullablePresetAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    style = this.nullableStyleAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    commonAtomLabelDTO = this.commonAtomLabelDTOAdapter.fromJson(reader);
                    if (commonAtomLabelDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 4:
                    commonAtomLabelDTO2 = this.nullableCommonAtomLabelDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    indicatorDTO = this.nullableIndicatorDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -8) {
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            IndicatorDTO indicatorDTO2 = indicatorDTO;
            CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO2;
            CommonAtomLabelDTO commonAtomLabelDTO4 = commonAtomLabelDTO;
            Boolean bool2 = bool;
            Style style2 = style;
            IndicatorLabelButtonDTO.Preset preset2 = preset;
            if (commonAtomLabelDTO4 != null) {
                return new IndicatorLabelButtonDTO(preset2, style2, bool2, commonAtomLabelDTO4, commonAtomLabelDTO3, indicatorDTO2, commonControlSettings2);
            }
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        CommonControlSettings commonControlSettings3 = commonControlSettings;
        IndicatorDTO indicatorDTO3 = indicatorDTO;
        CommonAtomLabelDTO commonAtomLabelDTO5 = commonAtomLabelDTO2;
        CommonAtomLabelDTO commonAtomLabelDTO6 = commonAtomLabelDTO;
        Boolean bool3 = bool;
        Style style3 = style;
        IndicatorLabelButtonDTO.Preset preset3 = preset;
        Constructor<IndicatorLabelButtonDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = IndicatorLabelButtonDTO.class.getDeclaredConstructor(IndicatorLabelButtonDTO.Preset.class, Style.class, Boolean.class, CommonAtomLabelDTO.class, CommonAtomLabelDTO.class, IndicatorDTO.class, CommonControlSettings.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (commonAtomLabelDTO6 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        IndicatorLabelButtonDTO newInstance = constructor.newInstance(preset3, style3, bool3, commonAtomLabelDTO6, commonAtomLabelDTO5, indicatorDTO3, commonControlSettings3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, IndicatorLabelButtonDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("preset");
        this.nullablePresetAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getPreset());
        writer.w("style");
        this.nullableStyleAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getStyle());
        writer.w("isEnabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isEnabled());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.commonAtomLabelDTOAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("subtitle");
        this.nullableCommonAtomLabelDTOAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("indicator");
        this.nullableIndicatorDTOAdapter.mo44toJson(writer, (x) value_.getIndicator());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value_.getCommon());
        writer.p();
    }
}
