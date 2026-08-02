package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.data;

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
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.data.ProductsInBotDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/data/ProductsInBotDTO_BotItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/data/ProductsInBotDTO$BotItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/data/ProductsInBotDTO$BotItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/data/ProductsInBotDTO$BotItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/price/Price;", "priceAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "stringAdapter", "", "intAdapter", "", "longAdapter", "", "booleanAdapter", "nullableTextAtomAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "nullableSmallIconButtonAdapter", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductsInBotDTO_BotItemDTOJsonAdapter extends JsonAdapter<ProductsInBotDTO.BotItemDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallIconButton> nullableSmallIconButtonAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Price> priceAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public ProductsInBotDTO_BotItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("price", SelectionItemFormDTO.TITLE_FIELD_NAME, "image", "maxQuantity", "skuId", "isChecked", "aspects", "minusButton", "plusButton");
        M m11 = M.f71699a;
        this.priceAdapter = moshi.f(Price.class, m11, "price");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter = moshi.f(String.class, m11, "image");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "maxQuantity");
        this.longAdapter = moshi.f(Long.TYPE, m11, "skuId");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isChecked");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "aspects");
        this.nullableSmallIconButtonAdapter = moshi.f(ButtonV3Atom.SmallIconButton.class, m11, "minusButton");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(ProductsInBotDTO.BotItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProductsInBotDTO.BotItemDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Long l11 = null;
        Price price = null;
        TextAtom textAtom = null;
        String str = null;
        Boolean bool = null;
        TextAtom textAtom2 = null;
        ButtonV3Atom.SmallIconButton smallIconButton = null;
        ButtonV3Atom.SmallIconButton smallIconButton2 = null;
        while (true) {
            Integer num2 = num;
            Long l12 = l11;
            if (!reader.hasNext()) {
                reader.endObject();
                if (price == null) {
                    throw c.j("price", "price", reader);
                }
                if (textAtom == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (str == null) {
                    throw c.j("image", "image", reader);
                }
                if (num2 == null) {
                    throw c.j("maxQuantity", "maxQuantity", reader);
                }
                int intValue = num2.intValue();
                if (l12 == null) {
                    throw c.j("skuId", "skuId", reader);
                }
                long longValue = l12.longValue();
                if (bool != null) {
                    return new ProductsInBotDTO.BotItemDTO(price, textAtom, str, intValue, longValue, bool.booleanValue(), textAtom2, smallIconButton, smallIconButton2);
                }
                throw c.j("isChecked", "isChecked", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num2;
                    l11 = l12;
                case 0:
                    price = this.priceAdapter.fromJson(reader);
                    if (price == null) {
                        throw c.q("price", "price", reader);
                    }
                    num = num2;
                    l11 = l12;
                case 1:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    num = num2;
                    l11 = l12;
                case 2:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("image", "image", reader);
                    }
                    num = num2;
                    l11 = l12;
                case 3:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("maxQuantity", "maxQuantity", reader);
                    }
                    l11 = l12;
                case 4:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("skuId", "skuId", reader);
                    }
                    num = num2;
                case 5:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isChecked", "isChecked", reader);
                    }
                    num = num2;
                    l11 = l12;
                case 6:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    num = num2;
                    l11 = l12;
                case 7:
                    smallIconButton = this.nullableSmallIconButtonAdapter.fromJson(reader);
                    num = num2;
                    l11 = l12;
                case 8:
                    smallIconButton2 = this.nullableSmallIconButtonAdapter.fromJson(reader);
                    num = num2;
                    l11 = l12;
                default:
                    num = num2;
                    l11 = l12;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProductsInBotDTO.BotItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("price");
        this.priceAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("image");
        this.stringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("maxQuantity");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxQuantity()));
        writer.w("skuId");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getSkuId()));
        writer.w("isChecked");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isChecked()));
        writer.w("aspects");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getAspects());
        writer.w("minusButton");
        this.nullableSmallIconButtonAdapter.mo44toJson(writer, (x) value.getMinusButton());
        writer.w("plusButton");
        this.nullableSmallIconButtonAdapter.mo44toJson(writer, (x) value.getPlusButton());
        writer.p();
    }
}
