package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo;

import Fj.c;
import Fm.C3051a;
import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.data.AddToCartButtonDTO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollElement;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0080\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b.\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseOldTileVO;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollElement;", "", "id", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "mediaModel", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "favoriteButton", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "priceWithDiscount", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/atoms/data/labelList/LabelListAtom;", "labels", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;", "addToCartButton", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/atoms/data/labelList/LabelListAtom;Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getMediaModel", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getFavoriteButton", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPriceWithDiscount", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/atoms/data/labelList/LabelListAtom;", "getLabels", "()Lru/ozon/app/android/atoms/data/labelList/LabelListAtom;", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;", "getAddToCartButton", "()Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WiseOldTileVO implements WiseSkuScrollElement {

    @NotNull
    private final AddToCartButtonDTO addToCartButton;
    private final AtomAction atomAction;
    private final FavoriteProductMolecule favoriteButton;
    private final long id;
    private final LabelListAtom labels;

    @NotNull
    private final ProductMediaDTO mediaModel;

    @NotNull
    private final PriceDTO price;
    private final PriceDTO priceWithDiscount;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    public WiseOldTileVO(long j11, @NotNull ProductMediaDTO mediaModel, FavoriteProductMolecule favoriteProductMolecule, @NotNull PriceDTO price, PriceDTO priceDTO, @NotNull TextDTO title, LabelListAtom labelListAtom, @NotNull AddToCartButtonDTO addToCartButton, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(mediaModel, "mediaModel");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(addToCartButton, "addToCartButton");
        this.id = j11;
        this.mediaModel = mediaModel;
        this.favoriteButton = favoriteProductMolecule;
        this.price = price;
        this.priceWithDiscount = priceDTO;
        this.title = title;
        this.labels = labelListAtom;
        this.addToCartButton = addToCartButton;
        this.atomAction = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WiseOldTileVO)) {
            return false;
        }
        WiseOldTileVO wiseOldTileVO = (WiseOldTileVO) other;
        return this.id == wiseOldTileVO.id && Intrinsics.d(this.mediaModel, wiseOldTileVO.mediaModel) && Intrinsics.d(this.favoriteButton, wiseOldTileVO.favoriteButton) && Intrinsics.d(this.price, wiseOldTileVO.price) && Intrinsics.d(this.priceWithDiscount, wiseOldTileVO.priceWithDiscount) && Intrinsics.d(this.title, wiseOldTileVO.title) && Intrinsics.d(this.labels, wiseOldTileVO.labels) && Intrinsics.d(this.addToCartButton, wiseOldTileVO.addToCartButton) && Intrinsics.d(this.atomAction, wiseOldTileVO.atomAction) && Intrinsics.d(this.tokenizedEvent, wiseOldTileVO.tokenizedEvent);
    }

    @NotNull
    public final AddToCartButtonDTO getAddToCartButton() {
        return this.addToCartButton;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollElement
    public AtomAction getAtomAction() {
        return this.atomAction;
    }

    public final FavoriteProductMolecule getFavoriteButton() {
        return this.favoriteButton;
    }

    public final long getId() {
        return this.id;
    }

    public final LabelListAtom getLabels() {
        return this.labels;
    }

    @NotNull
    public final ProductMediaDTO getMediaModel() {
        return this.mediaModel;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    public final PriceDTO getPriceWithDiscount() {
        return this.priceWithDiscount;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollElement
    public t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int hashCode = (this.mediaModel.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        FavoriteProductMolecule favoriteProductMolecule = this.favoriteButton;
        int b11 = C3051a.b(this.price, (hashCode + (favoriteProductMolecule == null ? 0 : favoriteProductMolecule.hashCode())) * 31, 31);
        PriceDTO priceDTO = this.priceWithDiscount;
        int a11 = b.a(this.title, (b11 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31, 31);
        LabelListAtom labelListAtom = this.labels;
        int hashCode2 = (this.addToCartButton.hashCode() + ((a11 + (labelListAtom == null ? 0 : labelListAtom.hashCode())) * 31)) * 31;
        AtomAction atomAction = this.atomAction;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ProductMediaDTO productMediaDTO = this.mediaModel;
        FavoriteProductMolecule favoriteProductMolecule = this.favoriteButton;
        PriceDTO priceDTO = this.price;
        PriceDTO priceDTO2 = this.priceWithDiscount;
        TextDTO textDTO = this.title;
        LabelListAtom labelListAtom = this.labels;
        AddToCartButtonDTO addToCartButtonDTO = this.addToCartButton;
        AtomAction atomAction = this.atomAction;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("WiseOldTileVO(id=");
        sb2.append(j11);
        sb2.append(", mediaModel=");
        sb2.append(productMediaDTO);
        sb2.append(", favoriteButton=");
        sb2.append(favoriteProductMolecule);
        sb2.append(", price=");
        sb2.append(priceDTO);
        sb2.append(", priceWithDiscount=");
        sb2.append(priceDTO2);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", labels=");
        sb2.append(labelListAtom);
        sb2.append(", addToCartButton=");
        sb2.append(addToCartButtonDTO);
        c.e(tVar, ", atomAction=", ", tokenizedEvent=", sb2, atomAction);
        sb2.append(")");
        return sb2.toString();
    }
}
