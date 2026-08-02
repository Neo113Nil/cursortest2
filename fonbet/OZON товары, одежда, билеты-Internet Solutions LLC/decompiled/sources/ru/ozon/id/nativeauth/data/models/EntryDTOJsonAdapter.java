package ru.ozon.id.nativeauth.data.models;

import Y9.c;
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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.id.common.disclaimer.DisclaimerDTO;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0018R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0018¨\u0006."}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/data/models/EntryDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/data/models/EntryDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/data/models/EntryDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "nullableOzonSpannableStringAdapter", "", "Lru/ozon/id/nativeauth/data/models/EntryDTO$InputDTO;", "nullableListOfInputDTOAdapter", "Lru/ozon/id/nativeauth/data/models/EntryDTO$SubmitButtonDTO;", "nullableSubmitButtonDTOAdapter", "Lru/ozon/id/nativeauth/data/models/EntryDTO$EntryButtonDTO;", "nullableListOfEntryButtonDTOAdapter", "Lru/ozon/id/nativeauth/data/models/EntryDTO$SocialLoginDTO;", "nullableSocialLoginDTOAdapter", "Lru/ozon/id/nativeauth/data/models/EntryDTO$AlertEntry;", "nullableAlertEntryAdapter", "Lru/ozon/id/common/disclaimer/DisclaimerDTO;", "nullableDisclaimerDTOAdapter", "Lru/ozon/id/nativeauth/data/models/EntryDTO$TermsOfUse;", "nullableTermsOfUseAdapter", "Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes;", "translationLexemesAdapter", "Lru/ozon/id/nativeauth/data/models/EntryDTO$FeatureFlags;", "nullableFeatureFlagsAdapter", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EntryDTOJsonAdapter extends JsonAdapter<EntryDTO> {

    @NotNull
    private final JsonAdapter<EntryDTO.AlertEntry> nullableAlertEntryAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerDTO> nullableDisclaimerDTOAdapter;

    @NotNull
    private final JsonAdapter<EntryDTO.FeatureFlags> nullableFeatureFlagsAdapter;

    @NotNull
    private final JsonAdapter<List<EntryDTO.EntryButtonDTO>> nullableListOfEntryButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<List<EntryDTO.InputDTO>> nullableListOfInputDTOAdapter;

    @NotNull
    private final JsonAdapter<OzonSpannableString> nullableOzonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<EntryDTO.SocialLoginDTO> nullableSocialLoginDTOAdapter;

    @NotNull
    private final JsonAdapter<EntryDTO.SubmitButtonDTO> nullableSubmitButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<EntryDTO.TermsOfUse> nullableTermsOfUseAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<EntryDTO.TranslationLexemes> translationLexemesAdapter;

    public EntryDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "inputs", "submitButton", "hintButtons", "socialLogin", "alertEntry", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "termsOfUseText", "translationLexemes", "featureFlags");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<OzonSpannableString> f11 = moshi.f(OzonSpannableString.class, m11, "subtitle");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableOzonSpannableStringAdapter = f11;
        JsonAdapter<List<EntryDTO.InputDTO>> f12 = moshi.f(D.e(List.class, EntryDTO.InputDTO.class), m11, "inputs");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableListOfInputDTOAdapter = f12;
        JsonAdapter<EntryDTO.SubmitButtonDTO> f13 = moshi.f(EntryDTO.SubmitButtonDTO.class, m11, "submitButton");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableSubmitButtonDTOAdapter = f13;
        JsonAdapter<List<EntryDTO.EntryButtonDTO>> f14 = moshi.f(D.e(List.class, EntryDTO.EntryButtonDTO.class), m11, "hintButtons");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableListOfEntryButtonDTOAdapter = f14;
        JsonAdapter<EntryDTO.SocialLoginDTO> f15 = moshi.f(EntryDTO.SocialLoginDTO.class, m11, "socialLogin");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableSocialLoginDTOAdapter = f15;
        JsonAdapter<EntryDTO.AlertEntry> f16 = moshi.f(EntryDTO.AlertEntry.class, m11, "alertEntry");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableAlertEntryAdapter = f16;
        JsonAdapter<DisclaimerDTO> f17 = moshi.f(DisclaimerDTO.class, m11, SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableDisclaimerDTOAdapter = f17;
        JsonAdapter<EntryDTO.TermsOfUse> f18 = moshi.f(EntryDTO.TermsOfUse.class, m11, "termsOfUseText");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableTermsOfUseAdapter = f18;
        JsonAdapter<EntryDTO.TranslationLexemes> f19 = moshi.f(EntryDTO.TranslationLexemes.class, m11, "translationLexemes");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.translationLexemesAdapter = f19;
        JsonAdapter<EntryDTO.FeatureFlags> f21 = moshi.f(EntryDTO.FeatureFlags.class, m11, "featureFlags");
        Intrinsics.checkNotNullExpressionValue(f21, "adapter(...)");
        this.nullableFeatureFlagsAdapter = f21;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(30, "GeneratedJsonAdapter(EntryDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public EntryDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        OzonSpannableString ozonSpannableString = null;
        List<EntryDTO.InputDTO> list = null;
        EntryDTO.SubmitButtonDTO submitButtonDTO = null;
        List<EntryDTO.EntryButtonDTO> list2 = null;
        EntryDTO.SocialLoginDTO socialLoginDTO = null;
        EntryDTO.AlertEntry alertEntry = null;
        DisclaimerDTO disclaimerDTO = null;
        EntryDTO.TermsOfUse termsOfUse = null;
        EntryDTO.TranslationLexemes translationLexemes = null;
        EntryDTO.FeatureFlags featureFlags = null;
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
                    ozonSpannableString = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    list = this.nullableListOfInputDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    submitButtonDTO = this.nullableSubmitButtonDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    list2 = this.nullableListOfEntryButtonDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    socialLoginDTO = this.nullableSocialLoginDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    alertEntry = this.nullableAlertEntryAdapter.fromJson(reader);
                    break;
                case 7:
                    disclaimerDTO = this.nullableDisclaimerDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    termsOfUse = this.nullableTermsOfUseAdapter.fromJson(reader);
                    break;
                case 9:
                    translationLexemes = this.translationLexemesAdapter.fromJson(reader);
                    if (translationLexemes == null) {
                        throw c.q("translationLexemes", "translationLexemes", reader);
                    }
                    break;
                case 10:
                    featureFlags = this.nullableFeatureFlagsAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (translationLexemes != null) {
            return new EntryDTO(str, ozonSpannableString, list, submitButtonDTO, list2, socialLoginDTO, alertEntry, disclaimerDTO, termsOfUse, translationLexemes, featureFlags);
        }
        throw c.j("translationLexemes", "translationLexemes", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, EntryDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("subtitle");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("inputs");
        this.nullableListOfInputDTOAdapter.mo44toJson(writer, (x) value_.getInputs());
        writer.w("submitButton");
        this.nullableSubmitButtonDTOAdapter.mo44toJson(writer, (x) value_.getSubmitButton());
        writer.w("hintButtons");
        this.nullableListOfEntryButtonDTOAdapter.mo44toJson(writer, (x) value_.getHintButtons());
        writer.w("socialLogin");
        this.nullableSocialLoginDTOAdapter.mo44toJson(writer, (x) value_.getSocialLogin());
        writer.w("alertEntry");
        this.nullableAlertEntryAdapter.mo44toJson(writer, (x) value_.getAlertEntry());
        writer.w(SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        this.nullableDisclaimerDTOAdapter.mo44toJson(writer, (x) value_.getDisclaimer());
        writer.w("termsOfUseText");
        this.nullableTermsOfUseAdapter.mo44toJson(writer, (x) value_.getTermsOfUseText());
        writer.w("translationLexemes");
        this.translationLexemesAdapter.mo44toJson(writer, (x) value_.getTranslationLexemes());
        writer.w("featureFlags");
        this.nullableFeatureFlagsAdapter.mo44toJson(writer, (x) value_.getFeatureFlags());
        writer.p();
    }
}
