package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.viewItem;

import Ak.C2436a;
import An.C2439a;
import B0.C2454a;
import Fj.c;
import Kk.C3532b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b\u0007\u0010-R\"\u0010\b\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010,\u001a\u0004\b.\u0010-\"\u0004\b/\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b\u0011\u0010-R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010<\u001a\u0004\b=\u0010!R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\b>\u0010;R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0017\u00109\u001a\u0004\bB\u0010;R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u00103\u001a\u0004\bF\u00105R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001b\u00106\u001a\u0004\bG\u00108¨\u0006H"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/viewItem/ProductImageVO;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "", "id", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "productMediaImage", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "shouldBlur", "", "blurImageUrl", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "counterBadge", "isTranslucent", "", "topCornerRadius", "statusBadge", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "priceBadge", "Lru/ozon/uni/atoms/data/text/TextDTO;", "caption", "captionAction", "captionTokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;ZILru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getProductMediaImage", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "Z", "()Z", "getShouldBlur", "setShouldBlur", "(Z)V", "Ljava/lang/String;", "getBlurImageUrl", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getCounterBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "I", "getTopCornerRadius", "getStatusBadge", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPriceBadge", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getCaption", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCaptionAction", "getCaptionTokenizedEvent", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductImageVO implements AdultVO {
    private final AtomAction action;
    private final String blurImageUrl;
    private final TextDTO caption;
    private final AtomAction captionAction;
    private final t captionTokenizedEvent;
    private final BadgeDTO counterBadge;
    private final long id;
    private final boolean isAdult;
    private final boolean isTranslucent;
    private final PriceDTO price;
    private final BadgeDTO priceBadge;

    @NotNull
    private final ProductMediaDTO productMediaImage;
    private boolean shouldBlur;
    private final BadgeDTO statusBadge;
    private final t tokenizedEvent;
    private final int topCornerRadius;

    public ProductImageVO(long j11, @NotNull ProductMediaDTO productMediaImage, boolean z11, boolean z12, String str, AtomAction atomAction, t tVar, BadgeDTO badgeDTO, boolean z13, int i11, BadgeDTO badgeDTO2, PriceDTO priceDTO, BadgeDTO badgeDTO3, TextDTO textDTO, AtomAction atomAction2, t tVar2) {
        Intrinsics.checkNotNullParameter(productMediaImage, "productMediaImage");
        this.id = j11;
        this.productMediaImage = productMediaImage;
        this.isAdult = z11;
        this.shouldBlur = z12;
        this.blurImageUrl = str;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.counterBadge = badgeDTO;
        this.isTranslucent = z13;
        this.topCornerRadius = i11;
        this.statusBadge = badgeDTO2;
        this.price = priceDTO;
        this.priceBadge = badgeDTO3;
        this.caption = textDTO;
        this.captionAction = atomAction2;
        this.captionTokenizedEvent = tVar2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductImageVO)) {
            return false;
        }
        ProductImageVO productImageVO = (ProductImageVO) other;
        return this.id == productImageVO.id && Intrinsics.d(this.productMediaImage, productImageVO.productMediaImage) && this.isAdult == productImageVO.isAdult && this.shouldBlur == productImageVO.shouldBlur && Intrinsics.d(this.blurImageUrl, productImageVO.blurImageUrl) && Intrinsics.d(this.action, productImageVO.action) && Intrinsics.d(this.tokenizedEvent, productImageVO.tokenizedEvent) && Intrinsics.d(this.counterBadge, productImageVO.counterBadge) && this.isTranslucent == productImageVO.isTranslucent && this.topCornerRadius == productImageVO.topCornerRadius && Intrinsics.d(this.statusBadge, productImageVO.statusBadge) && Intrinsics.d(this.price, productImageVO.price) && Intrinsics.d(this.priceBadge, productImageVO.priceBadge) && Intrinsics.d(this.caption, productImageVO.caption) && Intrinsics.d(this.captionAction, productImageVO.captionAction) && Intrinsics.d(this.captionTokenizedEvent, productImageVO.captionTokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBlurImageUrl() {
        return this.blurImageUrl;
    }

    public final TextDTO getCaption() {
        return this.caption;
    }

    public final BadgeDTO getCounterBadge() {
        return this.counterBadge;
    }

    public final long getId() {
        return this.id;
    }

    public final PriceDTO getPrice() {
        return this.price;
    }

    public final BadgeDTO getPriceBadge() {
        return this.priceBadge;
    }

    @NotNull
    public final ProductMediaDTO getProductMediaImage() {
        return this.productMediaImage;
    }

    public boolean getShouldBlur() {
        return this.shouldBlur;
    }

    public final BadgeDTO getStatusBadge() {
        return this.statusBadge;
    }

    public final int getTopCornerRadius() {
        return this.topCornerRadius;
    }

    public int hashCode() {
        int a11 = C3532b.a(C3532b.a((this.productMediaImage.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.isAdult), 31, this.shouldBlur);
        String str = this.blurImageUrl;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        BadgeDTO badgeDTO = this.counterBadge;
        int a12 = C2454a.a(this.topCornerRadius, C3532b.a((hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.isTranslucent), 31);
        BadgeDTO badgeDTO2 = this.statusBadge;
        int hashCode4 = (a12 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
        PriceDTO priceDTO = this.price;
        int hashCode5 = (hashCode4 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
        BadgeDTO badgeDTO3 = this.priceBadge;
        int hashCode6 = (hashCode5 + (badgeDTO3 == null ? 0 : badgeDTO3.hashCode())) * 31;
        TextDTO textDTO = this.caption;
        int hashCode7 = (hashCode6 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        AtomAction atomAction2 = this.captionAction;
        int hashCode8 = (hashCode7 + (atomAction2 == null ? 0 : atomAction2.hashCode())) * 31;
        t tVar2 = this.captionTokenizedEvent;
        return hashCode8 + (tVar2 != null ? tVar2.hashCode() : 0);
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    /* renamed from: isAdult, reason: from getter */
    public boolean getIsAdult() {
        return this.isAdult;
    }

    /* renamed from: isTranslucent, reason: from getter */
    public final boolean getIsTranslucent() {
        return this.isTranslucent;
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    public void setShouldBlur(boolean z11) {
        this.shouldBlur = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ProductMediaDTO productMediaDTO = this.productMediaImage;
        boolean z11 = this.isAdult;
        boolean z12 = this.shouldBlur;
        String str = this.blurImageUrl;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        BadgeDTO badgeDTO = this.counterBadge;
        boolean z13 = this.isTranslucent;
        int i11 = this.topCornerRadius;
        BadgeDTO badgeDTO2 = this.statusBadge;
        PriceDTO priceDTO = this.price;
        BadgeDTO badgeDTO3 = this.priceBadge;
        TextDTO textDTO = this.caption;
        AtomAction atomAction2 = this.captionAction;
        t tVar2 = this.captionTokenizedEvent;
        StringBuilder sb2 = new StringBuilder("ProductImageVO(id=");
        sb2.append(j11);
        sb2.append(", productMediaImage=");
        sb2.append(productMediaDTO);
        C2436a.e(", isAdult=", ", shouldBlur=", sb2, z11, z12);
        C2439a.c(", blurImageUrl=", str, ", action=", sb2, atomAction);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", counterBadge=");
        sb2.append(badgeDTO);
        sb2.append(", isTranslucent=");
        sb2.append(z13);
        sb2.append(", topCornerRadius=");
        sb2.append(i11);
        sb2.append(", statusBadge=");
        sb2.append(badgeDTO2);
        sb2.append(", price=");
        sb2.append(priceDTO);
        sb2.append(", priceBadge=");
        sb2.append(badgeDTO3);
        sb2.append(", caption=");
        sb2.append(textDTO);
        c.e(tVar2, ", captionAction=", ", captionTokenizedEvent=", sb2, atomAction2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ ProductImageVO(long j11, ProductMediaDTO productMediaDTO, boolean z11, boolean z12, String str, AtomAction atomAction, t tVar, BadgeDTO badgeDTO, boolean z13, int i11, BadgeDTO badgeDTO2, PriceDTO priceDTO, BadgeDTO badgeDTO3, TextDTO textDTO, AtomAction atomAction2, t tVar2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, productMediaDTO, z11, (i12 & 8) != 0 ? z11 : z12, str, atomAction, tVar, badgeDTO, z13, i11, badgeDTO2, priceDTO, badgeDTO3, textDTO, atomAction2, tVar2);
    }
}
