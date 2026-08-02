package ru.ozon.app.android.session.auth.data;

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
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.session.auth.data.AuthDTO;
import ru.ozon.app.android.session.auth.data.alertentry.AlertEntry;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0018R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0018R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/session/auth/data/AuthDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/session/auth/data/AuthDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/session/auth/data/AuthDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/session/auth/data/AuthDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "Lru/ozon/app/android/session/auth/data/AuthDTO$Input;", "nullableListOfInputAdapter", "Lru/ozon/app/android/session/auth/data/AuthDTO$SubmitButton;", "nullableSubmitButtonAdapter", "Lru/ozon/app/android/session/auth/data/AuthDTO$Advertisement;", "nullableAdvertisementAdapter", "Lru/ozon/app/android/session/auth/data/AuthDTO$HintButton;", "listOfHintButtonAdapter", "Lru/ozon/app/android/session/auth/data/AuthDTO$SberIdButton;", "nullableSberIdButtonAdapter", "Lru/ozon/app/android/session/auth/data/alertentry/AlertEntry;", "nullableAlertEntryAdapter", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "nullableDisclaimerAtomAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes;", "translationLexemesAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthDTOJsonAdapter extends JsonAdapter<AuthDTO> {
    public static final int $stable = 8;
    private volatile Constructor<AuthDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<AuthDTO.HintButton>> listOfHintButtonAdapter;

    @NotNull
    private final JsonAdapter<AuthDTO.Advertisement> nullableAdvertisementAdapter;

    @NotNull
    private final JsonAdapter<AlertEntry> nullableAlertEntryAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerAtom> nullableDisclaimerAtomAdapter;

    @NotNull
    private final JsonAdapter<List<AuthDTO.Input>> nullableListOfInputAdapter;

    @NotNull
    private final JsonAdapter<AuthDTO.SberIdButton> nullableSberIdButtonAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<AuthDTO.SubmitButton> nullableSubmitButtonAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<AuthDTO.TranslationLexemes> translationLexemesAdapter;

    public AuthDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "origin", "subtitle", "inputs", "submitButton", "advertisement", "hintButtons", "loginBySberIdButton", "alertEntry", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "termsOfUseText", "translationLexemes");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter = moshi.f(String.class, m11, "origin");
        this.nullableListOfInputAdapter = moshi.f(D.e(List.class, AuthDTO.Input.class), m11, "inputs");
        this.nullableSubmitButtonAdapter = moshi.f(AuthDTO.SubmitButton.class, m11, "submitButton");
        this.nullableAdvertisementAdapter = moshi.f(AuthDTO.Advertisement.class, m11, "advertisement");
        this.listOfHintButtonAdapter = moshi.f(D.e(List.class, AuthDTO.HintButton.class), m11, "hintButtons");
        this.nullableSberIdButtonAdapter = moshi.f(AuthDTO.SberIdButton.class, m11, "loginBySberIdButton");
        this.nullableAlertEntryAdapter = moshi.f(AlertEntry.class, m11, "alertEntry");
        this.nullableDisclaimerAtomAdapter = moshi.f(DisclaimerAtom.class, m11, SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "termsOfUseText");
        this.translationLexemesAdapter = moshi.f(AuthDTO.TranslationLexemes.class, m11, "translationLexemes");
    }

    @NotNull
    public String toString() {
        return b.c(29, "GeneratedJsonAdapter(AuthDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AuthDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        List<AuthDTO.Input> list = null;
        AuthDTO.SubmitButton submitButton = null;
        AuthDTO.Advertisement advertisement = null;
        List<AuthDTO.HintButton> list2 = null;
        AuthDTO.SberIdButton sberIdButton = null;
        AlertEntry alertEntry = null;
        DisclaimerAtom disclaimerAtom = null;
        TextAtom textAtom = null;
        AuthDTO.TranslationLexemes translationLexemes = null;
        while (reader.hasNext()) {
            String str4 = str;
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
                    continue;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    list = this.nullableListOfInputAdapter.fromJson(reader);
                    break;
                case 4:
                    submitButton = this.nullableSubmitButtonAdapter.fromJson(reader);
                    break;
                case 5:
                    advertisement = this.nullableAdvertisementAdapter.fromJson(reader);
                    break;
                case 6:
                    list2 = this.listOfHintButtonAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("hintButtons", "hintButtons", reader);
                    }
                    str = str4;
                    i12 = -65;
                    continue;
                case 7:
                    sberIdButton = this.nullableSberIdButtonAdapter.fromJson(reader);
                    break;
                case 8:
                    alertEntry = this.nullableAlertEntryAdapter.fromJson(reader);
                    break;
                case 9:
                    disclaimerAtom = this.nullableDisclaimerAtomAdapter.fromJson(reader);
                    break;
                case 10:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 11:
                    translationLexemes = this.translationLexemesAdapter.fromJson(reader);
                    if (translationLexemes == null) {
                        throw c.q("translationLexemes", "translationLexemes", reader);
                    }
                    break;
            }
            str = str4;
        }
        String str5 = str;
        reader.endObject();
        if (i12 == -65) {
            if (str5 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.session.auth.data.AuthDTO.HintButton>");
            if (translationLexemes == null) {
                throw c.j("translationLexemes", "translationLexemes", reader);
            }
            AlertEntry alertEntry2 = alertEntry;
            AuthDTO.SberIdButton sberIdButton2 = sberIdButton;
            List<AuthDTO.HintButton> list3 = list2;
            AuthDTO.Advertisement advertisement2 = advertisement;
            AuthDTO.SubmitButton submitButton2 = submitButton;
            return new AuthDTO(str5, str2, str3, list, submitButton2, advertisement2, list3, sberIdButton2, alertEntry2, disclaimerAtom, textAtom, translationLexemes);
        }
        Constructor<AuthDTO> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = AuthDTO.class.getDeclaredConstructor(String.class, String.class, String.class, List.class, AuthDTO.SubmitButton.class, AuthDTO.Advertisement.class, List.class, AuthDTO.SberIdButton.class, AlertEntry.class, DisclaimerAtom.class, TextAtom.class, AuthDTO.TranslationLexemes.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<AuthDTO> constructor2 = constructor;
        if (str5 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (translationLexemes == null) {
            throw c.j("translationLexemes", "translationLexemes", reader);
        }
        AuthDTO newInstance = constructor2.newInstance(str5, str2, str3, list, submitButton, advertisement, list2, sberIdButton, alertEntry, disclaimerAtom, textAtom, translationLexemes, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AuthDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("origin");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getOrigin());
        writer.w("subtitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("inputs");
        this.nullableListOfInputAdapter.mo44toJson(writer, (x) value.getInputs());
        writer.w("submitButton");
        this.nullableSubmitButtonAdapter.mo44toJson(writer, (x) value.getSubmitButton());
        writer.w("advertisement");
        this.nullableAdvertisementAdapter.mo44toJson(writer, (x) value.getAdvertisement());
        writer.w("hintButtons");
        this.listOfHintButtonAdapter.mo44toJson(writer, (x) value.getHintButtons());
        writer.w("loginBySberIdButton");
        this.nullableSberIdButtonAdapter.mo44toJson(writer, (x) value.getLoginBySberIdButton());
        writer.w("alertEntry");
        this.nullableAlertEntryAdapter.mo44toJson(writer, (x) value.getAlertEntry());
        writer.w(SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        this.nullableDisclaimerAtomAdapter.mo44toJson(writer, (x) value.getDisclaimer());
        writer.w("termsOfUseText");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getTermsOfUseText());
        writer.w("translationLexemes");
        this.translationLexemesAdapter.mo44toJson(writer, (x) value.getTranslationLexemes());
        writer.p();
    }
}
