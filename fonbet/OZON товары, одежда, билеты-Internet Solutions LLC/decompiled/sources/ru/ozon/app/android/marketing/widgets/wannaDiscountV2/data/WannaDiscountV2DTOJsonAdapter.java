package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data;

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
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.WannaDiscountV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R(\u0010+\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019¨\u0006,"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "smallIconButtonAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceBlock;", "priceBlockAdapter", "", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "listOfTagAtomAdapter", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40Icon;", "nullableCellWithSubtitle40IconAdapter", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;", "priceInputBlockAdapter", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock;", "quantityInputBlockAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WannaDiscountV2DTOJsonAdapter extends JsonAdapter<WannaDiscountV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<List<TagV3Atom.TagAtom>> listOfTagAtomAdapter;

    @NotNull
    private final JsonAdapter<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon> nullableCellWithSubtitle40IconAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<WannaDiscountV2DTO.PriceBlock> priceBlockAdapter;

    @NotNull
    private final JsonAdapter<WannaDiscountV2DTO.PriceInputBlock> priceInputBlockAdapter;

    @NotNull
    private final JsonAdapter<WannaDiscountV2DTO.QuantityInputBlock> quantityInputBlockAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallIconButton> smallIconButtonAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public WannaDiscountV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "infoButton", "sendButton", "priceBlock", "discounts", "seller", "priceInput", "quantityInput", "trackingInfo");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.smallIconButtonAdapter = moshi.f(ButtonV3Atom.SmallIconButton.class, m11, "infoButton");
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "sendButton");
        this.priceBlockAdapter = moshi.f(WannaDiscountV2DTO.PriceBlock.class, m11, "priceBlock");
        this.listOfTagAtomAdapter = moshi.f(D.e(List.class, TagV3Atom.TagAtom.class), m11, "discounts");
        this.nullableCellWithSubtitle40IconAdapter = moshi.f(CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon.class, m11, "seller");
        this.priceInputBlockAdapter = moshi.f(WannaDiscountV2DTO.PriceInputBlock.class, m11, "priceInput");
        this.quantityInputBlockAdapter = moshi.f(WannaDiscountV2DTO.QuantityInputBlock.class, m11, "quantityInput");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(WannaDiscountV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public WannaDiscountV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        ButtonV3Atom.SmallIconButton smallIconButton = null;
        ButtonV3Atom.LargeButton largeButton = null;
        WannaDiscountV2DTO.PriceBlock priceBlock = null;
        List<TagV3Atom.TagAtom> list = null;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon cellWithSubtitle40Icon = null;
        WannaDiscountV2DTO.PriceInputBlock priceInputBlock = null;
        WannaDiscountV2DTO.QuantityInputBlock quantityInputBlock = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            TextAtom textAtom3 = textAtom;
            TextAtom textAtom4 = textAtom2;
            ButtonV3Atom.SmallIconButton smallIconButton2 = smallIconButton;
            ButtonV3Atom.LargeButton largeButton2 = largeButton;
            if (!reader.hasNext()) {
                WannaDiscountV2DTO.PriceBlock priceBlock2 = priceBlock;
                reader.endObject();
                if (textAtom3 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (textAtom4 == null) {
                    throw c.j("subtitle", "subtitle", reader);
                }
                if (smallIconButton2 == null) {
                    throw c.j("infoButton", "infoButton", reader);
                }
                if (largeButton2 == null) {
                    throw c.j("sendButton", "sendButton", reader);
                }
                if (priceBlock2 == null) {
                    throw c.j("priceBlock", "priceBlock", reader);
                }
                if (list == null) {
                    throw c.j("discounts", "discounts", reader);
                }
                if (priceInputBlock == null) {
                    throw c.j("priceInput", "priceInput", reader);
                }
                if (quantityInputBlock != null) {
                    return new WannaDiscountV2DTO(textAtom3, textAtom4, smallIconButton2, largeButton2, priceBlock2, list, cellWithSubtitle40Icon, priceInputBlock, quantityInputBlock, map);
                }
                throw c.j("quantityInput", "quantityInput", reader);
            }
            WannaDiscountV2DTO.PriceBlock priceBlock3 = priceBlock;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    priceBlock = priceBlock3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    smallIconButton = smallIconButton2;
                    largeButton = largeButton2;
                case 0:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    priceBlock = priceBlock3;
                    textAtom2 = textAtom4;
                    smallIconButton = smallIconButton2;
                    largeButton = largeButton2;
                case 1:
                    textAtom2 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom2 == null) {
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    priceBlock = priceBlock3;
                    textAtom = textAtom3;
                    smallIconButton = smallIconButton2;
                    largeButton = largeButton2;
                case 2:
                    smallIconButton = this.smallIconButtonAdapter.fromJson(reader);
                    if (smallIconButton == null) {
                        throw c.q("infoButton", "infoButton", reader);
                    }
                    priceBlock = priceBlock3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    largeButton = largeButton2;
                case 3:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("sendButton", "sendButton", reader);
                    }
                    priceBlock = priceBlock3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    smallIconButton = smallIconButton2;
                case 4:
                    priceBlock = this.priceBlockAdapter.fromJson(reader);
                    if (priceBlock == null) {
                        throw c.q("priceBlock", "priceBlock", reader);
                    }
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    smallIconButton = smallIconButton2;
                    largeButton = largeButton2;
                case 5:
                    list = this.listOfTagAtomAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("discounts", "discounts", reader);
                    }
                    priceBlock = priceBlock3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    smallIconButton = smallIconButton2;
                    largeButton = largeButton2;
                case 6:
                    cellWithSubtitle40Icon = this.nullableCellWithSubtitle40IconAdapter.fromJson(reader);
                    priceBlock = priceBlock3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    smallIconButton = smallIconButton2;
                    largeButton = largeButton2;
                case 7:
                    priceInputBlock = this.priceInputBlockAdapter.fromJson(reader);
                    if (priceInputBlock == null) {
                        throw c.q("priceInput", "priceInput", reader);
                    }
                    priceBlock = priceBlock3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    smallIconButton = smallIconButton2;
                    largeButton = largeButton2;
                case 8:
                    quantityInputBlock = this.quantityInputBlockAdapter.fromJson(reader);
                    if (quantityInputBlock == null) {
                        throw c.q("quantityInput", "quantityInput", reader);
                    }
                    priceBlock = priceBlock3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    smallIconButton = smallIconButton2;
                    largeButton = largeButton2;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    priceBlock = priceBlock3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    smallIconButton = smallIconButton2;
                    largeButton = largeButton2;
                default:
                    priceBlock = priceBlock3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    smallIconButton = smallIconButton2;
                    largeButton = largeButton2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, WannaDiscountV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("infoButton");
        this.smallIconButtonAdapter.mo44toJson(writer, (x) value.getInfoButton());
        writer.w("sendButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getSendButton());
        writer.w("priceBlock");
        this.priceBlockAdapter.mo44toJson(writer, (x) value.getPriceBlock());
        writer.w("discounts");
        this.listOfTagAtomAdapter.mo44toJson(writer, (x) value.getDiscounts());
        writer.w("seller");
        this.nullableCellWithSubtitle40IconAdapter.mo44toJson(writer, (x) value.getSeller());
        writer.w("priceInput");
        this.priceInputBlockAdapter.mo44toJson(writer, (x) value.getPriceInput());
        writer.w("quantityInput");
        this.quantityInputBlockAdapter.mo44toJson(writer, (x) value.getQuantityInput());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
