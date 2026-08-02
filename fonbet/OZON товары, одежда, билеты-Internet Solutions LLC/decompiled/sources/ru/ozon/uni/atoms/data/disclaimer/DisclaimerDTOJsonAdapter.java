package ru.ozon.uni.atoms.data.disclaimer;

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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "nullableOzonSpannableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$Theme;", "nullableThemeAdapter", "", "nullableBooleanAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$MainButton;", "nullableMainButtonAdapter", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$AdditionalButton;", "nullableAdditionalButtonAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DisclaimerDTOJsonAdapter extends JsonAdapter<DisclaimerDTO> {
    public static final int $stable = 8;
    private volatile Constructor<DisclaimerDTO> constructorRef;

    @NotNull
    private final JsonAdapter<DisclaimerDTO.AdditionalButton> nullableAdditionalButtonAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerDTO.MainButton> nullableMainButtonAdapter;

    @NotNull
    private final JsonAdapter<OzonSpannableString> nullableOzonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerDTO.Theme> nullableThemeAdapter;

    @NotNull
    private final n.a options;

    public DisclaimerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "theme", "hideIcon", "icon", "mainButton", "additionalButton", "closeButton", "common", "context", "titleLinesLimit", "subtitleLinesLimit");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<OzonSpannableString> f7 = moshi.f(OzonSpannableString.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableOzonSpannableStringAdapter = f7;
        JsonAdapter<DisclaimerDTO.Theme> f11 = moshi.f(DisclaimerDTO.Theme.class, m11, "theme");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableThemeAdapter = f11;
        JsonAdapter<Boolean> f12 = moshi.f(Boolean.class, m11, "hideIcon");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableBooleanAdapter = f12;
        JsonAdapter<String> f13 = moshi.f(String.class, m11, "icon");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStringAdapter = f13;
        JsonAdapter<DisclaimerDTO.MainButton> f14 = moshi.f(DisclaimerDTO.MainButton.class, m11, "mainButton");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableMainButtonAdapter = f14;
        JsonAdapter<DisclaimerDTO.AdditionalButton> f15 = moshi.f(DisclaimerDTO.AdditionalButton.class, m11, "additionalButton");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableAdditionalButtonAdapter = f15;
        JsonAdapter<CommonControlSettings> f16 = moshi.f(CommonControlSettings.class, m11, "closeButton");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableCommonControlSettingsAdapter = f16;
        JsonAdapter<Integer> f17 = moshi.f(Integer.class, m11, "titleLinesLimit");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableIntAdapter = f17;
    }

    @NotNull
    public String toString() {
        return b.c(35, "GeneratedJsonAdapter(DisclaimerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DisclaimerDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        OzonSpannableString ozonSpannableString = null;
        OzonSpannableString ozonSpannableString2 = null;
        DisclaimerDTO.Theme theme = null;
        Boolean bool = null;
        String str = null;
        DisclaimerDTO.MainButton mainButton = null;
        DisclaimerDTO.AdditionalButton additionalButton = null;
        CommonControlSettings commonControlSettings = null;
        CommonControlSettings commonControlSettings2 = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    ozonSpannableString = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    ozonSpannableString2 = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    theme = this.nullableThemeAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    mainButton = this.nullableMainButtonAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    additionalButton = this.nullableAdditionalButtonAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    commonControlSettings2 = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
                case 10:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
                case 11:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -4097;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -7168) {
            CommonControlSettings commonControlSettings3 = commonControlSettings2;
            CommonControlSettings commonControlSettings4 = commonControlSettings;
            DisclaimerDTO.AdditionalButton additionalButton2 = additionalButton;
            DisclaimerDTO.MainButton mainButton2 = mainButton;
            String str3 = str;
            Boolean bool2 = bool;
            return new DisclaimerDTO(ozonSpannableString, ozonSpannableString2, theme, bool2, str3, mainButton2, additionalButton2, commonControlSettings4, commonControlSettings3, str2, false, num, num2, UserVerificationMethods.USER_VERIFY_ALL, null);
        }
        CommonControlSettings commonControlSettings5 = commonControlSettings2;
        Integer num3 = num2;
        CommonControlSettings commonControlSettings6 = commonControlSettings;
        Integer num4 = num;
        DisclaimerDTO.AdditionalButton additionalButton3 = additionalButton;
        DisclaimerDTO.MainButton mainButton3 = mainButton;
        String str4 = str;
        Boolean bool3 = bool;
        DisclaimerDTO.Theme theme2 = theme;
        OzonSpannableString ozonSpannableString3 = ozonSpannableString2;
        OzonSpannableString ozonSpannableString4 = ozonSpannableString;
        Constructor<DisclaimerDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DisclaimerDTO.class.getDeclaredConstructor(OzonSpannableString.class, OzonSpannableString.class, DisclaimerDTO.Theme.class, Boolean.class, String.class, DisclaimerDTO.MainButton.class, DisclaimerDTO.AdditionalButton.class, CommonControlSettings.class, CommonControlSettings.class, String.class, Boolean.TYPE, Integer.class, Integer.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        DisclaimerDTO newInstance = constructor.newInstance(ozonSpannableString4, ozonSpannableString3, theme2, bool3, str4, mainButton3, additionalButton3, commonControlSettings6, commonControlSettings5, str2, Boolean.FALSE, num4, num3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DisclaimerDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("subtitle");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("theme");
        this.nullableThemeAdapter.mo44toJson(writer, (x) value_.getTheme());
        writer.w("hideIcon");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getHideIcon());
        writer.w("icon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("mainButton");
        this.nullableMainButtonAdapter.mo44toJson(writer, (x) value_.getMainButton());
        writer.w("additionalButton");
        this.nullableAdditionalButtonAdapter.mo44toJson(writer, (x) value_.getAdditionalButton());
        writer.w("closeButton");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value_.getCloseButton());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value_.getCommon());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("titleLinesLimit");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getTitleLinesLimit());
        writer.w("subtitleLinesLimit");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getSubtitleLinesLimit());
        writer.p();
    }
}
