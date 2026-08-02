package ru.ozon.app.android.cml.delivery.widgets.participantPhone.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.data.ParticipantPhoneDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/data/ParticipantPhoneDTO_PhoneInputDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/data/ParticipantPhoneDTO$PhoneInputDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cml/delivery/widgets/participantPhone/data/ParticipantPhoneDTO$PhoneInputDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cml/delivery/widgets/participantPhone/data/ParticipantPhoneDTO$PhoneInputDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableListOfStringAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "commonControlSettingsAdapter", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParticipantPhoneDTO_PhoneInputDTOJsonAdapter extends JsonAdapter<ParticipantPhoneDTO.PhoneInputDTO> {

    @NotNull
    private final JsonAdapter<CommonControlSettings> commonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ParticipantPhoneDTO_PhoneInputDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("label", "countryFlagUrl", "countryCode", "additionalCountryCodes", "phoneMask", "errorMessage", "common");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "label");
        this.nullableListOfStringAdapter = moshi.f(D.e(List.class, String.class), m11, "additionalCountryCodes");
        this.nullableStringAdapter = moshi.f(String.class, m11, "errorMessage");
        this.commonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(ParticipantPhoneDTO.PhoneInputDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ParticipantPhoneDTO.PhoneInputDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        List<String> list = null;
        String str4 = null;
        String str5 = null;
        CommonControlSettings commonControlSettings = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("label", "label", reader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("countryFlagUrl", "countryFlagUrl", reader);
                    }
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("countryCode", "countryCode", reader);
                    }
                    break;
                case 3:
                    list = this.nullableListOfStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("phoneMask", "phoneMask", reader);
                    }
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    commonControlSettings = this.commonControlSettingsAdapter.fromJson(reader);
                    if (commonControlSettings == null) {
                        throw c.q("common", "common", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("label", "label", reader);
        }
        if (str2 == null) {
            throw c.j("countryFlagUrl", "countryFlagUrl", reader);
        }
        if (str3 == null) {
            throw c.j("countryCode", "countryCode", reader);
        }
        if (str4 == null) {
            throw c.j("phoneMask", "phoneMask", reader);
        }
        if (commonControlSettings != null) {
            return new ParticipantPhoneDTO.PhoneInputDTO(str, str2, str3, list, str4, str5, commonControlSettings);
        }
        throw c.j("common", "common", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ParticipantPhoneDTO.PhoneInputDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("label");
        this.stringAdapter.mo44toJson(writer, (x) value.getLabel());
        writer.w("countryFlagUrl");
        this.stringAdapter.mo44toJson(writer, (x) value.getCountryFlagUrl());
        writer.w("countryCode");
        this.stringAdapter.mo44toJson(writer, (x) value.getCountryCode());
        writer.w("additionalCountryCodes");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value.getAdditionalCountryCodes());
        writer.w("phoneMask");
        this.stringAdapter.mo44toJson(writer, (x) value.getPhoneMask());
        writer.w("errorMessage");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getErrorMessage());
        writer.w("common");
        this.commonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.p();
    }
}
