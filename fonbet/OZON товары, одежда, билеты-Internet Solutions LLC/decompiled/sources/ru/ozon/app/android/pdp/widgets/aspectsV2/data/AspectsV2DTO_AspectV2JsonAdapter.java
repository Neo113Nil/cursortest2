package ru.ozon.app.android.pdp.widgets.aspectsV2.data;

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
import ru.ozon.app.android.pdp.widgets.aspectsV2.data.AspectsV2DTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO_AspectV2JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantV2;", "listOfVariantV2Adapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "nullableLargeBorderlessButtonAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "nullableSmallBorderlessButtonWithIconAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2$Footer;", "nullableFooterAdapter", "", "nullableBooleanAdapter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV2DTO_AspectV2JsonAdapter extends JsonAdapter<AspectsV2DTO.AspectV2> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<AspectsV2DTO.VariantV2>> listOfVariantV2Adapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<AspectsV2DTO.AspectV2.Footer> nullableFooterAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeBorderlessButton> nullableLargeBorderlessButtonAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallBorderlessButtonWithIcon> nullableSmallBorderlessButtonWithIconAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public AspectsV2DTO_AspectV2JsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "type", "variants", "moreVariantsButton", "additionalButton", "titleAtom", "additionalButtonAtom", CommentV3DTO.FOOTER_FIELD_NAME, "shouldRefreshToTop");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter = moshi.f(String.class, m11, "type");
        this.listOfVariantV2Adapter = moshi.f(D.e(List.class, AspectsV2DTO.VariantV2.class), m11, "variants");
        this.nullableLargeBorderlessButtonAdapter = moshi.f(ButtonV3Atom.LargeBorderlessButton.class, m11, "moreVariantsButton");
        this.nullableSmallBorderlessButtonWithIconAdapter = moshi.f(ButtonV3Atom.SmallBorderlessButtonWithIcon.class, m11, "additionalButton");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "titleAtom");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "additionalButtonAtom");
        this.nullableFooterAdapter = moshi.f(AspectsV2DTO.AspectV2.Footer.class, m11, CommentV3DTO.FOOTER_FIELD_NAME);
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "shouldRefreshToTop");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(AspectsV2DTO.AspectV2)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AspectsV2DTO.AspectV2 fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        List<AspectsV2DTO.VariantV2> list = null;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = null;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon = null;
        TextDTO textDTO = null;
        ButtonV3DTO buttonV3DTO = null;
        AspectsV2DTO.AspectV2.Footer footer = null;
        Boolean bool = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("type", "type", reader);
                    }
                    break;
                case 3:
                    list = this.listOfVariantV2Adapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("variants", "variants", reader);
                    }
                    break;
                case 4:
                    largeBorderlessButton = this.nullableLargeBorderlessButtonAdapter.fromJson(reader);
                    break;
                case 5:
                    smallBorderlessButtonWithIcon = this.nullableSmallBorderlessButtonWithIconAdapter.fromJson(reader);
                    break;
                case 6:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 8:
                    footer = this.nullableFooterAdapter.fromJson(reader);
                    break;
                case 9:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str3 == null) {
            throw c.j("type", "type", reader);
        }
        if (list != null) {
            return new AspectsV2DTO.AspectV2(str, str2, str3, list, largeBorderlessButton, smallBorderlessButtonWithIcon, textDTO, buttonV3DTO, footer, bool);
        }
        throw c.j("variants", "variants", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AspectsV2DTO.AspectV2 value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("type");
        this.stringAdapter.mo44toJson(writer, (x) value.getType());
        writer.w("variants");
        this.listOfVariantV2Adapter.mo44toJson(writer, (x) value.getVariants());
        writer.w("moreVariantsButton");
        this.nullableLargeBorderlessButtonAdapter.mo44toJson(writer, (x) value.getMoreVariantsButton());
        writer.w("additionalButton");
        this.nullableSmallBorderlessButtonWithIconAdapter.mo44toJson(writer, (x) value.getAdditionalButton());
        writer.w("titleAtom");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getTitleAtom());
        writer.w("additionalButtonAtom");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getAdditionalButtonAtom());
        writer.w(CommentV3DTO.FOOTER_FIELD_NAME);
        this.nullableFooterAdapter.mo44toJson(writer, (x) value.getFooter());
        writer.w("shouldRefreshToTop");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getShouldRefreshToTop());
        writer.p();
    }
}
