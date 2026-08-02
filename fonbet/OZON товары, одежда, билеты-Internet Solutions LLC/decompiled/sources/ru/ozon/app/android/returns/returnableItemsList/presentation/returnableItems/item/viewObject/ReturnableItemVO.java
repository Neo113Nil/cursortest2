package ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.item.viewObject;

import B90.C2619v;
import Fm.C3051a;
import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.checkbox.RmsCheckbox;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.QuantitySelector;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b'\b\u0081\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b7\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\b\u0016\u0010BR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010F\u001a\u0004\bG\u0010H¨\u0006I"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewObject/ReturnableItemVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "checkbox", "", "image", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "attributes", "Lru/ozon/uni/atoms/data/price/Price;", "price", "quantity", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewObject/Caption;", "caption", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "itemAction", "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/QuantitySelector;", "quantitySelector", "", "isDisabled", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(JLru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewObject/Caption;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Lru/ozon/app/android/returns/ui/molecules/quantitySelector/QuantitySelector;Ljava/lang/Boolean;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/TestInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "getCheckbox", "()Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getAttributes", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getQuantity", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewObject/Caption;", "getCaption", "()Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewObject/Caption;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getItemAction", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/QuantitySelector;", "getQuantitySelector", "()Lru/ozon/app/android/returns/ui/molecules/quantitySelector/QuantitySelector;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnableItemVO implements c {
    private final AtomAction action;

    @NotNull
    private final List<TextAtom> attributes;
    private final Caption caption;

    @NotNull
    private final RmsCheckbox checkbox;
    private final long id;

    @NotNull
    private final String image;
    private final Boolean isDisabled;
    private final ButtonV3Atom.SmallBorderlessButton itemAction;

    @NotNull
    private final Price price;
    private final TextAtom quantity;
    private final QuantitySelector quantitySelector;
    private final TestInfo testInfo;

    @NotNull
    private final TextAtom title;

    public ReturnableItemVO(long j11, @NotNull RmsCheckbox checkbox, @NotNull String image, @NotNull TextAtom title, @NotNull List<TextAtom> attributes, @NotNull Price price, TextAtom textAtom, Caption caption, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, QuantitySelector quantitySelector, Boolean bool, AtomAction atomAction, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(checkbox, "checkbox");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(price, "price");
        this.id = j11;
        this.checkbox = checkbox;
        this.image = image;
        this.title = title;
        this.attributes = attributes;
        this.price = price;
        this.quantity = textAtom;
        this.caption = caption;
        this.itemAction = smallBorderlessButton;
        this.quantitySelector = quantitySelector;
        this.isDisabled = bool;
        this.action = atomAction;
        this.testInfo = testInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnableItemVO)) {
            return false;
        }
        ReturnableItemVO returnableItemVO = (ReturnableItemVO) other;
        return this.id == returnableItemVO.id && Intrinsics.d(this.checkbox, returnableItemVO.checkbox) && Intrinsics.d(this.image, returnableItemVO.image) && Intrinsics.d(this.title, returnableItemVO.title) && Intrinsics.d(this.attributes, returnableItemVO.attributes) && Intrinsics.d(this.price, returnableItemVO.price) && Intrinsics.d(this.quantity, returnableItemVO.quantity) && Intrinsics.d(this.caption, returnableItemVO.caption) && Intrinsics.d(this.itemAction, returnableItemVO.itemAction) && Intrinsics.d(this.quantitySelector, returnableItemVO.quantitySelector) && Intrinsics.d(this.isDisabled, returnableItemVO.isDisabled) && Intrinsics.d(this.action, returnableItemVO.action) && Intrinsics.d(this.testInfo, returnableItemVO.testInfo);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final List<TextAtom> getAttributes() {
        return this.attributes;
    }

    public final Caption getCaption() {
        return this.caption;
    }

    @NotNull
    public final RmsCheckbox getCheckbox() {
        return this.checkbox;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final ButtonV3Atom.SmallBorderlessButton getItemAction() {
        return this.itemAction;
    }

    @NotNull
    public final Price getPrice() {
        return this.price;
    }

    public final TextAtom getQuantity() {
        return this.quantity;
    }

    public final QuantitySelector getQuantitySelector() {
        return this.quantitySelector;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3051a.a(this.price, g.b(C2619v.b(g.a((this.checkbox.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.image), 31, this.title), 31, this.attributes), 31);
        TextAtom textAtom = this.quantity;
        int hashCode = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        Caption caption = this.caption;
        int hashCode2 = (hashCode + (caption == null ? 0 : caption.hashCode())) * 31;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.itemAction;
        int hashCode3 = (hashCode2 + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode())) * 31;
        QuantitySelector quantitySelector = this.quantitySelector;
        int hashCode4 = (hashCode3 + (quantitySelector == null ? 0 : quantitySelector.hashCode())) * 31;
        Boolean bool = this.isDisabled;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode6 = (hashCode5 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode6 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    /* renamed from: isDisabled, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        return "ReturnableItemVO(id=" + this.id + ", checkbox=" + this.checkbox + ", image=" + this.image + ", title=" + this.title + ", attributes=" + this.attributes + ", price=" + this.price + ", quantity=" + this.quantity + ", caption=" + this.caption + ", itemAction=" + this.itemAction + ", quantitySelector=" + this.quantitySelector + ", isDisabled=" + this.isDisabled + ", action=" + this.action + ", testInfo=" + this.testInfo + ")";
    }
}
