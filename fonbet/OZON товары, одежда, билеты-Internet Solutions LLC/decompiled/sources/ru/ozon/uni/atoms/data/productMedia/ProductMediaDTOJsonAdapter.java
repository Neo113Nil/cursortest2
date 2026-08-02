package ru.ozon.uni.atoms.data.productMedia;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0018R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$Image;", "nullableImageAdapter", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$Width;", "nullableWidthAdapter", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$Ratio;", "nullableRatioAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$Border;", "nullableBorderAdapter", "", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "nullableCommonAtomIconDTOAdapter", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$Label;", "nullableLabelAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProductMediaDTOJsonAdapter extends JsonAdapter<ProductMediaDTO> {
    public static final int $stable = 8;
    private volatile Constructor<ProductMediaDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<ProductMediaDTO.Border> nullableBorderAdapter;

    @NotNull
    private final JsonAdapter<CommonAtomIconDTO> nullableCommonAtomIconDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<ProductMediaDTO.Image> nullableImageAdapter;

    @NotNull
    private final JsonAdapter<ProductMediaDTO.Label> nullableLabelAdapter;

    @NotNull
    private final JsonAdapter<ProductMediaDTO.Ratio> nullableRatioAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<ProductMediaDTO.Width> nullableWidthAdapter;

    @NotNull
    private final n.a options;

    public ProductMediaDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("context", "image", "width", "ratio", "radius", "backgroundColor", "border", "hasParanja", "hasOverlay", "icon", "label", "smallIcon", "smallLabel", "common", "smallIconColor", "smallLabelColor");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "context");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<ProductMediaDTO.Image> f11 = moshi.f(ProductMediaDTO.Image.class, m11, "image");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableImageAdapter = f11;
        JsonAdapter<ProductMediaDTO.Width> f12 = moshi.f(ProductMediaDTO.Width.class, m11, "width");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableWidthAdapter = f12;
        JsonAdapter<ProductMediaDTO.Ratio> f13 = moshi.f(ProductMediaDTO.Ratio.class, m11, "ratio");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableRatioAdapter = f13;
        JsonAdapter<CornerRadius> f14 = moshi.f(CornerRadius.class, m11, "radius");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableCornerRadiusAdapter = f14;
        JsonAdapter<ProductMediaDTO.Border> f15 = moshi.f(ProductMediaDTO.Border.class, m11, "border");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableBorderAdapter = f15;
        JsonAdapter<Boolean> f16 = moshi.f(Boolean.class, m11, "hasParanja");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableBooleanAdapter = f16;
        JsonAdapter<CommonAtomIconDTO> f17 = moshi.f(CommonAtomIconDTO.class, m11, "icon");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableCommonAtomIconDTOAdapter = f17;
        JsonAdapter<ProductMediaDTO.Label> f18 = moshi.f(ProductMediaDTO.Label.class, m11, "label");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableLabelAdapter = f18;
        JsonAdapter<CommonControlSettings> f19 = moshi.f(CommonControlSettings.class, m11, "common");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableCommonControlSettingsAdapter = f19;
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(ProductMediaDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProductMediaDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        ProductMediaDTO.Image image = null;
        ProductMediaDTO.Width width = null;
        ProductMediaDTO.Ratio ratio = null;
        CornerRadius cornerRadius = null;
        String str2 = null;
        ProductMediaDTO.Border border = null;
        Boolean bool = null;
        Boolean bool2 = null;
        CommonAtomIconDTO commonAtomIconDTO = null;
        ProductMediaDTO.Label label = null;
        String str3 = null;
        String str4 = null;
        CommonControlSettings commonControlSettings = null;
        String str5 = null;
        String str6 = null;
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
                    image = this.nullableImageAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    width = this.nullableWidthAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    ratio = this.nullableRatioAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    border = this.nullableBorderAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    commonAtomIconDTO = this.nullableCommonAtomIconDTOAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
                case 10:
                    label = this.nullableLabelAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
                case 12:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -4097;
                    break;
                case 13:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    i11 &= -8193;
                    break;
                case 14:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -16385;
                    break;
                case 15:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -32769;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -65536) {
            Boolean bool3 = bool2;
            Boolean bool4 = bool;
            ProductMediaDTO.Border border2 = border;
            String str7 = str2;
            CornerRadius cornerRadius2 = cornerRadius;
            ProductMediaDTO.Ratio ratio2 = ratio;
            return new ProductMediaDTO(str, image, width, ratio2, cornerRadius2, str7, border2, bool4, bool3, commonAtomIconDTO, label, str3, str4, commonControlSettings, str5, str6);
        }
        Boolean bool5 = bool2;
        Boolean bool6 = bool;
        ProductMediaDTO.Border border3 = border;
        String str8 = str2;
        CornerRadius cornerRadius3 = cornerRadius;
        ProductMediaDTO.Ratio ratio3 = ratio;
        ProductMediaDTO.Width width2 = width;
        ProductMediaDTO.Image image2 = image;
        String str9 = str;
        Constructor<ProductMediaDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ProductMediaDTO.class.getDeclaredConstructor(String.class, ProductMediaDTO.Image.class, ProductMediaDTO.Width.class, ProductMediaDTO.Ratio.class, CornerRadius.class, String.class, ProductMediaDTO.Border.class, Boolean.class, Boolean.class, CommonAtomIconDTO.class, ProductMediaDTO.Label.class, String.class, String.class, CommonControlSettings.class, String.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        ProductMediaDTO newInstance = constructor.newInstance(str9, image2, width2, ratio3, cornerRadius3, str8, border3, bool6, bool5, commonAtomIconDTO, label, str3, str4, commonControlSettings, str5, str6, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProductMediaDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("image");
        this.nullableImageAdapter.mo44toJson(writer, (x) value_.getImage());
        writer.w("width");
        this.nullableWidthAdapter.mo44toJson(writer, (x) value_.getWidth());
        writer.w("ratio");
        this.nullableRatioAdapter.mo44toJson(writer, (x) value_.getRatio());
        writer.w("radius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value_.getRadius());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("border");
        this.nullableBorderAdapter.mo44toJson(writer, (x) value_.getBorder());
        writer.w("hasParanja");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getHasParanja());
        writer.w("hasOverlay");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getHasOverlay());
        writer.w("icon");
        this.nullableCommonAtomIconDTOAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("label");
        this.nullableLabelAdapter.mo44toJson(writer, (x) value_.getLabel());
        writer.w("smallIcon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSmallIcon());
        writer.w("smallLabel");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSmallLabel());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value_.getCommon());
        writer.w("smallIconColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSmallIconColor());
        writer.w("smallLabelColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSmallLabelColor());
        writer.p();
    }
}
