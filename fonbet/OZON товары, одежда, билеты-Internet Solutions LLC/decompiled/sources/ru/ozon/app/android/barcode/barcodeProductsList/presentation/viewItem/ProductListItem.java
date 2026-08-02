package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem;

import D3.g;
import F3.G;
import Fm.C3051a;
import Ns.b;
import TY.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem;", "", "id", "", "getId", "()J", "Status", "Product", "Button", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Button;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Product;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Status;", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ProductListItem {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Button;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button implements ProductListItem {

        @NotNull
        private final ButtonV3DTO button;
        private final long id;

        public Button(long j11, @NotNull ButtonV3DTO button) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.id = j11;
            this.button = button;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return this.id == button.id && Intrinsics.d(this.button, button.button);
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        @Override // ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.ProductListItem
        public long getId() {
            return this.id;
        }

        public int hashCode() {
            return this.button.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder c11 = G.c("Button(id=", this.id, ", button=", this.button);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jf\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b/\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Product;", "Ll20/c;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem;", "", "id", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "image", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "priceBadge", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "", "shouldShowSeparator", "<init>", "(JLru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Z)V", "copy", "(JLru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Z)Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Product;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "getImage", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getPriceBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "Z", "getShouldShowSeparator", "()Z", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Product implements c, ProductListItem {
        private final CommonControlSettings common;
        private final long id;

        @NotNull
        private final ImageVO image;

        @NotNull
        private final PriceDTO price;
        private final BadgeDTO priceBadge;
        private final boolean shouldShowSeparator;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public Product(long j11, @NotNull ImageVO image, @NotNull PriceDTO price, BadgeDTO badgeDTO, @NotNull TextDTO title, TextDTO textDTO, CommonControlSettings commonControlSettings, boolean z11) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = j11;
            this.image = image;
            this.price = price;
            this.priceBadge = badgeDTO;
            this.title = title;
            this.subtitle = textDTO;
            this.common = commonControlSettings;
            this.shouldShowSeparator = z11;
        }

        public static /* synthetic */ Product copy$default(Product product, long j11, ImageVO imageVO, PriceDTO priceDTO, BadgeDTO badgeDTO, TextDTO textDTO, TextDTO textDTO2, CommonControlSettings commonControlSettings, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = product.id;
            }
            long j12 = j11;
            if ((i11 & 2) != 0) {
                imageVO = product.image;
            }
            ImageVO imageVO2 = imageVO;
            if ((i11 & 4) != 0) {
                priceDTO = product.price;
            }
            PriceDTO priceDTO2 = priceDTO;
            if ((i11 & 8) != 0) {
                badgeDTO = product.priceBadge;
            }
            return product.copy(j12, imageVO2, priceDTO2, badgeDTO, (i11 & 16) != 0 ? product.title : textDTO, (i11 & 32) != 0 ? product.subtitle : textDTO2, (i11 & 64) != 0 ? product.common : commonControlSettings, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product.shouldShowSeparator : z11);
        }

        @NotNull
        public final Product copy(long id2, @NotNull ImageVO image, @NotNull PriceDTO price, BadgeDTO priceBadge, @NotNull TextDTO title, TextDTO subtitle, CommonControlSettings common, boolean shouldShowSeparator) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(title, "title");
            return new Product(id2, image, price, priceBadge, title, subtitle, common, shouldShowSeparator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Product)) {
                return false;
            }
            Product product = (Product) other;
            return this.id == product.id && Intrinsics.d(this.image, product.image) && Intrinsics.d(this.price, product.price) && Intrinsics.d(this.priceBadge, product.priceBadge) && Intrinsics.d(this.title, product.title) && Intrinsics.d(this.subtitle, product.subtitle) && Intrinsics.d(this.common, product.common) && this.shouldShowSeparator == product.shouldShowSeparator;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final ImageVO getImage() {
            return this.image;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        public final BadgeDTO getPriceBadge() {
            return this.priceBadge;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return null;
        }

        public final boolean getShouldShowSeparator() {
            return this.shouldShowSeparator;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return hashCode();
        }

        public int hashCode() {
            int b11 = C3051a.b(this.price, (this.image.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31);
            BadgeDTO badgeDTO = this.priceBadge;
            int a11 = b.a(this.title, (b11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31);
            TextDTO textDTO = this.subtitle;
            int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return Boolean.hashCode(this.shouldShowSeparator) + ((hashCode + (commonControlSettings != null ? commonControlSettings.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            ImageVO imageVO = this.image;
            PriceDTO priceDTO = this.price;
            BadgeDTO badgeDTO = this.priceBadge;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            CommonControlSettings commonControlSettings = this.common;
            boolean z11 = this.shouldShowSeparator;
            StringBuilder sb2 = new StringBuilder("Product(id=");
            sb2.append(j11);
            sb2.append(", image=");
            sb2.append(imageVO);
            sb2.append(", price=");
            sb2.append(priceDTO);
            sb2.append(", priceBadge=");
            sb2.append(badgeDTO);
            g.i(", title=", ", subtitle=", sb2, textDTO, textDTO2);
            sb2.append(", common=");
            sb2.append(commonControlSettings);
            sb2.append(", shouldShowSeparator=");
            sb2.append(z11);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\f\rR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Status;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "count", "getCount", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "NearTitle", "ContainerRight", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Status$ContainerRight;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Status$NearTitle;", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Status extends ProductListItem {

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Status$ContainerRight;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Status;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "count", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCount", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ContainerRight implements Status {
            private final TextDTO count;
            private final long id;
            private final PriceDTO price;

            @NotNull
            private final TextDTO title;

            public ContainerRight(long j11, @NotNull TextDTO title, TextDTO textDTO, PriceDTO priceDTO) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.id = j11;
                this.title = title;
                this.count = textDTO;
                this.price = priceDTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ContainerRight)) {
                    return false;
                }
                ContainerRight containerRight = (ContainerRight) other;
                return this.id == containerRight.id && Intrinsics.d(this.title, containerRight.title) && Intrinsics.d(this.count, containerRight.count) && Intrinsics.d(this.price, containerRight.price);
            }

            @Override // ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.ProductListItem.Status
            public TextDTO getCount() {
                return this.count;
            }

            @Override // ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.ProductListItem
            public long getId() {
                return this.id;
            }

            @Override // ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.ProductListItem.Status
            public PriceDTO getPrice() {
                return this.price;
            }

            @Override // ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.ProductListItem.Status
            @NotNull
            public TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
                TextDTO textDTO = this.count;
                int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                PriceDTO priceDTO = this.price;
                return hashCode + (priceDTO != null ? priceDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.count;
                PriceDTO priceDTO = this.price;
                StringBuilder b11 = a.b("ContainerRight(id=", j11, ", title=", textDTO);
                b11.append(", count=");
                b11.append(textDTO2);
                b11.append(", price=");
                b11.append(priceDTO);
                b11.append(")");
                return b11.toString();
            }
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Status$NearTitle;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Status;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "count", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCount", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NearTitle implements Status {
            private final TextDTO count;
            private final long id;
            private final PriceDTO price;

            @NotNull
            private final TextDTO title;

            public NearTitle(long j11, @NotNull TextDTO title, TextDTO textDTO, PriceDTO priceDTO) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.id = j11;
                this.title = title;
                this.count = textDTO;
                this.price = priceDTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NearTitle)) {
                    return false;
                }
                NearTitle nearTitle = (NearTitle) other;
                return this.id == nearTitle.id && Intrinsics.d(this.title, nearTitle.title) && Intrinsics.d(this.count, nearTitle.count) && Intrinsics.d(this.price, nearTitle.price);
            }

            @Override // ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.ProductListItem.Status
            public TextDTO getCount() {
                return this.count;
            }

            @Override // ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.ProductListItem
            public long getId() {
                return this.id;
            }

            @Override // ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.ProductListItem.Status
            public PriceDTO getPrice() {
                return this.price;
            }

            @Override // ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.ProductListItem.Status
            @NotNull
            public TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
                TextDTO textDTO = this.count;
                int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                PriceDTO priceDTO = this.price;
                return hashCode + (priceDTO != null ? priceDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.count;
                PriceDTO priceDTO = this.price;
                StringBuilder b11 = a.b("NearTitle(id=", j11, ", title=", textDTO);
                b11.append(", count=");
                b11.append(textDTO2);
                b11.append(", price=");
                b11.append(priceDTO);
                b11.append(")");
                return b11.toString();
            }
        }

        TextDTO getCount();

        PriceDTO getPrice();

        @NotNull
        TextDTO getTitle();
    }

    long getId();
}
