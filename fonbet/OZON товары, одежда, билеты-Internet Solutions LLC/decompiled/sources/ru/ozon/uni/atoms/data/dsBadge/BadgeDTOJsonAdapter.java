package ru.ozon.uni.atoms.data.dsBadge;

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
import ru.ozon.uni.atoms.data.common.A11yInfo;
import ru.ozon.uni.atoms.data.common.Rounds;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/uni/atoms/data/dsBadge/BadgeDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;", "nullableBadgeSizeAtEnumNullFallbackAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;", "nullableStyleAtEnumNullFallbackAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomStyle;", "nullableCustomStyleAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$StraightCorners;", "nullableStraightCornersAdapter", "Lru/ozon/uni/atoms/data/common/A11yInfo;", "nullableA11yInfoAdapter", "Lru/ozon/uni/atoms/data/common/Rounds;", "nullableRoundsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BadgeDTOJsonAdapter extends JsonAdapter<BadgeDTO> {
    public static final int $stable = 8;
    private volatile Constructor<BadgeDTO> constructorRef;

    @NotNull
    private final JsonAdapter<A11yInfo> nullableA11yInfoAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO.BadgeSize> nullableBadgeSizeAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO.CustomStyle> nullableCustomStyleAdapter;

    @NotNull
    private final JsonAdapter<Rounds> nullableRoundsAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO.StraightCorners> nullableStraightCornersAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO.Style> nullableStyleAtEnumNullFallbackAdapter;

    @NotNull
    private final n.a options;

    public BadgeDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("text", "leftIcon", "size", "style", "customBadgeStyle", "common", "context", "hideDisclosure", "styleType", "straightCorners", "a11yInfo", "round");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "text");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<BadgeDTO.BadgeSize> f11 = moshi.f(BadgeDTO.BadgeSize.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.dsBadge.BadgeDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        this.nullableBadgeSizeAtEnumNullFallbackAdapter = f11;
        JsonAdapter<BadgeDTO.Style> f12 = moshi.f(BadgeDTO.Style.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.dsBadge.BadgeDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "style");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStyleAtEnumNullFallbackAdapter = f12;
        JsonAdapter<BadgeDTO.CustomStyle> f13 = moshi.f(BadgeDTO.CustomStyle.class, m11, "customBadgeStyle");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableCustomStyleAdapter = f13;
        JsonAdapter<CommonControlSettings> f14 = moshi.f(CommonControlSettings.class, m11, "common");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableCommonControlSettingsAdapter = f14;
        JsonAdapter<Boolean> f15 = moshi.f(Boolean.class, m11, "hideDisclosure");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableBooleanAdapter = f15;
        JsonAdapter<BadgeDTO.StraightCorners> f16 = moshi.f(BadgeDTO.StraightCorners.class, m11, "straightCorners");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableStraightCornersAdapter = f16;
        JsonAdapter<A11yInfo> f17 = moshi.f(A11yInfo.class, m11, "a11yInfo");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableA11yInfoAdapter = f17;
        JsonAdapter<Rounds> f18 = moshi.f(Rounds.class, m11, "round");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableRoundsAdapter = f18;
    }

    @NotNull
    public String toString() {
        return b.c(30, "GeneratedJsonAdapter(BadgeDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public BadgeDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        String str2 = null;
        BadgeDTO.BadgeSize badgeSize = null;
        BadgeDTO.Style style = null;
        BadgeDTO.CustomStyle customStyle = null;
        CommonControlSettings commonControlSettings = null;
        String str3 = null;
        Boolean bool = null;
        BadgeDTO.Style style2 = null;
        BadgeDTO.StraightCorners straightCorners = null;
        A11yInfo a11yInfo = null;
        Rounds rounds = null;
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
                    badgeSize = this.nullableBadgeSizeAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    style = this.nullableStyleAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    customStyle = this.nullableCustomStyleAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    style2 = this.nullableStyleAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    straightCorners = this.nullableStraightCornersAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
                case 10:
                    a11yInfo = this.nullableA11yInfoAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    rounds = this.nullableRoundsAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -4096) {
            BadgeDTO.Style style3 = style2;
            Boolean bool2 = bool;
            String str4 = str3;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            BadgeDTO.CustomStyle customStyle2 = customStyle;
            BadgeDTO.Style style4 = style;
            return new BadgeDTO(str, str2, badgeSize, style4, customStyle2, commonControlSettings2, str4, bool2, style3, straightCorners, a11yInfo, rounds);
        }
        BadgeDTO.Style style5 = style2;
        Boolean bool3 = bool;
        String str5 = str3;
        CommonControlSettings commonControlSettings3 = commonControlSettings;
        BadgeDTO.CustomStyle customStyle3 = customStyle;
        BadgeDTO.Style style6 = style;
        BadgeDTO.BadgeSize badgeSize2 = badgeSize;
        String str6 = str2;
        String str7 = str;
        Constructor<BadgeDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BadgeDTO.class.getDeclaredConstructor(String.class, String.class, BadgeDTO.BadgeSize.class, BadgeDTO.Style.class, BadgeDTO.CustomStyle.class, CommonControlSettings.class, String.class, Boolean.class, BadgeDTO.Style.class, BadgeDTO.StraightCorners.class, A11yInfo.class, Rounds.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        BadgeDTO newInstance = constructor.newInstance(str7, str6, badgeSize2, style6, customStyle3, commonControlSettings3, str5, bool3, style5, straightCorners, a11yInfo, rounds, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, BadgeDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("leftIcon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLeftIcon());
        writer.w("size");
        this.nullableBadgeSizeAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getSize());
        writer.w("style");
        this.nullableStyleAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getStyle());
        writer.w("customBadgeStyle");
        this.nullableCustomStyleAdapter.mo44toJson(writer, (x) value_.getCustomBadgeStyle());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value_.getCommon());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("hideDisclosure");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getHideDisclosure());
        writer.w("styleType");
        this.nullableStyleAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getStyleType());
        writer.w("straightCorners");
        this.nullableStraightCornersAdapter.mo44toJson(writer, (x) value_.getStraightCorners());
        writer.w("a11yInfo");
        this.nullableA11yInfoAdapter.mo44toJson(writer, (x) value_.getA11yInfo());
        writer.w("round");
        this.nullableRoundsAdapter.mo44toJson(writer, (x) value_.getRound());
        writer.p();
    }
}
