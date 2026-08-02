package ru.ozon.id.nativeauth.data.models;

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
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.id.nativeauth.data.models.EntryDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO_InputDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$b;", "inputTypeAdapter", "nullableStringAdapter", "Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$CountrySelect;", "nullableCountrySelectAdapter", "Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO$ErrorButton;", "nullableErrorButtonAdapter", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EntryDTO_InputDTOJsonAdapter extends JsonAdapter<EntryDTO.InputDTO> {

    @NotNull
    private final JsonAdapter<EntryDTO.InputDTO.b> inputTypeAdapter;

    @NotNull
    private final JsonAdapter<EntryDTO.InputDTO.CountrySelect> nullableCountrySelectAdapter;

    @NotNull
    private final JsonAdapter<EntryDTO.InputDTO.ErrorButton> nullableErrorButtonAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public EntryDTO_InputDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(AppMeasurementSdk.ConditionalUserProperty.NAME, HammersV3BodyDTO.PLACEHOLDER, "type", AppMeasurementSdk.ConditionalUserProperty.VALUE, "error", "countrySelect", "errorButton", "focusTrackAction");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<EntryDTO.InputDTO.b> f11 = moshi.f(EntryDTO.InputDTO.b.class, m11, "type");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.inputTypeAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        JsonAdapter<EntryDTO.InputDTO.CountrySelect> f13 = moshi.f(EntryDTO.InputDTO.CountrySelect.class, m11, "countrySelect");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableCountrySelectAdapter = f13;
        JsonAdapter<EntryDTO.InputDTO.ErrorButton> f14 = moshi.f(EntryDTO.InputDTO.ErrorButton.class, m11, "errorButton");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableErrorButtonAdapter = f14;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(39, "GeneratedJsonAdapter(EntryDTO.InputDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public EntryDTO.InputDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        EntryDTO.InputDTO.b bVar = null;
        String str3 = null;
        String str4 = null;
        EntryDTO.InputDTO.CountrySelect countrySelect = null;
        EntryDTO.InputDTO.ErrorButton errorButton = null;
        String str5 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q(HammersV3BodyDTO.PLACEHOLDER, HammersV3BodyDTO.PLACEHOLDER, reader);
                    }
                    break;
                case 2:
                    bVar = this.inputTypeAdapter.fromJson(reader);
                    if (bVar == null) {
                        throw c.q("type", "type", reader);
                    }
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    countrySelect = this.nullableCountrySelectAdapter.fromJson(reader);
                    break;
                case 6:
                    errorButton = this.nullableErrorButtonAdapter.fromJson(reader);
                    break;
                case 7:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
        }
        if (str2 == null) {
            throw c.j(HammersV3BodyDTO.PLACEHOLDER, HammersV3BodyDTO.PLACEHOLDER, reader);
        }
        if (bVar != null) {
            return new EntryDTO.InputDTO(str, str2, bVar, str3, str4, countrySelect, errorButton, str5);
        }
        throw c.j("type", "type", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, EntryDTO.InputDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.stringAdapter.mo44toJson(writer, (x) value_.getName());
        writer.w(HammersV3BodyDTO.PLACEHOLDER);
        this.stringAdapter.mo44toJson(writer, (x) value_.getPlaceholder());
        writer.w("type");
        this.inputTypeAdapter.mo44toJson(writer, (x) value_.getType());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getValue());
        writer.w("error");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getError());
        writer.w("countrySelect");
        this.nullableCountrySelectAdapter.mo44toJson(writer, (x) value_.getCountrySelect());
        writer.w("errorButton");
        this.nullableErrorButtonAdapter.mo44toJson(writer, (x) value_.getErrorButton());
        writer.w("focusTrackAction");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getFocusTrackAction());
        writer.p();
    }
}
