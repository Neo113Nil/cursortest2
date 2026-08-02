package ru.ozon.uni.atoms.data.image;

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
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0018R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/uni/atoms/data/image/ImageDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/image/ImageDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/image/ImageAspectRatio;", "nullableImageAspectRatioAtEnumNullFallbackAdapter", "", "booleanAdapter", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "nullableLayoutPaddingAtEnumNullFallbackAdapter", "Lru/ozon/uni/atoms/data/image/CornerRadius;", "nullableCornerRadiusAtEnumNullFallbackAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/image/ImageDTO$ImageType;", "nullableImageTypeAdapter", "Lru/ozon/uni/atoms/data/image/ImageDTO$FitType;", "nullableFitTypeAtEnumNullFallbackAdapter", "Lru/ozon/uni/atoms/data/image/ImageDTO$CustomRatio;", "nullableCustomRatioAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ImageDTOJsonAdapter extends JsonAdapter<ImageDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ImageDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO.CustomRatio> nullableCustomRatioAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO.FitType> nullableFitTypeAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<ImageAspectRatio> nullableImageAspectRatioAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO.ImageType> nullableImageTypeAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<CommonCellSettings.LayoutPadding> nullableLayoutPaddingAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    public ImageDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("image", "backgroundColor", "aspectRatio", "hasParanja", "layoutPaddingLeft", "layoutPaddingRight", "layoutPaddingTop", "layoutPaddingBottom", "cornerRadius", "context", "testInfo", "trackingInfo", "imageWidth", "imageType", "fitType", "customRatio");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "image");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<ImageAspectRatio> f11 = moshi.f(ImageAspectRatio.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.image.ImageDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "aspectRatio");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableImageAspectRatioAtEnumNullFallbackAdapter = f11;
        JsonAdapter<Boolean> f12 = moshi.f(Boolean.TYPE, m11, "hasParanja");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.booleanAdapter = f12;
        JsonAdapter<CommonCellSettings.LayoutPadding> f13 = moshi.f(CommonCellSettings.LayoutPadding.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.image.ImageDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "layoutPaddingLeft");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter = f13;
        JsonAdapter<CornerRadius> f14 = moshi.f(CornerRadius.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.image.ImageDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableCornerRadiusAtEnumNullFallbackAdapter = f14;
        JsonAdapter<TestInfo> f15 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableTestInfoAdapter = f15;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f16 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f16;
        JsonAdapter<Integer> f17 = moshi.f(Integer.class, m11, "imageWidth");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableIntAdapter = f17;
        JsonAdapter<ImageDTO.ImageType> f18 = moshi.f(ImageDTO.ImageType.class, m11, "imageType");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableImageTypeAdapter = f18;
        JsonAdapter<ImageDTO.FitType> f19 = moshi.f(ImageDTO.FitType.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.image.ImageDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "fitType");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableFitTypeAtEnumNullFallbackAdapter = f19;
        JsonAdapter<ImageDTO.CustomRatio> f21 = moshi.f(ImageDTO.CustomRatio.class, m11, "customRatio");
        Intrinsics.checkNotNullExpressionValue(f21, "adapter(...)");
        this.nullableCustomRatioAdapter = f21;
    }

    @NotNull
    public String toString() {
        return b.c(30, "GeneratedJsonAdapter(ImageDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ImageDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        ImageAspectRatio imageAspectRatio = null;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        CommonCellSettings.LayoutPadding layoutPadding2 = null;
        CommonCellSettings.LayoutPadding layoutPadding3 = null;
        CommonCellSettings.LayoutPadding layoutPadding4 = null;
        CornerRadius cornerRadius = null;
        String str3 = null;
        TestInfo testInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Integer num = null;
        ImageDTO.ImageType imageType = null;
        ImageDTO.FitType fitType = null;
        ImageDTO.CustomRatio customRatio = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    imageAspectRatio = this.nullableImageAspectRatioAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("hasParanja", "hasParanja", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    layoutPadding = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    layoutPadding2 = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    layoutPadding3 = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    layoutPadding4 = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    cornerRadius = this.nullableCornerRadiusAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
                case 10:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
                case 12:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -4097;
                    break;
                case 13:
                    imageType = this.nullableImageTypeAdapter.fromJson(reader);
                    i11 &= -8193;
                    break;
                case 14:
                    fitType = this.nullableFitTypeAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -16385;
                    break;
                case 15:
                    customRatio = this.nullableCustomRatioAdapter.fromJson(reader);
                    i11 &= -32769;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -65536) {
            return new ImageDTO(str, str2, imageAspectRatio, bool2.booleanValue(), layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4, cornerRadius, str3, testInfo, map, num, imageType, fitType, customRatio);
        }
        Constructor<ImageDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ImageDTO.class.getDeclaredConstructor(String.class, String.class, ImageAspectRatio.class, Boolean.TYPE, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, CornerRadius.class, String.class, TestInfo.class, Map.class, Integer.class, ImageDTO.ImageType.class, ImageDTO.FitType.class, ImageDTO.CustomRatio.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        ImageDTO newInstance = constructor.newInstance(str, str2, imageAspectRatio, bool2, layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4, cornerRadius, str3, testInfo, map, num, imageType, fitType, customRatio, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ImageDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getImage());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("aspectRatio");
        this.nullableImageAspectRatioAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getAspectRatio());
        writer.w("hasParanja");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getHasParanja()));
        writer.w("layoutPaddingLeft");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getLayoutPaddingLeft());
        writer.w("layoutPaddingRight");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getLayoutPaddingRight());
        writer.w("layoutPaddingTop");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getLayoutPaddingTop());
        writer.w("layoutPaddingBottom");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getLayoutPaddingBottom());
        writer.w("cornerRadius");
        this.nullableCornerRadiusAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getCornerRadius());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("imageWidth");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getImageWidth());
        writer.w("imageType");
        this.nullableImageTypeAdapter.mo44toJson(writer, (x) value_.getImageType());
        writer.w("fitType");
        this.nullableFitTypeAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getFitType());
        writer.w("customRatio");
        this.nullableCustomRatioAdapter.mo44toJson(writer, (x) value_.getCustomRatio());
        writer.p();
    }
}
