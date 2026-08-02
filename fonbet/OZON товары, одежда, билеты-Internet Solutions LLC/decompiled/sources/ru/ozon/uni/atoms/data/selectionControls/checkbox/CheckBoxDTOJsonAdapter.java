package ru.ozon.uni.atoms.data.selectionControls.checkbox;

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
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckBoxSize;", "nullableCheckBoxSizeAtEnumNullFallbackAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "nullableCheckboxStatusAtEnumNullFallbackAdapter", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxState;", "nullableCheckboxStateAtEnumNullFallbackAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$Style;", "nullableStyleAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CheckBoxDTOJsonAdapter extends JsonAdapter<CheckBoxDTO> {
    public static final int $stable = 8;
    private volatile Constructor<CheckBoxDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CheckBoxDTO.CheckBoxSize> nullableCheckBoxSizeAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<CheckBoxDTO.CheckboxState> nullableCheckboxStateAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<CheckBoxDTO.CheckboxStatus> nullableCheckboxStatusAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<CheckBoxDTO.Style> nullableStyleAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    public CheckBoxDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("size", "status", "state", "context", "testInfo", "trackingInfo", "quantity", "customStyle", "customInvalidStyle", "customDisabledStyle");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        JsonAdapter<CheckBoxDTO.CheckBoxSize> f7 = moshi.f(CheckBoxDTO.CheckBoxSize.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        this.nullableCheckBoxSizeAtEnumNullFallbackAdapter = f7;
        JsonAdapter<CheckBoxDTO.CheckboxStatus> f11 = moshi.f(CheckBoxDTO.CheckboxStatus.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "status");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableCheckboxStatusAtEnumNullFallbackAdapter = f11;
        JsonAdapter<CheckBoxDTO.CheckboxState> f12 = moshi.f(CheckBoxDTO.CheckboxState.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "state");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableCheckboxStateAtEnumNullFallbackAdapter = f12;
        M m11 = M.f71699a;
        JsonAdapter<String> f13 = moshi.f(String.class, m11, "context");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStringAdapter = f13;
        JsonAdapter<TestInfo> f14 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableTestInfoAdapter = f14;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f15 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f15;
        JsonAdapter<Integer> f16 = moshi.f(Integer.class, m11, "quantity");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableIntAdapter = f16;
        JsonAdapter<CheckBoxDTO.Style> f17 = moshi.f(CheckBoxDTO.Style.class, m11, "customStyle");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableStyleAdapter = f17;
    }

    @NotNull
    public String toString() {
        return b.c(33, "GeneratedJsonAdapter(CheckBoxDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CheckBoxDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        CheckBoxDTO.CheckBoxSize checkBoxSize = null;
        CheckBoxDTO.CheckboxStatus checkboxStatus = null;
        CheckBoxDTO.CheckboxState checkboxState = null;
        String str = null;
        TestInfo testInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Integer num = null;
        CheckBoxDTO.Style style = null;
        CheckBoxDTO.Style style2 = null;
        CheckBoxDTO.Style style3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    checkBoxSize = this.nullableCheckBoxSizeAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    checkboxStatus = this.nullableCheckboxStatusAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    checkboxState = this.nullableCheckboxStateAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    style = this.nullableStyleAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    style2 = this.nullableStyleAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    style3 = this.nullableStyleAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -1024) {
            CheckBoxDTO.Style style4 = style2;
            CheckBoxDTO.Style style5 = style;
            Integer num2 = num;
            Map<String, TokenizedTrackingInfo> map2 = map;
            TestInfo testInfo2 = testInfo;
            String str2 = str;
            return new CheckBoxDTO(checkBoxSize, checkboxStatus, checkboxState, str2, testInfo2, map2, num2, style5, style4, style3);
        }
        CheckBoxDTO.Style style6 = style2;
        CheckBoxDTO.Style style7 = style;
        Integer num3 = num;
        Map<String, TokenizedTrackingInfo> map3 = map;
        TestInfo testInfo3 = testInfo;
        String str3 = str;
        CheckBoxDTO.CheckboxState checkboxState2 = checkboxState;
        CheckBoxDTO.CheckboxStatus checkboxStatus2 = checkboxStatus;
        CheckBoxDTO.CheckBoxSize checkBoxSize2 = checkBoxSize;
        Constructor<CheckBoxDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CheckBoxDTO.class.getDeclaredConstructor(CheckBoxDTO.CheckBoxSize.class, CheckBoxDTO.CheckboxStatus.class, CheckBoxDTO.CheckboxState.class, String.class, TestInfo.class, Map.class, Integer.class, CheckBoxDTO.Style.class, CheckBoxDTO.Style.class, CheckBoxDTO.Style.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        CheckBoxDTO newInstance = constructor.newInstance(checkBoxSize2, checkboxStatus2, checkboxState2, str3, testInfo3, map3, num3, style7, style6, style3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CheckBoxDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("size");
        this.nullableCheckBoxSizeAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getSize());
        writer.w("status");
        this.nullableCheckboxStatusAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getStatus());
        writer.w("state");
        this.nullableCheckboxStateAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getState());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("quantity");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getQuantity());
        writer.w("customStyle");
        this.nullableStyleAdapter.mo44toJson(writer, (x) value_.getCustomStyle());
        writer.w("customInvalidStyle");
        this.nullableStyleAdapter.mo44toJson(writer, (x) value_.getCustomInvalidStyle());
        writer.w("customDisabledStyle");
        this.nullableStyleAdapter.mo44toJson(writer, (x) value_.getCustomDisabledStyle());
        writer.p();
    }
}
