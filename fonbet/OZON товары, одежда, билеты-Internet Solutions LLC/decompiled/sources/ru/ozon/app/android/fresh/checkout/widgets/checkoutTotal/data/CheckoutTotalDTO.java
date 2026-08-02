package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.data;

import B3.p;
import Fm.C3051a;
import GR.b;
import Lh.a;
import Tz.C4055a;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.data.FreshProgressBarDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002 !B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO;", "", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary;", "interactiveActions", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$InteractiveActions;", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary;Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$InteractiveActions;Ljava/lang/String;Ljava/util/Map;)V", "getSummary", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary;", "getInteractiveActions", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$InteractiveActions;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Summary", "InteractiveActions", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckoutTotalDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final InteractiveActions interactiveActions;

    @NotNull
    private final Summary summary;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$InteractiveActions;", "", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "hints", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "progressBar", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/data/FreshProgressBarDTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/List;Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/data/FreshProgressBarDTO;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getHints", "()Ljava/util/List;", "getProgressBar", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/data/FreshProgressBarDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InteractiveActions {
        public static final int $stable = 8;

        @NotNull
        private final ButtonV3DTO button;
        private final List<AtomDTO> hints;
        private final FreshProgressBarDTO progressBar;

        /* JADX WARN: Multi-variable type inference failed */
        public InteractiveActions(@NotNull ButtonV3DTO button, List<? extends AtomDTO> list, FreshProgressBarDTO freshProgressBarDTO) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
            this.hints = list;
            this.progressBar = freshProgressBarDTO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InteractiveActions copy$default(InteractiveActions interactiveActions, ButtonV3DTO buttonV3DTO, List list, FreshProgressBarDTO freshProgressBarDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonV3DTO = interactiveActions.button;
            }
            if ((i11 & 2) != 0) {
                list = interactiveActions.hints;
            }
            if ((i11 & 4) != 0) {
                freshProgressBarDTO = interactiveActions.progressBar;
            }
            return interactiveActions.copy(buttonV3DTO, list, freshProgressBarDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final List<AtomDTO> component2() {
            return this.hints;
        }

        /* renamed from: component3, reason: from getter */
        public final FreshProgressBarDTO getProgressBar() {
            return this.progressBar;
        }

        @NotNull
        public final InteractiveActions copy(@NotNull ButtonV3DTO button, List<? extends AtomDTO> hints, FreshProgressBarDTO progressBar) {
            Intrinsics.checkNotNullParameter(button, "button");
            return new InteractiveActions(button, hints, progressBar);
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

        public final FreshProgressBarDTO getProgressBar() {
            return this.progressBar;
        }

        public int hashCode() {
            int hashCode = this.button.hashCode() * 31;
            List<AtomDTO> list = this.hints;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            FreshProgressBarDTO freshProgressBarDTO = this.progressBar;
            return hashCode2 + (freshProgressBarDTO != null ? freshProgressBarDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "InteractiveActions(button=" + this.button + ", hints=" + this.hints + ", progressBar=" + this.progressBar + ")";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003!\"#B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$Header;", "priceSection", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$PriceSection;", "infos", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "spacers", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$Spacers;", "<init>", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$Header;Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$PriceSection;Ljava/util/List;Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$Spacers;)V", "getHeader", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$Header;", "getPriceSection", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$PriceSection;", "getInfos", "()Ljava/util/List;", "getSpacers", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$Spacers;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Header", "PriceSection", "Spacers", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Summary {
        public static final int $stable = 8;

        @NotNull
        private final Header header;
        private final List<CellDTO> infos;

        @NotNull
        private final PriceSection priceSection;
        private final Spacers spacers;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$Header;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

            public static /* synthetic */ Header copy$default(Header header, TextDTO textDTO, PriceDTO priceDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = header.title;
                }
                if ((i11 & 2) != 0) {
                    priceDTO = header.price;
                }
                return header.copy(textDTO, priceDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final PriceDTO getPrice() {
                return this.price;
            }

            @NotNull
            public final Header copy(@NotNull TextDTO title, PriceDTO price) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new Header(title, price);
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

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$PriceSection;", "", "prices", "", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$PriceSection$PriceBlock;", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getPrices", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PriceBlock", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class PriceSection {
            public static final int $stable = 8;
            private final String backgroundColor;
            private final CornerRadius cornerRadius;

            @NotNull
            private final List<PriceBlock> prices;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$PriceSection$PriceBlock;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "subtitle", "infoBadge", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getSubtitle", "getInfoBadge", "()Lru/ozon/uni/atoms/data/AtomDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class PriceBlock {
                public static final int $stable = AtomDTO.$stable | PriceDTO.$stable;
                private final AtomDTO infoBadge;

                @NotNull
                private final PriceDTO price;
                private final TextDTO subtitle;

                @NotNull
                private final TextDTO title;

                public PriceBlock(@NotNull TextDTO title, @NotNull PriceDTO price, TextDTO textDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "badge", type = BadgeDTO.class), @ProtoOneOfSignature(name = "icon", type = IconDTO.class)}) @ProtoOneOf AtomDTO atomDTO) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(price, "price");
                    this.title = title;
                    this.price = price;
                    this.subtitle = textDTO;
                    this.infoBadge = atomDTO;
                }

                public static /* synthetic */ PriceBlock copy$default(PriceBlock priceBlock, TextDTO textDTO, PriceDTO priceDTO, TextDTO textDTO2, AtomDTO atomDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textDTO = priceBlock.title;
                    }
                    if ((i11 & 2) != 0) {
                        priceDTO = priceBlock.price;
                    }
                    if ((i11 & 4) != 0) {
                        textDTO2 = priceBlock.subtitle;
                    }
                    if ((i11 & 8) != 0) {
                        atomDTO = priceBlock.infoBadge;
                    }
                    return priceBlock.copy(textDTO, priceDTO, textDTO2, atomDTO);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TextDTO getTitle() {
                    return this.title;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final PriceDTO getPrice() {
                    return this.price;
                }

                /* renamed from: component3, reason: from getter */
                public final TextDTO getSubtitle() {
                    return this.subtitle;
                }

                /* renamed from: component4, reason: from getter */
                public final AtomDTO getInfoBadge() {
                    return this.infoBadge;
                }

                @NotNull
                public final PriceBlock copy(@NotNull TextDTO title, @NotNull PriceDTO price, TextDTO subtitle, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "badge", type = BadgeDTO.class), @ProtoOneOfSignature(name = "icon", type = IconDTO.class)}) @ProtoOneOf AtomDTO infoBadge) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(price, "price");
                    return new PriceBlock(title, price, subtitle, infoBadge);
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

            public PriceSection(@NotNull List<PriceBlock> prices, String str, CornerRadius cornerRadius) {
                Intrinsics.checkNotNullParameter(prices, "prices");
                this.prices = prices;
                this.backgroundColor = str;
                this.cornerRadius = cornerRadius;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ PriceSection copy$default(PriceSection priceSection, List list, String str, CornerRadius cornerRadius, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = priceSection.prices;
                }
                if ((i11 & 2) != 0) {
                    str = priceSection.backgroundColor;
                }
                if ((i11 & 4) != 0) {
                    cornerRadius = priceSection.cornerRadius;
                }
                return priceSection.copy(list, str, cornerRadius);
            }

            @NotNull
            public final List<PriceBlock> component1() {
                return this.prices;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component3, reason: from getter */
            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            @NotNull
            public final PriceSection copy(@NotNull List<PriceBlock> prices, String backgroundColor, CornerRadius cornerRadius) {
                Intrinsics.checkNotNullParameter(prices, "prices");
                return new PriceSection(prices, backgroundColor, cornerRadius);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PriceSection)) {
                    return false;
                }
                PriceSection priceSection = (PriceSection) other;
                return Intrinsics.d(this.prices, priceSection.prices) && Intrinsics.d(this.backgroundColor, priceSection.backgroundColor) && this.cornerRadius == priceSection.cornerRadius;
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final CornerRadius getCornerRadius() {
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
                CornerRadius cornerRadius = this.cornerRadius;
                return hashCode2 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                List<PriceBlock> list = this.prices;
                String str = this.backgroundColor;
                CornerRadius cornerRadius = this.cornerRadius;
                StringBuilder a11 = C4055a.a("PriceSection(prices=", ", backgroundColor=", str, ", cornerRadius=", list);
                a11.append(cornerRadius);
                a11.append(")");
                return a11.toString();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$Spacers;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "left", "right", "betweenPrices", "betweenInfos", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getLeft", "getRight", "getBetweenPrices", "getBetweenInfos", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Spacers {
            public static final int $stable = 0;

            @NotNull
            private final Paddings betweenInfos;

            @NotNull
            private final Paddings betweenPrices;

            @NotNull
            private final Paddings bottom;

            @NotNull
            private final Paddings left;

            @NotNull
            private final Paddings right;

            @NotNull
            private final Paddings top;

            public Spacers() {
                this(null, null, null, null, null, null, 63, null);
            }

            public static /* synthetic */ Spacers copy$default(Spacers spacers, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, Paddings paddings6, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    paddings = spacers.top;
                }
                if ((i11 & 2) != 0) {
                    paddings2 = spacers.bottom;
                }
                if ((i11 & 4) != 0) {
                    paddings3 = spacers.left;
                }
                if ((i11 & 8) != 0) {
                    paddings4 = spacers.right;
                }
                if ((i11 & 16) != 0) {
                    paddings5 = spacers.betweenPrices;
                }
                if ((i11 & 32) != 0) {
                    paddings6 = spacers.betweenInfos;
                }
                Paddings paddings7 = paddings5;
                Paddings paddings8 = paddings6;
                return spacers.copy(paddings, paddings2, paddings3, paddings4, paddings7, paddings8);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Paddings getTop() {
                return this.top;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final Paddings getBottom() {
                return this.bottom;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final Paddings getLeft() {
                return this.left;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final Paddings getRight() {
                return this.right;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final Paddings getBetweenPrices() {
                return this.betweenPrices;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final Paddings getBetweenInfos() {
                return this.betweenInfos;
            }

            @NotNull
            public final Spacers copy(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings left, @NotNull Paddings right, @NotNull Paddings betweenPrices, @NotNull Paddings betweenInfos) {
                Intrinsics.checkNotNullParameter(top, "top");
                Intrinsics.checkNotNullParameter(bottom, "bottom");
                Intrinsics.checkNotNullParameter(left, "left");
                Intrinsics.checkNotNullParameter(right, "right");
                Intrinsics.checkNotNullParameter(betweenPrices, "betweenPrices");
                Intrinsics.checkNotNullParameter(betweenInfos, "betweenInfos");
                return new Spacers(top, bottom, left, right, betweenPrices, betweenInfos);
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

            @NotNull
            public final Paddings getBetweenInfos() {
                return this.betweenInfos;
            }

            @NotNull
            public final Paddings getBetweenPrices() {
                return this.betweenPrices;
            }

            @NotNull
            public final Paddings getBottom() {
                return this.bottom;
            }

            @NotNull
            public final Paddings getLeft() {
                return this.left;
            }

            @NotNull
            public final Paddings getRight() {
                return this.right;
            }

            @NotNull
            public final Paddings getTop() {
                return this.top;
            }

            public int hashCode() {
                return this.betweenInfos.hashCode() + b.b(this.betweenPrices, b.b(this.right, b.b(this.left, b.b(this.bottom, this.top.hashCode() * 31, 31), 31), 31), 31);
            }

            @NotNull
            public String toString() {
                Paddings paddings = this.top;
                Paddings paddings2 = this.bottom;
                Paddings paddings3 = this.left;
                Paddings paddings4 = this.right;
                Paddings paddings5 = this.betweenPrices;
                Paddings paddings6 = this.betweenInfos;
                StringBuilder b11 = p.b("Spacers(top=", paddings, ", bottom=", paddings2, ", left=");
                a.e(b11, paddings3, ", right=", paddings4, ", betweenPrices=");
                return b.e(b11, paddings5, ", betweenInfos=", paddings6, ")");
            }

            public Spacers(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings left, @NotNull Paddings right, @NotNull Paddings betweenPrices, @NotNull Paddings betweenInfos) {
                Intrinsics.checkNotNullParameter(top, "top");
                Intrinsics.checkNotNullParameter(bottom, "bottom");
                Intrinsics.checkNotNullParameter(left, "left");
                Intrinsics.checkNotNullParameter(right, "right");
                Intrinsics.checkNotNullParameter(betweenPrices, "betweenPrices");
                Intrinsics.checkNotNullParameter(betweenInfos, "betweenInfos");
                this.top = top;
                this.bottom = bottom;
                this.left = left;
                this.right = right;
                this.betweenPrices = betweenPrices;
                this.betweenInfos = betweenInfos;
            }

            public /* synthetic */ Spacers(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, Paddings paddings6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? Paddings.PADDING_500 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_500 : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_300 : paddings3, (i11 & 8) != 0 ? Paddings.PADDING_300 : paddings4, (i11 & 16) != 0 ? Paddings.PADDING_300 : paddings5, (i11 & 32) != 0 ? Paddings.PADDING_300 : paddings6);
            }
        }

        public Summary(@NotNull Header header, @NotNull PriceSection priceSection, List<CellDTO> list, Spacers spacers) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(priceSection, "priceSection");
            this.header = header;
            this.priceSection = priceSection;
            this.infos = list;
            this.spacers = spacers;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Summary copy$default(Summary summary, Header header, PriceSection priceSection, List list, Spacers spacers, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                header = summary.header;
            }
            if ((i11 & 2) != 0) {
                priceSection = summary.priceSection;
            }
            if ((i11 & 4) != 0) {
                list = summary.infos;
            }
            if ((i11 & 8) != 0) {
                spacers = summary.spacers;
            }
            return summary.copy(header, priceSection, list, spacers);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Header getHeader() {
            return this.header;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PriceSection getPriceSection() {
            return this.priceSection;
        }

        public final List<CellDTO> component3() {
            return this.infos;
        }

        /* renamed from: component4, reason: from getter */
        public final Spacers getSpacers() {
            return this.spacers;
        }

        @NotNull
        public final Summary copy(@NotNull Header header, @NotNull PriceSection priceSection, List<CellDTO> infos, Spacers spacers) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(priceSection, "priceSection");
            return new Summary(header, priceSection, infos, spacers);
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

        public final Spacers getSpacers() {
            return this.spacers;
        }

        public int hashCode() {
            int hashCode = (this.priceSection.hashCode() + (this.header.hashCode() * 31)) * 31;
            List<CellDTO> list = this.infos;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Spacers spacers = this.spacers;
            return hashCode2 + (spacers != null ? spacers.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Summary(header=" + this.header + ", priceSection=" + this.priceSection + ", infos=" + this.infos + ", spacers=" + this.spacers + ")";
        }
    }

    public CheckoutTotalDTO(@NotNull Summary summary, @NotNull InteractiveActions interactiveActions, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(interactiveActions, "interactiveActions");
        this.summary = summary;
        this.interactiveActions = interactiveActions;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckoutTotalDTO copy$default(CheckoutTotalDTO checkoutTotalDTO, Summary summary, InteractiveActions interactiveActions, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            summary = checkoutTotalDTO.summary;
        }
        if ((i11 & 2) != 0) {
            interactiveActions = checkoutTotalDTO.interactiveActions;
        }
        if ((i11 & 4) != 0) {
            str = checkoutTotalDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            map = checkoutTotalDTO.trackingInfo;
        }
        return checkoutTotalDTO.copy(summary, interactiveActions, str, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Summary getSummary() {
        return this.summary;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InteractiveActions getInteractiveActions() {
        return this.interactiveActions;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final CheckoutTotalDTO copy(@NotNull Summary summary, @NotNull InteractiveActions interactiveActions, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(interactiveActions, "interactiveActions");
        return new CheckoutTotalDTO(summary, interactiveActions, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutTotalDTO)) {
            return false;
        }
        CheckoutTotalDTO checkoutTotalDTO = (CheckoutTotalDTO) other;
        return Intrinsics.d(this.summary, checkoutTotalDTO.summary) && Intrinsics.d(this.interactiveActions, checkoutTotalDTO.interactiveActions) && Intrinsics.d(this.backgroundColor, checkoutTotalDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, checkoutTotalDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final InteractiveActions getInteractiveActions() {
        return this.interactiveActions;
    }

    @NotNull
    public final Summary getSummary() {
        return this.summary;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.interactiveActions.hashCode() + (this.summary.hashCode() * 31)) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Summary summary = this.summary;
        InteractiveActions interactiveActions = this.interactiveActions;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CheckoutTotalDTO(summary=");
        sb2.append(summary);
        sb2.append(", interactiveActions=");
        sb2.append(interactiveActions);
        sb2.append(", backgroundColor=");
        return C4070a.a(sb2, str, ", trackingInfo=", map, ")");
    }
}
