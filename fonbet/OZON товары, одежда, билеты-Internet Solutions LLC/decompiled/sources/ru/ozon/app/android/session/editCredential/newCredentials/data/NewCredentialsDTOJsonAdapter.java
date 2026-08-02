package ru.ozon.app.android.session.editCredential.newCredentials.data;

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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018¨\u0006$"}, d2 = {"Lru/ozon/app/android/session/editCredential/newCredentials/data/NewCredentialsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/session/editCredential/newCredentials/data/NewCredentialsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/session/editCredential/newCredentials/data/NewCredentialsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/session/editCredential/newCredentials/data/NewCredentialsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/app/android/session/editCredential/newCredentials/data/InputDTO;", "nullableInputDTOAdapter", "Lru/ozon/app/android/session/editCredential/newCredentials/data/SubmitButtonDTO;", "nullableSubmitButtonDTOAdapter", "Lru/ozon/app/android/session/editCredential/newCredentials/data/SecondaryButtonDTO;", "nullableSecondaryButtonDTOAdapter", "Lru/ozon/app/android/session/editCredential/newCredentials/data/HintButtonDTO;", "nullableHintButtonDTOAdapter", "Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes;", "translationLexemesAdapter", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NewCredentialsDTOJsonAdapter extends JsonAdapter<NewCredentialsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<HintButtonDTO> nullableHintButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<InputDTO> nullableInputDTOAdapter;

    @NotNull
    private final JsonAdapter<SecondaryButtonDTO> nullableSecondaryButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<SubmitButtonDTO> nullableSubmitButtonDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TranslationLexemes> translationLexemesAdapter;

    public NewCredentialsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "input", "submitButton", "secondaryButton", "hintButton", "translationLexemes");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter = moshi.f(String.class, m11, "subtitle");
        this.nullableInputDTOAdapter = moshi.f(InputDTO.class, m11, "input");
        this.nullableSubmitButtonDTOAdapter = moshi.f(SubmitButtonDTO.class, m11, "submitButton");
        this.nullableSecondaryButtonDTOAdapter = moshi.f(SecondaryButtonDTO.class, m11, "secondaryButton");
        this.nullableHintButtonDTOAdapter = moshi.f(HintButtonDTO.class, m11, "hintButton");
        this.translationLexemesAdapter = moshi.f(TranslationLexemes.class, m11, "translationLexemes");
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(NewCredentialsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public NewCredentialsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        InputDTO inputDTO = null;
        SubmitButtonDTO submitButtonDTO = null;
        SecondaryButtonDTO secondaryButtonDTO = null;
        HintButtonDTO hintButtonDTO = null;
        TranslationLexemes translationLexemes = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    inputDTO = this.nullableInputDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    submitButtonDTO = this.nullableSubmitButtonDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    secondaryButtonDTO = this.nullableSecondaryButtonDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    hintButtonDTO = this.nullableHintButtonDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    translationLexemes = this.translationLexemesAdapter.fromJson(reader);
                    if (translationLexemes == null) {
                        throw c.q("translationLexemes", "translationLexemes", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (translationLexemes != null) {
            return new NewCredentialsDTO(str, str2, inputDTO, submitButtonDTO, secondaryButtonDTO, hintButtonDTO, translationLexemes);
        }
        throw c.j("translationLexemes", "translationLexemes", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, NewCredentialsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("input");
        this.nullableInputDTOAdapter.mo44toJson(writer, (x) value.getInput());
        writer.w("submitButton");
        this.nullableSubmitButtonDTOAdapter.mo44toJson(writer, (x) value.getSubmitButton());
        writer.w("secondaryButton");
        this.nullableSecondaryButtonDTOAdapter.mo44toJson(writer, (x) value.getSecondaryButton());
        writer.w("hintButton");
        this.nullableHintButtonDTOAdapter.mo44toJson(writer, (x) value.getHintButton());
        writer.w("translationLexemes");
        this.translationLexemesAdapter.mo44toJson(writer, (x) value.getTranslationLexemes());
        writer.p();
    }
}
