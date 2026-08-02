package ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation;

import Ak.C2436a;
import B0.C2454a;
import C.C2702w;
import El.C2971a;
import G.g;
import Kk.C3532b;
import Nh.a;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.atoms.data.rating.RatingBadgeAtom;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001BB\u0087\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b*\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b.\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b/\u0010\u001dR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00103\u001a\u0004\b\u0011\u00104\"\u0004\b5\u00106R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\b\u0015\u0010;R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010?\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "sellerId", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "productsCount", "logoImage", "deeplink", "", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerVO$ProductVO;", "items", "", "isFavorite", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "isPremium", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "premiumIcon", "Lru/ozon/app/android/atoms/data/rating/RatingBadgeAtom;", "ratingBadge", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLWZ/t;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/atoms/data/rating/RatingBadgeAtom;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getSellerId", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/lang/Integer;", "getProductsCount", "()Ljava/lang/Integer;", "getLogoImage", "getDeeplink", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Z", "()Z", "setFavorite", "(Z)V", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPremiumIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/atoms/data/rating/RatingBadgeAtom;", "getRatingBadge", "()Lru/ozon/app/android/atoms/data/rating/RatingBadgeAtom;", "ProductVO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SellerVO implements c {

    @NotNull
    private final String deeplink;
    private final long id;
    private boolean isFavorite;
    private final Boolean isPremium;

    @NotNull
    private final List<ProductVO> items;
    private final String logoImage;
    private final IconDTO premiumIcon;
    private final Integer productsCount;
    private final RatingBadgeAtom ratingBadge;
    private final long sellerId;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b/\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105R\"\u0010\u0014\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00108R\u001a\u0010\u0015\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b\u0015\u00102¨\u00069"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerVO$ProductVO;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "", "sku", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "image", "Ljava/math/BigDecimal;", "finalPrice", "priceString", "price", "", "discount", "deeplink", "", "visible", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "shouldBlur", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "<init>", "(JLjava/lang/String;Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/String;ZLWZ/t;ZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getSku", "()J", "Ljava/lang/String;", "getTitle", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "getImage", "()Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "Ljava/math/BigDecimal;", "getFinalPrice", "()Ljava/math/BigDecimal;", "getPriceString", "getPrice", "I", "getDiscount", "getDeeplink", "Z", "getVisible", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getShouldBlur", "setShouldBlur", "(Z)V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductVO implements AdultVO {
        private final String deeplink;
        private final int discount;
        private final BigDecimal finalPrice;
        private final AdultImageView.Image image;
        private final boolean isAdult;
        private final BigDecimal price;
        private final String priceString;
        private boolean shouldBlur;
        private final long sku;

        @NotNull
        private final String title;
        private final t tokenizedEvent;
        private final boolean visible;

        public ProductVO() {
            this(0L, null, null, null, null, null, 0, null, false, null, false, false, 4095, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductVO)) {
                return false;
            }
            ProductVO productVO = (ProductVO) other;
            return this.sku == productVO.sku && Intrinsics.d(this.title, productVO.title) && Intrinsics.d(this.image, productVO.image) && Intrinsics.d(this.finalPrice, productVO.finalPrice) && Intrinsics.d(this.priceString, productVO.priceString) && Intrinsics.d(this.price, productVO.price) && this.discount == productVO.discount && Intrinsics.d(this.deeplink, productVO.deeplink) && this.visible == productVO.visible && Intrinsics.d(this.tokenizedEvent, productVO.tokenizedEvent) && this.shouldBlur == productVO.shouldBlur && this.isAdult == productVO.isAdult;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final BigDecimal getFinalPrice() {
            return this.finalPrice;
        }

        public final AdultImageView.Image getImage() {
            return this.image;
        }

        public final String getPriceString() {
            return this.priceString;
        }

        public boolean getShouldBlur() {
            return this.shouldBlur;
        }

        public final boolean getVisible() {
            return this.visible;
        }

        public int hashCode() {
            int a11 = g.a(Long.hashCode(this.sku) * 31, 31, this.title);
            AdultImageView.Image image = this.image;
            int hashCode = (a11 + (image == null ? 0 : image.hashCode())) * 31;
            BigDecimal bigDecimal = this.finalPrice;
            int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            String str = this.priceString;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.price;
            int a12 = C2454a.a(this.discount, (hashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31, 31);
            String str2 = this.deeplink;
            int a13 = C3532b.a((a12 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.visible);
            t tVar = this.tokenizedEvent;
            return Boolean.hashCode(this.isAdult) + C3532b.a((a13 + (tVar != null ? tVar.hashCode() : 0)) * 31, 31, this.shouldBlur);
        }

        @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
        /* renamed from: isAdult, reason: from getter */
        public boolean getIsAdult() {
            return this.isAdult;
        }

        @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
        public void setShouldBlur(boolean z11) {
            this.shouldBlur = z11;
        }

        @NotNull
        public String toString() {
            long j11 = this.sku;
            String str = this.title;
            AdultImageView.Image image = this.image;
            BigDecimal bigDecimal = this.finalPrice;
            String str2 = this.priceString;
            BigDecimal bigDecimal2 = this.price;
            int i11 = this.discount;
            String str3 = this.deeplink;
            boolean z11 = this.visible;
            t tVar = this.tokenizedEvent;
            boolean z12 = this.shouldBlur;
            boolean z13 = this.isAdult;
            StringBuilder c11 = C2436a.c(j11, "ProductVO(sku=", ", title=", str);
            c11.append(", image=");
            c11.append(image);
            c11.append(", finalPrice=");
            c11.append(bigDecimal);
            c11.append(", priceString=");
            c11.append(str2);
            c11.append(", price=");
            c11.append(bigDecimal2);
            c11.append(", discount=");
            c11.append(i11);
            c11.append(", deeplink=");
            c11.append(str3);
            C2971a.d(c11, ", visible=", z11, ", tokenizedEvent=", tVar);
            C2436a.e(", shouldBlur=", ", isAdult=", c11, z12, z13);
            c11.append(")");
            return c11.toString();
        }

        public ProductVO(long j11, @NotNull String title, AdultImageView.Image image, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, int i11, String str2, boolean z11, t tVar, boolean z12, boolean z13) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.sku = j11;
            this.title = title;
            this.image = image;
            this.finalPrice = bigDecimal;
            this.priceString = str;
            this.price = bigDecimal2;
            this.discount = i11;
            this.deeplink = str2;
            this.visible = z11;
            this.tokenizedEvent = tVar;
            this.shouldBlur = z12;
            this.isAdult = z13;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ ProductVO(long j11, String str, AdultImageView.Image image, BigDecimal bigDecimal, String str2, BigDecimal bigDecimal2, int i11, String str3, boolean z11, t tVar, boolean z12, boolean z13, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(r1, r3, r4, r6, r7, r8, r9, r11, r12, r5, r27, r28);
            boolean z14;
            boolean z15;
            long j12 = (i12 & 1) != 0 ? 0L : j11;
            String str4 = (i12 & 2) != 0 ? "" : str;
            AdultImageView.Image image2 = (i12 & 4) != 0 ? null : image;
            BigDecimal bigDecimal3 = (i12 & 8) != 0 ? null : bigDecimal;
            String str5 = (i12 & 16) != 0 ? null : str2;
            BigDecimal bigDecimal4 = (i12 & 32) != 0 ? null : bigDecimal2;
            int i13 = (i12 & 64) != 0 ? 0 : i11;
            String str6 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str3;
            boolean z16 = (i12 & 256) != 0 ? true : z11;
            t tVar2 = (i12 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? tVar : null;
            boolean z17 = (i12 & UserVerificationMethods.USER_VERIFY_ALL) == 0 ? z12 : false;
            if ((i12 & 2048) != 0) {
                z15 = z17;
                z14 = z15;
            } else {
                z14 = z13;
                z15 = z17;
            }
        }
    }

    public SellerVO(long j11, long j12, @NotNull String title, @NotNull String subtitle, Integer num, String str, @NotNull String deeplink, @NotNull List<ProductVO> items, boolean z11, t tVar, Boolean bool, IconDTO iconDTO, RatingBadgeAtom ratingBadgeAtom) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.sellerId = j12;
        this.title = title;
        this.subtitle = subtitle;
        this.productsCount = num;
        this.logoImage = str;
        this.deeplink = deeplink;
        this.items = items;
        this.isFavorite = z11;
        this.tokenizedEvent = tVar;
        this.isPremium = bool;
        this.premiumIcon = iconDTO;
        this.ratingBadge = ratingBadgeAtom;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerVO)) {
            return false;
        }
        SellerVO sellerVO = (SellerVO) other;
        return this.id == sellerVO.id && this.sellerId == sellerVO.sellerId && Intrinsics.d(this.title, sellerVO.title) && Intrinsics.d(this.subtitle, sellerVO.subtitle) && Intrinsics.d(this.productsCount, sellerVO.productsCount) && Intrinsics.d(this.logoImage, sellerVO.logoImage) && Intrinsics.d(this.deeplink, sellerVO.deeplink) && Intrinsics.d(this.items, sellerVO.items) && this.isFavorite == sellerVO.isFavorite && Intrinsics.d(this.tokenizedEvent, sellerVO.tokenizedEvent) && Intrinsics.d(this.isPremium, sellerVO.isPremium) && Intrinsics.d(this.premiumIcon, sellerVO.premiumIcon) && Intrinsics.d(this.ratingBadge, sellerVO.ratingBadge);
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ProductVO> getItems() {
        return this.items;
    }

    public final String getLogoImage() {
        return this.logoImage;
    }

    public final Integer getProductsCount() {
        return this.productsCount;
    }

    public final RatingBadgeAtom getRatingBadge() {
        return this.ratingBadge;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final long getSellerId() {
        return this.sellerId;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
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
        int a11 = g.a(g.a(Pk0.c.a(Long.hashCode(this.id) * 31, 31, this.sellerId), 31, this.title), 31, this.subtitle);
        Integer num = this.productsCount;
        int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.logoImage;
        int a12 = C3532b.a(g.b(g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.deeplink), 31, this.items), 31, this.isFavorite);
        t tVar = this.tokenizedEvent;
        int hashCode2 = (a12 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Boolean bool = this.isPremium;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        IconDTO iconDTO = this.premiumIcon;
        int hashCode4 = (hashCode3 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        RatingBadgeAtom ratingBadgeAtom = this.ratingBadge;
        return hashCode4 + (ratingBadgeAtom != null ? ratingBadgeAtom.hashCode() : 0);
    }

    /* renamed from: isFavorite, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* renamed from: isPremium, reason: from getter */
    public final Boolean getIsPremium() {
        return this.isPremium;
    }

    public final void setFavorite(boolean z11) {
        this.isFavorite = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        long j12 = this.sellerId;
        String str = this.title;
        String str2 = this.subtitle;
        Integer num = this.productsCount;
        String str3 = this.logoImage;
        String str4 = this.deeplink;
        List<ProductVO> list = this.items;
        boolean z11 = this.isFavorite;
        t tVar = this.tokenizedEvent;
        Boolean bool = this.isPremium;
        IconDTO iconDTO = this.premiumIcon;
        RatingBadgeAtom ratingBadgeAtom = this.ratingBadge;
        StringBuilder d11 = C2702w.d(j11, "SellerVO(id=", ", sellerId=");
        d11.append(j12);
        d11.append(", title=");
        d11.append(str);
        d11.append(", subtitle=");
        d11.append(str2);
        d11.append(", productsCount=");
        d11.append(num);
        a.h(d11, ", logoImage=", str3, ", deeplink=", str4);
        AZ.c.c(d11, ", items=", list, ", isFavorite=", z11);
        d11.append(", tokenizedEvent=");
        d11.append(tVar);
        d11.append(", isPremium=");
        d11.append(bool);
        d11.append(", premiumIcon=");
        d11.append(iconDTO);
        d11.append(", ratingBadge=");
        d11.append(ratingBadgeAtom);
        d11.append(")");
        return d11.toString();
    }
}
