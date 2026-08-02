package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.data.RegistrationDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO_FieldDTO_InputDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableBooleanAdapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO$Errors;", "nullableErrorsAdapter", "", "nullableIntAdapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/ViewType;", "viewTypeAdapter", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "keyboardTypeAdapter", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RegistrationDTO_FieldDTO_InputDTOJsonAdapter extends JsonAdapter<RegistrationDTO.FieldDTO.InputDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<OzonTextInputLayoutModel.KeyboardType> keyboardTypeAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<RegistrationDTO.FieldDTO.InputDTO.Errors> nullableErrorsAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<ViewType> viewTypeAdapter;

    public RegistrationDTO_FieldDTO_InputDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "caption", "required", "readOnly", "lexemes", "minLength", "maxLength", "isAddress", "viewType", "keyboardType");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.nullableStringAdapter = moshi.f(String.class, m11, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "required");
        this.nullableErrorsAdapter = moshi.f(RegistrationDTO.FieldDTO.InputDTO.Errors.class, m11, "lexemes");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "minLength");
        this.viewTypeAdapter = moshi.f(ViewType.class, m11, "viewType");
        this.keyboardTypeAdapter = moshi.f(OzonTextInputLayoutModel.KeyboardType.class, m11, "keyboardType");
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(RegistrationDTO.FieldDTO.InputDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public RegistrationDTO.FieldDTO.InputDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        RegistrationDTO.FieldDTO.InputDTO.Errors errors = null;
        Integer num = null;
        Integer num2 = null;
        Boolean bool3 = null;
        ViewType viewType = null;
        OzonTextInputLayoutModel.KeyboardType keyboardType = null;
        while (true) {
            String str5 = str;
            String str6 = str2;
            if (!reader.hasNext()) {
                String str7 = str3;
                reader.endObject();
                if (str5 == null) {
                    throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                }
                if (str7 == null) {
                    throw c.j(HammersV3BodyDTO.PLACEHOLDER, HammersV3BodyDTO.PLACEHOLDER, reader);
                }
                if (viewType == null) {
                    throw c.j("viewType", "viewType", reader);
                }
                if (keyboardType != null) {
                    return new RegistrationDTO.FieldDTO.InputDTO(str5, str6, str7, str4, bool, bool2, errors, num, num2, bool3, viewType, keyboardType);
                }
                throw c.j("keyboardType", "keyboardType", reader);
            }
            String str8 = str3;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str3 = str8;
                    str = str5;
                    str2 = str6;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    }
                    str3 = str8;
                    str2 = str6;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    str3 = str8;
                    str = str5;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q(HammersV3BodyDTO.PLACEHOLDER, HammersV3BodyDTO.PLACEHOLDER, reader);
                    }
                    str = str5;
                    str2 = str6;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    str3 = str8;
                    str = str5;
                    str2 = str6;
                case 4:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    str3 = str8;
                    str = str5;
                    str2 = str6;
                case 5:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    str3 = str8;
                    str = str5;
                    str2 = str6;
                case 6:
                    errors = this.nullableErrorsAdapter.fromJson(reader);
                    str3 = str8;
                    str = str5;
                    str2 = str6;
                case 7:
                    num = this.nullableIntAdapter.fromJson(reader);
                    str3 = str8;
                    str = str5;
                    str2 = str6;
                case 8:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    str3 = str8;
                    str = str5;
                    str2 = str6;
                case 9:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    str3 = str8;
                    str = str5;
                    str2 = str6;
                case 10:
                    viewType = this.viewTypeAdapter.fromJson(reader);
                    if (viewType == null) {
                        throw c.q("viewType", "viewType", reader);
                    }
                    str3 = str8;
                    str = str5;
                    str2 = str6;
                case 11:
                    keyboardType = this.keyboardTypeAdapter.fromJson(reader);
                    if (keyboardType == null) {
                        throw c.q("keyboardType", "keyboardType", reader);
                    }
                    str3 = str8;
                    str = str5;
                    str2 = str6;
                default:
                    str3 = str8;
                    str = str5;
                    str2 = str6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, RegistrationDTO.FieldDTO.InputDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getName());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getValue());
        writer.w(HammersV3BodyDTO.PLACEHOLDER);
        this.stringAdapter.mo44toJson(writer, (x) value.getPlaceholder());
        writer.w("caption");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getCaption());
        writer.w("required");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getRequired());
        writer.w("readOnly");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getReadOnly());
        writer.w("lexemes");
        this.nullableErrorsAdapter.mo44toJson(writer, (x) value.getLexemes());
        writer.w("minLength");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMinLength());
        writer.w("maxLength");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMaxLength());
        writer.w("isAddress");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isAddress());
        writer.w("viewType");
        this.viewTypeAdapter.mo44toJson(writer, (x) value.getViewType());
        writer.w("keyboardType");
        this.keyboardTypeAdapter.mo44toJson(writer, (x) value.getKeyboardType());
        writer.p();
    }
}
