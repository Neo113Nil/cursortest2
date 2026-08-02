package ru.ozon.app.android.ugc.widgets.reviewFormMobile.data;

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
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.InputSelectButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO_VariantPickerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$VariantPickerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$VariantPickerDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$VariantPickerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO;", "inputSelectButtonDTOAdapter", "nullableTextDTOAdapter", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$VariantPickerDTO$VariantDTO;", "nullableListOfVariantDTOAdapter", "", "nullableBooleanAdapter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormFieldDTO_VariantPickerDTOJsonAdapter extends JsonAdapter<ReviewFormFieldDTO.VariantPickerDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<InputSelectButtonDTO> inputSelectButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<List<ReviewFormFieldDTO.VariantPickerDTO.VariantDTO>> nullableListOfVariantDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public ReviewFormFieldDTO_VariantPickerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("uploadKey", SelectionItemFormDTO.TITLE_FIELD_NAME, "selectionButton", "variantsHeader", "variants", "isHidden");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "uploadKey");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.inputSelectButtonDTOAdapter = moshi.f(InputSelectButtonDTO.class, m11, "selectionButton");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "variantsHeader");
        this.nullableListOfVariantDTOAdapter = moshi.f(D.e(List.class, ReviewFormFieldDTO.VariantPickerDTO.VariantDTO.class), m11, "variants");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isHidden");
    }

    @NotNull
    public String toString() {
        return b.c(57, "GeneratedJsonAdapter(ReviewFormFieldDTO.VariantPickerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReviewFormFieldDTO.VariantPickerDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        TextDTO textDTO = null;
        InputSelectButtonDTO inputSelectButtonDTO = null;
        TextDTO textDTO2 = null;
        List<ReviewFormFieldDTO.VariantPickerDTO.VariantDTO> list = null;
        Boolean bool = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("uploadKey", "uploadKey", reader);
                    }
                    break;
                case 1:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 2:
                    inputSelectButtonDTO = this.inputSelectButtonDTOAdapter.fromJson(reader);
                    if (inputSelectButtonDTO == null) {
                        throw c.q("selectionButton", "selectionButton", reader);
                    }
                    break;
                case 3:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    list = this.nullableListOfVariantDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("uploadKey", "uploadKey", reader);
        }
        if (textDTO == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (inputSelectButtonDTO != null) {
            return new ReviewFormFieldDTO.VariantPickerDTO(str, textDTO, inputSelectButtonDTO, textDTO2, list, bool);
        }
        throw c.j("selectionButton", "selectionButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReviewFormFieldDTO.VariantPickerDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("uploadKey");
        this.stringAdapter.mo44toJson(writer, (x) value.getUploadKey());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("selectionButton");
        this.inputSelectButtonDTOAdapter.mo44toJson(writer, (x) value.getSelectionButton());
        writer.w("variantsHeader");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getVariantsHeader());
        writer.w("variants");
        this.nullableListOfVariantDTOAdapter.mo44toJson(writer, (x) value.getVariants());
        writer.w("isHidden");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isHidden());
        writer.p();
    }
}
