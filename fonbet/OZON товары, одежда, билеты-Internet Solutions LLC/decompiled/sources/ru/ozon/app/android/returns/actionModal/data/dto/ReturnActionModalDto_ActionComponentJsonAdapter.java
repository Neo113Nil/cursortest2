package ru.ozon.app.android.returns.actionModal.data.dto;

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
import ru.ozon.app.android.returns.actionModal.data.dto.ReturnActionModalDto;
import ru.ozon.app.android.returns.ui.data.components.RmsInputDto;
import ru.ozon.app.android.returns.ui.data.components.RmsTextAreaDto;
import ru.ozon.app.android.returns.ui.data.components.RmsUploadPhotosDto;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto_ActionComponentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto$ActionComponent;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto$ActionComponent;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto$ActionComponent;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTextAtomAdapter", "nullableStringAdapter", "Lru/ozon/app/android/returns/ui/data/components/RmsInputDto;", "nullableRmsInputDtoAdapter", "Lru/ozon/app/android/returns/ui/data/components/RmsTextAreaDto;", "nullableRmsTextAreaDtoAdapter", "Lru/ozon/app/android/returns/ui/data/components/RmsUploadPhotosDto;", "nullableRmsUploadPhotosDtoAdapter", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnActionModalDto_ActionComponentJsonAdapter extends JsonAdapter<ReturnActionModalDto.ActionComponent> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<RmsInputDto> nullableRmsInputDtoAdapter;

    @NotNull
    private final JsonAdapter<RmsTextAreaDto> nullableRmsTextAreaDtoAdapter;

    @NotNull
    private final JsonAdapter<RmsUploadPhotosDto> nullableRmsUploadPhotosDtoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public ReturnActionModalDto_ActionComponentJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "emptyComponentErrorText", "input", SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, "uploadPhotos");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "subtitle");
        this.nullableStringAdapter = moshi.f(String.class, m11, "emptyComponentErrorText");
        this.nullableRmsInputDtoAdapter = moshi.f(RmsInputDto.class, m11, "input");
        this.nullableRmsTextAreaDtoAdapter = moshi.f(RmsTextAreaDto.class, m11, SelectionItemFormDTO.TEXT_AREA_FIELD_NAME);
        this.nullableRmsUploadPhotosDtoAdapter = moshi.f(RmsUploadPhotosDto.class, m11, "uploadPhotos");
    }

    @NotNull
    public String toString() {
        return b.c(58, "GeneratedJsonAdapter(ReturnActionModalDto.ActionComponent)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReturnActionModalDto.ActionComponent fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        String str = null;
        RmsInputDto rmsInputDto = null;
        RmsTextAreaDto rmsTextAreaDto = null;
        RmsUploadPhotosDto rmsUploadPhotosDto = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    rmsInputDto = this.nullableRmsInputDtoAdapter.fromJson(reader);
                    break;
                case 4:
                    rmsTextAreaDto = this.nullableRmsTextAreaDtoAdapter.fromJson(reader);
                    break;
                case 5:
                    rmsUploadPhotosDto = this.nullableRmsUploadPhotosDtoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (textAtom != null) {
            return new ReturnActionModalDto.ActionComponent(textAtom, textAtom2, str, rmsInputDto, rmsTextAreaDto, rmsUploadPhotosDto);
        }
        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReturnActionModalDto.ActionComponent value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("emptyComponentErrorText");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getEmptyComponentErrorText());
        writer.w("input");
        this.nullableRmsInputDtoAdapter.mo44toJson(writer, (x) value.getInput());
        writer.w(SelectionItemFormDTO.TEXT_AREA_FIELD_NAME);
        this.nullableRmsTextAreaDtoAdapter.mo44toJson(writer, (x) value.getTextArea());
        writer.w("uploadPhotos");
        this.nullableRmsUploadPhotosDtoAdapter.mo44toJson(writer, (x) value.getUploadPhotos());
        writer.p();
    }
}
