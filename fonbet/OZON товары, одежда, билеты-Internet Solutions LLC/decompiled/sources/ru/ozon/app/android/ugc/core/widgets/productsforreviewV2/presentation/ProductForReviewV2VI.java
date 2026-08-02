package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ`\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b,\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b-\u0010(¨\u0006."}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductForReviewV2VI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "productCommon", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/af/AtomAction$Move;", "cardTapAction", "ratingTapAction", "rateTapTokenizedEvent", "<init>", "(JLru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction$Move;Lru/ozon/uni/atoms/af/AtomAction$Move;LWZ/t;)V", "copy", "(JLru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction$Move;Lru/ozon/uni/atoms/af/AtomAction$Move;LWZ/t;)Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductForReviewV2VI;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI;", "getProduct", "()Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getProductCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/af/AtomAction$Move;", "getCardTapAction", "()Lru/ozon/uni/atoms/af/AtomAction$Move;", "getRatingTapAction", "getRateTapTokenizedEvent", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProductForReviewV2VI implements c {
    private final AtomAction.Move cardTapAction;
    private final long id;

    @NotNull
    private final ProductVI product;
    private final CommonControlSettings productCommon;
    private final t rateTapTokenizedEvent;
    private final AtomAction.Move ratingTapAction;
    private final t tokenizedEvent;

    public ProductForReviewV2VI(long j11, @NotNull ProductVI product, CommonControlSettings commonControlSettings, t tVar, AtomAction.Move move, AtomAction.Move move2, t tVar2) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.id = j11;
        this.product = product;
        this.productCommon = commonControlSettings;
        this.tokenizedEvent = tVar;
        this.cardTapAction = move;
        this.ratingTapAction = move2;
        this.rateTapTokenizedEvent = tVar2;
    }

    public static /* synthetic */ ProductForReviewV2VI copy$default(ProductForReviewV2VI productForReviewV2VI, long j11, ProductVI productVI, CommonControlSettings commonControlSettings, t tVar, AtomAction.Move move, AtomAction.Move move2, t tVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = productForReviewV2VI.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            productVI = productForReviewV2VI.product;
        }
        ProductVI productVI2 = productVI;
        if ((i11 & 4) != 0) {
            commonControlSettings = productForReviewV2VI.productCommon;
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        if ((i11 & 8) != 0) {
            tVar = productForReviewV2VI.tokenizedEvent;
        }
        t tVar3 = tVar;
        if ((i11 & 16) != 0) {
            move = productForReviewV2VI.cardTapAction;
        }
        return productForReviewV2VI.copy(j12, productVI2, commonControlSettings2, tVar3, move, (i11 & 32) != 0 ? productForReviewV2VI.ratingTapAction : move2, (i11 & 64) != 0 ? productForReviewV2VI.rateTapTokenizedEvent : tVar2);
    }

    @NotNull
    public final ProductForReviewV2VI copy(long id2, @NotNull ProductVI product, CommonControlSettings productCommon, t tokenizedEvent, AtomAction.Move cardTapAction, AtomAction.Move ratingTapAction, t rateTapTokenizedEvent) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new ProductForReviewV2VI(id2, product, productCommon, tokenizedEvent, cardTapAction, ratingTapAction, rateTapTokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductForReviewV2VI)) {
            return false;
        }
        ProductForReviewV2VI productForReviewV2VI = (ProductForReviewV2VI) other;
        return this.id == productForReviewV2VI.id && Intrinsics.d(this.product, productForReviewV2VI.product) && Intrinsics.d(this.productCommon, productForReviewV2VI.productCommon) && Intrinsics.d(this.tokenizedEvent, productForReviewV2VI.tokenizedEvent) && Intrinsics.d(this.cardTapAction, productForReviewV2VI.cardTapAction) && Intrinsics.d(this.ratingTapAction, productForReviewV2VI.ratingTapAction) && Intrinsics.d(this.rateTapTokenizedEvent, productForReviewV2VI.rateTapTokenizedEvent);
    }

    public final AtomAction.Move getCardTapAction() {
        return this.cardTapAction;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ProductVI getProduct() {
        return this.product;
    }

    public final AtomAction.Move getRatingTapAction() {
        return this.ratingTapAction;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.product.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        CommonControlSettings commonControlSettings = this.productCommon;
        int hashCode2 = (hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        AtomAction.Move move = this.cardTapAction;
        int hashCode4 = (hashCode3 + (move == null ? 0 : move.hashCode())) * 31;
        AtomAction.Move move2 = this.ratingTapAction;
        int hashCode5 = (hashCode4 + (move2 == null ? 0 : move2.hashCode())) * 31;
        t tVar2 = this.rateTapTokenizedEvent;
        return hashCode5 + (tVar2 != null ? tVar2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ProductVI productVI = this.product;
        CommonControlSettings commonControlSettings = this.productCommon;
        t tVar = this.tokenizedEvent;
        AtomAction.Move move = this.cardTapAction;
        AtomAction.Move move2 = this.ratingTapAction;
        t tVar2 = this.rateTapTokenizedEvent;
        StringBuilder sb2 = new StringBuilder("ProductForReviewV2VI(id=");
        sb2.append(j11);
        sb2.append(", product=");
        sb2.append(productVI);
        sb2.append(", productCommon=");
        sb2.append(commonControlSettings);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", cardTapAction=");
        sb2.append(move);
        sb2.append(", ratingTapAction=");
        sb2.append(move2);
        return a.b(sb2, ", rateTapTokenizedEvent=", tVar2, ")");
    }
}
