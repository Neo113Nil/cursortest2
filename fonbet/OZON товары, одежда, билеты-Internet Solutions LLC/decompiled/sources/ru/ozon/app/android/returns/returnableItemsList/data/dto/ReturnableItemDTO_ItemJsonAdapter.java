package ru.ozon.app.android.returns.returnableItemsList.data.dto;

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
import ru.ozon.app.android.returns.returnableItemsList.data.dto.ReturnableItemDTO;
import ru.ozon.app.android.returns.ui.molecules.checkbox.RmsCheckbox;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.QuantitySelector;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019¨\u0006."}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO_ItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Item;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Item;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Item;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "rmsCheckboxAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "", "nullableListOfTextAtomAdapter", "Lru/ozon/uni/atoms/data/price/Price;", "priceAdapter", "nullableTextAtomAdapter", "Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Caption;", "nullableCaptionAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "nullableSmallBorderlessButtonAdapter", "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/QuantitySelector;", "nullableQuantitySelectorAdapter", "", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnableItemDTO_ItemJsonAdapter extends JsonAdapter<ReturnableItemDTO.Item> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<ReturnableItemDTO.Caption> nullableCaptionAdapter;

    @NotNull
    private final JsonAdapter<List<TextAtom>> nullableListOfTextAtomAdapter;

    @NotNull
    private final JsonAdapter<QuantitySelector> nullableQuantitySelectorAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallBorderlessButton> nullableSmallBorderlessButtonAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Price> priceAdapter;

    @NotNull
    private final JsonAdapter<RmsCheckbox> rmsCheckboxAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public ReturnableItemDTO_ItemJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("checkbox", "image", SelectionItemFormDTO.TITLE_FIELD_NAME, "attributes", "price", "quantity", "caption", "itemAction", "quantitySelector", "isDisabled", "action", "testInfo");
        M m11 = M.f71699a;
        this.rmsCheckboxAdapter = moshi.f(RmsCheckbox.class, m11, "checkbox");
        this.stringAdapter = moshi.f(String.class, m11, "image");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableListOfTextAtomAdapter = moshi.f(D.e(List.class, TextAtom.class), m11, "attributes");
        this.priceAdapter = moshi.f(Price.class, m11, "price");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "quantity");
        this.nullableCaptionAdapter = moshi.f(ReturnableItemDTO.Caption.class, m11, "caption");
        this.nullableSmallBorderlessButtonAdapter = moshi.f(ButtonV3Atom.SmallBorderlessButton.class, m11, "itemAction");
        this.nullableQuantitySelectorAdapter = moshi.f(QuantitySelector.class, m11, "quantitySelector");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isDisabled");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(ReturnableItemDTO.Item)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReturnableItemDTO.Item fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        RmsCheckbox rmsCheckbox = null;
        String str = null;
        TextAtom textAtom = null;
        List<TextAtom> list = null;
        Price price = null;
        TextAtom textAtom2 = null;
        ReturnableItemDTO.Caption caption = null;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = null;
        QuantitySelector quantitySelector = null;
        Boolean bool = null;
        AtomActionDTO atomActionDTO = null;
        TestInfo testInfo = null;
        while (true) {
            RmsCheckbox rmsCheckbox2 = rmsCheckbox;
            String str2 = str;
            if (!reader.hasNext()) {
                TextAtom textAtom3 = textAtom;
                reader.endObject();
                if (rmsCheckbox2 == null) {
                    throw c.j("checkbox", "checkbox", reader);
                }
                if (str2 == null) {
                    throw c.j("image", "image", reader);
                }
                if (textAtom3 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (price != null) {
                    return new ReturnableItemDTO.Item(rmsCheckbox2, str2, textAtom3, list, price, textAtom2, caption, smallBorderlessButton, quantitySelector, bool, atomActionDTO, testInfo);
                }
                throw c.j("price", "price", reader);
            }
            TextAtom textAtom4 = textAtom;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    textAtom = textAtom4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 0:
                    rmsCheckbox = this.rmsCheckboxAdapter.fromJson(reader);
                    if (rmsCheckbox == null) {
                        throw c.q("checkbox", "checkbox", reader);
                    }
                    textAtom = textAtom4;
                    str = str2;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("image", "image", reader);
                    }
                    textAtom = textAtom4;
                    rmsCheckbox = rmsCheckbox2;
                case 2:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 3:
                    list = this.nullableListOfTextAtomAdapter.fromJson(reader);
                    textAtom = textAtom4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 4:
                    price = this.priceAdapter.fromJson(reader);
                    if (price == null) {
                        throw c.q("price", "price", reader);
                    }
                    textAtom = textAtom4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 5:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    textAtom = textAtom4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 6:
                    caption = this.nullableCaptionAdapter.fromJson(reader);
                    textAtom = textAtom4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 7:
                    smallBorderlessButton = this.nullableSmallBorderlessButtonAdapter.fromJson(reader);
                    textAtom = textAtom4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 8:
                    quantitySelector = this.nullableQuantitySelectorAdapter.fromJson(reader);
                    textAtom = textAtom4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 9:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    textAtom = textAtom4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 10:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    textAtom = textAtom4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 11:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    textAtom = textAtom4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                default:
                    textAtom = textAtom4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReturnableItemDTO.Item value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("checkbox");
        this.rmsCheckboxAdapter.mo44toJson(writer, (x) value.getCheckbox());
        writer.w("image");
        this.stringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("attributes");
        this.nullableListOfTextAtomAdapter.mo44toJson(writer, (x) value.getAttributes());
        writer.w("price");
        this.priceAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("quantity");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getQuantity());
        writer.w("caption");
        this.nullableCaptionAdapter.mo44toJson(writer, (x) value.getCaption());
        writer.w("itemAction");
        this.nullableSmallBorderlessButtonAdapter.mo44toJson(writer, (x) value.getItemAction());
        writer.w("quantitySelector");
        this.nullableQuantitySelectorAdapter.mo44toJson(writer, (x) value.getQuantitySelector());
        writer.w("isDisabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isDisabled());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.p();
    }
}
