package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.data.AddToCartButtonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R(\u0010)\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020(\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseOldTileDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseOldTileDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseOldTileDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseOldTileDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "productMediaDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;", "nullableFavoriteProductMoleculeV2Adapter", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceDTOAdapter", "nullablePriceDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/app/android/atoms/data/labelList/LabelListAtom;", "nullableLabelListAtomAdapter", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;", "addToCartButtonDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WiseOldTileDTOJsonAdapter extends JsonAdapter<WiseOldTileDTO> {

    @NotNull
    private final JsonAdapter<AddToCartButtonDTO> addToCartButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<FavoriteProductMoleculeV2> nullableFavoriteProductMoleculeV2Adapter;

    @NotNull
    private final JsonAdapter<LabelListAtom> nullableLabelListAtomAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<PriceDTO> nullablePriceDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PriceDTO> priceDTOAdapter;

    @NotNull
    private final JsonAdapter<ProductMediaDTO> productMediaDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public WiseOldTileDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("image", "favoriteButton", "price", "priceWithDiscount", SelectionItemFormDTO.TITLE_FIELD_NAME, "labels", "addToCartButton", "action", "trackingInfo");
        M m11 = M.f71699a;
        this.productMediaDTOAdapter = moshi.f(ProductMediaDTO.class, m11, "image");
        this.nullableFavoriteProductMoleculeV2Adapter = moshi.f(FavoriteProductMoleculeV2.class, m11, "favoriteButton");
        this.priceDTOAdapter = moshi.f(PriceDTO.class, m11, "price");
        this.nullablePriceDTOAdapter = moshi.f(PriceDTO.class, m11, "priceWithDiscount");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableLabelListAtomAdapter = moshi.f(LabelListAtom.class, m11, "labels");
        this.addToCartButtonDTOAdapter = moshi.f(AddToCartButtonDTO.class, m11, "addToCartButton");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(WiseOldTileDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public WiseOldTileDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ProductMediaDTO productMediaDTO = null;
        FavoriteProductMoleculeV2 favoriteProductMoleculeV2 = null;
        PriceDTO priceDTO = null;
        PriceDTO priceDTO2 = null;
        TextDTO textDTO = null;
        LabelListAtom labelListAtom = null;
        AddToCartButtonDTO addToCartButtonDTO = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            ProductMediaDTO productMediaDTO2 = productMediaDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    productMediaDTO = this.productMediaDTOAdapter.fromJson(reader);
                    if (productMediaDTO == null) {
                        throw c.q("image", "image", reader);
                    }
                    continue;
                case 1:
                    favoriteProductMoleculeV2 = this.nullableFavoriteProductMoleculeV2Adapter.fromJson(reader);
                    break;
                case 2:
                    priceDTO = this.priceDTOAdapter.fromJson(reader);
                    if (priceDTO == null) {
                        throw c.q("price", "price", reader);
                    }
                    break;
                case 3:
                    priceDTO2 = this.nullablePriceDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 5:
                    labelListAtom = this.nullableLabelListAtomAdapter.fromJson(reader);
                    break;
                case 6:
                    addToCartButtonDTO = this.addToCartButtonDTOAdapter.fromJson(reader);
                    if (addToCartButtonDTO == null) {
                        throw c.q("addToCartButton", "addToCartButton", reader);
                    }
                    break;
                case 7:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("action", "action", reader);
                    }
                    break;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
            productMediaDTO = productMediaDTO2;
        }
        ProductMediaDTO productMediaDTO3 = productMediaDTO;
        reader.endObject();
        if (productMediaDTO3 == null) {
            throw c.j("image", "image", reader);
        }
        if (priceDTO == null) {
            throw c.j("price", "price", reader);
        }
        if (textDTO == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (addToCartButtonDTO == null) {
            throw c.j("addToCartButton", "addToCartButton", reader);
        }
        if (atomActionDTO != null) {
            return new WiseOldTileDTO(productMediaDTO3, favoriteProductMoleculeV2, priceDTO, priceDTO2, textDTO, labelListAtom, addToCartButtonDTO, atomActionDTO, map);
        }
        throw c.j("action", "action", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, WiseOldTileDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.productMediaDTOAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("favoriteButton");
        this.nullableFavoriteProductMoleculeV2Adapter.mo44toJson(writer, (x) value.getFavoriteButton());
        writer.w("price");
        this.priceDTOAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("priceWithDiscount");
        this.nullablePriceDTOAdapter.mo44toJson(writer, (x) value.getPriceWithDiscount());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("labels");
        this.nullableLabelListAtomAdapter.mo44toJson(writer, (x) value.getLabels());
        writer.w("addToCartButton");
        this.addToCartButtonDTOAdapter.mo44toJson(writer, (x) value.getAddToCartButton());
        writer.w("action");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
