package ru.ozon.uni.ozi.atom.models.image;

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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.ozi.atom.models.image.OziImageDTO;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/uni/ozi/atom/models/image/OziImageDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/ozi/atom/models/image/OziImageDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/ozi/atom/models/image/OziImageDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/ozi/atom/models/image/OziImageDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$AspectRatio;", "nullableAspectRatioAdapter", "", "booleanAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$ImageType;", "nullableImageTypeAdapter", "Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$FitType;", "nullableFitTypeAdapter", "Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$CustomRatio;", "nullableCustomRatioAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziImageDTOJsonAdapter extends JsonAdapter<OziImageDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<OziImageDTO> constructorRef;

    @NotNull
    private final JsonAdapter<OziImageDTO.AspectRatio> nullableAspectRatioAdapter;

    @NotNull
    private final JsonAdapter<OziImageDTO.CustomRatio> nullableCustomRatioAdapter;

    @NotNull
    private final JsonAdapter<OziImageDTO.FitType> nullableFitTypeAdapter;

    @NotNull
    private final JsonAdapter<OziImageDTO.ImageType> nullableImageTypeAdapter;

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

    public OziImageDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("image", "backgroundColor", "aspectRatio", "hasParanja", "layoutPaddingLeft", "layoutPaddingRight", "layoutPaddingTop", "layoutPaddingBottom", "cornerRadius", "context", "testInfo", "trackingInfo", "imageWidth", "imageType", "fitType", "customRatio");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "image");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<OziImageDTO.AspectRatio> f11 = moshi.f(OziImageDTO.AspectRatio.class, m11, "aspectRatio");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableAspectRatioAdapter = f11;
        JsonAdapter<Boolean> f12 = moshi.f(Boolean.TYPE, m11, "hasParanja");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.booleanAdapter = f12;
        JsonAdapter<TestInfo> f13 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableTestInfoAdapter = f13;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f14 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f14;
        JsonAdapter<Integer> f15 = moshi.f(Integer.class, m11, "imageWidth");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableIntAdapter = f15;
        JsonAdapter<OziImageDTO.ImageType> f16 = moshi.f(OziImageDTO.ImageType.class, m11, "imageType");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableImageTypeAdapter = f16;
        JsonAdapter<OziImageDTO.FitType> f17 = moshi.f(OziImageDTO.FitType.class, m11, "fitType");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableFitTypeAdapter = f17;
        JsonAdapter<OziImageDTO.CustomRatio> f18 = moshi.f(OziImageDTO.CustomRatio.class, m11, "customRatio");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableCustomRatioAdapter = f18;
    }

    @NotNull
    public String toString() {
        return b.c(33, "GeneratedJsonAdapter(OziImageDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OziImageDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        OziImageDTO.AspectRatio aspectRatio = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        TestInfo testInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Integer num = null;
        OziImageDTO.ImageType imageType = null;
        OziImageDTO.FitType fitType = null;
        OziImageDTO.CustomRatio customRatio = null;
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
                    aspectRatio = this.nullableAspectRatioAdapter.fromJson(reader);
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
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    str8 = this.nullableStringAdapter.fromJson(reader);
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
                    fitType = this.nullableFitTypeAdapter.fromJson(reader);
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
            return new OziImageDTO(str, str2, aspectRatio, bool2.booleanValue(), str3, str4, str5, str6, str7, str8, testInfo, map, num, imageType, fitType, customRatio);
        }
        Constructor<OziImageDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = OziImageDTO.class.getDeclaredConstructor(String.class, String.class, OziImageDTO.AspectRatio.class, Boolean.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, TestInfo.class, Map.class, Integer.class, OziImageDTO.ImageType.class, OziImageDTO.FitType.class, OziImageDTO.CustomRatio.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        OziImageDTO newInstance = constructor.newInstance(str, str2, aspectRatio, bool2, str3, str4, str5, str6, str7, str8, testInfo, map, num, imageType, fitType, customRatio, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OziImageDTO value_) {
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
        this.nullableAspectRatioAdapter.mo44toJson(writer, (x) value_.getAspectRatio());
        writer.w("hasParanja");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getHasParanja()));
        writer.w("layoutPaddingLeft");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLayoutPaddingLeft());
        writer.w("layoutPaddingRight");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLayoutPaddingRight());
        writer.w("layoutPaddingTop");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLayoutPaddingTop());
        writer.w("layoutPaddingBottom");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLayoutPaddingBottom());
        writer.w("cornerRadius");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCornerRadius());
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
        this.nullableFitTypeAdapter.mo44toJson(writer, (x) value_.getFitType());
        writer.w("customRatio");
        this.nullableCustomRatioAdapter.mo44toJson(writer, (x) value_.getCustomRatio());
        writer.p();
    }
}
