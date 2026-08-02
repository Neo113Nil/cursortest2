package ru.ozon.uni.atoms.data.controls.tag;

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
import ru.ozon.uni.atoms.data.common.Rounds;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO$StyleType;", "nullableStyleTypeAtEnumNullFallbackAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO$Size;", "nullableSizeAtEnumNullFallbackAdapter", "", "nullableBooleanAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "nullableIndicatorDTOAdapter", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;", "nullableCustomTagButtonStyleAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "nullableImageDTOAdapter", "Lru/ozon/uni/atoms/data/common/Rounds;", "nullableRoundsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TagButtonDTOJsonAdapter extends JsonAdapter<TagButtonDTO> {
    public static final int $stable = 8;
    private volatile Constructor<TagButtonDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<TagButtonDTO.CustomTagButtonStyle> nullableCustomTagButtonStyleAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> nullableImageDTOAdapter;

    @NotNull
    private final JsonAdapter<IndicatorDTO> nullableIndicatorDTOAdapter;

    @NotNull
    private final JsonAdapter<Rounds> nullableRoundsAdapter;

    @NotNull
    private final JsonAdapter<TagButtonDTO.Size> nullableSizeAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TagButtonDTO.StyleType> nullableStyleTypeAtEnumNullFallbackAdapter;

    @NotNull
    private final n.a options;

    public TagButtonDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("styleType", "size", "isSelected", "isDisabled", "isClosable", "icon", "text", "indicator", "customDefaultStyle", "customSelectedStyle", "common", "closeControlSettings", "context", "isStateChangeDisabled", "image", "round");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        JsonAdapter<TagButtonDTO.StyleType> f7 = moshi.f(TagButtonDTO.StyleType.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.controls.tag.TagButtonDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStyleTypeAtEnumNullFallbackAdapter = f7;
        JsonAdapter<TagButtonDTO.Size> f11 = moshi.f(TagButtonDTO.Size.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.controls.tag.TagButtonDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableSizeAtEnumNullFallbackAdapter = f11;
        M m11 = M.f71699a;
        JsonAdapter<Boolean> f12 = moshi.f(Boolean.class, m11, "isSelected");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableBooleanAdapter = f12;
        JsonAdapter<String> f13 = moshi.f(String.class, m11, "icon");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStringAdapter = f13;
        JsonAdapter<IndicatorDTO> f14 = moshi.f(IndicatorDTO.class, m11, "indicator");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableIndicatorDTOAdapter = f14;
        JsonAdapter<TagButtonDTO.CustomTagButtonStyle> f15 = moshi.f(TagButtonDTO.CustomTagButtonStyle.class, m11, "customDefaultStyle");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableCustomTagButtonStyleAdapter = f15;
        JsonAdapter<CommonControlSettings> f16 = moshi.f(CommonControlSettings.class, m11, "common");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableCommonControlSettingsAdapter = f16;
        JsonAdapter<ImageDTO> f17 = moshi.f(ImageDTO.class, m11, "image");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableImageDTOAdapter = f17;
        JsonAdapter<Rounds> f18 = moshi.f(Rounds.class, m11, "round");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableRoundsAdapter = f18;
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(TagButtonDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TagButtonDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        TagButtonDTO.StyleType styleType = null;
        TagButtonDTO.Size size = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str = null;
        String str2 = null;
        IndicatorDTO indicatorDTO = null;
        TagButtonDTO.CustomTagButtonStyle customTagButtonStyle = null;
        TagButtonDTO.CustomTagButtonStyle customTagButtonStyle2 = null;
        CommonControlSettings commonControlSettings = null;
        CommonControlSettings commonControlSettings2 = null;
        String str3 = null;
        Boolean bool4 = null;
        ImageDTO imageDTO = null;
        Rounds rounds = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    styleType = this.nullableStyleTypeAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    size = this.nullableSizeAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    indicatorDTO = this.nullableIndicatorDTOAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    customTagButtonStyle = this.nullableCustomTagButtonStyleAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    customTagButtonStyle2 = this.nullableCustomTagButtonStyleAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
                case 10:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    commonControlSettings2 = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
                case 12:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -4097;
                    break;
                case 13:
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -8193;
                    break;
                case 14:
                    imageDTO = this.nullableImageDTOAdapter.fromJson(reader);
                    i11 &= -16385;
                    break;
                case 15:
                    rounds = this.nullableRoundsAdapter.fromJson(reader);
                    i11 &= -32769;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -65536) {
            TagButtonDTO.CustomTagButtonStyle customTagButtonStyle3 = customTagButtonStyle;
            IndicatorDTO indicatorDTO2 = indicatorDTO;
            String str4 = str2;
            String str5 = str;
            Boolean bool5 = bool3;
            Boolean bool6 = bool2;
            return new TagButtonDTO(styleType, size, bool, bool6, bool5, str5, str4, indicatorDTO2, customTagButtonStyle3, customTagButtonStyle2, commonControlSettings, commonControlSettings2, str3, bool4, imageDTO, rounds);
        }
        TagButtonDTO.CustomTagButtonStyle customTagButtonStyle4 = customTagButtonStyle;
        IndicatorDTO indicatorDTO3 = indicatorDTO;
        String str6 = str2;
        String str7 = str;
        Boolean bool7 = bool3;
        Boolean bool8 = bool2;
        Boolean bool9 = bool;
        TagButtonDTO.Size size2 = size;
        TagButtonDTO.StyleType styleType2 = styleType;
        Constructor<TagButtonDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TagButtonDTO.class.getDeclaredConstructor(TagButtonDTO.StyleType.class, TagButtonDTO.Size.class, Boolean.class, Boolean.class, Boolean.class, String.class, String.class, IndicatorDTO.class, TagButtonDTO.CustomTagButtonStyle.class, TagButtonDTO.CustomTagButtonStyle.class, CommonControlSettings.class, CommonControlSettings.class, String.class, Boolean.class, ImageDTO.class, Rounds.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        TagButtonDTO newInstance = constructor.newInstance(styleType2, size2, bool9, bool8, bool7, str7, str6, indicatorDTO3, customTagButtonStyle4, customTagButtonStyle2, commonControlSettings, commonControlSettings2, str3, bool4, imageDTO, rounds, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TagButtonDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("styleType");
        this.nullableStyleTypeAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getStyleType());
        writer.w("size");
        this.nullableSizeAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getSize());
        writer.w("isSelected");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isSelected());
        writer.w("isDisabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isDisabled());
        writer.w("isClosable");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isClosable());
        writer.w("icon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("text");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("indicator");
        this.nullableIndicatorDTOAdapter.mo44toJson(writer, (x) value_.getIndicator());
        writer.w("customDefaultStyle");
        this.nullableCustomTagButtonStyleAdapter.mo44toJson(writer, (x) value_.getCustomDefaultStyle());
        writer.w("customSelectedStyle");
        this.nullableCustomTagButtonStyleAdapter.mo44toJson(writer, (x) value_.getCustomSelectedStyle());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value_.getCommon());
        writer.w("closeControlSettings");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value_.getCloseControlSettings());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("isStateChangeDisabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isStateChangeDisabled());
        writer.w("image");
        this.nullableImageDTOAdapter.mo44toJson(writer, (x) value_.getImage());
        writer.w("round");
        this.nullableRoundsAdapter.mo44toJson(writer, (x) value_.getRound());
        writer.p();
    }
}
