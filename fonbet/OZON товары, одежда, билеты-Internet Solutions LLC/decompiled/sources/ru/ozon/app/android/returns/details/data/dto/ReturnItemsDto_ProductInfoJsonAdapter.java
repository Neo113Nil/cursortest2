package ru.ozon.app.android.returns.details.data.dto;

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
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.app.android.returns.details.data.dto.ReturnItemsDto;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto_ProductInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ProductInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ProductInfo;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ProductInfo;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "smallBorderlessButtonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/price/Price;", "priceAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "", "nullableListOfTextAtomAdapter", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ExemplarState;", "nullableListOfExemplarStateAdapter", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "imageDTOAdapter", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnItemsDto_ProductInfoJsonAdapter extends JsonAdapter<ReturnItemsDto.ProductInfo> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ReturnItemsDto.ExemplarState>> nullableListOfExemplarStateAdapter;

    @NotNull
    private final JsonAdapter<List<TextAtom>> nullableListOfTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Price> priceAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallBorderlessButton> smallBorderlessButtonAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public ReturnItemsDto_ProductInfoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("productLink", "price", "quantity", "attributes", "exemplarStates", "itemImage");
        M m11 = M.f71699a;
        this.smallBorderlessButtonAdapter = moshi.f(ButtonV3Atom.SmallBorderlessButton.class, m11, "productLink");
        this.priceAdapter = moshi.f(Price.class, m11, "price");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, "quantity");
        this.nullableListOfTextAtomAdapter = moshi.f(D.e(List.class, TextAtom.class), m11, "attributes");
        this.nullableListOfExemplarStateAdapter = moshi.f(D.e(List.class, ReturnItemsDto.ExemplarState.class), m11, "exemplarStates");
        this.imageDTOAdapter = moshi.f(ImageDTO.class, m11, "itemImage");
    }

    @NotNull
    public String toString() {
        return b.c(48, "GeneratedJsonAdapter(ReturnItemsDto.ProductInfo)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReturnItemsDto.ProductInfo fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = null;
        Price price = null;
        TextAtom textAtom = null;
        List<TextAtom> list = null;
        List<ReturnItemsDto.ExemplarState> list2 = null;
        ImageDTO imageDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    smallBorderlessButton = this.smallBorderlessButtonAdapter.fromJson(reader);
                    if (smallBorderlessButton == null) {
                        throw c.q("productLink", "productLink", reader);
                    }
                    break;
                case 1:
                    price = this.priceAdapter.fromJson(reader);
                    if (price == null) {
                        throw c.q("price", "price", reader);
                    }
                    break;
                case 2:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q("quantity", "quantity", reader);
                    }
                    break;
                case 3:
                    list = this.nullableListOfTextAtomAdapter.fromJson(reader);
                    break;
                case 4:
                    list2 = this.nullableListOfExemplarStateAdapter.fromJson(reader);
                    break;
                case 5:
                    imageDTO = this.imageDTOAdapter.fromJson(reader);
                    if (imageDTO == null) {
                        throw c.q("itemImage", "itemImage", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (smallBorderlessButton == null) {
            throw c.j("productLink", "productLink", reader);
        }
        if (price == null) {
            throw c.j("price", "price", reader);
        }
        if (textAtom == null) {
            throw c.j("quantity", "quantity", reader);
        }
        if (imageDTO != null) {
            return new ReturnItemsDto.ProductInfo(smallBorderlessButton, price, textAtom, list, list2, imageDTO);
        }
        throw c.j("itemImage", "itemImage", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReturnItemsDto.ProductInfo value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("productLink");
        this.smallBorderlessButtonAdapter.mo44toJson(writer, (x) value.getProductLink());
        writer.w("price");
        this.priceAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("quantity");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getQuantity());
        writer.w("attributes");
        this.nullableListOfTextAtomAdapter.mo44toJson(writer, (x) value.getAttributes());
        writer.w("exemplarStates");
        this.nullableListOfExemplarStateAdapter.mo44toJson(writer, (x) value.getExemplarStates());
        writer.w("itemImage");
        this.imageDTOAdapter.mo44toJson(writer, (x) value.getItemImage());
        writer.p();
    }
}
