package ru.ozon.app.android.cml.delivery.molecules.input.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputType;", "inputTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputStatus;", "inputStatusAdapter", "nullableStringAdapter", "", "nullableBooleanAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/common/Paddings;", "nullablePaddingsAtEnumNullFallbackAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "commonControlSettingsAdapter", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InputMoleculeDTOJsonAdapter extends JsonAdapter<InputMoleculeDTO> {

    @NotNull
    private final JsonAdapter<CommonControlSettings> commonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<InputMoleculeDTO.InputStatus> inputStatusAdapter;

    @NotNull
    private final JsonAdapter<InputMoleculeDTO.InputType> inputTypeAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Paddings> nullablePaddingsAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public InputMoleculeDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("type", "status", "backgroundColor", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "message", "isDisabled", "maxLength", FormPageDTO.Field.FIELD_TYPE_MASK, "topPadding", "rightPadding", "bottomPadding", "leftPadding", "common", "debounce");
        M m11 = M.f71699a;
        this.inputTypeAdapter = moshi.f(InputMoleculeDTO.InputType.class, m11, "type");
        this.inputStatusAdapter = moshi.f(InputMoleculeDTO.InputStatus.class, m11, "status");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isDisabled");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "maxLength");
        this.nullablePaddingsAtEnumNullFallbackAdapter = moshi.f(Paddings.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "topPadding");
        this.commonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(InputMoleculeDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public InputMoleculeDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        InputMoleculeDTO.InputType inputType = null;
        InputMoleculeDTO.InputStatus inputStatus = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        Integer num = null;
        String str5 = null;
        Paddings paddings = null;
        Paddings paddings2 = null;
        Paddings paddings3 = null;
        Paddings paddings4 = null;
        CommonControlSettings commonControlSettings = null;
        Integer num2 = null;
        while (true) {
            InputMoleculeDTO.InputType inputType2 = inputType;
            if (!reader.hasNext()) {
                InputMoleculeDTO.InputStatus inputStatus2 = inputStatus;
                reader.endObject();
                if (inputType2 == null) {
                    throw c.j("type", "type", reader);
                }
                if (inputStatus2 == null) {
                    throw c.j("status", "status", reader);
                }
                if (commonControlSettings != null) {
                    return new InputMoleculeDTO(inputType2, inputStatus2, str, str2, str3, str4, bool, num, str5, paddings, paddings2, paddings3, paddings4, commonControlSettings, num2);
                }
                throw c.j("common", "common", reader);
            }
            InputMoleculeDTO.InputStatus inputStatus3 = inputStatus;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    inputStatus = inputStatus3;
                    inputType = inputType2;
                case 0:
                    inputType = this.inputTypeAdapter.fromJson(reader);
                    if (inputType == null) {
                        throw c.q("type", "type", reader);
                    }
                    inputStatus = inputStatus3;
                case 1:
                    inputStatus = this.inputStatusAdapter.fromJson(reader);
                    if (inputStatus == null) {
                        throw c.q("status", "status", reader);
                    }
                    inputType = inputType2;
                case 2:
                    str = this.nullableStringAdapter.fromJson(reader);
                    inputStatus = inputStatus3;
                    inputType = inputType2;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    inputStatus = inputStatus3;
                    inputType = inputType2;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    inputStatus = inputStatus3;
                    inputType = inputType2;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    inputStatus = inputStatus3;
                    inputType = inputType2;
                case 6:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    inputStatus = inputStatus3;
                    inputType = inputType2;
                case 7:
                    num = this.nullableIntAdapter.fromJson(reader);
                    inputStatus = inputStatus3;
                    inputType = inputType2;
                case 8:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    inputStatus = inputStatus3;
                    inputType = inputType2;
                case 9:
                    paddings = this.nullablePaddingsAtEnumNullFallbackAdapter.fromJson(reader);
                    inputStatus = inputStatus3;
                    inputType = inputType2;
                case 10:
                    paddings2 = this.nullablePaddingsAtEnumNullFallbackAdapter.fromJson(reader);
                    inputStatus = inputStatus3;
                    inputType = inputType2;
                case 11:
                    paddings3 = this.nullablePaddingsAtEnumNullFallbackAdapter.fromJson(reader);
                    inputStatus = inputStatus3;
                    inputType = inputType2;
                case 12:
                    paddings4 = this.nullablePaddingsAtEnumNullFallbackAdapter.fromJson(reader);
                    inputStatus = inputStatus3;
                    inputType = inputType2;
                case 13:
                    commonControlSettings = this.commonControlSettingsAdapter.fromJson(reader);
                    if (commonControlSettings == null) {
                        throw c.q("common", "common", reader);
                    }
                    inputStatus = inputStatus3;
                    inputType = inputType2;
                case 14:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    inputStatus = inputStatus3;
                    inputType = inputType2;
                default:
                    inputStatus = inputStatus3;
                    inputType = inputType2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, InputMoleculeDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("type");
        this.inputTypeAdapter.mo44toJson(writer, (x) value.getType());
        writer.w("status");
        this.inputStatusAdapter.mo44toJson(writer, (x) value.getStatus());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getValue());
        writer.w(HammersV3BodyDTO.PLACEHOLDER);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getPlaceholder());
        writer.w("message");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getMessage());
        writer.w("isDisabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isDisabled());
        writer.w("maxLength");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMaxLength());
        writer.w(FormPageDTO.Field.FIELD_TYPE_MASK);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getMask());
        writer.w("topPadding");
        this.nullablePaddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getTopPadding());
        writer.w("rightPadding");
        this.nullablePaddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getRightPadding());
        writer.w("bottomPadding");
        this.nullablePaddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getBottomPadding());
        writer.w("leftPadding");
        this.nullablePaddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getLeftPadding());
        writer.w("common");
        this.commonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("debounce");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getDebounce());
        writer.p();
    }
}
