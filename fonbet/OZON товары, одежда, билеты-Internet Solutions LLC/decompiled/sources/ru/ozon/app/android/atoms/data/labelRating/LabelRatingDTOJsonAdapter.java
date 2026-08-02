package ru.ozon.app.android.atoms.data.labelRating;

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
import ru.ozon.app.android.atoms.data.AtomActionDTO;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.data.labelRating.LabelRatingDTO;
import ru.ozon.app.android.atoms.data.rating.RatingDTO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/atoms/data/labelRating/LabelRatingDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/labelRating/LabelRatingDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/labelRating/LabelRatingDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/labelRating/LabelRatingDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/data/rating/RatingDTO;", "ratingDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "nullableCommonAtomLabelDTOAdapter", "Lru/ozon/app/android/atoms/data/labelRating/LabelRatingDTO$LabelRatingPreset;", "nullableLabelRatingPresetAdapter", "Lru/ozon/app/android/atoms/data/labelRating/LabelRatingDTO$LabelRatingStyle;", "nullableLabelRatingStyleAdapter", "Lru/ozon/app/android/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "nullableStringAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LabelRatingDTOJsonAdapter extends JsonAdapter<LabelRatingDTO> {
    public static final int $stable = 8;
    private volatile Constructor<LabelRatingDTO> constructorRef;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonAtomLabelDTO> nullableCommonAtomLabelDTOAdapter;

    @NotNull
    private final JsonAdapter<LabelRatingDTO.LabelRatingPreset> nullableLabelRatingPresetAdapter;

    @NotNull
    private final JsonAdapter<LabelRatingDTO.LabelRatingStyle> nullableLabelRatingStyleAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<RatingDTO> ratingDTOAdapter;

    public LabelRatingDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("rating", "label", "preset", "style", "action", "context", "trackingInfo", "testInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<RatingDTO> f7 = moshi.f(RatingDTO.class, m11, "rating");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.ratingDTOAdapter = f7;
        JsonAdapter<CommonAtomLabelDTO> f11 = moshi.f(CommonAtomLabelDTO.class, m11, "label");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableCommonAtomLabelDTOAdapter = f11;
        JsonAdapter<LabelRatingDTO.LabelRatingPreset> f12 = moshi.f(LabelRatingDTO.LabelRatingPreset.class, m11, "preset");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableLabelRatingPresetAdapter = f12;
        JsonAdapter<LabelRatingDTO.LabelRatingStyle> f13 = moshi.f(LabelRatingDTO.LabelRatingStyle.class, m11, "style");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableLabelRatingStyleAdapter = f13;
        JsonAdapter<AtomActionDTO> f14 = moshi.f(AtomActionDTO.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f14;
        JsonAdapter<String> f15 = moshi.f(String.class, m11, "context");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableStringAdapter = f15;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f16 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f16;
        JsonAdapter<TestInfo> f17 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableTestInfoAdapter = f17;
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(LabelRatingDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public LabelRatingDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        RatingDTO ratingDTO = null;
        CommonAtomLabelDTO commonAtomLabelDTO = null;
        LabelRatingDTO.LabelRatingPreset labelRatingPreset = null;
        LabelRatingDTO.LabelRatingStyle labelRatingStyle = null;
        AtomActionDTO atomActionDTO = null;
        String str = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TestInfo testInfo = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    ratingDTO = this.ratingDTOAdapter.fromJson(reader);
                    if (ratingDTO == null) {
                        throw c.q("rating", "rating", reader);
                    }
                    break;
                case 1:
                    commonAtomLabelDTO = this.nullableCommonAtomLabelDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    labelRatingPreset = this.nullableLabelRatingPresetAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    labelRatingStyle = this.nullableLabelRatingStyleAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 7:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -189) {
            TestInfo testInfo2 = testInfo;
            Map<String, TokenizedTrackingInfo> map2 = map;
            String str2 = str;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            LabelRatingDTO.LabelRatingStyle labelRatingStyle2 = labelRatingStyle;
            LabelRatingDTO.LabelRatingPreset labelRatingPreset2 = labelRatingPreset;
            CommonAtomLabelDTO commonAtomLabelDTO2 = commonAtomLabelDTO;
            RatingDTO ratingDTO2 = ratingDTO;
            if (ratingDTO2 != null) {
                return new LabelRatingDTO(ratingDTO2, commonAtomLabelDTO2, labelRatingPreset2, labelRatingStyle2, atomActionDTO2, str2, map2, testInfo2);
            }
            throw c.j("rating", "rating", reader);
        }
        TestInfo testInfo3 = testInfo;
        Map<String, TokenizedTrackingInfo> map3 = map;
        String str3 = str;
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        LabelRatingDTO.LabelRatingStyle labelRatingStyle3 = labelRatingStyle;
        LabelRatingDTO.LabelRatingPreset labelRatingPreset3 = labelRatingPreset;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO;
        RatingDTO ratingDTO3 = ratingDTO;
        Constructor<LabelRatingDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = LabelRatingDTO.class.getDeclaredConstructor(RatingDTO.class, CommonAtomLabelDTO.class, LabelRatingDTO.LabelRatingPreset.class, LabelRatingDTO.LabelRatingStyle.class, AtomActionDTO.class, String.class, Map.class, TestInfo.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (ratingDTO3 == null) {
            throw c.j("rating", "rating", reader);
        }
        LabelRatingDTO newInstance = constructor.newInstance(ratingDTO3, commonAtomLabelDTO3, labelRatingPreset3, labelRatingStyle3, atomActionDTO3, str3, map3, testInfo3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, LabelRatingDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("rating");
        this.ratingDTOAdapter.mo44toJson(writer, (x) value_.getRating());
        writer.w("label");
        this.nullableCommonAtomLabelDTOAdapter.mo44toJson(writer, (x) value_.getLabel());
        writer.w("preset");
        this.nullableLabelRatingPresetAdapter.mo44toJson(writer, (x) value_.getPreset());
        writer.w("style");
        this.nullableLabelRatingStyleAdapter.mo44toJson(writer, (x) value_.getStyle());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.p();
    }
}
