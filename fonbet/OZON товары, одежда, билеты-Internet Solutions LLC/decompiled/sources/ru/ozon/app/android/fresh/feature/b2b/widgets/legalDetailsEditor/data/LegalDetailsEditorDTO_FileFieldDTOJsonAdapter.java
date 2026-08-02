package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.LegalDetailsEditorDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R&\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO_FileFieldDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$FileFieldDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$FileFieldDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$FileFieldDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "", "listOfStringAdapter", "", "longAdapter", "", "mapOfStringStringAdapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates;", "buttonStatesAdapter", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LegalDetailsEditorDTO_FileFieldDTOJsonAdapter extends JsonAdapter<LegalDetailsEditorDTO.FileFieldDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<LegalDetailsEditorDTO.ButtonStates> buttonStatesAdapter;

    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> mapOfStringStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public LegalDetailsEditorDTO_FileFieldDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(AppMeasurementSdk.ConditionalUserProperty.NAME, "label", "formats", "maxSize", "lexemes", "buttonsStates");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "label");
        this.listOfStringAdapter = moshi.f(D.e(List.class, String.class), m11, "formats");
        this.longAdapter = moshi.f(Long.TYPE, m11, "maxSize");
        this.mapOfStringStringAdapter = moshi.f(D.e(Map.class, String.class, String.class), m11, "lexemes");
        this.buttonStatesAdapter = moshi.f(LegalDetailsEditorDTO.ButtonStates.class, m11, "buttonsStates");
    }

    @NotNull
    public String toString() {
        return b.c(56, "GeneratedJsonAdapter(LegalDetailsEditorDTO.FileFieldDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public LegalDetailsEditorDTO.FileFieldDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        String str = null;
        TextDTO textDTO = null;
        List<String> list = null;
        Map<String, String> map = null;
        LegalDetailsEditorDTO.ButtonStates buttonStates = null;
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
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("label", "label", reader);
                    }
                    break;
                case 2:
                    list = this.listOfStringAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("formats", "formats", reader);
                    }
                    break;
                case 3:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("maxSize", "maxSize", reader);
                    }
                    break;
                case 4:
                    map = this.mapOfStringStringAdapter.fromJson(reader);
                    if (map == null) {
                        throw c.q("lexemes", "lexemes", reader);
                    }
                    break;
                case 5:
                    buttonStates = this.buttonStatesAdapter.fromJson(reader);
                    if (buttonStates == null) {
                        throw c.q("buttonsStates", "buttonsStates", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
        }
        if (textDTO == null) {
            throw c.j("label", "label", reader);
        }
        if (list == null) {
            throw c.j("formats", "formats", reader);
        }
        if (l11 == null) {
            throw c.j("maxSize", "maxSize", reader);
        }
        long longValue = l11.longValue();
        if (map == null) {
            throw c.j("lexemes", "lexemes", reader);
        }
        if (buttonStates != null) {
            return new LegalDetailsEditorDTO.FileFieldDTO(str, textDTO, list, longValue, map, buttonStates);
        }
        throw c.j("buttonsStates", "buttonsStates", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, LegalDetailsEditorDTO.FileFieldDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getName());
        writer.w("label");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getLabel());
        writer.w("formats");
        this.listOfStringAdapter.mo44toJson(writer, (x) value.getFormats());
        writer.w("maxSize");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getMaxSize()));
        writer.w("lexemes");
        this.mapOfStringStringAdapter.mo44toJson(writer, (x) value.getLexemes());
        writer.w("buttonsStates");
        this.buttonStatesAdapter.mo44toJson(writer, (x) value.getButtonsStates());
        writer.p();
    }
}
