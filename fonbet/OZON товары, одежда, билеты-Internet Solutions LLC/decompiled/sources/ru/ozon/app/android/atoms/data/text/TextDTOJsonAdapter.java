package ru.ozon.app.android.atoms.data.text;

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
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.data.cell.CommonCellSettings;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.data.text.TextDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/atoms/data/text/TextDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/text/TextDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/text/TextDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/text/TextDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/text/TextDTO$TextAlignment;", "nullableTextAlignmentAtEnumNullFallbackAdapter", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;", "nullableLayoutPaddingAtEnumNullFallbackAdapter", "Lru/ozon/app/android/atoms/data/text/TextPreset;", "nullableTextPresetAtEnumNullFallbackAdapter", "nullableStringAdapter", "", "nullableIntAdapter", "Lru/ozon/app/android/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "nullableTruncatingModeAdapter", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$IconPosition;", "nullableIconPositionAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextDTOJsonAdapter extends JsonAdapter<TextDTO> {
    public static final int $stable = 8;
    private volatile Constructor<TextDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CommonAtomLabelDTO.IconPosition> nullableIconPositionAdapter;

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
    private final JsonAdapter<TextDTO.TextAlignment> nullableTextAlignmentAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<TextPreset> nullableTextPresetAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<CommonAtomLabelDTO.TruncatingMode> nullableTruncatingModeAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OzonSpannableString> ozonSpannableStringAdapter;

    public TextDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("text", "textAlignment", "leftPadding", "rightPadding", "topPadding", "bottomPadding", "preset", "typographyToken", "textColor", "numberOfLines", "testInfo", "context", "trackingInfo", "truncatingMode", "icon", "iconTintColor", "iconPosition", "maxLines");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<OzonSpannableString> f7 = moshi.f(OzonSpannableString.class, m11, "text");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.ozonSpannableStringAdapter = f7;
        JsonAdapter<TextDTO.TextAlignment> f11 = moshi.f(TextDTO.TextAlignment.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.atoms.data.text.TextDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
                return "@ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "textAlignment");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableTextAlignmentAtEnumNullFallbackAdapter = f11;
        JsonAdapter<CommonCellSettings.LayoutPadding> f12 = moshi.f(CommonCellSettings.LayoutPadding.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.atoms.data.text.TextDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
                return "@ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "leftPadding");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter = f12;
        JsonAdapter<TextPreset> f13 = moshi.f(TextPreset.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.atoms.data.text.TextDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
                return "@ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "preset");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableTextPresetAtEnumNullFallbackAdapter = f13;
        JsonAdapter<String> f14 = moshi.f(String.class, m11, "typographyToken");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableStringAdapter = f14;
        JsonAdapter<Integer> f15 = moshi.f(Integer.class, m11, "numberOfLines");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableIntAdapter = f15;
        JsonAdapter<TestInfo> f16 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableTestInfoAdapter = f16;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f17 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f17;
        JsonAdapter<CommonAtomLabelDTO.TruncatingMode> f18 = moshi.f(CommonAtomLabelDTO.TruncatingMode.class, m11, "truncatingMode");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableTruncatingModeAdapter = f18;
        JsonAdapter<CommonAtomLabelDTO.IconPosition> f19 = moshi.f(CommonAtomLabelDTO.IconPosition.class, m11, "iconPosition");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableIconPositionAdapter = f19;
    }

    @NotNull
    public String toString() {
        return b.c(29, "GeneratedJsonAdapter(TextDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TextDTO fromJson(@NotNull n reader) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i13 = -1;
        OzonSpannableString ozonSpannableString = null;
        TextDTO.TextAlignment textAlignment = null;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        CommonCellSettings.LayoutPadding layoutPadding2 = null;
        CommonCellSettings.LayoutPadding layoutPadding3 = null;
        CommonCellSettings.LayoutPadding layoutPadding4 = null;
        TextPreset textPreset = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        TestInfo testInfo = null;
        String str3 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        CommonAtomLabelDTO.TruncatingMode truncatingMode = null;
        String str4 = null;
        String str5 = null;
        CommonAtomLabelDTO.IconPosition iconPosition = null;
        Integer num2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    continue;
                case 0:
                    ozonSpannableString = this.ozonSpannableStringAdapter.fromJson(reader);
                    if (ozonSpannableString == null) {
                        throw c.q("text", "text", reader);
                    }
                    continue;
                case 1:
                    textAlignment = this.nullableTextAlignmentAtEnumNullFallbackAdapter.fromJson(reader);
                    i13 &= -3;
                    continue;
                case 2:
                    layoutPadding = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i13 &= -5;
                    continue;
                case 3:
                    layoutPadding2 = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i13 &= -9;
                    continue;
                case 4:
                    layoutPadding3 = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i13 &= -17;
                    continue;
                case 5:
                    layoutPadding4 = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i13 &= -33;
                    continue;
                case 6:
                    textPreset = this.nullableTextPresetAtEnumNullFallbackAdapter.fromJson(reader);
                    i13 &= -65;
                    continue;
                case 7:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -129;
                    continue;
                case 8:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -257;
                    continue;
                case 9:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i13 &= -513;
                    continue;
                case 10:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i13 &= -1025;
                    continue;
                case 11:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -2049;
                    continue;
                case 12:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i13 &= -4097;
                    continue;
                case 13:
                    truncatingMode = this.nullableTruncatingModeAdapter.fromJson(reader);
                    i13 &= -16385;
                    continue;
                case 14:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -32769;
                    break;
                case 15:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -65537;
                    break;
                case 16:
                    iconPosition = this.nullableIconPositionAdapter.fromJson(reader);
                    i12 = -131073;
                    break;
                case 17:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i12 = -262145;
                    break;
            }
            i13 &= i12;
        }
        reader.endObject();
        if (i13 == -516095) {
            String str6 = str2;
            String str7 = str;
            TextPreset textPreset2 = textPreset;
            CommonCellSettings.LayoutPadding layoutPadding5 = layoutPadding4;
            CommonCellSettings.LayoutPadding layoutPadding6 = layoutPadding3;
            CommonCellSettings.LayoutPadding layoutPadding7 = layoutPadding2;
            CommonCellSettings.LayoutPadding layoutPadding8 = layoutPadding;
            TextDTO.TextAlignment textAlignment2 = textAlignment;
            OzonSpannableString ozonSpannableString2 = ozonSpannableString;
            if (ozonSpannableString2 == null) {
                throw c.j("text", "text", reader);
            }
            Integer num3 = num2;
            CommonAtomLabelDTO.IconPosition iconPosition2 = iconPosition;
            return new TextDTO(ozonSpannableString2, textAlignment2, layoutPadding8, layoutPadding7, layoutPadding6, layoutPadding5, textPreset2, str7, str6, num, testInfo, str3, map, false, truncatingMode, str4, str5, iconPosition2, num3, 8192, null);
        }
        Integer num4 = num2;
        String str8 = str2;
        CommonAtomLabelDTO.IconPosition iconPosition3 = iconPosition;
        String str9 = str;
        String str10 = str5;
        TextPreset textPreset3 = textPreset;
        String str11 = str4;
        CommonCellSettings.LayoutPadding layoutPadding9 = layoutPadding4;
        CommonAtomLabelDTO.TruncatingMode truncatingMode2 = truncatingMode;
        CommonCellSettings.LayoutPadding layoutPadding10 = layoutPadding3;
        CommonCellSettings.LayoutPadding layoutPadding11 = layoutPadding2;
        CommonCellSettings.LayoutPadding layoutPadding12 = layoutPadding;
        TextDTO.TextAlignment textAlignment3 = textAlignment;
        OzonSpannableString ozonSpannableString3 = ozonSpannableString;
        Constructor<TextDTO> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i13;
            constructor = TextDTO.class.getDeclaredConstructor(OzonSpannableString.class, TextDTO.TextAlignment.class, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, TextPreset.class, String.class, String.class, Integer.class, TestInfo.class, String.class, Map.class, Boolean.TYPE, CommonAtomLabelDTO.TruncatingMode.class, String.class, String.class, CommonAtomLabelDTO.IconPosition.class, Integer.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i13;
        }
        Constructor<TextDTO> constructor2 = constructor;
        if (ozonSpannableString3 == null) {
            throw c.j("text", "text", reader);
        }
        TextDTO newInstance = constructor2.newInstance(ozonSpannableString3, textAlignment3, layoutPadding12, layoutPadding11, layoutPadding10, layoutPadding9, textPreset3, str9, str8, num, testInfo, str3, map, Boolean.FALSE, truncatingMode2, str11, str10, iconPosition3, num4, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TextDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("textAlignment");
        this.nullableTextAlignmentAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getTextAlignment());
        writer.w("leftPadding");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getLeftPadding());
        writer.w("rightPadding");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getRightPadding());
        writer.w("topPadding");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getTopPadding());
        writer.w("bottomPadding");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getBottomPadding());
        writer.w("preset");
        this.nullableTextPresetAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getPreset());
        writer.w("typographyToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTypographyToken());
        writer.w("textColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTextColor());
        writer.w("numberOfLines");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getNumberOfLines());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("truncatingMode");
        this.nullableTruncatingModeAdapter.mo44toJson(writer, (x) value_.getTruncatingMode());
        writer.w("icon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("iconTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIconTintColor());
        writer.w("iconPosition");
        this.nullableIconPositionAdapter.mo44toJson(writer, (x) value_.getIconPosition());
        writer.w("maxLines");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getMaxLines());
        writer.p();
    }
}
