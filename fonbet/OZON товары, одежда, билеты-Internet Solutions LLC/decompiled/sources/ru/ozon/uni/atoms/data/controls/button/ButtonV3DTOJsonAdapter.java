package ru.ozon.uni.atoms.data.controls.button;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.A11yInfo;
import ru.ozon.uni.atoms.data.common.Rounds;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "nullableStyleTypesAtEnumNullFallbackAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$Sizes;", "nullableSizesAtEnumNullFallbackAdapter", "stringAdapter", "nullableStringAdapter", "", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lru/ozon/uni/atoms/data/common/A11yInfo;", "nullableA11yInfoAdapter", "Lru/ozon/uni/atoms/data/common/Rounds;", "nullableRoundsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ButtonV3DTOJsonAdapter extends JsonAdapter<ButtonV3DTO> {
    public static final int $stable = 8;
    private volatile Constructor<ButtonV3DTO> constructorRef;

    @NotNull
    private final JsonAdapter<A11yInfo> nullableA11yInfoAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<Rounds> nullableRoundsAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO.Sizes> nullableSizesAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO.StyleTypes> nullableStyleTypesAtEnumNullFallbackAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ButtonV3DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("styleType", "size", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "icon", "dataText", "isDisabled", "titleColor", "dataTextColor", "subtitleColor", "iconColor", "dataBackgroundColor", "backgroundColor", "common", "isHoverDisabled", "a11yInfo", "round", "hoverColor");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        JsonAdapter<ButtonV3DTO.StyleTypes> f7 = moshi.f(ButtonV3DTO.StyleTypes.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.controls.button.ButtonV3DTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "styleType");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStyleTypesAtEnumNullFallbackAdapter = f7;
        JsonAdapter<ButtonV3DTO.Sizes> f11 = moshi.f(ButtonV3DTO.Sizes.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.controls.button.ButtonV3DTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableSizesAtEnumNullFallbackAdapter = f11;
        M m11 = M.f71699a;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.stringAdapter = f12;
        JsonAdapter<String> f13 = moshi.f(String.class, m11, "subtitle");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStringAdapter = f13;
        JsonAdapter<Boolean> f14 = moshi.f(Boolean.class, m11, "isDisabled");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableBooleanAdapter = f14;
        JsonAdapter<CommonControlSettings> f15 = moshi.f(CommonControlSettings.class, m11, "common");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableCommonControlSettingsAdapter = f15;
        JsonAdapter<A11yInfo> f16 = moshi.f(A11yInfo.class, m11, "a11yInfo");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableA11yInfoAdapter = f16;
        JsonAdapter<Rounds> f17 = moshi.f(Rounds.class, m11, "round");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableRoundsAdapter = f17;
    }

    @NotNull
    public String toString() {
        return b.c(33, "GeneratedJsonAdapter(ButtonV3DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ButtonV3DTO fromJson(@NotNull n reader) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i13 = -1;
        ButtonV3DTO.StyleTypes styleTypes = null;
        ButtonV3DTO.Sizes sizes = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        CommonControlSettings commonControlSettings = null;
        Boolean bool2 = null;
        A11yInfo a11yInfo = null;
        Rounds rounds = null;
        String str11 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    continue;
                case 0:
                    styleTypes = this.nullableStyleTypesAtEnumNullFallbackAdapter.fromJson(reader);
                    i13 &= -2;
                    continue;
                case 1:
                    sizes = this.nullableSizesAtEnumNullFallbackAdapter.fromJson(reader);
                    i13 &= -3;
                    continue;
                case 2:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    continue;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -9;
                    continue;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -17;
                    continue;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -33;
                    continue;
                case 6:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -65;
                    continue;
                case 7:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -129;
                    continue;
                case 8:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -257;
                    continue;
                case 9:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -513;
                    continue;
                case 10:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -1025;
                    continue;
                case 11:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -2049;
                    continue;
                case 12:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    i13 &= -4097;
                    continue;
                case 13:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    i13 &= -8193;
                    continue;
                case 14:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -16385;
                    continue;
                case 15:
                    a11yInfo = this.nullableA11yInfoAdapter.fromJson(reader);
                    i12 = -32769;
                    break;
                case 16:
                    rounds = this.nullableRoundsAdapter.fromJson(reader);
                    i12 = -65537;
                    break;
                case 17:
                    str11 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -131073;
                    break;
            }
            i13 &= i12;
        }
        reader.endObject();
        if (i13 == -262140) {
            String str12 = str6;
            String str13 = str5;
            Boolean bool3 = bool;
            String str14 = str4;
            String str15 = str3;
            String str16 = str2;
            String str17 = str;
            ButtonV3DTO.Sizes sizes2 = sizes;
            ButtonV3DTO.StyleTypes styleTypes2 = styleTypes;
            if (str17 != null) {
                return new ButtonV3DTO(styleTypes2, sizes2, str17, str16, str15, str14, bool3, str13, str12, str7, str8, str9, str10, commonControlSettings, bool2, a11yInfo, rounds, str11);
            }
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        String str18 = str6;
        String str19 = str5;
        Boolean bool4 = bool;
        String str20 = str4;
        String str21 = str3;
        String str22 = str2;
        String str23 = str;
        ButtonV3DTO.Sizes sizes3 = sizes;
        ButtonV3DTO.StyleTypes styleTypes3 = styleTypes;
        Constructor<ButtonV3DTO> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i13;
            constructor = ButtonV3DTO.class.getDeclaredConstructor(ButtonV3DTO.StyleTypes.class, ButtonV3DTO.Sizes.class, String.class, String.class, String.class, String.class, Boolean.class, String.class, String.class, String.class, String.class, String.class, String.class, CommonControlSettings.class, Boolean.class, A11yInfo.class, Rounds.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i13;
        }
        Constructor<ButtonV3DTO> constructor2 = constructor;
        if (str23 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        ButtonV3DTO newInstance = constructor2.newInstance(styleTypes3, sizes3, str23, str22, str21, str20, bool4, str19, str18, str7, str8, str9, str10, commonControlSettings, bool2, a11yInfo, rounds, str11, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ButtonV3DTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("styleType");
        this.nullableStyleTypesAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getStyleType());
        writer.w("size");
        this.nullableSizesAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getSize());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("subtitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("icon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("dataText");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getDataText());
        writer.w("isDisabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isDisabled());
        writer.w("titleColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTitleColor());
        writer.w("dataTextColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getDataTextColor());
        writer.w("subtitleColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSubtitleColor());
        writer.w("iconColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIconColor());
        writer.w("dataBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getDataBackgroundColor());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value_.getCommon());
        writer.w("isHoverDisabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isHoverDisabled());
        writer.w("a11yInfo");
        this.nullableA11yInfoAdapter.mo44toJson(writer, (x) value_.getA11yInfo());
        writer.w("round");
        this.nullableRoundsAdapter.mo44toJson(writer, (x) value_.getRound());
        writer.w("hoverColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getHoverColor());
        writer.p();
    }
}
