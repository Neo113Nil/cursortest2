package ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.data;

import B90.C2619v;
import G.g;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u001d\u001e\u001fB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO;", "", "paymentStatus", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO$PaymentStatus;", "paymentDetailsList", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO$PaymentDetail;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO$PaymentStatus;Ljava/util/List;Ljava/util/Map;)V", "getPaymentStatus", "()Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO$PaymentStatus;", "getPaymentDetailsList", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentStatus", "PaymentDetail", "StatusIcon", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentDetailsDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<PaymentDetail> paymentDetailsList;

    @NotNull
    private final PaymentStatus paymentStatus;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO$PaymentDetail;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "informer", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "descriptionIconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "getInformer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getDescriptionIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentDetail {
        public static final int $stable = 8;
        private final TextAtom description;
        private final IconButtonV3DTO descriptionIconButton;
        private final Icon icon;
        private final DisclaimerAtom informer;

        @NotNull
        private final TextAtom title;

        public PaymentDetail(Icon icon, @NotNull TextAtom title, TextAtom textAtom, DisclaimerAtom disclaimerAtom, IconButtonV3DTO iconButtonV3DTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.icon = icon;
            this.title = title;
            this.description = textAtom;
            this.informer = disclaimerAtom;
            this.descriptionIconButton = iconButtonV3DTO;
        }

        public static /* synthetic */ PaymentDetail copy$default(PaymentDetail paymentDetail, Icon icon, TextAtom textAtom, TextAtom textAtom2, DisclaimerAtom disclaimerAtom, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = paymentDetail.icon;
            }
            if ((i11 & 2) != 0) {
                textAtom = paymentDetail.title;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = paymentDetail.description;
            }
            if ((i11 & 8) != 0) {
                disclaimerAtom = paymentDetail.informer;
            }
            if ((i11 & 16) != 0) {
                iconButtonV3DTO = paymentDetail.descriptionIconButton;
            }
            IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
            TextAtom textAtom3 = textAtom2;
            return paymentDetail.copy(icon, textAtom, textAtom3, disclaimerAtom, iconButtonV3DTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final DisclaimerAtom getInformer() {
            return this.informer;
        }

        /* renamed from: component5, reason: from getter */
        public final IconButtonV3DTO getDescriptionIconButton() {
            return this.descriptionIconButton;
        }

        @NotNull
        public final PaymentDetail copy(Icon icon, @NotNull TextAtom title, TextAtom description, DisclaimerAtom informer, IconButtonV3DTO descriptionIconButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new PaymentDetail(icon, title, description, informer, descriptionIconButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentDetail)) {
                return false;
            }
            PaymentDetail paymentDetail = (PaymentDetail) other;
            return Intrinsics.d(this.icon, paymentDetail.icon) && Intrinsics.d(this.title, paymentDetail.title) && Intrinsics.d(this.description, paymentDetail.description) && Intrinsics.d(this.informer, paymentDetail.informer) && Intrinsics.d(this.descriptionIconButton, paymentDetail.descriptionIconButton);
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

        public final DisclaimerAtom getInformer() {
            return this.informer;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            Icon icon = this.icon;
            int b11 = C2619v.b((icon == null ? 0 : icon.hashCode()) * 31, 31, this.title);
            TextAtom textAtom = this.description;
            int hashCode = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            DisclaimerAtom disclaimerAtom = this.informer;
            int hashCode2 = (hashCode + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.descriptionIconButton;
            return hashCode2 + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PaymentDetail(icon=" + this.icon + ", title=" + this.title + ", description=" + this.description + ", informer=" + this.informer + ", descriptionIconButton=" + this.descriptionIconButton + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO$PaymentStatus;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "statusIcon", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO$StatusIcon;", "errorMessage", "paymentButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO$StatusIcon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getStatusIcon", "()Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO$StatusIcon;", "getErrorMessage", "getPaymentButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        public static /* synthetic */ PaymentStatus copy$default(PaymentStatus paymentStatus, TextAtom textAtom, StatusIcon statusIcon, TextAtom textAtom2, ButtonV3Atom.SmallButton smallButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = paymentStatus.title;
            }
            if ((i11 & 2) != 0) {
                statusIcon = paymentStatus.statusIcon;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = paymentStatus.errorMessage;
            }
            if ((i11 & 8) != 0) {
                smallButton = paymentStatus.paymentButton;
            }
            return paymentStatus.copy(textAtom, statusIcon, textAtom2, smallButton);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final StatusIcon getStatusIcon() {
            return this.statusIcon;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component4, reason: from getter */
        public final ButtonV3Atom.SmallButton getPaymentButton() {
            return this.paymentButton;
        }

        @NotNull
        public final PaymentStatus copy(@NotNull TextAtom title, @NotNull StatusIcon statusIcon, TextAtom errorMessage, ButtonV3Atom.SmallButton paymentButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
            return new PaymentStatus(title, statusIcon, errorMessage, paymentButton);
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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO$StatusIcon;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "bgColor", "", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getBgColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        public static /* synthetic */ StatusIcon copy$default(StatusIcon statusIcon, Icon icon, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = statusIcon.icon;
            }
            if ((i11 & 2) != 0) {
                str = statusIcon.bgColor;
            }
            return statusIcon.copy(icon, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBgColor() {
            return this.bgColor;
        }

        @NotNull
        public final StatusIcon copy(@NotNull Icon icon, @NotNull String bgColor) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(bgColor, "bgColor");
            return new StatusIcon(icon, bgColor);
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

    public PaymentDetailsDTO(@NotNull PaymentStatus paymentStatus, @NotNull List<PaymentDetail> paymentDetailsList, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(paymentStatus, "paymentStatus");
        Intrinsics.checkNotNullParameter(paymentDetailsList, "paymentDetailsList");
        this.paymentStatus = paymentStatus;
        this.paymentDetailsList = paymentDetailsList;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentDetailsDTO copy$default(PaymentDetailsDTO paymentDetailsDTO, PaymentStatus paymentStatus, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paymentStatus = paymentDetailsDTO.paymentStatus;
        }
        if ((i11 & 2) != 0) {
            list = paymentDetailsDTO.paymentDetailsList;
        }
        if ((i11 & 4) != 0) {
            map = paymentDetailsDTO.trackingInfo;
        }
        return paymentDetailsDTO.copy(paymentStatus, list, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PaymentStatus getPaymentStatus() {
        return this.paymentStatus;
    }

    @NotNull
    public final List<PaymentDetail> component2() {
        return this.paymentDetailsList;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final PaymentDetailsDTO copy(@NotNull PaymentStatus paymentStatus, @NotNull List<PaymentDetail> paymentDetailsList, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(paymentStatus, "paymentStatus");
        Intrinsics.checkNotNullParameter(paymentDetailsList, "paymentDetailsList");
        return new PaymentDetailsDTO(paymentStatus, paymentDetailsList, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentDetailsDTO)) {
            return false;
        }
        PaymentDetailsDTO paymentDetailsDTO = (PaymentDetailsDTO) other;
        return Intrinsics.d(this.paymentStatus, paymentDetailsDTO.paymentStatus) && Intrinsics.d(this.paymentDetailsList, paymentDetailsDTO.paymentDetailsList) && Intrinsics.d(this.trackingInfo, paymentDetailsDTO.trackingInfo);
    }

    @NotNull
    public final List<PaymentDetail> getPaymentDetailsList() {
        return this.paymentDetailsList;
    }

    @NotNull
    public final PaymentStatus getPaymentStatus() {
        return this.paymentStatus;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(this.paymentStatus.hashCode() * 31, 31, this.paymentDetailsList);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        PaymentStatus paymentStatus = this.paymentStatus;
        List<PaymentDetail> list = this.paymentDetailsList;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("PaymentDetailsDTO(paymentStatus=");
        sb2.append(paymentStatus);
        sb2.append(", paymentDetailsList=");
        sb2.append(list);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
