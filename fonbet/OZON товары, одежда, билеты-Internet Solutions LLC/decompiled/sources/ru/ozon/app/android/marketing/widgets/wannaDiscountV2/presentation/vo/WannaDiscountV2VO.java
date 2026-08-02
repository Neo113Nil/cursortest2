package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.vo;

import B90.C2619v;
import Bl.C2639a;
import G.g;
import J0.C3349u1;
import Lh.a;
import Tl.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.WannaDiscountV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001HBo\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b-\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u00106R(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010B\u001a\u0004\bC\u0010DR\u001f\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010E\u001a\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "infoButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "sendButton", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceBlock;", "priceBlock", "", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO$Discount;", "discounts", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40Icon;", "seller", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;", "priceInput", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock;", "quantityInput", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceBlock;Ljava/util/List;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40Icon;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getInfoButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSendButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceBlock;", "getPriceBlock", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceBlock;", "Ljava/util/List;", "getDiscounts", "()Ljava/util/List;", "setDiscounts", "(Ljava/util/List;)V", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40Icon;", "getSeller", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40Icon;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;", "getPriceInput", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock;", "getQuantityInput", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Discount", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WannaDiscountV2VO implements c {

    @NotNull
    private List<Discount> discounts;
    private final long id;

    @NotNull
    private final ButtonV3Atom.SmallIconButton infoButton;

    @NotNull
    private final WannaDiscountV2DTO.PriceBlock priceBlock;

    @NotNull
    private final WannaDiscountV2DTO.PriceInputBlock priceInput;

    @NotNull
    private final WannaDiscountV2DTO.QuantityInputBlock quantityInput;
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon seller;

    @NotNull
    private final ButtonV3Atom.LargeButton sendButton;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO$Discount;", "", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "discount", "", "discountPrice", "<init>", "(Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;Ljava/lang/String;)V", "copy", "(Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;Ljava/lang/String;)Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO$Discount;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "getDiscount", "()Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "Ljava/lang/String;", "getDiscountPrice", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Discount {
        public static final int $stable = TagV3Atom.TagAtom.$stable;

        @NotNull
        private final TagV3Atom.TagAtom discount;

        @NotNull
        private final String discountPrice;

        public Discount(@NotNull TagV3Atom.TagAtom discount, @NotNull String discountPrice) {
            Intrinsics.checkNotNullParameter(discount, "discount");
            Intrinsics.checkNotNullParameter(discountPrice, "discountPrice");
            this.discount = discount;
            this.discountPrice = discountPrice;
        }

        public static /* synthetic */ Discount copy$default(Discount discount, TagV3Atom.TagAtom tagAtom, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                tagAtom = discount.discount;
            }
            if ((i11 & 2) != 0) {
                str = discount.discountPrice;
            }
            return discount.copy(tagAtom, str);
        }

        @NotNull
        public final Discount copy(@NotNull TagV3Atom.TagAtom discount, @NotNull String discountPrice) {
            Intrinsics.checkNotNullParameter(discount, "discount");
            Intrinsics.checkNotNullParameter(discountPrice, "discountPrice");
            return new Discount(discount, discountPrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Discount)) {
                return false;
            }
            Discount discount = (Discount) other;
            return Intrinsics.d(this.discount, discount.discount) && Intrinsics.d(this.discountPrice, discount.discountPrice);
        }

        @NotNull
        public final TagV3Atom.TagAtom getDiscount() {
            return this.discount;
        }

        @NotNull
        public final String getDiscountPrice() {
            return this.discountPrice;
        }

        public int hashCode() {
            return this.discountPrice.hashCode() + (this.discount.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Discount(discount=" + this.discount + ", discountPrice=" + this.discountPrice + ")";
        }
    }

    public WannaDiscountV2VO(long j11, @NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull ButtonV3Atom.SmallIconButton infoButton, @NotNull ButtonV3Atom.LargeButton sendButton, @NotNull WannaDiscountV2DTO.PriceBlock priceBlock, @NotNull List<Discount> discounts, CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon cellWithSubtitle40Icon, @NotNull WannaDiscountV2DTO.PriceInputBlock priceInput, @NotNull WannaDiscountV2DTO.QuantityInputBlock quantityInput, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(infoButton, "infoButton");
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        Intrinsics.checkNotNullParameter(priceBlock, "priceBlock");
        Intrinsics.checkNotNullParameter(discounts, "discounts");
        Intrinsics.checkNotNullParameter(priceInput, "priceInput");
        Intrinsics.checkNotNullParameter(quantityInput, "quantityInput");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.infoButton = infoButton;
        this.sendButton = sendButton;
        this.priceBlock = priceBlock;
        this.discounts = discounts;
        this.seller = cellWithSubtitle40Icon;
        this.priceInput = priceInput;
        this.quantityInput = quantityInput;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WannaDiscountV2VO)) {
            return false;
        }
        WannaDiscountV2VO wannaDiscountV2VO = (WannaDiscountV2VO) other;
        return this.id == wannaDiscountV2VO.id && Intrinsics.d(this.title, wannaDiscountV2VO.title) && Intrinsics.d(this.subtitle, wannaDiscountV2VO.subtitle) && Intrinsics.d(this.infoButton, wannaDiscountV2VO.infoButton) && Intrinsics.d(this.sendButton, wannaDiscountV2VO.sendButton) && Intrinsics.d(this.priceBlock, wannaDiscountV2VO.priceBlock) && Intrinsics.d(this.discounts, wannaDiscountV2VO.discounts) && Intrinsics.d(this.seller, wannaDiscountV2VO.seller) && Intrinsics.d(this.priceInput, wannaDiscountV2VO.priceInput) && Intrinsics.d(this.quantityInput, wannaDiscountV2VO.quantityInput) && Intrinsics.d(this.tokenizedEvent, wannaDiscountV2VO.tokenizedEvent);
    }

    @NotNull
    public final List<Discount> getDiscounts() {
        return this.discounts;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    @NotNull
    public final WannaDiscountV2DTO.PriceBlock getPriceBlock() {
        return this.priceBlock;
    }

    @NotNull
    public final WannaDiscountV2DTO.PriceInputBlock getPriceInput() {
        return this.priceInput;
    }

    @NotNull
    public final WannaDiscountV2DTO.QuantityInputBlock getQuantityInput() {
        return this.quantityInput;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon getSeller() {
        return this.seller;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSendButton() {
        return this.sendButton;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b((this.priceBlock.hashCode() + b.a(this.sendButton, C3349u1.d(this.infoButton, C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.subtitle), 31), 31)) * 31, 31, this.discounts);
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon cellWithSubtitle40Icon = this.seller;
        int hashCode = (this.quantityInput.hashCode() + ((this.priceInput.hashCode() + ((b11 + (cellWithSubtitle40Icon == null ? 0 : cellWithSubtitle40Icon.hashCode())) * 31)) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    public final void setDiscounts(@NotNull List<Discount> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.discounts = list;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        ButtonV3Atom.SmallIconButton smallIconButton = this.infoButton;
        ButtonV3Atom.LargeButton largeButton = this.sendButton;
        WannaDiscountV2DTO.PriceBlock priceBlock = this.priceBlock;
        List<Discount> list = this.discounts;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon cellWithSubtitle40Icon = this.seller;
        WannaDiscountV2DTO.PriceInputBlock priceInputBlock = this.priceInput;
        WannaDiscountV2DTO.QuantityInputBlock quantityInputBlock = this.quantityInput;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2639a.c("WannaDiscountV2VO(id=", j11, ", title=", textAtom);
        c11.append(", subtitle=");
        c11.append(textAtom2);
        c11.append(", infoButton=");
        c11.append(smallIconButton);
        c11.append(", sendButton=");
        c11.append(largeButton);
        c11.append(", priceBlock=");
        c11.append(priceBlock);
        c11.append(", discounts=");
        c11.append(list);
        c11.append(", seller=");
        c11.append(cellWithSubtitle40Icon);
        c11.append(", priceInput=");
        c11.append(priceInputBlock);
        c11.append(", quantityInput=");
        c11.append(quantityInputBlock);
        return a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
