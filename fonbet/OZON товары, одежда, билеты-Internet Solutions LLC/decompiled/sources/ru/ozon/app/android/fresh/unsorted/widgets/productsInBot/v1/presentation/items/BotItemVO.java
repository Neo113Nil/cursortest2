package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.items;

import B0.A0;
import B0.C2454a;
import B90.C2619v;
import Fm.C3051a;
import G.g;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.api.SelectedProductsBody;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bi\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0084\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010 R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b2\u0010 R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b\u000f\u00104R\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b5\u0010'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b6\u0010-R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b:\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/price/Price;", "price", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "image", "", "maxQuantity", "currentQuantity", "", "isSelected", "skuId", "aspects", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "minusButton", "plusButton", "<init>", "(JLru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;IIZJLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "quantity", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/api/SelectedProductsBody$Product;", "toProductBody", "(I)Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/api/SelectedProductsBody$Product;", "copy", "(JLru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;IIZJLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getImage", "I", "getMaxQuantity", "getCurrentQuantity", "Z", "()Z", "getSkuId", "getAspects", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getMinusButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getPlusButton", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BotItemVO implements c {
    public static final int $stable;
    private final TextAtom aspects;
    private final int currentQuantity;
    private final long id;

    @NotNull
    private final String image;
    private final boolean isSelected;
    private final int maxQuantity;
    private final ButtonV3Atom.SmallIconButton minusButton;
    private final ButtonV3Atom.SmallIconButton plusButton;

    @NotNull
    private final Price price;
    private final long skuId;

    @NotNull
    private final TextAtom title;

    static {
        int i11 = ButtonV3Atom.SmallIconButton.$stable;
        int i12 = TextAtom.$stable;
        $stable = i11 | i12 | i12 | Price.$stable;
    }

    public BotItemVO(long j11, @NotNull Price price, @NotNull TextAtom title, @NotNull String image, int i11, int i12, boolean z11, long j12, TextAtom textAtom, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallIconButton smallIconButton2) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        this.id = j11;
        this.price = price;
        this.title = title;
        this.image = image;
        this.maxQuantity = i11;
        this.currentQuantity = i12;
        this.isSelected = z11;
        this.skuId = j12;
        this.aspects = textAtom;
        this.minusButton = smallIconButton;
        this.plusButton = smallIconButton2;
    }

    @NotNull
    public final BotItemVO copy(long id2, @NotNull Price price, @NotNull TextAtom title, @NotNull String image, int maxQuantity, int currentQuantity, boolean isSelected, long skuId, TextAtom aspects, ButtonV3Atom.SmallIconButton minusButton, ButtonV3Atom.SmallIconButton plusButton) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        return new BotItemVO(id2, price, title, image, maxQuantity, currentQuantity, isSelected, skuId, aspects, minusButton, plusButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BotItemVO)) {
            return false;
        }
        BotItemVO botItemVO = (BotItemVO) other;
        return this.id == botItemVO.id && Intrinsics.d(this.price, botItemVO.price) && Intrinsics.d(this.title, botItemVO.title) && Intrinsics.d(this.image, botItemVO.image) && this.maxQuantity == botItemVO.maxQuantity && this.currentQuantity == botItemVO.currentQuantity && this.isSelected == botItemVO.isSelected && this.skuId == botItemVO.skuId && Intrinsics.d(this.aspects, botItemVO.aspects) && Intrinsics.d(this.minusButton, botItemVO.minusButton) && Intrinsics.d(this.plusButton, botItemVO.plusButton);
    }

    public final TextAtom getAspects() {
        return this.aspects;
    }

    public final int getCurrentQuantity() {
        return this.currentQuantity;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final int getMaxQuantity() {
        return this.maxQuantity;
    }

    public final ButtonV3Atom.SmallIconButton getMinusButton() {
        return this.minusButton;
    }

    public final ButtonV3Atom.SmallIconButton getPlusButton() {
        return this.plusButton;
    }

    @NotNull
    public final Price getPrice() {
        return this.price;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final long getSkuId() {
        return this.skuId;
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
        int a11 = Pk0.c.a(C3532b.a(C2454a.a(this.currentQuantity, C2454a.a(this.maxQuantity, g.a(C2619v.b(C3051a.a(this.price, Long.hashCode(this.id) * 31, 31), 31, this.title), 31, this.image), 31), 31), 31, this.isSelected), 31, this.skuId);
        TextAtom textAtom = this.aspects;
        int hashCode = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.minusButton;
        int hashCode2 = (hashCode + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton2 = this.plusButton;
        return hashCode2 + (smallIconButton2 != null ? smallIconButton2.hashCode() : 0);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public final SelectedProductsBody.Product toProductBody(int quantity) {
        return new SelectedProductsBody.Product(this.skuId, quantity);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Price price = this.price;
        TextAtom textAtom = this.title;
        String str = this.image;
        int i11 = this.maxQuantity;
        int i12 = this.currentQuantity;
        boolean z11 = this.isSelected;
        long j12 = this.skuId;
        TextAtom textAtom2 = this.aspects;
        ButtonV3Atom.SmallIconButton smallIconButton = this.minusButton;
        ButtonV3Atom.SmallIconButton smallIconButton2 = this.plusButton;
        StringBuilder sb2 = new StringBuilder("BotItemVO(id=");
        sb2.append(j11);
        sb2.append(", price=");
        sb2.append(price);
        sb2.append(", title=");
        sb2.append(textAtom);
        sb2.append(", image=");
        sb2.append(str);
        A0.c(i11, i12, ", maxQuantity=", ", currentQuantity=", sb2);
        sb2.append(", isSelected=");
        sb2.append(z11);
        sb2.append(", skuId=");
        sb2.append(j12);
        sb2.append(", aspects=");
        sb2.append(textAtom2);
        sb2.append(", minusButton=");
        sb2.append(smallIconButton);
        sb2.append(", plusButton=");
        sb2.append(smallIconButton2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ BotItemVO(long j11, Price price, TextAtom textAtom, String str, int i11, int i12, boolean z11, long j12, TextAtom textAtom2, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallIconButton smallIconButton2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, price, textAtom, str, i11, (i13 & 32) != 0 ? 1 : i12, (i13 & 64) != 0 ? false : z11, j12, textAtom2, smallIconButton, smallIconButton2);
    }
}
