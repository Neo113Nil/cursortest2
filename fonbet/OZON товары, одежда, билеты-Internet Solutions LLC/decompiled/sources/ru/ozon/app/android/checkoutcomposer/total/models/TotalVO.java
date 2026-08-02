package ru.ozon.app.android.checkoutcomposer.total.models;

import B90.C2619v;
import C.o0;
import G.g;
import HY.a;
import T7.P;
import Tl.b;
import V.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.partnerBanks.presentation.PartnerBanksVO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.deprecated.Button;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003-./B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary;", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$InteractiveActions;", "interactiveActions", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$AdditionalInfo;", "additionalInfo", "Lru/ozon/app/android/checkoutcomposer/total/models/CheckoutProgressBarVO;", "progressBar", "", "showVerticalSeparator", "<init>", "(JLru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary;Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$InteractiveActions;Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$AdditionalInfo;Lru/ozon/app/android/checkoutcomposer/total/models/CheckoutProgressBarVO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary;", "getSummary", "()Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary;", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$InteractiveActions;", "getInteractiveActions", "()Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$InteractiveActions;", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$AdditionalInfo;", "getAdditionalInfo", "()Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$AdditionalInfo;", "Lru/ozon/app/android/checkoutcomposer/total/models/CheckoutProgressBarVO;", "getProgressBar", "()Lru/ozon/app/android/checkoutcomposer/total/models/CheckoutProgressBarVO;", "Z", "getShowVerticalSeparator", "()Z", "Summary", "InteractiveActions", "AdditionalInfo", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TotalVO implements c {

    @NotNull
    private final AdditionalInfo additionalInfo;
    private final long id;

    @NotNull
    private final InteractiveActions interactiveActions;
    private final CheckoutProgressBarVO progressBar;
    private final boolean showVerticalSeparator;
    private final Summary summary;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$AdditionalInfo;", "", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "hints", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getHints", "()Ljava/util/List;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdditionalInfo {
        private final List<AtomDTO> hints;

        /* JADX WARN: Multi-variable type inference failed */
        public AdditionalInfo(List<? extends AtomDTO> list) {
            this.hints = list;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AdditionalInfo) && Intrinsics.d(this.hints, ((AdditionalInfo) other).hints);
        }

        public final List<AtomDTO> getHints() {
            return this.hints;
        }

        public int hashCode() {
            List<AtomDTO> list = this.hints;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            return H3.c.a("AdditionalInfo(hints=", ")", this.hints);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$InteractiveActions;", "", "Lru/ozon/uni/atoms/data/deprecated/Button;", "button", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "hints", "", "buttonColor", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "totalButton", "buttonTextColor", "<init>", "(Lru/ozon/uni/atoms/data/deprecated/Button;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/deprecated/Button;", "getButton", "()Lru/ozon/uni/atoms/data/deprecated/Button;", "Ljava/util/List;", "getHints", "()Ljava/util/List;", "Ljava/lang/String;", "getButtonColor", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTotalButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButtonTextColor", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InteractiveActions {
        private final Button button;
        private final String buttonColor;
        private final String buttonTextColor;
        private final List<AtomDTO> hints;
        private final ButtonV3DTO totalButton;

        /* JADX WARN: Multi-variable type inference failed */
        public InteractiveActions(Button button, List<? extends AtomDTO> list, String str, ButtonV3DTO buttonV3DTO, String str2) {
            this.button = button;
            this.hints = list;
            this.buttonColor = str;
            this.totalButton = buttonV3DTO;
            this.buttonTextColor = str2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InteractiveActions)) {
                return false;
            }
            InteractiveActions interactiveActions = (InteractiveActions) other;
            return Intrinsics.d(this.button, interactiveActions.button) && Intrinsics.d(this.hints, interactiveActions.hints) && Intrinsics.d(this.buttonColor, interactiveActions.buttonColor) && Intrinsics.d(this.totalButton, interactiveActions.totalButton) && Intrinsics.d(this.buttonTextColor, interactiveActions.buttonTextColor);
        }

        public final Button getButton() {
            return this.button;
        }

        public final String getButtonColor() {
            return this.buttonColor;
        }

        public final String getButtonTextColor() {
            return this.buttonTextColor;
        }

        public final List<AtomDTO> getHints() {
            return this.hints;
        }

        public final ButtonV3DTO getTotalButton() {
            return this.totalButton;
        }

        public int hashCode() {
            Button button = this.button;
            int hashCode = (button == null ? 0 : button.hashCode()) * 31;
            List<AtomDTO> list = this.hints;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.buttonColor;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.totalButton;
            int hashCode4 = (hashCode3 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            String str2 = this.buttonTextColor;
            return hashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Button button = this.button;
            List<AtomDTO> list = this.hints;
            String str = this.buttonColor;
            ButtonV3DTO buttonV3DTO = this.totalButton;
            String str2 = this.buttonTextColor;
            StringBuilder sb2 = new StringBuilder("InteractiveActions(button=");
            sb2.append(button);
            sb2.append(", hints=");
            sb2.append(list);
            sb2.append(", buttonColor=");
            sb2.append(str);
            sb2.append(", totalButton=");
            sb2.append(buttonV3DTO);
            sb2.append(", buttonTextColor=");
            return o0.c(sb2, str2, ")");
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0004!\"#$B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006%"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary;", "", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary$Header;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary$Price;", "prices", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary$Footer;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary$FooterPrice;", "footerPrices", "<init>", "(Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary$Header;Ljava/util/List;Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary$Footer;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary$Header;", "getHeader", "()Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary$Header;", "Ljava/util/List;", "getPrices", "()Ljava/util/List;", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary$Footer;", "getFooter", "()Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary$Footer;", "getFooterPrices", "Header", "Price", "FooterPrice", "Footer", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Summary {

        @NotNull
        private final Footer footer;
        private final List<FooterPrice> footerPrices;

        @NotNull
        private final Header header;

        @NotNull
        private final List<Price> prices;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary$Footer;", "", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "price", "", "priceColor", "Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "partnerBanksMolecule", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtitle", "getPrice", "Ljava/lang/String;", "getPriceColor", "Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "getPartnerBanksMolecule", "()Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Footer {
            public static final int $stable = OzonSpannableString.$stable;
            private final PartnerBanksVO partnerBanksMolecule;

            @NotNull
            private final OzonSpannableString price;
            private final String priceColor;
            private final OzonSpannableString subtitle;

            @NotNull
            private final OzonSpannableString title;

            public Footer(@NotNull OzonSpannableString title, OzonSpannableString ozonSpannableString, @NotNull OzonSpannableString price, String str, PartnerBanksVO partnerBanksVO) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(price, "price");
                this.title = title;
                this.subtitle = ozonSpannableString;
                this.price = price;
                this.priceColor = str;
                this.partnerBanksMolecule = partnerBanksVO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Footer)) {
                    return false;
                }
                Footer footer = (Footer) other;
                return Intrinsics.d(this.title, footer.title) && Intrinsics.d(this.subtitle, footer.subtitle) && Intrinsics.d(this.price, footer.price) && Intrinsics.d(this.priceColor, footer.priceColor) && Intrinsics.d(this.partnerBanksMolecule, footer.partnerBanksMolecule);
            }

            public final PartnerBanksVO getPartnerBanksMolecule() {
                return this.partnerBanksMolecule;
            }

            @NotNull
            public final OzonSpannableString getPrice() {
                return this.price;
            }

            public final String getPriceColor() {
                return this.priceColor;
            }

            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                OzonSpannableString ozonSpannableString = this.subtitle;
                int c11 = P.c(this.price, (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31);
                String str = this.priceColor;
                int hashCode2 = (c11 + (str == null ? 0 : str.hashCode())) * 31;
                PartnerBanksVO partnerBanksVO = this.partnerBanksMolecule;
                return hashCode2 + (partnerBanksVO != null ? partnerBanksVO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.title;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                OzonSpannableString ozonSpannableString3 = this.price;
                String str = this.priceColor;
                PartnerBanksVO partnerBanksVO = this.partnerBanksMolecule;
                StringBuilder sb2 = new StringBuilder("Footer(title=");
                sb2.append((Object) ozonSpannableString);
                sb2.append(", subtitle=");
                sb2.append((Object) ozonSpannableString2);
                sb2.append(", price=");
                a.c(", priceColor=", str, ", partnerBanksMolecule=", sb2, ozonSpannableString3);
                sb2.append(partnerBanksVO);
                sb2.append(")");
                return sb2.toString();
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary$FooterPrice;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "price", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", DynamicElementDTO.SMALL_BORDERLESS_BUTTON, "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getPrice", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getSmallBorderlessButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FooterPrice {
            public static final int $stable;

            @NotNull
            private final TextAtom price;
            private final ButtonV3Atom.SmallBorderlessButton smallBorderlessButton;
            private final TextAtom subtitle;

            @NotNull
            private final TextAtom title;

            static {
                int i11 = ButtonV3Atom.SmallBorderlessButton.$stable;
                int i12 = TextAtom.$stable;
                $stable = i11 | i12 | i12 | i12;
            }

            public FooterPrice(@NotNull TextAtom title, TextAtom textAtom, @NotNull TextAtom price, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(price, "price");
                this.title = title;
                this.subtitle = textAtom;
                this.price = price;
                this.smallBorderlessButton = smallBorderlessButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FooterPrice)) {
                    return false;
                }
                FooterPrice footerPrice = (FooterPrice) other;
                return Intrinsics.d(this.title, footerPrice.title) && Intrinsics.d(this.subtitle, footerPrice.subtitle) && Intrinsics.d(this.price, footerPrice.price) && Intrinsics.d(this.smallBorderlessButton, footerPrice.smallBorderlessButton);
            }

            @NotNull
            public final TextAtom getPrice() {
                return this.price;
            }

            public final ButtonV3Atom.SmallBorderlessButton getSmallBorderlessButton() {
                return this.smallBorderlessButton;
            }

            public final TextAtom getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                TextAtom textAtom = this.subtitle;
                int b11 = C2619v.b((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.price);
                ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.smallBorderlessButton;
                return b11 + (smallBorderlessButton != null ? smallBorderlessButton.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextAtom textAtom = this.title;
                TextAtom textAtom2 = this.subtitle;
                TextAtom textAtom3 = this.price;
                ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.smallBorderlessButton;
                StringBuilder a11 = a.a("FooterPrice(title=", textAtom, ", subtitle=", textAtom2, ", price=");
                a11.append(textAtom3);
                a11.append(", smallBorderlessButton=");
                a11.append(smallBorderlessButton);
                a11.append(")");
                return a11.toString();
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary$Header;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "info", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getInfo", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Header {
            private final String info;

            @NotNull
            private final String title;

            public Header(@NotNull String title, String str) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.info = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Header)) {
                    return false;
                }
                Header header = (Header) other;
                return Intrinsics.d(this.title, header.title) && Intrinsics.d(this.info, header.info);
            }

            public final String getInfo() {
                return this.info;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.info;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return e.a("Header(title=", this.title, ", info=", this.info, ")");
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary$Price;", "", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "image", "Lru/ozon/uni/atoms/data/deprecated/Button;", "button", "originalPrice", "price", "Lru/ozon/uni/atoms/data/text/TextDTO;", "priceSubtitle", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/data/deprecated/Button;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtitle", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/data/deprecated/Button;", "getButton", "()Lru/ozon/uni/atoms/data/deprecated/Button;", "getOriginalPrice", "getPrice", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getPriceSubtitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Price {
            public static final int $stable;
            private final Button button;
            private final String image;
            private final OzonSpannableString originalPrice;

            @NotNull
            private final OzonSpannableString price;
            private final TextDTO priceSubtitle;
            private final OzonSpannableString subtitle;

            @NotNull
            private final OzonSpannableString title;

            static {
                int i11 = OzonSpannableString.$stable;
                $stable = i11 | Button.$stable | i11 | i11;
            }

            public Price(@NotNull OzonSpannableString title, OzonSpannableString ozonSpannableString, String str, Button button, OzonSpannableString ozonSpannableString2, @NotNull OzonSpannableString price, TextDTO textDTO) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(price, "price");
                this.title = title;
                this.subtitle = ozonSpannableString;
                this.image = str;
                this.button = button;
                this.originalPrice = ozonSpannableString2;
                this.price = price;
                this.priceSubtitle = textDTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Price)) {
                    return false;
                }
                Price price = (Price) other;
                return Intrinsics.d(this.title, price.title) && Intrinsics.d(this.subtitle, price.subtitle) && Intrinsics.d(this.image, price.image) && Intrinsics.d(this.button, price.button) && Intrinsics.d(this.originalPrice, price.originalPrice) && Intrinsics.d(this.price, price.price) && Intrinsics.d(this.priceSubtitle, price.priceSubtitle);
            }

            public final Button getButton() {
                return this.button;
            }

            public final String getImage() {
                return this.image;
            }

            public final OzonSpannableString getOriginalPrice() {
                return this.originalPrice;
            }

            @NotNull
            public final OzonSpannableString getPrice() {
                return this.price;
            }

            public final TextDTO getPriceSubtitle() {
                return this.priceSubtitle;
            }

            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                OzonSpannableString ozonSpannableString = this.subtitle;
                int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
                String str = this.image;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                Button button = this.button;
                int hashCode4 = (hashCode3 + (button == null ? 0 : button.hashCode())) * 31;
                OzonSpannableString ozonSpannableString2 = this.originalPrice;
                int c11 = P.c(this.price, (hashCode4 + (ozonSpannableString2 == null ? 0 : ozonSpannableString2.hashCode())) * 31, 31);
                TextDTO textDTO = this.priceSubtitle;
                return c11 + (textDTO != null ? textDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.title;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str = this.image;
                Button button = this.button;
                OzonSpannableString ozonSpannableString3 = this.originalPrice;
                OzonSpannableString ozonSpannableString4 = this.price;
                TextDTO textDTO = this.priceSubtitle;
                StringBuilder sb2 = new StringBuilder("Price(title=");
                sb2.append((Object) ozonSpannableString);
                sb2.append(", subtitle=");
                sb2.append((Object) ozonSpannableString2);
                sb2.append(", image=");
                sb2.append(str);
                sb2.append(", button=");
                sb2.append(button);
                sb2.append(", originalPrice=");
                sb2.append((Object) ozonSpannableString3);
                sb2.append(", price=");
                sb2.append((Object) ozonSpannableString4);
                sb2.append(", priceSubtitle=");
                return b.e(sb2, textDTO, ")");
            }
        }

        public Summary(@NotNull Header header, @NotNull List<Price> prices, @NotNull Footer footer, List<FooterPrice> list) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(prices, "prices");
            Intrinsics.checkNotNullParameter(footer, "footer");
            this.header = header;
            this.prices = prices;
            this.footer = footer;
            this.footerPrices = list;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Summary)) {
                return false;
            }
            Summary summary = (Summary) other;
            return Intrinsics.d(this.header, summary.header) && Intrinsics.d(this.prices, summary.prices) && Intrinsics.d(this.footer, summary.footer) && Intrinsics.d(this.footerPrices, summary.footerPrices);
        }

        @NotNull
        public final Footer getFooter() {
            return this.footer;
        }

        public final List<FooterPrice> getFooterPrices() {
            return this.footerPrices;
        }

        @NotNull
        public final Header getHeader() {
            return this.header;
        }

        @NotNull
        public final List<Price> getPrices() {
            return this.prices;
        }

        public int hashCode() {
            int hashCode = (this.footer.hashCode() + g.b(this.header.hashCode() * 31, 31, this.prices)) * 31;
            List<FooterPrice> list = this.footerPrices;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            return "Summary(header=" + this.header + ", prices=" + this.prices + ", footer=" + this.footer + ", footerPrices=" + this.footerPrices + ")";
        }
    }

    public TotalVO(long j11, Summary summary, @NotNull InteractiveActions interactiveActions, @NotNull AdditionalInfo additionalInfo, CheckoutProgressBarVO checkoutProgressBarVO, boolean z11) {
        Intrinsics.checkNotNullParameter(interactiveActions, "interactiveActions");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        this.id = j11;
        this.summary = summary;
        this.interactiveActions = interactiveActions;
        this.additionalInfo = additionalInfo;
        this.progressBar = checkoutProgressBarVO;
        this.showVerticalSeparator = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalVO)) {
            return false;
        }
        TotalVO totalVO = (TotalVO) other;
        return this.id == totalVO.id && Intrinsics.d(this.summary, totalVO.summary) && Intrinsics.d(this.interactiveActions, totalVO.interactiveActions) && Intrinsics.d(this.additionalInfo, totalVO.additionalInfo) && Intrinsics.d(this.progressBar, totalVO.progressBar) && this.showVerticalSeparator == totalVO.showVerticalSeparator;
    }

    @NotNull
    public final AdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final InteractiveActions getInteractiveActions() {
        return this.interactiveActions;
    }

    public final CheckoutProgressBarVO getProgressBar() {
        return this.progressBar;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShowVerticalSeparator() {
        return this.showVerticalSeparator;
    }

    public final Summary getSummary() {
        return this.summary;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Summary summary = this.summary;
        int hashCode2 = (this.additionalInfo.hashCode() + ((this.interactiveActions.hashCode() + ((hashCode + (summary == null ? 0 : summary.hashCode())) * 31)) * 31)) * 31;
        CheckoutProgressBarVO checkoutProgressBarVO = this.progressBar;
        return Boolean.hashCode(this.showVerticalSeparator) + ((hashCode2 + (checkoutProgressBarVO != null ? checkoutProgressBarVO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "TotalVO(id=" + this.id + ", summary=" + this.summary + ", interactiveActions=" + this.interactiveActions + ", additionalInfo=" + this.additionalInfo + ", progressBar=" + this.progressBar + ", showVerticalSeparator=" + this.showVerticalSeparator + ")";
    }
}
