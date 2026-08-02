package ru.ozon.app.android.partpayment.formpage.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\"\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0018R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO_FieldJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "nullableOzonSpannableStringAdapter", "nullableStringAdapter", "", "booleanAdapter", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$MaskOptions;", "nullableMaskOptionsAdapter", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$LandingOptions;", "nullableLandingOptionsAdapter", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$SummaryOptions;", "nullableSummaryOptionsAdapter", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$TextOptions;", "nullableTextOptionsAdapter", "", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$Option;", "nullableListOfOptionAdapter", "nullableBooleanAdapter", "", "nullableFloatAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FormPageDTO_FieldJsonAdapter extends JsonAdapter<FormPageDTO.Field> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<FormPageDTO.Field> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Float> nullableFloatAdapter;

    @NotNull
    private final JsonAdapter<FormPageDTO.Field.LandingOptions> nullableLandingOptionsAdapter;

    @NotNull
    private final JsonAdapter<List<FormPageDTO.Field.Option>> nullableListOfOptionAdapter;

    @NotNull
    private final JsonAdapter<FormPageDTO.Field.MaskOptions> nullableMaskOptionsAdapter;

    @NotNull
    private final JsonAdapter<OzonSpannableString> nullableOzonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<FormPageDTO.Field.SummaryOptions> nullableSummaryOptionsAdapter;

    @NotNull
    private final JsonAdapter<FormPageDTO.Field.TextOptions> nullableTextOptionsAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public FormPageDTO_FieldJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("type", SelectionItemFormDTO.TITLE_FIELD_NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "description", "borderRatio", "uploadFromGallery", "fullDescription", "maskOptions", "landingOptions", "summaryOptions", "textOptions", "options", "pikerType", "uploadUrl", "validationURL", "deeplink", "errorFoundDeeplink", "returnBack", "height", "background");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "type");
        this.nullableOzonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter = moshi.f(String.class, m11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "uploadFromGallery");
        this.nullableMaskOptionsAdapter = moshi.f(FormPageDTO.Field.MaskOptions.class, m11, "maskOptions");
        this.nullableLandingOptionsAdapter = moshi.f(FormPageDTO.Field.LandingOptions.class, m11, "landingOptions");
        this.nullableSummaryOptionsAdapter = moshi.f(FormPageDTO.Field.SummaryOptions.class, m11, "summaryOptions");
        this.nullableTextOptionsAdapter = moshi.f(FormPageDTO.Field.TextOptions.class, m11, "textOptions");
        this.nullableListOfOptionAdapter = moshi.f(D.e(List.class, FormPageDTO.Field.Option.class), m11, "options");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "returnBack");
        this.nullableFloatAdapter = moshi.f(Float.class, m11, "height");
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(FormPageDTO.Field)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FormPageDTO.Field fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        String str = null;
        OzonSpannableString ozonSpannableString = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        OzonSpannableString ozonSpannableString2 = null;
        String str5 = null;
        String str6 = null;
        FormPageDTO.Field.MaskOptions maskOptions = null;
        FormPageDTO.Field.LandingOptions landingOptions = null;
        FormPageDTO.Field.SummaryOptions summaryOptions = null;
        FormPageDTO.Field.TextOptions textOptions = null;
        List<FormPageDTO.Field.Option> list = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        Boolean bool3 = null;
        Float f7 = null;
        String str12 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("type", "type", reader);
                    }
                    break;
                case 1:
                    ozonSpannableString = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    ozonSpannableString2 = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("uploadFromGallery", "uploadFromGallery", reader);
                    }
                    i11 = -129;
                    break;
                case 8:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    maskOptions = this.nullableMaskOptionsAdapter.fromJson(reader);
                    break;
                case 10:
                    landingOptions = this.nullableLandingOptionsAdapter.fromJson(reader);
                    break;
                case 11:
                    summaryOptions = this.nullableSummaryOptionsAdapter.fromJson(reader);
                    break;
                case 12:
                    textOptions = this.nullableTextOptionsAdapter.fromJson(reader);
                    break;
                case 13:
                    list = this.nullableListOfOptionAdapter.fromJson(reader);
                    break;
                case 14:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 15:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 16:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 17:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 18:
                    str11 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 19:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 20:
                    f7 = this.nullableFloatAdapter.fromJson(reader);
                    break;
                case 21:
                    str12 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -129) {
            if (str != null) {
                return new FormPageDTO.Field(str, ozonSpannableString, str2, str3, str4, ozonSpannableString2, str5, bool2.booleanValue(), str6, maskOptions, landingOptions, summaryOptions, textOptions, list, str7, str8, str9, str10, str11, bool3, f7, str12);
            }
            throw c.j("type", "type", reader);
        }
        Constructor<FormPageDTO.Field> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = FormPageDTO.Field.class.getDeclaredConstructor(String.class, OzonSpannableString.class, String.class, String.class, String.class, OzonSpannableString.class, String.class, Boolean.TYPE, String.class, FormPageDTO.Field.MaskOptions.class, FormPageDTO.Field.LandingOptions.class, FormPageDTO.Field.SummaryOptions.class, FormPageDTO.Field.TextOptions.class, List.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, Float.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw c.j("type", "type", reader);
        }
        FormPageDTO.Field newInstance = constructor.newInstance(str, ozonSpannableString, str2, str3, str4, ozonSpannableString2, str5, bool2, str6, maskOptions, landingOptions, summaryOptions, textOptions, list, str7, str8, str9, str10, str11, bool3, f7, str12, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FormPageDTO.Field value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("type");
        this.stringAdapter.mo44toJson(writer, (x) value.getType());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getName());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getValue());
        writer.w("displayValue");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getDisplayValue());
        writer.w("description");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("borderRatio");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderRatio());
        writer.w("uploadFromGallery");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getUploadFromGallery()));
        writer.w("fullDescription");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getFullDescription());
        writer.w("maskOptions");
        this.nullableMaskOptionsAdapter.mo44toJson(writer, (x) value.getMaskOptions());
        writer.w("landingOptions");
        this.nullableLandingOptionsAdapter.mo44toJson(writer, (x) value.getLandingOptions());
        writer.w("summaryOptions");
        this.nullableSummaryOptionsAdapter.mo44toJson(writer, (x) value.getSummaryOptions());
        writer.w("textOptions");
        this.nullableTextOptionsAdapter.mo44toJson(writer, (x) value.getTextOptions());
        writer.w("options");
        this.nullableListOfOptionAdapter.mo44toJson(writer, (x) value.getOptions());
        writer.w("pikerType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getPikerType());
        writer.w("uploadUrl");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getUploadUrl());
        writer.w("validationURL");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getValidationURL());
        writer.w("deeplink");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getDeeplink());
        writer.w("errorFoundDeeplink");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getErrorFoundDeeplink());
        writer.w("returnBack");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getReturnBack());
        writer.w("height");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value.getHeight());
        writer.w("background");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackground());
        writer.p();
    }
}
