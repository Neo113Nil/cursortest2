package ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.presentation;

import B90.C2619v;
import Bl.C2639a;
import G.g;
import Kk.C3532b;
import Lh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003*+,B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$PaymentStatus;", "paymentStatus", "", "arePaymentDetailsVisible", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$PaymentDetail;", "paymentDetails", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$PaymentStatus;ZLjava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$PaymentStatus;", "getPaymentStatus", "()Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$PaymentStatus;", "Z", "getArePaymentDetailsVisible", "()Z", "Ljava/util/List;", "getPaymentDetails", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "PaymentStatus", "PaymentDetail", "StatusIcon", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentDetailsVO implements c {
    private final boolean arePaymentDetailsVisible;
    private final long id;

    @NotNull
    private final List<PaymentDetail> paymentDetails;

    @NotNull
    private final PaymentStatus paymentStatus;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$PaymentDetail;", "", "", "id", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "informer", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "descriptionIconButton", "<init>", "(JLru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getInformer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDescriptionIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentDetail {
        private final TextAtom description;
        private final IconButtonV3DTO descriptionIconButton;
        private final Icon icon;
        private final long id;
        private final DisclaimerAtom informer;

        @NotNull
        private final TextAtom title;

        public PaymentDetail(long j11, Icon icon, @NotNull TextAtom title, TextAtom textAtom, DisclaimerAtom disclaimerAtom, IconButtonV3DTO iconButtonV3DTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = j11;
            this.icon = icon;
            this.title = title;
            this.description = textAtom;
            this.informer = disclaimerAtom;
            this.descriptionIconButton = iconButtonV3DTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentDetail)) {
                return false;
            }
            PaymentDetail paymentDetail = (PaymentDetail) other;
            return this.id == paymentDetail.id && Intrinsics.d(this.icon, paymentDetail.icon) && Intrinsics.d(this.title, paymentDetail.title) && Intrinsics.d(this.description, paymentDetail.description) && Intrinsics.d(this.informer, paymentDetail.informer) && Intrinsics.d(this.descriptionIconButton, paymentDetail.descriptionIconButton);
        }

        public final TextAtom getDescription() {
            return this.description;
        }

        public final IconButtonV3DTO getDescriptionIconButton() {
            return this.descriptionIconButton;
        }

        public final Icon getIcon() {
            return this.icon;
        }

        public final long getId() {
            return this.id;
        }

        public final DisclaimerAtom getInformer() {
            return this.informer;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            Icon icon = this.icon;
            int b11 = C2619v.b((hashCode + (icon == null ? 0 : icon.hashCode())) * 31, 31, this.title);
            TextAtom textAtom = this.description;
            int hashCode2 = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            DisclaimerAtom disclaimerAtom = this.informer;
            int hashCode3 = (hashCode2 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.descriptionIconButton;
            return hashCode3 + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            Icon icon = this.icon;
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.description;
            DisclaimerAtom disclaimerAtom = this.informer;
            IconButtonV3DTO iconButtonV3DTO = this.descriptionIconButton;
            StringBuilder sb2 = new StringBuilder("PaymentDetail(id=");
            sb2.append(j11);
            sb2.append(", icon=");
            sb2.append(icon);
            C2639a.e(", title=", ", description=", sb2, textAtom, textAtom2);
            sb2.append(", informer=");
            sb2.append(disclaimerAtom);
            sb2.append(", descriptionIconButton=");
            sb2.append(iconButtonV3DTO);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$PaymentStatus;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$StatusIcon;", "statusIcon", "errorMessage", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "paymentButton", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$StatusIcon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$StatusIcon;", "getStatusIcon", "()Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$StatusIcon;", "getErrorMessage", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getPaymentButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentStatus {
        public static final int $stable;
        private final TextAtom errorMessage;
        private final ButtonV3Atom.SmallButton paymentButton;

        @NotNull
        private final StatusIcon statusIcon;

        @NotNull
        private final TextAtom title;

        static {
            int i11 = ButtonV3Atom.SmallButton.$stable;
            int i12 = TextAtom.$stable;
            $stable = i11 | i12 | Icon.$stable | i12;
        }

        public PaymentStatus(@NotNull TextAtom title, @NotNull StatusIcon statusIcon, TextAtom textAtom, ButtonV3Atom.SmallButton smallButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
            this.title = title;
            this.statusIcon = statusIcon;
            this.errorMessage = textAtom;
            this.paymentButton = smallButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentStatus)) {
                return false;
            }
            PaymentStatus paymentStatus = (PaymentStatus) other;
            return Intrinsics.d(this.title, paymentStatus.title) && Intrinsics.d(this.statusIcon, paymentStatus.statusIcon) && Intrinsics.d(this.errorMessage, paymentStatus.errorMessage) && Intrinsics.d(this.paymentButton, paymentStatus.paymentButton);
        }

        public final TextAtom getErrorMessage() {
            return this.errorMessage;
        }

        public final ButtonV3Atom.SmallButton getPaymentButton() {
            return this.paymentButton;
        }

        @NotNull
        public final StatusIcon getStatusIcon() {
            return this.statusIcon;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = (this.statusIcon.hashCode() + (this.title.hashCode() * 31)) * 31;
            TextAtom textAtom = this.errorMessage;
            int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            ButtonV3Atom.SmallButton smallButton = this.paymentButton;
            return hashCode2 + (smallButton != null ? smallButton.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PaymentStatus(title=" + this.title + ", statusIcon=" + this.statusIcon + ", errorMessage=" + this.errorMessage + ", paymentButton=" + this.paymentButton + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$StatusIcon;", "", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "", "bgColor", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Ljava/lang/String;", "getBgColor", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StatusIcon {
        public static final int $stable = Icon.$stable;

        @NotNull
        private final String bgColor;

        @NotNull
        private final Icon icon;

        public StatusIcon(@NotNull Icon icon, @NotNull String bgColor) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(bgColor, "bgColor");
            this.icon = icon;
            this.bgColor = bgColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusIcon)) {
                return false;
            }
            StatusIcon statusIcon = (StatusIcon) other;
            return Intrinsics.d(this.icon, statusIcon.icon) && Intrinsics.d(this.bgColor, statusIcon.bgColor);
        }

        @NotNull
        public final String getBgColor() {
            return this.bgColor;
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        public int hashCode() {
            return this.bgColor.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "StatusIcon(icon=" + this.icon + ", bgColor=" + this.bgColor + ")";
        }
    }

    public PaymentDetailsVO(long j11, @NotNull PaymentStatus paymentStatus, boolean z11, @NotNull List<PaymentDetail> paymentDetails, t tVar) {
        Intrinsics.checkNotNullParameter(paymentStatus, "paymentStatus");
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        this.id = j11;
        this.paymentStatus = paymentStatus;
        this.arePaymentDetailsVisible = z11;
        this.paymentDetails = paymentDetails;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentDetailsVO)) {
            return false;
        }
        PaymentDetailsVO paymentDetailsVO = (PaymentDetailsVO) other;
        return this.id == paymentDetailsVO.id && Intrinsics.d(this.paymentStatus, paymentDetailsVO.paymentStatus) && this.arePaymentDetailsVisible == paymentDetailsVO.arePaymentDetailsVisible && Intrinsics.d(this.paymentDetails, paymentDetailsVO.paymentDetails) && Intrinsics.d(this.tokenizedEvent, paymentDetailsVO.tokenizedEvent);
    }

    public final boolean getArePaymentDetailsVisible() {
        return this.arePaymentDetailsVisible;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<PaymentDetail> getPaymentDetails() {
        return this.paymentDetails;
    }

    @NotNull
    public final PaymentStatus getPaymentStatus() {
        return this.paymentStatus;
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
        int b11 = g.b(C3532b.a((this.paymentStatus.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.arePaymentDetailsVisible), 31, this.paymentDetails);
        t tVar = this.tokenizedEvent;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        PaymentStatus paymentStatus = this.paymentStatus;
        boolean z11 = this.arePaymentDetailsVisible;
        List<PaymentDetail> list = this.paymentDetails;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("PaymentDetailsVO(id=");
        sb2.append(j11);
        sb2.append(", paymentStatus=");
        sb2.append(paymentStatus);
        sb2.append(", arePaymentDetailsVisible=");
        sb2.append(z11);
        sb2.append(", paymentDetails=");
        sb2.append(list);
        return a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}
