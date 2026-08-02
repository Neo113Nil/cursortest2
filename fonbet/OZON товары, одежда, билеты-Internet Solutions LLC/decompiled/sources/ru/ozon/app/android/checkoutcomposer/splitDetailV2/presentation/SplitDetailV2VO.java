package ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation;

import Am.C2438a;
import B0.C2454a;
import B90.C2619v;
import Bl.C2639a;
import G.g;
import J.d;
import Lh.a;
import Tl.b;
import Ve.C4598rp;
import Ve.C4636t5;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.checkoutcomposer.common.promoIcon.PromoIconPosition;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001*B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split;", "splits", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Settings;", "settings", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Settings;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getSplits", "()Ljava/util/List;", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Settings;", "getSettings", "()Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Settings;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Split", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SplitDetailV2VO implements c {
    private final TextAtom header;
    private final long id;
    private final Split.Settings settings;

    @NotNull
    private final List<Split> splits;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split;", "", "<init>", "()V", "Horizontal", "Vertical", "Settings", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Horizontal;", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Vertical;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Split {

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Horizontal;", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Horizontal$ProductImage;", "carousel", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getCarousel", "()Ljava/util/List;", "ProductImage", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Horizontal extends Split {

            @NotNull
            private final List<ProductImage> carousel;

            @NotNull
            private final TextAtom title;

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Horizontal$ProductImage;", "", "", "imageUrl", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "promoIcon", "Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "promoIconPosition", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPromoIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "getPromoIconPosition", "()Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ProductImage {
                public static final int $stable = IconDTO.$stable;

                @NotNull
                private final String imageUrl;
                private final IconDTO promoIcon;

                @NotNull
                private final PromoIconPosition promoIconPosition;

                public ProductImage(@NotNull String imageUrl, IconDTO iconDTO, @NotNull PromoIconPosition promoIconPosition) {
                    Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                    Intrinsics.checkNotNullParameter(promoIconPosition, "promoIconPosition");
                    this.imageUrl = imageUrl;
                    this.promoIcon = iconDTO;
                    this.promoIconPosition = promoIconPosition;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ProductImage)) {
                        return false;
                    }
                    ProductImage productImage = (ProductImage) other;
                    return Intrinsics.d(this.imageUrl, productImage.imageUrl) && Intrinsics.d(this.promoIcon, productImage.promoIcon) && this.promoIconPosition == productImage.promoIconPosition;
                }

                @NotNull
                public final String getImageUrl() {
                    return this.imageUrl;
                }

                public int hashCode() {
                    int hashCode = this.imageUrl.hashCode() * 31;
                    IconDTO iconDTO = this.promoIcon;
                    return this.promoIconPosition.hashCode() + ((hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31);
                }

                @NotNull
                public String toString() {
                    return "ProductImage(imageUrl=" + this.imageUrl + ", promoIcon=" + this.promoIcon + ", promoIconPosition=" + this.promoIconPosition + ")";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Horizontal(@NotNull TextAtom title, @NotNull List<ProductImage> carousel) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(carousel, "carousel");
                this.title = title;
                this.carousel = carousel;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Horizontal)) {
                    return false;
                }
                Horizontal horizontal = (Horizontal) other;
                return Intrinsics.d(this.title, horizontal.title) && Intrinsics.d(this.carousel, horizontal.carousel);
            }

            @NotNull
            public final List<ProductImage> getCarousel() {
                return this.carousel;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.carousel.hashCode() + (this.title.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return d.c("Horizontal(title=", this.title, ", carousel=", this.carousel, ")");
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Settings;", "", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "topPadding", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getTopPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Settings {
            private final CommonCellSettings.LayoutPadding topPadding;

            public Settings(CommonCellSettings.LayoutPadding layoutPadding) {
                this.topPadding = layoutPadding;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Settings) && this.topPadding == ((Settings) other).topPadding;
            }

            public final CommonCellSettings.LayoutPadding getTopPadding() {
                return this.topPadding;
            }

            public int hashCode() {
                CommonCellSettings.LayoutPadding layoutPadding = this.topPadding;
                if (layoutPadding == null) {
                    return 0;
                }
                return layoutPadding.hashCode();
            }

            @NotNull
            public String toString() {
                return "Settings(topPadding=" + this.topPadding + ")";
            }
        }

        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b*\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b+\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Vertical;", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split;", "", "image", "Lru/ozon/uni/atoms/data/price/Price;", "price", "premiumPrice", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "quantity", "pricePerItem", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "annotation", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "promoIcon", "Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "promoIconPosition", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Vertical$QuantityControl;", "quantityControl", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;LWZ/t;Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Vertical$QuantityControl;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getPremiumPrice", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getQuantity", "getPricePerItem", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPromoIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "getPromoIconPosition", "()Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Vertical$QuantityControl;", "getQuantityControl", "()Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Vertical$QuantityControl;", "QuantityControl", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Vertical extends Split {
            private final DisclaimerAtom annotation;

            @NotNull
            private final TextAtom description;

            @NotNull
            private final String image;
            private final Price premiumPrice;
            private final Price price;
            private final TextAtom pricePerItem;
            private final IconDTO promoIcon;

            @NotNull
            private final PromoIconPosition promoIconPosition;
            private final TextAtom quantity;
            private final QuantityControl quantityControl;
            private final t tokenizedEvent;

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b$\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Vertical$QuantityControl;", "", "", "minimum", "maximum", "current", "debounceDelay", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "incrementTokenizedEvent", "decrementTokenizedEvent", "<init>", "(IIILjava/lang/Integer;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMinimum", "getMaximum", "getCurrent", "Ljava/lang/Integer;", "getDebounceDelay", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getIncrementTokenizedEvent", "()LWZ/t;", "getDecrementTokenizedEvent", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class QuantityControl {

                @NotNull
                private final AtomAction action;
                private final int current;
                private final Integer debounceDelay;
                private final t decrementTokenizedEvent;
                private final t incrementTokenizedEvent;
                private final int maximum;
                private final int minimum;

                public QuantityControl(int i11, int i12, int i13, Integer num, @NotNull AtomAction action, t tVar, t tVar2) {
                    Intrinsics.checkNotNullParameter(action, "action");
                    this.minimum = i11;
                    this.maximum = i12;
                    this.current = i13;
                    this.debounceDelay = num;
                    this.action = action;
                    this.incrementTokenizedEvent = tVar;
                    this.decrementTokenizedEvent = tVar2;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof QuantityControl)) {
                        return false;
                    }
                    QuantityControl quantityControl = (QuantityControl) other;
                    return this.minimum == quantityControl.minimum && this.maximum == quantityControl.maximum && this.current == quantityControl.current && Intrinsics.d(this.debounceDelay, quantityControl.debounceDelay) && Intrinsics.d(this.action, quantityControl.action) && Intrinsics.d(this.incrementTokenizedEvent, quantityControl.incrementTokenizedEvent) && Intrinsics.d(this.decrementTokenizedEvent, quantityControl.decrementTokenizedEvent);
                }

                @NotNull
                public final AtomAction getAction() {
                    return this.action;
                }

                public final int getCurrent() {
                    return this.current;
                }

                public final Integer getDebounceDelay() {
                    return this.debounceDelay;
                }

                public final t getDecrementTokenizedEvent() {
                    return this.decrementTokenizedEvent;
                }

                public final t getIncrementTokenizedEvent() {
                    return this.incrementTokenizedEvent;
                }

                public final int getMaximum() {
                    return this.maximum;
                }

                public final int getMinimum() {
                    return this.minimum;
                }

                public int hashCode() {
                    int a11 = C2454a.a(this.current, C2454a.a(this.maximum, Integer.hashCode(this.minimum) * 31, 31), 31);
                    Integer num = this.debounceDelay;
                    int a12 = C4598rp.a(this.action, (a11 + (num == null ? 0 : num.hashCode())) * 31, 31);
                    t tVar = this.incrementTokenizedEvent;
                    int hashCode = (a12 + (tVar == null ? 0 : tVar.hashCode())) * 31;
                    t tVar2 = this.decrementTokenizedEvent;
                    return hashCode + (tVar2 != null ? tVar2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    int i11 = this.minimum;
                    int i12 = this.maximum;
                    int i13 = this.current;
                    Integer num = this.debounceDelay;
                    AtomAction atomAction = this.action;
                    t tVar = this.incrementTokenizedEvent;
                    t tVar2 = this.decrementTokenizedEvent;
                    StringBuilder a11 = C2438a.a("QuantityControl(minimum=", i11, ", maximum=", ", current=", i12);
                    a11.append(i13);
                    a11.append(", debounceDelay=");
                    a11.append(num);
                    a11.append(", action=");
                    a11.append(atomAction);
                    a11.append(", incrementTokenizedEvent=");
                    a11.append(tVar);
                    a11.append(", decrementTokenizedEvent=");
                    return b.d(a11, tVar2, ")");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Vertical(@NotNull String image, Price price, Price price2, @NotNull TextAtom description, TextAtom textAtom, TextAtom textAtom2, DisclaimerAtom disclaimerAtom, IconDTO iconDTO, @NotNull PromoIconPosition promoIconPosition, t tVar, QuantityControl quantityControl) {
                super(null);
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(promoIconPosition, "promoIconPosition");
                this.image = image;
                this.price = price;
                this.premiumPrice = price2;
                this.description = description;
                this.quantity = textAtom;
                this.pricePerItem = textAtom2;
                this.annotation = disclaimerAtom;
                this.promoIcon = iconDTO;
                this.promoIconPosition = promoIconPosition;
                this.tokenizedEvent = tVar;
                this.quantityControl = quantityControl;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Vertical)) {
                    return false;
                }
                Vertical vertical = (Vertical) other;
                return Intrinsics.d(this.image, vertical.image) && Intrinsics.d(this.price, vertical.price) && Intrinsics.d(this.premiumPrice, vertical.premiumPrice) && Intrinsics.d(this.description, vertical.description) && Intrinsics.d(this.quantity, vertical.quantity) && Intrinsics.d(this.pricePerItem, vertical.pricePerItem) && Intrinsics.d(this.annotation, vertical.annotation) && Intrinsics.d(this.promoIcon, vertical.promoIcon) && this.promoIconPosition == vertical.promoIconPosition && Intrinsics.d(this.tokenizedEvent, vertical.tokenizedEvent) && Intrinsics.d(this.quantityControl, vertical.quantityControl);
            }

            public final DisclaimerAtom getAnnotation() {
                return this.annotation;
            }

            @NotNull
            public final TextAtom getDescription() {
                return this.description;
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            public final Price getPremiumPrice() {
                return this.premiumPrice;
            }

            public final Price getPrice() {
                return this.price;
            }

            public final TextAtom getPricePerItem() {
                return this.pricePerItem;
            }

            public final IconDTO getPromoIcon() {
                return this.promoIcon;
            }

            @NotNull
            public final PromoIconPosition getPromoIconPosition() {
                return this.promoIconPosition;
            }

            public final TextAtom getQuantity() {
                return this.quantity;
            }

            public final QuantityControl getQuantityControl() {
                return this.quantityControl;
            }

            public final t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int hashCode = this.image.hashCode() * 31;
                Price price = this.price;
                int hashCode2 = (hashCode + (price == null ? 0 : price.hashCode())) * 31;
                Price price2 = this.premiumPrice;
                int b11 = C2619v.b((hashCode2 + (price2 == null ? 0 : price2.hashCode())) * 31, 31, this.description);
                TextAtom textAtom = this.quantity;
                int hashCode3 = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
                TextAtom textAtom2 = this.pricePerItem;
                int hashCode4 = (hashCode3 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
                DisclaimerAtom disclaimerAtom = this.annotation;
                int hashCode5 = (hashCode4 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
                IconDTO iconDTO = this.promoIcon;
                int hashCode6 = (this.promoIconPosition.hashCode() + ((hashCode5 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31)) * 31;
                t tVar = this.tokenizedEvent;
                int hashCode7 = (hashCode6 + (tVar == null ? 0 : tVar.hashCode())) * 31;
                QuantityControl quantityControl = this.quantityControl;
                return hashCode7 + (quantityControl != null ? quantityControl.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.image;
                Price price = this.price;
                Price price2 = this.premiumPrice;
                TextAtom textAtom = this.description;
                TextAtom textAtom2 = this.quantity;
                TextAtom textAtom3 = this.pricePerItem;
                DisclaimerAtom disclaimerAtom = this.annotation;
                IconDTO iconDTO = this.promoIcon;
                PromoIconPosition promoIconPosition = this.promoIconPosition;
                t tVar = this.tokenizedEvent;
                QuantityControl quantityControl = this.quantityControl;
                StringBuilder sb2 = new StringBuilder("Vertical(image=");
                sb2.append(str);
                sb2.append(", price=");
                sb2.append(price);
                sb2.append(", premiumPrice=");
                sb2.append(price2);
                sb2.append(", description=");
                sb2.append(textAtom);
                sb2.append(", quantity=");
                C4636t5.c(", pricePerItem=", ", annotation=", sb2, textAtom2, textAtom3);
                sb2.append(disclaimerAtom);
                sb2.append(", promoIcon=");
                sb2.append(iconDTO);
                sb2.append(", promoIconPosition=");
                sb2.append(promoIconPosition);
                sb2.append(", tokenizedEvent=");
                sb2.append(tVar);
                sb2.append(", quantityControl=");
                sb2.append(quantityControl);
                sb2.append(")");
                return sb2.toString();
            }
        }

        public /* synthetic */ Split(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Split() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SplitDetailV2VO(long j11, TextAtom textAtom, @NotNull List<? extends Split> splits, Split.Settings settings, t tVar) {
        Intrinsics.checkNotNullParameter(splits, "splits");
        this.id = j11;
        this.header = textAtom;
        this.splits = splits;
        this.settings = settings;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitDetailV2VO)) {
            return false;
        }
        SplitDetailV2VO splitDetailV2VO = (SplitDetailV2VO) other;
        return this.id == splitDetailV2VO.id && Intrinsics.d(this.header, splitDetailV2VO.header) && Intrinsics.d(this.splits, splitDetailV2VO.splits) && Intrinsics.d(this.settings, splitDetailV2VO.settings) && Intrinsics.d(this.tokenizedEvent, splitDetailV2VO.tokenizedEvent);
    }

    public final TextAtom getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Split.Settings getSettings() {
        return this.settings;
    }

    @NotNull
    public final List<Split> getSplits() {
        return this.splits;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextAtom textAtom = this.header;
        int b11 = g.b((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.splits);
        Split.Settings settings = this.settings;
        int hashCode2 = (b11 + (settings == null ? 0 : settings.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.header;
        List<Split> list = this.splits;
        Split.Settings settings = this.settings;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2639a.c("SplitDetailV2VO(id=", j11, ", header=", textAtom);
        c11.append(", splits=");
        c11.append(list);
        c11.append(", settings=");
        c11.append(settings);
        return a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
