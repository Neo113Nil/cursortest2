package ru.ozon.uni.atoms.data.icon;

import Ak.b;
import Y9.c;
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
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/uni/atoms/data/icon/IconDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;", "nullableIconSizeAtEnumNullFallbackAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO$IconShape;", "nullableIconShapeAtEnumNullFallbackAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "nullableCommonAtomIconDTOAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO$FitType;", "nullableFitTypeAtEnumNullFallbackAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IconDTOJsonAdapter extends JsonAdapter<IconDTO> {
    public static final int $stable = 8;
    private volatile Constructor<IconDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CommonAtomIconDTO> nullableCommonAtomIconDTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO.FitType> nullableFitTypeAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<IconDTO.IconShape> nullableIconShapeAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<IconDTO.IconSize> nullableIconSizeAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    public IconDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("size", "hasShape", "shape", "text", "icon", "backgroundImage", "backgroundColor", "textColor", "textStyle", "borderColor", "borderWidth", "isBorderInside", "hasParanja", "context", "testInfo", "trackingInfo", "backgroundImageFitType");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        JsonAdapter<IconDTO.IconSize> f7 = moshi.f(IconDTO.IconSize.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.icon.IconDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        this.nullableIconSizeAtEnumNullFallbackAdapter = f7;
        M m11 = M.f71699a;
        JsonAdapter<Boolean> f11 = moshi.f(Boolean.class, m11, "hasShape");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableBooleanAdapter = f11;
        JsonAdapter<IconDTO.IconShape> f12 = moshi.f(IconDTO.IconShape.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.icon.IconDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "shape");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIconShapeAtEnumNullFallbackAdapter = f12;
        JsonAdapter<String> f13 = moshi.f(String.class, m11, "text");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStringAdapter = f13;
        JsonAdapter<CommonAtomIconDTO> f14 = moshi.f(CommonAtomIconDTO.class, m11, "icon");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableCommonAtomIconDTOAdapter = f14;
        JsonAdapter<Integer> f15 = moshi.f(Integer.class, m11, "borderWidth");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableIntAdapter = f15;
        JsonAdapter<TestInfo> f16 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableTestInfoAdapter = f16;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f17 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f17;
        JsonAdapter<IconDTO.FitType> f18 = moshi.f(IconDTO.FitType.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.icon.IconDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "backgroundImageFitType");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableFitTypeAtEnumNullFallbackAdapter = f18;
    }

    @NotNull
    public String toString() {
        return b.c(29, "GeneratedJsonAdapter(IconDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public IconDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        IconDTO.IconSize iconSize = null;
        Boolean bool = null;
        IconDTO.IconShape iconShape = null;
        String str = null;
        CommonAtomIconDTO commonAtomIconDTO = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str7 = null;
        TestInfo testInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        IconDTO.FitType fitType = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    continue;
                case 0:
                    iconSize = this.nullableIconSizeAtEnumNullFallbackAdapter.fromJson(reader);
                    i12 &= -2;
                    continue;
                case 1:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i12 &= -3;
                    continue;
                case 2:
                    iconShape = this.nullableIconShapeAtEnumNullFallbackAdapter.fromJson(reader);
                    i12 &= -5;
                    continue;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -9;
                    continue;
                case 4:
                    commonAtomIconDTO = this.nullableCommonAtomIconDTOAdapter.fromJson(reader);
                    i12 &= -17;
                    continue;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -33;
                    continue;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -65;
                    continue;
                case 7:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -129;
                    continue;
                case 8:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -257;
                    continue;
                case 9:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -513;
                    continue;
                case 10:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i12 &= -1025;
                    continue;
                case 11:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    i12 &= -2049;
                    continue;
                case 12:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    i12 &= -4097;
                    continue;
                case 13:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -8193;
                    continue;
                case 14:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i12 &= -16385;
                    continue;
                case 15:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 = -32769;
                    break;
                case 16:
                    fitType = this.nullableFitTypeAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 = -65537;
                    break;
            }
            i12 &= i11;
        }
        reader.endObject();
        if (i12 == -131072) {
            String str8 = str5;
            String str9 = str4;
            String str10 = str3;
            String str11 = str2;
            CommonAtomIconDTO commonAtomIconDTO2 = commonAtomIconDTO;
            String str12 = str;
            return new IconDTO(iconSize, bool, iconShape, str12, commonAtomIconDTO2, str11, str10, str9, str8, str6, num, bool2, bool3, str7, testInfo, map, fitType);
        }
        String str13 = str5;
        String str14 = str4;
        String str15 = str3;
        String str16 = str2;
        CommonAtomIconDTO commonAtomIconDTO3 = commonAtomIconDTO;
        String str17 = str;
        IconDTO.IconShape iconShape2 = iconShape;
        Boolean bool4 = bool;
        IconDTO.IconSize iconSize2 = iconSize;
        Constructor<IconDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = IconDTO.class.getDeclaredConstructor(IconDTO.IconSize.class, Boolean.class, IconDTO.IconShape.class, String.class, CommonAtomIconDTO.class, String.class, String.class, String.class, String.class, String.class, Integer.class, Boolean.class, Boolean.class, String.class, TestInfo.class, Map.class, IconDTO.FitType.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        IconDTO newInstance = constructor.newInstance(iconSize2, bool4, iconShape2, str17, commonAtomIconDTO3, str16, str15, str14, str13, str6, num, bool2, bool3, str7, testInfo, map, fitType, Integer.valueOf(i12), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, IconDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("size");
        this.nullableIconSizeAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getSize());
        writer.w("hasShape");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getHasShape());
        writer.w("shape");
        this.nullableIconShapeAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getShape());
        writer.w("text");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("icon");
        this.nullableCommonAtomIconDTOAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("backgroundImage");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundImage());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("textColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTextColor());
        writer.w("textStyle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTextStyle());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBorderColor());
        writer.w("borderWidth");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getBorderWidth());
        writer.w("isBorderInside");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isBorderInside());
        writer.w("hasParanja");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getHasParanja());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("backgroundImageFitType");
        this.nullableFitTypeAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getBackgroundImageFitType());
        writer.p();
    }
}
