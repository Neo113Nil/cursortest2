package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation;

import Am.C2438a;
import B0.C2454a;
import Ep.a;
import Fm.C3051a;
import G.g;
import J0.P;
import Tz.C4055a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation.FreshProgressBarVO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002()B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0011R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary;", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$InteractiveActions;", "interactiveActions", "", "backgroundColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(JLru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary;Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$InteractiveActions;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary;", "getSummary", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$InteractiveActions;", "getInteractiveActions", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$InteractiveActions;", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "Summary", "InteractiveActions", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckoutTotalVO implements c {

    @NotNull
    private final String backgroundColor;
    private final long id;

    @NotNull
    private final InteractiveActions interactiveActions;

    @NotNull
    private final Summary summary;
    private final t trackingInfo;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$InteractiveActions;", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "hints", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshProgressBarVO;", "progressBar", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/List;Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshProgressBarVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/util/List;", "getHints", "()Ljava/util/List;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshProgressBarVO;", "getProgressBar", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshProgressBarVO;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InteractiveActions {

        @NotNull
        private final ButtonV3DTO button;
        private final List<AtomDTO> hints;
        private final FreshProgressBarVO progressBar;

        /* JADX WARN: Multi-variable type inference failed */
        public InteractiveActions(@NotNull ButtonV3DTO button, List<? extends AtomDTO> list, FreshProgressBarVO freshProgressBarVO) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
            this.hints = list;
            this.progressBar = freshProgressBarVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InteractiveActions)) {
                return false;
            }
            InteractiveActions interactiveActions = (InteractiveActions) other;
            return Intrinsics.d(this.button, interactiveActions.button) && Intrinsics.d(this.hints, interactiveActions.hints) && Intrinsics.d(this.progressBar, interactiveActions.progressBar);
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final List<AtomDTO> getHints() {
            return this.hints;
        }

        public final FreshProgressBarVO getProgressBar() {
            return this.progressBar;
        }

        public int hashCode() {
            int hashCode = this.button.hashCode() * 31;
            List<AtomDTO> list = this.hints;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            FreshProgressBarVO freshProgressBarVO = this.progressBar;
            return hashCode2 + (freshProgressBarVO != null ? freshProgressBarVO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "InteractiveActions(button=" + this.button + ", hints=" + this.hints + ", progressBar=" + this.progressBar + ")";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0003#$%B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary;", "", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$Header;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$PriceSection;", "priceSection", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "infos", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$Spacers;", "spacers", "<init>", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$Header;Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$PriceSection;Ljava/util/List;Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$Spacers;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$Header;", "getHeader", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$Header;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$PriceSection;", "getPriceSection", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$PriceSection;", "Ljava/util/List;", "getInfos", "()Ljava/util/List;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$Spacers;", "getSpacers", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$Spacers;", "Header", "PriceSection", "Spacers", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Summary {

        @NotNull
        private final Header header;
        private final List<CellDTO> infos;

        @NotNull
        private final PriceSection priceSection;

        @NotNull
        private final Spacers spacers;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$Header;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Header {
            public static final int $stable = PriceDTO.$stable;
            private final PriceDTO price;

            @NotNull
            private final TextDTO title;

            public Header(@NotNull TextDTO title, PriceDTO priceDTO) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.price = priceDTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Header)) {
                    return false;
                }
                Header header = (Header) other;
                return Intrinsics.d(this.title, header.title) && Intrinsics.d(this.price, header.price);
            }

            public final PriceDTO getPrice() {
                return this.price;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                PriceDTO priceDTO = this.price;
                return hashCode + (priceDTO == null ? 0 : priceDTO.hashCode());
            }

            @NotNull
            public String toString() {
                return "Header(title=" + this.title + ", price=" + this.price + ")";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$PriceSection;", "", "", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$PriceSection$PriceBlock;", "prices", "", "backgroundColor", "", "cornerRadius", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPrices", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "Ljava/lang/Integer;", "getCornerRadius", "()Ljava/lang/Integer;", "PriceBlock", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PriceSection {
            private final String backgroundColor;
            private final Integer cornerRadius;

            @NotNull
            private final List<PriceBlock> prices;

            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$PriceSection$PriceBlock;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "subtitle", "Lru/ozon/uni/atoms/data/AtomDTO;", "infoBadge", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/AtomDTO;", "getInfoBadge", "()Lru/ozon/uni/atoms/data/AtomDTO;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class PriceBlock {
                public static final int $stable = AtomDTO.$stable | PriceDTO.$stable;
                private final AtomDTO infoBadge;

                @NotNull
                private final PriceDTO price;
                private final TextDTO subtitle;

                @NotNull
                private final TextDTO title;

                public PriceBlock(@NotNull TextDTO title, @NotNull PriceDTO price, TextDTO textDTO, AtomDTO atomDTO) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(price, "price");
                    this.title = title;
                    this.price = price;
                    this.subtitle = textDTO;
                    this.infoBadge = atomDTO;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PriceBlock)) {
                        return false;
                    }
                    PriceBlock priceBlock = (PriceBlock) other;
                    return Intrinsics.d(this.title, priceBlock.title) && Intrinsics.d(this.price, priceBlock.price) && Intrinsics.d(this.subtitle, priceBlock.subtitle) && Intrinsics.d(this.infoBadge, priceBlock.infoBadge);
                }

                public final AtomDTO getInfoBadge() {
                    return this.infoBadge;
                }

                @NotNull
                public final PriceDTO getPrice() {
                    return this.price;
                }

                public final TextDTO getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final TextDTO getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    int b11 = C3051a.b(this.price, this.title.hashCode() * 31, 31);
                    TextDTO textDTO = this.subtitle;
                    int hashCode = (b11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                    AtomDTO atomDTO = this.infoBadge;
                    return hashCode + (atomDTO != null ? atomDTO.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "PriceBlock(title=" + this.title + ", price=" + this.price + ", subtitle=" + this.subtitle + ", infoBadge=" + this.infoBadge + ")";
                }
            }

            public PriceSection(@NotNull List<PriceBlock> prices, String str, Integer num) {
                Intrinsics.checkNotNullParameter(prices, "prices");
                this.prices = prices;
                this.backgroundColor = str;
                this.cornerRadius = num;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PriceSection)) {
                    return false;
                }
                PriceSection priceSection = (PriceSection) other;
                return Intrinsics.d(this.prices, priceSection.prices) && Intrinsics.d(this.backgroundColor, priceSection.backgroundColor) && Intrinsics.d(this.cornerRadius, priceSection.cornerRadius);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final Integer getCornerRadius() {
                return this.cornerRadius;
            }

            @NotNull
            public final List<PriceBlock> getPrices() {
                return this.prices;
            }

            public int hashCode() {
                int hashCode = this.prices.hashCode() * 31;
                String str = this.backgroundColor;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Integer num = this.cornerRadius;
                return hashCode2 + (num != null ? num.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                List<PriceBlock> list = this.prices;
                String str = this.backgroundColor;
                return a.c(C4055a.a("PriceSection(prices=", ", backgroundColor=", str, ", cornerRadius=", list), this.cornerRadius, ")");
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$Spacers;", "", "", "top", "bottom", "left", "right", "betweenPrices", "betweenInfos", "<init>", "(IIIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "getLeft", "getRight", "getBetweenPrices", "getBetweenInfos", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Spacers {
            private final int betweenInfos;
            private final int betweenPrices;
            private final int bottom;
            private final int left;
            private final int right;
            private final int top;

            public Spacers(int i11, int i12, int i13, int i14, int i15, int i16) {
                this.top = i11;
                this.bottom = i12;
                this.left = i13;
                this.right = i14;
                this.betweenPrices = i15;
                this.betweenInfos = i16;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Spacers)) {
                    return false;
                }
                Spacers spacers = (Spacers) other;
                return this.top == spacers.top && this.bottom == spacers.bottom && this.left == spacers.left && this.right == spacers.right && this.betweenPrices == spacers.betweenPrices && this.betweenInfos == spacers.betweenInfos;
            }

            public final int getBetweenInfos() {
                return this.betweenInfos;
            }

            public final int getBetweenPrices() {
                return this.betweenPrices;
            }

            public final int getBottom() {
                return this.bottom;
            }

            public final int getLeft() {
                return this.left;
            }

            public final int getRight() {
                return this.right;
            }

            public final int getTop() {
                return this.top;
            }

            public int hashCode() {
                return Integer.hashCode(this.betweenInfos) + C2454a.a(this.betweenPrices, C2454a.a(this.right, C2454a.a(this.left, C2454a.a(this.bottom, Integer.hashCode(this.top) * 31, 31), 31), 31), 31);
            }

            @NotNull
            public String toString() {
                int i11 = this.top;
                int i12 = this.bottom;
                int i13 = this.left;
                int i14 = this.right;
                int i15 = this.betweenPrices;
                int i16 = this.betweenInfos;
                StringBuilder a11 = C2438a.a("Spacers(top=", i11, ", bottom=", ", left=", i12);
                Ek.a.f(i13, i14, ", right=", ", betweenPrices=", a11);
                return P.a(i15, i16, ", betweenInfos=", ")", a11);
            }
        }

        public Summary(@NotNull Header header, @NotNull PriceSection priceSection, List<CellDTO> list, @NotNull Spacers spacers) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(priceSection, "priceSection");
            Intrinsics.checkNotNullParameter(spacers, "spacers");
            this.header = header;
            this.priceSection = priceSection;
            this.infos = list;
            this.spacers = spacers;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Summary)) {
                return false;
            }
            Summary summary = (Summary) other;
            return Intrinsics.d(this.header, summary.header) && Intrinsics.d(this.priceSection, summary.priceSection) && Intrinsics.d(this.infos, summary.infos) && Intrinsics.d(this.spacers, summary.spacers);
        }

        @NotNull
        public final Header getHeader() {
            return this.header;
        }

        public final List<CellDTO> getInfos() {
            return this.infos;
        }

        @NotNull
        public final PriceSection getPriceSection() {
            return this.priceSection;
        }

        @NotNull
        public final Spacers getSpacers() {
            return this.spacers;
        }

        public int hashCode() {
            int hashCode = (this.priceSection.hashCode() + (this.header.hashCode() * 31)) * 31;
            List<CellDTO> list = this.infos;
            return this.spacers.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "Summary(header=" + this.header + ", priceSection=" + this.priceSection + ", infos=" + this.infos + ", spacers=" + this.spacers + ")";
        }
    }

    public CheckoutTotalVO(long j11, @NotNull Summary summary, @NotNull InteractiveActions interactiveActions, @NotNull String backgroundColor, t tVar) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(interactiveActions, "interactiveActions");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.summary = summary;
        this.interactiveActions = interactiveActions;
        this.backgroundColor = backgroundColor;
        this.trackingInfo = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutTotalVO)) {
            return false;
        }
        CheckoutTotalVO checkoutTotalVO = (CheckoutTotalVO) other;
        return this.id == checkoutTotalVO.id && Intrinsics.d(this.summary, checkoutTotalVO.summary) && Intrinsics.d(this.interactiveActions, checkoutTotalVO.interactiveActions) && Intrinsics.d(this.backgroundColor, checkoutTotalVO.backgroundColor) && Intrinsics.d(this.trackingInfo, checkoutTotalVO.trackingInfo);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final InteractiveActions getInteractiveActions() {
        return this.interactiveActions;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Summary getSummary() {
        return this.summary;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a((this.interactiveActions.hashCode() + ((this.summary.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31, 31, this.backgroundColor);
        t tVar = this.trackingInfo;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Summary summary = this.summary;
        InteractiveActions interactiveActions = this.interactiveActions;
        String str = this.backgroundColor;
        t tVar = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CheckoutTotalVO(id=");
        sb2.append(j11);
        sb2.append(", summary=");
        sb2.append(summary);
        sb2.append(", interactiveActions=");
        sb2.append(interactiveActions);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        return Lh.a.b(sb2, ", trackingInfo=", tVar, ")");
    }
}
