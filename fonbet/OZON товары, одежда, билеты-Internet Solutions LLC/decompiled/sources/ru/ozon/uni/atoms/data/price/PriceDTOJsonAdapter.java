package ru.ozon.uni.atoms.data.price;

import Y9.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR(\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001aR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001aR\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/uni/atoms/data/price/PriceDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/price/PriceDTO$Component;", "listOfComponentAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/price/PriceDTO$PriceStyle;", "priceStyleAdapter", "Lru/ozon/uni/atoms/data/price/PriceDTO$Preset;", "presetAdapter", "Lru/ozon/uni/atoms/data/common/Paddings;", "nullablePaddingsAtEnumNullFallbackAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PriceDTOJsonAdapter extends JsonAdapter<PriceDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<PriceDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<PriceDTO.Component>> listOfComponentAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<Paddings> nullablePaddingsAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PriceDTO.Preset> presetAdapter;

    @NotNull
    private final JsonAdapter<PriceDTO.PriceStyle> priceStyleAdapter;

    public PriceDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("price", "discount", "backgroundCapacity", "priceStyle", "preset", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "context", "testInfo", "trackingInfo", "discountColor", "isStrikethroughLineHidden");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        b e11 = D.e(List.class, PriceDTO.Component.class);
        M m11 = M.f71699a;
        JsonAdapter<List<PriceDTO.Component>> f7 = moshi.f(e11, m11, "price");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.listOfComponentAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "discount");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.class, m11, "backgroundCapacity");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
        JsonAdapter<PriceDTO.PriceStyle> f13 = moshi.f(PriceDTO.PriceStyle.class, m11, "priceStyle");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.priceStyleAdapter = f13;
        JsonAdapter<PriceDTO.Preset> f14 = moshi.f(PriceDTO.Preset.class, m11, "preset");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.presetAdapter = f14;
        JsonAdapter<Paddings> f15 = moshi.f(Paddings.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.price.PriceDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "paddingLeft");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullablePaddingsAtEnumNullFallbackAdapter = f15;
        JsonAdapter<TestInfo> f16 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableTestInfoAdapter = f16;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f17 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f17;
        JsonAdapter<Boolean> f18 = moshi.f(Boolean.TYPE, m11, "isStrikethroughLineHidden");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.booleanAdapter = f18;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(30, "GeneratedJsonAdapter(PriceDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PriceDTO fromJson(@NotNull n reader) {
        Integer num;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        String str = null;
        Boolean bool2 = bool;
        List<PriceDTO.Component> list = null;
        PriceDTO.PriceStyle priceStyle = null;
        PriceDTO.Preset preset = null;
        Paddings paddings = null;
        Paddings paddings2 = null;
        Paddings paddings3 = null;
        Paddings paddings4 = null;
        String str2 = null;
        TestInfo testInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        String str3 = null;
        int i11 = -1;
        Integer num2 = null;
        while (true) {
            List<PriceDTO.Component> list2 = list;
            String str4 = str;
            if (!reader.hasNext()) {
                reader.endObject();
                if (i11 == -16359) {
                    if (list2 == null) {
                        throw c.j("price", "price", reader);
                    }
                    if (priceStyle == null) {
                        throw c.j("priceStyle", "priceStyle", reader);
                    }
                    if (preset == null) {
                        throw c.j("preset", "preset", reader);
                    }
                    return new PriceDTO(list2, str4, num2, priceStyle, preset, paddings, paddings2, paddings3, paddings4, str2, testInfo, map, str3, bool2.booleanValue());
                }
                TestInfo testInfo2 = testInfo;
                Constructor<PriceDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    num = num2;
                    constructor = PriceDTO.class.getDeclaredConstructor(List.class, String.class, Integer.class, PriceDTO.PriceStyle.class, PriceDTO.Preset.class, Paddings.class, Paddings.class, Paddings.class, Paddings.class, String.class, TestInfo.class, Map.class, String.class, Boolean.TYPE, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    num = num2;
                }
                if (list2 == null) {
                    throw c.j("price", "price", reader);
                }
                if (priceStyle == null) {
                    throw c.j("priceStyle", "priceStyle", reader);
                }
                if (preset == null) {
                    throw c.j("preset", "preset", reader);
                }
                Paddings paddings5 = paddings4;
                Paddings paddings6 = paddings;
                Integer num3 = num;
                PriceDTO newInstance = constructor.newInstance(list2, str4, num3, priceStyle, preset, paddings6, paddings2, paddings3, paddings5, str2, testInfo2, map, str3, bool2, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    list = list2;
                    str = str4;
                case 0:
                    list = this.listOfComponentAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("price", "price", reader);
                    }
                    str = str4;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -3;
                    list = list2;
                case 2:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -5;
                    list = list2;
                    str = str4;
                case 3:
                    priceStyle = this.priceStyleAdapter.fromJson(reader);
                    if (priceStyle == null) {
                        throw c.q("priceStyle", "priceStyle", reader);
                    }
                    list = list2;
                    str = str4;
                case 4:
                    preset = this.presetAdapter.fromJson(reader);
                    if (preset == null) {
                        throw c.q("preset", "preset", reader);
                    }
                    list = list2;
                    str = str4;
                case 5:
                    paddings = this.nullablePaddingsAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -33;
                    list = list2;
                    str = str4;
                case 6:
                    paddings2 = this.nullablePaddingsAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -65;
                    list = list2;
                    str = str4;
                case 7:
                    paddings3 = this.nullablePaddingsAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -129;
                    list = list2;
                    str = str4;
                case 8:
                    paddings4 = this.nullablePaddingsAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -257;
                    list = list2;
                    str = str4;
                case 9:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -513;
                    list = list2;
                    str = str4;
                case 10:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 &= -1025;
                    list = list2;
                    str = str4;
                case 11:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -2049;
                    list = list2;
                    str = str4;
                case 12:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -4097;
                    list = list2;
                    str = str4;
                case 13:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isStrikethroughLineHidden", "isStrikethroughLineHidden", reader);
                    }
                    i11 &= -8193;
                    list = list2;
                    str = str4;
                default:
                    list = list2;
                    str = str4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PriceDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("price");
        this.listOfComponentAdapter.mo44toJson(writer, (x) value_.getPrice());
        writer.w("discount");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getDiscount());
        writer.w("backgroundCapacity");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getBackgroundCapacity());
        writer.w("priceStyle");
        this.priceStyleAdapter.mo44toJson(writer, (x) value_.getPriceStyle());
        writer.w("preset");
        this.presetAdapter.mo44toJson(writer, (x) value_.getPreset());
        writer.w("paddingLeft");
        this.nullablePaddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getPaddingLeft());
        writer.w("paddingRight");
        this.nullablePaddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getPaddingRight());
        writer.w("paddingTop");
        this.nullablePaddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getPaddingTop());
        writer.w("paddingBottom");
        this.nullablePaddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getPaddingBottom());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("discountColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getDiscountColor());
        writer.w("isStrikethroughLineHidden");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.isStrikethroughLineHidden()));
        writer.p();
    }
}
