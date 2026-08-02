package ru.ozon.app.android.atoms.data.common;

import Ak.b;
import Y9.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$IconPosition;", "nullableIconPositionAtEnumNullFallbackAdapter", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "nullableTruncatingModeAtEnumNullFallbackAdapter", "", "nullableIntAdapter", "Lru/ozon/app/android/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommonAtomLabelDTOJsonAdapter extends JsonAdapter<CommonAtomLabelDTO> {
    public static final int $stable = 8;
    private volatile Constructor<CommonAtomLabelDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CommonAtomLabelDTO.IconPosition> nullableIconPositionAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final JsonAdapter<CommonAtomLabelDTO.TruncatingMode> nullableTruncatingModeAtEnumNullFallbackAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OzonSpannableString> ozonSpannableStringAdapter;

    public CommonAtomLabelDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("text", "textColor", "icon", "iconTintColor", "iconPosition", "truncatingMode", "numberOfLines", "testInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<OzonSpannableString> f7 = moshi.f(OzonSpannableString.class, m11, "text");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.ozonSpannableStringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "textColor");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<CommonAtomLabelDTO.IconPosition> f12 = moshi.f(CommonAtomLabelDTO.IconPosition.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "iconPosition");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIconPositionAtEnumNullFallbackAdapter = f12;
        JsonAdapter<CommonAtomLabelDTO.TruncatingMode> f13 = moshi.f(CommonAtomLabelDTO.TruncatingMode.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "truncatingMode");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableTruncatingModeAtEnumNullFallbackAdapter = f13;
        JsonAdapter<Integer> f14 = moshi.f(Integer.class, m11, "numberOfLines");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableIntAdapter = f14;
        JsonAdapter<TestInfo> f15 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableTestInfoAdapter = f15;
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(CommonAtomLabelDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CommonAtomLabelDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        OzonSpannableString ozonSpannableString = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        CommonAtomLabelDTO.IconPosition iconPosition = null;
        CommonAtomLabelDTO.TruncatingMode truncatingMode = null;
        Integer num = null;
        TestInfo testInfo = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    ozonSpannableString = this.ozonSpannableStringAdapter.fromJson(reader);
                    if (ozonSpannableString == null) {
                        throw c.q("text", "text", reader);
                    }
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    iconPosition = this.nullableIconPositionAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    truncatingMode = this.nullableTruncatingModeAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -383) {
            Integer num2 = num;
            CommonAtomLabelDTO.TruncatingMode truncatingMode2 = truncatingMode;
            CommonAtomLabelDTO.IconPosition iconPosition2 = iconPosition;
            String str4 = str3;
            String str5 = str2;
            String str6 = str;
            OzonSpannableString ozonSpannableString2 = ozonSpannableString;
            if (ozonSpannableString2 != null) {
                return new CommonAtomLabelDTO(ozonSpannableString2, str6, str5, str4, iconPosition2, truncatingMode2, num2, false, testInfo, UserVerificationMethods.USER_VERIFY_PATTERN, null);
            }
            throw c.j("text", "text", reader);
        }
        TestInfo testInfo2 = testInfo;
        Integer num3 = num;
        CommonAtomLabelDTO.TruncatingMode truncatingMode3 = truncatingMode;
        CommonAtomLabelDTO.IconPosition iconPosition3 = iconPosition;
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        OzonSpannableString ozonSpannableString3 = ozonSpannableString;
        Constructor<CommonAtomLabelDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CommonAtomLabelDTO.class.getDeclaredConstructor(OzonSpannableString.class, String.class, String.class, String.class, CommonAtomLabelDTO.IconPosition.class, CommonAtomLabelDTO.TruncatingMode.class, Integer.class, Boolean.TYPE, TestInfo.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<CommonAtomLabelDTO> constructor2 = constructor;
        if (ozonSpannableString3 == null) {
            throw c.j("text", "text", reader);
        }
        CommonAtomLabelDTO newInstance = constructor2.newInstance(ozonSpannableString3, str9, str8, str7, iconPosition3, truncatingMode3, num3, Boolean.FALSE, testInfo2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CommonAtomLabelDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("textColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTextColor());
        writer.w("icon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("iconTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIconTintColor());
        writer.w("iconPosition");
        this.nullableIconPositionAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getIconPosition());
        writer.w("truncatingMode");
        this.nullableTruncatingModeAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getTruncatingMode());
        writer.w("numberOfLines");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getNumberOfLines());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.p();
    }
}
