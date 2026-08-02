package ru.ozon.uni.atoms.data.common;

import Ak.b;
import C.o0;
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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.core.models.UniPaddingToken;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R(\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020)\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0018R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/uni/atoms/data/common/TooltipDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/common/TooltipDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/common/TooltipDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/common/TooltipDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/common/TooltipDTO$StyleType;", "nullableStyleTypeAdapter", "Lru/ozon/uni/atoms/data/common/TooltipDTO$SizeType;", "nullableSizeTypeAdapter", "Lru/ozon/uni/atoms/data/common/TooltipDTO$BeakPosition;", "nullableBeakPositionAdapter", "", "intAdapter", "Lru/ozon/uni/core/models/UniPaddingToken;", "nullableUniPaddingTokenAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TooltipDTOJsonAdapter extends JsonAdapter<TooltipDTO> {
    public static final int $stable = 8;
    private volatile Constructor<TooltipDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<TooltipDTO.BeakPosition> nullableBeakPositionAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TooltipDTO.SizeType> nullableSizeTypeAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TooltipDTO.StyleType> nullableStyleTypeAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final JsonAdapter<UniPaddingToken> nullableUniPaddingTokenAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public TooltipDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "hasCloseIcon", "styleType", "sizeType", "beakPosition", "minWidth", "leftMargin", "rightMargin", "context", "testInfo", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "subtitle");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<Boolean> f12 = moshi.f(Boolean.class, m11, "hasCloseIcon");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableBooleanAdapter = f12;
        JsonAdapter<TooltipDTO.StyleType> f13 = moshi.f(TooltipDTO.StyleType.class, m11, "styleType");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStyleTypeAdapter = f13;
        JsonAdapter<TooltipDTO.SizeType> f14 = moshi.f(TooltipDTO.SizeType.class, m11, "sizeType");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableSizeTypeAdapter = f14;
        JsonAdapter<TooltipDTO.BeakPosition> f15 = moshi.f(TooltipDTO.BeakPosition.class, m11, "beakPosition");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableBeakPositionAdapter = f15;
        JsonAdapter<Integer> f16 = moshi.f(Integer.TYPE, m11, "minWidth");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.intAdapter = f16;
        JsonAdapter<UniPaddingToken> f17 = moshi.f(UniPaddingToken.class, m11, "leftMargin");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableUniPaddingTokenAdapter = f17;
        JsonAdapter<TestInfo> f18 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableTestInfoAdapter = f18;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f19 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f19;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TooltipDTO fromJson(@NotNull n reader) {
        int i11 = -1;
        Integer a11 = o0.a(reader, "reader", 0);
        String str = null;
        String str2 = null;
        Boolean bool = null;
        TooltipDTO.StyleType styleType = null;
        TooltipDTO.SizeType sizeType = null;
        TooltipDTO.BeakPosition beakPosition = null;
        UniPaddingToken uniPaddingToken = null;
        UniPaddingToken uniPaddingToken2 = null;
        String str3 = null;
        TestInfo testInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    styleType = this.nullableStyleTypeAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    sizeType = this.nullableSizeTypeAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    beakPosition = this.nullableBeakPositionAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    a11 = this.intAdapter.fromJson(reader);
                    if (a11 == null) {
                        throw c.q("minWidth", "minWidth", reader);
                    }
                    i11 &= -65;
                    break;
                case 7:
                    uniPaddingToken = this.nullableUniPaddingTokenAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    uniPaddingToken2 = this.nullableUniPaddingTokenAdapter.fromJson(reader);
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
            }
        }
        reader.endObject();
        if (i11 == -4095) {
            if (str == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            return new TooltipDTO(str, str2, bool, styleType, sizeType, beakPosition, a11.intValue(), uniPaddingToken, uniPaddingToken2, str3, testInfo, map);
        }
        Constructor<TooltipDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = TooltipDTO.class.getDeclaredConstructor(String.class, String.class, Boolean.class, TooltipDTO.StyleType.class, TooltipDTO.SizeType.class, TooltipDTO.BeakPosition.class, cls2, UniPaddingToken.class, UniPaddingToken.class, String.class, TestInfo.class, Map.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        TooltipDTO newInstance = constructor.newInstance(str, str2, bool, styleType, sizeType, beakPosition, a11, uniPaddingToken, uniPaddingToken2, str3, testInfo, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return b.c(32, "GeneratedJsonAdapter(TooltipDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TooltipDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("subtitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("hasCloseIcon");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getHasCloseIcon());
        writer.w("styleType");
        this.nullableStyleTypeAdapter.mo44toJson(writer, (x) value_.getStyleType());
        writer.w("sizeType");
        this.nullableSizeTypeAdapter.mo44toJson(writer, (x) value_.getSizeType());
        writer.w("beakPosition");
        this.nullableBeakPositionAdapter.mo44toJson(writer, (x) value_.getBeakPosition());
        writer.w("minWidth");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getMinWidth()));
        writer.w("leftMargin");
        this.nullableUniPaddingTokenAdapter.mo44toJson(writer, (x) value_.getLeftMargin());
        writer.w("rightMargin");
        this.nullableUniPaddingTokenAdapter.mo44toJson(writer, (x) value_.getRightMargin());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
