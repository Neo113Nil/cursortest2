package ru.ozon.app.android.atoms.data.text.expandable;

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
import ru.ozon.app.android.atoms.data.AtomActionDTO;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.data.cell.CommonCellSettings;
import ru.ozon.app.android.atoms.data.text.TextPreset;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R(\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020)\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/atoms/data/text/expandable/ExpandableTextDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/text/expandable/ExpandableTextDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/text/expandable/ExpandableTextDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/text/expandable/ExpandableTextDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;", "nullableLayoutPaddingAtEnumNullFallbackAdapter", "Lru/ozon/app/android/atoms/data/text/TextPreset;", "nullableTextPresetAtEnumNullFallbackAdapter", "nullableStringAdapter", "", "booleanAdapter", "", "nullableIntAdapter", "nullableOzonSpannableStringAdapter", "Lru/ozon/app/android/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/app/android/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExpandableTextDTOJsonAdapter extends JsonAdapter<ExpandableTextDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ExpandableTextDTO> constructorRef;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<CommonCellSettings.LayoutPadding> nullableLayoutPaddingAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<OzonSpannableString> nullableOzonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final JsonAdapter<TextPreset> nullableTextPresetAtEnumNullFallbackAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OzonSpannableString> ozonSpannableStringAdapter;

    public ExpandableTextDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("text", "leftPadding", "rightPadding", "preset", "textColor", "isExpanded", "numberOfLines", "moreText", "moreBackgroundColor", "action", "testInfo", "trackingInfo", "context", "topPadding", "bottomPadding", "typographyToken", "moreTextTypographyToken");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<OzonSpannableString> f7 = moshi.f(OzonSpannableString.class, m11, "text");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.ozonSpannableStringAdapter = f7;
        JsonAdapter<CommonCellSettings.LayoutPadding> f11 = moshi.f(CommonCellSettings.LayoutPadding.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.atoms.data.text.expandable.ExpandableTextDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter = f11;
        JsonAdapter<TextPreset> f12 = moshi.f(TextPreset.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.atoms.data.text.expandable.ExpandableTextDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableTextPresetAtEnumNullFallbackAdapter = f12;
        JsonAdapter<String> f13 = moshi.f(String.class, m11, "textColor");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStringAdapter = f13;
        JsonAdapter<Boolean> f14 = moshi.f(Boolean.TYPE, m11, "isExpanded");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.booleanAdapter = f14;
        JsonAdapter<Integer> f15 = moshi.f(Integer.class, m11, "numberOfLines");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableIntAdapter = f15;
        JsonAdapter<OzonSpannableString> f16 = moshi.f(OzonSpannableString.class, m11, "moreText");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableOzonSpannableStringAdapter = f16;
        JsonAdapter<AtomActionDTO> f17 = moshi.f(AtomActionDTO.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f17;
        JsonAdapter<TestInfo> f18 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableTestInfoAdapter = f18;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f19 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f19;
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(ExpandableTextDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ExpandableTextDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i12 = -1;
        Boolean bool2 = bool;
        OzonSpannableString ozonSpannableString = null;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        CommonCellSettings.LayoutPadding layoutPadding2 = null;
        TextPreset textPreset = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        OzonSpannableString ozonSpannableString2 = null;
        String str3 = null;
        AtomActionDTO atomActionDTO = null;
        TestInfo testInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        CommonCellSettings.LayoutPadding layoutPadding3 = null;
        CommonCellSettings.LayoutPadding layoutPadding4 = null;
        String str4 = null;
        String str5 = null;
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
                    layoutPadding = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i12 &= -3;
                    continue;
                case 2:
                    layoutPadding2 = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i12 &= -5;
                    continue;
                case 3:
                    textPreset = this.nullableTextPresetAtEnumNullFallbackAdapter.fromJson(reader);
                    i12 &= -9;
                    continue;
                case 4:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -17;
                    continue;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isExpanded", "isExpanded", reader);
                    }
                    i12 &= -33;
                    continue;
                case 6:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i12 &= -65;
                    continue;
                case 7:
                    ozonSpannableString2 = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    i12 &= -129;
                    continue;
                case 8:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -257;
                    continue;
                case 9:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    i12 &= -513;
                    continue;
                case 10:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i12 &= -1025;
                    continue;
                case 11:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i12 &= -2049;
                    continue;
                case 12:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -4097;
                    continue;
                case 13:
                    layoutPadding3 = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i12 &= -16385;
                    continue;
                case 14:
                    layoutPadding4 = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 = -32769;
                    break;
                case 15:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -65537;
                    break;
                case 16:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -131073;
                    break;
            }
            i12 &= i11;
        }
        reader.endObject();
        if (i12 == -253951) {
            if (ozonSpannableString == null) {
                throw c.j("text", "text", reader);
            }
            return new ExpandableTextDTO(ozonSpannableString, layoutPadding, layoutPadding2, textPreset, str, bool2.booleanValue(), num, ozonSpannableString2, str3, atomActionDTO, testInfo, map, str2, false, layoutPadding3, layoutPadding4, str4, str5, 8192, null);
        }
        String str6 = str2;
        Constructor<ExpandableTextDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Boolean.TYPE;
            constructor = ExpandableTextDTO.class.getDeclaredConstructor(OzonSpannableString.class, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, TextPreset.class, String.class, cls2, Integer.class, OzonSpannableString.class, String.class, AtomActionDTO.class, TestInfo.class, Map.class, String.class, cls2, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, String.class, String.class, Integer.TYPE, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (ozonSpannableString == null) {
            throw c.j("text", "text", reader);
        }
        ExpandableTextDTO newInstance = constructor.newInstance(ozonSpannableString, layoutPadding, layoutPadding2, textPreset, str, bool2, num, ozonSpannableString2, str3, atomActionDTO, testInfo, map, str6, Boolean.FALSE, layoutPadding3, layoutPadding4, str4, str5, Integer.valueOf(i12), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ExpandableTextDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("leftPadding");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getLeftPadding());
        writer.w("rightPadding");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getRightPadding());
        writer.w("preset");
        this.nullableTextPresetAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getPreset());
        writer.w("textColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTextColor());
        writer.w("isExpanded");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.isExpanded()));
        writer.w("numberOfLines");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getNumberOfLines());
        writer.w("moreText");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value_.getMoreText());
        writer.w("moreBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getMoreBackgroundColor());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("topPadding");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getTopPadding());
        writer.w("bottomPadding");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getBottomPadding());
        writer.w("typographyToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTypographyToken());
        writer.w("moreTextTypographyToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getMoreTextTypographyToken());
        writer.p();
    }
}
